package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
final class zzti implements zztg {
    private final int zza;
    private MediaCodecInfo[] zzb;

    public zzti(boolean z4, boolean z7, boolean z8) {
        int i7 = 1;
        if (!z4 && !z7 && !z8) {
            i7 = 0;
        }
        this.zza = i7;
    }

    private final void zzf() {
        if (this.zzb == null) {
            this.zzb = new MediaCodecList(this.zza).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final int zza() {
        zzf();
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final MediaCodecInfo zzb(int i7) {
        zzf();
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.zztg
    public final boolean zze() {
        return true;
    }
}
