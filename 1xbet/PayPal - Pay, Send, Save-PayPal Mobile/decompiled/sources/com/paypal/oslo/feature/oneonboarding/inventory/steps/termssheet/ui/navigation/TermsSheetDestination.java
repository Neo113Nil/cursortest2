package com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.navigation;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/termssheet/ui/navigation/TermsSheetDestination;", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingDestination;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/termssheet/domain/TermsSheetStepComponentConfig;", "stepComponentConfig", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/termssheet/domain/TermsSheetStepComponentConfig;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/termssheet/domain/TermsSheetStepComponentConfig;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/termssheet/domain/TermsSheetStepComponentConfig;)Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/termssheet/ui/navigation/TermsSheetDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/termssheet/domain/TermsSheetStepComponentConfig;", "getStepComponentConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TermsSheetDestination implements com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;
    private final com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.domain.TermsSheetStepComponentConfig stepComponentConfig;

    public TermsSheetDestination(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.domain.TermsSheetStepComponentConfig termsSheetStepComponentConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsSheetStepComponentConfig, "");
        this.intentId = intentId;
        this.stepComponentConfig = termsSheetStepComponentConfig;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination
    public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
        return this.intentId;
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.domain.TermsSheetStepComponentConfig getStepComponentConfig() {
        return this.stepComponentConfig;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        java.lang.String str;
        java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig> components = this.stepComponentConfig.getComponents();
        if (!(components instanceof java.util.Collection) || !components.isEmpty()) {
            java.util.Iterator<T> it = components.iterator();
            while (it.hasNext()) {
                if (((com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) it.next()) instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.ppdcterms.domain.PPDCTermsViewComponentConfig) {
                    str = "balance_and_ppdc_terms";
                    break;
                }
            }
        }
        str = "balance_terms";
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(str, com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.toProvisionUserIntent(getIntentId()), kotlin.collections.SetsKt.emptySet());
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
        com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.domain.TermsSheetStepComponentConfig termsSheetStepComponentConfig = this.stepComponentConfig;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TermsSheetDestination(intentId=");
        sb.append(intentId);
        sb.append(", stepComponentConfig=");
        sb.append(termsSheetStepComponentConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.intentId.hashCode() * 31) + this.stepComponentConfig.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.navigation.TermsSheetDestination)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.navigation.TermsSheetDestination termsSheetDestination = (com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.navigation.TermsSheetDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, termsSheetDestination.intentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.stepComponentConfig, termsSheetDestination.stepComponentConfig);
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.navigation.TermsSheetDestination copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.domain.TermsSheetStepComponentConfig stepComponentConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepComponentConfig, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.navigation.TermsSheetDestination(intentId, stepComponentConfig);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.domain.TermsSheetStepComponentConfig getStepComponentConfig() {
        return this.stepComponentConfig;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
        return this.intentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.navigation.TermsSheetDestination copy$default(com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.ui.navigation.TermsSheetDestination termsSheetDestination, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.domain.TermsSheetStepComponentConfig termsSheetStepComponentConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            intentId = termsSheetDestination.intentId;
        }
        if ((i & 2) != 0) {
            termsSheetStepComponentConfig = termsSheetDestination.stepComponentConfig;
        }
        return termsSheetDestination.copy(intentId, termsSheetStepComponentConfig);
    }
}
