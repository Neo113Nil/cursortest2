package org.apache.commons.imaging.formats.tiff;

/* loaded from: classes17.dex */
public class TiffDirectory extends org.apache.commons.imaging.formats.tiff.TiffElement {
    public final java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> entries;
    private final java.nio.ByteOrder headerByteOrder;
    private org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData;
    public final long nextDirectoryOffset;
    private org.apache.commons.imaging.formats.tiff.TiffImageData tiffImageData;
    public final int type;

    public TiffDirectory(int i, java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> list, long j, long j2, java.nio.ByteOrder byteOrder) {
        super(j, (list.size() * 12) + 6);
        this.type = i;
        this.entries = java.util.Collections.unmodifiableList(list);
        this.nextDirectoryOffset = j2;
        this.headerByteOrder = byteOrder;
    }

    public java.lang.String description() {
        return description(this.type);
    }

    @Override // org.apache.commons.imaging.formats.tiff.TiffElement
    public java.lang.String getElementDescription() {
        long j = this.offset + 2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (org.apache.commons.imaging.formats.tiff.TiffField tiffField : this.entries) {
            java.lang.String str = tiffField.getTagInfo().f7039name;
            int tag = tiffField.getTag();
            int tag2 = tiffField.getTag();
            java.lang.String name2 = tiffField.getFieldType().getName();
            int bytesLength = tiffField.getBytesLength();
            sb.append(java.lang.String.format("\t[%d]: %s (%d, 0x%x), %s, %d: %s%n", java.lang.Long.valueOf(j), str, java.lang.Integer.valueOf(tag), java.lang.Integer.valueOf(tag2), name2, java.lang.Integer.valueOf(bytesLength), tiffField.getValueDescription()));
            j += 12;
        }
        return sb.toString();
    }

    public static java.lang.String description(int i) {
        switch (i) {
            case -4:
                return "Interoperability";
            case -3:
                return "Gps";
            case -2:
                return "Exif";
            case -1:
                return "Unknown";
            case 0:
                return "Root";
            case 1:
                return "Sub";
            case 2:
                return "Thumbnail";
            default:
                return "Bad Type";
        }
    }

    public java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> getDirectoryEntries() {
        return new java.util.ArrayList(this.entries);
    }

    public void dump() {
        java.util.Iterator<org.apache.commons.imaging.formats.tiff.TiffField> it = this.entries.iterator();
        while (it.hasNext()) {
            it.next().dump();
        }
    }

    public boolean hasJpegImageData() throws org.apache.commons.imaging.ImageReadException {
        return findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT) != null;
    }

    public boolean hasTiffImageData() throws org.apache.commons.imaging.ImageReadException {
        return (findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_OFFSETS) == null && findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_STRIP_OFFSETS) == null) ? false : true;
    }

    public java.awt.image.BufferedImage getTiffImage() throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (this.tiffImageData == null) {
            return null;
        }
        return new org.apache.commons.imaging.formats.tiff.TiffImageParser().getBufferedImage(this, this.headerByteOrder, null);
    }

    public java.awt.image.BufferedImage getTiffImage(java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (this.tiffImageData == null) {
            return null;
        }
        return new org.apache.commons.imaging.formats.tiff.TiffImageParser().getBufferedImage(this, this.headerByteOrder, map);
    }

    public java.awt.image.BufferedImage getTiffImage(java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return getTiffImage(byteOrder, null);
    }

    public java.awt.image.BufferedImage getTiffImage(java.nio.ByteOrder byteOrder, java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        if (this.tiffImageData == null) {
            return null;
        }
        return new org.apache.commons.imaging.formats.tiff.TiffImageParser().getBufferedImage(this, byteOrder, map);
    }

    public org.apache.commons.imaging.formats.tiff.TiffField findField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo) throws org.apache.commons.imaging.ImageReadException {
        return findField(tagInfo, false);
    }

    public org.apache.commons.imaging.formats.tiff.TiffField findField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo, boolean z) throws org.apache.commons.imaging.ImageReadException {
        java.util.List<org.apache.commons.imaging.formats.tiff.TiffField> list = this.entries;
        if (list == null) {
            return null;
        }
        for (org.apache.commons.imaging.formats.tiff.TiffField tiffField : list) {
            if (tiffField.getTag() == tagInfo.tag) {
                return tiffField;
            }
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Missing expected field: ");
        sb.append(tagInfo.getDescription());
        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
    }

    public java.lang.Object getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfo);
        if (findField == null) {
            return null;
        }
        return findField.getValue();
    }

    public java.lang.String getSingleFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii) throws org.apache.commons.imaging.ImageReadException {
        java.lang.String[] fieldValue = getFieldValue(tagInfoAscii, true);
        if (fieldValue.length != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Field \"");
            sb.append(tagInfoAscii.f7039name);
            sb.append("\" has incorrect length ");
            sb.append(fieldValue.length);
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        return fieldValue[0];
    }

    public int getSingleFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong) throws org.apache.commons.imaging.ImageReadException {
        int[] fieldValue = getFieldValue(tagInfoShortOrLong, true);
        if (fieldValue.length != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Field \"");
            sb.append(tagInfoShortOrLong.f7039name);
            sb.append("\" has incorrect length ");
            sb.append(fieldValue.length);
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        return fieldValue[0];
    }

    public byte getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte tagInfoByte) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoByte);
        if (findField == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoByte.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (!tagInfoByte.dataTypes.contains(findField.getFieldType())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
            sb2.append(tagInfoByte.f7039name);
            sb2.append("\" has incorrect type ");
            sb2.append(findField.getFieldType().getName());
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        if (findField.getCount() != 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Field \"");
            sb3.append(tagInfoByte.f7039name);
            sb3.append("\" has wrong count ");
            sb3.append(findField.getCount());
            throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
        }
        return findField.getByteArrayValue()[0];
    }

    public byte[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes tagInfoBytes, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoBytes);
        if (findField == null) {
            if (!z) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoBytes.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (tagInfoBytes.dataTypes.contains(findField.getFieldType())) {
            return findField.getByteArrayValue();
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
        sb2.append(tagInfoBytes.f7039name);
        sb2.append("\" has incorrect type ");
        sb2.append(findField.getFieldType().getName());
        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
    }

    public java.lang.String[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii tagInfoAscii, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoAscii);
        if (findField == null) {
            if (!z) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoAscii.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (tagInfoAscii.dataTypes.contains(findField.getFieldType())) {
            return tagInfoAscii.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
        sb2.append(tagInfoAscii.f7039name);
        sb2.append("\" has incorrect type ");
        sb2.append(findField.getFieldType().getName());
        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
    }

    public short getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort tagInfoShort) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoShort);
        if (findField == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoShort.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (!tagInfoShort.dataTypes.contains(findField.getFieldType())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
            sb2.append(tagInfoShort.f7039name);
            sb2.append("\" has incorrect type ");
            sb2.append(findField.getFieldType().getName());
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        if (findField.getCount() != 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Field \"");
            sb3.append(tagInfoShort.f7039name);
            sb3.append("\" has wrong count ");
            sb3.append(findField.getCount());
            throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
        }
        return tagInfoShort.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public short[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts tagInfoShorts, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoShorts);
        if (findField == null) {
            if (!z) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoShorts.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (tagInfoShorts.dataTypes.contains(findField.getFieldType())) {
            return tagInfoShorts.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
        sb2.append(tagInfoShorts.f7039name);
        sb2.append("\" has incorrect type ");
        sb2.append(findField.getFieldType().getName());
        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
    }

    public int getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong tagInfoLong) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoLong);
        if (findField == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoLong.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (!tagInfoLong.dataTypes.contains(findField.getFieldType())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
            sb2.append(tagInfoLong.f7039name);
            sb2.append("\" has incorrect type ");
            sb2.append(findField.getFieldType().getName());
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        if (findField.getCount() != 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Field \"");
            sb3.append(tagInfoLong.f7039name);
            sb3.append("\" has wrong count ");
            sb3.append(findField.getCount());
            throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
        }
        return tagInfoLong.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public int[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs tagInfoLongs, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoLongs);
        if (findField == null) {
            if (!z) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoLongs.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (tagInfoLongs.dataTypes.contains(findField.getFieldType())) {
            return tagInfoLongs.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
        sb2.append(tagInfoLongs.f7039name);
        sb2.append("\" has incorrect type ");
        sb2.append(findField.getFieldType().getName());
        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
    }

    public int[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong tagInfoShortOrLong, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoShortOrLong);
        if (findField == null) {
            if (!z) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoShortOrLong.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (tagInfoShortOrLong.dataTypes.contains(findField.getFieldType())) {
            byte[] byteArrayValue = findField.getByteArrayValue();
            if (findField.getFieldType() == org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SHORT) {
                return org.apache.commons.imaging.common.ByteConversions.toUInt16s(byteArrayValue, findField.getByteOrder());
            }
            return org.apache.commons.imaging.common.ByteConversions.toInts(byteArrayValue, findField.getByteOrder());
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
        sb2.append(tagInfoShortOrLong.f7039name);
        sb2.append("\" has incorrect type ");
        sb2.append(findField.getFieldType().getName());
        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
    }

    public org.apache.commons.imaging.common.RationalNumber getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational tagInfoRational) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoRational);
        if (findField == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoRational.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (!tagInfoRational.dataTypes.contains(findField.getFieldType())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
            sb2.append(tagInfoRational.f7039name);
            sb2.append("\" has incorrect type ");
            sb2.append(findField.getFieldType().getName());
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        if (findField.getCount() != 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Field \"");
            sb3.append(tagInfoRational.f7039name);
            sb3.append("\" has wrong count ");
            sb3.append(findField.getCount());
            throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
        }
        return tagInfoRational.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public org.apache.commons.imaging.common.RationalNumber[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals tagInfoRationals, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoRationals);
        if (findField == null) {
            if (!z) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoRationals.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (tagInfoRationals.dataTypes.contains(findField.getFieldType())) {
            return tagInfoRationals.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
        sb2.append(tagInfoRationals.f7039name);
        sb2.append("\" has incorrect type ");
        sb2.append(findField.getFieldType().getName());
        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
    }

    public byte getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte tagInfoSByte) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoSByte);
        if (findField == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoSByte.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (!tagInfoSByte.dataTypes.contains(findField.getFieldType())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
            sb2.append(tagInfoSByte.f7039name);
            sb2.append("\" has incorrect type ");
            sb2.append(findField.getFieldType().getName());
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        if (findField.getCount() != 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Field \"");
            sb3.append(tagInfoSByte.f7039name);
            sb3.append("\" has wrong count ");
            sb3.append(findField.getCount());
            throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
        }
        return findField.getByteArrayValue()[0];
    }

    public byte[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes tagInfoSBytes, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoSBytes);
        if (findField == null) {
            if (!z) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoSBytes.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (tagInfoSBytes.dataTypes.contains(findField.getFieldType())) {
            return findField.getByteArrayValue();
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
        sb2.append(tagInfoSBytes.f7039name);
        sb2.append("\" has incorrect type ");
        sb2.append(findField.getFieldType().getName());
        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
    }

    public short getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort tagInfoSShort) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoSShort);
        if (findField == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoSShort.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (!tagInfoSShort.dataTypes.contains(findField.getFieldType())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
            sb2.append(tagInfoSShort.f7039name);
            sb2.append("\" has incorrect type ");
            sb2.append(findField.getFieldType().getName());
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        if (findField.getCount() != 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Field \"");
            sb3.append(tagInfoSShort.f7039name);
            sb3.append("\" has wrong count ");
            sb3.append(findField.getCount());
            throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
        }
        return tagInfoSShort.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public short[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts tagInfoSShorts, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoSShorts);
        if (findField == null) {
            if (!z) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoSShorts.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (tagInfoSShorts.dataTypes.contains(findField.getFieldType())) {
            return tagInfoSShorts.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
        sb2.append(tagInfoSShorts.f7039name);
        sb2.append("\" has incorrect type ");
        sb2.append(findField.getFieldType().getName());
        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
    }

    public int getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong tagInfoSLong) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoSLong);
        if (findField == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoSLong.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (!tagInfoSLong.dataTypes.contains(findField.getFieldType())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
            sb2.append(tagInfoSLong.f7039name);
            sb2.append("\" has incorrect type ");
            sb2.append(findField.getFieldType().getName());
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        if (findField.getCount() != 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Field \"");
            sb3.append(tagInfoSLong.f7039name);
            sb3.append("\" has wrong count ");
            sb3.append(findField.getCount());
            throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
        }
        return tagInfoSLong.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public int[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs tagInfoSLongs, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoSLongs);
        if (findField == null) {
            if (!z) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoSLongs.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (tagInfoSLongs.dataTypes.contains(findField.getFieldType())) {
            return tagInfoSLongs.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
        sb2.append(tagInfoSLongs.f7039name);
        sb2.append("\" has incorrect type ");
        sb2.append(findField.getFieldType().getName());
        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
    }

    public org.apache.commons.imaging.common.RationalNumber getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational tagInfoSRational) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoSRational);
        if (findField == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoSRational.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (!tagInfoSRational.dataTypes.contains(findField.getFieldType())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
            sb2.append(tagInfoSRational.f7039name);
            sb2.append("\" has incorrect type ");
            sb2.append(findField.getFieldType().getName());
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        if (findField.getCount() != 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Field \"");
            sb3.append(tagInfoSRational.f7039name);
            sb3.append("\" has wrong count ");
            sb3.append(findField.getCount());
            throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
        }
        return tagInfoSRational.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public org.apache.commons.imaging.common.RationalNumber[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals tagInfoSRationals, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoSRationals);
        if (findField == null) {
            if (!z) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoSRationals.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (tagInfoSRationals.dataTypes.contains(findField.getFieldType())) {
            return tagInfoSRationals.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
        sb2.append(tagInfoSRationals.f7039name);
        sb2.append("\" has incorrect type ");
        sb2.append(findField.getFieldType().getName());
        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
    }

    public float getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat tagInfoFloat) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoFloat);
        if (findField == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoFloat.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (!tagInfoFloat.dataTypes.contains(findField.getFieldType())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
            sb2.append(tagInfoFloat.f7039name);
            sb2.append("\" has incorrect type ");
            sb2.append(findField.getFieldType().getName());
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        if (findField.getCount() != 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Field \"");
            sb3.append(tagInfoFloat.f7039name);
            sb3.append("\" has wrong count ");
            sb3.append(findField.getCount());
            throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
        }
        return tagInfoFloat.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public float[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats tagInfoFloats, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoFloats);
        if (findField == null) {
            if (!z) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoFloats.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (tagInfoFloats.dataTypes.contains(findField.getFieldType())) {
            return tagInfoFloats.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
        sb2.append(tagInfoFloats.f7039name);
        sb2.append("\" has incorrect type ");
        sb2.append(findField.getFieldType().getName());
        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
    }

    public double getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble tagInfoDouble) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoDouble);
        if (findField == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoDouble.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (!tagInfoDouble.dataTypes.contains(findField.getFieldType())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
            sb2.append(tagInfoDouble.f7039name);
            sb2.append("\" has incorrect type ");
            sb2.append(findField.getFieldType().getName());
            throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
        }
        if (findField.getCount() != 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Field \"");
            sb3.append(tagInfoDouble.f7039name);
            sb3.append("\" has wrong count ");
            sb3.append(findField.getCount());
            throw new org.apache.commons.imaging.ImageReadException(sb3.toString());
        }
        return tagInfoDouble.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public double[] getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles tagInfoDoubles, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoDoubles);
        if (findField == null) {
            if (!z) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
            sb.append(tagInfoDoubles.f7039name);
            sb.append("\" is missing");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        if (tagInfoDoubles.dataTypes.contains(findField.getFieldType())) {
            return tagInfoDoubles.getValue(findField.getByteOrder(), findField.getByteArrayValue());
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Required field \"");
        sb2.append(tagInfoDoubles.f7039name);
        sb2.append("\" has incorrect type ");
        sb2.append(findField.getFieldType().getName());
        throw new org.apache.commons.imaging.ImageReadException(sb2.toString());
    }

    public java.lang.String getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText tagInfoGpsText, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoGpsText);
        if (findField != null) {
            return tagInfoGpsText.getValue(findField);
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
        sb.append(tagInfoGpsText.f7039name);
        sb.append("\" is missing");
        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
    }

    public java.lang.String getFieldValue(org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString tagInfoXpString, boolean z) throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(tagInfoXpString);
        if (findField != null) {
            return tagInfoXpString.getValue(findField);
        }
        if (!z) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Required field \"");
        sb.append(tagInfoXpString.f7039name);
        sb.append("\" is missing");
        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
    }

    public static final class ImageDataElement extends org.apache.commons.imaging.formats.tiff.TiffElement {
        public ImageDataElement(long j, int i) {
            super(j, i);
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffElement
        public final java.lang.String getElementDescription() {
            return "ImageDataElement";
        }
    }

    private java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement> getRawImageDataElements(org.apache.commons.imaging.formats.tiff.TiffField tiffField, org.apache.commons.imaging.formats.tiff.TiffField tiffField2) throws org.apache.commons.imaging.ImageReadException {
        int[] intArrayValue = tiffField.getIntArrayValue();
        int[] intArrayValue2 = tiffField2.getIntArrayValue();
        if (intArrayValue.length != intArrayValue2.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("offsets.length(");
            sb.append(intArrayValue.length);
            sb.append(") != byteCounts.length(");
            sb.append(intArrayValue2.length);
            sb.append(")");
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(intArrayValue.length);
        for (int i = 0; i < intArrayValue.length; i++) {
            arrayList.add(new org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement(intArrayValue[i], intArrayValue2[i]));
        }
        return arrayList;
    }

    public java.util.List<org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement> getTiffRawImageDataElements() throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_OFFSETS);
        org.apache.commons.imaging.formats.tiff.TiffField findField2 = findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS);
        org.apache.commons.imaging.formats.tiff.TiffField findField3 = findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_STRIP_OFFSETS);
        org.apache.commons.imaging.formats.tiff.TiffField findField4 = findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS);
        if (findField != null && findField2 != null) {
            return getRawImageDataElements(findField, findField2);
        }
        if (findField3 != null && findField4 != null) {
            return getRawImageDataElements(findField3, findField4);
        }
        throw new org.apache.commons.imaging.ImageReadException("Couldn't find image data.");
    }

    public boolean imageDataInStrips() throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_OFFSETS);
        org.apache.commons.imaging.formats.tiff.TiffField findField2 = findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_TILE_BYTE_COUNTS);
        org.apache.commons.imaging.formats.tiff.TiffField findField3 = findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_STRIP_OFFSETS);
        org.apache.commons.imaging.formats.tiff.TiffField findField4 = findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_STRIP_BYTE_COUNTS);
        if (findField != null && findField2 != null) {
            return false;
        }
        if (findField3 == null || findField4 == null) {
            throw new org.apache.commons.imaging.ImageReadException("Couldn't find image data.");
        }
        return true;
    }

    public org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement getJpegRawImageDataElement() throws org.apache.commons.imaging.ImageReadException {
        org.apache.commons.imaging.formats.tiff.TiffField findField = findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT);
        org.apache.commons.imaging.formats.tiff.TiffField findField2 = findField(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
        if (findField != null && findField2 != null) {
            return new org.apache.commons.imaging.formats.tiff.TiffDirectory.ImageDataElement(findField.getIntArrayValue()[0], findField2.getIntArrayValue()[0]);
        }
        throw new org.apache.commons.imaging.ImageReadException("Couldn't find image data.");
    }

    public void setTiffImageData(org.apache.commons.imaging.formats.tiff.TiffImageData tiffImageData) {
        this.tiffImageData = tiffImageData;
    }

    public org.apache.commons.imaging.formats.tiff.TiffImageData getTiffImageData() {
        return this.tiffImageData;
    }

    public void setJpegImageData(org.apache.commons.imaging.formats.tiff.JpegImageData jpegImageData) {
        this.jpegImageData = jpegImageData;
    }

    public org.apache.commons.imaging.formats.tiff.JpegImageData getJpegImageData() {
        return this.jpegImageData;
    }

    public org.apache.commons.imaging.formats.tiff.TiffRasterData getFloatingPointRasterData(java.util.Map<java.lang.String, java.lang.Object> map) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        return new org.apache.commons.imaging.formats.tiff.TiffImageParser().getFloatingPointRasterData(this, this.headerByteOrder, map);
    }

    public boolean hasTiffFloatingPointRasterData() throws org.apache.commons.imaging.ImageReadException {
        short[] fieldValue;
        return hasTiffImageData() && (fieldValue = getFieldValue(org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_SAMPLE_FORMAT, false)) != null && fieldValue.length > 0 && fieldValue[0] == 3;
    }
}
