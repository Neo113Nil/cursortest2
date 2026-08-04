package P1;

import A1.X;
import C0.J;
import C1.C0095a;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class m implements h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f5245l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f5246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0095a f5247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f5248c = new boolean[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f5249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f5250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f5251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f5252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f5253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public F1.v f5254i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5255k;

    public m(B b7) {
        this.f5246a = b7;
        k kVar = new k();
        kVar.f5236e = new byte[128];
        this.f5249d = kVar;
        this.f5255k = -9223372036854775807L;
        this.f5250e = new u(178);
        this.f5247b = new C0095a(4, false);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0256  */
    /* JADX WARN: Code duplicated, block: B:107:0x0274  */
    /* JADX WARN: Code duplicated, block: B:110:0x0281 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0286  */
    /* JADX WARN: Code duplicated, block: B:116:0x028b  */
    /* JADX WARN: Code duplicated, block: B:117:0x028d  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0203  */
    /* JADX WARN: Code duplicated, block: B:93:0x021f  */
    /* JADX WARN: Code duplicated, block: B:95:0x022d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0231  */
    /* JADX WARN: Code duplicated, block: B:99:0x0245 A[ADDED_TO_REGION] */
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
        int i8;
        boolean z4;
        int i9;
        long j;
        l lVar;
        boolean z7;
        boolean z8;
        long j3;
        int i10;
        float f7;
        C0095a c0095a2 = c0095a;
        boolean z9 = true;
        p151v2.a.i(this.f5251f);
        p151v2.a.i(this.f5254i);
        int i11 = c0095a2.f1463a;
        int i12 = c0095a2.f1464b;
        byte[] bArr = (byte[]) c0095a2.f1465c;
        this.f5252g += (long) c0095a.d();
        this.f5254i.c(c0095a.d(), c0095a2);
        while (true) {
            int iN = p151v2.a.n(bArr, i11, i12, this.f5248c);
            k kVar = this.f5249d;
            u uVar = this.f5250e;
            if (iN == i12) {
                if (!this.j) {
                    kVar.a(bArr, i11, i12);
                }
                this.f5251f.a(bArr, i11, i12);
                if (uVar != null) {
                    uVar.a(bArr, i11, i12);
                    return;
                }
                return;
            }
            int i13 = iN + 3;
            byte b7 = ((byte[]) c0095a2.f1465c)[i13];
            int i14 = b7 & 255;
            int i15 = iN - i11;
            if (this.j) {
                i7 = i12;
                i8 = i13;
            } else {
                if (i15 > 0) {
                    kVar.a(bArr, i11, iN);
                }
                int i16 = i15 < 0 ? -i15 : 0;
                int i17 = kVar.f5233b;
                if (i17 != 0) {
                    i8 = i13;
                    if (i17 == z9) {
                        i7 = i12;
                        if (i14 != 181) {
                            Log.w("H263Reader", "Unexpected start code value");
                            kVar.f5232a = false;
                            kVar.f5234c = 0;
                            kVar.f5233b = 0;
                        } else {
                            kVar.f5233b = 2;
                        }
                    } else if (i17 != 2) {
                        i7 = i12;
                        if (i17 != 3) {
                            if (i17 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i14 == 179 || i14 == 181) {
                                kVar.f5234c -= i16;
                                kVar.f5232a = false;
                                F1.v vVar = this.f5254i;
                                int i18 = kVar.f5235d;
                                String str = this.f5253h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(kVar.f5236e, kVar.f5234c);
                                F1.x xVar = new F1.x(bArrCopyOf, bArrCopyOf.length);
                                xVar.s(i18);
                                xVar.s(4);
                                xVar.q();
                                xVar.r(8);
                                if (xVar.h()) {
                                    xVar.r(4);
                                    xVar.r(3);
                                }
                                int i19 = xVar.i(4);
                                if (i19 == 15) {
                                    int i20 = xVar.i(8);
                                    int i21 = xVar.i(8);
                                    if (i21 == 0) {
                                        Log.w("H263Reader", "Invalid aspect ratio");
                                        f7 = 1.0f;
                                    } else {
                                        f7 = i20 / i21;
                                    }
                                } else if (i19 < 7) {
                                    f7 = f5245l[i19];
                                } else {
                                    Log.w("H263Reader", "Invalid aspect ratio");
                                    f7 = 1.0f;
                                }
                                if (xVar.h()) {
                                    xVar.r(2);
                                    xVar.r(1);
                                    if (xVar.h()) {
                                        xVar.r(15);
                                        xVar.q();
                                        xVar.r(15);
                                        xVar.q();
                                        xVar.r(15);
                                        xVar.q();
                                        xVar.r(3);
                                        xVar.r(11);
                                        xVar.q();
                                        xVar.r(15);
                                        xVar.q();
                                    }
                                }
                                if (xVar.i(2) != 0) {
                                    Log.w("H263Reader", "Unhandled video object layer shape");
                                }
                                xVar.q();
                                int i22 = xVar.i(16);
                                xVar.q();
                                if (xVar.h()) {
                                    if (i22 == 0) {
                                        Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i23 = 0;
                                        for (int i24 = i22 - 1; i24 > 0; i24 >>= 1) {
                                            i23++;
                                        }
                                        xVar.r(i23);
                                    }
                                }
                                xVar.q();
                                int i25 = xVar.i(13);
                                xVar.q();
                                int i26 = xVar.i(13);
                                xVar.q();
                                xVar.q();
                                Format$Builder format$Builder = new Format$Builder();
                                format$Builder.f10528a = str;
                                format$Builder.f10537k = "video/mp4v-es";
                                format$Builder.f10542p = i25;
                                format$Builder.f10543q = i26;
                                format$Builder.f10546t = f7;
                                format$Builder.f10539m = Collections.singletonList(bArrCopyOf);
                                vVar.a(new X(format$Builder));
                                this.j = true;
                            }
                            this.f5251f.a(bArr, i11, iN);
                            if (uVar == null) {
                                c0095a2 = c0095a;
                                z4 = true;
                            } else {
                                if (i15 > 0) {
                                    uVar.a(bArr, i11, iN);
                                    i10 = 0;
                                } else {
                                    i10 = -i15;
                                }
                                if (uVar.b(i10)) {
                                    int iF = p151v2.a.F(uVar.f5362e, uVar.f5361d);
                                    int i27 = p151v2.t.f17159a;
                                    byte[] bArr2 = uVar.f5361d;
                                    C0095a c0095a3 = this.f5247b;
                                    c0095a3.B(iF, bArr2);
                                    this.f5246a.a(this.f5255k, c0095a3);
                                }
                                if (i14 == 178) {
                                    c0095a2 = c0095a;
                                    z4 = true;
                                    if (((byte[]) c0095a2.f1465c)[iN + 2] == 1) {
                                        uVar.d(i14);
                                    }
                                } else {
                                    c0095a2 = c0095a;
                                    z4 = true;
                                }
                            }
                            i9 = i7 - iN;
                            j = this.f5252g - ((long) i9);
                            lVar = this.f5251f;
                            boolean z10 = this.j;
                            if (lVar.f5241e == 182 && z10 && lVar.f5238b) {
                                j3 = lVar.f5244h;
                                if (j3 != -9223372036854775807L) {
                                    lVar.f5237a.e(j3, lVar.f5240d ? 1 : 0, (int) (j - lVar.f5243g), i9, null);
                                }
                            }
                            if (lVar.f5241e != 179) {
                                lVar.f5243g = j;
                            }
                            l lVar2 = this.f5251f;
                            long j7 = this.f5255k;
                            lVar2.f5241e = i14;
                            lVar2.f5240d = false;
                            if (i14 != 182 || i14 == 179) {
                                z7 = z4;
                            } else {
                                z7 = false;
                            }
                            lVar2.f5238b = z7;
                            if (i14 == 182) {
                                z8 = z4;
                            } else {
                                z8 = false;
                            }
                            lVar2.f5239c = z8;
                            lVar2.f5242f = 0;
                            lVar2.f5244h = j7;
                            z9 = z4;
                            i11 = i8;
                            i12 = i7;
                        } else if ((b7 & 240) != 32) {
                            Log.w("H263Reader", "Unexpected start code value");
                            kVar.f5232a = false;
                            kVar.f5234c = 0;
                            kVar.f5233b = 0;
                        } else {
                            kVar.f5235d = kVar.f5234c;
                            kVar.f5233b = 4;
                        }
                    } else {
                        i7 = i12;
                        if (i14 > 31) {
                            Log.w("H263Reader", "Unexpected start code value");
                            kVar.f5232a = false;
                            kVar.f5234c = 0;
                            kVar.f5233b = 0;
                        } else {
                            kVar.f5233b = 3;
                        }
                    }
                } else {
                    i7 = i12;
                    i8 = i13;
                    if (i14 == 176) {
                        kVar.f5233b = 1;
                        kVar.f5232a = true;
                    }
                }
                kVar.a(k.f5231f, 0, 3);
                this.f5251f.a(bArr, i11, iN);
                if (uVar == null) {
                    c0095a2 = c0095a;
                    z4 = true;
                } else {
                    if (i15 > 0) {
                        uVar.a(bArr, i11, iN);
                        i10 = 0;
                    } else {
                        i10 = -i15;
                    }
                    if (uVar.b(i10)) {
                        int iF2 = p151v2.a.F(uVar.f5362e, uVar.f5361d);
                        int i28 = p151v2.t.f17159a;
                        byte[] bArr3 = uVar.f5361d;
                        C0095a c0095a4 = this.f5247b;
                        c0095a4.B(iF2, bArr3);
                        this.f5246a.a(this.f5255k, c0095a4);
                    }
                    if (i14 == 178) {
                        c0095a2 = c0095a;
                        z4 = true;
                        if (((byte[]) c0095a2.f1465c)[iN + 2] == 1) {
                            uVar.d(i14);
                        }
                    } else {
                        c0095a2 = c0095a;
                        z4 = true;
                    }
                }
                i9 = i7 - iN;
                j = this.f5252g - ((long) i9);
                lVar = this.f5251f;
                boolean z11 = this.j;
                if (lVar.f5241e == 182) {
                    j3 = lVar.f5244h;
                    if (j3 != -9223372036854775807L) {
                        lVar.f5237a.e(j3, lVar.f5240d ? 1 : 0, (int) (j - lVar.f5243g), i9, null);
                    }
                }
                if (lVar.f5241e != 179) {
                    lVar.f5243g = j;
                }
                l lVar3 = this.f5251f;
                long j8 = this.f5255k;
                lVar3.f5241e = i14;
                lVar3.f5240d = false;
                if (i14 != 182) {
                    z7 = z4;
                } else {
                    z7 = z4;
                }
                lVar3.f5238b = z7;
                if (i14 == 182) {
                    z8 = z4;
                } else {
                    z8 = false;
                }
                lVar3.f5239c = z8;
                lVar3.f5242f = 0;
                lVar3.f5244h = j8;
                z9 = z4;
                i11 = i8;
                i12 = i7;
            }
            this.f5251f.a(bArr, i11, iN);
            if (uVar == null) {
                c0095a2 = c0095a;
                z4 = true;
            } else {
                if (i15 > 0) {
                    uVar.a(bArr, i11, iN);
                    i10 = 0;
                } else {
                    i10 = -i15;
                }
                if (uVar.b(i10)) {
                    int iF3 = p151v2.a.F(uVar.f5362e, uVar.f5361d);
                    int i29 = p151v2.t.f17159a;
                    byte[] bArr4 = uVar.f5361d;
                    C0095a c0095a5 = this.f5247b;
                    c0095a5.B(iF3, bArr4);
                    this.f5246a.a(this.f5255k, c0095a5);
                }
                if (i14 == 178) {
                    c0095a2 = c0095a;
                    z4 = true;
                    if (((byte[]) c0095a2.f1465c)[iN + 2] == 1) {
                        uVar.d(i14);
                    }
                } else {
                    c0095a2 = c0095a;
                    z4 = true;
                }
            }
            i9 = i7 - iN;
            j = this.f5252g - ((long) i9);
            lVar = this.f5251f;
            boolean z12 = this.j;
            if (lVar.f5241e == 182) {
                j3 = lVar.f5244h;
                if (j3 != -9223372036854775807L) {
                    lVar.f5237a.e(j3, lVar.f5240d ? 1 : 0, (int) (j - lVar.f5243g), i9, null);
                }
            }
            if (lVar.f5241e != 179) {
                lVar.f5243g = j;
            }
            l lVar4 = this.f5251f;
            long j9 = this.f5255k;
            lVar4.f5241e = i14;
            lVar4.f5240d = false;
            if (i14 != 182) {
                z7 = z4;
            } else {
                z7 = z4;
            }
            lVar4.f5238b = z7;
            if (i14 == 182) {
                z8 = z4;
            } else {
                z8 = false;
            }
            lVar4.f5239c = z8;
            lVar4.f5242f = 0;
            lVar4.f5244h = j9;
            z9 = z4;
            i11 = i8;
            i12 = i7;
        }
    }

    @Override // P1.h
    public final void b() {
        p151v2.a.k(this.f5248c);
        k kVar = this.f5249d;
        kVar.f5232a = false;
        kVar.f5234c = 0;
        kVar.f5233b = 0;
        l lVar = this.f5251f;
        if (lVar != null) {
            lVar.f5238b = false;
            lVar.f5239c = false;
            lVar.f5240d = false;
            lVar.f5241e = -1;
        }
        u uVar = this.f5250e;
        if (uVar != null) {
            uVar.c();
        }
        this.f5252g = 0L;
        this.f5255k = -9223372036854775807L;
    }

    @Override // P1.h
    public final void c(F1.m mVar, J j) {
        j.a();
        j.d();
        this.f5253h = (String) j.f1238e;
        j.d();
        F1.v vVarR = mVar.r(j.f1236c, 2);
        this.f5254i = vVarR;
        this.f5251f = new l(vVarR);
        this.f5246a.b(mVar, j);
    }

    @Override // P1.h
    public final void e(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f5255k = j;
        }
    }

    @Override // P1.h
    public final void d() {
    }
}
