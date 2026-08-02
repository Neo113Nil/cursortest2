package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzgwm implements zzhal {
    private final zzgwl zza;

    private zzgwm(zzgwl zzgwlVar) {
        zzgxt.zzc(zzgwlVar, "output");
        this.zza = zzgwlVar;
        zzgwlVar.zze = this;
    }

    public static zzgwm zza(zzgwl zzgwlVar) {
        zzgwm zzgwmVar = zzgwlVar.zze;
        return zzgwmVar != null ? zzgwmVar : new zzgwm(zzgwlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzA(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgyg)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzj(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                this.zza.zzk(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzgyg zzgygVar = (zzgyg) list;
        if (!z4) {
            while (i8 < zzgygVar.size()) {
                this.zza.zzj(i7, zzgygVar.zza(i8));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgygVar.size(); i12++) {
            zzgygVar.zza(i12);
            i11 += 8;
        }
        this.zza.zzu(i11);
        while (i8 < zzgygVar.size()) {
            this.zza.zzk(zzgygVar.zza(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzB(int i7, int i8) {
        this.zza.zzt(i7, (i8 >> 31) ^ (i8 + i8));
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzC(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgxh)) {
            if (!z4) {
                while (i8 < list.size()) {
                    zzgwl zzgwlVar = this.zza;
                    int intValue = ((Integer) list.get(i8)).intValue();
                    zzgwlVar.zzt(i7, (intValue >> 31) ^ (intValue + intValue));
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                int intValue2 = ((Integer) list.get(i10)).intValue();
                i9 += zzgwl.zzD((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                zzgwl zzgwlVar2 = this.zza;
                int intValue3 = ((Integer) list.get(i8)).intValue();
                zzgwlVar2.zzu((intValue3 >> 31) ^ (intValue3 + intValue3));
                i8++;
            }
            return;
        }
        zzgxh zzgxhVar = (zzgxh) list;
        if (!z4) {
            while (i8 < zzgxhVar.size()) {
                zzgwl zzgwlVar3 = this.zza;
                int zzd = zzgxhVar.zzd(i8);
                zzgwlVar3.zzt(i7, (zzd >> 31) ^ (zzd + zzd));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgxhVar.size(); i12++) {
            int zzd2 = zzgxhVar.zzd(i12);
            i11 += zzgwl.zzD((zzd2 >> 31) ^ (zzd2 + zzd2));
        }
        this.zza.zzu(i11);
        while (i8 < zzgxhVar.size()) {
            zzgwl zzgwlVar4 = this.zza;
            int zzd3 = zzgxhVar.zzd(i8);
            zzgwlVar4.zzu((zzd3 >> 31) ^ (zzd3 + zzd3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzD(int i7, long j) {
        this.zza.zzv(i7, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzE(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgyg)) {
            if (!z4) {
                while (i8 < list.size()) {
                    zzgwl zzgwlVar = this.zza;
                    long longValue = ((Long) list.get(i8)).longValue();
                    zzgwlVar.zzv(i7, (longValue >> 63) ^ (longValue + longValue));
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                long longValue2 = ((Long) list.get(i10)).longValue();
                i9 += zzgwl.zzE((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                zzgwl zzgwlVar2 = this.zza;
                long longValue3 = ((Long) list.get(i8)).longValue();
                zzgwlVar2.zzw((longValue3 >> 63) ^ (longValue3 + longValue3));
                i8++;
            }
            return;
        }
        zzgyg zzgygVar = (zzgyg) list;
        if (!z4) {
            while (i8 < zzgygVar.size()) {
                zzgwl zzgwlVar3 = this.zza;
                long zza = zzgygVar.zza(i8);
                zzgwlVar3.zzv(i7, (zza >> 63) ^ (zza + zza));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgygVar.size(); i12++) {
            long zza2 = zzgygVar.zza(i12);
            i11 += zzgwl.zzE((zza2 >> 63) ^ (zza2 + zza2));
        }
        this.zza.zzu(i11);
        while (i8 < zzgygVar.size()) {
            zzgwl zzgwlVar4 = this.zza;
            long zza3 = zzgygVar.zza(i8);
            zzgwlVar4.zzw((zza3 >> 63) ^ (zza3 + zza3));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    @Deprecated
    public final void zzF(int i7) {
        this.zza.zzs(i7, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzG(int i7, String str) {
        this.zza.zzq(i7, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzH(int i7, List list) {
        int i8 = 0;
        if (!(list instanceof zzgyd)) {
            while (i8 < list.size()) {
                this.zza.zzq(i7, (String) list.get(i8));
                i8++;
            }
            return;
        }
        zzgyd zzgydVar = (zzgyd) list;
        while (i8 < list.size()) {
            Object zzc = zzgydVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzq(i7, (String) zzc);
            } else {
                this.zza.zzN(i7, (zzgvy) zzc);
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzI(int i7, int i8) {
        this.zza.zzt(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzJ(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgxh)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzt(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzgwl.zzD(((Integer) list.get(i10)).intValue());
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                this.zza.zzu(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzgxh zzgxhVar = (zzgxh) list;
        if (!z4) {
            while (i8 < zzgxhVar.size()) {
                this.zza.zzt(i7, zzgxhVar.zzd(i8));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgxhVar.size(); i12++) {
            i11 += zzgwl.zzD(zzgxhVar.zzd(i12));
        }
        this.zza.zzu(i11);
        while (i8 < zzgxhVar.size()) {
            this.zza.zzu(zzgxhVar.zzd(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzK(int i7, long j) {
        this.zza.zzv(i7, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzL(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgyg)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzv(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzgwl.zzE(((Long) list.get(i10)).longValue());
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                this.zza.zzw(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzgyg zzgygVar = (zzgyg) list;
        if (!z4) {
            while (i8 < zzgygVar.size()) {
                this.zza.zzv(i7, zzgygVar.zza(i8));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgygVar.size(); i12++) {
            i11 += zzgwl.zzE(zzgygVar.zza(i12));
        }
        this.zza.zzu(i11);
        while (i8 < zzgygVar.size()) {
            this.zza.zzw(zzgygVar.zza(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzb(int i7, boolean z4) {
        this.zza.zzM(i7, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzc(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgvo)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzM(i7, ((Boolean) list.get(i8)).booleanValue());
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Boolean) list.get(i10)).getClass();
                i9++;
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                this.zza.zzL(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
                i8++;
            }
            return;
        }
        zzgvo zzgvoVar = (zzgvo) list;
        if (!z4) {
            while (i8 < zzgvoVar.size()) {
                this.zza.zzM(i7, zzgvoVar.zzh(i8));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgvoVar.size(); i12++) {
            zzgvoVar.zzh(i12);
            i11++;
        }
        this.zza.zzu(i11);
        while (i8 < zzgvoVar.size()) {
            this.zza.zzL(zzgvoVar.zzh(i8) ? (byte) 1 : (byte) 0);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzd(int i7, zzgvy zzgvyVar) {
        this.zza.zzN(i7, zzgvyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zze(int i7, List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.zza.zzN(i7, (zzgvy) list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzf(int i7, double d7) {
        this.zza.zzj(i7, Double.doubleToRawLongBits(d7));
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzg(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgwn)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzj(i7, Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Double) list.get(i10)).getClass();
                i9 += 8;
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                i8++;
            }
            return;
        }
        zzgwn zzgwnVar = (zzgwn) list;
        if (!z4) {
            while (i8 < zzgwnVar.size()) {
                this.zza.zzj(i7, Double.doubleToRawLongBits(zzgwnVar.zzd(i8)));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgwnVar.size(); i12++) {
            zzgwnVar.zzd(i12);
            i11 += 8;
        }
        this.zza.zzu(i11);
        while (i8 < zzgwnVar.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(zzgwnVar.zzd(i8)));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    @Deprecated
    public final void zzh(int i7) {
        this.zza.zzs(i7, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzi(int i7, int i8) {
        this.zza.zzl(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzj(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgxh)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzl(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzgwl.zzE(((Integer) list.get(i10)).intValue());
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                this.zza.zzm(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzgxh zzgxhVar = (zzgxh) list;
        if (!z4) {
            while (i8 < zzgxhVar.size()) {
                this.zza.zzl(i7, zzgxhVar.zzd(i8));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgxhVar.size(); i12++) {
            i11 += zzgwl.zzE(zzgxhVar.zzd(i12));
        }
        this.zza.zzu(i11);
        while (i8 < zzgxhVar.size()) {
            this.zza.zzm(zzgxhVar.zzd(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzk(int i7, int i8) {
        this.zza.zzh(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzl(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgxh)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                this.zza.zzi(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzgxh zzgxhVar = (zzgxh) list;
        if (!z4) {
            while (i8 < zzgxhVar.size()) {
                this.zza.zzh(i7, zzgxhVar.zzd(i8));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgxhVar.size(); i12++) {
            zzgxhVar.zzd(i12);
            i11 += 4;
        }
        this.zza.zzu(i11);
        while (i8 < zzgxhVar.size()) {
            this.zza.zzi(zzgxhVar.zzd(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzm(int i7, long j) {
        this.zza.zzj(i7, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzn(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgyg)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzj(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Long) list.get(i10)).getClass();
                i9 += 8;
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                this.zza.zzk(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzgyg zzgygVar = (zzgyg) list;
        if (!z4) {
            while (i8 < zzgygVar.size()) {
                this.zza.zzj(i7, zzgygVar.zza(i8));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgygVar.size(); i12++) {
            zzgygVar.zza(i12);
            i11 += 8;
        }
        this.zza.zzu(i11);
        while (i8 < zzgygVar.size()) {
            this.zza.zzk(zzgygVar.zza(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzo(int i7, float f7) {
        this.zza.zzh(i7, Float.floatToRawIntBits(f7));
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzp(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgwx)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Float) list.get(i10)).getClass();
                i9 += 4;
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                i8++;
            }
            return;
        }
        zzgwx zzgwxVar = (zzgwx) list;
        if (!z4) {
            while (i8 < zzgwxVar.size()) {
                this.zza.zzh(i7, Float.floatToRawIntBits(zzgwxVar.zzd(i8)));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgwxVar.size(); i12++) {
            zzgwxVar.zzd(i12);
            i11 += 4;
        }
        this.zza.zzu(i11);
        while (i8 < zzgwxVar.size()) {
            this.zza.zzi(Float.floatToRawIntBits(zzgwxVar.zzd(i8)));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzq(int i7, Object obj, zzgzk zzgzkVar) {
        zzgwl zzgwlVar = this.zza;
        zzgwlVar.zzs(i7, 3);
        zzgzkVar.zzj((zzgyr) obj, zzgwlVar.zze);
        zzgwlVar.zzs(i7, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzr(int i7, int i8) {
        this.zza.zzl(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzs(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgxh)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzl(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzgwl.zzE(((Integer) list.get(i10)).intValue());
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                this.zza.zzm(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzgxh zzgxhVar = (zzgxh) list;
        if (!z4) {
            while (i8 < zzgxhVar.size()) {
                this.zza.zzl(i7, zzgxhVar.zzd(i8));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgxhVar.size(); i12++) {
            i11 += zzgwl.zzE(zzgxhVar.zzd(i12));
        }
        this.zza.zzu(i11);
        while (i8 < zzgxhVar.size()) {
            this.zza.zzm(zzgxhVar.zzd(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzt(int i7, long j) {
        this.zza.zzv(i7, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzu(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgyg)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzv(i7, ((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzgwl.zzE(((Long) list.get(i10)).longValue());
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                this.zza.zzw(((Long) list.get(i8)).longValue());
                i8++;
            }
            return;
        }
        zzgyg zzgygVar = (zzgyg) list;
        if (!z4) {
            while (i8 < zzgygVar.size()) {
                this.zza.zzv(i7, zzgygVar.zza(i8));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgygVar.size(); i12++) {
            i11 += zzgwl.zzE(zzgygVar.zza(i12));
        }
        this.zza.zzu(i11);
        while (i8 < zzgygVar.size()) {
            this.zza.zzw(zzgygVar.zza(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzv(int i7, Object obj, zzgzk zzgzkVar) {
        this.zza.zzn(i7, (zzgyr) obj, zzgzkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzw(int i7, Object obj) {
        if (obj instanceof zzgvy) {
            this.zza.zzp(i7, (zzgvy) obj);
        } else {
            this.zza.zzo(i7, (zzgyr) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzx(int i7, int i8) {
        this.zza.zzh(i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzy(int i7, List list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzgxh)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, ((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzs(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((Integer) list.get(i10)).getClass();
                i9 += 4;
            }
            this.zza.zzu(i9);
            while (i8 < list.size()) {
                this.zza.zzi(((Integer) list.get(i8)).intValue());
                i8++;
            }
            return;
        }
        zzgxh zzgxhVar = (zzgxh) list;
        if (!z4) {
            while (i8 < zzgxhVar.size()) {
                this.zza.zzh(i7, zzgxhVar.zzd(i8));
                i8++;
            }
            return;
        }
        this.zza.zzs(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzgxhVar.size(); i12++) {
            zzgxhVar.zzd(i12);
            i11 += 4;
        }
        this.zza.zzu(i11);
        while (i8 < zzgxhVar.size()) {
            this.zza.zzi(zzgxhVar.zzd(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhal
    public final void zzz(int i7, long j) {
        this.zza.zzj(i7, j);
    }
}
