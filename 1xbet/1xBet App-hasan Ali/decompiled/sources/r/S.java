package r;

import java.util.Arrays;
import s.AbstractC2351a;

/* loaded from: classes.dex */
public final class S implements Cloneable {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f18962k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ int[] f18963l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object[] f18964m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ int f18965n;

    public S(int i) {
        int i5;
        int i6 = 4;
        while (true) {
            i5 = 40;
            if (i6 >= 32) {
                break;
            }
            int i7 = (1 << i6) - 12;
            if (40 <= i7) {
                i5 = i7;
                break;
            }
            i6++;
        }
        int i8 = i5 / 4;
        this.f18963l = new int[i8];
        this.f18964m = new Object[i8];
    }

    public final void a(int i, Object obj) {
        int i5 = this.f18965n;
        if (i5 != 0 && i <= this.f18963l[i5 - 1]) {
            i(i, obj);
            return;
        }
        if (this.f18962k && i5 >= this.f18963l.length) {
            AbstractC2339q.a(this);
        }
        int i6 = this.f18965n;
        if (i6 >= this.f18963l.length) {
            int i7 = (i6 + 1) * 4;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 4;
            int[] copyOf = Arrays.copyOf(this.f18963l, i10);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            this.f18963l = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f18964m, i10);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
            this.f18964m = copyOf2;
        }
        this.f18963l[i6] = i;
        this.f18964m[i6] = obj;
        this.f18965n = i6 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final S clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>", clone);
        S s2 = (S) clone;
        s2.f18963l = (int[]) this.f18963l.clone();
        s2.f18964m = (Object[]) this.f18964m.clone();
        return s2;
    }

    public final boolean c(int i) {
        if (this.f18962k) {
            AbstractC2339q.a(this);
        }
        return AbstractC2351a.a(this.f18965n, i, this.f18963l) >= 0;
    }

    public final Object e(int i) {
        Object obj;
        int a5 = AbstractC2351a.a(this.f18965n, i, this.f18963l);
        if (a5 < 0 || (obj = this.f18964m[a5]) == AbstractC2339q.f19035c) {
            return null;
        }
        return obj;
    }

    public final int g(int i) {
        if (this.f18962k) {
            AbstractC2339q.a(this);
        }
        return this.f18963l[i];
    }

    public final void i(int i, Object obj) {
        int a5 = AbstractC2351a.a(this.f18965n, i, this.f18963l);
        if (a5 >= 0) {
            this.f18964m[a5] = obj;
            return;
        }
        int i5 = ~a5;
        int i6 = this.f18965n;
        if (i5 < i6) {
            Object[] objArr = this.f18964m;
            if (objArr[i5] == AbstractC2339q.f19035c) {
                this.f18963l[i5] = i;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f18962k && i6 >= this.f18963l.length) {
            AbstractC2339q.a(this);
            i5 = ~AbstractC2351a.a(this.f18965n, i, this.f18963l);
        }
        int i7 = this.f18965n;
        if (i7 >= this.f18963l.length) {
            int i8 = (i7 + 1) * 4;
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
            int i11 = i8 / 4;
            int[] copyOf = Arrays.copyOf(this.f18963l, i11);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
            this.f18963l = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f18964m, i11);
            kotlin.jvm.internal.l.e("copyOf(...)", copyOf2);
            this.f18964m = copyOf2;
        }
        int i12 = this.f18965n;
        if (i12 - i5 != 0) {
            int[] iArr = this.f18963l;
            int i13 = i5 + 1;
            X3.l.s0(i13, i5, i12, iArr, iArr);
            Object[] objArr2 = this.f18964m;
            X3.l.t0(i13, i5, this.f18965n, objArr2, objArr2);
        }
        this.f18963l[i5] = i;
        this.f18964m[i5] = obj;
        this.f18965n++;
    }

    public final int j() {
        if (this.f18962k) {
            AbstractC2339q.a(this);
        }
        return this.f18965n;
    }

    public final Object k(int i) {
        if (this.f18962k) {
            AbstractC2339q.a(this);
        }
        Object[] objArr = this.f18964m;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f18965n * 28);
        sb.append('{');
        int i = this.f18965n;
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(g(i5));
            sb.append('=');
            Object k5 = k(i5);
            if (k5 != this) {
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
}
