package androidx.compose.material;

/* compiled from: Slider.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$3$drag$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class SliderKt$Slider$3$drag$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>> $gestureEndAction;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$Slider$3$drag$1$1(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>> state, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$Slider$3$drag$1$1> continuation) {
        super(3, continuation);
        this.$gestureEndAction = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return invoke(coroutineScope, f.floatValue(), continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material.SliderKt$Slider$3$drag$1$1 sliderKt$Slider$3$drag$1$1 = new androidx.compose.material.SliderKt$Slider$3$drag$1$1(this.$gestureEndAction, continuation);
        sliderKt$Slider$3$drag$1$1.F$0 = f;
        return sliderKt$Slider$3$drag$1$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.$gestureEndAction.getValue().invoke(kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.F$0));
        return kotlin.Unit.INSTANCE;
    }
}
