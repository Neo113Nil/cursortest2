package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhq {
    private final Map<zzid, zzgw> zzqg = new HashMap();

    public final void zza(zzgw zzgwVar) {
        zzgz zzdt = zzgwVar.zzdt();
        zzid zzds = zzgwVar.zzds();
        if (!this.zzqg.containsKey(zzds)) {
            this.zzqg.put(zzgwVar.zzds(), zzgwVar);
            return;
        }
        zzgw zzgwVar2 = this.zzqg.get(zzds);
        zzgz zzdt2 = zzgwVar2.zzdt();
        if (zzdt == zzgz.CHILD_ADDED && zzdt2 == zzgz.CHILD_REMOVED) {
            this.zzqg.put(zzgwVar.zzds(), zzgw.zza(zzds, zzgwVar.zzdq(), zzgwVar2.zzdq()));
            return;
        }
        if (zzdt == zzgz.CHILD_REMOVED && zzdt2 == zzgz.CHILD_ADDED) {
            this.zzqg.remove(zzds);
            return;
        }
        if (zzdt == zzgz.CHILD_REMOVED && zzdt2 == zzgz.CHILD_CHANGED) {
            this.zzqg.put(zzds, zzgw.zzb(zzds, zzgwVar2.zzdv()));
            return;
        }
        if (zzdt == zzgz.CHILD_CHANGED && zzdt2 == zzgz.CHILD_ADDED) {
            this.zzqg.put(zzds, zzgw.zza(zzds, zzgwVar.zzdq()));
            return;
        }
        if (zzdt == zzgz.CHILD_CHANGED && zzdt2 == zzgz.CHILD_CHANGED) {
            this.zzqg.put(zzds, zzgw.zza(zzds, zzgwVar.zzdq(), zzgwVar2.zzdv()));
            return;
        }
        String valueOf = String.valueOf(zzgwVar);
        String valueOf2 = String.valueOf(zzgwVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length());
        sb.append("Illegal combination of changes: ");
        sb.append(valueOf);
        sb.append(" occurred after ");
        sb.append(valueOf2);
        throw new IllegalStateException(sb.toString());
    }

    public final List<zzgw> zzev() {
        return new ArrayList(this.zzqg.values());
    }
}
