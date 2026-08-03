package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbgv implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbgx zza;

    zzbgv(com.google.android.gms.internal.ads.zzbgx zzbgxVar) {
        java.util.Objects.requireNonNull(zzbgxVar);
        this.zza = zzbgxVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.zzbgx zzbgxVar = this.zza;
        synchronized (zzbgxVar.zzh()) {
            try {
                if (zzbgxVar.zzi() != null) {
                    zzbgxVar.zzk(zzbgxVar.zzi().zzq());
                }
            } catch (android.os.DeadObjectException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                this.zza.zzg();
            }
            this.zza.zzh().notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        com.google.android.gms.internal.ads.zzbgx zzbgxVar = this.zza;
        synchronized (zzbgxVar.zzh()) {
            zzbgxVar.zzk(null);
            zzbgxVar.zzh().notifyAll();
        }
    }
}
