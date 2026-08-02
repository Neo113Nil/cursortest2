package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzajj implements zzanf {
    private final zzajg zza;

    private zzajj(zzajg zzajgVar) {
        zzajg zzajgVar2 = (zzajg) zzakb.zza(zzajgVar, "output");
        this.zza = zzajgVar2;
        zzajgVar2.zze = this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i7, List<Double> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzaji)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzb(i7, list.get(i8).doubleValue());
                    i8++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzajg.zza(list.get(i10).doubleValue());
            }
            this.zza.zzn(i9);
            while (i8 < list.size()) {
                this.zza.zzb(list.get(i8).doubleValue());
                i8++;
            }
            return;
        }
        zzaji zzajiVar = (zzaji) list;
        if (!z4) {
            while (i8 < zzajiVar.size()) {
                this.zza.zzb(i7, zzajiVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzajiVar.size(); i12++) {
            i11 += zzajg.zza(zzajiVar.zzb(i12));
        }
        this.zza.zzn(i11);
        while (i8 < zzajiVar.size()) {
            this.zza.zzb(zzajiVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzc(int i7, List<Integer> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzajz)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzi(i7, list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzajg.zzc(list.get(i10).intValue());
            }
            this.zza.zzn(i9);
            while (i8 < list.size()) {
                this.zza.zzl(list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z4) {
            while (i8 < zzajzVar.size()) {
                this.zza.zzi(i7, zzajzVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzajzVar.size(); i12++) {
            i11 += zzajg.zzc(zzajzVar.zzb(i12));
        }
        this.zza.zzn(i11);
        while (i8 < zzajzVar.size()) {
            this.zza.zzl(zzajzVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzd(int i7, List<Integer> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzajz)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzajg.zzd(list.get(i10).intValue());
            }
            this.zza.zzn(i9);
            while (i8 < list.size()) {
                this.zza.zzk(list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z4) {
            while (i8 < zzajzVar.size()) {
                this.zza.zzh(i7, zzajzVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzajzVar.size(); i12++) {
            i11 += zzajg.zzd(zzajzVar.zzb(i12));
        }
        this.zza.zzn(i11);
        while (i8 < zzajzVar.size()) {
            this.zza.zzk(zzajzVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zze(int i7, List<Long> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzakr)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, list.get(i8).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzajg.zzc(list.get(i10).longValue());
            }
            this.zza.zzn(i9);
            while (i8 < list.size()) {
                this.zza.zzh(list.get(i8).longValue());
                i8++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z4) {
            while (i8 < zzakrVar.size()) {
                this.zza.zzf(i7, zzakrVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzakrVar.size(); i12++) {
            i11 += zzajg.zzc(zzakrVar.zzb(i12));
        }
        this.zza.zzn(i11);
        while (i8 < zzakrVar.size()) {
            this.zza.zzh(zzakrVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzf(int i7, List<Float> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzajx)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzb(i7, list.get(i8).floatValue());
                    i8++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzajg.zza(list.get(i10).floatValue());
            }
            this.zza.zzn(i9);
            while (i8 < list.size()) {
                this.zza.zzb(list.get(i8).floatValue());
                i8++;
            }
            return;
        }
        zzajx zzajxVar = (zzajx) list;
        if (!z4) {
            while (i8 < zzajxVar.size()) {
                this.zza.zzb(i7, zzajxVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzajxVar.size(); i12++) {
            i11 += zzajg.zza(zzajxVar.zzb(i12));
        }
        this.zza.zzn(i11);
        while (i8 < zzajxVar.size()) {
            this.zza.zzb(zzajxVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzg(int i7, List<Integer> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzajz)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzi(i7, list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzajg.zze(list.get(i10).intValue());
            }
            this.zza.zzn(i9);
            while (i8 < list.size()) {
                this.zza.zzl(list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z4) {
            while (i8 < zzajzVar.size()) {
                this.zza.zzi(i7, zzajzVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzajzVar.size(); i12++) {
            i11 += zzajg.zze(zzajzVar.zzb(i12));
        }
        this.zza.zzn(i11);
        while (i8 < zzajzVar.size()) {
            this.zza.zzl(zzajzVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzh(int i7, List<Long> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzakr)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, list.get(i8).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzajg.zzd(list.get(i10).longValue());
            }
            this.zza.zzn(i9);
            while (i8 < list.size()) {
                this.zza.zzj(list.get(i8).longValue());
                i8++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z4) {
            while (i8 < zzakrVar.size()) {
                this.zza.zzh(i7, zzakrVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzakrVar.size(); i12++) {
            i11 += zzajg.zzd(zzakrVar.zzb(i12));
        }
        this.zza.zzn(i11);
        while (i8 < zzakrVar.size()) {
            this.zza.zzj(zzakrVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzi(int i7, List<Integer> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzajz)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzajg.zzg(list.get(i10).intValue());
            }
            this.zza.zzn(i9);
            while (i8 < list.size()) {
                this.zza.zzk(list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z4) {
            while (i8 < zzajzVar.size()) {
                this.zza.zzh(i7, zzajzVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzajzVar.size(); i12++) {
            i11 += zzajg.zzg(zzajzVar.zzb(i12));
        }
        this.zza.zzn(i11);
        while (i8 < zzajzVar.size()) {
            this.zza.zzk(zzajzVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzj(int i7, List<Long> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzakr)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzf(i7, list.get(i8).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzajg.zze(list.get(i10).longValue());
            }
            this.zza.zzn(i9);
            while (i8 < list.size()) {
                this.zza.zzh(list.get(i8).longValue());
                i8++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z4) {
            while (i8 < zzakrVar.size()) {
                this.zza.zzf(i7, zzakrVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzakrVar.size(); i12++) {
            i11 += zzajg.zze(zzakrVar.zzb(i12));
        }
        this.zza.zzn(i11);
        while (i8 < zzakrVar.size()) {
            this.zza.zzh(zzakrVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzk(int i7, List<Integer> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzajz)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzj(i7, list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzajg.zzh(list.get(i10).intValue());
            }
            this.zza.zzn(i9);
            while (i8 < list.size()) {
                this.zza.zzm(list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z4) {
            while (i8 < zzajzVar.size()) {
                this.zza.zzj(i7, zzajzVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzajzVar.size(); i12++) {
            i11 += zzajg.zzh(zzajzVar.zzb(i12));
        }
        this.zza.zzn(i11);
        while (i8 < zzajzVar.size()) {
            this.zza.zzm(zzajzVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzl(int i7, List<Long> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzakr)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzg(i7, list.get(i8).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzajg.zzf(list.get(i10).longValue());
            }
            this.zza.zzn(i9);
            while (i8 < list.size()) {
                this.zza.zzi(list.get(i8).longValue());
                i8++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z4) {
            while (i8 < zzakrVar.size()) {
                this.zza.zzg(i7, zzakrVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzakrVar.size(); i12++) {
            i11 += zzajg.zzf(zzakrVar.zzb(i12));
        }
        this.zza.zzn(i11);
        while (i8 < zzakrVar.size()) {
            this.zza.zzi(zzakrVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzm(int i7, List<Integer> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzajz)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzl(i7, list.get(i8).intValue());
                    i8++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzajg.zzj(list.get(i10).intValue());
            }
            this.zza.zzn(i9);
            while (i8 < list.size()) {
                this.zza.zzn(list.get(i8).intValue());
                i8++;
            }
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        if (!z4) {
            while (i8 < zzajzVar.size()) {
                this.zza.zzl(i7, zzajzVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzajzVar.size(); i12++) {
            i11 += zzajg.zzj(zzajzVar.zzb(i12));
        }
        this.zza.zzn(i11);
        while (i8 < zzajzVar.size()) {
            this.zza.zzn(zzajzVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzn(int i7, List<Long> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzakr)) {
            if (!z4) {
                while (i8 < list.size()) {
                    this.zza.zzh(i7, list.get(i8).longValue());
                    i8++;
                }
                return;
            }
            this.zza.zzk(i7, 2);
            int i9 = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                i9 += zzajg.zzg(list.get(i10).longValue());
            }
            this.zza.zzn(i9);
            while (i8 < list.size()) {
                this.zza.zzj(list.get(i8).longValue());
                i8++;
            }
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        if (!z4) {
            while (i8 < zzakrVar.size()) {
                this.zza.zzh(i7, zzakrVar.zzb(i8));
                i8++;
            }
            return;
        }
        this.zza.zzk(i7, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < zzakrVar.size(); i12++) {
            i11 += zzajg.zzg(zzakrVar.zzb(i12));
        }
        this.zza.zzn(i11);
        while (i8 < zzakrVar.size()) {
            this.zza.zzj(zzakrVar.zzb(i8));
            i8++;
        }
    }

    public static zzajj zza(zzajg zzajgVar) {
        zzajj zzajjVar = zzajgVar.zze;
        return zzajjVar != null ? zzajjVar : new zzajj(zzajgVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i7, boolean z4) {
        this.zza.zzb(i7, z4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i7, List<Boolean> list, boolean z4) {
        int i8 = 0;
        if (!(list instanceof zzain)) {
            if (z4) {
                this.zza.zzk(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += zzajg.zza(list.get(i10).booleanValue());
                }
                this.zza.zzn(i9);
                while (i8 < list.size()) {
                    this.zza.zzb(list.get(i8).booleanValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                this.zza.zzb(i7, list.get(i8).booleanValue());
                i8++;
            }
            return;
        }
        zzain zzainVar = (zzain) list;
        if (z4) {
            this.zza.zzk(i7, 2);
            int i11 = 0;
            for (int i12 = 0; i12 < zzainVar.size(); i12++) {
                i11 += zzajg.zza(zzainVar.zzb(i12));
            }
            this.zza.zzn(i11);
            while (i8 < zzainVar.size()) {
                this.zza.zzb(zzainVar.zzb(i8));
                i8++;
            }
            return;
        }
        while (i8 < zzainVar.size()) {
            this.zza.zzb(i7, zzainVar.zzb(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i7, int i8) {
        this.zza.zzh(i7, i8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzd(int i7, int i8) {
        this.zza.zzh(i7, i8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zze(int i7, int i8) {
        this.zza.zzj(i7, i8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzf(int i7, int i8) {
        this.zza.zzl(i7, i8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i7, long j) {
        this.zza.zzh(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zze(int i7, long j) {
        this.zza.zzh(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzd(int i7, long j) {
        this.zza.zzg(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i7, Object obj, zzalv zzalvVar) {
        this.zza.zzc(i7, (zzalc) obj, zzalvVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i7, zzaip zzaipVar) {
        this.zza.zzc(i7, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i7, List<?> list, zzalv zzalvVar) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            zzb(i7, list.get(i8), zzalvVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzc(int i7, int i8) {
        this.zza.zzi(i7, i8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i7, List<zzaip> list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.zza.zzc(i7, list.get(i8));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzc(int i7, long j) {
        this.zza.zzf(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    @Deprecated
    public final void zzb(int i7) {
        this.zza.zzk(i7, 3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i7, double d7) {
        this.zza.zzb(i7, d7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zzb(int i7, List<String> list) {
        int i8 = 0;
        if (list instanceof zzakn) {
            zzakn zzaknVar = (zzakn) list;
            while (i8 < list.size()) {
                Object zza = zzaknVar.zza(i8);
                if (zza instanceof String) {
                    this.zza.zzb(i7, (String) zza);
                } else {
                    this.zza.zzc(i7, (zzaip) zza);
                }
                i8++;
            }
            return;
        }
        while (i8 < list.size()) {
            this.zza.zzb(i7, list.get(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    @Deprecated
    public final void zza(int i7) {
        this.zza.zzk(i7, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i7, int i8) {
        this.zza.zzi(i7, i8);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i7, long j) {
        this.zza.zzf(i7, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i7, float f7) {
        this.zza.zzb(i7, f7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i7, Object obj, zzalv zzalvVar) {
        zzajg zzajgVar = this.zza;
        zzajgVar.zzk(i7, 3);
        zzalvVar.zza((zzalv) obj, (zzanf) zzajgVar.zze);
        zzajgVar.zzk(i7, 4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i7, List<?> list, zzalv zzalvVar) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            zza(i7, list.get(i8), zzalvVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final <K, V> void zza(int i7, zzakx<K, V> zzakxVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzk(i7, 2);
            this.zza.zzn(zzaku.zza(zzakxVar, entry.getKey(), entry.getValue()));
            zzaku.zza(this.zza, zzakxVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i7, Object obj) {
        if (obj instanceof zzaip) {
            this.zza.zzd(i7, (zzaip) obj);
        } else {
            this.zza.zzb(i7, (zzalc) obj);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanf
    public final void zza(int i7, String str) {
        this.zza.zzb(i7, str);
    }
}
