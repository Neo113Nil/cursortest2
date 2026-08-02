package com.paypal.oslo.feature.inappcheckout.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "urlTemplate", "Ljava/lang/String;", "getUrlTemplate", "()Ljava/lang/String;", "titleResId", com.visa.cbp.getEncExpo.warmup, "getTitleResId", "()I", "source", "getSource", "E_SIGN_CONSENT", "PRIVACY_STATEMENT", "TERMS_AGREEMENTS", "PAYMENT_METHODS_POLICY", "CHECK_YOUR_ACCOUNT", "CONTACT_US"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InAppCheckoutLink {
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink CHECK_YOUR_ACCOUNT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink CONTACT_US;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink E_SIGN_CONSENT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink PAYMENT_METHODS_POLICY;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink PRIVACY_STATEMENT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink TERMS_AGREEMENTS;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String source;
    private final int titleResId;
    private final java.lang.String urlTemplate;

    private InAppCheckoutLink(java.lang.String str, int i, java.lang.String str2, int i2, java.lang.String str3) {
        this.urlTemplate = str2;
        this.titleResId = i2;
        this.source = str3;
    }

    public final java.lang.String getUrlTemplate() {
        return this.urlTemplate;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink = new com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink("E_SIGN_CONSENT", 0, "https://www.paypal.com/%s/legalhub/paypal/esign-full?locale.x=%s", com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_econsent_webview_title, "E-CONSENT");
        E_SIGN_CONSENT = inAppCheckoutLink;
        com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink2 = new com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink("PRIVACY_STATEMENT", 1, "https://www.paypal.com/%s/legalhub/privacy-full?locale.x=%s", com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_privacy_title, "PROFILE");
        PRIVACY_STATEMENT = inAppCheckoutLink2;
        com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink3 = new com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink("TERMS_AGREEMENTS", 2, "https://www.paypal.com/%s/legalhub/home?locale.x=%s", com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_terms_title, "PROFILE");
        TERMS_AGREEMENTS = inAppCheckoutLink3;
        com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink4 = new com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink("PAYMENT_METHODS_POLICY", 3, "https://www.paypal.com/%s/webapps/mpp/popup/about-payment-methods?locale.x=%s", com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_disclaimer_link_text, "POLICY");
        PAYMENT_METHODS_POLICY = inAppCheckoutLink4;
        com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink5 = new com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink("CHECK_YOUR_ACCOUNT", 4, "https://www.paypal.com/%s/home", com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_check_your_account, "BUYER_RESTRICTION");
        CHECK_YOUR_ACCOUNT = inAppCheckoutLink5;
        com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink6 = new com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink("CONTACT_US", 5, "https://www.paypal.com/%s/cshelp/personal", com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_contact_us, "BUYER_RESTRICTION");
        CONTACT_US = inAppCheckoutLink6;
        com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink[] inAppCheckoutLinkArr = {inAppCheckoutLink, inAppCheckoutLink2, inAppCheckoutLink3, inAppCheckoutLink4, inAppCheckoutLink5, inAppCheckoutLink6};
        getHighResolutionOutputSizeshNQ4ISI = inAppCheckoutLinkArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(inAppCheckoutLinkArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
