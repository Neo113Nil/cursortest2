package sg.bigo.ads.h1;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12957a;

    public b(f fVar) {
        this.f12957a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (sg.bigo.ads.I0.g.c(this.f12957a.f)) {
            this.f12957a.a();
            return;
        }
        f fVar = this.f12957a;
        fVar.b = null;
        fVar.b();
    }
}
