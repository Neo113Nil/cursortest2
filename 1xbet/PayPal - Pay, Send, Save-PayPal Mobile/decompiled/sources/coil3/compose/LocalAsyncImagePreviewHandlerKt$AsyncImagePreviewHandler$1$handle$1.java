package coil3.compose;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1", f = "LocalAsyncImagePreviewHandler.kt", i = {0}, l = {54}, m = "handle", n = {"request"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
public final class LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1 getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.handle(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1(coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1 localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1, kotlin.coroutines.Continuation<? super coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1;
    }
}
