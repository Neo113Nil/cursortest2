package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class zzqd {
    private final Context zza;
    private Boolean zzb;

    public zzqd() {
        this.zza = null;
    }

    public final zzpc zza(zzz zzzVar, zze zzeVar) {
        boolean booleanValue;
        boolean isOffloadedPlaybackSupported;
        int playbackOffloadSupport;
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
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    String parameters = audioManager.getParameters("offloadVariableRateSupported");
                    this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                } else {
                    this.zzb = Boolean.FALSE;
                }
            } else {
                this.zzb = Boolean.FALSE;
            }
            booleanValue = this.zzb.booleanValue();
        }
        String str = zzzVar.zzo;
        str.getClass();
        int zza = zzay.zza(str, zzzVar.zzk);
        if (zza == 0 || i7 < zzen.zzh(zza)) {
            return zzpc.zza;
        }
        int zzi = zzen.zzi(zzzVar.zzE);
        if (zzi == 0) {
            return zzpc.zza;
        }
        try {
            AudioFormat zzx = zzen.zzx(zzzVar.zzF, zzi, zza);
            if (i7 < 31) {
                isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(zzx, zzeVar.zza().zza);
                if (!isOffloadedPlaybackSupported) {
                    return zzpc.zza;
                }
                zzpa zzpaVar = new zzpa();
                zzpaVar.zza(true);
                zzpaVar.zzc(booleanValue);
                return zzpaVar.zzd();
            }
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(zzx, zzeVar.zza().zza);
            if (playbackOffloadSupport == 0) {
                return zzpc.zza;
            }
            zzpa zzpaVar2 = new zzpa();
            if (i7 > 32 && playbackOffloadSupport == 2) {
                z4 = true;
            }
            zzpaVar2.zza(true);
            zzpaVar2.zzb(z4);
            zzpaVar2.zzc(booleanValue);
            return zzpaVar2.zzd();
        } catch (IllegalArgumentException unused) {
            return zzpc.zza;
        }
    }

    public zzqd(Context context) {
        this.zza = context;
    }
}
