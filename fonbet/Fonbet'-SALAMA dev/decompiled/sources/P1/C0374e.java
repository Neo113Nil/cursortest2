package P1;

import A1.X;
import C0.J;
import C1.AbstractC0096b;
import C1.C0095a;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: P1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374e implements h {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f5172v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5173a;

    /* renamed from: d, reason: collision with root package name */
    public final String f5176d;

    /* renamed from: e, reason: collision with root package name */
    public String f5177e;

    /* renamed from: f, reason: collision with root package name */
    public F1.v f5178f;

    /* renamed from: g, reason: collision with root package name */
    public F1.v f5179g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5182k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5183l;

    /* renamed from: o, reason: collision with root package name */
    public int f5186o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5187p;

    /* renamed from: r, reason: collision with root package name */
    public int f5189r;

    /* renamed from: t, reason: collision with root package name */
    public F1.v f5191t;

    /* renamed from: u, reason: collision with root package name */
    public long f5192u;

    /* renamed from: b, reason: collision with root package name */
    public final F1.x f5174b = new F1.x(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final C0095a f5175c = new C0095a(Arrays.copyOf(f5172v, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f5180h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f5181i = 0;
    public int j = 256;

    /* renamed from: m, reason: collision with root package name */
    public int f5184m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f5185n = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f5188q = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f5190s = -9223372036854775807L;

    public C0374e(boolean z4, String str) {
        this.f5173a = z4;
        this.f5176d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0300  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // P1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0095a c0095a) {
        ?? r9;
        int i7;
        int i8;
        byte b7;
        byte[] bArr;
        int i9;
        int i10;
        char c3;
        char c4;
        ?? r92;
        int i11;
        ?? r22 = 0;
        int i12 = 7;
        int i13 = 2;
        this.f5178f.getClass();
        int i14 = v2.t.f17153a;
        while (c0095a.d() > 0) {
            int i15 = this.f5180h;
            F1.x xVar = this.f5174b;
            int i16 = 4;
            C0095a c0095a2 = this.f5175c;
            if (i15 == 0) {
                byte[] bArr2 = (byte[]) c0095a.f1465c;
                int i17 = c0095a.f1463a;
                int i18 = c0095a.f1464b;
                int i19 = r22;
                while (true) {
                    if (i17 >= i18) {
                        r9 = i19;
                        i7 = i13;
                        c0095a.D(i17);
                        break;
                    }
                    i8 = i17 + 1;
                    b7 = bArr2[i17];
                    int i20 = b7 & 255;
                    if (this.j == 512 && ((65280 | (((byte) i20) & 255)) & 65526) == 65520) {
                        if (this.f5183l) {
                            break;
                        }
                        int i21 = i17 - 1;
                        c0095a.D(i17);
                        byte[] bArr3 = xVar.f2586d;
                        if (c0095a.d() >= 1) {
                            c0095a.f(bArr3, i19, 1);
                            xVar.o(i16);
                            int i22 = xVar.i(1);
                            int i23 = this.f5184m;
                            if (i23 == -1 || i22 == i23) {
                                if (this.f5185n != -1) {
                                    byte[] bArr4 = xVar.f2586d;
                                    if (c0095a.d() < 1) {
                                        break;
                                    }
                                    c0095a.f(bArr4, i19, 1);
                                    xVar.o(i13);
                                    i11 = 4;
                                    if (xVar.i(4) == this.f5185n) {
                                        c0095a.D(i8);
                                    }
                                } else {
                                    i11 = 4;
                                }
                                byte[] bArr5 = xVar.f2586d;
                                if (c0095a.d() >= i11) {
                                    c0095a.f(bArr5, i19, i11);
                                    xVar.o(14);
                                    int i24 = xVar.i(13);
                                    if (i24 >= 7) {
                                        byte[] bArr6 = (byte[]) c0095a.f1465c;
                                        int i25 = c0095a.f1464b;
                                        int i26 = i21 + i24;
                                        if (i26 < i25) {
                                            byte b8 = bArr6[i26];
                                            bArr = bArr2;
                                            if (b8 != -1) {
                                                if (b8 == 73) {
                                                    int i27 = i26 + 1;
                                                    if (i27 != i25) {
                                                        if (bArr6[i27] == 68) {
                                                            int i28 = i26 + 2;
                                                            if (i28 != i25) {
                                                                if (bArr6[i28] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i29 = i26 + 1;
                                                if (i29 != i25) {
                                                    byte b9 = bArr6[i29];
                                                    if (((65280 | (b9 & 255)) & 65526) == 65520 && ((b9 & 8) >> 3) == i22) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                bArr = bArr2;
                            }
                            int i30 = this.j;
                            i9 = i30 | i20;
                            if (i9 != 329) {
                                i10 = 2;
                                c3 = 256;
                                c4 = 3;
                                r92 = false;
                                this.j = 768;
                            } else if (i9 == 511) {
                                i10 = 2;
                                c3 = 256;
                                c4 = 3;
                                r92 = false;
                                this.j = 512;
                            } else if (i9 == 836) {
                                i10 = 2;
                                c3 = 256;
                                c4 = 3;
                                r92 = false;
                                this.j = 1024;
                            } else {
                                if (i9 == 1075) {
                                    i7 = 2;
                                    this.f5180h = 2;
                                    this.f5181i = 3;
                                    r9 = false;
                                    this.f5189r = 0;
                                    c0095a2.D(0);
                                    c0095a.D(i8);
                                    break;
                                }
                                c3 = 256;
                                if (i30 != 256) {
                                    this.j = 256;
                                    i10 = 2;
                                    c4 = 3;
                                    r92 = false;
                                    bArr2 = bArr;
                                    i16 = 4;
                                    i13 = i10;
                                    i19 = r92;
                                } else {
                                    i10 = 2;
                                    c4 = 3;
                                    r92 = false;
                                }
                            }
                            i17 = i8;
                            bArr2 = bArr;
                            i16 = 4;
                            i13 = i10;
                            i19 = r92;
                        }
                    }
                    bArr = bArr2;
                    int i302 = this.j;
                    i9 = i302 | i20;
                    if (i9 != 329) {
                    }
                    i17 = i8;
                    bArr2 = bArr;
                    i16 = 4;
                    i13 = i10;
                    i19 = r92;
                }
                this.f5186o = (b7 & 8) >> 3;
                this.f5182k = (b7 & 1) == 0;
                if (this.f5183l) {
                    this.f5180h = 3;
                    this.f5181i = 0;
                } else {
                    this.f5180h = 1;
                    this.f5181i = 0;
                }
                c0095a.D(i8);
                i7 = 2;
                r9 = false;
                i13 = i7;
                r22 = r9;
                i12 = 7;
            } else if (i15 != 1) {
                if (i15 == i13) {
                    byte[] bArr7 = (byte[]) c0095a2.f1465c;
                    int min = Math.min(c0095a.d(), 10 - this.f5181i);
                    c0095a.f(bArr7, this.f5181i, min);
                    int i31 = this.f5181i + min;
                    this.f5181i = i31;
                    if (i31 == 10) {
                        this.f5179g.c(10, c0095a2);
                        c0095a2.D(6);
                        F1.v vVar = this.f5179g;
                        int s7 = c0095a2.s() + 10;
                        this.f5180h = 4;
                        this.f5181i = 10;
                        this.f5191t = vVar;
                        this.f5192u = 0L;
                        this.f5189r = s7;
                    }
                } else if (i15 == 3) {
                    int i32 = this.f5182k ? i12 : 5;
                    byte[] bArr8 = xVar.f2586d;
                    int min2 = Math.min(c0095a.d(), i32 - this.f5181i);
                    c0095a.f(bArr8, this.f5181i, min2);
                    int i33 = this.f5181i + min2;
                    this.f5181i = i33;
                    if (i33 == i32) {
                        xVar.o(r22 == true ? 1 : 0);
                        if (this.f5187p) {
                            xVar.r(10);
                        } else {
                            int i34 = xVar.i(i13) + 1;
                            if (i34 != i13) {
                                Log.w("AdtsReader", "Detected audio object type: " + i34 + ", but assuming AAC LC.");
                                i34 = i13;
                            }
                            xVar.r(5);
                            int i35 = xVar.i(3);
                            int i36 = this.f5185n;
                            byte b10 = (byte) (((i34 << 3) & 248) | ((i36 >> 1) & i12));
                            byte b11 = (byte) (((i35 << 3) & 120) | ((i36 << i12) & 128));
                            byte[] bArr9 = new byte[i13];
                            bArr9[r22 == true ? 1 : 0] = b10;
                            bArr9[1] = b11;
                            C0095a g3 = AbstractC0096b.g(new F1.x(bArr9, i13), r22);
                            Format$Builder format$Builder = new Format$Builder();
                            format$Builder.f10528a = this.f5177e;
                            format$Builder.f10537k = "audio/mp4a-latm";
                            format$Builder.f10535h = (String) g3.f1465c;
                            format$Builder.f10550x = g3.f1464b;
                            format$Builder.f10551y = g3.f1463a;
                            format$Builder.f10539m = Collections.singletonList(bArr9);
                            format$Builder.f10530c = this.f5176d;
                            X x4 = new X(format$Builder);
                            this.f5188q = 1024000000 / x4.f297Q;
                            this.f5178f.a(x4);
                            this.f5187p = true;
                        }
                        xVar.r(4);
                        int i37 = xVar.i(13);
                        int i38 = i37 - 7;
                        if (this.f5182k) {
                            i38 = i37 - 9;
                        }
                        F1.v vVar2 = this.f5178f;
                        long j = this.f5188q;
                        this.f5180h = 4;
                        this.f5181i = r22 == true ? 1 : 0;
                        this.f5191t = vVar2;
                        this.f5192u = j;
                        this.f5189r = i38;
                    }
                } else {
                    if (i15 != 4) {
                        throw new IllegalStateException();
                    }
                    int min3 = Math.min(c0095a.d(), this.f5189r - this.f5181i);
                    this.f5191t.c(min3, c0095a);
                    int i39 = this.f5181i + min3;
                    this.f5181i = i39;
                    int i40 = this.f5189r;
                    if (i39 == i40) {
                        long j3 = this.f5190s;
                        if (j3 != -9223372036854775807L) {
                            this.f5191t.e(j3, 1, i40, 0, null);
                            this.f5190s += this.f5192u;
                        }
                        this.f5180h = r22 == true ? 1 : 0;
                        this.f5181i = r22 == true ? 1 : 0;
                        this.j = 256;
                    }
                }
            } else if (c0095a.d() != 0) {
                xVar.f2586d[r22 == true ? 1 : 0] = ((byte[]) c0095a.f1465c)[c0095a.f1463a];
                xVar.o(i13);
                int i41 = xVar.i(4);
                int i42 = this.f5185n;
                if (i42 == -1 || i41 == i42) {
                    if (!this.f5183l) {
                        this.f5183l = true;
                        this.f5184m = this.f5186o;
                        this.f5185n = i41;
                    }
                    this.f5180h = 3;
                    this.f5181i = r22 == true ? 1 : 0;
                } else {
                    this.f5183l = r22;
                    this.f5180h = r22 == true ? 1 : 0;
                    this.f5181i = r22 == true ? 1 : 0;
                    this.j = 256;
                }
            }
        }
    }

    @Override // P1.h
    public final void b() {
        this.f5190s = -9223372036854775807L;
        this.f5183l = false;
        this.f5180h = 0;
        this.f5181i = 0;
        this.j = 256;
    }

    @Override // P1.h
    public final void c(F1.m mVar, J j) {
        j.a();
        j.d();
        this.f5177e = (String) j.f1238e;
        j.d();
        F1.v r7 = mVar.r(j.f1236c, 1);
        this.f5178f = r7;
        this.f5191t = r7;
        if (!this.f5173a) {
            this.f5179g = new F1.j();
            return;
        }
        j.a();
        j.d();
        F1.v r8 = mVar.r(j.f1236c, 5);
        this.f5179g = r8;
        Format$Builder format$Builder = new Format$Builder();
        j.d();
        format$Builder.f10528a = (String) j.f1238e;
        format$Builder.f10537k = "application/id3";
        r8.a(new X(format$Builder));
    }

    @Override // P1.h
    public final void e(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f5190s = j;
        }
    }

    @Override // P1.h
    public final void d() {
    }
}
