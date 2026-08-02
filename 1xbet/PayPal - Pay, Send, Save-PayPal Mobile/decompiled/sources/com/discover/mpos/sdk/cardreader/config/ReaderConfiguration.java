package com.discover.mpos.sdk.cardreader.config;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J!\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0002\b\u001dJ\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\b\u0010 \u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/config/ReaderConfiguration;", "", "terminalConfiguration", "Lcom/discover/mpos/sdk/cardreader/config/TerminalConfiguration;", "interfaceDeviceIFDSerialNumber", "", "transactionTypeConfigurations", "", "Lcom/discover/mpos/sdk/cardreader/config/TransactionTypeConfiguration;", "(Lcom/discover/mpos/sdk/cardreader/config/TerminalConfiguration;Ljava/lang/String;Ljava/util/List;)V", "getInterfaceDeviceIFDSerialNumber", "()Ljava/lang/String;", "getTerminalConfiguration", "()Lcom/discover/mpos/sdk/cardreader/config/TerminalConfiguration;", "getTransactionTypeConfigurations", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "getCombination", "Lcom/discover/mpos/sdk/cardreader/config/CombinationConfiguration;", "transactionType", "Lcom/discover/mpos/sdk/transaction/TransactionType;", "selectedCandidate", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Candidate;", "getCombination$mpos_sdk_card_reader_offlineRegularRelease", "hashCode", "", "toString", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class ReaderConfiguration {
    private final java.lang.String interfaceDeviceIFDSerialNumber;
    private final com.discover.mpos.sdk.cardreader.config.TerminalConfiguration terminalConfiguration;
    private final java.util.List<com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration> transactionTypeConfigurations;

    public ReaderConfiguration(com.discover.mpos.sdk.cardreader.config.TerminalConfiguration terminalConfiguration, java.lang.String str, java.util.List<com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.terminalConfiguration = terminalConfiguration;
        this.interfaceDeviceIFDSerialNumber = str;
        this.transactionTypeConfigurations = list;
    }

    public final com.discover.mpos.sdk.cardreader.config.TerminalConfiguration getTerminalConfiguration() {
        return this.terminalConfiguration;
    }

    public final java.lang.String getInterfaceDeviceIFDSerialNumber() {
        return this.interfaceDeviceIFDSerialNumber;
    }

    public final java.util.List<com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration> getTransactionTypeConfigurations() {
        return this.transactionTypeConfigurations;
    }

    public final com.discover.mpos.sdk.cardreader.config.CombinationConfiguration getCombination$mpos_sdk_card_reader_offlineRegularRelease(com.discover.mpos.sdk.transaction.TransactionType transactionType, com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        java.util.Iterator<T> it = this.transactionTypeConfigurations.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration) obj2).getTransactionType() == transactionType) {
                break;
            }
        }
        com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration transactionTypeConfiguration = (com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration) obj2;
        if (transactionTypeConfiguration == null) {
            return null;
        }
        java.util.Iterator<T> it2 = transactionTypeConfiguration.getCombinationConfigurations().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            com.discover.mpos.sdk.cardreader.config.CombinationConfiguration combinationConfiguration = (com.discover.mpos.sdk.cardreader.config.CombinationConfiguration) next;
            if (kotlin.jvm.internal.Intrinsics.areEqual(combinationConfiguration.getKernelId(), candidate != null ? candidate.getKernelId() : null) && kotlin.jvm.internal.Intrinsics.areEqual(combinationConfiguration.getApplicationIdentifier(), candidate.getAid())) {
                obj = next;
                break;
            }
        }
        return (com.discover.mpos.sdk.cardreader.config.CombinationConfiguration) obj;
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    public final int hashCode() {
        com.discover.mpos.sdk.cardreader.config.TerminalConfiguration terminalConfiguration = this.terminalConfiguration;
        int hashCode = terminalConfiguration != null ? terminalConfiguration.hashCode() : 0;
        java.lang.String str = this.interfaceDeviceIFDSerialNumber;
        int hashCode2 = str != null ? str.hashCode() : 0;
        java.util.List<com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration> list = this.transactionTypeConfigurations;
        return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.config.ReaderConfiguration)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration = (com.discover.mpos.sdk.cardreader.config.ReaderConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.terminalConfiguration, readerConfiguration.terminalConfiguration) && kotlin.jvm.internal.Intrinsics.areEqual(this.interfaceDeviceIFDSerialNumber, readerConfiguration.interfaceDeviceIFDSerialNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionTypeConfigurations, readerConfiguration.transactionTypeConfigurations);
    }

    public final com.discover.mpos.sdk.cardreader.config.ReaderConfiguration copy(com.discover.mpos.sdk.cardreader.config.TerminalConfiguration terminalConfiguration, java.lang.String interfaceDeviceIFDSerialNumber, java.util.List<com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration> transactionTypeConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(terminalConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceDeviceIFDSerialNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionTypeConfigurations, "");
        return new com.discover.mpos.sdk.cardreader.config.ReaderConfiguration(terminalConfiguration, interfaceDeviceIFDSerialNumber, transactionTypeConfigurations);
    }

    public final java.util.List<com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration> component3() {
        return this.transactionTypeConfigurations;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getInterfaceDeviceIFDSerialNumber() {
        return this.interfaceDeviceIFDSerialNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final com.discover.mpos.sdk.cardreader.config.TerminalConfiguration getTerminalConfiguration() {
        return this.terminalConfiguration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.discover.mpos.sdk.cardreader.config.ReaderConfiguration copy$default(com.discover.mpos.sdk.cardreader.config.ReaderConfiguration readerConfiguration, com.discover.mpos.sdk.cardreader.config.TerminalConfiguration terminalConfiguration, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            terminalConfiguration = readerConfiguration.terminalConfiguration;
        }
        if ((i & 2) != 0) {
            str = readerConfiguration.interfaceDeviceIFDSerialNumber;
        }
        if ((i & 4) != 0) {
            list = readerConfiguration.transactionTypeConfigurations;
        }
        return readerConfiguration.copy(terminalConfiguration, str, list);
    }
}
