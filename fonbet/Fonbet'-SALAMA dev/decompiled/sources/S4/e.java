package S4;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import d4.InterfaceC0965b;
import f4.InterfaceC1090b;
import java.util.Random;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final Random f6331f = new Random();

    /* renamed from: g, reason: collision with root package name */
    public static final M4.e f6332g = new M4.e();

    /* renamed from: h, reason: collision with root package name */
    public static final m3.b f6333h = m3.b.f15248a;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6334a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1090b f6335b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0965b f6336c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6337d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f6338e;

    public e(Context context, InterfaceC1090b interfaceC1090b, InterfaceC0965b interfaceC0965b, long j) {
        this.f6334a = context;
        this.f6335b = interfaceC1090b;
        this.f6336c = interfaceC0965b;
        this.f6337d = j;
    }

    public static boolean a(int i7) {
        return (i7 >= 500 && i7 < 600) || i7 == -2 || i7 == 429 || i7 == 408;
    }

    public final void b(T4.c cVar, boolean z4) {
        f6333h.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + this.f6337d;
        if (z4) {
            cVar.n(this.f6334a, Q0.a.B(this.f6335b), Q0.a.A(this.f6336c));
        } else {
            cVar.p(Q0.a.B(this.f6335b), Q0.a.A(this.f6336c));
        }
        int i7 = 1000;
        while (true) {
            f6333h.getClass();
            if (SystemClock.elapsedRealtime() + i7 > elapsedRealtime || cVar.l() || !a(cVar.f6357e)) {
                return;
            }
            try {
                M4.e eVar = f6332g;
                int nextInt = f6331f.nextInt(250) + i7;
                eVar.getClass();
                Thread.sleep(nextInt);
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
