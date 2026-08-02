package com.google.android.gms.internal.firebase_database;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzhs implements zzht {
    private final int limit;
    private final zzis zzpd;
    private final zzhv zzqh;
    private final boolean zzqi;

    public zzhs(zzhe zzheVar) {
        this.zzqh = new zzhv(zzheVar);
        this.zzpd = zzheVar.zzeg();
        this.limit = zzheVar.getLimit();
        this.zzqi = !zzheVar.zzei();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzit zza(zzit zzitVar, zzid zzidVar, zzja zzjaVar, zzch zzchVar, zzhu zzhuVar, zzhq zzhqVar) {
        if (!this.zzqh.zza(new zziz(zzidVar, zzjaVar))) {
            zzjaVar = zzir.zzfv();
        }
        zzja zzjaVar2 = zzjaVar;
        if (zzitVar.zzd().zzm(zzidVar).equals(zzjaVar2)) {
            return zzitVar;
        }
        if (zzitVar.zzd().getChildCount() < this.limit) {
            return this.zzqh.zzew().zza(zzitVar, zzidVar, zzjaVar2, zzchVar, zzhuVar, zzhqVar);
        }
        zziz zzizVar = new zziz(zzidVar, zzjaVar2);
        zziz zzfz = this.zzqi ? zzitVar.zzfz() : zzitVar.zzga();
        boolean zza = this.zzqh.zza(zzizVar);
        if (!zzitVar.zzd().zzk(zzidVar)) {
            if (zzjaVar2.isEmpty() || !zza || this.zzpd.zza(zzfz, zzizVar, this.zzqi) < 0) {
                return zzitVar;
            }
            if (zzhqVar != null) {
                zzhqVar.zza(zzgw.zzd(zzfz.zzge(), zzfz.zzd()));
                zzhqVar.zza(zzgw.zzc(zzidVar, zzjaVar2));
            }
            return zzitVar.zzg(zzidVar, zzjaVar2).zzg(zzfz.zzge(), zzir.zzfv());
        }
        zzja zzm = zzitVar.zzd().zzm(zzidVar);
        while (true) {
            zzfz = zzhuVar.zza(this.zzpd, zzfz, this.zzqi);
            if (zzfz == null || (!zzfz.zzge().equals(zzidVar) && !zzitVar.zzd().zzk(zzfz.zzge()))) {
                break;
            }
        }
        if (zza && !zzjaVar2.isEmpty() && (zzfz == null ? 1 : this.zzpd.zza(zzfz, zzizVar, this.zzqi)) >= 0) {
            if (zzhqVar != null) {
                zzhqVar.zza(zzgw.zza(zzidVar, zzjaVar2, zzm));
            }
            return zzitVar.zzg(zzidVar, zzjaVar2);
        }
        if (zzhqVar != null) {
            zzhqVar.zza(zzgw.zzd(zzidVar, zzm));
        }
        zzit zzg = zzitVar.zzg(zzidVar, zzir.zzfv());
        if (!(zzfz != null && this.zzqh.zza(zzfz))) {
            return zzg;
        }
        if (zzhqVar != null) {
            zzhqVar.zza(zzgw.zzc(zzfz.zzge(), zzfz.zzd()));
        }
        return zzg.zzg(zzfz.zzge(), zzfz.zzd());
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzit zza(zzit zzitVar, zzit zzitVar2, zzhq zzhqVar) {
        zzit zza;
        Iterator<zziz> it;
        zziz zzey;
        zziz zzez;
        int i;
        if (zzitVar2.zzd().zzfk() || zzitVar2.zzd().isEmpty()) {
            zza = zzit.zza(zzir.zzfv(), this.zzpd);
        } else {
            zza = zzitVar2.zzk(zzir.zzfv());
            if (this.zzqi) {
                it = zzitVar2.reverseIterator();
                zzey = this.zzqh.zzez();
                zzez = this.zzqh.zzey();
                i = -1;
            } else {
                it = zzitVar2.iterator();
                zzey = this.zzqh.zzey();
                zzez = this.zzqh.zzez();
                i = 1;
            }
            boolean z = false;
            int i2 = 0;
            while (it.hasNext()) {
                zziz next = it.next();
                if (!z && this.zzpd.compare(zzey, next) * i <= 0) {
                    z = true;
                }
                if (z && i2 < this.limit && this.zzpd.compare(next, zzez) * i <= 0) {
                    i2++;
                } else {
                    zza = zza.zzg(next.zzge(), zzir.zzfv());
                }
            }
        }
        return this.zzqh.zzew().zza(zzitVar, zza, zzhqVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzit zza(zzit zzitVar, zzja zzjaVar) {
        return zzitVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzis zzeg() {
        return this.zzpd;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzht zzew() {
        return this.zzqh.zzew();
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final boolean zzex() {
        return true;
    }
}
