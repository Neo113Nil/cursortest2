package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.TimelineKt$AnimatedTimelineTrack$1$1", f = "Timeline.kt", i = {0, 1, 2, 3}, l = {576, 581, 592, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_EXPIRED}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "$this$LaunchedEffect", "$this$LaunchedEffect", "$this$LaunchedEffect"}, nl = {577, 583, 593, 599}, s = {"L$0", "L$0", "L$0", "L$0"}, v = 2)
/* loaded from: classes16.dex */
final class TimelineKt$AnimatedTimelineTrack$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.Easing Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.pds.components.TimelineState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoSizesFor;
    int getInputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(450, r9) != r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r10.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1), r9) != r7) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r9.getHighSpeedVideoSizesFor.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), r9) != r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        if (r9.getHighSpeedVideoSizesFor.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), r9) == r7) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoSizes.getValue()).booleanValue();
            if (!booleanValue) {
                androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable = this.getHighSpeedVideoSizesFor;
                float f = kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.pds.components.TimelineState.Success.INSTANCE) ? 1.0f : 0.0f;
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getInputFormats = 1;
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.pds.components.TimelineState.Success.INSTANCE)) {
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getInputFormats = 4;
            } else {
                if (!this.getHighSpeedVideoFpsRangesFor) {
                    return kotlin.Unit.INSTANCE;
                }
                this.getOutputMinFrameDuration = coroutineScope;
                this.getInputFormats = 2;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(true));
        } else if (i == 2) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.pds.components.TimelineKt$AnimatedTimelineTrack$1$1.AnonymousClass1(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, null), 3, null);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getInputFormats = 3;
        } else if (i == 3) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.pds.components.TimelineKt.access$AnimatedTimelineTrack$lambda$0(this.getHighSpeedVideoFpsRanges).invoke();
        } else {
            if (i != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!this.getHighSpeedVideoFpsRangesFor) {
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.pds.components.TimelineKt.access$AnimatedTimelineTrack$lambda$0(this.getHighSpeedVideoFpsRanges).invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.TimelineKt$AnimatedTimelineTrack$1$1$1", f = "Timeline.kt", i = {}, l = {584}, m = "invokeSuspend", n = {}, nl = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_EXTERNAL_SYSTEM_NOT_AVAILABLE_ERROR}, s = {}, v = 2)
    /* renamed from: com.paypal.pds.components.TimelineKt$AnimatedTimelineTrack$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.animation.core.Easing getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                if (androidx.compose.animation.core.Animatable.animateTo$default(this.getHighResolutionOutputSizeshNQ4ISI, kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), androidx.compose.animation.core.AnimationSpecKt.tween$default(600, 0, this.getHighSpeedVideoFpsRanges, 2, null), null, null, this, 12, null) == coroutine_suspended) {
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
            return ((com.paypal.pds.components.TimelineKt$AnimatedTimelineTrack$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.pds.components.TimelineKt$AnimatedTimelineTrack$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, androidx.compose.animation.core.Easing easing, kotlin.coroutines.Continuation<? super com.paypal.pds.components.TimelineKt$AnimatedTimelineTrack$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = animatable;
            this.getHighSpeedVideoFpsRanges = easing;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.TimelineKt$AnimatedTimelineTrack$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.pds.components.TimelineKt$AnimatedTimelineTrack$1$1 timelineKt$AnimatedTimelineTrack$1$1 = new com.paypal.pds.components.TimelineKt$AnimatedTimelineTrack$1$1(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        timelineKt$AnimatedTimelineTrack$1$1.getOutputMinFrameDuration = obj;
        return timelineKt$AnimatedTimelineTrack$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TimelineKt$AnimatedTimelineTrack$1$1(androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animatable, com.paypal.pds.components.TimelineState timelineState, boolean z, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.animation.core.Easing easing, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state, kotlin.coroutines.Continuation<? super com.paypal.pds.components.TimelineKt$AnimatedTimelineTrack$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = animatable;
        this.getHighResolutionOutputSizeshNQ4ISI = timelineState;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoSizes = mutableState;
        this.Camera2StreamConfigurationMap = easing;
        this.getHighSpeedVideoFpsRanges = state;
    }
}
