package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zztm {
    private final Context zza;
    private Boolean zzb;

    public zztm() {
        this(null);
    }

    public zztm(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }

    public final zzqw zza(zzv zzvVar, zzd zzdVar) {
        int i;
        boolean booleanValue;
        zzvVar.getClass();
        zzdVar.getClass();
        if (Build.VERSION.SDK_INT < 29 || (i = zzvVar.zzK) == -1) {
            return zzqw.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = false;
            }
            booleanValue = this.zzb.booleanValue();
        }
        String str = zzvVar.zzp;
        str.getClass();
        int zzg = zzas.zzg(str, zzvVar.zzk);
        if (zzg == 0 || Build.VERSION.SDK_INT < zzfm.zzH(zzg)) {
            return zzqw.zza;
        }
        int zzF = zzfm.zzF(zzvVar);
        if (zzF == 0) {
            return zzqw.zza;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(zzF).setEncoding(zzg).build();
            if (Build.VERSION.SDK_INT >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, zzdVar.zza());
                if ((directPlaybackSupport & 1) == 0) {
                    return zzqw.zza;
                }
                r3 = (directPlaybackSupport & 3) == 3;
                zzqv zzqvVar = new zzqv();
                zzqvVar.zza(true);
                zzqvVar.zzb(r3);
                zzqvVar.zzc(booleanValue);
                return zzqvVar.zzd();
            }
            if (Build.VERSION.SDK_INT < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(build, zzdVar.zza())) {
                    return zzqw.zza;
                }
                zzqv zzqvVar2 = new zzqv();
                zzqvVar2.zza(true);
                zzqvVar2.zzc(booleanValue);
                return zzqvVar2.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, zzdVar.zza());
            if (playbackOffloadSupport == 0) {
                return zzqw.zza;
            }
            zzqv zzqvVar3 = new zzqv();
            if (Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2) {
                r3 = true;
            }
            zzqvVar3.zza(true);
            zzqvVar3.zzb(r3);
            zzqvVar3.zzc(booleanValue);
            return zzqvVar3.zzd();
        } catch (IllegalArgumentException unused) {
            return zzqw.zza;
        }
    }
}
