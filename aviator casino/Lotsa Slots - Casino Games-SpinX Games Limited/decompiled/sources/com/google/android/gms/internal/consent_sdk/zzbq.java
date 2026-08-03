package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzbq {
    private final com.google.android.gms.internal.consent_sdk.zztm zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.concurrent.atomic.AtomicReference zzc = new java.util.concurrent.atomic.AtomicReference();
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference();

    zzbq(com.google.android.gms.internal.consent_sdk.zztm zztmVar, java.util.concurrent.Executor executor) {
        this.zza = zztmVar;
        this.zzb = executor;
    }

    public static /* synthetic */ void zza(com.google.android.gms.internal.consent_sdk.zzbq zzbqVar, com.google.android.gms.internal.consent_sdk.zzbe zzbeVar) {
        final java.util.concurrent.atomic.AtomicReference atomicReference = zzbqVar.zzd;
        java.util.Objects.requireNonNull(atomicReference);
        zzbeVar.zzf(new com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(com.google.android.ump.ConsentForm consentForm) {
                atomicReference.set(consentForm);
            }
        }, new com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(com.google.android.ump.FormError formError) {
                android.util.Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(java.lang.String.valueOf(formError.getMessage())));
            }
        });
    }

    public final void zzb(com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener, boolean z) {
        com.google.android.gms.internal.consent_sdk.zzcz.zza();
        com.google.android.gms.internal.consent_sdk.zzbs zzbsVar = (com.google.android.gms.internal.consent_sdk.zzbs) this.zzc.get();
        if (zzbsVar == null) {
            onConsentFormLoadFailureListener.onConsentFormLoadFailure(new com.google.android.gms.internal.consent_sdk.zzg(3, "No available form can be built.").zza());
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzbe zza = ((com.google.android.gms.internal.consent_sdk.zzay) this.zza.zzb()).zza(zzbsVar).zzb().zza();
        zza.zzb = z;
        zza.zzf(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    public final void zzc() {
        com.google.android.gms.internal.consent_sdk.zzbs zzbsVar = (com.google.android.gms.internal.consent_sdk.zzbs) this.zzc.get();
        if (zzbsVar == null) {
            android.util.Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final com.google.android.gms.internal.consent_sdk.zzbe zza = ((com.google.android.gms.internal.consent_sdk.zzay) this.zza.zzb()).zza(zzbsVar).zzb().zza();
        zza.zza = true;
        com.google.android.gms.internal.consent_sdk.zzcz.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.consent_sdk.zzbq.zza(com.google.android.gms.internal.consent_sdk.zzbq.this, zza);
            }
        });
    }

    public final void zzd(com.google.android.gms.internal.consent_sdk.zzbs zzbsVar) {
        this.zzc.set(zzbsVar);
    }

    public final void zze(android.app.Activity activity, final com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zzcz.zza();
        com.google.android.gms.internal.consent_sdk.zzj zzb = com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzb();
        if (zzb == null) {
            com.google.android.gms.internal.consent_sdk.zzcz.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.ump.ConsentForm.OnConsentFormDismissedListener.this.onConsentFormDismissed(new com.google.android.gms.internal.consent_sdk.zzg(1, "No consentInformation.").zza());
                }
            });
            return;
        }
        if (!zzb.isConsentFormAvailable() && zzb.getPrivacyOptionsRequirementStatus() != com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            com.google.android.gms.internal.consent_sdk.zzcz.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.ump.ConsentForm.OnConsentFormDismissedListener.this.onConsentFormDismissed(new com.google.android.gms.internal.consent_sdk.zzg(3, "No valid response received yet.").zza());
                }
            });
            zzb.zza(activity);
        } else {
            if (zzb.getPrivacyOptionsRequirementStatus() == com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
                com.google.android.gms.internal.consent_sdk.zzcz.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.ump.ConsentForm.OnConsentFormDismissedListener.this.onConsentFormDismissed(new com.google.android.gms.internal.consent_sdk.zzg(3, "Privacy options form is not required.").zza());
                    }
                });
                return;
            }
            com.google.android.ump.ConsentForm consentForm = (com.google.android.ump.ConsentForm) this.zzd.get();
            if (consentForm == null) {
                com.google.android.gms.internal.consent_sdk.zzcz.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.ump.ConsentForm.OnConsentFormDismissedListener.this.onConsentFormDismissed(new com.google.android.gms.internal.consent_sdk.zzg(3, "Privacy options form is being loading. Please try again later.").zza());
                    }
                });
            } else {
                consentForm.show(activity, onConsentFormDismissedListener);
                this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbn
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.internal.consent_sdk.zzbq.this.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}
