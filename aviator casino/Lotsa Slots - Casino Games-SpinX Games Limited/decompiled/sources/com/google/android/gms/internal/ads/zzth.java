package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzth {
    private final android.content.Context zza;
    private java.lang.Boolean zzb;

    public zzth() {
        this(null);
    }

    public zzth(android.content.Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }

    public final com.google.android.gms.internal.ads.zzqs zza(com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzd zzdVar) {
        int i;
        boolean booleanValue;
        zzvVar.getClass();
        zzdVar.getClass();
        if (android.os.Build.VERSION.SDK_INT < 29 || (i = zzvVar.zzI) == -1) {
            return com.google.android.gms.internal.ads.zzqs.zza;
        }
        android.content.Context context = this.zza;
        java.lang.Boolean bool = this.zzb;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                java.lang.String parameters = com.google.android.gms.internal.ads.zzcj.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = java.lang.Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = false;
            }
            booleanValue = this.zzb.booleanValue();
        }
        java.lang.String str = zzvVar.zzp;
        str.getClass();
        int zzg = com.google.android.gms.internal.ads.zzas.zzg(str, zzvVar.zzk);
        if (zzg == 0 || android.os.Build.VERSION.SDK_INT < com.google.android.gms.internal.ads.zzfl.zzF(zzg)) {
            return com.google.android.gms.internal.ads.zzqs.zza;
        }
        int zzE = com.google.android.gms.internal.ads.zzfl.zzE(zzvVar.zzH);
        if (zzE == 0) {
            return com.google.android.gms.internal.ads.zzqs.zza;
        }
        try {
            android.media.AudioFormat build = new android.media.AudioFormat.Builder().setSampleRate(i).setChannelMask(zzE).setEncoding(zzg).build();
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                int directPlaybackSupport = android.media.AudioManager.getDirectPlaybackSupport(build, zzdVar.zza());
                if ((directPlaybackSupport & 1) == 0) {
                    return com.google.android.gms.internal.ads.zzqs.zza;
                }
                r3 = (directPlaybackSupport & 3) == 3;
                com.google.android.gms.internal.ads.zzqr zzqrVar = new com.google.android.gms.internal.ads.zzqr();
                zzqrVar.zza(true);
                zzqrVar.zzb(r3);
                zzqrVar.zzc(booleanValue);
                return zzqrVar.zzd();
            }
            if (android.os.Build.VERSION.SDK_INT < 31) {
                if (!android.media.AudioManager.isOffloadedPlaybackSupported(build, zzdVar.zza())) {
                    return com.google.android.gms.internal.ads.zzqs.zza;
                }
                com.google.android.gms.internal.ads.zzqr zzqrVar2 = new com.google.android.gms.internal.ads.zzqr();
                zzqrVar2.zza(true);
                zzqrVar2.zzc(booleanValue);
                return zzqrVar2.zzd();
            }
            int playbackOffloadSupport = android.media.AudioManager.getPlaybackOffloadSupport(build, zzdVar.zza());
            if (playbackOffloadSupport == 0) {
                return com.google.android.gms.internal.ads.zzqs.zza;
            }
            com.google.android.gms.internal.ads.zzqr zzqrVar3 = new com.google.android.gms.internal.ads.zzqr();
            if (android.os.Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2) {
                r3 = true;
            }
            zzqrVar3.zza(true);
            zzqrVar3.zzb(r3);
            zzqrVar3.zzc(booleanValue);
            return zzqrVar3.zzd();
        } catch (java.lang.IllegalArgumentException unused) {
            return com.google.android.gms.internal.ads.zzqs.zza;
        }
    }
}
