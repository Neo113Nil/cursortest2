package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a^\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\"\u0010\t\u001a\u001e\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001aL\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\f2\"\u0010\t\u001a\u001e\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\u0000¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0084\u0001\u0010\n\u001a\u00020\b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\"\u0010\t\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0007\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u0014\u001ay\u0010\u001b\u001a\u00020\b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00162%\b\u0002\u0010\t\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\u0002\b\u001aH\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001ao\u0010\r\u001a\u00020\b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u0010\u0017\u001a\u00020\u00162%\b\u0002\u0010\t\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\u0002\b\u001aH\u0086@¢\u0006\u0004\b\r\u0010\u001e\u001au\u0010\n\u001a\u00020\b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2%\b\u0002\u0010\t\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\u0002\b\u001aH\u0080@¢\u0006\u0004\b\n\u0010#\u001aO\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010$\"\u0004\b\u0001\u0010\u000f\"\b\b\u0002\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001f2\u0017\u0010%\u001a\u0013\u0012\t\u0012\u00070!¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00028\u00000\u0018H\u0082@¢\u0006\u0004\b&\u0010'\u001aC\u0010)\u001a\u00020\b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015H\u0000¢\u0006\u0004\b)\u0010*\u001a\u008c\u0001\u0010/\u001a\u00020\b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010%\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00002\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152#\u0010.\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\u0002\b\u001aH\u0002¢\u0006\u0004\b/\u00100\u001a\u008c\u0001\u0010&\u001a\u00020\b\"\u0004\b\u0000\u0010\u000f\"\b\b\u0001\u0010\u0011*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010%\u001a\u00020!2\u0006\u0010+\u001a\u00020!2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152#\u0010.\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u0004\u0012\u00020\b0\u0018¢\u0006\u0002\b\u001aH\u0002¢\u0006\u0004\b&\u00101\"\u0018\u00105\u001a\u00020\u0000*\u0002028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00104"}, d2 = {"", "initialValue", "targetValue", "initialVelocity", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "block", "animate", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "animateDecay", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "", "sequentialAnimation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/ExtensionFunctionType;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/Animation;", "animation", "", "startTimeNanos", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/animation/core/Animation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "state", "updateState", "(Landroidx/compose/animation/core/AnimationScope;Landroidx/compose/animation/core/AnimationState;)V", "p1", "p2", "p3", "p4", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/animation/core/AnimationScope;JFLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lkotlin/jvm/functions/Function1;)V", "(Landroidx/compose/animation/core/AnimationScope;JJLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/coroutines/CoroutineContext;", "getDurationScale", "(Lkotlin/coroutines/CoroutineContext;)F", "durationScale"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendAnimationKt {
    public static /* synthetic */ java.lang.Object animate$default(float f, float f2, float f3, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        float f4 = (i & 4) != 0 ? 0.0f : f3;
        if ((i & 8) != 0) {
            animationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f, f2, f4, animationSpec, function2, continuation);
    }

    public static final java.lang.Object animate(float f, float f2, float f3, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animate = animate(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(kotlin.jvm.internal.FloatCompanionObject.INSTANCE), kotlin.coroutines.jvm.internal.Boxing.boxFloat(f), kotlin.coroutines.jvm.internal.Boxing.boxFloat(f2), kotlin.coroutines.jvm.internal.Boxing.boxFloat(f3), animationSpec, function2, continuation);
        return animate == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object animateDecay(float f, float f2, androidx.compose.animation.core.FloatDecayAnimationSpec floatDecayAnimationSpec, final kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animate$default = animate$default(androidx.compose.animation.core.AnimationStateKt.AnimationState$default(f, f2, 0L, 0L, false, 28, null), androidx.compose.animation.core.AnimationKt.DecayAnimation(floatDecayAnimationSpec, f, f2), 0L, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.animation.core.SuspendAnimationKt.Camera2StreamConfigurationMap(kotlin.jvm.functions.Function2.this, (androidx.compose.animation.core.AnimationScope) obj);
                return Camera2StreamConfigurationMap;
            }
        }, continuation, 2, null);
        return animate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate$default : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.functions.Function2 function2, androidx.compose.animation.core.AnimationScope animationScope) {
        function2.invoke(animationScope.getValue(), java.lang.Float.valueOf(((androidx.compose.animation.core.AnimationVector1D) animationScope.getVelocityVector()).getValue()));
        return kotlin.Unit.INSTANCE;
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(final androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, T t, T t2, T t3, androidx.compose.animation.core.AnimationSpec<T> animationSpec, final kotlin.jvm.functions.Function2<? super T, ? super T, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        V newInstance;
        if (t3 == null || (newInstance = twoWayConverter.getConvertToVector().invoke(t3)) == null) {
            newInstance = androidx.compose.animation.core.AnimationVectorsKt.newInstance(twoWayConverter.getConvertToVector().invoke(t));
        }
        java.lang.Object animate$default = animate$default(new androidx.compose.animation.core.AnimationState(twoWayConverter, t, newInstance, 0L, 0L, false, 56, null), new androidx.compose.animation.core.TargetBasedAnimation(animationSpec, twoWayConverter, t, t2, newInstance), 0L, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.animation.core.SuspendAnimationKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function2.this, twoWayConverter, (androidx.compose.animation.core.AnimationScope) obj);
                return highSpeedVideoSizes;
            }
        }, continuation, 2, null);
        return animate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate$default : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.functions.Function2 function2, androidx.compose.animation.core.TwoWayConverter twoWayConverter, androidx.compose.animation.core.AnimationScope animationScope) {
        function2.invoke(animationScope.getValue(), twoWayConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object animateTo$default(androidx.compose.animation.core.AnimationState animationState, java.lang.Object obj, androidx.compose.animation.core.AnimationSpec animationSpec, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            animationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.animation.core.SuspendAnimationKt.getHighSpeedVideoSizes();
                    return highSpeedVideoSizes;
                }
            };
        }
        return animateTo(animationState, obj, animationSpec2, z2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes() {
        return kotlin.Unit.INSTANCE;
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animateTo(androidx.compose.animation.core.AnimationState<T, V> animationState, T t, androidx.compose.animation.core.AnimationSpec<T> animationSpec, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animate = animate(animationState, new androidx.compose.animation.core.TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t, animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return animate == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object animateDecay$default(androidx.compose.animation.core.AnimationState animationState, androidx.compose.animation.core.DecayAnimationSpec decayAnimationSpec, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.animation.core.SuspendAnimationKt.getHighSpeedVideoFpsRanges();
                    return highSpeedVideoFpsRanges;
                }
            };
        }
        return animateDecay(animationState, decayAnimationSpec, z, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges() {
        return kotlin.Unit.INSTANCE;
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animateDecay(androidx.compose.animation.core.AnimationState<T, V> animationState, androidx.compose.animation.core.DecayAnimationSpec<T> decayAnimationSpec, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animate = animate(animationState, new androidx.compose.animation.core.DecayAnimation((androidx.compose.animation.core.DecayAnimationSpec) decayAnimationSpec, (androidx.compose.animation.core.TwoWayConverter) animationState.getTypeConverter(), (java.lang.Object) animationState.getValue(), (androidx.compose.animation.core.AnimationVector) animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return animate == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00df A[Catch: CancellationException -> 0x0051, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0051, blocks: (B:15:0x004a, B:18:0x00d2, B:20:0x00df), top: B:14:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, androidx.compose.animation.core.AnimationScope] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(final androidx.compose.animation.core.AnimationState<T, V> animationState, final androidx.compose.animation.core.Animation<T, V> animation, long j, final kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.animation.core.SuspendAnimationKt$animate$4 suspendAnimationKt$animate$4;
        androidx.compose.animation.core.SuspendAnimationKt$animate$4 suspendAnimationKt$animate$42;
        java.lang.Object coroutine_suspended;
        int i;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef;
        androidx.compose.animation.core.AnimationState<T, V> animationState2;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function12;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        androidx.compose.animation.core.AnimationScope animationScope;
        androidx.compose.animation.core.AnimationScope animationScope2;
        T t;
        kotlin.jvm.functions.Function1 function13;
        androidx.compose.animation.core.Animation<T, V> animation2 = animation;
        if (continuation instanceof androidx.compose.animation.core.SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (androidx.compose.animation.core.SuspendAnimationKt$animate$4) continuation;
            if ((suspendAnimationKt$animate$4.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                suspendAnimationKt$animate$4.getHighSpeedVideoFpsRanges -= 2147483648;
                suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
                java.lang.Object obj = suspendAnimationKt$animate$42.getInputFormats;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = suspendAnimationKt$animate$42.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final T valueFromNanos = animation2.getValueFromNanos(0L);
                    final V velocityVectorFromNanos = animation2.getVelocityVectorFromNanos(0L);
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    try {
                        if (j == Long.MIN_VALUE) {
                            final float durationScale = getDurationScale(suspendAnimationKt$animate$42.getGetInputFormats());
                            kotlin.jvm.functions.Function1 function14 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    kotlin.Unit highSpeedVideoFpsRanges;
                                    highSpeedVideoFpsRanges = androidx.compose.animation.core.SuspendAnimationKt.getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.ObjectRef.this, valueFromNanos, animation, velocityVectorFromNanos, animationState, durationScale, function1, ((java.lang.Long) obj2).longValue());
                                    return highSpeedVideoFpsRanges;
                                }
                            };
                            suspendAnimationKt$animate$42.getHighResolutionOutputSizeshNQ4ISI = animationState;
                            suspendAnimationKt$animate$42.getHighSpeedVideoSizes = animation2;
                            function12 = function1;
                            suspendAnimationKt$animate$42.getHighSpeedVideoFpsRangesFor = function12;
                            suspendAnimationKt$animate$42.Camera2StreamConfigurationMap = objectRef;
                            suspendAnimationKt$animate$42.getHighSpeedVideoFpsRanges = 1;
                            if (getHighResolutionOutputSizeshNQ4ISI(animation2, function14, suspendAnimationKt$animate$42) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        function12 = function1;
                        try {
                            ?? r13 = (T) new androidx.compose.animation.core.AnimationScope(valueFromNanos, animation.getTypeConverter(), velocityVectorFromNanos, j, animation.getTargetValue(), j, true, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit highSpeedVideoSizes;
                                    highSpeedVideoSizes = androidx.compose.animation.core.SuspendAnimationKt.getHighSpeedVideoSizes(androidx.compose.animation.core.AnimationState.this);
                                    return highSpeedVideoSizes;
                                }
                            });
                            objectRef = objectRef;
                            getHighSpeedVideoFpsRanges(r13, j, getDurationScale(suspendAnimationKt$animate$42.getGetInputFormats()), animation, animationState, function1);
                            objectRef.element = r13;
                        } catch (java.util.concurrent.CancellationException e) {
                            e = e;
                            objectRef = objectRef;
                            animationState2 = animationState;
                            animationScope = (androidx.compose.animation.core.AnimationScope) objectRef.element;
                            if (animationScope != null) {
                            }
                            animationScope2 = (androidx.compose.animation.core.AnimationScope) objectRef.element;
                            if (animationScope2 != null) {
                                animationState2.setRunning$animation_core(false);
                            }
                            throw e;
                        }
                        animationState2 = animationState;
                        objectRef2 = objectRef;
                    } catch (java.util.concurrent.CancellationException e2) {
                        e = e2;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) suspendAnimationKt$animate$42.Camera2StreamConfigurationMap;
                    kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function15 = (kotlin.jvm.functions.Function1) suspendAnimationKt$animate$42.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.animation.core.Animation<T, V> animation3 = (androidx.compose.animation.core.Animation) suspendAnimationKt$animate$42.getHighSpeedVideoSizes;
                    animationState2 = (androidx.compose.animation.core.AnimationState) suspendAnimationKt$animate$42.getHighResolutionOutputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        function12 = function15;
                        animation2 = animation3;
                    } catch (java.util.concurrent.CancellationException e3) {
                        e = e3;
                        objectRef = objectRef2;
                        animationScope = (androidx.compose.animation.core.AnimationScope) objectRef.element;
                        if (animationScope != null) {
                            animationScope.setRunning$animation_core(false);
                        }
                        animationScope2 = (androidx.compose.animation.core.AnimationScope) objectRef.element;
                        if (animationScope2 != null && animationScope2.getLastFrameTimeNanos() == animationState2.getLastFrameTimeNanos()) {
                            animationState2.setRunning$animation_core(false);
                        }
                        throw e;
                    }
                }
                do {
                    t = objectRef2.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                    if (!((androidx.compose.animation.core.AnimationScope) t).isRunning()) {
                        final float durationScale2 = getDurationScale(suspendAnimationKt$animate$42.getGetInputFormats());
                        final kotlin.jvm.internal.Ref.ObjectRef objectRef3 = objectRef2;
                        final androidx.compose.animation.core.Animation<T, V> animation4 = animation2;
                        final androidx.compose.animation.core.AnimationState<T, V> animationState3 = animationState2;
                        final kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function16 = function12;
                        function13 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoFpsRangesFor;
                                highSpeedVideoFpsRangesFor = androidx.compose.animation.core.SuspendAnimationKt.getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.ObjectRef.this, durationScale2, animation4, animationState3, function16, ((java.lang.Long) obj2).longValue());
                                return highSpeedVideoFpsRangesFor;
                            }
                        };
                        suspendAnimationKt$animate$42.getHighResolutionOutputSizeshNQ4ISI = animationState2;
                        suspendAnimationKt$animate$42.getHighSpeedVideoSizes = animation2;
                        suspendAnimationKt$animate$42.getHighSpeedVideoFpsRangesFor = function12;
                        suspendAnimationKt$animate$42.Camera2StreamConfigurationMap = objectRef2;
                        suspendAnimationKt$animate$42.getHighSpeedVideoFpsRanges = 2;
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                } while (getHighResolutionOutputSizeshNQ4ISI(animation2, function13, suspendAnimationKt$animate$42) != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        suspendAnimationKt$animate$4 = new androidx.compose.animation.core.SuspendAnimationKt$animate$4(continuation);
        suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
        java.lang.Object obj2 = suspendAnimationKt$animate$42.getInputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = suspendAnimationKt$animate$42.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        do {
            t = objectRef2.element;
            kotlin.jvm.internal.Intrinsics.checkNotNull(t);
            if (!((androidx.compose.animation.core.AnimationScope) t).isRunning()) {
            }
        } while (getHighResolutionOutputSizeshNQ4ISI(animation2, function13, suspendAnimationKt$animate$42) != coroutine_suspended);
        return coroutine_suspended;
    }

    public static /* synthetic */ java.lang.Object animate$default(androidx.compose.animation.core.AnimationState animationState, androidx.compose.animation.core.Animation animation, long j, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.SuspendAnimationKt.getHighResolutionOutputSizeshNQ4ISI();
                    return highResolutionOutputSizeshNQ4ISI;
                }
            };
        }
        return animate(animationState, animation, j2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r14v0, types: [T, androidx.compose.animation.core.AnimationScope] */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.ObjectRef objectRef, java.lang.Object obj, androidx.compose.animation.core.Animation animation, androidx.compose.animation.core.AnimationVector animationVector, final androidx.compose.animation.core.AnimationState animationState, float f, kotlin.jvm.functions.Function1 function1, long j) {
        ?? animationScope = new androidx.compose.animation.core.AnimationScope(obj, animation.getTypeConverter(), animationVector, j, animation.getTargetValue(), j, true, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.SuspendAnimationKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.AnimationState.this);
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
        getHighSpeedVideoFpsRanges(animationScope, j, f, animation, animationState, function1);
        objectRef.element = animationScope;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.AnimationState animationState) {
        animationState.setRunning$animation_core(false);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.animation.core.AnimationState animationState) {
        animationState.setRunning$animation_core(false);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.internal.Ref.ObjectRef objectRef, float f, androidx.compose.animation.core.Animation animation, androidx.compose.animation.core.AnimationState animationState, kotlin.jvm.functions.Function1 function1, long j) {
        T t = objectRef.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(t);
        getHighSpeedVideoFpsRanges((androidx.compose.animation.core.AnimationScope) t, j, f, animation, animationState, function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.Animation<T, V> animation, final kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        if (animation.getIsInfinite()) {
            return androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(function1, continuation);
        }
        return androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.animation.core.SuspendAnimationKt.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1.this, ((java.lang.Long) obj).longValue());
                return highResolutionOutputSizeshNQ4ISI;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function1 function1, long j) {
        return function1.invoke(java.lang.Long.valueOf(j));
    }

    public static final float getDurationScale(kotlin.coroutines.CoroutineContext coroutineContext) {
        androidx.compose.ui.MotionDurationScale motionDurationScale = (androidx.compose.ui.MotionDurationScale) coroutineContext.get(androidx.compose.ui.MotionDurationScale.INSTANCE);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (scaleFactor < 0.0f) {
            androidx.compose.animation.core.PreconditionsKt.throwIllegalStateException("negative scale factor");
        }
        return scaleFactor;
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> void updateState(androidx.compose.animation.core.AnimationScope<T, V> animationScope, androidx.compose.animation.core.AnimationState<T, V> animationState) {
        animationState.setValue$animation_core(animationScope.getValue());
        androidx.compose.animation.core.AnimationVectorsKt.copyFrom(animationState.getVelocityVector(), animationScope.getVelocityVector());
        animationState.setFinishedTimeNanos$animation_core(animationScope.getFinishedTimeNanos());
        animationState.setLastFrameTimeNanos$animation_core(animationScope.getLastFrameTimeNanos());
        animationState.setRunning$animation_core(animationScope.isRunning());
    }

    private static final <T, V extends androidx.compose.animation.core.AnimationVector> void getHighSpeedVideoFpsRanges(androidx.compose.animation.core.AnimationScope<T, V> animationScope, long j, float f, androidx.compose.animation.core.Animation<T, V> animation, androidx.compose.animation.core.AnimationState<T, V> animationState, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function1) {
        long startTimeNanos;
        if (f == 0.0f) {
            startTimeNanos = animation.getDurationNanos();
        } else {
            startTimeNanos = (long) ((j - animationScope.getStartTimeNanos()) / f);
        }
        getHighResolutionOutputSizeshNQ4ISI(animationScope, j, startTimeNanos, animation, animationState, function1);
    }

    private static final <T, V extends androidx.compose.animation.core.AnimationVector> void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.animation.core.AnimationScope<T, V> animationScope, long j, long j2, androidx.compose.animation.core.Animation<T, V> animation, androidx.compose.animation.core.AnimationState<T, V> animationState, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function1) {
        animationScope.setLastFrameTimeNanos$animation_core(j);
        animationScope.setValue$animation_core(animation.getValueFromNanos(j2));
        animationScope.setVelocityVector$animation_core(animation.getVelocityVectorFromNanos(j2));
        if (animation.isFinishedFromNanos(j2)) {
            animationScope.setFinishedTimeNanos$animation_core(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core(false);
        }
        updateState(animationScope, animationState);
        function1.invoke(animationScope);
    }
}
