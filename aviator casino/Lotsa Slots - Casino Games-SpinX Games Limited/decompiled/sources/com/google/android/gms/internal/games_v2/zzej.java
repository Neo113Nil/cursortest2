package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class zzej implements com.google.android.gms.internal.games_v2.zzax {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ java.lang.String zzb;
    public final /* synthetic */ java.lang.String zzc;

    public /* synthetic */ zzej(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.games_v2.zzax
    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
        com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
        final java.lang.String str = this.zza;
        final java.lang.String str2 = this.zzb;
        final java.lang.String str3 = this.zzc;
        return googleApi.doRead(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzea
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzao) ((com.google.android.gms.games.internal.zzaj) obj).getService()).zzj(str, str2, str3));
            }
        }).setMethodKey(6712).build());
    }
}
