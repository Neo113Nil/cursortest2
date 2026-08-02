package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
final class v extends f {

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f38460d;

    v(p pVar) {
        super(pVar);
        this.f38460d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.f, java.lang.AutoCloseable
    public final void close() {
        if (this.f38460d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
