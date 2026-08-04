package p075k4;

import H4.k;
import Q0.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p072k1.g;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f14776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f14777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Comparator f14778c;

    public b(Comparator comparator) {
        this.f14776a = new Object[0];
        this.f14777b = new Object[0];
        this.f14778c = comparator;
    }

    public static b G(List list, Map map, Comparator comparator) {
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
        return new b(comparator, objArr, objArr2);
    }

    @Override // p075k4.c
    public final Object A(Object obj) {
        int iH = H(obj);
        if (iH == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (iH <= 0) {
            return null;
        }
        return this.f14776a[iH - 1];
    }

    @Override // p075k4.c
    public final void B(a aVar) {
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f14776a;
            if (i7 >= objArr.length) {
                return;
            }
            aVar.c0(objArr[i7], this.f14777b[i7]);
            i7++;
        }
    }

    @Override // p075k4.c
    public final int C(k kVar) {
        return H(kVar);
    }

    @Override // p075k4.c
    public final c D(Object obj, Object obj2) {
        int iH = H(obj);
        Object[] objArr = this.f14777b;
        Object[] objArr2 = this.f14776a;
        Comparator comparator = this.f14778c;
        if (iH != -1) {
            if (objArr2[iH] == obj && objArr[iH] == obj2) {
                return this;
            }
            int length = objArr2.length;
            Object[] objArr3 = new Object[length];
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            objArr3[iH] = obj;
            int length2 = objArr.length;
            Object[] objArr4 = new Object[length2];
            System.arraycopy(objArr, 0, objArr4, 0, length2);
            objArr4[iH] = obj2;
            return new b(comparator, objArr3, objArr4);
        }
        if (objArr2.length > 25) {
            HashMap map = new HashMap(objArr2.length + 1);
            for (int i7 = 0; i7 < objArr2.length; i7++) {
                map.put(objArr2[i7], objArr[i7]);
            }
            map.put(obj, obj2);
            return g.h(new ArrayList(map.keySet()), map, comparator);
        }
        int i8 = 0;
        while (i8 < objArr2.length && comparator.compare(objArr2[i8], obj) < 0) {
            i8++;
        }
        int length3 = objArr2.length + 1;
        Object[] objArr5 = new Object[length3];
        System.arraycopy(objArr2, 0, objArr5, 0, i8);
        objArr5[i8] = obj;
        int i9 = i8 + 1;
        System.arraycopy(objArr2, i8, objArr5, i9, (length3 - i8) - 1);
        int length4 = objArr.length + 1;
        Object[] objArr6 = new Object[length4];
        System.arraycopy(objArr, 0, objArr6, 0, i8);
        objArr6[i8] = obj2;
        System.arraycopy(objArr, i8, objArr6, i9, (length4 - i8) - 1);
        return new b(comparator, objArr5, objArr6);
    }

    @Override // p075k4.c
    public final Iterator E(Object obj) {
        int i7 = 0;
        while (true) {
            Object[] objArr = this.f14776a;
            if (i7 >= objArr.length || this.f14778c.compare(objArr[i7], obj) >= 0) {
                break;
            }
            i7++;
        }
        return new a(this, i7, false);
    }

    @Override // p075k4.c
    public final c F(Object obj) {
        int iH = H(obj);
        if (iH == -1) {
            return this;
        }
        Object[] objArr = this.f14776a;
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, iH);
        int i7 = iH + 1;
        System.arraycopy(objArr, i7, objArr2, iH, length - iH);
        Object[] objArr3 = this.f14777b;
        int length2 = objArr3.length - 1;
        Object[] objArr4 = new Object[length2];
        System.arraycopy(objArr3, 0, objArr4, 0, iH);
        System.arraycopy(objArr3, i7, objArr4, iH, length2 - iH);
        return new b(this.f14778c, objArr2, objArr4);
    }

    public final int H(Object obj) {
        int i7 = 0;
        for (Object obj2 : this.f14776a) {
            if (this.f14778c.compare(obj, obj2) == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // p075k4.c
    public final boolean isEmpty() {
        return this.f14776a.length == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a(this, 0, false);
    }

    @Override // p075k4.c
    public final boolean l(Object obj) {
        return H(obj) != -1;
    }

    @Override // p075k4.c
    public final Object m(Comparable comparable) {
        int iH = H(comparable);
        if (iH != -1) {
            return this.f14777b[iH];
        }
        return null;
    }

    @Override // p075k4.c
    public final int size() {
        return this.f14776a.length;
    }

    @Override // p075k4.c
    public final Comparator t() {
        return this.f14778c;
    }

    @Override // p075k4.c
    public final Iterator w() {
        return new a(this, this.f14776a.length - 1, true);
    }

    @Override // p075k4.c
    public final Object y() {
        Object[] objArr = this.f14776a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    @Override // p075k4.c
    public final Object z() {
        Object[] objArr = this.f14776a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    public b(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f14776a = objArr;
        this.f14777b = objArr2;
        this.f14778c = comparator;
    }
}
