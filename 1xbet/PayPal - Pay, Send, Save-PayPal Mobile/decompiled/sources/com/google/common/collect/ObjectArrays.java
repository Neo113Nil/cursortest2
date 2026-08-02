package com.google.common.collect;

/* loaded from: classes4.dex */
public final class ObjectArrays {
    private ObjectArrays() {
    }

    public static <T> T[] newArray(java.lang.Class<T> cls, int i) {
        return (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, i));
    }

    public static <T> T[] newArray(T[] tArr, int i) {
        return (T[]) com.google.common.collect.Platform.newArray(tArr, i);
    }

    public static <T> T[] concat(T[] tArr, T[] tArr2, java.lang.Class<T> cls) {
        T[] tArr3 = (T[]) newArray(cls, tArr.length + tArr2.length);
        java.lang.System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        java.lang.System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> T[] concat(T t, T[] tArr) {
        T[] tArr2 = (T[]) newArray(tArr, tArr.length + 1);
        tArr2[0] = t;
        java.lang.System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
        return tArr2;
    }

    public static <T> T[] concat(T[] tArr, T t) {
        T[] tArr2 = (T[]) java.util.Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr.length] = t;
        return tArr2;
    }

    static <T> T[] toArrayImpl(java.util.Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) newArray(tArr, size);
        }
        fillArray(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    static <T> T[] toArrayImpl(java.lang.Object[] objArr, int i, int i2, T[] tArr) {
        com.google.common.base.Preconditions.checkPositionIndexes(i, i + i2, objArr.length);
        if (tArr.length < i2) {
            tArr = (T[]) newArray(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        java.lang.System.arraycopy(objArr, i, tArr, 0, i2);
        return tArr;
    }

    static java.lang.Object[] toArrayImpl(java.util.Collection<?> collection) {
        return fillArray(collection, new java.lang.Object[collection.size()]);
    }

    static java.lang.Object[] copyAsObjectArray(java.lang.Object[] objArr, int i, int i2) {
        com.google.common.base.Preconditions.checkPositionIndexes(i, i + i2, objArr.length);
        if (i2 == 0) {
            return new java.lang.Object[0];
        }
        java.lang.Object[] objArr2 = new java.lang.Object[i2];
        java.lang.System.arraycopy(objArr, i, objArr2, 0, i2);
        return objArr2;
    }

    private static java.lang.Object[] fillArray(java.lang.Iterable<?> iterable, java.lang.Object[] objArr) {
        java.util.Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    static void swap(java.lang.Object[] objArr, int i, int i2) {
        java.lang.Object obj = objArr[i];
        objArr[i] = objArr[i2];
        objArr[i2] = obj;
    }

    static java.lang.Object[] checkElementsNotNull(java.lang.Object... objArr) {
        checkElementsNotNull(objArr, objArr.length);
        return objArr;
    }

    static java.lang.Object[] checkElementsNotNull(java.lang.Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            checkElementNotNull(objArr[i2], i2);
        }
        return objArr;
    }

    static java.lang.Object checkElementNotNull(java.lang.Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("at index ".concat(java.lang.String.valueOf(i)));
    }
}
