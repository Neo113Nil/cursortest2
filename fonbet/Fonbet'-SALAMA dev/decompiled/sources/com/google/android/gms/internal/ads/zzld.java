package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class zzld {
    private final zzor zza;
    private final zzlc zze;
    private final zzly zzh;
    private final zzdj zzi;
    private boolean zzj;
    private zzgx zzk;
    private zzwn zzl = new zzwn(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzld(zzlc zzlcVar, zzly zzlyVar, zzdj zzdjVar, zzor zzorVar) {
        this.zza = zzorVar;
        this.zze = zzlcVar;
        this.zzh = zzlyVar;
        this.zzi = zzdjVar;
    }

    private final void zzr(int i7, int i8) {
        while (i7 < this.zzb.size()) {
            ((zzlb) this.zzb.get(i7)).zzd += i8;
            i7++;
        }
    }

    private final void zzs(zzlb zzlbVar) {
        zzla zzlaVar = (zzla) this.zzf.get(zzlbVar);
        if (zzlaVar != null) {
            zzlaVar.zza.zzi(zzlaVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzlb zzlbVar = (zzlb) it.next();
            if (zzlbVar.zzc.isEmpty()) {
                zzs(zzlbVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzlb zzlbVar) {
        if (zzlbVar.zze && zzlbVar.zzc.isEmpty()) {
            zzla zzlaVar = (zzla) this.zzf.remove(zzlbVar);
            zzlaVar.getClass();
            zzlaVar.zza.zzp(zzlaVar.zzb);
            zzlaVar.zza.zzs(zzlaVar.zzc);
            zzlaVar.zza.zzr(zzlaVar.zzc);
            this.zzg.remove(zzlbVar);
        }
    }

    private final void zzv(zzlb zzlbVar) {
        zzul zzulVar = zzlbVar.zza;
        zzur zzurVar = new zzur() { // from class: com.google.android.gms.internal.ads.zzkt
            @Override // com.google.android.gms.internal.ads.zzur
            public final void zza(zzus zzusVar, zzbn zzbnVar) {
                zzld.this.zze.zzi();
            }
        };
        zzkz zzkzVar = new zzkz(this, zzlbVar);
        this.zzf.put(zzlbVar, new zzla(zzulVar, zzurVar, zzkzVar));
        zzulVar.zzh(new Handler(zzen.zzz(), null), zzkzVar);
        zzulVar.zzg(new Handler(zzen.zzz(), null), zzkzVar);
        zzulVar.zzm(zzurVar, this.zzk, this.zza);
    }

    private final void zzw(int i7, int i8) {
        while (true) {
            i8--;
            if (i8 < i7) {
                return;
            }
            zzlb zzlbVar = (zzlb) this.zzb.remove(i8);
            this.zzd.remove(zzlbVar.zzb);
            zzr(i8, -zzlbVar.zza.zzC().zzc());
            zzlbVar.zze = true;
            if (this.zzj) {
                zzu(zzlbVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzbn zzb() {
        if (this.zzb.isEmpty()) {
            return zzbn.zza;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.zzb.size(); i8++) {
            zzlb zzlbVar = (zzlb) this.zzb.get(i8);
            zzlbVar.zzd = i7;
            i7 += zzlbVar.zza.zzC().zzc();
        }
        return new zzlk(this.zzb, this.zzl);
    }

    public final zzbn zzc(int i7, int i8, List list) {
        zzcv.zzd(i7 >= 0 && i7 <= i8 && i8 <= zza());
        zzcv.zzd(list.size() == i8 - i7);
        for (int i9 = i7; i9 < i8; i9++) {
            ((zzlb) this.zzb.get(i9)).zza.zzt((zzap) list.get(i9 - i7));
        }
        return zzb();
    }

    public final void zzg(zzgx zzgxVar) {
        zzcv.zzf(!this.zzj);
        this.zzk = zzgxVar;
        for (int i7 = 0; i7 < this.zzb.size(); i7++) {
            zzlb zzlbVar = (zzlb) this.zzb.get(i7);
            zzv(zzlbVar);
            this.zzg.add(zzlbVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzla zzlaVar : this.zzf.values()) {
            try {
                zzlaVar.zza.zzp(zzlaVar.zzb);
            } catch (RuntimeException e7) {
                zzdq.zzd("MediaSourceList", "Failed to release child source.", e7);
            }
            zzlaVar.zza.zzs(zzlaVar.zzc);
            zzlaVar.zza.zzr(zzlaVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzuo zzuoVar) {
        zzlb zzlbVar = (zzlb) this.zzc.remove(zzuoVar);
        zzlbVar.getClass();
        zzlbVar.zza.zzG(zzuoVar);
        zzlbVar.zzc.remove(((zzui) zzuoVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzlbVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzbn zzk(int i7, List list, zzwn zzwnVar) {
        if (!list.isEmpty()) {
            this.zzl = zzwnVar;
            for (int i8 = i7; i8 < list.size() + i7; i8++) {
                zzlb zzlbVar = (zzlb) list.get(i8 - i7);
                if (i8 > 0) {
                    zzlb zzlbVar2 = (zzlb) this.zzb.get(i8 - 1);
                    zzlbVar.zzc(zzlbVar2.zza.zzC().zzc() + zzlbVar2.zzd);
                } else {
                    zzlbVar.zzc(0);
                }
                zzr(i8, zzlbVar.zza.zzC().zzc());
                this.zzb.add(i8, zzlbVar);
                this.zzd.put(zzlbVar.zzb, zzlbVar);
                if (this.zzj) {
                    zzv(zzlbVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzlbVar);
                    } else {
                        zzs(zzlbVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzbn zzl(int i7, int i8, int i9, zzwn zzwnVar) {
        zzcv.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzbn zzm(int i7, int i8, zzwn zzwnVar) {
        boolean z4 = false;
        if (i7 >= 0 && i7 <= i8 && i8 <= zza()) {
            z4 = true;
        }
        zzcv.zzd(z4);
        this.zzl = zzwnVar;
        zzw(i7, i8);
        return zzb();
    }

    public final zzbn zzn(List list, zzwn zzwnVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzwnVar);
    }

    public final zzbn zzo(zzwn zzwnVar) {
        int zza = zza();
        if (zzwnVar.zzc() != zza) {
            zzwnVar = zzwnVar.zzf().zzg(0, zza);
        }
        this.zzl = zzwnVar;
        return zzb();
    }

    public final zzuo zzp(zzuq zzuqVar, zzyw zzywVar, long j) {
        int i7 = zzlk.zzb;
        Object obj = zzuqVar.zza;
        Object obj2 = ((Pair) obj).first;
        zzuq zza = zzuqVar.zza(((Pair) obj).second);
        zzlb zzlbVar = (zzlb) this.zzd.get(obj2);
        zzlbVar.getClass();
        this.zzg.add(zzlbVar);
        zzla zzlaVar = (zzla) this.zzf.get(zzlbVar);
        if (zzlaVar != null) {
            zzlaVar.zza.zzk(zzlaVar.zzb);
        }
        zzlbVar.zzc.add(zza);
        zzui zzI = zzlbVar.zza.zzI(zza, zzywVar, j);
        this.zzc.put(zzI, zzlbVar);
        zzt();
        return zzI;
    }

    public final zzwn zzq() {
        return this.zzl;
    }
}
