package i1;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1460a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1461b;

    /* renamed from: c, reason: collision with root package name */
    public final s1.g f1462c;

    public /* synthetic */ z(long j2, s1.g gVar, int i2) {
        this.f1460a = i2;
        this.f1461b = j2;
        this.f1462c = gVar;
    }

    public final byte[] a() {
        long b2 = b();
        if (b2 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + b2);
        }
        s1.g g2 = g();
        try {
            byte[] f2 = g2.f();
            j1.d.c(g2);
            if (b2 == -1 || b2 == f2.length) {
                return f2;
            }
            throw new IOException("Content-Length (" + b2 + ") and stream length (" + f2.length + ") disagree");
        } catch (Throwable th) {
            j1.d.c(g2);
            throw th;
        }
    }

    public final long b() {
        switch (this.f1460a) {
        }
        return this.f1461b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j1.d.c(g());
    }

    public final s1.g g() {
        switch (this.f1460a) {
            case 0:
                return (s1.e) this.f1462c;
            default:
                return (s1.n) this.f1462c;
        }
    }
}
