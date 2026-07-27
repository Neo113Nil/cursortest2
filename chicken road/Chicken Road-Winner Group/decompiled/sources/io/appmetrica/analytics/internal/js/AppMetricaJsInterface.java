package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C0817s1;

/* loaded from: classes.dex */
public class AppMetricaJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C0817s1 f8726a;

    public AppMetricaJsInterface(C0817s1 c0817s1) {
        this.f8726a = c0817s1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f8726a.d(str, str2);
    }
}
