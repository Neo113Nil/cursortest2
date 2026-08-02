package com.paypal.oslo.feature.onboarding.signup.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/usecase/PreloadSignupFlowUseCase;", "", "Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/FlowConfigurationRepository;", "flowConfigurationRepository", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/BackstackFlowStepService;", "flowStepService", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/FlowConfigurationRepository;Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/BackstackFlowStepService;)V", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "", "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/StepId;", "invoke-k3UT_Go", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/onboarding/signup/domain/repository/FlowConfigurationRepository;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/onboarding/steps/nav/domain/BackstackFlowStepService;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PreloadSignupFlowUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PreloadSignupFlowUseCase(com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository flowConfigurationRepository, com.paypal.oslo.feature.onboarding.steps.nav.domain.BackstackFlowStepService backstackFlowStepService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowConfigurationRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backstackFlowStepService, "");
        this.Camera2StreamConfigurationMap = flowConfigurationRepository;
        this.getHighSpeedVideoFpsRangesFor = backstackFlowStepService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke-k3UT_Go, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m16332invokek3UT_Go(final java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.onboarding.api.steps.domain.StepId>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase$invoke$1 preloadSignupFlowUseCase$invoke$1;
        int i;
        java.util.List list;
        if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase$invoke$1) {
            preloadSignupFlowUseCase$invoke$1 = (com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase$invoke$1) continuation;
            if ((preloadSignupFlowUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                preloadSignupFlowUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = preloadSignupFlowUseCase$invoke$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = preloadSignupFlowUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.onboarding.signup.domain.repository.FlowConfigurationRepository flowConfigurationRepository = this.Camera2StreamConfigurationMap;
                    preloadSignupFlowUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    preloadSignupFlowUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    preloadSignupFlowUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = flowConfigurationRepository.mo16274loadFlowk3UT_Go(str, str2, preloadSignupFlowUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) preloadSignupFlowUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                list = (java.util.List) obj;
                if (!list.isEmpty()) {
                    return kotlin.collections.CollectionsKt.emptyList();
                }
                this.getHighSpeedVideoFpsRangesFor.preloadSteps(kotlin.collections.MapsKt.toMap(kotlin.collections.CollectionsKt.windowed$default(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16029boximpl(com.paypal.oslo.feature.onboarding.api.steps.domain.StepIdKt.getInitialStepId())), (java.lang.Iterable) list), 2, 0, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase.m16331$r8$lambda$J6khzYlJ7CtPVY209jomUj2bBk(str, (java.util.List) obj2);
                    }
                }, 6, null)));
                return list;
            }
        }
        preloadSignupFlowUseCase$invoke$1 = new com.paypal.oslo.feature.onboarding.signup.domain.usecase.PreloadSignupFlowUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = preloadSignupFlowUseCase$invoke$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = preloadSignupFlowUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        list = (java.util.List) obj2;
        if (!list.isEmpty()) {
        }
    }

    /* renamed from: $r8$lambda$J6khzYlJ7CtPVY2-09jomUj2bBk, reason: not valid java name */
    public static /* synthetic */ kotlin.Pair m16331$r8$lambda$J6khzYlJ7CtPVY209jomUj2bBk(java.lang.String str, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.lang.String m16035unboximpl = ((com.paypal.oslo.feature.onboarding.api.steps.domain.StepId) list.get(0)).m16035unboximpl();
        return kotlin.TuplesKt.to(new com.paypal.oslo.feature.onboarding.steps.nav.domain.StepKey(str, m16035unboximpl, com.paypal.oslo.feature.onboarding.api.steps.domain.StepId.m16032equalsimpl0(m16035unboximpl, com.paypal.oslo.feature.onboarding.api.steps.domain.StepIdKt.getInitialStepId()) ? new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Initial(false, 1, null) : new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next(null, false, 3, null), null), new com.paypal.oslo.feature.onboarding.steps.nav.domain.Step(str, str, ((com.paypal.oslo.feature.onboarding.api.steps.domain.StepId) list.get(1)).m16035unboximpl(), kotlin.collections.SetsKt.setOf(new com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Next(null, false, 3, null)), null, null, 48, null));
    }
}
