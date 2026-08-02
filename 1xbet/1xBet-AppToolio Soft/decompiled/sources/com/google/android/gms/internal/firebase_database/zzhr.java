package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
public final class zzhr implements zzht {
    private final zzis zzpd;

    public zzhr(zzis zzisVar) {
        this.zzpd = zzisVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzit zza(zzit zzitVar, zzid zzidVar, zzja zzjaVar, zzch zzchVar, zzhu zzhuVar, zzhq zzhqVar) {
        zzgw zzc;
        zzja zzd = zzitVar.zzd();
        zzja zzm = zzd.zzm(zzidVar);
        if (zzm.zzam(zzchVar).equals(zzjaVar.zzam(zzchVar)) && zzm.isEmpty() == zzjaVar.isEmpty()) {
            return zzitVar;
        }
        if (zzhqVar != null) {
            if (!zzjaVar.isEmpty()) {
                zzc = zzm.isEmpty() ? zzgw.zzc(zzidVar, zzjaVar) : zzgw.zza(zzidVar, zzjaVar, zzm);
            } else if (zzd.zzk(zzidVar)) {
                zzc = zzgw.zzd(zzidVar, zzm);
            }
            zzhqVar.zza(zzc);
        }
        return (zzd.zzfk() && zzjaVar.isEmpty()) ? zzitVar : zzitVar.zzg(zzidVar, zzjaVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzit zza(zzit zzitVar, zzit zzitVar2, zzhq zzhqVar) {
        zzgw zzc;
        if (zzhqVar != null) {
            for (zziz zzizVar : zzitVar.zzd()) {
                if (!zzitVar2.zzd().zzk(zzizVar.zzge())) {
                    zzhqVar.zza(zzgw.zzd(zzizVar.zzge(), zzizVar.zzd()));
                }
            }
            if (!zzitVar2.zzd().zzfk()) {
                for (zziz zzizVar2 : zzitVar2.zzd()) {
                    if (zzitVar.zzd().zzk(zzizVar2.zzge())) {
                        zzja zzm = zzitVar.zzd().zzm(zzizVar2.zzge());
                        if (!zzm.equals(zzizVar2.zzd())) {
                            zzc = zzgw.zza(zzizVar2.zzge(), zzizVar2.zzd(), zzm);
                        }
                    } else {
                        zzc = zzgw.zzc(zzizVar2.zzge(), zzizVar2.zzd());
                    }
                    zzhqVar.zza(zzc);
                }
            }
        }
        return zzitVar2;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzit zza(zzit zzitVar, zzja zzjaVar) {
        return zzitVar.zzd().isEmpty() ? zzitVar : zzitVar.zzk(zzjaVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzis zzeg() {
        return this.zzpd;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final zzht zzew() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzht
    public final boolean zzex() {
        return false;
    }
}
