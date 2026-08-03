package com.google.android.gms.games.leaderboard;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public interface LeaderboardVariant extends com.google.android.gms.common.data.Freezable<com.google.android.gms.games.leaderboard.LeaderboardVariant> {
    public static final int COLLECTION_FRIENDS = 3;
    public static final int COLLECTION_PUBLIC = 0;
    public static final int NUM_SCORES_UNKNOWN = -1;
    public static final int NUM_TIME_SPANS = 3;
    public static final int PLAYER_RANK_UNKNOWN = -1;
    public static final int PLAYER_SCORE_UNKNOWN = -1;
    public static final int TIME_SPAN_ALL_TIME = 2;
    public static final int TIME_SPAN_DAILY = 0;
    public static final int TIME_SPAN_WEEKLY = 1;

    /* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Collection {
    }

    /* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TimeSpan {
    }

    int getCollection();

    java.lang.String getDisplayPlayerRank();

    java.lang.String getDisplayPlayerScore();

    long getNumScores();

    long getPlayerRank();

    java.lang.String getPlayerScoreTag();

    long getRawPlayerScore();

    int getTimeSpan();

    boolean hasPlayerInfo();

    java.lang.String zza();

    java.lang.String zzb();

    java.lang.String zzc();
}
