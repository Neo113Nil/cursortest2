package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfxr implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    private final com.google.android.gms.internal.ads.zzfyi zza;
    private final com.google.android.gms.internal.ads.zzfyc zzb;
    private final java.lang.Object zzc = new java.lang.Object();
    private boolean zzd = false;
    private boolean zze = false;

    zzfxr(android.content.Context context, android.os.Looper looper, com.google.android.gms.internal.ads.zzfyc zzfycVar) {
        this.zzb = zzfycVar;
        this.zza = new com.google.android.gms.internal.ads.zzfyi(context, looper, this, this, 12800000);
    }

    private final void zzb() {
        synchronized (this.zzc) {
            com.google.android.gms.internal.ads.zzfyi zzfyiVar = this.zza;
            if (zzfyiVar.isConnected() || zzfyiVar.isConnecting()) {
                zzfyiVar.disconnect();
            }
            android.os.Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            this.zze = true;
            try {
                this.zza.zzp().zzf(new com.google.android.gms.internal.ads.zzfyg(this.zzb.zzaN()));
            } catch (java.lang.Exception unused) {
            } catch (java.lang.Throwable th) {
                zzb();
                throw th;
            }
            zzb();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    final void zza() {
        synchronized (this.zzc) {
            if (!this.zzd) {
                this.zzd = true;
                this.zza.checkAvailabilityAndConnect();
            }
        }
    }
}
