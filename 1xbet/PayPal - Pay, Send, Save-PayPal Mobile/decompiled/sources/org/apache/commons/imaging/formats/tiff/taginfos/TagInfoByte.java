package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoByte extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoByte(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.BYTE, 1, tiffDirectoryType);
    }

    public TagInfoByte(java.lang.String str, int i, java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> list, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, list, 1, tiffDirectoryType);
    }

    public TagInfoByte(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, fieldType, 1, tiffDirectoryType);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, byte b) {
        return new byte[]{b};
    }
}
