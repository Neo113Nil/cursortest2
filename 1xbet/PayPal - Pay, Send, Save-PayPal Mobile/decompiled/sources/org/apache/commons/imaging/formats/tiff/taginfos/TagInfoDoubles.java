package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoDoubles extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoDoubles(java.lang.String str, int i, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.DOUBLE, i2, tiffDirectoryType);
    }

    public double[] getValue(java.nio.ByteOrder byteOrder, byte[] bArr) {
        return org.apache.commons.imaging.common.ByteConversions.toDoubles(bArr, byteOrder);
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, double... dArr) {
        return org.apache.commons.imaging.common.ByteConversions.toBytes(dArr, byteOrder);
    }
}
