package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanActivityType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "CAPTURE", "CREDIT_BALANCE_REFUND", "FEE", "FEE_WAIVER", "FEE_WAIVER_REVERSAL", "GOODWILL_CREDIT", "GOODWILL_CREDIT_REVERSAL", "INTEREST", "INTEREST_REFUND", "INTEREST_REFUND_REVERSAL", "INTEREST_WAIVER", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, "REFUND_REVERSAL", "REPAYMENT", "REPAYMENT_REVERSAL", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BNPLServicingPlanActivityType {
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType CAPTURE;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType CREDIT_BALANCE_REFUND;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType FEE;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType FEE_WAIVER;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType FEE_WAIVER_REVERSAL;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType GOODWILL_CREDIT;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType GOODWILL_CREDIT_REVERSAL;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType INTEREST;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType INTEREST_REFUND;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType INTEREST_REFUND_REVERSAL;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType INTEREST_WAIVER;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType REFUND;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType REFUND_REVERSAL;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType REPAYMENT;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType REPAYMENT_REVERSAL;
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private BNPLServicingPlanActivityType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("CAPTURE", 0, "CAPTURE");
        CAPTURE = bNPLServicingPlanActivityType;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType2 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("CREDIT_BALANCE_REFUND", 1, "CREDIT_BALANCE_REFUND");
        CREDIT_BALANCE_REFUND = bNPLServicingPlanActivityType2;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType3 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("FEE", 2, "FEE");
        FEE = bNPLServicingPlanActivityType3;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType4 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("FEE_WAIVER", 3, "FEE_WAIVER");
        FEE_WAIVER = bNPLServicingPlanActivityType4;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType5 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("FEE_WAIVER_REVERSAL", 4, "FEE_WAIVER_REVERSAL");
        FEE_WAIVER_REVERSAL = bNPLServicingPlanActivityType5;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType6 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("GOODWILL_CREDIT", 5, "GOODWILL_CREDIT");
        GOODWILL_CREDIT = bNPLServicingPlanActivityType6;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType7 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("GOODWILL_CREDIT_REVERSAL", 6, "GOODWILL_CREDIT_REVERSAL");
        GOODWILL_CREDIT_REVERSAL = bNPLServicingPlanActivityType7;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType8 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("INTEREST", 7, "INTEREST");
        INTEREST = bNPLServicingPlanActivityType8;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType9 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("INTEREST_REFUND", 8, "INTEREST_REFUND");
        INTEREST_REFUND = bNPLServicingPlanActivityType9;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType10 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("INTEREST_REFUND_REVERSAL", 9, "INTEREST_REFUND_REVERSAL");
        INTEREST_REFUND_REVERSAL = bNPLServicingPlanActivityType10;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType11 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("INTEREST_WAIVER", 10, "INTEREST_WAIVER");
        INTEREST_WAIVER = bNPLServicingPlanActivityType11;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType12 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, 11, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND);
        REFUND = bNPLServicingPlanActivityType12;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType13 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("REFUND_REVERSAL", 12, "REFUND_REVERSAL");
        REFUND_REVERSAL = bNPLServicingPlanActivityType13;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType14 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("REPAYMENT", 13, "REPAYMENT");
        REPAYMENT = bNPLServicingPlanActivityType14;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType15 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("REPAYMENT_REVERSAL", 14, "REPAYMENT_REVERSAL");
        REPAYMENT_REVERSAL = bNPLServicingPlanActivityType15;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType16 = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType("UNKNOWN__", 15, "UNKNOWN__");
        UNKNOWN__ = bNPLServicingPlanActivityType16;
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType[] bNPLServicingPlanActivityTypeArr = {bNPLServicingPlanActivityType, bNPLServicingPlanActivityType2, bNPLServicingPlanActivityType3, bNPLServicingPlanActivityType4, bNPLServicingPlanActivityType5, bNPLServicingPlanActivityType6, bNPLServicingPlanActivityType7, bNPLServicingPlanActivityType8, bNPLServicingPlanActivityType9, bNPLServicingPlanActivityType10, bNPLServicingPlanActivityType11, bNPLServicingPlanActivityType12, bNPLServicingPlanActivityType13, bNPLServicingPlanActivityType14, bNPLServicingPlanActivityType15, bNPLServicingPlanActivityType16};
        Camera2StreamConfigurationMap = bNPLServicingPlanActivityTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(bNPLServicingPlanActivityTypeArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("BNPLServicingPlanActivityType", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"CAPTURE", "CREDIT_BALANCE_REFUND", "FEE", "FEE_WAIVER", "FEE_WAIVER_REVERSAL", "GOODWILL_CREDIT", "GOODWILL_CREDIT_REVERSAL", "INTEREST", "INTEREST_REFUND", "INTEREST_REFUND_REVERSAL", "INTEREST_WAIVER", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.REFUND, "REFUND_REVERSAL", "REPAYMENT", "REPAYMENT_REVERSAL"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanActivityType$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanActivityType;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanActivityType;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingPlanActivityType;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType[]{com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.CAPTURE, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.CREDIT_BALANCE_REFUND, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.FEE, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.FEE_WAIVER, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.FEE_WAIVER_REVERSAL, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.GOODWILL_CREDIT, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.GOODWILL_CREDIT_REVERSAL, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.INTEREST, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.INTEREST_REFUND, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.INTEREST_REFUND_REVERSAL, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.INTEREST_WAIVER, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.REFUND, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.REFUND_REVERSAL, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.REPAYMENT, com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.REPAYMENT_REVERSAL});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType bNPLServicingPlanActivityType = (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType) obj;
            return bNPLServicingPlanActivityType == null ? com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.UNKNOWN__ : bNPLServicingPlanActivityType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.BNPLServicingPlanActivityType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
