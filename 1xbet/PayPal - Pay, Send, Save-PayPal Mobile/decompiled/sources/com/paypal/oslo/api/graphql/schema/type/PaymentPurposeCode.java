package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentPurposeCode;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BILLS_AND_UTILITIES", "EDUCATION", "ENTERTAINMENT_AND_GAMES", "FOOD_AND_DRINKS", "HEALTHCARE", "PURCHASE_OF_GENERAL_MERCHANDISE", "TRANSPORT", "TRAVEL_AND_ACCOMMODATION", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentPurposeCode {
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode BILLS_AND_UTILITIES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode EDUCATION;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode ENTERTAINMENT_AND_GAMES;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode FOOD_AND_DRINKS;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode HEALTHCARE;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode PURCHASE_OF_GENERAL_MERCHANDISE;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode TRANSPORT;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode TRAVEL_AND_ACCOMMODATION;
    public static final com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private PaymentPurposeCode(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode paymentPurposeCode = new com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode("BILLS_AND_UTILITIES", 0, "BILLS_AND_UTILITIES");
        BILLS_AND_UTILITIES = paymentPurposeCode;
        com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode paymentPurposeCode2 = new com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode("EDUCATION", 1, "EDUCATION");
        EDUCATION = paymentPurposeCode2;
        com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode paymentPurposeCode3 = new com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode("ENTERTAINMENT_AND_GAMES", 2, "ENTERTAINMENT_AND_GAMES");
        ENTERTAINMENT_AND_GAMES = paymentPurposeCode3;
        com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode paymentPurposeCode4 = new com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode("FOOD_AND_DRINKS", 3, "FOOD_AND_DRINKS");
        FOOD_AND_DRINKS = paymentPurposeCode4;
        com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode paymentPurposeCode5 = new com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode("HEALTHCARE", 4, "HEALTHCARE");
        HEALTHCARE = paymentPurposeCode5;
        com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode paymentPurposeCode6 = new com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode("PURCHASE_OF_GENERAL_MERCHANDISE", 5, "PURCHASE_OF_GENERAL_MERCHANDISE");
        PURCHASE_OF_GENERAL_MERCHANDISE = paymentPurposeCode6;
        com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode paymentPurposeCode7 = new com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode("TRANSPORT", 6, "TRANSPORT");
        TRANSPORT = paymentPurposeCode7;
        com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode paymentPurposeCode8 = new com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode("TRAVEL_AND_ACCOMMODATION", 7, "TRAVEL_AND_ACCOMMODATION");
        TRAVEL_AND_ACCOMMODATION = paymentPurposeCode8;
        com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode paymentPurposeCode9 = new com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode("UNKNOWN__", 8, "UNKNOWN__");
        UNKNOWN__ = paymentPurposeCode9;
        com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode[] paymentPurposeCodeArr = {paymentPurposeCode, paymentPurposeCode2, paymentPurposeCode3, paymentPurposeCode4, paymentPurposeCode5, paymentPurposeCode6, paymentPurposeCode7, paymentPurposeCode8, paymentPurposeCode9};
        getHighSpeedVideoFpsRangesFor = paymentPurposeCodeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(paymentPurposeCodeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("PaymentPurposeCode", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BILLS_AND_UTILITIES", "EDUCATION", "ENTERTAINMENT_AND_GAMES", "FOOD_AND_DRINKS", "HEALTHCARE", "PURCHASE_OF_GENERAL_MERCHANDISE", "TRANSPORT", "TRAVEL_AND_ACCOMMODATION"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PaymentPurposeCode$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentPurposeCode;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/PaymentPurposeCode;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/PaymentPurposeCode;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode[]{com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.BILLS_AND_UTILITIES, com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.EDUCATION, com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.ENTERTAINMENT_AND_GAMES, com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.FOOD_AND_DRINKS, com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.HEALTHCARE, com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.PURCHASE_OF_GENERAL_MERCHANDISE, com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.TRANSPORT, com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.TRAVEL_AND_ACCOMMODATION});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode paymentPurposeCode = (com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode) obj;
            return paymentPurposeCode == null ? com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.UNKNOWN__ : paymentPurposeCode;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.PaymentPurposeCode> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
