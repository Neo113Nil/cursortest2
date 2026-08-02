package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CardRewardRoundingMode;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "UP", "DOWN", "CEILING", "FLOOR", "HALF_UP", "HALF_DOWN", "HALF_EVEN", "UNNECESSARY", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardRewardRoundingMode {
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode CEILING;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode DOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode FLOOR;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode HALF_DOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode HALF_EVEN;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode HALF_UP;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode UNKNOWN;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode UNKNOWN__;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode UNNECESSARY;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode UP;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode[] getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CardRewardRoundingMode(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode = new com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode("UP", 0, "UP");
        UP = cardRewardRoundingMode;
        com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode2 = new com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode("DOWN", 1, "DOWN");
        DOWN = cardRewardRoundingMode2;
        com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode3 = new com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode("CEILING", 2, "CEILING");
        CEILING = cardRewardRoundingMode3;
        com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode4 = new com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode("FLOOR", 3, "FLOOR");
        FLOOR = cardRewardRoundingMode4;
        com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode5 = new com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode("HALF_UP", 4, "HALF_UP");
        HALF_UP = cardRewardRoundingMode5;
        com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode6 = new com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode("HALF_DOWN", 5, "HALF_DOWN");
        HALF_DOWN = cardRewardRoundingMode6;
        com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode7 = new com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode("HALF_EVEN", 6, "HALF_EVEN");
        HALF_EVEN = cardRewardRoundingMode7;
        com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode8 = new com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode("UNNECESSARY", 7, "UNNECESSARY");
        UNNECESSARY = cardRewardRoundingMode8;
        com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode9 = new com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode("UNKNOWN", 8, "UNKNOWN");
        UNKNOWN = cardRewardRoundingMode9;
        com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode10 = new com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = cardRewardRoundingMode10;
        com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode[] cardRewardRoundingModeArr = {cardRewardRoundingMode, cardRewardRoundingMode2, cardRewardRoundingMode3, cardRewardRoundingMode4, cardRewardRoundingMode5, cardRewardRoundingMode6, cardRewardRoundingMode7, cardRewardRoundingMode8, cardRewardRoundingMode9, cardRewardRoundingMode10};
        getHighResolutionOutputSizeshNQ4ISI = cardRewardRoundingModeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cardRewardRoundingModeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CardRewardRoundingMode", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"UP", "DOWN", "CEILING", "FLOOR", "HALF_UP", "HALF_DOWN", "HALF_EVEN", "UNNECESSARY", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CardRewardRoundingMode$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CardRewardRoundingMode;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CardRewardRoundingMode;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CardRewardRoundingMode;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode[]{com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.UP, com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.DOWN, com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.CEILING, com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.FLOOR, com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.HALF_UP, com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.HALF_DOWN, com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.HALF_EVEN, com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.UNNECESSARY, com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode cardRewardRoundingMode = (com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode) obj;
            return cardRewardRoundingMode == null ? com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.UNKNOWN__ : cardRewardRoundingMode;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CardRewardRoundingMode> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
