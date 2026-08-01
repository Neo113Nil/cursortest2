package sg.bigo.ads.T0;

import sg.bigo.ads.k0.AbstractC5259a;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f12555a;

    public j(g gVar) {
        this.f12555a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f12555a;
        gVar.h = AbstractC5259a.a(gVar.f12563a);
        this.f12555a.a(0L);
    }
}
