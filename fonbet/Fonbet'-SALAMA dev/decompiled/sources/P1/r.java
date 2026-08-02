package P1;

import A1.X;
import C0.J;
import C1.C0095a;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Collections;
import v0.AbstractC1663a;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class r implements h {

    /* renamed from: a, reason: collision with root package name */
    public final B f5314a;

    /* renamed from: b, reason: collision with root package name */
    public String f5315b;

    /* renamed from: c, reason: collision with root package name */
    public F1.v f5316c;

    /* renamed from: d, reason: collision with root package name */
    public q f5317d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5318e;

    /* renamed from: l, reason: collision with root package name */
    public long f5324l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f5319f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final u f5320g = new u(32);

    /* renamed from: h, reason: collision with root package name */
    public final u f5321h = new u(33);

    /* renamed from: i, reason: collision with root package name */
    public final u f5322i = new u(34);
    public final u j = new u(39);

    /* renamed from: k, reason: collision with root package name */
    public final u f5323k = new u(40);

    /* renamed from: m, reason: collision with root package name */
    public long f5325m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final C0095a f5326n = new C0095a(4, false);

    public r(B b7) {
        this.f5314a = b7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x0490, code lost:
    
        if (r6 <= 9) goto L222;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    @Override // P1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0095a c0095a) {
        int i7;
        int i8;
        byte[] bArr;
        boolean z4;
        u uVar;
        u uVar2;
        int i9;
        u uVar3;
        int i10;
        int i11;
        long j;
        int i12;
        boolean b7;
        u uVar4;
        int i13;
        boolean z7;
        int i14;
        char c3;
        boolean z8;
        boolean z9;
        boolean z10;
        int i15;
        int i16;
        long j3;
        int i17;
        int i18;
        int i19;
        C0095a c0095a2 = c0095a;
        int i20 = 1;
        AbstractC1664a.i(this.f5316c);
        int i21 = v2.t.f17153a;
        while (c0095a.d() > 0) {
            int i22 = c0095a2.f1463a;
            int i23 = c0095a2.f1464b;
            byte[] bArr2 = (byte[]) c0095a2.f1465c;
            this.f5324l += c0095a.d();
            this.f5316c.c(c0095a.d(), c0095a2);
            while (i22 < i23) {
                int n2 = AbstractC1664a.n(bArr2, i22, i23, this.f5319f);
                if (n2 == i23) {
                    f(bArr2, i22, i23);
                    return;
                }
                int i24 = n2 + 3;
                int i25 = (bArr2[i24] & 126) >> i20;
                int i26 = n2 - i22;
                if (i26 > 0) {
                    f(bArr2, i22, n2);
                }
                int i27 = i23 - n2;
                long j7 = this.f5324l - i27;
                int i28 = i26 < 0 ? -i26 : 0;
                long j8 = this.f5325m;
                q qVar = this.f5317d;
                boolean z11 = this.f5318e;
                if (qVar.j && qVar.f5308g) {
                    qVar.f5313m = qVar.f5304c;
                    qVar.j = false;
                } else if (qVar.f5309h || qVar.f5308g) {
                    if (z11 && qVar.f5310i) {
                        long j9 = qVar.f5303b;
                        i7 = i28;
                        int i29 = i27 + ((int) (j7 - j9));
                        long j10 = qVar.f5312l;
                        if (j10 != -9223372036854775807L) {
                            i8 = i23;
                            bArr = bArr2;
                            qVar.f5302a.e(j10, qVar.f5313m ? 1 : 0, (int) (j9 - qVar.f5311k), i29, null);
                            qVar.f5311k = qVar.f5303b;
                            qVar.f5312l = qVar.f5306e;
                            qVar.f5313m = qVar.f5304c;
                            qVar.f5310i = true;
                            z4 = this.f5318e;
                            u uVar5 = this.f5322i;
                            u uVar6 = this.f5321h;
                            u uVar7 = this.f5320g;
                            if (z4) {
                                uVar = uVar5;
                                uVar2 = uVar6;
                                i9 = i27;
                                uVar3 = uVar7;
                                i10 = i25;
                                i11 = i24;
                                j = j7;
                                i12 = i7;
                            } else {
                                i12 = i7;
                                uVar7.b(i12);
                                uVar6.b(i12);
                                uVar5.b(i12);
                                if (uVar7.f5360c && uVar6.f5360c && uVar5.f5360c) {
                                    F1.v vVar = this.f5316c;
                                    String str = this.f5315b;
                                    int i30 = uVar7.f5362e;
                                    i11 = i24;
                                    byte[] bArr3 = new byte[uVar6.f5362e + i30 + uVar5.f5362e];
                                    i9 = i27;
                                    System.arraycopy(uVar7.f5361d, 0, bArr3, 0, i30);
                                    i10 = i25;
                                    System.arraycopy(uVar6.f5361d, 0, bArr3, uVar7.f5362e, uVar6.f5362e);
                                    System.arraycopy(uVar5.f5361d, 0, bArr3, uVar7.f5362e + uVar6.f5362e, uVar5.f5362e);
                                    F1.x xVar = new F1.x(uVar6.f5361d, 0, uVar6.f5362e);
                                    xVar.r(44);
                                    int i31 = xVar.i(3);
                                    xVar.q();
                                    int i32 = xVar.i(2);
                                    boolean h6 = xVar.h();
                                    int i33 = xVar.i(5);
                                    int i34 = 0;
                                    int i35 = 0;
                                    for (int i36 = 32; i34 < i36; i36 = 32) {
                                        if (xVar.h()) {
                                            i19 = 1;
                                            i35 |= 1 << i34;
                                        } else {
                                            i19 = 1;
                                        }
                                        i34 += i19;
                                    }
                                    int[] iArr = new int[6];
                                    uVar = uVar5;
                                    int i37 = 0;
                                    for (int i38 = 6; i37 < i38; i38 = 6) {
                                        iArr[i37] = xVar.i(8);
                                        i37++;
                                    }
                                    int i39 = xVar.i(8);
                                    int i40 = 0;
                                    for (int i41 = 0; i41 < i31; i41++) {
                                        if (xVar.h()) {
                                            i40 += 89;
                                        }
                                        if (xVar.h()) {
                                            i40 += 8;
                                        }
                                    }
                                    xVar.r(i40);
                                    if (i31 > 0) {
                                        xVar.r((8 - i31) * 2);
                                    }
                                    xVar.l();
                                    int l7 = xVar.l();
                                    if (l7 == 3) {
                                        xVar.q();
                                    }
                                    int l8 = xVar.l();
                                    int l9 = xVar.l();
                                    if (xVar.h()) {
                                        int l10 = xVar.l();
                                        int l11 = xVar.l();
                                        int l12 = xVar.l();
                                        int l13 = xVar.l();
                                        uVar2 = uVar6;
                                        if (l7 == 1 || l7 == 2) {
                                            i17 = 1;
                                            i18 = 2;
                                        } else {
                                            i17 = 1;
                                            i18 = 1;
                                        }
                                        l8 -= (l10 + l11) * i18;
                                        l9 -= (l12 + l13) * (l7 == i17 ? 2 : 1);
                                    } else {
                                        uVar2 = uVar6;
                                    }
                                    xVar.l();
                                    xVar.l();
                                    int l14 = xVar.l();
                                    for (int i42 = xVar.h() ? 0 : i31; i42 <= i31; i42++) {
                                        xVar.l();
                                        xVar.l();
                                        xVar.l();
                                    }
                                    xVar.l();
                                    xVar.l();
                                    xVar.l();
                                    xVar.l();
                                    xVar.l();
                                    xVar.l();
                                    if (xVar.h() && xVar.h()) {
                                        int i43 = 0;
                                        for (int i44 = 4; i43 < i44; i44 = 4) {
                                            u uVar8 = uVar7;
                                            int i45 = 0;
                                            for (int i46 = 6; i45 < i46; i46 = 6) {
                                                if (xVar.h()) {
                                                    i16 = 1;
                                                    j3 = j7;
                                                    int min = Math.min(64, 1 << ((i43 << 1) + 4));
                                                    if (i43 > 1) {
                                                        xVar.m();
                                                    }
                                                    for (int i47 = 0; i47 < min; i47++) {
                                                        xVar.m();
                                                    }
                                                } else {
                                                    xVar.l();
                                                    j3 = j7;
                                                    i16 = 1;
                                                }
                                                i45 += i43 == 3 ? 3 : i16;
                                                j7 = j3;
                                            }
                                            i43++;
                                            uVar7 = uVar8;
                                            j7 = j7;
                                        }
                                    }
                                    uVar3 = uVar7;
                                    j = j7;
                                    xVar.r(2);
                                    if (xVar.h()) {
                                        xVar.r(8);
                                        xVar.l();
                                        xVar.l();
                                        xVar.q();
                                    }
                                    int l15 = xVar.l();
                                    int i48 = 0;
                                    int i49 = 0;
                                    boolean z12 = false;
                                    while (i49 < l15) {
                                        if (i49 != 0) {
                                            z12 = xVar.h();
                                        }
                                        if (z12) {
                                            xVar.q();
                                            xVar.l();
                                            for (int i50 = 0; i50 <= i48; i50++) {
                                                if (xVar.h()) {
                                                    xVar.q();
                                                }
                                            }
                                            i15 = l15;
                                        } else {
                                            int l16 = xVar.l();
                                            int l17 = xVar.l();
                                            int i51 = l16 + l17;
                                            i15 = l15;
                                            for (int i52 = 0; i52 < l16; i52++) {
                                                xVar.l();
                                                xVar.q();
                                            }
                                            for (int i53 = 0; i53 < l17; i53++) {
                                                xVar.l();
                                                xVar.q();
                                            }
                                            i48 = i51;
                                        }
                                        i49++;
                                        l15 = i15;
                                    }
                                    if (xVar.h()) {
                                        for (int i54 = 0; i54 < xVar.l(); i54++) {
                                            xVar.r(l14 + 5);
                                        }
                                    }
                                    xVar.r(2);
                                    float f7 = 1.0f;
                                    if (xVar.h()) {
                                        if (xVar.h()) {
                                            int i55 = xVar.i(8);
                                            if (i55 == 255) {
                                                int i56 = xVar.i(16);
                                                int i57 = xVar.i(16);
                                                if (i56 != 0 && i57 != 0) {
                                                    f7 = i56 / i57;
                                                }
                                            } else if (i55 < 17) {
                                                f7 = AbstractC1664a.f17087d[i55];
                                            } else {
                                                AbstractC1663a.j(i55, "Unexpected aspect_ratio_idc value: ", "H265Reader");
                                            }
                                        }
                                        if (xVar.h()) {
                                            xVar.q();
                                        }
                                        if (xVar.h()) {
                                            xVar.r(4);
                                            if (xVar.h()) {
                                                xVar.r(24);
                                            }
                                        }
                                        if (xVar.h()) {
                                            xVar.l();
                                            xVar.l();
                                        }
                                        xVar.q();
                                        if (xVar.h()) {
                                            l9 *= 2;
                                        }
                                    }
                                    int i58 = l9;
                                    String d7 = AbstractC1664a.d(i32, h6, i33, i35, iArr, i39);
                                    Format$Builder format$Builder = new Format$Builder();
                                    format$Builder.f10528a = str;
                                    format$Builder.f10537k = "video/hevc";
                                    format$Builder.f10535h = d7;
                                    format$Builder.f10542p = l8;
                                    format$Builder.f10543q = i58;
                                    format$Builder.f10546t = f7;
                                    format$Builder.f10539m = Collections.singletonList(bArr3);
                                    vVar.a(new X(format$Builder));
                                    this.f5318e = true;
                                    u uVar9 = this.j;
                                    b7 = uVar9.b(i12);
                                    F1.v[] vVarArr = this.f5314a.f5123c;
                                    C0095a c0095a3 = this.f5326n;
                                    if (b7) {
                                        c0095a3.B(AbstractC1664a.F(uVar9.f5362e, uVar9.f5361d), uVar9.f5361d);
                                        c0095a3.E(5);
                                        P6.b.e(j8, c0095a3, vVarArr);
                                    }
                                    uVar4 = this.f5323k;
                                    if (uVar4.b(i12)) {
                                        c0095a3.B(AbstractC1664a.F(uVar4.f5362e, uVar4.f5361d), uVar4.f5361d);
                                        c0095a3.E(5);
                                        P6.b.e(j8, c0095a3, vVarArr);
                                    }
                                    long j11 = this.f5325m;
                                    q qVar2 = this.f5317d;
                                    boolean z13 = this.f5318e;
                                    qVar2.f5308g = false;
                                    qVar2.f5309h = false;
                                    qVar2.f5306e = j11;
                                    qVar2.f5305d = 0;
                                    long j12 = j;
                                    qVar2.f5303b = j12;
                                    i13 = i10;
                                    if (i13 >= 32 || i13 == 40) {
                                        z7 = false;
                                        i14 = 1;
                                        c3 = 3;
                                    } else {
                                        if (!qVar2.f5310i || qVar2.j) {
                                            z10 = false;
                                            c3 = 3;
                                        } else {
                                            if (z13) {
                                                long j13 = qVar2.f5312l;
                                                if (j13 != -9223372036854775807L) {
                                                    c3 = 3;
                                                    qVar2.f5302a.e(j13, qVar2.f5313m ? 1 : 0, (int) (j12 - qVar2.f5311k), i9, null);
                                                    z10 = false;
                                                    qVar2.f5310i = false;
                                                }
                                            }
                                            c3 = 3;
                                            z10 = false;
                                            qVar2.f5310i = false;
                                        }
                                        if ((32 > i13 || i13 > 35) && i13 != 39) {
                                            i14 = 1;
                                            z7 = z10;
                                        } else {
                                            i14 = 1;
                                            qVar2.f5309h = !qVar2.j;
                                            qVar2.j = true;
                                            z7 = z10;
                                        }
                                    }
                                    z8 = (i13 >= 16 || i13 > 21) ? z7 ? 1 : 0 : i14;
                                    qVar2.f5304c = z8;
                                    if (z8 == 0) {
                                        z9 = z7;
                                    }
                                    z9 = i14;
                                    qVar2.f5307f = z9;
                                    if (this.f5318e) {
                                        uVar3.d(i13);
                                        uVar2.d(i13);
                                        uVar.d(i13);
                                    }
                                    uVar9.d(i13);
                                    uVar4.d(i13);
                                    i20 = i14;
                                    i22 = i11;
                                    i23 = i8;
                                    bArr2 = bArr;
                                } else {
                                    uVar = uVar5;
                                    uVar2 = uVar6;
                                    i9 = i27;
                                    uVar3 = uVar7;
                                    i10 = i25;
                                    i11 = i24;
                                    j = j7;
                                }
                            }
                            u uVar92 = this.j;
                            b7 = uVar92.b(i12);
                            F1.v[] vVarArr2 = this.f5314a.f5123c;
                            C0095a c0095a32 = this.f5326n;
                            if (b7) {
                            }
                            uVar4 = this.f5323k;
                            if (uVar4.b(i12)) {
                            }
                            long j112 = this.f5325m;
                            q qVar22 = this.f5317d;
                            boolean z132 = this.f5318e;
                            qVar22.f5308g = false;
                            qVar22.f5309h = false;
                            qVar22.f5306e = j112;
                            qVar22.f5305d = 0;
                            long j122 = j;
                            qVar22.f5303b = j122;
                            i13 = i10;
                            if (i13 >= 32) {
                            }
                            z7 = false;
                            i14 = 1;
                            c3 = 3;
                            if (i13 >= 16) {
                            }
                            qVar22.f5304c = z8;
                            if (z8 == 0) {
                            }
                            z9 = i14;
                            qVar22.f5307f = z9;
                            if (this.f5318e) {
                            }
                            uVar92.d(i13);
                            uVar4.d(i13);
                            i20 = i14;
                            i22 = i11;
                            i23 = i8;
                            bArr2 = bArr;
                        }
                    } else {
                        i7 = i28;
                    }
                    i8 = i23;
                    bArr = bArr2;
                    qVar.f5311k = qVar.f5303b;
                    qVar.f5312l = qVar.f5306e;
                    qVar.f5313m = qVar.f5304c;
                    qVar.f5310i = true;
                    z4 = this.f5318e;
                    u uVar52 = this.f5322i;
                    u uVar62 = this.f5321h;
                    u uVar72 = this.f5320g;
                    if (z4) {
                    }
                    u uVar922 = this.j;
                    b7 = uVar922.b(i12);
                    F1.v[] vVarArr22 = this.f5314a.f5123c;
                    C0095a c0095a322 = this.f5326n;
                    if (b7) {
                    }
                    uVar4 = this.f5323k;
                    if (uVar4.b(i12)) {
                    }
                    long j1122 = this.f5325m;
                    q qVar222 = this.f5317d;
                    boolean z1322 = this.f5318e;
                    qVar222.f5308g = false;
                    qVar222.f5309h = false;
                    qVar222.f5306e = j1122;
                    qVar222.f5305d = 0;
                    long j1222 = j;
                    qVar222.f5303b = j1222;
                    i13 = i10;
                    if (i13 >= 32) {
                    }
                    z7 = false;
                    i14 = 1;
                    c3 = 3;
                    if (i13 >= 16) {
                    }
                    qVar222.f5304c = z8;
                    if (z8 == 0) {
                    }
                    z9 = i14;
                    qVar222.f5307f = z9;
                    if (this.f5318e) {
                    }
                    uVar922.d(i13);
                    uVar4.d(i13);
                    i20 = i14;
                    i22 = i11;
                    i23 = i8;
                    bArr2 = bArr;
                }
                i7 = i28;
                i8 = i23;
                bArr = bArr2;
                z4 = this.f5318e;
                u uVar522 = this.f5322i;
                u uVar622 = this.f5321h;
                u uVar722 = this.f5320g;
                if (z4) {
                }
                u uVar9222 = this.j;
                b7 = uVar9222.b(i12);
                F1.v[] vVarArr222 = this.f5314a.f5123c;
                C0095a c0095a3222 = this.f5326n;
                if (b7) {
                }
                uVar4 = this.f5323k;
                if (uVar4.b(i12)) {
                }
                long j11222 = this.f5325m;
                q qVar2222 = this.f5317d;
                boolean z13222 = this.f5318e;
                qVar2222.f5308g = false;
                qVar2222.f5309h = false;
                qVar2222.f5306e = j11222;
                qVar2222.f5305d = 0;
                long j12222 = j;
                qVar2222.f5303b = j12222;
                i13 = i10;
                if (i13 >= 32) {
                }
                z7 = false;
                i14 = 1;
                c3 = 3;
                if (i13 >= 16) {
                }
                qVar2222.f5304c = z8;
                if (z8 == 0) {
                }
                z9 = i14;
                qVar2222.f5307f = z9;
                if (this.f5318e) {
                }
                uVar9222.d(i13);
                uVar4.d(i13);
                i20 = i14;
                i22 = i11;
                i23 = i8;
                bArr2 = bArr;
            }
            c0095a2 = c0095a;
        }
    }

    @Override // P1.h
    public final void b() {
        this.f5324l = 0L;
        this.f5325m = -9223372036854775807L;
        AbstractC1664a.k(this.f5319f);
        this.f5320g.c();
        this.f5321h.c();
        this.f5322i.c();
        this.j.c();
        this.f5323k.c();
        q qVar = this.f5317d;
        if (qVar != null) {
            qVar.f5307f = false;
            qVar.f5308g = false;
            qVar.f5309h = false;
            qVar.f5310i = false;
            qVar.j = false;
        }
    }

    @Override // P1.h
    public final void c(F1.m mVar, J j) {
        j.a();
        j.d();
        this.f5315b = (String) j.f1238e;
        j.d();
        F1.v r7 = mVar.r(j.f1236c, 2);
        this.f5316c = r7;
        this.f5317d = new q(r7);
        this.f5314a.b(mVar, j);
    }

    @Override // P1.h
    public final void e(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f5325m = j;
        }
    }

    public final void f(byte[] bArr, int i7, int i8) {
        q qVar = this.f5317d;
        if (qVar.f5307f) {
            int i9 = qVar.f5305d;
            int i10 = (i7 + 2) - i9;
            if (i10 < i8) {
                qVar.f5308g = (bArr[i10] & 128) != 0;
                qVar.f5307f = false;
            } else {
                qVar.f5305d = (i8 - i7) + i9;
            }
        }
        if (!this.f5318e) {
            this.f5320g.a(bArr, i7, i8);
            this.f5321h.a(bArr, i7, i8);
            this.f5322i.a(bArr, i7, i8);
        }
        this.j.a(bArr, i7, i8);
        this.f5323k.a(bArr, i7, i8);
    }

    @Override // P1.h
    public final void d() {
    }
}
