package org.apache.commons.imaging.formats.tiff.fieldtypes;

/* loaded from: classes17.dex */
public class FieldTypeByte extends org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType {
    public FieldTypeByte(int i, java.lang.String str) {
        super(i, str, 1);
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public java.lang.Object getValue(org.apache.commons.imaging.formats.tiff.TiffField tiffField) {
        byte[] byteArrayValue = tiffField.getByteArrayValue();
        return tiffField.getCount() == 1 ? java.lang.Byte.valueOf(byteArrayValue[0]) : byteArrayValue;
    }

    @Override // org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType
    public byte[] writeData(java.lang.Object obj, java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException {
        if (obj instanceof java.lang.Byte) {
            return new byte[]{((java.lang.Byte) obj).byteValue()};
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new org.apache.commons.imaging.ImageWriteException("Invalid data", obj);
    }
}
