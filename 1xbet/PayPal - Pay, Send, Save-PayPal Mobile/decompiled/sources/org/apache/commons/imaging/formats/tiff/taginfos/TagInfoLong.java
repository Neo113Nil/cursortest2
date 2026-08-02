package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoLong extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoLong(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, 1, tiffDirectoryType);
    }

    public TagInfoLong(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType, boolean z) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, 1, tiffDirectoryType, z);
    }

    public TagInfoLong(java.lang.String str, int i, java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> list, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType, boolean z) {
        super(str, i, list, i2, tiffDirectoryType, z);
    }

    public int getValue(java.nio.ByteOrder byteOrder, byte[] bArr) {
        return org.apache.commons.imaging.common.ByteConversions.toInt(bArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, int i) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(i, byteOrder);
    }
}
