package sg.bigo.ads.z0;

import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.x0.AbstractC5503c;

/* renamed from: sg.bigo.ads.z0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5527b implements InterfaceC5535j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f13428a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ AbstractC5503c c;
    public final /* synthetic */ C5532g d;

    public C5527b(C5532g c5532g, RunnableC5526a runnableC5526a, AtomicBoolean atomicBoolean, AbstractC5503c abstractC5503c) {
        this.d = c5532g;
        this.f13428a = runnableC5526a;
        this.b = atomicBoolean;
        this.c = abstractC5503c;
    }

    @Override // sg.bigo.ads.z0.InterfaceC5535j
    public final void a() {
        this.d.d.removeCallbacks(this.f13428a);
        if (this.b.compareAndSet(false, true)) {
            this.c.getClass();
        }
    }
}
