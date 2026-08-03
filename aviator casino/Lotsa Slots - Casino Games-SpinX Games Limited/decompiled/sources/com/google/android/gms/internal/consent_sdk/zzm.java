package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzm implements com.google.android.gms.internal.consent_sdk.zzth {
    private final com.google.android.gms.internal.consent_sdk.zztk zza;
    private final com.google.android.gms.internal.consent_sdk.zztk zzb;

    private zzm(com.google.android.gms.internal.consent_sdk.zztk zztkVar, com.google.android.gms.internal.consent_sdk.zztk zztkVar2) {
        this.zza = zztkVar;
        this.zzb = zztkVar2;
    }

    public static com.google.android.gms.internal.consent_sdk.zzm zza(com.google.android.gms.internal.consent_sdk.zztk zztkVar, com.google.android.gms.internal.consent_sdk.zztk zztkVar2) {
        return new com.google.android.gms.internal.consent_sdk.zzm(zztkVar, zztkVar2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return new com.google.android.gms.internal.consent_sdk.zzl((android.app.Application) this.zza.zzb(), (com.google.android.gms.internal.consent_sdk.zzam) this.zzb.zzb());
    }
}
