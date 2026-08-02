package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public int f11474a;

    /* renamed from: b, reason: collision with root package name */
    public int f11475b;

    /* renamed from: c, reason: collision with root package name */
    public int f11476c;

    /* renamed from: d, reason: collision with root package name */
    public int f11477d;

    /* renamed from: e, reason: collision with root package name */
    public int f11478e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f11479g;

    public boolean a(int i) {
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i & (-2097152)) != -2097152 || (i5 = (i >>> 19) & 3) == 1 || (i6 = (i >>> 17) & 3) == 0 || (i7 = (i >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = i7 - 1;
        this.f11474a = i5;
        this.f11479g = AbstractC1561sb.f15517d[3 - i6];
        int i10 = AbstractC1561sb.f15519e[i8];
        this.f11476c = i10;
        if (i5 == 2) {
            i10 /= 2;
            this.f11476c = i10;
        } else if (i5 == 0) {
            i10 /= 4;
            this.f11476c = i10;
        }
        int i11 = (i >>> 9) & 1;
        int i12 = 1152;
        if (i6 != 1) {
            if (i6 != 2) {
                i12 = 384;
            }
        } else if (i5 != 3) {
            i12 = 576;
        }
        this.f = i12;
        if (i6 == 3) {
            int i13 = i5 == 3 ? AbstractC1561sb.f[i9] : AbstractC1561sb.f15522g[i9];
            this.f11478e = i13;
            this.f11475b = (((i13 * 12) / i10) + i11) * 4;
        } else {
            if (i5 == 3) {
                int i14 = i6 == 2 ? AbstractC1561sb.f15523h[i9] : AbstractC1561sb.i[i9];
                this.f11478e = i14;
                this.f11475b = ((i14 * 144) / i10) + i11;
            } else {
                int i15 = AbstractC1561sb.f15524j[i9];
                this.f11478e = i15;
                this.f11475b = (((i6 == 1 ? 72 : 144) * i15) / i10) + i11;
            }
        }
        this.f11477d = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
