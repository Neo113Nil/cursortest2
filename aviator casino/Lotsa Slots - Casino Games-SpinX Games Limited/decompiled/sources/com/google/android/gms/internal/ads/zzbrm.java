package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbrm implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbro zzb;

    zzbrm(com.google.android.gms.internal.ads.zzbro zzbroVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zza = zzcfwVar;
        java.util.Objects.requireNonNull(zzbroVar);
        this.zzb = zzbroVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zzc().zzp());
        } catch (android.os.DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 23);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        this.zza.zzd(new java.lang.RuntimeException(sb.toString()));
    }
}
