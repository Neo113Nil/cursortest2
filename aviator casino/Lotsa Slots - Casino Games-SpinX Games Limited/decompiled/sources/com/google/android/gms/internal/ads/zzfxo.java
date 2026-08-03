package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfxo implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    protected final com.google.android.gms.internal.ads.zzfyi zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.ads.zzbds zzd;
    private final java.util.concurrent.LinkedBlockingQueue zze;
    private final android.os.HandlerThread zzf;
    private final com.google.android.gms.internal.ads.zzfxg zzg;
    private final long zzh;

    public zzfxo(android.content.Context context, int i, com.google.android.gms.internal.ads.zzbds zzbdsVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.zzfxg zzfxgVar) {
        this.zzb = str;
        this.zzd = zzbdsVar;
        this.zzc = str2;
        this.zzg = zzfxgVar;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = java.lang.System.currentTimeMillis();
        com.google.android.gms.internal.ads.zzfyi zzfyiVar = new com.google.android.gms.internal.ads.zzfyi(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfyiVar;
        this.zze = new java.util.concurrent.LinkedBlockingQueue();
        zzfyiVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i, long j, java.lang.Exception exc) {
        com.google.android.gms.internal.ads.zzfxg zzfxgVar = this.zzg;
        if (zzfxgVar != null) {
            zzfxgVar.zzc(i, java.lang.System.currentTimeMillis() - j, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.zzfyn zzc = zzc();
        if (zzc != null) {
            try {
                com.google.android.gms.internal.ads.zzfyu zzg = zzc.zzg(new com.google.android.gms.internal.ads.zzfys(1, this.zzd, this.zzb, this.zzc));
                zzd(com.ironsource.mediationsdk.utils.IronSourceConstants.errorCode_internal, this.zzh, null);
                this.zze.put(zzg);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzh, null);
            this.zze.put(new com.google.android.gms.internal.ads.zzfyu(null, 1));
        } catch (java.lang.InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            zzd(4011, this.zzh, null);
            this.zze.put(new com.google.android.gms.internal.ads.zzfyu(null, 1));
        } catch (java.lang.InterruptedException unused) {
        }
    }

    public final com.google.android.gms.internal.ads.zzfyu zza(int i) {
        com.google.android.gms.internal.ads.zzfyu zzfyuVar;
        try {
            zzfyuVar = (com.google.android.gms.internal.ads.zzfyu) this.zze.poll(com.unity3d.services.core.di.ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e) {
            zzd(2009, this.zzh, e);
            zzfyuVar = null;
        }
        zzd(3004, this.zzh, null);
        if (zzfyuVar != null) {
            if (zzfyuVar.zzc == 7) {
                com.google.android.gms.internal.ads.zzfxg.zzg(3);
            } else {
                com.google.android.gms.internal.ads.zzfxg.zzg(2);
            }
        }
        return zzfyuVar == null ? new com.google.android.gms.internal.ads.zzfyu(null, 1) : zzfyuVar;
    }

    public final void zzb() {
        com.google.android.gms.internal.ads.zzfyi zzfyiVar = this.zza;
        if (zzfyiVar != null) {
            if (zzfyiVar.isConnected() || zzfyiVar.isConnecting()) {
                zzfyiVar.disconnect();
            }
        }
    }

    protected final com.google.android.gms.internal.ads.zzfyn zzc() {
        try {
            return this.zza.zzp();
        } catch (android.os.DeadObjectException | java.lang.IllegalStateException unused) {
            return null;
        }
    }
}
