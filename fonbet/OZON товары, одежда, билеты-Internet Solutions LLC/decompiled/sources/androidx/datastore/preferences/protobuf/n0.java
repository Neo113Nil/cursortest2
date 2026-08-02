package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t0;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: f, reason: collision with root package name */
    private static final n0 f42589f = new n0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f42590a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f42591b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f42592c;

    /* renamed from: d, reason: collision with root package name */
    private int f42593d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f42594e;

    private n0() {
        this(0, new int[8], new Object[8], true);
    }

    private void a(int i11) {
        int[] iArr = this.f42591b;
        if (i11 > iArr.length) {
            int i12 = this.f42590a;
            int i13 = (i12 / 2) + i12;
            if (i13 >= i11) {
                i11 = i13;
            }
            if (i11 < 8) {
                i11 = 8;
            }
            this.f42591b = Arrays.copyOf(iArr, i11);
            this.f42592c = Arrays.copyOf(this.f42592c, i11);
        }
    }

    public static n0 b() {
        return f42589f;
    }

    static n0 g(n0 n0Var, n0 n0Var2) {
        int i11 = n0Var.f42590a + n0Var2.f42590a;
        int[] copyOf = Arrays.copyOf(n0Var.f42591b, i11);
        System.arraycopy(n0Var2.f42591b, 0, copyOf, n0Var.f42590a, n0Var2.f42590a);
        Object[] copyOf2 = Arrays.copyOf(n0Var.f42592c, i11);
        System.arraycopy(n0Var2.f42592c, 0, copyOf2, n0Var.f42590a, n0Var2.f42590a);
        return new n0(i11, copyOf, copyOf2, true);
    }

    static n0 h() {
        return new n0();
    }

    public final int c() {
        int h11;
        int j11;
        int h12;
        int i11 = this.f42593d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f42590a; i13++) {
            int i14 = this.f42591b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 != 0) {
                if (i16 == 1) {
                    ((Long) this.f42592c[i13]).getClass();
                    h12 = AbstractC5365k.h(i15) + 8;
                } else if (i16 == 2) {
                    h12 = AbstractC5365k.c(i15, (AbstractC5362h) this.f42592c[i13]);
                } else if (i16 == 3) {
                    h11 = AbstractC5365k.h(i15) * 2;
                    j11 = ((n0) this.f42592c[i13]).c();
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException(C5379z.d());
                    }
                    ((Integer) this.f42592c[i13]).getClass();
                    h12 = AbstractC5365k.h(i15) + 4;
                }
                i12 = h12 + i12;
            } else {
                long longValue = ((Long) this.f42592c[i13]).longValue();
                h11 = AbstractC5365k.h(i15);
                j11 = AbstractC5365k.j(longValue);
            }
            i12 = j11 + h11 + i12;
        }
        this.f42593d = i12;
        return i12;
    }

    public final int d() {
        int i11 = this.f42593d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f42590a; i13++) {
            int i14 = this.f42591b[i13] >>> 3;
            i12 += AbstractC5365k.c(3, (AbstractC5362h) this.f42592c[i13]) + AbstractC5365k.i(i14) + AbstractC5365k.h(2) + (AbstractC5365k.h(1) * 2);
        }
        this.f42593d = i12;
        return i12;
    }

    public final void e() {
        if (this.f42594e) {
            this.f42594e = false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        int i11 = this.f42590a;
        if (i11 == n0Var.f42590a) {
            int[] iArr = this.f42591b;
            int[] iArr2 = n0Var.f42591b;
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    Object[] objArr = this.f42592c;
                    Object[] objArr2 = n0Var.f42592c;
                    int i13 = this.f42590a;
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (objArr[i14].equals(objArr2[i14])) {
                        }
                    }
                    return true;
                }
                if (iArr[i12] != iArr2[i12]) {
                    break;
                }
                i12++;
            }
        }
        return false;
    }

    final void f(n0 n0Var) {
        if (n0Var.equals(f42589f)) {
            return;
        }
        if (!this.f42594e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f42590a + n0Var.f42590a;
        a(i11);
        System.arraycopy(n0Var.f42591b, 0, this.f42591b, this.f42590a, n0Var.f42590a);
        System.arraycopy(n0Var.f42592c, 0, this.f42592c, this.f42590a, n0Var.f42590a);
        this.f42590a = i11;
    }

    public final int hashCode() {
        int i11 = this.f42590a;
        int i12 = (527 + i11) * 31;
        int[] iArr = this.f42591b;
        int i13 = 17;
        int i14 = 17;
        for (int i15 = 0; i15 < i11; i15++) {
            i14 = (i14 * 31) + iArr[i15];
        }
        int i16 = (i12 + i14) * 31;
        Object[] objArr = this.f42592c;
        int i17 = this.f42590a;
        for (int i18 = 0; i18 < i17; i18++) {
            i13 = (i13 * 31) + objArr[i18].hashCode();
        }
        return i16 + i13;
    }

    final void i(int i11, StringBuilder sb2) {
        for (int i12 = 0; i12 < this.f42590a; i12++) {
            T.b(sb2, i11, String.valueOf(this.f42591b[i12] >>> 3), this.f42592c[i12]);
        }
    }

    final void j(int i11, Object obj) {
        if (!this.f42594e) {
            throw new UnsupportedOperationException();
        }
        a(this.f42590a + 1);
        int[] iArr = this.f42591b;
        int i12 = this.f42590a;
        iArr[i12] = i11;
        this.f42592c[i12] = obj;
        this.f42590a = i12 + 1;
    }

    final void k(t0 t0Var) throws IOException {
        ((C5366l) t0Var).getClass();
        if (t0.a.ASCENDING == t0.a.DESCENDING) {
            for (int i11 = this.f42590a - 1; i11 >= 0; i11--) {
                ((C5366l) t0Var).x(this.f42591b[i11] >>> 3, this.f42592c[i11]);
            }
            return;
        }
        for (int i12 = 0; i12 < this.f42590a; i12++) {
            ((C5366l) t0Var).x(this.f42591b[i12] >>> 3, this.f42592c[i12]);
        }
    }

    public final void l(t0 t0Var) throws IOException {
        if (this.f42590a == 0) {
            return;
        }
        C5366l c5366l = (C5366l) t0Var;
        c5366l.getClass();
        for (int i11 = 0; i11 < this.f42590a; i11++) {
            int i12 = this.f42591b[i11];
            Object obj = this.f42592c[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                c5366l.t(i13, ((Long) obj).longValue());
            } else if (i14 == 1) {
                c5366l.m(i13, ((Long) obj).longValue());
            } else if (i14 == 2) {
                c5366l.d(i13, (AbstractC5362h) obj);
            } else if (i14 == 3) {
                c5366l.getClass();
                c5366l.G(i13);
                ((n0) obj).l(t0Var);
                c5366l.h(i13);
            } else {
                if (i14 != 5) {
                    throw new RuntimeException(C5379z.d());
                }
                c5366l.k(i13, ((Integer) obj).intValue());
            }
        }
    }

    private n0(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f42593d = -1;
        this.f42590a = i11;
        this.f42591b = iArr;
        this.f42592c = objArr;
        this.f42594e = z11;
    }
}
