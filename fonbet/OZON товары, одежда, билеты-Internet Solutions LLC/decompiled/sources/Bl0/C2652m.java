package Bl0;

import kotlin.collections.C7705l;

/* renamed from: Bl0.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2652m {
    public static final Object[] a(Object[] objArr, int i11, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        C7705l.u(objArr, 0, objArr2, i11, 6);
        C7705l.r(objArr, i11 + 2, objArr2, i11, objArr.length);
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] b(int i11, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        C7705l.u(objArr, 0, objArr2, i11, 6);
        C7705l.r(objArr, i11, objArr2, i11 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] c(int i11, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C7705l.u(objArr, 0, objArr2, i11, 6);
        C7705l.r(objArr, i11, objArr2, i11 + 1, objArr.length);
        return objArr2;
    }

    public static final int d(int i11, int i12) {
        return (i11 >> i12) & 31;
    }

    public static final int e(int i11) {
        int i12 = 306783378 & i11;
        int i13 = 613566756 & i11;
        return (i11 & (-920350135)) | (i13 >> 1) | i12 | ((i12 << 1) & i13);
    }
}
