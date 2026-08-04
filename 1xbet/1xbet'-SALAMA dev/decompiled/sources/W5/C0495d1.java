package W5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: W5.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0495d1 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7180a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7181b;

    public C0495d1(FileOutputStream fileOutputStream) {
        this.f7181b = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f7180a) {
            case 1:
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        switch (this.f7180a) {
            case 1:
                ((FileOutputStream) this.f7181b).flush();
                break;
            default:
                super.flush();
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i7) throws IOException {
        switch (this.f7180a) {
            case 0:
                write(new byte[]{(byte) i7}, 0, 1);
                break;
            default:
                ((FileOutputStream) this.f7181b).write(i7);
                break;
        }
    }

    public C0495d1(C0498e1 c0498e1) {
        this.f7181b = c0498e1;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.f7180a) {
            case 1:
                t6.h.e(bArr, "b");
                ((FileOutputStream) this.f7181b).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        switch (this.f7180a) {
            case 0:
                ((C0498e1) this.f7181b).g(bArr, i7, i8);
                break;
            default:
                t6.h.e(bArr, "bytes");
                ((FileOutputStream) this.f7181b).write(bArr, i7, i8);
                break;
        }
    }

    private final void a() {
    }
}
