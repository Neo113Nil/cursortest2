package K0;

import A0.o1;
import Q2.C0375o;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import h0.C1989c;
import i0.C2008m;
import i0.InterfaceC2009n;
import java.util.ArrayList;
import java.util.List;
import k0.AbstractC2024d;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final C0375o f2853a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2854b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2855c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2856d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2857e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2858g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2859h;

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public r(C0375o c0375o, long j5, int i, boolean z3) {
        int i5;
        int g5;
        boolean z5 = true;
        int i6 = z3 ? 2 : 1;
        this.f2853a = c0375o;
        this.f2854b = i;
        if (W0.a.j(j5) != 0 || W0.a.i(j5) != 0) {
            Q0.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c0375o.f5046p;
        int size = arrayList2.size();
        float f = 0.0f;
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            u uVar = (u) arrayList2.get(i7);
            S0.d dVar = uVar.f2868a;
            int h3 = W0.a.h(j5);
            if (W0.a.c(j5)) {
                g5 = W0.a.g(j5) - ((int) Math.ceil(f));
                if (g5 < 0) {
                    g5 = 0;
                }
            } else {
                g5 = W0.a.g(j5);
            }
            C0197b c0197b = new C0197b(dVar, this.f2854b - i8, i6, W0.b.b(h3, g5, 5));
            float b3 = c0197b.b() + f;
            L0.k kVar = c0197b.f2815d;
            int i9 = i8 + kVar.f3019g;
            int i10 = uVar.f2869b;
            int i11 = uVar.f2870c;
            int i12 = i7;
            t tVar = new t(c0197b, i10, i11, i8, i9, f, b3);
            i5 = i9;
            arrayList.add(tVar);
            if (kVar.f3017d || (i5 == this.f2854b && i12 != X3.n.N((ArrayList) this.f2853a.f5046p))) {
                f = b3;
                break;
            } else {
                i7 = i12 + 1;
                i8 = i5;
                f = b3;
            }
        }
        z5 = false;
        i5 = i8;
        this.f2857e = f;
        this.f = i5;
        this.f2855c = z5;
        this.f2859h = arrayList;
        this.f2856d = W0.a.h(j5);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            t tVar2 = (t) arrayList.get(i13);
            ?? r7 = tVar2.f2862a.f;
            ArrayList arrayList4 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i14 = 0; i14 < size3; i14++) {
                C1989c c1989c = (C1989c) r7.get(i14);
                arrayList4.add(c1989c != null ? tVar2.a(c1989c) : null);
            }
            X3.s.U(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f2853a.f5043m).size()) {
            int size4 = ((List) this.f2853a.f5043m).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i15 = 0; i15 < size4; i15++) {
                arrayList5.add(null);
            }
            arrayList3 = X3.m.i0(arrayList3, arrayList5);
        }
        this.f2858g = arrayList3;
    }

    public static void g(r rVar, InterfaceC2009n interfaceC2009n, i0.F f, float f5, i0.I i, V0.l lVar, AbstractC2024d abstractC2024d) {
        interfaceC2009n.k();
        ArrayList arrayList = rVar.f2859h;
        if (arrayList.size() <= 1) {
            S0.k.a(rVar, interfaceC2009n, f, f5, i, lVar, abstractC2024d);
        } else if (f instanceof i0.M) {
            S0.k.a(rVar, interfaceC2009n, f, f5, i, lVar, abstractC2024d);
        } else {
            if (!(f instanceof i0.H)) {
                throw new D2.e();
            }
            int size = arrayList.size();
            float f6 = 0.0f;
            float f7 = 0.0f;
            for (int i5 = 0; i5 < size; i5++) {
                t tVar = (t) arrayList.get(i5);
                f7 += tVar.f2862a.b();
                f6 = Math.max(f6, tVar.f2862a.d());
            }
            Shader B5 = ((i0.H) f).B((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
            Matrix matrix = new Matrix();
            B5.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                t tVar2 = (t) arrayList.get(i6);
                tVar2.f2862a.g(interfaceC2009n, new C2008m(B5), f5, i, lVar, abstractC2024d);
                C0197b c0197b = tVar2.f2862a;
                interfaceC2009n.g(0.0f, c0197b.b());
                matrix.setTranslate(0.0f, -c0197b.b());
                B5.setLocalMatrix(matrix);
            }
        }
        interfaceC2009n.j();
    }

    public final void a(final long j5, final float[] fArr) {
        h(N.e(j5));
        i(N.d(j5));
        final kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
        uVar.f17622k = 0;
        final kotlin.jvm.internal.t tVar = new kotlin.jvm.internal.t();
        F.g(this.f2859h, j5, new i4.c() { // from class: K0.p
            @Override // i4.c
            public final Object c(Object obj) {
                C0197b c0197b;
                long j6;
                boolean z3;
                float a5;
                float a6;
                t tVar2 = (t) obj;
                int i = tVar2.f2863b;
                long j7 = j5;
                int e3 = i > N.e(j7) ? tVar2.f2863b : N.e(j7);
                int d5 = N.d(j7);
                int i5 = tVar2.f2864c;
                if (i5 >= d5) {
                    i5 = N.d(j7);
                }
                long b3 = F.b(tVar2.d(e3), tVar2.d(i5));
                kotlin.jvm.internal.u uVar2 = uVar;
                int i6 = uVar2.f17622k;
                C0197b c0197b2 = tVar2.f2862a;
                int e5 = N.e(b3);
                int d6 = N.d(b3);
                L0.k kVar = c0197b2.f2815d;
                Layout layout = kVar.f;
                int length = layout.getText().length();
                if (e5 < 0) {
                    Q0.a.a("startOffset must be > 0");
                }
                if (e5 >= length) {
                    Q0.a.a("startOffset must be less than text length");
                }
                if (d6 <= e5) {
                    Q0.a.a("endOffset must be greater than startOffset");
                }
                if (d6 > length) {
                    Q0.a.a("endOffset must be smaller or equal to text length");
                }
                int i7 = (d6 - e5) * 4;
                float[] fArr2 = fArr;
                if (fArr2.length - i6 < i7) {
                    Q0.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(e5);
                int lineForOffset2 = layout.getLineForOffset(d6 - 1);
                G0.i iVar = new G0.i(kVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int f = kVar.f(lineForOffset);
                        int max = Math.max(e5, lineStart);
                        int min = Math.min(d6, f);
                        float g5 = kVar.g(lineForOffset);
                        float e6 = kVar.e(lineForOffset);
                        c0197b = c0197b2;
                        j6 = b3;
                        boolean z5 = false;
                        boolean z6 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (!z6 || isRtlCharAt) {
                                if (z6 && isRtlCharAt) {
                                    z5 = false;
                                    float a7 = iVar.a(max, false, false, false);
                                    z3 = z6;
                                    a5 = iVar.a(max + 1, true, true, false);
                                    a6 = a7;
                                } else {
                                    z3 = z6;
                                    z5 = false;
                                    if (z3 || !isRtlCharAt) {
                                        a5 = iVar.a(max, false, false, false);
                                        a6 = iVar.a(max + 1, true, true, false);
                                    } else {
                                        a6 = iVar.a(max, false, false, true);
                                        a5 = iVar.a(max + 1, true, true, true);
                                    }
                                }
                                fArr2[i6] = a5;
                                fArr2[i6 + 1] = g5;
                                fArr2[i6 + 2] = a6;
                                fArr2[i6 + 3] = e6;
                                i6 += 4;
                                max++;
                                z6 = z3;
                            } else {
                                a5 = iVar.a(max, z5, z5, true);
                                z3 = z6;
                                a6 = iVar.a(max + 1, true, true, true);
                            }
                            z5 = false;
                            fArr2[i6] = a5;
                            fArr2[i6 + 1] = g5;
                            fArr2[i6 + 2] = a6;
                            fArr2[i6 + 3] = e6;
                            i6 += 4;
                            max++;
                            z6 = z3;
                        }
                        if (lineForOffset == lineForOffset2) {
                            break;
                        }
                        lineForOffset++;
                        c0197b2 = c0197b;
                        b3 = j6;
                    }
                } else {
                    c0197b = c0197b2;
                    j6 = b3;
                }
                int c5 = (N.c(j6) * 4) + uVar2.f17622k;
                int i8 = uVar2.f17622k;
                while (true) {
                    kotlin.jvm.internal.t tVar3 = tVar;
                    if (i8 >= c5) {
                        uVar2.f17622k = c5;
                        tVar3.f17621k = c0197b.b() + tVar3.f17621k;
                        return W3.o.f6046a;
                    }
                    int i9 = i8 + 1;
                    float f5 = fArr2[i9];
                    float f6 = tVar3.f17621k;
                    fArr2[i9] = f5 + f6;
                    int i10 = i8 + 3;
                    fArr2[i10] = fArr2[i10] + f6;
                    i8 += 4;
                }
            }
        });
    }

    public final float b(int i) {
        j(i);
        ArrayList arrayList = this.f2859h;
        t tVar = (t) arrayList.get(F.e(i, arrayList));
        C0197b c0197b = tVar.f2862a;
        return c0197b.f2815d.e(i - tVar.f2865d) + tVar.f;
    }

    public final int c(float f) {
        ArrayList arrayList = this.f2859h;
        t tVar = (t) arrayList.get(F.f(arrayList, f));
        int i = tVar.f2864c - tVar.f2863b;
        int i5 = tVar.f2865d;
        if (i == 0) {
            return i5;
        }
        float f5 = f - tVar.f;
        L0.k kVar = tVar.f2862a.f2815d;
        return kVar.f.getLineForVertical(((int) f5) - kVar.f3020h) + i5;
    }

    public final float d(int i) {
        j(i);
        ArrayList arrayList = this.f2859h;
        t tVar = (t) arrayList.get(F.e(i, arrayList));
        C0197b c0197b = tVar.f2862a;
        return c0197b.f2815d.g(i - tVar.f2865d) + tVar.f;
    }

    public final int e(long j5) {
        ArrayList arrayList = this.f2859h;
        int i = (int) (j5 & 4294967295L);
        t tVar = (t) arrayList.get(F.f(arrayList, Float.intBitsToFloat(i)));
        int i5 = tVar.f2864c;
        int i6 = tVar.f2863b;
        if (i5 - i6 == 0) {
            return i6;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat(i) - tVar.f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        C0197b c0197b = tVar.f2862a;
        int intBitsToFloat3 = (int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
        L0.k kVar = c0197b.f2815d;
        int i7 = intBitsToFloat3 - kVar.f3020h;
        Layout layout = kVar.f;
        int lineForVertical = layout.getLineForVertical(i7);
        return layout.getOffsetForHorizontal(lineForVertical, (kVar.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i6;
    }

    public final long f(C1989c c1989c, int i, o1 o1Var) {
        long j5;
        long j6;
        ArrayList arrayList = this.f2859h;
        int f = F.f(arrayList, c1989c.f17194b);
        float f5 = ((t) arrayList.get(f)).f2867g;
        float f6 = c1989c.f17196d;
        if (f5 >= f6 || f == X3.n.N(arrayList)) {
            t tVar = (t) arrayList.get(f);
            return tVar.b(tVar.f2862a.c(tVar.c(c1989c), i, o1Var), true);
        }
        int f7 = F.f(arrayList, f6);
        long j7 = N.f2801b;
        while (true) {
            j5 = N.f2801b;
            if (!N.a(j7, j5) || f > f7) {
                break;
            }
            t tVar2 = (t) arrayList.get(f);
            j7 = tVar2.b(tVar2.f2862a.c(tVar2.c(c1989c), i, o1Var), true);
            f++;
        }
        if (N.a(j7, j5)) {
            return j5;
        }
        while (true) {
            j6 = N.f2801b;
            if (!N.a(j5, j6) || f > f7) {
                break;
            }
            t tVar3 = (t) arrayList.get(f7);
            j5 = tVar3.b(tVar3.f2862a.c(tVar3.c(c1989c), i, o1Var), true);
            f7--;
        }
        return N.a(j5, j6) ? j7 : F.b((int) (j7 >> 32), (int) (4294967295L & j5));
    }

    public final void h(int i) {
        boolean z3 = false;
        C0375o c0375o = this.f2853a;
        if (i >= 0 && i < ((C0203h) c0375o.f5042l).f2829l.length()) {
            z3 = true;
        }
        if (z3) {
            return;
        }
        StringBuilder v4 = AbstractC2107A.v(i, "offset(", ") is out of bounds [0, ");
        v4.append(((C0203h) c0375o.f5042l).f2829l.length());
        v4.append(')');
        Q0.a.a(v4.toString());
    }

    public final void i(int i) {
        boolean z3 = false;
        C0375o c0375o = this.f2853a;
        if (i >= 0 && i <= ((C0203h) c0375o.f5042l).f2829l.length()) {
            z3 = true;
        }
        if (z3) {
            return;
        }
        StringBuilder v4 = AbstractC2107A.v(i, "offset(", ") is out of bounds [0, ");
        v4.append(((C0203h) c0375o.f5042l).f2829l.length());
        v4.append(']');
        Q0.a.a(v4.toString());
    }

    public final void j(int i) {
        boolean z3 = false;
        int i5 = this.f;
        if (i >= 0 && i < i5) {
            z3 = true;
        }
        if (z3) {
            return;
        }
        Q0.a.a("lineIndex(" + i + ") is out of bounds [0, " + i5 + ')');
    }
}
