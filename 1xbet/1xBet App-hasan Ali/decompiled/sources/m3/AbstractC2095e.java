package m3;

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
import com.google.android.gms.internal.ads.D5;
import e2.C1930k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import v3.C2536b;

/* renamed from: m3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2095e {

    /* renamed from: x, reason: collision with root package name */
    public static final j3.d[] f18022x = new j3.d[0];

    /* renamed from: b, reason: collision with root package name */
    public R1.i f18024b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f18025c;

    /* renamed from: d, reason: collision with root package name */
    public final F f18026d;

    /* renamed from: e, reason: collision with root package name */
    public final j3.f f18027e;
    public final w f;
    public u i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC2094d f18030j;

    /* renamed from: k, reason: collision with root package name */
    public IInterface f18031k;

    /* renamed from: m, reason: collision with root package name */
    public y f18033m;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC2092b f18035o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2093c f18036p;

    /* renamed from: q, reason: collision with root package name */
    public final int f18037q;

    /* renamed from: r, reason: collision with root package name */
    public final String f18038r;

    /* renamed from: s, reason: collision with root package name */
    public volatile String f18039s;

    /* renamed from: a, reason: collision with root package name */
    public volatile String f18023a = null;

    /* renamed from: g, reason: collision with root package name */
    public final Object f18028g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final Object f18029h = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f18032l = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public int f18034n = 1;

    /* renamed from: t, reason: collision with root package name */
    public j3.b f18040t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18041u = false;

    /* renamed from: v, reason: collision with root package name */
    public volatile B f18042v = null;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicInteger f18043w = new AtomicInteger(0);

    public AbstractC2095e(Context context, Looper looper, F f, j3.f fVar, int i, InterfaceC2092b interfaceC2092b, InterfaceC2093c interfaceC2093c, String str) {
        v.f("Context must not be null", context);
        this.f18025c = context;
        v.f("Looper must not be null", looper);
        v.f("Supervisor must not be null", f);
        this.f18026d = f;
        v.f("API availability must not be null", fVar);
        this.f18027e = fVar;
        this.f = new w(this, looper);
        this.f18037q = i;
        this.f18035o = interfaceC2092b;
        this.f18036p = interfaceC2093c;
        this.f18038r = str;
    }

    public static /* bridge */ /* synthetic */ void x(AbstractC2095e abstractC2095e) {
        int i;
        int i5;
        synchronized (abstractC2095e.f18028g) {
            i = abstractC2095e.f18034n;
        }
        if (i == 3) {
            abstractC2095e.f18041u = true;
            i5 = 5;
        } else {
            i5 = 4;
        }
        w wVar = abstractC2095e.f;
        wVar.sendMessage(wVar.obtainMessage(i5, abstractC2095e.f18043w.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean y(AbstractC2095e abstractC2095e, int i, int i5, IInterface iInterface) {
        synchronized (abstractC2095e.f18028g) {
            try {
                if (abstractC2095e.f18034n != i) {
                    return false;
                }
                abstractC2095e.z(i5, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z3;
        synchronized (this.f18028g) {
            z3 = this.f18034n == 4;
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(i iVar, Set set) {
        Bundle r5 = r();
        String str = this.f18039s;
        int i = j3.f.f17513a;
        Scope[] scopeArr = C2097g.f18050y;
        Bundle bundle = new Bundle();
        int i5 = this.f18037q;
        j3.d[] dVarArr = C2097g.f18051z;
        C2097g c2097g = new C2097g(6, i5, i, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c2097g.f18055n = this.f18025c.getPackageName();
        c2097g.f18058q = r5;
        if (set != null) {
            c2097g.f18057p = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account p5 = p();
            if (p5 == null) {
                p5 = new Account("<<default account>>", "com.google");
            }
            c2097g.f18059r = p5;
            if (iVar != 0) {
                c2097g.f18056o = ((D5) iVar).f8165l;
            }
        }
        c2097g.f18060s = f18022x;
        c2097g.f18061t = q();
        if (this instanceof C2536b) {
            c2097g.f18064w = true;
        }
        try {
            synchronized (this.f18029h) {
                try {
                    u uVar = this.i;
                    if (uVar != null) {
                        uVar.L(new x(this, this.f18043w.get()), c2097g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i6 = this.f18043w.get();
            w wVar = this.f;
            wVar.sendMessage(wVar.obtainMessage(6, i6, 3));
        } catch (RemoteException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i7 = this.f18043w.get();
            z zVar = new z(this, 8, null, null);
            w wVar2 = this.f;
            wVar2.sendMessage(wVar2.obtainMessage(1, i7, -1, zVar));
        } catch (SecurityException e6) {
            throw e6;
        } catch (RuntimeException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i72 = this.f18043w.get();
            z zVar2 = new z(this, 8, null, null);
            w wVar22 = this.f;
            wVar22.sendMessage(wVar22.obtainMessage(1, i72, -1, zVar2));
        }
    }

    public final void c(InterfaceC2094d interfaceC2094d) {
        this.f18030j = interfaceC2094d;
        z(2, null);
    }

    public final void e(C1930k c1930k) {
        ((l3.m) c1930k.f16910l).f17818w.f17798w.post(new A0.C(14, c1930k));
    }

    public final void f(String str) {
        this.f18023a = str;
        l();
    }

    public int g() {
        return j3.f.f17513a;
    }

    public final boolean h() {
        boolean z3;
        synchronized (this.f18028g) {
            int i = this.f18034n;
            z3 = true;
            if (i != 2 && i != 3) {
                z3 = false;
            }
        }
        return z3;
    }

    public final j3.d[] i() {
        B b3 = this.f18042v;
        if (b3 == null) {
            return null;
        }
        return b3.f18000l;
    }

    public final void j() {
        if (!a() || this.f18024b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final String k() {
        return this.f18023a;
    }

    public final void l() {
        this.f18043w.incrementAndGet();
        synchronized (this.f18032l) {
            try {
                int size = this.f18032l.size();
                for (int i = 0; i < size; i++) {
                    ((s) this.f18032l.get(i)).c();
                }
                this.f18032l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f18029h) {
            this.i = null;
        }
        z(1, null);
    }

    public boolean m() {
        return false;
    }

    public final void n() {
        int c5 = this.f18027e.c(this.f18025c, g());
        if (c5 == 0) {
            c(new k(this));
            return;
        }
        z(1, null);
        this.f18030j = new k(this);
        int i = this.f18043w.get();
        w wVar = this.f;
        wVar.sendMessage(wVar.obtainMessage(3, i, c5, null));
    }

    public abstract IInterface o(IBinder iBinder);

    public Account p() {
        return null;
    }

    public j3.d[] q() {
        return f18022x;
    }

    public Bundle r() {
        return new Bundle();
    }

    public Set s() {
        return Collections.EMPTY_SET;
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.f18028g) {
            try {
                if (this.f18034n == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f18031k;
                v.f("Client is connected but service is null", iInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        return g() >= 211700000;
    }

    public final void z(int i, IInterface iInterface) {
        R1.i iVar;
        v.a((i == 4) == (iInterface != null));
        synchronized (this.f18028g) {
            try {
                this.f18034n = i;
                this.f18031k = iInterface;
                if (i == 1) {
                    y yVar = this.f18033m;
                    if (yVar != null) {
                        F f = this.f18026d;
                        String str = this.f18024b.f5158a;
                        v.e(str);
                        this.f18024b.getClass();
                        if (this.f18038r == null) {
                            this.f18025c.getClass();
                        }
                        f.c(str, yVar, this.f18024b.f5159b);
                        this.f18033m = null;
                    }
                } else if (i == 2 || i == 3) {
                    y yVar2 = this.f18033m;
                    if (yVar2 != null && (iVar = this.f18024b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + iVar.f5158a + " on com.google.android.gms");
                        F f5 = this.f18026d;
                        String str2 = this.f18024b.f5158a;
                        v.e(str2);
                        this.f18024b.getClass();
                        if (this.f18038r == null) {
                            this.f18025c.getClass();
                        }
                        f5.c(str2, yVar2, this.f18024b.f5159b);
                        this.f18043w.incrementAndGet();
                    }
                    y yVar3 = new y(this, this.f18043w.get());
                    this.f18033m = yVar3;
                    String v4 = v();
                    boolean w5 = w();
                    this.f18024b = new R1.i(v4, w5);
                    if (w5 && g() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f18024b.f5158a)));
                    }
                    F f6 = this.f18026d;
                    String str3 = this.f18024b.f5158a;
                    v.e(str3);
                    this.f18024b.getClass();
                    String str4 = this.f18038r;
                    if (str4 == null) {
                        str4 = this.f18025c.getClass().getName();
                    }
                    if (!f6.d(new C(str3, this.f18024b.f5159b), yVar3, str4, null)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f18024b.f5158a + " on com.google.android.gms");
                        int i5 = this.f18043w.get();
                        C2090A c2090a = new C2090A(this, 16);
                        w wVar = this.f;
                        wVar.sendMessage(wVar.obtainMessage(7, i5, -1, c2090a));
                    }
                } else if (i == 4) {
                    v.e(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
