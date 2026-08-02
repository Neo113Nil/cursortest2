package com.zettle.android.entities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019"}, d2 = {"Lcom/zettle/android/entities/PaymentType;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "UNKNOWN", "CASH", "INVOICE", "CARD", "CARD_ONLINE", "TAP_ON_PHONE", "PAYMENT_LINK", "PAYPAL", "SWISH", "VIPPS", "MOBILE_PAY", "GIFTCARD", "KLARNA", "KEY_IN", "VENMO", "PAYPAL_INVOICE", "STORE_CREDIT"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PaymentType {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.zettle.android.entities.PaymentType[] $VALUES;
    private final java.lang.String value;
    public static final com.zettle.android.entities.PaymentType UNKNOWN = new com.zettle.android.entities.PaymentType("UNKNOWN", 0, "UNKNOWN");
    public static final com.zettle.android.entities.PaymentType CASH = new com.zettle.android.entities.PaymentType("CASH", 1, "IZETTLE_CASH");
    public static final com.zettle.android.entities.PaymentType INVOICE = new com.zettle.android.entities.PaymentType("INVOICE", 2, "IZETTLE_INVOICE");
    public static final com.zettle.android.entities.PaymentType CARD = new com.zettle.android.entities.PaymentType("CARD", 3, "IZETTLE_CARD");
    public static final com.zettle.android.entities.PaymentType CARD_ONLINE = new com.zettle.android.entities.PaymentType("CARD_ONLINE", 4, "IZETTLE_CARD_ONLINE");
    public static final com.zettle.android.entities.PaymentType TAP_ON_PHONE = new com.zettle.android.entities.PaymentType("TAP_ON_PHONE", 5, "IZETTLE_TAP_ON_PHONE");
    public static final com.zettle.android.entities.PaymentType PAYMENT_LINK = new com.zettle.android.entities.PaymentType("PAYMENT_LINK", 6, "IZETTLE_PAYMENT_LINK");
    public static final com.zettle.android.entities.PaymentType PAYPAL = new com.zettle.android.entities.PaymentType("PAYPAL", 7, "PAYPAL");
    public static final com.zettle.android.entities.PaymentType SWISH = new com.zettle.android.entities.PaymentType("SWISH", 8, "SWISH");
    public static final com.zettle.android.entities.PaymentType VIPPS = new com.zettle.android.entities.PaymentType("VIPPS", 9, "VIPPS");
    public static final com.zettle.android.entities.PaymentType MOBILE_PAY = new com.zettle.android.entities.PaymentType("MOBILE_PAY", 10, "MOBILE_PAY");
    public static final com.zettle.android.entities.PaymentType GIFTCARD = new com.zettle.android.entities.PaymentType("GIFTCARD", 11, "GIFTCARD");
    public static final com.zettle.android.entities.PaymentType KLARNA = new com.zettle.android.entities.PaymentType("KLARNA", 12, "KLARNA");
    public static final com.zettle.android.entities.PaymentType KEY_IN = new com.zettle.android.entities.PaymentType("KEY_IN", 13, "PAYPAL_KEYIN");
    public static final com.zettle.android.entities.PaymentType VENMO = new com.zettle.android.entities.PaymentType("VENMO", 14, "VENMO");
    public static final com.zettle.android.entities.PaymentType PAYPAL_INVOICE = new com.zettle.android.entities.PaymentType("PAYPAL_INVOICE", 15, "PAYPAL_INVOICE");
    public static final com.zettle.android.entities.PaymentType STORE_CREDIT = new com.zettle.android.entities.PaymentType("STORE_CREDIT", 16, "STORE_CREDIT");

    private PaymentType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.zettle.android.entities.PaymentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static com.zettle.android.entities.PaymentType[] values() {
        return (com.zettle.android.entities.PaymentType[]) $VALUES.clone();
    }

    public static com.zettle.android.entities.PaymentType valueOf(java.lang.String str) {
        return (com.zettle.android.entities.PaymentType) java.lang.Enum.valueOf(com.zettle.android.entities.PaymentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.zettle.android.entities.PaymentType> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ com.zettle.android.entities.PaymentType[] $values() {
        return new com.zettle.android.entities.PaymentType[]{UNKNOWN, CASH, INVOICE, CARD, CARD_ONLINE, TAP_ON_PHONE, PAYMENT_LINK, PAYPAL, SWISH, VIPPS, MOBILE_PAY, GIFTCARD, KLARNA, KEY_IN, VENMO, PAYPAL_INVOICE, STORE_CREDIT};
    }
}
