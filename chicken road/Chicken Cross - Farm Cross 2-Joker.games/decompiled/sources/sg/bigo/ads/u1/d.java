package sg.bigo.ads.u1;

/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f13336a;

    public d(f fVar) {
        this.f13336a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f13336a;
        fVar.b.c.a(fVar.f13338a, false);
        this.f13336a.b.b();
    }
}
