package p146u2;

import Q1.e;
import android.os.Looper;
import android.os.SystemClock;
import androidx.appcompat.widget.b1;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p046g0.a;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class K implements L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f16728d = new e(-9223372036854775807L, 0, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f16729e = new e(-9223372036854775807L, 2, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f16730f = new e(-9223372036854775807L, 3, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f16731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public G f16732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f16733c;

    public K(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i7 = t.f17159a;
        this.f16731a = Executors.newSingleThreadExecutor(new a(strConcat, 1));
    }

    public final void a() {
        G g3 = this.f16732b;
        p151v2.a.i(g3);
        g3.a(false);
    }

    public final boolean b() {
        return this.f16733c != null;
    }

    @Override // p146u2.L
    public final void c() {
        IOException iOException;
        IOException iOException2 = this.f16733c;
        if (iOException2 != null) {
            throw iOException2;
        }
        G g3 = this.f16732b;
        if (g3 != null && (iOException = g3.f16723e) != null && g3.f16724f > g3.f16719a) {
            throw iOException;
        }
    }

    public final boolean d() {
        return this.f16732b != null;
    }

    public final void e(I i7) {
        G g3 = this.f16732b;
        if (g3 != null) {
            g3.a(true);
        }
        ExecutorService executorService = this.f16731a;
        if (i7 != null) {
            executorService.execute(new b1(i7, 15));
        }
        executorService.shutdown();
    }

    public final long f(H h6, F f7, int i7) {
        Looper looperMyLooper = Looper.myLooper();
        p151v2.a.i(looperMyLooper);
        this.f16733c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        G g3 = new G(this, looperMyLooper, h6, f7, i7, jElapsedRealtime);
        p151v2.a.h(this.f16732b == null);
        this.f16732b = g3;
        g3.f16723e = null;
        this.f16731a.execute(g3);
        return jElapsedRealtime;
    }
}
