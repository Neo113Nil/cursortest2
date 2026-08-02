package com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/ContactlessCardVerificationResults;", "Lcom/discover/mpos/sdk/core/emv/EmvByteInfoList;", "byteArray", "", "([B)V", "isCcvPerformed", "", "()Z", "isCcvPerformedAndFailed", "secondByteIndex", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.a.b.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ContactlessCardVerificationResults extends com.discover.mpos.sdk.core.emv.EmvByteInfoList {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3018a;
    public final boolean b;
    private final int c;

    public ContactlessCardVerificationResults(byte[] bArr) {
        super(bArr, 8);
        this.c = 1;
        this.f3018a = getByteInfoList().get(1).getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SECOND);
        this.b = getByteInfoList().get(1).getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.FIRST);
    }
}
