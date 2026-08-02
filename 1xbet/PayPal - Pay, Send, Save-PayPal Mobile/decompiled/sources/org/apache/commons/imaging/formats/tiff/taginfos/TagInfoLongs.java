package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoLongs extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoLongs(java.lang.String str, int i, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, i2, tiffDirectoryType);
    }

    public TagInfoLongs(java.lang.String str, int i, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType, boolean z) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, i2, tiffDirectoryType, z);
    }

    public int[] getValue(java.nio.ByteOrder byteOrder, byte[] bArr) {
        return org.apache.commons.imaging.common.ByteConversions.toInts(bArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, int... iArr) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(iArr, byteOrder);
    }
}
