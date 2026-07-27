package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Aq {

    /* renamed from: a, reason: collision with root package name */
    public final Kf f6464a;
    public final I3 b;
    public final long c;
    public Function0 d;
    public zq e;
    public final Handler f;
    public Runnable g;

    public Aq(Kf mNetworkRequest, I3 mWebViewClient, long j, Function0 function0) {
        Intrinsics.checkNotNullParameter(mNetworkRequest, "mNetworkRequest");
        Intrinsics.checkNotNullParameter(mWebViewClient, "mWebViewClient");
        this.f6464a = mNetworkRequest;
        this.b = mWebViewClient;
        this.c = j;
        this.d = function0;
        this.f = new Handler(Looper.getMainLooper());
    }

    public static final void a(Aq aq) {
        Intrinsics.checkNotNullExpressionValue("Aq", "TAG");
        String str = "WebViewNetworkTask timed out for URL: " + aq.f6464a.f6673a;
        aq.a();
        Function0 function0 = aq.d;
        if (function0 != null) {
            function0.invoke();
        }
        aq.d = null;
    }

    public final void b() {
        try {
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                zq zqVar = new zq(context);
                zqVar.setWebViewClient(this.b);
                zqVar.getSettings().setJavaScriptEnabled(true);
                zqVar.getSettings().setCacheMode(2);
                this.e = zqVar;
            }
            zq zqVar2 = this.e;
            if (zqVar2 != null) {
                Kf kf = this.f6464a;
                String a2 = Tf.a(kf.f6673a, kf.d);
                Map<String, String> map = this.f6464a.b;
                if (map == null) {
                    map = MapsKt.emptyMap();
                }
                zqVar2.loadUrl(a2, map);
            }
            if (this.c > 0) {
                Runnable runnable = new Runnable() { // from class: com.inmobi.media.Aq$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Aq.a(Aq.this);
                    }
                };
                this.f.postDelayed(runnable, this.c);
                this.g = runnable;
            }
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("Aq", "TAG");
            String str = "SDK encountered unexpected error in WebViewNetworkTask.execute() method; " + e.getMessage();
        }
    }

    public final void a() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.f.removeCallbacks(runnable);
        }
        this.g = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            zq zqVar = this.e;
            if (zqVar != null && !zqVar.f7532a) {
                zqVar.stopLoading();
                zqVar.removeAllViews();
                zqVar.destroy();
            }
            Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        this.e = null;
    }
}
