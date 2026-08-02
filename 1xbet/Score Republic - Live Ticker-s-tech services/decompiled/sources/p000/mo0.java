package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class mo0 extends OutputStream {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5111j = 1;

    /* JADX INFO: renamed from: k */
    public final Object f5112k;

    public mo0(FileOutputStream fileOutputStream) {
        this.f5112k = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f5111j) {
            case 1:
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        switch (this.f5111j) {
            case 1:
                ((FileOutputStream) this.f5112k).flush();
                break;
            default:
                super.flush();
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        switch (this.f5111j) {
            case 0:
                write(new byte[]{(byte) i}, 0, 1);
                break;
            default:
                ((FileOutputStream) this.f5112k).write(i);
                break;
        }
    }

    public mo0(no0 no0Var) {
        this.f5112k = no0Var;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.f5111j) {
            case 1:
                bArr.getClass();
                ((FileOutputStream) this.f5112k).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f5111j;
        Object obj = this.f5112k;
        switch (i3) {
            case 0:
                ((no0) obj).m3553f(bArr, i, i2);
                break;
            default:
                bArr.getClass();
                ((FileOutputStream) obj).write(bArr, i, i2);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m3415a() {
    }
}
