package p146u2;

import android.os.SystemClock;

/* JADX INFO: renamed from: u2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0959s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0960t f16828a;

    public final void a(int i7) {
        C0960t c0960t = this.f16828a;
        synchronized (c0960t) {
            int i8 = c0960t.f16844i;
            if (i8 == 0 || c0960t.f16840e) {
                if (i8 == i7) {
                    return;
                }
                c0960t.f16844i = i7;
                if (i7 != 1 && i7 != 0 && i7 != 8) {
                    c0960t.f16846l = c0960t.b(i7);
                    c0960t.f16839d.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c0960t.c(c0960t.f16841f > 0 ? (int) (jElapsedRealtime - c0960t.f16842g) : 0, c0960t.f16843h, c0960t.f16846l);
                    c0960t.f16842g = jElapsedRealtime;
                    c0960t.f16843h = 0L;
                    c0960t.f16845k = 0L;
                    c0960t.j = 0L;
                    S s7 = c0960t.f16838c;
                    s7.f16753b.clear();
                    s7.f16755d = -1;
                    s7.f16756e = 0;
                    s7.f16757f = 0;
                }
            }
        }
    }
}
