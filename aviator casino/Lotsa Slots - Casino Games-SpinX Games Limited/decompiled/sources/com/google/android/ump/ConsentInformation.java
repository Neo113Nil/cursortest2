package com.google.android.ump;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public interface ConsentInformation {

    /* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ConsentStatus {
        public static final int NOT_REQUIRED = 1;
        public static final int OBTAINED = 3;
        public static final int REQUIRED = 2;
        public static final int UNKNOWN = 0;
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public interface OnConsentInfoUpdateFailureListener {
        void onConsentInfoUpdateFailure(com.google.android.ump.FormError formError);
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public interface OnConsentInfoUpdateSuccessListener {
        void onConsentInfoUpdateSuccess();
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
    public enum PrivacyOptionsRequirementStatus {
        UNKNOWN,
        NOT_REQUIRED,
        REQUIRED
    }

    boolean canRequestAds();

    int getConsentStatus();

    com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(android.app.Activity activity, com.google.android.ump.ConsentRequestParameters consentRequestParameters, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener);

    void reset();
}
