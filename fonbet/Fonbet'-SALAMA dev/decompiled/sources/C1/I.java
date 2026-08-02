package C1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public int f1404a;

    /* renamed from: b, reason: collision with root package name */
    public int f1405b;

    /* renamed from: c, reason: collision with root package name */
    public int f1406c;

    /* renamed from: d, reason: collision with root package name */
    public int f1407d;

    /* renamed from: e, reason: collision with root package name */
    public int f1408e;

    /* renamed from: f, reason: collision with root package name */
    public int f1409f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f1410g;

    public boolean a(int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        if (!((i7 & (-2097152)) == -2097152) || (i8 = (i7 >>> 19) & 3) == 1 || (i9 = (i7 >>> 17) & 3) == 0 || (i10 = (i7 >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i7 >>> 10) & 3) == 3) {
            return false;
        }
        this.f1404a = i8;
        this.f1410g = AbstractC0096b.f1477m[3 - i9];
        int i12 = AbstractC0096b.f1478n[i11];
        this.f1406c = i12;
        if (i8 == 2) {
            this.f1406c = i12 / 2;
        } else if (i8 == 0) {
            this.f1406c = i12 / 4;
        }
        int i13 = (i7 >>> 9) & 1;
        int i14 = 1152;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    throw new IllegalArgumentException();
                }
                i14 = 384;
            }
        } else if (i8 != 3) {
            i14 = 576;
        }
        this.f1409f = i14;
        if (i9 == 3) {
            int i15 = i8 == 3 ? AbstractC0096b.f1479o[i10 - 1] : AbstractC0096b.f1480p[i10 - 1];
            this.f1408e = i15;
            this.f1405b = (((i15 * 12) / this.f1406c) + i13) * 4;
        } else {
            if (i8 == 3) {
                int i16 = i9 == 2 ? AbstractC0096b.f1481q[i10 - 1] : AbstractC0096b.f1482r[i10 - 1];
                this.f1408e = i16;
                this.f1405b = ((i16 * 144) / this.f1406c) + i13;
            } else {
                int i17 = AbstractC0096b.f1483s[i10 - 1];
                this.f1408e = i17;
                this.f1405b = (((i9 == 1 ? 72 : 144) * i17) / this.f1406c) + i13;
            }
        }
        this.f1407d = ((i7 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
