package org.apache.commons.imaging.formats.tiff.taginfos;

/* loaded from: classes17.dex */
public final class TagInfoGpsText extends org.apache.commons.imaging.formats.tiff.taginfos.TagInfo {
    private static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding[] TEXT_ENCODINGS;
    private static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding TEXT_ENCODING_ASCII;
    private static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding TEXT_ENCODING_JIS;
    private static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding TEXT_ENCODING_UNDEFINED;
    private static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding TEXT_ENCODING_UNICODE_BE;
    private static final org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding TEXT_ENCODING_UNICODE_LE;

    @Override // org.apache.commons.imaging.formats.tiff.taginfos.TagInfo
    public final boolean isText() {
        return true;
    }

    static {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding textEncoding = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding(new byte[]{65, 83, 67, 73, 73, 0, 0, 0}, "US-ASCII");
        TEXT_ENCODING_ASCII = textEncoding;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding textEncoding2 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding(new byte[]{74, 73, 83, 0, 0, 0, 0, 0}, "JIS");
        TEXT_ENCODING_JIS = textEncoding2;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding textEncoding3 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding(new byte[]{85, 78, 73, 67, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 68, 69, 0}, codec.CharEncoding.UTF_16LE);
        TEXT_ENCODING_UNICODE_LE = textEncoding3;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding textEncoding4 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding(new byte[]{85, 78, 73, 67, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 68, 69, 0}, codec.CharEncoding.UTF_16BE);
        TEXT_ENCODING_UNICODE_BE = textEncoding4;
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding textEncoding5 = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding(new byte[]{0, 0, 0, 0, 0, 0, 0, 0}, "ISO-8859-1");
        TEXT_ENCODING_UNDEFINED = textEncoding5;
        TEXT_ENCODINGS = new org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding[]{textEncoding, textEncoding2, textEncoding3, textEncoding4, textEncoding5};
    }

    public TagInfoGpsText(java.lang.String str, int i, org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType tiffDirectoryType) {
        super(str, i, org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.UNDEFINED, -1, tiffDirectoryType);
    }

    static final class TextEncoding {
        public final java.lang.String encodingName;
        final byte[] prefix;

        TextEncoding(byte[] bArr, java.lang.String str) {
            this.prefix = bArr;
            this.encodingName = str;
        }
    }

    @Override // org.apache.commons.imaging.formats.tiff.taginfos.TagInfo
    public final byte[] encodeValue(org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType fieldType, java.lang.Object obj, java.nio.ByteOrder byteOrder) throws org.apache.commons.imaging.ImageWriteException {
        org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding textEncoding;
        if (!(obj instanceof java.lang.String)) {
            throw new org.apache.commons.imaging.ImageWriteException("GPS text value not String", obj);
        }
        java.lang.String str = (java.lang.String) obj;
        try {
            org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding textEncoding2 = TEXT_ENCODING_ASCII;
            byte[] bytes = str.getBytes(textEncoding2.encodingName);
            if (new java.lang.String(bytes, textEncoding2.encodingName).equals(str)) {
                byte[] bArr = new byte[bytes.length + textEncoding2.prefix.length];
                java.lang.System.arraycopy(textEncoding2.prefix, 0, bArr, 0, textEncoding2.prefix.length);
                java.lang.System.arraycopy(bytes, 0, bArr, textEncoding2.prefix.length, bytes.length);
                return bArr;
            }
            if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
                textEncoding = TEXT_ENCODING_UNICODE_BE;
            } else {
                textEncoding = TEXT_ENCODING_UNICODE_LE;
            }
            byte[] bytes2 = str.getBytes(textEncoding.encodingName);
            byte[] bArr2 = new byte[bytes2.length + textEncoding.prefix.length];
            java.lang.System.arraycopy(textEncoding.prefix, 0, bArr2, 0, textEncoding.prefix.length);
            java.lang.System.arraycopy(bytes2, 0, bArr2, textEncoding.prefix.length, bytes2.length);
            return bArr2;
        } catch (java.io.UnsupportedEncodingException e) {
            throw new org.apache.commons.imaging.ImageWriteException(e.getMessage(), (java.lang.Throwable) e);
        }
    }

    @Override // org.apache.commons.imaging.formats.tiff.taginfos.TagInfo
    public final java.lang.String getValue(org.apache.commons.imaging.formats.tiff.TiffField tiffField) throws org.apache.commons.imaging.ImageReadException {
        if (tiffField.getFieldType() == org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.ASCII) {
            java.lang.Object value = org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.ASCII.getValue(tiffField);
            if (value instanceof java.lang.String) {
                return (java.lang.String) value;
            }
            if (value instanceof java.lang.String[]) {
                return ((java.lang.String[]) value)[0];
            }
            throw new org.apache.commons.imaging.ImageReadException("Unexpected ASCII type decoded");
        }
        if (tiffField.getFieldType() != org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.UNDEFINED && tiffField.getFieldType() != org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType.BYTE) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("entry.type: ");
            sb.append(tiffField.getFieldType());
            org.apache.commons.imaging.internal.Debug.debug(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("entry.directoryType: ");
            sb2.append(tiffField.getDirectoryType());
            org.apache.commons.imaging.internal.Debug.debug(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("entry.type: ");
            sb3.append(tiffField.getDescriptionWithoutValue());
            org.apache.commons.imaging.internal.Debug.debug(sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("entry.type: ");
            sb4.append(tiffField.getFieldType());
            org.apache.commons.imaging.internal.Debug.debug(sb4.toString());
            throw new org.apache.commons.imaging.ImageReadException("GPS text field not encoded as bytes.");
        }
        byte[] byteArrayValue = tiffField.getByteArrayValue();
        if (byteArrayValue.length < 8) {
            return new java.lang.String(byteArrayValue, java.nio.charset.StandardCharsets.US_ASCII);
        }
        for (org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText.TextEncoding textEncoding : TEXT_ENCODINGS) {
            if (org.apache.commons.imaging.common.BinaryFunctions.compareBytes(byteArrayValue, 0, textEncoding.prefix, 0, textEncoding.prefix.length)) {
                try {
                    java.lang.String str = new java.lang.String(byteArrayValue, textEncoding.prefix.length, byteArrayValue.length - textEncoding.prefix.length, textEncoding.encodingName);
                    byte[] bytes = str.getBytes(textEncoding.encodingName);
                    if (org.apache.commons.imaging.common.BinaryFunctions.compareBytes(byteArrayValue, textEncoding.prefix.length, bytes, 0, bytes.length)) {
                        return str;
                    }
                } catch (java.io.UnsupportedEncodingException e) {
                    throw new org.apache.commons.imaging.ImageReadException(e.getMessage(), e);
                }
            }
        }
        return new java.lang.String(byteArrayValue, java.nio.charset.StandardCharsets.US_ASCII);
    }
}
