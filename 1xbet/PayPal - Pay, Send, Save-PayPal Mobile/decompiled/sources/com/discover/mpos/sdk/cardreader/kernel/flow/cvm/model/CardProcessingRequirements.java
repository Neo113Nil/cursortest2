package com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b%\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u0011\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082D¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR$\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR$\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR$\u0010\"\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u000e\u0010%\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010&\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000fR$\u0010)\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010\u000fR$\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000fR$\u0010/\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010\r\"\u0004\b1\u0010\u000fR$\u00102\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\r\"\u0004\b4\u0010\u000fR\u000e\u00105\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/CardProcessingRequirements;", "Lcom/discover/mpos/sdk/core/emv/EmvByteInfoList;", "byteInfoList", "", "Lcom/discover/mpos/sdk/core/data/ByteInfo;", "(Ljava/util/List;)V", "byteArray", "", "([B)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "consumerDeviceCvmPerformed", "getConsumerDeviceCvmPerformed", "()Z", "setConsumerDeviceCvmPerformed", "(Z)V", "cprPermanentDataIndex", "", "cprTransientDataIndex", "cvmFallbackToNoCvmAllowed", "getCvmFallbackToNoCvmAllowed", "setCvmFallbackToNoCvmAllowed", "cvmFallbackToSignatureAllowed", "getCvmFallbackToSignatureAllowed", "setCvmFallbackToSignatureAllowed", "declineIfCardExpired", "getDeclineIfCardExpired", "setDeclineIfCardExpired", "declineOrSwitchOtherInterfaceIfCdaFailed", "getDeclineOrSwitchOtherInterfaceIfCdaFailed", "setDeclineOrSwitchOtherInterfaceIfCdaFailed", "issuerUpdateProcessingSupported", "getIssuerUpdateProcessingSupported", "setIssuerUpdateProcessingSupported", "onlinePinRequired", "getOnlinePinRequired", "setOnlinePinRequired", "permanentData", "pidLimitReached", "getPidLimitReached", "setPidLimitReached", "processOnlineIfCardExpired", "getProcessOnlineIfCardExpired", "setProcessOnlineIfCardExpired", "processOnlineIfCdaFailed", "getProcessOnlineIfCdaFailed", "setProcessOnlineIfCdaFailed", "signatureRequired", "getSignatureRequired", "setSignatureRequired", "switchOtherInterfaceIfUnableToProcessOnline", "getSwitchOtherInterfaceIfUnableToProcessOnline", "setSwitchOtherInterfaceIfUnableToProcessOnline", "transientData", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.a.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class CardProcessingRequirements extends com.discover.mpos.sdk.core.emv.EmvByteInfoList {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.core.data.ByteInfo f3016a;
    public final com.discover.mpos.sdk.core.data.ByteInfo b;
    private final int c;
    private final int d;

    public CardProcessingRequirements(byte[] bArr) {
        super(bArr, 2);
        this.d = 1;
        this.f3016a = getByteInfoList().get(this.c);
        this.b = getByteInfoList().get(1);
    }

    public final boolean a() {
        return this.f3016a.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.EIGHTH);
    }

    public final boolean b() {
        return this.f3016a.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SEVENTH);
    }

    public final boolean c() {
        return this.f3016a.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SIXTH);
    }

    public final boolean d() {
        return this.b.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.EIGHTH);
    }

    public final boolean e() {
        return this.b.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SECOND);
    }

    public final boolean f() {
        return this.b.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.FIRST);
    }
}
