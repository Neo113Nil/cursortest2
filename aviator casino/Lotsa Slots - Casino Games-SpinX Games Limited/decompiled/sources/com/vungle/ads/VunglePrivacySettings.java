package com.vungle.ads;

/* compiled from: VunglePrivacySettings.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0007J\u001a\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0013"}, d2 = {"Lcom/vungle/ads/VunglePrivacySettings;", "", "()V", "getCCPAStatus", "", "getCOPPAStatus", "getGDPRMessageVersion", "getGDPRSource", "getGDPRStatus", "getGDPRTimestamp", "", "setCCPAStatus", "", com.ironsource.K1.k, "", "setCOPPAStatus", "isUserCoppa", "setGDPRStatus", "consentMessageVersion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VunglePrivacySettings {
    public static final com.vungle.ads.VunglePrivacySettings INSTANCE = new com.vungle.ads.VunglePrivacySettings();

    private VunglePrivacySettings() {
    }

    @kotlin.jvm.JvmStatic
    public static final void setCOPPAStatus(boolean isUserCoppa) {
        com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.updateCoppaConsent(isUserCoppa);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getCOPPAStatus() {
        return com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getCoppaStatus().name();
    }

    @kotlin.jvm.JvmStatic
    public static final void setGDPRStatus(boolean optIn, java.lang.String consentMessageVersion) {
        java.lang.String value;
        if (optIn) {
            value = com.vungle.ads.internal.privacy.PrivacyConsent.OPT_IN.getValue();
        } else {
            value = com.vungle.ads.internal.privacy.PrivacyConsent.OPT_OUT.getValue();
        }
        com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.updateGdprConsent(value, com.ironsource.Gb.b, consentMessageVersion);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getGDPRStatus() {
        return com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getConsentStatus();
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getGDPRMessageVersion() {
        return com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getConsentMessageVersion();
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getGDPRSource() {
        return com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getConsentSource();
    }

    @kotlin.jvm.JvmStatic
    public static final long getGDPRTimestamp() {
        return com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getConsentTimestamp();
    }

    @kotlin.jvm.JvmStatic
    public static final void setCCPAStatus(boolean optIn) {
        com.vungle.ads.internal.privacy.PrivacyConsent privacyConsent;
        if (optIn) {
            privacyConsent = com.vungle.ads.internal.privacy.PrivacyConsent.OPT_IN;
        } else {
            privacyConsent = com.vungle.ads.internal.privacy.PrivacyConsent.OPT_OUT;
        }
        com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.updateCcpaConsent(privacyConsent);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getCCPAStatus() {
        return com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.getCcpaStatus();
    }
}
