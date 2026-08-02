package com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansPresentmentCategory;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "HISTORY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlansPresentmentCategory {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory ACTIVE;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory HISTORY;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory[] getHighSpeedVideoFpsRanges;

    private PlansPresentmentCategory(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory plansPresentmentCategory = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = plansPresentmentCategory;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory plansPresentmentCategory2 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory("HISTORY", 1);
        HISTORY = plansPresentmentCategory2;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory plansPresentmentCategory3 = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory("UNKNOWN", 2);
        UNKNOWN = plansPresentmentCategory3;
        com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory[] plansPresentmentCategoryArr = {plansPresentmentCategory, plansPresentmentCategory2, plansPresentmentCategory3};
        getHighSpeedVideoFpsRanges = plansPresentmentCategoryArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(plansPresentmentCategoryArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansPresentmentCategory$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansPresentmentCategory;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansPresentmentCategory;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory plansPresentmentCategory = (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory) obj;
            return plansPresentmentCategory == null ? com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory.UNKNOWN : plansPresentmentCategory;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansPresentmentCategory> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
