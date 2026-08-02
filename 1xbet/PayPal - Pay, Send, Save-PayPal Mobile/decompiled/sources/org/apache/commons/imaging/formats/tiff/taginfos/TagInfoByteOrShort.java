package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoByteOrShort extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public byte[] encodeValue(java.nio.ByteOrder byteOrder, byte... bArr) {
        return bArr;
    }

    public TagInfoByteOrShort(java.lang.String str, int i, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.BYTE_OR_SHORT, i2, tiffDirectoryType);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, short... sArr) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(sArr, byteOrder);
    }
}
