package com.paypal.oslo.feature.smartroute.ui.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;", "", "shouldShowSavingsOnboarding", "(Lcom/paypal/oslo/feature/smartroute/ui/model/DistributionScreenState;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DistributionUiModelsKt {
    public static final boolean shouldShowSavingsOnboarding(com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionScreenState, "");
        boolean z = distributionScreenState.getSavedConfiguration().getSavingsEligibilityStatus() == com.paypal.oslo.feature.smartroute.domain.model.TargetEligibilityStatus.ELIGIBLE;
        boolean isEnabled = distributionScreenState.getAutoReload().isEnabled();
        java.util.Iterator<T> it = distributionScreenState.getAccounts().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) obj).getId(), "savings")) {
                break;
            }
        }
        com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi distributionAccountUi = (com.paypal.oslo.feature.smartroute.ui.model.DistributionAccountUi) obj;
        return z && (isEnabled || (((distributionAccountUi != null ? distributionAccountUi.getPercentage() : 0.0f) > 0.0f ? 1 : ((distributionAccountUi != null ? distributionAccountUi.getPercentage() : 0.0f) == 0.0f ? 0 : -1)) > 0)) && (distributionScreenState.getStatus() == com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.INACTIVE);
    }
}
