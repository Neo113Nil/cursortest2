package com.paypal.oslo.app.deeplink;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\f\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000f\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/app/deeplink/DeeplinkParser;", "", "<init>", "()V", "", "url", "Lcom/paypal/oslo/app/deeplink/DeeplinkParser$ParseResult;", "parseUrl", "(Ljava/lang/String;)Lcom/paypal/oslo/app/deeplink/DeeplinkParser$ParseResult;", "Landroid/net/Uri;", "p0", "", "getHighSpeedVideoFpsRanges", "(Landroid/net/Uri;)Ljava/util/Map;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/text/Regex;", "getHighSpeedVideoSizes", "Lkotlin/text/Regex;", "Camera2StreamConfigurationMap", "ParseResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DeeplinkParser {
    public static final com.paypal.oslo.app.deeplink.DeeplinkParser INSTANCE = new com.paypal.oslo.app.deeplink.DeeplinkParser();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"source", "pp_ref_id", "pp_web_src", "pp_mob_src", com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Acquisition.DEFAULTS_KEY_REFERRER_UTM_SOURCE, com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Acquisition.DEFAULTS_KEY_REFERRER_UTM_MEDIUM, com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Acquisition.DEFAULTS_KEY_REFERRER_UTM_CAMPAIGN, "utm_unptid", com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Acquisition.DEFAULTS_KEY_REFERRER_UTM_TERM, com.adobe.marketing.mobile.internal.migration.MigrationConstants.V4.Acquisition.DEFAULTS_KEY_REFERRER_UTM_CONTENT, "mail", "page", "pgrp", "ppid", "campaign_id", "offer_id", "link_ref", "sfmc_id", "ccpg", "cnac", "rsta", "cust", "internal_user", "calc", "xt", "tenant_name", "unptid", "unp_tpcid", "appVersion", "ba_token", "mfid", "brc", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "source_app", "target_app", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "sessionUID", "uprt", "xoUpsell"});

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final kotlin.text.Regex getHighSpeedVideoFpsRanges = new kotlin.text.Regex("^/myaccount/activities/details/([^/]+)$");

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("^/invoice/payerView/details/([^/]+)$");

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex("^/myaccount/crypto/([^/]+)$");

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final kotlin.text.Regex getHighSpeedVideoSizes = new kotlin.text.Regex("^/mobile-app/loyalty-rewards/([^/]+)$");
    public static final int $stable = 8;

    private DeeplinkParser() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x179a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x17e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult parseUrl(java.lang.String url) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.lang.String str20;
        java.lang.String str21;
        java.lang.String str22;
        java.lang.String str23;
        java.lang.String str24;
        java.lang.String str25;
        java.lang.String str26;
        java.lang.String queryParameter;
        java.lang.String queryParameter2;
        java.lang.String str27;
        java.lang.String str28;
        java.lang.String str29;
        java.lang.String str30;
        java.lang.String str31;
        java.lang.String str32;
        java.lang.String str33;
        java.lang.String str34;
        java.lang.String str35;
        java.lang.String str36;
        java.lang.String str37;
        java.lang.String str38;
        java.lang.String str39;
        java.lang.String queryParameter3;
        java.lang.String queryParameter4;
        java.lang.String queryParameter5;
        java.lang.String queryParameter6;
        java.lang.String queryParameter7;
        java.lang.String str40;
        java.lang.String str41;
        java.lang.String str42;
        java.lang.String str43;
        java.lang.String str44;
        java.lang.String str45;
        java.lang.String str46;
        java.lang.String str47;
        java.lang.String queryParameter8;
        java.lang.String queryParameter9;
        java.lang.String str48;
        java.lang.String str49;
        java.lang.String str50;
        java.lang.String queryParameter10;
        java.lang.String queryParameter11;
        java.lang.String queryParameter12;
        java.lang.String queryParameter13;
        java.lang.String queryParameter14;
        java.lang.String queryParameter15;
        java.lang.String queryParameter16;
        java.lang.String queryParameter17;
        java.lang.String queryParameter18;
        kotlin.text.MatchResult matchEntire;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        android.net.Uri parse = android.net.Uri.parse(url);
        java.lang.String path = parse.getPath();
        if (path != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(parse);
            java.util.Map<java.lang.String, java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(parse);
            int hashCode = path.hashCode();
            java.lang.String str51 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_IS_SHIPMENT_AVAILABLE;
            java.lang.String str52 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_PAYMENT_TYPE;
            switch (hashCode) {
                case -2143039679:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals("/activity_details")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey((java.lang.String) null, parse.getQueryParameter("transactionId"), parse.getQueryParameter(str7), parse.getQueryParameter(str6), parse.getQueryParameter(str5), parse.getQueryParameter(str4), parse.getQueryParameter(str3), parse.getQueryParameter(str2), parse.getQueryParameter("source"), parse.getQueryParameter(str), parse.getQueryParameter(str10), parse.getQueryParameter(str12), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), highSpeedVideoFpsRanges);
                    }
                    java.lang.String str53 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53);
                    if (matchEntire == null) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey(matchEntire.getGroupValues().get(1), parse.getQueryParameter("transactionId"), parse.getQueryParameter(str7), parse.getQueryParameter(str6), parse.getQueryParameter(str5), parse.getQueryParameter(str4), parse.getQueryParameter(str3), parse.getQueryParameter(str2), parse.getQueryParameter("source"), parse.getQueryParameter(str), parse.getQueryParameter(str10), parse.getQueryParameter(str12)), highSpeedVideoFpsRanges);
                    }
                    kotlin.text.MatchResult matchEntire2 = getHighResolutionOutputSizeshNQ4ISI.matchEntire(str53);
                    if (matchEntire2 != null) {
                        java.lang.String str54 = matchEntire2.getGroupValues().get(1);
                        java.lang.String queryParameter19 = parse.getQueryParameter(str11);
                        if (queryParameter19 != null) {
                            return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination(str54, queryParameter19), highSpeedVideoFpsRanges);
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    kotlin.text.MatchResult matchEntire3 = Camera2StreamConfigurationMap.matchEntire(str53);
                    if (matchEntire3 != null) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoDetailsDestination(matchEntire3.getGroupValues().get(1)), highSpeedVideoFpsRanges);
                    }
                    kotlin.text.MatchResult matchEntire4 = getHighSpeedVideoSizes.matchEntire(str53);
                    if (matchEntire4 != null) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryEarnDestination(matchEntire4.getGroupValues().get(1), parse.getQueryParameter(str9), parse.getQueryParameter(str8)), highSpeedVideoFpsRanges);
                    }
                    return null;
                case -2142872130:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals("/myaccount/crypto")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoHubDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    java.lang.String str532 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532);
                    if (matchEntire == null) {
                    }
                    break;
                case -2141410463:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals("/myaccount/statements")) {
                        java.lang.String queryParameter20 = parse.getQueryParameter("source");
                        if (queryParameter20 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.StatementsAndTaxesDestination(queryParameter20), highSpeedVideoFpsRanges);
                    }
                    java.lang.String str5322 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322);
                    if (matchEntire == null) {
                    }
                    break;
                case -2131427310:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals("/helpcenter/showRecommendedList")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleListDestination(parse.getQueryParameter("src"), parse.getQueryParameter("productRefId"), parse.getQueryParameter("fieldRefId"), parse.getQueryParameter("pageRefId")), highSpeedVideoFpsRanges);
                    }
                    java.lang.String str53222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222);
                    if (matchEntire == null) {
                    }
                    break;
                case -2062525071:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals("/mobile-app/myaccount/crypto/onboarding")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoOnboardingDestination(parse.getQueryParameter("product")), highSpeedVideoFpsRanges);
                    }
                    java.lang.String str532222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222);
                    if (matchEntire == null) {
                    }
                    break;
                case -2013091134:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals("/myaccount/credit/cashback/payments/pay")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakePaymentDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    java.lang.String str5322222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1984156786:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals("/myaccount/transfer/payRequest")) {
                        java.lang.String queryParameter21 = parse.getQueryParameter("reference_data");
                        if (queryParameter21 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.p2p.api.navigation.PayRequestLandingDestination(queryParameter21, parse.getQueryParameter(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.REQUEST_ID_TYPE)), highSpeedVideoFpsRanges);
                    }
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str53222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1948309146:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.WebUrlConstants.PPCC_10_BACK_TERMS)) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination(path, parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str532222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1933135701:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals("/mobile-app/banking-bundle/standalone-landing")) {
                        java.lang.String queryParameter22 = parse.getQueryParameter("source");
                        if (queryParameter22 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.bankingbundle.api.navigation.StandaloneLandingDestination(queryParameter22, parse.getQueryParameter("skipSuccessParam")), highSpeedVideoFpsRanges);
                    }
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str5322222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1876576961:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals(com.paypal.oslo.feature.bnplservicing.api.navigation.DeeplinkPaths.PRE_QUAL_FAQ)) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.bnplservicing.api.navigation.PreQualDestination(parse.getQueryParameter("paylater_source")), highSpeedVideoFpsRanges);
                    }
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str53222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1875017714:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals("/myaccount/transfer/homepage/pay")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str8 = "trafficSource";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str532222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1864474887:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals("/myaccount/money/banks/confirmation")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink(parse.getQueryParameter("bankInstrumentId"), parse.getQueryParameter("action"), parse.getQueryParameter("lastNChars"), parse.getQueryParameter("accountType")), highSpeedVideoFpsRanges);
                    }
                    str8 = "trafficSource";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str5322222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1858862435:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals("/myaccount/credit/paypal-credit/us/autopay")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDeepLinkDestination(path), highSpeedVideoFpsRanges);
                    }
                    str8 = "trafficSource";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str53222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1858444486:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals("/revolvingcredit/card-activation")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier")), highSpeedVideoFpsRanges);
                    }
                    str8 = "trafficSource";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str532222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1847403510:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str13 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    if (path.equals("/mobile-app/loyalty-rewards/summary")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryEarnDestination((java.lang.String) null, parse.getQueryParameter("targetingUnitId"), parse.getQueryParameter("trafficSource"), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), highSpeedVideoFpsRanges);
                    }
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = str13;
                    str4 = str52;
                    java.lang.String str5322222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1840923176:
                    str14 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str15 = "transactionShortDescription";
                    str16 = str52;
                    str17 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/mobile-app/myaccount/activities/details")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey((java.lang.String) null, parse.getQueryParameter("transactionId"), parse.getQueryParameter(str7), parse.getQueryParameter(str6), parse.getQueryParameter(str5), parse.getQueryParameter(str16), parse.getQueryParameter(str15), parse.getQueryParameter(str2), parse.getQueryParameter("source"), parse.getQueryParameter(str), parse.getQueryParameter(str17), parse.getQueryParameter(str14), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str52 = str16;
                    str12 = str14;
                    str3 = str15;
                    str13 = str17;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = str13;
                    str4 = str52;
                    java.lang.String str53222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1839117153:
                    str14 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str15 = "transactionShortDescription";
                    str16 = str52;
                    str17 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/balance/get-started/tax-filing-bundle")) {
                        java.lang.String queryParameter23 = parse.getQueryParameter("entry_point");
                        if (queryParameter23 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.taxfiling.api.navigation.TaxFilingDestination(queryParameter23), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str52 = str16;
                    str12 = str14;
                    str3 = str15;
                    str13 = str17;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = str13;
                    str4 = str52;
                    java.lang.String str532222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1825791217:
                    str18 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str19 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str20 = "transactionShortDescription";
                    str4 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/savings/create")) {
                        java.lang.String queryParameter24 = parse.getQueryParameter("source");
                        if (queryParameter24 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.savings.api.navigation.SavingsDlCreateGoalDestination(queryParameter24), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str19;
                    str9 = "targetingUnitId";
                    str = str51;
                    str12 = str18;
                    str3 = str20;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str5322222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1805506060:
                    str18 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str19 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str20 = "transactionShortDescription";
                    str4 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/mobile-app/loyalty-rewards/earn")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryEarnDestination((java.lang.String) null, parse.getQueryParameter("targetingUnitId"), parse.getQueryParameter("trafficSource"), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str19;
                    str9 = "targetingUnitId";
                    str = str51;
                    str12 = str18;
                    str3 = str20;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str53222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1778641716:
                    str18 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str19 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str20 = "transactionShortDescription";
                    str4 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/activity")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey(parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_START_DATE), parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_END_DATE)), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str19;
                    str9 = "targetingUnitId";
                    str = str51;
                    str12 = str18;
                    str3 = str20;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str532222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1739648476:
                    str22 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str23 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str24 = "transactionShortDescription";
                    str25 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str26 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/transfer/homepage/external/international")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str6 = str26;
                    str11 = "entrypoint";
                    str9 = "targetingUnitId";
                    str4 = str25;
                    str = str51;
                    str12 = str22;
                    str2 = str23;
                    str8 = "trafficSource";
                    str3 = str24;
                    str10 = str21;
                    java.lang.String str5322222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1725445938:
                    str22 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str23 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str24 = "transactionShortDescription";
                    str25 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str26 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/mobile-app/paylater/pay-later-hub")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.bnplservicing.api.navigation.PayLaterHubDestination(parse.getQueryParameter("paylater_source")), highSpeedVideoFpsRanges);
                    }
                    str6 = str26;
                    str11 = "entrypoint";
                    str9 = "targetingUnitId";
                    str4 = str25;
                    str = str51;
                    str12 = str22;
                    str2 = str23;
                    str8 = "trafficSource";
                    str3 = str24;
                    str10 = str21;
                    java.lang.String str53222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1563595301:
                    str22 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str23 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str24 = "transactionShortDescription";
                    str25 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str26 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/revolvingcredit_acquisition_decline")) {
                        java.lang.String queryParameter25 = parse.getQueryParameter("creditProductIdentifier");
                        if (queryParameter25 == null || (queryParameter = parse.getQueryParameter("url")) == null || (queryParameter2 = parse.getQueryParameter("source")) == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline(queryParameter25, queryParameter, queryParameter2), highSpeedVideoFpsRanges);
                    }
                    str6 = str26;
                    str11 = "entrypoint";
                    str9 = "targetingUnitId";
                    str4 = str25;
                    str = str51;
                    str12 = str22;
                    str2 = str23;
                    str8 = "trafficSource";
                    str3 = str24;
                    str10 = str21;
                    java.lang.String str532222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1535342753:
                    str27 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str28 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str29 = "transactionShortDescription";
                    str30 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str31 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/statements/monthly")) {
                        java.lang.String queryParameter26 = parse.getQueryParameter("source");
                        if (queryParameter26 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.AllTransactionsDestination(queryParameter26), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str28;
                    str9 = "targetingUnitId";
                    str4 = str30;
                    str12 = str27;
                    str3 = str29;
                    str6 = str31;
                    str = str51;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str5322222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1498898699:
                    str27 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str28 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str29 = "transactionShortDescription";
                    str30 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str31 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/transfer/homepage/request")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str28;
                    str9 = "targetingUnitId";
                    str4 = str30;
                    str12 = str27;
                    str3 = str29;
                    str6 = str31;
                    str = str51;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str53222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1493768386:
                    str27 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str28 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str29 = "transactionShortDescription";
                    str30 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str31 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/mobile-app/post-onboarding")) {
                        java.lang.String queryParameter27 = parse.getQueryParameter(com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID);
                        if (queryParameter27 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkLauncher(queryParameter27), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str28;
                    str9 = "targetingUnitId";
                    str4 = str30;
                    str12 = str27;
                    str3 = str29;
                    str6 = str31;
                    str = str51;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str532222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1473533231:
                    str27 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str28 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str29 = "transactionShortDescription";
                    str30 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str31 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/crypto/recurring-purchases")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoRecurringPurchasesDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str28;
                    str9 = "targetingUnitId";
                    str4 = str30;
                    str12 = str27;
                    str3 = str29;
                    str6 = str31;
                    str = str51;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str5322222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1371137686:
                    str27 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str28 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str29 = "transactionShortDescription";
                    str30 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str31 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/revolvingcredit_servicing_request_virtual_card")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestVirtualCardDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier")), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str28;
                    str9 = "targetingUnitId";
                    str4 = str30;
                    str12 = str27;
                    str3 = str29;
                    str6 = str31;
                    str = str51;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str53222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1338313510:
                    str27 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str28 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str29 = "transactionShortDescription";
                    str30 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str31 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/idapps/connect/mobile")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.identity.api.navigation.InboundConnectDestination(parse.getQueryParameter(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CLIENT_ID_KEY), parse.getQueryParameter(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY), parse.getQueryParameter("redirect_uri"), parse.getQueryParameter("state"), parse.getQueryParameter(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.METADATA_ID_KEY), parse.getQueryParameter(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CODE_CHALLENGE_METHOD_KEY), parse.getQueryParameter(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CODE_CHALLENGE_KEY)), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str28;
                    str9 = "targetingUnitId";
                    str4 = str30;
                    str12 = str27;
                    str3 = str29;
                    str6 = str31;
                    str = str51;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str532222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1282869067:
                    str27 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str28 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str29 = "transactionShortDescription";
                    str30 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str31 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/credit/paypal-credit/us/repayments-summary")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.PaymentSummaryDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str28;
                    str9 = "targetingUnitId";
                    str4 = str30;
                    str12 = str27;
                    str3 = str29;
                    str6 = str31;
                    str = str51;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str5322222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1255560913:
                    str27 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str32 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str29 = "transactionShortDescription";
                    str30 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str33 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str31 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/mobile-app/shopping/offer-education-details")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryEarnDestination((java.lang.String) null, parse.getQueryParameter("targetingUnitId"), parse.getQueryParameter("trafficSource"), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str32;
                    str9 = "targetingUnitId";
                    str5 = str33;
                    str4 = str30;
                    str12 = str27;
                    str3 = str29;
                    str6 = str31;
                    str = str51;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str53222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1231530105:
                    str27 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str32 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str29 = "transactionShortDescription";
                    str30 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str33 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str31 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/credit/rewards-card/repayments/autopay")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDeepLinkDestination(path), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str32;
                    str9 = "targetingUnitId";
                    str5 = str33;
                    str4 = str30;
                    str12 = str27;
                    str3 = str29;
                    str6 = str31;
                    str = str51;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str532222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1227864516:
                    str27 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str32 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str29 = "transactionShortDescription";
                    str30 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str33 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str31 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/transfer/pay-request/preview")) {
                        java.lang.String queryParameter28 = parse.getQueryParameter("reference_data");
                        if (queryParameter28 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.p2p.api.navigation.PayRequestLandingDestination(queryParameter28, parse.getQueryParameter(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.REQUEST_ID_TYPE)), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str32;
                    str9 = "targetingUnitId";
                    str5 = str33;
                    str4 = str30;
                    str12 = str27;
                    str3 = str29;
                    str6 = str31;
                    str = str51;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str5322222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1218554575:
                    str27 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str32 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str29 = "transactionShortDescription";
                    str30 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str33 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str31 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/mobile-app/subscriptions/hub/saved-businesses")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.subscriptions.api.navigation.BusinessesHubDestination(parse.getQueryParameter(com.paypal.oslo.feature.subscriptions.api.navigation.DeeplinkParams.TRAFFIC_SOURCE)), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str32;
                    str9 = "targetingUnitId";
                    str5 = str33;
                    str4 = str30;
                    str12 = str27;
                    str3 = str29;
                    str6 = str31;
                    str = str51;
                    str8 = "trafficSource";
                    str10 = str21;
                    java.lang.String str53222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1202795805:
                    str34 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str35 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str36 = "transactionShortDescription";
                    str37 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str38 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str39 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/revolvingcredit_servicing_autopay")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDeepLinkDestination(path), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str35;
                    str9 = "targetingUnitId";
                    str4 = str37;
                    str6 = str39;
                    str = str51;
                    str12 = str34;
                    str3 = str36;
                    str8 = "trafficSource";
                    str5 = str38;
                    str10 = str21;
                    java.lang.String str532222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1179050148:
                    str34 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str35 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str36 = "transactionShortDescription";
                    str37 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str38 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str39 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/savings")) {
                        java.lang.String queryParameter29 = parse.getQueryParameter("entrypoint");
                        if (queryParameter29 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.savings.api.navigation.SavingsDlHubDestination(queryParameter29), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str35;
                    str9 = "targetingUnitId";
                    str4 = str37;
                    str6 = str39;
                    str = str51;
                    str12 = str34;
                    str3 = str36;
                    str8 = "trafficSource";
                    str5 = str38;
                    str10 = str21;
                    java.lang.String str5322222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1154915178:
                    str34 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str35 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str36 = "transactionShortDescription";
                    str37 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str38 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str39 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/helpcenter/showEducationCenter")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.helpcenter.api.navigation.EducationalSheetDestination(parse.getQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_POLICY_NAME), parse.getQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_ATTEMPT_INTENTION), parse.getQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_INVOCATION_PAGE), parse.getQueryParameter("ppFlow"), parse.getQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_SHOW_CONTEXTUAL_MESSAGE), parse.getQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_SHOW_ACKNOWLEDGEMENT_SCREEN)), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str35;
                    str9 = "targetingUnitId";
                    str4 = str37;
                    str6 = str39;
                    str = str51;
                    str12 = str34;
                    str3 = str36;
                    str8 = "trafficSource";
                    str5 = str38;
                    str10 = str21;
                    java.lang.String str53222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1153692338:
                    str34 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str35 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str36 = "transactionShortDescription";
                    str37 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str38 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str39 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/mobile-app/loyalty-rewards/celebration")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryEarnDestination((java.lang.String) null, parse.getQueryParameter("targetingUnitId"), parse.getQueryParameter("trafficSource"), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str35;
                    str9 = "targetingUnitId";
                    str4 = str37;
                    str6 = str39;
                    str = str51;
                    str12 = str34;
                    str3 = str36;
                    str8 = "trafficSource";
                    str5 = str38;
                    str10 = str21;
                    java.lang.String str532222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1114166585:
                    str34 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str35 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str36 = "transactionShortDescription";
                    str37 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str38 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str39 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/money/flow/partner/accounts/link")) {
                        java.lang.String queryParameter30 = parse.getQueryParameter("clientId");
                        if (queryParameter30 == null || (queryParameter3 = parse.getQueryParameter(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY)) == null || (queryParameter4 = parse.getQueryParameter("authClaim")) == null || (queryParameter5 = parse.getQueryParameter("redirectUri")) == null || (queryParameter6 = parse.getQueryParameter("state")) == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.wallet.api.navigation.PartnerInitiatedP3Flow(queryParameter30, queryParameter3, queryParameter4, queryParameter5, queryParameter6), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str35;
                    str9 = "targetingUnitId";
                    str4 = str37;
                    str6 = str39;
                    str = str51;
                    str12 = str34;
                    str3 = str36;
                    str8 = "trafficSource";
                    str5 = str38;
                    str10 = str21;
                    java.lang.String str5322222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1080633481:
                    str34 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str35 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str36 = "transactionShortDescription";
                    str37 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str38 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str39 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.WebUrlConstants.PPCC_DUAL_TERMS)) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination(path, parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str35;
                    str9 = "targetingUnitId";
                    str4 = str37;
                    str6 = str39;
                    str = str51;
                    str12 = str34;
                    str3 = str36;
                    str8 = "trafficSource";
                    str5 = str38;
                    str10 = str21;
                    java.lang.String str53222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1080037733:
                    str34 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str35 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str36 = "transactionShortDescription";
                    str37 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str38 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str39 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/mobile-app/subscriptions/bulk-fi")) {
                        java.lang.String queryParameter31 = parse.getQueryParameter(com.paypal.oslo.feature.subscriptions.api.navigation.DeeplinkParams.FLOW_TYPE);
                        if (queryParameter31 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination(queryParameter31, parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str35;
                    str9 = "targetingUnitId";
                    str4 = str37;
                    str6 = str39;
                    str = str51;
                    str12 = str34;
                    str3 = str36;
                    str8 = "trafficSource";
                    str5 = str38;
                    str10 = str21;
                    java.lang.String str532222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1060805465:
                    str34 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str35 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str36 = "transactionShortDescription";
                    str37 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str38 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str39 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.WebUrlConstants.PPCC_20_BACK_TERMS)) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination(path, parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str35;
                    str9 = "targetingUnitId";
                    str4 = str37;
                    str6 = str39;
                    str = str51;
                    str12 = str34;
                    str3 = str36;
                    str8 = "trafficSource";
                    str5 = str38;
                    str10 = str21;
                    java.lang.String str5322222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1028848731:
                    str34 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str35 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str36 = "transactionShortDescription";
                    str37 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str38 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str39 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/mobile-app/myaccount/activities")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey(parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_START_DATE), parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_END_DATE)), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str35;
                    str9 = "targetingUnitId";
                    str4 = str37;
                    str6 = str39;
                    str = str51;
                    str12 = str34;
                    str3 = str36;
                    str8 = "trafficSource";
                    str5 = str38;
                    str10 = str21;
                    java.lang.String str53222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1008529596:
                    str34 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str35 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str36 = "transactionShortDescription";
                    str37 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str38 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str39 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/cgp/welcome-back")) {
                        java.lang.String queryParameter32 = parse.getQueryParameter("em");
                        if (queryParameter32 == null || (queryParameter7 = parse.getQueryParameter("cc")) == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.onboarding.api.navigation.WelcomeBackDeepLinkLauncher(queryParameter32, queryParameter7), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str35;
                    str9 = "targetingUnitId";
                    str4 = str37;
                    str6 = str39;
                    str = str51;
                    str12 = str34;
                    str3 = str36;
                    str8 = "trafficSource";
                    str5 = str38;
                    str10 = str21;
                    java.lang.String str532222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -884317729:
                    str34 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str35 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str36 = "transactionShortDescription";
                    str37 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str38 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str39 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/statements/custom")) {
                        java.lang.String queryParameter33 = parse.getQueryParameter("source");
                        if (queryParameter33 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDestination(queryParameter33), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str35;
                    str9 = "targetingUnitId";
                    str4 = str37;
                    str6 = str39;
                    str = str51;
                    str12 = str34;
                    str3 = str36;
                    str8 = "trafficSource";
                    str5 = str38;
                    str10 = str21;
                    java.lang.String str5322222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -837253555:
                    str34 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str35 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str36 = "transactionShortDescription";
                    str37 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str38 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str39 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/mobile-app/notification-center")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.notificationcenter.api.navigation.NotificationCenterDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str35;
                    str9 = "targetingUnitId";
                    str4 = str37;
                    str6 = str39;
                    str = str51;
                    str12 = str34;
                    str3 = str36;
                    str8 = "trafficSource";
                    str5 = str38;
                    str10 = str21;
                    java.lang.String str53222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -814733586:
                    str34 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str35 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str36 = "transactionShortDescription";
                    str37 = str52;
                    str21 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str38 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str39 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals(com.paypal.oslo.feature.bnplservicing.api.navigation.DeeplinkPaths.MAKE_A_PAYMENT)) {
                        java.lang.String queryParameter34 = parse.getQueryParameter(com.paypal.oslo.feature.bnplservicing.api.navigation.DeeplinkParams.PLAN_ID);
                        if (queryParameter34 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.bnplservicing.navigation.MakeAPaymentDestination(queryParameter34, parse.getQueryParameter("paylater_source")), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str35;
                    str9 = "targetingUnitId";
                    str4 = str37;
                    str6 = str39;
                    str = str51;
                    str12 = str34;
                    str3 = str36;
                    str8 = "trafficSource";
                    str5 = str38;
                    str10 = str21;
                    java.lang.String str532222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -803730084:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str41 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str42 = "transactionShortDescription";
                    str43 = str52;
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/activities")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey(parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_START_DATE), parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_END_DATE)), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str5322222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -801297044:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str41 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str42 = "transactionShortDescription";
                    str47 = str52;
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/savings/auto-save/manage")) {
                        java.lang.String queryParameter35 = parse.getQueryParameter("source");
                        if (queryParameter35 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.savings.api.navigation.SavingsDlAutoSaveDestination(queryParameter35, parse.getQueryParameter("moneyboxid"), parse.getQueryParameter("settingId")), highSpeedVideoFpsRanges);
                    }
                    str43 = str47;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str53222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -782760699:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str41 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str42 = "transactionShortDescription";
                    str47 = str52;
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/revolvingcredit_acquisition_credit_application")) {
                        java.lang.String queryParameter36 = parse.getQueryParameter("creditProductIdentifier");
                        if (queryParameter36 == null || (queryParameter8 = parse.getQueryParameter("url")) == null || (queryParameter9 = parse.getQueryParameter("source")) == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication(queryParameter36, queryParameter8, queryParameter9), highSpeedVideoFpsRanges);
                    }
                    str43 = str47;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str532222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -755368994:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str41 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str42 = "transactionShortDescription";
                    str43 = str52;
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/revolvingcredit_servicing_account_summary")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str5322222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -706980802:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str42 = "transactionShortDescription";
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/activity")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey(parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_START_DATE), parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_END_DATE)), highSpeedVideoFpsRanges);
                    }
                    str41 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str47 = str52;
                    str43 = str47;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str53222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -704291922:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str48 = str51;
                    str49 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str43 = str52;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/revolvingcredit_servicing_set_preferred")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SetPreferredDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier")), highSpeedVideoFpsRanges);
                    }
                    str51 = str48;
                    str41 = str49;
                    str42 = "transactionShortDescription";
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str532222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -699028715:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str48 = str51;
                    str49 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str43 = str52;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/ppcredit/redirect")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.LegacyServicingRedirectDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("redirectUrlKey")), highSpeedVideoFpsRanges);
                    }
                    str51 = str48;
                    str41 = str49;
                    str42 = "transactionShortDescription";
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -688637322:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str48 = str51;
                    str49 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str43 = str52;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/identity_unified_alerts")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.identity.api.navigation.UnifiedAlertDeeplinkDestination(parse.getQueryParameter("doc_id"), parse.getQueryParameter("cust_id"), parse.getQueryParameter("alert_sub_type"), parse.getQueryParameter("expiry_time"), parse.getQueryParameter("af_corr_id")), highSpeedVideoFpsRanges);
                    }
                    str51 = str48;
                    str41 = str49;
                    str42 = "transactionShortDescription";
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -619296749:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str48 = str51;
                    str49 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str43 = str52;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/credit/paypal-credit/us")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str51 = str48;
                    str41 = str49;
                    str42 = "transactionShortDescription";
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -617426201:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str48 = str51;
                    str49 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str43 = str52;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/balance/auto-reload")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.balance.api.navigation.AutoReloadDestination(parse.getQueryParameter("source"), parse.getQueryParameter("flow_intent"), parse.getQueryParameter("entry_point"), path, parse.getQueryParameter("xSellAmount"), parse.getQueryParameter("xSellCurrencyCode"), parse.getQueryParameter("xSellTransferSpeed")), highSpeedVideoFpsRanges);
                    }
                    str51 = str48;
                    str41 = str49;
                    str42 = "transactionShortDescription";
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -610435997:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str50 = str51;
                    str49 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str43 = str52;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityPaypalDeepLinks.KEY_PATH_ADD_DEEP_LINK_TAX_ID)) {
                        java.lang.String queryParameter37 = parse.getQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_POLICY_NAME);
                        java.lang.String queryParameter38 = parse.getQueryParameter("encryptedProcessId");
                        java.lang.String queryParameter39 = parse.getQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_ATTEMPT_INTENTION);
                        if (queryParameter39 == null || (queryParameter10 = parse.getQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_INVOCATION_PAGE)) == null || (queryParameter11 = parse.getQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_SHOW_ACKNOWLEDGEMENT_SCREEN)) == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination(queryParameter37, queryParameter38, queryParameter39, queryParameter10, queryParameter11, parse.getQueryParameter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_SHOW_CONTEXTUAL_MESSAGE), parse.getQueryParameter("ppFlow")), highSpeedVideoFpsRanges);
                    }
                    str51 = str50;
                    str41 = str49;
                    str42 = "transactionShortDescription";
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -547888326:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str50 = str51;
                    str49 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str43 = str52;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals(com.paypal.oslo.feature.packagetracking.api.navigation.PackageTrackingNavigationConstants.PACKAGE_DETAIL_DEEPLINK)) {
                        java.lang.String queryParameter40 = parse.getQueryParameter("source");
                        java.lang.String queryParameter41 = parse.getQueryParameter("trackingNumber");
                        if (queryParameter41 == null || (queryParameter12 = parse.getQueryParameter("carrierCode")) == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination(queryParameter40, queryParameter41, queryParameter12, parse.getQueryParameter("transactionNumber")), highSpeedVideoFpsRanges);
                    }
                    str51 = str50;
                    str41 = str49;
                    str42 = "transactionShortDescription";
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -490577947:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str50 = str51;
                    str49 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str43 = str52;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/revolvingcredit_servicing_financial_plans_summary")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SpecialFinancingDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str51 = str50;
                    str41 = str49;
                    str42 = "transactionShortDescription";
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -407825006:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str50 = str51;
                    str49 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str43 = str52;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/credit/rewards-card")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str51 = str50;
                    str41 = str49;
                    str42 = "transactionShortDescription";
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -402542382:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str50 = str51;
                    str49 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str43 = str52;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/myaccount/transfer/request/external")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str51 = str50;
                    str41 = str49;
                    str42 = "transactionShortDescription";
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -379493205:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str50 = str51;
                    str49 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str43 = str52;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/revolvingcredit_servicing_make_payment")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakePaymentDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str51 = str50;
                    str41 = str49;
                    str42 = "transactionShortDescription";
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -350193713:
                    str40 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    str43 = str52;
                    str45 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str46 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    if (path.equals("/mobile-app/rewardscenter")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryEarnDestination((java.lang.String) null, parse.getQueryParameter("targetingUnitId"), parse.getQueryParameter("trafficSource"), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), highSpeedVideoFpsRanges);
                    }
                    str51 = str51;
                    str44 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str41 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str42 = "transactionShortDescription";
                    str11 = "entrypoint";
                    str2 = str41;
                    str52 = str43;
                    str6 = str46;
                    str = str51;
                    str12 = str40;
                    str3 = str42;
                    str5 = str45;
                    str8 = "trafficSource";
                    str10 = str44;
                    str9 = "targetingUnitId";
                    str4 = str52;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -338819171:
                    if (path.equals("/myaccount/activities/details")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey((java.lang.String) null, parse.getQueryParameter("transactionId"), parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID), parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID), parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE), parse.getQueryParameter(str52), parse.getQueryParameter("transactionShortDescription"), parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE), parse.getQueryParameter("source"), parse.getQueryParameter(str51), parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID), parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), highSpeedVideoFpsRanges);
                    }
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -273008659:
                    if (path.equals(com.paypal.oslo.feature.taptopay.api.navigation.TapToPayDeeplinks.PAY_MODE)) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.taptopay.api.navigation.PayModeRouterDestination(parse.getQueryParameter("source"), parse.getQueryParameter(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW), parse.getQueryParameter("card_id")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -229880160:
                    if (path.equals("/revolvingcredit_servicing_statement_summary")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.StatementHubDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -201913892:
                    if (path.equals("/myaccount/credit/paypal-credit/us/repayments")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakePaymentDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -183034456:
                    if (path.equals("/myaccount/credit/cashback/rewards")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RewardsDeepLinkDestination(path), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -173332739:
                    if (path.equals("/myaccount/credit/rewards-card/repayments")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.MakePaymentDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -172210245:
                    if (path.equals("/credit-application/paypal-credit-card/da/us/billing")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling(path, parse.getQueryParameter("track"), parse.getQueryParameter("present"), parse.getQueryParameter("t"), parse.getQueryParameter("p")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -153012639:
                    if (path.equals("/myaccount/credit/cashback/manage")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.ManageAccountDeepLinkDestination(path), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -135861786:
                    if (path.equals("/myaccount/savings/goal")) {
                        java.lang.String queryParameter42 = parse.getQueryParameter("entrypoint");
                        if (queryParameter42 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.savings.api.navigation.SavingsDeepLinkGoalDetailsDestination(queryParameter42, parse.getQueryParameter("moneyboxid")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -114532521:
                    if (path.equals(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.WebUrlConstants.PPCC_APPLICATION_URL)) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication(path, parse.getQueryParameter("track"), parse.getQueryParameter("present"), parse.getQueryParameter("t"), parse.getQueryParameter("p")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -78135328:
                    if (path.equals("/myaccount/credit/cashback/statements")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.StatementHubDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case -1718630:
                    if (path.equals("/profile")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.settings.api.navigation.SettingsDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 87474114:
                    if (path.equals("/mobile-app/loyalty-rewards/enroll")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryEarnDestination((java.lang.String) null, parse.getQueryParameter("targetingUnitId"), parse.getQueryParameter("trafficSource"), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 103124115:
                    if (path.equals("/myaccount/credit/cashback")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AccountSummaryDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 122282602:
                    if (path.equals("/myaccount/activities")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey(parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_START_DATE), parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_END_DATE)), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 208022410:
                    if (path.equals("/revolvingcredit_acquisition_document_upload")) {
                        java.lang.String queryParameter43 = parse.getQueryParameter("creditProductIdentifier");
                        if (queryParameter43 == null || (queryParameter13 = parse.getQueryParameter("url")) == null || (queryParameter14 = parse.getQueryParameter("source")) == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload(queryParameter43, queryParameter13, queryParameter14), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 234108187:
                    if (path.equals("/mobile-app/shopping/debit-category-selection")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.shoppingrewards.api.rewards.category.navigation.CategorySelectionDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 243161385:
                    if (path.equals("/myaccount/credit/cashback/payments")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.PaymentSummaryDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 295411084:
                    if (path.equals("/mobile-app/banking-hub/auto-reload")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.balance.api.navigation.AutoReloadDestination(parse.getQueryParameter("source"), parse.getQueryParameter("flow_intent"), parse.getQueryParameter("entry_point"), path, parse.getQueryParameter("xSellAmount"), parse.getQueryParameter("xSellCurrencyCode"), parse.getQueryParameter("xSellTransferSpeed")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 325887861:
                    if (path.equals("/revolvingcredit_servicing_card_requested")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardRequestedDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 335552370:
                    if (path.equals("/mobile-app/paylater/pl2go/tap-to-pay")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.bnplacquisition.navigation.AcquisitionDeepLinkEntryDestination(parse.getQueryParameter("paylater_source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 336853103:
                    if (path.equals("/helpcenter/showArticle")) {
                        java.lang.String queryParameter44 = parse.getQueryParameter("articleId");
                        if (queryParameter44 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleDetailsDestination(queryParameter44), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 337696821:
                    if (path.equals("/balance/auto-reload")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.balance.api.navigation.AutoReloadDestination(parse.getQueryParameter("source"), parse.getQueryParameter("flow_intent"), parse.getQueryParameter("entry_point"), path, parse.getQueryParameter("xSellAmount"), parse.getQueryParameter("xSellCurrencyCode"), parse.getQueryParameter("xSellTransferSpeed")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 341761945:
                    if (path.equals("/myaccount/savings/transfer-to-savings/")) {
                        java.lang.String queryParameter45 = parse.getQueryParameter("source");
                        if (queryParameter45 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.savings.api.navigation.SavingsDlTransferToSavingsDestination(queryParameter45), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 347683591:
                    if (path.equals("/myaccount/credit/paypal-credit/us/special-financing")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.SpecialFinancingDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 381910197:
                    if (path.equals("/myaccount/debitcards/link")) {
                        java.lang.String queryParameter46 = parse.getQueryParameter(com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME);
                        if (queryParameter46 == null || (queryParameter15 = parse.getQueryParameter(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW)) == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.debitcard.api.navigation.DebitCardDeepLinkLauncher(queryParameter46, queryParameter15, parse.getQueryParameter("cardId"), parse.getQueryParameter("intent"), parse.getQueryParameter("entrypoint")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 431944914:
                    if (path.equals(com.paypal.oslo.feature.taptopay.api.navigation.TapToPayDeeplinks.SET_AS_DEFAULT)) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.taptopay.api.navigation.SetAsDefaultRouterDestination(parse.getQueryParameter("source"), parse.getQueryParameter(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW)), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 444681486:
                    if (path.equals(com.paypal.oslo.core.pushnotification.deeplink.OpenWebDeeplinkNormalizer.OPEN_WEB_PATH)) {
                        java.lang.String queryParameter47 = parse.getQueryParameter("url");
                        if (queryParameter47 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination(queryParameter47, parse.getQueryParameter("type"), parse.getQueryParameter("title"), parse.getQueryParameter("source"), parse.getQueryParameter("authentication_required")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 450914488:
                    if (path.equals("/mobile-app/loyalty-rewards/redeem")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryRedeemDestination(parse.getQueryParameter("trafficSource")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 509988947:
                    if (path.equals("/myaccount/crypto/quick/buy")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoQuickBuyDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 511738467:
                    if (path.equals("/myaccount/money/accounts/new")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.wallet.api.navigation.AddFIDeepLink.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 512960094:
                    if (path.equals("/mobile-app/subscriptions/link-businesses")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.subscriptions.api.navigation.LinkBusinessesDestination(parse.getQueryParameter(com.paypal.oslo.feature.subscriptions.api.navigation.DeeplinkParams.TRAFFIC_SOURCE)), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 558848481:
                    if (path.equals("/myaccount/transfer/request/preview")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 562294707:
                    if (path.equals("/mobile-app/subscriptions/hub/subsmanagement")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination(parse.getQueryParameter(com.paypal.oslo.feature.subscriptions.api.navigation.DeeplinkParams.TRAFFIC_SOURCE)), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 581881697:
                    if (path.equals("/myaccount/money/cards/update")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.wallet.api.navigation.CardDetailDeepLink(parse.getQueryParameter("cardId")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 582125377:
                    if (path.equals("/myaccount/credit/paypal-credit/us/manage-account")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.ManageAccountDeepLinkDestination(path), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 635215283:
                    if (path.equals("/myaccount/credit/cashback/payments/autopay")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.AutopayDeepLinkDestination(path), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 636703411:
                    if (path.equals("/moneyOnHoldDetails")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.balance.api.navigation.BalanceOnHoldDetailsRouterDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 650459047:
                    if (path.equals("/myaccount/credit/rewards-card/rewards")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RewardsDeepLinkDestination(path), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 699009984:
                    if (path.equals("/mobile-app/wallet/bank-oauth-callback")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.wallet.api.navigation.BankOAuthCallbackDestination(parse.getQueryParameter("aggregatorName"), parse.getQueryParameter("externalBankId"), parse.getQueryParameter("countryCode"), parse.getQueryParameter(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY), parse.getQueryParameter("bankName"), parse.getQueryParameter("code"), parse.getQueryParameter("state"), parse.getQueryParameter("error"), parse.getQueryParameter("errorDescription")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 788176149:
                    if (path.equals(com.paypal.oslo.feature.bnplservicing.api.navigation.DeeplinkPaths.PLAN_LIST)) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.bnplservicing.navigation.PlanListDestination(parse.getQueryParameter("paylater_source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 826350195:
                    if (path.equals("/mobile-app/loyalty-rewards")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryEarnDestination((java.lang.String) null, parse.getQueryParameter("targetingUnitId"), parse.getQueryParameter("trafficSource"), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 928885158:
                    if (path.equals("/revolvingcredit_servicing_activate_card")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CardActivationDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 933542988:
                    if (path.equals("/myaccount/profile")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.settings.api.navigation.SettingsDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1001402648:
                    if (path.equals(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.WebUrlConstants.CBMC_APPLICATION_URL)) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication(path, parse.getQueryParameter("track"), parse.getQueryParameter("present")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1009907132:
                    if (path.equals("/myaccount/crypto/redeem/celsius")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.cryptocurrency.api.navigation.CryptoCelsiusClaimCodeDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1158207912:
                    if (path.equals("/myaccount/transfer")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.p2p.api.navigation.SendTransferDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1168039531:
                    if (path.equals("/confirmEmail")) {
                        java.lang.String queryParameter48 = parse.getQueryParameter("email");
                        if (queryParameter48 == null || (queryParameter16 = parse.getQueryParameter("code")) == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.identity.api.navigation.EmailConfirmationDestination(queryParameter48, queryParameter16), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1179689106:
                    if (path.equals("/revolvingcredit_servicing_request_physical_card")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.RequestPhysicalCardDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1190381513:
                    if (path.equals("/revolvingcredit_servicing_manage_account")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.ManageAccountDeepLinkDestination(path), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1240545757:
                    if (path.equals("/mobile-app/rewardscenter/saved-offers")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryEarnDestination((java.lang.String) null, parse.getQueryParameter("targetingUnitId"), parse.getQueryParameter("trafficSource"), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1256108294:
                    if (path.equals("/mobile-app/paylater/pl2go-acq-lander")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.bnplacquisition.navigation.AcquisitionDeepLinkEntryDestination(parse.getQueryParameter("paylater_source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1292293216:
                    if (path.equals("/myaccount/credit/paypal-credit/us/statements")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.StatementHubDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1320874369:
                    if (path.equals("/myaccount/credit/rewards-card/statements")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.StatementHubDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1323132804:
                    if (path.equals(com.paypal.oslo.app.MainActivity.APP_SWITCH_CHECKOUT_PATH)) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.inappcheckout.api.navigation.CheckoutDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1345298027:
                    if (path.equals(com.paypal.oslo.feature.bnplservicing.api.navigation.DeeplinkPaths.PLAN_DETAILS)) {
                        java.lang.String queryParameter49 = parse.getQueryParameter(com.paypal.oslo.feature.bnplservicing.api.navigation.DeeplinkParams.PLAN_ID);
                        if (queryParameter49 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.bnplservicing.navigation.PlanDetailsDestination(queryParameter49, parse.getQueryParameter("paylater_source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1452407558:
                    if (path.equals("/mobile-app/subscriptions/link-subscriptions")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.subscriptions.api.navigation.LinkSubscriptionsDestination(parse.getQueryParameter(com.paypal.oslo.feature.subscriptions.api.navigation.DeeplinkParams.TRAFFIC_SOURCE)), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1609616507:
                    if (path.equals(com.paypal.oslo.feature.packagetracking.api.navigation.PackageTrackingNavigationConstants.PACKAGE_SETTINGS_DEEPLINK)) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination(parse.getQueryParameter("source"), parse.getQueryParameter("trigger_point"), parse.getQueryParameter("email_provider")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1635594237:
                    if (path.equals("/myaccount/statements/tax")) {
                        java.lang.String queryParameter50 = parse.getQueryParameter("source");
                        if (queryParameter50 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.TaxDocumentsDestination(queryParameter50), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1694574066:
                    if (path.equals("/mobile-app/loyalty-rewards/benefits-subscription")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryEarnDestination((java.lang.String) null, parse.getQueryParameter("targetingUnitId"), parse.getQueryParameter("trafficSource"), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1698724118:
                    if (path.equals("/revolvingcredit_servicing_credit_limit_increase")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.CreditLimitIncreaseDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1719708070:
                    if (path.equals("/idassurance/link")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.verificationcapture.api.navigation.VerificationCaptureDeeplinkDestination(parse.getQueryParameter(com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID), parse.getQueryParameter(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY), parse.getQueryParameter("url")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1725236936:
                    if (path.equals("/myaccount/balance/get-started/balance-bundle")) {
                        java.lang.String queryParameter51 = parse.getQueryParameter("entry_point");
                        if (queryParameter51 == null || (queryParameter17 = parse.getQueryParameter("flow_intent")) == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.bankingbundle.api.navigation.BankingBundleDeepLinkDestination(queryParameter51, queryParameter17, parse.getQueryParameter("skip_landing"), parse.getQueryParameter("skip_success")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1748549344:
                    if (path.equals(com.paypal.oslo.feature.taptopay.api.navigation.TapToPayDeeplinks.PROVISIONING_SETUP)) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDeeplinkDestination(parse.getQueryParameter("entry_point"), parse.getQueryParameter("source"), parse.getQueryParameter(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW)), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1813536898:
                    if (path.equals("/myaccount/credit/rewards-card/manage")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.ManageAccountDeepLinkDestination(path), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1872218640:
                    if (path.equals("/credit-application/co")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling(path, parse.getQueryParameter("track"), parse.getQueryParameter("present")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1890386833:
                    if (path.equals("/mobile-app/subscriptions/details-sheet")) {
                        java.lang.String queryParameter52 = parse.getQueryParameter(com.paypal.oslo.feature.subscriptions.api.navigation.DeeplinkParams.AGREEMENT_ID);
                        if (queryParameter52 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionDetailsDestination(queryParameter52, parse.getQueryParameter(com.paypal.oslo.feature.subscriptions.api.navigation.DeeplinkParams.TRAFFIC_SOURCE), parse.getQueryParameter(com.paypal.oslo.feature.subscriptions.api.navigation.DeeplinkParams.AGREEMENT_TYPE)), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1922781601:
                    if (path.equals("/myaccount/savings/add-money")) {
                        java.lang.String queryParameter53 = parse.getQueryParameter("source");
                        if (queryParameter53 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.savings.api.navigation.SavingsDlAddMoneyDestination(queryParameter53, parse.getQueryParameter("fitype")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1939157580:
                    if (path.equals("/direct_deposit_setup_info_view")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositSetupInfoDestination(parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1957542583:
                    if (path.equals("/revolvingcredit_servicing_payment_summary")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.PaymentSummaryDeepLinkDestination(path, parse.getQueryParameter("creditProductIdentifier"), parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1970235486:
                    if (path.equals(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.WebUrlConstants.PPCC_TERMS)) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination(path, parse.getQueryParameter("source")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 1970762424:
                    if (path.equals("/myaccount/statements/custom/download")) {
                        java.lang.String queryParameter54 = parse.getQueryParameter("fileName");
                        if (queryParameter54 == null || (queryParameter18 = parse.getQueryParameter("source")) == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.taxanddocumentcenter.api.navigation.CustomStatementDownloadDestination(queryParameter54, queryParameter18), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 2023508167:
                    if (path.equals("/mobile-app/myaccount/activity")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey(parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_START_DATE), parse.getQueryParameter(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_END_DATE)), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 2092344526:
                    if (path.equals("/myaccount/transfer/claim/preview")) {
                        java.lang.String queryParameter55 = parse.getQueryParameter("reference_data");
                        if (queryParameter55 == null) {
                            return null;
                        }
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(new com.paypal.oslo.feature.p2p.api.navigation.ClaimPreviewDestination(queryParameter55, parse.getQueryParameter("intent")), highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str5322222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                case 2143490503:
                    if (path.equals("/taxHoldDetails")) {
                        return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(com.paypal.oslo.feature.balance.api.navigation.BalanceOnHoldDetailsRouterDestination.INSTANCE, highSpeedVideoFpsRanges);
                    }
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str53222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
                default:
                    str = str51;
                    str2 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SOURCE_PAGE;
                    str3 = "transactionShortDescription";
                    str4 = str52;
                    str5 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_TYPE;
                    str6 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_GROUP_REQUEST_ID;
                    str7 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_ACTIVITY_ITEM_ID;
                    str8 = "trafficSource";
                    str9 = "targetingUnitId";
                    str10 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_ID;
                    str11 = "entrypoint";
                    str12 = com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.DeepLinkParams.KEY_SUBDOMAIN_TYPE;
                    java.lang.String str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222 = path;
                    matchEntire = getHighSpeedVideoFpsRanges.matchEntire(str532222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222);
                    if (matchEntire == null) {
                    }
                    break;
            }
        } else {
            return null;
        }
    }

    private static java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges(android.net.Uri p0) {
        java.lang.String queryParameter;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.String str : p0.getQueryParameterNames()) {
            if (getHighSpeedVideoFpsRangesFor.contains(str) && (queryParameter = p0.getQueryParameter(str)) != null) {
                linkedHashMap.put(str, queryParameter);
            }
        }
        return linkedHashMap;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/app/deeplink/DeeplinkParser$ParseResult;", "", "Landroidx/navigation3/runtime/NavKey;", "destination", "", "", "trackingParams", "<init>", "(Landroidx/navigation3/runtime/NavKey;Ljava/util/Map;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "component2", "()Ljava/util/Map;", "copy", "(Landroidx/navigation3/runtime/NavKey;Ljava/util/Map;)Lcom/paypal/oslo/app/deeplink/DeeplinkParser$ParseResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestination", "Ljava/util/Map;", "getTrackingParams"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ParseResult {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destination;
        private final java.util.Map<java.lang.String, java.lang.String> trackingParams;

        public ParseResult(androidx.navigation3.runtime.NavKey navKey, java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.destination = navKey;
            this.trackingParams = map;
        }

        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getTrackingParams() {
            return this.trackingParams;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.util.Map<java.lang.String, java.lang.String> map = this.trackingParams;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ParseResult(destination=");
            sb.append(navKey);
            sb.append(", trackingParams=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.destination.hashCode() * 31) + this.trackingParams.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult)) {
                return false;
            }
            com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult parseResult = (com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.destination, parseResult.destination) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingParams, parseResult.trackingParams);
        }

        public final com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult copy(androidx.navigation3.runtime.NavKey destination, java.util.Map<java.lang.String, java.lang.String> trackingParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingParams, "");
            return new com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult(destination, trackingParams);
        }

        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return this.trackingParams;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult copy$default(com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult parseResult, androidx.navigation3.runtime.NavKey navKey, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = parseResult.destination;
            }
            if ((i & 2) != 0) {
                map = parseResult.trackingParams;
            }
            return parseResult.copy(navKey, map);
        }
    }
}
