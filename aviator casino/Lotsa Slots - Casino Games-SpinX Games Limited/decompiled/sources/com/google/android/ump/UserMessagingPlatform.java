package com.google.android.ump;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class UserMessagingPlatform {

    /* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(com.google.android.ump.FormError formError);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(com.google.android.ump.ConsentForm consentForm);
    }

    private UserMessagingPlatform() {
    }

    public static com.google.android.ump.ConsentInformation getConsentInformation(android.content.Context context) {
        return com.google.android.gms.internal.consent_sdk.zza.zza(context).zzb();
    }

    public static void loadAndShowConsentFormIfRequired(final android.app.Activity activity, final com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zza zza = com.google.android.gms.internal.consent_sdk.zza.zza(activity);
        if (zza.zzb().canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed(null);
            return;
        }
        zza.zzd().zzc();
        com.google.android.gms.internal.consent_sdk.zzbq zzc = zza.zzc();
        com.google.android.gms.internal.consent_sdk.zzcz.zza();
        com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener = new com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbo
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(com.google.android.ump.ConsentForm consentForm) {
                consentForm.show(activity, onConsentFormDismissedListener);
            }
        };
        java.util.Objects.requireNonNull(onConsentFormDismissedListener);
        zzc.zzb(onConsentFormLoadSuccessListener, new com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbp
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(com.google.android.ump.FormError formError) {
                com.google.android.ump.ConsentForm.OnConsentFormDismissedListener.this.onConsentFormDismissed(formError);
            }
        }, true);
    }

    public static void loadConsentForm(android.content.Context context, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        com.google.android.gms.internal.consent_sdk.zza zza = com.google.android.gms.internal.consent_sdk.zza.zza(context);
        ((java.util.Queue) zza.zzd().zzb.get()).add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        zza.zzc().zzb(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, false);
    }

    public static void showPrivacyOptionsForm(android.app.Activity activity, com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzc().zze(activity, onConsentFormDismissedListener);
    }
}
