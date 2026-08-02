package com.paypal.oslo.core.pushnotification.data.media;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/data/media/MediaImageLoaderImpl;", "Lcom/paypal/oslo/core/pushnotification/domain/notification/MediaImageLoader;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/imaging/ImageLoaderFactory;", "imageLoaderFactory", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/core/imaging/ImageLoaderFactory;)V", "", "url", "Landroid/graphics/Bitmap;", "loadImage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Lcoil3/ImageLoader;", "Lcoil3/ImageLoader;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaImageLoaderImpl implements com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final coil3.ImageLoader getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public MediaImageLoaderImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.core.imaging.ImageLoaderFactory imageLoaderFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageLoaderFactory, "");
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoSizes = imageLoaderFactory.create(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$loadImageWithCoil(com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl mediaImageLoaderImpl, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl$loadImageWithCoil$1 mediaImageLoaderImpl$loadImageWithCoil$1;
        int i;
        coil3.Image image;
        if (continuation instanceof com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl$loadImageWithCoil$1) {
            mediaImageLoaderImpl$loadImageWithCoil$1 = (com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl$loadImageWithCoil$1) continuation;
            if ((mediaImageLoaderImpl$loadImageWithCoil$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mediaImageLoaderImpl$loadImageWithCoil$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mediaImageLoaderImpl$loadImageWithCoil$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mediaImageLoaderImpl$loadImageWithCoil$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    coil3.view.ImageRequest build = coil3.view.ImageRequests_androidKt.allowHardware(new coil3.request.ImageRequest.Builder(mediaImageLoaderImpl.Camera2StreamConfigurationMap).data(str).size(coil3.view.SizeKt.Size(2048, 2048)), false).build();
                    coil3.ImageLoader imageLoader = mediaImageLoaderImpl.getHighSpeedVideoSizes;
                    mediaImageLoaderImpl$loadImageWithCoil$1.getHighSpeedVideoFpsRangesFor = str;
                    mediaImageLoaderImpl$loadImageWithCoil$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(build);
                    mediaImageLoaderImpl$loadImageWithCoil$1.Camera2StreamConfigurationMap = 1;
                    obj = imageLoader.execute(build, mediaImageLoaderImpl$loadImageWithCoil$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) mediaImageLoaderImpl$loadImageWithCoil$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                image = ((coil3.view.ImageResult) obj).getImage();
                if (image != null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Failed to load image", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str)), null, 4, null);
                    return null;
                }
                android.content.res.Resources resources = mediaImageLoaderImpl.Camera2StreamConfigurationMap.getResources();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "");
                android.graphics.drawable.Drawable asDrawable = coil3.Image_androidKt.asDrawable(image, resources);
                android.graphics.Bitmap highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(asDrawable);
                if (highResolutionOutputSizeshNQ4ISI != null) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.core.pushnotification.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[4];
                    pairArr[0] = kotlin.TuplesKt.to("url", str);
                    pairArr[1] = kotlin.TuplesKt.to("width", java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI.getWidth()));
                    pairArr[2] = kotlin.TuplesKt.to("height", java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI.getHeight()));
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(asDrawable.getClass()).getSimpleName();
                    pairArr[3] = kotlin.TuplesKt.to("drawable_type", simpleName != null ? simpleName : "");
                    com.paypal.android.logger.Logger.d$default(logger, "Media image loaded successfully", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    return highResolutionOutputSizeshNQ4ISI;
                }
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.core.pushnotification.LoggerKt.log;
                kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                pairArr2[0] = kotlin.TuplesKt.to("url", str);
                java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(asDrawable.getClass()).getSimpleName();
                pairArr2[1] = kotlin.TuplesKt.to("drawable_type", simpleName2 != null ? simpleName2 : "");
                com.paypal.android.logger.Logger.w$default(logger2, "Failed to convert drawable to bitmap", kotlin.collections.MapsKt.mapOf(pairArr2), null, 4, null);
                return highResolutionOutputSizeshNQ4ISI;
            }
        }
        mediaImageLoaderImpl$loadImageWithCoil$1 = new com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl$loadImageWithCoil$1(mediaImageLoaderImpl, continuation);
        java.lang.Object obj2 = mediaImageLoaderImpl$loadImageWithCoil$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mediaImageLoaderImpl$loadImageWithCoil$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        image = ((coil3.view.ImageResult) obj2).getImage();
        if (image != null) {
        }
    }

    @Override // com.paypal.oslo.core.pushnotification.domain.notification.MediaImageLoader
    public final java.lang.Object loadImage(java.lang.String str, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        return kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(10000L, new com.paypal.oslo.core.pushnotification.data.media.MediaImageLoaderImpl$loadImage$2(this, str, null), continuation);
    }

    private static android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI(android.graphics.drawable.Drawable p0) {
        kotlin.Pair pair;
        if (p0 instanceof android.graphics.drawable.BitmapDrawable) {
            return ((android.graphics.drawable.BitmapDrawable) p0).getBitmap();
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(p0.getIntrinsicWidth());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 2048;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(p0.getIntrinsicHeight());
        if (valueOf2.intValue() <= 0) {
            valueOf2 = null;
        }
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : 2048;
        if (intValue > 2048 || intValue2 > 2048) {
            float f = intValue;
            float f2 = intValue2;
            float min = java.lang.Math.min(2048.0f / f, 2048.0f / f2);
            pair = new kotlin.Pair(java.lang.Integer.valueOf((int) (f * min)), java.lang.Integer.valueOf((int) (f2 * min)));
        } else {
            pair = new kotlin.Pair(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
        }
        try {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Number) pair.component1()).intValue(), ((java.lang.Number) pair.component2()).intValue(), android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            p0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            p0.draw(canvas);
            return createBitmap;
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.pushnotification.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(p0.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            pairArr[0] = kotlin.TuplesKt.to("drawable_type", simpleName);
            java.lang.String message = e.getMessage();
            pairArr[1] = kotlin.TuplesKt.to("error", message != null ? message : "");
            com.paypal.android.logger.Logger.w$default(logger, "Failed to render drawable to bitmap", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return null;
        }
    }
}
