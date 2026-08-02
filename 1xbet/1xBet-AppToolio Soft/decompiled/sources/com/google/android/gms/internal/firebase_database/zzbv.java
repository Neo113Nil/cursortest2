package com.google.android.gms.internal.firebase_database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbv implements Iterable<Map.Entry<zzch, zzja>> {
    private static final zzbv zzgw = new zzbv(new zzgj(null));
    private final zzgj<zzja> zzgx;

    private zzbv(zzgj<zzja> zzgjVar) {
        this.zzgx = zzgjVar;
    }

    private final zzja zza(zzch zzchVar, zzgj<zzja> zzgjVar, zzja zzjaVar) {
        if (zzgjVar.getValue() != null) {
            return zzjaVar.zzl(zzchVar, zzgjVar.getValue());
        }
        zzja zzjaVar2 = null;
        Iterator<Map.Entry<zzid, zzgj<zzja>>> it = zzgjVar.zzdm().iterator();
        while (it.hasNext()) {
            Map.Entry<zzid, zzgj<zzja>> next = it.next();
            zzgj<zzja> value = next.getValue();
            zzid key = next.getKey();
            if (key.zzfh()) {
                zzjaVar2 = value.getValue();
            } else {
                zzjaVar = zza(zzchVar.zza(key), value, zzjaVar);
            }
        }
        return (zzjaVar.zzam(zzchVar).isEmpty() || zzjaVar2 == null) ? zzjaVar : zzjaVar.zzl(zzchVar.zza(zzid.zzfe()), zzjaVar2);
    }

    public static zzbv zzbf() {
        return zzgw;
    }

    public static zzbv zzf(Map<String, Object> map) {
        zzgj zzdl = zzgj.zzdl();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            zzdl = zzdl.zza(new zzch(entry.getKey()), new zzgj(zzjd.zza(entry.getValue(), zzir.zzfv())));
        }
        return new zzbv(zzdl);
    }

    public static zzbv zzg(Map<zzch, zzja> map) {
        zzgj zzdl = zzgj.zzdl();
        for (Map.Entry<zzch, zzja> entry : map.entrySet()) {
            zzdl = zzdl.zza(entry.getKey(), new zzgj(entry.getValue()));
        }
        return new zzbv(zzdl);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return ((zzbv) obj).zzd(true).equals(zzd(true));
    }

    public final int hashCode() {
        return zzd(true).hashCode();
    }

    public final boolean isEmpty() {
        return this.zzgx.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<zzch, zzja>> iterator() {
        return this.zzgx.iterator();
    }

    public final String toString() {
        String obj = zzd(true).toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 15);
        sb.append("CompoundWrite{");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    public final zzbv zza(zzid zzidVar, zzja zzjaVar) {
        return zze(new zzch(zzidVar), zzjaVar);
    }

    public final zzbv zzb(zzch zzchVar, zzbv zzbvVar) {
        return (zzbv) zzbvVar.zzgx.zzb((zzgj<zzja>) this, (zzgm<? super zzja, zzgj<zzja>>) new zzbw(this, zzchVar));
    }

    public final zzja zzb(zzja zzjaVar) {
        return zza(zzch.zzbt(), this.zzgx, zzjaVar);
    }

    public final zzja zzbg() {
        return this.zzgx.getValue();
    }

    public final List<zziz> zzbh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzgx.getValue() != null) {
            for (zziz zzizVar : this.zzgx.getValue()) {
                arrayList.add(new zziz(zzizVar.zzge(), zzizVar.zzd()));
            }
        } else {
            Iterator<Map.Entry<zzid, zzgj<zzja>>> it = this.zzgx.zzdm().iterator();
            while (it.hasNext()) {
                Map.Entry<zzid, zzgj<zzja>> next = it.next();
                zzgj<zzja> value = next.getValue();
                if (value.getValue() != null) {
                    arrayList.add(new zziz(next.getKey(), value.getValue()));
                }
            }
        }
        return arrayList;
    }

    public final Map<zzid, zzbv> zzbi() {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<zzid, zzgj<zzja>>> it = this.zzgx.zzdm().iterator();
        while (it.hasNext()) {
            Map.Entry<zzid, zzgj<zzja>> next = it.next();
            hashMap.put(next.getKey(), new zzbv(next.getValue()));
        }
        return hashMap;
    }

    public final zzbv zzd(zzch zzchVar) {
        return zzchVar.isEmpty() ? zzgw : new zzbv(this.zzgx.zza(zzchVar, zzgj.zzdl()));
    }

    public final Map<String, Object> zzd(boolean z) {
        HashMap hashMap = new HashMap();
        this.zzgx.zza(new zzbx(this, hashMap, true));
        return hashMap;
    }

    public final zzbv zze(zzch zzchVar, zzja zzjaVar) {
        if (zzchVar.isEmpty()) {
            return new zzbv(new zzgj(zzjaVar));
        }
        zzch zzae = this.zzgx.zzae(zzchVar);
        if (zzae == null) {
            return new zzbv(this.zzgx.zza(zzchVar, new zzgj<>(zzjaVar)));
        }
        zzch zza = zzch.zza(zzae, zzchVar);
        zzja zzai = this.zzgx.zzai(zzae);
        zzid zzbz = zza.zzbz();
        if (zzbz != null && zzbz.zzfh() && zzai.zzam(zza.zzby()).isEmpty()) {
            return this;
        }
        return new zzbv(this.zzgx.zzb(zzae, (zzch) zzai.zzl(zza, zzjaVar)));
    }

    public final boolean zze(zzch zzchVar) {
        return zzf(zzchVar) != null;
    }

    public final zzja zzf(zzch zzchVar) {
        zzch zzae = this.zzgx.zzae(zzchVar);
        if (zzae != null) {
            return this.zzgx.zzai(zzae).zzam(zzch.zza(zzae, zzchVar));
        }
        return null;
    }

    public final zzbv zzg(zzch zzchVar) {
        if (zzchVar.isEmpty()) {
            return this;
        }
        zzja zzf = zzf(zzchVar);
        return zzf != null ? new zzbv(new zzgj(zzf)) : new zzbv(this.zzgx.zzag(zzchVar));
    }
}
