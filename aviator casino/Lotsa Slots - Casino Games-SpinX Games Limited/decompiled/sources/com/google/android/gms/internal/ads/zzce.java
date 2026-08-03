package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzce {
    private android.media.AudioManager.OnAudioFocusChangeListener zza;
    private android.os.Handler zzb;
    private com.google.android.gms.internal.ads.zzd zzc = com.google.android.gms.internal.ads.zzd.zza;
    private boolean zzd;

    public zzce(int i) {
    }

    public final com.google.android.gms.internal.ads.zzce zza(android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler) {
        this.zza = onAudioFocusChangeListener;
        this.zzb = handler;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzce zzb(com.google.android.gms.internal.ads.zzd zzdVar) {
        this.zzc = zzdVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzce zzc(boolean z) {
        this.zzd = true;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzch zzd() {
        android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.zza;
        if (onAudioFocusChangeListener == null) {
            throw new java.lang.IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }
        android.os.Handler handler = this.zzb;
        handler.getClass();
        return new com.google.android.gms.internal.ads.zzch(1, onAudioFocusChangeListener, handler, this.zzc, false, this.zzd);
    }
}
