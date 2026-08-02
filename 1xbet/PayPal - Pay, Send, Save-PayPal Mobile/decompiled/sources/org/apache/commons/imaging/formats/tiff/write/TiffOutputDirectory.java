package org.apache.commons.imaging.formats.tiff.write;

/* loaded from: classes17.dex */
public final class TiffOutputDirectory extends org.apache.commons.imaging.formats.tiff.write.TiffOutputItem {
    public static final java.util.Comparator<org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory> COMPARATOR = new java.util.Comparator() { // from class: org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory.lambda$static$0((org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory) obj, (org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory) obj2);
        }
    };
    private final java.nio.ByteOrder byteOrder;
    private final java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputField> fields = new java.util.ArrayList();
    private org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData;
    private org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory nextDirectory;
    private org.apache.commons.imaging.formats.tiff.TiffImageData tiffImageData;
    public final int type;

    static /* synthetic */ int lambda$static$0(org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory, org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory2) {
        int i = tiffOutputDirectory.type;
        int i2 = tiffOutputDirectory2.type;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public final void setNextDirectory(org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory) {
        this.nextDirectory = tiffOutputDirectory;
    }

    public TiffOutputDirectory(int i, java.nio.ByteOrder byteOrder) {
        this.type = i;
        this.byteOrder = byteOrder;
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte, byte b) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoByte.length != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoByte.length);
            sb.append(" value(s), not 1");
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        byte[] encodeValue = tagInfoByte.encodeValue(this.byteOrder, b);
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoByte.tag, tagInfoByte, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.BYTE, encodeValue.length, encodeValue));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes, byte... bArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoBytes.length > 0 && tagInfoBytes.length != bArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoBytes.length);
            sb.append(" value(s), not ");
            sb.append(bArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoBytes.tag, tagInfoBytes, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.BYTE, bArr.length, tagInfoBytes.encodeValue(this.byteOrder, bArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii, java.lang.String... strArr) throws org.apache.commons.imaging.ImageWriteException {
        byte[] encodeValue = tagInfoAscii.encodeValue(this.byteOrder, strArr);
        if (tagInfoAscii.length > 0 && tagInfoAscii.length != encodeValue.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoAscii.length);
            sb.append(" byte(s), not ");
            sb.append(strArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoAscii.tag, tagInfoAscii, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.ASCII, encodeValue.length, encodeValue));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort, short s) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoShort.length != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoShort.length);
            sb.append(" value(s), not 1");
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoShort.tag, tagInfoShort, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SHORT, 1, tagInfoShort.encodeValue(this.byteOrder, s)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts, short... sArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoShorts.length > 0 && tagInfoShorts.length != sArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoShorts.length);
            sb.append(" value(s), not ");
            sb.append(sArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoShorts.tag, tagInfoShorts, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SHORT, sArr.length, tagInfoShorts.encodeValue(this.byteOrder, sArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong, int i) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoLong.length != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoLong.length);
            sb.append(" value(s), not 1");
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoLong.tag, tagInfoLong, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, 1, tagInfoLong.encodeValue(this.byteOrder, i)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs, int... iArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoLongs.length > 0 && tagInfoLongs.length != iArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoLongs.length);
            sb.append(" value(s), not ");
            sb.append(iArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoLongs.tag, tagInfoLongs, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, iArr.length, tagInfoLongs.encodeValue(this.byteOrder, iArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational, org.apache.commons.imaging.common.RationalNumber rationalNumber) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoRational.length != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoRational.length);
            sb.append(" value(s), not 1");
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoRational.tag, tagInfoRational, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.RATIONAL, 1, tagInfoRational.encodeValue(this.byteOrder, rationalNumber)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals, org.apache.commons.imaging.common.RationalNumber... rationalNumberArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoRationals.length > 0 && tagInfoRationals.length != rationalNumberArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoRationals.length);
            sb.append(" value(s), not ");
            sb.append(rationalNumberArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoRationals.tag, tagInfoRationals, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.RATIONAL, rationalNumberArr.length, tagInfoRationals.encodeValue(this.byteOrder, rationalNumberArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte, byte b) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoSByte.length != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoSByte.length);
            sb.append(" value(s), not 1");
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoSByte.tag, tagInfoSByte, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SBYTE, 1, tagInfoSByte.encodeValue(this.byteOrder, b)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes, byte... bArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoSBytes.length > 0 && tagInfoSBytes.length != bArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoSBytes.length);
            sb.append(" value(s), not ");
            sb.append(bArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoSBytes.tag, tagInfoSBytes, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SBYTE, bArr.length, tagInfoSBytes.encodeValue(this.byteOrder, bArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort tagInfoSShort, short s) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoSShort.length != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoSShort.length);
            sb.append(" value(s), not 1");
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoSShort.tag, tagInfoSShort, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SSHORT, 1, tagInfoSShort.encodeValue(this.byteOrder, s)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts, short... sArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoSShorts.length > 0 && tagInfoSShorts.length != sArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoSShorts.length);
            sb.append(" value(s), not ");
            sb.append(sArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoSShorts.tag, tagInfoSShorts, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SSHORT, sArr.length, tagInfoSShorts.encodeValue(this.byteOrder, sArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong tagInfoSLong, int i) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoSLong.length != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoSLong.length);
            sb.append(" value(s), not 1");
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoSLong.tag, tagInfoSLong, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SLONG, 1, tagInfoSLong.encodeValue(this.byteOrder, i)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs, int... iArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoSLongs.length > 0 && tagInfoSLongs.length != iArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoSLongs.length);
            sb.append(" value(s), not ");
            sb.append(iArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoSLongs.tag, tagInfoSLongs, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SLONG, iArr.length, tagInfoSLongs.encodeValue(this.byteOrder, iArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational, org.apache.commons.imaging.common.RationalNumber rationalNumber) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoSRational.length != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoSRational.length);
            sb.append(" value(s), not 1");
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoSRational.tag, tagInfoSRational, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SRATIONAL, 1, tagInfoSRational.encodeValue(this.byteOrder, rationalNumber)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals, org.apache.commons.imaging.common.RationalNumber... rationalNumberArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoSRationals.length > 0 && tagInfoSRationals.length != rationalNumberArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoSRationals.length);
            sb.append(" value(s), not ");
            sb.append(rationalNumberArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoSRationals.tag, tagInfoSRationals, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SRATIONAL, rationalNumberArr.length, tagInfoSRationals.encodeValue(this.byteOrder, rationalNumberArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat tagInfoFloat, float f) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoFloat.length != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoFloat.length);
            sb.append(" value(s), not 1");
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoFloat.tag, tagInfoFloat, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.FLOAT, 1, tagInfoFloat.encodeValue(this.byteOrder, f)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats, float... fArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoFloats.length > 0 && tagInfoFloats.length != fArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoFloats.length);
            sb.append(" value(s), not ");
            sb.append(fArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoFloats.tag, tagInfoFloats, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.FLOAT, fArr.length, tagInfoFloats.encodeValue(this.byteOrder, fArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble, double d) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoDouble.length != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoDouble.length);
            sb.append(" value(s), not 1");
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoDouble.tag, tagInfoDouble, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.DOUBLE, 1, tagInfoDouble.encodeValue(this.byteOrder, d)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles, double... dArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoDoubles.length > 0 && tagInfoDoubles.length != dArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoDoubles.length);
            sb.append(" value(s), not ");
            sb.append(dArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoDoubles.tag, tagInfoDoubles, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.DOUBLE, dArr.length, tagInfoDoubles.encodeValue(this.byteOrder, dArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort, byte... bArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoByteOrShort.length > 0 && tagInfoByteOrShort.length != bArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoByteOrShort.length);
            sb.append(" value(s), not ");
            sb.append(bArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoByteOrShort.tag, tagInfoByteOrShort, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.BYTE, bArr.length, tagInfoByteOrShort.encodeValue(this.byteOrder, bArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort tagInfoByteOrShort, short... sArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoByteOrShort.length > 0 && tagInfoByteOrShort.length != sArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoByteOrShort.length);
            sb.append(" value(s), not ");
            sb.append(sArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoByteOrShort.tag, tagInfoByteOrShort, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SHORT, sArr.length, tagInfoByteOrShort.encodeValue(this.byteOrder, sArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong, short... sArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoShortOrLong.length > 0 && tagInfoShortOrLong.length != sArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoShortOrLong.length);
            sb.append(" value(s), not ");
            sb.append(sArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoShortOrLong.tag, tagInfoShortOrLong, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SHORT, sArr.length, tagInfoShortOrLong.encodeValue(this.byteOrder, sArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong, int... iArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoShortOrLong.length > 0 && tagInfoShortOrLong.length != iArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoShortOrLong.length);
            sb.append(" value(s), not ");
            sb.append(iArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoShortOrLong.tag, tagInfoShortOrLong, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, iArr.length, tagInfoShortOrLong.encodeValue(this.byteOrder, iArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational, short... sArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoShortOrLongOrRational.length > 0 && tagInfoShortOrLongOrRational.length != sArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoShortOrLongOrRational.length);
            sb.append(" value(s), not ");
            sb.append(sArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoShortOrLongOrRational.tag, tagInfoShortOrLongOrRational, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SHORT, sArr.length, tagInfoShortOrLongOrRational.encodeValue(this.byteOrder, sArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational, int... iArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoShortOrLongOrRational.length > 0 && tagInfoShortOrLongOrRational.length != iArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoShortOrLongOrRational.length);
            sb.append(" value(s), not ");
            sb.append(iArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoShortOrLongOrRational.tag, tagInfoShortOrLongOrRational, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, iArr.length, tagInfoShortOrLongOrRational.encodeValue(this.byteOrder, iArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational tagInfoShortOrLongOrRational, org.apache.commons.imaging.common.RationalNumber... rationalNumberArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoShortOrLongOrRational.length > 0 && tagInfoShortOrLongOrRational.length != rationalNumberArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoShortOrLongOrRational.length);
            sb.append(" value(s), not ");
            sb.append(rationalNumberArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoShortOrLongOrRational.tag, tagInfoShortOrLongOrRational, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.RATIONAL, rationalNumberArr.length, tagInfoShortOrLongOrRational.encodeValue(this.byteOrder, rationalNumberArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational tagInfoShortOrRational, short... sArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoShortOrRational.length > 0 && tagInfoShortOrRational.length != sArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoShortOrRational.length);
            sb.append(" value(s), not ");
            sb.append(sArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoShortOrRational.tag, tagInfoShortOrRational, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SHORT, sArr.length, tagInfoShortOrRational.encodeValue(this.byteOrder, sArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational tagInfoShortOrRational, org.apache.commons.imaging.common.RationalNumber... rationalNumberArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoShortOrRational.length > 0 && tagInfoShortOrRational.length != rationalNumberArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoShortOrRational.length);
            sb.append(" value(s), not ");
            sb.append(rationalNumberArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoShortOrRational.tag, tagInfoShortOrRational, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.RATIONAL, rationalNumberArr.length, tagInfoShortOrRational.encodeValue(this.byteOrder, rationalNumberArr)));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText, java.lang.String str) throws org.apache.commons.imaging.ImageWriteException {
        byte[] encodeValue = tagInfoGpsText.encodeValue(org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.UNDEFINED, str, this.byteOrder);
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoGpsText.tag, tagInfoGpsText, tagInfoGpsText.dataTypes.get(0), encodeValue.length, encodeValue));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString, java.lang.String str) throws org.apache.commons.imaging.ImageWriteException {
        byte[] encodeValue = tagInfoXpString.encodeValue(org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.BYTE, str, this.byteOrder);
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoXpString.tag, tagInfoXpString, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.BYTE, encodeValue.length, encodeValue));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte tagInfoAsciiOrByte, java.lang.String... strArr) throws org.apache.commons.imaging.ImageWriteException {
        byte[] encodeValue = tagInfoAsciiOrByte.encodeValue(org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.ASCII, strArr, this.byteOrder);
        if (tagInfoAsciiOrByte.length > 0 && tagInfoAsciiOrByte.length != encodeValue.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoAsciiOrByte.length);
            sb.append(" byte(s), not ");
            sb.append(strArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoAsciiOrByte.tag, tagInfoAsciiOrByte, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.ASCII, encodeValue.length, encodeValue));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational tagInfoAsciiOrRational, java.lang.String... strArr) throws org.apache.commons.imaging.ImageWriteException {
        byte[] encodeValue = tagInfoAsciiOrRational.encodeValue(org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.ASCII, strArr, this.byteOrder);
        if (tagInfoAsciiOrRational.length > 0 && tagInfoAsciiOrRational.length != encodeValue.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoAsciiOrRational.length);
            sb.append(" byte(s), not ");
            sb.append(strArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoAsciiOrRational.tag, tagInfoAsciiOrRational, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.ASCII, encodeValue.length, encodeValue));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational tagInfoAsciiOrRational, org.apache.commons.imaging.common.RationalNumber... rationalNumberArr) throws org.apache.commons.imaging.ImageWriteException {
        if (tagInfoAsciiOrRational.length > 0 && tagInfoAsciiOrRational.length != rationalNumberArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Tag expects ");
            sb.append(tagInfoAsciiOrRational.length);
            sb.append(" value(s), not ");
            sb.append(rationalNumberArr.length);
            throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
        }
        byte[] encodeValue = tagInfoAsciiOrRational.encodeValue(org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.RATIONAL, rationalNumberArr, this.byteOrder);
        add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoAsciiOrRational.tag, tagInfoAsciiOrRational, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.RATIONAL, encodeValue.length, encodeValue));
    }

    public final void add(org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField) {
        this.fields.add(tiffOutputField);
    }

    public final java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputField> getFields() {
        return new java.util.ArrayList(this.fields);
    }

    public final void removeField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo) {
        removeField(tagInfo.tag);
    }

    public final void removeField(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField : this.fields) {
            if (tiffOutputField.tag == i) {
                arrayList.add(tiffOutputField);
            }
        }
        this.fields.removeAll(arrayList);
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputField findField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo) {
        return findField(tagInfo.tag);
    }

    public final org.apache.commons.imaging.formats.tiff.write.TiffOutputField findField(int i) {
        for (org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField : this.fields) {
            if (tiffOutputField.tag == i) {
                return tiffOutputField;
            }
        }
        return null;
    }

    public final void sortFields() {
        java.util.Collections.sort(this.fields, new java.util.Comparator() { // from class: org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory.lambda$sortFields$1((org.apache.commons.imaging.formats.tiff.write.TiffOutputField) obj, (org.apache.commons.imaging.formats.tiff.write.TiffOutputField) obj2);
            }
        });
    }

    static /* synthetic */ int lambda$sortFields$1(org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField, org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField2) {
        int sortHint;
        int sortHint2;
        if (tiffOutputField.tag != tiffOutputField2.tag) {
            sortHint = tiffOutputField.tag;
            sortHint2 = tiffOutputField2.tag;
        } else {
            sortHint = tiffOutputField.getSortHint();
            sortHint2 = tiffOutputField2.getSortHint();
        }
        return sortHint - sortHint2;
    }

    public final java.lang.String description() {
        return org.apache.commons.imaging.formats.tiff.TiffDirectory.description(this.type);
    }

    @Override // org.apache.commons.imaging.formats.tiff.write.TiffOutputItem
    public final void writeItem(org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        binaryOutputStream.write2Bytes(this.fields.size());
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.write.TiffOutputField> it = this.fields.iterator();
        while (it.hasNext()) {
            it.next().writeField(binaryOutputStream);
        }
        org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory tiffOutputDirectory = this.nextDirectory;
        long offset = tiffOutputDirectory != null ? tiffOutputDirectory.getOffset() : 0L;
        if (offset == -1) {
            binaryOutputStream.write4Bytes(0);
        } else {
            binaryOutputStream.write4Bytes((int) offset);
        }
    }

    public final void setJpegImageData(org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData) {
        this.jpegImageData = jpegImageData;
    }

    public final org.apache.commons.imaging.formats.tiff.JpegImageData getRawJpegImageData() {
        return this.jpegImageData;
    }

    public final void setTiffImageData(org.apache.commons.imaging.formats.tiff.TiffImageData tiffImageData) {
        this.tiffImageData = tiffImageData;
    }

    public final org.apache.commons.imaging.formats.tiff.TiffImageData getRawTiffImageData() {
        return this.tiffImageData;
    }

    @Override // org.apache.commons.imaging.formats.tiff.write.TiffOutputItem
    public final int getItemLength() {
        return (this.fields.size() * 12) + 6;
    }

    @Override // org.apache.commons.imaging.formats.tiff.write.TiffOutputItem
    public final java.lang.String getItemDescription() {
        org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType exifDirectoryType = org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.getExifDirectoryType(this.type);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Directory: ");
        sb.append(exifDirectoryType.f7037name);
        sb.append(" (");
        sb.append(this.type);
        sb.append(")");
        return sb.toString();
    }

    private void removeFieldIfPresent(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo) {
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField findField = findField(tagInfo);
        if (findField != null) {
            this.fields.remove(findField);
        }
    }

    protected final java.util.List<org.apache.commons.imaging.formats.tiff.write.TiffOutputItem> getOutputItems(org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary tiffOutputSummary) throws org.apache.commons.imaging.ImageWriteException {
        org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong;
        removeFieldIfPresent(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT);
        removeFieldIfPresent(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
        org.apache.commons.imaging.formats.tiff.write.ImageDataOffsets imageDataOffsets = null;
        if (this.jpegImageData != null) {
            tiffOutputField = new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, 1, new byte[4]);
            add(tiffOutputField);
            add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, 1, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG.writeData(java.lang.Integer.valueOf(this.jpegImageData.length), tiffOutputSummary.byteOrder)));
        } else {
            tiffOutputField = null;
        }
        removeFieldIfPresent(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_STRIP_OFFSETS);
        removeFieldIfPresent(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS);
        removeFieldIfPresent(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_OFFSETS);
        removeFieldIfPresent(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS);
        org.apache.commons.imaging.formats.tiff.TiffImageData tiffImageData = this.tiffImageData;
        if (tiffImageData != null) {
            if (tiffImageData.stripsNotTiles()) {
                tagInfo = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_STRIP_OFFSETS;
                tagInfoShortOrLong = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS;
            } else {
                tagInfo = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_OFFSETS;
                tagInfoShortOrLong = org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS;
            }
            org.apache.commons.imaging.formats.tiff.TiffElement.DataElement[] imageData = this.tiffImageData.getImageData();
            int length = imageData.length;
            int[] iArr = new int[length];
            int length2 = imageData.length;
            int[] iArr2 = new int[length2];
            for (int i = 0; i < imageData.length; i++) {
                iArr2[i] = imageData[i].length;
            }
            org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField2 = new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfo, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, length, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG.writeData(iArr, tiffOutputSummary.byteOrder));
            add(tiffOutputField2);
            add(new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfoShortOrLong, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, length2, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG.writeData(iArr2, tiffOutputSummary.byteOrder)));
            imageDataOffsets = new org.apache.commons.imaging.formats.tiff.write.ImageDataOffsets(imageData, iArr, tiffOutputField2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this);
        sortFields();
        for (org.apache.commons.imaging.formats.tiff.write.TiffOutputField tiffOutputField3 : this.fields) {
            if (!tiffOutputField3.isLocalValue()) {
                arrayList.add(tiffOutputField3.getSeperateValue());
            }
        }
        if (imageDataOffsets != null) {
            java.util.Collections.addAll(arrayList, imageDataOffsets.outputItems);
            tiffOutputSummary.addTiffImageData(imageDataOffsets);
        }
        org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData = this.jpegImageData;
        if (jpegImageData != null) {
            org.apache.commons.imaging.formats.tiff.write.TiffOutputItem.Value value = new org.apache.commons.imaging.formats.tiff.write.TiffOutputItem.Value("JPEG image data", jpegImageData.getData());
            arrayList.add(value);
            tiffOutputSummary.add(value, tiffOutputField);
        }
        return arrayList;
    }
}
