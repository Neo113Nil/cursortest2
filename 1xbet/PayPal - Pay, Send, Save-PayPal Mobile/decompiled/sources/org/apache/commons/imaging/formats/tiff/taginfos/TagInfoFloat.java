package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoFloat extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoFloat(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.FLOAT, 1, tiffDirectoryType);
    }

    public float getValue(java.nio.ByteOrder byteOrder, byte[] bArr) {
        return org.apache.commons.imaging.common.ByteConversions.toFloat(bArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, float f) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(f, byteOrder);
    }
}
