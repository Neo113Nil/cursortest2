package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JB\u0010\r\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0086@\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0015\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState;", "", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "<init>", "(Landroidx/compose/animation/core/AnimationSpec;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "animateToZero", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoSizes", "J", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/AnimationVector1D;", "", "Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getValue", "()F", "setValue", "(F)V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpdatableAnimationState {

    @java.lang.Deprecated
    public static final float VisibilityThreshold = 0.01f;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.animation.core.VectorizedAnimationSpec<androidx.compose.animation.core.AnimationVector1D> getHighSpeedVideoFpsRanges;
    private float value;
    private static final androidx.compose.foundation.gestures.UpdatableAnimationState.Companion Companion = new androidx.compose.foundation.gestures.UpdatableAnimationState.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.animation.core.AnimationVector1D Camera2StreamConfigurationMap = new androidx.compose.animation.core.AnimationVector1D(0.0f);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap = Long.MIN_VALUE;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.animation.core.AnimationVector1D getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;

    public UpdatableAnimationState(androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec) {
        this.getHighSpeedVideoFpsRanges = animationSpec.vectorize(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE));
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f) {
        this.value = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (r12 != 0.0f) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008f -> B:23:0x0092). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object animateToZero(final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$1;
        int i;
        final float scaleFactor;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        try {
            if (continuation instanceof androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) {
                updatableAnimationState$animateToZero$1 = (androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) continuation;
                if ((updatableAnimationState$animateToZero$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    updatableAnimationState$animateToZero$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = updatableAnimationState$animateToZero$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = updatableAnimationState$animateToZero$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (this.getHighSpeedVideoSizes) {
                            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("animateToZero called while previous animation is running");
                        }
                        androidx.compose.ui.MotionDurationScale motionDurationScale = (androidx.compose.ui.MotionDurationScale) updatableAnimationState$animateToZero$1.getContext().get(androidx.compose.ui.MotionDurationScale.INSTANCE);
                        scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
                        this.getHighSpeedVideoSizes = true;
                        if (!androidx.compose.foundation.gestures.UpdatableAnimationState.Companion.getHighSpeedVideoFpsRanges(this.value)) {
                            kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.UpdatableAnimationState$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.UpdatableAnimationState.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.UpdatableAnimationState.this, scaleFactor, function1, ((java.lang.Long) obj2).longValue());
                                    return highResolutionOutputSizeshNQ4ISI;
                                }
                            };
                            updatableAnimationState$animateToZero$1.getHighSpeedVideoFpsRangesFor = function1;
                            updatableAnimationState$animateToZero$1.getHighResolutionOutputSizeshNQ4ISI = function0;
                            updatableAnimationState$animateToZero$1.getHighSpeedVideoSizes = scaleFactor;
                            updatableAnimationState$animateToZero$1.getHighSpeedVideoFpsRanges = 1;
                            if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(function12, updatableAnimationState$animateToZero$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            function0.invoke();
                        }
                        if (java.lang.Math.abs(this.value) != 0.0f) {
                            kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.UpdatableAnimationState$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    kotlin.Unit highSpeedVideoFpsRangesFor;
                                    androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState = androidx.compose.foundation.gestures.UpdatableAnimationState.this;
                                    kotlin.jvm.functions.Function1 function14 = function1;
                                    ((java.lang.Long) obj2).longValue();
                                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.UpdatableAnimationState.getHighSpeedVideoFpsRangesFor(updatableAnimationState, function14);
                                    return highSpeedVideoFpsRangesFor;
                                }
                            };
                            updatableAnimationState$animateToZero$1.getHighSpeedVideoFpsRangesFor = function0;
                            updatableAnimationState$animateToZero$1.getHighResolutionOutputSizeshNQ4ISI = null;
                            updatableAnimationState$animateToZero$1.getHighSpeedVideoFpsRanges = 2;
                            if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(function13, updatableAnimationState$animateToZero$1) != coroutine_suspended) {
                                function02 = function0;
                                function02.invoke();
                                this.Camera2StreamConfigurationMap = Long.MIN_VALUE;
                                this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
                                this.getHighSpeedVideoSizes = false;
                                return kotlin.Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        }
                        this.Camera2StreamConfigurationMap = Long.MIN_VALUE;
                        this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
                        this.getHighSpeedVideoSizes = false;
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function02 = (kotlin.jvm.functions.Function0) updatableAnimationState$animateToZero$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        function02.invoke();
                        this.Camera2StreamConfigurationMap = Long.MIN_VALUE;
                        this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
                        this.getHighSpeedVideoSizes = false;
                        return kotlin.Unit.INSTANCE;
                    }
                    float f = updatableAnimationState$animateToZero$1.getHighSpeedVideoSizes;
                    function0 = (kotlin.jvm.functions.Function0) updatableAnimationState$animateToZero$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function14 = (kotlin.jvm.functions.Function1) updatableAnimationState$animateToZero$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    scaleFactor = f;
                    function1 = function14;
                    function0.invoke();
                }
            }
            if (i != 0) {
            }
        } catch (java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = Long.MIN_VALUE;
            this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = false;
            throw th;
        }
        updatableAnimationState$animateToZero$1 = new androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1(this, continuation);
        java.lang.Object obj2 = updatableAnimationState$animateToZero$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updatableAnimationState$animateToZero$1.getHighSpeedVideoFpsRanges;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState, float f, kotlin.jvm.functions.Function1 function1, long j) {
        long roundToLong;
        if (updatableAnimationState.Camera2StreamConfigurationMap == Long.MIN_VALUE) {
            updatableAnimationState.Camera2StreamConfigurationMap = j;
        }
        androidx.compose.animation.core.AnimationVector1D animationVector1D = new androidx.compose.animation.core.AnimationVector1D(updatableAnimationState.value);
        if (f == 0.0f) {
            roundToLong = updatableAnimationState.getHighSpeedVideoFpsRanges.getDurationNanos(new androidx.compose.animation.core.AnimationVector1D(updatableAnimationState.value), Camera2StreamConfigurationMap, updatableAnimationState.getHighSpeedVideoFpsRangesFor);
        } else {
            roundToLong = kotlin.math.MathKt.roundToLong((j - updatableAnimationState.Camera2StreamConfigurationMap) / f);
        }
        androidx.compose.animation.core.VectorizedAnimationSpec<androidx.compose.animation.core.AnimationVector1D> vectorizedAnimationSpec = updatableAnimationState.getHighSpeedVideoFpsRanges;
        androidx.compose.animation.core.AnimationVector1D animationVector1D2 = animationVector1D;
        androidx.compose.animation.core.AnimationVector1D animationVector1D3 = Camera2StreamConfigurationMap;
        float value = vectorizedAnimationSpec.getValueFromNanos(roundToLong, animationVector1D2, animationVector1D3, updatableAnimationState.getHighSpeedVideoFpsRangesFor).getValue();
        updatableAnimationState.getHighSpeedVideoFpsRangesFor = updatableAnimationState.getHighSpeedVideoFpsRanges.getVelocityFromNanos(roundToLong, animationVector1D2, animationVector1D3, updatableAnimationState.getHighSpeedVideoFpsRangesFor);
        updatableAnimationState.Camera2StreamConfigurationMap = j;
        float f2 = updatableAnimationState.value;
        updatableAnimationState.value = value;
        function1.invoke(java.lang.Float.valueOf(f2 - value));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.UpdatableAnimationState updatableAnimationState, kotlin.jvm.functions.Function1 function1) {
        float f = updatableAnimationState.value;
        updatableAnimationState.value = 0.0f;
        function1.invoke(java.lang.Float.valueOf(f));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/foundation/gestures/UpdatableAnimationState$Companion;", "", "<init>", "()V", "", "", "getHighSpeedVideoFpsRanges", "(F)Z", "VisibilityThreshold", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Landroidx/compose/animation/core/AnimationVector1D;", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/AnimationVector1D;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public static boolean getHighSpeedVideoFpsRanges(float f) {
            return java.lang.Math.abs(f) < 0.01f;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
