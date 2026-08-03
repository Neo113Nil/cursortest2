package I1;

/* loaded from: classes.dex */
public final class z implements java.io.Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f870a;

    /* renamed from: b, reason: collision with root package name */
    public final long f871b;

    /* renamed from: c, reason: collision with root package name */
    public final V1.i f872c;

    public /* synthetic */ z(long j2, V1.i iVar, int i2) {
        this.f870a = i2;
        this.f871b = j2;
        this.f872c = iVar;
    }

    public final byte[] a() {
        long b2 = b();
        if (b2 > 2147483647L) {
            throw new java.io.IOException(kotlin.jvm.internal.i.h(java.lang.Long.valueOf(b2), "Cannot buffer entire body for content length: "));
        }
        V1.i g2 = g();
        try {
            byte[] f2 = g2.f();
            Q1.d.g(g2, null);
            int length = f2.length;
            if (b2 == -1 || b2 == length) {
                return f2;
            }
            throw new java.io.IOException("Content-Length (" + b2 + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final long b() {
        switch (this.f870a) {
        }
        return this.f871b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        J1.b.d(g());
    }

    public final V1.i g() {
        switch (this.f870a) {
            case 0:
                return (V1.g) this.f872c;
            default:
                return (V1.q) this.f872c;
        }
    }
}
