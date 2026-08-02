package org.apache.commons.imaging.formats.tiff;

/* loaded from: classes17.dex */
public class TiffField {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.tiff.TiffField.class.getName());
    private final java.nio.ByteOrder byteOrder;
    private final long count;
    private final int directoryType;
    private final org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType;
    private final long offset;
    private final int sortHint;
    private final int tag;
    private final org.apache.commons.imaging.formats.tiff.taginfos.TagInfo tagInfo;
    private final byte[] value;

    public TiffField(int i, int i2, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType, long j, long j2, byte[] bArr, java.nio.ByteOrder byteOrder, int i3) {
        this.tag = i;
        this.directoryType = i2;
        this.fieldType = fieldType;
        this.count = j;
        this.offset = j2;
        this.value = bArr;
        this.byteOrder = byteOrder;
        this.sortHint = i3;
        this.tagInfo = org.apache.commons.imaging.formats.tiff.TiffTags.getTag(i2, i);
    }

    public int getDirectoryType() {
        return this.directoryType;
    }

    public org.apache.commons.imaging.formats.tiff.taginfos.TagInfo getTagInfo() {
        return this.tagInfo;
    }

    public int getTag() {
        return this.tag;
    }

    public org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType getFieldType() {
        return this.fieldType;
    }

    public long getCount() {
        return this.count;
    }

    public int getOffset() {
        return (int) this.offset;
    }

    public java.nio.ByteOrder getByteOrder() {
        return this.byteOrder;
    }

    public int getSortHint() {
        return this.sortHint;
    }

    public boolean isLocalValue() {
        return this.count * ((long) this.fieldType.getSize()) <= 4;
    }

    public int getBytesLength() {
        return ((int) this.count) * this.fieldType.getSize();
    }

    public byte[] getByteArrayValue() {
        return org.apache.commons.imaging.common.BinaryFunctions.head(this.value, getBytesLength());
    }

    public final class OversizeValueElement extends org.apache.commons.imaging.formats.tiff.TiffElement {
        public OversizeValueElement(int i, int i2) {
            super(i, i2);
        }

        @Override // org.apache.commons.imaging.formats.tiff.TiffElement
        public final java.lang.String getElementDescription() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OversizeValueElement, tag: ");
            sb.append(org.apache.commons.imaging.formats.tiff.TiffField.this.getTagInfo().f7039name);
            sb.append(", fieldType: ");
            sb.append(org.apache.commons.imaging.formats.tiff.TiffField.this.getFieldType().getName());
            return sb.toString();
        }
    }

    public org.apache.commons.imaging.formats.tiff.TiffElement getOversizeValueElement() {
        if (isLocalValue()) {
            return null;
        }
        return new org.apache.commons.imaging.formats.tiff.TiffField.OversizeValueElement(getOffset(), this.value.length);
    }

    public java.lang.String getValueDescription() {
        try {
            return getValueDescription(getValue());
        } catch (org.apache.commons.imaging.ImageReadException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid value: ");
            sb.append(e.getMessage());
            return sb.toString();
        }
    }

    private java.lang.String getValueDescription(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.lang.Number) {
            return obj.toString();
        }
        if (obj instanceof java.lang.String) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
            sb.append(obj.toString().trim());
            sb.append("'");
            return sb.toString();
        }
        if (obj instanceof java.util.Date) {
            return new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", java.util.Locale.ENGLISH).format((java.util.Date) obj);
        }
        int i = 0;
        if (obj instanceof java.lang.Object[]) {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            while (true) {
                if (i >= objArr.length) {
                    break;
                }
                java.lang.Object obj2 = objArr[i];
                if (i > 50) {
                    sb2.append("... (");
                    sb2.append(objArr.length);
                    sb2.append(")");
                    break;
                }
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(obj2.toString());
                i++;
            }
            return sb2.toString();
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            while (true) {
                if (i >= sArr.length) {
                    break;
                }
                short s = sArr[i];
                if (i > 50) {
                    sb3.append("... (");
                    sb3.append(sArr.length);
                    sb3.append(")");
                    break;
                }
                if (i > 0) {
                    sb3.append(", ");
                }
                sb3.append((int) s);
                i++;
            }
            return sb3.toString();
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            while (true) {
                if (i >= iArr.length) {
                    break;
                }
                int i2 = iArr[i];
                if (i > 50) {
                    sb4.append("... (");
                    sb4.append(iArr.length);
                    sb4.append(")");
                    break;
                }
                if (i > 0) {
                    sb4.append(", ");
                }
                sb4.append(i2);
                i++;
            }
            return sb4.toString();
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            while (true) {
                if (i >= jArr.length) {
                    break;
                }
                long j = jArr[i];
                if (i > 50) {
                    sb5.append("... (");
                    sb5.append(jArr.length);
                    sb5.append(")");
                    break;
                }
                if (i > 0) {
                    sb5.append(", ");
                }
                sb5.append(j);
                i++;
            }
            return sb5.toString();
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            while (true) {
                if (i >= dArr.length) {
                    break;
                }
                double d = dArr[i];
                if (i > 50) {
                    sb6.append("... (");
                    sb6.append(dArr.length);
                    sb6.append(")");
                    break;
                }
                if (i > 0) {
                    sb6.append(", ");
                }
                sb6.append(d);
                i++;
            }
            return sb6.toString();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            while (true) {
                if (i >= bArr.length) {
                    break;
                }
                byte b = bArr[i];
                if (i > 50) {
                    sb7.append("... (");
                    sb7.append(bArr.length);
                    sb7.append(")");
                    break;
                }
                if (i > 0) {
                    sb7.append(", ");
                }
                sb7.append((int) b);
                i++;
            }
            return sb7.toString();
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            while (true) {
                if (i >= cArr.length) {
                    break;
                }
                char c = cArr[i];
                if (i > 50) {
                    sb8.append("... (");
                    sb8.append(cArr.length);
                    sb8.append(")");
                    break;
                }
                if (i > 0) {
                    sb8.append(", ");
                }
                sb8.append(c);
                i++;
            }
            return sb8.toString();
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            while (true) {
                if (i >= fArr.length) {
                    break;
                }
                float f = fArr[i];
                if (i > 50) {
                    sb9.append("... (");
                    sb9.append(fArr.length);
                    sb9.append(")");
                    break;
                }
                if (i > 0) {
                    sb9.append(", ");
                }
                sb9.append(f);
                i++;
            }
            return sb9.toString();
        }
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Unknown: ");
        sb10.append(obj.getClass().getName());
        return sb10.toString();
    }

    public void dump() {
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            try {
                java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
                try {
                    dump(printWriter);
                    printWriter.flush();
                    stringWriter.flush();
                    LOGGER.fine(stringWriter.toString());
                    printWriter.close();
                    stringWriter.close();
                } finally {
                }
            } finally {
            }
        } catch (java.io.IOException e) {
            LOGGER.log(java.util.logging.Level.SEVERE, e.getMessage(), (java.lang.Throwable) e);
        }
    }

    public void dump(java.io.PrintWriter printWriter) {
        dump(printWriter, null);
    }

    public void dump(java.io.PrintWriter printWriter, java.lang.String str) {
        if (str != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(": ");
            printWriter.print(sb.toString());
        }
        printWriter.println(toString());
        printWriter.flush();
    }

    public java.lang.String getDescriptionWithoutValue() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getTag());
        sb.append(" (0x");
        sb.append(java.lang.Integer.toHexString(getTag()));
        sb.append(": ");
        sb.append(getTagInfo().f7039name);
        sb.append("): ");
        return sb.toString();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getTag());
        sb.append(" (0x");
        sb.append(java.lang.Integer.toHexString(getTag()));
        sb.append(": ");
        sb.append(getTagInfo().f7039name);
        sb.append("): ");
        sb.append(getValueDescription());
        sb.append(" (");
        sb.append(getCount());
        sb.append(" ");
        sb.append(getFieldType().getName());
        sb.append(")");
        return sb.toString();
    }

    public java.lang.String getTagName() {
        if (getTagInfo() == org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants.TIFF_TAG_UNKNOWN) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getTagInfo().f7039name);
            sb.append(" (0x");
            sb.append(java.lang.Integer.toHexString(getTag()));
            sb.append(")");
            return sb.toString();
        }
        return getTagInfo().f7039name;
    }

    public java.lang.String getFieldTypeName() {
        return getFieldType().getName();
    }

    public java.lang.Object getValue() throws org.apache.commons.imaging.ImageReadException {
        return getTagInfo().getValue(this);
    }

    public java.lang.String getStringValue() throws org.apache.commons.imaging.ImageReadException {
        java.lang.Object value = getValue();
        if (value == null) {
            return null;
        }
        if (!(value instanceof java.lang.String)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected String value(");
            sb.append(getTagInfo().getDescription());
            sb.append("): ");
            sb.append(value);
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        return (java.lang.String) value;
    }

    public int[] getIntArrayValue() throws org.apache.commons.imaging.ImageReadException {
        java.lang.Object value = getValue();
        if (value instanceof java.lang.Number) {
            return new int[]{((java.lang.Number) value).intValue()};
        }
        int i = 0;
        if (value instanceof java.lang.Number[]) {
            java.lang.Number[] numberArr = (java.lang.Number[]) value;
            int[] iArr = new int[numberArr.length];
            while (i < numberArr.length) {
                iArr[i] = numberArr[i].intValue();
                i++;
            }
            return iArr;
        }
        if (value instanceof short[]) {
            short[] sArr = (short[]) value;
            int[] iArr2 = new int[sArr.length];
            while (i < sArr.length) {
                iArr2[i] = 65535 & sArr[i];
                i++;
            }
            return iArr2;
        }
        if (value instanceof int[]) {
            int[] iArr3 = (int[]) value;
            int[] iArr4 = new int[iArr3.length];
            java.lang.System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            return iArr4;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown value: ");
        sb.append(value);
        sb.append(" for: ");
        sb.append(getTagInfo().getDescription());
        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
    }

    public double[] getDoubleArrayValue() throws org.apache.commons.imaging.ImageReadException {
        java.lang.Object value = getValue();
        int i = 0;
        if (value instanceof java.lang.Number) {
            return new double[]{((java.lang.Number) value).doubleValue()};
        }
        if (value instanceof java.lang.Number[]) {
            java.lang.Number[] numberArr = (java.lang.Number[]) value;
            double[] dArr = new double[numberArr.length];
            while (i < numberArr.length) {
                dArr[i] = numberArr[i].doubleValue();
                i++;
            }
            return dArr;
        }
        if (value instanceof short[]) {
            short[] sArr = (short[]) value;
            double[] dArr2 = new double[sArr.length];
            while (i < sArr.length) {
                dArr2[i] = sArr[i];
                i++;
            }
            return dArr2;
        }
        if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            double[] dArr3 = new double[iArr.length];
            while (i < iArr.length) {
                dArr3[i] = iArr[i];
                i++;
            }
            return dArr3;
        }
        if (value instanceof float[]) {
            float[] fArr = (float[]) value;
            double[] dArr4 = new double[fArr.length];
            while (i < fArr.length) {
                dArr4[i] = fArr[i];
                i++;
            }
            return dArr4;
        }
        if (value instanceof double[]) {
            double[] dArr5 = (double[]) value;
            double[] dArr6 = new double[dArr5.length];
            java.lang.System.arraycopy(dArr5, 0, dArr6, 0, dArr5.length);
            return dArr6;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown value: ");
        sb.append(value);
        sb.append(" for: ");
        sb.append(getTagInfo().getDescription());
        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
    }

    public int getIntValueOrArraySum() throws org.apache.commons.imaging.ImageReadException {
        java.lang.Object value = getValue();
        if (value instanceof java.lang.Number) {
            return ((java.lang.Number) value).intValue();
        }
        int i = 0;
        if (value instanceof java.lang.Number[]) {
            java.lang.Number[] numberArr = (java.lang.Number[]) value;
            int length = numberArr.length;
            int i2 = 0;
            while (i < length) {
                i2 += numberArr[i].intValue();
                i++;
            }
            return i2;
        }
        if (value instanceof short[]) {
            short[] sArr = (short[]) value;
            int length2 = sArr.length;
            int i3 = 0;
            while (i < length2) {
                i3 += sArr[i];
                i++;
            }
            return i3;
        }
        if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            int length3 = iArr.length;
            int i4 = 0;
            while (i < length3) {
                i4 += iArr[i];
                i++;
            }
            return i4;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown value: ");
        sb.append(value);
        sb.append(" for: ");
        sb.append(getTagInfo().getDescription());
        throw new org.apache.commons.imaging.ImageReadException(sb.toString());
    }

    public int getIntValue() throws org.apache.commons.imaging.ImageReadException {
        java.lang.Object value = getValue();
        if (value == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Missing value: ");
            sb.append(getTagInfo().getDescription());
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        return ((java.lang.Number) value).intValue();
    }

    public double getDoubleValue() throws org.apache.commons.imaging.ImageReadException {
        java.lang.Object value = getValue();
        if (value == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Missing value: ");
            sb.append(getTagInfo().getDescription());
            throw new org.apache.commons.imaging.ImageReadException(sb.toString());
        }
        return ((java.lang.Number) value).doubleValue();
    }
}
