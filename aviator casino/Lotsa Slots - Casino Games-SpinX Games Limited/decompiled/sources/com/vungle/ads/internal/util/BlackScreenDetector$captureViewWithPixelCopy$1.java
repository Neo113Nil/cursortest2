package com.vungle.ads.internal.util;

/* compiled from: BlackScreenDetector.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
final class BlackScreenDetector$captureViewWithPixelCopy$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    final /* synthetic */ kotlin.Lazy<com.vungle.ads.internal.executor.Executors> $executors$delegate;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> $onComplete;
    final /* synthetic */ android.view.View $view;
    final /* synthetic */ android.view.Window $window;
    final /* synthetic */ com.vungle.ads.internal.util.BlackScreenDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BlackScreenDetector$captureViewWithPixelCopy$1(android.view.View view, kotlin.Lazy<? extends com.vungle.ads.internal.executor.Executors> lazy, com.vungle.ads.internal.util.BlackScreenDetector blackScreenDetector, android.view.Window window, kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function1) {
        super(0);
        this.$view = view;
        this.$executors$delegate = lazy;
        this.this$0 = blackScreenDetector;
        this.$window = window;
        this.$onComplete = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        invoke2();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        com.vungle.ads.internal.executor.Executors m10502captureViewWithPixelCopy$lambda0;
        final int width = this.$view.getWidth();
        final int height = this.$view.getHeight();
        int[] iArr = new int[2];
        this.$view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        final android.graphics.Rect rect = new android.graphics.Rect(i, i2, i + width, i2 + height);
        m10502captureViewWithPixelCopy$lambda0 = com.vungle.ads.internal.util.BlackScreenDetector.m10502captureViewWithPixelCopy$lambda0(this.$executors$delegate);
        com.vungle.ads.internal.executor.VungleThreadPoolExecutor job_executor = m10502captureViewWithPixelCopy$lambda0.getJOB_EXECUTOR();
        final com.vungle.ads.internal.util.BlackScreenDetector blackScreenDetector = this.this$0;
        final android.view.Window window = this.$window;
        final kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> function1 = this.$onComplete;
        job_executor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithPixelCopy$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.util.BlackScreenDetector$captureViewWithPixelCopy$1.m10504invoke$lambda0(width, height, blackScreenDetector, window, rect, function1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m10504invoke$lambda0(int i, int i2, com.vungle.ads.internal.util.BlackScreenDetector this$0, android.view.Window window, android.graphics.Rect rect, kotlin.jvm.functions.Function1 onComplete) {
        android.graphics.Bitmap bitmap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "$rect");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
        try {
            bitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
            try {
                this$0.executePixelCopyRequest(window, rect, bitmap, onComplete);
            } catch (java.lang.Throwable th) {
                th = th;
                com.vungle.ads.internal.util.Logger.INSTANCE.e("BlackScreenDetector", "Bitmap creation failed", th);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                onComplete.invoke(null);
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bitmap = null;
        }
    }
}
