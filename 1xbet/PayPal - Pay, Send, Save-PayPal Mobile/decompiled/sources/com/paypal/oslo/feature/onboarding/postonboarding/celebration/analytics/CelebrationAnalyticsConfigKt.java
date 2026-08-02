package com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "step", "Lcom/paypal/oslo/feature/onboarding/postonboarding/celebration/analytics/CelebrationAnalyticsConfig;", "getCelebrationAnalyticsConfig", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)Lcom/paypal/oslo/feature/onboarding/postonboarding/celebration/analytics/CelebrationAnalyticsConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CelebrationAnalyticsConfigKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig getCelebrationAnalyticsConfig(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        java.util.Iterator<T> it = step.getFlowData().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData) obj).getKey(), com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataKeys.VARIATION)) {
                break;
            }
        }
        com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData flowData = (com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData) obj;
        java.lang.String value = flowData != null ? flowData.getValue() : null;
        java.util.Iterator<T> it2 = step.getFlowData().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData) obj2).getKey(), "COMMS_TIER")) {
                break;
            }
        }
        com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData flowData2 = (com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData) obj2;
        java.lang.String value2 = flowData2 != null ? flowData2.getValue() : null;
        if (value != null) {
            switch (value.hashCode()) {
                case -670692621:
                    if (value.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.EXPLORE_INTENT_CELEBRATION)) {
                        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig("explore_celebration", "explore_celebration", com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConstants.FINISH_SETTING_UP_FEATURE, com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConstants.INSTANCE.getCLOSE_ITEM());
                    }
                    break;
                case 134039256:
                    if (value.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.P2P_INTENT_CELEBRATION)) {
                        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig("transfer_celebration", "transfer_celebration", "transfer_money", com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConstants.INSTANCE.getDISMISS_ITEM());
                    }
                    break;
                case 1329066384:
                    if (value.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.SHOP_INTENT_CELEBRATION)) {
                        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig("shop_celebration", "shop_celebration", "shop_and_pay", com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConstants.INSTANCE.getDISMISS_ITEM());
                    }
                    break;
                case 1474824697:
                    if (value.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.OSLO_ACTIVATION_CELEBRATION)) {
                        if (value2 == null) {
                            value2 = "unknown";
                        }
                        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig(com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConstants.COMMS_CELEBRATION_SCREEN_ID, com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConstants.COMMS_CELEBRATION_ACTION, value2, com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConstants.INSTANCE.getDISMISS_ITEM());
                    }
                    break;
                case 1902301718:
                    if (value.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.NFC_CELEBRATION)) {
                        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig("nfc_celebration", "nfc_celebration", "nfc", com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConstants.INSTANCE.getDISMISS_ITEM());
                    }
                    break;
            }
        }
        return null;
    }
}
