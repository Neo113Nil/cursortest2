package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1", f = "ModalBottomSheet.android.kt", i = {}, l = {638}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.ModalBottomSheetDialogWrapper.PredictiveBackOnBackPressedCallback getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (androidx.compose.animation.core.Animatable.animateTo$default(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(), kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), null, null, null, this, 14, null) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1(androidx.compose.material3.ModalBottomSheetDialogWrapper.PredictiveBackOnBackPressedCallback predictiveBackOnBackPressedCallback, kotlin.coroutines.Continuation<? super androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = predictiveBackOnBackPressedCallback;
    }
}
