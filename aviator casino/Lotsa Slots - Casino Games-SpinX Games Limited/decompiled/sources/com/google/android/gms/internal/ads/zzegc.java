package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzegc implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    protected final com.google.android.gms.internal.ads.zzcfw zza = new com.google.android.gms.internal.ads.zzcfw();
    protected final java.lang.Object zzb = new java.lang.Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected com.google.android.gms.internal.ads.zzcbd zze;
    protected com.google.android.gms.internal.ads.zzcaf zzf;

    static void zzc(android.content.Context context, com.google.common.util.concurrent.ListenableFuture listenableFuture, java.util.concurrent.Executor executor) {
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbki.zzj.zze()).booleanValue() || ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbki.zzh.zze()).booleanValue()) {
            com.google.android.gms.internal.ads.zzhbw.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzefz(context), executor);
        }
    }

    public void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Disconnected from remote ad request service.");
        this.zza.zzd(new com.google.android.gms.internal.ads.zzegr(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
    }

    protected final void zzb() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            android.os.Binder.flushPendingCommands();
        }
    }
}
