package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zzer extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.games.RecallClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zza;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb;
    private static final com.google.android.gms.common.api.Api zzc;
    private final com.google.android.gms.internal.games_v2.zzbc zzd;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zza = clientKey;
        com.google.android.gms.internal.games_v2.zzep zzepVar = new com.google.android.gms.internal.games_v2.zzep();
        zzb = zzepVar;
        zzc = new com.google.android.gms.common.api.Api("Recall.API", zzepVar, clientKey);
    }

    public zzer(android.content.Context context, com.google.android.gms.internal.games_v2.zzbc zzbcVar) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zzc, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zzd = zzbcVar;
    }

    @Override // com.google.android.gms.games.RecallClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.RecallAccess> requestRecallAccess() {
        final com.google.android.gms.common.api.internal.TaskApiCall build = com.google.android.gms.common.api.internal.TaskApiCall.builder().setMethodKey(6742).setAutoResolveMissingFeatures(false).setFeatures(com.google.android.gms.games.zzd.zze).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzen
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.games_v2.zzat) ((com.google.android.gms.internal.games_v2.zzfm) obj).getService()).zzd(new com.google.android.gms.internal.games_v2.zzeq(com.google.android.gms.internal.games_v2.zzer.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), "unusedServerClientId");
            }
        }).build();
        return this.zzd.zza().onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.gms.internal.games_v2.zzeo
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return com.google.android.gms.internal.games_v2.zzer.this.doRead(build);
            }
        });
    }
}
