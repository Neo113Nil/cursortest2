package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzer extends com.google.android.gms.internal.measurement.zzcz {
    private final com.google.android.gms.measurement.internal.zzjo zza;

    zzer(com.google.android.gms.measurement.internal.zzjo zzjoVar) {
        this.zza = zzjoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        this.zza.interceptEvent(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        return java.lang.System.identityHashCode(this.zza);
    }
}
