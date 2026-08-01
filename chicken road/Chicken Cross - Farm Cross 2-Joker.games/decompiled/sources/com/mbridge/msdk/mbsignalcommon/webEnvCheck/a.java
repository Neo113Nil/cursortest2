package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* compiled from: MBWebViewChecker.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f9624a;
    private static volatile Handler b;
    private static Boolean c;

    /* compiled from: MBWebViewChecker.java */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a$a, reason: collision with other inner class name */
    class RunnableC1406a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f9625a;

        RunnableC1406a(Context context) {
            this.f9625a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f9624a == null) {
                try {
                    Boolean unused = a.f9624a = Boolean.valueOf(a.a(this.f9625a));
                } catch (Exception unused2) {
                    Boolean unused3 = a.f9624a = Boolean.FALSE;
                }
            }
        }
    }

    public static boolean b(Context context) {
        g gVar;
        try {
            gVar = i.b().d(c.n().b());
        } catch (Exception unused) {
            gVar = null;
        }
        if (gVar != null) {
            c = Boolean.valueOf(gVar.I0());
        } else {
            c = Boolean.FALSE;
        }
        Boolean bool = c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f9624a == null) {
                try {
                    f9624a = Boolean.valueOf(a(context));
                } catch (Exception unused2) {
                    f9624a = Boolean.FALSE;
                }
            }
            if (f9624a == null) {
                f9624a = new Boolean(false);
            }
            return f9624a.booleanValue();
        }
        if (f9624a == null && b == null) {
            b = new Handler(Looper.getMainLooper());
            b.post(new RunnableC1406a(context));
        }
        if (f9624a == null) {
            return true;
        }
        return f9624a.booleanValue();
    }

    public static boolean a(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        a(webView);
        return true;
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBWebViewChecker", "destroy webview error", e);
            }
        }
    }
}
