package E5;

import H5.b;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes8.dex */
public final class o extends g<H5.b> {

    final class a extends P5.c<H5.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P5.b f7518c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ P5.c f7519d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ H5.b f7520e;

        a(P5.b bVar, P5.c cVar, H5.b bVar2) {
            this.f7518c = bVar;
            this.f7519d = cVar;
            this.f7520e = bVar2;
        }

        @Override // P5.c
        public final H5.b a(P5.b<H5.b> bVar) {
            float f7 = bVar.f();
            float a11 = bVar.a();
            String str = bVar.g().f10600a;
            String str2 = bVar.b().f10600a;
            float d11 = bVar.d();
            float c11 = bVar.c();
            float e11 = bVar.e();
            P5.b bVar2 = this.f7518c;
            bVar2.h(f7, a11, str, str2, d11, c11, e11);
            String str3 = (String) this.f7519d.a(bVar2);
            H5.b b11 = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            String str4 = b11.f10601b;
            float f11 = b11.f10602c;
            b.a aVar = b11.f10603d;
            int i11 = b11.f10604e;
            float f12 = b11.f10605f;
            float f13 = b11.f10606g;
            int i12 = b11.f10607h;
            int i13 = b11.f10608i;
            float f14 = b11.f10609j;
            boolean z11 = b11.f10610k;
            PointF pointF = b11.f10611l;
            PointF pointF2 = b11.f10612m;
            H5.b bVar3 = this.f7520e;
            bVar3.f10600a = str3;
            bVar3.f10601b = str4;
            bVar3.f10602c = f11;
            bVar3.f10603d = aVar;
            bVar3.f10604e = i11;
            bVar3.f10605f = f12;
            bVar3.f10606g = f13;
            bVar3.f10607h = i12;
            bVar3.f10608i = i13;
            bVar3.f10609j = f14;
            bVar3.f10610k = z11;
            bVar3.f10611l = pointF;
            bVar3.f10612m = pointF2;
            return bVar3;
        }
    }

    public o(List<P5.a<H5.b>> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // E5.a
    final Object h(P5.a aVar, float f7) {
        T t2;
        P5.c<A> cVar = this.f7479e;
        T t11 = aVar.f21849b;
        if (cVar == 0) {
            return (f7 != 1.0f || (t2 = aVar.f21850c) == 0) ? (H5.b) t11 : (H5.b) t2;
        }
        Float f11 = aVar.f21855h;
        float floatValue = f11 == null ? Float.MAX_VALUE : f11.floatValue();
        H5.b bVar = (H5.b) t11;
        T t12 = aVar.f21850c;
        return (H5.b) cVar.b(aVar.f21854g, floatValue, bVar, t12 == 0 ? bVar : (H5.b) t12, f7, d(), this.f7478d);
    }

    public final void n(P5.c<String> cVar) {
        m(new a(new P5.b(), cVar, new H5.b()));
    }
}
