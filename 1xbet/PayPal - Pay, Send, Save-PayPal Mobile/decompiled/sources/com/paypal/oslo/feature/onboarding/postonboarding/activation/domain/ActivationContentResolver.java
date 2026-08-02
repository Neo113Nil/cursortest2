package com.paypal.oslo.feature.onboarding.postonboarding.activation.domain;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/activation/domain/ActivationContentResolver;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "step", "", "Lcom/paypal/oslo/feature/onboarding/postonboarding/activation/domain/model/ChecklistItem;", "getActivationChecklistItems", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)Ljava/util/List;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/activation/domain/ActivationTaskConfig;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActivationContentResolver {
    public static final com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationContentResolver INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationContentResolver();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.List<com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig> Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig[]{new com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig(com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationFlowDataKeys.ADD_FI_COMPLETED, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_task_add_fi, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_task_add_fi_description, com.paypal.pds.core.Icon.Card.INSTANCE, com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics.ActivationAnalyticsConstants.INSTANCE.getADD_CARD_ITEM()), new com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig(com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationFlowDataKeys.PASSKEY_COMPLETED, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_task_passkey, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_task_passkey_description, com.paypal.pds.core.Icon.FaceScan.INSTANCE, com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics.ActivationAnalyticsConstants.INSTANCE.getSETUP_PASSKEY_ITEM()), new com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig(com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationFlowDataKeys.ADD_BANK_COMPLETED, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_task_add_bank, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_activation_intro_task_add_bank_description, com.paypal.pds.core.Icon.Bank.INSTANCE, com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics.ActivationAnalyticsConstants.INSTANCE.getLINK_BANK_ITEM())});
    public static final int $stable = 8;

    private ActivationContentResolver() {
    }

    public final java.util.List<com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem> getActivationChecklistItems(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        java.util.List<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData> flowData = step.getFlowData();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(flowData, 10)), 16));
        for (java.lang.Object obj : flowData) {
            linkedHashMap.put(((com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData) obj).getKey(), obj);
        }
        java.util.List<com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig> list = Camera2StreamConfigurationMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig activationTaskConfig : list) {
            com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData flowData2 = (com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData) linkedHashMap.get(activationTaskConfig.getFlowDataKey());
            com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem checklistItem = flowData2 != null ? new com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem(activationTaskConfig.getTitleRes(), activationTaskConfig.getDescriptionRes(), activationTaskConfig.getIcon(), java.lang.Boolean.parseBoolean(flowData2.getValue()), activationTaskConfig.getAnalyticsItem()) : null;
            if (checklistItem != null) {
                arrayList.add(checklistItem);
            }
        }
        return kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationContentResolver$getActivationChecklistItems$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Boolean.valueOf(((com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem) t2).isCompleted()), java.lang.Boolean.valueOf(((com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem) t).isCompleted()));
            }
        });
    }
}
