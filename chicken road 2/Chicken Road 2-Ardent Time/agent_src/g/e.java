package g;

/* loaded from: classes.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g.f f2922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.k f2923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.j f2924c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z0.h f2925d;

    public e(Z0.h hVar, g.f fVar, g.k kVar, g.j jVar) {
        this.f2925d = hVar;
        this.f2922a = fVar;
        this.f2923b = kVar;
        this.f2924c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g.f fVar = this.f2922a;
        if (fVar != null) {
            Z0.h hVar = this.f2925d;
            ((g.g) hVar.f1903b).f2952z = true;
            fVar.f2927b.c(false);
            ((g.g) hVar.f1903b).f2952z = false;
        }
        g.k kVar = this.f2923b;
        if (kVar.isEnabled() && kVar.hasSubMenu()) {
            this.f2924c.p(kVar, null, 4);
        }
    }
}
