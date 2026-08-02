package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import com.google.firebase.Timestamp$$ExternalSyntheticApiModelOutline0;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
final class zzym {
    private final Spatializer zza;
    private final boolean zzb;
    private final Handler zzc;
    private final Spatializer$OnSpatializerStateChangedListener zzd;

    public final void zza() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.zza;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.zzd) == null || (handler = this.zzc) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }

    public final boolean zzb(zze zzeVar, zzz zzzVar) {
        int i;
        boolean canBeSpatialized;
        String str = zzzVar.zzo;
        if (Objects.equals(str, "audio/eac3-joc")) {
            i = zzzVar.zzG;
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            i = zzzVar.zzG;
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, "audio/ac4")) {
            i = zzzVar.zzG;
            if (i == 18 || i == 21) {
                i = 24;
            }
        } else {
            i = zzzVar.zzG;
        }
        int zzi = zzex.zzi(i);
        if (zzi == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzi);
        int i2 = zzzVar.zzH;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        canBeSpatialized = Timestamp$$ExternalSyntheticApiModelOutline0.m438m((Object) spatializer).canBeSpatialized(zzeVar.zza().zza, channelMask.build());
        return canBeSpatialized;
    }

    public final boolean zze() {
        return this.zzb;
    }

    public zzym(Context context, zzyu zzyuVar) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager zzc = context == null ? null : zzcj.zzc(context);
        if (zzc == null || zzex.zzN(context)) {
            this.zza = null;
            this.zzb = false;
            this.zzc = null;
            this.zzd = null;
            return;
        }
        spatializer = zzc.getSpatializer();
        this.zza = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.zzb = immersiveAudioLevel != 0;
        zzyl zzylVar = new zzyl(this, zzyuVar);
        this.zzd = zzylVar;
        Looper myLooper = Looper.myLooper();
        zzdd.zzb(myLooper);
        final Handler handler = new Handler(myLooper);
        this.zzc = handler;
        Objects.requireNonNull(handler);
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzyk
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, zzylVar);
    }

    public final boolean zzc() {
        boolean isAvailable;
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        isAvailable = Timestamp$$ExternalSyntheticApiModelOutline0.m438m((Object) spatializer).isAvailable();
        return isAvailable;
    }

    public final boolean zzd() {
        boolean isEnabled;
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        isEnabled = Timestamp$$ExternalSyntheticApiModelOutline0.m438m((Object) spatializer).isEnabled();
        return isEnabled;
    }
}
