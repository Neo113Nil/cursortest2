package org.apache.commons.imaging.formats.gif;

/* loaded from: classes17.dex */
public class GifImageMetadata implements org.apache.commons.imaging.common.ImageMetadata {
    private static final java.lang.String NEWLINE = java.lang.System.getProperty("line.separator");
    private final int height;
    private final java.util.List<org.apache.commons.imaging.formats.gif.GifImageMetadataItem> items;
    private final int width;

    GifImageMetadata(int i, int i2, java.util.List<org.apache.commons.imaging.formats.gif.GifImageMetadataItem> list) {
        this.width = i;
        this.height = i2;
        this.items = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
    }

    @Override // org.apache.commons.imaging.common.ImageMetadata
    public java.lang.String toString(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.lang.String.format("%sGIF metadata:", str));
        int i = this.width;
        java.lang.String str2 = NEWLINE;
        sb.append(java.lang.String.format("%sWidth: %d%s", str, java.lang.Integer.valueOf(i), str2));
        sb.append(java.lang.String.format("%sHeight: %d%s", str, java.lang.Integer.valueOf(this.height), str2));
        sb.append(str2);
        sb.append(java.lang.String.format("%sImages:", str));
        for (org.apache.commons.imaging.formats.gif.GifImageMetadataItem gifImageMetadataItem : this.items) {
            sb.append(NEWLINE);
            sb.append(gifImageMetadataItem.toString(str));
        }
        return sb.toString();
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    @Override // org.apache.commons.imaging.common.ImageMetadata
    public java.util.List<org.apache.commons.imaging.formats.gif.GifImageMetadataItem> getItems() {
        return this.items;
    }
}
