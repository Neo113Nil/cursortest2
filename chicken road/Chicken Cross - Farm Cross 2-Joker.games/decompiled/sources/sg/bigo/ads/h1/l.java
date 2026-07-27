package sg.bigo.ads.h1;

import java.util.List;

/* loaded from: classes3.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f12965a;

    public l(n nVar) {
        this.f12965a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f12965a;
        r rVar = nVar.b.f12969a;
        List list = nVar.f12967a;
        synchronized (rVar) {
            rVar.c.removeAll(list);
            rVar.b.addAll(list);
        }
        this.f12965a.b.c();
        u uVar = this.f12965a.b.f;
        if (uVar != null) {
            uVar.f12972a.e.c();
        }
    }
}
