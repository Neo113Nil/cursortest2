package com.paypal.oslo.feature.onboarding.postonboarding.close.domain;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "step", "Landroidx/navigation3/runtime/NavKey;", "deriveDestinationFromFlowData", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)Landroidx/navigation3/runtime/NavKey;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CloseDestinationResolverKt {
    public static final androidx.navigation3.runtime.NavKey deriveDestinationFromFlowData(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        java.util.Iterator<T> it = step.getFlowData().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData) obj).getKey(), "destination")) {
                break;
            }
        }
        com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData flowData = (com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData) obj;
        java.lang.String value = flowData != null ? flowData.getValue() : null;
        return kotlin.jvm.internal.Intrinsics.areEqual(value, "home") ? com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE : kotlin.jvm.internal.Intrinsics.areEqual(value, "transfer") ? com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE : com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE;
    }
}
