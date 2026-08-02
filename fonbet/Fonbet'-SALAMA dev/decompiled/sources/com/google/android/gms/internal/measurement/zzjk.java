package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
final class zzjk implements zznd {
    private final zzjj zza;

    private zzjk(zzjj zzjjVar) {
        zzkk.zzf(zzjjVar, "output");
        this.zza = zzjjVar;
        zzjjVar.zza = this;
    }

    public static zzjk zza(zzjj zzjjVar) {
        zzjk zzjkVar = zzjjVar.zza;
        return zzjkVar != null ? zzjkVar : new zzjk(zzjjVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzA(int i7, int i8) {
        this.zza.zzp(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzB(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                zzjj zzjjVar = this.zza;
                int intValue = ((Integer) list.get(i8)).intValue();
                zzjjVar.zzp(i7, (intValue >> 31) ^ (intValue + intValue));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            int intValue2 = ((Integer) list.get(i10)).intValue();
            i9 += zzjj.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            zzjj zzjjVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i8)).intValue();
            zzjjVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzC(int i7, long j) {
        this.zza.zzr(i7, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzD(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                zzjj zzjjVar = this.zza;
                long longValue = ((Long) list.get(i8)).longValue();
                zzjjVar.zzr(i7, (longValue >> 63) ^ (longValue + longValue));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            long longValue2 = ((Long) list.get(i10)).longValue();
            i9 += zzjj.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            zzjj zzjjVar2 = this.zza;
            long longValue3 = ((Long) list.get(i8)).longValue();
            zzjjVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    @Deprecated
    public final void zzE(int i7) {
        this.zza.zzo(i7, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzF(int i7, String str) {
        this.zza.zzm(i7, str);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzG(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof zzkr)) {
            while (i8 < list.size()) {
                this.zza.zzm(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        zzkr zzkrVar = (zzkr) list;
        while (i8 < list.size()) {
            Object zzf = zzkrVar.zzf(i8);
            if (zzf instanceof String) {
                this.zza.zzm(i7, (String) zzf);
            } else {
                this.zza.zze(i7, (zzjb) zzf);
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzH(int i7, int i8) {
        this.zza.zzp(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzI(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                this.zza.zzp(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += zzjj.zzA(((Integer) list.get(i10)).intValue());
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            this.zza.zzq(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzJ(int i7, long j) {
        this.zza.zzr(i7, j);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzK(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                this.zza.zzr(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += zzjj.zzB(((Long) list.get(i10)).longValue());
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            this.zza.zzs(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzb(int i7, boolean z4) {
        this.zza.zzd(i7, z4);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzc(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                this.zza.zzd(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Boolean) list.get(i10)).getClass();
            i9++;
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzd(int i7, zzjb zzjbVar) {
        this.zza.zze(i7, zzjbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zze(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.zza.zze(i7, (zzjb) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzf(int i7, double d7) {
        this.zza.zzh(i7, Double.doubleToRawLongBits(d7));
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzg(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                this.zza.zzh(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Double) list.get(i10)).getClass();
            i9 += 8;
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    @Deprecated
    public final void zzh(int i7) {
        this.zza.zzo(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzi(int i7, int i8) {
        this.zza.zzj(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzj(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                this.zza.zzj(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += zzjj.zzv(((Integer) list.get(i10)).intValue());
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            this.zza.zzk(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzk(int i7, int i8) {
        this.zza.zzf(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzl(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                this.zza.zzf(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            i9 += 4;
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            this.zza.zzg(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzm(int i7, long j) {
        this.zza.zzh(i7, j);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzn(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            i9 += 8;
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            this.zza.zzi(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzo(int i7, float f7) {
        this.zza.zzf(i7, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzp(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                this.zza.zzf(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Float) list.get(i10)).getClass();
            i9 += 4;
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzq(int i7, Object obj, zzlu zzluVar) {
        zzjj zzjjVar = this.zza;
        zzjjVar.zzo(i7, 3);
        zzluVar.zzi((zzlj) obj, zzjjVar.zza);
        zzjjVar.zzo(i7, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzr(int i7, int i8) {
        this.zza.zzj(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzs(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                this.zza.zzj(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += zzjj.zzv(((Integer) list.get(i10)).intValue());
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            this.zza.zzk(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzt(int i7, long j) {
        this.zza.zzr(i7, j);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzu(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                this.zza.zzr(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            i9 += zzjj.zzB(((Long) list.get(i10)).longValue());
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            this.zza.zzs(((Long) list.get(i8)).longValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzv(int i7, Object obj, zzlu zzluVar) {
        Object obj2 = (zzlj) obj;
        zzjg zzjgVar = (zzjg) this.zza;
        zzjgVar.zzq((i7 << 3) | 2);
        zzil zzilVar = (zzil) obj2;
        int zzbu = zzilVar.zzbu();
        if (zzbu == -1) {
            zzbu = zzluVar.zza(zzilVar);
            zzilVar.zzbx(zzbu);
        }
        zzjgVar.zzq(zzbu);
        zzluVar.zzi(obj2, zzjgVar.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzw(int i7, int i8) {
        this.zza.zzf(i7, i8);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzx(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                this.zza.zzf(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Integer) list.get(i10)).getClass();
            i9 += 4;
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            this.zza.zzg(((Integer) list.get(i8)).intValue());
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzy(int i7, long j) {
        this.zza.zzh(i7, j);
    }

    @Override // com.google.android.gms.internal.measurement.zznd
    public final void zzz(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!z4) {
            while (i8 < list.size()) {
                this.zza.zzh(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        this.zza.zzo(i7, 2);
        int i9 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((Long) list.get(i10)).getClass();
            i9 += 8;
        }
        this.zza.zzq(i9);
        while (i8 < list.size()) {
            this.zza.zzi(((Long) list.get(i8)).longValue());
            i8++;
        }
    }
}
