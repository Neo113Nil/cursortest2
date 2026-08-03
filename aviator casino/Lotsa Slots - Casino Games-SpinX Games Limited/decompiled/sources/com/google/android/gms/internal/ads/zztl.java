package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zztl {
    private final com.google.android.gms.internal.ads.zzv zza;
    private final com.google.android.gms.internal.ads.zzv zzb;
    private final int zzc;
    private final int zzd;
    private final com.google.android.gms.internal.ads.zzre zze;
    private final com.google.android.gms.internal.ads.zzck zzf;

    private zztl(com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzv zzvVar2, int i, int i2, com.google.android.gms.internal.ads.zzre zzreVar, com.google.android.gms.internal.ads.zzck zzckVar) {
        this.zza = zzvVar;
        this.zzb = zzvVar2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = zzreVar;
        this.zzf = zzckVar;
    }

    /* synthetic */ zztl(com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzv zzvVar2, int i, int i2, com.google.android.gms.internal.ads.zzre zzreVar, com.google.android.gms.internal.ads.zzck zzckVar, byte[] bArr) {
        this(zzvVar, zzvVar2, i, i2, zzreVar, zzckVar);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zztl zza(com.google.android.gms.internal.ads.zzre zzreVar) {
        return new com.google.android.gms.internal.ads.zztl(this.zza, this.zzb, this.zzc, this.zzd, zzreVar, this.zzf);
    }

    final /* synthetic */ long zzb(long j) {
        return com.google.android.gms.internal.ads.zzfl.zzt(j, this.zza.zzI);
    }

    final /* synthetic */ long zzc(long j) {
        return com.google.android.gms.internal.ads.zzfl.zzt(j, this.zze.zzb);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzry zzd() {
        com.google.android.gms.internal.ads.zzre zzreVar = this.zze;
        return new com.google.android.gms.internal.ads.zzry(zzreVar.zza, zzreVar.zzb, zzreVar.zzc, false, false, zzreVar.zze);
    }

    final /* synthetic */ boolean zze() {
        return java.util.Objects.equals(this.zza.zzp, "audio/raw");
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzv zzf() {
        return this.zza;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzv zzg() {
        return this.zzb;
    }

    final /* synthetic */ int zzh() {
        return this.zzc;
    }

    final /* synthetic */ int zzi() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzre zzj() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzck zzk() {
        return this.zzf;
    }
}
