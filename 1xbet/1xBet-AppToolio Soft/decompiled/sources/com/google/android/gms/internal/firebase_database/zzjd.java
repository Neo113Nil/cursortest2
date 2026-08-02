package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.collection.ImmutableSortedMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzjd {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static zzja zza(Object obj, zzja zzjaVar) throws DatabaseException {
        HashMap hashMap;
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey(".priority")) {
                    zzjaVar = zzjg.zzc(null, map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj = map.get(".value");
                }
            }
            if (obj == null) {
                return zzir.zzfv();
            }
            if (obj instanceof String) {
                return new zzji((String) obj, zzjaVar);
            }
            if (obj instanceof Long) {
                return new zziy((Long) obj, zzjaVar);
            }
            if (obj instanceof Integer) {
                return new zziy(Long.valueOf(((Integer) obj).intValue()), zzjaVar);
            }
            if (obj instanceof Double) {
                return new zziq((Double) obj, zzjaVar);
            }
            if (obj instanceof Boolean) {
                return new zzic((Boolean) obj, zzjaVar);
            }
            if (!(obj instanceof Map) && !(obj instanceof List)) {
                String valueOf = String.valueOf(obj.getClass().toString());
                throw new DatabaseException(valueOf.length() != 0 ? "Failed to parse node with class ".concat(valueOf) : new String("Failed to parse node with class "));
            }
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".sv")) {
                    return new zzip(map2, zzjaVar);
                }
                hashMap = new HashMap(map2.size());
                for (String str : map2.keySet()) {
                    if (!str.startsWith(".")) {
                        zzja zza = zza(map2.get(str), zzir.zzfv());
                        if (!zza.isEmpty()) {
                            hashMap.put(zzid.zzt(str), zza);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                hashMap = new HashMap(list.size());
                for (int i = 0; i < list.size(); i++) {
                    StringBuilder sb = new StringBuilder(11);
                    sb.append(i);
                    String sb2 = sb.toString();
                    zzja zza2 = zza(list.get(i), zzir.zzfv());
                    if (!zza2.isEmpty()) {
                        hashMap.put(zzid.zzt(sb2), zza2);
                    }
                }
            }
            return hashMap.isEmpty() ? zzir.zzfv() : new zzif(ImmutableSortedMap.Builder.fromMap(hashMap, zzif.zzrc), zzjaVar);
        } catch (ClassCastException e) {
            throw new DatabaseException("Failed to parse node", e);
        }
    }
}
