package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzn {
    private final android.app.Application zza;
    private final com.google.android.gms.internal.consent_sdk.zzaq zzb;

    zzn(android.app.Application application, com.google.android.gms.internal.consent_sdk.zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzaqVar;
    }

    final com.google.android.gms.internal.consent_sdk.zzcl zzc(android.app.Activity activity, com.google.android.ump.ConsentRequestParameters consentRequestParameters) throws com.google.android.gms.internal.consent_sdk.zzg {
        com.google.android.ump.ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
        if (consentDebugSettings == null) {
            consentDebugSettings = new com.google.android.ump.ConsentDebugSettings.Builder(this.zza).build();
        }
        return com.google.android.gms.internal.consent_sdk.zzp.zza(new com.google.android.gms.internal.consent_sdk.zzp(this, activity, consentDebugSettings, consentRequestParameters, null));
    }
}
