package org.apache.commons.imaging.icc;

/* loaded from: classes17.dex */
public class IccTag {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.icc.IccTag.class.getName());
    private byte[] data;
    private int dataTypeSignature;
    public final org.apache.commons.imaging.icc.IccTagType fIccTagType;
    private org.apache.commons.imaging.icc.IccTagDataType itdt;
    public final int length;
    public final int offset;
    public final int signature;

    public IccTag(int i, int i2, int i3, org.apache.commons.imaging.icc.IccTagType iccTagType) {
        this.signature = i;
        this.offset = i2;
        this.length = i3;
        this.fIccTagType = iccTagType;
    }

    public void setData(byte[] bArr) throws java.io.IOException {
        this.data = bArr;
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            int read4Bytes = org.apache.commons.imaging.common.BinaryFunctions.read4Bytes("data type signature", byteArrayInputStream, "ICC: corrupt tag data", java.nio.ByteOrder.BIG_ENDIAN);
            this.dataTypeSignature = read4Bytes;
            this.itdt = getIccTagDataType(read4Bytes);
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

    private org.apache.commons.imaging.icc.IccTagDataType getIccTagDataType(int i) {
        for (org.apache.commons.imaging.icc.IccTagDataTypes iccTagDataTypes : org.apache.commons.imaging.icc.IccTagDataTypes.values()) {
            if (iccTagDataTypes.getSignature() == i) {
                return iccTagDataTypes;
            }
        }
        return null;
    }

    public void dump(java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
            try {
                dump(printWriter, str);
                printWriter.flush();
                stringWriter.flush();
                LOGGER.fine(stringWriter.toString());
                printWriter.close();
                stringWriter.close();
            } finally {
            }
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    stringWriter.close();
                } catch (java.lang.Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public void dump(java.io.PrintWriter printWriter, java.lang.String str) throws org.apache.commons.imaging.ImageReadException, java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("tag signature: ");
        sb.append(java.lang.Integer.toHexString(this.signature));
        sb.append(" (");
        int i = this.signature;
        sb.append(new java.lang.String(new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)}, java.nio.charset.StandardCharsets.US_ASCII));
        sb.append(")");
        printWriter.println(sb.toString());
        if (this.data == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.PREFIX_DATA);
            sb2.append(java.util.Arrays.toString(this.data));
            printWriter.println(sb2.toString());
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append(com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.PREFIX_DATA);
            sb3.append(this.data.length);
            printWriter.println(sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("data type signature: ");
            sb4.append(java.lang.Integer.toHexString(this.dataTypeSignature));
            sb4.append(" (");
            int i2 = this.dataTypeSignature;
            sb4.append(new java.lang.String(new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)}, java.nio.charset.StandardCharsets.US_ASCII));
            sb4.append(")");
            printWriter.println(sb4.toString());
            if (this.itdt == null) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                sb5.append(str);
                sb5.append("IccTagType : unknown");
                printWriter.println(sb5.toString());
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append("IccTagType : ");
                sb6.append(this.itdt.getName());
                printWriter.println(sb6.toString());
                this.itdt.dump(str, this.data);
            }
        }
        printWriter.println("");
        printWriter.flush();
    }
}
