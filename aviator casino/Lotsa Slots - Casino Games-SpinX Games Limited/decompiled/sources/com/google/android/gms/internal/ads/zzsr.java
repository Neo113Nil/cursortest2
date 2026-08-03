package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzsr implements com.google.android.gms.internal.ads.zzte {
    final /* synthetic */ com.google.android.gms.internal.ads.zzsy zza;

    /* synthetic */ zzsr(com.google.android.gms.internal.ads.zzsy zzsyVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzsyVar);
        this.zza = zzsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zza(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 41);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j);
        com.google.android.gms.internal.ads.zzeg.zzc("AudioTrackAudioOutput", sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final void zzb(final long j) {
        com.google.android.gms.internal.ads.zzsy zzsyVar = this.zza;
        if (zzsyVar.zzu().zzb()) {
            com.google.android.gms.internal.ads.zzef zzu = zzsyVar.zzu();
            zzu.zze(-1, new com.google.android.gms.internal.ads.zzea() { // from class: com.google.android.gms.internal.ads.zzsq
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(java.lang.Object obj) {
                    ((com.google.android.gms.internal.ads.zzqt) obj).zza(j);
                }
            });
            zzu.zzf();
        }
    }
}
