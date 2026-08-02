package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoShort extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoShort(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SHORT, 1, tiffDirectoryType);
    }

    public short getValue(java.nio.ByteOrder byteOrder, byte[] bArr) {
        return org.apache.commons.imaging.common.ByteConversions.toShort(bArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, short s) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(s, byteOrder);
    }
}
