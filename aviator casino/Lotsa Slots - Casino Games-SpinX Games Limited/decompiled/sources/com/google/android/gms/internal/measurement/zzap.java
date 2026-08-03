package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzap implements com.google.android.gms.internal.measurement.zzao {
    private final java.lang.String zza;
    private final java.util.ArrayList zzb;

    public zzap(java.lang.String str, java.util.List list) {
        this.zza = str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.zzb = arrayList;
        arrayList.addAll(list);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzap)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzap zzapVar = (com.google.android.gms.internal.measurement.zzap) obj;
        java.lang.String str = this.zza;
        if (str == null ? zzapVar.zza == null : str.equals(zzapVar.zza)) {
            return this.zzb.equals(zzapVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        return ((str != null ? str.hashCode() : 0) * 31) + this.zzb.hashCode();
    }

    public final java.lang.String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.String zzc() {
        throw new java.lang.IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzcA(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        throw new java.lang.IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Double zzd() {
        throw new java.lang.IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Boolean zze() {
        throw new java.lang.IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.util.Iterator zzf() {
        return null;
    }

    public final java.util.ArrayList zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzt() {
        return this;
    }
}
