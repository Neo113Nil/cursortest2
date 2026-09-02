package s0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import m0.E;

/* loaded from: classes.dex */
public abstract class g extends E {

    /* renamed from: d, reason: collision with root package name */
    public b f1232d;

    @Override // m0.AbstractC0059p
    public final void f(Y.i iVar, Runnable runnable) {
        b bVar = this.f1232d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1217i;
        bVar.b(runnable, j.f1242g);
    }
}
