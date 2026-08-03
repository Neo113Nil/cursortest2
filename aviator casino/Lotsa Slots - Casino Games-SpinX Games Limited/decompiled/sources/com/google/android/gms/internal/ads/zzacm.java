package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzacm {
    private final android.media.Spatializer zza;
    private final boolean zzb;
    private final android.os.Handler zzc;
    private final android.media.Spatializer.OnSpatializerStateChangedListener zzd;

    public final boolean zza() {
        return this.zza != null && this.zzb && zzc() && zzd();
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        android.media.Spatializer spatializer = this.zza;
        return spatializer != null && spatializer.isAvailable();
    }

    public final boolean zzd() {
        android.media.Spatializer spatializer = this.zza;
        return spatializer != null && spatializer.isEnabled();
    }

    public final boolean zze(com.google.android.gms.internal.ads.zzd zzdVar, com.google.android.gms.internal.ads.zzv zzvVar) {
        int i;
        if (!zza()) {
            return false;
        }
        java.lang.String str = zzvVar.zzp;
        if (java.util.Objects.equals(str, "audio/eac3-joc")) {
            i = zzvVar.zzH;
            if (i == 16) {
                i = 12;
            }
        } else if (java.util.Objects.equals(str, "audio/iamf")) {
            i = zzvVar.zzH;
            if (i == -1) {
                i = 6;
            }
        } else if (java.util.Objects.equals(str, "audio/ac4")) {
            i = zzvVar.zzH;
            if (i == 18 || i == 21) {
                i = 24;
            }
        } else {
            i = zzvVar.zzH;
        }
        int zzE = com.google.android.gms.internal.ads.zzfl.zzE(i);
        if (zzE == 0) {
            return false;
        }
        android.media.AudioFormat.Builder channelMask = new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(zzE);
        int i2 = zzvVar.zzI;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        android.media.Spatializer spatializer = this.zza;
        spatializer.getClass();
        return spatializer.canBeSpatialized(zzdVar.zza(), channelMask.build());
    }

    public final java.util.List zzf() {
        if (!zza()) {
            return com.google.android.gms.internal.ads.zzgwm.zzi();
        }
        if (android.os.Build.VERSION.SDK_INT < 36) {
            return com.google.android.gms.internal.ads.zzgwm.zzj(252);
        }
        android.media.Spatializer spatializer = this.zza;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    public final void zzg() {
        android.media.Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
        android.os.Handler handler;
        android.media.Spatializer spatializer = this.zza;
        if (spatializer == null || (onSpatializerStateChangedListener = this.zzd) == null || (handler = this.zzc) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }

    public zzacm(android.content.Context context, java.lang.Runnable runnable, java.lang.Boolean bool) {
        android.media.AudioManager zza = context == null ? null : com.google.android.gms.internal.ads.zzcj.zza(context);
        if (zza == null || (bool != null && bool.booleanValue())) {
            this.zza = null;
            this.zzb = false;
            this.zzc = null;
            this.zzd = null;
            return;
        }
        android.media.Spatializer spatializer = zza.getSpatializer();
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        myLooper.getClass();
        final android.os.Handler handler = new android.os.Handler(myLooper);
        this.zzc = handler;
        com.google.android.gms.internal.ads.zzack zzackVar = new com.google.android.gms.internal.ads.zzack(this, runnable);
        this.zzd = zzackVar;
        java.util.Objects.requireNonNull(handler);
        spatializer.addOnSpatializerStateChangedListener(new java.util.concurrent.Executor() { // from class: com.google.android.gms.internal.ads.zzacl
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(java.lang.Runnable runnable2) {
                handler.post(runnable2);
            }
        }, zzackVar);
    }
}
