package com.paypal.oslo.feature.qrc.ui.utils;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u000f\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00060\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroid/content/Context;", "context", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "contentBounds", "", "captureAndShareScreenshot", "(Landroid/content/Context;Landroid/view/View;Landroid/graphics/Rect;)V", "Landroid/view/Window;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "bounds", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "onFinished", "takeScreenshot", "(Landroid/view/View;Landroid/view/Window;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function1;)V", "bitmap", "Ljava/io/File;", "saveBitmapToCache", "(Landroid/content/Context;Landroid/graphics/Bitmap;)Ljava/io/File;", "Landroid/net/Uri;", "uri", "shareScreenshot", "(Landroid/content/Context;Landroid/net/Uri;)V", "", "olderThanMillis", "cleanupOldScreenshots", "(Landroid/content/Context;J)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScreenshotUtilKt {
    public static final void captureAndShareScreenshot(final android.content.Context context, android.view.View view, android.graphics.Rect rect) {
        android.view.Window window;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        cleanupOldScreenshots$default(context, 0L, 2, null);
        takeScreenshot(view, window, rect, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.utils.ScreenshotUtilKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.qrc.ui.utils.ScreenshotUtilKt.$r8$lambda$Xg_Y45IqZzOwRvsUard6fot4MEw(context, (android.graphics.Bitmap) obj);
            }
        });
    }

    public static final void takeScreenshot(android.view.View view, android.view.Window window, android.graphics.Rect rect, final kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function1) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            final android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(rect.width(), rect.height(), android.graphics.Bitmap.Config.ARGB_8888);
            android.view.PixelCopy.request(window, rect, createBitmap, new android.view.PixelCopy.OnPixelCopyFinishedListener() { // from class: com.paypal.oslo.feature.qrc.ui.utils.ScreenshotUtilKt$$ExternalSyntheticLambda0
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    kotlin.jvm.functions.Function1.this.invoke(createBitmap);
                }
            }, new android.os.Handler(android.os.Looper.getMainLooper()));
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
            function1.invoke(null);
        }
    }

    public static final java.io.File saveBitmapToCache(android.content.Context context, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        java.io.File file = new java.io.File(context.getCacheDir(), "screenshots");
        if (!file.exists()) {
            file.mkdirs();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("payment_success_");
        sb.append(currentTimeMillis);
        sb.append(".png");
        java.io.File file2 = new java.io.File(file, sb.toString());
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
        try {
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
            return file2;
        } finally {
        }
    }

    public static final void shareScreenshot(android.content.Context context, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.setType(androidx.media3.common.MimeTypes.IMAGE_PNG);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setClipData(android.content.ClipData.newRawUri("", uri));
        intent.addFlags(1);
        context.startActivity(android.content.Intent.createChooser(intent, null));
    }

    public static /* synthetic */ void cleanupOldScreenshots$default(android.content.Context context, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 3600000;
        }
        cleanupOldScreenshots(context, j);
    }

    public static final void cleanupOldScreenshots(android.content.Context context, long j) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.io.File file = new java.io.File(context.getCacheDir(), "screenshots");
            if (file.exists()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.io.File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (java.io.File file2 : listFiles) {
                        if (file2.isFile() && currentTimeMillis - file2.lastModified() > j) {
                            file2.delete();
                        }
                    }
                    unit = kotlin.Unit.INSTANCE;
                } else {
                    unit = null;
                }
                kotlin.Result.m23436constructorimpl(unit);
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xg_Y45IqZzOwRvsUard6fot4MEw(android.content.Context context, android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            java.io.File saveBitmapToCache = saveBitmapToCache(context, bitmap);
            java.lang.String packageName = ((android.app.Activity) context).getPackageName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(packageName);
            sb.append(".oslo.qrc.fileprovider");
            android.net.Uri uriForFile = androidx.core.content.FileProvider.getUriForFile(context, sb.toString(), saveBitmapToCache);
            kotlin.jvm.internal.Intrinsics.checkNotNull(uriForFile);
            shareScreenshot(context, uriForFile);
        }
        return kotlin.Unit.INSTANCE;
    }
}
