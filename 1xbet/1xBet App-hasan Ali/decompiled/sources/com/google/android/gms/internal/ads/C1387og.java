package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.og, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1387og implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final C1565sf f14813a;

    /* renamed from: b, reason: collision with root package name */
    public final CD f14814b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f14815c;

    /* renamed from: d, reason: collision with root package name */
    public final C1119ih f14816d;

    /* renamed from: e, reason: collision with root package name */
    public final C1119ih f14817e;
    public final CD f;

    /* renamed from: g, reason: collision with root package name */
    public final CD f14818g;

    /* renamed from: h, reason: collision with root package name */
    public final DD f14819h;
    public final DD i;

    /* renamed from: j, reason: collision with root package name */
    public final CD f14820j;

    /* renamed from: k, reason: collision with root package name */
    public final CD f14821k;

    /* renamed from: l, reason: collision with root package name */
    public final CD f14822l;

    /* renamed from: m, reason: collision with root package name */
    public final Hh f14823m;

    public C1387og(C1565sf c1565sf, CD cd, CD cd2, C1119ih c1119ih, C1119ih c1119ih2, CD cd3, CD cd4, DD dd, DD dd2, CD cd5, CD cd6, CD cd7, Hh hh) {
        this.f14813a = c1565sf;
        this.f14814b = cd;
        this.f14815c = cd2;
        this.f14816d = c1119ih;
        this.f14817e = c1119ih2;
        this.f = cd3;
        this.f14818g = cd4;
        this.f14819h = dd;
        this.i = dd2;
        this.f14820j = cd5;
        this.f14821k = cd6;
        this.f14822l = cd7;
        this.f14823m = hh;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        Context a5 = this.f14813a.a();
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        Executor executor = (Executor) this.f14814b.d();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f14815c.d();
        Sq sq = (Sq) this.f14816d.f13965b.f13186l;
        AbstractC1400ot.D(sq);
        Lq a6 = this.f14817e.a();
        C0951es c0951es = (C0951es) this.f.d();
        Zq zq = (Zq) this.f14818g.d();
        View view = (View) this.f14819h.d();
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.i.d();
        Q4 q42 = (Q4) this.f14820j.d();
        T7 t7 = (T7) this.f14821k.d();
        return new C1342ng(a5, c0606Hd, executor, scheduledExecutorService, sq, a6, c0951es, zq, view, interfaceC0677Re, q42, t7, this.f14823m.f9452b.f9210e);
    }
}
