package n1;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: e, reason: collision with root package name */
    public long f6190e;

    @Override // n1.a, s1.s
    public final long c(s1.e eVar, long j2) {
        if (this.f6176b) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f6190e;
        if (j3 == 0) {
            return -1L;
        }
        long c2 = super.c(eVar, Math.min(j3, 8192L));
        if (c2 == -1) {
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false, protocolException);
            throw protocolException;
        }
        long j4 = this.f6190e - c2;
        this.f6190e = j4;
        if (j4 == 0) {
            a(true, null);
        }
        return c2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z2;
        if (this.f6176b) {
            return;
        }
        if (this.f6190e != 0) {
            try {
                z2 = j1.d.o(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                z2 = false;
            }
            if (!z2) {
                a(false, null);
            }
        }
        this.f6176b = true;
    }
}
