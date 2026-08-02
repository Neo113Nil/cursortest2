package com.paypal.oslo.feature.qrc.graphql.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/type/CardProductClass;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CREDIT", "DEBIT", "GIFT", "MIXED", "PAYPAL_PREPAID", "PREPAID", "TOKENIZED", "VAULTED", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardProductClass {
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardProductClass CREDIT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardProductClass DEBIT;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardProductClass GIFT;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardProductClass MIXED;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardProductClass PAYPAL_PREPAID;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardProductClass PREPAID;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardProductClass TOKENIZED;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardProductClass UNKNOWN;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardProductClass UNKNOWN__;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardProductClass VAULTED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.graphql.type.CardProductClass[] getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CardProductClass(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.qrc.graphql.type.CardProductClass cardProductClass = new com.paypal.oslo.feature.qrc.graphql.type.CardProductClass("CREDIT", 0, "CREDIT");
        CREDIT = cardProductClass;
        com.paypal.oslo.feature.qrc.graphql.type.CardProductClass cardProductClass2 = new com.paypal.oslo.feature.qrc.graphql.type.CardProductClass("DEBIT", 1, "DEBIT");
        DEBIT = cardProductClass2;
        com.paypal.oslo.feature.qrc.graphql.type.CardProductClass cardProductClass3 = new com.paypal.oslo.feature.qrc.graphql.type.CardProductClass("GIFT", 2, "GIFT");
        GIFT = cardProductClass3;
        com.paypal.oslo.feature.qrc.graphql.type.CardProductClass cardProductClass4 = new com.paypal.oslo.feature.qrc.graphql.type.CardProductClass("MIXED", 3, "MIXED");
        MIXED = cardProductClass4;
        com.paypal.oslo.feature.qrc.graphql.type.CardProductClass cardProductClass5 = new com.paypal.oslo.feature.qrc.graphql.type.CardProductClass("PAYPAL_PREPAID", 4, "PAYPAL_PREPAID");
        PAYPAL_PREPAID = cardProductClass5;
        com.paypal.oslo.feature.qrc.graphql.type.CardProductClass cardProductClass6 = new com.paypal.oslo.feature.qrc.graphql.type.CardProductClass("PREPAID", 5, "PREPAID");
        PREPAID = cardProductClass6;
        com.paypal.oslo.feature.qrc.graphql.type.CardProductClass cardProductClass7 = new com.paypal.oslo.feature.qrc.graphql.type.CardProductClass("TOKENIZED", 6, "TOKENIZED");
        TOKENIZED = cardProductClass7;
        com.paypal.oslo.feature.qrc.graphql.type.CardProductClass cardProductClass8 = new com.paypal.oslo.feature.qrc.graphql.type.CardProductClass("VAULTED", 7, "VAULTED");
        VAULTED = cardProductClass8;
        com.paypal.oslo.feature.qrc.graphql.type.CardProductClass cardProductClass9 = new com.paypal.oslo.feature.qrc.graphql.type.CardProductClass("UNKNOWN", 8, "UNKNOWN");
        UNKNOWN = cardProductClass9;
        com.paypal.oslo.feature.qrc.graphql.type.CardProductClass cardProductClass10 = new com.paypal.oslo.feature.qrc.graphql.type.CardProductClass("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = cardProductClass10;
        com.paypal.oslo.feature.qrc.graphql.type.CardProductClass[] cardProductClassArr = {cardProductClass, cardProductClass2, cardProductClass3, cardProductClass4, cardProductClass5, cardProductClass6, cardProductClass7, cardProductClass8, cardProductClass9, cardProductClass10};
        getHighSpeedVideoFpsRanges = cardProductClassArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cardProductClassArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CardProductClass", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CREDIT", "DEBIT", "GIFT", "MIXED", "PAYPAL_PREPAID", "PREPAID", "TOKENIZED", "VAULTED", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/type/CardProductClass$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/qrc/graphql/type/CardProductClass;", "knownValues", "()[Lcom/paypal/oslo/feature/qrc/graphql/type/CardProductClass;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/graphql/type/CardProductClass;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.type;
        }

        public final java.util.List<com.paypal.oslo.feature.qrc.graphql.type.CardProductClass> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.qrc.graphql.type.CardProductClass[]{com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.CREDIT, com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.DEBIT, com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.GIFT, com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.MIXED, com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.PAYPAL_PREPAID, com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.PREPAID, com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.TOKENIZED, com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.VAULTED, com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.qrc.graphql.type.CardProductClass[] knownValues() {
            return (com.paypal.oslo.feature.qrc.graphql.type.CardProductClass[]) getKnownEntries().toArray(new com.paypal.oslo.feature.qrc.graphql.type.CardProductClass[0]);
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.CardProductClass safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.qrc.graphql.type.CardProductClass) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.qrc.graphql.type.CardProductClass cardProductClass = (com.paypal.oslo.feature.qrc.graphql.type.CardProductClass) obj;
            return cardProductClass == null ? com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.UNKNOWN__ : cardProductClass;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.qrc.graphql.type.CardProductClass[] values() {
        return (com.paypal.oslo.feature.qrc.graphql.type.CardProductClass[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.qrc.graphql.type.CardProductClass valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.graphql.type.CardProductClass) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.graphql.type.CardProductClass.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.graphql.type.CardProductClass> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
