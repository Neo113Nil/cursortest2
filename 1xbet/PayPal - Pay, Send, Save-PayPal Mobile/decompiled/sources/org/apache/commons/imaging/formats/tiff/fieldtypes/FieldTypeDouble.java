package org.apache.commons.imaging.formats.tiff.fieldtypes;

/* loaded from: classes17.dex */
public class FieldTypeDouble extends org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType {
    public FieldTypeDouble(int i, java.lang.String str) {
        super(i, str, 8);
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public java.lang.Object getValue(org.apache.commons.imaging.formats.tiff.TiffField tiffField) {
        byte[] byteArrayValue = tiffField.getByteArrayValue();
        if (tiffField.getCount() == 1) {
            return java.lang.Double.valueOf(org.apache.commons.imaging.common.ByteConversions.toDouble(byteArrayValue, tiffField.getByteOrder()));
        }
        return org.apache.commons.imaging.common.ByteConversions.toDoubles(byteArrayValue, tiffField.getByteOrder());
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public byte[] writeData(java.lang.Object obj, java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException {
        if (obj instanceof java.lang.Double) {
            return org.apache.commons.imaging.common.ByteConversions.toBytes(((java.lang.Double) obj).doubleValue(), byteOrder);
        }
        if (obj instanceof double[]) {
            return org.apache.commons.imaging.common.ByteConversions.toBytes((double[]) obj, byteOrder);
        }
        if (obj instanceof java.lang.Double[]) {
            java.lang.Double[] dArr = (java.lang.Double[]) obj;
            int length = dArr.length;
            double[] dArr2 = new double[length];
            for (int i = 0; i < length; i++) {
                dArr2[i] = dArr[i].doubleValue();
            }
            return org.apache.commons.imaging.common.ByteConversions.toBytes(dArr2, byteOrder);
        }
        throw new org.apache.commons.imaging.ImageWriteException("Invalid data", obj);
    }
}
