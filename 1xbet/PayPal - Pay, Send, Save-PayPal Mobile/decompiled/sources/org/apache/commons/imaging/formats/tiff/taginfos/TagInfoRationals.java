package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoRationals extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoRationals(java.lang.String str, int i, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.RATIONAL, i2, tiffDirectoryType);
    }

    public org.apache.commons.imaging.common.RationalNumber[] getValue(java.nio.ByteOrder byteOrder, byte[] bArr) {
        return org.apache.commons.imaging.common.ByteConversions.toRationals(bArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, org.apache.commons.imaging.common.RationalNumber... rationalNumberArr) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(rationalNumberArr, byteOrder);
    }
}
