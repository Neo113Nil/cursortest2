package g6;

import W5.AbstractC0486a1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: g6.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1172u extends AbstractC1155d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f13310a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13311b;

    /* renamed from: c, reason: collision with root package name */
    public int f13312c;

    /* renamed from: d, reason: collision with root package name */
    public int f13313d;

    public C1172u(Object[] objArr, int i7) {
        this.f13310a = objArr;
        if (i7 < 0) {
            throw new IllegalArgumentException(e1.k.d(i7, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i7 <= objArr.length) {
            this.f13311b = objArr.length;
            this.f13313d = i7;
        } else {
            StringBuilder j = AbstractC0486a1.j(i7, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            j.append(objArr.length);
            throw new IllegalArgumentException(j.toString().toString());
        }
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int l7 = l();
        if (i7 < 0 || i7 >= l7) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, l7, "index: ", ", size: "));
        }
        return this.f13310a[(this.f13312c + i7) % this.f13311b];
    }

    @Override // g6.AbstractC1155d, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1171t(this);
    }

    @Override // g6.AbstractC1155d
    public final int l() {
        return this.f13313d;
    }

    public final void m() {
        if (20 > this.f13313d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.f13313d).toString());
        }
        int i7 = this.f13312c;
        int i8 = this.f13311b;
        int i9 = (i7 + 20) % i8;
        Object[] objArr = this.f13310a;
        if (i7 > i9) {
            AbstractC1158g.s0(objArr, i7, i8);
            AbstractC1158g.s0(objArr, 0, i9);
        } else {
            AbstractC1158g.s0(objArr, i7, i9);
        }
        this.f13312c = i9;
        this.f13313d -= 20;
    }

    @Override // g6.AbstractC1155d, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[l()]);
    }

    @Override // g6.AbstractC1155d, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        t6.h.e(objArr, "array");
        int length = objArr.length;
        int i7 = this.f13313d;
        if (length < i7) {
            objArr = Arrays.copyOf(objArr, i7);
            t6.h.d(objArr, "copyOf(...)");
        }
        int i8 = this.f13313d;
        int i9 = this.f13312c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            objArr2 = this.f13310a;
            if (i11 >= i8 || i9 >= this.f13311b) {
                break;
            }
            objArr[i11] = objArr2[i9];
            i11++;
            i9++;
        }
        while (i11 < i8) {
            objArr[i11] = objArr2[i10];
            i11++;
            i10++;
        }
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }
}
