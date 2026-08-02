package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class zzjj {
    public static final zzjj zza = new zzjj(null, null, 100);
    private final EnumMap<zza, zzjm> zzb;
    private final int zzc;

    public static boolean zza(int i, int i2) {
        if (i == -20 && i2 == -30) {
            return true;
        }
        return (i == -30 && i2 == -20) || i == i2 || i < i2;
    }

    static char zza(zzjm zzjmVar) {
        if (zzjmVar == null) {
            return '-';
        }
        int ordinal = zzjmVar.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    public enum zza {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");

        public final String zze;

        zza(String str) {
            this.zze = str;
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final int hashCode() {
        int i = this.zzc * 17;
        Iterator<zzjm> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            i = (i * 31) + it.next().hashCode();
        }
        return i;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zza, zzjm> entry : this.zzb.entrySet()) {
            String zzb = zzb(entry.getValue());
            if (zzb != null) {
                bundle.putString(entry.getKey().zze, zzb);
            }
        }
        return bundle;
    }

    static zzjm zza(String str) {
        if (str == null) {
            return zzjm.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return zzjm.GRANTED;
        }
        if (str.equals("denied")) {
            return zzjm.DENIED;
        }
        return zzjm.UNINITIALIZED;
    }

    public final zzjm zzc() {
        zzjm zzjmVar = this.zzb.get(zza.AD_STORAGE);
        return zzjmVar == null ? zzjm.UNINITIALIZED : zzjmVar;
    }

    public final zzjm zzd() {
        zzjm zzjmVar = this.zzb.get(zza.ANALYTICS_STORAGE);
        return zzjmVar == null ? zzjm.UNINITIALIZED : zzjmVar;
    }

    static zzjm zza(char c) {
        if (c == '+') {
            return zzjm.POLICY;
        }
        if (c == '0') {
            return zzjm.DENIED;
        }
        if (c == '1') {
            return zzjm.GRANTED;
        }
        return zzjm.UNINITIALIZED;
    }

    static zzjm zza(Boolean bool) {
        if (bool == null) {
            return zzjm.UNINITIALIZED;
        }
        if (bool.booleanValue()) {
            return zzjm.GRANTED;
        }
        return zzjm.DENIED;
    }

    public static zzjj zza(Bundle bundle, int i) {
        zza[] zzaVarArr;
        if (bundle == null) {
            return new zzjj(null, null, i);
        }
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzjl.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            enumMap.put((EnumMap) zzaVar, (zza) zza(bundle.getString(zzaVar.zze)));
        }
        return new zzjj(enumMap, i);
    }

    public static zzjj zza(zzjm zzjmVar, zzjm zzjmVar2, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        enumMap.put((EnumMap) zza.AD_STORAGE, (zza) zzjmVar);
        enumMap.put((EnumMap) zza.ANALYTICS_STORAGE, (zza) zzjmVar2);
        return new zzjj(enumMap, -10);
    }

    public static zzjj zzb(String str) {
        return zza(str, 100);
    }

    public static zzjj zza(String str, int i) {
        EnumMap enumMap = new EnumMap(zza.class);
        if (str == null) {
            str = "";
        }
        zza[] zza2 = zzjl.STORAGE.zza();
        for (int i2 = 0; i2 < zza2.length; i2++) {
            zza zzaVar = zza2[i2];
            int i3 = i2 + 2;
            if (i3 < str.length()) {
                enumMap.put((EnumMap) zzaVar, (zza) zza(str.charAt(i3)));
            } else {
                enumMap.put((EnumMap) zzaVar, (zza) zzjm.UNINITIALIZED);
            }
        }
        return new zzjj(enumMap, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzjj zza(zzjj zzjjVar) {
        zza[] zzaVarArr;
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzjl.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            zzjm zzjmVar = this.zzb.get(zzaVar);
            zzjm zzjmVar2 = zzjjVar.zzb.get(zzaVar);
            if (zzjmVar != null) {
                if (zzjmVar2 != null) {
                    if (zzjmVar != zzjm.UNINITIALIZED) {
                        if (zzjmVar2 != zzjm.UNINITIALIZED) {
                            if (zzjmVar != zzjm.POLICY) {
                                if (zzjmVar2 != zzjm.POLICY) {
                                    zzjmVar = (zzjmVar == zzjm.DENIED || zzjmVar2 == zzjm.DENIED) ? zzjm.DENIED : zzjm.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (zzjmVar == null) {
                    enumMap.put((EnumMap) zzaVar, (zza) zzjmVar);
                }
            }
            zzjmVar = zzjmVar2;
            if (zzjmVar == null) {
            }
        }
        return new zzjj(enumMap, 100);
    }

    public final zzjj zzb(zzjj zzjjVar) {
        zza[] zzaVarArr;
        EnumMap enumMap = new EnumMap(zza.class);
        zzaVarArr = zzjl.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            zzjm zzjmVar = this.zzb.get(zzaVar);
            if (zzjmVar == zzjm.UNINITIALIZED) {
                zzjmVar = zzjjVar.zzb.get(zzaVar);
            }
            if (zzjmVar != null) {
                enumMap.put((EnumMap) zzaVar, (zza) zzjmVar);
            }
        }
        return new zzjj(enumMap, this.zzc);
    }

    static String zza(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i == 90) {
            return "REMOTE_CONFIG";
        }
        if (i == 100) {
            return "UNKNOWN";
        }
        return "OTHER";
    }

    static String zzb(zzjm zzjmVar) {
        int ordinal = zzjmVar.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    public static String zza(Bundle bundle) {
        zza[] zzaVarArr;
        String string;
        zzaVarArr = zzjl.STORAGE.zzd;
        int length = zzaVarArr.length;
        int i = 0;
        while (true) {
            Boolean bool = null;
            if (i >= length) {
                return null;
            }
            zza zzaVar = zzaVarArr[i];
            if (bundle.containsKey(zzaVar.zze) && (string = bundle.getString(zzaVar.zze)) != null) {
                if (string != null) {
                    if (string.equals("granted")) {
                        bool = Boolean.TRUE;
                    } else if (string.equals("denied")) {
                        bool = Boolean.FALSE;
                    }
                }
                if (bool == null) {
                    return string;
                }
            }
            i++;
        }
    }

    public final String zze() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzjl.STORAGE.zza()) {
            zzjm zzjmVar = this.zzb.get(zzaVar);
            char c = '-';
            if (zzjmVar != null && (ordinal = zzjmVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c = '1';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public final String zzf() {
        StringBuilder sb = new StringBuilder("G1");
        for (zza zzaVar : zzjl.STORAGE.zza()) {
            sb.append(zza(this.zzb.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String toString() {
        zza[] zzaVarArr;
        StringBuilder append = new StringBuilder("source=").append(zza(this.zzc));
        zzaVarArr = zzjl.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            append.append(",");
            append.append(zzaVar.zze);
            append.append("=");
            zzjm zzjmVar = this.zzb.get(zzaVar);
            if (zzjmVar == null) {
                zzjmVar = zzjm.UNINITIALIZED;
            }
            append.append(zzjmVar);
        }
        return append.toString();
    }

    private zzjj(EnumMap<zza, zzjm> enumMap, int i) {
        EnumMap<zza, zzjm> enumMap2 = new EnumMap<>((Class<zza>) zza.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i;
    }

    public zzjj(Boolean bool, Boolean bool2, int i) {
        EnumMap<zza, zzjm> enumMap = new EnumMap<>((Class<zza>) zza.class);
        this.zzb = enumMap;
        enumMap.put((EnumMap<zza, zzjm>) zza.AD_STORAGE, (zza) zza((Boolean) null));
        enumMap.put((EnumMap<zza, zzjm>) zza.ANALYTICS_STORAGE, (zza) zza((Boolean) null));
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        zza[] zzaVarArr;
        if (!(obj instanceof zzjj)) {
            return false;
        }
        zzjj zzjjVar = (zzjj) obj;
        zzaVarArr = zzjl.STORAGE.zzd;
        for (zza zzaVar : zzaVarArr) {
            if (this.zzb.get(zzaVar) != zzjjVar.zzb.get(zzaVar)) {
                return false;
            }
        }
        return this.zzc == zzjjVar.zzc;
    }

    public final boolean zzg() {
        return zza(zza.AD_STORAGE);
    }

    public final boolean zza(zza zzaVar) {
        return this.zzb.get(zzaVar) != zzjm.DENIED;
    }

    public final boolean zzh() {
        return zza(zza.ANALYTICS_STORAGE);
    }

    public final boolean zzi() {
        Iterator<zzjm> it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzjm.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzjj zzjjVar) {
        for (zza zzaVar : (zza[]) this.zzb.keySet().toArray(new zza[0])) {
            zzjm zzjmVar = this.zzb.get(zzaVar);
            zzjm zzjmVar2 = zzjjVar.zzb.get(zzaVar);
            if (zzjmVar == zzjm.DENIED && zzjmVar2 != zzjm.DENIED) {
                return true;
            }
        }
        return false;
    }
}
