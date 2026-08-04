package P1;

import A1.X;
import C0.J;
import C1.C0095a;
import android.util.Pair;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class j implements h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f5215q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F1.v f5217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f5218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0095a f5219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f5220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f5221f = new boolean[4];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f5222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5224i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5227m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5228n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5229o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
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

    /* JADX WARN: Code duplicated, block: B:63:0x0194  */
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
        i iVar;
        u uVar;
        int i7;
        int i8;
        boolean z4;
        boolean z7;
        boolean z8;
        int i9;
        float f7;
        long j;
        float f8;
        int i10;
        char c3 = 4;
        p151v2.a.i(this.f5217b);
        int i11 = c0095a.f1463a;
        int i12 = c0095a.f1464b;
        byte[] bArr = (byte[]) c0095a.f1465c;
        this.f5223h += (long) c0095a.d();
        this.f5217b.c(c0095a.d(), c0095a);
        while (true) {
            int iN = p151v2.a.n(bArr, i11, i12, this.f5221f);
            iVar = this.f5222g;
            uVar = this.f5220e;
            if (iN == i12) {
                break;
            }
            int i13 = iN + 3;
            int i14 = ((byte[]) c0095a.f1465c)[i13] & 255;
            int i15 = iN - i11;
            if (this.j) {
                i7 = i12;
                i8 = i13;
                i11 = i11;
            } else {
                if (i15 > 0) {
                    iVar.a(bArr, i11, iN);
                }
                int i16 = i15 < 0 ? -i15 : 0;
                if (iVar.f5211a) {
                    int i17 = iVar.f5212b - i16;
                    iVar.f5212b = i17;
                    if (iVar.f5213c == 0 && i14 == 181) {
                        iVar.f5213c = i17;
                        i7 = i12;
                        i8 = i13;
                        i11 = i11;
                    } else {
                        iVar.f5211a = false;
                        String str = this.f5216a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(iVar.f5214d, iVar.f5212b);
                        int i18 = bArrCopyOf[c3] & 255;
                        byte b7 = bArrCopyOf[5];
                        i8 = i13;
                        i7 = i12;
                        int i19 = ((b7 & 255) >> 4) | (i18 << 4);
                        int i20 = ((b7 & 15) << 8) | (bArrCopyOf[6] & 255);
                        int i21 = (bArrCopyOf[7] & 240) >> 4;
                        if (i21 != 2) {
                            if (i21 == 3) {
                                f8 = i20 * 16;
                                i10 = i19 * 9;
                            } else if (i21 != 4) {
                                f7 = 1.0f;
                            } else {
                                f8 = i20 * 121;
                                i10 = i19 * 100;
                            }
                            f7 = f8 / i10;
                        } else {
                            f7 = (i20 * 4) / (i19 * 3);
                        }
                        Format$Builder format$Builder = new Format$Builder();
                        format$Builder.f10528a = str;
                        format$Builder.f10537k = "video/mpeg2";
                        format$Builder.f10542p = i19;
                        format$Builder.f10543q = i20;
                        format$Builder.f10546t = f7;
                        format$Builder.f10539m = Collections.singletonList(bArrCopyOf);
                        X x4 = new X(format$Builder);
                        int i22 = (bArrCopyOf[7] & 15) - 1;
                        if (i22 < 0 || i22 >= 8) {
                            i11 = i11;
                            j = 0;
                        } else {
                            double d7 = f5215q[i22];
                            byte b8 = bArrCopyOf[iVar.f5213c + 9];
                            int i23 = (b8 & 96) >> 5;
                            int i24 = b8 & 31;
                            if (i23 != i24) {
                                d7 *= (((double) i23) + 1.0d) / ((double) (i24 + 1));
                            }
                            j = (long) (1000000.0d / d7);
                        }
                        Pair pairCreate = Pair.create(x4, Long.valueOf(j));
                        this.f5217b.a((X) pairCreate.first);
                        this.f5225k = ((Long) pairCreate.second).longValue();
                        this.j = true;
                    }
                } else {
                    i7 = i12;
                    i8 = i13;
                    i11 = i11;
                    if (i14 == 179) {
                        iVar.f5211a = true;
                    }
                }
                iVar.a(i.f5210e, 0, 3);
            }
            if (uVar == null) {
                z4 = true;
            } else {
                if (i15 > 0) {
                    uVar.a(bArr, i11, iN);
                    i9 = 0;
                } else {
                    i9 = -i15;
                }
                if (uVar.b(i9)) {
                    int iF = p151v2.a.F(uVar.f5362e, uVar.f5361d);
                    int i25 = p151v2.t.f17159a;
                    byte[] bArr2 = uVar.f5361d;
                    C0095a c0095a2 = this.f5219d;
                    c0095a2.B(iF, bArr2);
                    this.f5218c.a(this.f5228n, c0095a2);
                }
                if (i14 == 178) {
                    z4 = true;
                    if (((byte[]) c0095a.f1465c)[iN + 2] == 1) {
                        uVar.d(i14);
                    }
                } else {
                    z4 = true;
                }
            }
            if (i14 == 0 || i14 == 179) {
                int i26 = i7 - iN;
                if (this.f5230p && this.j) {
                    long j3 = this.f5228n;
                    if (j3 != -9223372036854775807L) {
                        this.f5217b.e(j3, this.f5229o ? 1 : 0, ((int) (this.f5223h - this.f5227m)) - i26, i26, null);
                    }
                }
                if (!this.f5224i || this.f5230p) {
                    this.f5227m = this.f5223h - ((long) i26);
                    long j7 = this.f5226l;
                    if (j7 == -9223372036854775807L) {
                        long j8 = this.f5228n;
                        j7 = j8 != -9223372036854775807L ? j8 + this.f5225k : -9223372036854775807L;
                    }
                    this.f5228n = j7;
                    z7 = false;
                    this.f5229o = false;
                    this.f5226l = -9223372036854775807L;
                    z8 = true;
                    this.f5224i = true;
                } else {
                    z7 = false;
                    z8 = true;
                }
                this.f5230p = i14 == 0 ? z8 : z7;
            } else if (i14 == 184) {
                this.f5229o = z4;
            }
            i12 = i7;
            i11 = i8;
            c3 = 4;
        }
        if (!this.j) {
            iVar.a(bArr, i11, i12);
        }
        if (uVar != null) {
            uVar.a(bArr, i11, i12);
        }
    }

    @Override // P1.h
    public final void b() {
        p151v2.a.k(this.f5221f);
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
