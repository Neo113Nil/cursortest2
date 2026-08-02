package G;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes8.dex */
final class b extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    final OutputStream f9598a;

    /* renamed from: b, reason: collision with root package name */
    private ByteOrder f9599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(OutputStream outputStream) {
        super(outputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f9598a = outputStream;
        this.f9599b = byteOrder;
    }

    public final void c(ByteOrder byteOrder) {
        this.f9599b = byteOrder;
    }

    public final void d(int i11) throws IOException {
        ByteOrder byteOrder = this.f9599b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f9598a;
        if (byteOrder == byteOrder2) {
            outputStream.write(i11 & 255);
            outputStream.write((i11 >>> 8) & 255);
            outputStream.write((i11 >>> 16) & 255);
            outputStream.write((i11 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((i11 >>> 24) & 255);
            outputStream.write((i11 >>> 16) & 255);
            outputStream.write((i11 >>> 8) & 255);
            outputStream.write(i11 & 255);
        }
    }

    public final void j(short s11) throws IOException {
        ByteOrder byteOrder = this.f9599b;
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        OutputStream outputStream = this.f9598a;
        if (byteOrder == byteOrder2) {
            outputStream.write(s11 & 255);
            outputStream.write((s11 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            outputStream.write((s11 >>> 8) & 255);
            outputStream.write(s11 & 255);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f9598a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i11, int i12) throws IOException {
        this.f9598a.write(bArr, i11, i12);
    }
}
