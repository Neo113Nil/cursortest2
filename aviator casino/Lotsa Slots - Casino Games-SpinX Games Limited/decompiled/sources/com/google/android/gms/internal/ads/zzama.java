package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzama implements com.google.android.gms.internal.ads.zzahb {
    private final long zza;
    private final com.google.android.gms.internal.ads.zzamb[] zzb;
    private final int zzc;

    public zzama(long j, com.google.android.gms.internal.ads.zzamb[] zzambVarArr, int i) {
        this.zza = j;
        this.zzb = zzambVarArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    @Override // com.google.android.gms.internal.ads.zzahb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        int zzl;
        int zzb;
        com.google.android.gms.internal.ads.zzamb[] zzambVarArr = this.zzb;
        if (zzambVarArr.length == 0) {
            com.google.android.gms.internal.ads.zzahc zzahcVar = com.google.android.gms.internal.ads.zzahc.zza;
            return new com.google.android.gms.internal.ads.zzagz(zzahcVar, zzahcVar);
        }
        int i2 = this.zzc;
        long j6 = -9223372036854775807L;
        if (i2 != -1) {
            com.google.android.gms.internal.ads.zzaml zzamlVar = zzambVarArr[i2].zzb;
            zzl = com.google.android.gms.internal.ads.zzamc.zzl(zzamlVar, j);
            if (zzl == -1) {
                com.google.android.gms.internal.ads.zzahc zzahcVar2 = com.google.android.gms.internal.ads.zzahc.zza;
                return new com.google.android.gms.internal.ads.zzagz(zzahcVar2, zzahcVar2);
            }
            long[] jArr = zzamlVar.zzf;
            j3 = jArr[zzl];
            long[] jArr2 = zzamlVar.zzc;
            j2 = jArr2[zzl];
            if (j3 < j && zzl < zzamlVar.zzb - 1 && (zzb = zzamlVar.zzb(j)) != -1 && zzb != zzl) {
                j4 = jArr[zzb];
                j5 = jArr2[zzb];
                i = 0;
                long j7 = j2;
                long j8 = j5;
                while (i < zzambVarArr.length) {
                    if (i != i2) {
                        com.google.android.gms.internal.ads.zzaml zzamlVar2 = zzambVarArr[i].zzb;
                        j7 = com.google.android.gms.internal.ads.zzamc.zzh(zzamlVar2, j3, j7);
                        if (j4 != j6) {
                            j8 = com.google.android.gms.internal.ads.zzamc.zzh(zzamlVar2, j4, j8);
                            i++;
                            j6 = -9223372036854775807L;
                        }
                    }
                    i++;
                    j6 = -9223372036854775807L;
                }
                long j9 = j8;
                com.google.android.gms.internal.ads.zzahc zzahcVar3 = new com.google.android.gms.internal.ads.zzahc(j3, j7);
                return j4 != -9223372036854775807L ? new com.google.android.gms.internal.ads.zzagz(zzahcVar3, zzahcVar3) : new com.google.android.gms.internal.ads.zzagz(zzahcVar3, new com.google.android.gms.internal.ads.zzahc(j4, j9));
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
        while (i < zzambVarArr.length) {
        }
        long j92 = j82;
        com.google.android.gms.internal.ads.zzahc zzahcVar32 = new com.google.android.gms.internal.ads.zzahc(j3, j72);
        if (j4 != -9223372036854775807L) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }
}
