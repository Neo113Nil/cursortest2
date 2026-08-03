package com.vungle.ads.internal.util;

/* compiled from: BlackScreenDetector.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
final class BlackScreenDetector$start$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> {
    final /* synthetic */ int $samplingFactor;
    final /* synthetic */ android.view.View $view;
    final /* synthetic */ com.vungle.ads.internal.util.BlackScreenDetector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlackScreenDetector$start$1(android.view.View view, com.vungle.ads.internal.util.BlackScreenDetector blackScreenDetector, int i) {
        super(1);
        this.$view = view;
        this.this$0 = blackScreenDetector;
        this.$samplingFactor = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.graphics.Bitmap bitmap) {
        invoke2(bitmap);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.Executors m10506invoke$lambda0(kotlin.Lazy<? extends com.vungle.ads.internal.executor.Executors> lazy) {
        return lazy.getValue();
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final android.graphics.Bitmap bitmap) {
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        final android.content.Context context = this.$view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "view.context");
        com.vungle.ads.internal.executor.VungleThreadPoolExecutor job_executor = m10506invoke$lambda0(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.executor.Executors>() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$start$1$invoke$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.executor.Executors invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.executor.Executors.class);
            }
        })).getJOB_EXECUTOR();
        final com.vungle.ads.internal.util.BlackScreenDetector blackScreenDetector = this.this$0;
        final int i = this.$samplingFactor;
        job_executor.execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.util.BlackScreenDetector$start$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.vungle.ads.internal.util.BlackScreenDetector$start$1.m10507invoke$lambda1(com.vungle.ads.internal.util.BlackScreenDetector.this, bitmap, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r6 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
    
        return;
     */
    /* renamed from: invoke$lambda-1, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m10507invoke$lambda1(com.vungle.ads.internal.util.BlackScreenDetector this$0, android.graphics.Bitmap bitmap, int i) {
        kotlin.jvm.functions.Function2 function2;
        kotlin.jvm.functions.Function2 function22;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            kotlin.Pair<java.lang.Integer, java.lang.String> processBitmapForBlackScreen$vungle_ads_release = this$0.processBitmapForBlackScreen$vungle_ads_release(bitmap, i);
            int intValue = processBitmapForBlackScreen$vungle_ads_release.component1().intValue();
            java.lang.String component2 = processBitmapForBlackScreen$vungle_ads_release.component2();
            function22 = this$0.callback;
            if (function22 != null) {
                function22.invoke(java.lang.Integer.valueOf(intValue), component2);
            }
        } catch (java.lang.Throwable th) {
            try {
                com.vungle.ads.internal.util.Logger.INSTANCE.e("BlackScreenDetector", "Black screen detection failed", th);
                function2 = this$0.callback;
                if (function2 != null) {
                    function2.invoke(-1, "Internal calculation error: " + th.getMessage());
                }
            } finally {
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this$0.callback = null;
            }
        }
    }
}
