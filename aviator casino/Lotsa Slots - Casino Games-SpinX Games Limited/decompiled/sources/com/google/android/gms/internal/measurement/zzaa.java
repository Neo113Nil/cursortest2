package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzaa {
    private static final com.google.common.collect.ImmutableSet zza = com.google.common.collect.ImmutableSet.of("_syn", "_err", "_el");
    private java.lang.String zzb;
    private final long zzc;
    private final java.util.Map zzd;

    public zzaa(java.lang.String str, long j, java.util.Map map) {
        this.zzb = str;
        this.zzc = j;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.zzd = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static java.lang.Object zzh(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (zza.contains(str) && (obj2 instanceof java.lang.Double)) {
            return java.lang.Long.valueOf(java.lang.Math.round(((java.lang.Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof java.lang.String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof java.lang.Double)) {
            if (obj instanceof java.lang.Long) {
                return java.lang.Long.valueOf(java.lang.Math.round(((java.lang.Double) obj2).doubleValue()));
            }
            if (obj instanceof java.lang.String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzaa)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzaa zzaaVar = (com.google.android.gms.internal.measurement.zzaa) obj;
        if (this.zzc == zzaaVar.zzc && this.zzb.equals(zzaaVar.zzb)) {
            return this.zzd.equals(zzaaVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() * 31;
        long j = this.zzc;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.zzd.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zzb;
        java.lang.String obj = this.zzd.toString();
        int length = java.lang.String.valueOf(str).length();
        long j = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 25 + java.lang.String.valueOf(j).length() + 9 + obj.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    public final long zza() {
        return this.zzc;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final void zzc(java.lang.String str) {
        this.zzb = str;
    }

    public final void zzd(java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            this.zzd.remove(str);
        } else {
            java.util.Map map = this.zzd;
            map.put(str, zzh(str, map.get(str), obj));
        }
    }

    public final java.lang.Object zze(java.lang.String str) {
        java.util.Map map = this.zzd;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final java.util.Map zzf() {
        return this.zzd;
    }

    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.measurement.zzaa clone() {
        return new com.google.android.gms.internal.measurement.zzaa(this.zzb, this.zzc, new java.util.HashMap(this.zzd));
    }
}
