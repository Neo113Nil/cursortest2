package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class zzdn implements com.google.android.gms.internal.games_v2.zzax {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ java.lang.String zzc;

    public /* synthetic */ zzdn(java.lang.String str, long j, java.lang.String str2) {
        this.zza = str;
        this.zzb = j;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.games_v2.zzax
    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
        com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
        final java.lang.String str = this.zza;
        final long j = this.zzb;
        final java.lang.String str2 = this.zzc;
        return googleApi.doWrite(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzdl
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.games.internal.zzaj) obj).zzR((com.google.android.gms.tasks.TaskCompletionSource) obj2, str, j, str2);
            }
        }).setMethodKey(6707).build());
    }
}
