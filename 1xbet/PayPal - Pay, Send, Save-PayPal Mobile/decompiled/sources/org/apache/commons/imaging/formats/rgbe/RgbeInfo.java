package org.apache.commons.imaging.formats.rgbe;

/* loaded from: classes17.dex */
class RgbeInfo implements java.io.Closeable {
    private static final byte[] HEADER = {35, 63, 82, 65, 68, 73, 65, 78, 67, 69};
    private static final java.util.regex.Pattern RESOLUTION_STRING = java.util.regex.Pattern.compile("-Y (\\d+) \\+X (\\d+)");
    private static final byte[] TWO_TWO = {2, 2};
    private final java.io.InputStream in;
    private org.apache.commons.imaging.common.GenericImageMetadata metadata;
    private int width = -1;
    private int height = -1;

    RgbeInfo(org.apache.commons.imaging.common.bytesource.ByteSource byteSource) throws java.io.IOException {
        this.in = byteSource.getInputStream();
    }

    org.apache.commons.imaging.common.ImageMetadata getMetadata() throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        if (this.metadata == null) {
            readMetadata();
        }
        return this.metadata;
    }

    int getWidth() throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        if (-1 == this.width) {
            readDimensions();
        }
        return this.width;
    }

    int getHeight() throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        if (-1 == this.height) {
            readDimensions();
        }
        return this.height;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.in.close();
    }

    private void readDimensions() throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        getMetadata();
        java.lang.String readNextLine = new org.apache.commons.imaging.formats.rgbe.InfoHeaderReader(this.in).readNextLine();
        java.util.regex.Matcher matcher = RESOLUTION_STRING.matcher(readNextLine);
        if (!matcher.matches()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid HDR resolution string. Only \"-Y N +X M\" is supported. Found \"");
            sb.append(readNextLine);
            sb.append("\"");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        this.height = java.lang.Integer.parseInt(matcher.group(1));
        this.width = java.lang.Integer.parseInt(matcher.group(2));
    }

    private void readMetadata() throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.common.BinaryFunctions.readAndVerifyBytes(this.in, HEADER, "Not a valid HDR: Incorrect Header");
        org.apache.commons.imaging.formats.rgbe.InfoHeaderReader infoHeaderReader = new org.apache.commons.imaging.formats.rgbe.InfoHeaderReader(this.in);
        if (infoHeaderReader.readNextLine().length() != 0) {
            throw new org.apache.commons.imaging.ImageReadException("Not a valid HDR: Incorrect Header");
        }
        this.metadata = new org.apache.commons.imaging.common.GenericImageMetadata();
        for (java.lang.String readNextLine = infoHeaderReader.readNextLine(); readNextLine.length() != 0; readNextLine = infoHeaderReader.readNextLine()) {
            int indexOf = readNextLine.indexOf(61);
            if (indexOf > 0) {
                java.lang.String substring = readNextLine.substring(0, indexOf);
                java.lang.String substring2 = readNextLine.substring(indexOf + 1);
                if (org.apache.commons.imaging.ImagingConstants.PARAM_KEY_FORMAT.equals(substring2) && !"32-bit_rle_rgbe".equals(substring2)) {
                    throw new org.apache.commons.imaging.ImageReadException("Only 32-bit_rle_rgbe images are supported, trying to read ".concat(java.lang.String.valueOf(substring2)));
                }
                this.metadata.add(substring, substring2);
            } else {
                this.metadata.add("<command>", readNextLine);
            }
        }
    }

    public float[][] getPixelData() throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        int height = getHeight();
        int width = getWidth();
        if (width >= 32768) {
            throw new org.apache.commons.imaging.ImageReadException("Scan lines must be less than 32768 bytes long");
        }
        byte[] bytes = org.apache.commons.imaging.common.ByteConversions.toBytes((short) width, java.nio.ByteOrder.BIG_ENDIAN);
        byte[] bArr = new byte[width * 4];
        int i = 3;
        float[][] fArr = (float[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Float.TYPE, 3, width * height);
        int i2 = 0;
        while (i2 < height) {
            java.io.InputStream inputStream = this.in;
            byte[] bArr2 = TWO_TWO;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Scan line ");
            sb.append(i2);
            sb.append(" expected to start with 0x2 0x2");
            org.apache.commons.imaging.common.BinaryFunctions.readAndVerifyBytes(inputStream, bArr2, sb.toString());
            java.io.InputStream inputStream2 = this.in;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Scan line ");
            sb2.append(i2);
            sb2.append(" length expected");
            org.apache.commons.imaging.common.BinaryFunctions.readAndVerifyBytes(inputStream2, bytes, sb2.toString());
            decompress(this.in, bArr);
            int i3 = 0;
            while (i3 < i) {
                for (int i4 = 0; i4 < width; i4++) {
                    int i5 = (i2 * width) + i4;
                    if ((bArr[(width * 3) + i4] & 255) == 0) {
                        fArr[i3][i5] = 0.0f;
                    } else {
                        fArr[i3][i5] = ((bArr[(i3 * width) + i4] & 255) + 0.5f) * ((float) java.lang.Math.pow(2.0d, r11 - 136));
                    }
                }
                i3++;
                i = 3;
            }
            i2++;
            i = 3;
        }
        return fArr;
    }

    private static void decompress(java.io.InputStream inputStream, byte[] bArr) throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int read = inputStream.read();
            if (read < 0) {
                throw new org.apache.commons.imaging.ImageReadException("Error decompressing RGBE file");
            }
            if (read > 128) {
                int read2 = inputStream.read();
                int i2 = 0;
                while (i2 < (read & 127)) {
                    bArr[i] = (byte) read2;
                    i2++;
                    i++;
                }
            } else {
                int i3 = 0;
                while (i3 < read) {
                    bArr[i] = (byte) inputStream.read();
                    i3++;
                    i++;
                }
            }
        }
    }
}
