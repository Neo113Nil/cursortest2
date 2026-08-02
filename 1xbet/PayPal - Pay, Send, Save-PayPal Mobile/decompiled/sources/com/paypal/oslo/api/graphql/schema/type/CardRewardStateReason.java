package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CardRewardStateReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "INACTIVE_DUE_TO_EXPIRY", "INACTIVE_DUE_TO_HARD_BUSINESS_FAILURE", "INACTIVE_DUE_TO_SOFT_BUSINESS_FAILURE", "NEARING_EXPIRY", "NOT_APPLICABLE", "ON_HOLD_DUE_TO_PENDING_AUTHORIZATION", "ON_HOLD_DUE_TO_PENDING_CONFIRMATION", "INACTIVE_DUE_TO_PENDING_ORIGINAL_USER_CHECK", "INACTIVE_DUE_TO_UNENROLL", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardRewardStateReason {
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason INACTIVE_DUE_TO_EXPIRY;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason INACTIVE_DUE_TO_HARD_BUSINESS_FAILURE;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason INACTIVE_DUE_TO_PENDING_ORIGINAL_USER_CHECK;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason INACTIVE_DUE_TO_SOFT_BUSINESS_FAILURE;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason INACTIVE_DUE_TO_UNENROLL;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason NEARING_EXPIRY;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason NOT_APPLICABLE;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason ON_HOLD_DUE_TO_PENDING_AUTHORIZATION;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason ON_HOLD_DUE_TO_PENDING_CONFIRMATION;
    public static final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CardRewardStateReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason = new com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason("INACTIVE_DUE_TO_EXPIRY", 0, "INACTIVE_DUE_TO_EXPIRY");
        INACTIVE_DUE_TO_EXPIRY = cardRewardStateReason;
        com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason2 = new com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason("INACTIVE_DUE_TO_HARD_BUSINESS_FAILURE", 1, "INACTIVE_DUE_TO_HARD_BUSINESS_FAILURE");
        INACTIVE_DUE_TO_HARD_BUSINESS_FAILURE = cardRewardStateReason2;
        com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason3 = new com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason("INACTIVE_DUE_TO_SOFT_BUSINESS_FAILURE", 2, "INACTIVE_DUE_TO_SOFT_BUSINESS_FAILURE");
        INACTIVE_DUE_TO_SOFT_BUSINESS_FAILURE = cardRewardStateReason3;
        com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason4 = new com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason("NEARING_EXPIRY", 3, "NEARING_EXPIRY");
        NEARING_EXPIRY = cardRewardStateReason4;
        com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason5 = new com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason("NOT_APPLICABLE", 4, "NOT_APPLICABLE");
        NOT_APPLICABLE = cardRewardStateReason5;
        com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason6 = new com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason("ON_HOLD_DUE_TO_PENDING_AUTHORIZATION", 5, "ON_HOLD_DUE_TO_PENDING_AUTHORIZATION");
        ON_HOLD_DUE_TO_PENDING_AUTHORIZATION = cardRewardStateReason6;
        com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason7 = new com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason("ON_HOLD_DUE_TO_PENDING_CONFIRMATION", 6, "ON_HOLD_DUE_TO_PENDING_CONFIRMATION");
        ON_HOLD_DUE_TO_PENDING_CONFIRMATION = cardRewardStateReason7;
        com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason8 = new com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason("INACTIVE_DUE_TO_PENDING_ORIGINAL_USER_CHECK", 7, "INACTIVE_DUE_TO_PENDING_ORIGINAL_USER_CHECK");
        INACTIVE_DUE_TO_PENDING_ORIGINAL_USER_CHECK = cardRewardStateReason8;
        com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason9 = new com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason("INACTIVE_DUE_TO_UNENROLL", 8, "INACTIVE_DUE_TO_UNENROLL");
        INACTIVE_DUE_TO_UNENROLL = cardRewardStateReason9;
        com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason10 = new com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = cardRewardStateReason10;
        com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason[] cardRewardStateReasonArr = {cardRewardStateReason, cardRewardStateReason2, cardRewardStateReason3, cardRewardStateReason4, cardRewardStateReason5, cardRewardStateReason6, cardRewardStateReason7, cardRewardStateReason8, cardRewardStateReason9, cardRewardStateReason10};
        Camera2StreamConfigurationMap = cardRewardStateReasonArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cardRewardStateReasonArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CardRewardStateReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"INACTIVE_DUE_TO_EXPIRY", "INACTIVE_DUE_TO_HARD_BUSINESS_FAILURE", "INACTIVE_DUE_TO_SOFT_BUSINESS_FAILURE", "NEARING_EXPIRY", "NOT_APPLICABLE", "ON_HOLD_DUE_TO_PENDING_AUTHORIZATION", "ON_HOLD_DUE_TO_PENDING_CONFIRMATION", "INACTIVE_DUE_TO_PENDING_ORIGINAL_USER_CHECK", "INACTIVE_DUE_TO_UNENROLL"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CardRewardStateReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/CardRewardStateReason;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/CardRewardStateReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CardRewardStateReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason[]{com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.INACTIVE_DUE_TO_EXPIRY, com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.INACTIVE_DUE_TO_HARD_BUSINESS_FAILURE, com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.INACTIVE_DUE_TO_SOFT_BUSINESS_FAILURE, com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.NEARING_EXPIRY, com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.NOT_APPLICABLE, com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.ON_HOLD_DUE_TO_PENDING_AUTHORIZATION, com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.ON_HOLD_DUE_TO_PENDING_CONFIRMATION, com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.INACTIVE_DUE_TO_PENDING_ORIGINAL_USER_CHECK, com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.INACTIVE_DUE_TO_UNENROLL});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason cardRewardStateReason = (com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason) obj;
            return cardRewardStateReason == null ? com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.UNKNOWN__ : cardRewardStateReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.CardRewardStateReason> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
