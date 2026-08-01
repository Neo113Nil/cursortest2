package sg.bigo.ads.i1;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f12994a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public Future c;

    public b(Runnable runnable) {
        this.f12994a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        if (this.b.get() || (runnable = this.f12994a) == null) {
            return;
        }
        this.c = c.a(runnable);
    }
}
