package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
enum zza {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    private static final com.google.android.gms.internal.play_billing.zzal zzp;
    private final int zzr;

    static {
        com.google.android.gms.internal.play_billing.zzak zzakVar = new com.google.android.gms.internal.play_billing.zzak();
        for (com.google.android.gms.internal.play_billing.zza zzaVar : values()) {
            zzakVar.zza(java.lang.Integer.valueOf(zzaVar.zzr), zzaVar);
        }
        zzp = zzakVar.zzb();
    }

    zza(int i) {
        this.zzr = i;
    }

    static com.google.android.gms.internal.play_billing.zza zza(int i) {
        com.google.android.gms.internal.play_billing.zzal zzalVar = zzp;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        return !zzalVar.containsKey(valueOf) ? RESPONSE_CODE_UNSPECIFIED : (com.google.android.gms.internal.play_billing.zza) zzalVar.get(valueOf);
    }
}
