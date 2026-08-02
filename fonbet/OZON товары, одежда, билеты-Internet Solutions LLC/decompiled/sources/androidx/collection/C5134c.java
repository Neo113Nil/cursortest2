package androidx.collection;

import java.lang.reflect.Array;

/* renamed from: androidx.collection.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5134c {
    static Object[] a(int i11, Object[] objArr) {
        if (objArr.length < i11) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11);
        }
        if (objArr.length > i11) {
            objArr[i11] = null;
        }
        return objArr;
    }
}
