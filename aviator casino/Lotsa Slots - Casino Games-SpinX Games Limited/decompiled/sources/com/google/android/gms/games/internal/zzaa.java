package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
final class zzaa extends com.google.android.gms.games.internal.zza {
    final /* synthetic */ com.google.android.gms.games.internal.zzaj zza;
    private final com.google.android.gms.tasks.TaskCompletionSource zzb;

    zzaa(com.google.android.gms.games.internal.zzaj zzajVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = zzajVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzal
    public final void zzf(com.google.android.gms.common.data.DataHolder dataHolder, com.google.android.gms.common.data.DataHolder dataHolder2) {
        int statusCode = dataHolder2.getStatusCode();
        if (statusCode == 10003) {
            com.google.android.gms.games.internal.zzaj.zzq(this.zza, this.zzb);
            dataHolder.close();
            dataHolder2.close();
            return;
        }
        boolean z = statusCode == 3;
        if (statusCode != 0 && !z) {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zzb, statusCode);
            dataHolder.close();
            dataHolder2.close();
            return;
        }
        com.google.android.gms.games.leaderboard.LeaderboardBuffer leaderboardBuffer = new com.google.android.gms.games.leaderboard.LeaderboardBuffer(dataHolder);
        try {
            com.google.android.gms.games.leaderboard.Leaderboard freeze = leaderboardBuffer.getCount() > 0 ? leaderboardBuffer.get(0).freeze() : null;
            leaderboardBuffer.close();
            this.zzb.setResult(new com.google.android.gms.games.AnnotatedData(new com.google.android.gms.games.LeaderboardsClient.LeaderboardScores(freeze, new com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer(dataHolder2)), z));
        } catch (java.lang.Throwable th) {
            try {
                leaderboardBuffer.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
