package I3;

import android.os.SystemClock;
import j3.C7253I;
import j3.C7272n;
import java.util.Arrays;
import java.util.List;
import m3.N;

/* renamed from: I3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3228c implements y {

    /* renamed from: a, reason: collision with root package name */
    protected final C7253I f11845a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f11846b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f11847c;

    /* renamed from: d, reason: collision with root package name */
    private final C7272n[] f11848d;

    /* renamed from: e, reason: collision with root package name */
    private final long[] f11849e;

    /* renamed from: f, reason: collision with root package name */
    private int f11850f;

    public AbstractC3228c(C7253I c7253i, int[] iArr) {
        int i11 = 0;
        G10.a.h(iArr.length > 0);
        c7253i.getClass();
        this.f11845a = c7253i;
        int length = iArr.length;
        this.f11846b = length;
        this.f11848d = new C7272n[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f11848d[i12] = c7253i.a(iArr[i12]);
        }
        Arrays.sort(this.f11848d, new C3227b(0));
        this.f11847c = new int[this.f11846b];
        while (true) {
            int i13 = this.f11846b;
            if (i11 >= i13) {
                this.f11849e = new long[i13];
                return;
            } else {
                this.f11847c[i11] = c7253i.b(this.f11848d[i11]);
                i11++;
            }
        }
    }

    @Override // I3.y
    public void a() {
    }

    @Override // I3.y
    public final boolean b(int i11, long j11) {
        return this.f11849e[i11] > j11;
    }

    @Override // I3.C
    public final int c(int i11) {
        return this.f11847c[i11];
    }

    @Override // I3.y
    public final boolean d(int i11, long j11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b11 = b(i11, elapsedRealtime);
        int i12 = 0;
        while (i12 < this.f11846b && !b11) {
            b11 = (i12 == i11 || b(i12, elapsedRealtime)) ? false : true;
            i12++;
        }
        if (!b11) {
            return false;
        }
        long[] jArr = this.f11849e;
        long j12 = jArr[i11];
        int i13 = N.f74289a;
        long j13 = elapsedRealtime + j11;
        if (((j11 ^ j13) & (elapsedRealtime ^ j13)) < 0) {
            j13 = Long.MAX_VALUE;
        }
        jArr[i11] = Math.max(j12, j13);
        return true;
    }

    @Override // I3.y
    public void disable() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC3228c abstractC3228c = (AbstractC3228c) obj;
            if (this.f11845a.equals(abstractC3228c.f11845a) && Arrays.equals(this.f11847c, abstractC3228c.f11847c)) {
                return true;
            }
        }
        return false;
    }

    @Override // I3.C
    public final int f(int i11) {
        for (int i12 = 0; i12 < this.f11846b; i12++) {
            if (this.f11847c[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    @Override // I3.C
    public final C7253I g() {
        return this.f11845a;
    }

    @Override // I3.y
    public int h(long j11, List<? extends G3.d> list) {
        return list.size();
    }

    public final int hashCode() {
        if (this.f11850f == 0) {
            this.f11850f = Arrays.hashCode(this.f11847c) + (System.identityHashCode(this.f11845a) * 31);
        }
        return this.f11850f;
    }

    @Override // I3.y
    public final int i() {
        return this.f11847c[getSelectedIndex()];
    }

    @Override // I3.y
    public final C7272n j() {
        return this.f11848d[getSelectedIndex()];
    }

    @Override // I3.C
    public final int length() {
        return this.f11847c.length;
    }

    @Override // I3.C
    public final C7272n m(int i11) {
        return this.f11848d[i11];
    }

    @Override // I3.y
    public void o(float f7) {
    }

    @Override // I3.y
    public final void q(boolean z11) {
    }

    public final int s(C7272n c7272n) {
        for (int i11 = 0; i11 < this.f11846b; i11++) {
            if (this.f11848d[i11] == c7272n) {
                return i11;
            }
        }
        return -1;
    }
}
