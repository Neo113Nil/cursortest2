package X5;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import w1.P2;

/* loaded from: classes2.dex */
public final class d implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f7496d = Logger.getLogger(m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final m f7497a;

    /* renamed from: b, reason: collision with root package name */
    public final b f7498b;

    /* renamed from: c, reason: collision with root package name */
    public final P2 f7499c = new P2(Level.FINE);

    public d(m mVar, b bVar) {
        this.f7497a = mVar;
        this.f7498b = bVar;
    }

    public final void a(boolean z4, int i7, N6.d dVar, int i8) {
        dVar.getClass();
        this.f7499c.F(2, i7, dVar, i8, z4);
        try {
            Z5.h hVar = this.f7498b.f7481a;
            synchronized (hVar) {
                if (hVar.f7916e) {
                    throw new IOException("closed");
                }
                hVar.a(i7, i8, (byte) 0, z4 ? (byte) 1 : (byte) 0);
                if (i8 > 0) {
                    hVar.f7912a.m(dVar, i8);
                }
            }
        } catch (IOException e7) {
            this.f7497a.p(e7);
        }
    }

    public final void b(Z5.a aVar, byte[] bArr) {
        b bVar = this.f7498b;
        this.f7499c.G(2, 0, aVar, N6.f.h(bArr));
        try {
            bVar.c(aVar, bArr);
            bVar.flush();
        } catch (IOException e7) {
            this.f7497a.p(e7);
        }
    }

    public final void c(int i7, int i8, boolean z4) {
        P2 p22 = this.f7499c;
        if (z4) {
            long j = (4294967295L & i8) | (i7 << 32);
            if (p22.D()) {
                ((Logger) p22.f17508b).log((Level) p22.f17509c, "OUTBOUND PING: ack=true bytes=" + j);
            }
        } else {
            p22.H(2, (4294967295L & i8) | (i7 << 32));
        }
        try {
            this.f7498b.d(i7, i8, z4);
        } catch (IOException e7) {
            this.f7497a.p(e7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f7498b.close();
        } catch (IOException e7) {
            f7496d.log(e7.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e7);
        }
    }

    public final void d(int i7, Z5.a aVar) {
        this.f7499c.I(2, i7, aVar);
        try {
            this.f7498b.e(i7, aVar);
        } catch (IOException e7) {
            this.f7497a.p(e7);
        }
    }

    public final void e(int i7, long j) {
        this.f7499c.K(2, j, i7);
        try {
            this.f7498b.g(i7, j);
        } catch (IOException e7) {
            this.f7497a.p(e7);
        }
    }

    public final void flush() {
        try {
            this.f7498b.flush();
        } catch (IOException e7) {
            this.f7497a.p(e7);
        }
    }
}
