package T;

import X3.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: l, reason: collision with root package name */
    public static final i f5597l = new i(new Object[0]);

    /* renamed from: k, reason: collision with root package name */
    public final Object[] f5598k;

    public i(Object[] objArr) {
        this.f5598k = objArr;
    }

    @Override // X3.AbstractC0441a
    public final int c() {
        return this.f5598k.length;
    }

    @Override // T.c
    public final c d(int i, Object obj) {
        Object[] objArr = this.f5598k;
        AbstractC2036a.p(i, objArr.length);
        if (i == objArr.length) {
            return e(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            l.y0(0, i, 6, objArr, objArr2);
            l.t0(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new i(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
        l.t0(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // T.c
    public final c e(Object obj) {
        Object[] objArr = this.f5598k;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
        copyOf[objArr.length] = obj;
        return new i(copyOf);
    }

    @Override // T.c
    public final c f(Collection collection) {
        Object[] objArr = this.f5598k;
        if (collection.size() + objArr.length > 32) {
            f g5 = g();
            g5.addAll(collection);
            return g5.e();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new i(copyOf);
    }

    @Override // T.c
    public final f g() {
        return new f(this, null, this.f5598k, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC2036a.n(i, c());
        return this.f5598k[i];
    }

    @Override // T.c
    public final c h(b bVar) {
        Object[] objArr = this.f5598k;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z3 = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) bVar.c(obj)).booleanValue()) {
                if (!z3) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    kotlin.jvm.internal.l.e("copyOf(...)", objArr2);
                    z3 = true;
                    length = i;
                }
            } else if (z3) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f5597l : new i(l.A0(objArr2, 0, length));
    }

    @Override // T.c
    public final c i(int i) {
        Object[] objArr = this.f5598k;
        AbstractC2036a.n(i, objArr.length);
        if (objArr.length == 1) {
            return f5597l;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
        l.t0(i, i + 1, objArr.length, objArr, copyOf);
        return new i(copyOf);
    }

    @Override // X3.e, java.util.List
    public final int indexOf(Object obj) {
        return l.G0(this.f5598k, obj);
    }

    @Override // T.c
    public final c j(int i, Object obj) {
        Object[] objArr = this.f5598k;
        AbstractC2036a.n(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.l.e("copyOf(...)", copyOf);
        copyOf[i] = obj;
        return new i(copyOf);
    }

    @Override // X3.e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f5598k;
        kotlin.jvm.internal.l.f("<this>", objArr);
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i5 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i5 < 0) {
                        break;
                    }
                    length2 = i5;
                }
            }
        }
        return -1;
    }

    @Override // X3.e, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f5598k;
        AbstractC2036a.p(i, objArr.length);
        return new d(objArr, i, objArr.length);
    }
}
