package E4;

import C4.k;
import C4.m;
import L4.C0226i;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: n, reason: collision with root package name */
    public long f1497n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f1498o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, long j5) {
        super(mVar);
        this.f1498o = mVar;
        this.f1497n = j5;
        if (j5 == 0) {
            b();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1488l) {
            return;
        }
        if (this.f1497n != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!z4.b.g(this)) {
                ((k) this.f1498o.f910c).l();
                b();
            }
        }
        this.f1488l = true;
    }

    @Override // E4.b, L4.I
    public final long e(C0226i c0226i, long j5) {
        l.f("sink", c0226i);
        if (j5 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.r("byteCount < 0: ", j5).toString());
        }
        if (this.f1488l) {
            throw new IllegalStateException("closed");
        }
        long j6 = this.f1497n;
        if (j6 == 0) {
            return -1L;
        }
        long e3 = super.e(c0226i, Math.min(j6, j5));
        if (e3 == -1) {
            ((k) this.f1498o.f910c).l();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        long j7 = this.f1497n - e3;
        this.f1497n = j7;
        if (j7 == 0) {
            b();
        }
        return e3;
    }
}
