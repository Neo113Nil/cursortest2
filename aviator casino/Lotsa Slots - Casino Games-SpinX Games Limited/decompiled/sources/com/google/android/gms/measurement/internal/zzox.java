package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzox extends com.google.android.gms.measurement.internal.zzay {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzox(com.google.android.gms.measurement.internal.zzpf zzpfVar, com.google.android.gms.measurement.internal.zzjf zzjfVar) {
        super(zzjfVar);
        java.util.Objects.requireNonNull(zzpfVar);
        this.zza = zzpfVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    public final void zza() {
        com.google.android.gms.measurement.internal.zzpf zzpfVar = this.zza;
        zzpfVar.zzaW().zzg();
        java.lang.String str = (java.lang.String) zzpfVar.zzax().pollFirst();
        if (str != null) {
            zzpfVar.zzay(zzpfVar.zzaZ().elapsedRealtime());
            zzpfVar.zzaV().zzk().zzb("Sending trigger URI notification to app", str);
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            com.google.android.gms.measurement.internal.zzpf.zzaP(zzpfVar.zzaY(), intent);
        }
        zzpfVar.zzau();
    }
}
