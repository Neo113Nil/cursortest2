package com.vungle.ads.internal.util;

/* compiled from: BlackScreenDetector.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002J+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\u0013H\u0001¢\u0006\u0002\b\u0014J&\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\u0013H\u0002J&\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\u0013H\u0003J6\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\n2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00070\u0013H\u0003J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J+\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\"2\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0005H\u0001¢\u0006\u0002\b#J2\u0010$\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u00052\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004J\u0006\u0010%\u001a\u00020\u0007R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/util/BlackScreenDetector;", "", "()V", "callback", "Lkotlin/Function2;", "", "", "", "calculateBlackScreenPercentageWithMargin", "image", "Landroid/graphics/Bitmap;", "marginPercentage", "", "samplingFactor", "maxMarginPercentage", "captureViewBitmapAsync", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "onComplete", "Lkotlin/Function1;", "captureViewBitmapAsync$vungle_ads_release", "captureViewWithCanvas", "captureViewWithPixelCopy", "executePixelCopyRequest", "window", "Landroid/view/Window;", "rect", "Landroid/graphics/Rect;", "bitmap", "getActivity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "processBitmapForBlackScreen", "Lkotlin/Pair;", "processBitmapForBlackScreen$vungle_ads_release", "start", "stop", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release", "executors", "Lcom/vungle/ads/internal/executor/Executors;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class BlackScreenDetector {
    private static final int BLACK_PIXEL_THRESHOLD = 10;
    private static final double BLACK_SCREEN_MARGIN_PERCENTAGE = 0.1d;
    private static final java.lang.String TAG = "BlackScreenDetector";
    private volatile kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> callback;

    public final void start(android.view.View view, int samplingFactor, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        if (view == null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "Black screen detection failed: View not available");
            kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> function2 = this.callback;
            if (function2 != null) {
                function2.invoke(-1, "View not available");
            }
            this.callback = null;
            return;
        }
        captureViewBitmapAsync$vungle_ads_release(view, new com.vungle.ads.internal.util.BlackScreenDetector$start$1(view, this, samplingFactor));
    }

    public final void stop() {
        this.callback = null;
    }

    public final void captureViewBitmapAsync$vungle_ads_release(android.view.View view, kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onComplete) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        if (this.callback == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            captureViewWithPixelCopy(view, onComplete);
        } else {
            captureViewWithCanvas(view, onComplete);
        }
    }

    private final void captureViewWithPixelCopy(android.view.View view, kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onComplete) {
        android.app.Activity activity = getActivity(view.getContext());
        android.view.Window window = activity != null ? activity.getWindow() : null;
        if (window == null) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "Activity/Window not found for PixelCopy");
            onComplete.invoke(null);
        } else {
            com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
            final android.content.Context context = view.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "view.context");
            com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithPixelCopy$1(view, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.executor.Executors>() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithPixelCopy$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.executor.Executors invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.executor.Executors.class);
                }
            }), this, window, onComplete));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: captureViewWithPixelCopy$lambda-0, reason: not valid java name */
    public static final com.vungle.ads.internal.executor.Executors m10502captureViewWithPixelCopy$lambda0(kotlin.Lazy<? extends com.vungle.ads.internal.executor.Executors> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executePixelCopyRequest(android.view.Window window, android.graphics.Rect rect, final android.graphics.Bitmap bitmap, final kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onComplete) {
        try {
            android.view.PixelCopy.request(window, rect, bitmap, new android.view.PixelCopy.OnPixelCopyFinishedListener() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$$ExternalSyntheticLambda0
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    com.vungle.ads.internal.util.BlackScreenDetector.m10503executePixelCopyRequest$lambda1(kotlin.jvm.functions.Function1.this, bitmap, i);
                }
            }, new android.os.Handler(android.os.Looper.getMainLooper()));
        } catch (java.lang.Throwable th) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "PixelCopy request failed", th);
            bitmap.recycle();
            onComplete.invoke(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: executePixelCopyRequest$lambda-1, reason: not valid java name */
    public static final void m10503executePixelCopyRequest$lambda1(kotlin.jvm.functions.Function1 onComplete, android.graphics.Bitmap bitmap, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        if (i == 0) {
            onComplete.invoke(bitmap);
            return;
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "PixelCopy failed: " + i);
        bitmap.recycle();
        onComplete.invoke(null);
    }

    private final void captureViewWithCanvas(final android.view.View view, final kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> onComplete) {
        com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithCanvas$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                try {
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                    view.draw(new android.graphics.Canvas(createBitmap));
                    onComplete.invoke(createBitmap);
                } catch (java.lang.Throwable th) {
                    com.vungle.ads.internal.util.Logger.INSTANCE.e("BlackScreenDetector", "Bitmap capture failed", th);
                    onComplete.invoke(null);
                }
            }
        });
    }

    private final android.app.Activity getActivity(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.String> processBitmapForBlackScreen$vungle_ads_release(android.graphics.Bitmap bitmap, int samplingFactor) {
        if (bitmap != null) {
            int calculateBlackScreenPercentageWithMargin$default = calculateBlackScreenPercentageWithMargin$default(this, bitmap, 0.1d, samplingFactor, 0.0d, 8, null);
            return new kotlin.Pair<>(java.lang.Integer.valueOf(calculateBlackScreenPercentageWithMargin$default), calculateBlackScreenPercentageWithMargin$default == -1 ? "Internal calculation error" : "");
        }
        com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "Black screen detection failed: Snapshot capture failure");
        return new kotlin.Pair<>(-1, "Snapshot capture failure");
    }

    static /* synthetic */ int calculateBlackScreenPercentageWithMargin$default(com.vungle.ads.internal.util.BlackScreenDetector blackScreenDetector, android.graphics.Bitmap bitmap, double d, int i, double d2, int i2, java.lang.Object obj) {
        int i3 = (i2 & 4) != 0 ? 100 : i;
        if ((i2 & 8) != 0) {
            d2 = 0.5d;
        }
        return blackScreenDetector.calculateBlackScreenPercentageWithMargin(bitmap, d, i3, d2);
    }

    private final int calculateBlackScreenPercentageWithMargin(android.graphics.Bitmap image, double marginPercentage, int samplingFactor, double maxMarginPercentage) {
        int i;
        int width = image.getWidth();
        int height = image.getHeight();
        int i2 = (int) (width * marginPercentage);
        int i3 = (int) (height * marginPercentage);
        int i4 = width - (i2 * 2);
        int i5 = height - (i3 * 2);
        if (i4 <= 0 || i5 <= 0) {
            return -1;
        }
        long j = i4 * i5;
        if (j > 2147483647L) {
            if (marginPercentage >= maxMarginPercentage) {
                return -1;
            }
            return calculateBlackScreenPercentageWithMargin(image, marginPercentage * 2, samplingFactor, maxMarginPercentage);
        }
        int i6 = (int) j;
        int[] iArr = new int[i6];
        image.getPixels(iArr, 0, i4, i2, i3, i4, i5);
        int i7 = i6 - 1;
        if (samplingFactor > 0) {
            int progressionLastElement = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(0, i7, samplingFactor);
            int i8 = 0;
            if (progressionLastElement >= 0) {
                int i9 = 0;
                i = 0;
                while (true) {
                    i8++;
                    int i10 = iArr[i9];
                    int i11 = (i10 >> 24) & 255;
                    int i12 = (i10 >> 16) & 255;
                    int i13 = (i10 >> 8) & 255;
                    int i14 = i10 & 255;
                    if (i11 > 0 && i12 < 10 && i13 < 10 && i14 < 10) {
                        i++;
                    }
                    if (i9 == progressionLastElement) {
                        break;
                    }
                    i9 += samplingFactor;
                }
            } else {
                i = 0;
            }
            if (i8 > 0) {
                return (int) ((i * 100) / i8);
            }
            return 0;
        }
        throw new java.lang.IllegalArgumentException("Step must be positive, was: " + samplingFactor + '.');
    }
}
