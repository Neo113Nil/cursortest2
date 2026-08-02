package j0;

import A0.o1;
import i0.F;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: r, reason: collision with root package name */
    public static final o1 f17462r = new o1(14);

    /* renamed from: d, reason: collision with root package name */
    public final s f17463d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17464e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final r f17465g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f17466h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f17467j;

    /* renamed from: k, reason: collision with root package name */
    public final i f17468k;

    /* renamed from: l, reason: collision with root package name */
    public final p f17469l;

    /* renamed from: m, reason: collision with root package name */
    public final m f17470m;

    /* renamed from: n, reason: collision with root package name */
    public final i f17471n;

    /* renamed from: o, reason: collision with root package name */
    public final p f17472o;

    /* renamed from: p, reason: collision with root package name */
    public final m f17473p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f17474q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, final r rVar, int i) {
        this(str, fArr, sVar, null, r4, r0, 0.0f, 1.0f, rVar, i);
        i iVar;
        i iVar2;
        double d5 = rVar.f17475a;
        boolean z3 = d5 == -3.0d;
        double d6 = rVar.f17480g;
        double d7 = rVar.f;
        if (z3) {
            final int i5 = 4;
            iVar = new i() { // from class: j0.o
                @Override // j0.i
                public final double b(double d8) {
                    r rVar2 = rVar;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = d.f17415a;
                            return d.a(rVar2, d8);
                        case 1:
                            float[] fArr3 = d.f17415a;
                            return d.c(rVar2, d8);
                        case 2:
                            return d8 >= rVar2.f17479e ? Math.pow((rVar2.f17476b * d8) + rVar2.f17477c, rVar2.f17475a) : d8 * rVar2.f17478d;
                        case 3:
                            double d9 = rVar2.f17476b;
                            if (d8 >= rVar2.f17479e) {
                                return Math.pow((d9 * d8) + rVar2.f17477c, rVar2.f17475a) + rVar2.f;
                            }
                            return rVar2.f17480g + (rVar2.f17478d * d8);
                        case 4:
                            float[] fArr4 = d.f17415a;
                            return d.b(rVar2, d8);
                        case 5:
                            float[] fArr5 = d.f17415a;
                            return d.d(rVar2, d8);
                        case 6:
                            double d10 = rVar2.f17479e;
                            double d11 = rVar2.f17478d;
                            return d8 >= d10 * d11 ? (Math.pow(d8, 1.0d / rVar2.f17475a) - rVar2.f17477c) / rVar2.f17476b : d8 / d11;
                        default:
                            double d12 = rVar2.f17476b;
                            double d13 = rVar2.f17479e;
                            double d14 = rVar2.f17478d;
                            return d8 >= d13 * d14 ? (Math.pow(d8 - rVar2.f, 1.0d / rVar2.f17475a) - rVar2.f17477c) / d12 : (d8 - rVar2.f17480g) / d14;
                    }
                }
            };
        } else if (d5 == -2.0d) {
            final int i6 = 5;
            iVar = new i() { // from class: j0.o
                @Override // j0.i
                public final double b(double d8) {
                    r rVar2 = rVar;
                    switch (i6) {
                        case 0:
                            float[] fArr2 = d.f17415a;
                            return d.a(rVar2, d8);
                        case 1:
                            float[] fArr3 = d.f17415a;
                            return d.c(rVar2, d8);
                        case 2:
                            return d8 >= rVar2.f17479e ? Math.pow((rVar2.f17476b * d8) + rVar2.f17477c, rVar2.f17475a) : d8 * rVar2.f17478d;
                        case 3:
                            double d9 = rVar2.f17476b;
                            if (d8 >= rVar2.f17479e) {
                                return Math.pow((d9 * d8) + rVar2.f17477c, rVar2.f17475a) + rVar2.f;
                            }
                            return rVar2.f17480g + (rVar2.f17478d * d8);
                        case 4:
                            float[] fArr4 = d.f17415a;
                            return d.b(rVar2, d8);
                        case 5:
                            float[] fArr5 = d.f17415a;
                            return d.d(rVar2, d8);
                        case 6:
                            double d10 = rVar2.f17479e;
                            double d11 = rVar2.f17478d;
                            return d8 >= d10 * d11 ? (Math.pow(d8, 1.0d / rVar2.f17475a) - rVar2.f17477c) / rVar2.f17476b : d8 / d11;
                        default:
                            double d12 = rVar2.f17476b;
                            double d13 = rVar2.f17479e;
                            double d14 = rVar2.f17478d;
                            return d8 >= d13 * d14 ? (Math.pow(d8 - rVar2.f, 1.0d / rVar2.f17475a) - rVar2.f17477c) / d12 : (d8 - rVar2.f17480g) / d14;
                    }
                }
            };
        } else if (d7 == 0.0d && d6 == 0.0d) {
            final int i7 = 6;
            iVar = new i() { // from class: j0.o
                @Override // j0.i
                public final double b(double d8) {
                    r rVar2 = rVar;
                    switch (i7) {
                        case 0:
                            float[] fArr2 = d.f17415a;
                            return d.a(rVar2, d8);
                        case 1:
                            float[] fArr3 = d.f17415a;
                            return d.c(rVar2, d8);
                        case 2:
                            return d8 >= rVar2.f17479e ? Math.pow((rVar2.f17476b * d8) + rVar2.f17477c, rVar2.f17475a) : d8 * rVar2.f17478d;
                        case 3:
                            double d9 = rVar2.f17476b;
                            if (d8 >= rVar2.f17479e) {
                                return Math.pow((d9 * d8) + rVar2.f17477c, rVar2.f17475a) + rVar2.f;
                            }
                            return rVar2.f17480g + (rVar2.f17478d * d8);
                        case 4:
                            float[] fArr4 = d.f17415a;
                            return d.b(rVar2, d8);
                        case 5:
                            float[] fArr5 = d.f17415a;
                            return d.d(rVar2, d8);
                        case 6:
                            double d10 = rVar2.f17479e;
                            double d11 = rVar2.f17478d;
                            return d8 >= d10 * d11 ? (Math.pow(d8, 1.0d / rVar2.f17475a) - rVar2.f17477c) / rVar2.f17476b : d8 / d11;
                        default:
                            double d12 = rVar2.f17476b;
                            double d13 = rVar2.f17479e;
                            double d14 = rVar2.f17478d;
                            return d8 >= d13 * d14 ? (Math.pow(d8 - rVar2.f, 1.0d / rVar2.f17475a) - rVar2.f17477c) / d12 : (d8 - rVar2.f17480g) / d14;
                    }
                }
            };
        } else {
            final int i8 = 7;
            iVar = new i() { // from class: j0.o
                @Override // j0.i
                public final double b(double d8) {
                    r rVar2 = rVar;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = d.f17415a;
                            return d.a(rVar2, d8);
                        case 1:
                            float[] fArr3 = d.f17415a;
                            return d.c(rVar2, d8);
                        case 2:
                            return d8 >= rVar2.f17479e ? Math.pow((rVar2.f17476b * d8) + rVar2.f17477c, rVar2.f17475a) : d8 * rVar2.f17478d;
                        case 3:
                            double d9 = rVar2.f17476b;
                            if (d8 >= rVar2.f17479e) {
                                return Math.pow((d9 * d8) + rVar2.f17477c, rVar2.f17475a) + rVar2.f;
                            }
                            return rVar2.f17480g + (rVar2.f17478d * d8);
                        case 4:
                            float[] fArr4 = d.f17415a;
                            return d.b(rVar2, d8);
                        case 5:
                            float[] fArr5 = d.f17415a;
                            return d.d(rVar2, d8);
                        case 6:
                            double d10 = rVar2.f17479e;
                            double d11 = rVar2.f17478d;
                            return d8 >= d10 * d11 ? (Math.pow(d8, 1.0d / rVar2.f17475a) - rVar2.f17477c) / rVar2.f17476b : d8 / d11;
                        default:
                            double d12 = rVar2.f17476b;
                            double d13 = rVar2.f17479e;
                            double d14 = rVar2.f17478d;
                            return d8 >= d13 * d14 ? (Math.pow(d8 - rVar2.f, 1.0d / rVar2.f17475a) - rVar2.f17477c) / d12 : (d8 - rVar2.f17480g) / d14;
                    }
                }
            };
        }
        if (d5 == -3.0d) {
            final int i9 = 0;
            iVar2 = new i() { // from class: j0.o
                @Override // j0.i
                public final double b(double d8) {
                    r rVar2 = rVar;
                    switch (i9) {
                        case 0:
                            float[] fArr2 = d.f17415a;
                            return d.a(rVar2, d8);
                        case 1:
                            float[] fArr3 = d.f17415a;
                            return d.c(rVar2, d8);
                        case 2:
                            return d8 >= rVar2.f17479e ? Math.pow((rVar2.f17476b * d8) + rVar2.f17477c, rVar2.f17475a) : d8 * rVar2.f17478d;
                        case 3:
                            double d9 = rVar2.f17476b;
                            if (d8 >= rVar2.f17479e) {
                                return Math.pow((d9 * d8) + rVar2.f17477c, rVar2.f17475a) + rVar2.f;
                            }
                            return rVar2.f17480g + (rVar2.f17478d * d8);
                        case 4:
                            float[] fArr4 = d.f17415a;
                            return d.b(rVar2, d8);
                        case 5:
                            float[] fArr5 = d.f17415a;
                            return d.d(rVar2, d8);
                        case 6:
                            double d10 = rVar2.f17479e;
                            double d11 = rVar2.f17478d;
                            return d8 >= d10 * d11 ? (Math.pow(d8, 1.0d / rVar2.f17475a) - rVar2.f17477c) / rVar2.f17476b : d8 / d11;
                        default:
                            double d12 = rVar2.f17476b;
                            double d13 = rVar2.f17479e;
                            double d14 = rVar2.f17478d;
                            return d8 >= d13 * d14 ? (Math.pow(d8 - rVar2.f, 1.0d / rVar2.f17475a) - rVar2.f17477c) / d12 : (d8 - rVar2.f17480g) / d14;
                    }
                }
            };
        } else if (d5 == -2.0d) {
            final int i10 = 1;
            iVar2 = new i() { // from class: j0.o
                @Override // j0.i
                public final double b(double d8) {
                    r rVar2 = rVar;
                    switch (i10) {
                        case 0:
                            float[] fArr2 = d.f17415a;
                            return d.a(rVar2, d8);
                        case 1:
                            float[] fArr3 = d.f17415a;
                            return d.c(rVar2, d8);
                        case 2:
                            return d8 >= rVar2.f17479e ? Math.pow((rVar2.f17476b * d8) + rVar2.f17477c, rVar2.f17475a) : d8 * rVar2.f17478d;
                        case 3:
                            double d9 = rVar2.f17476b;
                            if (d8 >= rVar2.f17479e) {
                                return Math.pow((d9 * d8) + rVar2.f17477c, rVar2.f17475a) + rVar2.f;
                            }
                            return rVar2.f17480g + (rVar2.f17478d * d8);
                        case 4:
                            float[] fArr4 = d.f17415a;
                            return d.b(rVar2, d8);
                        case 5:
                            float[] fArr5 = d.f17415a;
                            return d.d(rVar2, d8);
                        case 6:
                            double d10 = rVar2.f17479e;
                            double d11 = rVar2.f17478d;
                            return d8 >= d10 * d11 ? (Math.pow(d8, 1.0d / rVar2.f17475a) - rVar2.f17477c) / rVar2.f17476b : d8 / d11;
                        default:
                            double d12 = rVar2.f17476b;
                            double d13 = rVar2.f17479e;
                            double d14 = rVar2.f17478d;
                            return d8 >= d13 * d14 ? (Math.pow(d8 - rVar2.f, 1.0d / rVar2.f17475a) - rVar2.f17477c) / d12 : (d8 - rVar2.f17480g) / d14;
                    }
                }
            };
        } else if (d7 == 0.0d && d6 == 0.0d) {
            final int i11 = 2;
            iVar2 = new i() { // from class: j0.o
                @Override // j0.i
                public final double b(double d8) {
                    r rVar2 = rVar;
                    switch (i11) {
                        case 0:
                            float[] fArr2 = d.f17415a;
                            return d.a(rVar2, d8);
                        case 1:
                            float[] fArr3 = d.f17415a;
                            return d.c(rVar2, d8);
                        case 2:
                            return d8 >= rVar2.f17479e ? Math.pow((rVar2.f17476b * d8) + rVar2.f17477c, rVar2.f17475a) : d8 * rVar2.f17478d;
                        case 3:
                            double d9 = rVar2.f17476b;
                            if (d8 >= rVar2.f17479e) {
                                return Math.pow((d9 * d8) + rVar2.f17477c, rVar2.f17475a) + rVar2.f;
                            }
                            return rVar2.f17480g + (rVar2.f17478d * d8);
                        case 4:
                            float[] fArr4 = d.f17415a;
                            return d.b(rVar2, d8);
                        case 5:
                            float[] fArr5 = d.f17415a;
                            return d.d(rVar2, d8);
                        case 6:
                            double d10 = rVar2.f17479e;
                            double d11 = rVar2.f17478d;
                            return d8 >= d10 * d11 ? (Math.pow(d8, 1.0d / rVar2.f17475a) - rVar2.f17477c) / rVar2.f17476b : d8 / d11;
                        default:
                            double d12 = rVar2.f17476b;
                            double d13 = rVar2.f17479e;
                            double d14 = rVar2.f17478d;
                            return d8 >= d13 * d14 ? (Math.pow(d8 - rVar2.f, 1.0d / rVar2.f17475a) - rVar2.f17477c) / d12 : (d8 - rVar2.f17480g) / d14;
                    }
                }
            };
        } else {
            final int i12 = 3;
            iVar2 = new i() { // from class: j0.o
                @Override // j0.i
                public final double b(double d8) {
                    r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            float[] fArr2 = d.f17415a;
                            return d.a(rVar2, d8);
                        case 1:
                            float[] fArr3 = d.f17415a;
                            return d.c(rVar2, d8);
                        case 2:
                            return d8 >= rVar2.f17479e ? Math.pow((rVar2.f17476b * d8) + rVar2.f17477c, rVar2.f17475a) : d8 * rVar2.f17478d;
                        case 3:
                            double d9 = rVar2.f17476b;
                            if (d8 >= rVar2.f17479e) {
                                return Math.pow((d9 * d8) + rVar2.f17477c, rVar2.f17475a) + rVar2.f;
                            }
                            return rVar2.f17480g + (rVar2.f17478d * d8);
                        case 4:
                            float[] fArr4 = d.f17415a;
                            return d.b(rVar2, d8);
                        case 5:
                            float[] fArr5 = d.f17415a;
                            return d.d(rVar2, d8);
                        case 6:
                            double d10 = rVar2.f17479e;
                            double d11 = rVar2.f17478d;
                            return d8 >= d10 * d11 ? (Math.pow(d8, 1.0d / rVar2.f17475a) - rVar2.f17477c) / rVar2.f17476b : d8 / d11;
                        default:
                            double d12 = rVar2.f17476b;
                            double d13 = rVar2.f17479e;
                            double d14 = rVar2.f17478d;
                            return d8 >= d13 * d14 ? (Math.pow(d8 - rVar2.f, 1.0d / rVar2.f17475a) - rVar2.f17477c) / d12 : (d8 - rVar2.f17480g) / d14;
                    }
                }
            };
        }
    }

    @Override // j0.c
    public final float a(int i) {
        return this.f;
    }

    @Override // j0.c
    public final float b(int i) {
        return this.f17464e;
    }

    @Override // j0.c
    public final boolean c() {
        return this.f17474q;
    }

    @Override // j0.c
    public final long d(float f, float f5, float f6) {
        double d5 = f;
        m mVar = this.f17473p;
        float b3 = (float) mVar.b(d5);
        float b5 = (float) mVar.b(f5);
        float b6 = (float) mVar.b(f6);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f7 = (fArr[6] * b6) + (fArr[3] * b5) + (fArr[0] * b3);
        float f8 = (fArr[7] * b6) + (fArr[4] * b5) + (fArr[1] * b3);
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
    }

    @Override // j0.c
    public final float e(float f, float f5, float f6) {
        double d5 = f;
        m mVar = this.f17473p;
        float b3 = (float) mVar.b(d5);
        float b5 = (float) mVar.b(f5);
        float b6 = (float) mVar.b(f6);
        float[] fArr = this.i;
        return (fArr[8] * b6) + (fArr[5] * b5) + (fArr[2] * b3);
    }

    @Override // j0.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(qVar.f17464e, this.f17464e) != 0 || Float.compare(qVar.f, this.f) != 0 || !kotlin.jvm.internal.l.a(this.f17463d, qVar.f17463d) || !Arrays.equals(this.f17466h, qVar.f17466h)) {
            return false;
        }
        r rVar = qVar.f17465g;
        r rVar2 = this.f17465g;
        if (rVar2 != null) {
            return kotlin.jvm.internal.l.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (kotlin.jvm.internal.l.a(this.f17468k, qVar.f17468k)) {
            return kotlin.jvm.internal.l.a(this.f17471n, qVar.f17471n);
        }
        return false;
    }

    @Override // j0.c
    public final long f(float f, float f5, float f6, float f7, c cVar) {
        float[] fArr = this.f17467j;
        float f8 = (fArr[6] * f6) + (fArr[3] * f5) + (fArr[0] * f);
        float f9 = (fArr[7] * f6) + (fArr[4] * f5) + (fArr[1] * f);
        float f10 = (fArr[8] * f6) + (fArr[5] * f5) + (fArr[2] * f);
        m mVar = this.f17470m;
        return F.b((float) mVar.b(f8), (float) mVar.b(f9), (float) mVar.b(f10), f7, cVar);
    }

    @Override // j0.c
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f17466h) + ((this.f17463d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.f17464e;
        int floatToIntBits = (hashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f5 = this.f;
        int floatToIntBits2 = (floatToIntBits + (f5 == 0.0f ? 0 : Float.floatToIntBits(f5))) * 31;
        r rVar = this.f17465g;
        int hashCode2 = floatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f17471n.hashCode() + ((this.f17468k.hashCode() + (hashCode2 * 31)) * 31);
        }
        return hashCode2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01de, code lost:
    
        if ((((r24 - r11) * r3) - ((r1 - r14) * r10)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, float[] fArr2, i iVar, i iVar2, float f, float f5, r rVar, int i) {
        super(i, b.f17407a, str);
        ?? r28;
        ?? r29;
        float f6;
        float f7;
        boolean z3;
        int i5 = 0;
        int i6 = 1;
        this.f17463d = sVar;
        this.f17464e = f;
        this.f = f5;
        this.f17465g = rVar;
        this.f17468k = iVar;
        this.f17469l = new p(this, i6);
        this.f17470m = new m(this, i5);
        this.f17471n = iVar2;
        this.f17472o = new p(this, i5);
        this.f17473p = new m(this, i6);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f < f5) {
            float[] fArr3 = new float[6];
            if (fArr.length == 9) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                float f10 = f8 + f9 + fArr[2];
                fArr3[0] = f8 / f10;
                fArr3[1] = f9 / f10;
                float f11 = fArr[3];
                float f12 = fArr[4];
                float f13 = f11 + f12 + fArr[5];
                fArr3[2] = f11 / f13;
                fArr3[3] = f12 / f13;
                float f14 = fArr[6];
                float f15 = fArr[7];
                float f16 = f14 + f15 + fArr[8];
                fArr3[4] = f14 / f16;
                fArr3[5] = f15 / f16;
            } else {
                System.arraycopy(fArr, 0, fArr3, 0, 6);
            }
            this.f17466h = fArr3;
            if (fArr2 == null) {
                float f17 = fArr3[0];
                float f18 = fArr3[1];
                float f19 = fArr3[2];
                float f20 = fArr3[3];
                float f21 = fArr3[4];
                float f22 = fArr3[5];
                f6 = 1.0f;
                float f23 = 1;
                float f24 = (f23 - f17) / f18;
                float f25 = (f23 - f19) / f20;
                float f26 = (f23 - f21) / f22;
                r28 = 0;
                float f27 = sVar.f17481a;
                r29 = 1;
                float f28 = sVar.f17482b;
                float f29 = (f23 - f27) / f28;
                float f30 = f17 / f18;
                float f31 = (f19 / f20) - f30;
                float f32 = (f27 / f28) - f30;
                float f33 = f25 - f24;
                float f34 = (f21 / f22) - f30;
                float f35 = (((f29 - f24) * f31) - (f32 * f33)) / (((f26 - f24) * f31) - (f33 * f34));
                float f36 = (f32 - (f34 * f35)) / f31;
                float f37 = (1.0f - f36) - f35;
                float f38 = f37 / f18;
                float f39 = f36 / f20;
                float f40 = f35 / f22;
                this.i = new float[]{f38 * f17, f37, ((1.0f - f17) - f18) * f38, f39 * f19, f36, ((1.0f - f19) - f20) * f39, f40 * f21, f35, ((1.0f - f21) - f22) * f40};
            } else {
                r28 = 0;
                r29 = 1;
                f6 = 1.0f;
                if (fArr2.length == 9) {
                    this.i = fArr2;
                } else {
                    throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
                }
            }
            this.f17467j = j.f(this.i);
            float b3 = j.b(fArr3);
            float[] fArr4 = d.f17415a;
            if (b3 / j.b(d.f17416b) > 0.9f) {
                float[] fArr5 = d.f17415a;
                float f41 = fArr3[r28];
                float f42 = fArr5[r28];
                float f43 = fArr3[r29];
                float f44 = fArr5[r29];
                float f45 = fArr3[2];
                float f46 = fArr5[2];
                float f47 = fArr3[3];
                float f48 = fArr5[3];
                float f49 = fArr3[4];
                float f50 = fArr5[4];
                float f51 = fArr3[5];
                float f52 = fArr5[5];
                f7 = 0.0f;
                float[] fArr6 = new float[6];
                fArr6[r28] = f41 - f42;
                fArr6[r29] = f43 - f44;
                fArr6[2] = f45 - f46;
                fArr6[3] = f47 - f48;
                fArr6[4] = f49 - f50;
                fArr6[5] = f51 - f52;
                float f53 = fArr6[r28];
                float f54 = fArr6[r29];
                if (((f44 - f52) * f53) - ((f42 - f50) * f54) >= 0.0f && ((f42 - f46) * f54) - ((f44 - f48) * f53) >= 0.0f) {
                    float f55 = fArr6[2];
                    float f56 = fArr6[3];
                    if (((f48 - f44) * f55) - ((f46 - f42) * f56) >= 0.0f && ((f46 - f50) * f56) - ((f48 - f52) * f55) >= 0.0f) {
                        float f57 = fArr6[4];
                        float f58 = fArr6[5];
                        if (((f52 - f48) * f57) - ((f50 - f46) * f58) >= 0.0f) {
                        }
                    }
                }
            } else {
                f7 = 0.0f;
            }
            int i7 = (f > f7 ? 1 : (f == f7 ? 0 : -1));
            if (i != 0) {
                float[] fArr7 = d.f17415a;
                if (fArr3 != fArr7) {
                    for (int i8 = r28; i8 < 6; i8++) {
                        if (Float.compare(fArr3[i8], fArr7[i8]) != 0 && Math.abs(fArr3[i8] - fArr7[i8]) > 0.001f) {
                            break;
                        }
                    }
                }
                if (j.d(sVar, j.f17448d) && f == f7 && f5 == f6) {
                    float[] fArr8 = d.f17415a;
                    q qVar = d.f17419e;
                    for (double d5 = 0.0d; d5 <= 1.0d; d5 += 0.00392156862745098d) {
                        if (Math.abs(iVar.b(d5) - qVar.f17468k.b(d5)) <= 0.001d && Math.abs(iVar2.b(d5) - qVar.f17471n.b(d5)) <= 0.001d) {
                        }
                    }
                }
                z3 = r28;
                this.f17474q = z3;
                return;
            }
            z3 = r29;
            this.f17474q = z3;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f5 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(String str, float[] fArr, s sVar, final double d5, float f, float f5, int i) {
        this(str, fArr, sVar, null, r11, r3, f, f5, new r(d5, 1.0d, 0.0d, 0.0d, 0.0d), i);
        i iVar;
        i iVar2 = f17462r;
        if (d5 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i5 = 0;
            iVar = new i() { // from class: j0.n
                @Override // j0.i
                public final double b(double d6) {
                    switch (i5) {
                        case 0:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return Math.pow(d6, 1.0d / d5);
                        default:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return Math.pow(d6, d5);
                    }
                }
            };
        }
        if (d5 != 1.0d) {
            final int i6 = 1;
            iVar2 = new i() { // from class: j0.n
                @Override // j0.i
                public final double b(double d6) {
                    switch (i6) {
                        case 0:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return Math.pow(d6, 1.0d / d5);
                        default:
                            if (d6 < 0.0d) {
                                d6 = 0.0d;
                            }
                            return Math.pow(d6, d5);
                    }
                }
            };
        }
    }
}
