package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class hl {
    public int c;
    public int d;
    public int e;

    public static void d(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int c(int i) {
        com.facetec.sdk.hc hcVar = com.facetec.sdk.hc.c;
        return ((hcVar.f3623a[0][(i >>> 24) & 255] + hcVar.f3623a[1][(i >>> 16) & 255]) ^ hcVar.f3623a[2][(i >>> 8) & 255]) + hcVar.f3623a[3][i & 255];
    }
}
