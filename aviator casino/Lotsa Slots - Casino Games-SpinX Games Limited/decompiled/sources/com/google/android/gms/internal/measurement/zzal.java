package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public class zzal implements com.google.android.gms.internal.measurement.zzao, com.google.android.gms.internal.measurement.zzak {
    final java.util.Map zza = new java.util.HashMap();

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzal) {
            return this.zza.equals(((com.google.android.gms.internal.measurement.zzal) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        java.util.Map map = this.zza;
        if (!map.isEmpty()) {
            for (java.lang.String str : map.keySet()) {
                sb.append(java.lang.String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    public final java.util.List zzb() {
        return new java.util.ArrayList(this.zza.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.String zzc() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public com.google.android.gms.internal.measurement.zzao zzcA(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        return "toString".equals(str) ? new com.google.android.gms.internal.measurement.zzas(toString()) : com.google.android.gms.internal.measurement.zzak.CC.zzu(this, new com.google.android.gms.internal.measurement.zzas(str), zzgVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Double zzd() {
        return java.lang.Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.util.Iterator zzf() {
        return com.google.android.gms.internal.measurement.zzak.CC.zzv(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzj(java.lang.String str) {
        return this.zza.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final com.google.android.gms.internal.measurement.zzao zzk(java.lang.String str) {
        java.util.Map map = this.zza;
        return map.containsKey(str) ? (com.google.android.gms.internal.measurement.zzao) map.get(str) : zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void zzm(java.lang.String str, com.google.android.gms.internal.measurement.zzao zzaoVar) {
        if (zzaoVar == null) {
            this.zza.remove(str);
        } else {
            this.zza.put(str, zzaoVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzt() {
        com.google.android.gms.internal.measurement.zzal zzalVar = new com.google.android.gms.internal.measurement.zzal();
        for (java.util.Map.Entry entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof com.google.android.gms.internal.measurement.zzak) {
                zzalVar.zza.put((java.lang.String) entry.getKey(), (com.google.android.gms.internal.measurement.zzao) entry.getValue());
            } else {
                zzalVar.zza.put((java.lang.String) entry.getKey(), ((com.google.android.gms.internal.measurement.zzao) entry.getValue()).zzt());
            }
        }
        return zzalVar;
    }
}
