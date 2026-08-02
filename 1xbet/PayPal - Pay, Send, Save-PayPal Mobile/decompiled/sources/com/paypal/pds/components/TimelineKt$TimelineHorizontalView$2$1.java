package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.TimelineKt$TimelineHorizontalView$2$1", f = "Timeline.kt", i = {0, 1}, l = {748, 756}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "$this$LaunchedEffect"}, nl = {com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.EarnFrameEnd, 758}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes16.dex */
final class TimelineKt$TimelineHorizontalView$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Easing Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.TimelineHorizontalItem getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, ?> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(450, r9) == r7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r9.getHighSpeedVideoFpsRangesFor.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), r9) != r7) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            booleanValue = ((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).booleanValue();
            if (!booleanValue) {
                return kotlin.Unit.INSTANCE;
            }
            if (this.getHighSpeedVideoFpsRangesFor != null && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.getState(), com.paypal.pds.components.TimelineState.Success.INSTANCE)) {
                this.getHighSpeedVideoSizesFor = coroutineScope;
                this.getOutputFormats = 1;
            }
            com.paypal.pds.components.TimelineKt.access$TimelineHorizontalView$lambda$0(this.getHighSpeedVideoSizes).invoke();
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.pds.components.TimelineKt.access$TimelineHorizontalView$lambda$0(this.getHighSpeedVideoSizes).invoke();
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.pds.components.TimelineKt$TimelineHorizontalView$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, null), 3, null);
        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.getOutputFormats = 2;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.TimelineKt$TimelineHorizontalView$2$1$1", f = "Timeline.kt", i = {}, l = {com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameStart}, m = "invokeSuspend", n = {}, nl = {754}, s = {}, v = 2)
    /* renamed from: com.paypal.pds.components.TimelineKt$TimelineHorizontalView$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, ?> Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.animation.core.Easing getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (androidx.compose.animation.core.Animatable.animateTo$default(this.Camera2StreamConfigurationMap, kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), androidx.compose.animation.core.AnimationSpecKt.tween$default(600, 0, this.getHighSpeedVideoFpsRangesFor, 2, null), null, null, this, 12, null) == coroutine_suspended) {
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
            return ((com.paypal.pds.components.TimelineKt$TimelineHorizontalView$2$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.pds.components.TimelineKt$TimelineHorizontalView$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.animation.core.Animatable<java.lang.Float, ?> animatable, androidx.compose.animation.core.Easing easing, kotlin.coroutines.Continuation<? super com.paypal.pds.components.TimelineKt$TimelineHorizontalView$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = animatable;
            this.getHighSpeedVideoFpsRangesFor = easing;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.TimelineKt$TimelineHorizontalView$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.pds.components.TimelineKt$TimelineHorizontalView$2$1 timelineKt$TimelineHorizontalView$2$1 = new com.paypal.pds.components.TimelineKt$TimelineHorizontalView$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        timelineKt$TimelineHorizontalView$2$1.getHighSpeedVideoSizesFor = obj;
        return timelineKt$TimelineHorizontalView$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TimelineKt$TimelineHorizontalView$2$1(androidx.compose.animation.core.Animatable<java.lang.Float, ?> animatable, com.paypal.pds.components.TimelineHorizontalItem timelineHorizontalItem, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.animation.core.Easing easing, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state, kotlin.coroutines.Continuation<? super com.paypal.pds.components.TimelineKt$TimelineHorizontalView$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = animatable;
        this.getHighSpeedVideoFpsRanges = timelineHorizontalItem;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
        this.Camera2StreamConfigurationMap = easing;
        this.getHighSpeedVideoSizes = state;
    }
}
