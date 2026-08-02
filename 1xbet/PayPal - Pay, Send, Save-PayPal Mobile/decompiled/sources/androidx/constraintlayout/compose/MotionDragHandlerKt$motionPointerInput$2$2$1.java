package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1", f = "MotionDragHandler.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class MotionDragHandlerKt$motionPointerInput$2$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.MotionDragState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.constraintlayout.compose.TransitionHandler getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope = (androidx.compose.ui.input.pointer.PointerInputScope) this.getHighSpeedVideoSizes;
            final androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker = new androidx.compose.ui.input.pointer.util.VelocityTracker();
            final androidx.constraintlayout.compose.TransitionHandler transitionHandler = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, java.lang.Boolean> function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, java.lang.Boolean>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.geometry.Offset offset) {
                    return Camera2StreamConfigurationMap(offset.m5762unboximpl());
                }

                public final java.lang.Boolean Camera2StreamConfigurationMap(long j) {
                    return java.lang.Boolean.valueOf(androidx.constraintlayout.compose.TransitionHandler.this.m9042onAcceptFirstDownForOnSwipek4lQ0M(j));
                }

                {
                    super(1);
                }
            };
            kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.geometry.Offset offset) {
                    Camera2StreamConfigurationMap(offset.m5762unboximpl());
                    return kotlin.Unit.INSTANCE;
                }

                public final void Camera2StreamConfigurationMap(long j) {
                    androidx.compose.ui.input.pointer.util.VelocityTracker.this.resetTracking();
                }

                {
                    super(1);
                }
            };
            final kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.MotionDragState> channel = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.3
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighResolutionOutputSizeshNQ4ISI();
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI() {
                    channel.mo9266trySendJP2dKIU(androidx.constraintlayout.compose.MotionDragState.INSTANCE.m8993onDragEndTH1AsA0(velocityTracker.m7331calculateVelocity9UxMQ8M()));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
            final kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.MotionDragState> channel2 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function0<kotlin.Unit> function02 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.4
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    Camera2StreamConfigurationMap();
                    return kotlin.Unit.INSTANCE;
                }

                public final void Camera2StreamConfigurationMap() {
                    channel2.mo9266trySendJP2dKIU(androidx.constraintlayout.compose.MotionDragState.INSTANCE.m8993onDragEndTH1AsA0(velocityTracker.m7331calculateVelocity9UxMQ8M()));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
            final kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.MotionDragState> channel3 = this.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (androidx.constraintlayout.compose.MotionDragHandlerKt.access$detectDragGesturesWhenNeeded(pointerInputScope, function1, function12, function0, function02, new kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1.5
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.geometry.Offset offset) {
                    getHighSpeedVideoSizes(pointerInputChange, offset.m5762unboximpl());
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j) {
                    androidx.compose.ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(androidx.compose.ui.input.pointer.util.VelocityTracker.this, pointerInputChange);
                    channel3.mo9266trySendJP2dKIU(androidx.constraintlayout.compose.MotionDragState.INSTANCE.m8992onDragk4lQ0M(j));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
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
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1) create(pointerInputScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1 motionDragHandlerKt$motionPointerInput$2$2$1 = new androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        motionDragHandlerKt$motionPointerInput$2$2$1.getHighSpeedVideoSizes = obj;
        return motionDragHandlerKt$motionPointerInput$2$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionDragHandlerKt$motionPointerInput$2$2$1(androidx.constraintlayout.compose.TransitionHandler transitionHandler, kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.MotionDragState> channel, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = transitionHandler;
        this.getHighSpeedVideoFpsRanges = channel;
    }
}
