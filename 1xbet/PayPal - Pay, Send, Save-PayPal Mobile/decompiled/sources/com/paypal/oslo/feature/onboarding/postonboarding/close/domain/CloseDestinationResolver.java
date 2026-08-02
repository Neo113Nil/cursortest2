package com.paypal.oslo.feature.onboarding.postonboarding.close.domain;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/close/domain/CloseDestinationResolver;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;", "step", "Landroidx/navigation3/runtime/NavKey;", "resolve", "(Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/Step;)Landroidx/navigation3/runtime/NavKey;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CloseDestinationResolver {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.onboarding.postonboarding.close.domain.CloseDestinationResolver INSTANCE = new com.paypal.oslo.feature.onboarding.postonboarding.close.domain.CloseDestinationResolver();

    private CloseDestinationResolver() {
    }

    public final androidx.navigation3.runtime.NavKey resolve(com.paypal.oslo.feature.onboarding.steps.nav.domain.Step step) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        return com.paypal.oslo.feature.onboarding.postonboarding.close.domain.CloseDestinationResolverKt.deriveDestinationFromFlowData(step);
    }
}
