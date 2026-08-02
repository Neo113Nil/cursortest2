package org.apache.commons.imaging.formats.pnm;

/* loaded from: classes17.dex */
class PbmFileInfo extends org.apache.commons.imaging.formats.pnm.FileInfo {
    private int bitcache;
    private int bitsInCache;

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getBitDepth() {
        return 1;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getNumComponents() {
        return 1;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public boolean hasAlpha() {
        return false;
    }

    PbmFileInfo(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public org.apache.commons.imaging.ImageFormat getImageType() {
        return org.apache.commons.imaging.ImageFormats.PBM;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public org.apache.commons.imaging.ImageInfo.ColorType getColorType() {
        return org.apache.commons.imaging.ImageInfo.ColorType.BW;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public java.lang.String getImageTypeDescription() {
        return "PBM: portable bitmap fileformat";
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public java.lang.String getMIMEType() {
        return "image/x-portable-bitmap";
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    protected void newline() {
        this.bitcache = 0;
        this.bitsInCache = 0;
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getRGB(java.io.InputStream inputStream) throws java.io.IOException {
        if (this.bitsInCache <= 0) {
            int read = inputStream.read();
            if (read < 0) {
                throw new java.io.IOException("PBM: Unexpected EOF");
            }
            this.bitcache = read & 255;
            this.bitsInCache += 8;
        }
        int i = this.bitcache;
        int i2 = (i >> 7) & 1;
        this.bitcache = i << 1;
        this.bitsInCache--;
        if (i2 == 0) {
            return -1;
        }
        if (i2 == 1) {
            return -16777216;
        }
        throw new java.io.IOException("PBM: bad bit: ".concat(java.lang.String.valueOf(i2)));
    }

    @Override // org.apache.commons.imaging.formats.pnm.FileInfo
    public int getRGB(org.apache.commons.imaging.formats.pnm.WhiteSpaceReader whiteSpaceReader) throws java.io.IOException {
        int parseInt = java.lang.Integer.parseInt(whiteSpaceReader.readtoWhiteSpace());
        if (parseInt == 0) {
            return -16777216;
        }
        if (parseInt == 1) {
            return -1;
        }
        throw new java.io.IOException("PBM: bad bit: ".concat(java.lang.String.valueOf(parseInt)));
    }
}
