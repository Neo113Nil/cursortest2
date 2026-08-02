package org.apache.commons.imaging.formats.pcx;

/* loaded from: classes17.dex */
class RleReader {
    private int count;
    private final boolean isCompressed;
    private byte sample;

    RleReader(boolean z) {
        this.isCompressed = z;
    }

    void read(java.io.InputStream inputStream, byte[] bArr) throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        int i = 0;
        if (this.isCompressed) {
            int min = java.lang.Math.min(this.count, bArr.length);
            java.util.Arrays.fill(bArr, 0, min, this.sample);
            this.count -= min;
            while (min < bArr.length) {
                byte readByte = org.apache.commons.imaging.common.BinaryFunctions.readByte("RleByte", inputStream, "Error reading image data");
                if ((readByte & com.visa.cbp.getEncExpo.startTransaction) == 192) {
                    this.count = readByte & 63;
                    this.sample = org.apache.commons.imaging.common.BinaryFunctions.readByte("RleValue", inputStream, "Error reading image data");
                } else {
                    this.count = 1;
                    this.sample = readByte;
                }
                int min2 = java.lang.Math.min(this.count, bArr.length - min);
                int i2 = min + min2;
                java.util.Arrays.fill(bArr, min, i2, this.sample);
                this.count -= min2;
                min = i2;
            }
            return;
        }
        while (i < bArr.length) {
            int read = inputStream.read(bArr, i, bArr.length - i);
            if (read < 0) {
                throw new org.apache.commons.imaging.ImageReadException("Premature end of file reading image data");
            }
            i += read;
        }
    }
}
