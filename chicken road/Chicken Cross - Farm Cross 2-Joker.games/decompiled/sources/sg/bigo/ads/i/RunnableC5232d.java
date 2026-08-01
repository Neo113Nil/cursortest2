package sg.bigo.ads.i;

import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.i.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5232d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5236h f12979a;

    public RunnableC5232d(C5236h c5236h) {
        this.f12979a = c5236h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5236h c5236h = this.f12979a;
        if (c5236h.i || c5236h.j) {
            return;
        }
        AbstractC5446j.b(new RunnableC5235g(c5236h));
    }
}
