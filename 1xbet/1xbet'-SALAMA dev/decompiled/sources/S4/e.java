package S4;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import java.util.Random;
import p042f4.InterfaceC0893b;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Random f6331f = new Random();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final M4.e f6332g = new M4.e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p090m3.b f6333h = p090m3.b.f15254a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0893b f6335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p026d4.b f6336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f6338e;

    public e(Context context, InterfaceC0893b interfaceC0893b, p026d4.b bVar, long j) {
        this.f6334a = context;
        this.f6335b = interfaceC0893b;
        this.f6336c = bVar;
        this.f6337d = j;
    }

    public static boolean a(int i7) {
        return (i7 >= 500 && i7 < 600) || i7 == -2 || i7 == 429 || i7 == 408;
    }

    public final void b(T4.c cVar, boolean z4) {
        f6333h.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + this.f6337d;
        if (z4) {
            cVar.n(this.f6334a, Q0.a.B(this.f6335b), Q0.a.A(this.f6336c));
        } else {
            cVar.p(Q0.a.B(this.f6335b), Q0.a.A(this.f6336c));
        }
        int i7 = 1000;
        while (true) {
            f6333h.getClass();
            if (SystemClock.elapsedRealtime() + ((long) i7) > jElapsedRealtime || cVar.l() || !a(cVar.f6357e)) {
                return;
            }
            try {
                M4.e eVar = f6332g;
                int iNextInt = f6331f.nextInt(250) + i7;
                eVar.getClass();
                Thread.sleep(iNextInt);
                if (i7 < 30000) {
                    if (cVar.f6357e != -2) {
                        i7 *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i7 = 1000;
                    }
                }
                if (this.f6338e) {
                    return;
                }
                cVar.f6353a = null;
                cVar.f6357e = 0;
                if (z4) {
                    cVar.n(this.f6334a, Q0.a.B(this.f6335b), Q0.a.A(this.f6336c));
                } else {
                    cVar.p(Q0.a.B(this.f6335b), Q0.a.A(this.f6336c));
                }
            } catch (InterruptedException unused) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
