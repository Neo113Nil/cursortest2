package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f17616a = new Object[0];

    public static final Object[] a(Collection collection) {
        l.f("collection", collection);
        int size = collection.size();
        Object[] objArr = f17616a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i5 = i + 1;
            objArr2[i] = it.next();
            if (i5 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i6 = ((i5 * 3) + 1) >>> 1;
                if (i6 <= i5) {
                    i6 = 2147483645;
                    if (i5 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i6);
                l.e("copyOf(...)", objArr2);
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i5);
                l.e("copyOf(...)", copyOf);
                return copyOf;
            }
            i = i5;
        }
    }

    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArr2;
        l.f("collection", collection);
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", newInstance);
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i5 = i + 1;
                    objArr2[i] = it.next();
                    if (i5 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i6 = ((i5 * 3) + 1) >>> 1;
                        if (i6 <= i5) {
                            i6 = 2147483645;
                            if (i5 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i6);
                        l.e("copyOf(...)", objArr2);
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i5] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i5);
                        l.e("copyOf(...)", copyOf);
                        return copyOf;
                    }
                    i = i5;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
