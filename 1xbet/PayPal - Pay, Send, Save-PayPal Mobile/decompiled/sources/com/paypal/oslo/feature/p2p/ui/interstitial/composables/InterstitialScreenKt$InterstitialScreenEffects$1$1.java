package com.paypal.oslo.feature.p2p.ui.interstitial.composables;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1", f = "InterstitialScreen.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, nl = {151}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class InterstitialScreenKt$InterstitialScreenEffects$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, java.lang.Boolean, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.LifecycleOwner getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1$1", f = "InterstitialScreen.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, nl = {150}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function2<com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, java.lang.Boolean, kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel getHighSpeedVideoSizes;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/effects/InterstitialEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1$1$1", f = "InterstitialScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01271 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
            final /* synthetic */ kotlin.jvm.functions.Function2<com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, java.lang.Boolean, kotlin.Unit> getHighSpeedVideoFpsRanges;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect interstitialEffect = (com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect) this.Camera2StreamConfigurationMap;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoSizes != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (!(interstitialEffect instanceof com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect.ButtonAction)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect.ButtonAction buttonAction = (com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect.ButtonAction) interstitialEffect;
                this.getHighSpeedVideoFpsRanges.invoke(buttonAction.getAction(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(buttonAction.isPrimary()));
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect interstitialEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1.AnonymousClass1.C01271) create(interstitialEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1.AnonymousClass1.C01271 c01271 = new com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1.AnonymousClass1.C01271(this.getHighSpeedVideoFpsRanges, continuation);
                c01271.Camera2StreamConfigurationMap = obj;
                return c01271;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01271(kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, ? super java.lang.Boolean, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1.AnonymousClass1.C01271> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRanges = function2;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = 1;
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes.getUiEffect(), new com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1.AnonymousClass1.C01271(this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
            return ((com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel interstitialViewModel, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, ? super java.lang.Boolean, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = interstitialViewModel;
            this.getHighSpeedVideoFpsRanges = function2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (androidx.view.RepeatOnLifecycleKt.repeatOnLifecycle(this.getHighResolutionOutputSizeshNQ4ISI.getLifecycle(), androidx.lifecycle.Lifecycle.State.STARTED, new com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InterstitialScreenKt$InterstitialScreenEffects$1$1(androidx.view.LifecycleOwner lifecycleOwner, com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel interstitialViewModel, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, ? super java.lang.Boolean, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = lifecycleOwner;
        this.getHighSpeedVideoFpsRangesFor = interstitialViewModel;
        this.Camera2StreamConfigurationMap = function2;
    }
}
