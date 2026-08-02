package L4;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: L4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220c implements G, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3075k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f3076l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f3077m;

    public /* synthetic */ C0220c(int i, Object obj, Object obj2) {
        this.f3075k = i;
        this.f3076l = obj;
        this.f3077m = obj2;
    }

    @Override // L4.G
    public final void D(C0226i c0226i, long j5) {
        switch (this.f3075k) {
            case 0:
                kotlin.jvm.internal.l.f("source", c0226i);
                G4.l.o(c0226i.f3091l, 0L, j5);
                long j6 = j5;
                while (true) {
                    long j7 = 0;
                    if (j6 <= 0) {
                        return;
                    }
                    D d5 = c0226i.f3090k;
                    kotlin.jvm.internal.l.c(d5);
                    while (true) {
                        if (j7 < 65536) {
                            j7 += d5.f3055c - d5.f3054b;
                            if (j7 >= j6) {
                                j7 = j6;
                            } else {
                                d5 = d5.f;
                                kotlin.jvm.internal.l.c(d5);
                            }
                        }
                    }
                    C0220c c0220c = (C0220c) this.f3077m;
                    H h3 = (H) this.f3076l;
                    h3.h();
                    try {
                        try {
                            c0220c.D(c0226i, j7);
                            if (h3.i()) {
                                throw h3.k(null);
                            }
                            j6 -= j7;
                        } catch (IOException e3) {
                            if (!h3.i()) {
                                throw e3;
                            }
                            throw h3.k(e3);
                        }
                    } catch (Throwable th) {
                        h3.i();
                        throw th;
                    }
                }
            default:
                kotlin.jvm.internal.l.f("source", c0226i);
                G4.l.o(c0226i.f3091l, 0L, j5);
                while (j5 > 0) {
                    ((K) this.f3077m).f();
                    D d6 = c0226i.f3090k;
                    kotlin.jvm.internal.l.c(d6);
                    int min = (int) Math.min(j5, d6.f3055c - d6.f3054b);
                    ((OutputStream) this.f3076l).write(d6.f3053a, d6.f3054b, min);
                    int i = d6.f3054b + min;
                    d6.f3054b = i;
                    long j8 = min;
                    j5 -= j8;
                    c0226i.f3091l -= j8;
                    if (i == d6.f3055c) {
                        c0226i.f3090k = d6.a();
                        E.a(d6);
                    }
                }
                return;
        }
    }

    @Override // L4.G
    public final K c() {
        switch (this.f3075k) {
            case 0:
                return (H) this.f3076l;
            default:
                return (K) this.f3077m;
        }
    }

    @Override // L4.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3075k) {
            case 0:
                C0220c c0220c = (C0220c) this.f3077m;
                H h3 = (H) this.f3076l;
                h3.h();
                try {
                    c0220c.close();
                    if (h3.i()) {
                        throw h3.k(null);
                    }
                    return;
                } catch (IOException e3) {
                    if (!h3.i()) {
                        throw e3;
                    }
                    throw h3.k(e3);
                } finally {
                    h3.i();
                }
            default:
                ((OutputStream) this.f3076l).close();
                return;
        }
    }

    @Override // L4.G, java.io.Flushable
    public final void flush() {
        switch (this.f3075k) {
            case 0:
                C0220c c0220c = (C0220c) this.f3077m;
                H h3 = (H) this.f3076l;
                h3.h();
                try {
                    c0220c.flush();
                    if (h3.i()) {
                        throw h3.k(null);
                    }
                    return;
                } catch (IOException e3) {
                    if (!h3.i()) {
                        throw e3;
                    }
                    throw h3.k(e3);
                } finally {
                    h3.i();
                }
            default:
                ((OutputStream) this.f3076l).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f3075k) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0220c) this.f3077m) + ')';
            default:
                return "sink(" + ((OutputStream) this.f3076l) + ')';
        }
    }
}
