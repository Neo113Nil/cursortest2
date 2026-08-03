package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public interface Game extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.Game>, android.os.Parcelable {
    boolean areSnapshotsEnabled();

    int getAchievementTotalCount();

    java.lang.String getApplicationId();

    java.lang.String getDescription();

    void getDescription(android.database.CharArrayBuffer charArrayBuffer);

    java.lang.String getDeveloperName();

    void getDeveloperName(android.database.CharArrayBuffer charArrayBuffer);

    java.lang.String getDisplayName();

    void getDisplayName(android.database.CharArrayBuffer charArrayBuffer);

    android.net.Uri getFeaturedImageUri();

    @java.lang.Deprecated
    java.lang.String getFeaturedImageUrl();

    android.net.Uri getHiResImageUri();

    @java.lang.Deprecated
    java.lang.String getHiResImageUrl();

    android.net.Uri getIconImageUri();

    @java.lang.Deprecated
    java.lang.String getIconImageUrl();

    int getLeaderboardCount();

    java.lang.String getPrimaryCategory();

    java.lang.String getSecondaryCategory();

    java.lang.String getThemeColor();

    boolean hasGamepadSupport();

    java.lang.String zza();

    boolean zzb();

    boolean zzc();

    boolean zzd();

    boolean zze();

    boolean zzf();

    @java.lang.Deprecated
    boolean zzg();

    @java.lang.Deprecated
    boolean zzh();
}
