package r;

import java.util.Arrays;
import s.AbstractC2351a;

/* renamed from: r.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2338p implements Cloneable {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f19029k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ long[] f19030l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object[] f19031m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ int f19032n;

    public C2338p(int i) {
        if (i == 0) {
            this.f19030l = AbstractC2351a.f19150b;
            this.f19031m = AbstractC2351a.f19151c;
            return;
        }
        int i5 = i * 8;
        int i6 = 4;
        while (true) {
            if (i6 >= 32) {
                break;
            }
            int i7 = (1 << i6) - 12;
            if (i5 <= i7) {
                i5 = i7;
                break;
            }
            i6++;
        }
        int i8 = i5 / 8;
        this.f19030l = new long[i8];
        this.f19031m = new Object[i8];
    }

    public final void a(long j5, Long l5) {
        int i = this.f19032n;
        if (i != 0 && j5 <= this.f19030l[i - 1]) {
            g(j5, l5);
            return;
        }
        if (this.f19029k) {
            long[] jArr = this.f19030l;
            if (i >= jArr.length) {
                Object[] objArr = this.f19031m;
                int i5 = 0;
                for (int i6 = 0; i6 < i; i6++) {
                    Object obj = objArr[i6];
                    if (obj != AbstractC2339q.f19033a) {
                        if (i6 != i5) {
                            jArr[i5] = jArr[i6];
                            objArr[i5] = obj;
                            objArr[i6] = null;
                        }
                        i5++;
                    }
                }
                this.f19029k = false;
                this.f19032n = i5;
            }
        }
        int i7 = this.f19032n;
        if (i7 >= this.f19030l.length) {
            int i8 = (i7 + 1) * 8;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 8;
            long[] copyOf = Arrays.copyOf(this.f19030l, i11);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            this.f19030l = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f19031m, i11);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
            this.f19031m = copyOf2;
        }
        this.f19030l[i7] = j5;
        this.f19031m[i7] = l5;
        this.f19032n = i7 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2338p clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>", clone);
        C2338p c2338p = (C2338p) clone;
        c2338p.f19030l = (long[]) this.f19030l.clone();
        c2338p.f19031m = (Object[]) this.f19031m.clone();
        return c2338p;
    }

    public final Object c(long j5) {
        Object obj;
        int b3 = AbstractC2351a.b(this.f19030l, this.f19032n, j5);
        if (b3 < 0 || (obj = this.f19031m[b3]) == AbstractC2339q.f19033a) {
            return -1L;
        }
        return obj;
    }

    public final long e(int i) {
        if (!(i >= 0 && i < this.f19032n)) {
            AbstractC2351a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f19029k) {
            int i5 = this.f19032n;
            long[] jArr = this.f19030l;
            Object[] objArr = this.f19031m;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != AbstractC2339q.f19033a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f19029k = false;
            this.f19032n = i6;
        }
        return this.f19030l[i];
    }

    public final void g(long j5, Object obj) {
        int b3 = AbstractC2351a.b(this.f19030l, this.f19032n, j5);
        if (b3 >= 0) {
            this.f19031m[b3] = obj;
            return;
        }
        int i = ~b3;
        int i5 = this.f19032n;
        Object obj2 = AbstractC2339q.f19033a;
        if (i < i5) {
            Object[] objArr = this.f19031m;
            if (objArr[i] == obj2) {
                this.f19030l[i] = j5;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f19029k) {
            long[] jArr = this.f19030l;
            if (i5 >= jArr.length) {
                Object[] objArr2 = this.f19031m;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    Object obj3 = objArr2[i7];
                    if (obj3 != obj2) {
                        if (i7 != i6) {
                            jArr[i6] = jArr[i7];
                            objArr2[i6] = obj3;
                            objArr2[i7] = null;
                        }
                        i6++;
                    }
                }
                this.f19029k = false;
                this.f19032n = i6;
                i = ~AbstractC2351a.b(this.f19030l, i6, j5);
            }
        }
        int i8 = this.f19032n;
        if (i8 >= this.f19030l.length) {
            int i9 = (i8 + 1) * 8;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 8;
            long[] copyOf = Arrays.copyOf(this.f19030l, i12);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            this.f19030l = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f19031m, i12);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
            this.f19031m = copyOf2;
        }
        int i13 = this.f19032n;
        if (i13 - i != 0) {
            long[] jArr2 = this.f19030l;
            int i14 = i + 1;
            X3.l.v0(jArr2, jArr2, i14, i, i13);
            Object[] objArr3 = this.f19031m;
            X3.l.t0(i14, i, this.f19032n, objArr3, objArr3);
        }
        this.f19030l[i] = j5;
        this.f19031m[i] = obj;
        this.f19032n++;
    }

    public final void i(long j5) {
        int b3 = AbstractC2351a.b(this.f19030l, this.f19032n, j5);
        if (b3 >= 0) {
            Object[] objArr = this.f19031m;
            Object obj = objArr[b3];
            Object obj2 = AbstractC2339q.f19033a;
            if (obj != obj2) {
                objArr[b3] = obj2;
                this.f19029k = true;
            }
        }
    }

    public final int j() {
        if (this.f19029k) {
            int i = this.f19032n;
            long[] jArr = this.f19030l;
            Object[] objArr = this.f19031m;
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                Object obj = objArr[i6];
                if (obj != AbstractC2339q.f19033a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f19029k = false;
            this.f19032n = i5;
        }
        return this.f19032n;
    }

    public final Object k(int i) {
        if (!(i >= 0 && i < this.f19032n)) {
            AbstractC2351a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.f19029k) {
            int i5 = this.f19032n;
            long[] jArr = this.f19030l;
            Object[] objArr = this.f19031m;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != AbstractC2339q.f19033a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f19029k = false;
            this.f19032n = i6;
        }
        return this.f19031m[i];
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19032n * 28);
        sb.append('{');
        int i = this.f19032n;
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(e(i5));
            sb.append('=');
            Object k5 = k(i5);
            if (k5 != sb) {
                sb.append(k5);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }

    public /* synthetic */ C2338p(Object obj) {
        this(10);
    }
}
