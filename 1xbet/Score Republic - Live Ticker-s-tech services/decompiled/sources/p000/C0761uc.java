package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: uc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0761uc extends OutputStream {

    /* JADX INFO: renamed from: j */
    public final FileOutputStream f7788j;

    /* JADX INFO: renamed from: k */
    public byte[] f7789k;

    /* JADX INFO: renamed from: l */
    public final nk0 f7790l;

    /* JADX INFO: renamed from: m */
    public int f7791m;

    public C0761uc(FileOutputStream fileOutputStream, nk0 nk0Var) {
        this.f7788j = fileOutputStream;
        this.f7790l = nk0Var;
        this.f7789k = (byte[]) nk0Var.m3543c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f7788j;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f7789k;
            if (bArr != null) {
                this.f7790l.m3547g(bArr);
                this.f7789k = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f7791m;
        FileOutputStream fileOutputStream = this.f7788j;
        if (i > 0) {
            fileOutputStream.write(this.f7789k, 0, i);
            this.f7791m = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f7791m;
            FileOutputStream fileOutputStream = this.f7788j;
            if (i6 == 0 && i4 >= this.f7789k.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f7789k.length - i6);
            System.arraycopy(bArr, i5, this.f7789k, this.f7791m, iMin);
            int i7 = this.f7791m + iMin;
            this.f7791m = i7;
            i3 += iMin;
            byte[] bArr2 = this.f7789k;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.f7791m = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f7789k;
        int i2 = this.f7791m;
        int i3 = i2 + 1;
        this.f7791m = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.f7788j.write(bArr, 0, i3);
        this.f7791m = 0;
    }
}
