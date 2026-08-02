package com.paypal.oslo.feature.oneonboarding.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "contextualInfoById", "(Lcom/paypal/oslo/feature/oneonboarding/ui/mvi/OneOnboardingUiState;)Ljava/util/Map;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneOnboardingUiStateExtensionsKt {
    public static final java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> contextualInfoById(com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState oneOnboardingUiState) {
        com.paypal.oslo.feature.oneonboarding.domain.Flow flow;
        java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> contextualInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingUiState, "");
        com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content content = oneOnboardingUiState instanceof com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content ? (com.paypal.oslo.feature.oneonboarding.ui.mvi.OneOnboardingUiState.Content) oneOnboardingUiState : null;
        return (content == null || (flow = content.getFlow()) == null || (contextualInfo = flow.getContextualInfo()) == null) ? kotlin.collections.MapsKt.emptyMap() : contextualInfo;
    }
}
