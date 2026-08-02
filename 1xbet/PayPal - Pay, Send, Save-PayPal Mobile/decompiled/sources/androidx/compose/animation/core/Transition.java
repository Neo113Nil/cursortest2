package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\b\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001B1\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB#\b\u0011\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0010\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fB#\b\u0011\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\u000eJ\b\u0010T\u001a\u00020'H\u0002J\u001d\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020'2\u0006\u0010X\u001a\u00020YH\u0000¢\u0006\u0002\bZJ\u001d\u0010U\u001a\u00020V2\u0006\u0010[\u001a\u00020'2\u0006\u0010\\\u001a\u00020%H\u0000¢\u0006\u0002\bZJ\u0015\u0010]\u001a\u00020V2\u0006\u0010W\u001a\u00020'H\u0000¢\u0006\u0002\b^J\r\u0010_\u001a\u00020VH\u0000¢\u0006\u0002\b`J\r\u0010a\u001a\u00020VH\u0000¢\u0006\u0002\bbJ'\u0010c\u001a\u00020V2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u00100\u001a\u00020'H\u0007¢\u0006\u0004\bd\u0010eJ\u0019\u0010f\u001a\u00020%2\n\u0010g\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0002\bhJ\u0019\u0010i\u001a\u00020%2\n\u0010g\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0002\bjJ'\u0010k\u001a\u00020%2\u0018\u0010l\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030>R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0002\bmJ'\u0010n\u001a\u00020V2\u0018\u0010l\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030>R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0002\boJ\u0017\u0010p\u001a\u00020V2\u0006\u0010\u0017\u001a\u00028\u0000H\u0000¢\u0006\u0004\bq\u0010\u001aJ\u0017\u0010r\u001a\u00020V2\u0006\u0010\u0017\u001a\u00028\u0000H\u0001¢\u0006\u0004\bs\u0010tJ\u0015\u0010u\u001a\u00020V2\u0006\u00100\u001a\u00020'H\u0000¢\u0006\u0002\bvJ\u0015\u0010w\u001a\u00020V2\u0006\u0010x\u001a\u00020yH\u0000¢\u0006\u0002\bzJ\u0015\u0010{\u001a\u00020V2\u0006\u0010|\u001a\u00020YH\u0000¢\u0006\u0002\b}J\r\u0010~\u001a\u00020VH\u0000¢\u0006\u0002\b\u007fJ\u000f\u0010\u0080\u0001\u001a\u00020VH\u0000¢\u0006\u0003\b\u0081\u0001J\t\u0010\u0082\u0001\u001a\u00020\u0007H\u0016J\t\u0010\u0083\u0001\u001a\u00020VH\u0002J)\u0010n\u001a\u00020V2\u001a\u0010\u0084\u0001\u001a\u0015\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0085\u0001R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0002\boR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00008\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u001aR7\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b$\u0010&R+\u0010(\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00100\u001a\u00020'2\u0006\u0010/\u001a\u00020'8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R+\u00103\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020'8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010.\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R+\u00107\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\u001c\u001a\u0004\b8\u0010&\"\u0004\b9\u0010:R&\u0010<\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030>R\b\u0012\u0004\u0012\u00028\u00000\u00000=X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000=X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR)\u0010D\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030>R\b\u0012\u0004\u0012\u00028\u00000\u00000A8F¢\u0006\u0006\u001a\u0004\bE\u0010CR+\u0010F\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8G@AX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u0010\u001c\u001a\u0004\bF\u0010&\"\u0004\bG\u0010:R\u001a\u0010I\u001a\u00020'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010*\"\u0004\bK\u0010,R\u001a\u0010L\u001a\u00020%8FX\u0087\u0004¢\u0006\f\u0012\u0004\bM\u0010N\u001a\u0004\bO\u0010&R\u001b\u0010P\u001a\u00020'8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bQ\u0010*¨\u0006\u008a\u0001²\u0006\u000b\u0010\u008b\u0001\u001a\u00020%X\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/animation/core/Transition;", "S", "", "transitionState", "Landroidx/compose/animation/core/TransitionState;", "parentTransition", "label", "", "<init>", "(Landroidx/compose/animation/core/TransitionState;Landroidx/compose/animation/core/Transition;Ljava/lang/String;)V", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;)V", "getParentTransition", "()Landroidx/compose/animation/core/Transition;", "getLabel", "()Ljava/lang/String;", "currentState", "getCurrentState", "()Ljava/lang/Object;", "<set-?>", "targetState", "getTargetState", "setTargetState$animation_core", "(Ljava/lang/Object;)V", "targetState$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/animation/core/Transition$Segment;", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY, "getSegment", "()Landroidx/compose/animation/core/Transition$Segment;", "setSegment", "(Landroidx/compose/animation/core/Transition$Segment;)V", "segment$delegate", "isRunning", "", "()Z", "", "_playTimeNanos", "get_playTimeNanos", "()J", "set_playTimeNanos", "(J)V", "_playTimeNanos$delegate", "Landroidx/compose/runtime/MutableLongState;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "playTimeNanos", "getPlayTimeNanos", "setPlayTimeNanos", "startTimeNanos", "getStartTimeNanos$animation_core", "setStartTimeNanos$animation_core", "startTimeNanos$delegate", "updateChildrenNeeded", "getUpdateChildrenNeeded", "setUpdateChildrenNeeded", "(Z)V", "updateChildrenNeeded$delegate", "_animations", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "_transitions", "transitions", "", "getTransitions", "()Ljava/util/List;", "animations", "getAnimations", "isSeeking", "setSeeking$animation_core", "isSeeking$delegate", "lastSeekedTimeNanos", "getLastSeekedTimeNanos$animation_core", "setLastSeekedTimeNanos$animation_core", "hasInitialValueAnimations", "getHasInitialValueAnimations$annotations", "()V", "getHasInitialValueAnimations", "totalDurationNanos", "getTotalDurationNanos", "totalDurationNanos$delegate", "Landroidx/compose/runtime/State;", "calculateTotalDurationNanos", "onFrame", "", "frameTimeNanos", "durationScale", "", "onFrame$animation_core", "scaledPlayTimeNanos", "scaleToEnd", "onTransitionStart", "onTransitionStart$animation_core", "onDisposed", "onDisposed$animation_core", "onTransitionEnd", "onTransitionEnd$animation_core", "setPlaytimeAfterInitialAndTargetStateEstablished", "seek", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "addTransition", "transition", "addTransition$animation_core", "removeTransition", "removeTransition$animation_core", "addAnimation", "animation", "addAnimation$animation_core", "removeAnimation", "removeAnimation$animation_core", "updateTarget", "updateTarget$animation_core", "animateTo", "animateTo$animation_core", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "seekAnimations", "seekAnimations$animation_core", "setInitialAnimations", "animationState", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "setInitialAnimations$animation_core", "resetAnimationFraction", "fraction", "resetAnimationFraction$animation_core", "clearInitialAnimations", "clearInitialAnimations$animation_core", "updateInitialValues", "updateInitialValues$animation_core", "toString", "onChildAnimationUpdated", "deferredAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "TransitionAnimationState", "SegmentImpl", "Segment", "DeferredAnimation", "animation-core", "runFrameLoop"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Transition<S> {
    public static final int $stable = 0;
    private final androidx.compose.runtime.MutableLongState Camera2StreamConfigurationMap;
    private final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final androidx.compose.runtime.MutableState getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<?>> getHighSpeedVideoSizes;
    private long getHighSpeedVideoSizesFor;
    private final androidx.compose.animation.core.Transition<?> getInputFormats;
    private final androidx.compose.runtime.MutableState getInputSizeshNQ4ISI;
    private final androidx.compose.runtime.MutableLongState getOutputFormats;
    private final androidx.compose.runtime.MutableState getOutputMinFrameDuration;
    private final androidx.compose.runtime.MutableState getOutputMinFrameDurationlomOqCM;
    private final androidx.compose.runtime.State getOutputStallDuration;
    private final androidx.compose.animation.core.TransitionState<S> getOutputStallDurationlomOqCM;

    public static /* synthetic */ void getHasInitialValueAnimations$annotations() {
    }

    public Transition(androidx.compose.animation.core.TransitionState<S> transitionState, androidx.compose.animation.core.Transition<?> transition, java.lang.String str) {
        this.getOutputStallDurationlomOqCM = transitionState;
        this.getInputFormats = transition;
        this.getHighSpeedVideoFpsRanges = str;
        this.getOutputMinFrameDuration = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.getInputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new androidx.compose.animation.core.Transition.SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this.Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotLongStateKt.mutableLongStateOf(0L);
        this.getOutputFormats = androidx.compose.runtime.SnapshotLongStateKt.mutableLongStateOf(Long.MIN_VALUE);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.getOutputMinFrameDurationlomOqCM = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
        this.getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.getOutputStallDuration = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.animation.core.Transition$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                long highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.animation.core.Transition.getHighSpeedVideoFpsRanges(androidx.compose.animation.core.Transition.this);
                return java.lang.Long.valueOf(highSpeedVideoFpsRanges);
            }
        });
        transitionState.transitionConfigured$animation_core(this);
    }

    public /* synthetic */ Transition(androidx.compose.animation.core.TransitionState transitionState, androidx.compose.animation.core.Transition transition, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(transitionState, transition, (i & 4) != 0 ? null : str);
    }

    public final androidx.compose.animation.core.Transition<?> getParentTransition() {
        return this.getInputFormats;
    }

    /* renamed from: getLabel, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public /* synthetic */ Transition(androidx.compose.animation.core.TransitionState transitionState, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(transitionState, (i & 2) != 0 ? null : str);
    }

    public Transition(androidx.compose.animation.core.TransitionState<S> transitionState, java.lang.String str) {
        this(transitionState, null, str);
    }

    public Transition(S s, java.lang.String str) {
        this(new androidx.compose.animation.core.MutableTransitionState(s), null, str);
    }

    public /* synthetic */ Transition(androidx.compose.animation.core.MutableTransitionState mutableTransitionState, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableTransitionState, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Transition(androidx.compose.animation.core.MutableTransitionState<S> mutableTransitionState, java.lang.String str) {
        this(mutableTransitionState, null, str);
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableTransitionState, "");
    }

    public final S getCurrentState() {
        return this.getOutputStallDurationlomOqCM.getCurrentState();
    }

    public final S getTargetState() {
        return (S) this.getOutputMinFrameDuration.getValue();
    }

    public final void setTargetState$animation_core(S s) {
        this.getOutputMinFrameDuration.setValue(s);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition.Segment<S> segment) {
        this.getInputSizeshNQ4ISI.setValue(segment);
    }

    public final androidx.compose.animation.core.Transition.Segment<S> getSegment() {
        return (androidx.compose.animation.core.Transition.Segment) this.getInputSizeshNQ4ISI.getValue();
    }

    public final boolean isRunning() {
        return getStartTimeNanos$animation_core() != Long.MIN_VALUE;
    }

    private final long getHighSpeedVideoFpsRanges() {
        return this.Camera2StreamConfigurationMap.getLongValue();
    }

    private final void getHighSpeedVideoFpsRangesFor(long j) {
        this.Camera2StreamConfigurationMap.setLongValue(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getPlayTimeNanos() {
        androidx.compose.animation.core.Transition transition = this;
        while (true) {
            androidx.compose.animation.core.Transition transition2 = transition.getInputFormats;
            if (transition2 == null) {
                return transition.getHighSpeedVideoFpsRanges();
            }
            transition = transition2;
        }
    }

    public final void setPlayTimeNanos(long j) {
        if (this.getInputFormats == null) {
            getHighSpeedVideoFpsRangesFor(j);
        }
    }

    public final long getStartTimeNanos$animation_core() {
        return this.getOutputFormats.getLongValue();
    }

    public final void setStartTimeNanos$animation_core(long j) {
        this.getOutputFormats.setLongValue(j);
    }

    private final void getHighSpeedVideoSizes(boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getHighSpeedVideoSizes() {
        return ((java.lang.Boolean) this.getOutputMinFrameDurationlomOqCM.getValue()).booleanValue();
    }

    public final java.util.List<androidx.compose.animation.core.Transition<?>> getTransitions() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.util.List<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSeeking() {
        return ((java.lang.Boolean) this.getHighSpeedVideoFpsRangesFor.getValue()).booleanValue();
    }

    public final void setSeeking$animation_core(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.valueOf(z));
    }

    /* renamed from: getLastSeekedTimeNanos$animation_core, reason: from getter */
    public final long getGetHighSpeedVideoSizesFor() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final void setLastSeekedTimeNanos$animation_core(long j) {
        this.getHighSpeedVideoSizesFor = j;
    }

    public final boolean getHasInitialValueAnimations() {
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.getHighResolutionOutputSizeshNQ4ISI;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (snapshotStateList.get(i).getInitialValueState() != null) {
                return true;
            }
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<?>> snapshotStateList2 = this.getHighSpeedVideoSizes;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (snapshotStateList2.get(i2).getHasInitialValueAnimations()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getHighSpeedVideoFpsRanges(androidx.compose.animation.core.Transition transition) {
        return transition.Camera2StreamConfigurationMap();
    }

    public final long getTotalDurationNanos() {
        return ((java.lang.Number) this.getOutputStallDuration.getValue()).longValue();
    }

    private final long Camera2StreamConfigurationMap() {
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.getHighResolutionOutputSizeshNQ4ISI;
        int size = snapshotStateList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = java.lang.Math.max(j, snapshotStateList.get(i).getDurationNanos$animation_core());
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<?>> snapshotStateList2 = this.getHighSpeedVideoSizes;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = java.lang.Math.max(j, snapshotStateList2.get(i2).Camera2StreamConfigurationMap());
        }
        return j;
    }

    public final void onFrame$animation_core(long frameTimeNanos, float durationScale) {
        if (getStartTimeNanos$animation_core() == Long.MIN_VALUE) {
            onTransitionStart$animation_core(frameTimeNanos);
        }
        long startTimeNanos$animation_core = frameTimeNanos - getStartTimeNanos$animation_core();
        if (durationScale != 0.0f) {
            startTimeNanos$animation_core = kotlin.math.MathKt.roundToLong(startTimeNanos$animation_core / durationScale);
        }
        setPlayTimeNanos(startTimeNanos$animation_core);
        onFrame$animation_core(startTimeNanos$animation_core, durationScale == 0.0f);
    }

    public final void onFrame$animation_core(long scaledPlayTimeNanos, boolean scaleToEnd) {
        boolean z = true;
        if (getStartTimeNanos$animation_core() == Long.MIN_VALUE) {
            onTransitionStart$animation_core(scaledPlayTimeNanos);
        } else if (!this.getOutputStallDurationlomOqCM.isRunning$animation_core()) {
            this.getOutputStallDurationlomOqCM.setRunning$animation_core(true);
        }
        getHighSpeedVideoSizes(false);
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.getHighResolutionOutputSizeshNQ4ISI;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i);
            if (!transitionAnimationState.isFinished$animation_core()) {
                transitionAnimationState.onPlayTimeChanged$animation_core(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!transitionAnimationState.isFinished$animation_core()) {
                z = false;
            }
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<?>> snapshotStateList2 = this.getHighSpeedVideoSizes;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.animation.core.Transition<?> transition = snapshotStateList2.get(i2);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core(scaledPlayTimeNanos, scaleToEnd);
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(transition.getTargetState(), transition.getCurrentState())) {
                z = false;
            }
        }
        if (z) {
            onTransitionEnd$animation_core();
        }
    }

    public final void onTransitionStart$animation_core(long frameTimeNanos) {
        setStartTimeNanos$animation_core(frameTimeNanos);
        this.getOutputStallDurationlomOqCM.setRunning$animation_core(true);
    }

    public final void onDisposed$animation_core() {
        onTransitionEnd$animation_core();
        this.getOutputStallDurationlomOqCM.transitionRemoved$animation_core();
    }

    public final void onTransitionEnd$animation_core() {
        setStartTimeNanos$animation_core(Long.MIN_VALUE);
        androidx.compose.animation.core.TransitionState<S> transitionState = this.getOutputStallDurationlomOqCM;
        if (transitionState instanceof androidx.compose.animation.core.MutableTransitionState) {
            ((androidx.compose.animation.core.MutableTransitionState) transitionState).setCurrentState$animation_core(getTargetState());
        }
        setPlayTimeNanos(0L);
        this.getOutputStallDurationlomOqCM.setRunning$animation_core(false);
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<?>> snapshotStateList = this.getHighSpeedVideoSizes;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).onTransitionEnd$animation_core();
        }
    }

    public final void seek(S initialState, S targetState, long playTimeNanos) {
        setStartTimeNanos$animation_core(Long.MIN_VALUE);
        this.getOutputStallDurationlomOqCM.setRunning$animation_core(false);
        if (!isSeeking() || !kotlin.jvm.internal.Intrinsics.areEqual(getCurrentState(), initialState) || !kotlin.jvm.internal.Intrinsics.areEqual(getTargetState(), targetState)) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(getCurrentState(), initialState)) {
                androidx.compose.animation.core.TransitionState<S> transitionState = this.getOutputStallDurationlomOqCM;
                if (transitionState instanceof androidx.compose.animation.core.MutableTransitionState) {
                    ((androidx.compose.animation.core.MutableTransitionState) transitionState).setCurrentState$animation_core(initialState);
                }
            }
            setTargetState$animation_core(targetState);
            setSeeking$animation_core(true);
            getHighResolutionOutputSizeshNQ4ISI(new androidx.compose.animation.core.Transition.SegmentImpl(initialState, targetState));
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<?>> snapshotStateList = this.getHighSpeedVideoSizes;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.animation.core.Transition<?> transition = snapshotStateList.get(i);
            kotlin.jvm.internal.Intrinsics.checkNotNull(transition, "");
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), playTimeNanos);
            }
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).seekTo$animation_core(playTimeNanos);
        }
        this.getHighSpeedVideoSizesFor = playTimeNanos;
    }

    public final boolean addTransition$animation_core(androidx.compose.animation.core.Transition<?> transition) {
        return this.getHighSpeedVideoSizes.add(transition);
    }

    public final boolean removeTransition$animation_core(androidx.compose.animation.core.Transition<?> transition) {
        return this.getHighSpeedVideoSizes.remove(transition);
    }

    public final boolean addAnimation$animation_core(androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?> animation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.add(animation);
    }

    public final void removeAnimation$animation_core(androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?> animation) {
        this.getHighResolutionOutputSizeshNQ4ISI.remove(animation);
    }

    public final void updateTarget$animation_core(S targetState) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(getTargetState(), targetState)) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(new androidx.compose.animation.core.Transition.SegmentImpl(getTargetState(), targetState));
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getCurrentState(), getTargetState())) {
            this.getOutputStallDurationlomOqCM.setCurrentState$animation_core(getTargetState());
        }
        setTargetState$animation_core(targetState);
        if (!isRunning()) {
            getHighSpeedVideoSizes(true);
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.getHighResolutionOutputSizeshNQ4ISI;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).resetAnimation$animation_core();
        }
    }

    public final void animateTo$animation_core(final S s, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(s) : startRestartGroup.changedInstance(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1493585151, i2, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1180)");
            }
            if (isSeeking()) {
                startRestartGroup.startReplaceGroup(416369985);
            } else {
                startRestartGroup.startReplaceGroup(466062241);
                updateTarget$animation_core(s);
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.animation.core.Transition$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            boolean highResolutionOutputSizeshNQ4ISI;
                            highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.Transition.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition.this);
                            return java.lang.Boolean.valueOf(highResolutionOutputSizeshNQ4ISI);
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                if (!getHighResolutionOutputSizeshNQ4ISI((androidx.compose.runtime.State<java.lang.Boolean>) rememberedValue)) {
                    startRestartGroup.startReplaceGroup(416369985);
                } else {
                    startRestartGroup.startReplaceGroup(466470356);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue2;
                    boolean changedInstance = startRestartGroup.changedInstance(coroutineScope);
                    boolean z2 = i3 == 32;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((changedInstance | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.Transition$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                androidx.compose.runtime.DisposableEffectResult highSpeedVideoSizes;
                                highSpeedVideoSizes = androidx.compose.animation.core.Transition.getHighSpeedVideoSizes(kotlinx.coroutines.CoroutineScope.this, this);
                                return highSpeedVideoSizes;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.runtime.EffectsKt.DisposableEffect(coroutineScope, this, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, i3);
                }
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.animation.core.Transition$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    ((java.lang.Integer) obj2).intValue();
                    Camera2StreamConfigurationMap = androidx.compose.animation.core.Transition.Camera2StreamConfigurationMap(androidx.compose.animation.core.Transition.this, s, i, (androidx.compose.runtime.Composer) obj);
                    return Camera2StreamConfigurationMap;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Transition transition) {
        return !kotlin.jvm.internal.Intrinsics.areEqual(transition.getTargetState(), transition.getCurrentState()) || transition.isRunning() || transition.getHighSpeedVideoSizes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.runtime.DisposableEffectResult getHighSpeedVideoSizes(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.animation.core.Transition transition) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.animation.core.Transition$animateTo$1$1$1(transition, null), 1, null);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.core.Transition$animateTo$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
            }
        };
    }

    public final void seekAnimations$animation_core(long playTimeNanos) {
        if (getStartTimeNanos$animation_core() == Long.MIN_VALUE) {
            setStartTimeNanos$animation_core(playTimeNanos);
        }
        setPlayTimeNanos(playTimeNanos);
        getHighSpeedVideoSizes(false);
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.getHighResolutionOutputSizeshNQ4ISI;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).seekTo$animation_core(playTimeNanos);
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<?>> snapshotStateList2 = this.getHighSpeedVideoSizes;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.animation.core.Transition<?> transition = snapshotStateList2.get(i2);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(transition.getTargetState(), transition.getCurrentState())) {
                transition.seekAnimations$animation_core(playTimeNanos);
            }
        }
    }

    public final void setInitialAnimations$animation_core(androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState animationState) {
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.getHighResolutionOutputSizeshNQ4ISI;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).setInitialValueAnimation$animation_core(animationState);
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<?>> snapshotStateList2 = this.getHighSpeedVideoSizes;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).setInitialAnimations$animation_core(animationState);
        }
    }

    public final void resetAnimationFraction$animation_core(float fraction) {
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.getHighResolutionOutputSizeshNQ4ISI;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).resetAnimationValue$animation_core(fraction);
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<?>> snapshotStateList2 = this.getHighSpeedVideoSizes;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).resetAnimationFraction$animation_core(fraction);
        }
    }

    public final void clearInitialAnimations$animation_core() {
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.getHighResolutionOutputSizeshNQ4ISI;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).clearInitialAnimation$animation_core();
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<?>> snapshotStateList2 = this.getHighSpeedVideoSizes;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).clearInitialAnimations$animation_core();
        }
    }

    public final void updateInitialValues$animation_core() {
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.getHighResolutionOutputSizeshNQ4ISI;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            snapshotStateList.get(i).updateInitialValue$animation_core();
        }
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<?>> snapshotStateList2 = this.getHighSpeedVideoSizes;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            snapshotStateList2.get(i2).updateInitialValues$animation_core();
        }
    }

    public final java.lang.String toString() {
        java.util.List<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> animations = getAnimations();
        int size = animations.size();
        java.lang.String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = animations.get(i);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(transitionAnimationState);
            sb.append(", ");
            str = sb.toString();
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizes(true);
        if (isSeeking()) {
            androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this.getHighResolutionOutputSizeshNQ4ISI;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i);
                transitionAnimationState.getDurationNanos$animation_core();
                transitionAnimationState.seekTo$animation_core(this.getHighSpeedVideoSizesFor);
            }
            getHighSpeedVideoSizes(false);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020F2\u0006\u0010R\u001a\u000200H\u0000¢\u0006\u0002\bSJ\u0015\u0010T\u001a\u00020P2\u0006\u0010Q\u001a\u00020FH\u0000¢\u0006\u0002\bUJ\r\u0010V\u001a\u00020PH\u0000¢\u0006\u0002\bWJ!\u0010Y\u001a\u00020P2\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010Z\u001a\u000200H\u0002¢\u0006\u0002\u0010[J\r\u0010\\\u001a\u00020PH\u0000¢\u0006\u0002\b]J\u0015\u0010^\u001a\u00020P2\u0006\u0010_\u001a\u000207H\u0000¢\u0006\u0002\b`J\u0015\u0010a\u001a\u00020P2\u0006\u0010b\u001a\u00020*H\u0000¢\u0006\u0002\bcJ\r\u0010d\u001a\u00020PH\u0000¢\u0006\u0002\beJ\b\u0010f\u001a\u00020\nH\u0016J%\u0010g\u001a\u00020P2\u0006\u0010\u0012\u001a\u00028\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0000¢\u0006\u0004\bh\u0010iJ-\u0010j\u001a\u00020P2\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00028\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH\u0000¢\u0006\u0004\bk\u0010lR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R+\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0018\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 RC\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\"2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\"8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R+\u00101\u001a\u0002002\u0006\u0010\u0011\u001a\u0002008@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u0018\u001a\u0004\b2\u00103\"\u0004\b4\u00105R+\u00108\u001a\u0002072\u0006\u0010\u0011\u001a\u0002078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u000e\u0010?\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010@\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010\u0018\u001a\u0004\bA\u0010\u0014\"\u0004\bB\u0010\u0016R\u0010\u0010D\u001a\u00028\u0002X\u0082\u000e¢\u0006\u0004\n\u0002\u0010ER+\u0010G\u001a\u00020F2\u0006\u0010\u0011\u001a\u00020F8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u000e\u0010N\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006m"}, d2 = {"Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/State;", "initialValue", "initialVelocityVector", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "label", "", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "getLabel", "()Ljava/lang/String;", "<set-?>", "targetValue", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "targetValue$delegate", "Landroidx/compose/runtime/MutableState;", "defaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "animationSpec$delegate", "Landroidx/compose/animation/core/TargetBasedAnimation;", "animation", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation$delegate", "initialValueState", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "getInitialValueState$animation_core", "()Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "setInitialValueState$animation_core", "(Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;)V", "initialValueAnimation", "", "isFinished", "isFinished$animation_core", "()Z", "setFinished$animation_core", "(Z)V", "isFinished$delegate", "", "resetSnapValue", "getResetSnapValue$animation_core", "()F", "setResetSnapValue$animation_core", "(F)V", "resetSnapValue$delegate", "Landroidx/compose/runtime/MutableFloatState;", "useOnlyInitialValue", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue", "setValue$animation_core", "value$delegate", "velocityVector", "Landroidx/compose/animation/core/AnimationVector;", "", "durationNanos", "getDurationNanos$animation_core", "()J", "setDurationNanos$animation_core", "(J)V", "durationNanos$delegate", "Landroidx/compose/runtime/MutableLongState;", "isSeeking", "onPlayTimeChanged", "", "playTimeNanos", "scaleToEnd", "onPlayTimeChanged$animation_core", "seekTo", "seekTo$animation_core", "updateInitialValue", "updateInitialValue$animation_core", "interruptionSpec", "updateAnimation", "isInterrupted", "(Ljava/lang/Object;Z)V", "resetAnimation", "resetAnimation$animation_core", "resetAnimationValue", "fraction", "resetAnimationValue$animation_core", "setInitialValueAnimation", "animationState", "setInitialValueAnimation$animation_core", "clearInitialAnimation", "clearInitialAnimation$animation_core", "toString", "updateTargetValue", "updateTargetValue$animation_core", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateInitialAndTargetValue", "updateInitialAndTargetValue$animation_core", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class TransitionAnimationState<T, V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.runtime.State<T> {
        private androidx.compose.animation.core.TargetBasedAnimation<T, V> Camera2StreamConfigurationMap;

        /* renamed from: animation$delegate, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableState animation;

        /* renamed from: animationSpec$delegate, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableState animationSpec;

        /* renamed from: durationNanos$delegate, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableLongState durationNanos;
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.compose.animation.core.SpringSpec<T> getHighSpeedVideoFpsRangesFor;
        private final androidx.compose.animation.core.FiniteAnimationSpec<T> getHighSpeedVideoSizes;
        private boolean getHighSpeedVideoSizesFor;
        private V getInputSizeshNQ4ISI;
        private final androidx.compose.runtime.MutableState getOutputMinFrameDuration;
        private androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState initialValueState;

        /* renamed from: isFinished$delegate, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableState isFinished;
        private final java.lang.String label;

        /* renamed from: resetSnapValue$delegate, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableFloatState resetSnapValue;
        private final androidx.compose.animation.core.TwoWayConverter<T, V> typeConverter;

        /* renamed from: value$delegate, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableState value;

        public TransitionAnimationState(T t, V v, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, java.lang.String str) {
            T t2;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.getOutputMinFrameDuration = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            androidx.compose.animation.core.SpringSpec<T> spring$default = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            this.getHighSpeedVideoFpsRangesFor = spring$default;
            this.animationSpec = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(spring$default, null, 2, null);
            this.animation = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new androidx.compose.animation.core.TargetBasedAnimation(getAnimationSpec(), twoWayConverter, t, Camera2StreamConfigurationMap(), v), null, 2, null);
            this.isFinished = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
            this.resetSnapValue = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(-1.0f);
            this.value = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            this.getInputSizeshNQ4ISI = v;
            this.durationNanos = androidx.compose.runtime.SnapshotLongStateKt.mutableLongStateOf(getAnimation().getDurationNanos());
            java.lang.Float f = androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThresholdMap().get(twoWayConverter);
            if (f != null) {
                float floatValue = f.floatValue();
                V invoke = twoWayConverter.getConvertToVector().invoke(t);
                int size = invoke.getSize();
                for (int i = 0; i < size; i++) {
                    invoke.set$animation_core(i, floatValue);
                }
                t2 = this.typeConverter.getConvertFromVector().invoke(invoke);
            } else {
                t2 = null;
            }
            this.getHighSpeedVideoSizes = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, t2, 3, null);
        }

        public final androidx.compose.animation.core.TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final java.lang.String getLabel() {
            return this.label;
        }

        private final T Camera2StreamConfigurationMap() {
            return this.getOutputMinFrameDuration.getValue();
        }

        private final void getHighSpeedVideoSizes(T t) {
            this.getOutputMinFrameDuration.setValue(t);
        }

        private final void setAnimationSpec(androidx.compose.animation.core.FiniteAnimationSpec<T> finiteAnimationSpec) {
            this.animationSpec.setValue(finiteAnimationSpec);
        }

        public final androidx.compose.animation.core.FiniteAnimationSpec<T> getAnimationSpec() {
            return (androidx.compose.animation.core.FiniteAnimationSpec) this.animationSpec.getValue();
        }

        private final void setAnimation(androidx.compose.animation.core.TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation.setValue(targetBasedAnimation);
        }

        public final androidx.compose.animation.core.TargetBasedAnimation<T, V> getAnimation() {
            return (androidx.compose.animation.core.TargetBasedAnimation) this.animation.getValue();
        }

        /* renamed from: getInitialValueState$animation_core, reason: from getter */
        public final androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState getInitialValueState() {
            return this.initialValueState;
        }

        public final void setInitialValueState$animation_core(androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
            this.initialValueState = seekingAnimationState;
        }

        public final boolean isFinished$animation_core() {
            return ((java.lang.Boolean) this.isFinished.getValue()).booleanValue();
        }

        public final void setFinished$animation_core(boolean z) {
            this.isFinished.setValue(java.lang.Boolean.valueOf(z));
        }

        public final float getResetSnapValue$animation_core() {
            return this.resetSnapValue.getFloatValue();
        }

        public final void setResetSnapValue$animation_core(float f) {
            this.resetSnapValue.setFloatValue(f);
        }

        @Override // androidx.compose.runtime.State
        public final T getValue() {
            return this.value.getValue();
        }

        public final void setValue$animation_core(T t) {
            this.value.setValue(t);
        }

        public final long getDurationNanos$animation_core() {
            return this.durationNanos.getLongValue();
        }

        public final void setDurationNanos$animation_core(long j) {
            this.durationNanos.setLongValue(j);
        }

        public final void onPlayTimeChanged$animation_core(long playTimeNanos, boolean scaleToEnd) {
            if (scaleToEnd) {
                playTimeNanos = getAnimation().getDurationNanos();
            }
            setValue$animation_core(getAnimation().getValueFromNanos(playTimeNanos));
            this.getInputSizeshNQ4ISI = getAnimation().getVelocityVectorFromNanos(playTimeNanos);
            if (getAnimation().isFinishedFromNanos(playTimeNanos)) {
                setFinished$animation_core(true);
            }
        }

        public final void seekTo$animation_core(long playTimeNanos) {
            if (getResetSnapValue$animation_core() == -1.0f) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                if (kotlin.jvm.internal.Intrinsics.areEqual(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
                    setValue$animation_core(getAnimation().getTargetValue());
                } else {
                    setValue$animation_core(getAnimation().getValueFromNanos(playTimeNanos));
                    this.getInputSizeshNQ4ISI = getAnimation().getVelocityVectorFromNanos(playTimeNanos);
                }
            }
        }

        public final void updateInitialValue$animation_core() {
            androidx.compose.animation.core.TargetBasedAnimation<T, V> targetBasedAnimation;
            androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState seekingAnimationState = this.initialValueState;
            if (seekingAnimationState == null || (targetBasedAnimation = this.Camera2StreamConfigurationMap) == null) {
                return;
            }
            long roundToLong = kotlin.math.MathKt.roundToLong(seekingAnimationState.getDurationNanos() * seekingAnimationState.getValue());
            T valueFromNanos = targetBasedAnimation.getValueFromNanos(roundToLong);
            if (this.getHighSpeedVideoSizesFor) {
                getAnimation().setMutableTargetValue$animation_core(valueFromNanos);
            }
            getAnimation().setMutableInitialValue$animation_core(valueFromNanos);
            setDurationNanos$animation_core(getAnimation().getDurationNanos());
            if (getResetSnapValue$animation_core() == -2.0f || this.getHighSpeedVideoSizesFor) {
                setValue$animation_core(valueFromNanos);
            } else {
                seekTo$animation_core(androidx.compose.animation.core.Transition.this.getPlayTimeNanos());
            }
            if (roundToLong >= seekingAnimationState.getDurationNanos()) {
                this.initialValueState = null;
                this.Camera2StreamConfigurationMap = null;
            } else {
                seekingAnimationState.setComplete(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void getHighSpeedVideoFpsRangesFor(T t, boolean z) {
            androidx.compose.animation.core.FiniteAnimationSpec<T> delayed;
            androidx.compose.animation.core.TargetBasedAnimation<T, V> targetBasedAnimation = this.Camera2StreamConfigurationMap;
            if (kotlin.jvm.internal.Intrinsics.areEqual(targetBasedAnimation != null ? targetBasedAnimation.getTargetValue() : null, Camera2StreamConfigurationMap())) {
                setAnimation(new androidx.compose.animation.core.TargetBasedAnimation<>(this.getHighSpeedVideoSizes, this.typeConverter, t, t, androidx.compose.animation.core.AnimationVectorsKt.newInstance(this.getInputSizeshNQ4ISI)));
                this.getHighSpeedVideoSizesFor = true;
                setDurationNanos$animation_core(getAnimation().getDurationNanos());
                return;
            }
            androidx.compose.animation.core.FiniteAnimationSpec<T> animationSpec = (!z || this.getHighResolutionOutputSizeshNQ4ISI || (getAnimationSpec() instanceof androidx.compose.animation.core.SpringSpec)) ? getAnimationSpec() : this.getHighSpeedVideoSizes;
            if (androidx.compose.animation.core.Transition.this.getPlayTimeNanos() <= 0) {
                delayed = animationSpec;
            } else {
                delayed = androidx.compose.animation.core.AnimationSpecKt.delayed(animationSpec, androidx.compose.animation.core.Transition.this.getPlayTimeNanos());
            }
            setAnimation(new androidx.compose.animation.core.TargetBasedAnimation<>(delayed, this.typeConverter, t, Camera2StreamConfigurationMap(), this.getInputSizeshNQ4ISI));
            setDurationNanos$animation_core(getAnimation().getDurationNanos());
            this.getHighSpeedVideoSizesFor = false;
            androidx.compose.animation.core.Transition.this.getHighSpeedVideoFpsRangesFor();
        }

        public final void resetAnimation$animation_core() {
            setResetSnapValue$animation_core(-2.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void resetAnimationValue$animation_core(float fraction) {
            java.lang.Object targetValue;
            if (fraction == -4.0f || fraction == -5.0f) {
                androidx.compose.animation.core.TargetBasedAnimation<T, V> targetBasedAnimation = this.Camera2StreamConfigurationMap;
                if (targetBasedAnimation != null) {
                    getAnimation().setMutableInitialValue$animation_core(targetBasedAnimation.getTargetValue());
                    this.initialValueState = null;
                    this.Camera2StreamConfigurationMap = null;
                }
                if (fraction == -4.0f) {
                    targetValue = getAnimation().getInitialValue();
                } else {
                    targetValue = getAnimation().getTargetValue();
                }
                getAnimation().setMutableInitialValue$animation_core(targetValue);
                getAnimation().setMutableTargetValue$animation_core(targetValue);
                setValue$animation_core(targetValue);
                setDurationNanos$animation_core(getAnimation().getDurationNanos());
                return;
            }
            setResetSnapValue$animation_core(fraction);
        }

        public final void setInitialValueAnimation$animation_core(androidx.compose.animation.core.SeekableTransitionState.SeekingAnimationState animationState) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
                this.Camera2StreamConfigurationMap = getAnimation();
                this.initialValueState = animationState;
            }
            setAnimation(new androidx.compose.animation.core.TargetBasedAnimation<>(this.getHighSpeedVideoSizes, this.typeConverter, getValue(), getValue(), androidx.compose.animation.core.AnimationVectorsKt.newInstance(this.getInputSizeshNQ4ISI)));
            setDurationNanos$animation_core(getAnimation().getDurationNanos());
            this.getHighSpeedVideoSizesFor = true;
        }

        public final void clearInitialAnimation$animation_core() {
            this.Camera2StreamConfigurationMap = null;
            this.initialValueState = null;
            this.getHighSpeedVideoSizesFor = false;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("current value: ");
            sb.append(getValue());
            sb.append(", target: ");
            sb.append(Camera2StreamConfigurationMap());
            sb.append(", spec: ");
            sb.append(getAnimationSpec());
            return sb.toString();
        }

        public final void updateTargetValue$animation_core(T targetValue, androidx.compose.animation.core.FiniteAnimationSpec<T> animationSpec) {
            if (this.getHighSpeedVideoSizesFor) {
                androidx.compose.animation.core.TargetBasedAnimation<T, V> targetBasedAnimation = this.Camera2StreamConfigurationMap;
                if (kotlin.jvm.internal.Intrinsics.areEqual(targetValue, targetBasedAnimation != null ? targetBasedAnimation.getTargetValue() : null)) {
                    return;
                }
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(Camera2StreamConfigurationMap(), targetValue) && getResetSnapValue$animation_core() == -1.0f) {
                return;
            }
            getHighSpeedVideoSizes(targetValue);
            setAnimationSpec(animationSpec);
            getHighSpeedVideoFpsRangesFor(getResetSnapValue$animation_core() == -3.0f ? targetValue : getValue(), !isFinished$animation_core());
            setFinished$animation_core(getResetSnapValue$animation_core() == -3.0f);
            if (getResetSnapValue$animation_core() >= 0.0f) {
                setValue$animation_core(getAnimation().getValueFromNanos((long) (getAnimation().getDurationNanos() * getResetSnapValue$animation_core())));
            } else if (getResetSnapValue$animation_core() == -3.0f) {
                setValue$animation_core(targetValue);
            }
            this.getHighSpeedVideoSizesFor = false;
            setResetSnapValue$animation_core(-1.0f);
        }

        public final void updateInitialAndTargetValue$animation_core(T initialValue, T targetValue, androidx.compose.animation.core.FiniteAnimationSpec<T> animationSpec) {
            getHighSpeedVideoSizes(targetValue);
            setAnimationSpec(animationSpec);
            if (kotlin.jvm.internal.Intrinsics.areEqual(getAnimation().getInitialValue(), initialValue) && kotlin.jvm.internal.Intrinsics.areEqual(getAnimation().getTargetValue(), targetValue)) {
                return;
            }
            getHighSpeedVideoFpsRangesFor(initialValue, false);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00028\u00018\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00028\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011"}, d2 = {"Landroidx/compose/animation/core/Transition$SegmentImpl;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "p0", "p1", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getInitialState", "()Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getTargetState", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class SegmentImpl<S> implements androidx.compose.animation.core.Transition.Segment<S> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final S getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final S Camera2StreamConfigurationMap;

        public SegmentImpl(S s, S s2) {
            this.Camera2StreamConfigurationMap = s;
            this.getHighSpeedVideoFpsRangesFor = s2;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public final S getInitialState() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public final S getTargetState() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final boolean equals(java.lang.Object p0) {
            if (!(p0 instanceof androidx.compose.animation.core.Transition.Segment)) {
                return false;
            }
            androidx.compose.animation.core.Transition.Segment segment = (androidx.compose.animation.core.Transition.Segment) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(getInitialState(), segment.getInitialState()) && kotlin.jvm.internal.Intrinsics.areEqual(getTargetState(), segment.getTargetState());
        }

        public final int hashCode() {
            S initialState = getInitialState();
            int hashCode = initialState != null ? initialState.hashCode() : 0;
            S targetState = getTargetState();
            return (hashCode * 31) + (targetState != null ? targetState.hashCode() : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001c\u0010\u0005\u001a\u00020\u0004*\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00028\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00028\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$Segment;", "S", "", "targetState", "", "isTransitioningTo", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "getInitialState", "()Ljava/lang/Object;", "initialState", "getTargetState"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Segment<S> {
        S getInitialState();

        S getTargetState();

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static <S> boolean isTransitioningTo(androidx.compose.animation.core.Transition.Segment<S> segment, S s, S s2) {
                return androidx.compose.animation.core.Transition.Segment.super.isTransitioningTo(s, s2);
            }
        }

        default boolean isTransitioningTo(S s, S s2) {
            return kotlin.jvm.internal.Intrinsics.areEqual(s, getInitialState()) && kotlin.jvm.internal.Intrinsics.areEqual(s2, getTargetState());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001(B%\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJQ\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122#\u0010\u000f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000b¢\u0006\u0002\b\u000e2\u0017\u0010\u0011\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0010\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR{\u0010'\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001eR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001f2.\u0010 \u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u001eR\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000\u001f8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Lkotlin/ParameterName;", "targetValueByState", "Landroidx/compose/runtime/State;", "animate", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/State;", "", "setupSeeking$animation_core", "()V", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "Landroidx/compose/animation/core/Transition;", "<set-?>", "data$delegate", "Landroidx/compose/runtime/MutableState;", "getData$animation_core", "()Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "setData$animation_core", "(Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;)V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "DeferredAnimationData"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DeferredAnimation<T, V extends androidx.compose.animation.core.AnimationVector> {

        /* renamed from: data$delegate, reason: from kotlin metadata */
        private final androidx.compose.runtime.MutableState data = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        private final java.lang.String label;
        private final androidx.compose.animation.core.TwoWayConverter<T, V> typeConverter;

        public DeferredAnimation(androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, java.lang.String str) {
            this.typeConverter = twoWayConverter;
            this.label = str;
        }

        public final androidx.compose.animation.core.TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final java.lang.String getLabel() {
            return this.label;
        }

        public final androidx.compose.animation.core.Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core() {
            return (androidx.compose.animation.core.Transition.DeferredAnimation.DeferredAnimationData) this.data.getValue();
        }

        public final void setData$animation_core(androidx.compose.animation.core.Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data.setValue(deferredAnimationData);
        }

        @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004Bc\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012#\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b¢\u0006\u0002\b\u000b\u0012\u0017\u0010\u000e\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\r\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0013\u0010\u0014R-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R?\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b¢\u0006\u0002\b\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR3\u0010\u000e\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\r\u0012\u0004\u0012\u00028\u00030\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u0014\u0010!\u001a\u00028\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "animation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Lkotlin/ParameterName;", "targetValueByState", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY, "", "updateAnimationStates", "(Landroidx/compose/animation/core/Transition$Segment;)V", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "getAnimation", "()Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Lkotlin/jvm/functions/Function1;", "getTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "setTransitionSpec", "(Lkotlin/jvm/functions/Function1;)V", "getTargetValueByState", "setTargetValueByState", "getValue", "()Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public final class DeferredAnimationData<T, V extends androidx.compose.animation.core.AnimationVector> implements androidx.compose.runtime.State<T> {
            private final androidx.compose.animation.core.Transition<S>.TransitionAnimationState<T, V> animation;
            private kotlin.jvm.functions.Function1<? super S, ? extends T> targetValueByState;
            private kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Transition.Segment<S>, ? extends androidx.compose.animation.core.FiniteAnimationSpec<T>> transitionSpec;

            public DeferredAnimationData(androidx.compose.animation.core.Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Transition.Segment<S>, ? extends androidx.compose.animation.core.FiniteAnimationSpec<T>> function1, kotlin.jvm.functions.Function1<? super S, ? extends T> function12) {
                this.animation = transitionAnimationState;
                this.transitionSpec = function1;
                this.targetValueByState = function12;
            }

            public final androidx.compose.animation.core.Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            public final kotlin.jvm.functions.Function1<androidx.compose.animation.core.Transition.Segment<S>, androidx.compose.animation.core.FiniteAnimationSpec<T>> getTransitionSpec() {
                return this.transitionSpec;
            }

            public final void setTransitionSpec(kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Transition.Segment<S>, ? extends androidx.compose.animation.core.FiniteAnimationSpec<T>> function1) {
                this.transitionSpec = function1;
            }

            public final kotlin.jvm.functions.Function1<S, T> getTargetValueByState() {
                return this.targetValueByState;
            }

            public final void setTargetValueByState(kotlin.jvm.functions.Function1<? super S, ? extends T> function1) {
                this.targetValueByState = function1;
            }

            public final void updateAnimationStates(androidx.compose.animation.core.Transition.Segment<S> segment) {
                T invoke = this.targetValueByState.invoke(segment.getTargetState());
                if (androidx.compose.animation.core.Transition.this.isSeeking()) {
                    this.animation.updateInitialAndTargetValue$animation_core(this.targetValueByState.invoke(segment.getInitialState()), invoke, this.transitionSpec.invoke(segment));
                } else {
                    this.animation.updateTargetValue$animation_core(invoke, this.transitionSpec.invoke(segment));
                }
            }

            @Override // androidx.compose.runtime.State
            public final T getValue() {
                updateAnimationStates(androidx.compose.animation.core.Transition.this.getSegment());
                return this.animation.getValue();
            }
        }

        public final androidx.compose.runtime.State<T> animate(kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Transition.Segment<S>, ? extends androidx.compose.animation.core.FiniteAnimationSpec<T>> transitionSpec, kotlin.jvm.functions.Function1<? super S, ? extends T> targetValueByState) {
            androidx.compose.animation.core.Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core = getData$animation_core();
            if (data$animation_core == null) {
                androidx.compose.animation.core.Transition<S> transition = androidx.compose.animation.core.Transition.this;
                androidx.compose.animation.core.Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData = new androidx.compose.animation.core.Transition.DeferredAnimation.DeferredAnimationData<>(transition.new TransitionAnimationState(targetValueByState.invoke(transition.getCurrentState()), androidx.compose.animation.core.AnimationStateKt.createZeroVectorFrom(this.typeConverter, targetValueByState.invoke(androidx.compose.animation.core.Transition.this.getCurrentState())), this.typeConverter, this.label), transitionSpec, targetValueByState);
                androidx.compose.animation.core.Transition<S> transition2 = androidx.compose.animation.core.Transition.this;
                setData$animation_core(deferredAnimationData);
                transition2.addAnimation$animation_core(deferredAnimationData.getAnimation());
                data$animation_core = deferredAnimationData;
            }
            androidx.compose.animation.core.Transition<S> transition3 = androidx.compose.animation.core.Transition.this;
            data$animation_core.setTargetValueByState(targetValueByState);
            data$animation_core.setTransitionSpec(transitionSpec);
            data$animation_core.updateAnimationStates(transition3.getSegment());
            return data$animation_core;
        }

        public final void setupSeeking$animation_core() {
            androidx.compose.animation.core.Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core = getData$animation_core();
            if (data$animation_core != null) {
                androidx.compose.animation.core.Transition<S> transition = androidx.compose.animation.core.Transition.this;
                data$animation_core.getAnimation().updateInitialAndTargetValue$animation_core(data$animation_core.getTargetValueByState().invoke(transition.getSegment().getInitialState()), data$animation_core.getTargetValueByState().invoke(transition.getSegment().getTargetState()), data$animation_core.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    public final void removeAnimation$animation_core(androidx.compose.animation.core.Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        androidx.compose.animation.core.Transition<S>.TransitionAnimationState<?, ?> animation;
        androidx.compose.animation.core.Transition<S>.DeferredAnimationData<?, V>.DeferredAnimationData<?, ?> data$animation_core = deferredAnimation.getData$animation_core();
        if (data$animation_core == null || (animation = data$animation_core.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core(animation);
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.State<java.lang.Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.animation.core.Transition transition, java.lang.Object obj, int i, androidx.compose.runtime.Composer composer) {
        transition.animateTo$animation_core(obj, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
