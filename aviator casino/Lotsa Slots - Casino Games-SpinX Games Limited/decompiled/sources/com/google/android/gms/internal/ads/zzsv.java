package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzsv extends android.media.AudioTrack.StreamEventCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzsx zza;

    zzsv(com.google.android.gms.internal.ads.zzsx zzsxVar) {
        java.util.Objects.requireNonNull(zzsxVar);
        this.zza = zzsxVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(android.media.AudioTrack audioTrack, int i) {
        com.google.android.gms.internal.ads.zzef zzu = this.zza.zza.zzu();
        zzu.zze(-1, com.google.android.gms.internal.ads.zzsu.zza);
        zzu.zzf();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(android.media.AudioTrack audioTrack) {
        com.google.android.gms.internal.ads.zzef zzu = this.zza.zza.zzu();
        zzu.zze(-1, com.google.android.gms.internal.ads.zzss.zza);
        zzu.zzf();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(android.media.AudioTrack audioTrack) {
        com.google.android.gms.internal.ads.zzef zzu = this.zza.zza.zzu();
        zzu.zze(-1, com.google.android.gms.internal.ads.zzst.zza);
        zzu.zzf();
    }
}
