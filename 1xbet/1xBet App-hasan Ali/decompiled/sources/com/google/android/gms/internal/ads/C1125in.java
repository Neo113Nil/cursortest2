package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.in, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1125in {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13986a;

    /* renamed from: b, reason: collision with root package name */
    public final U2.a f13987b;

    /* renamed from: c, reason: collision with root package name */
    public final Lq f13988c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0677Re f13989d;

    /* renamed from: e, reason: collision with root package name */
    public final C1482ql f13990e;
    public C0375o f;

    public C1125in(Context context, U2.a aVar, Lq lq, InterfaceC0677Re interfaceC0677Re, C1482ql c1482ql) {
        this.f13986a = context;
        this.f13987b = aVar;
        this.f13988c = lq;
        this.f13989d = interfaceC0677Re;
        this.f13990e = c1482ql;
    }

    public final synchronized void a() {
        InterfaceC0677Re interfaceC0677Re;
        if (this.f == null || (interfaceC0677Re = this.f13989d) == null) {
            return;
        }
        interfaceC0677Re.a("onSdkImpression", Cv.f8103q);
    }

    public final synchronized void b() {
        InterfaceC0677Re interfaceC0677Re;
        try {
            C0375o c0375o = this.f;
            if (c0375o == null || (interfaceC0677Re = this.f13989d) == null) {
                return;
            }
            ArrayList P02 = interfaceC0677Re.P0();
            int size = P02.size();
            int i = 0;
            while (i < size) {
                Object obj = P02.get(i);
                i++;
                P2.o.f4767B.f4789w.getClass();
                Oi.p(new RunnableC1081hn(0, c0375o, (View) obj));
            }
            this.f13989d.a("onSdkLoaded", Cv.f8103q);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean c() {
        if (this.f13988c.f10482T) {
            A7 a7 = F7.f8750Q4;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                if (((Boolean) rVar.f5056c.a(F7.T4)).booleanValue() && this.f13989d != null) {
                    if (this.f != null) {
                        U2.j.i("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.f13986a;
                    P2.o oVar = P2.o.f4767B;
                    oVar.f4789w.getClass();
                    if (!Oi.j(context)) {
                        U2.j.i("Unable to initialize omid.");
                        return false;
                    }
                    Hq hq = this.f13988c.f10484V;
                    hq.getClass();
                    if (((JSONObject) hq.f9491l).optBoolean((String) rVar.f5056c.a(F7.V4), true)) {
                        U2.a aVar = this.f13987b;
                        InterfaceC0677Re interfaceC0677Re = this.f13989d;
                        Oi oi = oVar.f4789w;
                        WebView m02 = interfaceC0677Re.m0();
                        oi.getClass();
                        C0375o e3 = Oi.e(aVar, m02);
                        if (((Boolean) rVar.f5056c.a(F7.U4)).booleanValue()) {
                            C1482ql c1482ql = this.f13990e;
                            String str = e3 != null ? "1" : "0";
                            C1390oj a5 = c1482ql.a();
                            a5.k("omid_js_session_success", str);
                            a5.q();
                        }
                        if (e3 == null) {
                            U2.j.i("Unable to create javascript session service.");
                            return false;
                        }
                        U2.j.h("Created omid javascript session service.");
                        this.f = e3;
                        this.f13989d.f0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
