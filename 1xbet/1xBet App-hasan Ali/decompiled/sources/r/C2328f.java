package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import s.AbstractC2351a;

/* renamed from: r.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2328f implements Collection, Set, j4.b, j4.e {

    /* renamed from: k, reason: collision with root package name */
    public int[] f18994k = AbstractC2351a.f19149a;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f18995l = AbstractC2351a.f19151c;

    /* renamed from: m, reason: collision with root package name */
    public int f18996m;

    public C2328f(int i) {
        if (i > 0) {
            AbstractC2339q.b(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int c5;
        int i5 = this.f18996m;
        if (obj == null) {
            c5 = AbstractC2339q.c(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            c5 = AbstractC2339q.c(this, obj, hashCode);
        }
        if (c5 >= 0) {
            return false;
        }
        int i6 = ~c5;
        int[] iArr = this.f18994k;
        if (i5 >= iArr.length) {
            int i7 = 8;
            if (i5 >= 8) {
                i7 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f18995l;
            AbstractC2339q.b(this, i7);
            if (i5 != this.f18996m) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f18994k;
            if (iArr2.length != 0) {
                X3.l.x0(0, iArr.length, 6, iArr, iArr2);
                X3.l.y0(0, objArr.length, 6, objArr, this.f18995l);
            }
        }
        if (i6 < i5) {
            int[] iArr3 = this.f18994k;
            int i8 = i6 + 1;
            X3.l.s0(i8, i6, i5, iArr3, iArr3);
            Object[] objArr2 = this.f18995l;
            X3.l.t0(i8, i6, i5, objArr2, objArr2);
        }
        int i9 = this.f18996m;
        if (i5 == i9) {
            int[] iArr4 = this.f18994k;
            if (i6 < iArr4.length) {
                iArr4[i6] = i;
                this.f18995l[i6] = obj;
                this.f18996m = i9 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        int size = collection.size() + this.f18996m;
        int i = this.f18996m;
        int[] iArr = this.f18994k;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f18995l;
            AbstractC2339q.b(this, size);
            int i5 = this.f18996m;
            if (i5 > 0) {
                X3.l.x0(0, i5, 6, iArr, this.f18994k);
                X3.l.y0(0, this.f18996m, 6, objArr, this.f18995l);
            }
        }
        if (this.f18996m != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z3 |= add(it.next());
        }
        return z3;
    }

    public final Object c(int i) {
        int i5 = this.f18996m;
        Object[] objArr = this.f18995l;
        Object obj = objArr[i];
        if (i5 <= 1) {
            clear();
            return obj;
        }
        int i6 = i5 - 1;
        int[] iArr = this.f18994k;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            if (i < i6) {
                int i7 = i + 1;
                X3.l.s0(i, i7, i5, iArr, iArr);
                Object[] objArr2 = this.f18995l;
                X3.l.t0(i, i7, i5, objArr2, objArr2);
            }
            this.f18995l[i6] = null;
        } else {
            AbstractC2339q.b(this, i5 > 8 ? i5 + (i5 >> 1) : 8);
            if (i > 0) {
                X3.l.x0(0, i, 6, iArr, this.f18994k);
                X3.l.y0(0, i, 6, objArr, this.f18995l);
            }
            if (i < i6) {
                int i8 = i + 1;
                X3.l.s0(i, i8, i5, iArr, this.f18994k);
                X3.l.t0(i, i8, i5, objArr, this.f18995l);
            }
        }
        if (i5 != this.f18996m) {
            throw new ConcurrentModificationException();
        }
        this.f18996m = i6;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f18996m != 0) {
            this.f18994k = AbstractC2351a.f19149a;
            this.f18995l = AbstractC2351a.f19151c;
            this.f18996m = 0;
        }
        if (this.f18996m != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC2339q.c(this, null, 0) : AbstractC2339q.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f18996m != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f18996m;
            for (int i5 = 0; i5 < i; i5++) {
                if (!((Set) obj).contains(this.f18995l[i5])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f18994k;
        int i = this.f18996m;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f18996m <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2323a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c5 = obj == null ? AbstractC2339q.c(this, null, 0) : AbstractC2339q.c(this, obj, obj.hashCode());
        if (c5 < 0) {
            return false;
        }
        c(c5);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        boolean z3 = false;
        for (int i = this.f18996m - 1; -1 < i; i--) {
            if (!X3.m.V(collection, this.f18995l[i])) {
                c(i);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f18996m;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return X3.l.A0(this.f18995l, 0, this.f18996m);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f18996m * 14);
        sb.append('{');
        int i = this.f18996m;
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = this.f18995l[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", sb2);
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.l.f("array", objArr);
        int i = this.f18996m;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        X3.l.t0(0, 0, this.f18996m, this.f18995l, objArr);
        return objArr;
    }
}
