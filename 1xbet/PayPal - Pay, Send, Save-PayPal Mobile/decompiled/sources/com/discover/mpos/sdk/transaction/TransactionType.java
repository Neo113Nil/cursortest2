package com.discover.mpos.sdk.transaction;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/discover/mpos/sdk/transaction/TransactionType;", "", "", "emvValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getEmvValue", "()Ljava/lang/String;", "Companion", "PURCHASE", "PURCHASE_WITH_CASHBACK", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, "ERROR"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public enum TransactionType {
    PURCHASE(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX),
    PURCHASE_WITH_CASHBACK("09"),
    REFUND("20"),
    ERROR("");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.discover.mpos.sdk.transaction.TransactionType.Companion INSTANCE = new com.discover.mpos.sdk.transaction.TransactionType.Companion(null);
    private final java.lang.String emvValue;

    TransactionType(java.lang.String str) {
        this.emvValue = str;
    }

    public final java.lang.String getEmvValue() {
        return this.emvValue;
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/discover/mpos/sdk/transaction/TransactionType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/discover/mpos/sdk/transaction/TransactionType;", "getEnumByValue", "(Ljava/lang/String;)Lcom/discover/mpos/sdk/transaction/TransactionType;"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.discover.mpos.sdk.transaction.TransactionType getEnumByValue(java.lang.String value) {
            com.discover.mpos.sdk.transaction.TransactionType transactionType;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            com.discover.mpos.sdk.transaction.TransactionType[] values = com.discover.mpos.sdk.transaction.TransactionType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    transactionType = null;
                    break;
                }
                transactionType = values[i];
                if (kotlin.jvm.internal.Intrinsics.areEqual(transactionType.getEmvValue(), value)) {
                    break;
                }
                i++;
            }
            return transactionType == null ? com.discover.mpos.sdk.transaction.TransactionType.ERROR : transactionType;
        }
    }
}
