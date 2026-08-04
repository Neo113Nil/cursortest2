package p121q5;

import A1.K0;
import io.flutter.embedding.engine.renderer.k;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements io.flutter.embedding.engine.renderer.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f15916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K0 f15917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f15918c;

    public l(m mVar, k kVar, K0 k7) {
        this.f15918c = mVar;
        this.f15916a = kVar;
        this.f15917b = k7;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        g gVar;
        this.f15916a.f14112a.removeIsDisplayingFlutterUiListener(this);
        this.f15917b.run();
        m mVar = this.f15918c;
        if ((mVar.f15937d instanceof g) || (gVar = mVar.f15936c) == null) {
            return;
        }
        gVar.b();
        g gVar2 = mVar.f15936c;
        if (gVar2 != null) {
            gVar2.f15900a.close();
            mVar.removeView(mVar.f15936c);
            mVar.f15936c = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
    }
}
