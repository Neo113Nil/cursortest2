package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzca implements com.google.android.gms.internal.consent_sdk.zzth {
    private final com.google.android.gms.internal.consent_sdk.zztk zza;

    private zzca(com.google.android.gms.internal.consent_sdk.zztk zztkVar) {
        this.zza = zztkVar;
    }

    public static com.google.android.gms.internal.consent_sdk.zzca zza(com.google.android.gms.internal.consent_sdk.zztk zztkVar) {
        return new com.google.android.gms.internal.consent_sdk.zzca(zztkVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return new com.google.android.gms.internal.consent_sdk.zzbz((android.app.Application) this.zza.zzb());
    }
}
