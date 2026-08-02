package org.apache.commons.imaging.formats.png;

/* loaded from: classes17.dex */
public class PngImageInfo extends org.apache.commons.imaging.ImageInfo {
    private final org.apache.commons.imaging.formats.png.PhysicalScale physicalScale;
    private final java.util.List<org.apache.commons.imaging.formats.png.PngText> textChunks;

    PngImageInfo(java.lang.String str, int i, java.util.List<java.lang.String> list, org.apache.commons.imaging.ImageFormat imageFormat, java.lang.String str2, int i2, java.lang.String str3, int i3, int i4, float f, int i5, float f2, int i6, boolean z, boolean z2, boolean z3, org.apache.commons.imaging.ImageInfo.ColorType colorType, org.apache.commons.imaging.ImageInfo.CompressionAlgorithm compressionAlgorithm, java.util.List<org.apache.commons.imaging.formats.png.PngText> list2, org.apache.commons.imaging.formats.png.PhysicalScale physicalScale) {
        super(str, i, list, imageFormat, str2, i2, str3, i3, i4, f, i5, f2, i6, z, z2, z3, colorType, compressionAlgorithm);
        this.textChunks = list2;
        this.physicalScale = physicalScale;
    }

    public java.util.List<org.apache.commons.imaging.formats.png.PngText> getTextChunks() {
        return new java.util.ArrayList(this.textChunks);
    }

    public org.apache.commons.imaging.formats.png.PhysicalScale getPhysicalScale() {
        return this.physicalScale;
    }
}
