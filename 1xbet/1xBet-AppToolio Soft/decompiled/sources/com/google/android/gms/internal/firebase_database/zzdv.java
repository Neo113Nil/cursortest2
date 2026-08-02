package com.google.android.gms.internal.firebase_database;

import java.util.Map;

/* loaded from: classes.dex */
final class zzdv implements zzec {
    private final /* synthetic */ zzdy zzkf;
    private final /* synthetic */ Map zzkg;

    zzdv(zzdy zzdyVar, Map map) {
        this.zzkf = zzdyVar;
        this.zzkg = map;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzec
    public final void zzf(zzch zzchVar, zzja zzjaVar) {
        this.zzkf.zzh(zzchVar, zzdu.zza(zzjaVar, (Map<String, Object>) this.zzkg));
    }
}
