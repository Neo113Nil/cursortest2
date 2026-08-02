package com.google.android.gms.internal.firebase_database;

/* loaded from: classes.dex */
final class zzhp implements zzhu {
    private final zzhk zzpu;
    private final zzfg zzqe;
    private final zzja zzqf;

    public zzhp(zzfg zzfgVar, zzhk zzhkVar, zzja zzjaVar) {
        this.zzqe = zzfgVar;
        this.zzpu = zzhkVar;
        this.zzqf = zzjaVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzhu
    public final zziz zza(zzis zzisVar, zziz zzizVar, boolean z) {
        zzja zzjaVar = this.zzqf;
        if (zzjaVar == null) {
            zzjaVar = this.zzpu.zzeu();
        }
        return this.zzqe.zza(zzjaVar, zzizVar, z, zzisVar);
    }

    @Override // com.google.android.gms.internal.firebase_database.zzhu
    public final zzja zzh(zzid zzidVar) {
        zzgu zzer = this.zzpu.zzer();
        if (zzer.zzf(zzidVar)) {
            return zzer.zzd().zzm(zzidVar);
        }
        zzja zzjaVar = this.zzqf;
        return this.zzqe.zza(zzidVar, zzjaVar != null ? new zzgu(zzit.zza(zzjaVar, zziu.zzgb()), true, false) : this.zzpu.zzet());
    }
}
