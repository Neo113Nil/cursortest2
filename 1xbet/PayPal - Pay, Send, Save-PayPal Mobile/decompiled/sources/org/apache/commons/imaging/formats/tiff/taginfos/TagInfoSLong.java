package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoSLong extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoSLong(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SLONG, 1, tiffDirectoryType);
    }

    public int getValue(java.nio.ByteOrder byteOrder, byte[] bArr) {
        return org.apache.commons.imaging.common.ByteConversions.toInt(bArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, int i) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(i, byteOrder);
    }
}
