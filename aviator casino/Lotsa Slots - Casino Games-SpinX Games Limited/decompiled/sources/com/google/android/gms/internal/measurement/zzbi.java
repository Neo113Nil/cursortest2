package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzbi extends com.google.android.gms.internal.measurement.zzav {
    @Override // com.google.android.gms.internal.measurement.zzav
    public final com.google.android.gms.internal.measurement.zzao zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        if (str == null || str.isEmpty() || !zzgVar.zzd(str)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Command not found: %s", str));
        }
        com.google.android.gms.internal.measurement.zzao zzh = zzgVar.zzh(str);
        if (zzh instanceof com.google.android.gms.internal.measurement.zzai) {
            return ((com.google.android.gms.internal.measurement.zzai) zzh).zza(zzgVar, list);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Function %s is not defined", str));
    }
}
