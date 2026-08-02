package com.paypal.oslo.feature.onboarding.signup.phone.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1", f = "PhoneOtpVerificationScreen.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;

        /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationResult phoneOtpVerificationResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1 phoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1;
            int i;
            if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1) {
                phoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1 = (com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1) continuation;
                if ((phoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    phoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = phoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = phoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        phoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneOtpVerificationResult);
                        phoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1.getHighSpeedVideoFpsRanges = 1;
                        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(function1, phoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                    return kotlin.Unit.INSTANCE;
                }
            }
            phoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1 = new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1(this, continuation);
            java.lang.Object obj2 = phoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1.Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = phoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$emit$1.getHighSpeedVideoFpsRanges;
            if (i != 0) {
            }
            this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj22) {
                    return com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj22);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationNavResult.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighSpeedVideoFpsRanges = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighSpeedVideoSizes.getVerificationResultFlow().collect(new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = phoneOtpVerificationViewModel;
        this.getHighSpeedVideoFpsRanges = appNavigator;
    }
}
