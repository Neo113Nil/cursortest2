package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class Mk {

    /* renamed from: a, reason: collision with root package name */
    public final Kh f10702a;

    /* renamed from: b, reason: collision with root package name */
    public final Yh f10703b;

    /* renamed from: c, reason: collision with root package name */
    public final C0941ei f10704c;

    /* renamed from: d, reason: collision with root package name */
    public final C1076hi f10705d;

    /* renamed from: e, reason: collision with root package name */
    public final C1793xi f10706e;
    public final Ui f;

    /* renamed from: g, reason: collision with root package name */
    public final C1482ql f10707g;

    /* renamed from: h, reason: collision with root package name */
    public final C1041gs f10708h;
    public final Xm i;

    /* renamed from: j, reason: collision with root package name */
    public final C1074hg f10709j;

    public Mk(Kh kh, Yh yh, C0941ei c0941ei, C1076hi c1076hi, C1793xi c1793xi, Ui ui, C1482ql c1482ql, C1041gs c1041gs, Xm xm, C1074hg c1074hg) {
        this.f10702a = kh;
        this.f10703b = yh;
        this.f10704c = c0941ei;
        this.f10705d = c1076hi;
        this.f10706e = c1793xi;
        this.f = ui;
        this.f10707g = c1482ql;
        this.f10708h = c1041gs;
        this.i = xm;
        this.f10709j = c1074hg;
    }

    public final void a(Nk nk, InterfaceC0677Re interfaceC0677Re) {
        Lk lk = nk.f10808a;
        Yh yh = this.f10703b;
        Objects.requireNonNull(yh);
        Gk gk = new Gk(1, yh);
        Kh kh = this.f10702a;
        C0941ei c0941ei = this.f10704c;
        C1076hi c1076hi = this.f10705d;
        C1793xi c1793xi = this.f10706e;
        Ui ui = this.f;
        synchronized (lk) {
            lk.a(kh, c0941ei, c1076hi, c1793xi, gk);
            lk.f10457p = ui;
        }
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.K9)).booleanValue() || interfaceC0677Re == null || interfaceC0677Re.I() == null) {
            return;
        }
        C1028gf I5 = interfaceC0677Re.I();
        I5.d(this.f10709j, this.i, this.f10708h);
        I5.i(this.f10709j, this.i, this.f10707g);
    }
}
