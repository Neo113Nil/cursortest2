package sg.bigo.ads.z0;

import sg.bigo.ads.x0.AbstractC5503c;

/* renamed from: sg.bigo.ads.z0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5528c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5503c f13429a;
    public final /* synthetic */ sg.bigo.ads.B0.c b;

    public RunnableC5528c(sg.bigo.ads.B0.c cVar, AbstractC5503c abstractC5503c) {
        this.f13429a = abstractC5503c;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13429a.a(this.b);
    }
}
