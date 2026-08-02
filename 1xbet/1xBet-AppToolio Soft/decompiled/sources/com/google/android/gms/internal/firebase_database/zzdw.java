package com.google.android.gms.internal.firebase_database;

import java.util.Map;

/* loaded from: classes.dex */
final class zzdw extends zzii {
    private final /* synthetic */ Map zzkg;
    private final /* synthetic */ zzdx zzkh;

    zzdw(Map map, zzdx zzdxVar) {
        this.zzkg = map;
        this.zzkh = zzdxVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzii
    /* renamed from: zzb */
    public final void visitEntry(zzid zzidVar, zzja zzjaVar) {
        zzja zza = zzdu.zza(zzjaVar, (Map<String, Object>) this.zzkg);
        if (zza != zzjaVar) {
            this.zzkh.zzg(new zzch(zzidVar.zzfg()), zza);
        }
    }
}
