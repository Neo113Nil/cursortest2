package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzav {
    final java.util.List zza = new java.util.ArrayList();

    protected zzav() {
    }

    public abstract com.google.android.gms.internal.measurement.zzao zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list);

    final com.google.android.gms.internal.measurement.zzao zzb(java.lang.String str) {
        if (!this.zza.contains(com.google.android.gms.internal.measurement.zzh.zze(str))) {
            throw new java.lang.IllegalArgumentException("Command not supported");
        }
        java.lang.String.valueOf(str);
        throw new java.lang.UnsupportedOperationException("Command not implemented: ".concat(java.lang.String.valueOf(str)));
    }
}
