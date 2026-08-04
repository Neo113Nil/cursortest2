package A1;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0023i f76a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B0 f77b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p151v2.p f78c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f80e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f81f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f82g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f83h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f84i;

    public D0(B0 b7, AbstractC0023i abstractC0023i, R0 r7, int i7, p151v2.p pVar, Looper looper) {
        this.f77b = b7;
        this.f76a = abstractC0023i;
        this.f81f = looper;
        this.f78c = pVar;
    }

    public final synchronized void a(long j) {
        boolean z4;
        p151v2.a.h(this.f82g);
        p151v2.a.h(this.f81f.getThread() != Thread.currentThread());
        this.f78c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z4 = this.f84i;
            if (z4 || j <= 0) {
                break;
            }
            this.f78c.getClass();
            wait(j);
            this.f78c.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z4) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z4) {
        this.f83h = z4 | this.f83h;
        this.f84i = true;
        notifyAll();
    }

    public final void c() {
        p151v2.a.h(!this.f82g);
        this.f82g = true;
        U u4 = (U) this.f77b;
        synchronized (u4) {
            if (!u4.f252P && u4.f276z.isAlive()) {
                u4.f275y.a(14, this).b();
                return;
            }
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
