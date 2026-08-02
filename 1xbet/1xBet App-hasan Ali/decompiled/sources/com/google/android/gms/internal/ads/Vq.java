package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Vq {

    /* renamed from: a, reason: collision with root package name */
    public Q2.X0 f11943a;

    /* renamed from: b, reason: collision with root package name */
    public Q2.a1 f11944b;

    /* renamed from: c, reason: collision with root package name */
    public String f11945c;

    /* renamed from: d, reason: collision with root package name */
    public Q2.V0 f11946d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11947e;
    public ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f11948g;

    /* renamed from: h, reason: collision with root package name */
    public B8 f11949h;
    public Q2.d1 i;

    /* renamed from: j, reason: collision with root package name */
    public M2.a f11950j;

    /* renamed from: k, reason: collision with root package name */
    public M2.d f11951k;

    /* renamed from: l, reason: collision with root package name */
    public Q2.Q f11952l;

    /* renamed from: m, reason: collision with root package name */
    public int f11953m = 1;

    /* renamed from: n, reason: collision with root package name */
    public X9 f11954n;

    /* renamed from: o, reason: collision with root package name */
    public final f2.m f11955o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11956p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11957q;

    /* renamed from: r, reason: collision with root package name */
    public Eo f11958r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11959s;

    /* renamed from: t, reason: collision with root package name */
    public Bundle f11960t;

    /* renamed from: u, reason: collision with root package name */
    public Q2.U f11961u;

    public Vq() {
        f2.m mVar = new f2.m();
        mVar.f17003l = 2;
        this.f11955o = mVar;
        this.f11956p = false;
        this.f11957q = false;
        this.f11959s = false;
    }

    public final Wq a() {
        m3.v.f("ad unit must not be null", this.f11945c);
        m3.v.f("ad size must not be null", this.f11944b);
        m3.v.f("ad request must not be null", this.f11943a);
        return new Wq(this);
    }
}
