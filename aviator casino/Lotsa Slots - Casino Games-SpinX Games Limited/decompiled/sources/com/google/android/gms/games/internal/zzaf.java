package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
final class zzaf extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzaf(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzal
    public final void zzj(com.google.android.gms.common.data.DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        if (statusCode != 0 && statusCode != 3) {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zza, statusCode);
            dataHolder.close();
        } else {
            com.google.android.gms.games.PlayerBuffer playerBuffer = new com.google.android.gms.games.PlayerBuffer(dataHolder);
            try {
                this.zza.setResult(new com.google.android.gms.games.AnnotatedData(playerBuffer.getCount() > 0 ? new com.google.android.gms.games.PlayerEntity(playerBuffer.get(0)) : null, statusCode == 3));
            } finally {
                playerBuffer.release();
            }
        }
    }
}
