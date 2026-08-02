package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.mb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1292mb {

    /* renamed from: a, reason: collision with root package name */
    public final int f14495a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14496b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14497c;

    /* renamed from: d, reason: collision with root package name */
    public final C1407p[] f14498d;

    /* renamed from: e, reason: collision with root package name */
    public int f14499e;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C1292mb(String str, C1407p... c1407pArr) {
        int length = c1407pArr.length;
        int i = 1;
        AbstractC1668us.S(length > 0);
        this.f14496b = str;
        this.f14498d = c1407pArr;
        this.f14495a = length;
        int b3 = AbstractC1593t6.b(c1407pArr[0].f14904m);
        this.f14497c = b3 == -1 ? AbstractC1593t6.b(c1407pArr[0].f14903l) : b3;
        String str2 = c1407pArr[0].f14897d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i5 = c1407pArr[0].f | 16384;
        while (true) {
            C1407p[] c1407pArr2 = this.f14498d;
            if (i >= c1407pArr2.length) {
                return;
            }
            String str3 = c1407pArr2[i].f14897d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                C1407p[] c1407pArr3 = this.f14498d;
                a(i, "languages", c1407pArr3[0].f14897d, c1407pArr3[i].f14897d);
                return;
            } else {
                C1407p[] c1407pArr4 = this.f14498d;
                if (i5 != (c1407pArr4[i].f | 16384)) {
                    a(i, "role flags", Integer.toBinaryString(c1407pArr4[0].f), Integer.toBinaryString(this.f14498d[i].f));
                    return;
                }
                i++;
            }
        }
    }

    public static void a(int i, String str, String str2, String str3) {
        JB.g("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1292mb.class == obj.getClass()) {
            C1292mb c1292mb = (C1292mb) obj;
            if (this.f14496b.equals(c1292mb.f14496b) && Arrays.equals(this.f14498d, c1292mb.f14498d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f14499e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f14498d) + ((this.f14496b.hashCode() + 527) * 31);
        this.f14499e = hashCode;
        return hashCode;
    }
}
