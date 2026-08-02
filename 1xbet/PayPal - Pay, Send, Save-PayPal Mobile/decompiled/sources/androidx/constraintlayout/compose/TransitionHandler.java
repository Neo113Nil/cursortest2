package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/constraintlayout/compose/TransitionHandler;", "", "Landroidx/constraintlayout/compose/MotionMeasurer;", "motionMeasurer", "Landroidx/compose/runtime/MutableFloatState;", androidx.constraintlayout.motion.widget.Key.MOTIONPROGRESS, "<init>", "(Landroidx/constraintlayout/compose/MotionMeasurer;Landroidx/compose/runtime/MutableFloatState;)V", "Landroidx/compose/ui/geometry/Offset;", "offset", "", "onAcceptFirstDownForOnSwipe-k-4lQ0M", "(J)Z", "onAcceptFirstDownForOnSwipe", "Landroidx/compose/ui/unit/Velocity;", "velocity", "", "onTouchUp-sF-c-tU", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTouchUp", "pendingProgressWhileTouchUp", "()Z", "dragAmount", "updateProgressOnDrag-k-4lQ0M", "(J)V", "updateProgressOnDrag", "updateProgressWhileTouchUp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Landroidx/constraintlayout/compose/MotionMeasurer;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/MutableFloatState;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransitionHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.constraintlayout.compose.MotionMeasurer getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRangesFor;

    public TransitionHandler(androidx.constraintlayout.compose.MotionMeasurer motionMeasurer, androidx.compose.runtime.MutableFloatState mutableFloatState) {
        this.getHighSpeedVideoSizes = motionMeasurer;
        this.getHighSpeedVideoFpsRangesFor = mutableFloatState;
    }

    /* renamed from: onTouchUp-sF-c-tU, reason: not valid java name */
    public final java.lang.Object m9043onTouchUpsFctU(final long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withFrameNanos = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.constraintlayout.compose.TransitionHandler$onTouchUp$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
                Camera2StreamConfigurationMap(l.longValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(long j2) {
                androidx.constraintlayout.core.state.Transition transition;
                androidx.compose.runtime.MutableFloatState mutableFloatState;
                transition = androidx.constraintlayout.compose.TransitionHandler.this.getHighSpeedVideoSizes.getTransition();
                mutableFloatState = androidx.constraintlayout.compose.TransitionHandler.this.getHighSpeedVideoFpsRangesFor;
                transition.setTouchUp(mutableFloatState.getFloatValue(), j2, androidx.compose.ui.unit.Velocity.m8839getXimpl(j), androidx.compose.ui.unit.Velocity.m8840getYimpl(j));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, continuation);
        return withFrameNanos == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withFrameNanos : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateProgressWhileTouchUp(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1 transitionHandler$updateProgressWhileTouchUp$1;
        int i;
        androidx.constraintlayout.compose.TransitionHandler transitionHandler;
        if (continuation instanceof androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1) {
            transitionHandler$updateProgressWhileTouchUp$1 = (androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1) continuation;
            if ((transitionHandler$updateProgressWhileTouchUp$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                transitionHandler$updateProgressWhileTouchUp$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = transitionHandler$updateProgressWhileTouchUp$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transitionHandler$updateProgressWhileTouchUp$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Float> function1 = new kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Float>() { // from class: androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$newProgress$1
                        public final java.lang.Float getHighResolutionOutputSizeshNQ4ISI(long j) {
                            androidx.constraintlayout.core.state.Transition transition;
                            transition = androidx.constraintlayout.compose.TransitionHandler.this.getHighSpeedVideoSizes.getTransition();
                            return java.lang.Float.valueOf(transition.getTouchUpProgress(j));
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ java.lang.Float invoke(java.lang.Long l) {
                            return getHighResolutionOutputSizeshNQ4ISI(l.longValue());
                        }

                        {
                            super(1);
                        }
                    };
                    transitionHandler$updateProgressWhileTouchUp$1.getHighResolutionOutputSizeshNQ4ISI = this;
                    transitionHandler$updateProgressWhileTouchUp$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(function1, transitionHandler$updateProgressWhileTouchUp$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    transitionHandler = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    transitionHandler = (androidx.constraintlayout.compose.TransitionHandler) transitionHandler$updateProgressWhileTouchUp$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                transitionHandler.getHighSpeedVideoFpsRangesFor.setFloatValue(((java.lang.Number) obj).floatValue());
                return kotlin.Unit.INSTANCE;
            }
        }
        transitionHandler$updateProgressWhileTouchUp$1 = new androidx.constraintlayout.compose.TransitionHandler$updateProgressWhileTouchUp$1(this, continuation);
        java.lang.Object obj2 = transitionHandler$updateProgressWhileTouchUp$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transitionHandler$updateProgressWhileTouchUp$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        transitionHandler.getHighSpeedVideoFpsRangesFor.setFloatValue(((java.lang.Number) obj2).floatValue());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: onAcceptFirstDownForOnSwipe-k-4lQ0M, reason: not valid java name */
    public final boolean m9042onAcceptFirstDownForOnSwipek4lQ0M(long offset) {
        return this.getHighSpeedVideoSizes.getTransition().isFirstDownAccepted(androidx.compose.ui.geometry.Offset.m5752getXimpl(offset), androidx.compose.ui.geometry.Offset.m5753getYimpl(offset));
    }

    public final boolean pendingProgressWhileTouchUp() {
        return this.getHighSpeedVideoSizes.getTransition().isTouchNotDone(this.getHighSpeedVideoFpsRangesFor.getFloatValue());
    }

    /* renamed from: updateProgressOnDrag-k-4lQ0M, reason: not valid java name */
    public final void m9044updateProgressOnDragk4lQ0M(long dragAmount) {
        this.getHighSpeedVideoFpsRangesFor.setFloatValue(kotlin.ranges.RangesKt.coerceIn(this.getHighSpeedVideoFpsRangesFor.getFloatValue() + this.getHighSpeedVideoSizes.getTransition().dragToProgress(this.getHighSpeedVideoFpsRangesFor.getFloatValue(), this.getHighSpeedVideoSizes.getLayoutCurrentWidth(), this.getHighSpeedVideoSizes.getLayoutCurrentHeight(), androidx.compose.ui.geometry.Offset.m5752getXimpl(dragAmount), androidx.compose.ui.geometry.Offset.m5753getYimpl(dragAmount)), 0.0f, 1.0f));
    }
}
