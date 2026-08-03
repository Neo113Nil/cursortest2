package androidx.compose.animation.core;

/* compiled from: Animatable.kt */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004B/\b\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\tB7\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJY\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>2\u0006\u0010?\u001a\u00028\u00002\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000A2'\b\u0002\u0010B\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020D\u0018\u00010C¢\u0006\u0002\bEH\u0086@¢\u0006\u0002\u0010FJe\u0010G\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>2\u0006\u0010,\u001a\u00028\u00002\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000H2\b\b\u0002\u0010?\u001a\u00028\u00002'\b\u0002\u0010B\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020D\u0018\u00010C¢\u0006\u0002\bEH\u0086@¢\u0006\u0002\u0010IJ\f\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000KJ\u0015\u0010L\u001a\u00028\u00002\u0006\u00106\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010MJ\b\u0010N\u001a\u00020DH\u0002J]\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Q2\u0006\u0010?\u001a\u00028\u00002%\u0010B\u001a!\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020D\u0018\u00010C¢\u0006\u0002\bEH\u0082@¢\u0006\u0002\u0010RJ\u0016\u0010S\u001a\u00020D2\u0006\u0010,\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010TJ\u000e\u0010U\u001a\u00020DH\u0086@¢\u0006\u0002\u0010VJ#\u0010W\u001a\u00020D2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u00103\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010XR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00168F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00018\u00002\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0010\u0010#\u001a\u00028\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\u00028\u0001X\u0082\u0004¢\u0006\n\n\u0002\u0010$\u0012\u0004\b(\u0010)R\u0016\u0010*\u001a\u00028\u0001X\u0082\u0004¢\u0006\n\n\u0002\u0010$\u0012\u0004\b+\u0010)R+\u0010,\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010\u001c\u001a\u0004\b-\u0010!\"\u0004\b.\u0010/R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R$\u00103\u001a\u0004\u0018\u00018\u00002\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b4\u0010!R\u0010\u00105\u001a\u00028\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010$R\u0011\u00106\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b7\u0010!R\u0011\u00108\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b9\u0010!R\u0011\u0010:\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"¨\u0006Y"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "T", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "", "initialValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "visibilityThreshold", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "label", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "defaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core_release", "()Landroidx/compose/animation/core/SpringSpec;", "internalState", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core_release", "()Landroidx/compose/animation/core/AnimationState;", "<set-?>", "", "isRunning", "()Z", "setRunning", "(Z)V", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "getLabel", "()Ljava/lang/String;", "lowerBound", "getLowerBound", "()Ljava/lang/Object;", "Ljava/lang/Object;", "lowerBoundVector", "Landroidx/compose/animation/core/AnimationVector;", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "negativeInfinityBounds", "getNegativeInfinityBounds$annotations", "()V", "positiveInfinityBounds", "getPositiveInfinityBounds$annotations", "targetValue", "getTargetValue", "setTargetValue", "(Ljava/lang/Object;)V", "targetValue$delegate", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "upperBound", "getUpperBound", "upperBoundVector", "value", "getValue", "velocity", "getVelocity", "velocityVector", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "animateDecay", "Landroidx/compose/animation/core/AnimationResult;", "initialVelocity", "animationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "Landroidx/compose/animation/core/AnimationSpec;", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asState", "Landroidx/compose/runtime/State;", "clampToBounds", "(Ljava/lang/Object;)Ljava/lang/Object;", "endAnimation", "runAnimation", "animation", "Landroidx/compose/animation/core/Animation;", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Animatable<T, V extends androidx.compose.animation.core.AnimationVector> {
    public static final int $stable = 8;
    private final androidx.compose.animation.core.SpringSpec<T> defaultSpringSpec;
    private final androidx.compose.animation.core.AnimationState<T, V> internalState;

    /* renamed from: isRunning$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isRunning;
    private final java.lang.String label;
    private T lowerBound;
    private V lowerBoundVector;
    private final androidx.compose.animation.core.MutatorMutex mutatorMutex;
    private final V negativeInfinityBounds;
    private final V positiveInfinityBounds;

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState targetValue;
    private final androidx.compose.animation.core.TwoWayConverter<T, V> typeConverter;
    private T upperBound;
    private V upperBoundVector;
    private final T visibilityThreshold;

    private static /* synthetic */ void getNegativeInfinityBounds$annotations() {
    }

    private static /* synthetic */ void getPositiveInfinityBounds$annotations() {
    }

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
        this.visibilityThreshold = t2;
        this.label = str;
        this.internalState = new androidx.compose.animation.core.AnimationState<>(twoWayConverter, t, null, 0L, 0L, false, 60, null);
        this.isRunning = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.targetValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.mutatorMutex = new androidx.compose.animation.core.MutatorMutex();
        this.defaultSpringSpec = new androidx.compose.animation.core.SpringSpec<>(0.0f, 0.0f, t2, 3, null);
        V velocityVector = getVelocityVector();
        if (velocityVector instanceof androidx.compose.animation.core.AnimationVector1D) {
            animationVector1D2 = androidx.compose.animation.core.AnimatableKt.negativeInfinityBounds1D;
            animationVector4D2 = animationVector1D2;
        } else if (velocityVector instanceof androidx.compose.animation.core.AnimationVector2D) {
            animationVector2D = androidx.compose.animation.core.AnimatableKt.negativeInfinityBounds2D;
            animationVector4D2 = animationVector2D;
        } else if (velocityVector instanceof androidx.compose.animation.core.AnimationVector3D) {
            animationVector3D = androidx.compose.animation.core.AnimatableKt.negativeInfinityBounds3D;
            animationVector4D2 = animationVector3D;
        } else {
            animationVector4D = androidx.compose.animation.core.AnimatableKt.negativeInfinityBounds4D;
            animationVector4D2 = animationVector4D;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(animationVector4D2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.negativeInfinityBounds = animationVector4D2;
        V velocityVector2 = getVelocityVector();
        if (velocityVector2 instanceof androidx.compose.animation.core.AnimationVector1D) {
            animationVector1D = androidx.compose.animation.core.AnimatableKt.positiveInfinityBounds1D;
            animationVector4D4 = animationVector1D;
        } else if (velocityVector2 instanceof androidx.compose.animation.core.AnimationVector2D) {
            animationVector2D2 = androidx.compose.animation.core.AnimatableKt.positiveInfinityBounds2D;
            animationVector4D4 = animationVector2D2;
        } else if (velocityVector2 instanceof androidx.compose.animation.core.AnimationVector3D) {
            animationVector3D2 = androidx.compose.animation.core.AnimatableKt.positiveInfinityBounds3D;
            animationVector4D4 = animationVector3D2;
        } else {
            animationVector4D3 = androidx.compose.animation.core.AnimatableKt.positiveInfinityBounds4D;
            animationVector4D4 = animationVector4D3;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(animationVector4D4, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.positiveInfinityBounds = animationVector4D4;
        this.lowerBoundVector = animationVector4D2;
        this.upperBoundVector = animationVector4D4;
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

    public final androidx.compose.animation.core.AnimationState<T, V> getInternalState$animation_core_release() {
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

    public final androidx.compose.animation.core.SpringSpec<T> getDefaultSpringSpec$animation_core_release() {
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
            v = this.negativeInfinityBounds;
        }
        if (upperBound == null || (v2 = this.typeConverter.getConvertToVector().invoke(upperBound)) == null) {
            v2 = this.positiveInfinityBounds;
        }
        int size = v.getSize();
        for (int i = 0; i < size; i++) {
            if (v.get$animation_core_release(i) > v2.get$animation_core_release(i)) {
                throw new java.lang.IllegalStateException(("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + v + " is greater than upper bound " + v2 + " on index " + i).toString());
            }
        }
        this.lowerBoundVector = v;
        this.upperBoundVector = v2;
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
        if (isRunning()) {
            return;
        }
        T clampToBounds = clampToBounds(getValue());
        if (kotlin.jvm.internal.Intrinsics.areEqual(clampToBounds, getValue())) {
            return;
        }
        this.internalState.setValue$animation_core_release(clampToBounds);
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
        return runAnimation(androidx.compose.animation.core.AnimationKt.TargetBasedAnimation(animationSpec, this.typeConverter, getValue(), t, t2), t2, function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object animateDecay$default(androidx.compose.animation.core.Animatable animatable, java.lang.Object obj, androidx.compose.animation.core.DecayAnimationSpec decayAnimationSpec, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return animatable.animateDecay(obj, decayAnimationSpec, function1, continuation);
    }

    public final java.lang.Object animateDecay(T t, androidx.compose.animation.core.DecayAnimationSpec<T> decayAnimationSpec, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Animatable<T, V>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimationResult<T, V>> continuation) {
        return runAnimation(new androidx.compose.animation.core.DecayAnimation((androidx.compose.animation.core.DecayAnimationSpec) decayAnimationSpec, (androidx.compose.animation.core.TwoWayConverter) this.typeConverter, (java.lang.Object) getValue(), (androidx.compose.animation.core.AnimationVector) this.typeConverter.getConvertToVector().invoke(t)), t, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object runAnimation(androidx.compose.animation.core.Animation<T, V> animation, T t, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.Animatable<T, V>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimationResult<T, V>> continuation) {
        return androidx.compose.animation.core.MutatorMutex.mutate$default(this.mutatorMutex, null, new androidx.compose.animation.core.Animatable$runAnimation$2(this, t, animation, this.internalState.getLastFrameTimeNanos(), function1, null), continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T clampToBounds(T value) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.lowerBoundVector, this.negativeInfinityBounds) && kotlin.jvm.internal.Intrinsics.areEqual(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        V invoke = this.typeConverter.getConvertToVector().invoke(value);
        int size = invoke.getSize();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (invoke.get$animation_core_release(i) < this.lowerBoundVector.get$animation_core_release(i) || invoke.get$animation_core_release(i) > this.upperBoundVector.get$animation_core_release(i)) {
                invoke.set$animation_core_release(i, kotlin.ranges.RangesKt.coerceIn(invoke.get$animation_core_release(i), this.lowerBoundVector.get$animation_core_release(i), this.upperBoundVector.get$animation_core_release(i)));
                z = true;
            }
        }
        return z ? this.typeConverter.getConvertFromVector().invoke(invoke) : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endAnimation() {
        androidx.compose.animation.core.AnimationState<T, V> animationState = this.internalState;
        animationState.getVelocityVector().reset$animation_core_release();
        animationState.setLastFrameTimeNanos$animation_core_release(Long.MIN_VALUE);
        setRunning(false);
    }

    public final java.lang.Object snapTo(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object mutate$default = androidx.compose.animation.core.MutatorMutex.mutate$default(this.mutatorMutex, null, new androidx.compose.animation.core.Animatable$snapTo$2(this, t, null), continuation, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate$default : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object stop(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object mutate$default = androidx.compose.animation.core.MutatorMutex.mutate$default(this.mutatorMutex, null, new androidx.compose.animation.core.Animatable$stop$2(this, null), continuation, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mutate$default : kotlin.Unit.INSTANCE;
    }

    public final androidx.compose.runtime.State<T> asState() {
        return this.internalState;
    }
}
