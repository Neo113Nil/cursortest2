package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzks {
    private static final Pattern zzus = Pattern.compile("[\\[\\]\\.#$]");
    private static final Pattern zzut = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    public static void zzab(String str) throws DatabaseException {
        if (!zzus.matcher(str).find()) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 101);
        sb.append("Invalid Firebase Database path: ");
        sb.append(str);
        sb.append(". Firebase Database paths must not contain '.', '#', '$', '[', or ']'");
        throw new DatabaseException(sb.toString());
    }

    public static void zzac(String str) throws DatabaseException {
        int i;
        if (str.startsWith(".info")) {
            i = 5;
        } else {
            if (!str.startsWith("/.info")) {
                zzab(str);
                return;
            }
            i = 6;
        }
        zzab(str.substring(i));
    }

    public static void zzad(String str) throws DatabaseException {
        if (str != null) {
            if (str.equals(".info") || !zzut.matcher(str).find()) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68);
            sb.append("Invalid key: ");
            sb.append(str);
            sb.append(". Keys must not contain '/', '.', '#', '$', '[', or ']'");
            throw new DatabaseException(sb.toString());
        }
    }

    public static void zzan(zzch zzchVar) throws DatabaseException {
        zzid zzbw = zzchVar.zzbw();
        if (zzbw == null || !zzbw.zzfg().startsWith(".")) {
            return;
        }
        String valueOf = String.valueOf(zzchVar.toString());
        throw new DatabaseException(valueOf.length() != 0 ? "Invalid write location: ".concat(valueOf) : new String("Invalid write location: "));
    }

    public static Map<zzch, zzja> zzb(zzch zzchVar, Map<String, Object> map) throws DatabaseException {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            zzch zzchVar2 = new zzch(entry.getKey());
            Object value = entry.getValue();
            zzfb.zza(zzchVar.zzh(zzchVar2), value);
            String zzfg = !zzchVar2.isEmpty() ? zzchVar2.zzbz().zzfg() : "";
            if (zzfg.equals(".sv") || zzfg.equals(".value")) {
                String valueOf = String.valueOf(zzchVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + String.valueOf(zzfg).length());
                sb.append("Path '");
                sb.append(valueOf);
                sb.append("' contains disallowed child name: ");
                sb.append(zzfg);
                throw new DatabaseException(sb.toString());
            }
            zzja zzc = zzfg.equals(".priority") ? zzjg.zzc(zzchVar2, value) : zzjd.zza(value, zzir.zzfv());
            zzg(value);
            treeMap.put(zzchVar2, zzc);
        }
        zzch zzchVar3 = null;
        for (zzch zzchVar4 : treeMap.keySet()) {
            zzkq.zzf(zzchVar3 == null || zzchVar3.compareTo(zzchVar4) < 0);
            if (zzchVar3 != null && zzchVar3.zzi(zzchVar4)) {
                String valueOf2 = String.valueOf(zzchVar3);
                String valueOf3 = String.valueOf(zzchVar4);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42 + String.valueOf(valueOf3).length());
                sb2.append("Path '");
                sb2.append(valueOf2);
                sb2.append("' is an ancestor of '");
                sb2.append(valueOf3);
                sb2.append("' in an update.");
                throw new DatabaseException(sb2.toString());
            }
            zzchVar3 = zzchVar4;
        }
        return treeMap;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static void zzg(Object obj) {
        if (!(obj instanceof Map)) {
            if (obj instanceof List) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    zzg(it.next());
                }
                return;
            } else {
                if ((obj instanceof Double) || (obj instanceof Float)) {
                    double doubleValue = ((Double) obj).doubleValue();
                    if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                        throw new DatabaseException("Invalid value: Value cannot be NaN, Inf or -Inf.");
                    }
                    return;
                }
                return;
            }
        }
        Map map = (Map) obj;
        if (map.containsKey(".sv")) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (!(str != null && str.length() > 0 && (str.equals(".value") || str.equals(".priority") || !(str.startsWith(".") || zzut.matcher(str).find())))) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68);
                sb.append("Invalid key: ");
                sb.append(str);
                sb.append(". Keys must not contain '/', '.', '#', '$', '[', or ']'");
                throw new DatabaseException(sb.toString());
            }
            zzg(entry.getValue());
        }
    }
}
