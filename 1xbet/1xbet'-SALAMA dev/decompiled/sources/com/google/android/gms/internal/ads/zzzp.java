package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class zzzp {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzl
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzzn) obj).zza - ((zzzn) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzzm
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzzn) obj).zzc, ((zzzn) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzzn[] zzd = new zzzn[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzzp(int i7) {
    }

    public final float zza(float f7) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f8 = this.zzg;
        int i7 = 0;
        for (int i8 = 0; i8 < this.zzc.size(); i8++) {
            float f9 = 0.5f * f8;
            zzzn zzznVar = (zzzn) this.zzc.get(i8);
            i7 += zzznVar.zzb;
            if (i7 >= f9) {
                return zzznVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.zzc;
        return ((zzzn) arrayList.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i7, float f7) {
        zzzn zzznVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i8 = this.zzh;
        if (i8 > 0) {
            zzzn[] zzznVarArr = this.zzd;
            int i9 = i8 - 1;
            this.zzh = i9;
            zzznVar = zzznVarArr[i9];
        } else {
            zzznVar = new zzzn(null);
        }
        int i10 = this.zzf;
        this.zzf = i10 + 1;
        zzznVar.zza = i10;
        zzznVar.zzb = i7;
        zzznVar.zzc = f7;
        this.zzc.add(zzznVar);
        this.zzg += i7;
        while (true) {
            int i11 = this.zzg;
            if (i11 <= 2000) {
                return;
            }
            int i12 = i11 - 2000;
            zzzn zzznVar2 = (zzzn) this.zzc.get(0);
            int i13 = zzznVar2.zzb;
            if (i13 <= i12) {
                this.zzg -= i13;
                this.zzc.remove(0);
                int i14 = this.zzh;
                if (i14 < 5) {
                    zzzn[] zzznVarArr2 = this.zzd;
                    this.zzh = i14 + 1;
                    zzznVarArr2[i14] = zzznVar2;
                }
            } else {
                zzznVar2.zzb = i13 - i12;
                this.zzg -= i12;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
