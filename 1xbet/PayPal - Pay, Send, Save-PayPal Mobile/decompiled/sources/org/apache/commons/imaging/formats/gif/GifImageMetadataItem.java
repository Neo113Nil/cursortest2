package org.apache.commons.imaging.formats.gif;

/* loaded from: classes17.dex */
public class GifImageMetadataItem implements org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem {
    private static final java.lang.String NEWLINE = java.lang.System.getProperty("line.separator");
    private final int delay;
    private final org.apache.commons.imaging.formats.gif.DisposalMethod disposalMethod;
    private final int leftPosition;
    private final int topPosition;

    GifImageMetadataItem(int i, int i2, int i3, org.apache.commons.imaging.formats.gif.DisposalMethod disposalMethod) {
        this.delay = i;
        this.leftPosition = i2;
        this.topPosition = i3;
        this.disposalMethod = disposalMethod;
    }

    public int getDelay() {
        return this.delay;
    }

    public int getLeftPosition() {
        return this.leftPosition;
    }

    public int getTopPosition() {
        return this.topPosition;
    }

    public org.apache.commons.imaging.formats.gif.DisposalMethod getDisposalMethod() {
        return this.disposalMethod;
    }

    @Override // org.apache.commons.imaging.common.ImageMetadata.ImageMetadataItem
    public java.lang.String toString(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = this.delay;
        java.lang.String str2 = NEWLINE;
        sb.append(java.lang.String.format("%sDelay: %d%s", str, java.lang.Integer.valueOf(i), str2));
        sb.append(java.lang.String.format("%sLeft position: %d%s", str, java.lang.Integer.valueOf(this.leftPosition), str2));
        sb.append(java.lang.String.format("%sTop position: %d%s", str, java.lang.Integer.valueOf(this.topPosition), str2));
        sb.append(java.lang.String.format("%sDisposal method: %s%s", str, this.disposalMethod, str2));
        return sb.toString();
    }
}
