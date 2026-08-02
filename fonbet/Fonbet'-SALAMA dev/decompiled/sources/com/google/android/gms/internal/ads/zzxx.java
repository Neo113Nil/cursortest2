package com.google.android.gms.internal.ads;

import C1.AbstractC0099e;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzxx {
    private final Spatializer zza;
    private final boolean zzb;
    private final Handler zzc;
    private final Spatializer$OnSpatializerStateChangedListener zzd;

    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.zzxv] */
    public zzxx(Context context, zzyf zzyfVar) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager audioManager = context == null ? null : (AudioManager) context.getSystemService("audio");
        if (audioManager == null || zzen.zzN(context)) {
            this.zza = null;
            this.zzb = false;
            this.zzc = null;
            this.zzd = null;
            return;
        }
        spatializer = audioManager.getSpatializer();
        this.zza = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.zzb = immersiveAudioLevel != 0;
        zzxw zzxwVar = new zzxw(this, zzyfVar);
        this.zzd = zzxwVar;
        Looper myLooper = Looper.myLooper();
        zzcv.zzb(myLooper);
        final Handler handler = new Handler(myLooper);
        this.zzc = handler;
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzxv
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, zzxwVar);
    }

    public final void zza() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Spatializer spatializer = this.zza;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.zzd) == null || this.zzc == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        this.zzc.removeCallbacksAndMessages(null);
    }

    public final boolean zzb(zze zzeVar, zzz zzzVar) {
        int i7;
        boolean canBeSpatialized;
        if (Objects.equals(zzzVar.zzo, "audio/eac3-joc")) {
            i7 = zzzVar.zzE;
            if (i7 == 16) {
                i7 = 12;
            }
        } else if (Objects.equals(zzzVar.zzo, "audio/iamf")) {
            i7 = zzzVar.zzE;
            if (i7 == -1) {
                i7 = 6;
            }
        } else if (Objects.equals(zzzVar.zzo, "audio/ac4")) {
            i7 = zzzVar.zzE;
            if (i7 == 18 || i7 == 21) {
                i7 = 24;
            }
        } else {
            i7 = zzzVar.zzE;
        }
        int zzi = zzen.zzi(i7);
        if (zzi == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzi);
        int i8 = zzzVar.zzF;
        if (i8 != -1) {
            channelMask.setSampleRate(i8);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        canBeSpatialized = AbstractC0099e.c(spatializer).canBeSpatialized(zzeVar.zza().zza, channelMask.build());
        return canBeSpatialized;
    }

    public final boolean zzc() {
        boolean isAvailable;
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        isAvailable = AbstractC0099e.c(spatializer).isAvailable();
        return isAvailable;
    }

    public final boolean zzd() {
        boolean isEnabled;
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        isEnabled = AbstractC0099e.c(spatializer).isEnabled();
        return isEnabled;
    }

    public final boolean zze() {
        return this.zzb;
    }
}
