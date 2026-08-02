package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u0080\u0001*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0080\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bB*\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0017\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u0004\u0010\rB:\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0019\b\u0002\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u0004\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00182\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001bH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fH\u0087@¢\u0006\u0004\b\u001d\u0010 JT\u0010(\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020!28\u0010'\u001a4\b\u0001\u0012\u0004\u0012\u00020$\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180%\u0012\u0006\u0012\u0004\u0018\u00010\u00020#¢\u0006\u0002\b&H\u0086@¢\u0006\u0004\b(\u0010)Jg\u0010(\u001a\u00020\u00182\u0006\u0010*\u001a\u00028\u00002\b\b\u0002\u0010\"\u001a\u00020!2C\u0010'\u001a?\b\u0001\u0012\u0004\u0012\u00020$\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\n\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180%\u0012\u0006\u0012\u0004\u0018\u00010\u00020+¢\u0006\u0002\b&H\u0086@¢\u0006\u0004\b(\u0010,J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0000¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f¢\u0006\u0004\b0\u0010/J\u0017\u00102\u001a\u00020\u000b2\u0006\u00101\u001a\u00028\u0000H\u0002¢\u0006\u0004\b2\u00103R3\u0010\f\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u000b0\t8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R3\u00109\u001a\u0013\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\u000f0\t8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000f0<8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR<\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b8\u0007@AX\u0087.¢\u0006\u0018\n\u0004\bD\u0010E\u0012\u0004\bJ\u0010K\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR<\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000f0L2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000f0L8\u0007@AX\u0087.¢\u0006\u0018\n\u0004\bM\u0010N\u0012\u0004\bS\u0010K\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010W\u001a\u00020\u000b8AX\u0080\u0004¢\u0006\f\u0012\u0004\bV\u0010K\u001a\u0004\bT\u0010UR\u0014\u00102\u001a\u00020X8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR+\u0010a\u001a\u00028\u00002\u0006\u0010[\u001a\u00028\u00008G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010\u0005R+\u0010e\u001a\u00028\u00002\u0006\u0010[\u001a\u00028\u00008G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010]\u001a\u0004\bc\u0010_\"\u0004\bd\u0010\u0005R\u001b\u0010*\u001a\u00028\u00008GX\u0087\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010_R+\u0010n\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010\u0011\"\u0004\bl\u0010mR\u0011\u0010o\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\bo\u0010UR!\u0010\u0014\u001a\u00020\u000f8GX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bp\u0010g\u0012\u0004\br\u0010K\u001a\u0004\bq\u0010\u0011R+\u0010v\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u000f8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bs\u0010j\u001a\u0004\bt\u0010\u0011\"\u0004\bu\u0010mR/\u0010x\u001a\u0004\u0018\u00018\u00002\b\u00101\u001a\u0004\u0018\u00018\u00008C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010]\u001a\u0004\bw\u0010_\"\u0004\bw\u0010\u0005R7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\by\u0010]\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0014\u0010w\u001a\u00020~8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bw\u0010\u007f"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "T", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "anchors", "(Ljava/lang/Object;Landroidx/compose/foundation/gestures/DraggableAnchors;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "confirmValueChange", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Landroidx/compose/foundation/gestures/DraggableAnchors;Lkotlin/jvm/functions/Function1;)V", "", "requireOffset", "()F", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "progress", "(Ljava/lang/Object;Ljava/lang/Object;)F", "newAnchors", "newTarget", "", "updateAnchors", "(Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;)V", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "settle", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "anchoredDrag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "Lkotlin/Function4;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "newOffsetForDelta$foundation", "(F)F", "dispatchRawDelta", "p0", "Camera2StreamConfigurationMap", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function1;", "getConfirmValueChange$foundation", "()Lkotlin/jvm/functions/Function1;", "setConfirmValueChange$foundation", "(Lkotlin/jvm/functions/Function1;)V", "positionalThreshold", "getPositionalThreshold$foundation", "setPositionalThreshold$foundation", "Lkotlin/Function0;", "velocityThreshold", "Lkotlin/jvm/functions/Function0;", "getVelocityThreshold$foundation", "()Lkotlin/jvm/functions/Function0;", "setVelocityThreshold$foundation", "(Lkotlin/jvm/functions/Function0;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "getSnapAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "setSnapAnimationSpec$foundation", "(Landroidx/compose/animation/core/AnimationSpec;)V", "getSnapAnimationSpec$annotations", "()V", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "getDecayAnimationSpec", "()Landroidx/compose/animation/core/DecayAnimationSpec;", "setDecayAnimationSpec$foundation", "(Landroidx/compose/animation/core/DecayAnimationSpec;)V", "getDecayAnimationSpec$annotations", "getUsePreModifierChangeBehavior$foundation", "()Z", "getUsePreModifierChangeBehavior$foundation$annotations", "usePreModifierChangeBehavior", "Landroidx/compose/foundation/MutatorMutex;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/MutatorMutex;", "<set-?>", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "currentValue", "settledValue$delegate", "getSettledValue", "setSettledValue", "settledValue", "targetValue$delegate", "Landroidx/compose/runtime/State;", "getTargetValue", "offset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getOffset", "setOffset", "(F)V", "offset", "isAnimationRunning", "progress$delegate", "getProgress", "getProgress$annotations", "lastVelocity$delegate", "getLastVelocity", "setLastVelocity", "lastVelocity", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "anchors$delegate", "getAnchors", "()Landroidx/compose/foundation/gestures/DraggableAnchors;", "setAnchors", "(Landroidx/compose/foundation/gestures/DraggableAnchors;)V", "Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState$anchoredDragScope$1;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.gestures.AnchoredDraggableState.Companion INSTANCE = new androidx.compose.foundation.gestures.AnchoredDraggableState.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getHighSpeedVideoSizes;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState anchors;
    private kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> confirmValueChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentValue;
    public androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.MutatorMutex Camera2StreamConfigurationMap;
    private final androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1 getHighSpeedVideoFpsRangesFor;

    /* renamed from: lastVelocity$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState lastVelocity;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState offset;
    public kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> positionalThreshold;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State progress;

    /* renamed from: settledValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState settledValue;
    public androidx.compose.animation.core.AnimationSpec<java.lang.Float> snapAnimationSpec;

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State targetValue;
    public kotlin.jvm.functions.Function0<java.lang.Float> velocityThreshold;

    public static /* synthetic */ boolean $r8$lambda$5n_ZSszvkTqHfpdkdtW9_hEwSbk(java.lang.Object obj) {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$FQUuk0_7PHLergGgnm9ayIShNM8(java.lang.Object obj) {
        return true;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to AnchoredDraggableDefaults.flingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
    public static /* synthetic */ void getDecayAnimationSpec$annotations() {
    }

    @kotlin.Deprecated(message = "Use the progress function to query the progress between two specified anchors.", replaceWith = @kotlin.ReplaceWith(expression = "progress(state.settledValue, state.targetValue)", imports = {}))
    public static /* synthetic */ void getProgress$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to AnchoredDraggableDefaults.flingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
    public static /* synthetic */ void getSnapAnimationSpec$annotations() {
    }

    public static /* synthetic */ void getUsePreModifierChangeBehavior$foundation$annotations() {
    }

    public AnchoredDraggableState(T t) {
        this.confirmValueChange = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableState.$r8$lambda$FQUuk0_7PHLergGgnm9ayIShNM8(obj));
            }
        };
        this.Camera2StreamConfigurationMap = new androidx.compose.foundation.MutatorMutex();
        this.currentValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.settledValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.targetValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.Object Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.AnchoredDraggableState.Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.AnchoredDraggableState.this);
                return Camera2StreamConfigurationMap;
            }
        });
        this.offset = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                float highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.AnchoredDraggableState.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.AnchoredDraggableState.this);
                return java.lang.Float.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
        });
        this.lastVelocity = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.foundation.gestures.AnchoredDraggableKt.getHighSpeedVideoFpsRangesFor(), null, 2, null);
        this.getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1(this);
    }

    public AnchoredDraggableState(T t, androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors) {
        this(t);
        setAnchors(draggableAnchors);
        Camera2StreamConfigurationMap((androidx.compose.foundation.gestures.AnchoredDraggableState<T>) t);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = androidx.compose.material3.internal.DraggableAnchorsKt.ConfirmValueChangeDeprecated)
    public AnchoredDraggableState(T t, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        this(t);
        this.confirmValueChange = function1;
    }

    public /* synthetic */ AnchoredDraggableState(java.lang.Object obj, androidx.compose.foundation.gestures.DraggableAnchors draggableAnchors, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, draggableAnchors, (i & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableState.$r8$lambda$5n_ZSszvkTqHfpdkdtW9_hEwSbk(obj2));
            }
        } : function1);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = androidx.compose.material3.internal.DraggableAnchorsKt.ConfirmValueChangeDeprecated)
    public AnchoredDraggableState(T t, androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        this(t, function1);
        setAnchors(draggableAnchors);
        Camera2StreamConfigurationMap((androidx.compose.foundation.gestures.AnchoredDraggableState<T>) t);
    }

    public final kotlin.jvm.functions.Function1<T, java.lang.Boolean> getConfirmValueChange$foundation() {
        return this.confirmValueChange;
    }

    public final void setConfirmValueChange$foundation(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        this.confirmValueChange = function1;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> getPositionalThreshold$foundation() {
        kotlin.jvm.functions.Function1 function1 = this.positionalThreshold;
        if (function1 != null) {
            return function1;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setPositionalThreshold$foundation(kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1) {
        this.positionalThreshold = function1;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Float> getVelocityThreshold$foundation() {
        kotlin.jvm.functions.Function0<java.lang.Float> function0 = this.velocityThreshold;
        if (function0 != null) {
            return function0;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setVelocityThreshold$foundation(kotlin.jvm.functions.Function0<java.lang.Float> function0) {
        this.velocityThreshold = function0;
    }

    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getSnapAnimationSpec() {
        androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec = this.snapAnimationSpec;
        if (animationSpec != null) {
            return animationSpec;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setSnapAnimationSpec$foundation(androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec) {
        this.snapAnimationSpec = animationSpec;
    }

    public final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> getDecayAnimationSpec() {
        androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec = this.decayAnimationSpec;
        if (decayAnimationSpec != null) {
            return decayAnimationSpec;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setDecayAnimationSpec$foundation(androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec) {
        this.decayAnimationSpec = decayAnimationSpec;
    }

    public final boolean getUsePreModifierChangeBehavior$foundation() {
        return (this.positionalThreshold == null || this.velocityThreshold == null || this.snapAnimationSpec == null || this.decayAnimationSpec == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSettledValue(T t) {
        this.settledValue.setValue(t);
    }

    public final T getSettledValue() {
        return this.settledValue.getValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState) {
        java.lang.Object highSpeedVideoFpsRangesFor = anchoredDraggableState.getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor != null) {
            return highSpeedVideoFpsRangesFor;
        }
        if (!java.lang.Float.isNaN(anchoredDraggableState.getOffset())) {
            T closestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
            return closestAnchor == null ? anchoredDraggableState.getCurrentValue() : closestAnchor;
        }
        return anchoredDraggableState.getCurrentValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(float f) {
        this.offset.setFloatValue(f);
    }

    public final float getOffset() {
        return this.offset.getFloatValue();
    }

    public final float requireOffset() {
        if (java.lang.Float.isNaN(getOffset())) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return getOffset();
    }

    public final boolean isAnimationRunning() {
        return getHighSpeedVideoFpsRangesFor() != null;
    }

    public final float progress(T from, T to) {
        float positionOf = getAnchors().positionOf(from);
        float positionOf2 = getAnchors().positionOf(to);
        float coerceIn = (kotlin.ranges.RangesKt.coerceIn(getOffset(), java.lang.Math.min(positionOf, positionOf2), java.lang.Math.max(positionOf, positionOf2)) - positionOf) / (positionOf2 - positionOf);
        if (java.lang.Float.isNaN(coerceIn)) {
            return 1.0f;
        }
        if (coerceIn < 1.0E-6f) {
            return 0.0f;
        }
        if (coerceIn > 0.999999f) {
            return 1.0f;
        }
        return java.lang.Math.abs(coerceIn);
    }

    public final float getProgress() {
        return ((java.lang.Number) this.progress.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState) {
        float positionOf = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getSettledValue());
        float positionOf2 = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getTargetValue()) - positionOf;
        float abs = java.lang.Math.abs(positionOf2);
        if (java.lang.Float.isNaN(abs) || abs <= 1.0E-6f) {
            return 1.0f;
        }
        float requireOffset = (anchoredDraggableState.requireOffset() - positionOf) / positionOf2;
        if (requireOffset < 1.0E-6f) {
            return 0.0f;
        }
        if (requireOffset > 0.999999f) {
            return 1.0f;
        }
        return requireOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f) {
        this.lastVelocity.setFloatValue(f);
    }

    public final float getLastVelocity() {
        return this.lastVelocity.getFloatValue();
    }

    private final T getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoSizes.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(T t) {
        this.getHighSpeedVideoSizes.setValue(t);
    }

    private final void setAnchors(androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors) {
        this.anchors.setValue(draggableAnchors);
    }

    public final androidx.compose.foundation.gestures.DraggableAnchors<T> getAnchors() {
        return (androidx.compose.foundation.gestures.DraggableAnchors) this.anchors.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, androidx.compose.foundation.gestures.DraggableAnchors draggableAnchors, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 2) != 0 && (java.lang.Float.isNaN(anchoredDraggableState.getOffset()) || (obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset())) == null)) {
            obj = anchoredDraggableState.getTargetValue();
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    public final void updateAnchors(androidx.compose.foundation.gestures.DraggableAnchors<T> newAnchors, T newTarget) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(getAnchors(), newAnchors)) {
            return;
        }
        setAnchors(newAnchors);
        if (Camera2StreamConfigurationMap((androidx.compose.foundation.gestures.AnchoredDraggableState<T>) newTarget)) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(newTarget);
    }

    public final java.lang.Object settle(androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        T currentValue = getCurrentValue();
        T closestAnchor = getAnchors().closestAnchor(requireOffset());
        if (closestAnchor != null && this.confirmValueChange.invoke(closestAnchor).booleanValue()) {
            java.lang.Object animateTo = androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(this, closestAnchor, animationSpec, continuation);
            return animateTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : kotlin.Unit.INSTANCE;
        }
        java.lang.Object animateTo2 = androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(this, currentValue, animationSpec, continuation);
        return animateTo2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo2 : kotlin.Unit.INSTANCE;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "settle does not accept a velocity anymore. Please use FlingBehavior#performFling instead. See AnchoredDraggableSample.kt for example usages.")
    public final java.lang.Object settle(float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        if (!getUsePreModifierChangeBehavior$foundation()) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        T currentValue = getCurrentValue();
        java.lang.Object highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.AnchoredDraggableKt.getHighSpeedVideoFpsRangesFor(getAnchors(), requireOffset(), f, getPositionalThreshold$foundation(), getVelocityThreshold$foundation());
        if (this.confirmValueChange.invoke(highSpeedVideoFpsRangesFor).booleanValue()) {
            return androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay$default(this, highSpeedVideoFpsRangesFor, f, null, null, continuation, 12, null);
        }
        return androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay$default(this, currentValue, f, null, null, continuation, 12, null);
    }

    public static /* synthetic */ java.lang.Object anchoredDrag$default(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function3 function3, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, function3, continuation);
    }

    public final java.lang.Object anchoredDrag(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.AnchoredDragScope, ? super androidx.compose.foundation.gestures.DraggableAnchors<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object mutate = this.Camera2StreamConfigurationMap.mutate(mutatePriority, new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2(this, function3, null), continuation);
        return mutate == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object anchoredDrag(T t, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.gestures.AnchoredDragScope, ? super androidx.compose.foundation.gestures.DraggableAnchors<T>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function4, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        int i;
        try {
            if (continuation instanceof androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3) {
                anchoredDraggableState$anchoredDrag$3 = (androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3) continuation;
                if ((anchoredDraggableState$anchoredDrag$3.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableState$anchoredDrag$3.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = anchoredDraggableState$anchoredDrag$3.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anchoredDraggableState$anchoredDrag$3.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (getAnchors().hasPositionFor(t)) {
                            androidx.compose.foundation.MutatorMutex mutatorMutex = this.Camera2StreamConfigurationMap;
                            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 anchoredDraggableState$anchoredDrag$4 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4(this, t, function4, null);
                            anchoredDraggableState$anchoredDrag$3.getHighResolutionOutputSizeshNQ4ISI = 1;
                            if (mutatorMutex.mutate(mutatePriority, anchoredDraggableState$anchoredDrag$4, anchoredDraggableState$anchoredDrag$3) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (this.confirmValueChange.invoke(t).booleanValue()) {
                                setSettledValue(t);
                                setCurrentValue(t);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return kotlin.Unit.INSTANCE;
        } finally {
            getHighSpeedVideoFpsRangesFor(null);
        }
        anchoredDraggableState$anchoredDrag$3 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3(this, continuation);
        java.lang.Object obj2 = anchoredDraggableState$anchoredDrag$3.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anchoredDraggableState$anchoredDrag$3.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static /* synthetic */ java.lang.Object anchoredDrag$default(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, java.lang.Object obj, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function4 function4, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, function4, continuation);
    }

    public final float newOffsetForDelta$foundation(float delta) {
        return kotlin.ranges.RangesKt.coerceIn((java.lang.Float.isNaN(getOffset()) ? 0.0f : getOffset()) + delta, getAnchors().minPosition(), getAnchors().maxPosition());
    }

    public final float dispatchRawDelta(float delta) {
        float newOffsetForDelta$foundation = newOffsetForDelta$foundation(delta);
        float requireOffset = requireOffset();
        androidx.compose.foundation.gestures.AnchoredDragScope.dragTo$default(this.getHighSpeedVideoFpsRangesFor, newOffsetForDelta$foundation, 0.0f, 2, null);
        return newOffsetForDelta$foundation - requireOffset;
    }

    private final boolean Camera2StreamConfigurationMap(T p0) {
        androidx.compose.foundation.MutatorMutex mutatorMutex = this.Camera2StreamConfigurationMap;
        boolean tryLock = mutatorMutex.tryLock();
        if (!tryLock) {
            return tryLock;
        }
        try {
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.getHighSpeedVideoFpsRangesFor;
            float positionOf = getAnchors().positionOf(p0);
            if (!java.lang.Float.isNaN(positionOf)) {
                androidx.compose.foundation.gestures.AnchoredDragScope.dragTo$default(anchoredDraggableState$anchoredDragScope$1, positionOf, 0.0f, 2, null);
                getHighSpeedVideoFpsRangesFor(null);
            }
            setCurrentValue(p0);
            setSettledValue(p0);
            return tryLock;
        } finally {
            mutatorMutex.unlock();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0007\u0010\fJ\u0084\u0001\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0017\u0010\u0013\u001a\u0013\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u0012\u0012\u0004\u0012\u00020\u000e0\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0007\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion;", "", "<init>", "()V", "T", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "Saver", "()Landroidx/compose/runtime/saveable/Saver;", "Lkotlin/Function1;", "", "confirmValueChange", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/animation/core/AnimationSpec;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "decayAnimationSpec", "Lkotlin/ParameterName;", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ boolean $r8$lambda$dotUTIVyvzevxFPI6Qk5AKaAfFw(java.lang.Object obj) {
            return true;
        }

        public static /* synthetic */ boolean $r8$lambda$iuM04mwEVDbR2zZW37BUXk5OK_0(java.lang.Object obj) {
            return true;
        }

        private Companion() {
        }

        public final <T> androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.gestures.AnchoredDraggableState<T>, T> Saver() {
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.lang.Object highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.getHighSpeedVideoSizes((androidx.compose.foundation.gestures.AnchoredDraggableState) obj2);
                    return highSpeedVideoSizes;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.foundation.gestures.AnchoredDraggableState highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.getHighSpeedVideoFpsRangesFor(obj);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.lang.Object getHighSpeedVideoSizes(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState) {
            return anchoredDraggableState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.foundation.gestures.AnchoredDraggableState getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
            return new androidx.compose.foundation.gestures.AnchoredDraggableState(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.runtime.saveable.Saver Saver$default(androidx.compose.foundation.gestures.AnchoredDraggableState.Companion companion, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.$r8$lambda$iuM04mwEVDbR2zZW37BUXk5OK_0(obj2));
                    }
                };
            }
            return companion.Saver(function1);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = androidx.compose.material3.internal.DraggableAnchorsKt.ConfirmValueChangeDeprecated)
        public final <T> androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.gestures.AnchoredDraggableState<T>, T> Saver(final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> confirmValueChange) {
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.lang.Object highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.getHighSpeedVideoFpsRangesFor((androidx.compose.foundation.gestures.AnchoredDraggableState) obj2);
                    return highSpeedVideoFpsRangesFor;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.foundation.gestures.AnchoredDraggableState highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1.this, obj);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState) {
            return anchoredDraggableState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.foundation.gestures.AnchoredDraggableState getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            return new androidx.compose.foundation.gestures.AnchoredDraggableState(obj, (kotlin.jvm.functions.Function1<? super java.lang.Object, java.lang.Boolean>) function1);
        }

        public static /* synthetic */ androidx.compose.runtime.saveable.Saver Saver$default(androidx.compose.foundation.gestures.AnchoredDraggableState.Companion companion, androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.animation.core.DecayAnimationSpec decayAnimationSpec, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.$r8$lambda$dotUTIVyvzevxFPI6Qk5AKaAfFw(obj2));
                    }
                };
            }
            return companion.Saver(animationSpec, decayAnimationSpec, function1, function0, function12);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to AnchoredDraggableDefaults.flingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
        public final <T> androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.gestures.AnchoredDraggableState<T>, T> Saver(final androidx.compose.animation.core.AnimationSpec<java.lang.Float> snapAnimationSpec, final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> positionalThreshold, final kotlin.jvm.functions.Function0<java.lang.Float> velocityThreshold, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> confirmValueChange) {
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.lang.Object Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.Camera2StreamConfigurationMap((androidx.compose.foundation.gestures.AnchoredDraggableState) obj2);
                    return Camera2StreamConfigurationMap;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.foundation.gestures.AnchoredDraggableState highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.getHighSpeedVideoSizes(kotlin.jvm.functions.Function1.this, velocityThreshold, snapAnimationSpec, decayAnimationSpec, confirmValueChange, obj);
                    return highSpeedVideoSizes;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.lang.Object Camera2StreamConfigurationMap(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState) {
            return anchoredDraggableState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.foundation.gestures.AnchoredDraggableState getHighSpeedVideoSizes(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.animation.core.DecayAnimationSpec decayAnimationSpec, kotlin.jvm.functions.Function1 function12, java.lang.Object obj) {
            return androidx.compose.foundation.gestures.AnchoredDraggableKt.AnchoredDraggableState(obj, function1, function0, animationSpec, decayAnimationSpec, function12);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
