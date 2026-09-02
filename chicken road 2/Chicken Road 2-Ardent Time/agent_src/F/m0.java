package F;

/* loaded from: classes.dex */
public final class m0 extends java.io.OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.FileOutputStream f497a;

    public m0(java.io.FileOutputStream fileOutputStream) {
        this.f497a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f497a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        this.f497a.write(i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b2) {
        kotlin.jvm.internal.i.e(b2, "b");
        this.f497a.write(b2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i2, int i3) {
        kotlin.jvm.internal.i.e(bytes, "bytes");
        this.f497a.write(bytes, i2, i3);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
