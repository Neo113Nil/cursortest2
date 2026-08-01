package sg.bigo.ads.e;

/* renamed from: sg.bigo.ads.e.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5082f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f12745a;

    public RunnableC5082f(h hVar) {
        this.f12745a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.E1.k kVar;
        h hVar = this.f12745a;
        hVar.getClass();
        try {
            sg.bigo.ads.Y0.g gVar = hVar.z;
            if (gVar != null && (kVar = gVar.e) != null) {
                kVar.destroy();
                gVar.e = null;
            }
        } catch (Throwable unused) {
        }
        this.f12745a.destroyInMainThread();
    }
}
