package com.google.android.gms.internal.ads;

import java.util.Locale;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
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
        StringBuilder g3 = AbstractC1663a.g("DecoderCounters {\n decoderInits=", i7, ",\n decoderReleases=", i8, "\n queuedInputBuffers=");
        g3.append(i9);
        g3.append("\n skippedInputBuffers=");
        g3.append(i10);
        g3.append("\n renderedOutputBuffers=");
        g3.append(i11);
        g3.append("\n skippedOutputBuffers=");
        g3.append(i12);
        g3.append("\n droppedBuffers=");
        g3.append(i13);
        g3.append("\n droppedInputBuffers=");
        g3.append(i14);
        g3.append("\n maxConsecutiveDroppedBuffers=");
        g3.append(i15);
        g3.append("\n droppedToKeyframeEvents=");
        g3.append(i16);
        g3.append("\n totalVideoFrameProcessingOffsetUs=");
        g3.append(j);
        g3.append("\n videoFrameProcessingOffsetCount=");
        g3.append(i17);
        g3.append("\n}");
        return g3.toString();
    }

    public final synchronized void zza() {
    }
}
