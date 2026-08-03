package androidx.compose.foundation.gestures;

/* compiled from: TransformableState.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class TransformableStateKt$animatePanBy$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.TransformScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> $animationSpec;
    final /* synthetic */ long $offset;
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef $previous;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animatePanBy$2(kotlin.jvm.internal.Ref.LongRef longRef, long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> animationSpec, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2> continuation) {
        super(2, continuation);
        this.$previous = longRef;
        this.$offset = j;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2(this.$previous, this.$offset, this.$animationSpec, continuation);
        transformableStateKt$animatePanBy$2.L$0 = obj;
        return transformableStateKt$animatePanBy$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.compose.foundation.gestures.TransformScope transformScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2) create(transformScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.TransformScope transformScope = (androidx.compose.foundation.gestures.TransformScope) this.L$0;
            androidx.compose.animation.core.AnimationState animationState = new androidx.compose.animation.core.AnimationState(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE), androidx.compose.ui.geometry.Offset.m1860boximpl(this.$previous.element), null, 0L, 0L, false, 60, null);
            androidx.compose.ui.geometry.Offset m1860boximpl = androidx.compose.ui.geometry.Offset.m1860boximpl(this.$offset);
            androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> animationSpec = this.$animationSpec;
            final kotlin.jvm.internal.Ref.LongRef longRef = this.$previous;
            this.label = 1;
            if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(animationState, m1860boximpl, animationSpec, false, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationScope<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D>, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.core.AnimationScope<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> animationScope) {
                    invoke2(animationScope);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.animation.core.AnimationScope<androidx.compose.ui.geometry.Offset, androidx.compose.animation.core.AnimationVector2D> animationScope) {
                    androidx.compose.foundation.gestures.TransformScope.CC.m422transformByd4ec7I$default(transformScope, 0.0f, androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(animationScope.getValue().getPackedValue(), kotlin.jvm.internal.Ref.LongRef.this.element), 0.0f, 5, null);
                    kotlin.jvm.internal.Ref.LongRef.this.element = animationScope.getValue().getPackedValue();
                }
            }, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
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
