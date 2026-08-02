package org.threeten.bp.format;

/* loaded from: classes18.dex */
public enum TextStyle {
    FULL,
    FULL_STANDALONE,
    SHORT,
    SHORT_STANDALONE,
    NARROW,
    NARROW_STANDALONE;

    public final boolean isStandalone() {
        return (ordinal() & 1) == 1;
    }

    public final org.threeten.bp.format.TextStyle asStandalone() {
        return values()[ordinal() | 1];
    }

    public final org.threeten.bp.format.TextStyle asNormal() {
        return values()[ordinal() & (-2)];
    }
}
