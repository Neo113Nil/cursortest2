package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzalg implements zzalf {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzalg(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = i;
    }

    public static zzalg zze(long j, long j2, zzahe zzaheVar, zzeu zzeuVar) {
        long j3;
        int zzs;
        zzeuVar.zzk(6);
        int zzB = zzeuVar.zzB();
        long j4 = zzaheVar.zzc;
        long j5 = zzB;
        if (zzeuVar.zzB() <= 0) {
            return null;
        }
        long zzu = zzfm.zzu((r4 * zzaheVar.zzg) - 1, zzaheVar.zzd);
        int zzt = zzeuVar.zzt();
        int zzt2 = zzeuVar.zzt();
        int zzt3 = zzeuVar.zzt();
        zzeuVar.zzk(2);
        long j6 = j2 + zzaheVar.zzc;
        long[] jArr = new long[zzt];
        long[] jArr2 = new long[zzt];
        for (int i = 0; i < zzt; i++) {
            jArr[i] = (i * zzu) / zzt;
            jArr2[i] = j6;
            if (zzt3 == 1) {
                zzs = zzeuVar.zzs();
            } else if (zzt3 == 2) {
                zzs = zzeuVar.zzt();
            } else if (zzt3 == 3) {
                zzs = zzeuVar.zzx();
            } else {
                if (zzt3 != 4) {
                    return null;
                }
                zzs = zzeuVar.zzH();
            }
            j6 += zzs * zzt2;
        }
        long j7 = j2 + j4;
        long j8 = j5 + j7;
        if (j != -1 && j != j8) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 27 + String.valueOf(j8).length());
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(j8);
            zzeh.zzc("VbriSeeker", sb.toString());
        }
        if (j8 != j6) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 43 + String.valueOf(j6).length() + 28);
            sb2.append("VBRI bytes and ToC mismatch (using max): ");
            sb2.append(j8);
            sb2.append(", ");
            sb2.append(j6);
            sb2.append("\nSeeking will be inaccurate.");
            zzeh.zzc("VbriSeeker", sb2.toString());
            j3 = Math.max(j8, j6);
        } else {
            j3 = j8;
        }
        return new zzalg(jArr, jArr2, zzu, j7, j3, zzaheVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j) {
        long[] jArr = this.zza;
        int zzo = zzfm.zzo(jArr, j, true, true);
        long j2 = jArr[zzo];
        long[] jArr2 = this.zzb;
        zzahl zzahlVar = new zzahl(j2, jArr2[zzo]);
        if (zzahlVar.zzb >= j || zzo == jArr.length - 1) {
            return new zzahi(zzahlVar, zzahlVar);
        }
        int i = zzo + 1;
        return new zzahi(zzahlVar, new zzahl(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzf(long j) {
        return this.zza[zzfm.zzo(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final int zzh() {
        return this.zze;
    }
}
