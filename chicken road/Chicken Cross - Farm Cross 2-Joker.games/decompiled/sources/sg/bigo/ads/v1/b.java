package sg.bigo.ads.v1;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f13360a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public Future c;

    public b(sg.bigo.ads.u1.c cVar) {
        this.f13360a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        if (this.b.get() || (runnable = this.f13360a) == null) {
            return;
        }
        this.c = c.f13361a.submit(new a(runnable));
    }
}
