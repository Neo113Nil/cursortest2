package sg.bigo.ads.h1;

import sg.bigo.ads.b0.AbstractC5025b;

/* loaded from: classes3.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f12970a;

    public q(r rVar) {
        this.f12970a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVar = this.f12970a;
        rVar.getClass();
        AbstractC5025b.a("tb_event", "ctime < " + (System.currentTimeMillis() - rVar.f12971a.c), null);
        rVar.b.addAll(rVar.f());
    }
}
