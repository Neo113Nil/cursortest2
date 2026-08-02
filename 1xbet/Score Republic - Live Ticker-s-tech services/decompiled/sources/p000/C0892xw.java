package p000;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: renamed from: xw */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0892xw {

    /* JADX INFO: renamed from: h */
    public static final boolean f9093h = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a */
    public final jg0 f9094a;

    /* JADX INFO: renamed from: b */
    public final wa0 f9095b;

    /* JADX INFO: renamed from: c */
    public final sk0 f9096c;

    /* JADX INFO: renamed from: d */
    public final C0547ok f9097d;

    /* JADX INFO: renamed from: e */
    public final C0272h3 f9098e;

    /* JADX INFO: renamed from: f */
    public final C0163e6 f9099f;

    /* JADX INFO: renamed from: g */
    public final qd0 f9100g;

    public C0892xw(sk0 sk0Var, nu1 nu1Var, w80 w80Var, w80 w80Var2, w80 w80Var3, w80 w80Var4) {
        this.f9096c = sk0Var;
        p90 p90Var = new p90(nu1Var);
        qd0 qd0Var = new qd0();
        this.f9100g = qd0Var;
        synchronized (this) {
            synchronized (qd0Var) {
                qd0Var.f6473m = this;
            }
        }
        this.f9095b = new wa0(23);
        this.f9094a = new jg0(0);
        C0547ok c0547ok = new C0547ok();
        c0547ok.f5768g = wo1.m5393t(150, new b90(19, c0547ok));
        c0547ok.f5762a = w80Var;
        c0547ok.f5763b = w80Var2;
        c0547ok.f5764c = w80Var3;
        c0547ok.f5765d = w80Var4;
        c0547ok.f5766e = this;
        c0547ok.f5767f = this;
        this.f9097d = c0547ok;
        this.f9099f = new C0163e6(p90Var);
        this.f9098e = new C0272h3();
        sk0Var.f7135d = this;
    }

    /* JADX INFO: renamed from: c */
    public static void m5691c(String str, long j, C0117cx c0117cx) {
        Log.v("Engine", str + " in " + hk0.m2289a(j) + "ms, key: " + c0117cx);
    }

    /* JADX INFO: renamed from: f */
    public static void m5692f(v11 v11Var) {
        if (v11Var instanceof C0153dx) {
            ((C0153dx) v11Var).m1324b();
        } else {
            C0270h1.m2190f("Cannot release anything but an EngineResource");
        }
    }

    /* JADX INFO: renamed from: a */
    public final qd0 m5693a(q80 q80Var, Object obj, xg0 xg0Var, int i, int i2, Class cls, Class cls2, ex0 ex0Var, C0371jt c0371jt, C0910yd c0910yd, boolean z, boolean z2, uu0 uu0Var, boolean z3, boolean z4, h81 h81Var, iw1 iw1Var) {
        long jElapsedRealtimeNanos;
        if (f9093h) {
            int i3 = hk0.f3252b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f9095b.getClass();
        C0117cx c0117cx = new C0117cx(obj, xg0Var, i, i2, c0910yd, cls, cls2, uu0Var);
        synchronized (this) {
            try {
                C0153dx c0153dxM5694b = m5694b(c0117cx, z3, jElapsedRealtimeNanos);
                if (c0153dxM5694b == null) {
                    return m5697g(q80Var, obj, xg0Var, i, i2, cls, cls2, ex0Var, c0371jt, c0910yd, z, z2, uu0Var, z3, z4, h81Var, iw1Var, c0117cx, jElapsedRealtimeNanos);
                }
                h81Var.m2233g(c0153dxM5694b, 5);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final C0153dx m5694b(C0117cx c0117cx, boolean z, long j) {
        C0153dx c0153dx;
        Object obj;
        C0892xw c0892xw;
        C0117cx c0117cx2;
        C0153dx c0153dx2;
        if (z) {
            qd0 qd0Var = this.f9100g;
            synchronized (qd0Var) {
                C0899y2 c0899y2 = (C0899y2) ((HashMap) qd0Var.f6471k).get(c0117cx);
                if (c0899y2 == null) {
                    c0153dx = null;
                } else {
                    c0153dx = (C0153dx) c0899y2.get();
                    if (c0153dx == null) {
                        qd0Var.m4075j(c0899y2);
                    }
                }
            }
            if (c0153dx != null) {
                c0153dx.m1323a();
            }
            if (c0153dx != null) {
                if (f9093h) {
                    m5691c("Loaded resource from active resources", j, c0117cx);
                }
                return c0153dx;
            }
            sk0 sk0Var = this.f9096c;
            synchronized (sk0Var) {
                pk0 pk0Var = (pk0) sk0Var.f6515a.remove(c0117cx);
                if (pk0Var == null) {
                    obj = null;
                } else {
                    sk0Var.f6517c -= (long) pk0Var.f6185b;
                    obj = pk0Var.f6184a;
                }
            }
            v11 v11Var = (v11) obj;
            if (v11Var == null) {
                c0892xw = this;
                c0117cx2 = c0117cx;
                c0153dx2 = null;
            } else if (v11Var instanceof C0153dx) {
                c0153dx2 = (C0153dx) v11Var;
                c0892xw = this;
                c0117cx2 = c0117cx;
            } else {
                c0892xw = this;
                c0117cx2 = c0117cx;
                c0153dx2 = new C0153dx(v11Var, true, true, c0117cx2, c0892xw);
            }
            if (c0153dx2 != null) {
                c0153dx2.m1323a();
                c0892xw.f9100g.m4072c(c0117cx2, c0153dx2);
            }
            if (c0153dx2 != null) {
                if (f9093h) {
                    m5691c("Loaded resource from cache", j, c0117cx2);
                }
                return c0153dx2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m5695d(C0078bx c0078bx, C0117cx c0117cx, C0153dx c0153dx) {
        if (c0153dx != null) {
            try {
                if (c0153dx.f1861j) {
                    this.f9100g.m4072c(c0117cx, c0153dx);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jg0 jg0Var = this.f9094a;
        jg0Var.getClass();
        c0078bx.getClass();
        HashMap map = (HashMap) jg0Var.f3922k;
        if (c0078bx == map.get(c0117cx)) {
            map.remove(c0117cx);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5696e(xg0 xg0Var, C0153dx c0153dx) {
        qd0 qd0Var = this.f9100g;
        synchronized (qd0Var) {
            C0899y2 c0899y2 = (C0899y2) ((HashMap) qd0Var.f6471k).remove(xg0Var);
            if (c0899y2 != null) {
                c0899y2.f9134c = null;
                c0899y2.clear();
            }
        }
        if (c0153dx.f1861j) {
        } else {
            this.f9098e.m2204a(c0153dx, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final qd0 m5697g(q80 q80Var, Object obj, xg0 xg0Var, int i, int i2, Class cls, Class cls2, ex0 ex0Var, C0371jt c0371jt, Map map, boolean z, boolean z2, uu0 uu0Var, boolean z3, boolean z4, h81 h81Var, Executor executor, C0117cx c0117cx, long j) {
        w80 w80Var;
        C0078bx c0078bx = (C0078bx) ((HashMap) this.f9094a.f3922k).get(c0117cx);
        if (c0078bx != null) {
            c0078bx.m790a(h81Var, executor);
            if (f9093h) {
                m5691c("Added to existing load", j, c0117cx);
            }
            return new qd0(this, h81Var, c0078bx);
        }
        C0078bx c0078bx2 = (C0078bx) ((qd0) this.f9097d.f5768g).mo1367b();
        synchronized (c0078bx2) {
            c0078bx2.f1032t = c0117cx;
            c0078bx2.f1033u = z3;
            c0078bx2.f1034v = z4;
        }
        C0163e6 c0163e6 = this.f9099f;
        RunnableC0146dq runnableC0146dq = (RunnableC0146dq) ((qd0) c0163e6.f1966m).mo1367b();
        int i3 = c0163e6.f1964k;
        c0163e6.f1964k = i3 + 1;
        C0071bq c0071bq = runnableC0146dq.f1776j;
        p90 p90Var = runnableC0146dq.f1779m;
        c0071bq.f944c = q80Var;
        c0071bq.f945d = obj;
        c0071bq.f955n = xg0Var;
        c0071bq.f946e = i;
        c0071bq.f947f = i2;
        c0071bq.f957p = c0371jt;
        c0071bq.f948g = cls;
        c0071bq.f949h = p90Var;
        c0071bq.f952k = cls2;
        c0071bq.f956o = ex0Var;
        c0071bq.f950i = uu0Var;
        c0071bq.f951j = map;
        c0071bq.f958q = z;
        c0071bq.f959r = z2;
        runnableC0146dq.f1783q = q80Var;
        runnableC0146dq.f1784r = xg0Var;
        runnableC0146dq.f1785s = ex0Var;
        runnableC0146dq.f1786t = c0117cx;
        runnableC0146dq.f1787u = i;
        runnableC0146dq.f1788v = i2;
        runnableC0146dq.f1789w = c0371jt;
        runnableC0146dq.f1790x = uu0Var;
        runnableC0146dq.f1791y = c0078bx2;
        runnableC0146dq.f1792z = i3;
        runnableC0146dq.f1774O = 1;
        runnableC0146dq.f1761B = obj;
        runnableC0146dq.f1762C = q80Var.f6411g;
        runnableC0146dq.f1763D = (Supplier) uu0Var.m4955c(RunnableC0146dq.f1759Q);
        jg0 jg0Var = this.f9094a;
        jg0Var.getClass();
        ((HashMap) jg0Var.f3922k).put(c0117cx, c0078bx2);
        c0078bx2.m790a(h81Var, executor);
        synchronized (c0078bx2) {
            c0078bx2.f1020C = runnableC0146dq;
            int iM1292h = runnableC0146dq.m1292h(1);
            if (iM1292h == 2 || iM1292h == 3) {
                w80Var = c0078bx2.f1028p;
            } else {
                w80Var = c0078bx2.f1034v ? c0078bx2.f1030r : c0078bx2.f1029q;
            }
            w80Var.execute(runnableC0146dq);
        }
        if (f9093h) {
            m5691c("Started new load", j, c0117cx);
        }
        return new qd0(this, h81Var, c0078bx2);
    }
}
