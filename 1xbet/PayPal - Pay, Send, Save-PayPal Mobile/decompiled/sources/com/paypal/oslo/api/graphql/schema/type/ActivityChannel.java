package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b#\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityChannel;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "POINT_OF_SALE", "CHECKOUT", "PAYPAL_HERE", "VIRTUAL_TERMINAL", "DIRECT_CREDIT_CARD", "EBAY", "WEB", "MOBILE", "PERSONAL_PAYMENT", "WIRE_TRANSFER", "ATM", "PAYMENT_FULFILLMENT_SYSTEM", "BILLPAY", "CASH_PICKUP", "RECEIVER_BANK_DEPOSIT", "CASH_DELIVERY", "QR_CODE", "PARTNER_CASH_OUT", "UNBRANDED_PAYMENTS", "APPLE_PAY", "GOOGLE_PAY", "NFC", "ALTPAY_PIX", "VENMO", "UPI", "ACCOUNTS_PAYABLE", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityChannel {
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel ACCOUNTS_PAYABLE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel ALTPAY_PIX;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel APPLE_PAY;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel ATM;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel BILLPAY;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel CASH_DELIVERY;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel CASH_PICKUP;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel CHECKOUT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel DIRECT_CREDIT_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel EBAY;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel GOOGLE_PAY;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel MOBILE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel NFC;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel PARTNER_CASH_OUT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel PAYMENT_FULFILLMENT_SYSTEM;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel PAYPAL_HERE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel PERSONAL_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel POINT_OF_SALE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel QR_CODE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel RECEIVER_BANK_DEPOSIT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel UNBRANDED_PAYMENTS;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel UPI;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel VENMO;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel VIRTUAL_TERMINAL;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel WEB;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityChannel WIRE_TRANSFER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivityChannel[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ActivityChannel(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("POINT_OF_SALE", 0, "POINT_OF_SALE");
        POINT_OF_SALE = activityChannel;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel2 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("CHECKOUT", 1, "CHECKOUT");
        CHECKOUT = activityChannel2;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel3 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("PAYPAL_HERE", 2, "PAYPAL_HERE");
        PAYPAL_HERE = activityChannel3;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel4 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("VIRTUAL_TERMINAL", 3, "VIRTUAL_TERMINAL");
        VIRTUAL_TERMINAL = activityChannel4;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel5 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("DIRECT_CREDIT_CARD", 4, "DIRECT_CREDIT_CARD");
        DIRECT_CREDIT_CARD = activityChannel5;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel6 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("EBAY", 5, "EBAY");
        EBAY = activityChannel6;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel7 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("WEB", 6, "WEB");
        WEB = activityChannel7;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel8 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("MOBILE", 7, "MOBILE");
        MOBILE = activityChannel8;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel9 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("PERSONAL_PAYMENT", 8, "PERSONAL_PAYMENT");
        PERSONAL_PAYMENT = activityChannel9;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel10 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("WIRE_TRANSFER", 9, "WIRE_TRANSFER");
        WIRE_TRANSFER = activityChannel10;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel11 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("ATM", 10, "ATM");
        ATM = activityChannel11;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel12 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("PAYMENT_FULFILLMENT_SYSTEM", 11, "PAYMENT_FULFILLMENT_SYSTEM");
        PAYMENT_FULFILLMENT_SYSTEM = activityChannel12;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel13 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("BILLPAY", 12, "BILLPAY");
        BILLPAY = activityChannel13;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel14 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("CASH_PICKUP", 13, "CASH_PICKUP");
        CASH_PICKUP = activityChannel14;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel15 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("RECEIVER_BANK_DEPOSIT", 14, "RECEIVER_BANK_DEPOSIT");
        RECEIVER_BANK_DEPOSIT = activityChannel15;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel16 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("CASH_DELIVERY", 15, "CASH_DELIVERY");
        CASH_DELIVERY = activityChannel16;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel17 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("QR_CODE", 16, "QR_CODE");
        QR_CODE = activityChannel17;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel18 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("PARTNER_CASH_OUT", 17, "PARTNER_CASH_OUT");
        PARTNER_CASH_OUT = activityChannel18;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel19 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("UNBRANDED_PAYMENTS", 18, "UNBRANDED_PAYMENTS");
        UNBRANDED_PAYMENTS = activityChannel19;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel20 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("APPLE_PAY", 19, "APPLE_PAY");
        APPLE_PAY = activityChannel20;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel21 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("GOOGLE_PAY", 20, "GOOGLE_PAY");
        GOOGLE_PAY = activityChannel21;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel22 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("NFC", 21, "NFC");
        NFC = activityChannel22;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel23 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("ALTPAY_PIX", 22, "ALTPAY_PIX");
        ALTPAY_PIX = activityChannel23;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel24 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("VENMO", 23, "VENMO");
        VENMO = activityChannel24;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel25 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("UPI", 24, "UPI");
        UPI = activityChannel25;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel26 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("ACCOUNTS_PAYABLE", 25, "ACCOUNTS_PAYABLE");
        ACCOUNTS_PAYABLE = activityChannel26;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel27 = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel("UNKNOWN__", 26, "UNKNOWN__");
        UNKNOWN__ = activityChannel27;
        com.paypal.oslo.api.graphql.schema.type.ActivityChannel[] activityChannelArr = {activityChannel, activityChannel2, activityChannel3, activityChannel4, activityChannel5, activityChannel6, activityChannel7, activityChannel8, activityChannel9, activityChannel10, activityChannel11, activityChannel12, activityChannel13, activityChannel14, activityChannel15, activityChannel16, activityChannel17, activityChannel18, activityChannel19, activityChannel20, activityChannel21, activityChannel22, activityChannel23, activityChannel24, activityChannel25, activityChannel26, activityChannel27};
        getHighSpeedVideoSizes = activityChannelArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(activityChannelArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ActivityChannel.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ActivityChannel", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"POINT_OF_SALE", "CHECKOUT", "PAYPAL_HERE", "VIRTUAL_TERMINAL", "DIRECT_CREDIT_CARD", "EBAY", "WEB", "MOBILE", "PERSONAL_PAYMENT", "WIRE_TRANSFER", "ATM", "PAYMENT_FULFILLMENT_SYSTEM", "BILLPAY", "CASH_PICKUP", "RECEIVER_BANK_DEPOSIT", "CASH_DELIVERY", "QR_CODE", "PARTNER_CASH_OUT", "UNBRANDED_PAYMENTS", "APPLE_PAY", "GOOGLE_PAY", "NFC", "ALTPAY_PIX", "VENMO", "UPI", "ACCOUNTS_PAYABLE"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityChannel$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityChannel;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ActivityChannel;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ActivityChannel;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ActivityChannel.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityChannel> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityChannel[]{com.paypal.oslo.api.graphql.schema.type.ActivityChannel.POINT_OF_SALE, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.CHECKOUT, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.PAYPAL_HERE, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.VIRTUAL_TERMINAL, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.DIRECT_CREDIT_CARD, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.EBAY, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.WEB, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.MOBILE, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.PERSONAL_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.WIRE_TRANSFER, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.ATM, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.PAYMENT_FULFILLMENT_SYSTEM, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.BILLPAY, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.CASH_PICKUP, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.RECEIVER_BANK_DEPOSIT, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.CASH_DELIVERY, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.QR_CODE, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.PARTNER_CASH_OUT, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.UNBRANDED_PAYMENTS, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.APPLE_PAY, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.GOOGLE_PAY, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.NFC, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.ALTPAY_PIX, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.VENMO, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.UPI, com.paypal.oslo.api.graphql.schema.type.ActivityChannel.ACCOUNTS_PAYABLE});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ActivityChannel[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ActivityChannel[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ActivityChannel[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityChannel safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ActivityChannel.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ActivityChannel) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ActivityChannel activityChannel = (com.paypal.oslo.api.graphql.schema.type.ActivityChannel) obj;
            return activityChannel == null ? com.paypal.oslo.api.graphql.schema.type.ActivityChannel.UNKNOWN__ : activityChannel;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityChannel[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityChannel[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityChannel valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityChannel) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ActivityChannel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ActivityChannel> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
