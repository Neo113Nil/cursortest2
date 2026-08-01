package sg.bigo.ads.f0;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f12789a;

    public j(k kVar) {
        this.f12789a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.f12789a;
        l lVar = kVar.d;
        lVar.a(kVar.b, lVar.f12790a, kVar.c);
    }
}
