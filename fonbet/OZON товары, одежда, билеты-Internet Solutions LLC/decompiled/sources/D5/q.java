package D5;

import E5.a;
import Hj.C3143a;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class q implements s, a.InterfaceC0168a {

    /* renamed from: a, reason: collision with root package name */
    private final com.airbnb.lottie.g f6061a;

    /* renamed from: b, reason: collision with root package name */
    private final E5.a<Float, Float> f6062b;

    /* renamed from: c, reason: collision with root package name */
    private J5.o f6063c;

    public q(com.airbnb.lottie.g gVar, K5.b bVar, J5.n nVar) {
        this.f6061a = gVar;
        nVar.getClass();
        E5.a<Float, Float> h11 = ((I5.b) nVar.b()).h();
        this.f6062b = h11;
        bVar.i(h11);
        h11.a(this);
    }

    private static int c(int i11, int i12) {
        int i13 = i11 / i12;
        if ((i11 ^ i12) < 0 && i13 * i12 != i11) {
            i13--;
        }
        return i11 - (i13 * i12);
    }

    @Override // D5.s
    public final J5.o b(J5.o oVar) {
        ArrayList arrayList;
        float f7;
        ArrayList arrayList2 = (ArrayList) oVar.a();
        if (arrayList2.size() > 2) {
            float floatValue = this.f6062b.g().floatValue();
            if (floatValue != 0.0f) {
                List<H5.a> a11 = oVar.a();
                boolean d11 = oVar.d();
                ArrayList arrayList3 = (ArrayList) a11;
                boolean z11 = true;
                int size = arrayList3.size() - 1;
                int i11 = 0;
                while (size >= 0) {
                    H5.a aVar = (H5.a) arrayList3.get(size);
                    H5.a aVar2 = (H5.a) arrayList3.get(c(size - 1, arrayList3.size()));
                    PointF c11 = (size != 0 || d11) ? aVar2.c() : oVar.b();
                    i11 = (((size != 0 || d11) ? aVar2.b() : c11).equals(c11) && aVar.a().equals(c11) && !(!oVar.d() && (size == 0 || size == arrayList3.size() - 1))) ? i11 + 2 : i11 + 1;
                    size--;
                }
                J5.o oVar2 = this.f6063c;
                if (oVar2 == null || ((ArrayList) oVar2.a()).size() != i11) {
                    ArrayList arrayList4 = new ArrayList(i11);
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList4.add(new H5.a());
                    }
                    this.f6063c = new J5.o(new PointF(0.0f, 0.0f), false, arrayList4);
                }
                this.f6063c.e(d11);
                J5.o oVar3 = this.f6063c;
                oVar3.f(oVar.b().x, oVar.b().y);
                List<H5.a> a12 = oVar3.a();
                boolean d12 = oVar.d();
                int i13 = 0;
                int i14 = 0;
                while (i13 < arrayList2.size()) {
                    H5.a aVar3 = (H5.a) arrayList2.get(i13);
                    H5.a aVar4 = (H5.a) arrayList2.get(c(i13 - 1, arrayList2.size()));
                    H5.a aVar5 = (H5.a) arrayList2.get(c(i13 - 2, arrayList2.size()));
                    PointF c12 = (i13 != 0 || d12) ? aVar4.c() : oVar.b();
                    PointF b11 = (i13 != 0 || d12) ? aVar4.b() : c12;
                    PointF a13 = aVar3.a();
                    PointF c13 = aVar5.c();
                    boolean z12 = z11;
                    PointF c14 = aVar3.c();
                    boolean z13 = (oVar.d() || !(i13 == 0 || i13 == arrayList2.size() + (-1))) ? false : z12;
                    if (b11.equals(c12) && a13.equals(c12) && !z13) {
                        float f11 = c12.x;
                        float f12 = f11 - c13.x;
                        float f13 = c12.y;
                        float f14 = f13 - c13.y;
                        float f15 = c14.x - f11;
                        float f16 = c14.y - f13;
                        arrayList = arrayList2;
                        float hypot = (float) Math.hypot(f12, f14);
                        float hypot2 = (float) Math.hypot(f15, f16);
                        float min = Math.min(floatValue / hypot, 0.5f);
                        float min2 = Math.min(floatValue / hypot2, 0.5f);
                        float f17 = c12.x;
                        float d13 = C3143a.d(c13.x, f17, min, f17);
                        float f18 = c12.y;
                        float d14 = C3143a.d(c13.y, f18, min, f18);
                        float d15 = C3143a.d(c14.x, f17, min2, f17);
                        float d16 = C3143a.d(c14.y, f18, min2, f18);
                        float f19 = d13 - ((d13 - f17) * 0.5519f);
                        float f21 = d14 - ((d14 - f18) * 0.5519f);
                        float f22 = d15 - ((d15 - f17) * 0.5519f);
                        float f23 = d16 - ((d16 - f18) * 0.5519f);
                        ArrayList arrayList5 = (ArrayList) a12;
                        f7 = floatValue;
                        H5.a aVar6 = (H5.a) arrayList5.get(c(i14 - 1, arrayList5.size()));
                        H5.a aVar7 = (H5.a) arrayList5.get(i14);
                        aVar6.e(d13, d14);
                        aVar6.f(d13, d14);
                        if (i13 == 0) {
                            oVar3.f(d13, d14);
                        }
                        aVar7.d(f19, f21);
                        H5.a aVar8 = (H5.a) arrayList5.get(i14 + 1);
                        aVar7.e(f22, f23);
                        aVar7.f(d15, d16);
                        aVar8.d(d15, d16);
                        i14 += 2;
                    } else {
                        arrayList = arrayList2;
                        f7 = floatValue;
                        ArrayList arrayList6 = (ArrayList) a12;
                        H5.a aVar9 = (H5.a) arrayList6.get(c(i14 - 1, arrayList6.size()));
                        H5.a aVar10 = (H5.a) arrayList6.get(i14);
                        aVar9.e(aVar4.b().x, aVar4.b().y);
                        aVar9.f(aVar4.c().x, aVar4.c().y);
                        aVar10.d(aVar3.a().x, aVar3.a().y);
                        i14++;
                    }
                    i13++;
                    z11 = z12;
                    arrayList2 = arrayList;
                    floatValue = f7;
                }
                return oVar3;
            }
        }
        return oVar;
    }

    public final E5.a<Float, Float> d() {
        return this.f6062b;
    }

    @Override // E5.a.InterfaceC0168a
    public final void f() {
        this.f6061a.invalidateSelf();
    }

    @Override // D5.c
    public final void g(List<c> list, List<c> list2) {
    }
}
