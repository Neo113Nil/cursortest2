package com.paypal.oslo.feature.onboarding.api.steps.nav.domain;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u00020\u0000H&¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\b\t\n\u000b\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "", "sanitize", "()Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "", "getPrefetchable", "()Z", "prefetchable", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Close;", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Fail;", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Initial;", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Next;", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Skip;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface Transition {
    boolean getPrefetchable();

    com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition sanitize();
}
