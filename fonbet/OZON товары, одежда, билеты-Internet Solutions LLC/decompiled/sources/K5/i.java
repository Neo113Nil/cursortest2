package K5;

import B5.v;
import E5.o;
import E5.p;
import E5.q;
import H5.b;
import I5.k;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.C5153w;
import androidx.collection.a0;
import androidx.collection.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class i extends K5.b {

    /* renamed from: A, reason: collision with root package name */
    private final StringBuilder f15261A;

    /* renamed from: B, reason: collision with root package name */
    private final RectF f15262B;

    /* renamed from: C, reason: collision with root package name */
    private final Matrix f15263C;

    /* renamed from: D, reason: collision with root package name */
    private final Paint f15264D;

    /* renamed from: E, reason: collision with root package name */
    private final Paint f15265E;

    /* renamed from: F, reason: collision with root package name */
    private final HashMap f15266F;

    /* renamed from: G, reason: collision with root package name */
    private final C5153w<String> f15267G;

    /* renamed from: H, reason: collision with root package name */
    private final ArrayList f15268H;

    /* renamed from: I, reason: collision with root package name */
    private final o f15269I;

    /* renamed from: J, reason: collision with root package name */
    private final com.airbnb.lottie.g f15270J;

    /* renamed from: K, reason: collision with root package name */
    private final B5.g f15271K;

    /* renamed from: L, reason: collision with root package name */
    private E5.b f15272L;

    /* renamed from: M, reason: collision with root package name */
    private q f15273M;

    /* renamed from: N, reason: collision with root package name */
    private E5.b f15274N;

    /* renamed from: O, reason: collision with root package name */
    private q f15275O;

    /* renamed from: P, reason: collision with root package name */
    private E5.d f15276P;

    /* renamed from: Q, reason: collision with root package name */
    private q f15277Q;

    /* renamed from: R, reason: collision with root package name */
    private E5.d f15278R;

    /* renamed from: S, reason: collision with root package name */
    private q f15279S;

    /* renamed from: T, reason: collision with root package name */
    private q f15280T;

    /* renamed from: U, reason: collision with root package name */
    private q f15281U;

    final class a extends Paint {
    }

    final class b extends Paint {
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15282a;

        static {
            int[] iArr = new int[b.a.values().length];
            f15282a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15282a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15282a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    i(com.airbnb.lottie.g gVar, e eVar) {
        super(gVar, eVar);
        I5.b bVar;
        I5.b bVar2;
        I5.a aVar;
        I5.a aVar2;
        this.f15261A = new StringBuilder(2);
        this.f15262B = new RectF();
        this.f15263C = new Matrix();
        a aVar3 = new a(1);
        aVar3.setStyle(Paint.Style.FILL);
        this.f15264D = aVar3;
        b bVar3 = new b(1);
        bVar3.setStyle(Paint.Style.STROKE);
        this.f15265E = bVar3;
        this.f15266F = new HashMap();
        this.f15267G = new C5153w<>();
        this.f15268H = new ArrayList();
        this.f15270J = gVar;
        this.f15271K = eVar.c();
        o h11 = eVar.t().h();
        this.f15269I = h11;
        h11.a(this);
        i(h11);
        k u11 = eVar.u();
        if (u11 != null && (aVar2 = u11.f11976a) != null) {
            E5.a<Integer, Integer> h12 = aVar2.h();
            this.f15272L = (E5.b) h12;
            h12.a(this);
            i(h12);
        }
        if (u11 != null && (aVar = u11.f11977b) != null) {
            E5.a<Integer, Integer> h13 = aVar.h();
            this.f15274N = (E5.b) h13;
            h13.a(this);
            i(h13);
        }
        if (u11 != null && (bVar2 = u11.f11978c) != null) {
            E5.a<Float, Float> h14 = bVar2.h();
            this.f15276P = (E5.d) h14;
            h14.a(this);
            i(h14);
        }
        if (u11 == null || (bVar = u11.f11979d) == null) {
            return;
        }
        E5.a<Float, Float> h15 = bVar.h();
        this.f15278R = (E5.d) h15;
        h15.a(this);
        i(h15);
    }

    private List<d> A(String str, float f7, H5.c cVar, float f11, float f12, boolean z11) {
        float measureText;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char charAt = str.charAt(i14);
            if (z11) {
                int c11 = H5.d.c(charAt, cVar.a(), cVar.c());
                a0<H5.d> c12 = this.f15271K.c();
                c12.getClass();
                H5.d dVar = (H5.d) b0.c(c12, c11);
                if (dVar != null) {
                    measureText = (O5.g.c() * ((float) dVar.b()) * f11) + f12;
                }
            } else {
                measureText = this.f15264D.measureText(str.substring(i14, i14 + 1)) + f12;
            }
            if (charAt == ' ') {
                z12 = true;
                f15 = measureText;
            } else if (z12) {
                z12 = false;
                i13 = i14;
                f14 = measureText;
            } else {
                f14 += measureText;
            }
            f13 += measureText;
            if (f7 > 0.0f && f13 >= f7 && charAt != ' ') {
                i11++;
                d y11 = y(i11);
                if (i13 == i12) {
                    y11.c(str.substring(i12, i14).trim(), (f13 - measureText) - ((r9.length() - r7.length()) * f15));
                    i12 = i14;
                    i13 = i12;
                    f13 = measureText;
                    f14 = f13;
                } else {
                    y11.c(str.substring(i12, i13 - 1).trim(), ((f13 - f14) - ((r7.length() - r13.length()) * f15)) - f15);
                    f13 = f14;
                    i12 = i13;
                }
            }
        }
        if (f13 > 0.0f) {
            i11++;
            y(i11).c(str.substring(i12), f13);
        }
        return this.f15268H.subList(0, i11);
    }

    private static void w(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private static void x(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private d y(int i11) {
        ArrayList arrayList = this.f15268H;
        for (int size = arrayList.size(); size < i11; size++) {
            arrayList.add(new d(0));
        }
        return (d) arrayList.get(i11 - 1);
    }

    private static void z(Canvas canvas, H5.b bVar, int i11, float f7) {
        PointF pointF = bVar.f10611l;
        PointF pointF2 = bVar.f10612m;
        float c11 = O5.g.c();
        float f11 = (i11 * bVar.f10605f * c11) + (pointF == null ? 0.0f : (bVar.f10605f * c11) + pointF.y);
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i12 = c.f15282a[bVar.f10603d.ordinal()];
        if (i12 == 1) {
            canvas.translate(f12, f11);
        } else if (i12 == 2) {
            canvas.translate((f12 + f13) - f7, f11);
        } else {
            if (i12 != 3) {
                return;
            }
            canvas.translate(((f13 / 2.0f) + f12) - (f7 / 2.0f), f11);
        }
    }

    @Override // K5.b, D5.e
    public final void a(RectF rectF, Matrix matrix, boolean z11) {
        super.a(rectF, matrix, z11);
        B5.g gVar = this.f15271K;
        rectF.set(0.0f, 0.0f, gVar.b().width(), gVar.b().height());
    }

    @Override // K5.b, H5.f
    public final void d(P5.c cVar, Object obj) {
        super.d(cVar, obj);
        PointF pointF = v.f2785a;
        if (obj == 1) {
            q qVar = this.f15273M;
            if (qVar != null) {
                r(qVar);
            }
            if (cVar == null) {
                this.f15273M = null;
                return;
            }
            q qVar2 = new q(cVar, null);
            this.f15273M = qVar2;
            qVar2.a(this);
            i(this.f15273M);
            return;
        }
        if (obj == 2) {
            q qVar3 = this.f15275O;
            if (qVar3 != null) {
                r(qVar3);
            }
            if (cVar == null) {
                this.f15275O = null;
                return;
            }
            q qVar4 = new q(cVar, null);
            this.f15275O = qVar4;
            qVar4.a(this);
            i(this.f15275O);
            return;
        }
        if (obj == v.f2798n) {
            q qVar5 = this.f15277Q;
            if (qVar5 != null) {
                r(qVar5);
            }
            if (cVar == null) {
                this.f15277Q = null;
                return;
            }
            q qVar6 = new q(cVar, null);
            this.f15277Q = qVar6;
            qVar6.a(this);
            i(this.f15277Q);
            return;
        }
        if (obj == v.f2799o) {
            q qVar7 = this.f15279S;
            if (qVar7 != null) {
                r(qVar7);
            }
            if (cVar == null) {
                this.f15279S = null;
                return;
            }
            q qVar8 = new q(cVar, null);
            this.f15279S = qVar8;
            qVar8.a(this);
            i(this.f15279S);
            return;
        }
        if (obj == v.f2775A) {
            q qVar9 = this.f15280T;
            if (qVar9 != null) {
                r(qVar9);
            }
            if (cVar == null) {
                this.f15280T = null;
                return;
            }
            q qVar10 = new q(cVar, null);
            this.f15280T = qVar10;
            qVar10.a(this);
            i(this.f15280T);
            return;
        }
        if (obj != v.f2782H) {
            if (obj == v.f2784J) {
                this.f15269I.n(cVar);
                return;
            }
            return;
        }
        q qVar11 = this.f15281U;
        if (qVar11 != null) {
            r(qVar11);
        }
        if (cVar == null) {
            this.f15281U = null;
            return;
        }
        q qVar12 = new q(cVar, null);
        this.f15281U = qVar12;
        qVar12.a(this);
        i(this.f15281U);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x030f  */
    @Override // K5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void l(Canvas canvas, Matrix matrix, int i11) {
        Typeface x11;
        float floatValue;
        int size;
        int i12;
        H5.c cVar;
        float f7;
        String sb2;
        float floatValue2;
        int i13;
        int i14;
        List list;
        int i15;
        List list2;
        i iVar = this;
        H5.b g10 = iVar.f15269I.g();
        B5.g gVar = iVar.f15271K;
        H5.c cVar2 = (H5.c) ((HashMap) gVar.g()).get(g10.f10601b);
        if (cVar2 == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        q qVar = iVar.f15273M;
        Paint paint = iVar.f15264D;
        if (qVar != null) {
            paint.setColor(((Integer) qVar.g()).intValue());
        } else {
            E5.b bVar = iVar.f15272L;
            if (bVar != null) {
                paint.setColor(bVar.g().intValue());
            } else {
                paint.setColor(g10.f10607h);
            }
        }
        q qVar2 = iVar.f15275O;
        Paint paint2 = iVar.f15265E;
        if (qVar2 != null) {
            paint2.setColor(((Integer) qVar2.g()).intValue());
        } else {
            E5.b bVar2 = iVar.f15274N;
            if (bVar2 != null) {
                paint2.setColor(bVar2.g().intValue());
            } else {
                paint2.setColor(g10.f10608i);
            }
        }
        p pVar = iVar.f15208w;
        int intValue = ((((pVar.h() == null ? 100 : pVar.h().g().intValue()) * 255) / 100) * i11) / 255;
        paint.setAlpha(intValue);
        paint2.setAlpha(intValue);
        q qVar3 = iVar.f15277Q;
        if (qVar3 != null) {
            paint2.setStrokeWidth(((Float) qVar3.g()).floatValue());
        } else {
            E5.d dVar = iVar.f15276P;
            if (dVar != null) {
                paint2.setStrokeWidth(dVar.g().floatValue());
            } else {
                paint2.setStrokeWidth(O5.g.c() * g10.f10609j);
            }
        }
        com.airbnb.lottie.g gVar2 = iVar.f15270J;
        boolean U10 = gVar2.U();
        E5.d dVar2 = iVar.f15278R;
        if (U10) {
            q qVar4 = iVar.f15280T;
            float floatValue3 = (qVar4 != null ? ((Float) qVar4.g()).floatValue() : g10.f10602c) / 100.0f;
            O5.g.d(matrix);
            List asList = Arrays.asList(g10.f10600a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size2 = asList.size();
            float f11 = g10.f10604e / 10.0f;
            q qVar5 = iVar.f15279S;
            if (qVar5 != null) {
                floatValue2 = ((Float) qVar5.g()).floatValue();
            } else {
                if (dVar2 != null) {
                    floatValue2 = dVar2.g().floatValue();
                }
                float f12 = f11;
                i13 = 0;
                int i16 = -1;
                while (i13 < size2) {
                    String str = (String) asList.get(i13);
                    PointF pointF = g10.f10612m;
                    float f13 = floatValue3;
                    int i17 = i13;
                    List<d> A11 = iVar.A(str, pointF == null ? 0.0f : pointF.x, cVar2, f13, f12, true);
                    int i18 = 0;
                    while (i18 < A11.size()) {
                        d dVar3 = A11.get(i18);
                        int i19 = i16 + 1;
                        canvas.save();
                        List<d> list3 = A11;
                        z(canvas, g10, i19, dVar3.f15284b);
                        String str2 = dVar3.f15283a;
                        int i21 = i18;
                        int i22 = 0;
                        while (i22 < str2.length()) {
                            String str3 = str2;
                            float f14 = f12;
                            int c11 = H5.d.c(str2.charAt(i22), cVar2.a(), cVar2.c());
                            a0<H5.d> c12 = gVar.c();
                            c12.getClass();
                            H5.d dVar4 = (H5.d) b0.c(c12, c11);
                            if (dVar4 == null) {
                                i14 = i22;
                                list = asList;
                                i15 = size2;
                            } else {
                                HashMap hashMap = iVar.f15266F;
                                if (hashMap.containsKey(dVar4)) {
                                    list2 = (List) hashMap.get(dVar4);
                                    i14 = i22;
                                    list = asList;
                                    i15 = size2;
                                } else {
                                    ArrayList arrayList = (ArrayList) dVar4.a();
                                    i14 = i22;
                                    int size3 = arrayList.size();
                                    list = asList;
                                    ArrayList arrayList2 = new ArrayList(size3);
                                    i15 = size2;
                                    int i23 = 0;
                                    while (i23 < size3) {
                                        arrayList2.add(new D5.d(gVar2, iVar, (J5.q) arrayList.get(i23), gVar));
                                        i23++;
                                        size3 = size3;
                                        arrayList = arrayList;
                                    }
                                    hashMap.put(dVar4, arrayList2);
                                    list2 = arrayList2;
                                }
                                int i24 = 0;
                                while (i24 < list2.size()) {
                                    Path path = ((D5.d) list2.get(i24)).getPath();
                                    path.computeBounds(iVar.f15262B, false);
                                    Matrix matrix2 = iVar.f15263C;
                                    matrix2.reset();
                                    H5.d dVar5 = dVar4;
                                    matrix2.preTranslate(0.0f, (-g10.f10606g) * O5.g.c());
                                    matrix2.preScale(f13, f13);
                                    path.transform(matrix2);
                                    if (g10.f10610k) {
                                        x(path, paint, canvas);
                                        x(path, paint2, canvas);
                                    } else {
                                        x(path, paint2, canvas);
                                        x(path, paint, canvas);
                                    }
                                    i24++;
                                    dVar4 = dVar5;
                                }
                                canvas.translate((O5.g.c() * ((float) dVar4.b()) * f13) + f14, 0.0f);
                            }
                            i22 = i14 + 1;
                            str2 = str3;
                            f12 = f14;
                            asList = list;
                            size2 = i15;
                        }
                        canvas.restore();
                        i18 = i21 + 1;
                        A11 = list3;
                        i16 = i19;
                    }
                    i13 = i17 + 1;
                    floatValue3 = f13;
                }
            }
            f11 += floatValue2;
            float f122 = f11;
            i13 = 0;
            int i162 = -1;
            while (i13 < size2) {
            }
        } else {
            q qVar6 = iVar.f15281U;
            if ((qVar6 == null || (x11 = (Typeface) qVar6.g()) == null) && (x11 = gVar2.x(cVar2)) == null) {
                x11 = cVar2.d();
            }
            if (x11 != null) {
                String str4 = g10.f10600a;
                paint.setTypeface(x11);
                q qVar7 = iVar.f15280T;
                float floatValue4 = qVar7 != null ? ((Float) qVar7.g()).floatValue() : g10.f10602c;
                paint.setTextSize(O5.g.c() * floatValue4);
                paint2.setTypeface(paint.getTypeface());
                paint2.setTextSize(paint.getTextSize());
                float f15 = g10.f10604e / 10.0f;
                q qVar8 = iVar.f15279S;
                if (qVar8 != null) {
                    floatValue = ((Float) qVar8.g()).floatValue();
                } else {
                    if (dVar2 != null) {
                        floatValue = dVar2.g().floatValue();
                    }
                    float c13 = ((O5.g.c() * f15) * floatValue4) / 100.0f;
                    List asList2 = Arrays.asList(str4.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                    size = asList2.size();
                    i12 = 0;
                    int i25 = -1;
                    while (i12 < size) {
                        String str5 = (String) asList2.get(i12);
                        PointF pointF2 = g10.f10612m;
                        float f16 = c13;
                        List<d> A12 = iVar.A(str5, pointF2 == null ? 0.0f : pointF2.x, cVar2, 0.0f, f16, false);
                        int i26 = 0;
                        while (i26 < A12.size()) {
                            d dVar6 = A12.get(i26);
                            i25++;
                            canvas.save();
                            z(canvas, g10, i25, dVar6.f15284b);
                            String str6 = dVar6.f15283a;
                            int i27 = 0;
                            while (i27 < str6.length()) {
                                int codePointAt = str6.codePointAt(i27);
                                List<d> list4 = A12;
                                int charCount = Character.charCount(codePointAt) + i27;
                                int i28 = i26;
                                while (true) {
                                    if (charCount >= str6.length()) {
                                        cVar = cVar2;
                                        break;
                                    }
                                    int codePointAt2 = str6.codePointAt(charCount);
                                    cVar = cVar2;
                                    if (Character.getType(codePointAt2) != 16 && Character.getType(codePointAt2) != 27 && Character.getType(codePointAt2) != 6 && Character.getType(codePointAt2) != 28 && Character.getType(codePointAt2) != 8 && Character.getType(codePointAt2) != 19) {
                                        break;
                                    }
                                    charCount += Character.charCount(codePointAt2);
                                    codePointAt = (codePointAt * 31) + codePointAt2;
                                    cVar2 = cVar;
                                }
                                long j11 = codePointAt;
                                C5153w<String> c5153w = iVar.f15267G;
                                if (c5153w.c(j11) >= 0) {
                                    sb2 = c5153w.b(j11);
                                    f7 = f16;
                                } else {
                                    f7 = f16;
                                    StringBuilder sb3 = iVar.f15261A;
                                    sb3.setLength(0);
                                    int i29 = i27;
                                    while (i29 < charCount) {
                                        int i31 = charCount;
                                        int codePointAt3 = str6.codePointAt(i29);
                                        sb3.appendCodePoint(codePointAt3);
                                        i29 += Character.charCount(codePointAt3);
                                        charCount = i31;
                                    }
                                    sb2 = sb3.toString();
                                    c5153w.f(j11, sb2);
                                }
                                i27 += sb2.length();
                                if (g10.f10610k) {
                                    w(sb2, paint, canvas);
                                    w(sb2, paint2, canvas);
                                } else {
                                    w(sb2, paint2, canvas);
                                    w(sb2, paint, canvas);
                                }
                                canvas.translate(paint.measureText(sb2) + f7, 0.0f);
                                iVar = this;
                                A12 = list4;
                                f16 = f7;
                                i26 = i28;
                                cVar2 = cVar;
                            }
                            canvas.restore();
                            i26++;
                            iVar = this;
                            A12 = A12;
                        }
                        i12++;
                        iVar = this;
                        c13 = f16;
                    }
                }
                f15 += floatValue;
                float c132 = ((O5.g.c() * f15) * floatValue4) / 100.0f;
                List asList22 = Arrays.asList(str4.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                size = asList22.size();
                i12 = 0;
                int i252 = -1;
                while (i12 < size) {
                }
            }
        }
        canvas.restore();
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private String f15283a;

        /* renamed from: b, reason: collision with root package name */
        private float f15284b;

        private d() {
            this.f15283a = "";
            this.f15284b = 0.0f;
        }

        final void c(String str, float f7) {
            this.f15283a = str;
            this.f15284b = f7;
        }

        /* synthetic */ d(int i11) {
            this();
        }
    }
}
