package com.google.android.ump;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public interface ConsentForm {

    /* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(com.google.android.ump.FormError formError);
    }

    void show(android.app.Activity activity, com.google.android.ump.ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener);
}
