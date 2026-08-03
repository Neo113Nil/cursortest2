package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzafn {
    private final java.util.Map zza = new java.util.LinkedHashMap();

    public final void zza(com.google.android.gms.internal.ads.zzafm zzafmVar) {
        long[] jArr = zzafmVar.zze;
        if (jArr.length > 0) {
            java.util.Map map = this.zza;
            if (map.containsKey(java.lang.Long.valueOf(jArr[0]))) {
                return;
            }
            map.put(java.lang.Long.valueOf(jArr[0]), zzafmVar);
        }
    }

    public final com.google.android.gms.internal.ads.zzafm zzb() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (com.google.android.gms.internal.ads.zzafm zzafmVar : this.zza.values()) {
            arrayList.add(zzafmVar.zzb);
            arrayList2.add(zzafmVar.zzc);
            arrayList3.add(zzafmVar.zzd);
            arrayList4.add(zzafmVar.zze);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j = 0;
        for (int[] iArr2 : iArr) {
            j += iArr2.length;
        }
        int i = (int) j;
        com.google.android.gms.internal.ads.zzgtj.zze(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        int[] iArr3 = new int[i];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            int length = iArr4.length;
            java.lang.System.arraycopy(iArr4, 0, iArr3, i2, length);
            i2 += length;
        }
        return new com.google.android.gms.internal.ads.zzafm(iArr3, com.google.android.gms.internal.ads.zzhak.zza((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), com.google.android.gms.internal.ads.zzhak.zza((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), com.google.android.gms.internal.ads.zzhak.zza((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public final int zzc() {
        return this.zza.size();
    }
}
