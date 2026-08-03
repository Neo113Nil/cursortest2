package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class zzcy implements com.google.android.gms.internal.games_v2.zzax {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ boolean zze;

    public /* synthetic */ zzcy(java.lang.String str, int i, int i2, int i3, boolean z) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.games_v2.zzax
    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
        com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
        final java.lang.String str = this.zza;
        final int i = this.zzb;
        final int i2 = this.zzc;
        final int i3 = this.zzd;
        final boolean z = this.zze;
        return googleApi.doRead(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzdf
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.games.internal.zzaj) obj).zzG((com.google.android.gms.tasks.TaskCompletionSource) obj2, str, i, i2, i3, z);
            }
        }).setMethodKey(6705).build());
    }
}
