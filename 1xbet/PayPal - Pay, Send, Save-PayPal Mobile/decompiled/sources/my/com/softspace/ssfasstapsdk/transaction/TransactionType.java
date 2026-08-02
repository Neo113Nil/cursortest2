package my.com.softspace.ssfasstapsdk.transaction;

/* loaded from: classes17.dex */
public enum TransactionType {
    Purchase(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX),
    PurchaseWithCashback("09"),
    CashAdvance("01"),
    Refund("20");

    private java.lang.String value;

    TransactionType(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public static my.com.softspace.ssfasstapsdk.transaction.TransactionType fromValue(java.lang.String str) {
        for (my.com.softspace.ssfasstapsdk.transaction.TransactionType transactionType : values()) {
            if (transactionType.getValue().equals(str)) {
                return transactionType;
            }
        }
        return Purchase;
    }
}
