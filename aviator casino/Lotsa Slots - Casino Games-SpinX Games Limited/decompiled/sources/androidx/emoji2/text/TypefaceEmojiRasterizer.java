package androidx.emoji2.text;

/* loaded from: classes2.dex */
public class TypefaceEmojiRasterizer {
    static final int HAS_GLYPH_ABSENT = 1;
    static final int HAS_GLYPH_EXISTS = 2;
    static final int HAS_GLYPH_UNKNOWN = 0;
    private static final java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.MetadataItem> sMetadataItem = new java.lang.ThreadLocal<>();
    private volatile int mCache = 0;
    private final int mIndex;
    private final androidx.emoji2.text.MetadataRepo mMetadataRepo;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    TypefaceEmojiRasterizer(androidx.emoji2.text.MetadataRepo metadataRepo, int i) {
        this.mMetadataRepo = metadataRepo;
        this.mIndex = i;
    }

    public void draw(android.graphics.Canvas canvas, float f, float f2, android.graphics.Paint paint) {
        android.graphics.Typeface typeface = this.mMetadataRepo.getTypeface();
        android.graphics.Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(this.mMetadataRepo.getEmojiCharArray(), this.mIndex * 2, 2, f, f2, paint);
        paint.setTypeface(typeface2);
    }

    public android.graphics.Typeface getTypeface() {
        return this.mMetadataRepo.getTypeface();
    }

    private androidx.emoji2.text.flatbuffer.MetadataItem getMetadataItem() {
        java.lang.ThreadLocal<androidx.emoji2.text.flatbuffer.MetadataItem> threadLocal = sMetadataItem;
        androidx.emoji2.text.flatbuffer.MetadataItem metadataItem = threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new androidx.emoji2.text.flatbuffer.MetadataItem();
            threadLocal.set(metadataItem);
        }
        this.mMetadataRepo.getMetadataList().list(metadataItem, this.mIndex);
        return metadataItem;
    }

    public int getId() {
        return getMetadataItem().id();
    }

    public int getWidth() {
        return getMetadataItem().width();
    }

    public int getHeight() {
        return getMetadataItem().height();
    }

    public short getCompatAdded() {
        return getMetadataItem().compatAdded();
    }

    public short getSdkAdded() {
        return getMetadataItem().sdkAdded();
    }

    public int getHasGlyph() {
        return this.mCache & 3;
    }

    public void resetHasGlyphCache() {
        if (isPreferredSystemRender()) {
            this.mCache = 4;
        } else {
            this.mCache = 0;
        }
    }

    public void setHasGlyph(boolean z) {
        int i = this.mCache & 4;
        this.mCache = z ? i | 2 : i | 1;
    }

    public void setExclusion(boolean z) {
        int hasGlyph = getHasGlyph();
        if (z) {
            this.mCache = hasGlyph | 4;
        } else {
            this.mCache = hasGlyph;
        }
    }

    public boolean isPreferredSystemRender() {
        return (this.mCache & 4) > 0;
    }

    public boolean isDefaultEmoji() {
        return getMetadataItem().emojiStyle();
    }

    public int getCodepointAt(int i) {
        return getMetadataItem().codepoints(i);
    }

    public int getCodepointsLength() {
        return getMetadataItem().codepointsLength();
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
            sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        }
        return sb.toString();
    }
}
