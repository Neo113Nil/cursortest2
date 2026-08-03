package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzap implements com.google.android.gms.internal.consent_sdk.zzth {
    private final com.google.android.gms.internal.consent_sdk.zztk zza;
    private final com.google.android.gms.internal.consent_sdk.zztk zzb;
    private final com.google.android.gms.internal.consent_sdk.zztk zzc;

    private zzap(com.google.android.gms.internal.consent_sdk.zztk zztkVar, com.google.android.gms.internal.consent_sdk.zztk zztkVar2, com.google.android.gms.internal.consent_sdk.zztk zztkVar3, com.google.android.gms.internal.consent_sdk.zztk zztkVar4) {
        this.zza = zztkVar;
        this.zzb = zztkVar2;
        this.zzc = zztkVar3;
    }

    public static com.google.android.gms.internal.consent_sdk.zzap zzc(com.google.android.gms.internal.consent_sdk.zztk zztkVar, com.google.android.gms.internal.consent_sdk.zztk zztkVar2, com.google.android.gms.internal.consent_sdk.zztk zztkVar3, com.google.android.gms.internal.consent_sdk.zztk zztkVar4) {
        return new com.google.android.gms.internal.consent_sdk.zzap(zztkVar, zztkVar2, zztkVar3, zztkVar4);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.consent_sdk.zzao zzb() {
        return new com.google.android.gms.internal.consent_sdk.zzao((android.app.Application) this.zza.zzb(), (com.google.android.gms.internal.consent_sdk.zzaq) this.zzb.zzb(), (com.google.android.gms.internal.consent_sdk.zzl) this.zzc.zzb(), com.google.android.gms.internal.consent_sdk.zzax.zza());
    }
}
