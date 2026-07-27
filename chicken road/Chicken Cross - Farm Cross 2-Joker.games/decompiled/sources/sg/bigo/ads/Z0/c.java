package sg.bigo.ads.Z0;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f12654a;
    public final /* synthetic */ sg.bigo.ads.N.d b;
    public final /* synthetic */ l c;

    public c(l lVar, AtomicBoolean atomicBoolean, sg.bigo.ads.N.d dVar) {
        this.c = lVar;
        this.f12654a = atomicBoolean;
        this.b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12654a.compareAndSet(false, true)) {
            this.c.a(this.b);
        }
    }
}
