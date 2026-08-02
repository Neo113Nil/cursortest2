package q5;

import A1.K0;

/* loaded from: classes2.dex */
public final class l implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.k f15910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K0 f15911b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f15912c;

    public l(m mVar, io.flutter.embedding.engine.renderer.k kVar, K0 k02) {
        this.f15912c = mVar;
        this.f15910a = kVar;
        this.f15911b = k02;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        C1563g c1563g;
        this.f15910a.f14106a.removeIsDisplayingFlutterUiListener(this);
        this.f15911b.run();
        m mVar = this.f15912c;
        if ((mVar.f15931d instanceof C1563g) || (c1563g = mVar.f15930c) == null) {
            return;
        }
        c1563g.b();
        C1563g c1563g2 = mVar.f15930c;
        if (c1563g2 != null) {
            c1563g2.f15894a.close();
            mVar.removeView(mVar.f15930c);
            mVar.f15930c = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
    }
}
