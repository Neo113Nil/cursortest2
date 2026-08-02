package com.google.android.gms.internal.firebase_database;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzdy {
    private zzja zzkj = null;
    private Map<zzid, zzdy> zzkk = null;

    public final void zza(zzch zzchVar, zzec zzecVar) {
        zzja zzjaVar = this.zzkj;
        if (zzjaVar != null) {
            zzecVar.zzf(zzchVar, zzjaVar);
            return;
        }
        zzea zzeaVar = new zzea(this, zzchVar, zzecVar);
        Map<zzid, zzdy> map = this.zzkk;
        if (map != null) {
            for (Map.Entry<zzid, zzdy> entry : map.entrySet()) {
                zzeaVar.zza(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void zzh(zzch zzchVar, zzja zzjaVar) {
        zzdy zzdyVar = this;
        while (!zzchVar.isEmpty()) {
            zzja zzjaVar2 = zzdyVar.zzkj;
            if (zzjaVar2 != null) {
                zzdyVar.zzkj = zzjaVar2.zzl(zzchVar, zzjaVar);
                return;
            }
            if (zzdyVar.zzkk == null) {
                zzdyVar.zzkk = new HashMap();
            }
            zzid zzbw = zzchVar.zzbw();
            if (!zzdyVar.zzkk.containsKey(zzbw)) {
                zzdyVar.zzkk.put(zzbw, new zzdy());
            }
            zzdyVar = zzdyVar.zzkk.get(zzbw);
            zzchVar = zzchVar.zzbx();
        }
        zzdyVar.zzkj = zzjaVar;
        zzdyVar.zzkk = null;
    }

    public final boolean zzq(zzch zzchVar) {
        while (!zzchVar.isEmpty()) {
            zzja zzjaVar = this.zzkj;
            if (zzjaVar == null) {
                if (this.zzkk == null) {
                    return true;
                }
                zzid zzbw = zzchVar.zzbw();
                zzch zzbx = zzchVar.zzbx();
                if (this.zzkk.containsKey(zzbw) && this.zzkk.get(zzbw).zzq(zzbx)) {
                    this.zzkk.remove(zzbw);
                }
                if (!this.zzkk.isEmpty()) {
                    return false;
                }
                this.zzkk = null;
                return true;
            }
            if (zzjaVar.zzfk()) {
                return false;
            }
            zzif zzifVar = (zzif) this.zzkj;
            this.zzkj = null;
            zzifVar.zza((zzii) new zzdz(this, zzchVar), false);
        }
        this.zzkj = null;
        this.zzkk = null;
        return true;
    }
}
