package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: sx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0708sx extends InputStream {

    /* JADX INFO: renamed from: l */
    public static final ArrayDeque f7222l = new ArrayDeque(0);

    /* JADX INFO: renamed from: j */
    public h01 f7223j;

    /* JADX INFO: renamed from: k */
    public IOException f7224k;

    @Override // java.io.InputStream
    public final int available() {
        return this.f7223j.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7223j.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f7223j.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f7223j.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f7223j.read();
        } catch (IOException e) {
            this.f7224k = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f7223j.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f7223j.skip(j);
        } catch (IOException e) {
            this.f7224k = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f7223j.read(bArr);
        } catch (IOException e) {
            this.f7224k = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f7223j.read(bArr, i, i2);
        } catch (IOException e) {
            this.f7224k = e;
            throw e;
        }
    }
}
