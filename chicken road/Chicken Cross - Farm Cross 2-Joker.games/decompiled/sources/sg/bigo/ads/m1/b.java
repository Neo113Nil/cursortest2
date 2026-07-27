package sg.bigo.ads.m1;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f13122a;

    public b(c cVar) {
        this.f13122a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f13122a;
        cVar.getClass();
        try {
            cVar.f13123a.finish();
        } catch (Throwable unused) {
        }
    }
}
