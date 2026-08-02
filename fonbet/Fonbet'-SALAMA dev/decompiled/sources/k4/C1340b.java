package k4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: k4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1340b extends AbstractC1341c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f14770a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f14771b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparator f14772c;

    public C1340b(Comparator comparator) {
        this.f14770a = new Object[0];
        this.f14771b = new Object[0];
        this.f14772c = comparator;
    }

    public static C1340b G(List list, Map map, Comparator comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i7 = 0;
        for (Object obj : list) {
            objArr[i7] = obj;
            objArr2[i7] = map.get(obj);
            i7++;
        }
        return new C1340b(comparator, objArr, objArr2);
    }

    @Override // k4.AbstractC1341c
    public final Object A(Object obj) {
        int H7 = H(obj);
        if (H7 == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (H7 <= 0) {
            return null;
        }
        return this.f14770a[H7 - 1];
    }

    @Override // k4.AbstractC1341c
    public final void B(Q0.a aVar) {
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f14770a;
            if (i7 >= objArr.length) {
                return;
            }
            aVar.c0(objArr[i7], this.f14771b[i7]);
            i7++;
        }
    }

    @Override // k4.AbstractC1341c
    public final int C(H4.k kVar) {
        return H(kVar);
    }

    @Override // k4.AbstractC1341c
    public final AbstractC1341c D(Object obj, Object obj2) {
        int H7 = H(obj);
        Object[] objArr = this.f14771b;
        Object[] objArr2 = this.f14770a;
        Comparator comparator = this.f14772c;
        if (H7 != -1) {
            if (objArr2[H7] == obj && objArr[H7] == obj2) {
                return this;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr3[H7] = obj;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[length2];
            System.arraycopy(objArr, 0, objArr4, 0, length2);
            objArr4[H7] = obj2;
            return new C1340b(comparator, objArr3, objArr4);
        }
        if (objArr2.length > 25) {
            HashMap hashMap = new HashMap(objArr2.length + 1);
            for (int i7 = 0; i7 < objArr2.length; i7++) {
                hashMap.put(objArr2[i7], objArr[i7]);
            }
            hashMap.put(obj, obj2);
            return k1.g.h(new ArrayList(hashMap.keySet()), hashMap, comparator);
        }
        int i8 = 0;
        while (i8 < objArr2.length && comparator.compare(objArr2[i8], obj) < 0) {
            i8++;
        }
        Object[] objArr5 = new Object[objArr2.length + 1];
        System.arraycopy(objArr2, 0, objArr5, 0, i8);
        objArr5[i8] = obj;
        int i9 = i8 + 1;
        System.arraycopy(objArr2, i8, objArr5, i9, (r4 - i8) - 1);
        Object[] objArr6 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr6, 0, i8);
        objArr6[i8] = obj2;
        System.arraycopy(objArr, i8, objArr6, i9, (r2 - i8) - 1);
        return new C1340b(comparator, objArr5, objArr6);
    }

    @Override // k4.AbstractC1341c
    public final Iterator E(Object obj) {
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f14770a;
            if (i7 >= objArr.length || this.f14772c.compare(objArr[i7], obj) >= 0) {
                break;
            }
            i7++;
        }
        return new C1339a(this, i7, false);
    }

    @Override // k4.AbstractC1341c
    public final AbstractC1341c F(Object obj) {
        int H7 = H(obj);
        if (H7 == -1) {
            return this;
        }
        Object[] objArr = this.f14770a;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, H7);
        int i7 = H7 + 1;
        System.arraycopy(objArr, i7, objArr2, H7, length - H7);
        Object[] objArr3 = this.f14771b;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, H7);
        System.arraycopy(objArr3, i7, objArr4, H7, length2 - H7);
        return new C1340b(this.f14772c, objArr2, objArr4);
    }

    public final int H(Object obj) {
        int i7 = 0;
        for (Object obj2 : this.f14770a) {
            if (this.f14772c.compare(obj, obj2) == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // k4.AbstractC1341c
    public final boolean isEmpty() {
        return this.f14770a.length == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1339a(this, 0, false);
    }

    @Override // k4.AbstractC1341c
    public final boolean l(Object obj) {
        return H(obj) != -1;
    }

    @Override // k4.AbstractC1341c
    public final Object m(Comparable comparable) {
        int H7 = H(comparable);
        if (H7 != -1) {
            return this.f14771b[H7];
        }
        return null;
    }

    @Override // k4.AbstractC1341c
    public final int size() {
        return this.f14770a.length;
    }

    @Override // k4.AbstractC1341c
    public final Comparator t() {
        return this.f14772c;
    }

    @Override // k4.AbstractC1341c
    public final Iterator w() {
        return new C1339a(this, this.f14770a.length - 1, true);
    }

    @Override // k4.AbstractC1341c
    public final Object y() {
        Object[] objArr = this.f14770a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // k4.AbstractC1341c
    public final Object z() {
        Object[] objArr = this.f14770a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    public C1340b(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f14770a = objArr;
        this.f14771b = objArr2;
        this.f14772c = comparator;
    }
}
