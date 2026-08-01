package sg.bigo.ads.z0;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5503c;
import sg.bigo.ads.x0.C5508h;

/* renamed from: sg.bigo.ads.z0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5526a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f13427a;
    public final /* synthetic */ sg.bigo.ads.B0.c b;
    public final /* synthetic */ AtomicReference c;
    public final /* synthetic */ AbstractC5503c d;

    public RunnableC5526a(AtomicBoolean atomicBoolean, sg.bigo.ads.B0.c cVar, AtomicReference atomicReference, AbstractC5503c abstractC5503c) {
        this.f13427a = atomicBoolean;
        this.b = cVar;
        this.c = atomicReference;
        this.d = abstractC5503c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13427a.compareAndSet(false, true)) {
            AbstractC5496a.a("HttpEngineNetClient", "async request timed out: " + this.b.b.a());
            C5531f c5531f = (C5531f) this.c.get();
            if (c5531f != null) {
                c5531f.b.a(new C5508h(701, "async request timed out"));
                c5531f.f13432a.cancel();
            }
            this.d.getClass();
        }
    }
}
