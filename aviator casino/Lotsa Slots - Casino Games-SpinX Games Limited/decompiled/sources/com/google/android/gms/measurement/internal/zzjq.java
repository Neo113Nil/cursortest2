package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzjq implements com.google.android.gms.measurement.internal.zzgl {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzib zza;

    zzjq(com.google.android.gms.measurement.internal.zzjr zzjrVar, com.google.android.gms.measurement.internal.zzib zzibVar) {
        this.zza = zzibVar;
        java.util.Objects.requireNonNull(zzjrVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final boolean zza() {
        return android.util.Log.isLoggable(this.zza.zzaV().zzn(), 3);
    }
}
