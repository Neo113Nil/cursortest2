package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class zzck implements com.google.android.gms.internal.games_v2.zzax {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzck(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.games_v2.zzax
    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
        com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
        final java.lang.String str = this.zza;
        final int i = this.zzb;
        return googleApi.doWrite(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzci
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.games.internal.zzaj) obj).zzw((com.google.android.gms.tasks.TaskCompletionSource) obj2, str, i);
            }
        }).setMethodKey(6696).build());
    }
}
