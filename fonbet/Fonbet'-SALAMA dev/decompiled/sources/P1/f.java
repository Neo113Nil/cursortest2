package P1;

import A1.X;
import C0.J;
import C1.AbstractC0096b;
import C1.C0095a;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.Arrays;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: b, reason: collision with root package name */
    public final String f5194b;

    /* renamed from: c, reason: collision with root package name */
    public String f5195c;

    /* renamed from: d, reason: collision with root package name */
    public F1.v f5196d;

    /* renamed from: f, reason: collision with root package name */
    public int f5198f;

    /* renamed from: g, reason: collision with root package name */
    public int f5199g;

    /* renamed from: h, reason: collision with root package name */
    public long f5200h;

    /* renamed from: i, reason: collision with root package name */
    public X f5201i;
    public int j;

    /* renamed from: a, reason: collision with root package name */
    public final C0095a f5193a = new C0095a(new byte[18]);

    /* renamed from: e, reason: collision with root package name */
    public int f5197e = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f5202k = -9223372036854775807L;

    public f(String str) {
        this.f5194b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0251  */
    @Override // P1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0095a c0095a) {
        char c3;
        int i7;
        boolean z4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        F1.x xVar;
        int i15;
        int i16;
        AbstractC1664a.i(this.f5196d);
        while (c0095a.d() > 0) {
            int i17 = this.f5197e;
            C0095a c0095a2 = this.f5193a;
            int i18 = 2;
            int i19 = 8;
            if (i17 == 0) {
                while (c0095a.d() > 0) {
                    int i20 = this.f5199g << 8;
                    this.f5199g = i20;
                    int t7 = i20 | c0095a.t();
                    this.f5199g = t7;
                    if (t7 == 2147385345 || t7 == -25230976 || t7 == 536864768 || t7 == -14745368) {
                        byte[] bArr = (byte[]) c0095a2.f1465c;
                        bArr[0] = (byte) ((t7 >> 24) & 255);
                        bArr[1] = (byte) ((t7 >> 16) & 255);
                        bArr[2] = (byte) ((t7 >> 8) & 255);
                        bArr[3] = (byte) (t7 & 255);
                        this.f5198f = 4;
                        this.f5199g = 0;
                        this.f5197e = 1;
                        break;
                    }
                }
            } else if (i17 == 1) {
                byte[] bArr2 = (byte[]) c0095a2.f1465c;
                int min = Math.min(c0095a.d(), 18 - this.f5198f);
                c0095a.f(bArr2, this.f5198f, min);
                int i21 = this.f5198f + min;
                this.f5198f = i21;
                if (i21 == 18) {
                    byte[] bArr3 = (byte[]) c0095a2.f1465c;
                    if (this.f5201i == null) {
                        String str = this.f5195c;
                        if (bArr3[0] == Byte.MAX_VALUE) {
                            xVar = new F1.x(bArr3, bArr3.length);
                        } else {
                            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b7 = copyOf[0];
                            if (b7 == -2 || b7 == -1) {
                                for (int i22 = 0; i22 < copyOf.length - 1; i22 += 2) {
                                    byte b8 = copyOf[i22];
                                    int i23 = i22 + 1;
                                    copyOf[i22] = copyOf[i23];
                                    copyOf[i23] = b8;
                                }
                            }
                            F1.x xVar2 = new F1.x(copyOf, copyOf.length);
                            if (copyOf[0] == 31) {
                                F1.x xVar3 = new F1.x(copyOf, copyOf.length);
                                while (xVar3.b() >= 16) {
                                    xVar3.r(i18);
                                    int i24 = xVar3.i(14) & 16383;
                                    int min2 = Math.min(8 - xVar2.f2585c, 14);
                                    int i25 = xVar2.f2585c;
                                    int i26 = (8 - i25) - min2;
                                    byte[] bArr4 = xVar2.f2586d;
                                    int i27 = xVar2.f2584b;
                                    byte b9 = (byte) (bArr4[i27] & ((65280 >> i25) | ((1 << i26) - 1)));
                                    bArr4[i27] = b9;
                                    int i28 = 14 - min2;
                                    bArr4[i27] = (byte) (b9 | ((i24 >>> i28) << i26));
                                    int i29 = i27 + 1;
                                    while (i28 > i19) {
                                        xVar2.f2586d[i29] = (byte) (i24 >>> (i28 - 8));
                                        i28 -= 8;
                                        i29++;
                                        i19 = 8;
                                    }
                                    byte[] bArr5 = xVar2.f2586d;
                                    byte b10 = (byte) (bArr5[i29] & ((1 << r4) - 1));
                                    bArr5[i29] = b10;
                                    bArr5[i29] = (byte) (((i24 & ((1 << i28) - 1)) << (8 - i28)) | b10);
                                    xVar2.r(14);
                                    xVar2.a();
                                    i18 = 2;
                                    i19 = 8;
                                }
                            }
                            xVar2.n(copyOf.length, copyOf);
                            xVar = xVar2;
                        }
                        xVar.r(60);
                        int i30 = AbstractC0096b.j[xVar.i(6)];
                        int i31 = AbstractC0096b.f1475k[xVar.i(4)];
                        int i32 = xVar.i(5);
                        if (i32 >= 29) {
                            i16 = -1;
                            i15 = 2;
                        } else {
                            int i33 = AbstractC0096b.f1476l[i32] * zzbbd.zzq.zzf;
                            i15 = 2;
                            i16 = i33 / 2;
                        }
                        xVar.r(10);
                        int i34 = i30 + (xVar.i(i15) > 0 ? 1 : 0);
                        Format$Builder format$Builder = new Format$Builder();
                        format$Builder.f10528a = str;
                        format$Builder.f10537k = "audio/vnd.dts";
                        format$Builder.f10533f = i16;
                        format$Builder.f10550x = i34;
                        format$Builder.f10551y = i31;
                        format$Builder.f10540n = null;
                        format$Builder.f10530c = this.f5194b;
                        X x4 = new X(format$Builder);
                        this.f5201i = x4;
                        this.f5196d.a(x4);
                        c3 = 0;
                    } else {
                        c3 = 0;
                    }
                    byte b11 = bArr3[c3];
                    if (b11 != -2) {
                        if (b11 == -1) {
                            i13 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            i14 = (bArr3[9] & 60) >> 2;
                        } else if (b11 != 31) {
                            i7 = ((3 & bArr3[5]) << 12) | ((bArr3[6] & 255) << 4) | ((bArr3[7] & 240) >> 4);
                        } else {
                            i13 = ((bArr3[6] & 3) << 12) | ((bArr3[7] & 255) << 4);
                            i14 = (bArr3[8] & 60) >> 2;
                        }
                        i8 = (i13 | i14) + 1;
                        z4 = true;
                        if (z4) {
                            i8 = (i8 * 16) / 14;
                        }
                        this.j = i8;
                        if (b11 != -2) {
                            i9 = 2;
                            i10 = (bArr3[5] & 1) << 6;
                            i11 = bArr3[4] & 252;
                        } else if (b11 == -1) {
                            i12 = ((bArr3[7] & 60) >> 2) | ((bArr3[4] & 7) << 4);
                            this.f5200h = (int) ((((i12 + 1) * 32) * 1000000) / this.f5201i.f297Q);
                            c0095a2.D(0);
                            this.f5196d.c(18, c0095a2);
                            this.f5197e = 2;
                        } else if (b11 != 31) {
                            i10 = (bArr3[4] & 1) << 6;
                            i11 = bArr3[5] & 252;
                            i9 = 2;
                        } else {
                            i9 = 2;
                            i10 = (7 & bArr3[5]) << 4;
                            i11 = bArr3[6] & 60;
                        }
                        i12 = (i11 >> i9) | i10;
                        this.f5200h = (int) ((((i12 + 1) * 32) * 1000000) / this.f5201i.f297Q);
                        c0095a2.D(0);
                        this.f5196d.c(18, c0095a2);
                        this.f5197e = 2;
                    } else {
                        i7 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4) | ((bArr3[6] & 240) >> 4);
                    }
                    i8 = i7 + 1;
                    z4 = false;
                    if (z4) {
                    }
                    this.j = i8;
                    if (b11 != -2) {
                    }
                    i12 = (i11 >> i9) | i10;
                    this.f5200h = (int) ((((i12 + 1) * 32) * 1000000) / this.f5201i.f297Q);
                    c0095a2.D(0);
                    this.f5196d.c(18, c0095a2);
                    this.f5197e = 2;
                }
            } else {
                if (i17 != 2) {
                    throw new IllegalStateException();
                }
                int min3 = Math.min(c0095a.d(), this.j - this.f5198f);
                this.f5196d.c(min3, c0095a);
                int i35 = this.f5198f + min3;
                this.f5198f = i35;
                int i36 = this.j;
                if (i35 == i36) {
                    long j = this.f5202k;
                    if (j != -9223372036854775807L) {
                        this.f5196d.e(j, 1, i36, 0, null);
                        this.f5202k += this.f5200h;
                    }
                    this.f5197e = 0;
                }
            }
        }
    }

    @Override // P1.h
    public final void b() {
        this.f5197e = 0;
        this.f5198f = 0;
        this.f5199g = 0;
        this.f5202k = -9223372036854775807L;
    }

    @Override // P1.h
    public final void c(F1.m mVar, J j) {
        j.a();
        j.d();
        this.f5195c = (String) j.f1238e;
        j.d();
        this.f5196d = mVar.r(j.f1236c, 1);
    }

    @Override // P1.h
    public final void e(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f5202k = j;
        }
    }

    @Override // P1.h
    public final void d() {
    }
}
