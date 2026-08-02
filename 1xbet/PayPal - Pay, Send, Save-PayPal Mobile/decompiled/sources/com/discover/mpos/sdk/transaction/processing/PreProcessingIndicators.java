package com.discover.mpos.sdk.transaction.processing;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007BC\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0002\u0010\u0010J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u0006\u0010'\u001a\u00020\u0000JG\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\b\u0010,\u001a\u00020-H\u0016R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006."}, d2 = {"Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "", "config", "Lcom/discover/mpos/sdk/data/external/PreProcessingIndicatorData;", "(Lcom/discover/mpos/sdk/data/external/PreProcessingIndicatorData;)V", com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL, "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/PreProcessingIndicatorsExternal;", "(Lcom/discover/mpos/sdk/cardreader/entrypoint/model/PreProcessingIndicatorsExternal;)V", "terminalTransactionQualifiers", "Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "statusCheckRequestedFlag", "", "contactlessApplicationNotAllowedFlag", "zeroAmountFlag", "readerCVMRequiredLimitExceeded", "readerContactlessFloorLimitExceeded", "(Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;ZZZZZ)V", "getContactlessApplicationNotAllowedFlag", "()Z", "setContactlessApplicationNotAllowedFlag", "(Z)V", "getReaderCVMRequiredLimitExceeded", "setReaderCVMRequiredLimitExceeded", "getReaderContactlessFloorLimitExceeded", "setReaderContactlessFloorLimitExceeded", "getStatusCheckRequestedFlag", "setStatusCheckRequestedFlag", "getTerminalTransactionQualifiers", "()Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "setTerminalTransactionQualifiers", "(Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;)V", "getZeroAmountFlag", "setZeroAmountFlag", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.processing.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class PreProcessingIndicators {
    private boolean contactlessApplicationNotAllowedFlag;
    private boolean readerCVMRequiredLimitExceeded;
    private boolean readerContactlessFloorLimitExceeded;
    private boolean statusCheckRequestedFlag;
    private com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers;
    private boolean zeroAmountFlag;

    public PreProcessingIndicators(com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.terminalTransactionQualifiers = terminalTransactionQualifiers;
        this.statusCheckRequestedFlag = z;
        this.contactlessApplicationNotAllowedFlag = z2;
        this.zeroAmountFlag = z3;
        this.readerCVMRequiredLimitExceeded = z4;
        this.readerContactlessFloorLimitExceeded = z5;
    }

    public final com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers getTerminalTransactionQualifiers() {
        return this.terminalTransactionQualifiers;
    }

    public final void setTerminalTransactionQualifiers(com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers) {
        this.terminalTransactionQualifiers = terminalTransactionQualifiers;
    }

    public final boolean getStatusCheckRequestedFlag() {
        return this.statusCheckRequestedFlag;
    }

    public final void setStatusCheckRequestedFlag(boolean z) {
        this.statusCheckRequestedFlag = z;
    }

    public final boolean getContactlessApplicationNotAllowedFlag() {
        return this.contactlessApplicationNotAllowedFlag;
    }

    public final void setContactlessApplicationNotAllowedFlag(boolean z) {
        this.contactlessApplicationNotAllowedFlag = z;
    }

    public final boolean getZeroAmountFlag() {
        return this.zeroAmountFlag;
    }

    public final void setZeroAmountFlag(boolean z) {
        this.zeroAmountFlag = z;
    }

    public final boolean getReaderCVMRequiredLimitExceeded() {
        return this.readerCVMRequiredLimitExceeded;
    }

    public final void setReaderCVMRequiredLimitExceeded(boolean z) {
        this.readerCVMRequiredLimitExceeded = z;
    }

    public /* synthetic */ PreProcessingIndicators(com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : terminalTransactionQualifiers, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) == 0 ? z5 : false);
    }

    public final boolean getReaderContactlessFloorLimitExceeded() {
        return this.readerContactlessFloorLimitExceeded;
    }

    public final void setReaderContactlessFloorLimitExceeded(boolean z) {
        this.readerContactlessFloorLimitExceeded = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreProcessingIndicators(com.discover.mpos.sdk.data.external.PreProcessingIndicatorData preProcessingIndicatorData) {
        this(preProcessingIndicatorData.getTerminalTransactionQualifiers(), false, false, false, false, preProcessingIndicatorData.getReaderContactlessFloorLimitExceeded(), 30, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preProcessingIndicatorData, "");
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    public final com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators copy() {
        com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers = this.terminalTransactionQualifiers;
        return new com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators(terminalTransactionQualifiers != null ? terminalTransactionQualifiers.copy() : null, this.statusCheckRequestedFlag, this.contactlessApplicationNotAllowedFlag, this.zeroAmountFlag, this.readerCVMRequiredLimitExceeded, this.readerContactlessFloorLimitExceeded);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers = this.terminalTransactionQualifiers;
        int hashCode = terminalTransactionQualifiers != null ? terminalTransactionQualifiers.hashCode() : 0;
        boolean z = this.statusCheckRequestedFlag;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        boolean z2 = this.contactlessApplicationNotAllowedFlag;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        boolean z3 = this.zeroAmountFlag;
        int i3 = z3;
        if (z3 != 0) {
            i3 = 1;
        }
        boolean z4 = this.readerCVMRequiredLimitExceeded;
        int i4 = z4;
        if (z4 != 0) {
            i4 = 1;
        }
        boolean z5 = this.readerContactlessFloorLimitExceeded;
        return (((((((((hashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators)) {
            return false;
        }
        com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators preProcessingIndicators = (com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.terminalTransactionQualifiers, preProcessingIndicators.terminalTransactionQualifiers) && this.statusCheckRequestedFlag == preProcessingIndicators.statusCheckRequestedFlag && this.contactlessApplicationNotAllowedFlag == preProcessingIndicators.contactlessApplicationNotAllowedFlag && this.zeroAmountFlag == preProcessingIndicators.zeroAmountFlag && this.readerCVMRequiredLimitExceeded == preProcessingIndicators.readerCVMRequiredLimitExceeded && this.readerContactlessFloorLimitExceeded == preProcessingIndicators.readerContactlessFloorLimitExceeded;
    }

    public PreProcessingIndicators() {
        this(null, false, false, false, false, false, 63, null);
    }
}
