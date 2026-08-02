package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class BEROctetStringGenerator extends org.bouncycastle.asn1.BERGenerator {

    class BufferedBEROctetStream extends java.io.OutputStream {
        private int getHighSpeedVideoFpsRanges = 0;
        private org.bouncycastle.asn1.DEROutputStream getHighSpeedVideoFpsRangesFor;
        private byte[] getHighSpeedVideoSizes;

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            byte[] bArr2 = this.getHighSpeedVideoSizes;
            int length = bArr2.length;
            int i3 = this.getHighSpeedVideoFpsRanges;
            int i4 = length - i3;
            if (i2 < i4) {
                java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
                this.getHighSpeedVideoFpsRanges += i2;
                return;
            }
            if (i3 > 0) {
                java.lang.System.arraycopy(bArr, i, bArr2, i3, i4);
                org.bouncycastle.asn1.DEROctetString.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, true, this.getHighSpeedVideoSizes, 0, length);
            } else {
                i4 = 0;
            }
            while (true) {
                int i5 = i2 - i4;
                if (i5 < length) {
                    java.lang.System.arraycopy(bArr, i + i4, this.getHighSpeedVideoSizes, 0, i5);
                    this.getHighSpeedVideoFpsRanges = i5;
                    return;
                } else {
                    org.bouncycastle.asn1.DEROctetString.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, true, bArr, i + i4, length);
                    i4 += length;
                }
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            byte[] bArr = this.getHighSpeedVideoSizes;
            int i2 = this.getHighSpeedVideoFpsRanges;
            int i3 = i2 + 1;
            this.getHighSpeedVideoFpsRanges = i3;
            bArr[i2] = (byte) i;
            if (i3 == bArr.length) {
                org.bouncycastle.asn1.DEROctetString.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, true, bArr, 0, bArr.length);
                this.getHighSpeedVideoFpsRanges = 0;
            }
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            int i = this.getHighSpeedVideoFpsRanges;
            if (i != 0) {
                org.bouncycastle.asn1.DEROctetString.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, true, this.getHighSpeedVideoSizes, 0, i);
            }
            org.bouncycastle.asn1.BEROctetStringGenerator.this.writeBEREnd();
        }

        BufferedBEROctetStream(byte[] bArr) {
            this.getHighSpeedVideoSizes = bArr;
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DEROutputStream(org.bouncycastle.asn1.BEROctetStringGenerator.this._out);
        }
    }

    public java.io.OutputStream getOctetOutputStream(byte[] bArr) {
        return new org.bouncycastle.asn1.BEROctetStringGenerator.BufferedBEROctetStream(bArr);
    }

    public java.io.OutputStream getOctetOutputStream() {
        return getOctetOutputStream(new byte[1000]);
    }

    public BEROctetStringGenerator(java.io.OutputStream outputStream, int i, boolean z) throws java.io.IOException {
        super(outputStream, i, z);
        writeBERHeader(36);
    }

    public BEROctetStringGenerator(java.io.OutputStream outputStream) throws java.io.IOException {
        super(outputStream);
        writeBERHeader(36);
    }
}
