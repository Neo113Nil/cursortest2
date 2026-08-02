package W;

import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class W implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f32988a;

    /* renamed from: b, reason: collision with root package name */
    private final K f32989b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32990c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC4849u f32991d;

    /* renamed from: e, reason: collision with root package name */
    private final G.d f32992e;

    W(@NonNull K k11, long j11, @NonNull AbstractC4849u abstractC4849u, boolean z11) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f32988a = atomicBoolean;
        G.d b11 = G.d.b();
        this.f32992e = b11;
        this.f32989b = k11;
        this.f32990c = j11;
        this.f32991d = abstractC4849u;
        if (z11) {
            atomicBoolean.set(true);
        } else {
            b11.c("stop");
        }
    }

    @NonNull
    final AbstractC4849u c() {
        return this.f32991d;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f32992e.a();
        if (this.f32988a.getAndSet(true)) {
            return;
        }
        this.f32989b.R(this, 0, null);
    }

    final long d() {
        return this.f32990c;
    }

    protected final void finalize() throws Throwable {
        G.d dVar = this.f32992e;
        try {
            dVar.d();
            RuntimeException runtimeException = new RuntimeException("Recording stopped due to being garbage collected.");
            dVar.a();
            if (!this.f32988a.getAndSet(true)) {
                this.f32989b.R(this, 10, runtimeException);
            }
        } finally {
            super.finalize();
        }
    }
}
