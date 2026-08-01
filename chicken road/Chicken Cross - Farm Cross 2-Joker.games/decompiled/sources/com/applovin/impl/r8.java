package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.i6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public abstract class r8 {

    /* renamed from: a, reason: collision with root package name */
    private static String f4416a;
    private static int d;
    private static String e;
    private static String f;
    private static final Object b = new Object();
    private static final AtomicBoolean c = new AtomicBoolean();
    private static final AtomicBoolean g = new AtomicBoolean();

    static {
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        if (lVar != null && ((Boolean) lVar.a(c5.l4)).booleanValue() && e()) {
            f4416a = (String) f5.a(e5.M, "", com.applovin.impl.sdk.l.p());
        } else {
            f4416a = "";
            f5.b(e5.M, (Object) null, com.applovin.impl.sdk.l.p());
        }
    }

    public static void a(final com.applovin.impl.sdk.l lVar) {
        if (c.getAndSet(true)) {
            return;
        }
        if (((Boolean) lVar.a(c5.m4)).booleanValue()) {
            lVar.s0().a((n5) new x6(lVar, true, "collectUAString", new Runnable() { // from class: com.applovin.impl.r8$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    r8.d(com.applovin.impl.sdk.l.this);
                }
            }), i6.b.OTHER);
        } else {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.r8$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    r8.e(com.applovin.impl.sdk.l.this);
                }
            });
        }
    }

    public static String b() {
        return f;
    }

    public static String c() {
        return e;
    }

    public static int d() {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(com.applovin.impl.sdk.l lVar) {
        try {
            synchronized (b) {
                a(WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.l.p()), lVar);
            }
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            lVar.E().a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    public static void b(com.applovin.impl.sdk.l lVar) {
        if (g.getAndSet(true)) {
            return;
        }
        PackageInfo c2 = c(lVar);
        if (c2 != null) {
            d = c2.versionCode;
            e = c2.versionName;
            f = c2.packageName;
        } else {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(com.applovin.impl.sdk.l lVar) {
        PackageManager packageManager = com.applovin.impl.sdk.l.p().getPackageManager();
        if (p0.d()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = lVar.c(c5.x4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.l lVar) {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.l.p());
            synchronized (b) {
                a(defaultUserAgent, lVar);
            }
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("WebViewDataCollector", "Failed to collect user agent on background thread", th);
            }
            lVar.E().a("WebViewDataCollector", "collectUserAgentOnBackgroundThread", th);
        }
    }

    private static boolean e() {
        boolean isValidString;
        synchronized (b) {
            isValidString = StringUtils.isValidString((String) f5.a(e5.M, "", com.applovin.impl.sdk.l.p()));
        }
        return isValidString;
    }

    private static void a(String str, com.applovin.impl.sdk.l lVar) {
        if (TextUtils.isEmpty(str)) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("WebViewDataCollector", "Collected invalid user agent");
            }
            lVar.E().a(h2.n1, "collectedInvalidUserAgent");
            return;
        }
        f4416a = str;
        f5.b(e5.M, f4416a, com.applovin.impl.sdk.l.p());
    }

    public static String a() {
        String str;
        synchronized (b) {
            str = f4416a;
        }
        return str;
    }
}
