package K6;

import D6.Y;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f4162c;

    @Override // D6.A
    public final void d(p065i6.i iVar, Runnable runnable) {
        b bVar = this.f4162c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f4149y;
        bVar.c(runnable, j.f4172g, false);
    }
}
