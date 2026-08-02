package L6;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class e extends FilterInputStream implements d {

    /* renamed from: a, reason: collision with root package name */
    private int f16578a;

    public e(InputStream inputStream) {
        super(inputStream);
        try {
            inputStream.reset();
        } catch (IOException unused) {
        }
    }

    @Override // L6.d
    public final InputStream c() throws IOException {
        return this;
    }

    @Override // L6.d
    public final byte peek() throws IOException {
        byte read = (byte) read();
        this.f16578a++;
        return read;
    }

    @Override // L6.d
    public final int position() {
        return this.f16578a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, L6.d
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int read = super.read(bArr, i11, i12);
        this.f16578a = Math.max(0, read) + this.f16578a;
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, L6.d
    public final synchronized void reset() throws IOException {
        super.reset();
        this.f16578a = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, L6.d
    public final long skip(long j11) throws IOException {
        long j12 = j11;
        while (j12 > 0) {
            long skip = super.skip(j12);
            if (skip > 0) {
                j12 -= skip;
            } else {
                if (read() == -1) {
                    break;
                }
                j12--;
            }
        }
        long j13 = j11 - j12;
        this.f16578a = (int) (this.f16578a + j13);
        return j13;
    }
}
