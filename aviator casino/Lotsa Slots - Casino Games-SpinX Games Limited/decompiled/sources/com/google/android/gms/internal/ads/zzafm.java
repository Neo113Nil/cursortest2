package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzafm implements com.google.android.gms.internal.ads.zzahb {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzafm(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final java.lang.String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        java.lang.String arrays = java.util.Arrays.toString(this.zzb);
        java.lang.String arrays2 = java.util.Arrays.toString(jArr3);
        java.lang.String arrays3 = java.util.Arrays.toString(jArr2);
        java.lang.String arrays4 = java.util.Arrays.toString(jArr);
        int i = this.zza;
        int length = java.lang.String.valueOf(i).length();
        int length2 = java.lang.String.valueOf(arrays).length();
        int length3 = java.lang.String.valueOf(arrays2).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 26 + length2 + 10 + length3 + 9 + java.lang.String.valueOf(arrays3).length() + 14 + java.lang.String.valueOf(arrays4).length() + 1);
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        long[] jArr = this.zze;
        int zzo = com.google.android.gms.internal.ads.zzfl.zzo(jArr, j, true, true);
        long j2 = jArr[zzo];
        long[] jArr2 = this.zzc;
        com.google.android.gms.internal.ads.zzahc zzahcVar = new com.google.android.gms.internal.ads.zzahc(j2, jArr2[zzo]);
        if (zzahcVar.zzb >= j || zzo == this.zza - 1) {
            return new com.google.android.gms.internal.ads.zzagz(zzahcVar, zzahcVar);
        }
        int i = zzo + 1;
        return new com.google.android.gms.internal.ads.zzagz(zzahcVar, new com.google.android.gms.internal.ads.zzahc(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }
}
