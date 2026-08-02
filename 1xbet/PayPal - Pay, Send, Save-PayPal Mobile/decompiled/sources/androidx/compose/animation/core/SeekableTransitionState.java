package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \\*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002]\\B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\f\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0012\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\nJ\u0010\u0010\u0019\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0019\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ,\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00028\u00002\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001aH\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0010¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\"\u0010\bJ\u000f\u0010#\u001a\u00020\u0006H\u0000¢\u0006\u0004\b#\u0010\bJ\u000f\u0010$\u001a\u00020\u0006H\u0000¢\u0006\u0004\b$\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bR+\u0010\u0012\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u00008W@QX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0005R+\u0010.\u001a\u00028\u00002\u0006\u0010%\u001a\u00028\u00008W@QX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)\"\u0004\b-\u0010\u0005R\"\u0010/\u001a\u00028\u00008\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010)\"\u0004\b2\u0010\u0005R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\"\u00105\u001a\u00020\u000f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=R+\u0010\u0016\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00158G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010E\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010D8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010L\u001a\u00020K8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010\u0019\u001a\u00020P8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010\f\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u00106R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0T8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010U\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010WR \u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060X8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010Y\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010[R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060X8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010Z"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState;", "S", "Landroidx/compose/animation/core/TransitionState;", "initialState", "<init>", "(Ljava/lang/Object;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "()V", "getHighSpeedVideoFpsRanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "p0", "", "p1", "(Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;J)V", "targetState", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fraction", "seekTo", "(FLjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Transition;", "transition", "transitionConfigured$animation_core", "(Landroidx/compose/animation/core/Transition;)V", "transitionRemoved$animation_core", "observeTotalDuration$animation_core", "onTotalDurationChanged$animation_core", "<set-?>", "targetState$delegate", "Landroidx/compose/runtime/MutableState;", "getTargetState", "()Ljava/lang/Object;", "setTargetState$animation_core", "currentState$delegate", "getCurrentState", "setCurrentState$animation_core", "currentState", "composedTargetState", "Ljava/lang/Object;", "getComposedTargetState$animation_core", "setComposedTargetState$animation_core", "getOutputSizeshNQ4ISI", "Landroidx/compose/animation/core/Transition;", "totalDurationNanos", "J", "getTotalDurationNanos$animation_core", "()J", "setTotalDurationNanos$animation_core", "(J)V", "Lkotlin/Function0;", "getInputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "fraction$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getFraction", "()F", "setFraction", "(F)V", "Lkotlinx/coroutines/CancellableContinuation;", "compositionContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "getCompositionContinuation$animation_core", "()Lkotlinx/coroutines/CancellableContinuation;", "setCompositionContinuation$animation_core", "(Lkotlinx/coroutines/CancellableContinuation;)V", "Lkotlinx/coroutines/sync/Mutex;", "compositionContinuationMutex", "Lkotlinx/coroutines/sync/Mutex;", "getCompositionContinuationMutex$animation_core", "()Lkotlinx/coroutines/sync/Mutex;", "Landroidx/compose/animation/core/MutatorMutex;", "getHighSpeedVideoSizesFor", "Landroidx/compose/animation/core/MutatorMutex;", "getOutputMinFrameDuration", "Landroidx/collection/MutableObjectList;", "getOutputFormats", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "Lkotlin/Function1;", "getInputFormats", "Lkotlin/jvm/functions/Function1;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Companion", "SeekingAnimationState"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SeekableTransitionState<S> extends androidx.compose.animation.core.TransitionState<S> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> getInputSizeshNQ4ISI;
    private S composedTargetState;
    private kotlinx.coroutines.CancellableContinuation<? super S> compositionContinuation;
    private final kotlinx.coroutines.sync.Mutex compositionContinuationMutex;

    /* renamed from: currentState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentState;

    /* renamed from: fraction$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState fraction;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private float getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.animation.core.MutatorMutex getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.animation.core.Transition<S> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: targetState$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState targetState;
    private long totalDurationNanos;
    private static final androidx.compose.animation.core.SeekableTransitionState.Companion Companion = new androidx.compose.animation.core.SeekableTransitionState.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.animation.core.AnimationVector1D getHighSpeedVideoFpsRangesFor = new androidx.compose.animation.core.AnimationVector1D(0.0f);
    private static final androidx.compose.animation.core.AnimationVector1D getHighSpeedVideoSizes = new androidx.compose.animation.core.AnimationVector1D(1.0f);

    public SeekableTransitionState(S s) {
        super(null);
        this.targetState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
        this.currentState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
        this.composedTargetState = s;
        this.getHighSpeedVideoSizes = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.animation.core.SeekableTransitionState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.animation.core.SeekableTransitionState.getHighSpeedVideoSizes(androidx.compose.animation.core.SeekableTransitionState.this);
                return highSpeedVideoSizes;
            }
        };
        this.fraction = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.compositionContinuationMutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.getHighSpeedVideoFpsRangesFor = new androidx.compose.animation.core.MutatorMutex();
        this.Camera2StreamConfigurationMap = Long.MIN_VALUE;
        this.getHighSpeedVideoFpsRanges = new androidx.collection.MutableObjectList<>(0, 1, null);
        this.getHighSpeedVideoSizesFor = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.SeekableTransitionState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.SeekableTransitionState.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.SeekableTransitionState.this, ((java.lang.Long) obj).longValue());
                return highResolutionOutputSizeshNQ4ISI;
            }
        };
        this.getInputSizeshNQ4ISI = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.SeekableTransitionState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.animation.core.SeekableTransitionState.getHighSpeedVideoSizes(androidx.compose.animation.core.SeekableTransitionState.this, ((java.lang.Long) obj).longValue());
                return highSpeedVideoSizes;
            }
        };
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final S getTargetState() {
        return (S) this.targetState.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void setTargetState$animation_core(S s) {
        this.targetState.setValue(s);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final S getCurrentState() {
        return (S) this.currentState.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void setCurrentState$animation_core(S s) {
        this.currentState.setValue(s);
    }

    public final S getComposedTargetState$animation_core() {
        return this.composedTargetState;
    }

    public final void setComposedTargetState$animation_core(S s) {
        this.composedTargetState = s;
    }

    /* renamed from: getTotalDurationNanos$animation_core, reason: from getter */
    public final long getTotalDurationNanos() {
        return this.totalDurationNanos;
    }

    public final void setTotalDurationNanos$animation_core(long j) {
        this.totalDurationNanos = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.animation.core.SeekableTransitionState seekableTransitionState) {
        androidx.compose.animation.core.Transition<S> transition = seekableTransitionState.getHighResolutionOutputSizeshNQ4ISI;
        seekableTransitionState.totalDurationNanos = transition != null ? transition.getTotalDurationNanos() : 0L;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFraction(float f) {
        this.fraction.setFloatValue(f);
    }

    public final float getFraction() {
        return this.fraction.getFloatValue();
    }

    public final kotlinx.coroutines.CancellableContinuation<S> getCompositionContinuation$animation_core() {
        return this.compositionContinuation;
    }

    public final void setCompositionContinuation$animation_core(kotlinx.coroutines.CancellableContinuation<? super S> cancellableContinuation) {
        this.compositionContinuation = cancellableContinuation;
    }

    /* renamed from: getCompositionContinuationMutex$animation_core, reason: from getter */
    public final kotlinx.coroutines.sync.Mutex getCompositionContinuationMutex() {
        return this.compositionContinuationMutex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.SeekableTransitionState seekableTransitionState, long j) {
        seekableTransitionState.Camera2StreamConfigurationMap = j;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.animation.core.SeekableTransitionState seekableTransitionState, long j) {
        long j2 = seekableTransitionState.Camera2StreamConfigurationMap;
        seekableTransitionState.Camera2StreamConfigurationMap = j;
        long roundToLong = kotlin.math.MathKt.roundToLong((j - j2) / seekableTransitionState.getInputFormats);
        if (seekableTransitionState.getHighSpeedVideoFpsRanges.isNotEmpty()) {
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState> mutableObjectList = seekableTransitionState.getHighSpeedVideoFpsRanges;
            java.lang.Object[] objArr = mutableObjectList.content;
            int i = mutableObjectList._size;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState seekingAnimationState = (androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState) objArr[i3];
                Camera2StreamConfigurationMap(seekingAnimationState, roundToLong);
                seekingAnimationState.setComplete(true);
            }
            androidx.compose.animation.core.Transition<S> transition = seekableTransitionState.getHighResolutionOutputSizeshNQ4ISI;
            if (transition != null) {
                transition.updateInitialValues$animation_core();
            }
            androidx.collection.MutableObjectList<androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState> mutableObjectList2 = seekableTransitionState.getHighSpeedVideoFpsRanges;
            int i4 = mutableObjectList2._size;
            java.lang.Object[] objArr2 = mutableObjectList2.content;
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, mutableObjectList2._size);
            int first = until.getFirst();
            int last = until.getLast();
            if (first <= last) {
                while (true) {
                    objArr2[first - i2] = objArr2[first];
                    if (((androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState) objArr2[first]).getIsComplete()) {
                        i2++;
                    }
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
            kotlin.collections.ArraysKt.fill(objArr2, (java.lang.Object) null, i4 - i2, i4);
            mutableObjectList2._size -= i2;
        }
        androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState seekingAnimationState2 = seekableTransitionState.getOutputFormats;
        if (seekingAnimationState2 != null) {
            seekingAnimationState2.setDurationNanos(seekableTransitionState.totalDurationNanos);
            Camera2StreamConfigurationMap(seekingAnimationState2, roundToLong);
            seekableTransitionState.setFraction(seekingAnimationState2.getValue());
            if (seekingAnimationState2.getValue() == 1.0f) {
                seekableTransitionState.getOutputFormats = null;
            }
            seekableTransitionState.getHighSpeedVideoFpsRanges();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.compose.animation.core.Transition<S> transition = this.getHighResolutionOutputSizeshNQ4ISI;
        if (transition != null) {
            transition.clearInitialAnimations$animation_core();
        }
        this.getHighSpeedVideoFpsRanges.clear();
        if (this.getOutputFormats != null) {
            this.getOutputFormats = null;
            setFraction(1.0f);
            getHighSpeedVideoFpsRanges();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r10, r0) != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 seekableTransitionState$runAnimations$1;
        java.lang.Object coroutine_suspended;
        int i;
        if (continuation instanceof androidx.compose.animation.core.SeekableTransitionState$runAnimations$1) {
            seekableTransitionState$runAnimations$1 = (androidx.compose.animation.core.SeekableTransitionState$runAnimations$1) continuation;
            if ((seekableTransitionState$runAnimations$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                seekableTransitionState$runAnimations$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = seekableTransitionState$runAnimations$1.getHighSpeedVideoFpsRangesFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = seekableTransitionState$runAnimations$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.getHighSpeedVideoFpsRanges.isEmpty() && this.getOutputFormats == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    if (androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(seekableTransitionState$runAnimations$1.getContext()) == 0.0f) {
                        getHighResolutionOutputSizeshNQ4ISI();
                        this.Camera2StreamConfigurationMap = Long.MIN_VALUE;
                        return kotlin.Unit.INSTANCE;
                    }
                    if (this.Camera2StreamConfigurationMap == Long.MIN_VALUE) {
                        kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> function1 = this.getHighSpeedVideoSizesFor;
                        seekableTransitionState$runAnimations$1.getHighSpeedVideoSizes = 1;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                do {
                    if (!this.getHighSpeedVideoFpsRanges.isNotEmpty() || this.getOutputFormats != null) {
                        seekableTransitionState$runAnimations$1.getHighSpeedVideoSizes = 2;
                    } else {
                        this.Camera2StreamConfigurationMap = Long.MIN_VALUE;
                        return kotlin.Unit.INSTANCE;
                    }
                } while (Camera2StreamConfigurationMap(seekableTransitionState$runAnimations$1) != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        seekableTransitionState$runAnimations$1 = new androidx.compose.animation.core.SeekableTransitionState$runAnimations$1(this, continuation);
        java.lang.Object obj2 = seekableTransitionState$runAnimations$1.getHighSpeedVideoFpsRangesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = seekableTransitionState$runAnimations$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        do {
            if (!this.getHighSpeedVideoFpsRanges.isNotEmpty()) {
            }
            seekableTransitionState$runAnimations$1.getHighSpeedVideoSizes = 2;
        } while (Camera2StreamConfigurationMap(seekableTransitionState$runAnimations$1) != coroutine_suspended);
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (this.Camera2StreamConfigurationMap == Long.MIN_VALUE) {
            java.lang.Object withFrameNanos = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(this.getHighSpeedVideoSizesFor, continuation);
            return withFrameNanos == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withFrameNanos : kotlin.Unit.INSTANCE;
        }
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(continuation);
        return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object Camera2StreamConfigurationMap(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        float durationScale = androidx.compose.animation.core.SuspendAnimationKt.getDurationScale(continuation.getContext());
        if (durationScale <= 0.0f) {
            getHighResolutionOutputSizeshNQ4ISI();
            return kotlin.Unit.INSTANCE;
        }
        this.getInputFormats = durationScale;
        java.lang.Object withFrameNanos = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(this.getInputSizeshNQ4ISI, continuation);
        return withFrameNanos == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withFrameNanos : kotlin.Unit.INSTANCE;
    }

    private static void Camera2StreamConfigurationMap(androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState p0, long p1) {
        long progressNanos = p0.getProgressNanos() + p1;
        p0.setProgressNanos(progressNanos);
        long animationSpecDuration = p0.getAnimationSpecDuration();
        if (progressNanos >= animationSpecDuration) {
            p0.setValue(1.0f);
            return;
        }
        androidx.compose.animation.core.VectorizedAnimationSpec<androidx.compose.animation.core.AnimationVector1D> animationSpec = p0.getAnimationSpec();
        if (animationSpec != null) {
            androidx.compose.animation.core.AnimationVector1D start = p0.getStart();
            androidx.compose.animation.core.AnimationVector1D animationVector1D = getHighSpeedVideoSizes;
            androidx.compose.animation.core.AnimationVector1D initialVelocity = p0.getInitialVelocity();
            if (initialVelocity == null) {
                initialVelocity = getHighSpeedVideoFpsRangesFor;
            }
            p0.setValue(kotlin.ranges.RangesKt.coerceIn(animationSpec.getValueFromNanos(progressNanos, start, animationVector1D, initialVelocity).get$animation_core(0), 0.0f, 1.0f));
            return;
        }
        float f = progressNanos / animationSpecDuration;
        p0.setValue((p0.getStart().get$animation_core(0) * (1.0f - f)) + (f * 1.0f));
    }

    public final java.lang.Object snapTo(S s, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.animation.core.Transition<S> transition = this.getHighResolutionOutputSizeshNQ4ISI;
        if (transition == null) {
            return kotlin.Unit.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(getCurrentState(), s) && kotlin.jvm.internal.Intrinsics.areEqual(getTargetState(), s)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object mutate$default = androidx.compose.animation.core.MutatorMutex.mutate$default(this.getHighSpeedVideoFpsRangesFor, null, new androidx.compose.animation.core.SeekableTransitionState$snapTo$2(this, s, transition, null), continuation, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate$default : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object seekTo$default(androidx.compose.animation.core.SeekableTransitionState seekableTransitionState, float f, java.lang.Object obj, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        return seekableTransitionState.seekTo(f, obj, continuation);
    }

    public final java.lang.Object seekTo(float f, S s, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (0.0f > f || f > 1.0f) {
            androidx.compose.animation.core.PreconditionsKt.throwIllegalArgumentException("Expecting fraction between 0 and 1. Got ".concat(java.lang.String.valueOf(f)));
        }
        androidx.compose.animation.core.Transition<S> transition = this.getHighResolutionOutputSizeshNQ4ISI;
        if (transition == null) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object mutate$default = androidx.compose.animation.core.MutatorMutex.mutate$default(this.getHighSpeedVideoFpsRangesFor, null, new androidx.compose.animation.core.SeekableTransitionState$seekTo$3(s, getTargetState(), this, transition, f, null), continuation, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate$default : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        if (kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r2, null, r0, 1, null) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 seekableTransitionState$waitForCompositionAfterTargetStateChange$1;
        int i;
        java.lang.Object targetState;
        java.lang.Object obj;
        if (continuation instanceof androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) {
            seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = (androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) continuation;
            if ((seekableTransitionState$waitForCompositionAfterTargetStateChange$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj2 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    targetState = getTargetState();
                    kotlinx.coroutines.sync.Mutex mutex = this.compositionContinuationMutex;
                    seekableTransitionState$waitForCompositionAfterTargetStateChange$1.getHighSpeedVideoSizes = targetState;
                    seekableTransitionState$waitForCompositionAfterTargetStateChange$1.Camera2StreamConfigurationMap = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(obj2, obj)) {
                            this.Camera2StreamConfigurationMap = Long.MIN_VALUE;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("snapTo() was canceled because state was changed to ");
                            sb.append(obj2);
                            sb.append(" instead of ");
                            sb.append(obj);
                            throw new java.util.concurrent.CancellationException(sb.toString());
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    java.lang.Object obj3 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    targetState = obj3;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(targetState, this.composedTargetState)) {
                    kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.compositionContinuationMutex, null, 1, null);
                    return kotlin.Unit.INSTANCE;
                }
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1.getHighSpeedVideoSizes = targetState;
                seekableTransitionState$waitForCompositionAfterTargetStateChange$1.Camera2StreamConfigurationMap = 2;
                androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 seekableTransitionState$waitForCompositionAfterTargetStateChange$12 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1;
                kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(seekableTransitionState$waitForCompositionAfterTargetStateChange$12), 1);
                cancellableContinuationImpl.initCancellability();
                setCompositionContinuation$animation_core(cancellableContinuationImpl);
                kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(getCompositionContinuationMutex(), null, 1, null);
                java.lang.Object result = cancellableContinuationImpl.getResult();
                if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(seekableTransitionState$waitForCompositionAfterTargetStateChange$12);
                }
                if (result != coroutine_suspended) {
                    obj = targetState;
                    obj2 = result;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(obj2, obj)) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        seekableTransitionState$waitForCompositionAfterTargetStateChange$1 = new androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1(this, continuation);
        java.lang.Object obj22 = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = seekableTransitionState$waitForCompositionAfterTargetStateChange$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(targetState, this.composedTargetState)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (kotlinx.coroutines.sync.Mutex.DefaultImpls.lock$default(r2, null, r0, 1, null) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 seekableTransitionState$waitForComposition$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.Object targetState;
        java.lang.Object result;
        java.lang.Object obj;
        if (continuation instanceof androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1) {
            seekableTransitionState$waitForComposition$1 = (androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1) continuation;
            if ((seekableTransitionState$waitForComposition$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                seekableTransitionState$waitForComposition$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj2 = seekableTransitionState$waitForComposition$1.Camera2StreamConfigurationMap;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = seekableTransitionState$waitForComposition$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    targetState = getTargetState();
                    kotlinx.coroutines.sync.Mutex mutex = this.compositionContinuationMutex;
                    seekableTransitionState$waitForComposition$1.getHighSpeedVideoFpsRangesFor = targetState;
                    seekableTransitionState$waitForComposition$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = seekableTransitionState$waitForComposition$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        if (kotlin.jvm.internal.Intrinsics.areEqual(obj2, obj)) {
                            this.Camera2StreamConfigurationMap = Long.MIN_VALUE;
                            throw new java.util.concurrent.CancellationException("targetState while waiting for composition");
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    java.lang.Object obj3 = seekableTransitionState$waitForComposition$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    targetState = obj3;
                }
                seekableTransitionState$waitForComposition$1.getHighSpeedVideoFpsRangesFor = targetState;
                seekableTransitionState$waitForComposition$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 seekableTransitionState$waitForComposition$12 = seekableTransitionState$waitForComposition$1;
                kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(seekableTransitionState$waitForComposition$12), 1);
                cancellableContinuationImpl.initCancellability();
                setCompositionContinuation$animation_core(cancellableContinuationImpl);
                kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(getCompositionContinuationMutex(), null, 1, null);
                result = cancellableContinuationImpl.getResult();
                if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(seekableTransitionState$waitForComposition$12);
                }
                if (result != coroutine_suspended) {
                    obj = targetState;
                    obj2 = result;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(obj2, obj)) {
                    }
                }
                return coroutine_suspended;
            }
        }
        seekableTransitionState$waitForComposition$1 = new androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1(this, continuation);
        java.lang.Object obj22 = seekableTransitionState$waitForComposition$1.Camera2StreamConfigurationMap;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = seekableTransitionState$waitForComposition$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        seekableTransitionState$waitForComposition$1.getHighSpeedVideoFpsRangesFor = targetState;
        seekableTransitionState$waitForComposition$1.getHighResolutionOutputSizeshNQ4ISI = 2;
        androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 seekableTransitionState$waitForComposition$122 = seekableTransitionState$waitForComposition$1;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(seekableTransitionState$waitForComposition$122), 1);
        cancellableContinuationImpl2.initCancellability();
        setCompositionContinuation$animation_core(cancellableContinuationImpl2);
        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(getCompositionContinuationMutex(), null, 1, null);
        result = cancellableContinuationImpl2.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
        }
        if (result != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes() {
        androidx.compose.animation.core.Transition<S> transition = this.getHighResolutionOutputSizeshNQ4ISI;
        if (transition == null) {
            return;
        }
        androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState seekingAnimationState = this.getOutputFormats;
        if (seekingAnimationState == null) {
            if (this.totalDurationNanos <= 0 || getFraction() == 1.0f || kotlin.jvm.internal.Intrinsics.areEqual(getCurrentState(), getTargetState())) {
                seekingAnimationState = null;
            } else {
                seekingAnimationState = new androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState();
                seekingAnimationState.setValue(getFraction());
                long j = this.totalDurationNanos;
                seekingAnimationState.setDurationNanos(j);
                seekingAnimationState.setAnimationSpecDuration(kotlin.math.MathKt.roundToLong(j * (1.0d - getFraction())));
                seekingAnimationState.getStart().set$animation_core(0, getFraction());
            }
        }
        if (seekingAnimationState != null) {
            seekingAnimationState.setDurationNanos(this.totalDurationNanos);
            this.getHighSpeedVideoFpsRanges.add(seekingAnimationState);
            transition.setInitialAnimations$animation_core(seekingAnimationState);
        }
        this.getOutputFormats = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object animateTo$default(androidx.compose.animation.core.SeekableTransitionState seekableTransitionState, java.lang.Object obj, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = seekableTransitionState.getTargetState();
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = null;
        }
        return seekableTransitionState.animateTo(obj, finiteAnimationSpec, continuation);
    }

    public final java.lang.Object animateTo(S s, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.animation.core.Transition<S> transition = this.getHighResolutionOutputSizeshNQ4ISI;
        if (transition == null) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object mutate$default = androidx.compose.animation.core.MutatorMutex.mutate$default(this.getHighSpeedVideoFpsRangesFor, null, new androidx.compose.animation.core.SeekableTransitionState$animateTo$2(transition, this, s, finiteAnimationSpec, null), continuation, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate$default : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void transitionConfigured$animation_core(androidx.compose.animation.core.Transition<S> transition) {
        androidx.compose.animation.core.Transition<S> transition2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (transition2 != null && !kotlin.jvm.internal.Intrinsics.areEqual(transition, transition2)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(", new instance: ");
            sb.append(transition);
            androidx.compose.animation.core.PreconditionsKt.throwIllegalStateException(sb.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = transition;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void transitionRemoved$animation_core() {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        androidx.compose.animation.core.TransitionKt.getSeekableStateObserver().clear(this);
    }

    public final void observeTotalDuration$animation_core() {
        kotlin.jvm.functions.Function1 function1;
        androidx.compose.runtime.snapshots.SnapshotStateObserver seekableStateObserver = androidx.compose.animation.core.TransitionKt.getSeekableStateObserver();
        function1 = androidx.compose.animation.core.TransitionKt.getHighSpeedVideoFpsRanges;
        seekableStateObserver.observeReads(this, function1, this.getHighSpeedVideoSizes);
    }

    public final void onTotalDurationChanged$animation_core() {
        long j = this.totalDurationNanos;
        observeTotalDuration$animation_core();
        long j2 = this.totalDurationNanos;
        if (j != j2) {
            androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState seekingAnimationState = this.getOutputFormats;
            if (seekingAnimationState == null) {
                if (j2 != 0) {
                    getHighSpeedVideoFpsRanges();
                    return;
                }
                return;
            }
            long progressNanos = seekingAnimationState.getProgressNanos();
            long j3 = this.totalDurationNanos;
            if (progressNanos > j3) {
                getHighResolutionOutputSizeshNQ4ISI();
                return;
            }
            seekingAnimationState.setDurationNanos(j3);
            if (seekingAnimationState.getAnimationSpec() == null) {
                seekingAnimationState.setAnimationSpecDuration(kotlin.math.MathKt.roundToLong((1.0d - seekingAnimationState.getStart().get$animation_core(0)) * this.totalDurationNanos));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges() {
        androidx.compose.animation.core.Transition<S> transition = this.getHighResolutionOutputSizeshNQ4ISI;
        if (transition == null) {
            return;
        }
        transition.seekAnimations$animation_core(kotlin.math.MathKt.roundToLong(getFraction() * transition.getTotalDurationNanos()));
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u0010,\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\t\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR\"\u0010/\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010\t\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\r"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "progressNanos", "J", "getProgressNanos", "()J", "setProgressNanos", "(J)V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", "animationSpec", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;)V", "", "isComplete", "Z", "()Z", "setComplete", "(Z)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getValue", "()F", "setValue", "(F)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "Landroidx/compose/animation/core/AnimationVector1D;", "getStart", "()Landroidx/compose/animation/core/AnimationVector1D;", "setStart", "(Landroidx/compose/animation/core/AnimationVector1D;)V", "initialVelocity", "getInitialVelocity", "setInitialVelocity", "durationNanos", "getDurationNanos", "setDurationNanos", "animationSpecDuration", "getAnimationSpecDuration", "setAnimationSpecDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class SeekingAnimationState {
        public static final int $stable = 8;
        private androidx.compose.animation.core.VectorizedAnimationSpec<androidx.compose.animation.core.AnimationVector1D> animationSpec;
        private long animationSpecDuration;
        private long durationNanos;
        private androidx.compose.animation.core.AnimationVector1D initialVelocity;
        private boolean isComplete;
        private long progressNanos;
        private androidx.compose.animation.core.AnimationVector1D start = new androidx.compose.animation.core.AnimationVector1D(0.0f);
        private float value;

        public final long getProgressNanos() {
            return this.progressNanos;
        }

        public final void setProgressNanos(long j) {
            this.progressNanos = j;
        }

        public final androidx.compose.animation.core.VectorizedAnimationSpec<androidx.compose.animation.core.AnimationVector1D> getAnimationSpec() {
            return this.animationSpec;
        }

        public final void setAnimationSpec(androidx.compose.animation.core.VectorizedAnimationSpec<androidx.compose.animation.core.AnimationVector1D> vectorizedAnimationSpec) {
            this.animationSpec = vectorizedAnimationSpec;
        }

        /* renamed from: isComplete, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        public final void setComplete(boolean z) {
            this.isComplete = z;
        }

        public final float getValue() {
            return this.value;
        }

        public final void setValue(float f) {
            this.value = f;
        }

        public final androidx.compose.animation.core.AnimationVector1D getStart() {
            return this.start;
        }

        public final void setStart(androidx.compose.animation.core.AnimationVector1D animationVector1D) {
            this.start = animationVector1D;
        }

        public final androidx.compose.animation.core.AnimationVector1D getInitialVelocity() {
            return this.initialVelocity;
        }

        public final void setInitialVelocity(androidx.compose.animation.core.AnimationVector1D animationVector1D) {
            this.initialVelocity = animationVector1D;
        }

        public final long getDurationNanos() {
            return this.durationNanos;
        }

        public final void setDurationNanos(long j) {
            this.durationNanos = j;
        }

        public final long getAnimationSpecDuration() {
            return this.animationSpecDuration;
        }

        public final void setAnimationSpecDuration(long j) {
            this.animationSpecDuration = j;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("progress nanos: ");
            sb.append(this.progressNanos);
            sb.append(", animationSpec: ");
            sb.append(this.animationSpec);
            sb.append(", isComplete: ");
            sb.append(this.isComplete);
            sb.append(", value: ");
            sb.append(this.value);
            sb.append(", start: ");
            sb.append(this.start);
            sb.append(", initialVelocity: ");
            sb.append(this.initialVelocity);
            sb.append(", durationNanos: ");
            sb.append(this.durationNanos);
            sb.append(", animationSpecDuration: ");
            sb.append(this.animationSpecDuration);
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/core/AnimationVector1D;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/core/AnimationVector1D;", "getHighSpeedVideoSizes", "()Landroidx/compose/animation/core/AnimationVector1D;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class Companion {
        private Companion() {
        }

        public static androidx.compose.animation.core.AnimationVector1D getHighSpeedVideoSizes() {
            return androidx.compose.animation.core.SeekableTransitionState.getHighSpeedVideoFpsRangesFor;
        }

        public static androidx.compose.animation.core.AnimationVector1D getHighSpeedVideoFpsRanges() {
            return androidx.compose.animation.core.SeekableTransitionState.getHighSpeedVideoSizes;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
