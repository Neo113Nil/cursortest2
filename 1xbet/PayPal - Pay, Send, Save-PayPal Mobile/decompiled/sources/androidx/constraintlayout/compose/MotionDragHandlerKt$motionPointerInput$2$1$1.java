package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1", f = "MotionDragHandler.kt", i = {0, 0, 0, 1, 2, 2}, l = {77, 80, 85}, m = "invokeSuspend", n = {"$this$effectScope", "dragState", "isTouchUp", "$this$effectScope", "$this$effectScope", "isTouchUp"}, s = {"L$0", "L$1", "I$0", "L$0", "L$0", "I$0"})
/* loaded from: classes6.dex */
final class MotionDragHandlerKt$motionPointerInput$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.MotionDragState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.constraintlayout.compose.TransitionHandler getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r12 != r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        int i;
        androidx.constraintlayout.compose.MotionDragState motionDragState;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        boolean isDragging;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
            i = 0;
            motionDragState = null;
            if (kotlinx.coroutines.JobKt.isActive(coroutineScope.getCoroutineContext())) {
            }
        } else if (i2 == 1) {
            int i3 = this.Camera2StreamConfigurationMap;
            motionDragState = (androidx.constraintlayout.compose.MotionDragState) this.getHighSpeedVideoSizes;
            kotlinx.coroutines.CoroutineScope coroutineScope3 = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            i = i3;
            coroutineScope = coroutineScope3;
            obj2 = this.getHighSpeedVideoFpsRanges.mo24073tryReceivePtdJZtk();
            if (kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(obj2)) {
            }
            if (kotlinx.coroutines.JobKt.isActive(coroutineScope.getCoroutineContext())) {
            }
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = this.Camera2StreamConfigurationMap;
                coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                i = i4;
                coroutineScope = coroutineScope2;
                motionDragState = null;
                obj2 = this.getHighSpeedVideoFpsRanges.mo24073tryReceivePtdJZtk();
                if (kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(obj2)) {
                    motionDragState = (androidx.constraintlayout.compose.MotionDragState) kotlinx.coroutines.channels.ChannelResult.m24085getOrThrowimpl(obj2);
                    if (motionDragState.isDragging()) {
                        i = 0;
                    }
                }
                if (kotlinx.coroutines.JobKt.isActive(coroutineScope.getCoroutineContext())) {
                    if (i != 0 && this.getHighSpeedVideoFpsRangesFor.pendingProgressWhileTouchUp()) {
                        this.getInputFormats = coroutineScope;
                        this.getHighSpeedVideoSizes = motionDragState;
                        this.Camera2StreamConfigurationMap = i;
                        this.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (this.getHighSpeedVideoFpsRangesFor.updateProgressWhileTouchUp(this) != coroutine_suspended) {
                            i = i;
                            coroutineScope = coroutineScope;
                            obj2 = this.getHighSpeedVideoFpsRanges.mo24073tryReceivePtdJZtk();
                            if (kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(obj2)) {
                            }
                            if (kotlinx.coroutines.JobKt.isActive(coroutineScope.getCoroutineContext())) {
                            }
                        }
                    } else {
                        if (motionDragState == null) {
                            this.getInputFormats = coroutineScope;
                            this.getHighSpeedVideoSizes = null;
                            this.getHighResolutionOutputSizeshNQ4ISI = 2;
                            obj = this.getHighSpeedVideoFpsRanges.receive(this);
                        }
                        androidx.constraintlayout.compose.MotionDragState motionDragState2 = motionDragState;
                        coroutineScope2 = coroutineScope;
                        kotlinx.coroutines.JobKt.ensureActive(coroutineScope2.getCoroutineContext());
                        isDragging = motionDragState2.isDragging();
                        int i5 = !isDragging ? 1 : 0;
                        if (isDragging) {
                            this.getInputFormats = coroutineScope2;
                            this.getHighSpeedVideoSizes = null;
                            this.Camera2StreamConfigurationMap = i5;
                            this.getHighResolutionOutputSizeshNQ4ISI = 3;
                            if (this.getHighSpeedVideoFpsRangesFor.m9043onTouchUpsFctU(motionDragState2.m8991getVelocity9UxMQ8M(), this) != coroutine_suspended) {
                                i4 = i5;
                            }
                        } else {
                            this.getHighSpeedVideoFpsRangesFor.m9044updateProgressOnDragk4lQ0M(motionDragState2.m8990getDragAmountF1C5BW0());
                            i4 = i5;
                        }
                        i = i4;
                        coroutineScope = coroutineScope2;
                        motionDragState = null;
                        obj2 = this.getHighSpeedVideoFpsRanges.mo24073tryReceivePtdJZtk();
                        if (kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(obj2)) {
                        }
                        if (kotlinx.coroutines.JobKt.isActive(coroutineScope.getCoroutineContext())) {
                        }
                    }
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            motionDragState = (androidx.constraintlayout.compose.MotionDragState) obj;
            androidx.constraintlayout.compose.MotionDragState motionDragState22 = motionDragState;
            coroutineScope2 = coroutineScope;
            kotlinx.coroutines.JobKt.ensureActive(coroutineScope2.getCoroutineContext());
            isDragging = motionDragState22.isDragging();
            int i52 = !isDragging ? 1 : 0;
            if (isDragging) {
            }
            i = i4;
            coroutineScope = coroutineScope2;
            motionDragState = null;
            obj2 = this.getHighSpeedVideoFpsRanges.mo24073tryReceivePtdJZtk();
            if (kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(obj2)) {
            }
            if (kotlinx.coroutines.JobKt.isActive(coroutineScope.getCoroutineContext())) {
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1 motionDragHandlerKt$motionPointerInput$2$1$1 = new androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        motionDragHandlerKt$motionPointerInput$2$1$1.getInputFormats = obj;
        return motionDragHandlerKt$motionPointerInput$2$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MotionDragHandlerKt$motionPointerInput$2$1$1(androidx.constraintlayout.compose.TransitionHandler transitionHandler, kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.MotionDragState> channel, kotlin.coroutines.Continuation<? super androidx.constraintlayout.compose.MotionDragHandlerKt$motionPointerInput$2$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = transitionHandler;
        this.getHighSpeedVideoFpsRanges = channel;
    }
}
