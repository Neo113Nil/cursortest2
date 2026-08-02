package org.apache.commons.imaging;

/* loaded from: classes17.dex */
public class ImageInfo {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.ImageInfo.class.getName());
    private final int bitsPerPixel;
    private final org.apache.commons.imaging.ImageInfo.ColorType colorType;
    private final java.util.List<java.lang.String> comments;
    private final org.apache.commons.imaging.ImageInfo.CompressionAlgorithm compressionAlgorithm;
    private final org.apache.commons.imaging.ImageFormat format;
    private final java.lang.String formatDetails;
    private final java.lang.String formatName;
    private final int height;
    private final java.lang.String mimeType;
    private final int numberOfImages;
    private final int physicalHeightDpi;
    private final float physicalHeightInch;
    private final int physicalWidthDpi;
    private final float physicalWidthInch;
    private final boolean progressive;
    private final boolean transparent;
    private final boolean usesPalette;
    private final int width;

    public enum ColorType {
        BW("Black and White"),
        GRAYSCALE("Grayscale"),
        RGB("RGB"),
        CMYK("CMYK"),
        YCbCr("YCbCr"),
        YCCK("YCCK"),
        YCC("YCC"),
        OTHER("Other"),
        UNKNOWN("Unknown");

        private java.lang.String description;

        ColorType(java.lang.String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.description;
        }
    }

    public enum CompressionAlgorithm {
        UNKNOWN("Unknown"),
        NONE(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE),
        LZW("LZW"),
        PACKBITS("PackBits"),
        JPEG("JPEG"),
        RLE("RLE: Run-Length Encoding"),
        ADAPTIVE_RLE("Adaptive RLE"),
        PSD("Photoshop"),
        PNG_FILTER("PNG Filter"),
        CCITT_GROUP_3("CCITT Group 3 1-Dimensional Modified Huffman run-length encoding."),
        CCITT_GROUP_4("CCITT Group 4"),
        CCITT_1D("CCITT 1D");

        private java.lang.String description;

        CompressionAlgorithm(java.lang.String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            return this.description;
        }
    }

    public ImageInfo(java.lang.String str, int i, java.util.List<java.lang.String> list, org.apache.commons.imaging.ImageFormat imageFormat, java.lang.String str2, int i2, java.lang.String str3, int i3, int i4, float f, int i5, float f2, int i6, boolean z, boolean z2, boolean z3, org.apache.commons.imaging.ImageInfo.ColorType colorType, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm compressionAlgorithm) {
        this.formatDetails = str;
        this.bitsPerPixel = i;
        this.comments = list;
        this.format = imageFormat;
        this.formatName = str2;
        this.height = i2;
        this.mimeType = str3;
        this.numberOfImages = i3;
        this.physicalHeightDpi = i4;
        this.physicalHeightInch = f;
        this.physicalWidthDpi = i5;
        this.physicalWidthInch = f2;
        this.width = i6;
        this.progressive = z;
        this.transparent = z2;
        this.usesPalette = z3;
        this.colorType = colorType;
        this.compressionAlgorithm = compressionAlgorithm;
    }

    public int getBitsPerPixel() {
        return this.bitsPerPixel;
    }

    public java.util.List<java.lang.String> getComments() {
        return new java.util.ArrayList(this.comments);
    }

    public org.apache.commons.imaging.ImageFormat getFormat() {
        return this.format;
    }

    public java.lang.String getFormatName() {
        return this.formatName;
    }

    public int getHeight() {
        return this.height;
    }

    public java.lang.String getMimeType() {
        return this.mimeType;
    }

    public int getNumberOfImages() {
        return this.numberOfImages;
    }

    public int getPhysicalHeightDpi() {
        return this.physicalHeightDpi;
    }

    public float getPhysicalHeightInch() {
        return this.physicalHeightInch;
    }

    public int getPhysicalWidthDpi() {
        return this.physicalWidthDpi;
    }

    public float getPhysicalWidthInch() {
        return this.physicalWidthInch;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isProgressive() {
        return this.progressive;
    }

    public org.apache.commons.imaging.ImageInfo.ColorType getColorType() {
        return this.colorType;
    }

    public void dump() {
        LOGGER.fine(toString());
    }

    public java.lang.String toString() {
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
            toString(printWriter, "");
            printWriter.flush();
            return stringWriter.toString();
        } catch (java.lang.Exception unused) {
            return "Image Data: Error";
        }
    }

    public void toString(java.io.PrintWriter printWriter, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Format Details: ");
        sb.append(this.formatDetails);
        printWriter.println(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Bits Per Pixel: ");
        sb2.append(this.bitsPerPixel);
        printWriter.println(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Comments: ");
        sb3.append(this.comments.size());
        printWriter.println(sb3.toString());
        for (int i = 0; i < this.comments.size(); i++) {
            java.lang.String str2 = this.comments.get(i);
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("\t");
            sb4.append(i);
            sb4.append(": '");
            sb4.append(str2);
            sb4.append("'");
            printWriter.println(sb4.toString());
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Format: ");
        sb5.append(this.format.getName());
        printWriter.println(sb5.toString());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Format Name: ");
        sb6.append(this.formatName);
        printWriter.println(sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Compression Algorithm: ");
        sb7.append(this.compressionAlgorithm);
        printWriter.println(sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Height: ");
        sb8.append(this.height);
        printWriter.println(sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("MimeType: ");
        sb9.append(this.mimeType);
        printWriter.println(sb9.toString());
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Number Of Images: ");
        sb10.append(this.numberOfImages);
        printWriter.println(sb10.toString());
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("Physical Height Dpi: ");
        sb11.append(this.physicalHeightDpi);
        printWriter.println(sb11.toString());
        java.lang.StringBuilder sb12 = new java.lang.StringBuilder("Physical Height Inch: ");
        sb12.append(this.physicalHeightInch);
        printWriter.println(sb12.toString());
        java.lang.StringBuilder sb13 = new java.lang.StringBuilder("Physical Width Dpi: ");
        sb13.append(this.physicalWidthDpi);
        printWriter.println(sb13.toString());
        java.lang.StringBuilder sb14 = new java.lang.StringBuilder("Physical Width Inch: ");
        sb14.append(this.physicalWidthInch);
        printWriter.println(sb14.toString());
        java.lang.StringBuilder sb15 = new java.lang.StringBuilder("Width: ");
        sb15.append(this.width);
        printWriter.println(sb15.toString());
        java.lang.StringBuilder sb16 = new java.lang.StringBuilder("Is Progressive: ");
        sb16.append(this.progressive);
        printWriter.println(sb16.toString());
        java.lang.StringBuilder sb17 = new java.lang.StringBuilder("Is Transparent: ");
        sb17.append(this.transparent);
        printWriter.println(sb17.toString());
        java.lang.StringBuilder sb18 = new java.lang.StringBuilder("Color Type: ");
        sb18.append(this.colorType.toString());
        printWriter.println(sb18.toString());
        java.lang.StringBuilder sb19 = new java.lang.StringBuilder("Uses Palette: ");
        sb19.append(this.usesPalette);
        printWriter.println(sb19.toString());
        printWriter.flush();
    }

    public java.lang.String getFormatDetails() {
        return this.formatDetails;
    }

    public boolean isTransparent() {
        return this.transparent;
    }

    public boolean usesPalette() {
        return this.usesPalette;
    }

    public org.apache.commons.imaging.ImageInfo.CompressionAlgorithm getCompressionAlgorithm() {
        return this.compressionAlgorithm;
    }
}
