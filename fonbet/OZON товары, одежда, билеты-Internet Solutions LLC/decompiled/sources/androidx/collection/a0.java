package androidx.collection;

import java.util.Arrays;
import k0.C7445a;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a0<E> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f38684a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f38685b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f38686c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f38687d;

    public a0() {
        this(0);
    }

    public final void a(int i11, E e11) {
        int i12 = this.f38687d;
        if (i12 != 0 && i11 <= this.f38685b[i12 - 1]) {
            d(i11, e11);
            return;
        }
        if (this.f38684a && i12 >= this.f38685b.length) {
            b0.a(this);
        }
        int i13 = this.f38687d;
        if (i13 >= this.f38685b.length) {
            int i14 = (i13 + 1) * 4;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 4;
            int[] copyOf = Arrays.copyOf(this.f38685b, i17);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f38685b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f38686c, i17);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f38686c = copyOf2;
        }
        this.f38685b[i13] = i11;
        this.f38686c[i13] = e11;
        this.f38687d = i13 + 1;
    }

    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final a0<E> clone() {
        Object clone = super.clone();
        Intrinsics.g(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        a0<E> a0Var = (a0) clone;
        a0Var.f38685b = (int[]) this.f38685b.clone();
        a0Var.f38686c = (Object[]) this.f38686c.clone();
        return a0Var;
    }

    public final int c(int i11) {
        if (this.f38684a) {
            b0.a(this);
        }
        return this.f38685b[i11];
    }

    public final void d(int i11, E e11) {
        Object obj;
        int a11 = C7445a.a(this.f38687d, i11, this.f38685b);
        if (a11 >= 0) {
            this.f38686c[a11] = e11;
            return;
        }
        int i12 = ~a11;
        if (i12 < this.f38687d) {
            Object obj2 = this.f38686c[i12];
            obj = b0.f38692a;
            if (obj2 == obj) {
                this.f38685b[i12] = i11;
                this.f38686c[i12] = e11;
                return;
            }
        }
        if (this.f38684a && this.f38687d >= this.f38685b.length) {
            b0.a(this);
            i12 = ~C7445a.a(this.f38687d, i11, this.f38685b);
        }
        int i13 = this.f38687d;
        if (i13 >= this.f38685b.length) {
            int i14 = (i13 + 1) * 4;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 4;
            int[] copyOf = Arrays.copyOf(this.f38685b, i17);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f38685b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f38686c, i17);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f38686c = copyOf2;
        }
        int i18 = this.f38687d;
        if (i18 - i12 != 0) {
            int[] iArr = this.f38685b;
            int i19 = i12 + 1;
            C7705l.p(i19, i12, iArr, iArr, i18);
            Object[] objArr = this.f38686c;
            C7705l.r(objArr, i19, objArr, i12, this.f38687d);
        }
        this.f38685b[i12] = i11;
        this.f38686c[i12] = e11;
        this.f38687d++;
    }

    public final int e() {
        if (this.f38684a) {
            b0.a(this);
        }
        return this.f38687d;
    }

    public final E f(int i11) {
        if (this.f38684a) {
            b0.a(this);
        }
        return (E) this.f38686c[i11];
    }

    @NotNull
    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f38687d * 28);
        sb2.append('{');
        int i11 = this.f38687d;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(c(i12));
            sb2.append('=');
            E f7 = f(i12);
            if (f7 != this) {
                sb2.append(f7);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "buffer.toString()");
        return sb3;
    }

    public a0(int i11) {
        int i12;
        int i13 = 4;
        while (true) {
            i12 = 40;
            if (i13 >= 32) {
                break;
            }
            int i14 = (1 << i13) - 12;
            if (40 <= i14) {
                i12 = i14;
                break;
            }
            i13++;
        }
        int i15 = i12 / 4;
        this.f38685b = new int[i15];
        this.f38686c = new Object[i15];
    }
}
