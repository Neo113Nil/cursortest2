package Z4;

import T4.o;
import T4.q;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: e, reason: collision with root package name */
    public long f3802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f3803f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, q url, long j2) {
        super(gVar, url);
        i.e(url, "url");
        this.f3803f = gVar;
        this.f3802e = j2;
        if (j2 == 0) {
            a(o.f2913b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3794c) {
            return;
        }
        if (this.f3802e != 0 && !U4.e.d(this, TimeUnit.MILLISECONDS)) {
            this.f3803f.f3810b.h();
            a(g.f3808f);
        }
        this.f3794c = true;
    }

    @Override // Z4.a, j5.w
    public final long s(j5.f sink, long j2) {
        i.e(sink, "sink");
        if (this.f3794c) {
            throw new IllegalStateException("closed");
        }
        long j6 = this.f3802e;
        if (j6 == 0) {
            return -1L;
        }
        long s2 = super.s(sink, Math.min(j6, 8192L));
        if (s2 == -1) {
            this.f3803f.f3810b.h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(g.f3808f);
            throw protocolException;
        }
        long j7 = this.f3802e - s2;
        this.f3802e = j7;
        if (j7 == 0) {
            a(o.f2913b);
        }
        return s2;
    }
}
