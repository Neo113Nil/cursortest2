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

/* JADX INFO: loaded from: classes.dex */
final class zzxx {
    private final Spatializer zza;
    private final boolean zzb;
    private final Handler zzc;
    private final Spatializer$OnSpatializerStateChangedListener zzd;

    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.zzxv] */
    public zzxx(Context context, zzyf zzyfVar) {
        AudioManager audioManager = context == null ? null : (AudioManager) context.getSystemService("audio");
        if (audioManager == null || zzen.zzN(context)) {
            this.zza = null;
            this.zzb = false;
            this.zzc = null;
            this.zzd = null;
            return;
        }
        Spatializer spatializer = audioManager.getSpatializer();
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
        zzxw zzxwVar = new zzxw(this, zzyfVar);
        this.zzd = zzxwVar;
        Looper looperMyLooper = Looper.myLooper();
        zzcv.zzb(looperMyLooper);
        final Handler handler = new Handler(looperMyLooper);
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
        int iZzi = zzen.zzi(i7);
        if (iZzi == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iZzi);
        int i8 = zzzVar.zzF;
        if (i8 != -1) {
            channelMask.setSampleRate(i8);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return AbstractC0099e.c(spatializer).canBeSpatialized(zzeVar.zza().zza, channelMask.build());
    }

    public final boolean zzc() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return AbstractC0099e.c(spatializer).isAvailable();
    }

    public final boolean zzd() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return AbstractC0099e.c(spatializer).isEnabled();
    }

    public final boolean zze() {
        return this.zzb;
    }
}
