package org.apache.commons.imaging;

/* loaded from: classes17.dex */
public enum ImageFormats implements org.apache.commons.imaging.ImageFormat {
    UNKNOWN,
    BMP,
    DCX,
    GIF,
    ICNS,
    ICO,
    JBIG2,
    JPEG,
    PAM,
    PSD,
    PBM,
    PGM,
    PNM,
    PPM,
    PCX,
    PNG,
    RGBE,
    TGA,
    TIFF,
    WBMP,
    XBM,
    XPM;

    @Override // org.apache.commons.imaging.ImageFormat
    public final java.lang.String getName() {
        return name();
    }

    @Override // org.apache.commons.imaging.ImageFormat
    public final java.lang.String getExtension() {
        return name();
    }
}
