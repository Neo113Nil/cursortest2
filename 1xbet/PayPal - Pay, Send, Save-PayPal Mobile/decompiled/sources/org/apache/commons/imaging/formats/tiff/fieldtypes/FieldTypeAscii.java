package org.apache.commons.imaging.formats.tiff.fieldtypes;

/* loaded from: classes17.dex */
public class FieldTypeAscii extends org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType {
    public FieldTypeAscii(int i, java.lang.String str) {
        super(i, str, 1);
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public java.lang.Object getValue(org.apache.commons.imaging.formats.tiff.TiffField tiffField) {
        byte[] byteArrayValue = tiffField.getByteArrayValue();
        int i = 1;
        for (int i2 = 0; i2 < byteArrayValue.length - 1; i2++) {
            if (byteArrayValue[i2] == 0) {
                i++;
            }
        }
        java.lang.String[] strArr = new java.lang.String[i];
        strArr[0] = "";
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < byteArrayValue.length; i5++) {
            if (byteArrayValue[i5] == 0) {
                strArr[i4] = new java.lang.String(byteArrayValue, i3, i5 - i3, java.nio.charset.StandardCharsets.UTF_8);
                i4++;
                i3 = i5 + 1;
            }
        }
        if (i3 < byteArrayValue.length) {
            strArr[i4] = new java.lang.String(byteArrayValue, i3, byteArrayValue.length - i3, java.nio.charset.StandardCharsets.UTF_8);
        }
        return i == 1 ? strArr[0] : strArr;
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public byte[] writeData(java.lang.Object obj, java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length + 1];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr2[length] = 0;
            return bArr2;
        }
        if (obj instanceof java.lang.String) {
            byte[] bytes = ((java.lang.String) obj).getBytes(java.nio.charset.StandardCharsets.UTF_8);
            int length2 = bytes.length;
            byte[] bArr3 = new byte[length2 + 1];
            java.lang.System.arraycopy(bytes, 0, bArr3, 0, bytes.length);
            bArr3[length2] = 0;
            return bArr3;
        }
        if (obj instanceof java.lang.String[]) {
            java.lang.String[] strArr = (java.lang.String[]) obj;
            int i = 0;
            for (java.lang.String str : strArr) {
                i += str.getBytes(java.nio.charset.StandardCharsets.UTF_8).length + 1;
            }
            byte[] bArr4 = new byte[i];
            int i2 = 0;
            for (java.lang.String str2 : strArr) {
                byte[] bytes2 = str2.getBytes(java.nio.charset.StandardCharsets.UTF_8);
                java.lang.System.arraycopy(bytes2, 0, bArr4, i2, bytes2.length);
                i2 += bytes2.length + 1;
            }
            return bArr4;
        }
        throw new org.apache.commons.imaging.ImageWriteException("Unknown data type: ".concat(java.lang.String.valueOf(obj)));
    }
}
