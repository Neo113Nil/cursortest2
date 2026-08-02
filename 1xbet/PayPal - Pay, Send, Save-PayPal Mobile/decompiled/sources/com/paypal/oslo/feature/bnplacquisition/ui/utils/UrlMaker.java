package com.paypal.oslo.feature.bnplacquisition.ui.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/utils/UrlMaker;", "", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "<init>", "(Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;)V", "", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "customerId", com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, "channel", "makeUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UrlMaker {
    public static final java.lang.String CHANNEL_DIRECT_APPLICATION = "DIRECT_APPLICATION";
    public static final java.lang.String OFFER_LONG_TERM = "PAY_LATER_LONG_TERM";
    public static final java.lang.String OFFER_SHORT_TERM = "PAY_LATER_SHORT_TERM";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("PAY_LATER_LONG_TERM_US", "PAY_LATER_LONG_TERM"), kotlin.TuplesKt.to("PAY_LATER_DE", "PAY_LATER_LONG_TERM"), kotlin.TuplesKt.to("PAY_LATER_US", "PAY_LATER_SHORT_TERM"));

    @javax.inject.Inject
    public UrlMaker(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        this.getHighSpeedVideoSizes = webEnvironmentProvider;
        this.getHighSpeedVideoFpsRanges = userStore;
        this.getHighSpeedVideoFpsRangesFor = localeInformation;
    }

    public static /* synthetic */ java.lang.String makeUrl$default(com.paypal.oslo.feature.bnplacquisition.ui.utils.UrlMaker urlMaker, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        com.paypal.oslo.core.userstore.model.User user;
        if ((i & 2) != 0) {
            com.paypal.oslo.core.userstore.model.UserState value = urlMaker.getHighSpeedVideoFpsRanges.getUserState().getValue();
            com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
            str2 = (profileLoaded == null || (user = profileLoaded.getUser()) == null) ? null : user.getId();
            if (str2 == null) {
                str2 = "";
            }
        }
        if ((i & 4) != 0) {
            str3 = urlMaker.getHighSpeedVideoFpsRangesFor.getUserLocale().toLanguageTag();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
        }
        if ((i & 8) != 0) {
            str4 = CHANNEL_DIRECT_APPLICATION;
        }
        return urlMaker.makeUrl(str, str2, str3, str4);
    }

    public final java.lang.String makeUrl(java.lang.String cpi, java.lang.String customerId, java.lang.String language, java.lang.String channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        okhttp3.HttpUrl.Builder addQueryParameter = okhttp3.HttpUrl.INSTANCE.get(this.getHighSpeedVideoSizes.getWebBaseUrl()).newBuilder().addEncodedPathSegments("credit-presentment/lander/modal").addQueryParameter("customer_id", customerId);
        java.lang.String str = getHighSpeedVideoFpsRanges.get(cpi);
        if (str != null) {
            cpi = str;
        }
        return addQueryParameter.addQueryParameter("offer", cpi).addQueryParameter("channel", channel).addQueryParameter(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, language).build().toString();
    }
}
