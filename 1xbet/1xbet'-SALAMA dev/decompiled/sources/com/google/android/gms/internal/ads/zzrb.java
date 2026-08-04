package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzrb implements zzpu {
    final /* synthetic */ zzrd zza;

    public /* synthetic */ zzrb(zzrd zzrdVar, zzrc zzrcVar) {
        this.zza = zzrdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpu
    public final void zza(Exception exc) {
        zzdq.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzn(exc);
    }
}
