package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzjb {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final java.lang.String toString() {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zze), java.lang.Integer.valueOf(this.zzf), java.lang.Integer.valueOf(this.zzg), java.lang.Integer.valueOf(this.zzh), java.lang.Integer.valueOf(this.zzi), java.lang.Integer.valueOf(this.zzj), java.lang.Long.valueOf(this.zzk), java.lang.Integer.valueOf(this.zzl)};
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return java.lang.String.format(java.util.Locale.US, "DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", objArr);
    }

    public final synchronized void zza() {
    }
}
