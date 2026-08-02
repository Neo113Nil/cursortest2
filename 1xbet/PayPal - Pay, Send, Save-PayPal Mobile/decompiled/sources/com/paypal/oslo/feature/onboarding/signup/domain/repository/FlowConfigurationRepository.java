package com.paypal.oslo.feature.onboarding.signup.domain.repository;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/FlowConfigurationRepository;", "", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "loadFlow-k3UT_Go", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFlow", "getCachedFlow", "()Ljava/util/List;", "currentStep", "", "calculateProgressStatus-DJJLKbI", "(Ljava/lang/String;)I", "calculateProgressStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FlowConfigurationRepository {
    /* renamed from: calculateProgressStatus-DJJLKbI */
    int mo16273calculateProgressStatusDJJLKbI(java.lang.String currentStep);

    java.util.List<com.paypal.oslo.feature.onboarding.api.steps.domain.StepId> getCachedFlow();

    /* renamed from: loadFlow-k3UT_Go */
    java.lang.Object mo16274loadFlowk3UT_Go(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.onboarding.api.steps.domain.StepId>> continuation);
}
