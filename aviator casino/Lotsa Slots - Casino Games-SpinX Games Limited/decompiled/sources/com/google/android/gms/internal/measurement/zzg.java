package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzg {
    public final com.google.android.gms.internal.measurement.zzg zza;
    final com.google.android.gms.internal.measurement.zzaw zzb;
    final java.util.Map zzc = new java.util.HashMap();
    final java.util.Map zzd = new java.util.HashMap();

    public zzg(com.google.android.gms.internal.measurement.zzg zzgVar, com.google.android.gms.internal.measurement.zzaw zzawVar) {
        this.zza = zzgVar;
        this.zzb = zzawVar;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzao zzaoVar) {
        return this.zzb.zzb(this, zzaoVar);
    }

    public final com.google.android.gms.internal.measurement.zzao zzb(com.google.android.gms.internal.measurement.zzae zzaeVar) {
        com.google.android.gms.internal.measurement.zzao zzaoVar = com.google.android.gms.internal.measurement.zzao.zzf;
        java.util.Iterator zzg = zzaeVar.zzg();
        while (zzg.hasNext()) {
            zzaoVar = this.zzb.zzb(this, zzaeVar.zzl(((java.lang.Integer) zzg.next()).intValue()));
            if (zzaoVar instanceof com.google.android.gms.internal.measurement.zzag) {
                break;
            }
        }
        return zzaoVar;
    }

    public final com.google.android.gms.internal.measurement.zzg zzc() {
        return new com.google.android.gms.internal.measurement.zzg(this, this.zzb);
    }

    public final boolean zzd(java.lang.String str) {
        if (this.zzc.containsKey(str)) {
            return true;
        }
        com.google.android.gms.internal.measurement.zzg zzgVar = this.zza;
        if (zzgVar != null) {
            return zzgVar.zzd(str);
        }
        return false;
    }

    public final void zze(java.lang.String str, com.google.android.gms.internal.measurement.zzao zzaoVar) {
        com.google.android.gms.internal.measurement.zzg zzgVar;
        java.util.Map map = this.zzc;
        if (!map.containsKey(str) && (zzgVar = this.zza) != null && zzgVar.zzd(str)) {
            zzgVar.zze(str, zzaoVar);
        } else {
            if (this.zzd.containsKey(str)) {
                return;
            }
            if (zzaoVar == null) {
                map.remove(str);
            } else {
                map.put(str, zzaoVar);
            }
        }
    }

    public final void zzf(java.lang.String str, com.google.android.gms.internal.measurement.zzao zzaoVar) {
        if (this.zzd.containsKey(str)) {
            return;
        }
        if (zzaoVar == null) {
            this.zzc.remove(str);
        } else {
            this.zzc.put(str, zzaoVar);
        }
    }

    public final void zzg(java.lang.String str, com.google.android.gms.internal.measurement.zzao zzaoVar) {
        zzf(str, zzaoVar);
        this.zzd.put(str, true);
    }

    public final com.google.android.gms.internal.measurement.zzao zzh(java.lang.String str) {
        java.util.Map map = this.zzc;
        if (map.containsKey(str)) {
            return (com.google.android.gms.internal.measurement.zzao) map.get(str);
        }
        com.google.android.gms.internal.measurement.zzg zzgVar = this.zza;
        if (zzgVar != null) {
            return zzgVar.zzh(str);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("%s is not defined", str));
    }
}
