package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanTags;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "BANKRUPTCY", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, "CHARGED_OFF", "DECEASED", "DELINQUENT", "FRAUD", "HARDSHIP", "MATURED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER, "PAID_OFF", "PAST_DUE", "PENDING_FRAUD", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BNPLServicingPlanTags {
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags BANKRUPTCY;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags CANCELED;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags CHARGED_OFF;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags DECEASED;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags DELINQUENT;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags FRAUD;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags HARDSHIP;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags MATURED;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags ORDER;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags PAID_OFF;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags PAST_DUE;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags PENDING_FRAUD;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BNPLServicingPlanTags(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags("BANKRUPTCY", 0, "BANKRUPTCY");
        BANKRUPTCY = bNPLServicingPlanTags;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags2 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, 1, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS);
        CANCELED = bNPLServicingPlanTags2;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags3 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags("CHARGED_OFF", 2, "CHARGED_OFF");
        CHARGED_OFF = bNPLServicingPlanTags3;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags4 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags("DECEASED", 3, "DECEASED");
        DECEASED = bNPLServicingPlanTags4;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags5 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags("DELINQUENT", 4, "DELINQUENT");
        DELINQUENT = bNPLServicingPlanTags5;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags6 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags("FRAUD", 5, "FRAUD");
        FRAUD = bNPLServicingPlanTags6;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags7 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags("HARDSHIP", 6, "HARDSHIP");
        HARDSHIP = bNPLServicingPlanTags7;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags8 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags("MATURED", 7, "MATURED");
        MATURED = bNPLServicingPlanTags8;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags9 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER, 8, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER);
        ORDER = bNPLServicingPlanTags9;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags10 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags("PAID_OFF", 9, "PAID_OFF");
        PAID_OFF = bNPLServicingPlanTags10;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags11 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags("PAST_DUE", 10, "PAST_DUE");
        PAST_DUE = bNPLServicingPlanTags11;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags12 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags("PENDING_FRAUD", 11, "PENDING_FRAUD");
        PENDING_FRAUD = bNPLServicingPlanTags12;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags13 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags("UNKNOWN__", 12, "UNKNOWN__");
        UNKNOWN__ = bNPLServicingPlanTags13;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags[] bNPLServicingPlanTagsArr = {bNPLServicingPlanTags, bNPLServicingPlanTags2, bNPLServicingPlanTags3, bNPLServicingPlanTags4, bNPLServicingPlanTags5, bNPLServicingPlanTags6, bNPLServicingPlanTags7, bNPLServicingPlanTags8, bNPLServicingPlanTags9, bNPLServicingPlanTags10, bNPLServicingPlanTags11, bNPLServicingPlanTags12, bNPLServicingPlanTags13};
        getHighSpeedVideoFpsRanges = bNPLServicingPlanTagsArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(bNPLServicingPlanTagsArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BNPLServicingPlanTags", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"BANKRUPTCY", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, "CHARGED_OFF", "DECEASED", "DELINQUENT", "FRAUD", "HARDSHIP", "MATURED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER, "PAID_OFF", "PAST_DUE", "PENDING_FRAUD"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanTags$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanTags;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanTags;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanTags;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags[]{com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.BANKRUPTCY, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.CANCELED, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.CHARGED_OFF, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.DECEASED, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.DELINQUENT, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.FRAUD, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.HARDSHIP, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.MATURED, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.ORDER, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.PAID_OFF, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.PAST_DUE, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.PENDING_FRAUD});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags bNPLServicingPlanTags = (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags) obj;
            return bNPLServicingPlanTags == null ? com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.UNKNOWN__ : bNPLServicingPlanTags;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanTags> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
