package com.paypal.oslo.feature.bnplservicing.ui.plhub.components;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plhub/components/BnplUrlHelper;", "", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/feature/bnplservicing/config/SupportedCpisConfig;", "supportedCpisConfig", "<init>", "(Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/feature/bnplservicing/config/SupportedCpisConfig;)V", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "cpis", "", "customerId", com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, "channel", "makeUrls", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "makeUrl", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/userstore/UserStore;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplservicing/config/SupportedCpisConfig;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplUrlHelper {
    public static final java.lang.String CHANNEL_PAY_LATER_HUB = "PAY_LATER_HUB";
    public static final java.lang.String OFFER_LONG_TERM = "PAY_LATER_LONG_TERM";
    public static final java.lang.String OFFER_SHORT_TERM = "PAY_LATER_SHORT_TERM";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;
    public static final java.lang.String OFFER_PAY_IN_1 = "PAY_LATER_PAY_IN_1";
    private static final java.util.Map<com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier, java.lang.String> getHighSpeedVideoSizes = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_LONG_TERM_US, "PAY_LATER_LONG_TERM"), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_DE, "PAY_LATER_LONG_TERM"), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_LONG_TERM_FR, "PAY_LATER_LONG_TERM"), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_LONG_TERM_ES, "PAY_LATER_LONG_TERM"), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_LONG_TERM_IT, "PAY_LATER_LONG_TERM"), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_US, "PAY_LATER_SHORT_TERM"), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_AU, "PAY_LATER_SHORT_TERM"), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_SHORT_TERM_CA, "PAY_LATER_SHORT_TERM"), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_FR, "PAY_LATER_SHORT_TERM"), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_SHORT_TERM_ES, "PAY_LATER_SHORT_TERM"), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_SHORT_TERM_IT, "PAY_LATER_SHORT_TERM"), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_GB, "PAY_LATER_SHORT_TERM"), kotlin.TuplesKt.to(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_PAY_IN_1_DE, OFFER_PAY_IN_1));

    @javax.inject.Inject
    public BnplUrlHelper(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig supportedCpisConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedCpisConfig, "");
        this.getHighSpeedVideoFpsRanges = webEnvironmentProvider;
        this.getHighSpeedVideoFpsRangesFor = userStore;
        this.getHighSpeedVideoSizes = localeInformation;
        this.Camera2StreamConfigurationMap = supportedCpisConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.List makeUrls$default(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper bnplUrlHelper, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        com.paypal.oslo.core.userstore.model.User user;
        if ((i & 1) != 0) {
            list = bnplUrlHelper.Camera2StreamConfigurationMap.supportedCpis();
        }
        if ((i & 2) != 0) {
            com.paypal.oslo.core.userstore.model.UserState value = bnplUrlHelper.getHighSpeedVideoFpsRangesFor.getUserState().getValue();
            com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
            str = (profileLoaded == null || (user = profileLoaded.getUser()) == null) ? null : user.getId();
            if (str == null) {
                str = "";
            }
        }
        if ((i & 4) != 0) {
            str2 = bnplUrlHelper.getHighSpeedVideoSizes.getUserLocale().toLanguageTag();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
        }
        if ((i & 8) != 0) {
            str3 = CHANNEL_PAY_LATER_HUB;
        }
        return bnplUrlHelper.makeUrls(list, str, str2, str3);
    }

    public final java.util.List<java.lang.String> makeUrls(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> cpis, java.lang.String customerId, java.lang.String language, java.lang.String channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpis, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list = cpis;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(makeUrl((com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier) it.next(), customerId, language, channel));
        }
        return arrayList;
    }

    public static /* synthetic */ java.lang.String makeUrl$default(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper bnplUrlHelper, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        com.paypal.oslo.core.userstore.model.User user;
        if ((i & 2) != 0) {
            com.paypal.oslo.core.userstore.model.UserState value = bnplUrlHelper.getHighSpeedVideoFpsRangesFor.getUserState().getValue();
            com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
            str = (profileLoaded == null || (user = profileLoaded.getUser()) == null) ? null : user.getId();
            if (str == null) {
                str = "";
            }
        }
        if ((i & 4) != 0) {
            str2 = bnplUrlHelper.getHighSpeedVideoSizes.getUserLocale().toLanguageTag();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
        }
        if ((i & 8) != 0) {
            str3 = CHANNEL_PAY_LATER_HUB;
        }
        return bnplUrlHelper.makeUrl(creditProductIdentifier, str, str2, str3);
    }

    public final java.lang.String makeUrl(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi, java.lang.String customerId, java.lang.String language, java.lang.String channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        okhttp3.HttpUrl.Builder addQueryParameter = okhttp3.HttpUrl.INSTANCE.get(this.getHighSpeedVideoFpsRanges.getWebBaseUrl()).newBuilder().addEncodedPathSegments("credit-presentment/lander/modal").addQueryParameter("customer_id", customerId);
        java.lang.String str = getHighSpeedVideoSizes.get(cpi);
        if (str == null) {
            str = cpi.name();
        }
        return addQueryParameter.addQueryParameter("offer", str).addQueryParameter("channel", channel).addQueryParameter(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, language).build().toString();
    }
}
