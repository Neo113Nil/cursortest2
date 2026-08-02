package com.paypal.oslo.feature.invoicing.domain;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/domain/InvoiceUrlBuilder;", "", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "appInformation", "<init>", "(Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/core/appidentity/domain/AppInformation;)V", "Lcom/paypal/oslo/feature/invoicing/api/navigation/ViewInvoiceDestination;", "destination", "", "build", "(Lcom/paypal/oslo/feature/invoicing/api/navigation/ViewInvoiceDestination;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InvoiceUrlBuilder {

    @java.lang.Deprecated
    public static final java.lang.String QUERY_PARAM_APP_VERSION = "app_version";

    @java.lang.Deprecated
    public static final java.lang.String QUERY_PARAM_COUNTRY = "country.x";

    @java.lang.Deprecated
    public static final java.lang.String QUERY_PARAM_LOCALE = "locale.x";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.AppInformation getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.Companion Companion = new com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public InvoiceUrlBuilder(com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.appidentity.domain.AppInformation appInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInformation, "");
        this.getHighResolutionOutputSizeshNQ4ISI = webEnvironmentProvider;
        this.getHighSpeedVideoFpsRangesFor = dynamicConfiguration;
        this.getHighSpeedVideoSizes = localeInformation;
        this.getHighSpeedVideoFpsRanges = appInformation;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/invoicing/domain/InvoiceUrlBuilder$Companion;", "", "<init>", "()V", "", "QUERY_PARAM_LOCALE", "Ljava/lang/String;", "QUERY_PARAM_COUNTRY", "QUERY_PARAM_APP_VERSION"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String build(com.paypal.oslo.feature.invoicing.api.navigation.ViewInvoiceDestination destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        java.lang.String str = (java.lang.String) this.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.invoicing.domain.remoteconfig.InvoicingConfig.INSTANCE.getViewInvoicePathUrl());
        java.util.Locale userLocale = this.getHighSpeedVideoSizes.getUserLocale();
        return okhttp3.HttpUrl.INSTANCE.get(this.getHighResolutionOutputSizeshNQ4ISI.getWebBaseUrl()).newBuilder().addEncodedPathSegments(kotlin.text.StringsKt.trimStart(str, kotlinx.io.files.FileSystemKt.UnixPathSeparator)).addPathSegment(destination.getInvoiceId()).addQueryParameter("locale.x", userLocale.toString()).addQueryParameter("country.x", userLocale.getCountry()).addQueryParameter(QUERY_PARAM_APP_VERSION, this.getHighSpeedVideoFpsRanges.getAppVersion()).build().toString();
    }
}
