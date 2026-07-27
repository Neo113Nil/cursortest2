package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcj {
    private static AudioManager zza;

    public static synchronized AudioManager zza(Context context) {
        synchronized (zzcj.class) {
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                zza = null;
            }
            AudioManager audioManager = zza;
            if (audioManager != null) {
                return audioManager;
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper != null && myLooper != Looper.getMainLooper()) {
                final zzdt zzdtVar = new zzdt(zzdp.zza);
                zzdi.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzci
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcj.zzb(applicationContext, zzdtVar);
                    }
                });
                zzdtVar.zzd();
                AudioManager audioManager2 = zza;
                if (audioManager2 == null) {
                    throw null;
                }
                AudioManager audioManager3 = audioManager2;
                return audioManager2;
            }
            AudioManager audioManager4 = (AudioManager) applicationContext.getSystemService("audio");
            zza = audioManager4;
            if (audioManager4 == null) {
                throw null;
            }
            AudioManager audioManager5 = audioManager4;
            return audioManager4;
        }
    }

    static /* synthetic */ void zzb(Context context, zzdt zzdtVar) {
        zza = (AudioManager) context.getSystemService("audio");
        zzdtVar.zza();
    }
}
