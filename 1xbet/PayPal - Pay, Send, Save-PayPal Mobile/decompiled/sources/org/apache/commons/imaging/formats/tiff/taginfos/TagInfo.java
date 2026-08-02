package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public class TagInfo {
    public static final int LENGTH_UNKNOWN = -1;
    public final java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> dataTypes;
    public final org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType directoryType;
    private final boolean isOffset;
    public final int length;

    /* renamed from: name, reason: collision with root package name */
    public final java.lang.String f7039name;
    public final int tag;

    public boolean isText() {
        return false;
    }

    public TagInfo(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        this(str, i, (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType>) java.util.Arrays.asList(fieldType), i2, tiffDirectoryType);
    }

    public TagInfo(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType, boolean z) {
        this(str, i, (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType>) java.util.Arrays.asList(fieldType), i2, tiffDirectoryType, z);
    }

    public TagInfo(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType, int i2) {
        this(str, i, (java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType>) java.util.Arrays.asList(fieldType), i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    }

    public TagInfo(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType) {
        this(str, i, fieldType, -1, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN);
    }

    public TagInfo(java.lang.String str, int i, java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> list, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        this(str, i, list, i2, tiffDirectoryType, false);
    }

    public TagInfo(java.lang.String str, int i, java.util.List<org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType> list, int i2, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType, boolean z) {
        this.f7039name = str;
        this.tag = i;
        this.dataTypes = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        this.length = i2;
        this.directoryType = tiffDirectoryType;
        this.isOffset = z;
    }

    public java.lang.Object getValue(org.apache.commons.imaging.formats.tiff.TiffField tiffField) throws org.apache.commons.imaging.ImageReadException {
        return tiffField.getFieldType().getValue(tiffField);
    }

    public byte[] encodeValue(org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType, java.lang.Object obj, java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException {
        return fieldType.writeData(obj, byteOrder);
    }

    public java.lang.String getDescription() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.tag);
        sb.append(" (0x");
        sb.append(java.lang.Integer.toHexString(this.tag));
        sb.append(": ");
        sb.append(this.f7039name);
        sb.append("): ");
        return sb.toString();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[TagInfo. tag: ");
        sb.append(this.tag);
        sb.append(" (0x");
        sb.append(java.lang.Integer.toHexString(this.tag));
        sb.append(", name: ");
        sb.append(this.f7039name);
        sb.append("]");
        return sb.toString();
    }

    public boolean isOffset() {
        return this.isOffset;
    }
}
