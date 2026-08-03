package androidx.compose.foundation.gestures.snapping;

/* compiled from: SnapFlingBehavior.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\fJ\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J:\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u001d*\u00020\u001f2\u0006\u0010 \u001a\u00020\u00062\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#0\"H\u0082@¢\u0006\u0002\u0010$J\u001a\u0010%\u001a\u00020\u0006*\u00020\u001f2\u0006\u0010 \u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010&J.\u0010%\u001a\u00020\u0006*\u00020\u001f2\u0006\u0010 \u001a\u00020\u00062\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#0\"H\u0086@¢\u0006\u0002\u0010$JQ\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u001d*\u00020\u001f2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020#0\"H\u0082@¢\u0006\u0002\u0010.JB\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e00*\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020#0\"H\u0082@¢\u0006\u0002\u0010.R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lowVelocityAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "highVelocityAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "shortSnapVelocityThreshold", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;F)V", "(Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)V", "motionScaleDuration", "Landroidx/compose/ui/MotionDurationScale;", "getMotionScaleDuration$foundation_release", "()Landroidx/compose/ui/MotionDurationScale;", "setMotionScaleDuration$foundation_release", "(Landroidx/compose/ui/MotionDurationScale;)V", "equals", "", "other", "", "hashCode", "", "isDecayApproachPossible", "offset", "velocity", "fling", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "onRemainingScrollOffsetUpdate", "Lkotlin/Function1;", "", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSettlingDistanceUpdated", "runApproach", "initialTargetOffset", "onAnimationStep", "Lkotlin/ParameterName;", "name", "delta", "(Landroidx/compose/foundation/gestures/ScrollScope;FFLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryApproach", "Landroidx/compose/animation/core/AnimationState;", "updateRemainingScrollOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapFlingBehavior implements androidx.compose.foundation.gestures.FlingBehavior {
    public static final int $stable = 0;
    private final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> highVelocityAnimationSpec;
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> lowVelocityAnimationSpec;
    private androidx.compose.ui.MotionDurationScale motionScaleDuration;
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> snapAnimationSpec;
    private final androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider snapLayoutInfoProvider;

    public SnapFlingBehavior(androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider snapLayoutInfoProvider, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec2) {
        this.snapLayoutInfoProvider = snapLayoutInfoProvider;
        this.lowVelocityAnimationSpec = animationSpec;
        this.highVelocityAnimationSpec = decayAnimationSpec;
        this.snapAnimationSpec = animationSpec2;
        this.motionScaleDuration = androidx.compose.foundation.gestures.ScrollableKt.getDefaultScrollMotionDurationScale();
    }

    @kotlin.Deprecated(message = "Please use the constructor without the shortSnapVelocityThreshold. The functionality provided by shortSnapVelocityThreshold can be implemented by SnapLayoutInfoProvider.")
    public SnapFlingBehavior(androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider snapLayoutInfoProvider, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec2, float f) {
        this(snapLayoutInfoProvider, animationSpec, decayAnimationSpec, animationSpec2);
    }

    /* renamed from: getMotionScaleDuration$foundation_release, reason: from getter */
    public final androidx.compose.ui.MotionDurationScale getMotionScaleDuration() {
        return this.motionScaleDuration;
    }

    public final void setMotionScaleDuration$foundation_release(androidx.compose.ui.MotionDurationScale motionDurationScale) {
        this.motionScaleDuration = motionDurationScale;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        return performFling(scrollScope, f, new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$2
            public final void invoke(float f2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f2) {
                invoke(f2.floatValue());
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3 snapFlingBehavior$performFling$3;
        int i;
        if (continuation instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3) {
            snapFlingBehavior$performFling$3 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3) continuation;
            if ((snapFlingBehavior$performFling$3.label & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$performFling$3.label -= Integer.MIN_VALUE;
                java.lang.Object obj = snapFlingBehavior$performFling$3.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snapFlingBehavior$performFling$3.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    snapFlingBehavior$performFling$3.label = 1;
                    obj = fling(scrollScope, f, function1, snapFlingBehavior$performFling$3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                androidx.compose.foundation.gestures.snapping.AnimationResult animationResult = (androidx.compose.foundation.gestures.snapping.AnimationResult) obj;
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(((java.lang.Number) animationResult.component1()).floatValue() != 0.0f ? ((java.lang.Number) animationResult.component2().getVelocity()).floatValue() : 0.0f);
            }
        }
        snapFlingBehavior$performFling$3 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$3(this, continuation);
        java.lang.Object obj2 = snapFlingBehavior$performFling$3.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snapFlingBehavior$performFling$3.label;
        if (i != 0) {
        }
        androidx.compose.foundation.gestures.snapping.AnimationResult animationResult2 = (androidx.compose.foundation.gestures.snapping.AnimationResult) obj2;
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(((java.lang.Number) animationResult2.component1()).floatValue() != 0.0f ? ((java.lang.Number) animationResult2.component2().getVelocity()).floatValue() : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fling(androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 snapFlingBehavior$fling$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1) {
            snapFlingBehavior$fling$1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1) continuation;
            if ((snapFlingBehavior$fling$1.label & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$fling$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = snapFlingBehavior$fling$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snapFlingBehavior$fling$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.MotionDurationScale motionDurationScale = this.motionScaleDuration;
                    androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 snapFlingBehavior$fling$result$1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1(this, f, function1, scrollScope, null);
                    snapFlingBehavior$fling$1.L$0 = function1;
                    snapFlingBehavior$fling$1.label = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(motionDurationScale, snapFlingBehavior$fling$result$1, snapFlingBehavior$fling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) snapFlingBehavior$fling$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                androidx.compose.foundation.gestures.snapping.AnimationResult animationResult = (androidx.compose.foundation.gestures.snapping.AnimationResult) obj;
                function1.invoke(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f));
                return animationResult;
            }
        }
        snapFlingBehavior$fling$1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1(this, continuation);
        java.lang.Object obj2 = snapFlingBehavior$fling$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snapFlingBehavior$fling$1.label;
        if (i != 0) {
        }
        androidx.compose.foundation.gestures.snapping.AnimationResult animationResult2 = (androidx.compose.foundation.gestures.snapping.AnimationResult) obj2;
        function1.invoke(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f));
        return animationResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object tryApproach(androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, float f2, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1) {
            snapFlingBehavior$tryApproach$1 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1) continuation;
            if ((snapFlingBehavior$tryApproach$1.label & Integer.MIN_VALUE) != 0) {
                snapFlingBehavior$tryApproach$1.label -= Integer.MIN_VALUE;
                androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$12 = snapFlingBehavior$tryApproach$1;
                java.lang.Object obj = snapFlingBehavior$tryApproach$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = snapFlingBehavior$tryApproach$12.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (java.lang.Math.abs(f) == 0.0f || java.lang.Math.abs(f2) == 0.0f) {
                        return androidx.compose.animation.core.AnimationStateKt.AnimationState$default(f, f2, 0L, 0L, false, 28, null);
                    }
                    snapFlingBehavior$tryApproach$12.label = 1;
                    obj = runApproach(scrollScope, f, f2, function1, snapFlingBehavior$tryApproach$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((androidx.compose.foundation.gestures.snapping.AnimationResult) obj).getCurrentAnimationState();
            }
        }
        snapFlingBehavior$tryApproach$1 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1(this, continuation);
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 snapFlingBehavior$tryApproach$122 = snapFlingBehavior$tryApproach$1;
        java.lang.Object obj2 = snapFlingBehavior$tryApproach$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snapFlingBehavior$tryApproach$122.label;
        if (i != 0) {
        }
        return ((androidx.compose.foundation.gestures.snapping.AnimationResult) obj2).getCurrentAnimationState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object runApproach(androidx.compose.foundation.gestures.ScrollScope scrollScope, float f, float f2, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        androidx.compose.foundation.gestures.snapping.LowVelocityApproachAnimation lowVelocityApproachAnimation;
        java.lang.Object approach;
        if (isDecayApproachPossible(f, f2)) {
            lowVelocityApproachAnimation = new androidx.compose.foundation.gestures.snapping.HighVelocityApproachAnimation(this.highVelocityAnimationSpec);
        } else {
            lowVelocityApproachAnimation = new androidx.compose.foundation.gestures.snapping.LowVelocityApproachAnimation(this.lowVelocityAnimationSpec);
        }
        approach = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.approach(scrollScope, f, f2, lowVelocityApproachAnimation, function1, continuation);
        return approach;
    }

    private final boolean isDecayApproachPossible(float offset, float velocity) {
        return java.lang.Math.abs(androidx.compose.animation.core.DecayAnimationSpecKt.calculateTargetValue(this.highVelocityAnimationSpec, 0.0f, velocity)) >= java.lang.Math.abs(offset);
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior)) {
            return false;
        }
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) && kotlin.jvm.internal.Intrinsics.areEqual(snapFlingBehavior.highVelocityAnimationSpec, this.highVelocityAnimationSpec) && kotlin.jvm.internal.Intrinsics.areEqual(snapFlingBehavior.lowVelocityAnimationSpec, this.lowVelocityAnimationSpec) && kotlin.jvm.internal.Intrinsics.areEqual(snapFlingBehavior.snapLayoutInfoProvider, this.snapLayoutInfoProvider);
    }

    public int hashCode() {
        return (((((this.snapAnimationSpec.hashCode() * 31) + this.highVelocityAnimationSpec.hashCode()) * 31) + this.lowVelocityAnimationSpec.hashCode()) * 31) + this.snapLayoutInfoProvider.hashCode();
    }
}
