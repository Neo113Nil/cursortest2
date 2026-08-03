package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zztw implements com.google.android.gms.internal.ads.zzsb {
    final /* synthetic */ com.google.android.gms.internal.ads.zztx zza;

    /* synthetic */ zztw(com.google.android.gms.internal.ads.zztx zztxVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zztxVar);
        this.zza = zztxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsb
    public final void zza(java.lang.Exception exc) {
        com.google.android.gms.internal.ads.zzeg.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzaz().zzi(exc);
    }
}
