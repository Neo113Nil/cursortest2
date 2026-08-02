package org.apache.commons.imaging.formats.pnm;

/* loaded from: classes17.dex */
class PamFileInfo extends org.apache.commons.imaging.formats.pnm.FileInfo {
    private final int bytesPerSample;
    private final int depth;
    private final boolean hasAlpha;
    private final int maxval;
    private final float scale;
    private final org.apache.commons.imaging.formats.pnm.PamFileInfo.TupleReader tupleReader;

    PamFileInfo(int i, int i2, int i3, int i4, java.lang.String str) throws org.apache.commons.imaging.ImageReadException {
        super(i, i2, true);
        this.depth = i3;
        this.maxval = i4;
        if (i4 <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PAM maxVal ");
            sb.append(i4);
            sb.append(" is out of range [1;65535]");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (i4 <= 255) {
            this.scale = 255.0f;
            this.bytesPerSample = 1;
        } else {
            if (i4 > 65535) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("PAM maxVal ");
                sb2.append(i4);
                sb2.append(" is out of range [1;65535]");
                throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
            }
            this.scale = 65535.0f;
            this.bytesPerSample = 2;
        }
        this.hasAlpha = str.endsWith("_ALPHA");
        if ("BLACKANDWHITE".equals(str) || "BLACKANDWHITE_ALPHA".equals(str)) {
            this.tupleReader = new org.apache.commons.imaging.formats.pnm.PamFileInfo.GrayscaleTupleReader(org.apache.commons.imaging.ImageInfo.ColorType.BW);
            return;
        }
        if ("GRAYSCALE".equals(str) || "GRAYSCALE_ALPHA".equals(str)) {
            this.tupleReader = new org.apache.commons.imaging.formats.pnm.PamFileInfo.GrayscaleTupleReader(org.apache.commons.imaging.ImageInfo.ColorType.GRAYSCALE);
            return;
        }
        if ("RGB".equals(str) || "RGB_ALPHA".equals(str)) {
            this.tupleReader = new org.apache.commons.imaging.formats.pnm.PamFileInfo.ColorTupleReader();
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unknown PAM tupletype '");
        sb3.append(str);
        sb3.append("'");
        throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public boolean hasAlpha() {
        return this.hasAlpha;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getNumComponents() {
        return this.depth;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getBitDepth() {
        return this.maxval;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public org.apache.commons.imaging.ImageFormat getImageType() {
        return org.apache.commons.imaging.ImageFormats.PAM;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public java.lang.String getImageTypeDescription() {
        return "PAM: portable arbitrary map file format";
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public java.lang.String getMIMEType() {
        return "image/x-portable-arbitrary-map";
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public org.apache.commons.imaging.ImageInfo.ColorType getColorType() {
        return this.tupleReader.getColorType();
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getRGB(org.apache.commons.imaging.formats.pnm.WhiteSpaceReader whiteSpaceReader) throws java.io.IOException {
        throw new java.lang.UnsupportedOperationException("PAM files are only ever binary");
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getRGB(java.io.InputStream inputStream) throws java.io.IOException {
        return this.tupleReader.getRGB(inputStream);
    }

    abstract class TupleReader {
        public abstract org.apache.commons.imaging.ImageInfo.ColorType getColorType();

        public abstract int getRGB(java.io.InputStream inputStream) throws java.io.IOException;

        private TupleReader() {
        }
    }

    class GrayscaleTupleReader extends org.apache.commons.imaging.formats.pnm.PamFileInfo.TupleReader {
        private final org.apache.commons.imaging.ImageInfo.ColorType colorType;

        GrayscaleTupleReader(org.apache.commons.imaging.ImageInfo.ColorType colorType) {
            super();
            this.colorType = colorType;
        }

        @Override // org.apache.commons.imaging.formats.pnm.PamFileInfo.TupleReader
        public org.apache.commons.imaging.ImageInfo.ColorType getColorType() {
            return this.colorType;
        }

        @Override // org.apache.commons.imaging.formats.pnm.PamFileInfo.TupleReader
        public int getRGB(java.io.InputStream inputStream) throws java.io.IOException {
            int scaleSample = org.apache.commons.imaging.formats.pnm.FileInfo.scaleSample(org.apache.commons.imaging.formats.pnm.FileInfo.readSample(inputStream, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.bytesPerSample), org.apache.commons.imaging.formats.pnm.PamFileInfo.this.scale, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.maxval) & 255;
            return (((org.apache.commons.imaging.formats.pnm.PamFileInfo.this.hasAlpha ? org.apache.commons.imaging.formats.pnm.FileInfo.scaleSample(org.apache.commons.imaging.formats.pnm.FileInfo.readSample(inputStream, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.bytesPerSample), org.apache.commons.imaging.formats.pnm.PamFileInfo.this.scale, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.maxval) : 255) & 255) << 24) | (scaleSample << 16) | (scaleSample << 8) | scaleSample;
        }
    }

    class ColorTupleReader extends org.apache.commons.imaging.formats.pnm.PamFileInfo.TupleReader {
        private ColorTupleReader() {
            super();
        }

        @Override // org.apache.commons.imaging.formats.pnm.PamFileInfo.TupleReader
        public org.apache.commons.imaging.ImageInfo.ColorType getColorType() {
            return org.apache.commons.imaging.ImageInfo.ColorType.RGB;
        }

        @Override // org.apache.commons.imaging.formats.pnm.PamFileInfo.TupleReader
        public int getRGB(java.io.InputStream inputStream) throws java.io.IOException {
            int readSample = org.apache.commons.imaging.formats.pnm.FileInfo.readSample(inputStream, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.bytesPerSample);
            int readSample2 = org.apache.commons.imaging.formats.pnm.FileInfo.readSample(inputStream, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.bytesPerSample);
            int readSample3 = org.apache.commons.imaging.formats.pnm.FileInfo.readSample(inputStream, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.bytesPerSample);
            return (((org.apache.commons.imaging.formats.pnm.PamFileInfo.this.hasAlpha ? org.apache.commons.imaging.formats.pnm.FileInfo.scaleSample(org.apache.commons.imaging.formats.pnm.FileInfo.readSample(inputStream, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.bytesPerSample), org.apache.commons.imaging.formats.pnm.PamFileInfo.this.scale, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.maxval) : 255) & 255) << 24) | ((org.apache.commons.imaging.formats.pnm.FileInfo.scaleSample(readSample, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.scale, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.maxval) & 255) << 16) | ((org.apache.commons.imaging.formats.pnm.FileInfo.scaleSample(readSample2, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.scale, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.maxval) & 255) << 8) | (org.apache.commons.imaging.formats.pnm.FileInfo.scaleSample(readSample3, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.scale, org.apache.commons.imaging.formats.pnm.PamFileInfo.this.maxval) & 255);
        }
    }
}
