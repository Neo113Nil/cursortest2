package com.discover.mpos.sdk.data.external.initiateapplicationprocessingconnect;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rR\u0017\u0010\f\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/discover/mpos/sdk/data/external/initiateapplicationprocessingconnect/ExtendedLoggingDataRequest;", "", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "processingData", "<init>", "(Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;)V", "", "pdol", "Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "pdolUpdate", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "cardFeatureVersionNumber", "cardFeatureDescriptor", "([BLcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;)V", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getCardFeatureDescriptor", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getCardFeatureVersionNumber", "[B", "getPdol", "()[B", "Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "getPdolUpdate", "()Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class ExtendedLoggingDataRequest {
    private final com.discover.mpos.sdk.core.emv.tlv.Tlv cardFeatureDescriptor;
    private final com.discover.mpos.sdk.core.emv.tlv.Tlv cardFeatureVersionNumber;
    private final byte[] pdol;
    private final com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate pdolUpdate;

    public ExtendedLoggingDataRequest(byte[] bArr, com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate pdolUpdate, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolUpdate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv2, "");
        this.pdol = bArr;
        this.pdolUpdate = pdolUpdate;
        this.cardFeatureVersionNumber = tlv;
        this.cardFeatureDescriptor = tlv2;
    }

    public final byte[] getPdol() {
        return this.pdol;
    }

    public final com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate getPdolUpdate() {
        return this.pdolUpdate;
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv getCardFeatureVersionNumber() {
        return this.cardFeatureVersionNumber;
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv getCardFeatureDescriptor() {
        return this.cardFeatureDescriptor;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExtendedLoggingDataRequest(com.discover.mpos.sdk.transaction.processing.ProcessingData processingData) {
        this(r0, r2, r3, new com.discover.mpos.sdk.core.emv.tlv.Tlv(r13, r1 != null ? r1.getE() : null, 0, 0, 12, null));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processingData, "");
        byte[] f = processingData.f();
        com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate pdolUpdate = new com.discover.mpos.sdk.data.external.readdatarecord.PdolUpdate(processingData.e().a());
        java.lang.String tag = com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_FEATURE_VERSION_NUMBER.getTag();
        com.discover.mpos.sdk.core.emv.tlv.Tlv t = processingData.t();
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = new com.discover.mpos.sdk.core.emv.tlv.Tlv(tag, t != null ? t.getContent() : null, 0, 0, 12, null);
        java.lang.String tag2 = com.discover.mpos.sdk.core.emv.tlv.Tag.CARD_FEATURE_DESCRIPTOR.getTag();
        com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor s = processingData.s();
    }
}
