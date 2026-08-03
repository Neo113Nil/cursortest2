package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzefx extends com.google.android.gms.internal.ads.zzegc {
    private final android.content.Context zzg;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzh;
    private final com.google.android.gms.internal.ads.zzefw zzi;

    zzefx(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzefw zzefwVar, com.google.android.gms.internal.ads.zzcag zzcagVar) {
        this.zzg = context;
        this.zzh = versionInfoParcel;
        this.zzi = zzefwVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzi(this.zzh.afmaVersion);
                    this.zzi.zza();
                } catch (android.os.RemoteException e) {
                    this.zzi.zzb(e);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzegc, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        java.lang.String errorMessage = connectionResult.getErrorMessage();
        java.lang.String.valueOf(errorMessage);
        this.zzi.zzb(new android.os.RemoteException("Connection failed: ".concat(java.lang.String.valueOf(errorMessage))));
    }

    @Override // com.google.android.gms.internal.ads.zzegc, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 33);
        sb.append("Connection suspended with cause: ");
        sb.append(i);
        this.zzi.zzb(new android.os.RemoteException(sb.toString()));
    }

    public final void zza() {
        synchronized (this.zzb) {
            if (this.zzc) {
                return;
            }
            this.zzc = true;
            this.zzf = new com.google.android.gms.internal.ads.zzcaf(this.zzg, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
            this.zzf.checkAvailabilityAndConnect();
        }
    }
}
