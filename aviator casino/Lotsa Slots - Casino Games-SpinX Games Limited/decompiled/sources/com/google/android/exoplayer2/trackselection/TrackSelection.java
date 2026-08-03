package com.google.android.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public interface TrackSelection {
    public static final int TYPE_CUSTOM_BASE = 10000;
    public static final int TYPE_UNSET = 0;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Type {
    }

    com.google.android.exoplayer2.Format getFormat(int i);

    int getIndexInTrackGroup(int i);

    com.google.android.exoplayer2.source.TrackGroup getTrackGroup();

    int getType();

    int indexOf(int i);

    int indexOf(com.google.android.exoplayer2.Format format);

    int length();
}
