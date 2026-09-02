package V1;

/* loaded from: classes.dex */
public final class f extends java.io.InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V1.i f1762b;

    public /* synthetic */ f(V1.i iVar, int i2) {
        this.f1761a = i2;
        this.f1762b = iVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f1761a) {
            case 0:
                return (int) java.lang.Math.min(((V1.g) this.f1762b).f1764b, Integer.MAX_VALUE);
            default:
                V1.q qVar = (V1.q) this.f1762b;
                if (qVar.f1786c) {
                    throw new java.io.IOException("closed");
                }
                return (int) java.lang.Math.min(qVar.f1785b.f1764b, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1761a) {
            case 0:
                break;
            default:
                ((V1.q) this.f1762b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f1761a) {
            case 0:
                V1.g gVar = (V1.g) this.f1762b;
                if (gVar.f1764b > 0) {
                    return gVar.g() & 255;
                }
                return -1;
            default:
                V1.q qVar = (V1.q) this.f1762b;
                if (qVar.f1786c) {
                    throw new java.io.IOException("closed");
                }
                V1.g gVar2 = qVar.f1785b;
                if (gVar2.f1764b == 0 && qVar.f1784a.c(gVar2, 8192L) == -1) {
                    return -1;
                }
                return gVar2.g() & 255;
        }
    }

    public final java.lang.String toString() {
        switch (this.f1761a) {
            case 0:
                return ((V1.g) this.f1762b) + ".inputStream()";
            default:
                return ((V1.q) this.f1762b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i2, int i3) {
        switch (this.f1761a) {
            case 0:
                kotlin.jvm.internal.i.e(sink, "sink");
                return ((V1.g) this.f1762b).read(sink, i2, i3);
            default:
                kotlin.jvm.internal.i.e(sink, "data");
                V1.q qVar = (V1.q) this.f1762b;
                if (!qVar.f1786c) {
                    a.AbstractC0059a.f(sink.length, i2, i3);
                    V1.g gVar = qVar.f1785b;
                    if (gVar.f1764b == 0 && qVar.f1784a.c(gVar, 8192L) == -1) {
                        return -1;
                    }
                    return gVar.read(sink, i2, i3);
                }
                throw new java.io.IOException("closed");
        }
    }

    private final void a() {
    }
}
