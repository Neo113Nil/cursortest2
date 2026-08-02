package org.apache.commons.imaging.formats.tiff.fieldtypes;

/* loaded from: classes17.dex */
public class FieldTypeRational extends org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType {
    public FieldTypeRational(int i, java.lang.String str) {
        super(i, str, 8);
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public java.lang.Object getValue(org.apache.commons.imaging.formats.tiff.TiffField tiffField) {
        byte[] byteArrayValue = tiffField.getByteArrayValue();
        if (tiffField.getCount() == 1) {
            return org.apache.commons.imaging.common.ByteConversions.toRational(byteArrayValue, tiffField.getByteOrder());
        }
        return org.apache.commons.imaging.common.ByteConversions.toRationals(byteArrayValue, tiffField.getByteOrder());
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public byte[] writeData(java.lang.Object obj, java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException {
        if (obj instanceof org.apache.commons.imaging.common.RationalNumber) {
            return org.apache.commons.imaging.common.ByteConversions.toBytes((org.apache.commons.imaging.common.RationalNumber) obj, byteOrder);
        }
        if (obj instanceof org.apache.commons.imaging.common.RationalNumber[]) {
            return org.apache.commons.imaging.common.ByteConversions.toBytes((org.apache.commons.imaging.common.RationalNumber[]) obj, byteOrder);
        }
        if (obj instanceof java.lang.Number) {
            return org.apache.commons.imaging.common.ByteConversions.toBytes(org.apache.commons.imaging.common.RationalNumber.valueOf(((java.lang.Number) obj).doubleValue()), byteOrder);
        }
        int i = 0;
        if (obj instanceof java.lang.Number[]) {
            java.lang.Number[] numberArr = (java.lang.Number[]) obj;
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArr = new org.apache.commons.imaging.common.RationalNumber[numberArr.length];
            while (i < numberArr.length) {
                rationalNumberArr[i] = org.apache.commons.imaging.common.RationalNumber.valueOf(numberArr[i].doubleValue());
                i++;
            }
            return org.apache.commons.imaging.common.ByteConversions.toBytes(rationalNumberArr, byteOrder);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            org.apache.commons.imaging.common.RationalNumber[] rationalNumberArr2 = new org.apache.commons.imaging.common.RationalNumber[dArr.length];
            while (i < dArr.length) {
                rationalNumberArr2[i] = org.apache.commons.imaging.common.RationalNumber.valueOf(dArr[i]);
                i++;
            }
            return org.apache.commons.imaging.common.ByteConversions.toBytes(rationalNumberArr2, byteOrder);
        }
        throw new org.apache.commons.imaging.ImageWriteException("Invalid data", obj);
    }
}
