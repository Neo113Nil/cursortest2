package org.apache.commons.imaging.icc;

/* loaded from: classes17.dex */
public enum IccTagDataTypes implements org.apache.commons.imaging.icc.IccTagDataType {
    DESC_TYPE("descType", 1684370275) { // from class: org.apache.commons.imaging.icc.IccTagDataTypes.1
        @Override // org.apache.commons.imaging.icc.IccTagDataType
        public final void dump(java.lang.String str, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            try {
                org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("type_signature", byteArrayInputStream, "ICC: corrupt tag data", java.nio.ByteOrder.BIG_ENDIAN);
                org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ignore", byteArrayInputStream, "ICC: corrupt tag data", java.nio.ByteOrder.BIG_ENDIAN);
                java.lang.String str2 = new java.lang.String(bArr, 12, org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("stringLength", byteArrayInputStream, "ICC: corrupt tag data", java.nio.ByteOrder.BIG_ENDIAN) - 1, java.nio.charset.StandardCharsets.US_ASCII);
                java.util.logging.Logger logger = org.apache.commons.imaging.icc.IccTagDataTypes.LOGGER;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append("s: '");
                sb.append(str2);
                sb.append("'");
                logger.fine(sb.toString());
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    },
    DATA_TYPE("dataType", androidx.media3.container.Mp4Box.TYPE_data) { // from class: org.apache.commons.imaging.icc.IccTagDataTypes.2
        @Override // org.apache.commons.imaging.icc.IccTagDataType
        public final void dump(java.lang.String str, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            try {
                org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("type_signature", byteArrayInputStream, "ICC: corrupt tag data", java.nio.ByteOrder.BIG_ENDIAN);
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    },
    MULTI_LOCALIZED_UNICODE_TYPE("multiLocalizedUnicodeType", 1835824483) { // from class: org.apache.commons.imaging.icc.IccTagDataTypes.3
        @Override // org.apache.commons.imaging.icc.IccTagDataType
        public final void dump(java.lang.String str, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            try {
                org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("type_signature", byteArrayInputStream, "ICC: corrupt tag data", java.nio.ByteOrder.BIG_ENDIAN);
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    },
    SIGNATURE_TYPE("signatureType", 1936287520) { // from class: org.apache.commons.imaging.icc.IccTagDataTypes.4
        @Override // org.apache.commons.imaging.icc.IccTagDataType
        public final void dump(java.lang.String str, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            try {
                org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("type_signature", byteArrayInputStream, "ICC: corrupt tag data", java.nio.ByteOrder.BIG_ENDIAN);
                org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ignore", byteArrayInputStream, "ICC: corrupt tag data", java.nio.ByteOrder.BIG_ENDIAN);
                int read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("thesignature ", byteArrayInputStream, "ICC: corrupt tag data", java.nio.ByteOrder.BIG_ENDIAN);
                java.util.logging.Logger logger = org.apache.commons.imaging.icc.IccTagDataTypes.LOGGER;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append("thesignature: ");
                sb.append(java.lang.Integer.toHexString(read4Bytes));
                sb.append(" (");
                sb.append(new java.lang.String(new byte[]{(byte) ((read4Bytes >> 24) & 255), (byte) ((read4Bytes >> 16) & 255), (byte) ((read4Bytes >> 8) & 255), (byte) (read4Bytes & 255)}, java.nio.charset.StandardCharsets.US_ASCII));
                sb.append(")");
                logger.fine(sb.toString());
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    },
    TEXT_TYPE("textType", 1952807028) { // from class: org.apache.commons.imaging.icc.IccTagDataTypes.5
        @Override // org.apache.commons.imaging.icc.IccTagDataType
        public final void dump(java.lang.String str, byte[] bArr) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            try {
                org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("type_signature", byteArrayInputStream, "ICC: corrupt tag data", java.nio.ByteOrder.BIG_ENDIAN);
                org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("ignore", byteArrayInputStream, "ICC: corrupt tag data", java.nio.ByteOrder.BIG_ENDIAN);
                java.lang.String str2 = new java.lang.String(bArr, 8, bArr.length - 8, java.nio.charset.StandardCharsets.US_ASCII);
                java.util.logging.Logger logger = org.apache.commons.imaging.icc.IccTagDataTypes.LOGGER;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append("s: '");
                sb.append(str2);
                sb.append("'");
                logger.fine(sb.toString());
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    };

    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.icc.IccTagDataTypes.class.getName());

    /* renamed from: name, reason: collision with root package name */
    public final java.lang.String f7041name;
    public final int signature;

    IccTagDataTypes(java.lang.String str, int i) {
        this.f7041name = str;
        this.signature = i;
    }

    @Override // org.apache.commons.imaging.icc.IccTagDataType
    public java.lang.String getName() {
        return this.f7041name;
    }

    @Override // org.apache.commons.imaging.icc.IccTagDataType
    public int getSignature() {
        return this.signature;
    }
}
