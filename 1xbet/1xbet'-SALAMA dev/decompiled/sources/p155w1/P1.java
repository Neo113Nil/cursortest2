package p155w1;

import android.os.SystemClock;
import com.flurry.android.marketing.core.b;
import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import p136t.e;
import p145u1.c;

/* JADX INFO: loaded from: classes.dex */
public final class P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f17502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f17503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f17504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Timer f17506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1037t0 f17507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17510i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17511k;

    public static void b(long j, long j3, String str) {
        HashMap map = new HashMap();
        map.put("fl.session.elapsed.start.time", String.valueOf(j));
        if (j3 != Long.MIN_VALUE) {
            map.put("fl.session.elapsed.end.time", String.valueOf(j3));
            map.put("fl.session.duration", String.valueOf(j3 - j));
        }
        map.put("fl.session.message", str);
    }

    public static boolean g(C0983e2 c0983e2) {
        return e.b(c0983e2.f17700c, 2) && e.b(c0983e2.f17704x, 1);
    }

    public final void a(int i7) {
        if (e.b(this.f17511k, i7)) {
            return;
        }
        L.p(this.f17511k);
        this.f17511k = i7;
        L.p(i7);
    }

    public final void c(C0983e2 c0983e2) {
        if (e.b(c0983e2.f17704x, 1) && this.f17508g == Long.MIN_VALUE) {
            if (this.f17502a.get(D2.SESSION_ID) == null) {
                this.f17508g = c0983e2.f17701d;
                this.f17509h = SystemClock.elapsedRealtime();
                this.j = L.e(c0983e2.f17700c) == 1 ? 2 : 0;
                if (this.f17508g > 0) {
                    b(this.f17509h, this.f17510i, "Generate Session Id");
                    i(w2.c(this.f17508g, this.j, this.f17509h, this.f17510i));
                }
                c cVar = this.f17504c;
                if (cVar != null) {
                    ((D1) cVar.f16597b).d(new b(this, true, 2));
                }
            }
        }
    }

    public final synchronized void d() {
        try {
            Timer timer = this.f17506e;
            if (timer != null) {
                timer.cancel();
                this.f17506e = null;
            }
            C1037t0 c1037t0 = this.f17507f;
            if (c1037t0 != null) {
                c1037t0.cancel();
                this.f17507f = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e(long j) {
        d();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f17510i = jElapsedRealtime;
        if (this.f17508g > 0) {
            b(this.f17509h, jElapsedRealtime, "Start Session Finalize Timer");
            i(w2.c(this.f17508g, this.j, this.f17509h, this.f17510i));
        }
        synchronized (this) {
            try {
                if (this.f17506e != null) {
                    d();
                }
                this.f17506e = new Timer("FlurrySessionTimer");
                C1037t0 c1037t0 = new C1037t0(this, 2);
                this.f17507f = c1037t0;
                this.f17506e.schedule(c1037t0, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(C2 c3) {
        c cVar = this.f17504c;
        if (cVar != null) {
            c3.b();
            ((D1) cVar.f16597b).l(c3);
        }
    }

    public final void h() {
        this.f17502a.put(D2.SESSION_ID, null);
        this.f17503b.set(false);
        this.f17508g = Long.MIN_VALUE;
        this.f17509h = Long.MIN_VALUE;
        this.f17510i = Long.MIN_VALUE;
        this.f17511k = 1;
        this.f17505d = false;
    }

    public final void i(C2 c3) {
        c cVar = this.f17504c;
        if (cVar != null) {
            c3.b();
            ((D1) cVar.f16597b).k(c3);
        }
    }

    public final void j() {
        if (this.f17508g <= 0) {
            return;
        }
        d();
        synchronized (AbstractC0997i0.class) {
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f17510i = jElapsedRealtime;
        long j = this.f17508g;
        if (j > 0) {
            f(w2.c(j, this.j, this.f17509h, jElapsedRealtime));
        }
        f(R1.d(4));
        c cVar = this.f17504c;
        if (cVar != null) {
            ((D1) cVar.f16597b).d(new b(this, false, 2));
        }
        h();
    }
}
