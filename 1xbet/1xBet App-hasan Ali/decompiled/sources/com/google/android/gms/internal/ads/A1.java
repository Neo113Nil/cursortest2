package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    public final C1768x1 f7500a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7501b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f7502c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f7503d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7504e;
    public final long[] f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f7505g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7506h;

    public A1(C1768x1 c1768x1, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j5) {
        int length = iArr.length;
        int length2 = jArr2.length;
        AbstractC1668us.S(length == length2);
        int length3 = jArr.length;
        AbstractC1668us.S(length3 == length2);
        int length4 = iArr2.length;
        AbstractC1668us.S(length4 == length2);
        this.f7500a = c1768x1;
        this.f7502c = jArr;
        this.f7503d = iArr;
        this.f7504e = i;
        this.f = jArr2;
        this.f7505g = iArr2;
        this.f7506h = j5;
        this.f7501b = length3;
        if (length4 > 0) {
            int i5 = length4 - 1;
            iArr2[i5] = iArr2[i5] | 536870912;
        }
    }

    public final int a(long j5) {
        int i;
        int i5 = AbstractC1260lo.f14419a;
        long[] jArr = this.f;
        int binarySearch = Arrays.binarySearch(jArr, j5);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            while (true) {
                int i6 = binarySearch + 1;
                if (i6 >= jArr.length || jArr[i6] != j5) {
                    break;
                }
                binarySearch = i6;
            }
            i = binarySearch;
        }
        while (i < jArr.length) {
            if ((this.f7505g[i] & 1) != 0) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
