package sg.bigo.ads.z0;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import sg.bigo.ads.x0.AbstractC5503c;

/* renamed from: sg.bigo.ads.z0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5529d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.B0.c f13430a;
    public final /* synthetic */ AbstractC5503c b;
    public final /* synthetic */ InterfaceC5535j c;
    public final /* synthetic */ Executor d;
    public final /* synthetic */ AtomicReference e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ C5532g g;

    public RunnableC5529d(C5532g c5532g, sg.bigo.ads.B0.c cVar, AbstractC5503c abstractC5503c, C5527b c5527b, Executor executor, AtomicReference atomicReference, RunnableC5526a runnableC5526a) {
        this.g = c5532g;
        this.f13430a = cVar;
        this.b = abstractC5503c;
        this.c = c5527b;
        this.d = executor;
        this.e = atomicReference;
        this.f = runnableC5526a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5531f a2 = this.g.a(this.f13430a, this.b, this.c, this.d);
        this.e.set(a2);
        if (a2 != null) {
            long j = this.f13430a.d;
            if (j <= 10) {
                j = 15000;
            }
            this.g.d.postDelayed(this.f, j);
        }
    }
}
