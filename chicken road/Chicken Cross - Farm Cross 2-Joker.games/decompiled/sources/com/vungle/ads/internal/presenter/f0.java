package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.j3;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ReentrantLock f12088a = new ReentrantLock();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final AtomicBoolean c = new AtomicBoolean(false);

    public static void a(Context context, i0 adv, j3 placement, String templatePath, com.vungle.ads.internal.model.f0 f0Var, com.vungle.ads.internal.load.f delegate, Long l) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adv, "adv");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(templatePath, "templatePath");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        ReentrantLock reentrantLock = f12088a;
        reentrantLock.lock();
        try {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            StringBuilder sb = new StringBuilder("Preload webview start. Cache size: ");
            LinkedHashMap linkedHashMap = b;
            com.vungle.ads.internal.util.t.a("WebViewManager", sb.append(linkedHashMap.size()).toString());
            String h = adv.h();
            if (!linkedHashMap.containsKey(h)) {
                Handler handler = com.vungle.ads.internal.util.y.f12193a;
                com.vungle.ads.internal.util.y.a(new d0(context, adv, placement, delegate, l, templatePath, h, f0Var));
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static WebView a(Context context, String str) {
        WebView webView;
        Intrinsics.checkNotNullParameter(context, "context");
        ReentrantLock reentrantLock = f12088a;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap = b;
            a0 a0Var = (a0) linkedHashMap.get(str);
            if (a0Var != null) {
                boolean z = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.a("WebViewManager", "Reusing cached webview. Cache size: " + linkedHashMap.size());
                webView = a0Var.a();
            } else {
                boolean z2 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.a("WebViewManager", "Creating new webview. Cache size: " + linkedHashMap.size());
                webView = new WebView(context);
            }
            return webView;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!c.compareAndSet(false, true)) {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("WebViewManager", "Prewarm already done, skip");
        } else {
            Context applicationContext = context.getApplicationContext();
            Handler handler = com.vungle.ads.internal.util.y.f12193a;
            com.vungle.ads.internal.util.y.a(new e0(applicationContext));
        }
    }

    public static com.vungle.ads.internal.ui.z a(i0 advertisement, j3 placement, com.vungle.ads.internal.executor.j offloadExecutor, com.vungle.ads.internal.platform.f platform) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        Intrinsics.checkNotNullParameter(platform, "platform");
        ReentrantLock reentrantLock = f12088a;
        reentrantLock.lock();
        try {
            a0 a0Var = (a0) b.get(advertisement.h());
            com.vungle.ads.internal.ui.z b2 = a0Var != null ? a0Var.b() : null;
            if (b2 == null) {
                b2 = new com.vungle.ads.internal.ui.z(advertisement, placement, offloadExecutor, platform);
            }
            return b2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static void a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ReentrantLock reentrantLock = f12088a;
        reentrantLock.lock();
        try {
            b.remove(key);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
