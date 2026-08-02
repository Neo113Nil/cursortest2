package com.paypal.oslo.feature.onboarding.signup.welcome.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$updateFrame$1", f = "WelcomeViewModel.kt", i = {0, 0}, l = {205}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {206}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes13.dex */
final class WelcomeViewModel$updateFrame$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel;
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation welcomePageNavigation;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutex = this.getOutputFormats.getHighSpeedVideoSizes;
            welcomeViewModel = this.getOutputFormats;
            com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation welcomePageNavigation2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = mutex;
            this.Camera2StreamConfigurationMap = welcomeViewModel;
            this.getHighSpeedVideoFpsRangesFor = welcomePageNavigation2;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getInputFormats = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            welcomePageNavigation = welcomePageNavigation2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            welcomePageNavigation = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation) this.getHighSpeedVideoFpsRangesFor;
            welcomeViewModel = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel) this.Camera2StreamConfigurationMap;
            mutex = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            mutableStateFlow = welcomeViewModel.getHighSpeedVideoFpsRanges;
            int floatValue = (int) (((java.lang.Number) mutableStateFlow.getValue()).floatValue() * com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.INSTANCE.getTOTAL_FRAME());
            int i2 = com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$updateFrame$1.WhenMappings.$EnumSwitchMapping$0[welcomePageNavigation.ordinal()];
            if (i2 == 1) {
                com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel.access$navigateToNextPage(welcomeViewModel, floatValue);
            } else if (i2 == 2) {
                com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel.access$navigateToPreviousPage(welcomeViewModel, floatValue);
            } else if (i2 == 3) {
                mutableStateFlow2 = welcomeViewModel.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow2.setValue(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.INSTANCE.from(floatValue));
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$updateFrame$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation.NEXT_FRAME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation.PREVIOUS_FRAME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation.AUTO_NAV.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$updateFrame$1(this.getOutputFormats, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WelcomeViewModel$updateFrame$1(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel, com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation welcomePageNavigation, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$updateFrame$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = welcomeViewModel;
        this.getHighSpeedVideoSizes = welcomePageNavigation;
    }
}
