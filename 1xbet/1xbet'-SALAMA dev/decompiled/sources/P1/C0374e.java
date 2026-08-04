package P1;

import A1.C0045t0;
import A1.X;
import C0.J;
import C1.AbstractC0096b;
import C1.C0095a;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: P1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0374e implements h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f5172v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5173a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F1.v f5178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public F1.v f5179g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5183l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5187p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5189r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public F1.v f5191t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f5192u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F1.x f5174b = new F1.x(new byte[7], 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0095a f5175c = new C0095a(Arrays.copyOf(f5172v, 10));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5180h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5181i = 0;
    public int j = 256;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5184m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5185n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f5188q = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f5190s = -9223372036854775807L;

    public C0374e(boolean z4, String str) {
        this.f5173a = z4;
        this.f5176d = str;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x029b  */
    /* JADX WARN: Code duplicated, block: B:114:0x029d  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:118:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:136:0x0300  */
    /* JADX WARN: Code duplicated, block: B:170:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [C1.a] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // P1.h
    public final void a(C0095a c0095a) throws C0045t0 {
        ?? r9;
        int i7;
        byte[] bArr;
        int i8;
        int i9;
        int i10;
        char c3;
        char c4;
        boolean z4;
        boolean z7;
        int i11;
        int i12;
        int i13;
        ?? r7 = 0;
        int i14 = 7;
        int i15 = 2;
        this.f5178f.getClass();
        int i16 = p151v2.t.f17159a;
        while (c0095a.d() > 0) {
            int i17 = this.f5180h;
            F1.x xVar = this.f5174b;
            int i18 = 4;
            C0095a c0095a2 = this.f5175c;
            if (i17 == 0) {
                byte[] bArr2 = (byte[]) c0095a.f1465c;
                int i19 = c0095a.f1463a;
                int i20 = c0095a.f1464b;
                ?? r8 = r7;
                while (true) {
                    if (i19 < i20) {
                        int i21 = i19 + 1;
                        byte b7 = bArr2[i19];
                        int i22 = b7 & 255;
                        if (this.j == 512 && ((65280 | (((byte) i22) & 255)) & 65526) == 65520) {
                            if (!this.f5183l) {
                                int i23 = i19 - 1;
                                c0095a.D(i19);
                                byte[] bArr3 = xVar.f2586d;
                                if (c0095a.d() < 1) {
                                    bArr = bArr2;
                                } else {
                                    c0095a.f(bArr3, r8, 1);
                                    xVar.o(i18);
                                    int i24 = xVar.i(1);
                                    int i25 = this.f5184m;
                                    if (i25 == -1 || i24 == i25) {
                                        if (this.f5185n != -1) {
                                            byte[] bArr4 = xVar.f2586d;
                                            if (c0095a.d() >= 1) {
                                                c0095a.f(bArr4, r8, 1);
                                                xVar.o(i15);
                                                i11 = 4;
                                                if (xVar.i(4) != this.f5185n) {
                                                    bArr = bArr2;
                                                } else {
                                                    c0095a.D(i21);
                                                }
                                            }
                                        } else {
                                            i11 = 4;
                                        }
                                        byte[] bArr5 = xVar.f2586d;
                                        if (c0095a.d() >= i11) {
                                            c0095a.f(bArr5, r8, i11);
                                            xVar.o(14);
                                            int i26 = xVar.i(13);
                                            if (i26 < 7) {
                                                bArr = bArr2;
                                            } else {
                                                byte[] bArr6 = (byte[]) c0095a.f1465c;
                                                int i27 = c0095a.f1464b;
                                                int i28 = i23 + i26;
                                                if (i28 < i27) {
                                                    byte b8 = bArr6[i28];
                                                    bArr = bArr2;
                                                    if (b8 == -1) {
                                                        int i29 = i28 + 1;
                                                        if (i29 != i27) {
                                                            byte b9 = bArr6[i29];
                                                            if (((65280 | (b9 & 255)) & 65526) != 65520 || ((b9 & 8) >> 3) != i24) {
                                                            }
                                                        }
                                                    } else if (b8 == 73 && ((i12 = i28 + 1) == i27 || (bArr6[i12] == 68 && ((i13 = i28 + 2) == i27 || bArr6[i13] == 51)))) {
                                                    }
                                                }
                                                this.f5186o = (b7 & 8) >> 3;
                                                if ((b7 & 1) == 0) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                this.f5182k = z7;
                                                if (this.f5183l) {
                                                    this.f5180h = 3;
                                                    this.f5181i = 0;
                                                } else {
                                                    this.f5180h = 1;
                                                    this.f5181i = 0;
                                                }
                                                c0095a.D(i21);
                                                i7 = 2;
                                                r9 = 0;
                                            }
                                        }
                                    } else {
                                        bArr = bArr2;
                                    }
                                }
                                i8 = this.j;
                                i9 = i8 | i22;
                                if (i9 != 329) {
                                    i10 = 2;
                                    c3 = 256;
                                    c4 = 3;
                                    z4 = false;
                                    this.j = 768;
                                } else if (i9 != 511) {
                                    i10 = 2;
                                    c3 = 256;
                                    c4 = 3;
                                    z4 = false;
                                    this.j = 512;
                                } else if (i9 != 836) {
                                    i10 = 2;
                                    c3 = 256;
                                    c4 = 3;
                                    z4 = false;
                                    this.j = 1024;
                                } else if (i9 != 1075) {
                                    c3 = 256;
                                    if (i8 != 256) {
                                        this.j = 256;
                                        i10 = 2;
                                        c4 = 3;
                                        z4 = false;
                                    } else {
                                        i10 = 2;
                                        c4 = 3;
                                        z4 = false;
                                    }
                                    bArr2 = bArr;
                                    i18 = 4;
                                    i15 = i10;
                                    r8 = z4;
                                } else {
                                    i7 = 2;
                                    this.f5180h = 2;
                                    this.f5181i = 3;
                                    r9 = 0;
                                    this.f5189r = 0;
                                    c0095a2.D(0);
                                    c0095a.D(i21);
                                }
                                i19 = i21;
                                bArr2 = bArr;
                                i18 = 4;
                                i15 = i10;
                                r8 = z4;
                            }
                            this.f5186o = (b7 & 8) >> 3;
                            if ((b7 & 1) == 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            this.f5182k = z7;
                            if (this.f5183l) {
                                this.f5180h = 1;
                                this.f5181i = 0;
                            } else {
                                this.f5180h = 3;
                                this.f5181i = 0;
                            }
                            c0095a.D(i21);
                            i7 = 2;
                            r9 = 0;
                        } else {
                            bArr = bArr2;
                            i8 = this.j;
                            i9 = i8 | i22;
                            if (i9 != 329) {
                                i10 = 2;
                                c3 = 256;
                                c4 = 3;
                                z4 = false;
                                this.j = 768;
                            } else if (i9 != 511) {
                                i10 = 2;
                                c3 = 256;
                                c4 = 3;
                                z4 = false;
                                this.j = 512;
                            } else if (i9 != 836) {
                                i10 = 2;
                                c3 = 256;
                                c4 = 3;
                                z4 = false;
                                this.j = 1024;
                            } else if (i9 != 1075) {
                                c3 = 256;
                                if (i8 != 256) {
                                    this.j = 256;
                                    i10 = 2;
                                    c4 = 3;
                                    z4 = false;
                                } else {
                                    i10 = 2;
                                    c4 = 3;
                                    z4 = false;
                                }
                                bArr2 = bArr;
                                i18 = 4;
                                i15 = i10;
                                r8 = z4;
                            } else {
                                i7 = 2;
                                this.f5180h = 2;
                                this.f5181i = 3;
                                r9 = 0;
                                this.f5189r = 0;
                                c0095a2.D(0);
                                c0095a.D(i21);
                            }
                            i19 = i21;
                            bArr2 = bArr;
                            i18 = 4;
                            i15 = i10;
                            r8 = z4;
                        }
                    } else {
                        r9 = r8;
                        i7 = i15;
                        c0095a.D(i19);
                    }
                    i15 = i7;
                    r7 = r9;
                    i14 = 7;
                }
            } else if (i17 != 1) {
                if (i17 == i15) {
                    byte[] bArr7 = (byte[]) c0095a2.f1465c;
                    int iMin = Math.min(c0095a.d(), 10 - this.f5181i);
                    c0095a.f(bArr7, this.f5181i, iMin);
                    int i30 = this.f5181i + iMin;
                    this.f5181i = i30;
                    if (i30 == 10) {
                        this.f5179g.c(10, c0095a2);
                        c0095a2.D(6);
                        F1.v vVar = this.f5179g;
                        int iS = c0095a2.s() + 10;
                        this.f5180h = 4;
                        this.f5181i = 10;
                        this.f5191t = vVar;
                        this.f5192u = 0L;
                        this.f5189r = iS;
                    }
                } else if (i17 == 3) {
                    int i31 = this.f5182k ? i14 : 5;
                    byte[] bArr8 = xVar.f2586d;
                    int iMin2 = Math.min(c0095a.d(), i31 - this.f5181i);
                    c0095a.f(bArr8, this.f5181i, iMin2);
                    int i32 = this.f5181i + iMin2;
                    this.f5181i = i32;
                    if (i32 == i31) {
                        xVar.o(r7 == true ? 1 : 0);
                        if (this.f5187p) {
                            xVar.r(10);
                        } else {
                            int i33 = xVar.i(i15) + 1;
                            if (i33 != i15) {
                                Log.w("AdtsReader", "Detected audio object type: " + i33 + ", but assuming AAC LC.");
                                i33 = i15;
                            }
                            xVar.r(5);
                            int i34 = xVar.i(3);
                            int i35 = this.f5185n;
                            byte b10 = (byte) (((i33 << 3) & 248) | ((i35 >> 1) & i14));
                            byte b11 = (byte) (((i34 << 3) & 120) | ((i35 << i14) & 128));
                            byte[] bArr9 = new byte[i15];
                            bArr9[r7 == true ? 1 : 0] = b10;
                            bArr9[1] = b11;
                            C0095a c0095aG = AbstractC0096b.g(new F1.x(bArr9, i15), r7);
                            Format$Builder format$Builder = new Format$Builder();
                            format$Builder.f10528a = this.f5177e;
                            format$Builder.f10537k = "audio/mp4a-latm";
                            format$Builder.f10535h = (String) c0095aG.f1465c;
                            format$Builder.f10550x = c0095aG.f1464b;
                            format$Builder.f10551y = c0095aG.f1463a;
                            format$Builder.f10539m = Collections.singletonList(bArr9);
                            format$Builder.f10530c = this.f5176d;
                            X x4 = new X(format$Builder);
                            this.f5188q = 1024000000 / ((long) x4.f297Q);
                            this.f5178f.a(x4);
                            this.f5187p = true;
                        }
                        xVar.r(4);
                        int i36 = xVar.i(13);
                        int i37 = i36 - 7;
                        if (this.f5182k) {
                            i37 = i36 - 9;
                        }
                        F1.v vVar2 = this.f5178f;
                        long j = this.f5188q;
                        this.f5180h = 4;
                        this.f5181i = r7 == true ? 1 : 0;
                        this.f5191t = vVar2;
                        this.f5192u = j;
                        this.f5189r = i37;
                    }
                } else {
                    if (i17 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(c0095a.d(), this.f5189r - this.f5181i);
                    this.f5191t.c(iMin3, c0095a);
                    int i38 = this.f5181i + iMin3;
                    this.f5181i = i38;
                    int i39 = this.f5189r;
                    if (i38 == i39) {
                        long j3 = this.f5190s;
                        if (j3 != -9223372036854775807L) {
                            this.f5191t.e(j3, 1, i39, 0, null);
                            this.f5190s += this.f5192u;
                        }
                        this.f5180h = r7 == true ? 1 : 0;
                        this.f5181i = r7 == true ? 1 : 0;
                        this.j = 256;
                    }
                }
            } else if (c0095a.d() != 0) {
                xVar.f2586d[r7 == true ? 1 : 0] = ((byte[]) c0095a.f1465c)[c0095a.f1463a];
                xVar.o(i15);
                int i40 = xVar.i(4);
                int i41 = this.f5185n;
                if (i41 == -1 || i40 == i41) {
                    if (!this.f5183l) {
                        this.f5183l = true;
                        this.f5184m = this.f5186o;
                        this.f5185n = i40;
                    }
                    this.f5180h = 3;
                    this.f5181i = r7 == true ? 1 : 0;
                } else {
                    this.f5183l = r7;
                    this.f5180h = r7 == true ? 1 : 0;
                    this.f5181i = r7 == true ? 1 : 0;
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
        F1.v vVarR = mVar.r(j.f1236c, 1);
        this.f5178f = vVarR;
        this.f5191t = vVarR;
        if (!this.f5173a) {
            this.f5179g = new F1.j();
            return;
        }
        j.a();
        j.d();
        F1.v vVarR2 = mVar.r(j.f1236c, 5);
        this.f5179g = vVarR2;
        Format$Builder format$Builder = new Format$Builder();
        j.d();
        format$Builder.f10528a = (String) j.f1238e;
        format$Builder.f10537k = "application/id3";
        vVarR2.a(new X(format$Builder));
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
