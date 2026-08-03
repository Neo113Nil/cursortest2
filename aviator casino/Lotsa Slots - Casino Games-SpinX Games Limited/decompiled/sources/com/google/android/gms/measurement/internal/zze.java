package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zze {
    private final com.google.android.gms.measurement.internal.zzjh zza;

    zze(com.google.android.gms.measurement.internal.zzjh zzjhVar) {
        this.zza = zzjhVar;
    }

    static com.google.android.gms.measurement.internal.zze zzc(java.lang.String str) {
        return new com.google.android.gms.measurement.internal.zze((android.text.TextUtils.isEmpty(str) || str.length() > 1) ? com.google.android.gms.measurement.internal.zzjh.UNINITIALIZED : com.google.android.gms.measurement.internal.zzjk.zzj(str.charAt(0)));
    }

    final com.google.android.gms.measurement.internal.zzjh zza() {
        return this.zza;
    }

    final java.lang.String zzb() {
        return java.lang.String.valueOf(com.google.android.gms.measurement.internal.zzjk.zzm(this.zza));
    }
}
