package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzaz {
    public static final com.google.android.gms.measurement.internal.zzaz zza = new com.google.android.gms.measurement.internal.zzaz((java.lang.Boolean) null, 100, (java.lang.Boolean) null, (java.lang.String) null);
    private final int zzb;
    private final java.lang.String zzc;
    private final java.lang.Boolean zzd;
    private final java.lang.String zze;
    private final java.util.EnumMap zzf;

    static {
    }

    zzaz(java.lang.Boolean bool, int i, java.lang.Boolean bool2, java.lang.String str) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        this.zzf = enumMap;
        enumMap.put((java.util.EnumMap) com.google.android.gms.measurement.internal.zzjj.AD_USER_DATA, (com.google.android.gms.measurement.internal.zzjj) com.google.android.gms.measurement.internal.zzjk.zzh(bool));
        this.zzb = i;
        this.zzc = zzl();
        this.zzd = bool2;
        this.zze = str;
    }

    static com.google.android.gms.measurement.internal.zzaz zza(com.google.android.gms.measurement.internal.zzjh zzjhVar, int i) {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        enumMap.put((java.util.EnumMap) com.google.android.gms.measurement.internal.zzjj.AD_USER_DATA, (com.google.android.gms.measurement.internal.zzjj) zzjhVar);
        return new com.google.android.gms.measurement.internal.zzaz(enumMap, -10, (java.lang.Boolean) null, (java.lang.String) null);
    }

    public static com.google.android.gms.measurement.internal.zzaz zzg(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        java.lang.String[] split = str.split(":");
        int parseInt = java.lang.Integer.parseInt(split[0]);
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        com.google.android.gms.measurement.internal.zzjj[] zza2 = com.google.android.gms.measurement.internal.zzji.DMA.zza();
        int length = zza2.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            enumMap.put((java.util.EnumMap) zza2[i2], (com.google.android.gms.measurement.internal.zzjj) com.google.android.gms.measurement.internal.zzjk.zzj(split[i].charAt(0)));
            i2++;
            i++;
        }
        return new com.google.android.gms.measurement.internal.zzaz(enumMap, parseInt, (java.lang.Boolean) null, (java.lang.String) null);
    }

    public static com.google.android.gms.measurement.internal.zzaz zzh(android.os.Bundle bundle, int i) {
        if (bundle == null) {
            return new com.google.android.gms.measurement.internal.zzaz((java.lang.Boolean) null, i, (java.lang.Boolean) null, (java.lang.String) null);
        }
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        for (com.google.android.gms.measurement.internal.zzjj zzjjVar : com.google.android.gms.measurement.internal.zzji.DMA.zza()) {
            enumMap.put((java.util.EnumMap) zzjjVar, (com.google.android.gms.measurement.internal.zzjj) com.google.android.gms.measurement.internal.zzjk.zzg(bundle.getString(zzjjVar.zze)));
        }
        return new com.google.android.gms.measurement.internal.zzaz(enumMap, i, bundle.containsKey("is_dma_region") ? java.lang.Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static java.lang.Boolean zzi(android.os.Bundle bundle) {
        com.google.android.gms.measurement.internal.zzjh zzg;
        if (bundle == null || (zzg = com.google.android.gms.measurement.internal.zzjk.zzg(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int ordinal = zzg.ordinal();
        if (ordinal != 2) {
            return ordinal != 3 ? null : true;
        }
        return false;
    }

    private final java.lang.String zzl() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.zzb);
        for (com.google.android.gms.measurement.internal.zzjj zzjjVar : com.google.android.gms.measurement.internal.zzji.DMA.zza()) {
            sb.append(":");
            sb.append(com.google.android.gms.measurement.internal.zzjk.zzm((com.google.android.gms.measurement.internal.zzjh) this.zzf.get(zzjjVar)));
        }
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.measurement.internal.zzaz)) {
            return false;
        }
        com.google.android.gms.measurement.internal.zzaz zzazVar = (com.google.android.gms.measurement.internal.zzaz) obj;
        if (this.zzc.equalsIgnoreCase(zzazVar.zzc) && java.util.Objects.equals(this.zzd, zzazVar.zzd)) {
            return java.util.Objects.equals(this.zze, zzazVar.zze);
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("source=");
        sb.append(com.google.android.gms.measurement.internal.zzjk.zzd(this.zzb));
        for (com.google.android.gms.measurement.internal.zzjj zzjjVar : com.google.android.gms.measurement.internal.zzji.DMA.zza()) {
            sb.append(",");
            sb.append(zzjjVar.zze);
            sb.append(com.ironsource.X3.j.b);
            com.google.android.gms.measurement.internal.zzjh zzjhVar = (com.google.android.gms.measurement.internal.zzjh) this.zzf.get(zzjjVar);
            if (zzjhVar == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = zzjhVar.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb.append("denied");
                } else if (ordinal == 3) {
                    sb.append("granted");
                }
            }
        }
        java.lang.Boolean bool = this.zzd;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        java.lang.String str = this.zze;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public final int zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.measurement.internal.zzjh zzc() {
        com.google.android.gms.measurement.internal.zzjh zzjhVar = (com.google.android.gms.measurement.internal.zzjh) this.zzf.get(com.google.android.gms.measurement.internal.zzjj.AD_USER_DATA);
        return zzjhVar == null ? com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED : zzjhVar;
    }

    public final boolean zzd() {
        java.util.Iterator it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (((com.google.android.gms.measurement.internal.zzjh) it.next()) != com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String zze() {
        return this.zzc;
    }

    public final android.os.Bundle zzf() {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry entry : this.zzf.entrySet()) {
            java.lang.String zzi = com.google.android.gms.measurement.internal.zzjk.zzi((com.google.android.gms.measurement.internal.zzjh) entry.getValue());
            if (zzi != null) {
                bundle.putString(((com.google.android.gms.measurement.internal.zzjj) entry.getKey()).zze, zzi);
            }
        }
        java.lang.Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        java.lang.String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final java.lang.Boolean zzj() {
        return this.zzd;
    }

    public final java.lang.String zzk() {
        return this.zze;
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.zzd;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        java.lang.String str = this.zze;
        return this.zzc.hashCode() + (i * 29) + ((str == null ? 17 : str.hashCode()) * com.vungle.ads.internal.protos.Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
    }

    private zzaz(java.util.EnumMap enumMap, int i, java.lang.Boolean bool, java.lang.String str) {
        java.util.EnumMap enumMap2 = new java.util.EnumMap(com.google.android.gms.measurement.internal.zzjj.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i;
        this.zzc = zzl();
        this.zzd = bool;
        this.zze = str;
    }
}
