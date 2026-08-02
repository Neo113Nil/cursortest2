package X5;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Z5.h f7481a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f7482b;

    public b(c cVar, Z5.h hVar) {
        this.f7482b = cVar;
        this.f7481a = hVar;
    }

    public final void a(B.v vVar) {
        this.f7482b.f7485C++;
        Z5.h hVar = this.f7481a;
        synchronized (hVar) {
            if (hVar.f7916e) {
                throw new IOException("closed");
            }
            int i7 = hVar.f7915d;
            if ((vVar.f965b & 32) != 0) {
                i7 = ((int[]) vVar.f966c)[5];
            }
            hVar.f7915d = i7;
            hVar.a(0, 0, (byte) 4, (byte) 1);
            hVar.f7912a.flush();
        }
    }

    public final void b() {
        Z5.h hVar = this.f7481a;
        synchronized (hVar) {
            try {
                if (hVar.f7916e) {
                    throw new IOException("closed");
                }
                Logger logger = Z5.i.f7917a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(">> CONNECTION " + Z5.i.f7918b.c());
                }
                hVar.f7912a.b(Z5.i.f7918b.t());
                hVar.f7912a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Z5.a aVar, byte[] bArr) {
        Z5.h hVar = this.f7481a;
        synchronized (hVar) {
            try {
                if (hVar.f7916e) {
                    throw new IOException("closed");
                }
                if (aVar.f7880a == -1) {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                hVar.a(0, bArr.length + 8, (byte) 7, (byte) 0);
                hVar.f7912a.d(0);
                hVar.f7912a.d(aVar.f7880a);
                if (bArr.length > 0) {
                    hVar.f7912a.b(bArr);
                }
                hVar.f7912a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7481a.close();
    }

    public final void d(int i7, int i8, boolean z4) {
        if (z4) {
            this.f7482b.f7485C++;
        }
        Z5.h hVar = this.f7481a;
        synchronized (hVar) {
            if (hVar.f7916e) {
                throw new IOException("closed");
            }
            hVar.a(0, 8, (byte) 6, z4 ? (byte) 1 : (byte) 0);
            hVar.f7912a.d(i7);
            hVar.f7912a.d(i8);
            hVar.f7912a.flush();
        }
    }

    public final void e(int i7, Z5.a aVar) {
        this.f7482b.f7485C++;
        Z5.h hVar = this.f7481a;
        synchronized (hVar) {
            if (hVar.f7916e) {
                throw new IOException("closed");
            }
            if (aVar.f7880a == -1) {
                throw new IllegalArgumentException();
            }
            hVar.a(i7, 4, (byte) 3, (byte) 0);
            hVar.f7912a.d(aVar.f7880a);
            hVar.f7912a.flush();
        }
    }

    public final void f(B.v vVar) {
        Z5.h hVar = this.f7481a;
        synchronized (hVar) {
            try {
                if (hVar.f7916e) {
                    throw new IOException("closed");
                }
                int i7 = 0;
                hVar.a(0, Integer.bitCount(vVar.f965b) * 6, (byte) 4, (byte) 0);
                while (i7 < 10) {
                    if (vVar.k(i7)) {
                        int i8 = i7 == 4 ? 3 : i7 == 7 ? 4 : i7;
                        N6.h hVar2 = hVar.f7912a;
                        if (hVar2.f4805c) {
                            throw new IllegalStateException("closed");
                        }
                        N6.d dVar = hVar2.f4804b;
                        N6.j j = dVar.j(2);
                        int i9 = j.f4811c;
                        byte[] bArr = j.f4809a;
                        bArr[i9] = (byte) ((i8 >>> 8) & 255);
                        bArr[i9 + 1] = (byte) (i8 & 255);
                        j.f4811c = i9 + 2;
                        dVar.f4797b += 2;
                        hVar2.a();
                        hVar.f7912a.d(((int[]) vVar.f966c)[i7]);
                    }
                    i7++;
                }
                hVar.f7912a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flush() {
        Z5.h hVar = this.f7481a;
        synchronized (hVar) {
            if (hVar.f7916e) {
                throw new IOException("closed");
            }
            hVar.f7912a.flush();
        }
    }

    public final void g(int i7, long j) {
        Z5.h hVar = this.f7481a;
        synchronized (hVar) {
            if (hVar.f7916e) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j);
            }
            hVar.a(i7, 4, (byte) 8, (byte) 0);
            hVar.f7912a.d((int) j);
            hVar.f7912a.flush();
        }
    }
}
