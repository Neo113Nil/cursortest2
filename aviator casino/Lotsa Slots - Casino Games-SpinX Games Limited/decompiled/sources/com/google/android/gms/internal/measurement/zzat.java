package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzat implements com.google.android.gms.internal.measurement.zzao {
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof com.google.android.gms.internal.measurement.zzat;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.String zzc() {
        return com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzcA(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        throw new java.lang.IllegalStateException(java.lang.String.format("Undefined has no function %s", str));
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Double zzd() {
        return java.lang.Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.lang.Boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final java.util.Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final com.google.android.gms.internal.measurement.zzao zzt() {
        return com.google.android.gms.internal.measurement.zzao.zzf;
    }
}
