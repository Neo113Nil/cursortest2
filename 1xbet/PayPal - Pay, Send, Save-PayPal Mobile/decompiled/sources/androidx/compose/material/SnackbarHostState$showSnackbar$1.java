package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SnackbarHostState", f = "SnackbarHost.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {368, 371}, m = "showSnackbar", n = {"message", "actionLabel", "duration", "$this$withLock_u24default$iv", "message", "actionLabel", "duration", "$this$withLock_u24default$iv", "$completion$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 1)
/* loaded from: classes.dex */
final class SnackbarHostState$showSnackbar$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ androidx.compose.material.SnackbarHostState getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputFormats.showSnackbar(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostState$showSnackbar$1(androidx.compose.material.SnackbarHostState snackbarHostState, kotlin.coroutines.Continuation<? super androidx.compose.material.SnackbarHostState$showSnackbar$1> continuation) {
        super(continuation);
        this.getOutputFormats = snackbarHostState;
    }
}
