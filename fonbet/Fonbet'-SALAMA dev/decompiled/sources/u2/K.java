package u2;

import android.os.Looper;
import android.os.SystemClock;
import androidx.appcompat.widget.b1;
import g0.ThreadFactoryC1119a;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class K implements L {

    /* renamed from: d, reason: collision with root package name */
    public static final Q1.e f16722d = new Q1.e(-9223372036854775807L, 0, false);

    /* renamed from: e, reason: collision with root package name */
    public static final Q1.e f16723e = new Q1.e(-9223372036854775807L, 2, false);

    /* renamed from: f, reason: collision with root package name */
    public static final Q1.e f16724f = new Q1.e(-9223372036854775807L, 3, false);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f16725a;

    /* renamed from: b, reason: collision with root package name */
    public G f16726b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f16727c;

    public K(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i7 = v2.t.f17153a;
        this.f16725a = Executors.newSingleThreadExecutor(new ThreadFactoryC1119a(concat, 1));
    }

    public final void a() {
        G g3 = this.f16726b;
        AbstractC1664a.i(g3);
        g3.a(false);
    }

    public final boolean b() {
        return this.f16727c != null;
    }

    @Override // u2.L
    public final void c() {
        IOException iOException;
        IOException iOException2 = this.f16727c;
        if (iOException2 != null) {
            throw iOException2;
        }
        G g3 = this.f16726b;
        if (g3 != null && (iOException = g3.f16717e) != null && g3.f16718f > g3.f16713a) {
            throw iOException;
        }
    }

    public final boolean d() {
        return this.f16726b != null;
    }

    public final void e(I i7) {
        G g3 = this.f16726b;
        if (g3 != null) {
            g3.a(true);
        }
        ExecutorService executorService = this.f16725a;
        if (i7 != null) {
            executorService.execute(new b1(i7, 15));
        }
        executorService.shutdown();
    }

    public final long f(H h6, F f7, int i7) {
        Looper myLooper = Looper.myLooper();
        AbstractC1664a.i(myLooper);
        this.f16727c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        G g3 = new G(this, myLooper, h6, f7, i7, elapsedRealtime);
        AbstractC1664a.h(this.f16726b == null);
        this.f16726b = g3;
        g3.f16717e = null;
        this.f16725a.execute(g3);
        return elapsedRealtime;
    }
}
