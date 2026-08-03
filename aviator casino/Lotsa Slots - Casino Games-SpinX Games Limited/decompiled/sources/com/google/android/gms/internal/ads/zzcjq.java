package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcjq implements com.google.android.gms.internal.ads.zzhp {
    private final com.google.android.gms.internal.ads.zzhp zza;
    private final long zzb;
    private final com.google.android.gms.internal.ads.zzhp zzc;
    private long zzd;
    private android.net.Uri zze;

    zzcjq(com.google.android.gms.internal.ads.zzhp zzhpVar, int i, com.google.android.gms.internal.ads.zzhp zzhpVar2) {
        this.zza = zzhpVar;
        this.zzb = i;
        this.zzc = zzhpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza = this.zza.zza(bArr, i, (int) java.lang.Math.min(i2, j2 - j));
            long j3 = this.zzd + zza;
            this.zzd = j3;
            i3 = zza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < j2) {
            return i3;
        }
        int zza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + zza2;
        this.zzd += zza2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzht zzhtVar2;
        android.net.Uri uri = zzhtVar.zza;
        this.zze = uri;
        long j = zzhtVar.zze;
        long j2 = this.zzb;
        com.google.android.gms.internal.ads.zzht zzhtVar3 = null;
        if (j >= j2) {
            zzhtVar2 = null;
        } else {
            long j3 = zzhtVar.zzf;
            long j4 = j2 - j;
            zzhtVar2 = new com.google.android.gms.internal.ads.zzht(uri, j, j3 != -1 ? java.lang.Math.min(j3, j4) : j4, null);
        }
        long j5 = zzhtVar.zzf;
        if (j5 == -1 || j + j5 > j2) {
            zzhtVar3 = new com.google.android.gms.internal.ads.zzht(uri, java.lang.Math.max(j2, j), j5 != -1 ? java.lang.Math.min(j5, (j + j5) - j2) : -1L, null);
        }
        long zzb = zzhtVar2 != null ? this.zza.zzb(zzhtVar2) : 0L;
        long zzb2 = zzhtVar3 != null ? this.zzc.zzb(zzhtVar3) : 0L;
        this.zzd = j;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws java.io.IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zze(com.google.android.gms.internal.ads.zzin zzinVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final java.util.Map zzj() {
        return com.google.android.gms.internal.ads.zzgwp.zza();
    }
}
