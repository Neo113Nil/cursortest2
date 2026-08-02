package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoFloats extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoFloats(java.lang.String str, int i, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.FLOAT, i2, tiffDirectoryType);
    }

    public float[] getValue(java.nio.ByteOrder byteOrder, byte[] bArr) {
        return org.apache.commons.imaging.common.ByteConversions.toFloats(bArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, float... fArr) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(fArr, byteOrder);
    }
}
