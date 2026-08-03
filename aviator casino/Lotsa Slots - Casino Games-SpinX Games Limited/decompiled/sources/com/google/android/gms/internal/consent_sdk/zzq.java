package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzq implements com.google.android.gms.internal.consent_sdk.zzth {
    private final com.google.android.gms.internal.consent_sdk.zztk zza;
    private final com.google.android.gms.internal.consent_sdk.zztk zzb;

    private zzq(com.google.android.gms.internal.consent_sdk.zztk zztkVar, com.google.android.gms.internal.consent_sdk.zztk zztkVar2) {
        this.zza = zztkVar;
        this.zzb = zztkVar2;
    }

    public static com.google.android.gms.internal.consent_sdk.zzq zzc(com.google.android.gms.internal.consent_sdk.zztk zztkVar, com.google.android.gms.internal.consent_sdk.zztk zztkVar2) {
        return new com.google.android.gms.internal.consent_sdk.zzq(zztkVar, zztkVar2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.consent_sdk.zzn zzb() {
        return new com.google.android.gms.internal.consent_sdk.zzn((android.app.Application) this.zza.zzb(), (com.google.android.gms.internal.consent_sdk.zzaq) this.zzb.zzb());
    }
}
