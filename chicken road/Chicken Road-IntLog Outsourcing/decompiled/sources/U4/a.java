package U4;

import T4.B;
import T4.s;
import j5.f;
import j5.h;
import j5.w;
import j5.y;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a extends B implements w {

    /* renamed from: b, reason: collision with root package name */
    public final s f3173b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3174c;

    public a(s sVar, long j2) {
        this.f3173b = sVar;
        this.f3174c = j2;
    }

    @Override // T4.B
    public final long b() {
        return this.f3174c;
    }

    @Override // T4.B
    public final s c() {
        return this.f3173b;
    }

    @Override // j5.w
    public final y d() {
        return y.f10533d;
    }

    @Override // T4.B
    public final h g() {
        return j5.b.b(this);
    }

    @Override // j5.w
    public final long s(f sink, long j2) {
        i.e(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // T4.B, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
