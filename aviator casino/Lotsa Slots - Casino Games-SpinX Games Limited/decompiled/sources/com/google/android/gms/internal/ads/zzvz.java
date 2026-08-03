package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzvz implements com.google.android.gms.internal.ads.zzvy {
    private zzvz() {
        throw null;
    }

    /* synthetic */ zzvz(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zza() {
        return android.media.MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final android.media.MediaCodecInfo zzb(int i) {
        return android.media.MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final boolean zzd(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final boolean zze(java.lang.String str, java.lang.String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }
}
