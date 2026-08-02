package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/zettle/android/entities/TransactionConfigEntryImpl;", "Lcom/zettle/android/entities/TransactionConfigEntry;", "", "minTransactionAmount", "maxTransactionAmount", "", "cardHolderEntryPanRegex", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "component1", "()Ljava/lang/Long;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/zettle/android/entities/TransactionConfigEntryImpl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardHolderEntryPanRegex", "Ljava/lang/Long;", "getMaxTransactionAmount", "getMinTransactionAmount"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class TransactionConfigEntryImpl implements com.zettle.android.entities.TransactionConfigEntry {
    private final java.lang.String cardHolderEntryPanRegex;
    private final java.lang.Long maxTransactionAmount;
    private final java.lang.Long minTransactionAmount;

    public TransactionConfigEntryImpl(java.lang.Long l, java.lang.Long l2, java.lang.String str) {
        this.minTransactionAmount = l;
        this.maxTransactionAmount = l2;
        this.cardHolderEntryPanRegex = str;
    }

    @Override // com.zettle.android.entities.TransactionConfigEntry
    public final java.lang.Long getMinTransactionAmount() {
        return this.minTransactionAmount;
    }

    @Override // com.zettle.android.entities.TransactionConfigEntry
    public final java.lang.Long getMaxTransactionAmount() {
        return this.maxTransactionAmount;
    }

    @Override // com.zettle.android.entities.TransactionConfigEntry
    public final java.lang.String getCardHolderEntryPanRegex() {
        return this.cardHolderEntryPanRegex;
    }

    public final java.lang.String toString() {
        java.lang.Long l = this.minTransactionAmount;
        java.lang.Long l2 = this.maxTransactionAmount;
        java.lang.String str = this.cardHolderEntryPanRegex;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionConfigEntryImpl(minTransactionAmount=");
        sb.append(l);
        sb.append(", maxTransactionAmount=");
        sb.append(l2);
        sb.append(", cardHolderEntryPanRegex=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Long l = this.minTransactionAmount;
        int hashCode = l == null ? 0 : l.hashCode();
        java.lang.Long l2 = this.maxTransactionAmount;
        int hashCode2 = l2 == null ? 0 : l2.hashCode();
        java.lang.String str = this.cardHolderEntryPanRegex;
        return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.android.entities.TransactionConfigEntryImpl)) {
            return false;
        }
        com.zettle.android.entities.TransactionConfigEntryImpl transactionConfigEntryImpl = (com.zettle.android.entities.TransactionConfigEntryImpl) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.minTransactionAmount, transactionConfigEntryImpl.minTransactionAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.maxTransactionAmount, transactionConfigEntryImpl.maxTransactionAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardHolderEntryPanRegex, transactionConfigEntryImpl.cardHolderEntryPanRegex);
    }

    public final com.zettle.android.entities.TransactionConfigEntryImpl copy(java.lang.Long minTransactionAmount, java.lang.Long maxTransactionAmount, java.lang.String cardHolderEntryPanRegex) {
        return new com.zettle.android.entities.TransactionConfigEntryImpl(minTransactionAmount, maxTransactionAmount, cardHolderEntryPanRegex);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardHolderEntryPanRegex() {
        return this.cardHolderEntryPanRegex;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getMaxTransactionAmount() {
        return this.maxTransactionAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getMinTransactionAmount() {
        return this.minTransactionAmount;
    }

    public static /* synthetic */ com.zettle.android.entities.TransactionConfigEntryImpl copy$default(com.zettle.android.entities.TransactionConfigEntryImpl transactionConfigEntryImpl, java.lang.Long l, java.lang.Long l2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = transactionConfigEntryImpl.minTransactionAmount;
        }
        if ((i & 2) != 0) {
            l2 = transactionConfigEntryImpl.maxTransactionAmount;
        }
        if ((i & 4) != 0) {
            str = transactionConfigEntryImpl.cardHolderEntryPanRegex;
        }
        return transactionConfigEntryImpl.copy(l, l2, str);
    }
}
