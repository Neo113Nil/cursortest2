package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsNavResultHandler$1$1", f = "SavingsTermsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsTermsScreenKt$SavingsTermsNavResultHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult oneOnboardingFlowNavResult = (com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        int i = com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsNavResultHandler$1$1.WhenMappings.$EnumSwitchMapping$0[oneOnboardingFlowNavResult.getStatus().ordinal()];
        if (i == 1) {
            this.Camera2StreamConfigurationMap.processIntent(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingCompleted.INSTANCE);
        } else if (i == 2) {
            this.Camera2StreamConfigurationMap.processIntent(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingCancelled.INSTANCE);
        } else if (i == 3) {
            this.Camera2StreamConfigurationMap.processIntent(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingFailed.INSTANCE);
        } else if (i == 4) {
            this.Camera2StreamConfigurationMap.processIntent(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingInProgress.INSTANCE);
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.Camera2StreamConfigurationMap.processIntent(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingInReview.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult oneOnboardingFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsNavResultHandler$1$1) create(oneOnboardingFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.oneonboarding.api.domain.Status.values().length];
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.COMPLETED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.CANCELED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.IN_PROGRESS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.IN_REVIEW.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsNavResultHandler$1$1 savingsTermsScreenKt$SavingsTermsNavResultHandler$1$1 = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsNavResultHandler$1$1(this.Camera2StreamConfigurationMap, continuation);
        savingsTermsScreenKt$SavingsTermsNavResultHandler$1$1.getHighSpeedVideoFpsRanges = obj;
        return savingsTermsScreenKt$SavingsTermsNavResultHandler$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsTermsScreenKt$SavingsTermsNavResultHandler$1$1(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsNavResultHandler$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = savingsTermsViewModel;
    }
}
