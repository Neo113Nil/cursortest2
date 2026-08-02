package com.discover.mpos.sdk.cardreader.config;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/config/TransactionTypeConfiguration;", "", "Lcom/discover/mpos/sdk/transaction/TransactionType;", "transactionType", "", "Lcom/discover/mpos/sdk/cardreader/config/CombinationConfiguration;", "combinationConfigurations", "<init>", "(Lcom/discover/mpos/sdk/transaction/TransactionType;Ljava/util/List;)V", "component1", "()Lcom/discover/mpos/sdk/transaction/TransactionType;", "component2", "()Ljava/util/List;", "copy", "(Lcom/discover/mpos/sdk/transaction/TransactionType;Ljava/util/List;)Lcom/discover/mpos/sdk/cardreader/config/TransactionTypeConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCombinationConfigurations", "Lcom/discover/mpos/sdk/transaction/TransactionType;", "getTransactionType"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class TransactionTypeConfiguration {
    private final java.util.List<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration> combinationConfigurations;
    private final com.discover.mpos.sdk.transaction.TransactionType transactionType;

    public TransactionTypeConfiguration(com.discover.mpos.sdk.transaction.TransactionType transactionType, java.util.List<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.transactionType = transactionType;
        this.combinationConfigurations = list;
    }

    public final com.discover.mpos.sdk.transaction.TransactionType getTransactionType() {
        return this.transactionType;
    }

    public final java.util.List<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration> getCombinationConfigurations() {
        return this.combinationConfigurations;
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    public final int hashCode() {
        com.discover.mpos.sdk.transaction.TransactionType transactionType = this.transactionType;
        int hashCode = transactionType != null ? transactionType.hashCode() : 0;
        java.util.List<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration> list = this.combinationConfigurations;
        return (hashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration transactionTypeConfiguration = (com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionType, transactionTypeConfiguration.transactionType) && kotlin.jvm.internal.Intrinsics.areEqual(this.combinationConfigurations, transactionTypeConfiguration.combinationConfigurations);
    }

    public final com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration copy(com.discover.mpos.sdk.transaction.TransactionType transactionType, java.util.List<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration> combinationConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinationConfigurations, "");
        return new com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration(transactionType, combinationConfigurations);
    }

    public final java.util.List<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration> component2() {
        return this.combinationConfigurations;
    }

    /* renamed from: component1, reason: from getter */
    public final com.discover.mpos.sdk.transaction.TransactionType getTransactionType() {
        return this.transactionType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration copy$default(com.discover.mpos.sdk.cardreader.config.TransactionTypeConfiguration transactionTypeConfiguration, com.discover.mpos.sdk.transaction.TransactionType transactionType, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transactionType = transactionTypeConfiguration.transactionType;
        }
        if ((i & 2) != 0) {
            list = transactionTypeConfiguration.combinationConfigurations;
        }
        return transactionTypeConfiguration.copy(transactionType, list);
    }
}
