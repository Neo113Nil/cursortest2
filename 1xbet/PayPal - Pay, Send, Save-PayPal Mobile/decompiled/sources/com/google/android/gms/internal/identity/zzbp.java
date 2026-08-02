package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
final /* synthetic */ class zzbp implements com.google.android.gms.common.api.internal.RemoteCall {
    private final /* synthetic */ com.google.android.gms.location.CurrentLocationRequest zza;
    private final /* synthetic */ com.google.android.gms.tasks.CancellationToken zzb;

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzbi.zzb;
        ((com.google.android.gms.internal.identity.zzdz) obj).zzr(this.zza, this.zzb, (com.google.android.gms.tasks.TaskCompletionSource) obj2);
    }

    /* synthetic */ zzbp(com.google.android.gms.location.CurrentLocationRequest currentLocationRequest, com.google.android.gms.tasks.CancellationToken cancellationToken) {
        this.zza = currentLocationRequest;
        this.zzb = cancellationToken;
    }
}
