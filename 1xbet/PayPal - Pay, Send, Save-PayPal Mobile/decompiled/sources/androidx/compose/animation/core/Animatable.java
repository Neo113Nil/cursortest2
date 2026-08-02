package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B9\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\rJ%\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0012Jg\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u0013\u001a\u00028\u00002\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\b\b\u0002\u0010\u0016\u001a\u00028\u00002'\b\u0002\u0010\u0019\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017¢\u0006\u0002\b\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ[\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u0016\u001a\u00028\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2'\b\u0002\u0010\u0019\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017¢\u0006\u0002\b\u0018H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ_\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\"\u001a\u00028\u00002%\u0010#\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017¢\u0006\u0002\b\u0018H\u0082@¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u0000H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010(J\u0018\u0010)\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-¢\u0006\u0004\b.\u0010/R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u00102R\u0016\u0010$\u001a\u0004\u0018\u00018\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u00107R&\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001088\u0001X\u0081\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0011\u0010?\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0011\u0010B\u001a\u00028\u00018G¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010D\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\bC\u0010>R+\u0010I\u001a\u00020E2\u0006\u0010F\u001a\u00020E8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR+\u0010\u0013\u001a\u00028\u00002\u0006\u0010F\u001a\u00028\u00008G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010H\u001a\u0004\bN\u0010>\"\u0004\bO\u0010PR(\u0010\u000e\u001a\u0004\u0018\u00018\u00002\b\u0010!\u001a\u0004\u0018\u00018\u00008\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\bQ\u0010>R(\u0010\u000f\u001a\u0004\u0018\u00018\u00002\b\u0010!\u001a\u0004\u0018\u00018\u00008\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\bR\u0010>R\u0014\u0010V\u001a\u00020S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010UR \u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000W8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010&\u001a\u00028\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010\\R\u0014\u0010]\u001a\u00028\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010\\R\u0016\u0010T\u001a\u00028\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b]\u0010\\R\u0016\u0010^\u001a\u00028\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010\\"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "initialValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "visibilityThreshold", "", "label", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "lowerBound", "upperBound", "", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "initialVelocity", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/animation/core/AnimationResult;", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "animateDecay", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Animation;", "p0", "p1", "p2", "Camera2StreamConfigurationMap", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "(Ljava/lang/Object;)Ljava/lang/Object;", "()V", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "asState", "()Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "getHighSpeedVideoSizesFor", "Ljava/lang/Object;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/AnimationState;", "internalState", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core", "()Landroidx/compose/animation/core/AnimationState;", "getValue", "()Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "getVelocity", "velocity", "", "<set-?>", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "isRunning", "()Z", "setRunning", "(Z)V", "targetValue$delegate", "getTargetValue", "setTargetValue", "(Ljava/lang/Object;)V", "getLowerBound", "getUpperBound", "Landroidx/compose/animation/core/MutatorMutex;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/animation/core/MutatorMutex;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/animation/core/SpringSpec;", "defaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core", "()Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/animation/core/AnimationVector;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Animatable<T, V extends androidx.compose.animation.core.AnimationVector> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private V getOutputFormats;
    private final androidx.compose.animation.core.SpringSpec<T> defaultSpringSpec;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private V getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.animation.core.MutatorMutex getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final V getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final V getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final T Camera2StreamConfigurationMap;
    private final androidx.compose.animation.core.AnimationState<T, V> internalState;

    /* renamed from: isRunning$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isRunning;
    private final java.lang.String label;
    private T lowerBound;

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState targetValue;
    private final androidx.compose.animation.core.TwoWayConverter<T, V> typeConverter;
    private T upperBound;

    public Animatable(T t, androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, T t2, java.lang.String str) {
        androidx.compose.animation.core.AnimationVector4D animationVector4D;
        androidx.compose.animation.core.AnimationVector4D animationVector4D2;
        androidx.compose.animation.core.AnimationVector3D animationVector3D;
        androidx.compose.animation.core.AnimationVector2D animationVector2D;
        androidx.compose.animation.core.AnimationVector4D animationVector4D3;
        androidx.compose.animation.core.AnimationVector4D animationVector4D4;
        androidx.compose.animation.core.AnimationVector3D animationVector3D2;
        androidx.compose.animation.core.AnimationVector2D animationVector2D2;
        androidx.compose.animation.core.AnimationVector1D animationVector1D;
        androidx.compose.animation.core.AnimationVector1D animationVector1D2;
        this.typeConverter = twoWayConverter;
        this.Camera2StreamConfigurationMap = t2;
        this.label = str;
        this.internalState = new androidx.compose.animation.core.AnimationState<>(twoWayConverter, t, null, 0L, 0L, false, 60, null);
        this.isRunning = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
        this.targetValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.getHighSpeedVideoFpsRangesFor = new androidx.compose.animation.core.MutatorMutex();
        this.defaultSpringSpec = new androidx.compose.animation.core.SpringSpec<>(0.0f, 0.0f, t2, 3, null);
        V velocityVector = getVelocityVector();
        if (velocityVector instanceof androidx.compose.animation.core.AnimationVector1D) {
            animationVector1D2 = androidx.compose.animation.core.AnimatableKt.getHighResolutionOutputSizeshNQ4ISI;
            animationVector4D2 = animationVector1D2;
        } else if (velocityVector instanceof androidx.compose.animation.core.AnimationVector2D) {
            animationVector2D = androidx.compose.animation.core.AnimatableKt.getHighSpeedVideoSizes;
            animationVector4D2 = animationVector2D;
        } else if (velocityVector instanceof androidx.compose.animation.core.AnimationVector3D) {
            animationVector3D = androidx.compose.animation.core.AnimatableKt.getHighSpeedVideoFpsRangesFor;
            animationVector4D2 = animationVector3D;
        } else {
            animationVector4D = androidx.compose.animation.core.AnimatableKt.getHighSpeedVideoFpsRanges;
            animationVector4D2 = animationVector4D;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(animationVector4D2, "");
        this.getHighSpeedVideoSizes = animationVector4D2;
        V velocityVector2 = getVelocityVector();
        if (velocityVector2 instanceof androidx.compose.animation.core.AnimationVector1D) {
            animationVector1D = androidx.compose.animation.core.AnimatableKt.Camera2StreamConfigurationMap;
            animationVector4D4 = animationVector1D;
        } else if (velocityVector2 instanceof androidx.compose.animation.core.AnimationVector2D) {
            animationVector2D2 = androidx.compose.animation.core.AnimatableKt.getOutputMinFrameDuration;
            animationVector4D4 = animationVector2D2;
        } else if (velocityVector2 instanceof androidx.compose.animation.core.AnimationVector3D) {
            animationVector3D2 = androidx.compose.animation.core.AnimatableKt.getInputSizeshNQ4ISI;
            animationVector4D4 = animationVector3D2;
        } else {
            animationVector4D3 = androidx.compose.animation.core.AnimatableKt.getOutputFormats;
            animationVector4D4 = animationVector4D3;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(animationVector4D4, "");
        this.getHighResolutionOutputSizeshNQ4ISI = animationVector4D4;
        this.getHighSpeedVideoFpsRanges = animationVector4D2;
        this.getOutputFormats = animationVector4D4;
    }

    public final androidx.compose.animation.core.TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public /* synthetic */ Animatable(java.lang.Object obj, androidx.compose.animation.core.TwoWayConverter twoWayConverter, java.lang.Object obj2, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i & 4) != 0 ? null : obj2, (i & 8) != 0 ? "Animatable" : str);
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public /* synthetic */ Animatable(java.lang.Object obj, androidx.compose.animation.core.TwoWayConverter twoWayConverter, java.lang.Object obj2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, twoWayConverter, (i & 4) != 0 ? null : obj2);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility", replaceWith = @kotlin.ReplaceWith(expression = "Animatable(initialValue, typeConverter, visibilityThreshold, \"Animatable\")", imports = {}))
    public /* synthetic */ Animatable(java.lang.Object obj, androidx.compose.animation.core.TwoWayConverter twoWayConverter, java.lang.Object obj2) {
        this(obj, twoWayConverter, obj2, "Animatable");
    }

    public final androidx.compose.animation.core.AnimationState<T, V> getInternalState$animation_core() {
        return this.internalState;
    }

    public final T getValue() {
        return this.internalState.getValue();
    }

    public final V getVelocityVector() {
        return this.internalState.getVelocityVector();
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRunning(boolean z) {
        this.isRunning.setValue(java.lang.Boolean.valueOf(z));
    }

    public final boolean isRunning() {
        return ((java.lang.Boolean) this.isRunning.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTargetValue(T t) {
        this.targetValue.setValue(t);
    }

    public final T getTargetValue() {
        return this.targetValue.getValue();
    }

    public final T getLowerBound() {
        return this.lowerBound;
    }

    public final T getUpperBound() {
        return this.upperBound;
    }

    public final androidx.compose.animation.core.SpringSpec<T> getDefaultSpringSpec$animation_core() {
        return this.defaultSpringSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateBounds$default(androidx.compose.animation.core.Animatable animatable, java.lang.Object obj, java.lang.Object obj2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = animatable.lowerBound;
        }
        if ((i & 2) != 0) {
            obj2 = animatable.upperBound;
        }
        animatable.updateBounds(obj, obj2);
    }

    public final void updateBounds(T lowerBound, T upperBound) {
        V v;
        V v2;
        if (lowerBound == null || (v = this.typeConverter.getConvertToVector().invoke(lowerBound)) == null) {
            v = this.getHighSpeedVideoSizes;
        }
        if (upperBound == null || (v2 = this.typeConverter.getConvertToVector().invoke(upperBound)) == null) {
            v2 = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            if (v.get$animation_core(i) > v2.get$animation_core(i)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: ");
                sb.append(v);
                sb.append(" is greater than upper bound ");
                sb.append(v2);
                sb.append(" on index ");
                sb.append(i);
                androidx.compose.animation.core.PreconditionsKt.throwIllegalStateException(sb.toString());
            }
        }
        this.getHighSpeedVideoFpsRanges = v;
        this.getOutputFormats = v2;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
        if (isRunning()) {
            return;
        }
        T highSpeedVideoSizes = getHighSpeedVideoSizes(getValue());
        if (kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoSizes, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core(highSpeedVideoSizes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object animateTo$default(androidx.compose.animation.core.Animatable animatable, java.lang.Object obj, androidx.compose.animation.core.AnimationSpec animationSpec, java.lang.Object obj2, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj3) {
        if ((i & 2) != 0) {
            animationSpec = animatable.defaultSpringSpec;
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        T t = obj2;
        if ((i & 4) != 0) {
            t = animatable.getVelocity();
        }
        T t2 = t;
        if ((i & 8) != 0) {
            function1 = null;
        }
        return animatable.animateTo(obj, animationSpec2, t2, function1, continuation);
    }

    public final java.lang.Object animateTo(T t, androidx.compose.animation.core.AnimationSpec<T> animationSpec, T t2, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Animatable<T, V>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimationResult<T, V>> continuation) {
        return Camera2StreamConfigurationMap(androidx.compose.animation.core.AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t, t2), t2, function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object animateDecay$default(androidx.compose.animation.core.Animatable animatable, java.lang.Object obj, androidx.compose.animation.core.DecayAnimationSpec decayAnimationSpec, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, function1, continuation);
    }

    public final java.lang.Object animateDecay(T t, androidx.compose.animation.core.DecayAnimationSpec<T> decayAnimationSpec, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Animatable<T, V>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimationResult<T, V>> continuation) {
        return Camera2StreamConfigurationMap(new androidx.compose.animation.core.DecayAnimation((androidx.compose.animation.core.DecayAnimationSpec) decayAnimationSpec, (androidx.compose.animation.core.TwoWayConverter) this.typeConverter, (java.lang.Object) getValue(), (androidx.compose.animation.core.AnimationVector) this.typeConverter.getConvertToVector().invoke(t)), t, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object Camera2StreamConfigurationMap(androidx.compose.animation.core.Animation<T, V> animation, T t, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Animatable<T, V>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimationResult<T, V>> continuation) {
        return androidx.compose.animation.core.MutatorMutex.mutate$default(this.getHighSpeedVideoFpsRangesFor, null, new androidx.compose.animation.core.Animatable$runAnimation$2(this, t, animation, this.internalState.getLastFrameTimeNanos(), function1, null), continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getHighSpeedVideoSizes(T p0) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI)) {
            return p0;
        }
        V invoke = this.typeConverter.getConvertToVector().invoke(p0);
        int size = invoke.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (invoke.get$animation_core(i) < this.getHighSpeedVideoFpsRanges.get$animation_core(i) || invoke.get$animation_core(i) > this.getOutputFormats.get$animation_core(i)) {
                invoke.set$animation_core(i, kotlin.ranges.RangesKt.coerceIn(invoke.get$animation_core(i), this.getHighSpeedVideoFpsRanges.get$animation_core(i), this.getOutputFormats.get$animation_core(i)));
                z = true;
            }
        }
        return z ? this.typeConverter.getConvertFromVector().invoke(invoke) : p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes() {
        androidx.compose.animation.core.AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core();
        animationState.setLastFrameTimeNanos$animation_core(Long.MIN_VALUE);
        setRunning(false);
    }

    public final java.lang.Object snapTo(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object mutate$default = androidx.compose.animation.core.MutatorMutex.mutate$default(this.getHighSpeedVideoFpsRangesFor, null, new androidx.compose.animation.core.Animatable$snapTo$2(this, t, null), continuation, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate$default : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object stop(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object mutate$default = androidx.compose.animation.core.MutatorMutex.mutate$default(this.getHighSpeedVideoFpsRangesFor, null, new androidx.compose.animation.core.Animatable$stop$2(this, null), continuation, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate$default : kotlin.Unit.INSTANCE;
    }

    public final androidx.compose.runtime.State<T> asState() {
        return this.internalState;
    }
}
