package com.paypal.oslo.feature.savings.ui.basescreen;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseScreenKt$SavingsBaseScreen$2$1", f = "SavingsBaseScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsBaseScreenKt$SavingsBaseScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseCallbacks getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult oneOnboardingFlowNavResult = (com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        int i = com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseScreenKt$SavingsBaseScreen$2$1.WhenMappings.$EnumSwitchMapping$0[oneOnboardingFlowNavResult.getStatus().ordinal()];
        if (i == 1) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.invoke();
        } else if (i == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges.invoke();
        } else if (i == 3) {
            this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.invoke();
        } else if (i == 4) {
            this.getHighResolutionOutputSizeshNQ4ISI.getInputFormats.invoke();
        } else if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult oneOnboardingFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseScreenKt$SavingsBaseScreen$2$1) create(oneOnboardingFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
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
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.IN_REVIEW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.api.domain.Status.IN_PROGRESS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseScreenKt$SavingsBaseScreen$2$1 savingsBaseScreenKt$SavingsBaseScreen$2$1 = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseScreenKt$SavingsBaseScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        savingsBaseScreenKt$SavingsBaseScreen$2$1.getHighSpeedVideoFpsRangesFor = obj;
        return savingsBaseScreenKt$SavingsBaseScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsBaseScreenKt$SavingsBaseScreen$2$1(com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseCallbacks savingsBaseCallbacks, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.basescreen.SavingsBaseScreenKt$SavingsBaseScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = savingsBaseCallbacks;
    }
}
