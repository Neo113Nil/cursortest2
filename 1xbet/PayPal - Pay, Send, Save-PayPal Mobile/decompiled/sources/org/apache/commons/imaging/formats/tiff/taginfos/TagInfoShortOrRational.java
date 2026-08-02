package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoShortOrRational extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoShortOrRational(java.lang.String str, int i, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SHORT_OR_RATIONAL, i2, tiffDirectoryType, false);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, short... sArr) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(sArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, org.apache.commons.imaging.common.RationalNumber... rationalNumberArr) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(rationalNumberArr, byteOrder);
    }
}
