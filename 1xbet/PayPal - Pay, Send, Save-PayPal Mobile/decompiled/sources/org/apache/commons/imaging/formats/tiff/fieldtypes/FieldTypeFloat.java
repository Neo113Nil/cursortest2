package org.apache.commons.imaging.formats.tiff.fieldtypes;

/* loaded from: classes17.dex */
public class FieldTypeFloat extends org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType {
    public FieldTypeFloat(int i, java.lang.String str) {
        super(i, str, 4);
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public java.lang.Object getValue(org.apache.commons.imaging.formats.tiff.TiffField tiffField) {
        byte[] byteArrayValue = tiffField.getByteArrayValue();
        if (tiffField.getCount() == 1) {
            return java.lang.Float.valueOf(org.apache.commons.imaging.common.ByteConversions.toFloat(byteArrayValue, tiffField.getByteOrder()));
        }
        return org.apache.commons.imaging.common.ByteConversions.toFloats(byteArrayValue, tiffField.getByteOrder());
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public byte[] writeData(java.lang.Object obj, java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException {
        if (obj instanceof java.lang.Float) {
            return org.apache.commons.imaging.common.ByteConversions.toBytes(((java.lang.Float) obj).floatValue(), byteOrder);
        }
        if (obj instanceof float[]) {
            return org.apache.commons.imaging.common.ByteConversions.toBytes((float[]) obj, byteOrder);
        }
        if (obj instanceof java.lang.Float[]) {
            java.lang.Float[] fArr = (java.lang.Float[]) obj;
            int length = fArr.length;
            float[] fArr2 = new float[length];
            for (int i = 0; i < length; i++) {
                fArr2[i] = fArr[i].floatValue();
            }
            return org.apache.commons.imaging.common.ByteConversions.toBytes(fArr2, byteOrder);
        }
        throw new org.apache.commons.imaging.ImageWriteException("Invalid data", obj);
    }
}
