package R;

import X3.n;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e implements RandomAccess {

    /* renamed from: k, reason: collision with root package name */
    public Object[] f5106k;

    /* renamed from: l, reason: collision with root package name */
    public b f5107l;

    /* renamed from: m, reason: collision with root package name */
    public int f5108m = 0;

    public e(Object[] objArr) {
        this.f5106k = objArr;
    }

    public final void a(int i, Object obj) {
        int i5 = this.f5108m + 1;
        if (this.f5106k.length < i5) {
            n(i5);
        }
        Object[] objArr = this.f5106k;
        int i6 = this.f5108m;
        if (i != i6) {
            System.arraycopy(objArr, i, objArr, i + 1, i6 - i);
        }
        objArr[i] = obj;
        this.f5108m++;
    }

    public final void c(Object obj) {
        int i = this.f5108m + 1;
        if (this.f5106k.length < i) {
            n(i);
        }
        Object[] objArr = this.f5106k;
        int i5 = this.f5108m;
        objArr[i5] = obj;
        this.f5108m = i5 + 1;
    }

    public final void d(int i, e eVar) {
        int i5 = eVar.f5108m;
        if (i5 == 0) {
            return;
        }
        int i6 = this.f5108m + i5;
        if (this.f5106k.length < i6) {
            n(i6);
        }
        Object[] objArr = this.f5106k;
        int i7 = this.f5108m;
        if (i != i7) {
            System.arraycopy(objArr, i, objArr, i + i5, i7 - i);
        }
        System.arraycopy(eVar.f5106k, 0, objArr, i, i5);
        this.f5108m += i5;
    }

    public final void e(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i5 = this.f5108m + size;
        if (this.f5106k.length < i5) {
            n(i5);
        }
        Object[] objArr = this.f5106k;
        int i6 = this.f5108m;
        if (i != i6) {
            System.arraycopy(objArr, i, objArr, i + size, i6 - i);
        }
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            objArr[i + i7] = list.get(i7);
        }
        this.f5108m += size;
    }

    public final boolean f(int i, Collection collection) {
        int i5 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i6 = this.f5108m + size;
        if (this.f5106k.length < i6) {
            n(i6);
        }
        Object[] objArr = this.f5106k;
        int i7 = this.f5108m;
        if (i != i7) {
            System.arraycopy(objArr, i, objArr, i + size, i7 - i);
        }
        for (Object obj : collection) {
            int i8 = i5 + 1;
            if (i5 < 0) {
                n.R();
                throw null;
            }
            objArr[i5 + i] = obj;
            i5 = i8;
        }
        this.f5108m += size;
        return true;
    }

    public final List g() {
        b bVar = this.f5107l;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f5107l = bVar2;
        return bVar2;
    }

    public final void h() {
        Object[] objArr = this.f5106k;
        int i = this.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            objArr[i5] = null;
        }
        this.f5108m = 0;
    }

    public final boolean i(Object obj) {
        int i = this.f5108m - 1;
        if (i >= 0) {
            for (int i5 = 0; !l.a(this.f5106k[i5], obj); i5++) {
                if (i5 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int j(Object obj) {
        Object[] objArr = this.f5106k;
        int i = this.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            if (l.a(obj, objArr[i5])) {
                return i5;
            }
        }
        return -1;
    }

    public final boolean k(Object obj) {
        int j5 = j(obj);
        if (j5 < 0) {
            return false;
        }
        l(j5);
        return true;
    }

    public final Object l(int i) {
        Object[] objArr = this.f5106k;
        Object obj = objArr[i];
        int i5 = this.f5108m;
        if (i != i5 - 1) {
            int i6 = i + 1;
            System.arraycopy(objArr, i6, objArr, i, i5 - i6);
        }
        int i7 = this.f5108m - 1;
        this.f5108m = i7;
        objArr[i7] = null;
        return obj;
    }

    public final void m(int i, int i5) {
        if (i5 > i) {
            int i6 = this.f5108m;
            if (i5 < i6) {
                Object[] objArr = this.f5106k;
                System.arraycopy(objArr, i5, objArr, i, i6 - i5);
            }
            int i7 = this.f5108m;
            int i8 = i7 - (i5 - i);
            int i9 = i7 - 1;
            if (i8 <= i9) {
                int i10 = i8;
                while (true) {
                    this.f5106k[i10] = null;
                    if (i10 == i9) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f5108m = i8;
        }
    }

    public final void n(int i) {
        Object[] objArr = this.f5106k;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f5106k = objArr2;
    }
}
