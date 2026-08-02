package androidx.collection;

import gd.InterfaceC6713b;
import gd.InterfaceC6716e;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import k0.C7445a;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.collection.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5133b<E> implements Collection<E>, Set<E>, InterfaceC6713b, InterfaceC6716e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f38688a = C7445a.f70244a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Object[] f38689b = C7445a.f70246c;

    /* renamed from: c, reason: collision with root package name */
    private int f38690c;

    /* renamed from: androidx.collection.b$a */
    private final class a extends AbstractC5139h<E> {
        public a() {
            super(C5133b.this.e());
        }

        @Override // androidx.collection.AbstractC5139h
        protected final E b(int i11) {
            return C5133b.this.l(i11);
        }

        @Override // androidx.collection.AbstractC5139h
        protected final void c(int i11) {
            C5133b.this.h(i11);
        }
    }

    public C5133b(int i11) {
        if (i11 > 0) {
            C5135d.a(this, i11);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e11) {
        int i11;
        int b11;
        int i12 = this.f38690c;
        if (e11 == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            b11 = C5135d.b(this, null, 0);
            i11 = 0;
        } else {
            int hashCode = e11.hashCode();
            i11 = hashCode;
            b11 = C5135d.b(this, e11, hashCode);
        }
        if (b11 >= 0) {
            return false;
        }
        int i13 = ~b11;
        int[] iArr = this.f38688a;
        if (i12 >= iArr.length) {
            int i14 = 8;
            if (i12 >= 8) {
                i14 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i14 = 4;
            }
            Object[] objArr = this.f38689b;
            C5135d.a(this, i14);
            if (i12 != this.f38690c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f38688a;
            if (iArr2.length != 0) {
                C7705l.t(0, iArr.length, iArr, iArr2, 6);
                C7705l.u(objArr, 0, this.f38689b, objArr.length, 6);
            }
        }
        if (i13 < i12) {
            int[] iArr3 = this.f38688a;
            int i15 = i13 + 1;
            C7705l.p(i15, i13, iArr3, iArr3, i12);
            Object[] objArr2 = this.f38689b;
            C7705l.r(objArr2, i15, objArr2, i13, i12);
        }
        int i16 = this.f38690c;
        if (i12 == i16) {
            int[] iArr4 = this.f38688a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i11;
                this.f38689b[i13] = e11;
                this.f38690c = i16 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size() + this.f38690c;
        int i11 = this.f38690c;
        int[] iArr = this.f38688a;
        boolean z11 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f38689b;
            C5135d.a(this, size);
            int i12 = this.f38690c;
            if (i12 > 0) {
                C7705l.t(0, i12, iArr, this.f38688a, 6);
                C7705l.u(objArr, 0, this.f38689b, this.f38690c, 6);
            }
        }
        if (this.f38690c != i11) {
            throw new ConcurrentModificationException();
        }
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            z11 |= add(it.next());
        }
        return z11;
    }

    @NotNull
    public final Object[] b() {
        return this.f38689b;
    }

    @NotNull
    public final int[] c() {
        return this.f38688a;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f38690c != 0) {
            int[] iArr = C7445a.f70244a;
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f38688a = iArr;
            Object[] objArr = C7445a.f70246c;
            Intrinsics.checkNotNullParameter(objArr, "<set-?>");
            this.f38689b = objArr;
            this.f38690c = 0;
        }
        if (this.f38690c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int b11;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            b11 = C5135d.b(this, null, 0);
        } else {
            b11 = C5135d.b(this, obj, obj.hashCode());
        }
        return b11 >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int e() {
        return this.f38690c;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f38690c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i11 = this.f38690c;
            for (int i12 = 0; i12 < i11; i12++) {
                if (!((Set) obj).contains(this.f38689b[i12])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final E h(int i11) {
        int i12 = this.f38690c;
        Object[] objArr = this.f38689b;
        E e11 = (E) objArr[i11];
        if (i12 <= 1) {
            clear();
            return e11;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f38688a;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i11 < i13) {
                int i14 = i11 + 1;
                C7705l.p(i11, i14, iArr, iArr, i12);
                Object[] objArr2 = this.f38689b;
                C7705l.r(objArr2, i11, objArr2, i14, i12);
            }
            this.f38689b[i13] = null;
        } else {
            C5135d.a(this, i12 > 8 ? i12 + (i12 >> 1) : 8);
            if (i11 > 0) {
                C7705l.t(0, i11, iArr, this.f38688a, 6);
                C7705l.u(objArr, 0, this.f38689b, i11, 6);
            }
            if (i11 < i13) {
                int i15 = i11 + 1;
                C7705l.p(i11, i15, iArr, this.f38688a, i12);
                C7705l.r(objArr, i11, this.f38689b, i15, i12);
            }
        }
        if (i12 != this.f38690c) {
            throw new ConcurrentModificationException();
        }
        this.f38690c = i13;
        return e11;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f38688a;
        int i11 = this.f38690c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += iArr[i13];
        }
        return i12;
    }

    public final void i(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f38689b = objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f38690c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public final Iterator<E> iterator() {
        return new a();
    }

    public final void k(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f38688a = iArr;
    }

    public final E l(int i11) {
        return (E) this.f38689b[i11];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b11;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            b11 = C5135d.b(this, null, 0);
        } else {
            b11 = C5135d.b(this, obj, obj.hashCode());
        }
        if (b11 < 0) {
            return false;
        }
        h(b11);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= remove(it.next());
        }
        return z11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z11 = false;
        for (int i11 = this.f38690c - 1; -1 < i11; i11--) {
            if (!C7714v.A(elements, this.f38689b[i11])) {
                h(i11);
                z11 = true;
            }
        }
        return z11;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f38690c;
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final Object[] toArray() {
        return C7705l.w(0, this.f38690c, this.f38689b);
    }

    @NotNull
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f38690c * 14);
        sb2.append('{');
        int i11 = this.f38690c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f38689b[i12];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        T[] result = (T[]) C5134c.a(this.f38690c, array);
        C7705l.r(this.f38689b, 0, result, 0, this.f38690c);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
