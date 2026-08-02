package org.apache.commons.imaging.formats.pnm;

/* loaded from: classes17.dex */
class PpmFileInfo extends org.apache.commons.imaging.formats.pnm.FileInfo {
    private final int bytesPerSample;
    private final int max;
    private final float scale;

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getNumComponents() {
        return 3;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public boolean hasAlpha() {
        return false;
    }

    PpmFileInfo(int i, int i2, boolean z, int i3) throws org.apache.commons.imaging.ImageReadException {
        super(i, i2, z);
        if (i3 <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PPM maxVal ");
            sb.append(i3);
            sb.append(" is out of range [1;65535]");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (i3 <= 255) {
            this.scale = 255.0f;
            this.bytesPerSample = 1;
        } else {
            if (i3 > 65535) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("PPM maxVal ");
                sb2.append(i3);
                sb2.append(" is out of range [1;65535]");
                throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
            }
            this.scale = 65535.0f;
            this.bytesPerSample = 2;
        }
        this.max = i3;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getBitDepth() {
        return this.max;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public org.apache.commons.imaging.ImageFormat getImageType() {
        return org.apache.commons.imaging.ImageFormats.PPM;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public java.lang.String getImageTypeDescription() {
        return "PPM: portable pixmap file format";
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public java.lang.String getMIMEType() {
        return "image/x-portable-pixmap";
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public org.apache.commons.imaging.ImageInfo.ColorType getColorType() {
        return org.apache.commons.imaging.ImageInfo.ColorType.RGB;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getRGB(java.io.InputStream inputStream) throws java.io.IOException {
        int readSample = readSample(inputStream, this.bytesPerSample);
        int readSample2 = readSample(inputStream, this.bytesPerSample);
        return (scaleSample(readSample(inputStream, this.bytesPerSample), this.scale, this.max) & 255) | ((scaleSample(readSample, this.scale, this.max) & 255) << 16) | (-16777216) | ((scaleSample(readSample2, this.scale, this.max) & 255) << 8);
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getRGB(org.apache.commons.imaging.formats.pnm.WhiteSpaceReader whiteSpaceReader) throws java.io.IOException {
        int parseInt = java.lang.Integer.parseInt(whiteSpaceReader.readtoWhiteSpace());
        int parseInt2 = java.lang.Integer.parseInt(whiteSpaceReader.readtoWhiteSpace());
        return (scaleSample(java.lang.Integer.parseInt(whiteSpaceReader.readtoWhiteSpace()), this.scale, this.max) & 255) | ((scaleSample(parseInt, this.scale, this.max) & 255) << 16) | (-16777216) | ((scaleSample(parseInt2, this.scale, this.max) & 255) << 8);
    }
}
