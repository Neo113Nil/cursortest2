package org.apache.commons.imaging.formats.pcx;

/* loaded from: classes17.dex */
class RleWriter {
    private final boolean isCompressed;
    private int previousByte = -1;
    private int repeatCount = 0;

    RleWriter(boolean z) {
        this.isCompressed = z;
    }

    void write(org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream, byte[] bArr) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        int i;
        if (this.isCompressed) {
            for (byte b : bArr) {
                int i2 = b & 255;
                int i3 = this.previousByte;
                if (i2 == i3 && (i = this.repeatCount) < 63) {
                    this.repeatCount = i + 1;
                } else {
                    int i4 = this.repeatCount;
                    if (i4 > 0) {
                        if (i4 == 1 && (i3 & 192) != 192) {
                            binaryOutputStream.write(i3);
                        } else {
                            binaryOutputStream.write(i4 | 192);
                            binaryOutputStream.write(this.previousByte);
                        }
                    }
                    this.previousByte = i2;
                    this.repeatCount = 1;
                }
            }
            return;
        }
        binaryOutputStream.write(bArr);
    }

    void flush(org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream) throws java.io.IOException {
        int i = this.repeatCount;
        if (i > 0) {
            if (i == 1) {
                int i2 = this.previousByte;
                if ((i2 & 192) != 192) {
                    binaryOutputStream.write(i2);
                    return;
                }
            }
            binaryOutputStream.write(i | 192);
            binaryOutputStream.write(this.previousByte);
        }
    }
}
