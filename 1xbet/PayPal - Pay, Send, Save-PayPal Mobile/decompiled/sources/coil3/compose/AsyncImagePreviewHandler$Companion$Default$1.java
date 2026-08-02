package coil3.compose;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class AsyncImagePreviewHandler$Companion$Default$1 implements coil3.compose.AsyncImagePreviewHandler {
    public static final coil3.compose.AsyncImagePreviewHandler$Companion$Default$1 Camera2StreamConfigurationMap = new coil3.compose.AsyncImagePreviewHandler$Companion$Default$1();

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // coil3.compose.AsyncImagePreviewHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object handle(coil3.ImageLoader imageLoader, coil3.view.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil3.compose.AsyncImagePainter.State> continuation) {
        coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1 asyncImagePreviewHandler$Companion$Default$1$handle$1;
        int i;
        coil3.view.ImageResult imageResult;
        if (continuation instanceof coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1) {
            asyncImagePreviewHandler$Companion$Default$1$handle$1 = (coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1) continuation;
            if ((asyncImagePreviewHandler$Companion$Default$1$handle$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                asyncImagePreviewHandler$Companion$Default$1$handle$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = asyncImagePreviewHandler$Companion$Default$1$handle$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = asyncImagePreviewHandler$Companion$Default$1$handle$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    asyncImagePreviewHandler$Companion$Default$1$handle$1.getHighResolutionOutputSizeshNQ4ISI = imageRequest;
                    asyncImagePreviewHandler$Companion$Default$1$handle$1.getHighSpeedVideoSizes = 1;
                    obj = imageLoader.execute(imageRequest, asyncImagePreviewHandler$Companion$Default$1$handle$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    imageRequest = (coil3.view.ImageRequest) asyncImagePreviewHandler$Companion$Default$1$handle$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                imageResult = (coil3.view.ImageResult) obj;
                if (!(imageResult instanceof coil3.view.SuccessResult)) {
                    coil3.view.SuccessResult successResult = (coil3.view.SuccessResult) imageResult;
                    return new coil3.compose.AsyncImagePainter.State.Success(coil3.compose.ImagePainter_androidKt.m9746asPainter55t9rM$default(successResult.getImage(), imageRequest.getContext(), 0, 2, null), successResult);
                }
                if (!(imageResult instanceof coil3.view.ErrorResult)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                coil3.view.ErrorResult errorResult = (coil3.view.ErrorResult) imageResult;
                coil3.Image image = errorResult.getImage();
                return new coil3.compose.AsyncImagePainter.State.Error(image != null ? coil3.compose.ImagePainter_androidKt.m9746asPainter55t9rM$default(image, imageRequest.getContext(), 0, 2, null) : null, errorResult);
            }
        }
        asyncImagePreviewHandler$Companion$Default$1$handle$1 = new coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1(this, continuation);
        java.lang.Object obj2 = asyncImagePreviewHandler$Companion$Default$1$handle$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = asyncImagePreviewHandler$Companion$Default$1$handle$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        imageResult = (coil3.view.ImageResult) obj2;
        if (!(imageResult instanceof coil3.view.SuccessResult)) {
        }
    }

    AsyncImagePreviewHandler$Companion$Default$1() {
    }
}
