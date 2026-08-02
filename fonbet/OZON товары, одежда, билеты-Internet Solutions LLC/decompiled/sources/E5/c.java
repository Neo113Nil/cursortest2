package E5;

import E5.a;
import M5.C3614j;
import android.graphics.Color;

/* loaded from: classes8.dex */
public final class c implements a.InterfaceC0168a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7489a;

    /* renamed from: b, reason: collision with root package name */
    private final b f7490b;

    /* renamed from: c, reason: collision with root package name */
    private final d f7491c;

    /* renamed from: d, reason: collision with root package name */
    private final d f7492d;

    /* renamed from: e, reason: collision with root package name */
    private final d f7493e;

    /* renamed from: f, reason: collision with root package name */
    private final d f7494f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7495g = true;

    final class a extends P5.c<Float> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ P5.c f7496c;

        a(P5.c cVar) {
            this.f7496c = cVar;
        }

        @Override // P5.c
        public final Float a(P5.b<Float> bVar) {
            Float f7 = (Float) this.f7496c.a(bVar);
            if (f7 == null) {
                return null;
            }
            return Float.valueOf(f7.floatValue() * 2.55f);
        }
    }

    public c(a.InterfaceC0168a interfaceC0168a, K5.b bVar, C3614j c3614j) {
        this.f7489a = interfaceC0168a;
        E5.a<Integer, Integer> h11 = c3614j.a().h();
        this.f7490b = (b) h11;
        h11.a(this);
        bVar.i(h11);
        E5.a<Float, Float> h12 = c3614j.d().h();
        this.f7491c = (d) h12;
        h12.a(this);
        bVar.i(h12);
        E5.a<Float, Float> h13 = c3614j.b().h();
        this.f7492d = (d) h13;
        h13.a(this);
        bVar.i(h13);
        E5.a<Float, Float> h14 = c3614j.c().h();
        this.f7493e = (d) h14;
        h14.a(this);
        bVar.i(h14);
        E5.a<Float, Float> h15 = c3614j.e().h();
        this.f7494f = (d) h15;
        h15.a(this);
        bVar.i(h15);
    }

    public final void a(C5.a aVar) {
        if (this.f7495g) {
            this.f7495g = false;
            double floatValue = this.f7492d.g().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.f7493e.g().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.f7490b.g().intValue();
            aVar.setShadowLayer(this.f7494f.g().floatValue(), sin, cos, Color.argb(Math.round(this.f7491c.g().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public final void b(P5.c<Integer> cVar) {
        this.f7490b.m(cVar);
    }

    public final void c(P5.c<Float> cVar) {
        this.f7492d.m(cVar);
    }

    public final void d(P5.c<Float> cVar) {
        this.f7493e.m(cVar);
    }

    public final void e(P5.c<Float> cVar) {
        d dVar = this.f7491c;
        if (cVar == null) {
            dVar.m(null);
        } else {
            dVar.m(new a(cVar));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [E5.a$a, java.lang.Object] */
    @Override // E5.a.InterfaceC0168a
    public final void f() {
        this.f7495g = true;
        this.f7489a.f();
    }

    public final void g(P5.c<Float> cVar) {
        this.f7494f.m(cVar);
    }
}
