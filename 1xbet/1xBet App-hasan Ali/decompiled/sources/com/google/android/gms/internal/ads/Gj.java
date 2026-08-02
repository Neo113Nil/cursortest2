package com.google.android.gms.internal.ads;

import Q2.AbstractBinderC0389v0;
import Q2.InterfaceC0391w0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Gj {

    /* renamed from: a, reason: collision with root package name */
    public int f9226a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractBinderC0389v0 f9227b;

    /* renamed from: c, reason: collision with root package name */
    public E8 f9228c;

    /* renamed from: d, reason: collision with root package name */
    public View f9229d;

    /* renamed from: e, reason: collision with root package name */
    public List f9230e;

    /* renamed from: g, reason: collision with root package name */
    public Q2.H0 f9231g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f9232h;
    public InterfaceC0677Re i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0677Re f9233j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0677Re f9234k;

    /* renamed from: l, reason: collision with root package name */
    public C1169jn f9235l;

    /* renamed from: m, reason: collision with root package name */
    public E3.a f9236m;

    /* renamed from: n, reason: collision with root package name */
    public C0634Ld f9237n;

    /* renamed from: o, reason: collision with root package name */
    public View f9238o;

    /* renamed from: p, reason: collision with root package name */
    public View f9239p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC2360a f9240q;

    /* renamed from: r, reason: collision with root package name */
    public double f9241r;

    /* renamed from: s, reason: collision with root package name */
    public I8 f9242s;

    /* renamed from: t, reason: collision with root package name */
    public I8 f9243t;

    /* renamed from: u, reason: collision with root package name */
    public String f9244u;

    /* renamed from: x, reason: collision with root package name */
    public float f9247x;

    /* renamed from: y, reason: collision with root package name */
    public String f9248y;

    /* renamed from: v, reason: collision with root package name */
    public final r.Q f9245v = new r.Q(0);

    /* renamed from: w, reason: collision with root package name */
    public final r.Q f9246w = new r.Q(0);
    public List f = Collections.EMPTY_LIST;

    public static Gj A(Fj fj, E8 e8, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, InterfaceC2360a interfaceC2360a, String str4, String str5, double d5, I8 i8, String str6, float f) {
        Gj gj = new Gj();
        gj.f9226a = 6;
        gj.f9227b = fj;
        gj.f9228c = e8;
        gj.f9229d = view;
        gj.u("headline", str);
        gj.f9230e = list;
        gj.u("body", str2);
        gj.f9232h = bundle;
        gj.u("call_to_action", str3);
        gj.f9238o = view2;
        gj.f9240q = interfaceC2360a;
        gj.u("store", str4);
        gj.u("price", str5);
        gj.f9241r = d5;
        gj.f9242s = i8;
        gj.u("advertiser", str6);
        synchronized (gj) {
            gj.f9247x = f;
        }
        return gj;
    }

    public static Object B(InterfaceC2360a interfaceC2360a) {
        if (interfaceC2360a == null) {
            return null;
        }
        return BinderC2361b.t1(interfaceC2360a);
    }

    public static Gj S(InterfaceC0694Ua interfaceC0694Ua) {
        Fj fj;
        InterfaceC0694Ua interfaceC0694Ua2;
        try {
            InterfaceC0391w0 h3 = interfaceC0694Ua.h();
            if (h3 == null) {
                interfaceC0694Ua2 = interfaceC0694Ua;
                fj = null;
            } else {
                interfaceC0694Ua2 = interfaceC0694Ua;
                fj = new Fj(h3, interfaceC0694Ua2);
            }
            return A(fj, interfaceC0694Ua2.k(), (View) B(interfaceC0694Ua2.l()), interfaceC0694Ua2.A(), interfaceC0694Ua2.y(), interfaceC0694Ua2.s(), interfaceC0694Ua2.e(), interfaceC0694Ua2.t(), (View) B(interfaceC0694Ua2.m()), interfaceC0694Ua2.n(), interfaceC0694Ua2.u(), interfaceC0694Ua2.w(), interfaceC0694Ua2.b(), interfaceC0694Ua2.o(), interfaceC0694Ua2.r(), interfaceC0694Ua2.c());
        } catch (RemoteException e3) {
            U2.j.j("Failed to get native ad assets from unified ad mapper", e3);
            return null;
        }
    }

    public final synchronized float C() {
        return this.f9247x;
    }

    public final synchronized int D() {
        return this.f9226a;
    }

    public final synchronized Bundle E() {
        try {
            if (this.f9232h == null) {
                this.f9232h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9232h;
    }

    public final synchronized View F() {
        return this.f9229d;
    }

    public final synchronized View G() {
        return this.f9238o;
    }

    public final synchronized r.Q H() {
        return this.f9245v;
    }

    public final synchronized r.Q I() {
        return this.f9246w;
    }

    public final synchronized InterfaceC0391w0 J() {
        return this.f9227b;
    }

    public final synchronized Q2.H0 K() {
        return this.f9231g;
    }

    public final synchronized E8 L() {
        return this.f9228c;
    }

    public final I8 M() {
        List list = this.f9230e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f9230e.get(0);
        if (obj instanceof IBinder) {
            return BinderC1865z8.u3((IBinder) obj);
        }
        return null;
    }

    public final synchronized I8 N() {
        return this.f9242s;
    }

    public final synchronized C0634Ld O() {
        return this.f9237n;
    }

    public final synchronized InterfaceC0677Re P() {
        return this.f9233j;
    }

    public final synchronized InterfaceC0677Re Q() {
        return this.f9234k;
    }

    public final synchronized InterfaceC0677Re R() {
        return this.i;
    }

    public final synchronized C1169jn T() {
        return this.f9235l;
    }

    public final synchronized InterfaceC2360a U() {
        return this.f9240q;
    }

    public final synchronized E3.a V() {
        return this.f9236m;
    }

    public final synchronized String W() {
        return e("advertiser");
    }

    public final synchronized String X() {
        return e("body");
    }

    public final synchronized String Y() {
        return e("call_to_action");
    }

    public final synchronized String a() {
        return this.f9244u;
    }

    public final synchronized String b() {
        return e("headline");
    }

    public final synchronized String c() {
        return e("price");
    }

    public final synchronized String d() {
        return e("store");
    }

    public final synchronized String e(String str) {
        return (String) this.f9246w.get(str);
    }

    public final synchronized List f() {
        return this.f9230e;
    }

    public final synchronized List g() {
        return this.f;
    }

    public final synchronized void h(E8 e8) {
        this.f9228c = e8;
    }

    public final synchronized void i(String str) {
        this.f9244u = str;
    }

    public final synchronized void j(Q2.H0 h02) {
        this.f9231g = h02;
    }

    public final synchronized void k(I8 i8) {
        this.f9242s = i8;
    }

    public final synchronized void l(String str, BinderC1865z8 binderC1865z8) {
        if (binderC1865z8 == null) {
            this.f9245v.remove(str);
        } else {
            this.f9245v.put(str, binderC1865z8);
        }
    }

    public final synchronized void m(InterfaceC0677Re interfaceC0677Re) {
        this.f9233j = interfaceC0677Re;
    }

    public final synchronized void n(I8 i8) {
        this.f9243t = i8;
    }

    public final synchronized void o(AbstractC1044gv abstractC1044gv) {
        this.f = abstractC1044gv;
    }

    public final synchronized void p(InterfaceC0677Re interfaceC0677Re) {
        this.f9234k = interfaceC0677Re;
    }

    public final synchronized void q(E3.a aVar) {
        this.f9236m = aVar;
    }

    public final synchronized void r(String str) {
        this.f9248y = str;
    }

    public final synchronized void s(C0634Ld c0634Ld) {
        this.f9237n = c0634Ld;
    }

    public final synchronized void t(double d5) {
        this.f9241r = d5;
    }

    public final synchronized void u(String str, String str2) {
        if (str2 == null) {
            this.f9246w.remove(str);
        } else {
            this.f9246w.put(str, str2);
        }
    }

    public final synchronized double v() {
        return this.f9241r;
    }

    public final synchronized void w(BinderC0894df binderC0894df) {
        this.f9227b = binderC0894df;
    }

    public final synchronized void x(View view) {
        this.f9238o = view;
    }

    public final synchronized void y(InterfaceC0677Re interfaceC0677Re) {
        this.i = interfaceC0677Re;
    }

    public final synchronized void z(View view) {
        this.f9239p = view;
    }
}
