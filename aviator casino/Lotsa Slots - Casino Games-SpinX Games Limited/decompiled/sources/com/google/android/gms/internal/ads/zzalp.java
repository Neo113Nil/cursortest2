package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzalp implements com.google.android.gms.internal.ads.zzahb {
    private final android.util.SparseArray zza;
    private final android.util.SparseArray zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    /* synthetic */ zzalp(android.util.SparseArray sparseArray, android.util.SparseArray sparseArray2, long j, long j2, int i, byte[] bArr) {
        this.zza = sparseArray;
        this.zzb = sparseArray2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
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
        android.util.SparseArray sparseArray = this.zza;
        int i = this.zze;
        long[] jArr = (long[]) sparseArray.get(i);
        android.util.SparseArray sparseArray2 = this.zzb;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i);
            jArr2 = (long[]) sparseArray2.get(i);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j < jArr[0]) {
            com.google.android.gms.internal.ads.zzahc zzahcVar = new com.google.android.gms.internal.ads.zzahc(0L, this.zzd);
            return new com.google.android.gms.internal.ads.zzagz(zzahcVar, zzahcVar);
        }
        int zzo = com.google.android.gms.internal.ads.zzfl.zzo(jArr, j, true, true);
        com.google.android.gms.internal.ads.zzahc zzahcVar2 = new com.google.android.gms.internal.ads.zzahc(jArr[zzo], jArr2[zzo]);
        return new com.google.android.gms.internal.ads.zzagz(zzahcVar2, zzahcVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }
}
