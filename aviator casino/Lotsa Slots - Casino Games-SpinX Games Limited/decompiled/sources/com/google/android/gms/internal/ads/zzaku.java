package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaku implements com.google.android.gms.internal.ads.zzakt {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzaku(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = i;
    }

    public static com.google.android.gms.internal.ads.zzaku zze(long j, long j2, com.google.android.gms.internal.ads.zzagv zzagvVar, com.google.android.gms.internal.ads.zzet zzetVar) {
        long j3;
        int zzs;
        zzetVar.zzk(6);
        int zzB = zzetVar.zzB();
        long j4 = zzagvVar.zzc;
        long j5 = zzB;
        if (zzetVar.zzB() <= 0) {
            return null;
        }
        long zzt = com.google.android.gms.internal.ads.zzfl.zzt((r4 * zzagvVar.zzg) - 1, zzagvVar.zzd);
        int zzt2 = zzetVar.zzt();
        int zzt3 = zzetVar.zzt();
        int zzt4 = zzetVar.zzt();
        zzetVar.zzk(2);
        long j6 = j2 + zzagvVar.zzc;
        long[] jArr = new long[zzt2];
        long[] jArr2 = new long[zzt2];
        for (int i = 0; i < zzt2; i++) {
            jArr[i] = (i * zzt) / zzt2;
            jArr2[i] = j6;
            if (zzt4 == 1) {
                zzs = zzetVar.zzs();
            } else if (zzt4 == 2) {
                zzs = zzetVar.zzt();
            } else if (zzt4 == 3) {
                zzs = zzetVar.zzx();
            } else {
                if (zzt4 != 4) {
                    return null;
                }
                zzs = zzetVar.zzH();
            }
            j6 += zzs * zzt3;
        }
        long j7 = j2 + j4;
        long j8 = j5 + j7;
        if (j != -1 && j != j8) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 27 + java.lang.String.valueOf(j8).length());
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(j8);
            com.google.android.gms.internal.ads.zzeg.zzc("VbriSeeker", sb.toString());
        }
        if (j8 != j6) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(j8).length() + 43 + java.lang.String.valueOf(j6).length() + 28);
            sb2.append("VBRI bytes and ToC mismatch (using max): ");
            sb2.append(j8);
            sb2.append(", ");
            sb2.append(j6);
            sb2.append("\nSeeking will be inaccurate.");
            com.google.android.gms.internal.ads.zzeg.zzc("VbriSeeker", sb2.toString());
            j3 = java.lang.Math.max(j8, j6);
        } else {
            j3 = j8;
        }
        return new com.google.android.gms.internal.ads.zzaku(jArr, jArr2, zzt, j7, j3, zzagvVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        long[] jArr = this.zza;
        int zzo = com.google.android.gms.internal.ads.zzfl.zzo(jArr, j, true, true);
        long j2 = jArr[zzo];
        long[] jArr2 = this.zzb;
        com.google.android.gms.internal.ads.zzahc zzahcVar = new com.google.android.gms.internal.ads.zzahc(j2, jArr2[zzo]);
        if (zzahcVar.zzb >= j || zzo == jArr.length - 1) {
            return new com.google.android.gms.internal.ads.zzagz(zzahcVar, zzahcVar);
        }
        int i = zzo + 1;
        return new com.google.android.gms.internal.ads.zzagz(zzahcVar, new com.google.android.gms.internal.ads.zzahc(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final long zzf(long j) {
        return this.zza[com.google.android.gms.internal.ads.zzfl.zzo(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzakt
    public final int zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }
}
