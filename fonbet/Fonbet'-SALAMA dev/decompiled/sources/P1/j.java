package P1;

import A1.X;
import C0.J;
import C1.C0095a;
import android.util.Pair;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Arrays;
import java.util.Collections;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f5215q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f5216a;

    /* renamed from: b, reason: collision with root package name */
    public F1.v f5217b;

    /* renamed from: c, reason: collision with root package name */
    public final B f5218c;

    /* renamed from: d, reason: collision with root package name */
    public final C0095a f5219d;

    /* renamed from: e, reason: collision with root package name */
    public final u f5220e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f5221f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final i f5222g;

    /* renamed from: h, reason: collision with root package name */
    public long f5223h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5224i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f5225k;

    /* renamed from: l, reason: collision with root package name */
    public long f5226l;

    /* renamed from: m, reason: collision with root package name */
    public long f5227m;

    /* renamed from: n, reason: collision with root package name */
    public long f5228n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5229o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5230p;

    public j(B b7) {
        this.f5218c = b7;
        i iVar = new i();
        iVar.f5214d = new byte[128];
        this.f5222g = iVar;
        if (b7 != null) {
            this.f5220e = new u(178);
            this.f5219d = new C0095a(4, false);
        } else {
            this.f5220e = null;
            this.f5219d = null;
        }
        this.f5226l = -9223372036854775807L;
        this.f5228n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ed  */
    @Override // P1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0095a c0095a) {
        i iVar;
        u uVar;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        long j;
        boolean z7;
        boolean z8;
        long j3;
        int i11;
        float f7;
        long j7;
        float f8;
        int i12;
        char c3 = 4;
        AbstractC1664a.i(this.f5217b);
        int i13 = c0095a.f1463a;
        int i14 = c0095a.f1464b;
        byte[] bArr = (byte[]) c0095a.f1465c;
        this.f5223h += c0095a.d();
        this.f5217b.c(c0095a.d(), c0095a);
        while (true) {
            int n2 = AbstractC1664a.n(bArr, i13, i14, this.f5221f);
            iVar = this.f5222g;
            uVar = this.f5220e;
            if (n2 == i14) {
                break;
            }
            int i15 = n2 + 3;
            int i16 = ((byte[]) c0095a.f1465c)[i15] & 255;
            int i17 = n2 - i13;
            if (this.j) {
                i7 = i14;
                i8 = i15;
                i9 = i13;
            } else {
                if (i17 > 0) {
                    iVar.a(bArr, i13, n2);
                }
                int i18 = i17 < 0 ? -i17 : 0;
                if (iVar.f5211a) {
                    int i19 = iVar.f5212b - i18;
                    iVar.f5212b = i19;
                    if (iVar.f5213c == 0 && i16 == 181) {
                        iVar.f5213c = i19;
                        i7 = i14;
                        i8 = i15;
                        i9 = i13;
                    } else {
                        iVar.f5211a = false;
                        String str = this.f5216a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf(iVar.f5214d, iVar.f5212b);
                        int i20 = copyOf[c3] & 255;
                        byte b7 = copyOf[5];
                        i8 = i15;
                        i7 = i14;
                        int i21 = ((b7 & 255) >> 4) | (i20 << 4);
                        int i22 = ((b7 & 15) << 8) | (copyOf[6] & 255);
                        int i23 = (copyOf[7] & 240) >> 4;
                        if (i23 != 2) {
                            if (i23 == 3) {
                                f8 = i22 * 16;
                                i12 = i21 * 9;
                            } else if (i23 != 4) {
                                f7 = 1.0f;
                            } else {
                                f8 = i22 * 121;
                                i12 = i21 * 100;
                            }
                            f7 = f8 / i12;
                        } else {
                            f7 = (i22 * 4) / (i21 * 3);
                        }
                        Format$Builder format$Builder = new Format$Builder();
                        format$Builder.f10528a = str;
                        format$Builder.f10537k = "video/mpeg2";
                        format$Builder.f10542p = i21;
                        format$Builder.f10543q = i22;
                        format$Builder.f10546t = f7;
                        format$Builder.f10539m = Collections.singletonList(copyOf);
                        X x4 = new X(format$Builder);
                        int i24 = (copyOf[7] & 15) - 1;
                        if (i24 < 0 || i24 >= 8) {
                            i9 = i13;
                            j7 = 0;
                        } else {
                            double d7 = f5215q[i24];
                            byte b8 = copyOf[iVar.f5213c + 9];
                            int i25 = (b8 & 96) >> 5;
                            if (i25 != (b8 & 31)) {
                                i9 = i13;
                                d7 *= (i25 + 1.0d) / (r3 + 1);
                            } else {
                                i9 = i13;
                            }
                            j7 = (long) (1000000.0d / d7);
                        }
                        Pair create = Pair.create(x4, Long.valueOf(j7));
                        this.f5217b.a((X) create.first);
                        this.f5225k = ((Long) create.second).longValue();
                        this.j = true;
                    }
                } else {
                    i7 = i14;
                    i8 = i15;
                    i9 = i13;
                    if (i16 == 179) {
                        iVar.f5211a = true;
                    }
                }
                iVar.a(i.f5210e, 0, 3);
            }
            if (uVar != null) {
                if (i17 > 0) {
                    uVar.a(bArr, i9, n2);
                    i11 = 0;
                } else {
                    i11 = -i17;
                }
                if (uVar.b(i11)) {
                    int F7 = AbstractC1664a.F(uVar.f5362e, uVar.f5361d);
                    int i26 = v2.t.f17153a;
                    byte[] bArr2 = uVar.f5361d;
                    C0095a c0095a2 = this.f5219d;
                    c0095a2.B(F7, bArr2);
                    this.f5218c.a(this.f5228n, c0095a2);
                }
                if (i16 == 178) {
                    z4 = true;
                    if (((byte[]) c0095a.f1465c)[n2 + 2] == 1) {
                        uVar.d(i16);
                    }
                    if (i16 != 0 || i16 == 179) {
                        i10 = i7 - n2;
                        if (this.f5230p && this.j) {
                            j3 = this.f5228n;
                            if (j3 != -9223372036854775807L) {
                                this.f5217b.e(j3, this.f5229o ? 1 : 0, ((int) (this.f5223h - this.f5227m)) - i10, i10, null);
                            }
                        }
                        if (this.f5224i || this.f5230p) {
                            this.f5227m = this.f5223h - i10;
                            j = this.f5226l;
                            if (j == -9223372036854775807L) {
                                long j8 = this.f5228n;
                                j = j8 != -9223372036854775807L ? j8 + this.f5225k : -9223372036854775807L;
                            }
                            this.f5228n = j;
                            z7 = false;
                            this.f5229o = false;
                            this.f5226l = -9223372036854775807L;
                            z8 = true;
                            this.f5224i = true;
                        } else {
                            z7 = false;
                            z8 = true;
                        }
                        this.f5230p = i16 != 0 ? z8 : z7;
                    } else if (i16 == 184) {
                        this.f5229o = z4;
                    }
                    i14 = i7;
                    i13 = i8;
                    c3 = 4;
                }
            }
            z4 = true;
            if (i16 != 0) {
            }
            i10 = i7 - n2;
            if (this.f5230p) {
                j3 = this.f5228n;
                if (j3 != -9223372036854775807L) {
                }
            }
            if (this.f5224i) {
            }
            this.f5227m = this.f5223h - i10;
            j = this.f5226l;
            if (j == -9223372036854775807L) {
            }
            this.f5228n = j;
            z7 = false;
            this.f5229o = false;
            this.f5226l = -9223372036854775807L;
            z8 = true;
            this.f5224i = true;
            this.f5230p = i16 != 0 ? z8 : z7;
            i14 = i7;
            i13 = i8;
            c3 = 4;
        }
        if (!this.j) {
            iVar.a(bArr, i13, i14);
        }
        if (uVar != null) {
            uVar.a(bArr, i13, i14);
        }
    }

    @Override // P1.h
    public final void b() {
        AbstractC1664a.k(this.f5221f);
        i iVar = this.f5222g;
        iVar.f5211a = false;
        iVar.f5212b = 0;
        iVar.f5213c = 0;
        u uVar = this.f5220e;
        if (uVar != null) {
            uVar.c();
        }
        this.f5223h = 0L;
        this.f5224i = false;
        this.f5226l = -9223372036854775807L;
        this.f5228n = -9223372036854775807L;
    }

    @Override // P1.h
    public final void c(F1.m mVar, J j) {
        j.a();
        j.d();
        this.f5216a = (String) j.f1238e;
        j.d();
        this.f5217b = mVar.r(j.f1236c, 2);
        B b7 = this.f5218c;
        if (b7 != null) {
            b7.b(mVar, j);
        }
    }

    @Override // P1.h
    public final void e(int i7, long j) {
        this.f5226l = j;
    }

    @Override // P1.h
    public final void d() {
    }
}
