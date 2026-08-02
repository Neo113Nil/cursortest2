package L4;

import java.io.IOException;
import java.io.InputStream;
import n.AbstractC2107A;

/* renamed from: L4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221d implements I, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3078k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f3079l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f3080m;

    public C0221d(InputStream inputStream, K k5) {
        kotlin.jvm.internal.l.f("input", inputStream);
        this.f3079l = inputStream;
        this.f3080m = k5;
    }

    @Override // L4.I
    public final K c() {
        switch (this.f3078k) {
            case 0:
                return (H) this.f3079l;
            default:
                return (K) this.f3080m;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3078k) {
            case 0:
                C0221d c0221d = (C0221d) this.f3080m;
                H h3 = (H) this.f3079l;
                h3.h();
                try {
                    c0221d.close();
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
                ((InputStream) this.f3079l).close();
                return;
        }
    }

    @Override // L4.I
    public final long e(C0226i c0226i, long j5) {
        switch (this.f3078k) {
            case 0:
                kotlin.jvm.internal.l.f("sink", c0226i);
                C0221d c0221d = (C0221d) this.f3080m;
                H h3 = (H) this.f3079l;
                h3.h();
                try {
                    long e3 = c0221d.e(c0226i, j5);
                    if (h3.i()) {
                        throw h3.k(null);
                    }
                    return e3;
                } catch (IOException e5) {
                    if (h3.i()) {
                        throw h3.k(e5);
                    }
                    throw e5;
                } finally {
                    h3.i();
                }
            default:
                kotlin.jvm.internal.l.f("sink", c0226i);
                if (j5 == 0) {
                    return 0L;
                }
                if (j5 < 0) {
                    throw new IllegalArgumentException(AbstractC2107A.r("byteCount < 0: ", j5).toString());
                }
                try {
                    ((K) this.f3080m).f();
                    D L5 = c0226i.L(1);
                    int read = ((InputStream) this.f3079l).read(L5.f3053a, L5.f3055c, (int) Math.min(j5, 8192 - L5.f3055c));
                    if (read == -1) {
                        if (L5.f3054b == L5.f3055c) {
                            c0226i.f3090k = L5.a();
                            E.a(L5);
                        }
                        return -1L;
                    }
                    L5.f3055c += read;
                    long j6 = read;
                    c0226i.f3091l += j6;
                    return j6;
                } catch (AssertionError e6) {
                    if (N4.b.H(e6)) {
                        throw new IOException(e6);
                    }
                    throw e6;
                }
        }
    }

    public final String toString() {
        switch (this.f3078k) {
            case 0:
                return "AsyncTimeout.source(" + ((C0221d) this.f3080m) + ')';
            default:
                return "source(" + ((InputStream) this.f3079l) + ')';
        }
    }

    public C0221d(H h3, C0221d c0221d) {
        this.f3079l = h3;
        this.f3080m = c0221d;
    }
}
