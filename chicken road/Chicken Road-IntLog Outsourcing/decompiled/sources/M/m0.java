package M;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class m0 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1732a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1733b;

    public m0(FileOutputStream fileOutputStream) {
        this.f1733b = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f1732a) {
            case 0:
                break;
            default:
                ((j5.p) this.f1733b).close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        switch (this.f1732a) {
            case 0:
                ((FileOutputStream) this.f1733b).flush();
                break;
            default:
                j5.p pVar = (j5.p) this.f1733b;
                if (!pVar.f10517c) {
                    pVar.flush();
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f1732a) {
            case 1:
                return ((j5.p) this.f1733b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] b6) {
        switch (this.f1732a) {
            case 0:
                kotlin.jvm.internal.i.e(b6, "b");
                ((FileOutputStream) this.f1733b).write(b6);
                break;
            default:
                super.write(b6);
                break;
        }
    }

    public m0(j5.p pVar) {
        this.f1733b = pVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        switch (this.f1732a) {
            case 0:
                ((FileOutputStream) this.f1733b).write(i2);
                return;
            default:
                j5.p pVar = (j5.p) this.f1733b;
                if (pVar.f10517c) {
                    throw new IOException("closed");
                }
                pVar.f10516b.J((byte) i2);
                pVar.a();
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i2, int i3) {
        switch (this.f1732a) {
            case 0:
                kotlin.jvm.internal.i.e(bytes, "bytes");
                ((FileOutputStream) this.f1733b).write(bytes, i2, i3);
                return;
            default:
                kotlin.jvm.internal.i.e(bytes, "data");
                j5.p pVar = (j5.p) this.f1733b;
                if (!pVar.f10517c) {
                    pVar.f10516b.H(bytes, i2, i3);
                    pVar.a();
                    return;
                }
                throw new IOException("closed");
        }
    }

    private final void a() {
    }
}
