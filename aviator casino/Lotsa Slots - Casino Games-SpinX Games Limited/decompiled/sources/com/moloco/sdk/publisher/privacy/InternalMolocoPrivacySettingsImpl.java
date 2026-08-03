package com.moloco.sdk.publisher.privacy;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/moloco/sdk/publisher/privacy/InternalMolocoPrivacySettingsImpl;", "Lcom/moloco/sdk/publisher/privacy/InternalMolocoPrivacySettings;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getUpdatedPrivacySettings", "Lcom/moloco/sdk/publisher/privacy/MolocoPrivacy$PrivacySettings;", "privacySettings", "getTCFConsent", "", "gdprApplies", "", "(Landroid/content/Context;)Ljava/lang/Boolean;", "getUSPrivacyConsentString", "userSetUsPrivacy", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InternalMolocoPrivacySettingsImpl implements com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettings {
    public static final int $stable = 8;
    private final android.content.Context context;

    public InternalMolocoPrivacySettingsImpl(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final java.lang.Boolean gdprApplies(android.content.Context context) {
        java.lang.Boolean bool;
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        if (!defaultSharedPreferences.contains(com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES)) {
            return null;
        }
        try {
            int i = defaultSharedPreferences.getInt(com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES, 0);
            if (i == 0) {
                bool = java.lang.Boolean.FALSE;
            } else {
                if (i != 1) {
                    return null;
                }
                bool = java.lang.Boolean.TRUE;
            }
            return bool;
        } catch (java.lang.ClassCastException unused) {
            return java.lang.Boolean.valueOf(defaultSharedPreferences.getBoolean(com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES, false));
        }
    }

    private final java.lang.String getTCFConsent(android.content.Context context) {
        java.lang.String string = android.preference.PreferenceManager.getDefaultSharedPreferences(context).getString("IABTCF_TCString", null);
        if (string == null || kotlin.text.StringsKt.isBlank(string)) {
            return null;
        }
        return string;
    }

    private final java.lang.String getUSPrivacyConsentString(android.content.Context context, java.lang.String userSetUsPrivacy) {
        java.lang.String string = android.preference.PreferenceManager.getDefaultSharedPreferences(context).getString(com.google.ads.mediation.inmobi.InMobiNetworkKeys.IAB_US_PRIVACY_STRING, null);
        return (string == null || kotlin.text.StringsKt.isBlank(string)) ? userSetUsPrivacy : string;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    @Override // com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettings
    public com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings getUpdatedPrivacySettings(com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings privacySettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacySettings, "privacySettings");
        java.lang.Boolean gdprApplies = gdprApplies(this.context);
        if (gdprApplies == null) {
            gdprApplies = privacySettings.getIsUserConsent();
        }
        return new com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings(gdprApplies, privacySettings.getIsAgeRestrictedUser(), privacySettings.getIsDoNotSell(), getTCFConsent(this.context), getUSPrivacyConsentString(this.context, privacySettings.get_usPrivacy()));
    }
}
