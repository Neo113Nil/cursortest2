package sg.bigo.ads.Q0;

import sg.bigo.ads.X0.u;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f12502a;

    public e(n nVar) {
        this.f12502a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (n.a(this.f12502a, new d(this))) {
            return;
        }
        n nVar = this.f12502a;
        n.a(nVar, ((u) nVar.b).e(), false);
    }
}
