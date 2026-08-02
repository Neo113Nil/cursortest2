package org.bouncycastle.util.encoders;

/* loaded from: classes17.dex */
public class BufferedEncoder {
    protected byte[] buf;
    protected int bufOff;
    protected org.bouncycastle.util.encoders.Translator translator;

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Can't have a negative input length!");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i4 = this.bufOff;
        int i5 = length - i4;
        int i6 = 0;
        if (i2 > i5) {
            java.lang.System.arraycopy(bArr, i, bArr3, i4, i5);
            org.bouncycastle.util.encoders.Translator translator = this.translator;
            byte[] bArr4 = this.buf;
            int encode = translator.encode(bArr4, 0, bArr4.length, bArr2, i3);
            this.bufOff = 0;
            int i7 = i2 - i5;
            int i8 = i + i5;
            int length2 = i7 - (i7 % this.buf.length);
            i6 = encode + this.translator.encode(bArr, i8, length2, bArr2, i3 + encode);
            i2 = i7 - length2;
            i = i8 + length2;
        }
        if (i2 != 0) {
            java.lang.System.arraycopy(bArr, i, this.buf, this.bufOff, i2);
            this.bufOff += i2;
        }
        return i6;
    }

    public int processByte(byte b, byte[] bArr, int i) {
        byte[] bArr2 = this.buf;
        int i2 = this.bufOff;
        int i3 = i2 + 1;
        this.bufOff = i3;
        bArr2[i2] = b;
        if (i3 != bArr2.length) {
            return 0;
        }
        int encode = this.translator.encode(bArr2, 0, bArr2.length, bArr, i);
        this.bufOff = 0;
        return encode;
    }

    public BufferedEncoder(org.bouncycastle.util.encoders.Translator translator, int i) {
        this.translator = translator;
        if (i % translator.getEncodedBlockSize() != 0) {
            throw new java.lang.IllegalArgumentException("buffer size not multiple of input block size");
        }
        this.buf = new byte[i];
        this.bufOff = 0;
    }
}
