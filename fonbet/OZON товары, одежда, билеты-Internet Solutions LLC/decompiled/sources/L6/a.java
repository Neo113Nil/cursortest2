package L6;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    protected final ByteBuffer f16575a;

    public a(ByteBuffer byteBuffer) {
        this.f16575a = byteBuffer;
        byteBuffer.position(0);
    }

    @Override // L6.d
    public final int available() throws IOException {
        ByteBuffer byteBuffer = this.f16575a;
        return byteBuffer.limit() - byteBuffer.position();
    }

    @Override // L6.d
    public final InputStream c() throws IOException {
        return new ByteArrayInputStream(this.f16575a.array());
    }

    @Override // L6.d
    public final void close() throws IOException {
    }

    @Override // L6.d
    public final byte peek() throws IOException {
        return this.f16575a.get();
    }

    @Override // L6.d
    public final int position() {
        return this.f16575a.position();
    }

    @Override // L6.d
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        this.f16575a.get(bArr, i11, i12);
        return i12;
    }

    @Override // L6.d
    public final void reset() throws IOException {
        this.f16575a.position(0);
    }

    @Override // L6.d
    public final long skip(long j11) throws IOException {
        this.f16575a.position((int) (r0.position() + j11));
        return j11;
    }
}
