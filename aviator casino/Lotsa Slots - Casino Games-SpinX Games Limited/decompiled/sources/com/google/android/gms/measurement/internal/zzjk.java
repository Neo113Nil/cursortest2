package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzjk {
    public static final com.google.android.gms.measurement.internal.zzjk zza = new com.google.android.gms.measurement.internal.zzjk(null, null, 100);
    private final java.util.EnumMap zzb;
    private final int zzc;

    public zzjk(java.lang.Boolean bool, java.lang.Boolean bool2, int i) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        this.zzb = enumMap;
        enumMap.put((java.util.EnumMap) com.google.android.gms.measurement.internal.zzjj.AD_STORAGE, (com.google.android.gms.measurement.internal.zzjj) zzh(null));
        enumMap.put((java.util.EnumMap) com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE, (com.google.android.gms.measurement.internal.zzjj) zzh(null));
        this.zzc = i;
    }

    public static com.google.android.gms.measurement.internal.zzjk zza(com.google.android.gms.measurement.internal.zzjh zzjhVar, com.google.android.gms.measurement.internal.zzjh zzjhVar2, int i) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        enumMap.put((java.util.EnumMap) com.google.android.gms.measurement.internal.zzjj.AD_STORAGE, (com.google.android.gms.measurement.internal.zzjj) zzjhVar);
        enumMap.put((java.util.EnumMap) com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE, (com.google.android.gms.measurement.internal.zzjj) zzjhVar2);
        return new com.google.android.gms.measurement.internal.zzjk(enumMap, -10);
    }

    static java.lang.String zzd(int i) {
        return i != -30 ? i != -20 ? i != -10 ? i != 0 ? i != 30 ? i != 90 ? i != 100 ? com.fyber.inneractive.sdk.external.NativeAdContent.ViewTag.OTHER : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static com.google.android.gms.measurement.internal.zzjk zze(android.os.Bundle bundle, int i) {
        if (bundle == null) {
            return new com.google.android.gms.measurement.internal.zzjk(null, null, i);
        }
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        for (com.google.android.gms.measurement.internal.zzjj zzjjVar : com.google.android.gms.measurement.internal.zzji.STORAGE.zzb()) {
            enumMap.put((java.util.EnumMap) zzjjVar, (com.google.android.gms.measurement.internal.zzjj) zzg(bundle.getString(zzjjVar.zze)));
        }
        return new com.google.android.gms.measurement.internal.zzjk(enumMap, i);
    }

    public static com.google.android.gms.measurement.internal.zzjk zzf(java.lang.String str, int i) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        com.google.android.gms.measurement.internal.zzjj[] zza2 = com.google.android.gms.measurement.internal.zzji.STORAGE.zza();
        for (int i2 = 0; i2 < zza2.length; i2++) {
            java.lang.String str2 = str == null ? "" : str;
            com.google.android.gms.measurement.internal.zzjj zzjjVar = zza2[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((java.util.EnumMap) zzjjVar, (com.google.android.gms.measurement.internal.zzjj) zzj(str2.charAt(i3)));
            } else {
                enumMap.put((java.util.EnumMap) zzjjVar, (com.google.android.gms.measurement.internal.zzjj) com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED);
            }
        }
        return new com.google.android.gms.measurement.internal.zzjk(enumMap, i);
    }

    static com.google.android.gms.measurement.internal.zzjh zzg(java.lang.String str) {
        return str == null ? com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED : str.equals("granted") ? com.google.android.gms.measurement.internal.zzjh.GRANTED : str.equals("denied") ? com.google.android.gms.measurement.internal.zzjh.DENIED : com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED;
    }

    static com.google.android.gms.measurement.internal.zzjh zzh(java.lang.Boolean bool) {
        return bool == null ? com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED : bool.booleanValue() ? com.google.android.gms.measurement.internal.zzjh.GRANTED : com.google.android.gms.measurement.internal.zzjh.DENIED;
    }

    static java.lang.String zzi(com.google.android.gms.measurement.internal.zzjh zzjhVar) {
        int ordinal = zzjhVar.ordinal();
        if (ordinal == 2) {
            return "denied";
        }
        if (ordinal != 3) {
            return null;
        }
        return "granted";
    }

    static char zzm(com.google.android.gms.measurement.internal.zzjh zzjhVar) {
        if (zzjhVar == null) {
            return '-';
        }
        int ordinal = zzjhVar.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean zzu(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.measurement.internal.zzjk)) {
            return false;
        }
        com.google.android.gms.measurement.internal.zzjk zzjkVar = (com.google.android.gms.measurement.internal.zzjk) obj;
        for (com.google.android.gms.measurement.internal.zzjj zzjjVar : com.google.android.gms.measurement.internal.zzji.STORAGE.zzb()) {
            if (this.zzb.get(zzjjVar) != zzjkVar.zzb.get(zzjjVar)) {
                return false;
            }
        }
        return this.zzc == zzjkVar.zzc;
    }

    public final int hashCode() {
        java.util.Iterator it = this.zzb.values().iterator();
        int i = this.zzc * 17;
        while (it.hasNext()) {
            i = (i * 31) + ((com.google.android.gms.measurement.internal.zzjh) it.next()).hashCode();
        }
        return i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("source=");
        sb.append(zzd(this.zzc));
        for (com.google.android.gms.measurement.internal.zzjj zzjjVar : com.google.android.gms.measurement.internal.zzji.STORAGE.zzb()) {
            sb.append(",");
            sb.append(zzjjVar.zze);
            sb.append(com.ironsource.X3.j.b);
            com.google.android.gms.measurement.internal.zzjh zzjhVar = (com.google.android.gms.measurement.internal.zzjh) this.zzb.get(zzjjVar);
            if (zzjhVar == null) {
                zzjhVar = com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED;
            }
            sb.append(zzjhVar);
        }
        return sb.toString();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        java.util.Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            if (((com.google.android.gms.measurement.internal.zzjh) it.next()) != com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String zzk() {
        int ordinal;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("G1");
        for (com.google.android.gms.measurement.internal.zzjj zzjjVar : com.google.android.gms.measurement.internal.zzji.STORAGE.zza()) {
            com.google.android.gms.measurement.internal.zzjh zzjhVar = (com.google.android.gms.measurement.internal.zzjh) this.zzb.get(zzjjVar);
            char c = '-';
            if (zzjhVar != null && (ordinal = zzjhVar.ordinal()) != 0) {
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

    public final java.lang.String zzl() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("G1");
        for (com.google.android.gms.measurement.internal.zzjj zzjjVar : com.google.android.gms.measurement.internal.zzji.STORAGE.zza()) {
            sb.append(zzm((com.google.android.gms.measurement.internal.zzjh) this.zzb.get(zzjjVar)));
        }
        return sb.toString();
    }

    public final android.os.Bundle zzn() {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : this.zzb.entrySet()) {
            java.lang.String zzi = zzi((com.google.android.gms.measurement.internal.zzjh) entry.getValue());
            if (zzi != null) {
                bundle.putString(((com.google.android.gms.measurement.internal.zzjj) entry.getKey()).zze, zzi);
            }
        }
        return bundle;
    }

    public final boolean zzo(com.google.android.gms.measurement.internal.zzjj zzjjVar) {
        return ((com.google.android.gms.measurement.internal.zzjh) this.zzb.get(zzjjVar)) != com.google.android.gms.measurement.internal.zzjh.DENIED;
    }

    public final com.google.android.gms.measurement.internal.zzjh zzp() {
        com.google.android.gms.measurement.internal.zzjh zzjhVar = (com.google.android.gms.measurement.internal.zzjh) this.zzb.get(com.google.android.gms.measurement.internal.zzjj.AD_STORAGE);
        return zzjhVar == null ? com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED : zzjhVar;
    }

    public final com.google.android.gms.measurement.internal.zzjh zzq() {
        com.google.android.gms.measurement.internal.zzjh zzjhVar = (com.google.android.gms.measurement.internal.zzjh) this.zzb.get(com.google.android.gms.measurement.internal.zzjj.ANALYTICS_STORAGE);
        return zzjhVar == null ? com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED : zzjhVar;
    }

    public final boolean zzr(com.google.android.gms.measurement.internal.zzjk zzjkVar) {
        java.util.EnumMap enumMap = this.zzb;
        for (com.google.android.gms.measurement.internal.zzjj zzjjVar : (com.google.android.gms.measurement.internal.zzjj[]) enumMap.keySet().toArray(new com.google.android.gms.measurement.internal.zzjj[0])) {
            com.google.android.gms.measurement.internal.zzjh zzjhVar = (com.google.android.gms.measurement.internal.zzjh) enumMap.get(zzjjVar);
            com.google.android.gms.measurement.internal.zzjh zzjhVar2 = (com.google.android.gms.measurement.internal.zzjh) zzjkVar.zzb.get(zzjjVar);
            com.google.android.gms.measurement.internal.zzjh zzjhVar3 = com.google.android.gms.measurement.internal.zzjh.DENIED;
            if (zzjhVar == zzjhVar3 && zzjhVar2 != zzjhVar3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.android.gms.measurement.internal.zzjk zzs(com.google.android.gms.measurement.internal.zzjk zzjkVar) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        for (com.google.android.gms.measurement.internal.zzjj zzjjVar : com.google.android.gms.measurement.internal.zzji.STORAGE.zzb()) {
            com.google.android.gms.measurement.internal.zzjh zzjhVar = (com.google.android.gms.measurement.internal.zzjh) this.zzb.get(zzjjVar);
            com.google.android.gms.measurement.internal.zzjh zzjhVar2 = (com.google.android.gms.measurement.internal.zzjh) zzjkVar.zzb.get(zzjjVar);
            if (zzjhVar != null) {
                if (zzjhVar2 != null) {
                    com.google.android.gms.measurement.internal.zzjh zzjhVar3 = com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED;
                    if (zzjhVar != zzjhVar3) {
                        if (zzjhVar2 != zzjhVar3) {
                            com.google.android.gms.measurement.internal.zzjh zzjhVar4 = com.google.android.gms.measurement.internal.zzjh.POLICY;
                            if (zzjhVar != zzjhVar4) {
                                if (zzjhVar2 != zzjhVar4) {
                                    com.google.android.gms.measurement.internal.zzjh zzjhVar5 = com.google.android.gms.measurement.internal.zzjh.DENIED;
                                    zzjhVar = (zzjhVar == zzjhVar5 || zzjhVar2 == zzjhVar5) ? zzjhVar5 : com.google.android.gms.measurement.internal.zzjh.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (zzjhVar == null) {
                    enumMap.put((java.util.EnumMap) zzjjVar, (com.google.android.gms.measurement.internal.zzjj) zzjhVar);
                }
            }
            zzjhVar = zzjhVar2;
            if (zzjhVar == null) {
            }
        }
        return new com.google.android.gms.measurement.internal.zzjk(enumMap, 100);
    }

    public final com.google.android.gms.measurement.internal.zzjk zzt(com.google.android.gms.measurement.internal.zzjk zzjkVar) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        for (com.google.android.gms.measurement.internal.zzjj zzjjVar : com.google.android.gms.measurement.internal.zzji.STORAGE.zzb()) {
            com.google.android.gms.measurement.internal.zzjh zzjhVar = (com.google.android.gms.measurement.internal.zzjh) this.zzb.get(zzjjVar);
            if (zzjhVar == com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED) {
                zzjhVar = (com.google.android.gms.measurement.internal.zzjh) zzjkVar.zzb.get(zzjjVar);
            }
            if (zzjhVar != null) {
                enumMap.put((java.util.EnumMap) zzjjVar, (com.google.android.gms.measurement.internal.zzjj) zzjhVar);
            }
        }
        return new com.google.android.gms.measurement.internal.zzjk(enumMap, this.zzc);
    }

    private zzjk(java.util.EnumMap enumMap, int i) {
        java.util.EnumMap enumMap2 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        this.zzb = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzc = i;
    }

    static com.google.android.gms.measurement.internal.zzjh zzj(char c) {
        return c != '+' ? c != '0' ? c != '1' ? com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED : com.google.android.gms.measurement.internal.zzjh.GRANTED : com.google.android.gms.measurement.internal.zzjh.DENIED : com.google.android.gms.measurement.internal.zzjh.POLICY;
    }
}
