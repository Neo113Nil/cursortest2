package org.apache.commons.imaging.formats.psd;

/* loaded from: classes17.dex */
public class PsdImageContents {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.formats.psd.PsdImageContents.class.getName());
    public final int ColorModeDataLength;
    public final int Compression;
    public final int ImageResourcesLength;
    public final int LayerAndMaskDataLength;
    public final org.apache.commons.imaging.formats.psd.PsdHeaderInfo header;

    public PsdImageContents(org.apache.commons.imaging.formats.psd.PsdHeaderInfo psdHeaderInfo, int i, int i2, int i3, int i4) {
        this.header = psdHeaderInfo;
        this.ColorModeDataLength = i;
        this.ImageResourcesLength = i2;
        this.LayerAndMaskDataLength = i3;
        this.Compression = i4;
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
        printWriter.println("ImageContents");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Compression: ");
        sb.append(this.Compression);
        sb.append(" (");
        sb.append(java.lang.Integer.toHexString(this.Compression));
        sb.append(")");
        printWriter.println(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ColorModeDataLength: ");
        sb2.append(this.ColorModeDataLength);
        sb2.append(" (");
        sb2.append(java.lang.Integer.toHexString(this.ColorModeDataLength));
        sb2.append(")");
        printWriter.println(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("ImageResourcesLength: ");
        sb3.append(this.ImageResourcesLength);
        sb3.append(" (");
        sb3.append(java.lang.Integer.toHexString(this.ImageResourcesLength));
        sb3.append(")");
        printWriter.println(sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("LayerAndMaskDataLength: ");
        sb4.append(this.LayerAndMaskDataLength);
        sb4.append(" (");
        sb4.append(java.lang.Integer.toHexString(this.LayerAndMaskDataLength));
        sb4.append(")");
        printWriter.println(sb4.toString());
        printWriter.println("");
        printWriter.flush();
    }
}
