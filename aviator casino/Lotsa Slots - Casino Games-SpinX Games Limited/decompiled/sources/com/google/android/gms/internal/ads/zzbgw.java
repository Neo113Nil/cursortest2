package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbgw implements com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbgx zza;

    zzbgw(com.google.android.gms.internal.ads.zzbgx zzbgxVar) {
        java.util.Objects.requireNonNull(zzbgxVar);
        this.zza = zzbgxVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.internal.ads.zzbgx zzbgxVar = this.zza;
        synchronized (zzbgxVar.zzh()) {
            zzbgxVar.zzk(null);
            if (zzbgxVar.zzi() != null) {
                zzbgxVar.zzj(null);
            }
            zzbgxVar.zzh().notifyAll();
        }
    }
}
