package com.paypal.oslo.feature.userprofile.data.utils;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/userprofile/domain/model/ImageMetadata;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.data.utils.PhotoDataUtilsKt$extractImageMetadata$2", f = "PhotoDataUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PhotoDataUtilsKt$extractImageMetadata$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata>, java.lang.Object> {
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.io.File getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeFile(this.getHighSpeedVideoSizes.getAbsolutePath(), options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        long length = this.getHighSpeedVideoSizes.length();
        java.lang.String str2 = options.outMimeType;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1487394660) {
                if (hashCode != -1487018032) {
                    if (hashCode == -879258763 && str2.equals(androidx.media3.common.MimeTypes.IMAGE_PNG)) {
                        str = "PNG";
                    }
                } else if (str2.equals("image/webp")) {
                    str = "WEBP";
                }
                return new com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata(i, i2, length, str);
            }
            str2.equals("image/jpeg");
        }
        str = "JPEG";
        return new com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata(i, i2, length, str);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.domain.model.ImageMetadata> continuation) {
        return ((com.paypal.oslo.feature.userprofile.data.utils.PhotoDataUtilsKt$extractImageMetadata$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.data.utils.PhotoDataUtilsKt$extractImageMetadata$2(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhotoDataUtilsKt$extractImageMetadata$2(java.io.File file, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.data.utils.PhotoDataUtilsKt$extractImageMetadata$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = file;
    }
}
