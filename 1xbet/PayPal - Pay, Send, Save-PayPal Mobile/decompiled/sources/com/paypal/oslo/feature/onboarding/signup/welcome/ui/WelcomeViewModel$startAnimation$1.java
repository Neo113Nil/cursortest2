package com.paypal.oslo.feature.onboarding.signup.welcome.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$startAnimation$1", f = "WelcomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class WelcomeViewModel$startAnimation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job job;
        kotlinx.coroutines.Job launch$default;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            job = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel = this.getHighSpeedVideoFpsRangesFor;
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(welcomeViewModel), null, null, new com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$startAnimation$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            welcomeViewModel.Camera2StreamConfigurationMap = launch$default;
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$startAnimation$1$1", f = "WelcomeViewModel.kt", i = {1, 1}, l = {136, 205}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 206}, s = {"L$0", "I$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$startAnimation$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(17, r9) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        
            if (r6.lock(null, r9) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00b1, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0053 -> B:6:0x0056). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.sync.Mutex mutex;
            com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
            boolean z;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = null;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRangesFor = 1;
            } else if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                welcomeViewModel = this.getHighSpeedVideoFpsRanges;
                this.Camera2StreamConfigurationMap = mutex;
                this.getHighResolutionOutputSizeshNQ4ISI = welcomeViewModel;
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRangesFor = 2;
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                welcomeViewModel = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel) this.getHighResolutionOutputSizeshNQ4ISI;
                mutex = (kotlinx.coroutines.sync.Mutex) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                try {
                    mutableStateFlow = welcomeViewModel.getHighSpeedVideoFpsRanges;
                    if (((java.lang.Number) mutableStateFlow.getValue()).floatValue() >= 1.0f) {
                        z = false;
                    } else {
                        mutableStateFlow2 = welcomeViewModel.getHighSpeedVideoFpsRanges;
                        float coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(((java.lang.Number) mutableStateFlow2.getValue()).floatValue() + 0.001f, 1.0f);
                        mutableStateFlow3 = welcomeViewModel.getHighSpeedVideoFpsRanges;
                        mutableStateFlow3.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat(coerceAtMost));
                        mutableStateFlow4 = welcomeViewModel.getHighResolutionOutputSizeshNQ4ISI;
                        mutableStateFlow4.setValue(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.INSTANCE.from((int) (coerceAtMost * com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.INSTANCE.getTOTAL_FRAME())));
                        z = true;
                    }
                    if (!z) {
                        return kotlin.Unit.INSTANCE;
                    }
                    this.Camera2StreamConfigurationMap = null;
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    this.getHighSpeedVideoFpsRangesFor = 1;
                } finally {
                    mutex.unlock(null);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$startAnimation$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$startAnimation$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$startAnimation$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = welcomeViewModel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$startAnimation$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$startAnimation$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WelcomeViewModel$startAnimation$1(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel$startAnimation$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = welcomeViewModel;
    }
}
