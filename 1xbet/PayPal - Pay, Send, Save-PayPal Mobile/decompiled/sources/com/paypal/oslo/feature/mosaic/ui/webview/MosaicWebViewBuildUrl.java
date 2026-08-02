package com.paypal.oslo.feature.mosaic.ui.webview;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/MosaicWebViewBuildUrl;", "", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "remoteConfig", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "localeProvider", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "appInformationProvider", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;Lcom/paypal/oslo/core/appidentity/domain/AppInformation;)V", "Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;", "cipParams", "", "buildCipUrl", "(Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;)Ljava/lang/String;", "", "additionalHttpHeaders", "(Lcom/paypal/oslo/feature/mosaic/api/navigation/MosaicLegacyDestination;)Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicWebViewBuildUrl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.AppInformation Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("DEBITCARD_2_0", "debitcard2"), kotlin.TuplesKt.to("DEBITCARD", "debitcard"), kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_POLICY_NAME_IRS_1099_K, "irs1099k"), kotlin.TuplesKt.to("IRS_1099_K_POLICY", "irs1099k"), kotlin.TuplesKt.to("CIP_VERIFICATION", "cip"), kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.CIP_FLOW_NAME, "cip"), kotlin.TuplesKt.to("HYS", "hys"), kotlin.TuplesKt.to("HYS_CIP", "hys"), kotlin.TuplesKt.to("CASH_PLUS_2_0", "cashplus2"), kotlin.TuplesKt.to("TAX_CORRECTION", "irs1099kcorrection"), kotlin.TuplesKt.to("VENMO_TAX_CORRECTION", "irsvenmo1099kcorrection"), kotlin.TuplesKt.to("TID_VERIFICATION", "tid"), kotlin.TuplesKt.to("EU_ONBOARDING", "kyc"), kotlin.TuplesKt.to("BUSINESS_TAX_COLLECTION", "vatid"), kotlin.TuplesKt.to("MINIMUM_DATA_COLLECTION", "mdc"), kotlin.TuplesKt.to("KYC_LITE", "kyclite"), kotlin.TuplesKt.to("ENHANCED_KYC", "kycenhanced"), kotlin.TuplesKt.to("CA_CIP", "cip"), kotlin.TuplesKt.to("SELL_CRYPTO", "w9"), kotlin.TuplesKt.to("VENMO_CIP", "ttp"), kotlin.TuplesKt.to("VENMO_AUGMENTED_CIP", "ttpenhanced"), kotlin.TuplesKt.to("VENMO_BENEFICIAL_OWNER_VERIFICATION", "bocollection"), kotlin.TuplesKt.to("SDD_PLUS", "cip"), kotlin.TuplesKt.to("SDD", "cip"), kotlin.TuplesKt.to("CUSTOMER_PROFILE_CHANGE", "withdrawalnamechange"), kotlin.TuplesKt.to("CN_ONBOARDING", "kyc"));

    @javax.inject.Inject
    public MosaicWebViewBuildUrl(com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider, com.paypal.oslo.core.appidentity.domain.AppInformation appInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInformation, "");
        this.getHighSpeedVideoFpsRanges = remoteConfigConfig;
        this.getHighSpeedVideoSizes = localeProvider;
        this.Camera2StreamConfigurationMap = appInformation;
    }

    public final java.lang.String buildCipUrl(com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination cipParams) {
        java.lang.String str;
        java.lang.String concat;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipParams, "");
        if (cipParams.getEncryptedProcessId() != null) {
            concat = "/policydashboard/process/compliance/pid/".concat(java.lang.String.valueOf(cipParams.getEncryptedProcessId()));
        } else if (cipParams.getPolicyName() != null) {
            java.lang.String policyName = cipParams.getPolicyName();
            if (policyName != null) {
                java.lang.String upperCase = policyName.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                str = getHighSpeedVideoFpsRanges.get(upperCase);
                if (str == null) {
                    str = "";
                }
            } else {
                str = null;
            }
            concat = "/policydashboard/process/compliance/".concat(java.lang.String.valueOf(str));
        } else {
            throw new java.lang.IllegalArgumentException("Either policyName or encryptedProcessId must be provided");
        }
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        java.lang.String policyName2 = cipParams.getPolicyName();
        if (policyName2 != null) {
            createListBuilder.add("policyName=".concat(java.lang.String.valueOf(policyName2)));
        }
        java.lang.String encryptedProcessId = cipParams.getEncryptedProcessId();
        if (encryptedProcessId != null) {
            createListBuilder.add("encryptedProcessId=".concat(java.lang.String.valueOf(encryptedProcessId)));
        }
        createListBuilder.add("attemptIntention=".concat(java.lang.String.valueOf(cipParams.getAttemptIntention())));
        createListBuilder.add("invocationPage=".concat(java.lang.String.valueOf(cipParams.getInvocationPage())));
        createListBuilder.add("showAcknowledgementScreen=".concat(java.lang.String.valueOf(cipParams.getShowAcknowledgementScreen())));
        createListBuilder.add("nativeSDKVersion=v2");
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.build(createListBuilder), "&", null, null, 0, null, null, 62, null);
        java.util.List createListBuilder2 = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder2.add("useLiteUI=true");
        java.lang.String obj = this.getHighSpeedVideoSizes.getUserLocale().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        createListBuilder2.add("locale.x=".concat(java.lang.String.valueOf(obj)));
        createListBuilder2.add("country.x=".concat(java.lang.String.valueOf(this.getHighSpeedVideoSizes.getUserLocale().getCountry())));
        createListBuilder2.add("user_guid=".concat(java.lang.String.valueOf(this.Camera2StreamConfigurationMap.getAppGUID())));
        createListBuilder2.add("_fpti.ref_vid=".concat(java.lang.String.valueOf(this.Camera2StreamConfigurationMap.getSessionID())));
        java.lang.String joinToString$default2 = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.build(createListBuilder2), "&", null, null, 0, null, null, 62, null);
        java.lang.String webViewUrl = com.paypal.oslo.feature.mosaic.utils.ExtensionsKt.getWebViewUrl(this.getHighSpeedVideoFpsRanges);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(webViewUrl);
        sb.append(concat);
        sb.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
        sb.append(joinToString$default);
        sb.append("&");
        sb.append(joinToString$default2);
        return sb.toString();
    }

    public final java.util.Map<java.lang.String, java.lang.String> additionalHttpHeaders(com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination cipParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cipParams, "");
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.KEY_QUERY_PARAM_PP_FLOW, cipParams.getPpFlow()), kotlin.TuplesKt.to("attempt_intention", cipParams.getAttemptIntention()), kotlin.TuplesKt.to("user_guid", this.Camera2StreamConfigurationMap.getAppGUID()), kotlin.TuplesKt.to("user_session_guid", this.Camera2StreamConfigurationMap.getSessionID()));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : mapOf.entrySet()) {
            if (((java.lang.String) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(linkedHashMap2.size()));
        for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
            java.lang.Object key = entry2.getKey();
            java.lang.Object value = entry2.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(value);
            linkedHashMap3.put(key, (java.lang.String) value);
        }
        try {
            java.lang.String jSONObject = new org.json.JSONObject(linkedHashMap3).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("X-paypal-fpti", jSONObject));
        } catch (java.lang.IllegalStateException e) {
            com.paypal.oslo.feature.mosaic.LoggerKt.log.e("Failed to deserialize headers JSON", e);
            return kotlin.collections.MapsKt.emptyMap();
        }
    }
}
