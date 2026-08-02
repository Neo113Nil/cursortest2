package com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanTag;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "BANKRUPTCY", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, "CHARGED_OFF", "DECEASED", "DELINQUENT", "FRAUD", "HARDSHIP", "MATURED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER, "PAID_OFF", "PAST_DUE", "PENDING_FRAUD", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanTag {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag BANKRUPTCY;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag CANCELED;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag CHARGED_OFF;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag DECEASED;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag DELINQUENT;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag FRAUD;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag HARDSHIP;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag MATURED;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag ORDER;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag PAID_OFF;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag PAST_DUE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag PENDING_FRAUD;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag[] getHighSpeedVideoSizes;

    private PlanTag(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag("BANKRUPTCY", 0);
        BANKRUPTCY = planTag;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag2 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCELED_STATUS, 1);
        CANCELED = planTag2;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag3 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag("CHARGED_OFF", 2);
        CHARGED_OFF = planTag3;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag4 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag("DECEASED", 3);
        DECEASED = planTag4;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag5 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag("DELINQUENT", 4);
        DELINQUENT = planTag5;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag6 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag("FRAUD", 5);
        FRAUD = planTag6;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag7 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag("HARDSHIP", 6);
        HARDSHIP = planTag7;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag8 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag("MATURED", 7);
        MATURED = planTag8;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag9 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER, 8);
        ORDER = planTag9;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag10 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag("PAID_OFF", 9);
        PAID_OFF = planTag10;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag11 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag("PAST_DUE", 10);
        PAST_DUE = planTag11;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag12 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag("PENDING_FRAUD", 11);
        PENDING_FRAUD = planTag12;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag13 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag("UNKNOWN", 12);
        UNKNOWN = planTag13;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag[] planTagArr = {planTag, planTag2, planTag3, planTag4, planTag5, planTag6, planTag7, planTag8, planTag9, planTag10, planTag11, planTag12, planTag13};
        getHighSpeedVideoSizes = planTagArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(planTagArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanTag$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanTag;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlanTag;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag planTag = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag) obj;
            return planTag == null ? com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.UNKNOWN : planTag;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlanTag> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
