package androidx.compose.animation.core;

/* compiled from: SuspendAnimation.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u001a\u0096\u0001\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u0002H\u00072\u0006\u0010\r\u001a\u0002H\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u0001H\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u001026\u0010\u0011\u001a2\u0012\u0013\u0012\u0011H\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u0011H\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0012H\u0086@¢\u0006\u0002\u0010\u0017\u001ap\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001026\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0012H\u0086@¢\u0006\u0002\u0010\u0018\u001a^\u0010\u0019\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u001a26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00060\u0012H\u0086@¢\u0006\u0002\u0010\u001b\u001as\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0080@¢\u0006\u0002\u0010$\u001am\u0010\u0019\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070%2\b\b\u0002\u0010&\u001a\u00020'2%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0086@¢\u0006\u0002\u0010(\u001aw\u0010)\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2\u0006\u0010\r\u001a\u0002H\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00102\b\b\u0002\u0010&\u001a\u00020'2%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0086@¢\u0006\u0002\u0010*\u001aW\u0010+\u001a\u0002H,\"\u0004\b\u0000\u0010,\"\u0004\b\u0001\u0010\u0007\"\b\b\u0002\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001e2!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(.\u0012\u0004\u0012\u0002H,0!H\u0082@¢\u0006\u0002\u0010/\u001a\u0085\u0001\u00100\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"2\u0006\u0010.\u001a\u00020 2\u0006\u00101\u001a\u00020 2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001e2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2#\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0002\u001a\u0085\u0001\u00104\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"2\u0006\u0010.\u001a\u00020 2\u0006\u0010\u0000\u001a\u00020\u00012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001e2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001c2#\u0010\u0011\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b#H\u0002\u001a<\u00105\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\b*\u00020\t*\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\"2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u001cH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u00066"}, d2 = {"durationScale", "", "Lkotlin/coroutines/CoroutineContext;", "getDurationScale", "(Lkotlin/coroutines/CoroutineContext;)F", com.helpshift.proactive.InAppViewConstants.ANIMATE, "", "T", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "targetValue", "initialVelocity", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "velocity", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateDecay", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "animation", "Landroidx/compose/animation/core/Animation;", "startTimeNanos", "", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "sequentialAnimation", "", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callWithFrameNanos", "R", "onFrame", "frameTimeNanos", "(Landroidx/compose/animation/core/Animation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doAnimationFrame", "playTimeNanos", "anim", "state", "doAnimationFrameWithScale", "updateState", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
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
        java.lang.Object animate$default = animate$default(androidx.compose.animation.core.AnimationStateKt.AnimationState$default(f, f2, 0L, 0L, false, 28, null), androidx.compose.animation.core.AnimationKt.DecayAnimation(floatDecayAnimationSpec, f, f2), 0L, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope) {
                function2.invoke(animationScope.getValue(), java.lang.Float.valueOf(animationScope.getVelocityVector().getValue()));
            }
        }, continuation, 2, null);
        return animate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate$default : kotlin.Unit.INSTANCE;
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(final androidx.compose.animation.core.TwoWayConverter<T, V> twoWayConverter, T t, T t2, T t3, androidx.compose.animation.core.AnimationSpec<T> animationSpec, final kotlin.jvm.functions.Function2<? super T, ? super T, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        V newInstance;
        if (t3 == null || (newInstance = twoWayConverter.getConvertToVector().invoke(t3)) == null) {
            newInstance = androidx.compose.animation.core.AnimationVectorsKt.newInstance(twoWayConverter.getConvertToVector().invoke(t));
        }
        java.lang.Object animate$default = animate$default(new androidx.compose.animation.core.AnimationState(twoWayConverter, t, newInstance, 0L, 0L, false, 56, null), new androidx.compose.animation.core.TargetBasedAnimation(animationSpec, twoWayConverter, t, t2, newInstance), 0L, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
                invoke((androidx.compose.animation.core.AnimationScope) obj);
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.animation.core.AnimationScope<T, V> animationScope) {
                function2.invoke(animationScope.getValue(), twoWayConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
            }
        }, continuation, 2, null);
        return animate$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object animateTo$default(androidx.compose.animation.core.AnimationState animationState, java.lang.Object obj, androidx.compose.animation.core.AnimationSpec animationSpec, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            animationSpec = androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        androidx.compose.animation.core.AnimationSpec animationSpec2 = animationSpec;
        boolean z2 = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateTo$2
                public final void invoke(androidx.compose.animation.core.AnimationScope<T, V> animationScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj3) {
                    invoke((androidx.compose.animation.core.AnimationScope) obj3);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        return animateTo(animationState, obj, animationSpec2, z2, function1, continuation);
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
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$4
                public final void invoke(androidx.compose.animation.core.AnimationScope<T, V> animationScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj2) {
                    invoke((androidx.compose.animation.core.AnimationScope) obj2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        return animateDecay(animationState, decayAnimationSpec, z, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animateDecay(androidx.compose.animation.core.AnimationState<T, V> animationState, androidx.compose.animation.core.DecayAnimationSpec<T> decayAnimationSpec, boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animate = animate(animationState, new androidx.compose.animation.core.DecayAnimation((androidx.compose.animation.core.DecayAnimationSpec) decayAnimationSpec, (androidx.compose.animation.core.TwoWayConverter) animationState.getTypeConverter(), (java.lang.Object) animationState.getValue(), (androidx.compose.animation.core.AnimationVector) animationState.getVelocityVector()), z ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return animate == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animate : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f4 A[Catch: CancellationException -> 0x0062, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0062, blocks: (B:12:0x005b, B:15:0x00e7, B:17:0x00f4), top: B:11:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066  */
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
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function12;
        androidx.compose.animation.core.AnimationState<T, V> animationState2;
        androidx.compose.animation.core.AnimationScope animationScope;
        androidx.compose.animation.core.AnimationScope animationScope2;
        T t;
        kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> function13;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function14;
        androidx.compose.animation.core.Animation<T, V> animation2;
        final androidx.compose.animation.core.AnimationState<T, V> animationState3 = animationState;
        androidx.compose.animation.core.Animation<T, V> animation3 = animation;
        if (continuation instanceof androidx.compose.animation.core.SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (androidx.compose.animation.core.SuspendAnimationKt$animate$4) continuation;
            if ((suspendAnimationKt$animate$4.label & Integer.MIN_VALUE) != 0) {
                suspendAnimationKt$animate$4.label -= Integer.MIN_VALUE;
                suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
                java.lang.Object obj = suspendAnimationKt$animate$42.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = suspendAnimationKt$animate$42.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final T valueFromNanos = animation3.getValueFromNanos(0L);
                    final V velocityVectorFromNanos = animation3.getVelocityVectorFromNanos(0L);
                    final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    try {
                        if (j == Long.MIN_VALUE) {
                            final float durationScale = getDurationScale(suspendAnimationKt$animate$42.getContext());
                            kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> function15 = new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/internal/Ref$ObjectRef<Landroidx/compose/animation/core/AnimationScope<TT;TV;>;>;TT;Landroidx/compose/animation/core/Animation<TT;TV;>;TV;Landroidx/compose/animation/core/AnimationState<TT;TV;>;FLkotlin/jvm/functions/Function1<-Landroidx/compose/animation/core/AnimationScope<TT;TV;>;Lkotlin/Unit;>;)V */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
                                    invoke(l.longValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.AnimationScope] */
                                public final void invoke(long j2) {
                                    kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.animation.core.AnimationScope<T, V>> objectRef3 = kotlin.jvm.internal.Ref.ObjectRef.this;
                                    T t2 = valueFromNanos;
                                    androidx.compose.animation.core.TwoWayConverter typeConverter = animation.getTypeConverter();
                                    androidx.compose.animation.core.AnimationVector animationVector = velocityVectorFromNanos;
                                    java.lang.Object targetValue = animation.getTargetValue();
                                    final androidx.compose.animation.core.AnimationState<T, V> animationState4 = animationState;
                                    ?? animationScope3 = new androidx.compose.animation.core.AnimationScope(t2, typeConverter, animationVector, j2, targetValue, j2, true, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$6.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            animationState4.setRunning$animation_core_release(false);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                            invoke2();
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    });
                                    androidx.compose.animation.core.SuspendAnimationKt.doAnimationFrameWithScale(animationScope3, j2, durationScale, animation, animationState, function1);
                                    objectRef3.element = animationScope3;
                                }
                            };
                            suspendAnimationKt$animate$42.L$0 = animationState3;
                            suspendAnimationKt$animate$42.L$1 = animation3;
                            function12 = function1;
                            suspendAnimationKt$animate$42.L$2 = function12;
                            suspendAnimationKt$animate$42.L$3 = objectRef2;
                            suspendAnimationKt$animate$42.label = 1;
                            if (callWithFrameNanos(animation3, function15, suspendAnimationKt$animate$42) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            function12 = function1;
                            try {
                                ?? r13 = (T) new androidx.compose.animation.core.AnimationScope(valueFromNanos, animation.getTypeConverter(), velocityVectorFromNanos, j, animation.getTargetValue(), j, true, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$7
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        animationState3.setRunning$animation_core_release(false);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                        invoke2();
                                        return kotlin.Unit.INSTANCE;
                                    }
                                });
                                objectRef2 = objectRef2;
                                doAnimationFrameWithScale(r13, j, getDurationScale(suspendAnimationKt$animate$42.getContext()), animation, animationState, function1);
                                objectRef2.element = r13;
                            } catch (java.util.concurrent.CancellationException e) {
                                e = e;
                                objectRef2 = objectRef2;
                                objectRef = objectRef2;
                                animationScope = (androidx.compose.animation.core.AnimationScope) objectRef.element;
                                if (animationScope != null) {
                                }
                                animationScope2 = (androidx.compose.animation.core.AnimationScope) objectRef.element;
                                if (animationScope2 != null) {
                                    animationState3.setRunning$animation_core_release(false);
                                }
                                throw e;
                            }
                        }
                        animationState2 = animationState3;
                        objectRef = objectRef2;
                    } catch (java.util.concurrent.CancellationException e2) {
                        e = e2;
                    }
                } else {
                    if (i == 1) {
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) suspendAnimationKt$animate$42.L$3;
                        function14 = (kotlin.jvm.functions.Function1) suspendAnimationKt$animate$42.L$2;
                        animation2 = (androidx.compose.animation.core.Animation) suspendAnimationKt$animate$42.L$1;
                        animationState2 = (androidx.compose.animation.core.AnimationState) suspendAnimationKt$animate$42.L$0;
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) suspendAnimationKt$animate$42.L$3;
                        function14 = (kotlin.jvm.functions.Function1) suspendAnimationKt$animate$42.L$2;
                        animation2 = (androidx.compose.animation.core.Animation) suspendAnimationKt$animate$42.L$1;
                        animationState2 = (androidx.compose.animation.core.AnimationState) suspendAnimationKt$animate$42.L$0;
                    }
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        function12 = function14;
                        animation3 = animation2;
                    } catch (java.util.concurrent.CancellationException e3) {
                        e = e3;
                        animationState3 = animationState2;
                        animationScope = (androidx.compose.animation.core.AnimationScope) objectRef.element;
                        if (animationScope != null) {
                            animationScope.setRunning$animation_core_release(false);
                        }
                        animationScope2 = (androidx.compose.animation.core.AnimationScope) objectRef.element;
                        if (animationScope2 != null && animationScope2.getLastFrameTimeNanos() == animationState3.getLastFrameTimeNanos()) {
                            animationState3.setRunning$animation_core_release(false);
                        }
                        throw e;
                    }
                }
                do {
                    t = objectRef.element;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                    if (!((androidx.compose.animation.core.AnimationScope) t).isRunning()) {
                        final float durationScale2 = getDurationScale(suspendAnimationKt$animate$42.getContext());
                        final kotlin.jvm.internal.Ref.ObjectRef objectRef3 = objectRef;
                        final androidx.compose.animation.core.Animation<T, V> animation4 = animation3;
                        final androidx.compose.animation.core.AnimationState<T, V> animationState4 = animationState2;
                        final kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function16 = function12;
                        function13 = new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$9
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

                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(long j2) {
                                T t2 = objectRef3.element;
                                kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
                                androidx.compose.animation.core.SuspendAnimationKt.doAnimationFrameWithScale((androidx.compose.animation.core.AnimationScope) t2, j2, durationScale2, animation4, animationState4, function16);
                            }
                        };
                        suspendAnimationKt$animate$42.L$0 = animationState2;
                        suspendAnimationKt$animate$42.L$1 = animation3;
                        suspendAnimationKt$animate$42.L$2 = function12;
                        suspendAnimationKt$animate$42.L$3 = objectRef;
                        suspendAnimationKt$animate$42.label = 2;
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                } while (callWithFrameNanos(animation3, function13, suspendAnimationKt$animate$42) != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        suspendAnimationKt$animate$4 = new androidx.compose.animation.core.SuspendAnimationKt$animate$4(continuation);
        suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
        java.lang.Object obj2 = suspendAnimationKt$animate$42.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = suspendAnimationKt$animate$42.label;
        if (i != 0) {
        }
        do {
            t = objectRef.element;
            kotlin.jvm.internal.Intrinsics.checkNotNull(t);
            if (!((androidx.compose.animation.core.AnimationScope) t).isRunning()) {
            }
        } while (callWithFrameNanos(animation3, function13, suspendAnimationKt$animate$42) != coroutine_suspended);
        return coroutine_suspended;
    }

    public static /* synthetic */ java.lang.Object animate$default(androidx.compose.animation.core.AnimationState animationState, androidx.compose.animation.core.Animation animation, long j, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$animate$5
                public final void invoke(androidx.compose.animation.core.AnimationScope<T, V> animationScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj2) {
                    invoke((androidx.compose.animation.core.AnimationScope) obj2);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        return animate(animationState, animation, j2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object callWithFrameNanos(androidx.compose.animation.core.Animation<T, V> animation, final kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        if (animation.getIsInfinite()) {
            return androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(function1, continuation);
        }
        return androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(new kotlin.jvm.functions.Function1<java.lang.Long, R>() { // from class: androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Long l) {
                return invoke(l.longValue());
            }

            public final R invoke(long j) {
                return function1.invoke(java.lang.Long.valueOf(j));
            }
        }, continuation);
    }

    public static final float getDurationScale(kotlin.coroutines.CoroutineContext coroutineContext) {
        androidx.compose.ui.MotionDurationScale motionDurationScale = (androidx.compose.ui.MotionDurationScale) coroutineContext.get(androidx.compose.ui.MotionDurationScale.INSTANCE);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (scaleFactor >= 0.0f) {
            return scaleFactor;
        }
        throw new java.lang.IllegalStateException("negative scale factor".toString());
    }

    public static final <T, V extends androidx.compose.animation.core.AnimationVector> void updateState(androidx.compose.animation.core.AnimationScope<T, V> animationScope, androidx.compose.animation.core.AnimationState<T, V> animationState) {
        animationState.setValue$animation_core_release(animationScope.getValue());
        androidx.compose.animation.core.AnimationVectorsKt.copyFrom(animationState.getVelocityVector(), animationScope.getVelocityVector());
        animationState.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        animationState.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        animationState.setRunning$animation_core_release(animationScope.isRunning());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> void doAnimationFrameWithScale(androidx.compose.animation.core.AnimationScope<T, V> animationScope, long j, float f, androidx.compose.animation.core.Animation<T, V> animation, androidx.compose.animation.core.AnimationState<T, V> animationState, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function1) {
        long startTimeNanos;
        if (f == 0.0f) {
            startTimeNanos = animation.getDurationNanos();
        } else {
            startTimeNanos = (long) ((j - animationScope.getStartTimeNanos()) / f);
        }
        doAnimationFrame(animationScope, j, startTimeNanos, animation, animationState, function1);
    }

    private static final <T, V extends androidx.compose.animation.core.AnimationVector> void doAnimationFrame(androidx.compose.animation.core.AnimationScope<T, V> animationScope, long j, long j2, androidx.compose.animation.core.Animation<T, V> animation, androidx.compose.animation.core.AnimationState<T, V> animationState, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> function1) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(j2));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j2));
        if (animation.isFinishedFromNanos(j2)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        function1.invoke(animationScope);
    }
}
