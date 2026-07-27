package K;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class l0 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f875a;

    public l0(FileOutputStream fileOutputStream) {
        this.f875a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f875a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i3) {
        this.f875a.write(i3);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b3) {
        kotlin.jvm.internal.j.e(b3, "b");
        this.f875a.write(b3);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i3, int i4) {
        kotlin.jvm.internal.j.e(bytes, "bytes");
        this.f875a.write(bytes, i3, i4);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
