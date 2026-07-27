package com.startapp.sdk.internal;

import Y1.C0077a;
import android.content.Context;
import android.webkit.WebView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import n1.AbstractC1141a;
import o1.AbstractC1150b;
import o1.C1149a;
import p1.C1166b;
import s1.C1202i;
import v1.AbstractC1217a;

/* loaded from: classes.dex */
public final class sd {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1150b f4332a;

    /* renamed from: b, reason: collision with root package name */
    public final C1149a f4333b;

    /* renamed from: c, reason: collision with root package name */
    public final C1166b f4334c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f4335d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f4336e = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sd(WebView webView) {
        WebView webView2;
        o1.i iVar;
        C1149a a3;
        try {
            try {
                Context context = webView.getContext();
                try {
                    try {
                        if (!AbstractC1141a.f10128a.f10049a) {
                            try {
                                AbstractC1141a.a(context);
                            } catch (Throwable th) {
                                th = th;
                                webView2 = webView;
                                d9.a(th);
                                iVar = null;
                                this.f4332a = iVar;
                                webView2.getContext();
                                if (iVar != null) {
                                }
                                a3 = null;
                                this.f4333b = a3;
                                this.f4334c = null;
                            }
                        }
                        X0.a.b("Startio", "Name is null or empty");
                        X0.a.b("5.3.0", "Version is null or empty");
                        webView2 = webView;
                        iVar = AbstractC1150b.b(V1.b.s(o1.d.HTML_DISPLAY, o1.g.NONE), new l.s0(new C0077a(15), webView2, null, null, o1.c.HTML));
                    } catch (Throwable th2) {
                        webView2 = webView;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    webView2 = webView;
                }
            } catch (Throwable th4) {
                th = th4;
                d9.a(th);
                iVar = null;
                this.f4332a = iVar;
                webView2.getContext();
                if (iVar != null) {
                }
                a3 = null;
                this.f4333b = a3;
                this.f4334c = null;
            }
        } catch (Throwable th5) {
            th = th5;
            webView2 = webView;
            d9.a(th);
            iVar = null;
            this.f4332a = iVar;
            webView2.getContext();
            if (iVar != null) {
            }
            a3 = null;
            this.f4333b = a3;
            this.f4334c = null;
        }
        this.f4332a = iVar;
        webView2.getContext();
        if (iVar != null) {
            try {
                a3 = C1149a.a(iVar);
            } catch (Throwable th6) {
                d9.a(th6);
            }
            this.f4333b = a3;
            this.f4334c = null;
        }
        a3 = null;
        this.f4333b = a3;
        this.f4334c = null;
    }

    public final void a() {
        if (this.f4333b == null || !this.f4335d.compareAndSet(false, true)) {
            return;
        }
        o1.i iVar = this.f4333b.f10143a;
        X0.a.h(iVar);
        iVar.f10169b.getClass();
        if (!iVar.f || iVar.f10173g) {
            try {
                iVar.e();
            } catch (Exception unused) {
            }
        }
        if (!iVar.f || iVar.f10173g) {
            return;
        }
        if (iVar.f10175i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        AbstractC1217a abstractC1217a = iVar.f10172e;
        C1202i.f10332a.a(abstractC1217a.g(), "publishImpressionEvent", abstractC1217a.f10406a);
        iVar.f10175i = true;
    }

    public sd(Context context, List list, boolean z3) {
        AbstractC1150b abstractC1150b;
        C1149a a3;
        C1166b c1166b = null;
        try {
            abstractC1150b = d0.a(context, list, z3);
        } catch (Throwable th) {
            d9.a(th);
            abstractC1150b = null;
        }
        this.f4332a = abstractC1150b;
        if (abstractC1150b != null) {
            try {
                a3 = C1149a.a(abstractC1150b);
            } catch (Throwable th2) {
                d9.a(th2);
            }
            this.f4333b = a3;
            if (z3 && abstractC1150b != null) {
                try {
                    c1166b = C1166b.a(abstractC1150b);
                } catch (Throwable th3) {
                    d9.a(th3);
                }
            }
            this.f4334c = c1166b;
        }
        a3 = null;
        this.f4333b = a3;
        if (z3) {
            c1166b = C1166b.a(abstractC1150b);
        }
        this.f4334c = c1166b;
    }
}
