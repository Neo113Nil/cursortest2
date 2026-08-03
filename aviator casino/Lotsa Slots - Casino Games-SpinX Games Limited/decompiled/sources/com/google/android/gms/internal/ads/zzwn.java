package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzwn implements com.google.android.gms.internal.ads.zzzc {
    public final com.google.android.gms.internal.ads.zzzc zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzwo zzb;
    private boolean zzc;

    public zzwn(com.google.android.gms.internal.ads.zzwo zzwoVar, com.google.android.gms.internal.ads.zzzc zzzcVar) {
        java.util.Objects.requireNonNull(zzwoVar);
        this.zzb = zzwoVar;
        this.zza = zzzcVar;
    }

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final void zzc() throws java.io.IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zzd(com.google.android.gms.internal.ads.zzlw zzlwVar, com.google.android.gms.internal.ads.zziv zzivVar, int i) {
        com.google.android.gms.internal.ads.zzwo zzwoVar = this.zzb;
        if (zzwoVar.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzivVar.zzg(4);
            return -4;
        }
        com.google.android.gms.internal.ads.zzzc zzzcVar = this.zza;
        long zzi = zzwoVar.zzi();
        int zzd = zzzcVar.zzd(zzlwVar, zzivVar, i);
        if (zzwoVar.zzq() != -9223372036854775807L && zzd != -3) {
            zzwoVar.zzr(-9223372036854775807L);
        }
        if (zzd != -5) {
            long j = zzwoVar.zzb;
            if (j == Long.MIN_VALUE || ((zzd != -4 || zzivVar.zze < j) && !(zzd == -3 && zzi == Long.MIN_VALUE && !zzivVar.zzd))) {
                return zzd;
            }
            zzivVar.zza();
            zzivVar.zzg(4);
            this.zzc = true;
            return -4;
        }
        long j2 = zzwoVar.zzb;
        com.google.android.gms.internal.ads.zzv zzvVar = zzlwVar.zzb;
        zzvVar.getClass();
        int i2 = zzvVar.zzK;
        if (i2 == 0) {
            if (zzvVar.zzL != 0) {
                i2 = 0;
            }
            return -5;
        }
        int i3 = j2 == Long.MIN_VALUE ? zzvVar.zzL : 0;
        com.google.android.gms.internal.ads.zzt zza = zzvVar.zza();
        zza.zzJ(i2);
        zza.zzK(i3);
        zzlwVar.zzb = zza.zzO();
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzzc
    public final int zze(long j) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j);
    }
}
