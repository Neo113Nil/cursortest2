package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzdt extends com.google.android.gms.internal.consent_sdk.zzdq {
    private final com.google.android.gms.internal.consent_sdk.zzdv zza;

    zzdt(com.google.android.gms.internal.consent_sdk.zzdv zzdvVar, int i) {
        super(zzdvVar.size(), i);
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdq
    protected final java.lang.Object zza(int i) {
        return this.zza.get(i);
    }
}
