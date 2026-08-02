package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoSBytes extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public byte[] encodeValue(java.nio.ByteOrder byteOrder, byte... bArr) {
        return bArr;
    }

    public TagInfoSBytes(java.lang.String str, int i, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.SBYTE, i2, tiffDirectoryType);
    }
}
