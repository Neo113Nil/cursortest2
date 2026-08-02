package org.apache.commons.imaging.formats.psd;

/* loaded from: classes17.dex */
public class PsdHeaderInfo {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.psd.PsdHeaderInfo.class.getName());
    public final int channels;
    public final int columns;
    public final int depth;
    public final int mode;
    private final byte[] reserved;
    public final int rows;
    public final int version;

    public PsdHeaderInfo(int i, byte[] bArr, int i2, int i3, int i4, int i5, int i6) {
        this.version = i;
        this.reserved = (byte[]) bArr.clone();
        this.channels = i2;
        this.rows = i3;
        this.columns = i4;
        this.depth = i5;
        this.mode = i6;
    }

    public byte[] getReserved() {
        return (byte[]) this.reserved.clone();
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
        printWriter.println("");
        printWriter.println("Header");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Version: ");
        sb.append(this.version);
        sb.append(" (");
        sb.append(java.lang.Integer.toHexString(this.version));
        sb.append(")");
        printWriter.println(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Channels: ");
        sb2.append(this.channels);
        sb2.append(" (");
        sb2.append(java.lang.Integer.toHexString(this.channels));
        sb2.append(")");
        printWriter.println(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Rows: ");
        sb3.append(this.rows);
        sb3.append(" (");
        sb3.append(java.lang.Integer.toHexString(this.rows));
        sb3.append(")");
        printWriter.println(sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Columns: ");
        sb4.append(this.columns);
        sb4.append(" (");
        sb4.append(java.lang.Integer.toHexString(this.columns));
        sb4.append(")");
        printWriter.println(sb4.toString());
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Depth: ");
        sb5.append(this.depth);
        sb5.append(" (");
        sb5.append(java.lang.Integer.toHexString(this.depth));
        sb5.append(")");
        printWriter.println(sb5.toString());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Mode: ");
        sb6.append(this.mode);
        sb6.append(" (");
        sb6.append(java.lang.Integer.toHexString(this.mode));
        sb6.append(")");
        printWriter.println(sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Reserved: ");
        sb7.append(this.reserved.length);
        printWriter.println(sb7.toString());
        printWriter.println("");
        printWriter.flush();
    }
}
