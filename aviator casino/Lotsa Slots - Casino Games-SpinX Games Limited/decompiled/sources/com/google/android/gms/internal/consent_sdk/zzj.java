package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzj implements com.google.android.ump.ConsentInformation {
    private final com.google.android.gms.internal.consent_sdk.zzaq zza;
    private final com.google.android.gms.internal.consent_sdk.zzw zzb;
    private final com.google.android.gms.internal.consent_sdk.zzbq zzc;
    private final com.google.android.gms.internal.consent_sdk.zzcr zzf;
    private final java.lang.Object zzd = new java.lang.Object();
    private final java.lang.Object zze = new java.lang.Object();
    private boolean zzg = false;
    private boolean zzh = false;
    private com.google.android.ump.ConsentRequestParameters zzi = new com.google.android.ump.ConsentRequestParameters.Builder().build();

    public zzj(com.google.android.gms.internal.consent_sdk.zzaq zzaqVar, com.google.android.gms.internal.consent_sdk.zzw zzwVar, com.google.android.gms.internal.consent_sdk.zzbq zzbqVar, com.google.android.gms.internal.consent_sdk.zzcr zzcrVar) {
        this.zza = zzaqVar;
        this.zzb = zzwVar;
        this.zzc = zzbqVar;
        this.zzf = zzcrVar;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean canRequestAds() {
        com.google.android.gms.internal.consent_sdk.zzaq zzaqVar = this.zza;
        if (!zzaqVar.zzk()) {
            int zza = !zzc() ? 0 : zzaqVar.zza();
            if (zza != 1 && zza != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final int getConsentStatus() {
        if (zzc()) {
            return this.zza.zza();
        }
        return 0;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus() {
        return !zzc() ? com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN : this.zza.zzb();
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void requestConsentInfoUpdate(android.app.Activity activity, com.google.android.ump.ConsentRequestParameters consentRequestParameters, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        synchronized (this.zzd) {
            this.zzg = true;
        }
        this.zzi = consentRequestParameters;
        this.zzf.zzh();
        this.zzb.zzc(activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener);
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzg = false;
        }
    }

    public final void zza(android.app.Activity activity) {
        if (zzc() && !zzd()) {
            zzb(true);
            this.zzb.zzc(activity, this.zzi, new com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
                public final void onConsentInfoUpdateSuccess() {
                    com.google.android.gms.internal.consent_sdk.zzj.this.zzb(false);
                }
            }, new com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
                public final void onConsentInfoUpdateFailure(com.google.android.ump.FormError formError) {
                    com.google.android.gms.internal.consent_sdk.zzj.this.zzb(false);
                }
            });
            return;
        }
        android.util.Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zzc() + ", retryRequestIsInProgress=" + zzd());
    }

    public final void zzb(boolean z) {
        synchronized (this.zze) {
            this.zzh = z;
        }
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzd) {
            z = this.zzg;
        }
        return z;
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzh;
        }
        return z;
    }
}
