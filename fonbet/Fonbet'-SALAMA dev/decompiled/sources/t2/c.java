package t2;

import A1.X;
import G4.C0269b;
import android.os.SystemClock;
import c2.e0;
import e2.InterfaceC1014k;
import java.util.Arrays;
import java.util.List;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f16296a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16297b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f16298c;

    /* renamed from: d, reason: collision with root package name */
    public final X[] f16299d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f16300e;

    /* renamed from: f, reason: collision with root package name */
    public int f16301f;

    public c(e0 e0Var, int[] iArr) {
        int i7 = 0;
        AbstractC1664a.h(iArr.length > 0);
        e0Var.getClass();
        this.f16296a = e0Var;
        int length = iArr.length;
        this.f16297b = length;
        this.f16299d = new X[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.f16299d[i8] = e0Var.f10344d[iArr[i8]];
        }
        Arrays.sort(this.f16299d, new C0269b(16));
        this.f16298c = new int[this.f16297b];
        while (true) {
            int i9 = this.f16297b;
            if (i7 >= i9) {
                this.f16300e = new long[i9];
                return;
            } else {
                this.f16298c[i7] = e0Var.a(this.f16299d[i7]);
                i7++;
            }
        }
    }

    public final boolean a(int i7, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean j3 = j(i7, elapsedRealtime);
        int i8 = 0;
        while (i8 < this.f16297b && !j3) {
            j3 = (i8 == i7 || j(i8, elapsedRealtime)) ? false : true;
            i8++;
        }
        if (!j3) {
            return false;
        }
        long[] jArr = this.f16300e;
        long j7 = jArr[i7];
        int i9 = v2.t.f17153a;
        long j8 = elapsedRealtime + j;
        if (((j ^ j8) & (elapsedRealtime ^ j8)) < 0) {
            j8 = Long.MAX_VALUE;
        }
        jArr[i7] = Math.max(j7, j8);
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
        return this.f16296a == cVar.f16296a && Arrays.equals(this.f16298c, cVar.f16298c);
    }

    public abstract Object f();

    public abstract int g();

    public final int h(int i7) {
        for (int i8 = 0; i8 < this.f16297b; i8++) {
            if (this.f16298c[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.f16301f == 0) {
            this.f16301f = Arrays.hashCode(this.f16298c) + (System.identityHashCode(this.f16296a) * 31);
        }
        return this.f16301f;
    }

    public final int i(X x4) {
        for (int i7 = 0; i7 < this.f16297b; i7++) {
            if (this.f16299d[i7] == x4) {
                return i7;
            }
        }
        return -1;
    }

    public final boolean j(int i7, long j) {
        return this.f16300e[i7] > j;
    }

    public abstract void l(long j, long j3, List list, InterfaceC1014k[] interfaceC1014kArr);

    public void b() {
    }

    public void c() {
    }

    public void k(float f7) {
    }
}
