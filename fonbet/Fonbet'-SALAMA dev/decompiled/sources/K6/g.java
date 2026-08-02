package K6;

import D6.Y;
import i6.InterfaceC1292i;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes2.dex */
public abstract class g extends Y {

    /* renamed from: c, reason: collision with root package name */
    public b f4162c;

    @Override // D6.A
    public final void d(InterfaceC1292i interfaceC1292i, Runnable runnable) {
        b bVar = this.f4162c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f4149y;
        bVar.c(runnable, j.f4172g, false);
    }
}
