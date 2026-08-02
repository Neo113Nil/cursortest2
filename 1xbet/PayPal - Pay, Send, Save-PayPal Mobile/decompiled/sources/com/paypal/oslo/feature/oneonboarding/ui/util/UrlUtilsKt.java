package com.paypal.oslo.feature.oneonboarding.ui.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0014\u0010\n\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\b\"\u0014\u0010\f\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\b\"\u0014\u0010\r\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\b\"\u0014\u0010\u000e\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\b\"\u0014\u0010\u000f\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\b"}, d2 = {"", "url", "Landroid/content/Context;", "context", "", "launchUrlInBrowser", "(Ljava/lang/String;Landroid/content/Context;)V", "UrlProgramBanks", "Ljava/lang/String;", "UrlPaypalBalanceTerms", "UrlPaypalDebitMasterCard", "UrlBancorpPrivacy", "ECommunicationDeliveryPolicy", "CryptoTermsAndConditions", "PrivacyStatement", "StateDisclosure"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UrlUtilsKt {
    public static final java.lang.String CryptoTermsAndConditions = "https://www.paypal.com/us/webapps/mpp/ua/cryptocurrencies-tnc";
    public static final java.lang.String ECommunicationDeliveryPolicy = "https://www.paypal.com/us/webapps/mpp/ua/esign-full";
    public static final java.lang.String PrivacyStatement = "https://www.paypal.com/us/webapps/mpp/ua/privacy-full";
    public static final java.lang.String StateDisclosure = "https://www.paypal.com/us/legalhub/paypal/cryptocurrencies-tnc#state-disclosures";
    public static final java.lang.String UrlBancorpPrivacy = "https://www.paypal.com/us/webapps/mpp/ua/bancorp-privacy-notice";
    public static final java.lang.String UrlPaypalBalanceTerms = "https://www.paypal.com/us/webapps/mpp/ua/cashagreement-full?locale.x=en_US";
    public static final java.lang.String UrlPaypalDebitMasterCard = "https://www.paypal.com/us/webapps/mpp/ua/cashcard-agreement";
    public static final java.lang.String UrlProgramBanks = "https://www.paypal.com/us/legalhub/program-banks-tnc?locale.x=en_US";

    public static final void launchUrlInBrowser(java.lang.String str, android.content.Context context) {
        android.content.Intent intent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.net.Uri parse = android.net.Uri.parse(str);
        if (!kotlin.text.StringsKt.equals(parse.getScheme(), "https", true)) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.oneonboarding.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            java.lang.String scheme = parse.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            pairArr[0] = kotlin.TuplesKt.to("scheme", scheme);
            java.lang.String host = parse.getHost();
            pairArr[1] = kotlin.TuplesKt.to(com.datadog.android.log.LogAttributes.HOST, host != null ? host : "");
            com.paypal.android.logger.Logger.e$default(logger, "Invalid URL scheme - CryptoTerms URLs must use HTTPS. This indicates a configuration bug.", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
            return;
        }
        try {
            if (kotlin.text.StringsKt.endsWith(str, ".pdf", true)) {
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
                intent2.setDataAndType(parse, "application/pdf");
                intent2.setFlags(268435456);
                intent = android.content.Intent.createChooser(intent2, null);
            } else {
                intent = new android.content.Intent("android.intent.action.VIEW", parse);
            }
            context.startActivity(intent);
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.oneonboarding.LoggerKt.log;
            java.lang.String host2 = parse.getHost();
            com.paypal.android.logger.Logger.e$default(logger2, "Failed to open URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.log.LogAttributes.HOST, host2 != null ? host2 : "")), null, e, 4, null);
        }
    }
}
