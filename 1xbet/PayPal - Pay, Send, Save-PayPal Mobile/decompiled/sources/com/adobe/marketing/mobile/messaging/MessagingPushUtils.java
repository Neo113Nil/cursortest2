package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
class MessagingPushUtils {
    MessagingPushUtils() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005f, code lost:
    
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r4 == null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static android.graphics.Bitmap getHighSpeedVideoSizes(java.lang.String str) {
        java.lang.Throwable th;
        java.net.HttpURLConnection httpURLConnection;
        java.io.IOException e;
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2;
        java.io.InputStream inputStream3 = null;
        r3 = null;
        android.graphics.Bitmap bitmap = null;
        inputStream3 = null;
        try {
            try {
                httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            } catch (java.lang.Throwable th2) {
                java.io.InputStream inputStream4 = inputStream2;
                th = th2;
                inputStream3 = inputStream4;
            }
            try {
                inputStream = httpURLConnection.getInputStream();
                try {
                    bitmap = android.graphics.BitmapFactory.decodeStream(inputStream);
                    inputStream2 = inputStream;
                    str = str;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                            inputStream2 = inputStream;
                            str = str;
                        } catch (java.io.IOException e2) {
                            ?? message = e2.getMessage();
                            ?? r9 = {str, message};
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushUtils", "IOException during closing Input stream while push notification image from url (%s). Exception: %s ", r9);
                            inputStream2 = message;
                            str = r9;
                        }
                    }
                } catch (java.io.IOException e3) {
                    e = e3;
                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushUtils", "Failed to download push notification image from url (%s). Exception: %s", str, e.getMessage());
                    inputStream2 = inputStream;
                    str = str;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                            inputStream2 = inputStream;
                            str = str;
                        } catch (java.io.IOException e4) {
                            ?? message2 = e4.getMessage();
                            ?? r92 = {str, message2};
                            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushUtils", "IOException during closing Input stream while push notification image from url (%s). Exception: %s ", r92);
                            inputStream2 = message2;
                            str = r92;
                        }
                    }
                }
            } catch (java.io.IOException e5) {
                e = e5;
                inputStream = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (java.io.IOException e6) {
                        com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushUtils", "IOException during closing Input stream while push notification image from url (%s). Exception: %s ", str, e6.getMessage());
                    }
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    throw th;
                }
                throw th;
            }
        } catch (java.io.IOException e7) {
            e = e7;
            httpURLConnection = null;
            inputStream = null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            httpURLConnection = null;
        }
    }

    static int Camera2StreamConfigurationMap(android.content.Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).icon;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushUtils", "Package manager NameNotFoundException while reading default application icon. Exception: %s", e.getMessage());
            return -1;
        }
    }

    static android.net.Uri Camera2StreamConfigurationMap(java.lang.String str, android.content.Context context) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("android.resource://");
        sb.append(context.getPackageName());
        sb.append("/raw/");
        sb.append(str);
        return android.net.Uri.parse(sb.toString());
    }

    static int getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, android.content.Context context) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            return 0;
        }
        return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
    }

    static android.net.Uri getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.services.caching.CacheResult cacheResult) {
        if (cacheResult == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushUtils", "Failed to get cached rich media file Uri. Cache result is null.", new java.lang.Object[0]);
            return null;
        }
        java.util.Map<java.lang.String, java.lang.String> metadata = cacheResult.getMetadata();
        if (metadata == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushUtils", "Failed to find metadata in cached rich media cache result.", new java.lang.Object[0]);
            return null;
        }
        java.lang.String str = metadata.get("pathToFile");
        if (str == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushUtils", "Failed to find path to file in cached rich media cache result.", new java.lang.Object[0]);
            return null;
        }
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushUtils", "Failed to get application context. Can't create Uri for cached rich media file.", new java.lang.Object[0]);
            return null;
        }
        java.io.File file = new java.io.File(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(applicationContext.getPackageName());
        sb.append(".messagingfileprovider");
        return com.adobe.marketing.mobile.messaging.MessagingFileProvider.getUriForFile(applicationContext, sb.toString(), file);
    }

    static boolean getHighSpeedVideoFpsRanges(java.lang.String str) {
        return str.endsWith(".gif");
    }

    static java.util.concurrent.CompletableFuture<com.adobe.marketing.mobile.services.caching.CacheResult> getHighSpeedVideoFpsRangesFor(java.util.concurrent.Executor executor, final java.lang.String str) {
        final int i = 5000;
        return java.util.concurrent.CompletableFuture.supplyAsync(new java.util.function.Supplier() { // from class: com.adobe.marketing.mobile.messaging.MessagingPushUtils$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.adobe.marketing.mobile.messaging.MessagingPushUtils.getHighSpeedVideoFpsRanges(str, i);
            }
        }, executor);
    }

    static /* synthetic */ com.adobe.marketing.mobile.services.caching.CacheResult getHighSpeedVideoFpsRanges(java.lang.String str, int i) {
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        new com.adobe.marketing.mobile.messaging.MessageAssetDownloader().getHighResolutionOutputSizeshNQ4ISI(str, new com.adobe.marketing.mobile.AdobeCallback() { // from class: com.adobe.marketing.mobile.messaging.MessagingPushUtils$$ExternalSyntheticLambda1
            @Override // com.adobe.marketing.mobile.AdobeCallback
            public final void call(java.lang.Object obj) {
                com.adobe.marketing.mobile.messaging.MessagingPushUtils.getHighSpeedVideoFpsRanges(atomicReference, countDownLatch, (com.adobe.marketing.mobile.services.caching.CacheResult) obj);
            }
        });
        try {
            countDownLatch.await(i, java.util.concurrent.TimeUnit.MILLISECONDS);
            return (com.adobe.marketing.mobile.services.caching.CacheResult) atomicReference.get();
        } catch (java.lang.InterruptedException unused) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushUtils", "downloadAndCacheAsset - Interrupted while waiting for asset to be downloaded and cached.", new java.lang.Object[0]);
            return null;
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(java.util.concurrent.atomic.AtomicReference atomicReference, java.util.concurrent.CountDownLatch countDownLatch, com.adobe.marketing.mobile.services.caching.CacheResult cacheResult) {
        atomicReference.set(cacheResult);
        countDownLatch.countDown();
    }
}
