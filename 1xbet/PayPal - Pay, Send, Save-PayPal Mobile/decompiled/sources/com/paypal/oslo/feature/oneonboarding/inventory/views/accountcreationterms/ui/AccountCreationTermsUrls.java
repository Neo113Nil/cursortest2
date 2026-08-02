package com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/accountcreationterms/ui/AccountCreationTermsUrls;", "", "<init>", "()V", "", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "locale", "eSignConsent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "userAgreement", "privacyStatement", "p0", "p1", "p2", "getHighSpeedVideoSizes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountCreationTermsUrls {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsUrls INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsUrls();

    private AccountCreationTermsUrls() {
    }

    public final java.lang.String eSignConsent(java.lang.String country, java.lang.String locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        return getHighSpeedVideoSizes("https://www.paypal.com/us/webapps/mpp/ua/esign-full", country, locale);
    }

    public final java.lang.String userAgreement(java.lang.String country, java.lang.String locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        return getHighSpeedVideoSizes("https://www.paypal.com/us/webapps/mpp/ua/useragreement-full", country, locale);
    }

    public final java.lang.String privacyStatement(java.lang.String country, java.lang.String locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        return getHighSpeedVideoSizes(com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.PrivacyStatement, country, locale);
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String p0, java.lang.String p1, java.lang.String p2) {
        java.lang.String obj = android.net.Uri.parse(p0).buildUpon().appendQueryParameter("country.x", p1).appendQueryParameter("locale.x", p2).build().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
