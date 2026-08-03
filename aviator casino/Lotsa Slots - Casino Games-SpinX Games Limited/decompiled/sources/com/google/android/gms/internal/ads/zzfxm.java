package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfxm implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    protected final com.google.android.gms.internal.ads.zzfyi zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.util.concurrent.LinkedBlockingQueue zzd;
    private final android.os.HandlerThread zze;

    public zzfxm(android.content.Context context, java.lang.String str, java.lang.String str2) {
        this.zzb = str;
        this.zzc = str2;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        com.google.android.gms.internal.ads.zzfyi zzfyiVar = new com.google.android.gms.internal.ads.zzfyi(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfyiVar;
        this.zzd = new java.util.concurrent.LinkedBlockingQueue();
        zzfyiVar.checkAvailabilityAndConnect();
    }

    static com.google.android.gms.internal.ads.zzaym zzc() {
        com.google.android.gms.internal.ads.zzaxm zzj = com.google.android.gms.internal.ads.zzaym.zzj();
        zzj.zzl(android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        return (com.google.android.gms.internal.ads.zzaym) zzj.zzbu();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.zzfyn zzd = zzd();
        if (zzd != null) {
            try {
                try {
                    this.zzd.put(zzd.zze(new com.google.android.gms.internal.ads.zzfyj(this.zzb, this.zzc)).zza());
                } catch (java.lang.Throwable unused) {
                    this.zzd.put(zzc());
                }
            } catch (java.lang.InterruptedException unused2) {
            } catch (java.lang.Throwable th) {
                zzb();
                this.zze.quit();
                throw th;
            }
            zzb();
            this.zze.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        try {
            this.zzd.put(zzc());
        } catch (java.lang.InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.zzd.put(zzc());
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public final com.google.android.gms.internal.ads.zzaym zza(int i) {
        com.google.android.gms.internal.ads.zzaym zzaymVar;
        try {
            zzaymVar = (com.google.android.gms.internal.ads.zzaym) this.zzd.poll(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException unused) {
            zzaymVar = null;
        }
        return zzaymVar == null ? zzc() : zzaymVar;
    }

    public final void zzb() {
        com.google.android.gms.internal.ads.zzfyi zzfyiVar = this.zza;
        if (zzfyiVar != null) {
            if (zzfyiVar.isConnected() || zzfyiVar.isConnecting()) {
                zzfyiVar.disconnect();
            }
        }
    }

    protected final com.google.android.gms.internal.ads.zzfyn zzd() {
        try {
            return this.zza.zzp();
        } catch (android.os.DeadObjectException | java.lang.IllegalStateException unused) {
            return null;
        }
    }
}
