package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class VG implements InterfaceC1200kH {

    /* renamed from: a, reason: collision with root package name */
    public final C1292mb f11876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11877b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f11878c;

    /* renamed from: d, reason: collision with root package name */
    public final C1407p[] f11879d;

    /* renamed from: e, reason: collision with root package name */
    public int f11880e;

    public VG(C1292mb c1292mb, int[] iArr) {
        C1407p[] c1407pArr;
        int length = iArr.length;
        AbstractC1668us.a0(length > 0);
        c1292mb.getClass();
        this.f11876a = c1292mb;
        this.f11877b = length;
        this.f11879d = new C1407p[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            c1407pArr = c1292mb.f14498d;
            if (i >= length2) {
                break;
            }
            this.f11879d[i] = c1407pArr[iArr[i]];
            i++;
        }
        Arrays.sort(this.f11879d, new C1589t2(5));
        this.f11878c = new int[this.f11877b];
        for (int i5 = 0; i5 < this.f11877b; i5++) {
            int[] iArr2 = this.f11878c;
            C1407p c1407p = this.f11879d[i5];
            int i6 = 0;
            while (true) {
                if (i6 >= c1407pArr.length) {
                    i6 = -1;
                    break;
                } else if (c1407p == c1407pArr[i6]) {
                    break;
                } else {
                    i6++;
                }
            }
            iArr2[i5] = i6;
        }
    }

    public static void e(ArrayList arrayList, long[] jArr) {
        long j5 = 0;
        for (int i = 0; i < 2; i++) {
            j5 += jArr[i];
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C0909dv c0909dv = (C0909dv) arrayList.get(i5);
            if (c0909dv != null) {
                c0909dv.a(new UG(j5, jArr[i5]));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final int a(int i) {
        return this.f11878c[i];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final int b(int i) {
        for (int i5 = 0; i5 < this.f11877b; i5++) {
            if (this.f11878c[i5] == i) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final C1407p c() {
        return this.f11879d[0];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final int d() {
        return this.f11878c[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VG vg = (VG) obj;
            if (this.f11876a.equals(vg.f11876a) && Arrays.equals(this.f11878c, vg.f11878c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final C1292mb f() {
        return this.f11876a;
    }

    public final int hashCode() {
        int i = this.f11880e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f11878c) + (System.identityHashCode(this.f11876a) * 31);
        this.f11880e = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final int j() {
        return this.f11878c.length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1200kH
    public final C1407p x(int i) {
        return this.f11879d[i];
    }
}
