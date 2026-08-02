package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoSByte extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoSByte(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SBYTE, 1, tiffDirectoryType);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, byte b) {
        return new byte[]{b};
    }
}
