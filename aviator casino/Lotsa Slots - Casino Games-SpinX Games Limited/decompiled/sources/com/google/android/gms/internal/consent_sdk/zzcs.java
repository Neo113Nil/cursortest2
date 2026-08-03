package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzcs implements com.google.android.gms.internal.consent_sdk.zzth {
    private final com.google.android.gms.internal.consent_sdk.zztk zza;
    private final com.google.android.gms.internal.consent_sdk.zztk zzb;
    private final com.google.android.gms.internal.consent_sdk.zztk zzc;

    private zzcs(com.google.android.gms.internal.consent_sdk.zztk zztkVar, com.google.android.gms.internal.consent_sdk.zztk zztkVar2, com.google.android.gms.internal.consent_sdk.zztk zztkVar3, com.google.android.gms.internal.consent_sdk.zztk zztkVar4, com.google.android.gms.internal.consent_sdk.zztk zztkVar5) {
        this.zza = zztkVar;
        this.zzb = zztkVar2;
        this.zzc = zztkVar4;
    }

    public static com.google.android.gms.internal.consent_sdk.zzcs zza(com.google.android.gms.internal.consent_sdk.zztk zztkVar, com.google.android.gms.internal.consent_sdk.zztk zztkVar2, com.google.android.gms.internal.consent_sdk.zztk zztkVar3, com.google.android.gms.internal.consent_sdk.zztk zztkVar4, com.google.android.gms.internal.consent_sdk.zztk zztkVar5) {
        return new com.google.android.gms.internal.consent_sdk.zzcs(zztkVar, zztkVar2, zztkVar3, zztkVar4, zztkVar5);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        java.lang.Boolean bool = false;
        return new com.google.android.gms.internal.consent_sdk.zzcr((com.google.android.gms.internal.consent_sdk.zzad) this.zza.zzb(), (android.app.Application) this.zzb.zzb(), com.google.android.gms.internal.consent_sdk.zzax.zza(), (com.google.android.gms.internal.consent_sdk.zzco) this.zzc.zzb(), bool.booleanValue());
    }
}
