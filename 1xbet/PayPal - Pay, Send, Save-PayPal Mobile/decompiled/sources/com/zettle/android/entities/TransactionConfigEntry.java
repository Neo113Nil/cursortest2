package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/zettle/android/entities/TransactionConfigEntry;", "", "", "getCardHolderEntryPanRegex", "()Ljava/lang/String;", "cardHolderEntryPanRegex", "", "getMaxTransactionAmount", "()Ljava/lang/Long;", "maxTransactionAmount", "getMinTransactionAmount", "minTransactionAmount", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface TransactionConfigEntry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.android.entities.TransactionConfigEntry.Companion INSTANCE = com.zettle.android.entities.TransactionConfigEntry.Companion.$$INSTANCE;

    java.lang.String getCardHolderEntryPanRegex();

    java.lang.Long getMaxTransactionAmount();

    java.lang.Long getMinTransactionAmount();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002 \u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/android/entities/TransactionConfigEntry$Companion;", "Lkotlin/Function3;", "", "", "Lcom/zettle/android/entities/TransactionConfigEntry;", "<init>", "()V", "minTransactionAmount", "maxTransactionAmount", "cardHolderEntryPanRegex", "invoke", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/zettle/android/entities/TransactionConfigEntry;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements kotlin.jvm.functions.Function3<java.lang.Long, java.lang.Long, java.lang.String, com.zettle.android.entities.TransactionConfigEntry> {
        static final /* synthetic */ com.zettle.android.entities.TransactionConfigEntry.Companion $$INSTANCE = new com.zettle.android.entities.TransactionConfigEntry.Companion();

        private Companion() {
        }

        @Override // kotlin.jvm.functions.Function3
        public final com.zettle.android.entities.TransactionConfigEntry invoke(java.lang.Long minTransactionAmount, java.lang.Long maxTransactionAmount, java.lang.String cardHolderEntryPanRegex) {
            return new com.zettle.android.entities.TransactionConfigEntryImpl(minTransactionAmount, maxTransactionAmount, cardHolderEntryPanRegex);
        }
    }
}
