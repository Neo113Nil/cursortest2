package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class SnackbarHostKt$SnackbarHost$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.platform.AccessibilityManager getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.SnackbarData getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.material3.SnackbarData snackbarData = this.getHighSpeedVideoFpsRangesFor;
            if (snackbarData != null) {
                androidx.compose.material3.SnackbarDuration getHighResolutionOutputSizeshNQ4ISI = snackbarData.getGetHighSpeedVideoSizes().getGetHighResolutionOutputSizeshNQ4ISI();
                boolean z = this.getHighSpeedVideoFpsRangesFor.getGetHighSpeedVideoSizes().getGetHighSpeedVideoFpsRanges() != null;
                this.getHighSpeedVideoFpsRanges = 1;
                if (kotlinx.coroutines.DelayKt.delay(androidx.compose.material3.SnackbarHostKt.toMillis(getHighResolutionOutputSizeshNQ4ISI, z, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRangesFor.dismiss();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$SnackbarHost$1$1(androidx.compose.material3.SnackbarData snackbarData, androidx.compose.ui.platform.AccessibilityManager accessibilityManager, kotlin.coroutines.Continuation<? super androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = snackbarData;
        this.getHighResolutionOutputSizeshNQ4ISI = accessibilityManager;
    }
}
