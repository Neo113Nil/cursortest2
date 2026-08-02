package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityHelpCenterOptionType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_REQUEST_REFUND, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_GET_ANSWERS, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_REPORT_PROBLEM, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CONTACT_SELLER, "LEARN_MORE_ABOUT_REFUND", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CANCEL_PAYMENT, "CHAT_ASSISTANCE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CONTACT_SYNCHRONY, "BUYER_PROTECTION", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityHelpCenterOptionType {
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType BUYER_PROTECTION;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType CANCEL_PAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType CHAT_ASSISTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType CONTACT_SELLER;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType CONTACT_SYNCHRONY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType GET_ANSWERS;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType LEARN_MORE_ABOUT_REFUND;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType REPORT_PROBLEM;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType REQUEST_REFUND;
    public static final com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType[] getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private ActivityHelpCenterOptionType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType activityHelpCenterOptionType = new com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_REQUEST_REFUND, 0, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_REQUEST_REFUND);
        REQUEST_REFUND = activityHelpCenterOptionType;
        com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType activityHelpCenterOptionType2 = new com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_GET_ANSWERS, 1, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_GET_ANSWERS);
        GET_ANSWERS = activityHelpCenterOptionType2;
        com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType activityHelpCenterOptionType3 = new com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_REPORT_PROBLEM, 2, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_REPORT_PROBLEM);
        REPORT_PROBLEM = activityHelpCenterOptionType3;
        com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType activityHelpCenterOptionType4 = new com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CONTACT_SELLER, 3, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CONTACT_SELLER);
        CONTACT_SELLER = activityHelpCenterOptionType4;
        com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType activityHelpCenterOptionType5 = new com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType("LEARN_MORE_ABOUT_REFUND", 4, "LEARN_MORE_ABOUT_REFUND");
        LEARN_MORE_ABOUT_REFUND = activityHelpCenterOptionType5;
        com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType activityHelpCenterOptionType6 = new com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CANCEL_PAYMENT, 5, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CANCEL_PAYMENT);
        CANCEL_PAYMENT = activityHelpCenterOptionType6;
        com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType activityHelpCenterOptionType7 = new com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType("CHAT_ASSISTANCE", 6, "CHAT_ASSISTANCE");
        CHAT_ASSISTANCE = activityHelpCenterOptionType7;
        com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType activityHelpCenterOptionType8 = new com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CONTACT_SYNCHRONY, 7, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CONTACT_SYNCHRONY);
        CONTACT_SYNCHRONY = activityHelpCenterOptionType8;
        com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType activityHelpCenterOptionType9 = new com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType("BUYER_PROTECTION", 8, "BUYER_PROTECTION");
        BUYER_PROTECTION = activityHelpCenterOptionType9;
        com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType activityHelpCenterOptionType10 = new com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = activityHelpCenterOptionType10;
        com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType[] activityHelpCenterOptionTypeArr = {activityHelpCenterOptionType, activityHelpCenterOptionType2, activityHelpCenterOptionType3, activityHelpCenterOptionType4, activityHelpCenterOptionType5, activityHelpCenterOptionType6, activityHelpCenterOptionType7, activityHelpCenterOptionType8, activityHelpCenterOptionType9, activityHelpCenterOptionType10};
        getHighSpeedVideoSizes = activityHelpCenterOptionTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(activityHelpCenterOptionTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("ActivityHelpCenterOptionType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_REQUEST_REFUND, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_GET_ANSWERS, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_REPORT_PROBLEM, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CONTACT_SELLER, "LEARN_MORE_ABOUT_REFUND", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CANCEL_PAYMENT, "CHAT_ASSISTANCE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CONTACT_SYNCHRONY, "BUYER_PROTECTION"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivityHelpCenterOptionType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityHelpCenterOptionType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/ActivityHelpCenterOptionType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ActivityHelpCenterOptionType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType[]{com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.REQUEST_REFUND, com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.GET_ANSWERS, com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.REPORT_PROBLEM, com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.CONTACT_SELLER, com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.LEARN_MORE_ABOUT_REFUND, com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.CANCEL_PAYMENT, com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.CHAT_ASSISTANCE, com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.CONTACT_SYNCHRONY, com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.BUYER_PROTECTION});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType activityHelpCenterOptionType = (com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType) obj;
            return activityHelpCenterOptionType == null ? com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.UNKNOWN__ : activityHelpCenterOptionType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.ActivityHelpCenterOptionType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
