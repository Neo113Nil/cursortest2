package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoXpString extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoXpString(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.BYTE, -1, tiffDirectoryType);
    }

    @Override // org.apache.commons.imaging.formats.tiff.taginfos.TagInfo
    public byte[] encodeValue(org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType, java.lang.Object obj, java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException {
        if (!(obj instanceof java.lang.String)) {
            throw new org.apache.commons.imaging.ImageWriteException("Text value not String", obj);
        }
        byte[] bytes = ((java.lang.String) obj).getBytes(java.nio.charset.StandardCharsets.UTF_16LE);
        byte[] bArr = new byte[bytes.length + 2];
        java.lang.System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    @Override // org.apache.commons.imaging.formats.tiff.taginfos.TagInfo
    public java.lang.String getValue(org.apache.commons.imaging.formats.tiff.TiffField tiffField) throws org.apache.commons.imaging.ImageReadException {
        int length;
        if (tiffField.getFieldType() != org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.BYTE) {
            throw new org.apache.commons.imaging.ImageReadException("Text field not encoded as bytes.");
        }
        byte[] byteArrayValue = tiffField.getByteArrayValue();
        if (byteArrayValue.length >= 2 && byteArrayValue[byteArrayValue.length - 1] == 0 && byteArrayValue[byteArrayValue.length - 2] == 0) {
            length = byteArrayValue.length - 2;
        } else {
            length = byteArrayValue.length;
        }
        return new java.lang.String(byteArrayValue, 0, length, java.nio.charset.StandardCharsets.UTF_16LE);
    }
}
