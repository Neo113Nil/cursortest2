package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzpa implements com.google.android.gms.measurement.internal.zzpn {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpf zza;

    zzpa(com.google.android.gms.measurement.internal.zzpf zzpfVar) {
        java.util.Objects.requireNonNull(zzpfVar);
        this.zza = zzpfVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzpn
    public final void zza(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        if (!android.text.TextUtils.isEmpty(str)) {
            this.zza.zzaW().zzj(new com.google.android.gms.measurement.internal.zzoz(this, str, str2, bundle));
            return;
        }
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        if (zzpfVar.zzaw() != null) {
            zzpfVar.zzaw().zzaV().zzb().zzb("AppId not known when logging event", str2);
        }
    }
}
