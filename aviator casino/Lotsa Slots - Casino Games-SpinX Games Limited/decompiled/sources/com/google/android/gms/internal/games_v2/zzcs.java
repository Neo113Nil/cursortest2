package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zzcs implements com.google.android.gms.games.EventsClient {
    private final com.google.android.gms.internal.games_v2.zzay zza;

    public zzcs(com.google.android.gms.internal.games_v2.zzay zzayVar) {
        this.zza = zzayVar;
    }

    @Override // com.google.android.gms.games.EventsClient
    public final void increment(final java.lang.String str, final int i) {
        this.zza.zzb(new com.google.android.gms.internal.games_v2.zzax() { // from class: com.google.android.gms.internal.games_v2.zzcn
            @Override // com.google.android.gms.internal.games_v2.zzax
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
                final java.lang.String str2 = str;
                final int i2 = i;
                return googleApi.doWrite(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzcp
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.games.internal.zzaj) obj).zzx(str2, i2);
                    }
                }).setMethodKey(6729).build());
            }
        });
    }

    @Override // com.google.android.gms.games.EventsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.event.EventBuffer>> load(final boolean z) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzax() { // from class: com.google.android.gms.internal.games_v2.zzco
            @Override // com.google.android.gms.internal.games_v2.zzax
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
                final boolean z2 = z;
                return googleApi.doRead(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzcm
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.games.internal.zzaj) obj).zzA((com.google.android.gms.tasks.TaskCompletionSource) obj2, z2);
                    }
                }).setMethodKey(6727).build());
            }
        });
    }

    @Override // com.google.android.gms.games.EventsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.event.EventBuffer>> loadByIds(final boolean z, final java.lang.String... strArr) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzax() { // from class: com.google.android.gms.internal.games_v2.zzcq
            @Override // com.google.android.gms.internal.games_v2.zzax
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
                final boolean z2 = z;
                final java.lang.String[] strArr2 = strArr;
                return googleApi.doRead(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzcr
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.games.internal.zzaj) obj).zzB((com.google.android.gms.tasks.TaskCompletionSource) obj2, z2, strArr2);
                    }
                }).setMethodKey(6728).build());
            }
        });
    }
}
