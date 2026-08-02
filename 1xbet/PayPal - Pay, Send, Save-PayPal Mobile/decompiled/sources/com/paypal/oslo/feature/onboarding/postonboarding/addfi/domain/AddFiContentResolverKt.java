package com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/domain/FlowContextManager;", "flowContextManager", "Lcom/paypal/oslo/feature/onboarding/postonboarding/addfi/domain/model/AddFiContent;", "getAddFiContent", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/domain/FlowContextManager;)Lcom/paypal/oslo/feature/onboarding/postonboarding/addfi/domain/model/AddFiContent;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddFiContentResolverKt {
    public static final com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain.model.AddFiContent getAddFiContent(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager flowContextManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContextManager, "");
        java.lang.String str = flowContextManager.get(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey.SELECTED_INTENT);
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1309148525) {
                if (hashCode != 109294) {
                    if (hashCode == 3529462 && str.equals(com.paypal.oslo.feature.onboarding.postonboarding.intent.domain.IntentFlowDataValues.SHOP)) {
                        return new com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain.model.AddFiContent(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_add_fi_shop_title, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_add_fi_shop_description, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_add_fi_shop_button);
                    }
                } else if (str.equals(com.paypal.oslo.feature.onboarding.postonboarding.intent.domain.IntentFlowDataValues.P2P)) {
                    return new com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain.model.AddFiContent(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_add_fi_p2p_title, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_add_fi_p2p_description, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_add_fi_p2p_button);
                }
            } else if (str.equals(com.paypal.oslo.feature.onboarding.postonboarding.intent.domain.IntentFlowDataValues.EXPLORE)) {
                return new com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain.model.AddFiContent(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_add_fi_explore_title, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_add_fi_explore_description, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_add_fi_explore_button);
            }
        }
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.onboarding.LoggerKt.log;
        java.lang.String str2 = flowContextManager.get(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey.SELECTED_INTENT);
        if (str2 == null) {
            str2 = "null";
        }
        com.paypal.android.logger.Logger.w$default(logger, "Unknown or missing intent for Add FI content - defaulting to EXPLORE", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent", str2)), null, 4, null);
        return new com.paypal.oslo.feature.onboarding.postonboarding.addfi.domain.model.AddFiContent(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_add_fi_explore_title, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_add_fi_explore_description, com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_add_fi_explore_button);
    }
}
