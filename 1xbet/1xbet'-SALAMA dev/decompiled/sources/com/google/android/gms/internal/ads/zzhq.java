package com.google.android.gms.internal.ads;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzhq {
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

    public final String toString() {
        int i7 = this.zza;
        int i8 = this.zzb;
        int i9 = this.zzc;
        int i10 = this.zzd;
        int i11 = this.zze;
        int i12 = this.zzf;
        int i13 = this.zzg;
        int i14 = this.zzh;
        int i15 = this.zzi;
        int i16 = this.zzj;
        long j = this.zzk;
        int i17 = this.zzl;
        int i18 = zzen.zza;
        Locale locale = Locale.US;
        StringBuilder sbG = p150v0.a.g("DecoderCounters {\n decoderInits=", i7, ",\n decoderReleases=", i8, "\n queuedInputBuffers=");
        sbG.append(i9);
        sbG.append("\n skippedInputBuffers=");
        sbG.append(i10);
        sbG.append("\n renderedOutputBuffers=");
        sbG.append(i11);
        sbG.append("\n skippedOutputBuffers=");
        sbG.append(i12);
        sbG.append("\n droppedBuffers=");
        sbG.append(i13);
        sbG.append("\n droppedInputBuffers=");
        sbG.append(i14);
        sbG.append("\n maxConsecutiveDroppedBuffers=");
        sbG.append(i15);
        sbG.append("\n droppedToKeyframeEvents=");
        sbG.append(i16);
        sbG.append("\n totalVideoFrameProcessingOffsetUs=");
        sbG.append(j);
        sbG.append("\n videoFrameProcessingOffsetCount=");
        sbG.append(i17);
        sbG.append("\n}");
        return sbG.toString();
    }

    public final synchronized void zza() {
    }
}
