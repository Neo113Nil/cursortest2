package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 1, 1, 1}, l = {428, 431}, m = "showSnackbar", n = {"visuals", "$this$withLock_u24default$iv", "visuals", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class SnackbarHostState$showSnackbar$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.material3.SnackbarHostState getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.showSnackbar(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostState$showSnackbar$2(androidx.compose.material3.SnackbarHostState snackbarHostState, kotlin.coroutines.Continuation<? super androidx.compose.material3.SnackbarHostState$showSnackbar$2> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = snackbarHostState;
    }
}
