package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcj {
    private static android.media.AudioManager zza;

    public static synchronized android.media.AudioManager zza(android.content.Context context) {
        synchronized (com.google.android.gms.internal.ads.zzcj.class) {
            final android.content.Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                zza = null;
            }
            android.media.AudioManager audioManager = zza;
            if (audioManager != null) {
                return audioManager;
            }
            android.os.Looper myLooper = android.os.Looper.myLooper();
            if (myLooper != null && myLooper != android.os.Looper.getMainLooper()) {
                final com.google.android.gms.internal.ads.zzds zzdsVar = new com.google.android.gms.internal.ads.zzds(com.google.android.gms.internal.ads.zzdo.zza);
                com.google.android.gms.internal.ads.zzdh.zza().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzci
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzcj.zzb(applicationContext, zzdsVar);
                    }
                });
                zzdsVar.zzd();
                android.media.AudioManager audioManager2 = zza;
                audioManager2.getClass();
                android.media.AudioManager audioManager3 = audioManager2;
                return audioManager2;
            }
            android.media.AudioManager audioManager4 = (android.media.AudioManager) applicationContext.getSystemService("audio");
            zza = audioManager4;
            audioManager4.getClass();
            android.media.AudioManager audioManager5 = audioManager4;
            return audioManager4;
        }
    }

    static /* synthetic */ void zzb(android.content.Context context, com.google.android.gms.internal.ads.zzds zzdsVar) {
        zza = (android.media.AudioManager) context.getSystemService("audio");
        zzdsVar.zza();
    }
}
