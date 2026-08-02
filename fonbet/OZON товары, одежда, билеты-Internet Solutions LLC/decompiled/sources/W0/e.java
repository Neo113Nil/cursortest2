package W0;

import Bl0.D;
import Bl0.j0;
import S0.B0;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e<E> extends b<E> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object[] f33165b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object[] f33166c;

    /* renamed from: d, reason: collision with root package name */
    private final int f33167d;

    /* renamed from: e, reason: collision with root package name */
    private final int f33168e;

    public e(@NotNull Object[] objArr, @NotNull Object[] objArr2, int i11, int i12) {
        this.f33165b = objArr;
        this.f33166c = objArr2;
        this.f33167d = i11;
        this.f33168e = i12;
        if (getSize() > 32) {
            int length = objArr2.length;
            return;
        }
        B0.a("Trie-based persistent vector should have at least 33 elements, got " + getSize());
        throw null;
    }

    private static Object[] b(Object[] objArr, int i11, int i12, Object obj, d dVar) {
        Object[] copyOf;
        int c11 = D.c(i12, i11);
        if (i11 == 0) {
            if (c11 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            }
            C7705l.r(objArr, c11 + 1, copyOf, c11, 31);
            dVar.b(objArr[31]);
            copyOf[c11] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        int i13 = i11 - 5;
        Object obj2 = objArr[c11];
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[c11] = b((Object[]) obj2, i13, i12, obj, dVar);
        while (true) {
            c11++;
            if (c11 >= 32 || copyOf2[c11] == null) {
                break;
            }
            Object obj3 = objArr[c11];
            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[c11] = b((Object[]) obj3, i13, 0, dVar.a(), dVar);
        }
        return copyOf2;
    }

    private final e e(Object obj, Object[] objArr, int i11) {
        int s11 = s();
        int i12 = this.f33167d;
        int i13 = i12 - s11;
        Object[] objArr2 = this.f33166c;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        if (i13 < 32) {
            C7705l.r(objArr2, i11 + 1, copyOf, i11, i13);
            copyOf[i11] = obj;
            return new e(objArr, copyOf, i12 + 1, this.f33168e);
        }
        Object obj2 = objArr2[31];
        C7705l.r(objArr2, i11 + 1, copyOf, i11, i13 - 1);
        copyOf[i11] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return i(objArr, copyOf, objArr3);
    }

    private static Object[] h(Object[] objArr, int i11, int i12, d dVar) {
        Object[] h11;
        int c11 = D.c(i12, i11);
        if (i11 == 5) {
            dVar.b(objArr[c11]);
            h11 = null;
        } else {
            Object obj = objArr[c11];
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            h11 = h((Object[]) obj, i11 - 5, i12, dVar);
        }
        if (h11 == null && c11 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[c11] = h11;
        return copyOf;
    }

    private final e<E> i(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i11 = this.f33167d;
        int i12 = i11 >> 5;
        int i13 = this.f33168e;
        if (i12 <= (1 << i13)) {
            return new e<>(l(i13, objArr, objArr2), objArr3, i11 + 1, i13);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i14 = i13 + 5;
        return new e<>(l(i14, objArr4, objArr2), objArr3, i11 + 1, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r5 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object[] l(int i11, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int c11 = D.c(getSize() - 1, i11);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            Intrinsics.checkNotNullExpressionValue(objArr3, "copyOf(this, newSize)");
        }
        objArr3 = new Object[32];
        if (i11 == 5) {
            objArr3[c11] = objArr2;
            return objArr3;
        }
        objArr3[c11] = l(i11 - 5, (Object[]) objArr3[c11], objArr2);
        return objArr3;
    }

    private final Object[] m(Object[] objArr, int i11, int i12, d dVar) {
        Object[] copyOf;
        int c11 = D.c(i12, i11);
        if (i11 == 0) {
            if (c11 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            }
            C7705l.r(objArr, c11, copyOf, c11 + 1, 32);
            copyOf[31] = dVar.a();
            dVar.b(objArr[c11]);
            return copyOf;
        }
        int c12 = objArr[31] == null ? D.c(s() - 1, i11) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        int i13 = i11 - 5;
        int i14 = c11 + 1;
        if (i14 <= c12) {
            while (true) {
                Object obj = copyOf2[c12];
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[c12] = m((Object[]) obj, i13, 0, dVar);
                if (c12 == i14) {
                    break;
                }
                c12--;
            }
        }
        Object obj2 = copyOf2[c11];
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[c11] = m((Object[]) obj2, i13, i12, dVar);
        return copyOf2;
    }

    private final b n(Object[] objArr, int i11, int i12, int i13) {
        int i14 = this.f33167d - i11;
        if (i14 != 1) {
            Object[] objArr2 = this.f33166c;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            int i15 = i14 - 1;
            if (i13 < i15) {
                C7705l.r(objArr2, i13, copyOf, i13 + 1, i14);
            }
            copyOf[i15] = null;
            return new e(objArr, copyOf, (i11 + i14) - 1, i12);
        }
        if (i12 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        d dVar = new d(null);
        Object[] h11 = h(objArr, i12, i11 - 1, dVar);
        Intrinsics.f(h11);
        Object a11 = dVar.a();
        Intrinsics.g(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) a11;
        if (h11[1] != null) {
            return new e(h11, objArr3, i11, i12);
        }
        Object obj = h11[0];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj, objArr3, i11, i12 - 5);
    }

    private final int s() {
        return (this.f33167d - 1) & (-32);
    }

    private static Object[] u(Object[] objArr, int i11, int i12, Object obj) {
        int c11 = D.c(i12, i11);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        if (i11 == 0) {
            copyOf[c11] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[c11];
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[c11] = u((Object[]) obj2, i11 - 5, i12, obj);
        return copyOf;
    }

    @Override // java.util.Collection, java.util.List, V0.c
    @NotNull
    public final V0.c<E> add(E e11) {
        int s11 = s();
        int i11 = this.f33167d;
        int i12 = i11 - s11;
        Object[] objArr = this.f33165b;
        Object[] objArr2 = this.f33166c;
        if (i12 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = e11;
            return i(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[i12] = e11;
        return new e(objArr, copyOf, i11 + 1, this.f33168e);
    }

    @Override // V0.c
    public final f d() {
        return new f(this, this.f33165b, this.f33166c, this.f33168e);
    }

    @Override // V0.c
    @NotNull
    public final V0.c<E> d1(int i11) {
        j0.d(i11, this.f33167d);
        int s11 = s();
        Object[] objArr = this.f33165b;
        int i12 = this.f33168e;
        return i11 >= s11 ? n(objArr, s11, i12, i11 - s11) : n(m(objArr, i12, i11, new d(this.f33166c[0])), s11, i12, 0);
    }

    @Override // java.util.List
    public final E get(int i11) {
        Object[] objArr;
        j0.d(i11, getSize());
        if (s() <= i11) {
            objArr = this.f33166c;
        } else {
            objArr = this.f33165b;
            for (int i12 = this.f33168e; i12 > 0; i12 -= 5) {
                Object obj = objArr[D.c(i11, i12)];
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i11 & 31];
    }

    @Override // kotlin.collections.AbstractC7694a
    public final int getSize() {
        return this.f33167d;
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List
    @NotNull
    public final ListIterator<E> listIterator(int i11) {
        j0.e(i11, this.f33167d);
        return new g(this.f33165b, i11, this.f33166c, this.f33167d, (this.f33168e / 5) + 1);
    }

    @Override // V0.c
    @NotNull
    public final V0.c<E> s0(@NotNull Function1<? super E, Boolean> function1) {
        f fVar = new f(this, this.f33165b, this.f33166c, this.f33168e);
        fVar.Q(function1);
        return fVar.e();
    }

    @Override // kotlin.collections.AbstractC7696c, java.util.List, V0.c
    @NotNull
    public final V0.c<E> set(int i11, E e11) {
        int i12 = this.f33167d;
        j0.d(i11, i12);
        int s11 = s();
        Object[] objArr = this.f33165b;
        Object[] objArr2 = this.f33166c;
        int i13 = this.f33168e;
        if (s11 > i11) {
            return new e(u(objArr, i13, i11, e11), objArr2, i12, i13);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[i11 & 31] = e11;
        return new e(objArr, copyOf, i12, i13);
    }

    @Override // java.util.List, V0.c
    @NotNull
    public final V0.c<E> add(int i11, E e11) {
        int i12 = this.f33167d;
        j0.e(i11, i12);
        if (i11 == i12) {
            return add((e<E>) e11);
        }
        int s11 = s();
        Object[] objArr = this.f33165b;
        if (i11 >= s11) {
            return e(e11, objArr, i11 - s11);
        }
        d dVar = new d(null);
        return e(dVar.a(), b(objArr, this.f33168e, i11, e11, dVar), 0);
    }
}
