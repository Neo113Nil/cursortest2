package Gc;

import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class l<T> {

    /* renamed from: a, reason: collision with root package name */
    int f9911a;

    /* renamed from: b, reason: collision with root package name */
    int f9912b;

    /* renamed from: c, reason: collision with root package name */
    int f9913c;

    /* renamed from: d, reason: collision with root package name */
    T[] f9914d;

    public l() {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        this.f9911a = numberOfLeadingZeros - 1;
        this.f9913c = (int) (0.75f * numberOfLeadingZeros);
        this.f9914d = (T[]) new Object[numberOfLeadingZeros];
    }

    public final void a(InterfaceC8487b interfaceC8487b) {
        T t2;
        Object obj;
        Object[] objArr = this.f9914d;
        int i11 = this.f9911a;
        int hashCode = interfaceC8487b.hashCode() * (-1640531527);
        int i12 = (hashCode ^ (hashCode >>> 16)) & i11;
        Object obj2 = objArr[i12];
        if (obj2 != null) {
            if (obj2.equals(interfaceC8487b)) {
                return;
            }
            do {
                i12 = (i12 + 1) & i11;
                obj = objArr[i12];
                if (obj == null) {
                }
            } while (!obj.equals(interfaceC8487b));
            return;
        }
        objArr[i12] = interfaceC8487b;
        int i13 = this.f9912b + 1;
        this.f9912b = i13;
        if (i13 < this.f9913c) {
            return;
        }
        T[] tArr = this.f9914d;
        int length = tArr.length;
        int i14 = length << 1;
        int i15 = i14 - 1;
        T[] tArr2 = (T[]) new Object[i14];
        while (true) {
            int i16 = i13 - 1;
            if (i13 == 0) {
                this.f9911a = i15;
                this.f9913c = (int) (i14 * 0.75f);
                this.f9914d = tArr2;
                return;
            }
            do {
                length--;
                t2 = tArr[length];
            } while (t2 == null);
            int hashCode2 = t2.hashCode() * (-1640531527);
            int i17 = (hashCode2 ^ (hashCode2 >>> 16)) & i15;
            if (tArr2[i17] != null) {
                do {
                    i17 = (i17 + 1) & i15;
                } while (tArr2[i17] != null);
            }
            tArr2[i17] = tArr[length];
            i13 = i16;
        }
    }

    public final Object[] b() {
        return this.f9914d;
    }

    public final boolean c(InterfaceC8487b interfaceC8487b) {
        T t2;
        T[] tArr = this.f9914d;
        int i11 = this.f9911a;
        int hashCode = interfaceC8487b.hashCode() * (-1640531527);
        int i12 = (hashCode ^ (hashCode >>> 16)) & i11;
        T t11 = tArr[i12];
        if (t11 == null) {
            return false;
        }
        if (t11.equals(interfaceC8487b)) {
            d(i12, i11, tArr);
            return true;
        }
        do {
            i12 = (i12 + 1) & i11;
            t2 = tArr[i12];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(interfaceC8487b));
        d(i12, i11, tArr);
        return true;
    }

    final void d(int i11, int i12, Object[] objArr) {
        int i13;
        Object obj;
        this.f9912b--;
        while (true) {
            int i14 = i11 + 1;
            while (true) {
                i13 = i14 & i12;
                obj = objArr[i13];
                if (obj == null) {
                    objArr[i11] = null;
                    return;
                }
                int hashCode = obj.hashCode() * (-1640531527);
                int i15 = (hashCode ^ (hashCode >>> 16)) & i12;
                if (i11 > i13) {
                    if (i11 >= i15 && i15 > i13) {
                        break;
                    }
                    i14 = i13 + 1;
                } else if (i11 < i15 && i15 <= i13) {
                    i14 = i13 + 1;
                }
            }
            objArr[i11] = obj;
            i11 = i13;
        }
    }

    public final int e() {
        return this.f9912b;
    }
}
