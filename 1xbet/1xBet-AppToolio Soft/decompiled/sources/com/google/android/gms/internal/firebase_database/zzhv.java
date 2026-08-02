package com.google.android.gms.internal.firebase_database;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzhv implements zzht {
    private final zzis zzpd;
    private final zzhr zzqj;
    private final zziz zzqk;
    private final zziz zzql;

    public zzhv(zzhe zzheVar) {
        zziz zzgc;
        zziz zzfw;
        this.zzqj = new zzhr(zzheVar.zzeg());
        this.zzpd = zzheVar.zzeg();
        if (zzheVar.zzdy()) {
            zzgc = zzheVar.zzeg().zzf(zzheVar.zzea(), zzheVar.zzdz());
        } else {
            zzheVar.zzeg();
            zzgc = zziz.zzgc();
        }
        this.zzqk = zzgc;
        if (zzheVar.zzeb()) {
            zzfw = zzheVar.zzeg().zzf(zzheVar.zzed(), zzheVar.zzec());
        } else {
            zzfw = zzheVar.zzeg().zzfw();
        }
        this.zzql = zzfw;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzit zza(zzit zzitVar, zzid zzidVar, zzja zzjaVar, zzch zzchVar, zzhu zzhuVar, zzhq zzhqVar) {
        if (!zza(new zziz(zzidVar, zzjaVar))) {
            zzjaVar = zzir.zzfv();
        }
        return this.zzqj.zza(zzitVar, zzidVar, zzjaVar, zzchVar, zzhuVar, zzhqVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzit zza(zzit zzitVar, zzit zzitVar2, zzhq zzhqVar) {
        zzit zzitVar3;
        if (zzitVar2.zzd().zzfk()) {
            zzitVar3 = zzit.zza(zzir.zzfv(), this.zzpd);
        } else {
            zzit zzk = zzitVar2.zzk(zzir.zzfv());
            Iterator<zziz> it = zzitVar2.iterator();
            while (it.hasNext()) {
                zziz next = it.next();
                if (!zza(next)) {
                    zzk = zzk.zzg(next.zzge(), zzir.zzfv());
                }
            }
            zzitVar3 = zzk;
        }
        return this.zzqj.zza(zzitVar, zzitVar3, zzhqVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzit zza(zzit zzitVar, zzja zzjaVar) {
        return zzitVar;
    }

    public final boolean zza(zziz zzizVar) {
        return this.zzpd.compare(this.zzqk, zzizVar) <= 0 && this.zzpd.compare(zzizVar, this.zzql) <= 0;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzis zzeg() {
        return this.zzpd;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzht zzew() {
        return this.zzqj;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final boolean zzex() {
        return true;
    }

    public final zziz zzey() {
        return this.zzqk;
    }

    public final zziz zzez() {
        return this.zzql;
    }
}
