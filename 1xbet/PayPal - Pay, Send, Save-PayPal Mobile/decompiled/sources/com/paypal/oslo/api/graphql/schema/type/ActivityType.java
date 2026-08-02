package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.MONEY_REQUEST, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER, "PAYOUT", "BILLING_AGREEMENT", "INVOICE", "SUBSCRIPTION", "RECURRING_PROFILE", "CHECK_CAPTURE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.CRYPTO_PAYMENT, "CRYPTO_RECURRING_PROFILE", "PACKAGE", "REWARDS", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityType {
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType BILLING_AGREEMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType CHECK_CAPTURE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType CRYPTO_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType CRYPTO_RECURRING_PROFILE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType INVOICE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType MONEY_REQUEST;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType ORDER;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType PACKAGE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType PAYOUT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType RECURRING_PROFILE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType REWARDS;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType SUBSCRIPTION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivityType[] getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ActivityType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType = new com.paypal.oslo.api.graphql.schema.type.ActivityType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, 0, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT);
        PAYMENT = activityType;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType2 = new com.paypal.oslo.api.graphql.schema.type.ActivityType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.MONEY_REQUEST, 1, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.MONEY_REQUEST);
        MONEY_REQUEST = activityType2;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType3 = new com.paypal.oslo.api.graphql.schema.type.ActivityType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER, 2, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER);
        ORDER = activityType3;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType4 = new com.paypal.oslo.api.graphql.schema.type.ActivityType("PAYOUT", 3, "PAYOUT");
        PAYOUT = activityType4;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType5 = new com.paypal.oslo.api.graphql.schema.type.ActivityType("BILLING_AGREEMENT", 4, "BILLING_AGREEMENT");
        BILLING_AGREEMENT = activityType5;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType6 = new com.paypal.oslo.api.graphql.schema.type.ActivityType("INVOICE", 5, "INVOICE");
        INVOICE = activityType6;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType7 = new com.paypal.oslo.api.graphql.schema.type.ActivityType("SUBSCRIPTION", 6, "SUBSCRIPTION");
        SUBSCRIPTION = activityType7;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType8 = new com.paypal.oslo.api.graphql.schema.type.ActivityType("RECURRING_PROFILE", 7, "RECURRING_PROFILE");
        RECURRING_PROFILE = activityType8;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType9 = new com.paypal.oslo.api.graphql.schema.type.ActivityType("CHECK_CAPTURE", 8, "CHECK_CAPTURE");
        CHECK_CAPTURE = activityType9;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType10 = new com.paypal.oslo.api.graphql.schema.type.ActivityType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.CRYPTO_PAYMENT, 9, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.CRYPTO_PAYMENT);
        CRYPTO_PAYMENT = activityType10;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType11 = new com.paypal.oslo.api.graphql.schema.type.ActivityType("CRYPTO_RECURRING_PROFILE", 10, "CRYPTO_RECURRING_PROFILE");
        CRYPTO_RECURRING_PROFILE = activityType11;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType12 = new com.paypal.oslo.api.graphql.schema.type.ActivityType("PACKAGE", 11, "PACKAGE");
        PACKAGE = activityType12;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType13 = new com.paypal.oslo.api.graphql.schema.type.ActivityType("REWARDS", 12, "REWARDS");
        REWARDS = activityType13;
        com.paypal.oslo.api.graphql.schema.type.ActivityType activityType14 = new com.paypal.oslo.api.graphql.schema.type.ActivityType("UNKNOWN__", 13, "UNKNOWN__");
        UNKNOWN__ = activityType14;
        com.paypal.oslo.api.graphql.schema.type.ActivityType[] activityTypeArr = {activityType, activityType2, activityType3, activityType4, activityType5, activityType6, activityType7, activityType8, activityType9, activityType10, activityType11, activityType12, activityType13, activityType14};
        getHighSpeedVideoFpsRangesFor = activityTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(activityTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ActivityType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ActivityType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.MONEY_REQUEST, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER, "PAYOUT", "BILLING_AGREEMENT", "INVOICE", "SUBSCRIPTION", "RECURRING_PROFILE", "CHECK_CAPTURE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.CRYPTO_PAYMENT, "CRYPTO_RECURRING_PROFILE", "PACKAGE", "REWARDS"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ActivityType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ActivityType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityType[]{com.paypal.oslo.api.graphql.schema.type.ActivityType.PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityType.MONEY_REQUEST, com.paypal.oslo.api.graphql.schema.type.ActivityType.ORDER, com.paypal.oslo.api.graphql.schema.type.ActivityType.PAYOUT, com.paypal.oslo.api.graphql.schema.type.ActivityType.BILLING_AGREEMENT, com.paypal.oslo.api.graphql.schema.type.ActivityType.INVOICE, com.paypal.oslo.api.graphql.schema.type.ActivityType.SUBSCRIPTION, com.paypal.oslo.api.graphql.schema.type.ActivityType.RECURRING_PROFILE, com.paypal.oslo.api.graphql.schema.type.ActivityType.CHECK_CAPTURE, com.paypal.oslo.api.graphql.schema.type.ActivityType.CRYPTO_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityType.CRYPTO_RECURRING_PROFILE, com.paypal.oslo.api.graphql.schema.type.ActivityType.PACKAGE, com.paypal.oslo.api.graphql.schema.type.ActivityType.REWARDS});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ActivityType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ActivityType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ActivityType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ActivityType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ActivityType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ActivityType activityType = (com.paypal.oslo.api.graphql.schema.type.ActivityType) obj;
            return activityType == null ? com.paypal.oslo.api.graphql.schema.type.ActivityType.UNKNOWN__ : activityType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ActivityType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ActivityType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
