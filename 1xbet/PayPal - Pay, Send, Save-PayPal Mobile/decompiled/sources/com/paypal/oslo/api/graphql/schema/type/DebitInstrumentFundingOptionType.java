package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "AUTO_RELOAD", "AUTO_RELOAD_PER_CARD", "DIRECT_FUNDING", "DIRECT_FUNDING_PER_CARD", "AUTO_RELOAD_EXACT_PER_CARD", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebitInstrumentFundingOptionType {
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType AUTO_RELOAD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType AUTO_RELOAD_EXACT_PER_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType AUTO_RELOAD_PER_CARD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType DIRECT_FUNDING;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType DIRECT_FUNDING_PER_CARD;
    public static final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType[] getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private DebitInstrumentFundingOptionType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType debitInstrumentFundingOptionType = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType("AUTO_RELOAD", 0, "AUTO_RELOAD");
        AUTO_RELOAD = debitInstrumentFundingOptionType;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType debitInstrumentFundingOptionType2 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType("AUTO_RELOAD_PER_CARD", 1, "AUTO_RELOAD_PER_CARD");
        AUTO_RELOAD_PER_CARD = debitInstrumentFundingOptionType2;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType debitInstrumentFundingOptionType3 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType("DIRECT_FUNDING", 2, "DIRECT_FUNDING");
        DIRECT_FUNDING = debitInstrumentFundingOptionType3;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType debitInstrumentFundingOptionType4 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType("DIRECT_FUNDING_PER_CARD", 3, "DIRECT_FUNDING_PER_CARD");
        DIRECT_FUNDING_PER_CARD = debitInstrumentFundingOptionType4;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType debitInstrumentFundingOptionType5 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType("AUTO_RELOAD_EXACT_PER_CARD", 4, "AUTO_RELOAD_EXACT_PER_CARD");
        AUTO_RELOAD_EXACT_PER_CARD = debitInstrumentFundingOptionType5;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType debitInstrumentFundingOptionType6 = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = debitInstrumentFundingOptionType6;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType[] debitInstrumentFundingOptionTypeArr = {debitInstrumentFundingOptionType, debitInstrumentFundingOptionType2, debitInstrumentFundingOptionType3, debitInstrumentFundingOptionType4, debitInstrumentFundingOptionType5, debitInstrumentFundingOptionType6};
        getHighSpeedVideoFpsRanges = debitInstrumentFundingOptionTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(debitInstrumentFundingOptionTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("DebitInstrumentFundingOptionType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"AUTO_RELOAD", "AUTO_RELOAD_PER_CARD", "DIRECT_FUNDING", "DIRECT_FUNDING_PER_CARD", "AUTO_RELOAD_EXACT_PER_CARD"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingOptionType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType[]{com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType.AUTO_RELOAD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType.AUTO_RELOAD_PER_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType.DIRECT_FUNDING, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType.DIRECT_FUNDING_PER_CARD, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType.AUTO_RELOAD_EXACT_PER_CARD});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType debitInstrumentFundingOptionType = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType) obj;
            return debitInstrumentFundingOptionType == null ? com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType.UNKNOWN__ : debitInstrumentFundingOptionType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingOptionType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
