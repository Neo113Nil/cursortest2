package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzoc {
    private final zzbl zza;
    private zzfwh zzb = zzfwh.zzn();
    private zzfwk zzc = zzfwk.zzd();
    private zzuq zzd;
    private zzuq zze;
    private zzuq zzf;

    public zzoc(zzbl zzblVar) {
        this.zza = zzblVar;
    }

    private static zzuq zzj(zzbh zzbhVar, zzfwh zzfwhVar, zzuq zzuqVar, zzbl zzblVar) {
        zzbn zzo = zzbhVar.zzo();
        int zzf = zzbhVar.zzf();
        Object zzf2 = zzo.zzo() ? null : zzo.zzf(zzf);
        int zzc = (zzbhVar.zzx() || zzo.zzo()) ? -1 : zzo.zzd(zzf, zzblVar, false).zzc(zzen.zzs(zzbhVar.zzl()));
        for (int i7 = 0; i7 < zzfwhVar.size(); i7++) {
            zzuq zzuqVar2 = (zzuq) zzfwhVar.get(i7);
            if (zzm(zzuqVar2, zzf2, zzbhVar.zzx(), zzbhVar.zzc(), zzbhVar.zzd(), zzc)) {
                return zzuqVar2;
            }
        }
        if (zzfwhVar.isEmpty() && zzuqVar != null) {
            if (zzm(zzuqVar, zzf2, zzbhVar.zzx(), zzbhVar.zzc(), zzbhVar.zzd(), zzc)) {
                return zzuqVar;
            }
        }
        return null;
    }

    private final void zzk(zzfwj zzfwjVar, zzuq zzuqVar, zzbn zzbnVar) {
        if (zzuqVar == null) {
            return;
        }
        if (zzbnVar.zza(zzuqVar.zza) != -1) {
            zzfwjVar.zza(zzuqVar, zzbnVar);
            return;
        }
        zzbn zzbnVar2 = (zzbn) this.zzc.get(zzuqVar);
        if (zzbnVar2 != null) {
            zzfwjVar.zza(zzuqVar, zzbnVar2);
        }
    }

    private final void zzl(zzbn zzbnVar) {
        zzfwj zzfwjVar = new zzfwj();
        if (this.zzb.isEmpty()) {
            zzk(zzfwjVar, this.zze, zzbnVar);
            if (!zzfte.zza(this.zzf, this.zze)) {
                zzk(zzfwjVar, this.zzf, zzbnVar);
            }
            if (!zzfte.zza(this.zzd, this.zze) && !zzfte.zza(this.zzd, this.zzf)) {
                zzk(zzfwjVar, this.zzd, zzbnVar);
            }
        } else {
            for (int i7 = 0; i7 < this.zzb.size(); i7++) {
                zzk(zzfwjVar, (zzuq) this.zzb.get(i7), zzbnVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfwjVar, this.zzd, zzbnVar);
            }
        }
        this.zzc = zzfwjVar.zzc();
    }

    private static boolean zzm(zzuq zzuqVar, Object obj, boolean z4, int i7, int i8, int i9) {
        if (!zzuqVar.zza.equals(obj)) {
            return false;
        }
        if (z4) {
            if (zzuqVar.zzb != i7 || zzuqVar.zzc != i8) {
                return false;
            }
        } else if (zzuqVar.zzb != -1 || zzuqVar.zze != i9) {
            return false;
        }
        return true;
    }

    public final zzbn zza(zzuq zzuqVar) {
        return (zzbn) this.zzc.get(zzuqVar);
    }

    public final zzuq zzb() {
        return this.zzd;
    }

    public final zzuq zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfwh zzfwhVar = this.zzb;
        if (zzfwhVar == null) {
            Iterator<E> it = zzfwhVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzfwhVar.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = zzfwhVar.get(zzfwhVar.size() - 1);
        }
        return (zzuq) obj;
    }

    public final zzuq zzd() {
        return this.zze;
    }

    public final zzuq zze() {
        return this.zzf;
    }

    public final void zzg(zzbh zzbhVar) {
        this.zzd = zzj(zzbhVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzuq zzuqVar, zzbh zzbhVar) {
        this.zzb = zzfwh.zzl(list);
        if (!list.isEmpty()) {
            this.zze = (zzuq) list.get(0);
            zzuqVar.getClass();
            this.zzf = zzuqVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzbhVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzbhVar.zzo());
    }

    public final void zzi(zzbh zzbhVar) {
        this.zzd = zzj(zzbhVar, this.zzb, this.zze, this.zza);
        zzl(zzbhVar.zzo());
    }
}
