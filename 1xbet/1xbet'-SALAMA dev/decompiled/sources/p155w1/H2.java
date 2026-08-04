package p155w1;

import A1.L0;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.internal.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class H2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static H2 f17402q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f17403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y f17404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N f17405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q f17406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Q f17407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1036t f17408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C f17409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1042v f17410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0973c0 f17411i;
    public final C0965a0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0993h0 f17412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Q f17413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final K f17414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0973c0 f17415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0973c0 f17416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Q f17417p;

    public H2() {
        P2 p5;
        N n2 = new N();
        this.f17405c = n2;
        Q q7 = new Q(0);
        L0 l7 = new L0(q7, 7);
        Context context = AbstractC0998i1.f17749c;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.LOCALE_CHANGED");
        if (context != null) {
            context.registerReceiver(l7, intentFilter);
        }
        this.f17406d = q7;
        Q q8 = new Q(1);
        L0 l8 = new L0(q8, 9);
        Context context2 = AbstractC0998i1.f17749c;
        IntentFilter intentFilter2 = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
        if (context2 != null) {
            context2.registerReceiver(l8, intentFilter2);
        }
        this.f17407e = q8;
        C1036t c1036t = new C1036t();
        O2 o7 = new O2();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(O2.f17491f);
        o7.f17497c = byteBufferAllocateDirect;
        byteBufferAllocateDirect.asCharBuffer().put(O2.f17489d);
        c1036t.f17865A = o7;
        c1036t.f17866B = false;
        synchronized (P2.class) {
            try {
                if (P2.f17512d == null) {
                    P2.f17512d = new P2(0, (byte) 0);
                }
                p5 = P2.f17512d;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (((WeakHashMap) p5.f17515c)) {
            ((WeakHashMap) p5.f17515c).put(c1036t, null);
        }
        this.f17408f = c1036t;
        K k7 = new K();
        B b7 = new B(k7, 1);
        k7.f17433D = b7;
        k7.f17430A = n2;
        n2.i(b7);
        this.f17414m = k7;
        C0973c0 c0973c0 = new C0973c0(2);
        B b8 = new B(c0973c0, 10);
        c0973c0.f17662B = new K2(1, 1);
        n2.i(b8);
        this.f17411i = c0973c0;
        C c3 = new C();
        c3.f17303A = null;
        c3.f17307E = new AtomicBoolean(false);
        B b9 = new B(c3, 0);
        c3.f17304B = new F0(19);
        c3.f17305C = new w(21);
        c3.f17306D = new C1048x();
        G g3 = new G();
        g3.f17387a = new HashMap();
        c3.f17303A = g3;
        c0973c0.i(b9);
        this.f17409g = c3;
        T t7 = new T();
        t7.f17538A = true;
        t7.f17539B = false;
        t7.f17540C = false;
        c0973c0.i(new B(t7, 2));
        this.f17403a = t7;
        C1042v c1042v = new C1042v();
        c1042v.f17891C = false;
        c1042v.f17892D = false;
        C1039u c1039u = new C1039u(c1042v, 0);
        c1042v.f17894F = c1039u;
        C1039u c1039u2 = new C1039u(c1042v, 1);
        c1042v.f17895G = k7;
        k7.i(c1039u);
        c0973c0.i(c1039u2);
        this.f17410h = c1042v;
        C0965a0 c0965a0 = new C0965a0();
        c0965a0.f17642B = false;
        c0973c0.i(new B(c0965a0, 4));
        this.j = c0965a0;
        Y y4 = new Y();
        y4.f17607C = false;
        y4.f17609E = null;
        y4.f17610F = null;
        y4.f17611G = null;
        y4.f17612H = null;
        y4.f17613I = null;
        y4.f17614J = null;
        y4.f17615K = -1;
        B b10 = new B(y4, 3);
        if (AbstractC0997i0.l("android.permission.ACCESS_NETWORK_STATE")) {
            synchronized (y4) {
                try {
                    if (!y4.f17605A) {
                        y4.f17606B = Y.l();
                        y4.f17608D = Y.n();
                        if (Build.VERSION.SDK_INT >= 29) {
                            y4.d(new W(y4, 0));
                        } else {
                            Context context3 = AbstractC0998i1.f17749c;
                            IntentFilter intentFilter3 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                            if (y4.f17616L == null) {
                                y4.f17616L = new L0(y4, 8);
                            }
                            context3.registerReceiver(y4.f17616L, intentFilter3);
                        }
                        y4.m();
                        y4.f17605A = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c0973c0.i(b10);
        } else {
            y4.f17606B = true;
            y4.f17608D = 1;
        }
        this.f17404b = y4;
        C0993h0 c0993h0 = new C0993h0();
        c0993h0.f17728A = new AtomicLong(0L);
        c0993h0.f17729B = new AtomicLong(0L);
        c0993h0.f17730C = new AtomicBoolean(true);
        B b11 = new B(c0993h0, 5);
        c0993h0.f17733F = new ArrayList();
        c0973c0.i(b11);
        c0993h0.d(new C0981e0(c0993h0, 0));
        this.f17412k = c0993h0;
        this.f17413l = new Q(3);
        C0973c0 c0973c1 = new C0973c0(1);
        C1005k0 c1005k0 = new C1005k0(c0973c1, 0);
        C1005k0 c1005k1 = new C1005k0(c0973c1, 1);
        c0993h0.i(c1005k0);
        k7.i(c1005k1);
        this.f17415n = c0973c1;
        C0973c0 c0973c2 = new C0973c0(0);
        c0973c2.f17662B = new HashMap();
        this.f17416o = c0973c2;
        this.f17417p = new Q(2);
        this.f17405c.getClass();
        this.f17406d.getClass();
        this.f17407e.getClass();
        this.f17408f.getClass();
        K k8 = this.f17414m;
        k8.getClass();
        k8.d(new J(k8));
        c3.d(new C1054z(c3, 0));
        c3.d(new C1054z(c3, 1));
    }

    public static synchronized H2 a() {
        try {
            if (f17402q == null) {
                f17402q = new H2();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17402q;
    }
}
