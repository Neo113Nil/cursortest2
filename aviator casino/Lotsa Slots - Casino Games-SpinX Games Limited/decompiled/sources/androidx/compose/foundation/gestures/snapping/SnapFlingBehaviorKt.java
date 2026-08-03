package androidx.compose.foundation.gestures.snapping;

/* compiled from: SnapFlingBehavior.kt */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0082\b\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001ak\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0#2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00120%H\u0082@¢\u0006\u0002\u0010)\u001as\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0!2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00120%H\u0082@¢\u0006\u0002\u0010.\u001ae\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0\u001c*\u00020\u001e2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\b2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d032!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00120%H\u0082@¢\u0006\u0002\u00104\u001a\u0014\u00105\u001a\u00020\b*\u00020\b2\u0006\u00106\u001a\u00020\bH\u0002\u001a(\u00107\u001a\u0002H8\"\u000e\b\u0000\u00108*\b\u0012\u0004\u0012\u0002H809*\b\u0012\u0004\u0012\u0002H80:H\u0082\u0002¢\u0006\u0002\u0010;\u001a(\u0010<\u001a\u0002H8\"\u000e\b\u0000\u00108*\b\u0012\u0004\u0012\u0002H809*\b\u0012\u0004\u0012\u0002H80:H\u0082\u0002¢\u0006\u0002\u0010;\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"DEBUG", "", "MinFlingVelocityDp", "Landroidx/compose/ui/unit/Dp;", "getMinFlingVelocityDp", "()F", "F", "NoDistance", "", "NoVelocity", "calculateFinalOffset", "snappingOffset", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "lowerBound", "upperBound", "calculateFinalOffset-Fhqu1e0", "(IFF)F", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "animateDecay", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/foundation/gestures/ScrollScope;", "targetOffset", "animationState", "Landroidx/compose/animation/core/AnimationState;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "onAnimationStep", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "delta", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateWithTarget", "cancelOffset", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "approach", "initialTargetOffset", "initialVelocity", "animation", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/foundation/gestures/snapping/ApproachAnimation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coerceToTarget", "target", "component1", "T", "", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "component2", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt {
    private static final boolean DEBUG = false;
    private static final float MinFlingVelocityDp = androidx.compose.ui.unit.Dp.m4478constructorimpl(400);
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    private static final boolean calculateFinalOffset_Fhqu1e0$isValidDistance(float f) {
        return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
    }

    private static final void debugLog(kotlin.jvm.functions.Function0<java.lang.String> function0) {
    }

    public static final androidx.compose.foundation.gestures.snapping.SnapFlingBehavior rememberSnapFlingBehavior(androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider snapLayoutInfoProvider, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-473984552);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberSnapFlingBehavior)285@12593L7,286@12663L26,287@12701L416:SnapFlingBehavior.kt#ppz6w6");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-473984552, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:284)");
        }
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localDensity);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        androidx.compose.animation.core.DecayAnimationSpec rememberSplineBasedDecay = androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        composer.startReplaceableGroup(1618982084);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed((androidx.compose.ui.unit.Density) consume) | composer.changed(snapLayoutInfoProvider) | composer.changed(rememberSplineBasedDecay);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior(snapLayoutInfoProvider, androidx.compose.animation.core.AnimationSpecKt.tween$default(0, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 3, null), rememberSplineBasedDecay, androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object approach(androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, float f2, androidx.compose.foundation.gestures.snapping.ApproachAnimation<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> approachAnimation, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        return approachAnimation.approachAnimation(scrollScope, kotlin.coroutines.jvm.internal.Boxing.boxFloat(f), kotlin.coroutines.jvm.internal.Boxing.boxFloat(f2), function1, continuation);
    }

    private static final <T extends java.lang.Comparable<? super T>> T component1(kotlin.ranges.ClosedFloatingPointRange<T> closedFloatingPointRange) {
        return closedFloatingPointRange.getStart();
    }

    private static final <T extends java.lang.Comparable<? super T>> T component2(kotlin.ranges.ClosedFloatingPointRange<T> closedFloatingPointRange) {
        return closedFloatingPointRange.getEndInclusive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object animateDecay(final androidx.compose.foundation.gestures.ScrollScope scrollScope, final float f, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationState, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 snapFlingBehaviorKt$animateDecay$1;
        int i;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        if (continuation instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1) {
            snapFlingBehaviorKt$animateDecay$1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1) continuation;
            if ((snapFlingBehaviorKt$animateDecay$1.label & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateDecay$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = snapFlingBehaviorKt$animateDecay$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snapFlingBehaviorKt$animateDecay$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    boolean z = animationState.getVelocity().floatValue() == 0.0f;
                    kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
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
                            float coerceToTarget;
                            if (java.lang.Math.abs(animationScope.getValue().floatValue()) >= java.lang.Math.abs(f)) {
                                coerceToTarget = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.coerceToTarget(animationScope.getValue().floatValue(), f);
                                androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay$consumeDelta(animationScope, scrollScope, function1, coerceToTarget - floatRef2.element);
                                animationScope.cancelAnimation();
                                floatRef2.element = coerceToTarget;
                                return;
                            }
                            androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateDecay$consumeDelta(animationScope, scrollScope, function1, animationScope.getValue().floatValue() - floatRef2.element);
                            floatRef2.element = animationScope.getValue().floatValue();
                        }
                    };
                    snapFlingBehaviorKt$animateDecay$1.L$0 = animationState;
                    snapFlingBehaviorKt$animateDecay$1.L$1 = floatRef2;
                    snapFlingBehaviorKt$animateDecay$1.F$0 = f;
                    snapFlingBehaviorKt$animateDecay$1.label = 1;
                    if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay(animationState, decayAnimationSpec, !z, function12, snapFlingBehaviorKt$animateDecay$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f = snapFlingBehaviorKt$animateDecay$1.F$0;
                    floatRef = (kotlin.jvm.internal.Ref.FloatRef) snapFlingBehaviorKt$animateDecay$1.L$1;
                    animationState = (androidx.compose.animation.core.AnimationState) snapFlingBehaviorKt$animateDecay$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new androidx.compose.foundation.gestures.snapping.AnimationResult(kotlin.coroutines.jvm.internal.Boxing.boxFloat(f - floatRef.element), animationState);
            }
        }
        snapFlingBehaviorKt$animateDecay$1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1(continuation);
        java.lang.Object obj2 = snapFlingBehaviorKt$animateDecay$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snapFlingBehaviorKt$animateDecay$1.label;
        if (i != 0) {
        }
        return new androidx.compose.foundation.gestures.snapping.AnimationResult(kotlin.coroutines.jvm.internal.Boxing.boxFloat(f - floatRef.element), animationState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateDecay$consumeDelta(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope, androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, float f) {
        float scrollBy = scrollScope.scrollBy(f);
        function1.invoke(java.lang.Float.valueOf(scrollBy));
        if (java.lang.Math.abs(f - scrollBy) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object animateWithTarget(final androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, final float f2, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationState, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$1;
        int i;
        float f3;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        float f4;
        androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationState2;
        if (continuation instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1) {
            snapFlingBehaviorKt$animateWithTarget$1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1) continuation;
            if ((snapFlingBehaviorKt$animateWithTarget$1.label & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateWithTarget$1.label -= Integer.MIN_VALUE;
                androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$12 = snapFlingBehaviorKt$animateWithTarget$1;
                java.lang.Object obj = snapFlingBehaviorKt$animateWithTarget$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snapFlingBehaviorKt$animateWithTarget$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    float floatValue = animationState.getVelocity().floatValue();
                    java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
                    boolean z = !(animationState.getVelocity().floatValue() == 0.0f);
                    kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$2
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
                            float coerceToTarget;
                            coerceToTarget = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.coerceToTarget(animationScope.getValue().floatValue(), f2);
                            float f5 = coerceToTarget - floatRef2.element;
                            float scrollBy = scrollScope.scrollBy(f5);
                            function1.invoke(java.lang.Float.valueOf(scrollBy));
                            if (java.lang.Math.abs(f5 - scrollBy) > 0.5f || coerceToTarget != animationScope.getValue().floatValue()) {
                                animationScope.cancelAnimation();
                            }
                            floatRef2.element += scrollBy;
                        }
                    };
                    snapFlingBehaviorKt$animateWithTarget$12.L$0 = animationState;
                    snapFlingBehaviorKt$animateWithTarget$12.L$1 = floatRef2;
                    f3 = f;
                    snapFlingBehaviorKt$animateWithTarget$12.F$0 = f3;
                    snapFlingBehaviorKt$animateWithTarget$12.F$1 = floatValue;
                    snapFlingBehaviorKt$animateWithTarget$12.label = 1;
                    if (androidx.compose.animation.core.SuspendAnimationKt.animateTo(animationState, boxFloat, animationSpec, z, function12, snapFlingBehaviorKt$animateWithTarget$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                    f4 = floatValue;
                    animationState2 = animationState;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f4 = snapFlingBehaviorKt$animateWithTarget$12.F$1;
                    float f5 = snapFlingBehaviorKt$animateWithTarget$12.F$0;
                    floatRef = (kotlin.jvm.internal.Ref.FloatRef) snapFlingBehaviorKt$animateWithTarget$12.L$1;
                    androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationState3 = (androidx.compose.animation.core.AnimationState) snapFlingBehaviorKt$animateWithTarget$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    f3 = f5;
                    animationState2 = animationState3;
                }
                return new androidx.compose.foundation.gestures.snapping.AnimationResult(kotlin.coroutines.jvm.internal.Boxing.boxFloat(f3 - floatRef.element), androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) animationState2, 0.0f, coerceToTarget(animationState2.getVelocity().floatValue(), f4), 0L, 0L, false, 29, (java.lang.Object) null));
            }
        }
        snapFlingBehaviorKt$animateWithTarget$1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1(continuation);
        androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$122 = snapFlingBehaviorKt$animateWithTarget$1;
        java.lang.Object obj2 = snapFlingBehaviorKt$animateWithTarget$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snapFlingBehaviorKt$animateWithTarget$122.label;
        if (i != 0) {
        }
        return new androidx.compose.foundation.gestures.snapping.AnimationResult(kotlin.coroutines.jvm.internal.Boxing.boxFloat(f3 - floatRef.element), androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) animationState2, 0.0f, coerceToTarget(animationState2.getVelocity().floatValue(), f4), 0L, 0L, false, 29, (java.lang.Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? kotlin.ranges.RangesKt.coerceAtMost(f, f2) : kotlin.ranges.RangesKt.coerceAtLeast(f, f2);
    }

    public static final float getMinFlingVelocityDp() {
        return MinFlingVelocityDp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (java.lang.Math.abs(r4) <= java.lang.Math.abs(r3)) goto L9;
     */
    /* renamed from: calculateFinalOffset-Fhqu1e0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float m440calculateFinalOffsetFhqu1e0(int i, float f, float f2) {
        if (!androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m433equalsimpl0(i, androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m437getClosestItembbeMdSM())) {
            if (!androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m433equalsimpl0(i, androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m438getNextItembbeMdSM())) {
                if (!androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m433equalsimpl0(i, androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m439getPreviousItembbeMdSM())) {
                    f = 0.0f;
                }
            }
            f = f2;
        }
        if (calculateFinalOffset_Fhqu1e0$isValidDistance(f)) {
            return f;
        }
        return 0.0f;
    }
}
