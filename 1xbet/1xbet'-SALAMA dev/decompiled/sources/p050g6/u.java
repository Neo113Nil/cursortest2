package p050g6;

import W5.AbstractC0486a1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import p031e1.k;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends d implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f13316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13319d;

    public u(Object[] objArr, int i7) {
        this.f13316a = objArr;
        if (i7 < 0) {
            throw new IllegalArgumentException(k.d(i7, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i7 <= objArr.length) {
            this.f13317b = objArr.length;
            this.f13319d = i7;
        } else {
            StringBuilder sbJ = AbstractC0486a1.j(i7, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbJ.append(objArr.length);
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int iL = l();
        if (i7 < 0 || i7 >= iL) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, iL, "index: ", ", size: "));
        }
        return this.f13316a[(this.f13318c + i7) % this.f13317b];
    }

    @Override // p050g6.d, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new t(this);
    }

    @Override // p050g6.d
    public final int l() {
        return this.f13319d;
    }

    public final void m() {
        if (20 > this.f13319d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.f13319d).toString());
        }
        int i7 = this.f13318c;
        int i8 = this.f13317b;
        int i9 = (i7 + 20) % i8;
        Object[] objArr = this.f13316a;
        if (i7 > i9) {
            g.s0(objArr, i7, i8);
            g.s0(objArr, 0, i9);
        } else {
            g.s0(objArr, i7, i9);
        }
        this.f13318c = i9;
        this.f13319d -= 20;
    }

    @Override // p050g6.d, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[l()]);
    }

    @Override // p050g6.d, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        h.e(objArr, "array");
        int length = objArr.length;
        int i7 = this.f13319d;
        if (length < i7) {
            objArr = Arrays.copyOf(objArr, i7);
            h.d(objArr, "copyOf(...)");
        }
        int i8 = this.f13319d;
        int i9 = this.f13318c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            objArr2 = this.f13316a;
            if (i11 >= i8 || i9 >= this.f13317b) {
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
