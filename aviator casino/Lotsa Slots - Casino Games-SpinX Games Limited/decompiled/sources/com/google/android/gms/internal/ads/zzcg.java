package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcg implements android.media.AudioManager.OnAudioFocusChangeListener {
    private final android.os.Handler zza;
    private final android.media.AudioManager.OnAudioFocusChangeListener zzb;

    zzcg(android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler) {
        this.zzb = onAudioFocusChangeListener;
        android.os.Looper looper = handler.getLooper();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zza = new android.os.Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        com.google.android.gms.internal.ads.zzfl.zze(this.zza, new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcg.this.zza(i);
            }
        });
    }

    final /* synthetic */ void zza(int i) {
        this.zzb.onAudioFocusChange(i);
    }
}
