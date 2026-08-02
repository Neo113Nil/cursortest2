package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfoAscii extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    public TagInfoAscii(java.lang.String str, int i, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.ASCII, i2, tiffDirectoryType);
    }

    public java.lang.String[] getValue(java.nio.ByteOrder byteOrder, byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < bArr.length - 1; i2++) {
            if (bArr[i2] == 0) {
                i++;
            }
        }
        java.lang.String[] strArr = new java.lang.String[i + 1];
        strArr[0] = "";
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < bArr.length; i5++) {
            if (bArr[i5] == 0) {
                strArr[i4] = new java.lang.String(bArr, i3, i5 - i3, java.nio.charset.StandardCharsets.UTF_8);
                i4++;
                i3 = i5 + 1;
            }
        }
        if (i3 < bArr.length) {
            strArr[i4] = new java.lang.String(bArr, i3, bArr.length - i3, java.nio.charset.StandardCharsets.UTF_8);
        }
        return strArr;
    }

    public byte[] encodeValue(java.nio.ByteOrder byteOrder, java.lang.String... strArr) throws org.apache.commons.imaging.ImageWriteException {
        return org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.ASCII.writeData(strArr, byteOrder);
    }
}
