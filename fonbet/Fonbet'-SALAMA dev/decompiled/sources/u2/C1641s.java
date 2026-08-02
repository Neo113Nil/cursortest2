package u2;

import android.os.SystemClock;

/* renamed from: u2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1641s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1642t f16822a;

    public final void a(int i7) {
        C1642t c1642t = this.f16822a;
        synchronized (c1642t) {
            int i8 = c1642t.f16838i;
            if (i8 == 0 || c1642t.f16834e) {
                if (i8 == i7) {
                    return;
                }
                c1642t.f16838i = i7;
                if (i7 != 1 && i7 != 0 && i7 != 8) {
                    c1642t.f16840l = c1642t.b(i7);
                    c1642t.f16833d.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    c1642t.c(c1642t.f16835f > 0 ? (int) (elapsedRealtime - c1642t.f16836g) : 0, c1642t.f16837h, c1642t.f16840l);
                    c1642t.f16836g = elapsedRealtime;
                    c1642t.f16837h = 0L;
                    c1642t.f16839k = 0L;
                    c1642t.j = 0L;
                    S s7 = c1642t.f16832c;
                    s7.f16747b.clear();
                    s7.f16749d = -1;
                    s7.f16750e = 0;
                    s7.f16751f = 0;
                }
            }
        }
    }
}
