package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
final class zzalo implements zzajn {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzalo(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i7 = 0; i7 < list.size(); i7++) {
            zzald zzaldVar = (zzald) list.get(i7);
            long[] jArr = this.zzb;
            int i8 = i7 + i7;
            jArr[i8] = zzaldVar.zzb;
            jArr[i8 + 1] = zzaldVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final long zzb(int i7) {
        zzcv.zzd(i7 >= 0);
        zzcv.zzd(i7 < this.zzc.length);
        return this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final List zzc(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < this.zza.size(); i7++) {
            long[] jArr = this.zzb;
            int i8 = i7 + i7;
            if (jArr[i8] <= j && j < jArr[i8 + 1]) {
                zzald zzaldVar = (zzald) this.zza.get(i7);
                zzcn zzcnVar = zzaldVar.zza;
                if (zzcnVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzaldVar);
                } else {
                    arrayList.add(zzcnVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzaln
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((zzald) obj).zzb, ((zzald) obj2).zzb);
            }
        });
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            zzcl zzb = ((zzald) arrayList2.get(i9)).zza.zzb();
            zzb.zze((-1) - i9, 1);
            arrayList.add(zzb.zzp());
        }
        return arrayList;
    }
}
