package org.apache.commons.imaging.formats.tiff.fieldtypes;

/* loaded from: classes17.dex */
public abstract class FieldType {
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> ANY;
    public static final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii ASCII;
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> ASCII_OR_BYTE;
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> ASCII_OR_RATIONAL;
    public static final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte BYTE;
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> BYTE_OR_SHORT;
    public static final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble DOUBLE;
    public static final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat FLOAT;
    public static final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong IFD;
    public static final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong LONG;
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> LONG_OR_IFD;
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> LONG_OR_SHORT;
    public static final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational RATIONAL;
    public static final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte SBYTE;
    public static final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort SHORT;
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> SHORT_OR_LONG;
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> SHORT_OR_LONG_OR_RATIONAL;
    public static final java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> SHORT_OR_RATIONAL;
    public static final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong SLONG;
    public static final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational SRATIONAL;
    public static final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort SSHORT;
    public static final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte UNDEFINED;
    private final int elementSize;

    /* renamed from: name, reason: collision with root package name */
    private final java.lang.String f7038name;
    private final int type;

    public abstract java.lang.Object getValue(org.apache.commons.imaging.formats.tiff.TiffField tiffField);

    public abstract byte[] writeData(java.lang.Object obj, java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException;

    static {
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte fieldTypeByte = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte(1, "Byte");
        BYTE = fieldTypeByte;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii fieldTypeAscii = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii(2, "ASCII");
        ASCII = fieldTypeAscii;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort(3, "Short");
        SHORT = fieldTypeShort;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong fieldTypeLong = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong(4, "Long");
        LONG = fieldTypeLong;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational fieldTypeRational = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational(5, "Rational");
        RATIONAL = fieldTypeRational;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte fieldTypeByte2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte(6, "SByte");
        SBYTE = fieldTypeByte2;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte fieldTypeByte3 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte(7, "Undefined");
        UNDEFINED = fieldTypeByte3;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort fieldTypeShort2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort(8, "SShort");
        SSHORT = fieldTypeShort2;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong fieldTypeLong2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong(9, "SLong");
        SLONG = fieldTypeLong2;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational fieldTypeRational2 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational(10, "SRational");
        SRATIONAL = fieldTypeRational2;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat fieldTypeFloat = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat(11, "Float");
        FLOAT = fieldTypeFloat;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble fieldTypeDouble = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble(12, "Double");
        DOUBLE = fieldTypeDouble;
        org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong fieldTypeLong3 = new org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong(13, "IFD");
        IFD = fieldTypeLong3;
        ANY = java.util.Collections.unmodifiableList(java.util.Arrays.asList(fieldTypeByte, fieldTypeAscii, fieldTypeShort, fieldTypeLong, fieldTypeRational, fieldTypeByte2, fieldTypeByte3, fieldTypeShort2, fieldTypeLong2, fieldTypeRational2, fieldTypeFloat, fieldTypeDouble, fieldTypeLong3));
        SHORT_OR_LONG = java.util.Collections.unmodifiableList(java.util.Arrays.asList(fieldTypeShort, fieldTypeLong));
        SHORT_OR_RATIONAL = java.util.Collections.unmodifiableList(java.util.Arrays.asList(fieldTypeShort, fieldTypeRational));
        SHORT_OR_LONG_OR_RATIONAL = java.util.Collections.unmodifiableList(java.util.Arrays.asList(fieldTypeShort, fieldTypeLong, fieldTypeRational));
        LONG_OR_SHORT = java.util.Collections.unmodifiableList(java.util.Arrays.asList(fieldTypeShort, fieldTypeLong));
        BYTE_OR_SHORT = java.util.Collections.unmodifiableList(java.util.Arrays.asList(fieldTypeShort, fieldTypeByte));
        LONG_OR_IFD = java.util.Collections.unmodifiableList(java.util.Arrays.asList(fieldTypeLong, fieldTypeLong3));
        ASCII_OR_RATIONAL = java.util.Collections.unmodifiableList(java.util.Arrays.asList(fieldTypeAscii, fieldTypeRational));
        ASCII_OR_BYTE = java.util.Collections.unmodifiableList(java.util.Arrays.asList(fieldTypeAscii, fieldTypeByte));
    }

    protected FieldType(int i, java.lang.String str, int i2) {
        this.type = i;
        this.f7038name = str;
        this.elementSize = i2;
    }

    public int getType() {
        return this.type;
    }

    public java.lang.String getName() {
        return this.f7038name;
    }

    public int getSize() {
        return this.elementSize;
    }

    public static org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType getFieldType(int i) throws org.apache.commons.imaging.ImageReadException {
        for (org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType : ANY) {
            if (fieldType.getType() == i) {
                return fieldType;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Field type ");
        sb.append(i);
        sb.append(" is unsupported");
        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
    }
}
