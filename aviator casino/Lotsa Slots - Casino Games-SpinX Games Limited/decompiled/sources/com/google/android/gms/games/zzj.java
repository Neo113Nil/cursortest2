package com.google.android.gms.games;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
class zzj extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    /* synthetic */ zzj(com.google.android.gms.games.zzi zziVar) {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, java.lang.Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        com.google.android.gms.games.zzn zznVar = (com.google.android.gms.games.zzn) obj;
        if (zznVar == null) {
            zznVar = new com.google.android.gms.games.zzl(null).zze();
        }
        com.google.android.gms.games.internal.zzaj zzajVar = new com.google.android.gms.games.internal.zzaj(context, looper, clientSettings, zznVar, connectionCallbacks, onConnectionFailedListener, com.google.android.gms.games.internal.zzaq.zza());
        if (zznVar.zzo.zzc()) {
            int i = com.google.android.gms.games.internal.zzg.zza;
            zzajVar.zzS(com.google.android.gms.games.internal.zzg.zzb((android.app.Application) context.getApplicationContext()));
        }
        return zzajVar;
    }

    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    public final int getPriority() {
        return 1;
    }
}
