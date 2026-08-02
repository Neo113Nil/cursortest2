package com.paypal.oslo.feature.shaketoreport.utils;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a1\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\r\u001a\u00020\u0005*\u00020\f2\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00120\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00122\u0006\u0010\u0010\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u0012H\u0000¢\u0006\u0004\b \u0010!\u001a\u001d\u0010&\u001a\u0004\u0018\u00010%*\u00020\"2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b&\u0010'\u001a\u001d\u0010)\u001a\u0004\u0018\u00010(*\u00020\"2\u0006\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0015\u0010+\u001a\u0004\u0018\u00010#*\u00020(H\u0000¢\u0006\u0004\b+\u0010,\u001a\u0013\u0010-\u001a\u00020\u0005*\u00020(H\u0000¢\u0006\u0004\b-\u0010."}, d2 = {"Landroid/view/View;", "Landroid/view/Window;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "onFinished", "takeScreenShot", "(Landroid/view/View;Landroid/view/Window;Lkotlin/jvm/functions/Function1;)V", "", "canTakeScreenShot", "(Landroid/view/Window;)Z", "Landroid/app/Activity;", "takeScreenShotWithOverlays", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)V", "bitmap", "mainDecorView", "Lkotlin/Function0;", "", "windowViewsProvider", "drawPopupViewsOnBitmap", "(Landroid/graphics/Bitmap;Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "allViews", "filterPopupViews", "(Ljava/util/List;Landroid/view/View;)Ljava/util/List;", "Landroid/graphics/Canvas;", "canvas", "popupView", "", "mainLocation", "drawPopupView", "(Landroid/graphics/Canvas;Landroid/view/View;[I)V", "getAllWindowViews", "()Ljava/util/List;", "Landroid/content/Context;", "", "byteArray", "Ljava/io/File;", "convertByteArrayToFile", "(Landroid/content/Context;[B)Ljava/io/File;", "", "saveBitmapToTempFile", "(Landroid/content/Context;Landroid/graphics/Bitmap;)Ljava/lang/String;", "loadBitmapAsByteArray", "(Ljava/lang/String;)[B", "cleanupTempFile", "(Ljava/lang/String;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ScreenShotUtilKt {
    public static final void takeScreenShot(android.view.View view, android.view.Window window, final kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function1) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (!canTakeScreenShot(window)) {
            function1.invoke(null);
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            android.graphics.Rect rect = new android.graphics.Rect();
            view.getDrawingRect(rect);
            final android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(rect.width(), rect.height(), android.graphics.Bitmap.Config.ARGB_8888);
            android.view.PixelCopy.request(window, rect, createBitmap, new android.view.PixelCopy.OnPixelCopyFinishedListener() { // from class: com.paypal.oslo.feature.shaketoreport.utils.ScreenShotUtilKt$$ExternalSyntheticLambda2
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
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "Screenshot error: ".concat(java.lang.String.valueOf(m23439exceptionOrNullimpl.getMessage())), null, null, 6, null);
            function1.invoke(null);
        }
    }

    public static final boolean canTakeScreenShot(android.view.Window window) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "");
        return (window.getAttributes().flags & 8192) == 0;
    }

    public static final void takeScreenShotWithOverlays(android.app.Activity activity, final kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function1) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        android.view.Window window = activity.getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNull(window);
        if (!canTakeScreenShot(window)) {
            function1.invoke(null);
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            final android.view.View decorView = window.getDecorView();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decorView, "");
            android.graphics.Rect rect = new android.graphics.Rect();
            decorView.getDrawingRect(rect);
            final android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(rect.width(), rect.height(), android.graphics.Bitmap.Config.ARGB_8888);
            android.view.PixelCopy.request(window, rect, createBitmap, new android.view.PixelCopy.OnPixelCopyFinishedListener() { // from class: com.paypal.oslo.feature.shaketoreport.utils.ScreenShotUtilKt$$ExternalSyntheticLambda0
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    com.paypal.oslo.feature.shaketoreport.utils.ScreenShotUtilKt.$r8$lambda$fekKq7MBX9QX3HWDkCq9cIg7cfw(createBitmap, decorView, function1, i);
                }
            }, new android.os.Handler(android.os.Looper.getMainLooper()));
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "Screenshot with overlays error: ".concat(java.lang.String.valueOf(m23439exceptionOrNullimpl.getMessage())), null, null, 6, null);
            function1.invoke(null);
        }
    }

    public static /* synthetic */ void drawPopupViewsOnBitmap$default(android.graphics.Bitmap bitmap, android.view.View view, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.utils.ScreenShotUtilKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    java.util.List allWindowViews;
                    allWindowViews = com.paypal.oslo.feature.shaketoreport.utils.ScreenShotUtilKt.getAllWindowViews();
                    return allWindowViews;
                }
            };
        }
        drawPopupViewsOnBitmap(bitmap, view, function0);
    }

    public static final void drawPopupViewsOnBitmap(android.graphics.Bitmap bitmap, android.view.View view, kotlin.jvm.functions.Function0<? extends java.util.List<? extends android.view.View>> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        java.util.List<android.view.View> filterPopupViews = filterPopupViews(function0.invoke(), view);
        if (filterPopupViews.isEmpty()) {
            return;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        java.util.Iterator<T> it = filterPopupViews.iterator();
        while (it.hasNext()) {
            drawPopupView(canvas, (android.view.View) it.next(), iArr);
        }
    }

    public static final java.util.List<android.view.View> filterPopupViews(java.util.List<? extends android.view.View> list, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            android.view.View view2 = (android.view.View) obj;
            if (view2.isShown() && !kotlin.jvm.internal.Intrinsics.areEqual(view2, view) && view2.getWindowToken() != null && view2.getWidth() > 0 && view2.getHeight() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void drawPopupView(android.graphics.Canvas canvas, android.view.View view, int[] iArr) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvas, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            float f = iArr2[0] - iArr[0];
            float f2 = iArr2[1] - iArr[1];
            int save = canvas.save();
            canvas.translate(f, f2);
            try {
                view.draw(canvas);
                canvas.restoreToCount(save);
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "Failed to draw popup view: ".concat(java.lang.String.valueOf(m23439exceptionOrNullimpl.getMessage())), null, null, 6, null);
        }
    }

    public static final java.util.List<android.view.View> getAllWindowViews() {
        java.lang.Object m23436constructorimpl;
        java.util.List emptyList;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.WindowManagerGlobal");
            java.lang.Object invoke = cls.getMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
            java.lang.reflect.Field declaredField = cls.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(invoke);
            java.util.ArrayList arrayList = obj instanceof java.util.ArrayList ? (java.util.ArrayList) obj : null;
            if (arrayList == null || (emptyList = kotlin.collections.CollectionsKt.toList(arrayList)) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(emptyList);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "Failed to get window views via reflection: ".concat(java.lang.String.valueOf(m23439exceptionOrNullimpl.getMessage())), null, null, 6, null);
            m23436constructorimpl = kotlin.collections.CollectionsKt.emptyList();
        }
        return (java.util.List) m23436constructorimpl;
    }

    public static final java.io.File convertByteArrayToFile(android.content.Context context, byte[] bArr) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, new android.graphics.BitmapFactory.Options());
        java.io.File file = new java.io.File(context.getFilesDir(), "oslo_bug_report_temporary_file.jpg");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                java.io.FileOutputStream fileOutputStream2 = fileOutputStream;
                decodeByteArray.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                fileOutputStream2.flush();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(file);
            } finally {
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "Error saving image: ".concat(java.lang.String.valueOf(m23439exceptionOrNullimpl.getMessage())), null, null, 6, null);
        }
        return (java.io.File) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
    }

    public static final java.lang.String saveBitmapToTempFile(android.content.Context context, android.graphics.Bitmap bitmap) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.io.File file = new java.io.File(context.getCacheDir(), "oslo_bug_report_temporary_file.jpg");
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                java.io.FileOutputStream fileOutputStream2 = fileOutputStream;
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                fileOutputStream2.flush();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.shaketoreport.LoggerKt.log;
                java.lang.String absolutePath = file.getAbsolutePath();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Screenshot saved to temp file: ");
                sb.append(absolutePath);
                com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(file.getAbsolutePath());
            } finally {
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "Failed to save screenshot to temp file: ".concat(java.lang.String.valueOf(m23439exceptionOrNullimpl.getMessage())), null, null, 6, null);
        }
        return (java.lang.String) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
    }

    public static final byte[] loadBitmapAsByteArray(java.lang.String str) {
        java.lang.Object m23436constructorimpl;
        android.graphics.Bitmap decodeFile;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            decodeFile = android.graphics.BitmapFactory.decodeFile(str);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (decodeFile == null) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        decodeFile.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        m23436constructorimpl = kotlin.Result.m23436constructorimpl(byteArrayOutputStream.toByteArray());
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "Failed to load bitmap from file: ".concat(java.lang.String.valueOf(m23439exceptionOrNullimpl.getMessage())), null, null, 6, null);
        }
        return (byte[]) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
    }

    public static final void cleanupTempFile(java.lang.String str) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.io.File file = new java.io.File(str);
            if (file.exists() && file.delete()) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.shaketoreport.LoggerKt.log;
                java.lang.String absolutePath = file.getAbsolutePath();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("File deleted successfully: ");
                sb.append(absolutePath);
                com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.shaketoreport.LoggerKt.log, "Failed to delete: ".concat(java.lang.String.valueOf(m23439exceptionOrNullimpl.getMessage())), null, null, 6, null);
        }
    }

    public static /* synthetic */ void $r8$lambda$fekKq7MBX9QX3HWDkCq9cIg7cfw(android.graphics.Bitmap bitmap, android.view.View view, kotlin.jvm.functions.Function1 function1, int i) {
        if (i == 0) {
            drawPopupViewsOnBitmap$default(bitmap, view, null, 4, null);
        }
        function1.invoke(bitmap);
    }
}
