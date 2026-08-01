package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzamn implements zzahk {
    private final long zza;
    private final zzamo[] zzb;
    private final int zzc;

    public zzamn(long j, zzamo[] zzamoVarArr, int i) {
        this.zza = j;
        this.zzb = zzamoVarArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    @Override // com.google.android.gms.internal.ads.zzahk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzahi zzc(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        int zzl;
        int zzc;
        zzamo[] zzamoVarArr = this.zzb;
        if (zzamoVarArr.length == 0) {
            zzahl zzahlVar = zzahl.zza;
            return new zzahi(zzahlVar, zzahlVar);
        }
        int i2 = this.zzc;
        long j6 = -9223372036854775807L;
        if (i2 != -1) {
            zzamz zzamzVar = zzamoVarArr[i2].zzb;
            zzl = zzamp.zzl(zzamzVar, j);
            if (zzl == -1) {
                zzahl zzahlVar2 = zzahl.zza;
                return new zzahi(zzahlVar2, zzahlVar2);
            }
            long[] jArr = zzamzVar.zzf;
            j3 = jArr[zzl];
            long[] jArr2 = zzamzVar.zzc;
            j2 = jArr2[zzl];
            if (j3 < j && zzl < zzamzVar.zzb - 1 && (zzc = zzamzVar.zzc(j)) != -1 && zzc != zzl) {
                j4 = jArr[zzc];
                j5 = jArr2[zzc];
                i = 0;
                long j7 = j2;
                long j8 = j5;
                while (i < zzamoVarArr.length) {
                    if (i != i2) {
                        zzamz zzamzVar2 = zzamoVarArr[i].zzb;
                        j7 = zzamp.zzh(zzamzVar2, j3, j7);
                        if (j4 != j6) {
                            j8 = zzamp.zzh(zzamzVar2, j4, j8);
                            i++;
                            j6 = -9223372036854775807L;
                        }
                    }
                    i++;
                    j6 = -9223372036854775807L;
                }
                long j9 = j8;
                zzahl zzahlVar3 = new zzahl(j3, j7);
                return j4 != -9223372036854775807L ? new zzahi(zzahlVar3, zzahlVar3) : new zzahi(zzahlVar3, new zzahl(j4, j9));
            }
        } else {
            j2 = Long.MAX_VALUE;
            j3 = j;
        }
        j4 = -9223372036854775807L;
        j5 = -1;
        i = 0;
        long j72 = j2;
        long j82 = j5;
        while (i < zzamoVarArr.length) {
        }
        long j92 = j82;
        zzahl zzahlVar32 = new zzahl(j3, j72);
        if (j4 != -9223372036854775807L) {
        }
    }
}
