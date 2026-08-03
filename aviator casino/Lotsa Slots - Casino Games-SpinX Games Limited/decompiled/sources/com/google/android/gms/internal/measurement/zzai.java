package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzai implements com.google.android.gms.internal.measurement.zzao, com.google.android.gms.internal.measurement.zzak {
    protected final java.lang.String zzd;
    protected final java.util.Map zze = new java.util.HashMap();

    public zzai(java.lang.String str) {
        this.zzd = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzai)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzai zzaiVar = (com.google.android.gms.internal.measurement.zzai) obj;
        java.lang.String str = this.zzd;
        if (str != null) {
            return str.equals(zzaiVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zzd;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public abstract com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list);

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.String zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzcA(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        return "toString".equals(str) ? new com.google.android.gms.internal.measurement.zzas(this.zzd) : com.google.android.gms.internal.measurement.zzak.CC.zzu(this, new com.google.android.gms.internal.measurement.zzas(str), zzgVar, list);
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
        return com.google.android.gms.internal.measurement.zzak.CC.zzv(this.zze);
    }

    public final java.lang.String zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzj(java.lang.String str) {
        return this.zze.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final com.google.android.gms.internal.measurement.zzao zzk(java.lang.String str) {
        java.util.Map map = this.zze;
        return map.containsKey(str) ? (com.google.android.gms.internal.measurement.zzao) map.get(str) : zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void zzm(java.lang.String str, com.google.android.gms.internal.measurement.zzao zzaoVar) {
        if (zzaoVar == null) {
            this.zze.remove(str);
        } else {
            this.zze.put(str, zzaoVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public com.google.android.gms.internal.measurement.zzao zzt() {
        return this;
    }
}
