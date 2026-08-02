package com.discover.mpos.sdk.data.external;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\t\"\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/discover/mpos/sdk/data/external/PreProcessingIndicatorData;", "", "Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "terminalTransactionQualifiers", "", "readerContactlessFloorLimitExceeded", "<init>", "(Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;Z)V", "component1", "()Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "component2", "()Z", "copy", "(Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;Z)Lcom/discover/mpos/sdk/data/external/PreProcessingIndicatorData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getReaderContactlessFloorLimitExceeded", "setReaderContactlessFloorLimitExceeded", "(Z)V", "Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;", "getTerminalTransactionQualifiers", "setTerminalTransactionQualifiers", "(Lcom/discover/mpos/sdk/cardreader/config/TerminalTransactionQualifiers;)V"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class PreProcessingIndicatorData {
    private boolean readerContactlessFloorLimitExceeded;
    private com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers;

    public PreProcessingIndicatorData(com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers, boolean z) {
        this.terminalTransactionQualifiers = terminalTransactionQualifiers;
        this.readerContactlessFloorLimitExceeded = z;
    }

    public final com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers getTerminalTransactionQualifiers() {
        return this.terminalTransactionQualifiers;
    }

    public final void setTerminalTransactionQualifiers(com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers) {
        this.terminalTransactionQualifiers = terminalTransactionQualifiers;
    }

    public /* synthetic */ PreProcessingIndicatorData(com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : terminalTransactionQualifiers, (i & 2) != 0 ? false : z);
    }

    public final boolean getReaderContactlessFloorLimitExceeded() {
        return this.readerContactlessFloorLimitExceeded;
    }

    public final void setReaderContactlessFloorLimitExceeded(boolean z) {
        this.readerContactlessFloorLimitExceeded = z;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PreProcessingIndicatorData(terminalTransactionQualifiers=");
        sb.append(this.terminalTransactionQualifiers);
        sb.append(", readerContactlessFloorLimitExceeded=");
        sb.append(this.readerContactlessFloorLimitExceeded);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers = this.terminalTransactionQualifiers;
        int hashCode = terminalTransactionQualifiers != null ? terminalTransactionQualifiers.hashCode() : 0;
        boolean z = this.readerContactlessFloorLimitExceeded;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (hashCode * 31) + i;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.data.external.PreProcessingIndicatorData)) {
            return false;
        }
        com.discover.mpos.sdk.data.external.PreProcessingIndicatorData preProcessingIndicatorData = (com.discover.mpos.sdk.data.external.PreProcessingIndicatorData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.terminalTransactionQualifiers, preProcessingIndicatorData.terminalTransactionQualifiers) && this.readerContactlessFloorLimitExceeded == preProcessingIndicatorData.readerContactlessFloorLimitExceeded;
    }

    public final com.discover.mpos.sdk.data.external.PreProcessingIndicatorData copy(com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers, boolean readerContactlessFloorLimitExceeded) {
        return new com.discover.mpos.sdk.data.external.PreProcessingIndicatorData(terminalTransactionQualifiers, readerContactlessFloorLimitExceeded);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getReaderContactlessFloorLimitExceeded() {
        return this.readerContactlessFloorLimitExceeded;
    }

    /* renamed from: component1, reason: from getter */
    public final com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers getTerminalTransactionQualifiers() {
        return this.terminalTransactionQualifiers;
    }

    public static /* synthetic */ com.discover.mpos.sdk.data.external.PreProcessingIndicatorData copy$default(com.discover.mpos.sdk.data.external.PreProcessingIndicatorData preProcessingIndicatorData, com.discover.mpos.sdk.cardreader.config.TerminalTransactionQualifiers terminalTransactionQualifiers, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            terminalTransactionQualifiers = preProcessingIndicatorData.terminalTransactionQualifiers;
        }
        if ((i & 2) != 0) {
            z = preProcessingIndicatorData.readerContactlessFloorLimitExceeded;
        }
        return preProcessingIndicatorData.copy(terminalTransactionQualifiers, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreProcessingIndicatorData() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
