package M5;

import N5.c;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;

/* loaded from: classes.dex */
final class t {

    /* renamed from: a, reason: collision with root package name */
    private static final LinearInterpolator f17443a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    static c.a f17444b = c.a.a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: c, reason: collision with root package name */
    static c.a f17445c = c.a.a("x", "y");

    private static Interpolator a(PointF pointF, PointF pointF2) {
        Interpolator a11;
        pointF.x = O5.f.b(pointF.x, -1.0f, 1.0f);
        pointF.y = O5.f.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = O5.f.b(pointF2.x, -1.0f, 1.0f);
        float b11 = O5.f.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b11;
        int i11 = O5.g.f19991f;
        int i12 = B5.c.f2729d;
        try {
            a11 = androidx.core.view.animation.a.a(pointF.x, pointF.y, pointF2.x, b11);
        } catch (IllegalArgumentException e11) {
            a11 = "The Path cannot loop back on itself.".equals(e11.getMessage()) ? androidx.core.view.animation.a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        int i13 = B5.c.f2729d;
        return a11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021b A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.view.animation.Interpolator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> P5.a<T> b(N5.c cVar, B5.g gVar, float f7, M<T> m11, boolean z11, boolean z12) throws IOException {
        T t2;
        LinearInterpolator a11;
        T t11;
        Interpolator a12;
        Interpolator a13;
        LinearInterpolator linearInterpolator;
        LinearInterpolator linearInterpolator2;
        c.a aVar;
        PointF pointF;
        PointF pointF2;
        c.a aVar2;
        c.a aVar3;
        PointF pointF3;
        float f11;
        LinearInterpolator linearInterpolator3 = f17443a;
        c.a aVar4 = f17444b;
        if (!z11 || !z12) {
            c.a aVar5 = aVar4;
            if (!z11) {
                return new P5.a<>(m11.a(cVar, f7));
            }
            cVar.beginObject();
            PointF pointF4 = null;
            PointF pointF5 = null;
            PointF pointF6 = null;
            boolean z13 = false;
            PointF pointF7 = null;
            T t12 = null;
            float f12 = 0.0f;
            T t13 = null;
            while (cVar.hasNext()) {
                c.a aVar6 = aVar5;
                switch (cVar.p(aVar6)) {
                    case 0:
                        aVar5 = aVar6;
                        f12 = (float) cVar.nextDouble();
                        continue;
                    case 1:
                        t12 = m11.a(cVar, f7);
                        break;
                    case 2:
                        t13 = m11.a(cVar, f7);
                        break;
                    case 3:
                        pointF7 = s.b(cVar, 1.0f);
                        break;
                    case 4:
                        pointF4 = s.b(cVar, 1.0f);
                        break;
                    case 5:
                        if (cVar.nextInt() != 1) {
                            z13 = false;
                            break;
                        } else {
                            z13 = true;
                            break;
                        }
                    case 6:
                        pointF5 = s.b(cVar, f7);
                        break;
                    case 7:
                        pointF6 = s.b(cVar, f7);
                        break;
                    default:
                        cVar.skipValue();
                        break;
                }
                aVar5 = aVar6;
            }
            cVar.endObject();
            if (z13) {
                t2 = t12;
            } else {
                if (pointF7 != null && pointF4 != null) {
                    a11 = a(pointF7, pointF4);
                    t2 = t13;
                    P5.a<T> aVar7 = new P5.a<>(gVar, t12, t2, a11, f12, (Float) null);
                    aVar7.f21862o = pointF5;
                    aVar7.f21863p = pointF6;
                    return aVar7;
                }
                t2 = t13;
            }
            a11 = linearInterpolator3;
            P5.a<T> aVar72 = new P5.a<>(gVar, t12, t2, a11, f12, (Float) null);
            aVar72.f21862o = pointF5;
            aVar72.f21863p = pointF6;
            return aVar72;
        }
        cVar.beginObject();
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        boolean z14 = false;
        PointF pointF11 = null;
        PointF pointF12 = null;
        PointF pointF13 = null;
        T t14 = null;
        PointF pointF14 = null;
        PointF pointF15 = null;
        float f13 = 0.0f;
        T t15 = null;
        while (cVar.hasNext()) {
            int p11 = cVar.p(aVar4);
            c.a aVar8 = f17445c;
            switch (p11) {
                case 0:
                    linearInterpolator2 = linearInterpolator3;
                    aVar = aVar4;
                    pointF = pointF9;
                    pointF2 = pointF10;
                    f13 = (float) cVar.nextDouble();
                    pointF9 = pointF;
                    linearInterpolator3 = linearInterpolator2;
                    aVar4 = aVar;
                    pointF10 = pointF2;
                    break;
                case 1:
                    aVar2 = aVar4;
                    t14 = m11.a(cVar, f7);
                    aVar4 = aVar2;
                    break;
                case 2:
                    aVar2 = aVar4;
                    t15 = m11.a(cVar, f7);
                    aVar4 = aVar2;
                    break;
                case 3:
                    linearInterpolator2 = linearInterpolator3;
                    aVar = aVar4;
                    pointF = pointF9;
                    pointF2 = pointF10;
                    boolean z15 = z14;
                    T t16 = t14;
                    if (cVar.m() == c.b.BEGIN_OBJECT) {
                        cVar.beginObject();
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        float f17 = 0.0f;
                        while (cVar.hasNext()) {
                            int p12 = cVar.p(aVar8);
                            if (p12 == 0) {
                                c.b m12 = cVar.m();
                                c.b bVar = c.b.NUMBER;
                                if (m12 == bVar) {
                                    f16 = (float) cVar.nextDouble();
                                    f14 = f16;
                                } else {
                                    cVar.beginArray();
                                    f14 = (float) cVar.nextDouble();
                                    f16 = cVar.m() == bVar ? (float) cVar.nextDouble() : f14;
                                    cVar.endArray();
                                }
                            } else if (p12 != 1) {
                                cVar.skipValue();
                            } else {
                                c.b m13 = cVar.m();
                                c.b bVar2 = c.b.NUMBER;
                                if (m13 == bVar2) {
                                    f17 = (float) cVar.nextDouble();
                                    f15 = f17;
                                } else {
                                    cVar.beginArray();
                                    f15 = (float) cVar.nextDouble();
                                    f17 = cVar.m() == bVar2 ? (float) cVar.nextDouble() : f15;
                                    cVar.endArray();
                                }
                            }
                        }
                        pointF13 = new PointF(f14, f15);
                        pointF14 = new PointF(f16, f17);
                        cVar.endObject();
                    } else {
                        pointF11 = s.b(cVar, f7);
                    }
                    z14 = z15;
                    t14 = t16;
                    pointF9 = pointF;
                    linearInterpolator3 = linearInterpolator2;
                    aVar4 = aVar;
                    pointF10 = pointF2;
                    break;
                case 4:
                    LinearInterpolator linearInterpolator4 = linearInterpolator3;
                    boolean z16 = z14;
                    if (cVar.m() == c.b.BEGIN_OBJECT) {
                        cVar.beginObject();
                        float f18 = 0.0f;
                        float f19 = 0.0f;
                        float f21 = 0.0f;
                        float f22 = 0.0f;
                        while (cVar.hasNext()) {
                            T t17 = t14;
                            int p13 = cVar.p(aVar8);
                            if (p13 != 0) {
                                aVar3 = aVar4;
                                if (p13 != 1) {
                                    cVar.skipValue();
                                    t14 = t17;
                                } else {
                                    c.b m14 = cVar.m();
                                    c.b bVar3 = c.b.NUMBER;
                                    if (m14 == bVar3) {
                                        f22 = (float) cVar.nextDouble();
                                        t14 = t17;
                                        pointF9 = pointF9;
                                        f19 = f22;
                                    } else {
                                        PointF pointF16 = pointF9;
                                        cVar.beginArray();
                                        pointF3 = pointF10;
                                        float nextDouble = (float) cVar.nextDouble();
                                        if (cVar.m() == bVar3) {
                                            f11 = nextDouble;
                                            f22 = (float) cVar.nextDouble();
                                        } else {
                                            f11 = nextDouble;
                                            f22 = f11;
                                        }
                                        cVar.endArray();
                                        t14 = t17;
                                        pointF9 = pointF16;
                                        f19 = f11;
                                    }
                                }
                                aVar4 = aVar3;
                            } else {
                                aVar3 = aVar4;
                                PointF pointF17 = pointF9;
                                pointF3 = pointF10;
                                c.b m15 = cVar.m();
                                c.b bVar4 = c.b.NUMBER;
                                if (m15 == bVar4) {
                                    f21 = (float) cVar.nextDouble();
                                    t14 = t17;
                                    pointF9 = pointF17;
                                    f18 = f21;
                                } else {
                                    cVar.beginArray();
                                    f18 = (float) cVar.nextDouble();
                                    f21 = cVar.m() == bVar4 ? (float) cVar.nextDouble() : f18;
                                    cVar.endArray();
                                    t14 = t17;
                                    pointF9 = pointF17;
                                }
                            }
                            aVar4 = aVar3;
                            pointF10 = pointF3;
                        }
                        aVar2 = aVar4;
                        PointF pointF18 = new PointF(f18, f19);
                        pointF8 = new PointF(f21, f22);
                        cVar.endObject();
                        z14 = z16;
                        pointF15 = pointF18;
                    } else {
                        aVar2 = aVar4;
                        pointF12 = s.b(cVar, f7);
                        z14 = z16;
                    }
                    linearInterpolator3 = linearInterpolator4;
                    aVar4 = aVar2;
                    break;
                case 5:
                    if (cVar.nextInt() != 1) {
                        z14 = false;
                        break;
                    } else {
                        z14 = true;
                        break;
                    }
                case 6:
                    pointF9 = s.b(cVar, f7);
                    break;
                case 7:
                    pointF10 = s.b(cVar, f7);
                    break;
                default:
                    cVar.skipValue();
                    break;
            }
        }
        LinearInterpolator linearInterpolator5 = linearInterpolator3;
        PointF pointF19 = pointF9;
        PointF pointF20 = pointF10;
        boolean z17 = z14;
        T t18 = t14;
        cVar.endObject();
        if (z17) {
            t11 = t18;
        } else {
            if (pointF11 != null && pointF12 != null) {
                linearInterpolator = a(pointF11, pointF12);
                t11 = t15;
                a12 = null;
                a13 = null;
                if (a12 != null) {
                }
                r11.f21862o = pointF19;
                r11.f21863p = pointF20;
                return r11;
            }
            if (pointF13 != null && pointF14 != null && pointF15 != null && pointF8 != null) {
                a12 = a(pointF13, pointF15);
                a13 = a(pointF14, pointF8);
                t11 = t15;
                linearInterpolator = null;
                P5.a<T> aVar9 = (a12 != null || a13 == null) ? new P5.a<>(gVar, t18, t11, linearInterpolator, f13, (Float) null) : new P5.a<>(gVar, t18, t11, a12, a13, f13);
                aVar9.f21862o = pointF19;
                aVar9.f21863p = pointF20;
                return aVar9;
            }
            t11 = t15;
        }
        linearInterpolator = linearInterpolator5;
        a12 = null;
        a13 = null;
        if (a12 != null) {
        }
        aVar9.f21862o = pointF19;
        aVar9.f21863p = pointF20;
        return aVar9;
    }
}
