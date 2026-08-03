package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class zzfa implements com.google.android.gms.internal.games_v2.zzax {
    public final /* synthetic */ java.lang.String zza;
    public final /* synthetic */ java.lang.String zzb;
    public final /* synthetic */ com.google.android.gms.games.snapshot.SnapshotMetadataChange zzc;
    public final /* synthetic */ com.google.android.gms.games.snapshot.SnapshotContents zzd;

    public /* synthetic */ zzfa(java.lang.String str, java.lang.String str2, com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange, com.google.android.gms.games.snapshot.SnapshotContents snapshotContents) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = snapshotMetadataChange;
        this.zzd = snapshotContents;
    }

    @Override // com.google.android.gms.internal.games_v2.zzax
    public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
        com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
        final java.lang.String str = this.zza;
        final java.lang.String str2 = this.zzb;
        final com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange = this.zzc;
        final com.google.android.gms.games.snapshot.SnapshotContents snapshotContents = this.zzd;
        return googleApi.doWrite(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzew
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.games.internal.zzaj) obj).zzN((com.google.android.gms.tasks.TaskCompletionSource) obj2, str, str2, snapshotMetadataChange, snapshotContents);
            }
        }).setMethodKey(6725).build());
    }
}
