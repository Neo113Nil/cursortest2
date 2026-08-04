package P1;

import A1.X;
import C0.J;
import C1.C0095a;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class r implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f5314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F1.v f5316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f5317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5318e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5324l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f5319f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f5320g = new u(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f5321h = new u(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u f5322i = new u(34);
    public final u j = new u(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f5323k = new u(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5325m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0095a f5326n = new C0095a(4, false);

    public r(B b7) {
        this.f5314a = b7;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:182:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:185:0x0403  */
    /* JADX WARN: Code duplicated, block: B:188:0x0430  */
    /* JADX WARN: Code duplicated, block: B:190:0x0434  */
    /* JADX WARN: Code duplicated, block: B:201:0x0460  */
    /* JADX WARN: Code duplicated, block: B:214:0x0483  */
    /* JADX WARN: Code duplicated, block: B:217:0x0489  */
    /* JADX WARN: Code duplicated, block: B:220:0x048e  */
    /* JADX WARN: Code duplicated, block: B:222:0x0492  */
    /* JADX WARN: Code duplicated, block: B:225:0x0499  */
    /* JADX WARN: Code duplicated, block: B:233:0x04a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // P1.h
    public final void a(C0095a c0095a) {
        int i7;
        boolean z4;
        u uVar;
        u uVar2;
        u uVar3;
        int i8;
        u uVar4;
        boolean zB;
        F1.v[] vVarArr;
        C0095a c0095a2;
        u uVar5;
        int i9;
        boolean z7;
        int i10;
        char c3;
        boolean z8;
        boolean z9;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 1;
        p151v2.a.i(this.f5316c);
        int i16 = p151v2.t.f17159a;
        while (c0095a.d() > 0) {
            int i17 = c0095a.f1463a;
            int i18 = c0095a.f1464b;
            byte[] bArr = (byte[]) c0095a.f1465c;
            this.f5324l += (long) c0095a.d();
            this.f5316c.c(c0095a.d(), c0095a);
            while (i17 < i18) {
                int iN = p151v2.a.n(bArr, i17, i18, this.f5319f);
                if (iN == i18) {
                    f(bArr, i17, i18);
                    return;
                }
                int i19 = iN + 3;
                int i20 = (bArr[i19] & 126) >> i15;
                int i21 = iN - i17;
                if (i21 > 0) {
                    f(bArr, i17, iN);
                }
                int i22 = i18 - iN;
                long j = this.f5324l - ((long) i22);
                int i23 = i21 < 0 ? -i21 : 0;
                int i24 = i19;
                long j3 = this.f5325m;
                q qVar = this.f5317d;
                boolean z11 = this.f5318e;
                if (qVar.j && qVar.f5308g) {
                    qVar.f5313m = qVar.f5304c;
                    qVar.j = false;
                } else {
                    if (qVar.f5309h || qVar.f5308g) {
                        if (z11 && qVar.f5310i) {
                            long j7 = qVar.f5303b;
                            i7 = i23;
                            int i25 = i22 + ((int) (j - j7));
                            long j8 = qVar.f5312l;
                            if (j8 != -9223372036854775807L) {
                                qVar.f5302a.e(j8, qVar.f5313m ? 1 : 0, (int) (j7 - qVar.f5311k), i25, null);
                            }
                            qVar.f5311k = qVar.f5303b;
                            qVar.f5312l = qVar.f5306e;
                            qVar.f5313m = qVar.f5304c;
                            qVar.f5310i = true;
                        } else {
                            i7 = i23;
                        }
                        qVar.f5311k = qVar.f5303b;
                        qVar.f5312l = qVar.f5306e;
                        qVar.f5313m = qVar.f5304c;
                        qVar.f5310i = true;
                    }
                    z4 = this.f5318e;
                    uVar = this.f5322i;
                    uVar2 = this.f5321h;
                    uVar3 = this.f5320g;
                    if (z4) {
                        i8 = i7;
                    } else {
                        i8 = i7;
                        uVar3.b(i8);
                        uVar2.b(i8);
                        uVar.b(i8);
                        if (!uVar3.f5360c && uVar2.f5360c && uVar.f5360c) {
                            F1.v vVar = this.f5316c;
                            String str = this.f5315b;
                            int i26 = uVar3.f5362e;
                            i24 = i24;
                            byte[] bArr2 = new byte[uVar2.f5362e + i26 + uVar.f5362e];
                            i22 = i22;
                            System.arraycopy(uVar3.f5361d, 0, bArr2, 0, i26);
                            i20 = i20;
                            System.arraycopy(uVar2.f5361d, 0, bArr2, uVar3.f5362e, uVar2.f5362e);
                            System.arraycopy(uVar.f5361d, 0, bArr2, uVar3.f5362e + uVar2.f5362e, uVar.f5362e);
                            F1.x xVar = new F1.x(uVar2.f5361d, 0, uVar2.f5362e);
                            xVar.r(44);
                            int i27 = xVar.i(3);
                            xVar.q();
                            int i28 = xVar.i(2);
                            boolean zH = xVar.h();
                            int i29 = xVar.i(5);
                            int i30 = 0;
                            int i31 = 0;
                            for (int i32 = 32; i30 < i32; i32 = 32) {
                                if (xVar.h()) {
                                    i14 = 1;
                                    i31 |= 1 << i30;
                                } else {
                                    i14 = 1;
                                }
                                i30 += i14;
                            }
                            int[] iArr = new int[6];
                            uVar = uVar;
                            int i33 = 0;
                            for (int i34 = 6; i33 < i34; i34 = 6) {
                                iArr[i33] = xVar.i(8);
                                i33++;
                            }
                            int i35 = xVar.i(8);
                            int i36 = 0;
                            for (int i37 = 0; i37 < i27; i37++) {
                                if (xVar.h()) {
                                    i36 += 89;
                                }
                                if (xVar.h()) {
                                    i36 += 8;
                                }
                            }
                            xVar.r(i36);
                            if (i27 > 0) {
                                xVar.r((8 - i27) * 2);
                            }
                            xVar.l();
                            int iL = xVar.l();
                            if (iL == 3) {
                                xVar.q();
                            }
                            int iL2 = xVar.l();
                            int iL3 = xVar.l();
                            if (xVar.h()) {
                                int iL4 = xVar.l();
                                int iL5 = xVar.l();
                                int iL6 = xVar.l();
                                int iL7 = xVar.l();
                                if (iL == 1 || iL == 2) {
                                    i12 = 1;
                                    i13 = 2;
                                } else {
                                    i12 = 1;
                                    i13 = 1;
                                }
                                iL2 -= (iL4 + iL5) * i13;
                                iL3 -= (iL6 + iL7) * (iL == i12 ? 2 : 1);
                            }
                            xVar.l();
                            xVar.l();
                            int iL8 = xVar.l();
                            for (int i38 = xVar.h() ? 0 : i27; i38 <= i27; i38++) {
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
                                int i39 = 0;
                                for (int i40 = 4; i39 < i40; i40 = 4) {
                                    u uVar6 = uVar3;
                                    int i41 = 0;
                                    for (int i42 = 6; i41 < i42; i42 = 6) {
                                        if (xVar.h()) {
                                            i11 = 1;
                                            int iMin = Math.min(64, 1 << ((i39 << 1) + 4));
                                            if (i39 > 1) {
                                                xVar.m();
                                            }
                                            for (int i43 = 0; i43 < iMin; i43++) {
                                                xVar.m();
                                            }
                                        } else {
                                            xVar.l();
                                            i11 = 1;
                                        }
                                        i41 += i39 == 3 ? 3 : i11;
                                        j = j;
                                    }
                                    i39++;
                                    uVar3 = uVar6;
                                    j = j;
                                }
                            }
                            uVar3 = uVar3;
                            j = j;
                            xVar.r(2);
                            if (xVar.h()) {
                                xVar.r(8);
                                xVar.l();
                                xVar.l();
                                xVar.q();
                            }
                            int i44 = 0;
                            int i45 = 0;
                            boolean zH2 = false;
                            for (int iL9 = xVar.l(); i45 < iL9; iL9 = iL9) {
                                if (i45 != 0) {
                                    zH2 = xVar.h();
                                }
                                if (zH2) {
                                    xVar.q();
                                    xVar.l();
                                    for (int i46 = 0; i46 <= i44; i46++) {
                                        if (xVar.h()) {
                                            xVar.q();
                                        }
                                    }
                                } else {
                                    int iL10 = xVar.l();
                                    int iL11 = xVar.l();
                                    int i47 = iL10 + iL11;
                                    for (int i48 = 0; i48 < iL10; i48++) {
                                        xVar.l();
                                        xVar.q();
                                    }
                                    for (int i49 = 0; i49 < iL11; i49++) {
                                        xVar.l();
                                        xVar.q();
                                    }
                                    i44 = i47;
                                }
                                i45++;
                            }
                            if (xVar.h()) {
                                for (int i50 = 0; i50 < xVar.l(); i50++) {
                                    xVar.r(iL8 + 5);
                                }
                            }
                            xVar.r(2);
                            float f7 = 1.0f;
                            if (xVar.h()) {
                                if (xVar.h()) {
                                    int i51 = xVar.i(8);
                                    if (i51 == 255) {
                                        int i52 = xVar.i(16);
                                        int i53 = xVar.i(16);
                                        if (i52 != 0 && i53 != 0) {
                                            f7 = i52 / i53;
                                        }
                                    } else if (i51 < 17) {
                                        f7 = p151v2.a.f17093d[i51];
                                    } else {
                                        p150v0.a.j(i51, "Unexpected aspect_ratio_idc value: ", "H265Reader");
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
                                    iL3 *= 2;
                                }
                            }
                            int i54 = iL3;
                            String strD = p151v2.a.d(i28, zH, i29, i31, iArr, i35);
                            Format$Builder format$Builder = new Format$Builder();
                            format$Builder.f10528a = str;
                            format$Builder.f10537k = "video/hevc";
                            format$Builder.f10535h = strD;
                            format$Builder.f10542p = iL2;
                            format$Builder.f10543q = i54;
                            format$Builder.f10546t = f7;
                            format$Builder.f10539m = Collections.singletonList(bArr2);
                            vVar.a(new X(format$Builder));
                            this.f5318e = true;
                        }
                        uVar4 = this.j;
                        zB = uVar4.b(i8);
                        vVarArr = this.f5314a.f5123c;
                        c0095a2 = this.f5326n;
                        if (zB) {
                            c0095a2.B(p151v2.a.F(uVar4.f5362e, uVar4.f5361d), uVar4.f5361d);
                            c0095a2.E(5);
                            P6.b.e(j3, c0095a2, vVarArr);
                        }
                        uVar5 = this.f5323k;
                        if (uVar5.b(i8)) {
                            c0095a2.B(p151v2.a.F(uVar5.f5362e, uVar5.f5361d), uVar5.f5361d);
                            c0095a2.E(5);
                            P6.b.e(j3, c0095a2, vVarArr);
                        }
                        long j9 = this.f5325m;
                        q qVar2 = this.f5317d;
                        boolean z12 = this.f5318e;
                        qVar2.f5308g = false;
                        qVar2.f5309h = false;
                        qVar2.f5306e = j9;
                        qVar2.f5305d = 0;
                        long j10 = j;
                        qVar2.f5303b = j10;
                        i9 = i20;
                        if (i9 >= 32 || i9 == 40) {
                            z7 = false;
                            i10 = 1;
                            c3 = 3;
                        } else {
                            if (!qVar2.f5310i || qVar2.j) {
                                z10 = false;
                                c3 = 3;
                            } else {
                                if (z12) {
                                    long j11 = qVar2.f5312l;
                                    if (j11 == -9223372036854775807L) {
                                        c3 = 3;
                                    } else {
                                        c3 = 3;
                                        qVar2.f5302a.e(j11, qVar2.f5313m ? 1 : 0, (int) (j10 - qVar2.f5311k), i22, null);
                                    }
                                } else {
                                    c3 = 3;
                                }
                                z10 = false;
                                qVar2.f5310i = false;
                            }
                            if ((32 > i9 || i9 > 35) && i9 != 39) {
                                i10 = 1;
                                z7 = z10;
                            } else {
                                i10 = 1;
                                qVar2.f5309h = !qVar2.j;
                                qVar2.j = true;
                                z7 = z10;
                            }
                        }
                        if (i9 >= 16 || i9 > 21) {
                            z8 = z7 ? 1 : 0;
                        } else {
                            z8 = i10;
                        }
                        qVar2.f5304c = z8;
                        if (z8 == 0 || i9 <= 9) {
                            z9 = z7;
                            z9 = i10;
                        }
                        z9 = z7;
                        qVar2.f5307f = z9;
                        if (!this.f5318e) {
                            uVar3.d(i9);
                            uVar2.d(i9);
                            uVar.d(i9);
                        }
                        uVar4.d(i9);
                        uVar5.d(i9);
                        i15 = i10;
                        i17 = i24;
                        i18 = i18;
                        bArr = bArr;
                    }
                    uVar4 = this.j;
                    zB = uVar4.b(i8);
                    vVarArr = this.f5314a.f5123c;
                    c0095a2 = this.f5326n;
                    if (zB) {
                        c0095a2.B(p151v2.a.F(uVar4.f5362e, uVar4.f5361d), uVar4.f5361d);
                        c0095a2.E(5);
                        P6.b.e(j3, c0095a2, vVarArr);
                    }
                    uVar5 = this.f5323k;
                    if (uVar5.b(i8)) {
                        c0095a2.B(p151v2.a.F(uVar5.f5362e, uVar5.f5361d), uVar5.f5361d);
                        c0095a2.E(5);
                        P6.b.e(j3, c0095a2, vVarArr);
                    }
                    long j12 = this.f5325m;
                    q qVar3 = this.f5317d;
                    boolean z13 = this.f5318e;
                    qVar3.f5308g = false;
                    qVar3.f5309h = false;
                    qVar3.f5306e = j12;
                    qVar3.f5305d = 0;
                    long j13 = j;
                    qVar3.f5303b = j13;
                    i9 = i20;
                    if (i9 >= 32) {
                        z7 = false;
                        i10 = 1;
                        c3 = 3;
                    } else {
                        z7 = false;
                        i10 = 1;
                        c3 = 3;
                    }
                    if (i9 >= 16) {
                        z8 = z7 ? 1 : 0;
                    } else {
                        z8 = z7 ? 1 : 0;
                    }
                    qVar3.f5304c = z8;
                    if (z8 == 0) {
                        z9 = z7;
                        z9 = i10;
                    } else {
                        z9 = z7;
                        z9 = i10;
                    }
                    z9 = z7;
                    qVar3.f5307f = z9;
                    if (!this.f5318e) {
                        uVar3.d(i9);
                        uVar2.d(i9);
                        uVar.d(i9);
                    }
                    uVar4.d(i9);
                    uVar5.d(i9);
                    i15 = i10;
                    i17 = i24;
                    i18 = i18;
                    bArr = bArr;
                }
                i7 = i23;
                i18 = i18;
                bArr = bArr;
                z4 = this.f5318e;
                uVar = this.f5322i;
                uVar2 = this.f5321h;
                uVar3 = this.f5320g;
                if (z4) {
                    i8 = i7;
                    uVar3.b(i8);
                    uVar2.b(i8);
                    uVar.b(i8);
                    if (!uVar3.f5360c) {
                    }
                } else {
                    i8 = i7;
                }
                uVar4 = this.j;
                zB = uVar4.b(i8);
                vVarArr = this.f5314a.f5123c;
                c0095a2 = this.f5326n;
                if (zB) {
                    c0095a2.B(p151v2.a.F(uVar4.f5362e, uVar4.f5361d), uVar4.f5361d);
                    c0095a2.E(5);
                    P6.b.e(j3, c0095a2, vVarArr);
                }
                uVar5 = this.f5323k;
                if (uVar5.b(i8)) {
                    c0095a2.B(p151v2.a.F(uVar5.f5362e, uVar5.f5361d), uVar5.f5361d);
                    c0095a2.E(5);
                    P6.b.e(j3, c0095a2, vVarArr);
                }
                long j14 = this.f5325m;
                q qVar4 = this.f5317d;
                boolean z14 = this.f5318e;
                qVar4.f5308g = false;
                qVar4.f5309h = false;
                qVar4.f5306e = j14;
                qVar4.f5305d = 0;
                long j15 = j;
                qVar4.f5303b = j15;
                i9 = i20;
                if (i9 >= 32) {
                    z7 = false;
                    i10 = 1;
                    c3 = 3;
                } else {
                    z7 = false;
                    i10 = 1;
                    c3 = 3;
                }
                if (i9 >= 16) {
                    z8 = z7 ? 1 : 0;
                } else {
                    z8 = z7 ? 1 : 0;
                }
                qVar4.f5304c = z8;
                if (z8 == 0) {
                    z9 = z7;
                    z9 = i10;
                } else {
                    z9 = z7;
                    z9 = i10;
                }
                z9 = z7;
                qVar4.f5307f = z9;
                if (!this.f5318e) {
                    uVar3.d(i9);
                    uVar2.d(i9);
                    uVar.d(i9);
                }
                uVar4.d(i9);
                uVar5.d(i9);
                i15 = i10;
                i17 = i24;
                i18 = i18;
                bArr = bArr;
            }
        }
    }

    @Override // P1.h
    public final void b() {
        this.f5324l = 0L;
        this.f5325m = -9223372036854775807L;
        p151v2.a.k(this.f5319f);
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
        F1.v vVarR = mVar.r(j.f1236c, 2);
        this.f5316c = vVarR;
        this.f5317d = new q(vVarR);
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
