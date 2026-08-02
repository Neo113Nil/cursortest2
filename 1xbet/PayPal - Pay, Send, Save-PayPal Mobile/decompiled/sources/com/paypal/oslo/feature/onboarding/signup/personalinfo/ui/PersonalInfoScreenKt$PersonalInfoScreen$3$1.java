package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$3$1", f = "PersonalInfoScreen.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, nl = {93}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PersonalInfoScreenKt$PersonalInfoScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.onboarding.signup.ui.PageNavigationEffect> navigationEffects = this.getHighSpeedVideoFpsRangesFor.getNavigationEffects();
            final com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks = this.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (navigationEffects.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$3$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.onboarding.signup.ui.PageNavigationEffect pageNavigationEffect = (com.paypal.oslo.feature.onboarding.signup.ui.PageNavigationEffect) obj2;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(pageNavigationEffect, com.paypal.oslo.feature.onboarding.signup.ui.PageNavigationEffect.NavigateNext.INSTANCE)) {
                        com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks.this.getOnNavigateNext().invoke();
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(pageNavigationEffect, com.paypal.oslo.feature.onboarding.signup.ui.PageNavigationEffect.NavigateBack.INSTANCE)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks.this.getOnNavigateBack().invoke();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$3$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoScreenKt$PersonalInfoScreen$3$1(com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel personalInfoViewModel, com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt$PersonalInfoScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = personalInfoViewModel;
        this.getHighSpeedVideoFpsRanges = stepCallbacks;
    }
}
