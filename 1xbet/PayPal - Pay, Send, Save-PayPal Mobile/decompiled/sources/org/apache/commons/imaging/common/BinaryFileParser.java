package org.apache.commons.imaging.common;

/* loaded from: classes17.dex */
public class BinaryFileParser {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.common.BinaryFileParser.class.getName());
    private java.nio.ByteOrder byteOrder;

    public BinaryFileParser(java.nio.ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    public BinaryFileParser() {
        this.byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
    }

    public void setByteOrder(java.nio.ByteOrder byteOrder) {
        this.byteOrder = byteOrder;
    }

    public java.nio.ByteOrder getByteOrder() {
        return this.byteOrder;
    }

    protected final void debugNumber(java.lang.String str, int i, int i2) {
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            try {
                java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
                try {
                    debugNumber(printWriter, str, i, i2);
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

    protected final void debugNumber(java.io.PrintWriter printWriter, java.lang.String str, int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(" (");
        printWriter.print(sb.toString());
        int i3 = i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 > 0) {
                printWriter.print(",");
            }
            int i5 = i3 & 255;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append((char) i5);
            sb2.append(" [");
            sb2.append(i5);
            sb2.append("]");
            printWriter.print(sb2.toString());
            i3 >>= 8;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(") [0x");
        sb3.append(java.lang.Integer.toHexString(i));
        sb3.append(", ");
        sb3.append(java.lang.Integer.toBinaryString(i));
        sb3.append("]");
        printWriter.println(sb3.toString());
        printWriter.flush();
    }
}
