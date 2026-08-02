package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoShortOrLong extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoShortOrLong(java.lang.String str, int i, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SHORT_OR_LONG, i2, tiffDirectoryType, false);
    }

    public TagInfoShortOrLong(java.lang.String str, int i, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType, boolean z) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SHORT_OR_LONG, i2, tiffDirectoryType, z);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, short... sArr) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(sArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, int... iArr) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(iArr, byteOrder);
    }
}
