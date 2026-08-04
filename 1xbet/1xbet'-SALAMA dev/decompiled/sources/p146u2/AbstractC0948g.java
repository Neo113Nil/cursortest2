package p146u2;

import E3.L;
import android.os.SystemClock;
import java.util.ArrayList;
import p151v2.a;
import p151v2.t;

/* JADX INFO: renamed from: u2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0948g implements InterfaceC0954m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16786b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0958q f16788d;

    public AbstractC0948g(boolean z4) {
        this.f16785a = z4;
    }

    public final void b(int i7) {
        C0958q c0958q = this.f16788d;
        int i8 = t.f17159a;
        for (int i9 = 0; i9 < this.f16787c; i9++) {
            U u4 = (U) this.f16786b.get(i9);
            boolean z4 = this.f16785a;
            C0960t c0960t = (C0960t) u4;
            synchronized (c0960t) {
                L l7 = C0960t.f16829n;
                if (z4 && (c0958q.f16821h & 8) != 8) {
                    c0960t.f16843h += (long) i7;
                }
            }
        }
    }

    public final void e() {
        C0958q c0958q = this.f16788d;
        int i7 = t.f17159a;
        for (int i8 = 0; i8 < this.f16787c; i8++) {
            U u4 = (U) this.f16786b.get(i8);
            boolean z4 = this.f16785a;
            C0960t c0960t = (C0960t) u4;
            synchronized (c0960t) {
                try {
                    L l7 = C0960t.f16829n;
                    if (z4 && (c0958q.f16821h & 8) != 8) {
                        a.h(c0960t.f16841f > 0);
                        c0960t.f16839d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i9 = (int) (jElapsedRealtime - c0960t.f16842g);
                        c0960t.j += (long) i9;
                        long j = c0960t.f16845k;
                        long j3 = c0960t.f16843h;
                        c0960t.f16845k = j + j3;
                        if (i9 > 0) {
                            c0960t.f16838c.a((j3 * 8000.0f) / i9, (int) Math.sqrt(j3));
                            if (c0960t.j >= 2000 || c0960t.f16845k >= 524288) {
                                c0960t.f16846l = (long) c0960t.f16838c.b();
                            }
                            c0960t.c(i9, c0960t.f16843h, c0960t.f16846l);
                            c0960t.f16842g = jElapsedRealtime;
                            c0960t.f16843h = 0L;
                        }
                        c0960t.f16841f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f16788d = null;
    }

    public final void f() {
        for (int i7 = 0; i7 < this.f16787c; i7++) {
            ((U) this.f16786b.get(i7)).getClass();
        }
    }

    public final void g(C0958q c0958q) {
        this.f16788d = c0958q;
        for (int i7 = 0; i7 < this.f16787c; i7++) {
            U u4 = (U) this.f16786b.get(i7);
            boolean z4 = this.f16785a;
            C0960t c0960t = (C0960t) u4;
            synchronized (c0960t) {
                try {
                    L l7 = C0960t.f16829n;
                    if (z4 && (c0958q.f16821h & 8) != 8) {
                        if (c0960t.f16841f == 0) {
                            c0960t.f16839d.getClass();
                            c0960t.f16842g = SystemClock.elapsedRealtime();
                        }
                        c0960t.f16841f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p146u2.InterfaceC0954m
    public final void x(U u4) {
        u4.getClass();
        ArrayList arrayList = this.f16786b;
        if (arrayList.contains(u4)) {
            return;
        }
        arrayList.add(u4);
        this.f16787c++;
    }
}
