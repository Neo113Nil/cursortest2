package io.appmetrica.analytics.internal.js;

/* loaded from: classes.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.impl.C0706t1 f7202a;

    public AppMetricaInitializerJsInterface(io.appmetrica.analytics.impl.C0706t1 c0706t1) {
        this.f7202a = c0706t1;
    }

    @android.webkit.JavascriptInterface
    public void init(java.lang.String str) {
        this.f7202a.c(str);
    }
}
