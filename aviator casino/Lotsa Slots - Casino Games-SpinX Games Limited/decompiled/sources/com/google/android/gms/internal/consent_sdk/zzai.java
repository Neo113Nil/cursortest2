package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzai {
    private android.app.Application zza;

    private zzai() {
        throw null;
    }

    /* synthetic */ zzai(com.google.android.gms.internal.consent_sdk.zzal zzalVar) {
    }

    public final com.google.android.gms.internal.consent_sdk.zza zza() {
        com.google.android.gms.internal.consent_sdk.zztj.zzb(this.zza, android.app.Application.class);
        return new com.google.android.gms.internal.consent_sdk.zzah(this.zza);
    }

    public final com.google.android.gms.internal.consent_sdk.zzai zzb(android.app.Application application) {
        application.getClass();
        this.zza = application;
        return this;
    }
}
