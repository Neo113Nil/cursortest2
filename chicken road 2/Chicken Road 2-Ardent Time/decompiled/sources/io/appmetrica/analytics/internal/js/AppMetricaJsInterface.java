package io.appmetrica.analytics.internal.js;

/* loaded from: classes.dex */
public class AppMetricaJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.impl.C0706t1 f7203a;

    public AppMetricaJsInterface(io.appmetrica.analytics.impl.C0706t1 c0706t1) {
        this.f7203a = c0706t1;
    }

    @android.webkit.JavascriptInterface
    public void reportEvent(java.lang.String str, java.lang.String str2) {
        this.f7203a.d(str, str2);
    }
}
