package w1;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class H2 {

    /* renamed from: q, reason: collision with root package name */
    public static H2 f17396q;

    /* renamed from: a, reason: collision with root package name */
    public final T f17397a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f17398b;

    /* renamed from: c, reason: collision with root package name */
    public final N f17399c;

    /* renamed from: d, reason: collision with root package name */
    public final Q f17400d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f17401e;

    /* renamed from: f, reason: collision with root package name */
    public final C1745t f17402f;

    /* renamed from: g, reason: collision with root package name */
    public final C f17403g;

    /* renamed from: h, reason: collision with root package name */
    public final C1751v f17404h;

    /* renamed from: i, reason: collision with root package name */
    public final C1682c0 f17405i;
    public final C1674a0 j;

    /* renamed from: k, reason: collision with root package name */
    public final C1702h0 f17406k;

    /* renamed from: l, reason: collision with root package name */
    public final Q f17407l;

    /* renamed from: m, reason: collision with root package name */
    public final K f17408m;

    /* renamed from: n, reason: collision with root package name */
    public final C1682c0 f17409n;

    /* renamed from: o, reason: collision with root package name */
    public final C1682c0 f17410o;

    /* renamed from: p, reason: collision with root package name */
    public final Q f17411p;

    public H2() {
        P2 p22;
        N n2 = new N();
        this.f17399c = n2;
        Q q7 = new Q(0);
        A1.L0 l02 = new A1.L0(q7, 7);
        Context context = AbstractC1707i1.f17743c;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.LOCALE_CHANGED");
        if (context != null) {
            context.registerReceiver(l02, intentFilter);
        }
        this.f17400d = q7;
        Q q8 = new Q(1);
        A1.L0 l03 = new A1.L0(q8, 9);
        Context context2 = AbstractC1707i1.f17743c;
        IntentFilter intentFilter2 = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
        if (context2 != null) {
            context2.registerReceiver(l03, intentFilter2);
        }
        this.f17401e = q8;
        C1745t c1745t = new C1745t();
        O2 o22 = new O2();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(O2.f17485f);
        o22.f17491c = allocateDirect;
        allocateDirect.asCharBuffer().put(O2.f17483d);
        c1745t.f17859A = o22;
        c1745t.f17860B = false;
        synchronized (P2.class) {
            try {
                if (P2.f17506d == null) {
                    P2.f17506d = new P2(0, (byte) 0);
                }
                p22 = P2.f17506d;
            } finally {
            }
        }
        synchronized (((WeakHashMap) p22.f17509c)) {
            ((WeakHashMap) p22.f17509c).put(c1745t, null);
        }
        this.f17402f = c1745t;
        K k7 = new K();
        B b7 = new B(k7, 1);
        k7.f17427D = b7;
        k7.f17424A = n2;
        n2.i(b7);
        this.f17408m = k7;
        C1682c0 c1682c0 = new C1682c0(2);
        B b8 = new B(c1682c0, 10);
        c1682c0.f17656B = new K2(1, 1);
        n2.i(b8);
        this.f17405i = c1682c0;
        C c3 = new C();
        c3.f17297A = null;
        c3.f17301E = new AtomicBoolean(false);
        B b9 = new B(c3, 0);
        c3.f17298B = new F0(19);
        c3.f17299C = new com.google.android.gms.common.internal.w(21);
        c3.f17300D = new C1757x();
        G g3 = new G();
        g3.f17381a = new HashMap();
        c3.f17297A = g3;
        c1682c0.i(b9);
        this.f17403g = c3;
        T t7 = new T();
        t7.f17532A = true;
        t7.f17533B = false;
        t7.f17534C = false;
        c1682c0.i(new B(t7, 2));
        this.f17397a = t7;
        C1751v c1751v = new C1751v();
        c1751v.f17885C = false;
        c1751v.f17886D = false;
        C1748u c1748u = new C1748u(c1751v, 0);
        c1751v.f17888F = c1748u;
        C1748u c1748u2 = new C1748u(c1751v, 1);
        c1751v.f17889G = k7;
        k7.i(c1748u);
        c1682c0.i(c1748u2);
        this.f17404h = c1751v;
        C1674a0 c1674a0 = new C1674a0();
        c1674a0.f17636B = false;
        c1682c0.i(new B(c1674a0, 4));
        this.j = c1674a0;
        Y y4 = new Y();
        y4.f17601C = false;
        y4.f17603E = null;
        y4.f17604F = null;
        y4.f17605G = null;
        y4.f17606H = null;
        y4.f17607I = null;
        y4.f17608J = null;
        y4.f17609K = -1;
        B b10 = new B(y4, 3);
        if (AbstractC1706i0.l("android.permission.ACCESS_NETWORK_STATE")) {
            synchronized (y4) {
                try {
                    if (!y4.f17599A) {
                        y4.f17600B = Y.l();
                        y4.f17602D = Y.n();
                        if (Build.VERSION.SDK_INT >= 29) {
                            y4.d(new W(y4, 0));
                        } else {
                            Context context3 = AbstractC1707i1.f17743c;
                            IntentFilter intentFilter3 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                            if (y4.f17610L == null) {
                                y4.f17610L = new A1.L0(y4, 8);
                            }
                            context3.registerReceiver(y4.f17610L, intentFilter3);
                        }
                        y4.m();
                        y4.f17599A = true;
                    }
                } finally {
                }
            }
            c1682c0.i(b10);
        } else {
            y4.f17600B = true;
            y4.f17602D = 1;
        }
        this.f17398b = y4;
        C1702h0 c1702h0 = new C1702h0();
        c1702h0.f17722A = new AtomicLong(0L);
        c1702h0.f17723B = new AtomicLong(0L);
        c1702h0.f17724C = new AtomicBoolean(true);
        B b11 = new B(c1702h0, 5);
        c1702h0.f17727F = new ArrayList();
        c1682c0.i(b11);
        c1702h0.d(new C1690e0(c1702h0, 0));
        this.f17406k = c1702h0;
        this.f17407l = new Q(3);
        C1682c0 c1682c02 = new C1682c0(1);
        C1714k0 c1714k0 = new C1714k0(c1682c02, 0);
        C1714k0 c1714k02 = new C1714k0(c1682c02, 1);
        c1702h0.i(c1714k0);
        k7.i(c1714k02);
        this.f17409n = c1682c02;
        C1682c0 c1682c03 = new C1682c0(0);
        c1682c03.f17656B = new HashMap();
        this.f17410o = c1682c03;
        this.f17411p = new Q(2);
        this.f17399c.getClass();
        this.f17400d.getClass();
        this.f17401e.getClass();
        this.f17402f.getClass();
        K k8 = this.f17408m;
        k8.getClass();
        k8.d(new J(k8));
        c3.d(new C1763z(c3, 0));
        c3.d(new C1763z(c3, 1));
    }

    public static synchronized H2 a() {
        H2 h22;
        synchronized (H2.class) {
            try {
                if (f17396q == null) {
                    f17396q = new H2();
                }
                h22 = f17396q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h22;
    }
}
