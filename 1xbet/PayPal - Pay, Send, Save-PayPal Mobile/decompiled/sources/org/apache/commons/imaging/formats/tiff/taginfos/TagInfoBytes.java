package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoBytes extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public byte[] encodeValue(java.nio.ByteOrder byteOrder, byte... bArr) {
        return bArr;
    }

    public TagInfoBytes(java.lang.String str, int i, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.BYTE, i2, tiffDirectoryType);
    }

    public TagInfoBytes(java.lang.String str, int i, java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> list, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, list, i2, tiffDirectoryType);
    }

    public TagInfoBytes(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, fieldType, i2, tiffDirectoryType);
    }
}
