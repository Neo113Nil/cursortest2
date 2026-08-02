package org.apache.commons.imaging.formats.tiff.fieldtypes;

/* loaded from: classes17.dex */
public class FieldTypeLong extends org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType {
    public FieldTypeLong(int i, java.lang.String str) {
        super(i, str, 4);
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public java.lang.Object getValue(org.apache.commons.imaging.formats.tiff.TiffField tiffField) {
        byte[] byteArrayValue = tiffField.getByteArrayValue();
        if (tiffField.getCount() == 1) {
            return java.lang.Integer.valueOf(org.apache.commons.imaging.common.ByteConversions.toInt(byteArrayValue, tiffField.getByteOrder()));
        }
        return org.apache.commons.imaging.common.ByteConversions.toInts(byteArrayValue, tiffField.getByteOrder());
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public byte[] writeData(java.lang.Object obj, java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException {
        if (obj instanceof java.lang.Integer) {
            return org.apache.commons.imaging.common.ByteConversions.toBytes(((java.lang.Integer) obj).intValue(), byteOrder);
        }
        if (obj instanceof int[]) {
            return org.apache.commons.imaging.common.ByteConversions.toBytes((int[]) obj, byteOrder);
        }
        if (obj instanceof java.lang.Integer[]) {
            java.lang.Integer[] numArr = (java.lang.Integer[]) obj;
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = numArr[i].intValue();
            }
            return org.apache.commons.imaging.common.ByteConversions.toBytes(iArr, byteOrder);
        }
        throw new org.apache.commons.imaging.ImageWriteException("Invalid data", obj);
    }
}
