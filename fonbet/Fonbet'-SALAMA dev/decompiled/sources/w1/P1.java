package w1;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class P1 {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f17496a;

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f17497b;

    /* renamed from: c, reason: collision with root package name */
    public u1.c f17498c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17499d;

    /* renamed from: e, reason: collision with root package name */
    public Timer f17500e;

    /* renamed from: f, reason: collision with root package name */
    public C1746t0 f17501f;

    /* renamed from: g, reason: collision with root package name */
    public long f17502g;

    /* renamed from: h, reason: collision with root package name */
    public long f17503h;

    /* renamed from: i, reason: collision with root package name */
    public long f17504i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f17505k;

    public static void b(long j, long j3, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("fl.session.elapsed.start.time", String.valueOf(j));
        if (j3 != Long.MIN_VALUE) {
            hashMap.put("fl.session.elapsed.end.time", String.valueOf(j3));
            hashMap.put("fl.session.duration", String.valueOf(j3 - j));
        }
        hashMap.put("fl.session.message", str);
    }

    public static boolean g(C1692e2 c1692e2) {
        return t.e.b(c1692e2.f17694c, 2) && t.e.b(c1692e2.f17698x, 1);
    }

    public final void a(int i7) {
        if (t.e.b(this.f17505k, i7)) {
            return;
        }
        L.p(this.f17505k);
        this.f17505k = i7;
        L.p(i7);
    }

    public final void c(C1692e2 c1692e2) {
        if (t.e.b(c1692e2.f17698x, 1) && this.f17502g == Long.MIN_VALUE) {
            if (this.f17496a.get(D2.SESSION_ID) == null) {
                this.f17502g = c1692e2.f17695d;
                this.f17503h = SystemClock.elapsedRealtime();
                this.j = L.e(c1692e2.f17694c) == 1 ? 2 : 0;
                if (this.f17502g > 0) {
                    b(this.f17503h, this.f17504i, "Generate Session Id");
                    i(w2.c(this.f17502g, this.j, this.f17503h, this.f17504i));
                }
                u1.c cVar = this.f17498c;
                if (cVar != null) {
                    ((D1) cVar.f16591b).d(new com.flurry.android.marketing.core.b(this, true, 2));
                }
            }
        }
    }

    public final synchronized void d() {
        try {
            Timer timer = this.f17500e;
            if (timer != null) {
                timer.cancel();
                this.f17500e = null;
            }
            C1746t0 c1746t0 = this.f17501f;
            if (c1746t0 != null) {
                c1746t0.cancel();
                this.f17501f = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e(long j) {
        d();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f17504i = elapsedRealtime;
        if (this.f17502g > 0) {
            b(this.f17503h, elapsedRealtime, "Start Session Finalize Timer");
            i(w2.c(this.f17502g, this.j, this.f17503h, this.f17504i));
        }
        synchronized (this) {
            try {
                if (this.f17500e != null) {
                    d();
                }
                this.f17500e = new Timer("FlurrySessionTimer");
                C1746t0 c1746t0 = new C1746t0(this, 2);
                this.f17501f = c1746t0;
                this.f17500e.schedule(c1746t0, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(C2 c22) {
        u1.c cVar = this.f17498c;
        if (cVar != null) {
            c22.b();
            ((D1) cVar.f16591b).l(c22);
        }
    }

    public final void h() {
        this.f17496a.put(D2.SESSION_ID, null);
        this.f17497b.set(false);
        this.f17502g = Long.MIN_VALUE;
        this.f17503h = Long.MIN_VALUE;
        this.f17504i = Long.MIN_VALUE;
        this.f17505k = 1;
        this.f17499d = false;
    }

    public final void i(C2 c22) {
        u1.c cVar = this.f17498c;
        if (cVar != null) {
            c22.b();
            ((D1) cVar.f16591b).k(c22);
        }
    }

    public final void j() {
        if (this.f17502g <= 0) {
            return;
        }
        d();
        synchronized (AbstractC1706i0.class) {
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f17504i = elapsedRealtime;
        long j = this.f17502g;
        if (j > 0) {
            f(w2.c(j, this.j, this.f17503h, elapsedRealtime));
        }
        f(R1.d(4));
        u1.c cVar = this.f17498c;
        if (cVar != null) {
            ((D1) cVar.f16591b).d(new com.flurry.android.marketing.core.b(this, false, 2));
        }
        h();
    }
}
