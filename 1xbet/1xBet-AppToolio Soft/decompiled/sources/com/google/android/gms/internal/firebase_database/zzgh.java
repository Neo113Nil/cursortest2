package com.google.android.gms.internal.firebase_database;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgh implements zzgm<Map<zzhe, zzgb>, Void> {
    private final /* synthetic */ zzgc zzoa;

    zzgh(zzgc zzgcVar) {
        this.zzoa = zzgcVar;
    }

    @Override // com.google.android.gms.internal.firebase_database.zzgm
    public final /* synthetic */ Void zza(zzch zzchVar, Map<zzhe, zzgb> map, Void r3) {
        Iterator<Map.Entry<zzhe, zzgb>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzgb value = it.next().getValue();
            if (!value.zznr) {
                this.zzoa.zza(value.zzdi());
            }
        }
        return null;
    }
}
