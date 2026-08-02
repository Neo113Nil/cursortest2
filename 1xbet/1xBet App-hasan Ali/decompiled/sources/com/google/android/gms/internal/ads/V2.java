package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class V2 {

    /* renamed from: a, reason: collision with root package name */
    public final Kn f11854a;

    /* renamed from: b, reason: collision with root package name */
    public final C1617tm f11855b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11856c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11857d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11858e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f11859g;

    /* renamed from: h, reason: collision with root package name */
    public long f11860h;

    public V2(int i) {
        switch (i) {
            case 1:
                this.f11854a = new Kn();
                this.f = -9223372036854775807L;
                this.f11859g = -9223372036854775807L;
                this.f11860h = -9223372036854775807L;
                this.f11855b = new C1617tm();
                break;
            default:
                this.f11854a = new Kn();
                this.f = -9223372036854775807L;
                this.f11859g = -9223372036854775807L;
                this.f11860h = -9223372036854775807L;
                this.f11855b = new C1617tm();
                break;
        }
    }

    public static long a(C1617tm c1617tm) {
        int i = c1617tm.f15725b;
        if (c1617tm.o() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c1617tm.f(bArr, 0, 9);
        c1617tm.j(i);
        byte b3 = bArr[0];
        if ((b3 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b5 = bArr[2];
        if ((b5 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b6 = bArr[4];
        if ((b6 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j5 = b3;
        long j6 = b5;
        long j7 = (248 & j6) >> 3;
        long j8 = (bArr[1] & 255) << 20;
        long j9 = (j6 & 3) << 13;
        return j9 | j8 | ((j5 & 3) << 28) | (((j5 & 56) >> 3) << 30) | (j7 << 15) | ((bArr[3] & 255) << 5) | ((b6 & 248) >> 3);
    }

    public static final int c(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public void b(B b3) {
        byte[] bArr = AbstractC1260lo.f;
        int length = bArr.length;
        this.f11855b.h(0, bArr);
        this.f11856c = true;
        b3.f7754p = 0;
    }
}
