package coil3.compose;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1 implements coil3.compose.AsyncImagePreviewHandler {
    final /* synthetic */ kotlin.jvm.functions.Function2<coil3.view.ImageRequest, kotlin.coroutines.Continuation<? super coil3.Image>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // coil3.compose.AsyncImagePreviewHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object handle(coil3.ImageLoader imageLoader, coil3.view.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil3.compose.AsyncImagePainter.State> continuation) {
        coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1 localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1;
        int i;
        if (continuation instanceof coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1) {
            localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1 = (coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1) continuation;
            if ((localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2<coil3.view.ImageRequest, kotlin.coroutines.Continuation<? super coil3.Image>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
                    localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1.getHighSpeedVideoFpsRangesFor = imageRequest;
                    localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1.Camera2StreamConfigurationMap = 1;
                    obj = function2.invoke(imageRequest, localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    imageRequest = (coil3.view.ImageRequest) localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                coil3.view.ImageRequest imageRequest2 = imageRequest;
                coil3.Image image = (coil3.Image) obj;
                return new coil3.compose.AsyncImagePainter.State.Success(coil3.compose.ImagePainter_androidKt.m9746asPainter55t9rM$default(image, imageRequest2.getContext(), 0, 2, null), new coil3.view.SuccessResult(image, imageRequest2, null, null, null, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
            }
        }
        localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1 = new coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1(this, continuation);
        java.lang.Object obj2 = localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = localAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        coil3.view.ImageRequest imageRequest22 = imageRequest;
        coil3.Image image2 = (coil3.Image) obj2;
        return new coil3.compose.AsyncImagePainter.State.Success(coil3.compose.ImagePainter_androidKt.m9746asPainter55t9rM$default(image2, imageRequest22.getContext(), 0, 2, null), new coil3.view.SuccessResult(image2, imageRequest22, null, null, null, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
    }

    public final java.lang.Object handle$$forInline(coil3.ImageLoader imageLoader, coil3.view.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil3.compose.AsyncImagePainter.State> continuation) {
        new coil3.compose.LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1$handle$1(this, continuation);
        coil3.Image image = (coil3.Image) this.getHighSpeedVideoFpsRangesFor.invoke(imageRequest, continuation);
        return new coil3.compose.AsyncImagePainter.State.Success(coil3.compose.ImagePainter_androidKt.m9746asPainter55t9rM$default(image, imageRequest.getContext(), 0, 2, null), new coil3.view.SuccessResult(image, imageRequest, null, null, null, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalAsyncImagePreviewHandlerKt$AsyncImagePreviewHandler$1(kotlin.jvm.functions.Function2<? super coil3.view.ImageRequest, ? super kotlin.coroutines.Continuation<? super coil3.Image>, ? extends java.lang.Object> function2) {
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
