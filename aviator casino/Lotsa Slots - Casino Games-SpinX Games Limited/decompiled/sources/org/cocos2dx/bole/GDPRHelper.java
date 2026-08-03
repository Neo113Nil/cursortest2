package org.cocos2dx.bole;

/* loaded from: classes6.dex */
public class GDPRHelper {
    private static final java.lang.String TAG = "CMP-UI";
    private static android.app.Activity activity = null;
    private static com.google.android.ump.ConsentInformation consentInformation = null;
    private static boolean iscmpinit = false;
    private static boolean iscmpopen = false;
    private static boolean iseu = false;

    public static void initcmp() {
    }

    public static void openConsentLayer() {
    }

    public static void setud(java.lang.String str, java.lang.String str2) {
    }

    public static void tryinitcmp() {
    }

    public static boolean isEUCountry() {
        try {
            return new java.util.HashSet(java.util.Arrays.asList("AT", "BE", "BG", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FR", "GR", "HR", "HU", "IE", com.ironsource.mediationsdk.utils.IronSourceConstants.INTERSTITIAL_EVENT_TYPE, "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK", "GB")).contains(java.util.Locale.getDefault().getCountry().toUpperCase());
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static void onCreate(android.app.Activity activity2) {
        org.cocos2dx.lib.Cocos2dxHelper.sActivity = activity2;
        activity = activity2;
        try {
            boolean isEUCountry = isEUCountry();
            iseu = isEUCountry;
            if (isEUCountry) {
                new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: org.cocos2dx.bole.GDPRHelper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            org.cocos2dx.bole.GDPRHelper.initump();
                        } catch (java.lang.Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, 1000L);
            }
            sendConsent();
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "checkFCMData: " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void sendConsent() {
        if (org.cocos2dx.lib.Cocos2dxHelper.getBoolForKey("consent_send", false)) {
            return;
        }
        java.util.EnumMap enumMap = new java.util.EnumMap(com.google.firebase.analytics.FirebaseAnalytics.ConsentType.class);
        enumMap.put((java.util.EnumMap) com.google.firebase.analytics.FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, (com.google.firebase.analytics.FirebaseAnalytics.ConsentType) com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus.GRANTED);
        enumMap.put((java.util.EnumMap) com.google.firebase.analytics.FirebaseAnalytics.ConsentType.AD_STORAGE, (com.google.firebase.analytics.FirebaseAnalytics.ConsentType) com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus.GRANTED);
        enumMap.put((java.util.EnumMap) com.google.firebase.analytics.FirebaseAnalytics.ConsentType.AD_USER_DATA, (com.google.firebase.analytics.FirebaseAnalytics.ConsentType) com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus.GRANTED);
        enumMap.put((java.util.EnumMap) com.google.firebase.analytics.FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, (com.google.firebase.analytics.FirebaseAnalytics.ConsentType) com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus.GRANTED);
        com.google.firebase.analytics.FirebaseAnalytics.getInstance(activity.getApplicationContext()).setConsent(enumMap);
        trackThirdPartySharing(iseu ? "1" : "0", com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus.GRANTED, com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus.GRANTED);
        org.cocos2dx.lib.Cocos2dxHelper.setBoolForKey("consent_send", true);
    }

    public static void initump() {
        if (!org.cocos2dx.lib.Cocos2dxHelper.getBoolForKey("gdpr_open", false) || consentInformation != null) {
            initcmp();
            return;
        }
        com.google.android.ump.ConsentRequestParameters.Builder tagForUnderAgeOfConsent = new com.google.android.ump.ConsentRequestParameters.Builder().setTagForUnderAgeOfConsent(false);
        com.google.android.ump.ConsentInformation consentInformation2 = com.google.android.ump.UserMessagingPlatform.getConsentInformation(activity);
        consentInformation = consentInformation2;
        consentInformation2.requestConsentInfoUpdate(activity, tagForUnderAgeOfConsent.build(), new com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: org.cocos2dx.bole.GDPRHelper$$ExternalSyntheticLambda0
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                com.google.android.ump.UserMessagingPlatform.loadAndShowConsentFormIfRequired(org.cocos2dx.bole.GDPRHelper.activity, new com.google.android.ump.ConsentForm.OnConsentFormDismissedListener() { // from class: org.cocos2dx.bole.GDPRHelper$$ExternalSyntheticLambda2
                    @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                    public final void onConsentFormDismissed(com.google.android.ump.FormError formError) {
                        org.cocos2dx.bole.GDPRHelper.lambda$initump$0(formError);
                    }
                });
            }
        }, new com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: org.cocos2dx.bole.GDPRHelper$$ExternalSyntheticLambda1
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public final void onConsentInfoUpdateFailure(com.google.android.ump.FormError formError) {
                org.cocos2dx.bole.GDPRHelper.initcmp();
            }
        });
    }

    static /* synthetic */ void lambda$initump$0(com.google.android.ump.FormError formError) {
        if (formError != null) {
            android.util.Log.w(TAG, java.lang.String.format("%s: %s", java.lang.Integer.valueOf(formError.getErrorCode()), formError.getMessage()));
        } else {
            android.util.Log.d(TAG, "Consent has been gathered. ");
        }
        initcmp();
    }

    public static boolean canRequestAds() {
        com.google.android.ump.ConsentInformation consentInformation2 = consentInformation;
        return consentInformation2 == null || consentInformation2.canRequestAds();
    }

    public static boolean isPrivacyOptionsRequired() {
        com.google.android.ump.ConsentInformation consentInformation2 = consentInformation;
        return consentInformation2 != null && consentInformation2.getPrivacyOptionsRequirementStatus() == com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
    }

    /* renamed from: org.cocos2dx.bole.GDPRHelper$2, reason: invalid class name */
    class AnonymousClass2 implements java.lang.Runnable {
        static /* synthetic */ void lambda$run$0(com.google.android.ump.FormError formError) {
        }

        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.google.android.ump.UserMessagingPlatform.showPrivacyOptionsForm(org.cocos2dx.bole.GDPRHelper.activity, new com.google.android.ump.ConsentForm.OnConsentFormDismissedListener() { // from class: org.cocos2dx.bole.GDPRHelper$2$$ExternalSyntheticLambda0
                @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                public final void onConsentFormDismissed(com.google.android.ump.FormError formError) {
                    org.cocos2dx.bole.GDPRHelper.AnonymousClass2.lambda$run$0(formError);
                }
            });
        }
    }

    public static void showPrivacyOptionsForm() {
        if (consentInformation != null) {
            activity.runOnUiThread(new org.cocos2dx.bole.GDPRHelper.AnonymousClass2());
        }
    }

    public static void trackThirdPartySharing(java.lang.String str, com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus consentStatus, com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus consentStatus2) {
        com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing = new com.adjust.sdk.AdjustThirdPartySharing(null);
        adjustThirdPartySharing.addGranularOption("google_dma", "eea", str);
        adjustThirdPartySharing.addGranularOption("google_dma", "ad_personalization", consentStatus == com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus.GRANTED ? "1" : "0");
        adjustThirdPartySharing.addGranularOption("google_dma", "ad_user_data", consentStatus2 != com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus.GRANTED ? "0" : "1");
        com.adjust.sdk.Adjust.trackThirdPartySharing(adjustThirdPartySharing);
    }
}
