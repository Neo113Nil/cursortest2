package androidx.emoji2.text;

/* loaded from: classes3.dex */
public class TypefaceEmojiRasterizer {
    private static final java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.MetadataItem> getHighSpeedVideoFpsRanges = new java.lang.ThreadLocal<>();
    private final androidx.emoji2.text.MetadataRepo getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;
    private volatile int getHighSpeedVideoSizes = 0;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    TypefaceEmojiRasterizer(androidx.emoji2.text.MetadataRepo metadataRepo, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = metadataRepo;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public void draw(android.graphics.Canvas canvas, float f, float f2, android.graphics.Paint paint) {
        android.graphics.Typeface typeface = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
        android.graphics.Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(this.getHighResolutionOutputSizeshNQ4ISI.getEmojiCharArray(), this.getHighSpeedVideoFpsRangesFor * 2, 2, f, f2, paint);
        paint.setTypeface(typeface2);
    }

    public android.graphics.Typeface getTypeface() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
    }

    private androidx.emoji2.text.flatbuffer.MetadataItem getHighSpeedVideoFpsRangesFor() {
        java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.MetadataItem> threadLocal = getHighSpeedVideoFpsRanges;
        androidx.emoji2.text.flatbuffer.MetadataItem metadataItem = threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new androidx.emoji2.text.flatbuffer.MetadataItem();
            threadLocal.set(metadataItem);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getMetadataList().list(metadataItem, this.getHighSpeedVideoFpsRangesFor);
        return metadataItem;
    }

    public int getId() {
        return getHighSpeedVideoFpsRangesFor().id();
    }

    public int getWidth() {
        return getHighSpeedVideoFpsRangesFor().width();
    }

    public int getHeight() {
        return getHighSpeedVideoFpsRangesFor().height();
    }

    public short getCompatAdded() {
        return getHighSpeedVideoFpsRangesFor().compatAdded();
    }

    public short getSdkAdded() {
        return getHighSpeedVideoFpsRangesFor().sdkAdded();
    }

    public int getHasGlyph() {
        return this.getHighSpeedVideoSizes & 3;
    }

    public void resetHasGlyphCache() {
        if (isPreferredSystemRender()) {
            this.getHighSpeedVideoSizes = 4;
        } else {
            this.getHighSpeedVideoSizes = 0;
        }
    }

    public void setHasGlyph(boolean z) {
        int i = this.getHighSpeedVideoSizes & 4;
        this.getHighSpeedVideoSizes = z ? i | 2 : i | 1;
    }

    public void setExclusion(boolean z) {
        int hasGlyph = getHasGlyph();
        if (z) {
            this.getHighSpeedVideoSizes = hasGlyph | 4;
        } else {
            this.getHighSpeedVideoSizes = hasGlyph;
        }
    }

    public boolean isPreferredSystemRender() {
        return (this.getHighSpeedVideoSizes & 4) > 0;
    }

    public boolean isDefaultEmoji() {
        return getHighSpeedVideoFpsRangesFor().emojiStyle();
    }

    public int getCodepointAt(int i) {
        return getHighSpeedVideoFpsRangesFor().codepoints(i);
    }

    public int getCodepointsLength() {
        return getHighSpeedVideoFpsRangesFor().codepointsLength();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(java.lang.Integer.toHexString(getId()));
        sb.append(", codepoints:");
        int codepointsLength = getCodepointsLength();
        for (int i = 0; i < codepointsLength; i++) {
            sb.append(java.lang.Integer.toHexString(getCodepointAt(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
