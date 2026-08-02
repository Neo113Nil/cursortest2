package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class ModalBottomSheetKt$ModalBottomSheetContent$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes.invoke(kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighSpeedVideoFpsRangesFor));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        float floatValue = f.floatValue();
        androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1 modalBottomSheetKt$ModalBottomSheetContent$4$1 = new androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1(this.getHighSpeedVideoSizes, continuation);
        modalBottomSheetKt$ModalBottomSheetContent$4$1.getHighSpeedVideoFpsRangesFor = floatValue;
        return modalBottomSheetKt$ModalBottomSheetContent$4$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ModalBottomSheetKt$ModalBottomSheetContent$4$1(kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = function1;
    }
}
