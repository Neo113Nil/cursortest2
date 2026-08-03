package androidx.compose.foundation.gestures;

/* compiled from: UpdatableAnimationState.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005JJ\u0010\u0013\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u001bH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "(Landroidx/compose/animation/core/AnimationSpec;)V", "isRunning", "", "lastFrameTime", "", "lastVelocity", "Landroidx/compose/animation/core/AnimationVector1D;", "value", "getValue", "()F", "setValue", "(F)V", "vectorizedSpec", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animateToZero", "", "beforeFrame", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "valueDelta", "afterFrame", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UpdatableAnimationState {

    @java.lang.Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;
    private androidx.compose.animation.core.AnimationVector1D lastVelocity = ZeroVector;
    private float value;
    private final androidx.compose.animation.core.VectorizedAnimationSpec<androidx.compose.animation.core.AnimationVector1D> vectorizedSpec;
    private static final androidx.compose.foundation.gestures.UpdatableAnimationState.Companion Companion = new androidx.compose.foundation.gestures.UpdatableAnimationState.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.animation.core.AnimationVector1D ZeroVector = new androidx.compose.animation.core.AnimationVector1D(0.0f);

    public UpdatableAnimationState(androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec) {
        this.vectorizedSpec = animationSpec.vectorize(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE));
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f) {
        this.value = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        if (r13 != 0.0f) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a5 -> B:24:0x00a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object animateToZero(kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$1;
        int i;
        androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$12;
        kotlin.jvm.functions.Function0 function02;
        final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function12;
        final float f;
        final androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState;
        kotlin.jvm.functions.Function0 function03;
        androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState2;
        try {
            if (continuation instanceof androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) {
                updatableAnimationState$animateToZero$1 = (androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) continuation;
                if ((updatableAnimationState$animateToZero$1.label & Integer.MIN_VALUE) != 0) {
                    updatableAnimationState$animateToZero$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = updatableAnimationState$animateToZero$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = updatableAnimationState$animateToZero$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!(!this.isRunning)) {
                            throw new java.lang.IllegalStateException("animateToZero called while previous animation is running".toString());
                        }
                        androidx.compose.ui.MotionDurationScale motionDurationScale = (androidx.compose.ui.MotionDurationScale) updatableAnimationState$animateToZero$1.get$context().get(androidx.compose.ui.MotionDurationScale.INSTANCE);
                        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
                        this.isRunning = true;
                        updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$1;
                        function02 = function0;
                        function12 = function1;
                        f = scaleFactor;
                        updatableAnimationState = this;
                        if (!Companion.isZeroish(updatableAnimationState.value)) {
                            kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> function13 = new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
                                    invoke(l.longValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(long j) {
                                    long j2;
                                    long j3;
                                    long roundToLong;
                                    androidx.compose.animation.core.VectorizedAnimationSpec vectorizedAnimationSpec;
                                    androidx.compose.foundation.gestures.UpdatableAnimationState.Companion companion;
                                    androidx.compose.animation.core.AnimationVector1D animationVector1D;
                                    androidx.compose.animation.core.VectorizedAnimationSpec vectorizedAnimationSpec2;
                                    androidx.compose.foundation.gestures.UpdatableAnimationState.Companion companion2;
                                    androidx.compose.animation.core.AnimationVector1D animationVector1D2;
                                    androidx.compose.animation.core.VectorizedAnimationSpec vectorizedAnimationSpec3;
                                    androidx.compose.foundation.gestures.UpdatableAnimationState.Companion companion3;
                                    androidx.compose.animation.core.AnimationVector1D animationVector1D3;
                                    j2 = androidx.compose.foundation.gestures.UpdatableAnimationState.this.lastFrameTime;
                                    if (j2 == Long.MIN_VALUE) {
                                        androidx.compose.foundation.gestures.UpdatableAnimationState.this.lastFrameTime = j;
                                    }
                                    androidx.compose.animation.core.AnimationVector1D animationVector1D4 = new androidx.compose.animation.core.AnimationVector1D(androidx.compose.foundation.gestures.UpdatableAnimationState.this.getValue());
                                    if (f == 0.0f) {
                                        vectorizedAnimationSpec3 = androidx.compose.foundation.gestures.UpdatableAnimationState.this.vectorizedSpec;
                                        androidx.compose.animation.core.AnimationVector1D animationVector1D5 = new androidx.compose.animation.core.AnimationVector1D(androidx.compose.foundation.gestures.UpdatableAnimationState.this.getValue());
                                        companion3 = androidx.compose.foundation.gestures.UpdatableAnimationState.Companion;
                                        androidx.compose.animation.core.AnimationVector1D zeroVector = companion3.getZeroVector();
                                        animationVector1D3 = androidx.compose.foundation.gestures.UpdatableAnimationState.this.lastVelocity;
                                        roundToLong = vectorizedAnimationSpec3.getDurationNanos(animationVector1D5, zeroVector, animationVector1D3);
                                    } else {
                                        j3 = androidx.compose.foundation.gestures.UpdatableAnimationState.this.lastFrameTime;
                                        roundToLong = kotlin.math.MathKt.roundToLong((j - j3) / f);
                                    }
                                    vectorizedAnimationSpec = androidx.compose.foundation.gestures.UpdatableAnimationState.this.vectorizedSpec;
                                    androidx.compose.animation.core.AnimationVector1D animationVector1D6 = animationVector1D4;
                                    companion = androidx.compose.foundation.gestures.UpdatableAnimationState.Companion;
                                    androidx.compose.animation.core.AnimationVector1D zeroVector2 = companion.getZeroVector();
                                    animationVector1D = androidx.compose.foundation.gestures.UpdatableAnimationState.this.lastVelocity;
                                    float value = ((androidx.compose.animation.core.AnimationVector1D) vectorizedAnimationSpec.getValueFromNanos(roundToLong, animationVector1D6, zeroVector2, animationVector1D)).getValue();
                                    androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState3 = androidx.compose.foundation.gestures.UpdatableAnimationState.this;
                                    vectorizedAnimationSpec2 = updatableAnimationState3.vectorizedSpec;
                                    companion2 = androidx.compose.foundation.gestures.UpdatableAnimationState.Companion;
                                    androidx.compose.animation.core.AnimationVector1D zeroVector3 = companion2.getZeroVector();
                                    animationVector1D2 = androidx.compose.foundation.gestures.UpdatableAnimationState.this.lastVelocity;
                                    updatableAnimationState3.lastVelocity = (androidx.compose.animation.core.AnimationVector1D) vectorizedAnimationSpec2.getVelocityFromNanos(roundToLong, animationVector1D6, zeroVector3, animationVector1D2);
                                    androidx.compose.foundation.gestures.UpdatableAnimationState.this.lastFrameTime = j;
                                    float value2 = androidx.compose.foundation.gestures.UpdatableAnimationState.this.getValue() - value;
                                    androidx.compose.foundation.gestures.UpdatableAnimationState.this.setValue(value);
                                    function12.invoke(java.lang.Float.valueOf(value2));
                                }
                            };
                            updatableAnimationState$animateToZero$12.L$0 = updatableAnimationState;
                            updatableAnimationState$animateToZero$12.L$1 = function12;
                            updatableAnimationState$animateToZero$12.L$2 = function02;
                            updatableAnimationState$animateToZero$12.F$0 = f;
                            updatableAnimationState$animateToZero$12.label = 1;
                            if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(function13, updatableAnimationState$animateToZero$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            function02.invoke();
                        }
                        function03 = function02;
                        androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState3 = updatableAnimationState;
                        final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function14 = function12;
                        final androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState4 = updatableAnimationState3;
                        if (java.lang.Math.abs(updatableAnimationState4.value) != 0.0f) {
                            kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> function15 = new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
                                    invoke(l.longValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(long j) {
                                    float value = androidx.compose.foundation.gestures.UpdatableAnimationState.this.getValue();
                                    androidx.compose.foundation.gestures.UpdatableAnimationState.this.setValue(0.0f);
                                    function14.invoke(java.lang.Float.valueOf(value));
                                }
                            };
                            updatableAnimationState$animateToZero$12.L$0 = updatableAnimationState4;
                            updatableAnimationState$animateToZero$12.L$1 = function03;
                            updatableAnimationState$animateToZero$12.L$2 = null;
                            updatableAnimationState$animateToZero$12.label = 2;
                            function0 = updatableAnimationState4;
                            if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(function15, updatableAnimationState$animateToZero$12) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            function03.invoke();
                            updatableAnimationState2 = function0;
                            updatableAnimationState2.lastFrameTime = Long.MIN_VALUE;
                            updatableAnimationState2.lastVelocity = ZeroVector;
                            updatableAnimationState2.isRunning = false;
                            return kotlin.Unit.INSTANCE;
                        }
                        updatableAnimationState2 = updatableAnimationState4;
                        updatableAnimationState2.lastFrameTime = Long.MIN_VALUE;
                        updatableAnimationState2.lastVelocity = ZeroVector;
                        updatableAnimationState2.isRunning = false;
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function03 = (kotlin.jvm.functions.Function0) updatableAnimationState$animateToZero$1.L$1;
                        androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState5 = (androidx.compose.foundation.gestures.UpdatableAnimationState) updatableAnimationState$animateToZero$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        function0 = updatableAnimationState5;
                        function03.invoke();
                        updatableAnimationState2 = function0;
                        updatableAnimationState2.lastFrameTime = Long.MIN_VALUE;
                        updatableAnimationState2.lastVelocity = ZeroVector;
                        updatableAnimationState2.isRunning = false;
                        return kotlin.Unit.INSTANCE;
                    }
                    f = updatableAnimationState$animateToZero$1.F$0;
                    kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) updatableAnimationState$animateToZero$1.L$2;
                    kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function16 = (kotlin.jvm.functions.Function1) updatableAnimationState$animateToZero$1.L$1;
                    androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState6 = (androidx.compose.foundation.gestures.UpdatableAnimationState) updatableAnimationState$animateToZero$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        updatableAnimationState = updatableAnimationState6;
                        androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$13 = updatableAnimationState$animateToZero$1;
                        function02 = function04;
                        function12 = function16;
                        updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$13;
                        try {
                            function02.invoke();
                        } catch (java.lang.Throwable th) {
                            th = th;
                            function0 = updatableAnimationState;
                            function0.lastFrameTime = Long.MIN_VALUE;
                            function0.lastVelocity = ZeroVector;
                            function0.isRunning = false;
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        function0 = updatableAnimationState6;
                        function0.lastFrameTime = Long.MIN_VALUE;
                        function0.lastVelocity = ZeroVector;
                        function0.isRunning = false;
                        throw th;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
        updatableAnimationState$animateToZero$1 = new androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1(this, continuation);
        java.lang.Object obj2 = updatableAnimationState$animateToZero$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updatableAnimationState$animateToZero$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UpdatableAnimationState.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u00020\n*\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$Companion;", "", "()V", "VisibilityThreshold", "", "ZeroVector", "Landroidx/compose/animation/core/AnimationVector1D;", "getZeroVector", "()Landroidx/compose/animation/core/AnimationVector1D;", "isZeroish", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.animation.core.AnimationVector1D getZeroVector() {
            return androidx.compose.foundation.gestures.UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f) {
            return java.lang.Math.abs(f) < 0.01f;
        }
    }
}
