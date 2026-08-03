package androidx.compose.foundation.lazy.layout;

/* compiled from: LazyLayoutAnimation.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1", f = "LazyLayoutAnimation.kt", i = {0}, l = {127, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend", n = {"finalSpec"}, s = {"L$0"})
/* loaded from: classes.dex */
final class LazyLayoutAnimation$animatePlacementDelta$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> $spec;
    final /* synthetic */ long $totalDelta;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutAnimation$animatePlacementDelta$1(androidx.compose.foundation.lazy.layout.LazyLayoutAnimation lazyLayoutAnimation, androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec, long j, kotlin.coroutines.Continuation<? super androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1> continuation) {
        super(2, continuation);
        this.this$0 = lazyLayoutAnimation;
        this.$spec = finiteAnimationSpec;
        this.$totalDelta = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.animation.core.Animatable animatable;
        androidx.compose.animation.core.SpringSpec springSpec;
        androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec;
        androidx.compose.animation.core.Animatable animatable2;
        androidx.compose.animation.core.Animatable animatable3;
        androidx.compose.animation.core.SpringSpec springSpec2;
        androidx.compose.animation.core.Animatable animatable4;
        androidx.compose.animation.core.Animatable animatable5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            animatable = this.this$0.placementDeltaAnimation;
            if (animatable.isRunning()) {
                androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec2 = this.$spec;
                if (!(finiteAnimationSpec2 instanceof androidx.compose.animation.core.SpringSpec)) {
                    springSpec2 = androidx.compose.foundation.lazy.layout.LazyLayoutAnimationKt.InterruptionSpec;
                } else {
                    springSpec2 = (androidx.compose.animation.core.SpringSpec) finiteAnimationSpec2;
                }
                springSpec = springSpec2;
            } else {
                springSpec = this.$spec;
            }
            finiteAnimationSpec = springSpec;
            animatable2 = this.this$0.placementDeltaAnimation;
            if (!animatable2.isRunning()) {
                animatable3 = this.this$0.placementDeltaAnimation;
                this.L$0 = finiteAnimationSpec;
                this.label = 1;
                if (animatable3.snapTo(androidx.compose.ui.unit.IntOffset.m4601boximpl(this.$totalDelta), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.this$0.setPlacementAnimationInProgress(false);
                return kotlin.Unit.INSTANCE;
            }
            finiteAnimationSpec = (androidx.compose.animation.core.FiniteAnimationSpec) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        animatable4 = this.this$0.placementDeltaAnimation;
        long packedValue = ((androidx.compose.ui.unit.IntOffset) animatable4.getValue()).getPackedValue();
        long j = this.$totalDelta;
        final long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(packedValue) - androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(packedValue) - androidx.compose.ui.unit.IntOffset.m4611getYimpl(j));
        animatable5 = this.this$0.placementDeltaAnimation;
        androidx.compose.ui.unit.IntOffset m4601boximpl = androidx.compose.ui.unit.IntOffset.m4601boximpl(IntOffset);
        androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset> finiteAnimationSpec3 = finiteAnimationSpec;
        final androidx.compose.foundation.lazy.layout.LazyLayoutAnimation lazyLayoutAnimation = this.this$0;
        this.L$0 = null;
        this.label = 2;
        if (androidx.compose.animation.core.Animatable.animateTo$default(animatable5, m4601boximpl, finiteAnimationSpec3, null, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D>, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$animatePlacementDelta$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> animatable6) {
                invoke2(animatable6);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.IntOffset, androidx.compose.animation.core.AnimationVector2D> animatable6) {
                androidx.compose.foundation.lazy.layout.LazyLayoutAnimation lazyLayoutAnimation2 = androidx.compose.foundation.lazy.layout.LazyLayoutAnimation.this;
                long packedValue2 = animatable6.getValue().getPackedValue();
                long j2 = IntOffset;
                lazyLayoutAnimation2.m715setPlacementDeltagyyYBs(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(packedValue2) - androidx.compose.ui.unit.IntOffset.m4610getXimpl(j2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(packedValue2) - androidx.compose.ui.unit.IntOffset.m4611getYimpl(j2)));
            }
        }, this, 4, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.this$0.setPlacementAnimationInProgress(false);
        return kotlin.Unit.INSTANCE;
    }
}
