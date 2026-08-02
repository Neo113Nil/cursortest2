package Q5;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final FileInputStream f22997a;

    /* renamed from: b, reason: collision with root package name */
    private final Charset f22998b;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f22999c;

    /* renamed from: d, reason: collision with root package name */
    private int f23000d;

    /* renamed from: e, reason: collision with root package name */
    private int f23001e;

    final class a extends ByteArrayOutputStream {
        a(int i11) {
            super(i11);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i11 = ((ByteArrayOutputStream) this).count;
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (((ByteArrayOutputStream) this).buf[i12] == 13) {
                    i11 = i12;
                }
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i11, b.this.f22998b.name());
            } catch (UnsupportedEncodingException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public b(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(c.f23003a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f22997a = fileInputStream;
        this.f22998b = charset;
        this.f22999c = new byte[8192];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f22997a) {
            try {
                if (this.f22999c != null) {
                    this.f22999c = null;
                    this.f22997a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean d() {
        return this.f23001e == -1;
    }

    public final String j() throws IOException {
        int i11;
        synchronized (this.f22997a) {
            try {
                byte[] bArr = this.f22999c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f23000d >= this.f23001e) {
                    int read = this.f22997a.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f23000d = 0;
                    this.f23001e = read;
                }
                for (int i12 = this.f23000d; i12 != this.f23001e; i12++) {
                    byte[] bArr2 = this.f22999c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f23000d;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.f22998b.name());
                                this.f23000d = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.f22998b.name());
                        this.f23000d = i12 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f23001e - this.f23000d) + 80);
                while (true) {
                    byte[] bArr3 = this.f22999c;
                    int i14 = this.f23000d;
                    aVar.write(bArr3, i14, this.f23001e - i14);
                    this.f23001e = -1;
                    byte[] bArr4 = this.f22999c;
                    int read2 = this.f22997a.read(bArr4, 0, bArr4.length);
                    if (read2 == -1) {
                        throw new EOFException();
                    }
                    this.f23000d = 0;
                    this.f23001e = read2;
                    for (int i15 = 0; i15 != this.f23001e; i15++) {
                        byte[] bArr5 = this.f22999c;
                        if (bArr5[i15] == 10) {
                            int i16 = this.f23000d;
                            if (i15 != i16) {
                                aVar.write(bArr5, i16, i15 - i16);
                            }
                            this.f23000d = i15 + 1;
                            return aVar.toString();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
