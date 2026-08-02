package com.discover.mpos.sdk.cardreader.kernel.flow.pdol;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0019\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\b\u0010\u001f\u001a\u00020 H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/pdol/PdolCheckData;", "", "processingData", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "(Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;)V", "isContactlessPAVNPresent", "", "()Z", "isMsModeEnabled", "pdolData", "Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "getPdolData", "()Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "terminalVerificationResults", "Lcom/discover/mpos/sdk/transaction/processing/terminalverificationresults/TerminalVerificationResults;", "getTerminalVerificationResults", "()Lcom/discover/mpos/sdk/transaction/processing/terminalverificationresults/TerminalVerificationResults;", "transactionStatusInformation", "Lcom/discover/mpos/sdk/transaction/processing/transactionstatusinformation/TransactionStatusInformation;", "getTransactionStatusInformation", "()Lcom/discover/mpos/sdk/transaction/processing/transactionstatusinformation/TransactionStatusInformation;", "ttqs", "Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "getTtqs", "()Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.g.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class PdolCheckData {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.transaction.processing.pdol.PdolData f3148a;
    public final com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults b;
    public final com.discover.mpos.sdk.transaction.processing.transactionstatusinformation.TransactionStatusInformation c;
    private final com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers d;
    private final boolean e;
    private final boolean f;
    private final com.discover.mpos.sdk.transaction.processing.ProcessingData g;

    public PdolCheckData(com.discover.mpos.sdk.transaction.processing.ProcessingData processingData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processingData, "");
        this.g = processingData;
        this.f3148a = processingData.e();
        com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers m = processingData.m();
        this.d = m;
        this.b = processingData.h();
        this.c = processingData.i();
        this.e = m.getIsMsModeSupported();
        com.discover.mpos.sdk.core.emv.tlv.Tlv a2 = processingData.a(com.discover.mpos.sdk.core.emv.tlv.Tag.CONTACTLESS_PAYMENT_APPLICATION_VERSION_NUMBER.getTag());
        this.f = (a2 != null ? a2.getContent() : null) != null;
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    public final int hashCode() {
        com.discover.mpos.sdk.transaction.processing.ProcessingData processingData = this.g;
        if (processingData != null) {
            return processingData.hashCode();
        }
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckData) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, ((com.discover.mpos.sdk.cardreader.kernel.flow.pdol.PdolCheckData) other).g);
        }
        return true;
    }
}
