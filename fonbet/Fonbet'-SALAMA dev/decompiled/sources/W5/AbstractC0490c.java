package W5;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: W5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0490c implements Closeable {
    public final void a(int i7) {
        if (i() < i7) {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean c() {
        return this instanceof C0548v1;
    }

    public abstract AbstractC0490c d(int i7);

    public abstract void e(OutputStream outputStream, int i7);

    public abstract void f(ByteBuffer byteBuffer);

    public abstract void g(byte[] bArr, int i7, int i8);

    public abstract int h();

    public abstract int i();

    public abstract void j(int i7);

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public void b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
