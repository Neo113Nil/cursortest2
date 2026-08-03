package com.google.android.gms.common.internal;

/* loaded from: classes.dex */
public abstract class a implements n0.InterfaceC0939c {

    /* renamed from: x, reason: collision with root package name */
    public static final m0.d[] f2598x = new m0.d[0];

    /* renamed from: a, reason: collision with root package name */
    public volatile java.lang.String f2599a;

    /* renamed from: b, reason: collision with root package name */
    public P0.A f2600b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f2601c;

    /* renamed from: d, reason: collision with root package name */
    public final p0.C0947B f2602d;

    /* renamed from: e, reason: collision with root package name */
    public final p0.HandlerC0967s f2603e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f2604f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f2605g;

    /* renamed from: h, reason: collision with root package name */
    public p0.C0965q f2606h;

    /* renamed from: i, reason: collision with root package name */
    public p0.InterfaceC0950b f2607i;

    /* renamed from: j, reason: collision with root package name */
    public android.os.IInterface f2608j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f2609k;

    /* renamed from: l, reason: collision with root package name */
    public p0.ServiceConnectionC0969u f2610l;

    /* renamed from: m, reason: collision with root package name */
    public int f2611m;

    /* renamed from: n, reason: collision with root package name */
    public final p0.C0955g f2612n;

    /* renamed from: o, reason: collision with root package name */
    public final p0.C0955g f2613o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2614p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f2615q;

    /* renamed from: r, reason: collision with root package name */
    public volatile java.lang.String f2616r;

    /* renamed from: s, reason: collision with root package name */
    public m0.b f2617s;
    public boolean t;

    /* renamed from: u, reason: collision with root package name */
    public volatile p0.C0972x f2618u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f2619v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Set f2620w;

    public a(android.content.Context context, android.os.Looper looper, int i2, P1.h hVar, n0.g gVar, n0.h hVar2) {
        synchronized (p0.C0947B.f8211g) {
            try {
                if (p0.C0947B.f8212h == null) {
                    p0.C0947B.f8212h = new p0.C0947B(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        p0.C0947B c0947b = p0.C0947B.f8212h;
        java.lang.Object obj = m0.f.f8052c;
        p0.AbstractC0966r.c(gVar);
        p0.AbstractC0966r.c(hVar2);
        p0.C0955g c0955g = new p0.C0955g(gVar);
        p0.C0955g c0955g2 = new p0.C0955g(hVar2);
        java.lang.String str = (java.lang.String) hVar.f1486d;
        this.f2599a = null;
        this.f2604f = new java.lang.Object();
        this.f2605g = new java.lang.Object();
        this.f2609k = new java.util.ArrayList();
        this.f2611m = 1;
        this.f2617s = null;
        this.t = false;
        this.f2618u = null;
        this.f2619v = new java.util.concurrent.atomic.AtomicInteger(0);
        p0.AbstractC0966r.d(context, "Context must not be null");
        this.f2601c = context;
        p0.AbstractC0966r.d(looper, "Looper must not be null");
        p0.AbstractC0966r.d(c0947b, "Supervisor must not be null");
        this.f2602d = c0947b;
        this.f2603e = new p0.HandlerC0967s(this, looper);
        this.f2614p = i2;
        this.f2612n = c0955g;
        this.f2613o = c0955g2;
        this.f2615q = str;
        java.util.Set set = (java.util.Set) hVar.f1484b;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((com.google.android.gms.common.api.Scope) it.next())) {
                throw new java.lang.IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2620w = set;
    }

    public static /* bridge */ /* synthetic */ boolean u(com.google.android.gms.common.internal.a aVar, int i2, int i3, android.os.IInterface iInterface) {
        synchronized (aVar.f2604f) {
            try {
                if (aVar.f2611m != i2) {
                    return false;
                }
                aVar.v(i3, iInterface);
                return true;
            } finally {
            }
        }
    }

    @Override // n0.InterfaceC0939c
    public final boolean a() {
        boolean z2;
        synchronized (this.f2604f) {
            int i2 = this.f2611m;
            z2 = true;
            if (i2 != 2 && i2 != 3) {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // n0.InterfaceC0939c
    public final m0.d[] b() {
        p0.C0972x c0972x = this.f2618u;
        if (c0972x == null) {
            return null;
        }
        return c0972x.f8297b;
    }

    @Override // n0.InterfaceC0939c
    public final boolean c() {
        boolean z2;
        synchronized (this.f2604f) {
            z2 = this.f2611m == 4;
        }
        return z2;
    }

    @Override // n0.InterfaceC0939c
    public final void d() {
        if (!c() || this.f2600b == null) {
            throw new java.lang.RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // n0.InterfaceC0939c
    public final java.lang.String e() {
        return this.f2599a;
    }

    @Override // n0.InterfaceC0939c
    public final java.util.Set f() {
        return i() ? this.f2620w : java.util.Collections.emptySet();
    }

    @Override // n0.InterfaceC0939c
    public final void g() {
        this.f2619v.incrementAndGet();
        synchronized (this.f2609k) {
            try {
                int size = this.f2609k.size();
                for (int i2 = 0; i2 < size; i2++) {
                    p0.AbstractC0963o abstractC0963o = (p0.AbstractC0963o) this.f2609k.get(i2);
                    synchronized (abstractC0963o) {
                        abstractC0963o.f8278a = null;
                    }
                }
                this.f2609k.clear();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        synchronized (this.f2605g) {
            this.f2606h = null;
        }
        v(1, null);
    }

    @Override // n0.InterfaceC0939c
    public final void h(java.lang.String str) {
        this.f2599a = str;
        g();
    }

    @Override // n0.InterfaceC0939c
    public boolean i() {
        return false;
    }

    @Override // n0.InterfaceC0939c
    public final void j(Z0.h hVar) {
        ((o0.m) hVar.f1903b).f8165m.f8145m.post(new C.b(10, hVar));
    }

    @Override // n0.InterfaceC0939c
    public final void k(p0.InterfaceC0950b interfaceC0950b) {
        this.f2607i = interfaceC0950b;
        v(2, null);
    }

    @Override // n0.InterfaceC0939c
    public final void l(p0.InterfaceC0953e interfaceC0953e, java.util.Set set) {
        android.os.Bundle p2 = p();
        java.lang.String str = this.f2616r;
        int i2 = m0.g.f8054a;
        com.google.android.gms.common.api.Scope[] scopeArr = p0.C0952d.f8228o;
        android.os.Bundle bundle = new android.os.Bundle();
        int i3 = this.f2614p;
        m0.d[] dVarArr = p0.C0952d.f8229p;
        p0.C0952d c0952d = new p0.C0952d(6, i3, i2, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c0952d.f8233d = this.f2601c.getPackageName();
        c0952d.f8236g = p2;
        if (set != null) {
            c0952d.f8235f = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[0]);
        }
        if (i()) {
            c0952d.f8237h = new android.accounts.Account("<<default account>>", "com.google");
            if (interfaceC0953e != null) {
                c0952d.f8234e = ((p0.C0948C) interfaceC0953e).f8220a;
            }
        }
        c0952d.f8238i = f2598x;
        c0952d.f8239j = o();
        if (this instanceof x0.C1012b) {
            c0952d.f8242m = true;
        }
        try {
            synchronized (this.f2605g) {
                try {
                    p0.C0965q c0965q = this.f2606h;
                    if (c0965q != null) {
                        c0965q.a(new p0.BinderC0968t(this, this.f2619v.get()), c0952d);
                    } else {
                        android.util.Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (android.os.DeadObjectException e2) {
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            int i4 = this.f2619v.get();
            p0.HandlerC0967s handlerC0967s = this.f2603e;
            handlerC0967s.sendMessage(handlerC0967s.obtainMessage(6, i4, 3));
        } catch (android.os.RemoteException e3) {
            e = e3;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.f2619v.get();
            p0.C0970v c0970v = new p0.C0970v(this, 8, null, null);
            p0.HandlerC0967s handlerC0967s2 = this.f2603e;
            handlerC0967s2.sendMessage(handlerC0967s2.obtainMessage(1, i5, -1, c0970v));
        } catch (java.lang.SecurityException e4) {
            throw e4;
        } catch (java.lang.RuntimeException e5) {
            e = e5;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i52 = this.f2619v.get();
            p0.C0970v c0970v2 = new p0.C0970v(this, 8, null, null);
            p0.HandlerC0967s handlerC0967s22 = this.f2603e;
            handlerC0967s22.sendMessage(handlerC0967s22.obtainMessage(1, i52, -1, c0970v2));
        }
    }

    public abstract android.os.IInterface n(android.os.IBinder iBinder);

    public m0.d[] o() {
        return f2598x;
    }

    public android.os.Bundle p() {
        return new android.os.Bundle();
    }

    public final android.os.IInterface q() {
        android.os.IInterface iInterface;
        synchronized (this.f2604f) {
            try {
                if (this.f2611m == 5) {
                    throw new android.os.DeadObjectException();
                }
                if (!c()) {
                    throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f2608j;
                p0.AbstractC0966r.d(iInterface, "Client is connected but service is null");
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract java.lang.String r();

    public abstract java.lang.String s();

    public boolean t() {
        return m() >= 211700000;
    }

    public final void v(int i2, android.os.IInterface iInterface) {
        P0.A a2;
        if ((i2 == 4) != (iInterface != null)) {
            throw new java.lang.IllegalArgumentException();
        }
        synchronized (this.f2604f) {
            try {
                this.f2611m = i2;
                this.f2608j = iInterface;
                if (i2 == 1) {
                    p0.ServiceConnectionC0969u serviceConnectionC0969u = this.f2610l;
                    if (serviceConnectionC0969u != null) {
                        p0.C0947B c0947b = this.f2602d;
                        java.lang.String str = (java.lang.String) this.f2600b.f1312b;
                        p0.AbstractC0966r.c(str);
                        this.f2600b.getClass();
                        if (this.f2615q == null) {
                            this.f2601c.getClass();
                        }
                        c0947b.a(str, serviceConnectionC0969u, this.f2600b.f1311a);
                        this.f2610l = null;
                    }
                } else if (i2 == 2 || i2 == 3) {
                    p0.ServiceConnectionC0969u serviceConnectionC0969u2 = this.f2610l;
                    if (serviceConnectionC0969u2 != null && (a2 = this.f2600b) != null) {
                        android.util.Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((java.lang.String) a2.f1312b) + " on com.google.android.gms");
                        p0.C0947B c0947b2 = this.f2602d;
                        java.lang.String str2 = (java.lang.String) this.f2600b.f1312b;
                        p0.AbstractC0966r.c(str2);
                        this.f2600b.getClass();
                        if (this.f2615q == null) {
                            this.f2601c.getClass();
                        }
                        c0947b2.a(str2, serviceConnectionC0969u2, this.f2600b.f1311a);
                        this.f2619v.incrementAndGet();
                    }
                    p0.ServiceConnectionC0969u serviceConnectionC0969u3 = new p0.ServiceConnectionC0969u(this, this.f2619v.get());
                    this.f2610l = serviceConnectionC0969u3;
                    java.lang.String s2 = s();
                    boolean t = t();
                    this.f2600b = new P0.A(s2, t);
                    if (t && m() < 17895000) {
                        throw new java.lang.IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(java.lang.String.valueOf((java.lang.String) this.f2600b.f1312b)));
                    }
                    p0.C0947B c0947b3 = this.f2602d;
                    java.lang.String str3 = (java.lang.String) this.f2600b.f1312b;
                    p0.AbstractC0966r.c(str3);
                    this.f2600b.getClass();
                    java.lang.String str4 = this.f2615q;
                    if (str4 == null) {
                        str4 = this.f2601c.getClass().getName();
                    }
                    if (!c0947b3.b(new p0.C0973y(str3, this.f2600b.f1311a), serviceConnectionC0969u3, str4)) {
                        android.util.Log.w("GmsClient", "unable to connect to service: " + ((java.lang.String) this.f2600b.f1312b) + " on com.google.android.gms");
                        int i3 = this.f2619v.get();
                        p0.C0971w c0971w = new p0.C0971w(this, 16);
                        p0.HandlerC0967s handlerC0967s = this.f2603e;
                        handlerC0967s.sendMessage(handlerC0967s.obtainMessage(7, i3, -1, c0971w));
                    }
                } else if (i2 == 4) {
                    p0.AbstractC0966r.c(iInterface);
                    java.lang.System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
