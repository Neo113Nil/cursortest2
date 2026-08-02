package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoDouble extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoDouble(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.DOUBLE, 1, tiffDirectoryType);
    }

    public double getValue(java.nio.ByteOrder byteOrder, byte[] bArr) {
        return org.apache.commons.imaging.common.ByteConversions.toDouble(bArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, double d) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(d, byteOrder);
    }
}
