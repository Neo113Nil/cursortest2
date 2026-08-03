package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zzcv implements com.google.android.gms.games.GamesSignInClient {
    private final com.google.android.gms.internal.games_v2.zzbc zza;
    private final com.google.android.gms.internal.games_v2.zzay zzb;

    public zzcv(com.google.android.gms.internal.games_v2.zzbc zzbcVar, com.google.android.gms.internal.games_v2.zzay zzayVar) {
        this.zza = zzbcVar;
        this.zzb = zzayVar;
    }

    @Override // com.google.android.gms.games.GamesSignInClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AuthenticationResult> isAuthenticated() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.games.GamesSignInClient
    public final com.google.android.gms.tasks.Task<java.lang.String> requestServerSideAccess(final java.lang.String str, final boolean z) {
        return this.zzb.zzb(new com.google.android.gms.internal.games_v2.zzax() { // from class: com.google.android.gms.internal.games_v2.zzcu
            @Override // com.google.android.gms.internal.games_v2.zzax
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
                final java.lang.String str2 = str;
                final boolean z2 = z;
                return googleApi.doWrite(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzct
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.games.internal.zzaj) obj).zzM((com.google.android.gms.tasks.TaskCompletionSource) obj2, str2, z2);
                    }
                }).setMethodKey(6699).build());
            }
        });
    }

    @Override // com.google.android.gms.games.GamesSignInClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AuthenticationResult> signIn() {
        return this.zza.zzb();
    }
}
