package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseOfferStatusReason;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "ACCOUNT_PAST_DUE", "ACCOUNT_STATUS_NOT_NORMAL", "CUSTOMER_DECLINE", "PENDING_CUSTOMER_ACCEPTANCE", "PENDING_INCOME_VERIFICATION", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RevolvingCreditLineIncreaseOfferStatusReason {
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason ACCOUNT_PAST_DUE;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason ACCOUNT_STATUS_NOT_NORMAL;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason CUSTOMER_DECLINE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason PENDING_CUSTOMER_ACCEPTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason PENDING_INCOME_VERIFICATION;
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private RevolvingCreditLineIncreaseOfferStatusReason(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason revolvingCreditLineIncreaseOfferStatusReason = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason("ACCOUNT_PAST_DUE", 0, "ACCOUNT_PAST_DUE");
        ACCOUNT_PAST_DUE = revolvingCreditLineIncreaseOfferStatusReason;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason revolvingCreditLineIncreaseOfferStatusReason2 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason("ACCOUNT_STATUS_NOT_NORMAL", 1, "ACCOUNT_STATUS_NOT_NORMAL");
        ACCOUNT_STATUS_NOT_NORMAL = revolvingCreditLineIncreaseOfferStatusReason2;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason revolvingCreditLineIncreaseOfferStatusReason3 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason("CUSTOMER_DECLINE", 2, "CUSTOMER_DECLINE");
        CUSTOMER_DECLINE = revolvingCreditLineIncreaseOfferStatusReason3;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason revolvingCreditLineIncreaseOfferStatusReason4 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason("PENDING_CUSTOMER_ACCEPTANCE", 3, "PENDING_CUSTOMER_ACCEPTANCE");
        PENDING_CUSTOMER_ACCEPTANCE = revolvingCreditLineIncreaseOfferStatusReason4;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason revolvingCreditLineIncreaseOfferStatusReason5 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason("PENDING_INCOME_VERIFICATION", 4, "PENDING_INCOME_VERIFICATION");
        PENDING_INCOME_VERIFICATION = revolvingCreditLineIncreaseOfferStatusReason5;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason revolvingCreditLineIncreaseOfferStatusReason6 = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason("UNKNOWN__", 5, "UNKNOWN__");
        UNKNOWN__ = revolvingCreditLineIncreaseOfferStatusReason6;
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason[] revolvingCreditLineIncreaseOfferStatusReasonArr = {revolvingCreditLineIncreaseOfferStatusReason, revolvingCreditLineIncreaseOfferStatusReason2, revolvingCreditLineIncreaseOfferStatusReason3, revolvingCreditLineIncreaseOfferStatusReason4, revolvingCreditLineIncreaseOfferStatusReason5, revolvingCreditLineIncreaseOfferStatusReason6};
        getHighResolutionOutputSizeshNQ4ISI = revolvingCreditLineIncreaseOfferStatusReasonArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(revolvingCreditLineIncreaseOfferStatusReasonArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("RevolvingCreditLineIncreaseOfferStatusReason", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"ACCOUNT_PAST_DUE", "ACCOUNT_STATUS_NOT_NORMAL", "CUSTOMER_DECLINE", "PENDING_CUSTOMER_ACCEPTANCE", "PENDING_INCOME_VERIFICATION"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseOfferStatusReason$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseOfferStatusReason;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseOfferStatusReason;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditLineIncreaseOfferStatusReason;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason[]{com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.ACCOUNT_PAST_DUE, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.ACCOUNT_STATUS_NOT_NORMAL, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.CUSTOMER_DECLINE, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.PENDING_CUSTOMER_ACCEPTANCE, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.PENDING_INCOME_VERIFICATION});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason revolvingCreditLineIncreaseOfferStatusReason = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason) obj;
            return revolvingCreditLineIncreaseOfferStatusReason == null ? com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.UNKNOWN__ : revolvingCreditLineIncreaseOfferStatusReason;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditLineIncreaseOfferStatusReason> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
