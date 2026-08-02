package com.google.android.gms.internal.ads;

import Q2.InterfaceC0347a;
import a3.AbstractC0467k;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Vk {

    /* renamed from: a, reason: collision with root package name */
    public final Kh f11913a;

    /* renamed from: b, reason: collision with root package name */
    public final Ui f11914b;

    /* renamed from: c, reason: collision with root package name */
    public final Yh f11915c;

    /* renamed from: d, reason: collision with root package name */
    public final C0941ei f11916d;

    /* renamed from: e, reason: collision with root package name */
    public final C1076hi f11917e;
    public final C1793xi f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f11918g;

    /* renamed from: h, reason: collision with root package name */
    public final Ti f11919h;
    public final C1656ug i;

    /* renamed from: j, reason: collision with root package name */
    public final P2.a f11920j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0758ad f11921k;

    /* renamed from: l, reason: collision with root package name */
    public final Q4 f11922l;

    /* renamed from: m, reason: collision with root package name */
    public final C1568si f11923m;

    /* renamed from: n, reason: collision with root package name */
    public final Xm f11924n;

    /* renamed from: o, reason: collision with root package name */
    public final C1041gs f11925o;

    /* renamed from: p, reason: collision with root package name */
    public final C1482ql f11926p;

    /* renamed from: q, reason: collision with root package name */
    public final C1074hg f11927q;

    /* renamed from: r, reason: collision with root package name */
    public final C0766al f11928r;

    public Vk(Kh kh, Yh yh, C0941ei c0941ei, C1076hi c1076hi, C1793xi c1793xi, Executor executor, Ti ti, C1656ug c1656ug, P2.a aVar, InterfaceC0758ad interfaceC0758ad, Q4 q42, C1568si c1568si, Xm xm, C1041gs c1041gs, C1482ql c1482ql, Ui ui, C1074hg c1074hg, C0766al c0766al) {
        this.f11913a = kh;
        this.f11915c = yh;
        this.f11916d = c0941ei;
        this.f11917e = c1076hi;
        this.f = c1793xi;
        this.f11918g = executor;
        this.f11919h = ti;
        this.i = c1656ug;
        this.f11920j = aVar;
        this.f11921k = interfaceC0758ad;
        this.f11922l = q42;
        this.f11923m = c1568si;
        this.f11924n = xm;
        this.f11925o = c1041gs;
        this.f11926p = c1482ql;
        this.f11914b = ui;
        this.f11927q = c1074hg;
        this.f11928r = c0766al;
    }

    public static final C0634Ld b(InterfaceC0677Re interfaceC0677Re, String str, String str2, Bundle bundle) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8816d2)).booleanValue()) {
            AbstractC0467k.C(P2.o.f4767B.f4776j, bundle, "rendering-webview-load-html-start");
        }
        C0634Ld c0634Ld = new C0634Ld();
        interfaceC0677Re.I().f13619q = new C0709Wb(21, bundle, c0634Ld);
        interfaceC0677Re.S0(str, str2);
        return c0634Ld;
    }

    public final void a(InterfaceC0677Re interfaceC0677Re, boolean z3, A9 a9, Bundle bundle) {
        N4 n42;
        A7 a7 = F7.f8816d2;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            AbstractC0467k.C(P2.o.f4767B.f4776j, bundle, "rendering-configure-webview-start");
        }
        interfaceC0677Re.I().w(new InterfaceC0347a() { // from class: com.google.android.gms.internal.ads.Sk
            @Override // Q2.InterfaceC0347a
            public final void z() {
                Vk.this.f11913a.z();
            }
        }, this.f11916d, this.f11917e, new InterfaceC1506r9() { // from class: com.google.android.gms.internal.ads.Tk
            @Override // com.google.android.gms.internal.ads.InterfaceC1506r9
            public final void j(String str, String str2) {
                Vk.this.f.j(str, str2);
            }
        }, new Gk(2, this), z3, a9, this.f11920j, new Qt(19, this), this.f11921k, this.f11924n, this.f11925o, this.f11926p, null, this.f11914b, null, null, null, this.f11927q);
        interfaceC0677Re.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.Uk
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Vk vk = Vk.this;
                vk.getClass();
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.E9)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    vk.f11928r.f12702a = motionEvent;
                }
                vk.f11920j.f4713b = true;
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        interfaceC0677Re.setOnClickListener(new ViewOnClickListenerC1831yb(1, this));
        A7 a72 = F7.f8662B2;
        D7 d7 = rVar.f5056c;
        if (((Boolean) d7.a(a72)).booleanValue() && (n42 = this.f11922l.f11167b) != null) {
            n42.b(interfaceC0677Re.K());
        }
        Ti ti = this.f11919h;
        Executor executor = this.f11918g;
        ti.m1(interfaceC0677Re, executor);
        ti.m1(new C1615tk(interfaceC0677Re, 2), executor);
        ti.p1(interfaceC0677Re.K());
        interfaceC0677Re.s0("/trackActiveViewUnit", new C1641u9(5, this, interfaceC0677Re));
        C1656ug c1656ug = this.i;
        c1656ug.getClass();
        c1656ug.f15886t = new WeakReference(interfaceC0677Re);
        if (((Boolean) d7.a(a7)).booleanValue()) {
            AbstractC0467k.C(P2.o.f4767B.f4776j, bundle, "rendering-configure-webview-end");
        }
    }
}
