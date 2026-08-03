package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzewi implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final android.content.Context zzb;

    public zzewi(com.google.android.gms.internal.ads.zzhcg zzhcgVar, android.content.Context context) {
        this.zza = zzhcgVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzewh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzewi.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 13;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzewj zzc() {
        int i;
        int i2;
        android.media.AudioManager audioManager = (android.media.AudioManager) this.zzb.getSystemService("audio");
        float zzb = com.google.android.gms.ads.internal.zzt.zzi().zzb();
        boolean zzd = com.google.android.gms.ads.internal.zzt.zzi().zzd();
        if (audioManager == null) {
            return new com.google.android.gms.internal.ads.zzewj(-1, false, false, -1, -1, -1, -1, -1, zzb, zzd, true);
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmt)).booleanValue()) {
            int zzk = com.google.android.gms.ads.internal.zzt.zzf().zzk(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
            i = zzk;
        } else {
            i = -1;
            i2 = -1;
        }
        return new com.google.android.gms.internal.ads.zzewj(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzb, zzd, false);
    }
}
