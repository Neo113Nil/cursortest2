package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zztf implements com.google.android.gms.internal.consent_sdk.zzth {
    private com.google.android.gms.internal.consent_sdk.zztk zza;

    public static void zza(com.google.android.gms.internal.consent_sdk.zztk zztkVar, com.google.android.gms.internal.consent_sdk.zztk zztkVar2) {
        com.google.android.gms.internal.consent_sdk.zztf zztfVar = (com.google.android.gms.internal.consent_sdk.zztf) zztkVar;
        if (zztfVar.zza != null) {
            throw new java.lang.IllegalStateException();
        }
        zztfVar.zza = zztkVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final java.lang.Object zzb() {
        com.google.android.gms.internal.consent_sdk.zztk zztkVar = this.zza;
        if (zztkVar != null) {
            return zztkVar.zzb();
        }
        throw new java.lang.IllegalStateException();
    }
}
