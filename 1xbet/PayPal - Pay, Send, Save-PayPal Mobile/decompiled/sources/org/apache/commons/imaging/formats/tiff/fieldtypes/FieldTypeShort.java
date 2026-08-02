package org.apache.commons.imaging.formats.tiff.fieldtypes;

/* loaded from: classes17.dex */
public class FieldTypeShort extends org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType {
    public FieldTypeShort(int i, java.lang.String str) {
        super(i, str, 2);
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public java.lang.Object getValue(org.apache.commons.imaging.formats.tiff.TiffField tiffField) {
        byte[] byteArrayValue = tiffField.getByteArrayValue();
        if (tiffField.getCount() == 1) {
            return java.lang.Short.valueOf(org.apache.commons.imaging.common.ByteConversions.toShort(byteArrayValue, tiffField.getByteOrder()));
        }
        return org.apache.commons.imaging.common.ByteConversions.toShorts(byteArrayValue, tiffField.getByteOrder());
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public byte[] writeData(java.lang.Object obj, java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException {
        if (obj instanceof java.lang.Short) {
            return org.apache.commons.imaging.common.ByteConversions.toBytes(((java.lang.Short) obj).shortValue(), byteOrder);
        }
        if (obj instanceof short[]) {
            return org.apache.commons.imaging.common.ByteConversions.toBytes((short[]) obj, byteOrder);
        }
        if (obj instanceof java.lang.Short[]) {
            java.lang.Short[] shArr = (java.lang.Short[]) obj;
            int length = shArr.length;
            short[] sArr = new short[length];
            for (int i = 0; i < length; i++) {
                sArr[i] = shArr[i].shortValue();
            }
            return org.apache.commons.imaging.common.ByteConversions.toBytes(sArr, byteOrder);
        }
        throw new org.apache.commons.imaging.ImageWriteException("Invalid data", obj);
    }
}
