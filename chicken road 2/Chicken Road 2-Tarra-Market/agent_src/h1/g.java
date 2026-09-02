package h1;

import b1.D;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public abstract class g extends D {

    /* renamed from: c, reason: collision with root package name */
    public final b f1242c;

    public g(int i2, int i3, long j2, String str) {
        this.f1242c = new b(i2, i3, j2, str);
    }

    @Override // b1.AbstractC0028p
    public final void l(M0.i iVar, Runnable runnable) {
        b bVar = this.f1242c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1227h;
        bVar.b(runnable, k.f1253g, false);
    }
}
