package com.discover.mpos.sdk.cardreader.kernel.flow.optionalcheck.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalcheck/flow/DataStorageWriteResult;", "Lcom/discover/mpos/sdk/core/emv/ClearableEmvData;", "()V", "content", "Lcom/discover/mpos/sdk/core/data/ByteInfo;", "counterMask", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "isSuccess", "()Z", "setSuccess", "(Z)V", "clear", "", "getCounterValue", "increment", "toByteArray", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.e.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DataStorageWriteResult implements com.discover.mpos.sdk.core.emv.ClearableEmvData {

    /* renamed from: a, reason: collision with root package name */
    com.discover.mpos.sdk.core.data.ByteInfo f3139a = new com.discover.mpos.sdk.core.data.ByteInfo(null, 1, null);
    final int b = 31;

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.ClearableEmvData.DefaultImpls.toHexString(this);
    }

    public final void a(boolean z) {
        this.f3139a.setBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.EIGHTH, z);
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getB() {
        return this.f3139a.getB();
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        this.f3139a.reset();
    }
}
