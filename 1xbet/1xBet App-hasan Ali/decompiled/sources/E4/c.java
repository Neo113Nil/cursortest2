package E4;

import C4.m;
import L4.B;
import L4.C0226i;
import L4.G;
import L4.K;
import L4.r;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c implements G, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final r f1490k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1491l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f1492m;

    public c(m mVar) {
        this.f1492m = mVar;
        this.f1490k = new r(((B) mVar.f912e).f3047k.c());
    }

    @Override // L4.G
    public final void D(C0226i c0226i, long j5) {
        l.f("source", c0226i);
        if (this.f1491l) {
            throw new IllegalStateException("closed");
        }
        if (j5 == 0) {
            return;
        }
        m mVar = this.f1492m;
        B b3 = (B) mVar.f912e;
        if (b3.f3049m) {
            throw new IllegalStateException("closed");
        }
        b3.f3048l.R(j5);
        b3.b();
        B b5 = (B) mVar.f912e;
        b5.x("\r\n");
        b5.D(c0226i, j5);
        b5.x("\r\n");
    }

    @Override // L4.G
    public final K c() {
        return this.f1490k;
    }

    @Override // L4.G, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f1491l) {
            return;
        }
        this.f1491l = true;
        ((B) this.f1492m.f912e).x("0\r\n\r\n");
        m mVar = this.f1492m;
        r rVar = this.f1490k;
        mVar.getClass();
        K k5 = rVar.f3109e;
        rVar.f3109e = K.f3065d;
        k5.a();
        k5.b();
        this.f1492m.f908a = 3;
    }

    @Override // L4.G, java.io.Flushable
    public final synchronized void flush() {
        if (this.f1491l) {
            return;
        }
        ((B) this.f1492m.f912e).flush();
    }
}
