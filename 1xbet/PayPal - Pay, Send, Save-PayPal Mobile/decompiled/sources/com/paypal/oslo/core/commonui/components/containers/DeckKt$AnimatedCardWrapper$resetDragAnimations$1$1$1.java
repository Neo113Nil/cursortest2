package com.paypal.oslo.core.commonui.components.containers;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1", f = "Deck.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.TweenSpec<java.lang.Float> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1$1", f = "Deck.kt", i = {}, l = {432}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.animation.core.TweenSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = 1;
                if (androidx.compose.animation.core.Animatable.animateTo$default(this.getHighSpeedVideoSizes, kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), this.getHighResolutionOutputSizeshNQ4ISI, null, null, this, 12, null) == coroutine_suspended) {
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
            return ((com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.animation.core.TweenSpec<java.lang.Float> tweenSpec, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = animatable;
            this.getHighResolutionOutputSizeshNQ4ISI = tweenSpec;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDuration;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1.AnonymousClass2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1.AnonymousClass3(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1$2", f = "Deck.kt", i = {}, l = {433}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.animation.core.TweenSpec<java.lang.Float> getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (androidx.compose.animation.core.Animatable.animateTo$default(this.getHighSpeedVideoFpsRangesFor, kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), this.getHighSpeedVideoFpsRanges, null, null, this, 12, null) == coroutine_suspended) {
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
            return ((com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.animation.core.TweenSpec<java.lang.Float> tweenSpec, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = animatable;
            this.getHighSpeedVideoFpsRanges = tweenSpec;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1$3", f = "Deck.kt", i = {}, l = {434}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.animation.core.TweenSpec<java.lang.Float> Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                if (androidx.compose.animation.core.Animatable.animateTo$default(this.getHighResolutionOutputSizeshNQ4ISI, kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), this.Camera2StreamConfigurationMap, null, null, this, 12, null) == coroutine_suspended) {
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
            return ((com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1.AnonymousClass3(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.animation.core.TweenSpec<java.lang.Float> tweenSpec, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1.AnonymousClass3> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = animatable;
            this.Camera2StreamConfigurationMap = tweenSpec;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1 deckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1 = new com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        deckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1.getOutputMinFrameDuration = obj;
        return deckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.animation.core.TweenSpec<java.lang.Float> tweenSpec, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable2, androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable3, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.commonui.components.containers.DeckKt$AnimatedCardWrapper$resetDragAnimations$1$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = animatable;
        this.getHighSpeedVideoFpsRangesFor = tweenSpec;
        this.getHighSpeedVideoFpsRanges = animatable2;
        this.getHighSpeedVideoSizes = animatable3;
    }
}
