package com.paypal.oslo.feature.taxanddocumentcenter.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "apiValue", "Ljava/lang/String;", "getApiValue", "()Ljava/lang/String;", "Companion", "ALL_TRANSACTIONS", "COMPLETED_PAYMENTS", "BALANCE_AFFECTING"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TransactionTypeDomain {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain ALL_TRANSACTIONS;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain BALANCE_AFFECTING;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain COMPLETED_PAYMENTS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain.Companion INSTANCE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain[] getHighSpeedVideoFpsRanges;
    private final java.lang.String apiValue;

    private TransactionTypeDomain(java.lang.String str, int i, java.lang.String str2) {
        this.apiValue = str2;
    }

    public final java.lang.String getApiValue() {
        return this.apiValue;
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain transactionTypeDomain = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain("ALL_TRANSACTIONS", 0, "ALL");
        ALL_TRANSACTIONS = transactionTypeDomain;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain transactionTypeDomain2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain("COMPLETED_PAYMENTS", 1, "COMPLETED_PAYMENTS");
        COMPLETED_PAYMENTS = transactionTypeDomain2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain transactionTypeDomain3 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain("BALANCE_AFFECTING", 2, "BALANCE_IMPACTING");
        BALANCE_AFFECTING = transactionTypeDomain3;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain[] transactionTypeDomainArr = {transactionTypeDomain, transactionTypeDomain2, transactionTypeDomain3};
        getHighSpeedVideoFpsRanges = transactionTypeDomainArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(transactionTypeDomainArr);
        INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain$Companion;", "", "<init>", "()V", "", "index", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain;", "fromIndex", "(I)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain fromIndex(int index) {
            kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain> entries = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain.getEntries();
            return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain) ((index < 0 || index >= entries.size()) ? com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain.ALL_TRANSACTIONS : entries.get(index));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
