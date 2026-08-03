package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzacu {
    final /* synthetic */ com.google.android.gms.internal.ads.zzacv zza;
    private com.google.android.gms.internal.ads.zzv zzb;

    /* synthetic */ zzacu(com.google.android.gms.internal.ads.zzacv zzacvVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzacvVar);
        this.zza = zzacvVar;
    }

    public final void zza(final com.google.android.gms.internal.ads.zzbv zzbvVar) {
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zzv(zzbvVar.zzb);
        zztVar.zzw(zzbvVar.zzc);
        zztVar.zzo(androidx.media3.common.MimeTypes.VIDEO_RAW);
        this.zzb = zztVar.zzO();
        this.zza.zzC().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzact
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzacu.this.zza.zzB().zzd(zzbvVar);
            }
        });
    }

    public final void zzb(long j, long j2, boolean z) {
        if (z) {
            com.google.android.gms.internal.ads.zzacv zzacvVar = this.zza;
            if (zzacvVar.zzA() != null) {
                zzacvVar.zzC().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzacr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzacu.this.zza.zzB().zzb();
                    }
                });
            }
        }
        com.google.android.gms.internal.ads.zzv zzvVar = this.zzb;
        if (zzvVar == null) {
            zzvVar = new com.google.android.gms.internal.ads.zzt().zzO();
        }
        com.google.android.gms.internal.ads.zzv zzvVar2 = zzvVar;
        com.google.android.gms.internal.ads.zzacv zzacvVar2 = this.zza;
        zzacvVar2.zzD().zzcS(j2, j, zzvVar2, null);
        ((com.google.android.gms.internal.ads.zzaes) zzacvVar2.zzz().remove()).zza(j);
    }
}
