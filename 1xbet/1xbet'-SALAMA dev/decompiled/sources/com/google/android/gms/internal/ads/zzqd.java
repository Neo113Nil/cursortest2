package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class zzqd {
    private final Context zza;
    private Boolean zzb;

    public zzqd() {
        this.zza = null;
    }

    public final zzpc zza(zzz zzzVar, zze zzeVar) {
        boolean zBooleanValue;
        AudioManager audioManager;
        zzzVar.getClass();
        zzeVar.getClass();
        int i7 = zzen.zza;
        if (i7 < 29 || zzzVar.zzF == -1) {
            return zzpc.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z4 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                this.zzb = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzzVar.zzo;
        str.getClass();
        int iZza = zzay.zza(str, zzzVar.zzk);
        if (iZza == 0 || i7 < zzen.zzh(iZza)) {
            return zzpc.zza;
        }
        int iZzi = zzen.zzi(zzzVar.zzE);
        if (iZzi == 0) {
            return zzpc.zza;
        }
        try {
            AudioFormat audioFormatZzx = zzen.zzx(zzzVar.zzF, iZzi, iZza);
            if (i7 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatZzx, zzeVar.zza().zza)) {
                    return zzpc.zza;
                }
                zzpa zzpaVar = new zzpa();
                zzpaVar.zza(true);
                zzpaVar.zzc(zBooleanValue);
                return zzpaVar.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatZzx, zzeVar.zza().zza);
            if (playbackOffloadSupport == 0) {
                return zzpc.zza;
            }
            zzpa zzpaVar2 = new zzpa();
            if (i7 > 32 && playbackOffloadSupport == 2) {
                z4 = true;
            }
            zzpaVar2.zza(true);
            zzpaVar2.zzb(z4);
            zzpaVar2.zzc(zBooleanValue);
            return zzpaVar2.zzd();
        } catch (IllegalArgumentException unused) {
            return zzpc.zza;
        }
    }

    public zzqd(Context context) {
        this.zza = context;
    }
}
