package org.apache.commons.imaging.formats.tiff;

/* loaded from: classes17.dex */
public abstract class TiffImageData {
    public abstract org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader getDataReader(org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory, org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter, int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, java.nio.ByteOrder byteOrder) throws java.io.IOException, org.apache.commons.imaging.ImageReadException;

    public abstract org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[] getImageData();

    public abstract boolean stripsNotTiles();

    public static class Tiles extends org.apache.commons.imaging.formats.tiff.TiffImageData {
        private final int tileLength;
        private final int tileWidth;
        public final org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[] tiles;

        @Override // org.apache.commons.imaging.formats.tiff.TiffImageData
        public boolean stripsNotTiles() {
            return false;
        }

        public Tiles(org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[] dataElementArr, int i, int i2) {
            this.tiles = dataElementArr;
            this.tileWidth = i;
            this.tileLength = i2;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffImageData
        public org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[] getImageData() {
            return this.tiles;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffImageData
        public org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader getDataReader(org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory, org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter, int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, java.nio.ByteOrder byteOrder) throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
            return new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderTiled(tiffDirectory, photometricInterpreter, this.tileWidth, this.tileLength, i, iArr, i2, i3, org.apache.commons.imaging.formats.tiff.TiffImageData.extractSampleFormat(tiffDirectory), i4, i5, i6, byteOrder, this);
        }

        public int getTileWidth() {
            return this.tileWidth;
        }

        public int getTileHeight() {
            return this.tileLength;
        }
    }

    public static class Strips extends org.apache.commons.imaging.formats.tiff.TiffImageData {
        public final int rowsPerStrip;
        private final org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[] strips;

        @Override // org.apache.commons.imaging.formats.tiff.TiffImageData
        public boolean stripsNotTiles() {
            return true;
        }

        public Strips(org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[] dataElementArr, int i) {
            this.strips = dataElementArr;
            this.rowsPerStrip = i;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffImageData
        public org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[] getImageData() {
            return this.strips;
        }

        public org.apache.commons.imaging.formats.tiff.TiffElement.DataElement getImageData(int i) {
            return this.strips[i];
        }

        public int getImageDataLength() {
            return this.strips.length;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffImageData
        public org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader getDataReader(org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory, org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter photometricInterpreter, int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, java.nio.ByteOrder byteOrder) throws java.io.IOException, org.apache.commons.imaging.ImageReadException {
            return new org.apache.commons.imaging.formats.tiff.datareaders.DataReaderStrips(tiffDirectory, photometricInterpreter, i, iArr, i2, i3, org.apache.commons.imaging.formats.tiff.TiffImageData.extractSampleFormat(tiffDirectory), i4, i5, i6, byteOrder, this.rowsPerStrip, this);
        }
    }

    public static class Data extends org.apache.commons.imaging.formats.tiff.TiffElement.DataElement {
        public Data(long j, int i, byte[] bArr) {
            super(j, i, bArr);
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffElement
        public java.lang.String getElementDescription() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tiff image data: ");
            sb.append(getDataLength());
            sb.append(" bytes");
            return sb.toString();
        }
    }

    public static class ByteSourceData extends org.apache.commons.imaging.formats.tiff.TiffImageData.Data {
        org.apache.commons.imaging.common.bytesource.ByteSourceFile byteSourceFile;

        public ByteSourceData(long j, int i, org.apache.commons.imaging.common.bytesource.ByteSourceFile byteSourceFile) {
            super(j, i, new byte[0]);
            this.byteSourceFile = byteSourceFile;
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffImageData.Data, org.apache.commons.imaging.formats.tiff.TiffElement
        public java.lang.String getElementDescription() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tiff image data: ");
            sb.append(getDataLength());
            sb.append(" bytes");
            return sb.toString();
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffElement.DataElement
        public byte[] getData() {
            try {
                return this.byteSourceFile.getBlock(this.offset, this.length);
            } catch (java.io.IOException unused) {
                return new byte[0];
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int extractSampleFormat(org.apache.commons.imaging.formats.tiff.TiffDirectory tiffDirectory) throws org.apache.commons.imaging.ImageReadException {
        short[] fieldValue = tiffDirectory.getFieldValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, false);
        if (fieldValue == null || fieldValue.length <= 0) {
            return 0;
        }
        return fieldValue[0];
    }
}
