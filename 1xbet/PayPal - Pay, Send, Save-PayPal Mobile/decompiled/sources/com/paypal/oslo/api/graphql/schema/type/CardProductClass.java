package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CREDIT", "DEBIT", "GIFT", "MIXED", "PAYPAL_PREPAID", "PREPAID", "TOKENIZED", "VAULTED", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardProductClass {
    public static final com.paypal.oslo.api.graphql.schema.type.CardProductClass CREDIT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CardProductClass.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CardProductClass DEBIT;
    public static final com.paypal.oslo.api.graphql.schema.type.CardProductClass GIFT;
    public static final com.paypal.oslo.api.graphql.schema.type.CardProductClass MIXED;
    public static final com.paypal.oslo.api.graphql.schema.type.CardProductClass PAYPAL_PREPAID;
    public static final com.paypal.oslo.api.graphql.schema.type.CardProductClass PREPAID;
    public static final com.paypal.oslo.api.graphql.schema.type.CardProductClass TOKENIZED;
    public static final com.paypal.oslo.api.graphql.schema.type.CardProductClass UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.CardProductClass UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.CardProductClass VAULTED;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CardProductClass[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CardProductClass(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = new com.paypal.oslo.api.graphql.schema.type.CardProductClass("CREDIT", 0, "CREDIT");
        CREDIT = cardProductClass;
        com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass2 = new com.paypal.oslo.api.graphql.schema.type.CardProductClass("DEBIT", 1, "DEBIT");
        DEBIT = cardProductClass2;
        com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass3 = new com.paypal.oslo.api.graphql.schema.type.CardProductClass("GIFT", 2, "GIFT");
        GIFT = cardProductClass3;
        com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass4 = new com.paypal.oslo.api.graphql.schema.type.CardProductClass("MIXED", 3, "MIXED");
        MIXED = cardProductClass4;
        com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass5 = new com.paypal.oslo.api.graphql.schema.type.CardProductClass("PAYPAL_PREPAID", 4, "PAYPAL_PREPAID");
        PAYPAL_PREPAID = cardProductClass5;
        com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass6 = new com.paypal.oslo.api.graphql.schema.type.CardProductClass("PREPAID", 5, "PREPAID");
        PREPAID = cardProductClass6;
        com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass7 = new com.paypal.oslo.api.graphql.schema.type.CardProductClass("TOKENIZED", 6, "TOKENIZED");
        TOKENIZED = cardProductClass7;
        com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass8 = new com.paypal.oslo.api.graphql.schema.type.CardProductClass("VAULTED", 7, "VAULTED");
        VAULTED = cardProductClass8;
        com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass9 = new com.paypal.oslo.api.graphql.schema.type.CardProductClass("UNKNOWN", 8, "UNKNOWN");
        UNKNOWN = cardProductClass9;
        com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass10 = new com.paypal.oslo.api.graphql.schema.type.CardProductClass("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = cardProductClass10;
        com.paypal.oslo.api.graphql.schema.type.CardProductClass[] cardProductClassArr = {cardProductClass, cardProductClass2, cardProductClass3, cardProductClass4, cardProductClass5, cardProductClass6, cardProductClass7, cardProductClass8, cardProductClass9, cardProductClass10};
        getHighSpeedVideoSizes = cardProductClassArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cardProductClassArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CardProductClass.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CardProductClass", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CREDIT", "DEBIT", "GIFT", "MIXED", "PAYPAL_PREPAID", "PREPAID", "TOKENIZED", "VAULTED", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CardProductClass;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CardProductClass.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CardProductClass> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CardProductClass[]{com.paypal.oslo.api.graphql.schema.type.CardProductClass.CREDIT, com.paypal.oslo.api.graphql.schema.type.CardProductClass.DEBIT, com.paypal.oslo.api.graphql.schema.type.CardProductClass.GIFT, com.paypal.oslo.api.graphql.schema.type.CardProductClass.MIXED, com.paypal.oslo.api.graphql.schema.type.CardProductClass.PAYPAL_PREPAID, com.paypal.oslo.api.graphql.schema.type.CardProductClass.PREPAID, com.paypal.oslo.api.graphql.schema.type.CardProductClass.TOKENIZED, com.paypal.oslo.api.graphql.schema.type.CardProductClass.VAULTED, com.paypal.oslo.api.graphql.schema.type.CardProductClass.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CardProductClass[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CardProductClass[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardProductClass safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CardProductClass.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CardProductClass) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CardProductClass cardProductClass = (com.paypal.oslo.api.graphql.schema.type.CardProductClass) obj;
            return cardProductClass == null ? com.paypal.oslo.api.graphql.schema.type.CardProductClass.UNKNOWN__ : cardProductClass;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CardProductClass[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CardProductClass[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CardProductClass valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CardProductClass) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CardProductClass.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CardProductClass> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
