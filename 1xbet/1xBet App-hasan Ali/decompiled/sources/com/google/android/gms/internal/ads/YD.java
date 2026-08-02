package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class YD {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12292a;

    /* renamed from: b, reason: collision with root package name */
    public final Nm f12293b;

    /* renamed from: c, reason: collision with root package name */
    public final Hq f12294c;

    /* renamed from: d, reason: collision with root package name */
    public final E7 f12295d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1805xu f12296e;
    public InterfaceC1805xu f;

    /* renamed from: g, reason: collision with root package name */
    public final Ms f12297g;

    /* renamed from: h, reason: collision with root package name */
    public final Looper f12298h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final Mm f12299j;

    /* renamed from: k, reason: collision with root package name */
    public final int f12300k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f12301l;

    /* renamed from: m, reason: collision with root package name */
    public final LE f12302m;

    /* renamed from: n, reason: collision with root package name */
    public final long f12303n;

    /* renamed from: o, reason: collision with root package name */
    public final long f12304o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12305p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12306q;

    /* renamed from: r, reason: collision with root package name */
    public final String f12307r;

    /* renamed from: s, reason: collision with root package name */
    public final UD f12308s;

    public YD(Context context, Qt qt) {
        Hq hq = new Hq(8, qt);
        E7 e7 = new E7(context, 2);
        C1685v8 c1685v8 = new C1685v8(context, 2);
        Fz fz = new Fz(21);
        Ms ms = new Ms(context, 4);
        context.getClass();
        this.f12292a = context;
        this.f12294c = hq;
        this.f12295d = e7;
        this.f12296e = c1685v8;
        this.f = fz;
        this.f12297g = ms;
        int i = AbstractC1260lo.f14419a;
        Looper myLooper = Looper.myLooper();
        this.f12298h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f12299j = Mm.f10718b;
        this.f12300k = 1;
        this.f12301l = true;
        this.f12302m = LE.f10330c;
        this.f12308s = new UD(AbstractC1260lo.s(20L), AbstractC1260lo.s(500L));
        this.f12293b = Nm.f10813a;
        this.f12303n = 500L;
        this.f12304o = 2000L;
        this.f12305p = true;
        this.f12307r = "";
        this.i = -1000;
    }
}
