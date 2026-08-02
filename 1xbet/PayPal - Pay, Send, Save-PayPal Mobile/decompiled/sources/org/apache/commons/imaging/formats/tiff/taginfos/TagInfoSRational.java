package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoSRational extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoSRational(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SRATIONAL, 1, tiffDirectoryType);
    }

    public org.apache.commons.imaging.common.RationalNumber getValue(java.nio.ByteOrder byteOrder, byte[] bArr) {
        return org.apache.commons.imaging.common.ByteConversions.toRational(bArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, org.apache.commons.imaging.common.RationalNumber rationalNumber) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(rationalNumber, byteOrder);
    }
}
