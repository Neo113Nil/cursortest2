package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class zzxe implements zzyh {
    protected final zzbo zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzz[] zzd;
    private int zze;

    public zzxe(zzbo zzboVar, int[] iArr, int i7) {
        int length = iArr.length;
        zzcv.zzf(length > 0);
        zzboVar.getClass();
        this.zza = zzboVar;
        this.zzb = length;
        this.zzd = new zzz[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.zzd[i8] = zzboVar.zzb(iArr[i8]);
        }
        Arrays.sort(this.zzd, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzz) obj2).zzj - ((zzz) obj).zzj;
            }
        });
        this.zzc = new int[this.zzb];
        for (int i9 = 0; i9 < this.zzb; i9++) {
            this.zzc[i9] = zzboVar.zza(this.zzd[i9]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzxe zzxeVar = (zzxe) obj;
            if (this.zza.equals(zzxeVar.zza) && Arrays.equals(this.zzc, zzxeVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zze;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
        this.zze = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzyl
    public final int zza(int i7) {
        return this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int zzb() {
        return this.zzc[0];
    }

    @Override // com.google.android.gms.internal.ads.zzyl
    public final int zzc(int i7) {
        for (int i8 = 0; i8 < this.zzb; i8++) {
            if (this.zzc[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzyl
    public final int zzd() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzyl
    public final zzz zze(int i7) {
        return this.zzd[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final zzz zzf() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzyl
    public final zzbo zzg() {
        return this.zza;
    }
}
