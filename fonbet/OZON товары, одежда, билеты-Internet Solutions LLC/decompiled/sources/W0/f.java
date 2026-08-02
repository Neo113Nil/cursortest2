package W0;

import Bl0.D;
import Bl0.j0;
import Bl0.k0;
import S0.B0;
import gd.InterfaceC6713b;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractC7699f;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7721c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class f<E> extends AbstractC7699f<E> implements Collection, InterfaceC6713b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private V0.c<? extends E> f33169a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f33170b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Object[] f33171c;

    /* renamed from: d, reason: collision with root package name */
    private int f33172d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private k0 f33173e = new k0();

    /* renamed from: f, reason: collision with root package name */
    private Object[] f33174f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private Object[] f33175g;

    /* renamed from: h, reason: collision with root package name */
    private int f33176h;

    static final class a extends AbstractC7737t implements Function1<E, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection<E> f33177b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f33177b = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f33177b.contains(obj));
        }
    }

    public f(@NotNull b bVar, Object[] objArr, @NotNull Object[] objArr2, int i11) {
        this.f33169a = bVar;
        this.f33170b = objArr;
        this.f33171c = objArr2;
        this.f33172d = i11;
        this.f33174f = objArr;
        this.f33175g = objArr2;
        this.f33176h = bVar.size();
    }

    private final boolean A(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f33173e;
    }

    private final W0.a B(int i11) {
        Object[] objArr = this.f33174f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int T11 = T() >> 5;
        j0.e(i11, T11);
        int i12 = this.f33172d;
        return i12 == 0 ? new i(objArr, i11) : new k(objArr, i11, T11, i12 / 5);
    }

    private final Object[] C(Object[] objArr) {
        if (objArr == null) {
            return E();
        }
        if (A(objArr)) {
            return objArr;
        }
        Object[] E11 = E();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        C7705l.u(objArr, 0, E11, length, 6);
        return E11;
    }

    private final Object[] D(int i11, Object[] objArr) {
        if (A(objArr)) {
            C7705l.r(objArr, i11, objArr, 0, 32 - i11);
            return objArr;
        }
        Object[] E11 = E();
        C7705l.r(objArr, i11, E11, 0, 32 - i11);
        return E11;
    }

    private final Object[] E() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f33173e;
        return objArr;
    }

    private final Object[] F(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f33173e;
        return objArr;
    }

    private final Object[] G(int i11, int i12, Object[] objArr) {
        if (!(i12 >= 0)) {
            B0.a("shift should be positive");
            throw null;
        }
        if (i12 == 0) {
            return objArr;
        }
        int c11 = D.c(i11, i12);
        Object obj = objArr[c11];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object G11 = G(i11, i12 - 5, (Object[]) obj);
        if (c11 < 31) {
            int i13 = c11 + 1;
            if (objArr[i13] != null) {
                if (A(objArr)) {
                    Intrinsics.checkNotNullParameter(objArr, "<this>");
                    Arrays.fill(objArr, i13, 32, (Object) null);
                }
                Object[] E11 = E();
                C7705l.r(objArr, 0, E11, 0, i13);
                objArr = E11;
            }
        }
        if (G11 == objArr[c11]) {
            return objArr;
        }
        Object[] C11 = C(objArr);
        C11[c11] = G11;
        return C11;
    }

    private final Object[] H(Object[] objArr, int i11, int i12, d dVar) {
        Object[] H11;
        int c11 = D.c(i12 - 1, i11);
        if (i11 == 5) {
            dVar.b(objArr[c11]);
            H11 = null;
        } else {
            Object obj = objArr[c11];
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            H11 = H((Object[]) obj, i11 - 5, i12, dVar);
        }
        if (H11 == null && c11 == 0) {
            return null;
        }
        Object[] C11 = C(objArr);
        C11[c11] = H11;
        return C11;
    }

    private final void I(int i11, int i12, Object[] objArr) {
        if (i12 == 0) {
            this.f33174f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f33175g = objArr;
            this.f33176h = i11;
            this.f33172d = i12;
            return;
        }
        d dVar = new d(null);
        Intrinsics.f(objArr);
        Object[] H11 = H(objArr, i12, i11, dVar);
        Intrinsics.f(H11);
        Object a11 = dVar.a();
        Intrinsics.g(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f33175g = (Object[]) a11;
        this.f33176h = i11;
        if (H11[1] == null) {
            this.f33174f = (Object[]) H11[0];
            this.f33172d = i12 - 5;
        } else {
            this.f33174f = H11;
            this.f33172d = i12;
        }
    }

    private final Object[] J(Object[] objArr, int i11, int i12, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            B0.a("invalid buffersIterator");
            throw null;
        }
        if (!(i12 >= 0)) {
            B0.a("negative shift");
            throw null;
        }
        if (i12 == 0) {
            return it.next();
        }
        Object[] C11 = C(objArr);
        int c11 = D.c(i11, i12);
        int i13 = i12 - 5;
        C11[c11] = J((Object[]) C11[c11], i11, i13, it);
        while (true) {
            c11++;
            if (c11 >= 32 || !it.hasNext()) {
                break;
            }
            C11[c11] = J((Object[]) C11[c11], 0, i13, it);
        }
        return C11;
    }

    private final Object[] K(Object[] objArr, int i11, Object[][] objArr2) {
        Iterator<Object[]> a11 = C7721c.a(objArr2);
        int i12 = i11 >> 5;
        int i13 = this.f33172d;
        Object[] J11 = i12 < (1 << i13) ? J(objArr, i11, i13, a11) : C(objArr);
        while (a11.hasNext()) {
            this.f33172d += 5;
            J11 = F(J11);
            int i14 = this.f33172d;
            J(J11, 1 << i14, i14, a11);
        }
        return J11;
    }

    private final void L(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i11 = this.f33176h;
        int i12 = i11 >> 5;
        int i13 = this.f33172d;
        if (i12 > (1 << i13)) {
            this.f33174f = M(this.f33172d + 5, F(objArr), objArr2);
            this.f33175g = objArr3;
            this.f33172d += 5;
            this.f33176h++;
            return;
        }
        if (objArr == null) {
            this.f33174f = objArr2;
            this.f33175g = objArr3;
            this.f33176h = i11 + 1;
        } else {
            this.f33174f = M(i13, objArr, objArr2);
            this.f33175g = objArr3;
            this.f33176h++;
        }
    }

    private final Object[] M(int i11, Object[] objArr, Object[] objArr2) {
        int c11 = D.c(getF26995b() - 1, i11);
        Object[] C11 = C(objArr);
        if (i11 == 5) {
            C11[c11] = objArr2;
            return C11;
        }
        C11[c11] = M(i11 - 5, (Object[]) C11[c11], objArr2);
        return C11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int N(Function1 function1, Object[] objArr, int i11, int i12, d dVar, ArrayList arrayList, ArrayList arrayList2) {
        if (A(objArr)) {
            arrayList.add(objArr);
        }
        Object a11 = dVar.a();
        Intrinsics.g(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a11;
        Object[] objArr3 = objArr2;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                if (i12 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : E();
                    i12 = 0;
                }
                objArr3[i12] = obj;
                i12++;
            }
        }
        dVar.b(objArr3);
        if (objArr2 != dVar.a()) {
            arrayList2.add(objArr2);
        }
        return i12;
    }

    private final int O(Function1<? super E, Boolean> function1, Object[] objArr, int i11, d dVar) {
        Object[] objArr2 = objArr;
        int i12 = i11;
        boolean z11 = false;
        for (int i13 = 0; i13 < i11; i13++) {
            Object obj = objArr[i13];
            if (function1.invoke(obj).booleanValue()) {
                if (!z11) {
                    objArr2 = C(objArr);
                    z11 = true;
                    i12 = i13;
                }
            } else if (z11) {
                objArr2[i12] = obj;
                i12++;
            }
        }
        dVar.b(objArr2);
        return i12;
    }

    private final int P(Function1<? super E, Boolean> function1, int i11, d dVar) {
        int O11 = O(function1, this.f33175g, i11, dVar);
        if (O11 == i11) {
            return i11;
        }
        Object a11 = dVar.a();
        Intrinsics.g(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a11;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, O11, i11, (Object) null);
        this.f33175g = objArr;
        this.f33176h -= i11 - O11;
        return O11;
    }

    private final Object[] R(Object[] objArr, int i11, int i12, d dVar) {
        int c11 = D.c(i12, i11);
        if (i11 == 0) {
            Object obj = objArr[c11];
            Object[] C11 = C(objArr);
            C7705l.r(objArr, c11, C11, c11 + 1, 32);
            C11[31] = dVar.a();
            dVar.b(obj);
            return C11;
        }
        int c12 = objArr[31] == null ? D.c(T() - 1, i11) : 31;
        Object[] C12 = C(objArr);
        int i13 = i11 - 5;
        int i14 = c11 + 1;
        if (i14 <= c12) {
            while (true) {
                Object obj2 = C12[c12];
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                C12[c12] = R((Object[]) obj2, i13, 0, dVar);
                if (c12 == i14) {
                    break;
                }
                c12--;
            }
        }
        Object obj3 = C12[c11];
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        C12[c11] = R((Object[]) obj3, i13, i12, dVar);
        return C12;
    }

    private final Object S(Object[] objArr, int i11, int i12, int i13) {
        int i14 = this.f33176h - i11;
        if (i14 == 1) {
            Object obj = this.f33175g[0];
            I(i11, i12, objArr);
            return obj;
        }
        Object[] objArr2 = this.f33175g;
        Object obj2 = objArr2[i13];
        Object[] C11 = C(objArr2);
        C7705l.r(objArr2, i13, C11, i13 + 1, i14);
        C11[i14 - 1] = null;
        this.f33174f = objArr;
        this.f33175g = C11;
        this.f33176h = (i11 + i14) - 1;
        this.f33172d = i12;
        return obj2;
    }

    private final int T() {
        int i11 = this.f33176h;
        if (i11 <= 32) {
            return 0;
        }
        return (i11 - 1) & (-32);
    }

    private final Object[] U(Object[] objArr, int i11, int i12, E e11, d dVar) {
        int c11 = D.c(i12, i11);
        Object[] C11 = C(objArr);
        if (i11 != 0) {
            Object obj = C11[c11];
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            C11[c11] = U((Object[]) obj, i11 - 5, i12, e11, dVar);
            return C11;
        }
        if (C11 != objArr) {
            ((AbstractList) this).modCount++;
        }
        dVar.b(C11[c11]);
        C11[c11] = e11;
        return C11;
    }

    private final void V(Collection<? extends E> collection, int i11, Object[] objArr, int i12, Object[][] objArr2, int i13, Object[] objArr3) {
        Object[] E11;
        if (i13 < 1) {
            B0.a("requires at least one nullBuffer");
            throw null;
        }
        Object[] C11 = C(objArr);
        objArr2[0] = C11;
        int i14 = i11 & 31;
        int size = ((collection.size() + i11) - 1) & 31;
        int i15 = (i12 - i14) + size;
        if (i15 < 32) {
            C7705l.r(C11, size + 1, objArr3, i14, i12);
        } else {
            int i16 = i15 - 31;
            if (i13 == 1) {
                E11 = C11;
            } else {
                E11 = E();
                i13--;
                objArr2[i13] = E11;
            }
            int i17 = i12 - i16;
            C7705l.r(C11, 0, objArr3, i17, i12);
            C7705l.r(C11, size + 1, E11, i14, i17);
            objArr3 = E11;
        }
        Iterator<? extends E> it = collection.iterator();
        h(C11, i14, it);
        for (int i18 = 1; i18 < i13; i18++) {
            Object[] E12 = E();
            h(E12, 0, it);
            objArr2[i18] = E12;
        }
        h(objArr3, 0, it);
    }

    private final int X() {
        int i11 = this.f33176h;
        return i11 <= 32 ? i11 : i11 - ((i11 - 1) & (-32));
    }

    private static void h(Object[] objArr, int i11, Iterator it) {
        while (i11 < 32 && it.hasNext()) {
            objArr[i11] = it.next();
            i11++;
        }
    }

    private final void s(Collection<? extends E> collection, int i11, int i12, Object[][] objArr, int i13, Object[] objArr2) {
        if (this.f33174f == null) {
            throw new IllegalStateException("root is null");
        }
        int i14 = i11 >> 5;
        W0.a B11 = B(T() >> 5);
        int i15 = i13;
        Object[] objArr3 = objArr2;
        while (B11.previousIndex() != i14) {
            Object[] objArr4 = (Object[]) B11.previous();
            C7705l.r(objArr4, 0, objArr3, 32 - i12, 32);
            objArr3 = D(i12, objArr4);
            i15--;
            objArr[i15] = objArr3;
        }
        Object[] objArr5 = (Object[]) B11.previous();
        int T11 = i13 - (((T() >> 5) - 1) - i14);
        if (T11 < i13) {
            objArr2 = objArr[T11];
            Intrinsics.f(objArr2);
        }
        V(collection, i11, objArr5, 32, objArr, T11, objArr2);
    }

    private final Object[] u(Object[] objArr, int i11, int i12, Object obj, d dVar) {
        Object obj2;
        int c11 = D.c(i12, i11);
        if (i11 == 0) {
            dVar.b(objArr[31]);
            Object[] C11 = C(objArr);
            C7705l.r(objArr, c11 + 1, C11, c11, 31);
            C11[c11] = obj;
            return C11;
        }
        Object[] C12 = C(objArr);
        int i13 = i11 - 5;
        Object obj3 = C12[c11];
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        C12[c11] = u((Object[]) obj3, i13, i12, obj, dVar);
        while (true) {
            c11++;
            if (c11 >= 32 || (obj2 = C12[c11]) == null) {
                break;
            }
            C12[c11] = u((Object[]) obj2, i13, 0, dVar.a(), dVar);
        }
        return C12;
    }

    private final void v(Object obj, Object[] objArr, int i11) {
        int X9 = X();
        Object[] C11 = C(this.f33175g);
        if (X9 < 32) {
            C7705l.r(this.f33175g, i11 + 1, C11, i11, X9);
            C11[i11] = obj;
            this.f33174f = objArr;
            this.f33175g = C11;
            this.f33176h++;
            return;
        }
        Object[] objArr2 = this.f33175g;
        Object obj2 = objArr2[31];
        C7705l.r(objArr2, i11 + 1, C11, i11, 31);
        C11[i11] = obj;
        L(objArr, C11, F(obj2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (P(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Q(@NotNull Function1<? super E, Boolean> function1) {
        Object[] J11;
        int i11;
        Function1<? super E, Boolean> function12 = function1;
        int X9 = X();
        Object[] objArr = null;
        d dVar = new d(null);
        boolean z11 = false;
        if (this.f33174f != null) {
            W0.a B11 = B(0);
            int i12 = 32;
            while (i12 == 32 && B11.hasNext()) {
                i12 = O(function12, (Object[]) B11.next(), 32, dVar);
            }
            if (i12 == 32) {
                int P11 = P(function12, X9, dVar);
                if (P11 == 0) {
                    I(this.f33176h, this.f33172d, this.f33174f);
                }
            } else {
                int previousIndex = B11.previousIndex() << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i13 = i12;
                while (B11.hasNext()) {
                    i13 = N(function12, (Object[]) B11.next(), 32, i13, dVar, arrayList2, arrayList);
                    function12 = function1;
                }
                int N11 = N(function1, this.f33175g, X9, i13, dVar, arrayList2, arrayList);
                Object a11 = dVar.a();
                Intrinsics.g(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr2 = (Object[]) a11;
                Intrinsics.checkNotNullParameter(objArr2, "<this>");
                Arrays.fill(objArr2, N11, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    J11 = this.f33174f;
                    Intrinsics.f(J11);
                } else {
                    J11 = J(this.f33174f, previousIndex, this.f33172d, arrayList.iterator());
                }
                int size = previousIndex + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    B0.a("invalid size");
                    throw null;
                }
                if (size == 0) {
                    this.f33172d = 0;
                } else {
                    int i14 = size - 1;
                    while (true) {
                        i11 = this.f33172d;
                        if ((i14 >> i11) != 0) {
                            break;
                        }
                        this.f33172d = i11 - 5;
                        Object[] objArr3 = J11[0];
                        Intrinsics.g(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        J11 = objArr3;
                    }
                    objArr = G(i14, i11, J11);
                }
                this.f33174f = objArr;
                this.f33175g = objArr2;
                this.f33176h = size + N11;
            }
            z11 = true;
            if (z11) {
                ((AbstractList) this).modCount++;
            }
            return z11;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, E e11) {
        j0.e(i11, this.f33176h);
        if (i11 == this.f33176h) {
            add(e11);
            return;
        }
        ((AbstractList) this).modCount++;
        int T11 = T();
        if (i11 >= T11) {
            v(e11, this.f33174f, i11 - T11);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.f33174f;
        Intrinsics.f(objArr);
        v(dVar.a(), u(objArr, this.f33172d, i11, e11, dVar), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, @NotNull Collection<? extends E> collection) {
        Collection<? extends E> collection2;
        f<E> fVar;
        Object[] E11;
        j0.e(i11, this.f33176h);
        if (i11 == this.f33176h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i12 = (i11 >> 5) << 5;
        int size = ((collection.size() + (this.f33176h - i12)) - 1) / 32;
        if (size == 0) {
            int i13 = i11 & 31;
            int size2 = ((collection.size() + i11) - 1) & 31;
            Object[] objArr = this.f33175g;
            Object[] C11 = C(objArr);
            C7705l.r(objArr, size2 + 1, C11, i13, X());
            h(C11, i13, collection.iterator());
            this.f33175g = C11;
            this.f33176h = collection.size() + this.f33176h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int X9 = X();
        int size3 = collection.size() + this.f33176h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i11 >= T()) {
            E11 = E();
            collection2 = collection;
            V(collection2, i11, this.f33175g, X9, objArr2, size, E11);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > X9) {
                int i14 = size3 - X9;
                Object[] D11 = D(i14, fVar.f33175g);
                fVar.s(collection2, i11, i14, objArr2, size, D11);
                objArr2 = objArr2;
                E11 = D11;
            } else {
                Object[] objArr3 = fVar.f33175g;
                E11 = E();
                int i15 = X9 - size3;
                C7705l.r(objArr3, 0, E11, i15, X9);
                int i16 = 32 - i15;
                Object[] D12 = D(i16, fVar.f33175g);
                int i17 = size - 1;
                objArr2[i17] = D12;
                fVar.s(collection2, i11, i16, objArr2, i17, D12);
                collection2 = collection2;
            }
        }
        fVar.f33174f = K(fVar.f33174f, i12, objArr2);
        fVar.f33175g = E11;
        fVar.f33176h = collection2.size() + fVar.f33176h;
        return true;
    }

    @Override // kotlin.collections.AbstractC7699f
    public final E b(int i11) {
        j0.d(i11, getF26995b());
        ((AbstractList) this).modCount++;
        int T11 = T();
        if (i11 >= T11) {
            return (E) S(this.f33174f, T11, this.f33172d, i11 - T11);
        }
        d dVar = new d(this.f33175g[0]);
        Object[] objArr = this.f33174f;
        Intrinsics.f(objArr);
        S(R(objArr, this.f33172d, i11, dVar), T11, this.f33172d, 0);
        return (E) dVar.a();
    }

    @NotNull
    public final V0.c<E> e() {
        e eVar;
        j jVar;
        Object[] objArr = this.f33174f;
        if (objArr == this.f33170b && this.f33175g == this.f33171c) {
            eVar = this.f33169a;
        } else {
            this.f33173e = new k0();
            this.f33170b = objArr;
            Object[] objArr2 = this.f33175g;
            this.f33171c = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f33174f;
                Intrinsics.f(objArr3);
                eVar = new e(objArr3, this.f33175g, getF26995b(), this.f33172d);
            } else if (objArr2.length == 0) {
                jVar = j.f33185c;
                eVar = jVar;
            } else {
                Object[] copyOf = Arrays.copyOf(this.f33175g, getF26995b());
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                eVar = new j(copyOf);
            }
        }
        this.f33169a = eVar;
        return (V0.c<E>) eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i11) {
        Object[] objArr;
        j0.d(i11, getF26995b());
        if (T() <= i11) {
            objArr = this.f33175g;
        } else {
            objArr = this.f33174f;
            Intrinsics.f(objArr);
            for (int i12 = this.f33172d; i12 > 0; i12 -= 5) {
                Object obj = objArr[D.c(i11, i12)];
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i11 & 31];
    }

    @Override // kotlin.collections.AbstractC7699f
    /* renamed from: getSize */
    public final int getF26995b() {
        return this.f33176h;
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final Object[] l() {
        return this.f33174f;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final ListIterator<E> listIterator(int i11) {
        j0.e(i11, this.f33176h);
        return new h(this, i11);
    }

    public final int m() {
        return this.f33172d;
    }

    @NotNull
    public final Object[] n() {
        return this.f33175g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
        return Q(new a(collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i11, E e11) {
        j0.d(i11, getF26995b());
        if (T() > i11) {
            d dVar = new d(null);
            Object[] objArr = this.f33174f;
            Intrinsics.f(objArr);
            this.f33174f = U(objArr, this.f33172d, i11, e11, dVar);
            return (E) dVar.a();
        }
        Object[] C11 = C(this.f33175g);
        if (C11 != this.f33175g) {
            ((AbstractList) this).modCount++;
        }
        int i12 = i11 & 31;
        E e12 = (E) C11[i12];
        C11[i12] = e11;
        this.f33175g = C11;
        return e12;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e11) {
        ((AbstractList) this).modCount++;
        int X9 = X();
        if (X9 < 32) {
            Object[] C11 = C(this.f33175g);
            C11[X9] = e11;
            this.f33175g = C11;
            this.f33176h = getF26995b() + 1;
        } else {
            L(this.f33174f, this.f33175g, F(e11));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(@NotNull Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int X9 = X();
        Iterator<? extends E> it = collection.iterator();
        if (32 - X9 >= collection.size()) {
            Object[] C11 = C(this.f33175g);
            h(C11, X9, it);
            this.f33175g = C11;
            this.f33176h = collection.size() + this.f33176h;
            return true;
        }
        int size = ((collection.size() + X9) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] C12 = C(this.f33175g);
        h(C12, X9, it);
        objArr[0] = C12;
        for (int i11 = 1; i11 < size; i11++) {
            Object[] E11 = E();
            h(E11, 0, it);
            objArr[i11] = E11;
        }
        this.f33174f = K(this.f33174f, T(), objArr);
        Object[] E12 = E();
        h(E12, 0, it);
        this.f33175g = E12;
        this.f33176h = collection.size() + this.f33176h;
        return true;
    }
}
