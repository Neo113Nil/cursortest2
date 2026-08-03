package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzan {
    private final java.util.EnumMap zza;

    zzan() {
        this.zza = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
    }

    public static com.google.android.gms.measurement.internal.zzan zzd(java.lang.String str) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        if (str.length() >= com.google.android.gms.measurement.internal.zzjj.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                com.google.android.gms.measurement.internal.zzjj[] values = com.google.android.gms.measurement.internal.zzjj.values();
                int length = values.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put((java.util.EnumMap) values[i], (com.google.android.gms.measurement.internal.zzjj) com.google.android.gms.measurement.internal.zzam.zza(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new com.google.android.gms.measurement.internal.zzan(enumMap);
            }
        }
        return new com.google.android.gms.measurement.internal.zzan();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("1");
        for (com.google.android.gms.measurement.internal.zzjj zzjjVar : com.google.android.gms.measurement.internal.zzjj.values()) {
            com.google.android.gms.measurement.internal.zzam zzamVar = (com.google.android.gms.measurement.internal.zzam) this.zza.get(zzjjVar);
            if (zzamVar == null) {
                zzamVar = com.google.android.gms.measurement.internal.zzam.UNSET;
            }
            sb.append(zzamVar.zzb());
        }
        return sb.toString();
    }

    public final com.google.android.gms.measurement.internal.zzam zza(com.google.android.gms.measurement.internal.zzjj zzjjVar) {
        com.google.android.gms.measurement.internal.zzam zzamVar = (com.google.android.gms.measurement.internal.zzam) this.zza.get(zzjjVar);
        return zzamVar == null ? com.google.android.gms.measurement.internal.zzam.UNSET : zzamVar;
    }

    public final void zzb(com.google.android.gms.measurement.internal.zzjj zzjjVar, int i) {
        com.google.android.gms.measurement.internal.zzam zzamVar = com.google.android.gms.measurement.internal.zzam.UNSET;
        if (i != -30) {
            if (i != -20) {
                if (i == -10) {
                    zzamVar = com.google.android.gms.measurement.internal.zzam.MANIFEST;
                } else if (i != 0) {
                    if (i == 30) {
                        zzamVar = com.google.android.gms.measurement.internal.zzam.INITIALIZATION;
                    }
                }
            }
            zzamVar = com.google.android.gms.measurement.internal.zzam.API;
        } else {
            zzamVar = com.google.android.gms.measurement.internal.zzam.TCF;
        }
        this.zza.put((java.util.EnumMap) zzjjVar, (com.google.android.gms.measurement.internal.zzjj) zzamVar);
    }

    public final void zzc(com.google.android.gms.measurement.internal.zzjj zzjjVar, com.google.android.gms.measurement.internal.zzam zzamVar) {
        this.zza.put((java.util.EnumMap) zzjjVar, (com.google.android.gms.measurement.internal.zzjj) zzamVar);
    }

    private zzan(java.util.EnumMap enumMap) {
        java.util.EnumMap enumMap2 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
