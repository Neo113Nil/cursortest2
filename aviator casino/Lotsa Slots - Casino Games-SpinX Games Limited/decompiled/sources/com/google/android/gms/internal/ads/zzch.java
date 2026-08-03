package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzch {
    private final android.media.AudioManager.OnAudioFocusChangeListener zzb;
    private final android.os.Handler zzc;
    private final com.google.android.gms.internal.ads.zzd zzd;
    private final java.lang.Object zzf;
    private final int zza = 1;
    private final boolean zze = false;

    zzch(int i, android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, android.os.Handler handler, com.google.android.gms.internal.ads.zzd zzdVar, boolean z, boolean z2) {
        this.zzc = handler;
        this.zzd = zzdVar;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            this.zzb = new com.google.android.gms.internal.ads.zzcg(onAudioFocusChangeListener, handler);
        } else {
            this.zzb = onAudioFocusChangeListener;
        }
        this.zzf = android.os.Build.VERSION.SDK_INT >= 26 ? new android.media.AudioFocusRequest.Builder(1).setAudioAttributes(zzdVar.zza()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z2).build() : null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzch)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzch zzchVar = (com.google.android.gms.internal.ads.zzch) obj;
        int i = zzchVar.zza;
        boolean z = zzchVar.zze;
        return java.util.Objects.equals(this.zzb, zzchVar.zzb) && java.util.Objects.equals(this.zzc, zzchVar.zzc) && java.util.Objects.equals(this.zzd, zzchVar.zzd);
    }

    public final int hashCode() {
        return java.util.Objects.hash(1, this.zzb, this.zzc, this.zzd, false);
    }

    public final com.google.android.gms.internal.ads.zzd zza() {
        return this.zzd;
    }

    public final android.media.AudioManager.OnAudioFocusChangeListener zzb() {
        return this.zzb;
    }

    final android.media.AudioFocusRequest zzc() {
        java.lang.Object obj = this.zzf;
        obj.getClass();
        return (android.media.AudioFocusRequest) obj;
    }
}
