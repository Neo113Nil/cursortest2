package com.google.android.gms.games.internal;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
final class zzw extends com.google.android.gms.internal.games_v2.zzaj {
    final /* synthetic */ com.google.android.gms.games.internal.zzaj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzw(com.google.android.gms.games.internal.zzaj zzajVar) {
        super(zzajVar.getContext().getMainLooper(), 1000);
        this.zza = zzajVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.games_v2.zzaj
    protected final void zza(java.lang.String str, int i) {
        try {
            if (this.zza.isConnected()) {
                ((com.google.android.gms.games.internal.zzao) this.zza.getService()).zzw(str, i);
                return;
            }
            com.google.android.gms.internal.games_v2.zzfn.zzc("GamesGmsClientImpl", "Unable to increment event " + str + " by " + i + " because the games client is no longer connected");
        } catch (android.os.RemoteException e) {
            com.google.android.gms.games.internal.zzaj.zzU(e);
        } catch (java.lang.SecurityException e2) {
            int i2 = com.google.android.gms.games.internal.zzaj.zze;
            com.google.android.gms.internal.games_v2.zzfn.zzd("GamesGmsClientImpl", "Is player signed out?", e2);
        }
    }
}
