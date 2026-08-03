package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzakf implements com.google.android.gms.internal.ads.zzahb {
    private final com.google.android.gms.internal.ads.zzafm zza;
    private final android.util.SparseArray zzb;
    private final long zzc;
    private final int zzd;

    public zzakf(android.util.SparseArray sparseArray, long j, int i, long j2, long j3) {
        int i2;
        this.zzb = sparseArray;
        this.zzc = j;
        this.zzd = i;
        java.util.List list = (java.util.List) sparseArray.get(i);
        com.google.android.gms.internal.ads.zzafm zzafmVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                com.google.android.gms.internal.ads.zzake zzakeVar = (com.google.android.gms.internal.ads.zzake) list.get(i4);
                jArr3[i4] = zzakeVar.zza();
                jArr[i4] = zzakeVar.zzb();
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                jArr2[i3] = jArr3[i5] - jArr3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArr3[i6] >= j) {
                i6--;
            }
            iArr[i6] = (int) ((j2 + j3) - jArr[i6]);
            jArr2[i6] = j - jArr3[i6];
            if (i6 < i2) {
                com.google.android.gms.internal.ads.zzeg.zzc("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArr = java.util.Arrays.copyOf(iArr, i7);
                jArr = java.util.Arrays.copyOf(jArr, i7);
                jArr2 = java.util.Arrays.copyOf(jArr2, i7);
                jArr3 = java.util.Arrays.copyOf(jArr3, i7);
            }
            zzafmVar = new com.google.android.gms.internal.ads.zzafm(iArr, jArr, jArr2, jArr3);
        }
        this.zza = zzafmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final boolean zzb() {
        java.util.List list = (java.util.List) this.zzb.get(this.zzd);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public final com.google.android.gms.internal.ads.zzagz zzc(long j) {
        com.google.android.gms.internal.ads.zzafm zzafmVar = this.zza;
        if (zzafmVar != null) {
            return zzafmVar.zzc(j);
        }
        com.google.android.gms.internal.ads.zzahc zzahcVar = com.google.android.gms.internal.ads.zzahc.zza;
        return new com.google.android.gms.internal.ads.zzagz(zzahcVar, zzahcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahb
    public /* synthetic */ boolean zzj() {
        return com.google.android.gms.internal.ads.zzahb.CC.$default$zzj(this);
    }
}
