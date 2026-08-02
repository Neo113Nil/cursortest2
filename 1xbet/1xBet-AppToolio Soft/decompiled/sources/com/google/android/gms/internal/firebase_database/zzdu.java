package com.google.android.gms.internal.firebase_database;

import com.google.android.gms.measurement.AppMeasurement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdu {
    public static zzbv zza(zzbv zzbvVar, Map<String, Object> map) {
        zzbv zzbf = zzbv.zzbf();
        Iterator<Map.Entry<zzch, zzja>> it = zzbvVar.iterator();
        while (it.hasNext()) {
            Map.Entry<zzch, zzja> next = it.next();
            zzbf = zzbf.zze(next.getKey(), zza(next.getValue(), map));
        }
        return zzbf;
    }

    public static zzja zza(zzja zzjaVar, Map<String, Object> map) {
        Object value = zzjaVar.zzfl().getValue();
        if (value instanceof Map) {
            Map map2 = (Map) value;
            if (map2.containsKey(".sv")) {
                value = map.get((String) map2.get(".sv"));
            }
        }
        zzja zzc = zzjg.zzc(null, value);
        if (!zzjaVar.zzfk()) {
            if (zzjaVar.isEmpty()) {
                return zzjaVar;
            }
            zzif zzifVar = (zzif) zzjaVar;
            zzdx zzdxVar = new zzdx(zzifVar);
            zzifVar.zza((zzii) new zzdw(map, zzdxVar), false);
            return !zzdxVar.zzcg().zzfl().equals(zzc) ? zzdxVar.zzcg().zzf(zzc) : zzdxVar.zzcg();
        }
        Object value2 = zzjaVar.getValue();
        if (value2 instanceof Map) {
            Map map3 = (Map) value2;
            if (map3.containsKey(".sv")) {
                String str = (String) map3.get(".sv");
                if (map.containsKey(str)) {
                    value2 = map.get(str);
                }
            }
        }
        return (value2.equals(zzjaVar.getValue()) && zzc.equals(zzjaVar.zzfl())) ? zzjaVar : zzjd.zza(value2, zzc);
    }

    public static Map<String, Object> zza(zzkf zzkfVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(AppMeasurement.Param.TIMESTAMP, Long.valueOf(zzkfVar.millis()));
        return hashMap;
    }
}
