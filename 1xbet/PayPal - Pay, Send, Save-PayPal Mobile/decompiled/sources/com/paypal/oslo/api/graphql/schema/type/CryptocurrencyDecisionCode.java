package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyDecisionCode;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ALLOW", "DISALLOW", "HOLD", "HOLD_ALLOW_SELL", "SEIZE", "AWAITING_DECISION", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CryptocurrencyDecisionCode {
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode ALLOW;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode AWAITING_DECISION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode DISALLOW;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode HOLD;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode HOLD_ALLOW_SELL;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode SEIZE;
    public static final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CryptocurrencyDecisionCode(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode cryptocurrencyDecisionCode = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode("ALLOW", 0, "ALLOW");
        ALLOW = cryptocurrencyDecisionCode;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode cryptocurrencyDecisionCode2 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode("DISALLOW", 1, "DISALLOW");
        DISALLOW = cryptocurrencyDecisionCode2;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode cryptocurrencyDecisionCode3 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode("HOLD", 2, "HOLD");
        HOLD = cryptocurrencyDecisionCode3;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode cryptocurrencyDecisionCode4 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode("HOLD_ALLOW_SELL", 3, "HOLD_ALLOW_SELL");
        HOLD_ALLOW_SELL = cryptocurrencyDecisionCode4;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode cryptocurrencyDecisionCode5 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode("SEIZE", 4, "SEIZE");
        SEIZE = cryptocurrencyDecisionCode5;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode cryptocurrencyDecisionCode6 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode("AWAITING_DECISION", 5, "AWAITING_DECISION");
        AWAITING_DECISION = cryptocurrencyDecisionCode6;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode cryptocurrencyDecisionCode7 = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode("UNKNOWN__", 6, "UNKNOWN__");
        UNKNOWN__ = cryptocurrencyDecisionCode7;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode[] cryptocurrencyDecisionCodeArr = {cryptocurrencyDecisionCode, cryptocurrencyDecisionCode2, cryptocurrencyDecisionCode3, cryptocurrencyDecisionCode4, cryptocurrencyDecisionCode5, cryptocurrencyDecisionCode6, cryptocurrencyDecisionCode7};
        getHighSpeedVideoFpsRangesFor = cryptocurrencyDecisionCodeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cryptocurrencyDecisionCodeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CryptocurrencyDecisionCode", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ALLOW", "DISALLOW", "HOLD", "HOLD_ALLOW_SELL", "SEIZE", "AWAITING_DECISION"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyDecisionCode$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyDecisionCode;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyDecisionCode;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyDecisionCode;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode[]{com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode.ALLOW, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode.DISALLOW, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode.HOLD, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode.HOLD_ALLOW_SELL, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode.SEIZE, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode.AWAITING_DECISION});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode cryptocurrencyDecisionCode = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode) obj;
            return cryptocurrencyDecisionCode == null ? com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode.UNKNOWN__ : cryptocurrencyDecisionCode;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
