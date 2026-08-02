package y3;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class o implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final long f21262k;

    /* renamed from: l, reason: collision with root package name */
    public final long f21263l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f21264m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f21265n;

    public o(r rVar, boolean z3) {
        this.f21265n = rVar;
        rVar.f21271b.getClass();
        this.f21262k = System.currentTimeMillis();
        rVar.f21271b.getClass();
        this.f21263l = SystemClock.elapsedRealtime();
        this.f21264m = z3;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.f21265n;
        if (rVar.f) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e3) {
            rVar.a(e3, false, this.f21264m);
            b();
        }
    }

    public void b() {
    }
}
