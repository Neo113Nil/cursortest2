package org.apache.commons.imaging.formats.tiff.write;

/* loaded from: classes17.dex */
public class TiffOutputField {
    private static final java.lang.String NEWLINE = java.lang.System.getProperty("line.separator");
    private byte[] bytes;
    public final int count;
    public final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType;
    private final org.apache.commons.imaging.formats.tiff.write.TiffOutputItem.Value separateValueItem;
    private int sortHint;
    public final int tag;
    public final org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo;

    public TiffOutputField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType, int i, byte[] bArr) {
        this(tagInfo.tag, tagInfo, fieldType, i, bArr);
    }

    public TiffOutputField(int i, org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType, int i2, byte[] bArr) {
        this.sortHint = -1;
        this.tag = i;
        this.tagInfo = tagInfo;
        this.fieldType = fieldType;
        this.count = i2;
        this.bytes = bArr;
        if (isLocalValue()) {
            this.separateValueItem = null;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Field Separate value (");
        sb.append(tagInfo.getDescription());
        sb.append(")");
        this.separateValueItem = new org.apache.commons.imaging.formats.tiff.write.TiffOutputItem.Value(sb.toString(), bArr);
    }

    protected static org.apache.commons.imaging.formats.tiff.write.TiffOutputField createOffsetField(org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo, java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException {
        return new org.apache.commons.imaging.formats.tiff.write.TiffOutputField(tagInfo, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG, 1, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.LONG.writeData(0, byteOrder));
    }

    protected void writeField(org.apache.commons.imaging.common.BinaryOutputStream binaryOutputStream) throws java.io.IOException, org.apache.commons.imaging.ImageWriteException {
        binaryOutputStream.write2Bytes(this.tag);
        binaryOutputStream.write2Bytes(this.fieldType.getType());
        binaryOutputStream.write4Bytes(this.count);
        if (isLocalValue()) {
            if (this.separateValueItem != null) {
                throw new org.apache.commons.imaging.ImageWriteException("Unexpected separate value item.");
            }
            byte[] bArr = this.bytes;
            if (bArr.length > 4) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Local value has invalid length: ");
                sb.append(this.bytes.length);
                throw new org.apache.commons.imaging.ImageWriteException(sb.toString());
            }
            binaryOutputStream.write(bArr);
            int length = this.bytes.length;
            for (int i = 0; i < 4 - length; i++) {
                binaryOutputStream.write(0);
            }
            return;
        }
        org.apache.commons.imaging.formats.tiff.write.TiffOutputItem.Value value = this.separateValueItem;
        if (value == null) {
            throw new org.apache.commons.imaging.ImageWriteException("Missing separate value item.");
        }
        binaryOutputStream.write4Bytes((int) value.getOffset());
    }

    protected org.apache.commons.imaging.formats.tiff.write.TiffOutputItem getSeperateValue() {
        return this.separateValueItem;
    }

    protected final boolean isLocalValue() {
        return this.bytes.length <= 4;
    }

    public boolean bytesEqual(byte[] bArr) {
        return java.util.Arrays.equals(this.bytes, bArr);
    }

    protected void setData(byte[] bArr) throws org.apache.commons.imaging.ImageWriteException {
        if (this.bytes.length != bArr.length) {
            throw new org.apache.commons.imaging.ImageWriteException("Cannot change size of value.");
        }
        this.bytes = bArr;
        org.apache.commons.imaging.formats.tiff.write.TiffOutputItem.Value value = this.separateValueItem;
        if (value != null) {
            value.updateValue(bArr);
        }
    }

    public java.lang.String toString() {
        return toString(null);
    }

    public java.lang.String toString(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(this.tagInfo);
        java.lang.String str2 = NEWLINE;
        sb.append(str2);
        sb.append(str);
        sb.append("count: ");
        sb.append(this.count);
        sb.append(str2);
        sb.append(str);
        sb.append(this.fieldType);
        sb.append(str2);
        return sb.toString();
    }

    public int getSortHint() {
        return this.sortHint;
    }

    public void setSortHint(int i) {
        this.sortHint = i;
    }
}
