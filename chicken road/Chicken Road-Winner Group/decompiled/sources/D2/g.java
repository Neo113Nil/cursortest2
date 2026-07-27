package D2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import w2.I;

/* loaded from: classes.dex */
public abstract class g extends I {

    /* renamed from: c, reason: collision with root package name */
    public b f314c;

    @Override // w2.AbstractC1239s
    public final void c(g2.h hVar, Runnable runnable) {
        b bVar = this.f314c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f300h;
        bVar.b(runnable, k.f324g);
    }
}
