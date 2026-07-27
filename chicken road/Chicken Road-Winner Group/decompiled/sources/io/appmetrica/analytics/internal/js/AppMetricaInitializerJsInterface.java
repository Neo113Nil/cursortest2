package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C0817s1;

/* loaded from: classes.dex */
public class AppMetricaInitializerJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C0817s1 f8725a;

    public AppMetricaInitializerJsInterface(C0817s1 c0817s1) {
        this.f8725a = c0817s1;
    }

    @JavascriptInterface
    public void init(String str) {
        this.f8725a.c(str);
    }
}
