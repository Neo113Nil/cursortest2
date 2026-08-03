package com.google.android.gms.games.snapshot;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public interface SnapshotMetadata extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.snapshot.SnapshotMetadata>, android.os.Parcelable {
    public static final long PLAYED_TIME_UNKNOWN = -1;
    public static final long PROGRESS_VALUE_UNKNOWN = -1;

    float getCoverImageAspectRatio();

    android.net.Uri getCoverImageUri();

    @java.lang.Deprecated
    java.lang.String getCoverImageUrl();

    java.lang.String getDescription();

    void getDescription(android.database.CharArrayBuffer charArrayBuffer);

    java.lang.String getDeviceName();

    com.google.android.gms.games.Game getGame();

    long getLastModifiedTimestamp();

    com.google.android.gms.games.Player getOwner();

    long getPlayedTime();

    long getProgressValue();

    java.lang.String getSnapshotId();

    java.lang.String getUniqueName();

    boolean hasChangePending();

    java.lang.String zza();
}
