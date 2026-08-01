package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: UserAgentProvider.java */
/* loaded from: classes6.dex */
public class e {
    static String d = "UserAgentProvider";
    private static volatile e e;

    /* renamed from: a, reason: collision with root package name */
    String f8981a = "";
    String b = "";
    public AtomicBoolean c = new AtomicBoolean(false);

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        this.f8981a = f();
        b();
        if (!TextUtils.isEmpty(this.f8981a)) {
            a(this.f8981a);
        }
        if (TextUtils.isEmpty(this.f8981a)) {
            this.f8981a = c();
            a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (aVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("userAgent", this.f8981a);
            aVar.a(hashMap);
        }
        this.c.set(true);
    }

    private String c() {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        String str3 = Build.DISPLAY;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
        }
        StringBuilder append = new StringBuilder("Mozilla/5.0 (Linux; Android ").append(str).append("; ").append(str2).append(" Build/");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return append.append(str3).append(") AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19").toString();
    }

    public static e d() {
        if (e == null) {
            synchronized (e.class) {
                if (e == null) {
                    e = new e();
                }
            }
        }
        return e;
    }

    public void a(final com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.e$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.b(aVar);
                }
            });
        } catch (Throwable th) {
            q0.b(d, th.getMessage(), th);
        }
    }

    public String e() {
        return (TextUtils.isEmpty(this.f8981a) && TextUtils.isEmpty(this.b)) ? c() : TextUtils.isEmpty(this.f8981a) ? TextUtils.isEmpty(this.b) ? "" : this.b : this.f8981a;
    }

    private String f() {
        try {
            return WebSettings.getDefaultUserAgent(com.mbridge.msdk.foundation.controller.c.n().d());
        } catch (Throwable th) {
            q0.b(d, th.getMessage(), th);
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        try {
            this.f8981a = new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th) {
            q0.b(d, th.getMessage(), th);
        }
        if (TextUtils.isEmpty(this.f8981a)) {
            this.f8981a = c();
        } else {
            a(this.f8981a);
        }
    }

    public String a() {
        try {
            String f = f();
            this.f8981a = f;
            if (!TextUtils.isEmpty(f)) {
                a(this.f8981a);
            } else {
                b();
            }
            if (TextUtils.isEmpty(this.f8981a)) {
                this.f8981a = c();
            }
            this.c.set(true);
        } catch (Throwable th) {
            q0.b(d, th.getMessage(), th);
        }
        return c();
    }

    private void b() {
        Context d2 = com.mbridge.msdk.foundation.controller.c.n().d();
        if (d2 == null) {
            return;
        }
        this.b = com.mbridge.msdk.config.component.common.util.b.a(d2).a("userAgent", c());
    }

    private void a(final Context context) {
        if (TextUtils.isEmpty(this.f8981a)) {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new Runnable() { // from class: com.mbridge.msdk.config.component.info.provider.subprovider.e$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.b(context);
                }
            });
        }
    }

    private void a(String str) {
        Context d2;
        if (TextUtils.isEmpty(str) || (d2 = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(d2).b("userAgent", str);
    }
}
