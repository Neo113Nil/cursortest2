package p000;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: dq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0146dq implements InterfaceC0588po, Runnable, Comparable, InterfaceC0079bz {

    /* JADX INFO: renamed from: Q */
    public static final ru0 f1759Q = new ru0("glide_thread_priority_override", null, ru0.f6969e);

    /* JADX INFO: renamed from: A */
    public long f1760A;

    /* JADX INFO: renamed from: B */
    public Object f1761B;

    /* JADX INFO: renamed from: C */
    public b90 f1762C;

    /* JADX INFO: renamed from: D */
    public Supplier f1763D;

    /* JADX INFO: renamed from: E */
    public Thread f1764E;

    /* JADX INFO: renamed from: F */
    public xg0 f1765F;

    /* JADX INFO: renamed from: G */
    public xg0 f1766G;

    /* JADX INFO: renamed from: H */
    public Object f1767H;

    /* JADX INFO: renamed from: I */
    public InterfaceC0551oo f1768I;

    /* JADX INFO: renamed from: J */
    public volatile InterfaceC0625qo f1769J;

    /* JADX INFO: renamed from: K */
    public volatile boolean f1770K;

    /* JADX INFO: renamed from: L */
    public volatile boolean f1771L;

    /* JADX INFO: renamed from: M */
    public boolean f1772M;

    /* JADX INFO: renamed from: N */
    public int f1773N;

    /* JADX INFO: renamed from: O */
    public int f1774O;

    /* JADX INFO: renamed from: P */
    public int f1775P;

    /* JADX INFO: renamed from: m */
    public final p90 f1779m;

    /* JADX INFO: renamed from: n */
    public final kw0 f1780n;

    /* JADX INFO: renamed from: q */
    public q80 f1783q;

    /* JADX INFO: renamed from: r */
    public xg0 f1784r;

    /* JADX INFO: renamed from: s */
    public ex0 f1785s;

    /* JADX INFO: renamed from: t */
    public C0117cx f1786t;

    /* JADX INFO: renamed from: u */
    public int f1787u;

    /* JADX INFO: renamed from: v */
    public int f1788v;

    /* JADX INFO: renamed from: w */
    public C0371jt f1789w;

    /* JADX INFO: renamed from: x */
    public uu0 f1790x;

    /* JADX INFO: renamed from: y */
    public C0078bx f1791y;

    /* JADX INFO: renamed from: z */
    public int f1792z;

    /* JADX INFO: renamed from: j */
    public final C0071bq f1776j = new C0071bq();

    /* JADX INFO: renamed from: k */
    public final ArrayList f1777k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ga1 f1778l = new ga1();

    /* JADX INFO: renamed from: o */
    public final qd0 f1781o = new qd0(12);

    /* JADX INFO: renamed from: p */
    public final C0110cq f1782p = new C0110cq();

    public RunnableC0146dq(p90 p90Var, qd0 qd0Var) {
        this.f1779m = p90Var;
        this.f1780n = qd0Var;
    }

    @Override // p000.InterfaceC0588po
    /* JADX INFO: renamed from: a */
    public final void mo902a(xg0 xg0Var, Exception exc, InterfaceC0551oo interfaceC0551oo, int i) {
        interfaceC0551oo.mo1072d();
        t80 t80Var = new t80("Fetching data failed", Collections.singletonList(exc));
        Class clsMo1071a = interfaceC0551oo.mo1071a();
        t80Var.f7345k = xg0Var;
        t80Var.f7346l = i;
        t80Var.f7347m = clsMo1071a;
        this.f1777k.add(t80Var);
        if (Thread.currentThread() == this.f1764E) {
            m1297m();
            return;
        }
        this.f1774O = 2;
        C0078bx c0078bx = this.f1791y;
        (c0078bx.f1034v ? c0078bx.f1030r : c0078bx.f1029q).execute(this);
    }

    @Override // p000.InterfaceC0079bz
    /* JADX INFO: renamed from: b */
    public final ga1 mo266b() {
        return this.f1778l;
    }

    @Override // p000.InterfaceC0588po
    /* JADX INFO: renamed from: c */
    public final void mo904c(xg0 xg0Var, Object obj, InterfaceC0551oo interfaceC0551oo, int i, xg0 xg0Var2) {
        this.f1765F = xg0Var;
        this.f1767H = obj;
        this.f1768I = interfaceC0551oo;
        this.f1775P = i;
        this.f1766G = xg0Var2;
        this.f1772M = xg0Var != this.f1776j.m740a().get(0);
        if (Thread.currentThread() == this.f1764E) {
            m1290f();
            return;
        }
        this.f1774O = 3;
        C0078bx c0078bx = this.f1791y;
        (c0078bx.f1034v ? c0078bx.f1030r : c0078bx.f1029q).execute(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        RunnableC0146dq runnableC0146dq = (RunnableC0146dq) obj;
        int iOrdinal = this.f1785s.ordinal() - runnableC0146dq.f1785s.ordinal();
        return iOrdinal == 0 ? this.f1792z - runnableC0146dq.f1792z : iOrdinal;
    }

    /* JADX INFO: renamed from: d */
    public final v11 m1288d(InterfaceC0551oo interfaceC0551oo, Object obj, int i) {
        if (obj == null) {
            interfaceC0551oo.mo1072d();
            return null;
        }
        try {
            int i2 = hk0.f3252b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            v11 v11VarM1289e = m1289e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                m1293i(jElapsedRealtimeNanos, "Decoded result " + v11VarM1289e, null);
            }
            return v11VarM1289e;
        } finally {
            interfaceC0551oo.mo1072d();
        }
    }

    /* JADX INFO: renamed from: e */
    public final v11 m1289e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        C0071bq c0071bq = this.f1776j;
        pj0 pj0VarM742c = c0071bq.m742c(cls);
        uu0 uu0Var = this.f1790x;
        boolean z = i == 4 || c0071bq.f959r;
        ru0 ru0Var = C0742tu.f7593i;
        Boolean bool = (Boolean) uu0Var.m4955c(ru0Var);
        if (bool == null || (bool.booleanValue() && !z)) {
            uu0Var = new uu0();
            C0910yd c0910yd = this.f1790x.f7909b;
            C0910yd c0910yd2 = uu0Var.f7909b;
            c0910yd2.mo5300g(c0910yd);
            c0910yd2.put(ru0Var, Boolean.valueOf(z));
        }
        uu0 uu0Var2 = uu0Var;
        InterfaceC0847wo interfaceC0847woM3820g = this.f1783q.m4041a().m3820g(obj);
        try {
            return pj0VarM742c.m3922a(this.f1787u, this.f1788v, new C0678s3(i, this), interfaceC0847woM3820g, uu0Var2);
        } finally {
            interfaceC0847woM3820g.mo610d();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1290f() {
        v11 v11VarM1288d;
        boolean zM1031a;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            m1293i(this.f1760A, "Retrieved data", "data: " + this.f1767H + ", cache key: " + this.f1765F + ", fetcher: " + this.f1768I);
        }
        ak0 ak0Var = null;
        if (((Map) this.f1762C.f793k).containsKey(o80.class) && (supplier = this.f1763D) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f1763D.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e) {
                this.f1763D = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
                }
            }
        }
        try {
            v11VarM1288d = m1288d(this.f1768I, this.f1767H, this.f1775P);
        } catch (t80 e2) {
            xg0 xg0Var = this.f1766G;
            int i = this.f1775P;
            e2.f7345k = xg0Var;
            e2.f7346l = i;
            e2.f7347m = null;
            this.f1777k.add(e2);
            v11VarM1288d = null;
        }
        if (v11VarM1288d == null) {
            m1297m();
            return;
        }
        int i2 = this.f1775P;
        if (v11VarM1288d instanceof sd0) {
            ((sd0) v11VarM1288d).mo901a();
        }
        int i3 = 1;
        if (((ak0) this.f1781o.f6473m) != null) {
            ak0Var = (ak0) ak0.f223n.mo1367b();
            ak0Var.f227m = false;
            ak0Var.f226l = true;
            ak0Var.f225k = v11VarM1288d;
            v11VarM1288d = ak0Var;
        }
        if (((Map) this.f1762C.f793k).containsKey(o80.class)) {
            m1296l();
        }
        m1299o();
        C0078bx c0078bx = this.f1791y;
        synchronized (c0078bx) {
            c0078bx.f1035w = v11VarM1288d;
            c0078bx.f1036x = i2;
        }
        synchronized (c0078bx) {
            try {
                c0078bx.f1023k.m2011a();
                if (c0078bx.f1021D) {
                    c0078bx.f1035w.mo269e();
                    c0078bx.m794f();
                } else {
                    if (c0078bx.f1022j.f653j.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (c0078bx.f1037y) {
                        throw new IllegalStateException("Already have resource");
                    }
                    nc1 nc1Var = c0078bx.f1026n;
                    v11 v11Var = c0078bx.f1035w;
                    boolean z = c0078bx.f1033u;
                    C0117cx c0117cx = c0078bx.f1032t;
                    C0892xw c0892xw = c0078bx.f1024l;
                    nc1Var.getClass();
                    c0078bx.f1019B = new C0153dx(v11Var, z, true, c0117cx, c0892xw);
                    c0078bx.f1037y = true;
                    C0041ax c0041ax = c0078bx.f1022j;
                    c0041ax.getClass();
                    ArrayList arrayList = new ArrayList(c0041ax.f653j);
                    c0078bx.m792d(arrayList.size() + 1);
                    c0078bx.f1027o.m5695d(c0078bx, c0078bx.f1032t, c0078bx.f1019B);
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        C0966zw c0966zw = (C0966zw) obj;
                        c0966zw.f9973b.execute(new RunnableC0929yw(c0078bx, c0966zw.f9972a, i3));
                    }
                    c0078bx.m791c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1773N = 5;
        try {
            qd0 qd0Var = this.f1781o;
            if (((ak0) qd0Var.f6473m) != null) {
                try {
                    this.f1779m.m3879a().mo2337c((xg0) qd0Var.f6471k, new qd0((b21) qd0Var.f6472l, (ak0) qd0Var.f6473m, this.f1790x, 11));
                    ((ak0) qd0Var.f6473m).m265a();
                } catch (Throwable th2) {
                    ((ak0) qd0Var.f6473m).m265a();
                    throw th2;
                }
            }
            if (ak0Var != null) {
                ak0Var.m265a();
            }
            C0110cq c0110cq = this.f1782p;
            synchronized (c0110cq) {
                c0110cq.f1419b = true;
                zM1031a = c0110cq.m1031a();
            }
            if (zM1031a) {
                m1295k();
            }
        } catch (Throwable th3) {
            if (ak0Var == null) {
                throw th3;
            }
            ak0Var.m265a();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0625qo m1291g() {
        int iM292o = AbstractC0024an.m292o(this.f1773N);
        C0071bq c0071bq = this.f1776j;
        if (iM292o == 1) {
            return new w11(c0071bq, this);
        }
        if (iM292o == 2) {
            return new C0366jo(c0071bq.m740a(), c0071bq, this);
        }
        if (iM292o == 3) {
            return new c91(c0071bq, this);
        }
        if (iM292o == 5) {
            return null;
        }
        C0270h1.m2191g("Unrecognized stage: ".concat(AbstractC0024an.m295r(this.f1773N)));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final int m1292h(int i) {
        int iM292o = AbstractC0024an.m292o(i);
        boolean z = false;
        if (iM292o == 0) {
            switch (this.f1789w.f4091a) {
                case 0:
                case 1:
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                return 2;
            }
            return m1292h(2);
        }
        if (iM292o != 1) {
            if (iM292o == 2) {
                return 4;
            }
            if (iM292o == 3 || iM292o == 5) {
                return 6;
            }
            C0270h1.m2190f("Unrecognized stage: ".concat(AbstractC0024an.m295r(i)));
            return 0;
        }
        switch (this.f1789w.f4091a) {
            case 0:
                break;
            case 1:
            default:
                z = true;
                break;
        }
        if (z) {
            return 3;
        }
        return m1292h(3);
    }

    /* JADX INFO: renamed from: i */
    public final void m1293i(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(hk0.m2289a(j));
        sb.append(", load key: ");
        sb.append(this.f1786t);
        sb.append(str2 != null ? ", ".concat(str2) : "");
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* JADX INFO: renamed from: j */
    public final void m1294j() {
        boolean zM1031a;
        if (((Map) this.f1762C.f793k).containsKey(o80.class)) {
            m1296l();
        }
        m1299o();
        t80 t80Var = new t80("Failed to load resource", new ArrayList(this.f1777k));
        C0078bx c0078bx = this.f1791y;
        synchronized (c0078bx) {
            c0078bx.f1038z = t80Var;
        }
        synchronized (c0078bx) {
            try {
                c0078bx.f1023k.m2011a();
                if (c0078bx.f1021D) {
                    c0078bx.m794f();
                } else {
                    if (c0078bx.f1022j.f653j.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (c0078bx.f1018A) {
                        throw new IllegalStateException("Already failed once");
                    }
                    c0078bx.f1018A = true;
                    C0117cx c0117cx = c0078bx.f1032t;
                    C0041ax c0041ax = c0078bx.f1022j;
                    c0041ax.getClass();
                    ArrayList arrayList = new ArrayList(c0041ax.f653j);
                    c0078bx.m792d(arrayList.size() + 1);
                    c0078bx.f1027o.m5695d(c0078bx, c0117cx, null);
                    int size = arrayList.size();
                    int i = 0;
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        C0966zw c0966zw = (C0966zw) obj;
                        c0966zw.f9973b.execute(new RunnableC0929yw(c0078bx, c0966zw.f9972a, i));
                    }
                    c0078bx.m791c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0110cq c0110cq = this.f1782p;
        synchronized (c0110cq) {
            c0110cq.f1420c = true;
            zM1031a = c0110cq.m1031a();
        }
        if (zM1031a) {
            m1295k();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1295k() {
        C0110cq c0110cq = this.f1782p;
        synchronized (c0110cq) {
            c0110cq.f1419b = false;
            c0110cq.f1418a = false;
            c0110cq.f1420c = false;
        }
        qd0 qd0Var = this.f1781o;
        qd0Var.f6471k = null;
        qd0Var.f6472l = null;
        qd0Var.f6473m = null;
        C0071bq c0071bq = this.f1776j;
        c0071bq.f944c = null;
        c0071bq.f945d = null;
        c0071bq.f955n = null;
        c0071bq.f948g = null;
        c0071bq.f952k = null;
        c0071bq.f950i = null;
        c0071bq.f956o = null;
        c0071bq.f951j = null;
        c0071bq.f957p = null;
        c0071bq.f942a.clear();
        c0071bq.f953l = false;
        c0071bq.f943b.clear();
        c0071bq.f954m = false;
        this.f1770K = false;
        this.f1783q = null;
        this.f1784r = null;
        this.f1790x = null;
        this.f1785s = null;
        this.f1786t = null;
        this.f1791y = null;
        this.f1773N = 0;
        this.f1769J = null;
        this.f1764E = null;
        this.f1765F = null;
        this.f1767H = null;
        this.f1775P = 0;
        this.f1768I = null;
        this.f1760A = 0L;
        this.f1771L = false;
        this.f1761B = null;
        this.f1777k.clear();
        this.f1780n.mo1366a(this);
    }

    /* JADX INFO: renamed from: l */
    public final void m1296l() {
        if (!((Map) this.f1762C.f793k).containsKey(o80.class)) {
            C0270h1.m2191g("OverrideGlideThreadPriority experiment is not enabled.");
            return;
        }
        Supplier supplier = this.f1763D;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e) {
            this.f1763D = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1297m() {
        this.f1764E = Thread.currentThread();
        int i = hk0.f3252b;
        this.f1760A = SystemClock.elapsedRealtimeNanos();
        boolean zMo903b = false;
        while (!this.f1771L && this.f1769J != null && !(zMo903b = this.f1769J.mo903b())) {
            this.f1773N = m1292h(this.f1773N);
            this.f1769J = m1291g();
            if (this.f1773N == 4) {
                this.f1774O = 2;
                C0078bx c0078bx = this.f1791y;
                (c0078bx.f1034v ? c0078bx.f1030r : c0078bx.f1029q).execute(this);
                return;
            }
        }
        if ((this.f1773N == 6 || this.f1771L) && !zMo903b) {
            m1294j();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1298n() {
        String str;
        int iM292o = AbstractC0024an.m292o(this.f1774O);
        if (iM292o == 0) {
            this.f1773N = m1292h(1);
            this.f1769J = m1291g();
            m1297m();
        } else {
            if (iM292o == 1) {
                m1297m();
                return;
            }
            if (iM292o == 2) {
                m1290f();
                return;
            }
            int i = this.f1774O;
            if (i == 1) {
                str = "INITIALIZE";
            } else if (i != 2) {
                str = i != 3 ? "null" : "DECODE_DATA";
            } else {
                str = "SWITCH_TO_SOURCE_SERVICE";
            }
            C0270h1.m2191g("Unrecognized run reason: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1299o() {
        Throwable th;
        this.f1778l.m2011a();
        if (!this.f1770K) {
            this.f1770K = true;
            return;
        }
        if (this.f1777k.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f1777k;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0551oo interfaceC0551oo = this.f1768I;
        try {
            try {
                if (this.f1771L) {
                    m1294j();
                    if (interfaceC0551oo != null) {
                        interfaceC0551oo.mo1072d();
                        return;
                    }
                    return;
                }
                m1298n();
                if (interfaceC0551oo != null) {
                    interfaceC0551oo.mo1072d();
                }
            } catch (Throwable th) {
                if (interfaceC0551oo != null) {
                    interfaceC0551oo.mo1072d();
                }
                throw th;
            }
        } catch (C0246ge e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f1771L + ", stage: " + AbstractC0024an.m295r(this.f1773N), th2);
            }
            if (this.f1773N != 5) {
                this.f1777k.add(th2);
                m1294j();
            }
            if (!this.f1771L) {
                throw th2;
            }
            throw th2;
        }
    }
}
