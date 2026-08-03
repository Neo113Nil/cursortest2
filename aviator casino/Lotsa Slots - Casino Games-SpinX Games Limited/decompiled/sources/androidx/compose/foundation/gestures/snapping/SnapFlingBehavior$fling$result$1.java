package androidx.compose.foundation.gestures.snapping;

/* compiled from: SnapFlingBehavior.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {0}, l = {174, 187}, m = "invokeSuspend", n = {"remainingScrollOffset"}, s = {"L$0"})
/* loaded from: classes.dex */
final class SnapFlingBehavior$fling$result$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>>, java.lang.Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollScope $this_fling;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.compose.foundation.gestures.snapping.SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapFlingBehavior$fling$result$1(androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior, float f, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1> continuation) {
        super(2, continuation);
        this.this$0 = snapFlingBehavior;
        this.$initialVelocity = f;
        this.$onRemainingScrollOffsetUpdate = function1;
        this.$this_fling = scrollScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> continuation) {
        return ((androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider snapLayoutInfoProvider;
        final kotlin.jvm.internal.Ref.FloatRef floatRef;
        java.lang.Object tryApproach;
        androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider snapLayoutInfoProvider2;
        androidx.compose.animation.core.AnimationSpec animationSpec;
        java.lang.Object animateWithTarget;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            snapLayoutInfoProvider = this.this$0.snapLayoutInfoProvider;
            float abs = java.lang.Math.abs(snapLayoutInfoProvider.calculateApproachOffset(this.$initialVelocity)) * java.lang.Math.signum(this.$initialVelocity);
            floatRef = new kotlin.jvm.internal.Ref.FloatRef();
            floatRef.element = abs;
            this.$onRemainingScrollOffsetUpdate.invoke(kotlin.coroutines.jvm.internal.Boxing.boxFloat(floatRef.element));
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior = this.this$0;
            androidx.compose.foundation.gestures.ScrollScope scrollScope = this.$this_fling;
            float f = floatRef.element;
            float f2 = this.$initialVelocity;
            final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> function1 = this.$onRemainingScrollOffsetUpdate;
            this.L$0 = floatRef;
            this.label = 1;
            tryApproach = snapFlingBehavior.tryApproach(scrollScope, f, f2, new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$animationState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f3) {
                    invoke(f3.floatValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(float f3) {
                    kotlin.jvm.internal.Ref.FloatRef.this.element -= f3;
                    function1.invoke(java.lang.Float.valueOf(kotlin.jvm.internal.Ref.FloatRef.this.element));
                }
            }, this);
            if (tryApproach == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.jvm.internal.Ref.FloatRef floatRef2 = (kotlin.jvm.internal.Ref.FloatRef) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            floatRef = floatRef2;
            tryApproach = obj;
        }
        androidx.compose.animation.core.AnimationState animationState = (androidx.compose.animation.core.AnimationState) tryApproach;
        snapLayoutInfoProvider2 = this.this$0.snapLayoutInfoProvider;
        floatRef.element = snapLayoutInfoProvider2.calculateSnappingOffset(((java.lang.Number) animationState.getVelocity()).floatValue());
        androidx.compose.foundation.gestures.ScrollScope scrollScope2 = this.$this_fling;
        float f3 = floatRef.element;
        float f4 = floatRef.element;
        androidx.compose.animation.core.AnimationState copy$default = androidx.compose.animation.core.AnimationStateKt.copy$default(animationState, 0.0f, 0.0f, 0L, 0L, false, 30, (java.lang.Object) null);
        animationSpec = this.this$0.snapAnimationSpec;
        final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> function12 = this.$onRemainingScrollOffsetUpdate;
        this.L$0 = null;
        this.label = 2;
        animateWithTarget = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.animateWithTarget(scrollScope2, f3, f4, copy$default, animationSpec, new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f5) {
                invoke(f5.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(float f5) {
                kotlin.jvm.internal.Ref.FloatRef.this.element -= f5;
                function12.invoke(java.lang.Float.valueOf(kotlin.jvm.internal.Ref.FloatRef.this.element));
            }
        }, this);
        return animateWithTarget == coroutine_suspended ? coroutine_suspended : animateWithTarget;
    }
}
