package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzapg implements com.google.android.gms.internal.ads.zzang {
    private final java.util.List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzapg(java.util.List list) {
        this.zza = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            com.google.android.gms.internal.ads.zzaow zzaowVar = (com.google.android.gms.internal.ads.zzaow) list.get(i);
            long[] jArr = this.zzb;
            int i2 = i + i;
            jArr[i2] = zzaowVar.zzb;
            jArr[i2 + 1] = zzaowVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] copyOf = java.util.Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = copyOf;
        java.util.Arrays.sort(copyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final long zzb(int i) {
        com.google.android.gms.internal.ads.zzgtj.zza(i >= 0);
        long[] jArr = this.zzc;
        com.google.android.gms.internal.ads.zzgtj.zza(i < jArr.length);
        return jArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final java.util.List zzc(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i = 0;
        while (true) {
            java.util.List list = this.zza;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                com.google.android.gms.internal.ads.zzaow zzaowVar = (com.google.android.gms.internal.ads.zzaow) list.get(i);
                com.google.android.gms.internal.ads.zzcx zzcxVar = zzaowVar.zza;
                if (zzcxVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzaowVar);
                } else {
                    arrayList.add(zzcxVar);
                }
            }
            i++;
        }
        java.util.Collections.sort(arrayList2, com.google.android.gms.internal.ads.zzapf.zza);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            com.google.android.gms.internal.ads.zzcw zza = ((com.google.android.gms.internal.ads.zzaow) arrayList2.get(i3)).zza.zza();
            zza.zzf((-1) - i3, 1);
            arrayList.add(zza.zzr());
        }
        return arrayList;
    }
}
