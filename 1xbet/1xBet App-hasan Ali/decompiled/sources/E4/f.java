package E4;

import C4.m;
import L4.B;
import L4.C0226i;
import L4.G;
import L4.K;
import L4.r;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class f implements G, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final r f1499k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1500l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f1501m;

    public f(m mVar) {
        this.f1501m = mVar;
        this.f1499k = new r(((B) mVar.f912e).f3047k.c());
    }

    @Override // L4.G
    public final void D(C0226i c0226i, long j5) {
        l.f("source", c0226i);
        if (this.f1500l) {
            throw new IllegalStateException("closed");
        }
        z4.b.b(c0226i.f3091l, 0L, j5);
        ((B) this.f1501m.f912e).D(c0226i, j5);
    }

    @Override // L4.G
    public final K c() {
        return this.f1499k;
    }

    @Override // L4.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1500l) {
            return;
        }
        this.f1500l = true;
        m mVar = this.f1501m;
        mVar.getClass();
        r rVar = this.f1499k;
        K k5 = rVar.f3109e;
        rVar.f3109e = K.f3065d;
        k5.a();
        k5.b();
        mVar.f908a = 3;
    }

    @Override // L4.G, java.io.Flushable
    public final void flush() {
        if (this.f1500l) {
            return;
        }
        ((B) this.f1501m.f912e).flush();
    }
}
