package sg.bigo.ads.h1;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f12958a;

    public c(e eVar) {
        this.f12958a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f12958a;
        eVar.b.c.a(eVar.f12960a, false);
        this.f12958a.b.b();
    }
}
