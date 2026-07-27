package com.google.android.gms.common.internal;

import A0.h;
import I1.x;
import J1.i;
import P0.b;
import P0.d;
import P0.e;
import P0.f;
import Q0.c;
import R0.l;
import S0.B;
import S0.C;
import S0.InterfaceC0059b;
import S0.g;
import S0.o;
import S0.q;
import S0.r;
import S0.s;
import S0.t;
import S0.u;
import S0.v;
import S0.w;
import S0.y;
import a1.C0090b;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class a implements c {

    /* renamed from: x, reason: collision with root package name */
    public static final d[] f2571x = new d[0];

    /* renamed from: a, reason: collision with root package name */
    public volatile String f2572a;

    /* renamed from: b, reason: collision with root package name */
    public x f2573b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2574c;

    /* renamed from: d, reason: collision with root package name */
    public final B f2575d;

    /* renamed from: e, reason: collision with root package name */
    public final s f2576e;
    public final Object f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2577g;

    /* renamed from: h, reason: collision with root package name */
    public q f2578h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0059b f2579i;

    /* renamed from: j, reason: collision with root package name */
    public IInterface f2580j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2581k;

    /* renamed from: l, reason: collision with root package name */
    public u f2582l;

    /* renamed from: m, reason: collision with root package name */
    public int f2583m;

    /* renamed from: n, reason: collision with root package name */
    public final g f2584n;

    /* renamed from: o, reason: collision with root package name */
    public final g f2585o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2586p;

    /* renamed from: q, reason: collision with root package name */
    public final String f2587q;

    /* renamed from: r, reason: collision with root package name */
    public volatile String f2588r;

    /* renamed from: s, reason: collision with root package name */
    public b f2589s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2590t;

    /* renamed from: u, reason: collision with root package name */
    public volatile S0.x f2591u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicInteger f2592v;

    /* renamed from: w, reason: collision with root package name */
    public final Set f2593w;

    public a(Context context, Looper looper, int i3, h hVar, Q0.g gVar, Q0.h hVar2) {
        synchronized (B.f1289g) {
            try {
                if (B.f1290h == null) {
                    B.f1290h = new B(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        B b3 = B.f1290h;
        Object obj = e.f1131c;
        r.c(gVar);
        r.c(hVar2);
        g gVar2 = new g(gVar);
        g gVar3 = new g(hVar2);
        String str = (String) hVar.f;
        this.f2572a = null;
        this.f = new Object();
        this.f2577g = new Object();
        this.f2581k = new ArrayList();
        this.f2583m = 1;
        this.f2589s = null;
        this.f2590t = false;
        this.f2591u = null;
        this.f2592v = new AtomicInteger(0);
        r.d(context, "Context must not be null");
        this.f2574c = context;
        r.d(looper, "Looper must not be null");
        r.d(b3, "Supervisor must not be null");
        this.f2575d = b3;
        this.f2576e = new s(this, looper);
        this.f2586p = i3;
        this.f2584n = gVar2;
        this.f2585o = gVar3;
        this.f2587q = str;
        Set set = (Set) hVar.f57e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2593w = set;
    }

    public static /* bridge */ /* synthetic */ boolean v(a aVar, int i3, int i4, IInterface iInterface) {
        synchronized (aVar.f) {
            try {
                if (aVar.f2583m != i3) {
                    return false;
                }
                aVar.w(i4, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q0.c
    public final boolean a() {
        boolean z3;
        synchronized (this.f) {
            z3 = this.f2583m == 4;
        }
        return z3;
    }

    @Override // Q0.c
    public final Set b() {
        return j() ? this.f2593w : Collections.EMPTY_SET;
    }

    @Override // Q0.c
    public final void c(String str) {
        this.f2572a = str;
        i();
    }

    @Override // Q0.c
    public final boolean e() {
        boolean z3;
        synchronized (this.f) {
            int i3 = this.f2583m;
            z3 = true;
            if (i3 != 2 && i3 != 3) {
                z3 = false;
            }
        }
        return z3;
    }

    @Override // Q0.c
    public final d[] f() {
        S0.x xVar = this.f2591u;
        if (xVar == null) {
            return null;
        }
        return xVar.f1370b;
    }

    @Override // Q0.c
    public final void g() {
        if (!a() || this.f2573b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // Q0.c
    public final String h() {
        return this.f2572a;
    }

    @Override // Q0.c
    public void i() {
        this.f2592v.incrementAndGet();
        synchronized (this.f2581k) {
            try {
                int size = this.f2581k.size();
                for (int i3 = 0; i3 < size; i3++) {
                    o oVar = (o) this.f2581k.get(i3);
                    synchronized (oVar) {
                        oVar.f1352a = null;
                    }
                }
                this.f2581k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f2577g) {
            this.f2578h = null;
        }
        w(1, null);
    }

    @Override // Q0.c
    public boolean j() {
        return false;
    }

    @Override // Q0.c
    public final void k(InterfaceC0059b interfaceC0059b) {
        this.f2579i = interfaceC0059b;
        w(2, null);
    }

    @Override // Q0.c
    public final void l(S0.e eVar, Set set) {
        Bundle p3 = p();
        String str = this.f2588r;
        int i3 = f.f1133a;
        Scope[] scopeArr = S0.d.f1304o;
        Bundle bundle = new Bundle();
        int i4 = this.f2586p;
        d[] dVarArr = S0.d.f1305p;
        S0.d dVar = new S0.d(6, i4, i3, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        dVar.f1309d = this.f2574c.getPackageName();
        dVar.f1311g = p3;
        if (set != null) {
            dVar.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (j()) {
            dVar.f1312h = new Account("<<default account>>", "com.google");
            if (eVar != null) {
                dVar.f1310e = ((C) eVar).f1297a;
            }
        }
        dVar.f1313i = f2571x;
        dVar.f1314j = o();
        if (u()) {
            dVar.f1317m = true;
        }
        try {
            synchronized (this.f2577g) {
                try {
                    q qVar = this.f2578h;
                    if (qVar != null) {
                        qVar.a(new t(this, this.f2592v.get()), dVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i5 = this.f2592v.get();
            s sVar = this.f2576e;
            sVar.sendMessage(sVar.obtainMessage(6, i5, 3));
        } catch (RemoteException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i6 = this.f2592v.get();
            v vVar = new v(this, 8, null, null);
            s sVar2 = this.f2576e;
            sVar2.sendMessage(sVar2.obtainMessage(1, i6, -1, vVar));
        } catch (SecurityException e5) {
            throw e5;
        } catch (RuntimeException e6) {
            e = e6;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i62 = this.f2592v.get();
            v vVar2 = new v(this, 8, null, null);
            s sVar22 = this.f2576e;
            sVar22.sendMessage(sVar22.obtainMessage(1, i62, -1, vVar2));
        }
    }

    @Override // Q0.c
    public final void m(i iVar) {
        ((l) iVar.f729b).f1219o.f1203m.post(new A.b(5, iVar));
    }

    public abstract IInterface n(IBinder iBinder);

    public d[] o() {
        return f2571x;
    }

    public Bundle p() {
        return new Bundle();
    }

    public final IInterface q() {
        IInterface iInterface;
        synchronized (this.f) {
            try {
                if (this.f2583m == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f2580j;
                r.d(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String r();

    public abstract String s();

    public boolean t() {
        return d() >= 211700000;
    }

    public boolean u() {
        return this instanceof C0090b;
    }

    public final void w(int i3, IInterface iInterface) {
        x xVar;
        if ((i3 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f) {
            try {
                this.f2583m = i3;
                this.f2580j = iInterface;
                if (i3 == 1) {
                    u uVar = this.f2582l;
                    if (uVar != null) {
                        B b3 = this.f2575d;
                        String str = (String) this.f2573b.f683b;
                        r.c(str);
                        this.f2573b.getClass();
                        if (this.f2587q == null) {
                            this.f2574c.getClass();
                        }
                        b3.a(str, uVar, this.f2573b.f682a);
                        this.f2582l = null;
                    }
                } else if (i3 == 2 || i3 == 3) {
                    u uVar2 = this.f2582l;
                    if (uVar2 != null && (xVar = this.f2573b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) xVar.f683b) + " on com.google.android.gms");
                        B b4 = this.f2575d;
                        String str2 = (String) this.f2573b.f683b;
                        r.c(str2);
                        this.f2573b.getClass();
                        if (this.f2587q == null) {
                            this.f2574c.getClass();
                        }
                        b4.a(str2, uVar2, this.f2573b.f682a);
                        this.f2592v.incrementAndGet();
                    }
                    u uVar3 = new u(this, this.f2592v.get());
                    this.f2582l = uVar3;
                    String s3 = s();
                    boolean t3 = t();
                    x xVar2 = new x();
                    xVar2.f683b = s3;
                    xVar2.f682a = t3;
                    this.f2573b = xVar2;
                    if (t3 && d() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f2573b.f683b)));
                    }
                    B b5 = this.f2575d;
                    String str3 = (String) this.f2573b.f683b;
                    r.c(str3);
                    this.f2573b.getClass();
                    String str4 = this.f2587q;
                    if (str4 == null) {
                        str4 = this.f2574c.getClass().getName();
                    }
                    if (!b5.b(new y(str3, this.f2573b.f682a), uVar3, str4)) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.f2573b.f683b) + " on com.google.android.gms");
                        int i4 = this.f2592v.get();
                        w wVar = new w(this, 16);
                        s sVar = this.f2576e;
                        sVar.sendMessage(sVar.obtainMessage(7, i4, -1, wVar));
                    }
                } else if (i3 == 4) {
                    r.c(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
