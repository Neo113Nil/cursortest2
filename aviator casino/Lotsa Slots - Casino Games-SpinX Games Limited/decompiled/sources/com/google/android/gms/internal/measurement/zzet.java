package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzet extends com.google.android.gms.internal.measurement.zzeq {
    final /* synthetic */ android.os.Bundle zza;
    final /* synthetic */ android.app.Activity zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzfa zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzet(com.google.android.gms.internal.measurement.zzfa zzfaVar, android.os.Bundle bundle, android.app.Activity activity) {
        super(zzfaVar.zza, true);
        this.zza = bundle;
        this.zzb = activity;
        java.util.Objects.requireNonNull(zzfaVar);
        this.zzc = zzfaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    final void zza() throws android.os.RemoteException {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = this.zza;
        if (bundle2 != null) {
            bundle = new android.os.Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                java.lang.Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof android.os.Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (android.os.Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        com.google.android.gms.internal.measurement.zzcr zzcrVar = (com.google.android.gms.internal.measurement.zzcr) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzc.zza.zzQ());
        android.app.Activity activity = this.zzb;
        zzcrVar.onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza(activity), bundle, this.zzi);
    }
}
