package coil3.compose;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.compose.AsyncImagePreviewHandler$Companion$Default$1", f = "LocalAsyncImagePreviewHandler.kt", i = {0}, l = {38}, m = "handle", n = {"request"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class AsyncImagePreviewHandler$Companion$Default$1$handle$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ coil3.compose.AsyncImagePreviewHandler$Companion$Default$1 getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.handle(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncImagePreviewHandler$Companion$Default$1$handle$1(coil3.compose.AsyncImagePreviewHandler$Companion$Default$1 asyncImagePreviewHandler$Companion$Default$1, kotlin.coroutines.Continuation<? super coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = asyncImagePreviewHandler$Companion$Default$1;
    }
}
