package com.adobe.marketing.mobile.messaging;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/adobe/marketing/mobile/messaging/ContentCardImageManager;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "p0", "", "p1", "p2", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Z", "imageUrl", "cacheName", "Lkotlin/Function1;", "Lkotlin/Result;", "", "completion", "getContentCardImageBitmap$messaging_phoneRelease", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentCardImageManager {
    public static final int $stable = 0;
    public static final com.adobe.marketing.mobile.messaging.ContentCardImageManager INSTANCE = new com.adobe.marketing.mobile.messaging.ContentCardImageManager();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.lang.String getHighSpeedVideoFpsRanges = "ContentCardManager";

    private ContentCardImageManager() {
    }

    public static /* synthetic */ void getContentCardImageBitmap$messaging_phoneRelease$default(com.adobe.marketing.mobile.messaging.ContentCardImageManager contentCardImageManager, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "contentCardImages";
        }
        contentCardImageManager.getContentCardImageBitmap$messaging_phoneRelease(str, str2, function1);
    }

    public final void getContentCardImageBitmap$messaging_phoneRelease(final java.lang.String imageUrl, final java.lang.String cacheName, final kotlin.jvm.functions.Function1<? super kotlin.Result<android.graphics.Bitmap>, kotlin.Unit> completion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completion, "");
        if (cacheName == null) {
            cacheName = "contentCardImages";
        }
        com.adobe.marketing.mobile.services.caching.CacheService cacheService = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getCacheService();
        if ((cacheService != null ? cacheService.get(cacheName, imageUrl) : null) != null) {
            com.adobe.marketing.mobile.services.caching.CacheService cacheService2 = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getCacheService();
            com.adobe.marketing.mobile.services.caching.CacheResult cacheResult = cacheService2 != null ? cacheService2.get(cacheName, imageUrl) : null;
            java.io.InputStream data = cacheResult != null ? cacheResult.getData() : null;
            if (data == null) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, getHighSpeedVideoFpsRanges, "getImageBitmapFromCache - Unable to read cached data as the inputStream is null", new java.lang.Object[0]);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to read cached bitmap data as the inputStream is null for the url: ");
                sb.append(imageUrl);
                sb.append(", cacheName: ");
                sb.append(cacheName);
                completion.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(sb.toString())))));
                return;
            }
            android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(data);
            data.close();
            if (decodeStream == null) {
                java.lang.String str = getHighSpeedVideoFpsRanges;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("getImageBitmapFromCache - Unable to convert the cached file input stream into a bitmap for the url: ");
                sb2.append(imageUrl);
                sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str, sb2.toString(), new java.lang.Object[0]);
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                completion.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("Unable to convert the cached file input stream into a bitmap for the url: ".concat(java.lang.String.valueOf(imageUrl)))))));
                return;
            }
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, getHighSpeedVideoFpsRanges, "getImageBitmapFromCache - Image retrieved from cache for url: ".concat(java.lang.String.valueOf(imageUrl)), new java.lang.Object[0]);
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            completion.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(decodeStream)));
            return;
        }
        com.adobe.marketing.mobile.aepcomposeui.utils.UIUtils.INSTANCE.downloadImage(imageUrl, new kotlin.jvm.functions.Function1<kotlin.Result<? extends android.graphics.Bitmap>, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.messaging.ContentCardImageManager$downloadAndCacheImageBitmap$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(kotlin.Result<? extends android.graphics.Bitmap> result) {
                getHighSpeedVideoFpsRangesFor(result.getCamera2StreamConfigurationMap());
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
                java.lang.String str2;
                boolean highResolutionOutputSizeshNQ4ISI;
                java.lang.String str3;
                kotlin.jvm.functions.Function1<kotlin.Result<android.graphics.Bitmap>, kotlin.Unit> function1 = completion;
                java.lang.String str4 = imageUrl;
                java.lang.String str5 = cacheName;
                if (kotlin.Result.m23442isSuccessimpl(obj)) {
                    android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    function1.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(bitmap)));
                    com.adobe.marketing.mobile.messaging.ContentCardImageManager contentCardImageManager = com.adobe.marketing.mobile.messaging.ContentCardImageManager.INSTANCE;
                    highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.messaging.ContentCardImageManager.getHighResolutionOutputSizeshNQ4ISI(bitmap, str4, str5);
                    if (!highResolutionOutputSizeshNQ4ISI) {
                        str3 = com.adobe.marketing.mobile.messaging.ContentCardImageManager.getHighSpeedVideoFpsRanges;
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str3, "downloadAndCacheImageBitmap - Image downloaded but failed to cache the image from url: ".concat(java.lang.String.valueOf(str4)), new java.lang.Object[0]);
                    }
                }
                java.lang.String str6 = imageUrl;
                kotlin.jvm.functions.Function1<kotlin.Result<android.graphics.Bitmap>, kotlin.Unit> function12 = completion;
                java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
                if (m23439exceptionOrNullimpl != null) {
                    str2 = com.adobe.marketing.mobile.messaging.ContentCardImageManager.getHighSpeedVideoFpsRanges;
                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, str2, "downloadAndCacheImageBitmap - Unable to download image from url: ".concat(java.lang.String.valueOf(str6)), new java.lang.Object[0]);
                    kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                    function12.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(m23439exceptionOrNullimpl))));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getHighResolutionOutputSizeshNQ4ISI(android.graphics.Bitmap p0, java.lang.String p1, java.lang.String p2) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        p0.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        try {
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(byteArray);
            kotlin.io.CloseableKt.closeFinally(byteArrayOutputStream2, null);
            com.adobe.marketing.mobile.services.caching.CacheEntry cacheEntry = new com.adobe.marketing.mobile.services.caching.CacheEntry(byteArrayInputStream, com.adobe.marketing.mobile.services.caching.CacheExpiry.after(com.statsig.androidsdk.NetworkFallbackResolverKt.DEFAULT_TTL_MS), null);
            com.adobe.marketing.mobile.services.caching.CacheService cacheService = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getCacheService();
            if (cacheService != null) {
                return cacheService.set(p2, p1, cacheEntry);
            }
            return false;
        } finally {
        }
    }
}
