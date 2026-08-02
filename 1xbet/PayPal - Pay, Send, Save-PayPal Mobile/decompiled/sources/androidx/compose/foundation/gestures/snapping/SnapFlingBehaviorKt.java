package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a]\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0016*\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f2\u0017\u0010\u0015\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018\u001ac\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0016*\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00192\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\u0015\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0082@¢\u0006\u0004\b\u001a\u0010\u001b\u001ak\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0016*\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0017\u0010\u001c\u001a\u0013\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0082@¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010\u001d\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001f\u001a'\u0010&\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0000¢\u0006\u0004\b$\u0010%\"\u001a\u0010(\u001a\u00020'8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020\u00038\u0000X\u0081T¢\u0006\u0006\n\u0004\b,\u0010)\"\u0014\u0010-\u001a\u00020\u00038\u0000X\u0081T¢\u0006\u0006\n\u0004\b-\u0010)"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "snapLayoutInfoProvider", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "snapAnimationSpec", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "snapFlingBehavior", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "rememberSnapFlingBehavior", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollScope;", "p0", "p1", "Landroidx/compose/foundation/gestures/snapping/ApproachAnimation;", "Landroidx/compose/animation/core/AnimationVector1D;", "p2", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "p3", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/foundation/gestures/snapping/ApproachAnimation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/gestures/ScrollScope;FLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p4", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLandroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(FF)F", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "snappingOffset", "lowerBound", "upperBound", "calculateFinalOffset-Fhqu1e0", "(IFF)F", "calculateFinalOffset", "Landroidx/compose/ui/unit/Dp;", "MinFlingVelocityDp", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMinFlingVelocityDp", "()F", "NoDistance", "NoVelocity"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapFlingBehaviorKt {
    private static final float MinFlingVelocityDp = androidx.compose.ui.unit.Dp.m8601constructorimpl(400.0f);
    public static final float NoDistance = 0.0f;
    public static final float NoVelocity = 0.0f;

    private static final boolean getHighSpeedVideoFpsRangesFor(float f) {
        return (f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) ? false : true;
    }

    public static final androidx.compose.foundation.gestures.TargetedFlingBehavior snapFlingBehavior(androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider snapLayoutInfoProvider, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec) {
        return new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpec, animationSpec);
    }

    public static final androidx.compose.foundation.gestures.TargetedFlingBehavior rememberSnapFlingBehavior(androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider snapLayoutInfoProvider, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1921733134, i, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:230)");
        }
        java.lang.Object obj = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.animation.core.DecayAnimationSpec rememberSplineBasedDecay = androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(snapLayoutInfoProvider)) || (i & 6) == 4;
        boolean changed = composer.changed(rememberSplineBasedDecay);
        boolean changed2 = composer.changed(obj);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | z | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = snapFlingBehavior(snapLayoutInfoProvider, rememberSplineBasedDecay, androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null));
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior = (androidx.compose.foundation.gestures.TargetedFlingBehavior) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoFpsRanges(androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, float f2, androidx.compose.foundation.gestures.snapping.ApproachAnimation<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> approachAnimation, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        return approachAnimation.getHighResolutionOutputSizeshNQ4ISI(scrollScope, kotlin.coroutines.jvm.internal.Boxing.boxFloat(f), kotlin.coroutines.jvm.internal.Boxing.boxFloat(f2), function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object Camera2StreamConfigurationMap(final androidx.compose.foundation.gestures.ScrollScope scrollScope, final float f, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationState, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1 snapFlingBehaviorKt$animateDecay$1;
        int i;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        if (continuation instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1) {
            snapFlingBehaviorKt$animateDecay$1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1) continuation;
            if ((snapFlingBehaviorKt$animateDecay$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateDecay$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = snapFlingBehaviorKt$animateDecay$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snapFlingBehaviorKt$animateDecay$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    boolean z = animationState.getVelocity().floatValue() == 0.0f;
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.getHighResolutionOutputSizeshNQ4ISI(f, floatRef2, scrollScope, function1, (androidx.compose.animation.core.AnimationScope) obj2);
                            return highResolutionOutputSizeshNQ4ISI;
                        }
                    };
                    snapFlingBehaviorKt$animateDecay$1.getHighSpeedVideoSizes = animationState;
                    snapFlingBehaviorKt$animateDecay$1.Camera2StreamConfigurationMap = floatRef2;
                    snapFlingBehaviorKt$animateDecay$1.getHighSpeedVideoFpsRanges = f;
                    snapFlingBehaviorKt$animateDecay$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay(animationState, decayAnimationSpec, !z, function12, snapFlingBehaviorKt$animateDecay$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f = snapFlingBehaviorKt$animateDecay$1.getHighSpeedVideoFpsRanges;
                    floatRef = (kotlin.jvm.internal.Ref.FloatRef) snapFlingBehaviorKt$animateDecay$1.Camera2StreamConfigurationMap;
                    animationState = (androidx.compose.animation.core.AnimationState) snapFlingBehaviorKt$animateDecay$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new androidx.compose.foundation.gestures.snapping.AnimationResult(kotlin.coroutines.jvm.internal.Boxing.boxFloat(f - floatRef.element), animationState);
            }
        }
        snapFlingBehaviorKt$animateDecay$1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$1(continuation);
        java.lang.Object obj2 = snapFlingBehaviorKt$animateDecay$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snapFlingBehaviorKt$animateDecay$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return new androidx.compose.foundation.gestures.snapping.AnimationResult(kotlin.coroutines.jvm.internal.Boxing.boxFloat(f - floatRef.element), animationState);
    }

    private static final void getHighSpeedVideoFpsRangesFor(androidx.compose.animation.core.AnimationScope<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationScope, androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, float f) {
        float f2;
        try {
            f2 = scrollScope.scrollBy(f);
        } catch (java.util.concurrent.CancellationException unused) {
            animationScope.cancelAnimation();
            f2 = 0.0f;
        }
        function1.invoke(java.lang.Float.valueOf(f2));
        if (java.lang.Math.abs(f - f2) > 0.5f) {
            animationScope.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(float f, kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.jvm.functions.Function1 function1, androidx.compose.animation.core.AnimationScope animationScope) {
        if (java.lang.Math.abs(((java.lang.Number) animationScope.getValue()).floatValue()) >= java.lang.Math.abs(f)) {
            float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(((java.lang.Number) animationScope.getValue()).floatValue(), f);
            getHighSpeedVideoFpsRangesFor(animationScope, scrollScope, function1, highResolutionOutputSizeshNQ4ISI - floatRef.element);
            animationScope.cancelAnimation();
            floatRef.element = highResolutionOutputSizeshNQ4ISI;
        } else {
            getHighSpeedVideoFpsRangesFor(animationScope, scrollScope, function1, ((java.lang.Number) animationScope.getValue()).floatValue() - floatRef.element);
            floatRef.element = ((java.lang.Number) animationScope.getValue()).floatValue();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, final float f2, androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationState, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$1;
        int i;
        float f3;
        kotlin.jvm.internal.Ref.FloatRef floatRef;
        float f4;
        androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationState2;
        if (continuation instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1) {
            snapFlingBehaviorKt$animateWithTarget$1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1) continuation;
            if ((snapFlingBehaviorKt$animateWithTarget$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateWithTarget$1.getHighSpeedVideoFpsRanges -= 2147483648;
                androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$12 = snapFlingBehaviorKt$animateWithTarget$1;
                java.lang.Object obj = snapFlingBehaviorKt$animateWithTarget$12.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snapFlingBehaviorKt$animateWithTarget$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.FloatRef floatRef2 = new kotlin.jvm.internal.Ref.FloatRef();
                    float floatValue = animationState.getVelocity().floatValue();
                    java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
                    boolean z = animationState.getVelocity().floatValue() == 0.0f;
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            kotlin.Unit highSpeedVideoSizes;
                            highSpeedVideoSizes = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.getHighSpeedVideoSizes(f2, floatRef2, scrollScope, function1, (androidx.compose.animation.core.AnimationScope) obj2);
                            return highSpeedVideoSizes;
                        }
                    };
                    snapFlingBehaviorKt$animateWithTarget$12.getHighSpeedVideoSizes = animationState;
                    snapFlingBehaviorKt$animateWithTarget$12.getHighResolutionOutputSizeshNQ4ISI = floatRef2;
                    f3 = f;
                    snapFlingBehaviorKt$animateWithTarget$12.Camera2StreamConfigurationMap = f3;
                    snapFlingBehaviorKt$animateWithTarget$12.getHighSpeedVideoFpsRangesFor = floatValue;
                    snapFlingBehaviorKt$animateWithTarget$12.getHighSpeedVideoFpsRanges = 1;
                    if (androidx.compose.animation.core.SuspendAnimationKt.animateTo(animationState, boxFloat, animationSpec, !z, function12, snapFlingBehaviorKt$animateWithTarget$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef = floatRef2;
                    f4 = floatValue;
                    animationState2 = animationState;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f4 = snapFlingBehaviorKt$animateWithTarget$12.getHighSpeedVideoFpsRangesFor;
                    float f5 = snapFlingBehaviorKt$animateWithTarget$12.Camera2StreamConfigurationMap;
                    floatRef = (kotlin.jvm.internal.Ref.FloatRef) snapFlingBehaviorKt$animateWithTarget$12.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> animationState3 = (androidx.compose.animation.core.AnimationState) snapFlingBehaviorKt$animateWithTarget$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    f3 = f5;
                    animationState2 = animationState3;
                }
                return new androidx.compose.foundation.gestures.snapping.AnimationResult(kotlin.coroutines.jvm.internal.Boxing.boxFloat(f3 - floatRef.element), androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) animationState2, 0.0f, getHighResolutionOutputSizeshNQ4ISI(animationState2.getVelocity().floatValue(), f4), 0L, 0L, false, 29, (java.lang.Object) null));
            }
        }
        snapFlingBehaviorKt$animateWithTarget$1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1(continuation);
        androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$122 = snapFlingBehaviorKt$animateWithTarget$1;
        java.lang.Object obj2 = snapFlingBehaviorKt$animateWithTarget$122.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snapFlingBehaviorKt$animateWithTarget$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return new androidx.compose.foundation.gestures.snapping.AnimationResult(kotlin.coroutines.jvm.internal.Boxing.boxFloat(f3 - floatRef.element), androidx.compose.animation.core.AnimationStateKt.copy$default((androidx.compose.animation.core.AnimationState) animationState2, 0.0f, getHighResolutionOutputSizeshNQ4ISI(animationState2.getVelocity().floatValue(), f4), 0L, 0L, false, 29, (java.lang.Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(float f, kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.jvm.functions.Function1 function1, androidx.compose.animation.core.AnimationScope animationScope) {
        float f2;
        float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(((java.lang.Number) animationScope.getValue()).floatValue(), f);
        float f3 = highResolutionOutputSizeshNQ4ISI - floatRef.element;
        try {
            f2 = scrollScope.scrollBy(f3);
        } catch (java.util.concurrent.CancellationException unused) {
            animationScope.cancelAnimation();
            f2 = 0.0f;
        }
        function1.invoke(java.lang.Float.valueOf(f2));
        if (java.lang.Math.abs(f3 - f2) > 0.5f || highResolutionOutputSizeshNQ4ISI != ((java.lang.Number) animationScope.getValue()).floatValue()) {
            animationScope.cancelAnimation();
        }
        floatRef.element += f2;
        return kotlin.Unit.INSTANCE;
    }

    private static final float getHighResolutionOutputSizeshNQ4ISI(float f, float f2) {
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
    public static final float m1567calculateFinalOffsetFhqu1e0(int i, float f, float f2) {
        if (!androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m1559equalsimpl0(i, androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m1563getClosestItembbeMdSM())) {
            if (!androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m1559equalsimpl0(i, androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m1564getNextItembbeMdSM())) {
                if (!androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m1559equalsimpl0(i, androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m1565getPreviousItembbeMdSM())) {
                    f = 0.0f;
                }
            }
            f = f2;
        }
        if (getHighSpeedVideoFpsRangesFor(f)) {
            return f;
        }
        return 0.0f;
    }
}
