package codec.binary;

/* loaded from: classes7.dex */
public class BaseNCodecOutputStream extends java.io.FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2765a;
    public final codec.binary.BaseNCodec b;
    public final byte[] c;
    public final codec.binary.a d;

    public BaseNCodecOutputStream(java.io.OutputStream outputStream, codec.binary.BaseNCodec baseNCodec, boolean z) {
        super(outputStream);
        this.c = new byte[1];
        this.d = new codec.binary.a();
        this.b = baseNCodec;
        this.f2765a = z;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        eof();
        flush();
        ((java.io.FilterOutputStream) this).out.close();
    }

    public void eof() throws java.io.IOException {
        if (this.f2765a) {
            this.b.b(this.c, 0, -1, this.d);
        } else {
            this.b.a(this.c, 0, -1, this.d);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
        byte[] bArr;
        int c;
        codec.binary.a aVar = this.d;
        int i = aVar.c != null ? aVar.d - aVar.e : 0;
        if (i > 0 && (c = codec.binary.BaseNCodec.c((bArr = new byte[i]), 0, i, this.d)) > 0) {
            ((java.io.FilterOutputStream) this).out.write(bArr, 0, c);
        }
        ((java.io.FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        byte[] bArr = this.c;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        byte[] bArr2;
        int c;
        if (i >= 0 && i2 >= 0) {
            if (i > bArr.length || i + i2 > bArr.length) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            if (i2 > 0) {
                if (this.f2765a) {
                    this.b.b(bArr, i, i2, this.d);
                } else {
                    this.b.a(bArr, i, i2, this.d);
                }
                codec.binary.a aVar = this.d;
                int i3 = aVar.c != null ? aVar.d - aVar.e : 0;
                if (i3 <= 0 || (c = codec.binary.BaseNCodec.c((bArr2 = new byte[i3]), 0, i3, this.d)) <= 0) {
                    return;
                }
                ((java.io.FilterOutputStream) this).out.write(bArr2, 0, c);
                return;
            }
            return;
        }
        throw new java.lang.IndexOutOfBoundsException();
    }
}
