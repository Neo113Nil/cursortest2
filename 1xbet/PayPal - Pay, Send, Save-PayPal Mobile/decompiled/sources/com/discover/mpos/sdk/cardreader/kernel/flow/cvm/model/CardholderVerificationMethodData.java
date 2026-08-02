package com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/CardholderVerificationMethodData;", "", "ttq", "Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "cpr", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/CardProcessingRequirements;", "tsi", "Lcom/discover/mpos/sdk/transaction/processing/transactionstatusinformation/TransactionStatusInformation;", "tvr", "Lcom/discover/mpos/sdk/transaction/processing/terminalverificationresults/TerminalVerificationResults;", "(Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/CardProcessingRequirements;Lcom/discover/mpos/sdk/transaction/processing/transactionstatusinformation/TransactionStatusInformation;Lcom/discover/mpos/sdk/transaction/processing/terminalverificationresults/TerminalVerificationResults;)V", "getCpr", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/cvm/model/CardProcessingRequirements;", "getTsi", "()Lcom/discover/mpos/sdk/transaction/processing/transactionstatusinformation/TransactionStatusInformation;", "getTtq", "()Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "getTvr", "()Lcom/discover/mpos/sdk/transaction/processing/terminalverificationresults/TerminalVerificationResults;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.a.b.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class CardholderVerificationMethodData {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers f3017a;
    public final com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardProcessingRequirements b;
    public final com.discover.mpos.sdk.transaction.processing.transactionstatusinformation.TransactionStatusInformation c;
    public final com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults d;

    public CardholderVerificationMethodData(com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers, com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardProcessingRequirements cardProcessingRequirements, com.discover.mpos.sdk.transaction.processing.transactionstatusinformation.TransactionStatusInformation transactionStatusInformation, com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults terminalVerificationResults) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalTransactionQualifiers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardProcessingRequirements, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionStatusInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalVerificationResults, "");
        this.f3017a = terminalTransactionQualifiers;
        this.b = cardProcessingRequirements;
        this.c = transactionStatusInformation;
        this.d = terminalVerificationResults;
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    public final int hashCode() {
        com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers = this.f3017a;
        int hashCode = terminalTransactionQualifiers != null ? terminalTransactionQualifiers.hashCode() : 0;
        com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardProcessingRequirements cardProcessingRequirements = this.b;
        int hashCode2 = cardProcessingRequirements != null ? cardProcessingRequirements.hashCode() : 0;
        com.discover.mpos.sdk.transaction.processing.transactionstatusinformation.TransactionStatusInformation transactionStatusInformation = this.c;
        int hashCode3 = transactionStatusInformation != null ? transactionStatusInformation.hashCode() : 0;
        com.discover.mpos.sdk.transaction.processing.terminalverificationresults.TerminalVerificationResults terminalVerificationResults = this.d;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (terminalVerificationResults != null ? terminalVerificationResults.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardholderVerificationMethodData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardholderVerificationMethodData cardholderVerificationMethodData = (com.discover.mpos.sdk.cardreader.kernel.flow.cvm.model.CardholderVerificationMethodData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3017a, cardholderVerificationMethodData.f3017a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, cardholderVerificationMethodData.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, cardholderVerificationMethodData.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, cardholderVerificationMethodData.d);
    }
}
