package D5;

import B5.v;
import E5.a;
import Hj.C3143a;
import J5.k;
import J5.t;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class n implements m, a.InterfaceC0168a, k {

    /* renamed from: b, reason: collision with root package name */
    private final String f6025b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.g f6026c;

    /* renamed from: d, reason: collision with root package name */
    private final k.a f6027d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6028e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6029f;

    /* renamed from: g, reason: collision with root package name */
    private final E5.d f6030g;

    /* renamed from: h, reason: collision with root package name */
    private final E5.a<?, PointF> f6031h;

    /* renamed from: i, reason: collision with root package name */
    private final E5.d f6032i;

    /* renamed from: j, reason: collision with root package name */
    private final E5.d f6033j;

    /* renamed from: k, reason: collision with root package name */
    private final E5.d f6034k;

    /* renamed from: l, reason: collision with root package name */
    private final E5.d f6035l;

    /* renamed from: m, reason: collision with root package name */
    private final E5.d f6036m;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6038o;

    /* renamed from: a, reason: collision with root package name */
    private final Path f6024a = new Path();

    /* renamed from: n, reason: collision with root package name */
    private final b f6037n = new b();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6039a;

        static {
            int[] iArr = new int[k.a.values().length];
            f6039a = iArr;
            try {
                iArr[k.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6039a[k.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(com.airbnb.lottie.g gVar, K5.b bVar, J5.k kVar) {
        this.f6026c = gVar;
        this.f6025b = kVar.d();
        k.a j11 = kVar.j();
        this.f6027d = j11;
        this.f6028e = kVar.k();
        this.f6029f = kVar.l();
        E5.a<Float, Float> h11 = kVar.g().h();
        this.f6030g = (E5.d) h11;
        E5.a<PointF, PointF> h12 = kVar.h().h();
        this.f6031h = h12;
        E5.a<Float, Float> h13 = kVar.i().h();
        this.f6032i = (E5.d) h13;
        E5.a<Float, Float> h14 = kVar.e().h();
        this.f6034k = (E5.d) h14;
        E5.a<Float, Float> h15 = kVar.f().h();
        this.f6036m = (E5.d) h15;
        k.a aVar = k.a.STAR;
        if (j11 == aVar) {
            this.f6033j = (E5.d) kVar.b().h();
            this.f6035l = (E5.d) kVar.c().h();
        } else {
            this.f6033j = null;
            this.f6035l = null;
        }
        bVar.i(h11);
        bVar.i(h12);
        bVar.i(h13);
        bVar.i(h14);
        bVar.i(h15);
        if (j11 == aVar) {
            bVar.i(this.f6033j);
            bVar.i(this.f6035l);
        }
        h11.a(this);
        h12.a(this);
        h13.a(this);
        h14.a(this);
        h15.a(this);
        if (j11 == aVar) {
            this.f6033j.a(this);
            this.f6035l.a(this);
        }
    }

    @Override // H5.f
    public final void d(P5.c cVar, Object obj) {
        E5.d dVar;
        E5.d dVar2;
        if (obj == v.f2802r) {
            this.f6030g.m(cVar);
            return;
        }
        if (obj == v.f2803s) {
            this.f6032i.m(cVar);
            return;
        }
        if (obj == v.f2793i) {
            this.f6031h.m(cVar);
            return;
        }
        if (obj == v.f2804t && (dVar2 = this.f6033j) != null) {
            dVar2.m(cVar);
            return;
        }
        if (obj == v.f2805u) {
            this.f6034k.m(cVar);
            return;
        }
        if (obj == v.f2806v && (dVar = this.f6035l) != null) {
            dVar.m(cVar);
        } else if (obj == v.f2807w) {
            this.f6036m.m(cVar);
        }
    }

    @Override // E5.a.InterfaceC0168a
    public final void f() {
        this.f6038o = false;
        this.f6026c.invalidateSelf();
    }

    @Override // D5.c
    public final void g(List<c> list, List<c> list2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i11 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i11);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f6037n.a(uVar);
                    uVar.c(this);
                }
            }
            i11++;
        }
    }

    @Override // D5.c
    public final String getName() {
        return this.f6025b;
    }

    @Override // D5.m
    public final Path getPath() {
        float f7;
        float f11;
        float f12;
        double d11;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11;
        float f17;
        float f18;
        float f19;
        int i12;
        double d12;
        boolean z11 = this.f6038o;
        Path path = this.f6024a;
        if (z11) {
            return path;
        }
        path.reset();
        if (this.f6028e) {
            this.f6038o = true;
            return path;
        }
        int i13 = a.f6039a[this.f6027d.ordinal()];
        E5.a<?, PointF> aVar = this.f6031h;
        E5.d dVar = this.f6034k;
        E5.d dVar2 = this.f6036m;
        E5.d dVar3 = this.f6032i;
        E5.d dVar4 = this.f6030g;
        if (i13 == 1) {
            float floatValue = dVar4.g().floatValue();
            double radians = Math.toRadians((dVar3 != null ? dVar3.g().floatValue() : 0.0d) - 90.0d);
            double d13 = floatValue;
            float f21 = (float) (6.283185307179586d / d13);
            if (this.f6029f) {
                f21 *= -1.0f;
            }
            float f22 = f21;
            float f23 = f22 / 2.0f;
            float f24 = floatValue - ((int) floatValue);
            if (f24 != 0.0f) {
                f7 = 2.0f;
                f11 = f23;
                radians += (1.0f - f24) * f23;
            } else {
                f7 = 2.0f;
                f11 = f23;
            }
            float floatValue2 = dVar.g().floatValue();
            float floatValue3 = this.f6033j.g().floatValue();
            E5.d dVar5 = this.f6035l;
            float floatValue4 = dVar5 != null ? dVar5.g().floatValue() / 100.0f : 0.0f;
            float floatValue5 = dVar2 != null ? dVar2.g().floatValue() / 100.0f : 0.0f;
            if (f24 != 0.0f) {
                float d14 = C3143a.d(floatValue2, floatValue3, f24, floatValue3);
                double d15 = d14;
                float cos = (float) (Math.cos(radians) * d15);
                float sin = (float) (Math.sin(radians) * d15);
                path.moveTo(cos, sin);
                f13 = cos;
                d11 = radians + ((f22 * f24) / f7);
                f12 = f11;
                f14 = sin;
                f15 = d14;
            } else {
                double d16 = floatValue2;
                float cos2 = (float) (Math.cos(radians) * d16);
                float sin2 = (float) (d16 * Math.sin(radians));
                path.moveTo(cos2, sin2);
                f12 = f11;
                d11 = radians + f12;
                f13 = cos2;
                f14 = sin2;
                f15 = 0.0f;
            }
            double ceil = Math.ceil(d13);
            double d17 = 2.0d;
            double d18 = ceil * 2.0d;
            float f25 = f14;
            float f26 = f13;
            int i14 = 0;
            boolean z12 = false;
            double d19 = d11;
            while (true) {
                double d21 = i14;
                if (d21 >= d18) {
                    break;
                }
                float f27 = z12 ? floatValue2 : floatValue3;
                float f28 = (f15 == 0.0f || d21 != d18 - d17) ? f12 : (f22 * f24) / f7;
                if (f15 == 0.0f || d21 != d18 - 1.0d) {
                    f16 = f27;
                    i11 = i14;
                    f17 = f12;
                } else {
                    f16 = f15;
                    f17 = f12;
                    i11 = i14;
                }
                double d22 = f16;
                float cos3 = (float) (Math.cos(d19) * d22);
                float sin3 = (float) (Math.sin(d19) * d22);
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    path.lineTo(cos3, sin3);
                    f18 = f24;
                    f19 = cos3;
                } else {
                    f18 = f24;
                    Path path2 = path;
                    float f29 = f25;
                    double atan2 = (float) (Math.atan2(f25, f26) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    double atan22 = (float) (Math.atan2(sin3, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    float f31 = z12 ? floatValue4 : floatValue5;
                    float f32 = z12 ? floatValue5 : floatValue4;
                    float f33 = (z12 ? floatValue3 : floatValue2) * f31 * 0.47829f;
                    float f34 = cos4 * f33;
                    float f35 = f33 * sin4;
                    float f36 = (z12 ? floatValue2 : floatValue3) * f32 * 0.47829f;
                    float f37 = cos5 * f36;
                    float f38 = f36 * sin5;
                    if (f24 != 0.0f) {
                        if (i11 == 0) {
                            f34 *= f18;
                            f35 *= f18;
                        } else if (d21 == d18 - 1.0d) {
                            f37 *= f18;
                            f38 *= f18;
                        }
                    }
                    f19 = cos3;
                    path = path2;
                    path.cubicTo(f26 - f34, f29 - f35, f37 + cos3, sin3 + f38, f19, sin3);
                }
                d19 += f28;
                z12 = !z12;
                i14 = i11 + 1;
                f26 = f19;
                f25 = sin3;
                f24 = f18;
                f12 = f17;
                d17 = 2.0d;
            }
            PointF g10 = aVar.g();
            path.offset(g10.x, g10.y);
            path.close();
        } else if (i13 == 2) {
            int floor = (int) Math.floor(dVar4.g().floatValue());
            double radians2 = Math.toRadians((dVar3 != null ? dVar3.g().floatValue() : 0.0d) - 90.0d);
            double d23 = floor;
            float floatValue6 = dVar2.g().floatValue() / 100.0f;
            float floatValue7 = dVar.g().floatValue();
            double d24 = floatValue7;
            float cos6 = (float) (Math.cos(radians2) * d24);
            float sin6 = (float) (Math.sin(radians2) * d24);
            path.moveTo(cos6, sin6);
            double d25 = (float) (6.283185307179586d / d23);
            double ceil2 = Math.ceil(d23);
            double d26 = radians2 + d25;
            int i15 = 0;
            while (i15 < ceil2) {
                float cos7 = (float) (Math.cos(d26) * d24);
                E5.a<?, PointF> aVar2 = aVar;
                float sin7 = (float) (Math.sin(d26) * d24);
                if (floatValue6 != 0.0f) {
                    i12 = i15;
                    Path path3 = path;
                    double atan23 = (float) (Math.atan2(sin6, cos6) - 1.5707963267948966d);
                    float cos8 = (float) Math.cos(atan23);
                    float sin8 = (float) Math.sin(atan23);
                    d12 = d24;
                    double atan24 = (float) (Math.atan2(sin7, cos7) - 1.5707963267948966d);
                    float f39 = floatValue7 * floatValue6 * 0.25f;
                    float f41 = cos8 * f39;
                    float f42 = f39 * sin8;
                    float cos9 = ((float) Math.cos(atan24)) * f39;
                    float sin9 = sin7 + (f39 * ((float) Math.sin(atan24)));
                    path = path3;
                    path.cubicTo(cos6 - f41, sin6 - f42, cos9 + cos7, sin9, cos7, sin7);
                } else {
                    i12 = i15;
                    d12 = d24;
                    path.lineTo(cos7, sin7);
                }
                d26 += d25;
                i15 = i12 + 1;
                cos6 = cos7;
                sin6 = sin7;
                d24 = d12;
                aVar = aVar2;
            }
            PointF g11 = aVar.g();
            path.offset(g11.x, g11.y);
            path.close();
        }
        path.close();
        this.f6037n.b(path);
        this.f6038o = true;
        return path;
    }

    @Override // H5.f
    public final void h(H5.e eVar, int i11, ArrayList arrayList, H5.e eVar2) {
        O5.f.f(eVar, i11, arrayList, eVar2, this);
    }
}
