package org.bouncycastle.mime.encoding;

/* loaded from: classes17.dex */
public class QuotedPrintableInputStream extends java.io.FilterInputStream {
    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        while (i3 != i2) {
            int read = read();
            if (read < 0) {
                break;
            }
            bArr[i3 + i] = (byte) read;
            i3++;
        }
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        int i;
        int i2;
        int read = this.in.read();
        if (read == -1) {
            return -1;
        }
        while (read == 61) {
            int read2 = this.in.read();
            if (read2 == -1) {
                throw new java.lang.IllegalStateException("Quoted '=' at end of stream");
            }
            if (read2 == 13) {
                read = this.in.read();
                if (read == 10) {
                }
            } else if (read2 != 10) {
                if (read2 >= 48 && read2 <= 57) {
                    i = read2 - 48;
                } else {
                    if (read2 < 65 || read2 > 70) {
                        throw new java.lang.IllegalStateException("Expecting '0123456789ABCDEF after quote that was not immediately followed by LF or CRLF");
                    }
                    i = read2 - 55;
                }
                int read3 = this.in.read();
                if (read3 >= 48 && read3 <= 57) {
                    i2 = read3 - 48;
                } else {
                    if (read3 < 65 || read3 > 70) {
                        throw new java.lang.IllegalStateException("Expecting second '0123456789ABCDEF after quote that was not immediately followed by LF or CRLF");
                    }
                    i2 = read3 - 55;
                }
                return (i << 4) | i2;
            }
            read = this.in.read();
        }
        return read;
    }

    public QuotedPrintableInputStream(java.io.InputStream inputStream) {
        super(inputStream);
    }
}
