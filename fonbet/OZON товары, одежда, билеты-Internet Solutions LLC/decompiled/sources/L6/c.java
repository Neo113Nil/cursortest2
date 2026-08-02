package L6;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    protected d f16577a;

    public c(d dVar) {
        this.f16577a = dVar;
    }

    @Override // L6.d
    public final int available() throws IOException {
        return this.f16577a.available();
    }

    @Override // L6.d
    public final InputStream c() throws IOException {
        reset();
        return this.f16577a.c();
    }

    @Override // L6.d
    public final void close() throws IOException {
        this.f16577a.close();
    }

    @Override // L6.d
    public final byte peek() throws IOException {
        return this.f16577a.peek();
    }

    @Override // L6.d
    public final int position() {
        return this.f16577a.position();
    }

    @Override // L6.d
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        return this.f16577a.read(bArr, i11, i12);
    }

    @Override // L6.d
    public final void reset() throws IOException {
        this.f16577a.reset();
    }

    @Override // L6.d
    public final long skip(long j11) throws IOException {
        return this.f16577a.skip(j11);
    }
}
