package o1;

import P.B;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f6371g = Logger.getLogger(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final s1.m f6372a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6373b;

    /* renamed from: c, reason: collision with root package name */
    public final s1.e f6374c;

    /* renamed from: d, reason: collision with root package name */
    public int f6375d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6376e;

    /* renamed from: f, reason: collision with root package name */
    public final d f6377f;

    public x(s1.m mVar, boolean z2) {
        this.f6372a = mVar;
        this.f6373b = z2;
        s1.e eVar = new s1.e();
        this.f6374c = eVar;
        this.f6377f = new d(eVar);
        this.f6375d = 16384;
    }

    public final synchronized void a(B b2) {
        try {
            if (this.f6376e) {
                throw new IOException("closed");
            }
            int i2 = this.f6375d;
            int i3 = b2.f286a;
            if ((i3 & 32) != 0) {
                i2 = ((int[]) b2.f287b)[5];
            }
            this.f6375d = i2;
            if (((i3 & 2) != 0 ? ((int[]) b2.f287b)[1] : -1) != -1) {
                d dVar = this.f6377f;
                int min = Math.min((i3 & 2) != 0 ? ((int[]) b2.f287b)[1] : -1, 16384);
                int i4 = dVar.f6274d;
                if (i4 != min) {
                    if (min < i4) {
                        dVar.f6272b = Math.min(dVar.f6272b, min);
                    }
                    dVar.f6273c = true;
                    dVar.f6274d = min;
                    int i5 = dVar.f6278h;
                    if (min < i5) {
                        if (min == 0) {
                            Arrays.fill(dVar.f6275e, (Object) null);
                            dVar.f6276f = dVar.f6275e.length - 1;
                            dVar.f6277g = 0;
                            dVar.f6278h = 0;
                        } else {
                            dVar.a(i5 - min);
                        }
                    }
                }
            }
            g(0, 0, (byte) 4, (byte) 1);
            this.f6372a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z2, int i2, s1.e eVar, int i3) {
        if (this.f6376e) {
            throw new IOException("closed");
        }
        g(i2, i3, (byte) 0, z2 ? (byte) 1 : (byte) 0);
        if (i3 > 0) {
            this.f6372a.e(eVar, i3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f6376e = true;
        this.f6372a.close();
    }

    public final synchronized void flush() {
        if (this.f6376e) {
            throw new IOException("closed");
        }
        this.f6372a.flush();
    }

    public final void g(int i2, int i3, byte b2, byte b3) {
        Level level = Level.FINE;
        Logger logger = f6371g;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i2, i3, b2, b3));
        }
        int i4 = this.f6375d;
        if (i3 > i4) {
            f.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
            throw null;
        }
        if ((Integer.MIN_VALUE & i2) != 0) {
            f.b("reserved bit set: %s", Integer.valueOf(i2));
            throw null;
        }
        int i5 = (i3 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        s1.m mVar = this.f6372a;
        mVar.g(i5);
        mVar.g((i3 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        mVar.g(i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        mVar.g(b2 & 255);
        mVar.g(b3 & 255);
        mVar.i(i2 & Integer.MAX_VALUE);
    }

    public final synchronized void i(byte[] bArr, int i2, int i3) {
        try {
            if (this.f6376e) {
                throw new IOException("closed");
            }
            if (C0.g.d(i3) == -1) {
                f.b("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            g(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f6372a.i(i2);
            this.f6372a.i(C0.g.d(i3));
            if (bArr.length > 0) {
                this.f6372a.b(bArr);
            }
            this.f6372a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void j(boolean z2, int i2, ArrayList arrayList) {
        int i3;
        int i4;
        if (this.f6376e) {
            throw new IOException("closed");
        }
        d dVar = this.f6377f;
        if (dVar.f6273c) {
            int i5 = dVar.f6272b;
            if (i5 < dVar.f6274d) {
                dVar.d(i5, 31, 32);
            }
            dVar.f6273c = false;
            dVar.f6272b = Integer.MAX_VALUE;
            dVar.d(dVar.f6274d, 31, 32);
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            b bVar = (b) arrayList.get(i6);
            s1.h k2 = bVar.f6260a.k();
            Integer num = (Integer) e.f6280b.get(k2);
            s1.h hVar = bVar.f6261b;
            if (num != null) {
                int intValue = num.intValue();
                i4 = intValue + 1;
                if (i4 > 1 && i4 < 8) {
                    b[] bVarArr = e.f6279a;
                    if (j1.d.i(bVarArr[intValue].f6261b, hVar)) {
                        i3 = i4;
                    } else if (j1.d.i(bVarArr[i4].f6261b, hVar)) {
                        i4 = intValue + 2;
                        i3 = i4;
                    }
                }
                i3 = i4;
                i4 = -1;
            } else {
                i3 = -1;
                i4 = -1;
            }
            if (i4 == -1) {
                int i7 = dVar.f6276f + 1;
                int length = dVar.f6275e.length;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    if (j1.d.i(dVar.f6275e[i7].f6260a, k2)) {
                        if (j1.d.i(dVar.f6275e[i7].f6261b, hVar)) {
                            i4 = (i7 - dVar.f6276f) + e.f6279a.length;
                            break;
                        } else if (i3 == -1) {
                            i3 = (i7 - dVar.f6276f) + e.f6279a.length;
                        }
                    }
                    i7++;
                }
            }
            if (i4 != -1) {
                dVar.d(i4, 127, 128);
            } else if (i3 == -1) {
                dVar.f6271a.t(64);
                dVar.c(k2);
                dVar.c(hVar);
                dVar.b(bVar);
            } else {
                s1.h hVar2 = b.f6254d;
                k2.getClass();
                if (!k2.h(hVar2, hVar2.f6621a.length) || b.f6259i.equals(k2)) {
                    dVar.d(i3, 63, 64);
                    dVar.c(hVar);
                    dVar.b(bVar);
                } else {
                    dVar.d(i3, 15, 0);
                    dVar.c(hVar);
                }
            }
        }
        s1.e eVar = this.f6374c;
        long j2 = eVar.f6618b;
        int min = (int) Math.min(this.f6375d, j2);
        long j3 = min;
        byte b2 = j2 == j3 ? (byte) 4 : (byte) 0;
        if (z2) {
            b2 = (byte) (b2 | 1);
        }
        g(i2, min, (byte) 1, b2);
        s1.m mVar = this.f6372a;
        mVar.e(eVar, j3);
        if (j2 > j3) {
            long j4 = j2 - j3;
            while (j4 > 0) {
                int min2 = (int) Math.min(this.f6375d, j4);
                long j5 = min2;
                j4 -= j5;
                g(i2, min2, (byte) 9, j4 == 0 ? (byte) 4 : (byte) 0);
                mVar.e(eVar, j5);
            }
        }
    }

    public final synchronized void k(boolean z2, int i2, int i3) {
        if (this.f6376e) {
            throw new IOException("closed");
        }
        g(0, 8, (byte) 6, z2 ? (byte) 1 : (byte) 0);
        this.f6372a.i(i2);
        this.f6372a.i(i3);
        this.f6372a.flush();
    }

    public final synchronized void l(int i2, int i3) {
        if (this.f6376e) {
            throw new IOException("closed");
        }
        if (C0.g.d(i3) == -1) {
            throw new IllegalArgumentException();
        }
        g(i2, 4, (byte) 3, (byte) 0);
        this.f6372a.i(C0.g.d(i3));
        this.f6372a.flush();
    }

    public final synchronized void m(int i2, long j2) {
        if (this.f6376e) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            f.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
            throw null;
        }
        g(i2, 4, (byte) 8, (byte) 0);
        this.f6372a.i((int) j2);
        this.f6372a.flush();
    }
}
