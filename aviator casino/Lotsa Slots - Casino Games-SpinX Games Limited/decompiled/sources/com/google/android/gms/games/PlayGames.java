package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class PlayGames {
    private PlayGames() {
    }

    public static com.google.android.gms.games.AchievementsClient getAchievementsClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzby.zzb();
        return new com.google.android.gms.internal.games_v2.zzcl(com.google.android.gms.internal.games_v2.zzay.zza(com.google.android.gms.internal.games_v2.zzby.zza()));
    }

    public static com.google.android.gms.games.EventsClient getEventsClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzby.zzb();
        return new com.google.android.gms.internal.games_v2.zzcs(com.google.android.gms.internal.games_v2.zzay.zza(com.google.android.gms.internal.games_v2.zzby.zza()));
    }

    public static com.google.android.gms.games.GamesSignInClient getGamesSignInClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzby.zzb();
        return new com.google.android.gms.internal.games_v2.zzcv(com.google.android.gms.internal.games_v2.zzbe.zza(com.google.android.gms.internal.games_v2.zzby.zza()), com.google.android.gms.internal.games_v2.zzay.zza(com.google.android.gms.internal.games_v2.zzby.zza()));
    }

    public static com.google.android.gms.games.LeaderboardsClient getLeaderboardsClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzby.zzb();
        return new com.google.android.gms.internal.games_v2.zzdq(com.google.android.gms.internal.games_v2.zzay.zza(com.google.android.gms.internal.games_v2.zzby.zza()));
    }

    public static com.google.android.gms.games.PlayerStatsClient getPlayerStatsClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzby.zzb();
        return new com.google.android.gms.internal.games_v2.zzdt(com.google.android.gms.internal.games_v2.zzay.zza(com.google.android.gms.internal.games_v2.zzby.zza()));
    }

    public static com.google.android.gms.games.PlayersClient getPlayersClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzby.zzb();
        return new com.google.android.gms.internal.games_v2.zzem(com.google.android.gms.internal.games_v2.zzay.zza(com.google.android.gms.internal.games_v2.zzby.zza()));
    }

    public static com.google.android.gms.games.RecallClient getRecallClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzby.zzb();
        return new com.google.android.gms.internal.games_v2.zzer(activity, com.google.android.gms.internal.games_v2.zzbe.zza(com.google.android.gms.internal.games_v2.zzby.zza()));
    }

    public static com.google.android.gms.games.SnapshotsClient getSnapshotsClient(android.app.Activity activity) {
        com.google.android.gms.internal.games_v2.zzby.zzb();
        return new com.google.android.gms.internal.games_v2.zzfk(com.google.android.gms.internal.games_v2.zzay.zza(com.google.android.gms.internal.games_v2.zzby.zza()));
    }
}
