package com.google.android.gms.internal.firebase_database;

import java.util.Map;

/* loaded from: classes.dex */
final class zzbx implements zzgm<zzja, Void> {
    private final /* synthetic */ Map zzgz;
    private final /* synthetic */ boolean zzha = true;

    zzbx(zzbv zzbvVar, Map map, boolean z) {
        this.zzgz = map;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgm
    public final /* synthetic */ Void zza(zzch zzchVar, zzja zzjaVar, Void r4) {
        this.zzgz.put(zzchVar.zzbu(), zzjaVar.getValue(this.zzha));
        return null;
    }
}
