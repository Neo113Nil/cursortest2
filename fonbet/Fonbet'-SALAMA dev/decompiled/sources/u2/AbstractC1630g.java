package u2;

import android.os.SystemClock;
import java.util.ArrayList;
import v2.AbstractC1664a;

/* renamed from: u2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1630g implements InterfaceC1636m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16779a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16780b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f16781c;

    /* renamed from: d, reason: collision with root package name */
    public C1640q f16782d;

    public AbstractC1630g(boolean z4) {
        this.f16779a = z4;
    }

    public final void b(int i7) {
        C1640q c1640q = this.f16782d;
        int i8 = v2.t.f17153a;
        for (int i9 = 0; i9 < this.f16781c; i9++) {
            U u4 = (U) this.f16780b.get(i9);
            boolean z4 = this.f16779a;
            C1642t c1642t = (C1642t) u4;
            synchronized (c1642t) {
                E3.L l7 = C1642t.f16823n;
                if (z4 && (c1640q.f16815h & 8) != 8) {
                    c1642t.f16837h += i7;
                }
            }
        }
    }

    public final void e() {
        C1640q c1640q = this.f16782d;
        int i7 = v2.t.f17153a;
        for (int i8 = 0; i8 < this.f16781c; i8++) {
            U u4 = (U) this.f16780b.get(i8);
            boolean z4 = this.f16779a;
            C1642t c1642t = (C1642t) u4;
            synchronized (c1642t) {
                try {
                    E3.L l7 = C1642t.f16823n;
                    if (z4 && (c1640q.f16815h & 8) != 8) {
                        AbstractC1664a.h(c1642t.f16835f > 0);
                        c1642t.f16833d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i9 = (int) (elapsedRealtime - c1642t.f16836g);
                        c1642t.j += i9;
                        long j = c1642t.f16839k;
                        long j3 = c1642t.f16837h;
                        c1642t.f16839k = j + j3;
                        if (i9 > 0) {
                            c1642t.f16832c.a((j3 * 8000.0f) / i9, (int) Math.sqrt(j3));
                            if (c1642t.j < 2000) {
                                if (c1642t.f16839k >= 524288) {
                                }
                                c1642t.c(i9, c1642t.f16837h, c1642t.f16840l);
                                c1642t.f16836g = elapsedRealtime;
                                c1642t.f16837h = 0L;
                            }
                            c1642t.f16840l = (long) c1642t.f16832c.b();
                            c1642t.c(i9, c1642t.f16837h, c1642t.f16840l);
                            c1642t.f16836g = elapsedRealtime;
                            c1642t.f16837h = 0L;
                        }
                        c1642t.f16835f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f16782d = null;
    }

    public final void f() {
        for (int i7 = 0; i7 < this.f16781c; i7++) {
            ((U) this.f16780b.get(i7)).getClass();
        }
    }

    public final void g(C1640q c1640q) {
        this.f16782d = c1640q;
        for (int i7 = 0; i7 < this.f16781c; i7++) {
            U u4 = (U) this.f16780b.get(i7);
            boolean z4 = this.f16779a;
            C1642t c1642t = (C1642t) u4;
            synchronized (c1642t) {
                try {
                    E3.L l7 = C1642t.f16823n;
                    if (z4 && (c1640q.f16815h & 8) != 8) {
                        if (c1642t.f16835f == 0) {
                            c1642t.f16833d.getClass();
                            c1642t.f16836g = SystemClock.elapsedRealtime();
                        }
                        c1642t.f16835f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // u2.InterfaceC1636m
    public final void x(U u4) {
        u4.getClass();
        ArrayList arrayList = this.f16780b;
        if (arrayList.contains(u4)) {
            return;
        }
        arrayList.add(u4);
        this.f16781c++;
    }
}
