package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class va1 implements Closeable {

    /* JADX INFO: renamed from: j */
    public final FileInputStream f8150j;

    /* JADX INFO: renamed from: k */
    public final Charset f8151k;

    /* JADX INFO: renamed from: l */
    public byte[] f8152l;

    /* JADX INFO: renamed from: m */
    public int f8153m;

    /* JADX INFO: renamed from: n */
    public int f8154n;

    public va1(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(bh1.f876a)) {
            C0270h1.m2190f("Unsupported encoding");
            throw null;
        }
        this.f8150j = fileInputStream;
        this.f8151k = charset;
        this.f8152l = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX INFO: renamed from: a */
    public final String m5140a() {
        int i;
        synchronized (this.f8150j) {
            try {
                byte[] bArr = this.f8152l;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f8153m >= this.f8154n) {
                    int i2 = this.f8150j.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.f8153m = 0;
                    this.f8154n = i2;
                }
                for (int i3 = this.f8153m; i3 != this.f8154n; i3++) {
                    byte[] bArr2 = this.f8152l;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f8153m;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                        String str = new String(bArr2, i4, i - i4, this.f8151k.name());
                        this.f8153m = i3 + 1;
                        return str;
                    }
                }
                ua1 ua1Var = new ua1(this, (this.f8154n - this.f8153m) + 80);
                while (true) {
                    byte[] bArr3 = this.f8152l;
                    int i5 = this.f8153m;
                    ua1Var.write(bArr3, i5, this.f8154n - i5);
                    this.f8154n = -1;
                    FileInputStream fileInputStream = this.f8150j;
                    byte[] bArr4 = this.f8152l;
                    int i6 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.f8153m = 0;
                    this.f8154n = i6;
                    for (int i7 = 0; i7 != this.f8154n; i7++) {
                        byte[] bArr5 = this.f8152l;
                        if (bArr5[i7] == 10) {
                            int i8 = this.f8153m;
                            if (i7 != i8) {
                                ua1Var.write(bArr5, i8, i7 - i8);
                            }
                            this.f8153m = i7 + 1;
                            return ua1Var.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f8150j) {
            try {
                if (this.f8152l != null) {
                    this.f8152l = null;
                    this.f8150j.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
