package com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "step", "Lcom/paypal/oslo/feature/onboarding/postonboarding/celebration/domain/model/CelebrationContent;", "getCelebrationContent", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)Lcom/paypal/oslo/feature/onboarding/postonboarding/celebration/domain/model/CelebrationContent;", "getCelebrationHalfSheetContent"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CelebrationContentResolverKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r0.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.NFC_CELEBRATION) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a9, code lost:
    
        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_explore_title, null, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_explore_button, null, 10, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        if (r0.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.EXPLORE_INTENT_CELEBRATION) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent getCelebrationContent(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
        java.lang.Object obj;
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
        if (value != null) {
            switch (value.hashCode()) {
                case -670692621:
                    break;
                case 134039256:
                    if (value.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.P2P_INTENT_CELEBRATION)) {
                        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_p2p_title, null, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_p2p_button, null, 10, null);
                    }
                    break;
                case 1329066384:
                    if (value.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.SHOP_INTENT_CELEBRATION)) {
                        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_shop_title, null, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_shop_button, null, 10, null);
                    }
                    break;
                case 1474824697:
                    if (value.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.OSLO_ACTIVATION_CELEBRATION)) {
                        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_activation_title, null, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_activation_button, null, 10, null);
                    }
                    break;
                case 1902301718:
                    break;
            }
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.onboarding.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, step.m16522getFlowId8NcbBzM());
        pairArr[1] = kotlin.TuplesKt.to("stepId", step.m16524getStepIdeVUBM90());
        if (value == null) {
            value = "null";
        }
        pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataKeys.VARIATION, value);
        com.paypal.android.logger.Logger.e$default(logger, "Unknown celebration variation", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
        return null;
    }

    public static final com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent getCelebrationHalfSheetContent(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
        java.lang.Object obj;
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
        if (value != null) {
            switch (value.hashCode()) {
                case -670692621:
                    if (value.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.EXPLORE_INTENT_CELEBRATION)) {
                        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_explore_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_explore_description), com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_explore_button, com.paypal.oslo.feature.onboarding.postonboarding.common.OnboardingImageUrls.CELEBRATION_EXPLORE_MODAL);
                    }
                    break;
                case 134039256:
                    if (value.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.P2P_INTENT_CELEBRATION)) {
                        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_p2p_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_p2p_description), com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_p2p_button, com.paypal.oslo.feature.onboarding.postonboarding.common.OnboardingImageUrls.CELEBRATION_P2P_MODAL);
                    }
                    break;
                case 1329066384:
                    if (value.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.SHOP_INTENT_CELEBRATION)) {
                        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_shop_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_shop_description), com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_shop_button, com.paypal.oslo.feature.onboarding.postonboarding.common.OnboardingImageUrls.CELEBRATION_SHOP_MODAL);
                    }
                    break;
                case 1474824697:
                    if (value.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.OSLO_ACTIVATION_CELEBRATION)) {
                        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_activation_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_activation_description), com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_activation_button, com.paypal.oslo.feature.onboarding.postonboarding.common.OnboardingImageUrls.CELEBRATION_COMMS_MODAL);
                    }
                    break;
                case 1902301718:
                    if (value.equals(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataValues.NFC_CELEBRATION)) {
                        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.model.CelebrationContent(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_explore_title, java.lang.Integer.valueOf(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_explore_description), com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_celebration_explore_button, com.paypal.oslo.feature.onboarding.postonboarding.common.OnboardingImageUrls.CELEBRATION_NFC_MODAL);
                    }
                    break;
            }
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.onboarding.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, step.m16522getFlowId8NcbBzM());
        pairArr[1] = kotlin.TuplesKt.to("stepId", step.m16524getStepIdeVUBM90());
        if (value == null) {
            value = "null";
        }
        pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.onboarding.postonboarding.celebration.domain.CelebrationFlowDataKeys.VARIATION, value);
        com.paypal.android.logger.Logger.e$default(logger, "Unknown celebration half sheet variation", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
        return null;
    }
}
