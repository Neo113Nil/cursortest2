package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzu extends com.google.android.gms.internal.measurement.zzai {
    private final java.util.concurrent.Callable zza;

    public zzu(java.lang.String str, java.util.concurrent.Callable callable) {
        super("internal.appMetadata");
        this.zza = callable;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        try {
            return com.google.android.gms.internal.measurement.zzi.zza(this.zza.call());
        } catch (java.lang.Exception unused) {
            return com.google.android.gms.internal.measurement.zzao.zzf;
        }
    }
}
