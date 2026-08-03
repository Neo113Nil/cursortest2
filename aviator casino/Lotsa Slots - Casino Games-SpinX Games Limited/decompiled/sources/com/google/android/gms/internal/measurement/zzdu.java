package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzdu extends com.google.android.gms.internal.measurement.zzcw {
    final /* synthetic */ java.lang.Runnable zza;

    zzdu(com.google.android.gms.internal.measurement.zzdv zzdvVar, java.lang.Runnable runnable) {
        this.zza = runnable;
        java.util.Objects.requireNonNull(zzdvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcx
    public final void zze() {
        this.zza.run();
    }
}
