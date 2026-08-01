package sg.bigo.ads.D1;

/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f12258a;

    public g(k kVar) {
        this.f12258a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.C1.c cVar = this.f12258a.o;
        if (cVar != null) {
            ((sg.bigo.ads.r1.h) cVar).f13274a.a("AdError", "vpaid prepare timeout", new int[]{-1, -1});
        }
    }
}
