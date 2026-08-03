package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Do {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Re f4670a;
    public final com.inmobi.media.C2553l3 b;
    public final long c;
    public kotlin.jvm.functions.Function0 d;
    public com.inmobi.media.Co e;
    public final android.os.Handler f;
    public java.lang.Runnable g;

    public Do(com.inmobi.media.Re mNetworkRequest, com.inmobi.media.C2553l3 mWebViewClient, long j, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mNetworkRequest, "mNetworkRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mWebViewClient, "mWebViewClient");
        this.f4670a = mNetworkRequest;
        this.b = mWebViewClient;
        this.c = j;
        this.d = function0;
        this.f = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static final void a(com.inmobi.media.Do r2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Do", "TAG");
        java.lang.String str = r2.f4670a.f4939a;
        r2.a();
        kotlin.jvm.functions.Function0 function0 = r2.d;
        if (function0 != null) {
            function0.invoke();
        }
        r2.d = null;
    }

    public final void b() {
        try {
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                com.inmobi.media.Co co = new com.inmobi.media.Co(context);
                co.setWebViewClient(this.b);
                co.getSettings().setJavaScriptEnabled(true);
                co.getSettings().setCacheMode(2);
                this.e = co;
            }
            com.inmobi.media.Co co2 = this.e;
            if (co2 != null) {
                com.inmobi.media.Re re = this.f4670a;
                java.lang.String a2 = com.inmobi.media.AbstractC2276af.a(re.f4939a, re.d);
                java.util.Map<java.lang.String, java.lang.String> map = this.f4670a.b;
                if (map == null) {
                    map = kotlin.collections.MapsKt.emptyMap();
                }
                co2.loadUrl(a2, map);
            }
            if (this.c > 0) {
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.Do$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.inmobi.media.Do.a(com.inmobi.media.Do.this);
                    }
                };
                this.f.postDelayed(runnable, this.c);
                this.g = runnable;
            }
        } catch (java.lang.Exception e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Do", "TAG");
            e.getMessage();
        }
    }

    public final void a() {
        java.lang.Runnable runnable = this.g;
        if (runnable != null) {
            this.f.removeCallbacks(runnable);
        }
        this.g = null;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.inmobi.media.Co co = this.e;
            if (co != null && !co.f4650a) {
                co.stopLoading();
                co.removeAllViews();
                co.destroy();
            }
            kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        this.e = null;
    }
}
