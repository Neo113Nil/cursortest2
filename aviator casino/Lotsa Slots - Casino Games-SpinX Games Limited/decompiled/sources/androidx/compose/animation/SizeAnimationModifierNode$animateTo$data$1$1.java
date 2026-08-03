package androidx.compose.animation;

/* compiled from: AnimationModifier.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class SizeAnimationModifierNode$animateTo$data$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ androidx.compose.animation.SizeAnimationModifierNode.AnimData $this_apply;
    int label;
    final /* synthetic */ androidx.compose.animation.SizeAnimationModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SizeAnimationModifierNode$animateTo$data$1$1(androidx.compose.animation.SizeAnimationModifierNode.AnimData animData, long j, androidx.compose.animation.SizeAnimationModifierNode sizeAnimationModifierNode, kotlin.coroutines.Continuation<? super androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = animData;
        this.$targetSize = j;
        this.this$0 = sizeAnimationModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize, kotlin.Unit> listener;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = androidx.compose.animation.core.Animatable.animateTo$default(this.$this_apply.getAnim(), androidx.compose.ui.unit.IntSize.m4644boximpl(this.$targetSize), this.this$0.getAnimationSpec(), null, null, this, 12, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.animation.core.AnimationResult animationResult = (androidx.compose.animation.core.AnimationResult) obj;
        if (animationResult.getEndReason() == androidx.compose.animation.core.AnimationEndReason.Finished && (listener = this.this$0.getListener()) != 0) {
            listener.invoke(androidx.compose.ui.unit.IntSize.m4644boximpl(this.$this_apply.m112getStartSizeYbymL2g()), animationResult.getEndState().getValue());
        }
        return kotlin.Unit.INSTANCE;
    }
}
