package com.google.android.gms.internal.ads;

import Q2.AbstractBinderC0389v0;
import Q2.C0393x0;
import android.os.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r.C2327e;

/* renamed from: com.google.android.gms.internal.ads.df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0894df extends AbstractBinderC0389v0 {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0677Re f13114k;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f13116m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f13117n;

    /* renamed from: o, reason: collision with root package name */
    public int f13118o;

    /* renamed from: p, reason: collision with root package name */
    public C0393x0 f13119p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13120q;

    /* renamed from: s, reason: collision with root package name */
    public float f13122s;

    /* renamed from: t, reason: collision with root package name */
    public float f13123t;

    /* renamed from: u, reason: collision with root package name */
    public float f13124u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13125v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13126w;

    /* renamed from: x, reason: collision with root package name */
    public C0791b9 f13127x;

    /* renamed from: l, reason: collision with root package name */
    public final Object f13115l = new Object();

    /* renamed from: r, reason: collision with root package name */
    public boolean f13121r = true;

    public BinderC0894df(InterfaceC0677Re interfaceC0677Re, float f, boolean z3, boolean z5) {
        this.f13114k = interfaceC0677Re;
        this.f13122s = f;
        this.f13116m = z3;
        this.f13117n = z5;
    }

    @Override // Q2.InterfaceC0391w0
    public final void S(boolean z3) {
        x3(true != z3 ? "unmute" : "mute", null);
    }

    @Override // Q2.InterfaceC0391w0
    public final void Y1(C0393x0 c0393x0) {
        synchronized (this.f13115l) {
            this.f13119p = c0393x0;
        }
    }

    @Override // Q2.InterfaceC0391w0
    public final float b() {
        float f;
        synchronized (this.f13115l) {
            f = this.f13124u;
        }
        return f;
    }

    @Override // Q2.InterfaceC0391w0
    public final float c() {
        float f;
        synchronized (this.f13115l) {
            f = this.f13123t;
        }
        return f;
    }

    @Override // Q2.InterfaceC0391w0
    public final C0393x0 e() {
        C0393x0 c0393x0;
        synchronized (this.f13115l) {
            c0393x0 = this.f13119p;
        }
        return c0393x0;
    }

    @Override // Q2.InterfaceC0391w0
    public final float f() {
        float f;
        synchronized (this.f13115l) {
            f = this.f13122s;
        }
        return f;
    }

    @Override // Q2.InterfaceC0391w0
    public final int g() {
        int i;
        synchronized (this.f13115l) {
            i = this.f13118o;
        }
        return i;
    }

    @Override // Q2.InterfaceC0391w0
    public final void k() {
        x3("pause", null);
    }

    @Override // Q2.InterfaceC0391w0
    public final void m() {
        x3("stop", null);
    }

    @Override // Q2.InterfaceC0391w0
    public final boolean n() {
        boolean z3;
        Object obj = this.f13115l;
        boolean r5 = r();
        synchronized (obj) {
            z3 = false;
            if (!r5) {
                try {
                    if (this.f13126w && this.f13117n) {
                        z3 = true;
                    }
                } finally {
                }
            }
        }
        return z3;
    }

    @Override // Q2.InterfaceC0391w0
    public final void o() {
        x3("play", null);
    }

    @Override // Q2.InterfaceC0391w0
    public final boolean r() {
        boolean z3;
        synchronized (this.f13115l) {
            try {
                z3 = false;
                if (this.f13116m && this.f13125v) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // Q2.InterfaceC0391w0
    public final boolean s() {
        boolean z3;
        synchronized (this.f13115l) {
            z3 = this.f13121r;
        }
        return z3;
    }

    public final void u() {
        boolean z3;
        int i;
        int i5;
        synchronized (this.f13115l) {
            z3 = this.f13121r;
            i = this.f13118o;
            i5 = 3;
            this.f13118o = 3;
        }
        AbstractC0613Id.f.execute(new RunnableC0849cf(this, i, i5, z3, z3));
    }

    public final void v3(float f, float f5, int i, boolean z3, float f6) {
        boolean z5;
        boolean z6;
        int i5;
        synchronized (this.f13115l) {
            try {
                z5 = true;
                if (f5 == this.f13122s && f6 == this.f13124u) {
                    z5 = false;
                }
                this.f13122s = f5;
                if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.qc)).booleanValue()) {
                    this.f13123t = f;
                }
                z6 = this.f13121r;
                this.f13121r = z3;
                i5 = this.f13118o;
                this.f13118o = i;
                float f7 = this.f13124u;
                this.f13124u = f6;
                if (Math.abs(f6 - f7) > 1.0E-4f) {
                    this.f13114k.K().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z5) {
            try {
                C0791b9 c0791b9 = this.f13127x;
                if (c0791b9 != null) {
                    c0791b9.d1(c0791b9.N(), 2);
                }
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
            }
        }
        AbstractC0613Id.f.execute(new RunnableC0849cf(this, i5, i, z6, z3));
    }

    public final void w3(Q2.V0 v02) {
        Object obj = this.f13115l;
        boolean z3 = v02.f4943k;
        boolean z5 = v02.f4944l;
        boolean z6 = v02.f4945m;
        synchronized (obj) {
            this.f13125v = z5;
            this.f13126w = z6;
        }
        String str = true != z3 ? "0" : "1";
        String str2 = true != z5 ? "0" : "1";
        String str3 = true != z6 ? "0" : "1";
        C2327e c2327e = new C2327e(3);
        c2327e.put("muteStart", str);
        c2327e.put("customControlsRequested", str2);
        c2327e.put("clickToExpandRequested", str3);
        x3("initialState", Collections.unmodifiableMap(c2327e));
    }

    public final void x3(String str, Map map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        AbstractC0613Id.f.execute(new Kw(17, this, hashMap));
    }
}
