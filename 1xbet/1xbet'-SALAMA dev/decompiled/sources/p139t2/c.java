package p139t2;

import A1.X;
import G4.C0269b;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p018c2.e0;
import p032e2.k;
import p151v2.a;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f16302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f16304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X[] f16305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f16306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16307f;

    public c(e0 e0Var, int[] iArr) {
        int i7 = 0;
        a.h(iArr.length > 0);
        e0Var.getClass();
        this.f16302a = e0Var;
        int length = iArr.length;
        this.f16303b = length;
        this.f16305d = new X[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.f16305d[i8] = e0Var.f10344d[iArr[i8]];
        }
        Arrays.sort(this.f16305d, new C0269b(16));
        this.f16304c = new int[this.f16303b];
        while (true) {
            int i9 = this.f16303b;
            if (i7 >= i9) {
                this.f16306e = new long[i9];
                return;
            } else {
                this.f16304c[i7] = e0Var.a(this.f16305d[i7]);
                i7++;
            }
        }
    }

    public final boolean a(int i7, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zJ = j(i7, jElapsedRealtime);
        int i8 = 0;
        while (i8 < this.f16303b && !zJ) {
            zJ = (i8 == i7 || j(i8, jElapsedRealtime)) ? false : true;
            i8++;
        }
        if (!zJ) {
            return false;
        }
        long[] jArr = this.f16306e;
        long j3 = jArr[i7];
        int i9 = t.f17159a;
        long j7 = jElapsedRealtime + j;
        if (((j ^ j7) & (jElapsedRealtime ^ j7)) < 0) {
            j7 = Long.MAX_VALUE;
        }
        jArr[i7] = Math.max(j3, j7);
        return true;
    }

    public int d(long j, List list) {
        return list.size();
    }

    public abstract int e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16302a == cVar.f16302a && Arrays.equals(this.f16304c, cVar.f16304c);
    }

    public abstract Object f();

    public abstract int g();

    public final int h(int i7) {
        for (int i8 = 0; i8 < this.f16303b; i8++) {
            if (this.f16304c[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.f16307f == 0) {
            this.f16307f = Arrays.hashCode(this.f16304c) + (System.identityHashCode(this.f16302a) * 31);
        }
        return this.f16307f;
    }

    public final int i(X x4) {
        for (int i7 = 0; i7 < this.f16303b; i7++) {
            if (this.f16305d[i7] == x4) {
                return i7;
            }
        }
        return -1;
    }

    public final boolean j(int i7, long j) {
        return this.f16306e[i7] > j;
    }

    public abstract void l(long j, long j3, List list, k[] kVarArr);

    public void b() {
    }

    public void c() {
    }

    public void k(float f7) {
    }
}
