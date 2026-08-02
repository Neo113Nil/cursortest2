package D5;

import B5.v;
import E5.a;
import J5.t;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class f implements m, a.InterfaceC0168a, k {

    /* renamed from: b, reason: collision with root package name */
    private final String f5966b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.g f5967c;

    /* renamed from: d, reason: collision with root package name */
    private final E5.k f5968d;

    /* renamed from: e, reason: collision with root package name */
    private final E5.a<?, PointF> f5969e;

    /* renamed from: f, reason: collision with root package name */
    private final J5.b f5970f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5972h;

    /* renamed from: a, reason: collision with root package name */
    private final Path f5965a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final b f5971g = new b();

    public f(com.airbnb.lottie.g gVar, K5.b bVar, J5.b bVar2) {
        this.f5966b = bVar2.b();
        this.f5967c = gVar;
        E5.a<PointF, PointF> h11 = bVar2.d().h();
        this.f5968d = (E5.k) h11;
        E5.a<PointF, PointF> h12 = bVar2.c().h();
        this.f5969e = h12;
        this.f5970f = bVar2;
        bVar.i(h11);
        bVar.i(h12);
        h11.a(this);
        h12.a(this);
    }

    @Override // H5.f
    public final void d(P5.c cVar, Object obj) {
        if (obj == v.f2790f) {
            this.f5968d.m(cVar);
        } else if (obj == v.f2793i) {
            this.f5969e.m(cVar);
        }
    }

    @Override // E5.a.InterfaceC0168a
    public final void f() {
        this.f5972h = false;
        this.f5967c.invalidateSelf();
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
                    this.f5971g.a(uVar);
                    uVar.c(this);
                }
            }
            i11++;
        }
    }

    @Override // D5.c
    public final String getName() {
        return this.f5966b;
    }

    @Override // D5.m
    public final Path getPath() {
        boolean z11 = this.f5972h;
        Path path = this.f5965a;
        if (z11) {
            return path;
        }
        path.reset();
        J5.b bVar = this.f5970f;
        if (bVar.e()) {
            this.f5972h = true;
            return path;
        }
        PointF g10 = this.f5968d.g();
        float f7 = g10.x / 2.0f;
        float f11 = g10.y / 2.0f;
        float f12 = f7 * 0.55228f;
        float f13 = f11 * 0.55228f;
        path.reset();
        if (bVar.f()) {
            float f14 = -f11;
            path.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f7;
            float f17 = 0.0f - f13;
            path.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            path.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            path.cubicTo(f19, f11, f7, f18, f7, 0.0f);
            path.cubicTo(f7, f17, f19, f14, 0.0f, f14);
        } else {
            float f21 = -f11;
            path.moveTo(0.0f, f21);
            float f22 = f12 + 0.0f;
            float f23 = 0.0f - f13;
            path.cubicTo(f22, f21, f7, f23, f7, 0.0f);
            float f24 = f13 + 0.0f;
            path.cubicTo(f7, f24, f22, f11, 0.0f, f11);
            float f25 = 0.0f - f12;
            float f26 = -f7;
            path.cubicTo(f25, f11, f26, f24, f26, 0.0f);
            path.cubicTo(f26, f23, f25, f21, 0.0f, f21);
        }
        PointF g11 = this.f5969e.g();
        path.offset(g11.x, g11.y);
        path.close();
        this.f5971g.b(path);
        this.f5972h = true;
        return path;
    }

    @Override // H5.f
    public final void h(H5.e eVar, int i11, ArrayList arrayList, H5.e eVar2) {
        O5.f.f(eVar, i11, arrayList, eVar2, this);
    }
}
