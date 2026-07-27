package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import io.appmetrica.analytics.impl.C0966s1;

/* loaded from: classes.dex */
public class AppMetricaJsInterface {

    /* renamed from: a, reason: collision with root package name */
    private final C0966s1 f9689a;

    public AppMetricaJsInterface(C0966s1 c0966s1) {
        this.f9689a = c0966s1;
    }

    @JavascriptInterface
    public void reportEvent(String str, String str2) {
        this.f9689a.d(str, str2);
    }
}
