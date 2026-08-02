package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoShortOrLongOrRational extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoShortOrLongOrRational(java.lang.String str, int i, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SHORT_OR_LONG_OR_RATIONAL, i2, tiffDirectoryType);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, short... sArr) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(sArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, int... iArr) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(iArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, org.apache.commons.imaging.common.RationalNumber... rationalNumberArr) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(rationalNumberArr, byteOrder);
    }
}
