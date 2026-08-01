package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzcz;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import java.util.Objects;
import java.util.Queue;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes8.dex */
public final class UserMessagingPlatform {

    /* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(FormError formError);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(ConsentForm consentForm);
    }

    private UserMessagingPlatform() {
    }

    public static ConsentInformation getConsentInformation(Context context) {
        return com.google.android.gms.internal.consent_sdk.zza.zza(context).zzb();
    }

    public static void loadAndShowConsentFormIfRequired(final Activity activity, final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zza zza = com.google.android.gms.internal.consent_sdk.zza.zza(activity);
        if (zza.zzb().canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed(null);
            return;
        }
        zza.zzd().zzc();
        zzbq zzc = zza.zzc();
        zzcz.zza();
        OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener = new OnConsentFormLoadSuccessListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbo
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                consentForm.show(activity, onConsentFormDismissedListener);
            }
        };
        Objects.requireNonNull(onConsentFormDismissedListener);
        zzc.zzb(onConsentFormLoadSuccessListener, new OnConsentFormLoadFailureListener() { // from class: com.google.android.gms.internal.consent_sdk.zzbp
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError) {
                ConsentForm.OnConsentFormDismissedListener.this.onConsentFormDismissed(formError);
            }
        }, true);
    }

    public static void loadConsentForm(Context context, OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        com.google.android.gms.internal.consent_sdk.zza zza = com.google.android.gms.internal.consent_sdk.zza.zza(context);
        ((Queue) zza.zzd().zzb.get()).add(Long.valueOf(System.currentTimeMillis()));
        zza.zzc().zzb(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, false);
    }

    public static void showPrivacyOptionsForm(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzc().zze(activity, onConsentFormDismissedListener);
    }
}
