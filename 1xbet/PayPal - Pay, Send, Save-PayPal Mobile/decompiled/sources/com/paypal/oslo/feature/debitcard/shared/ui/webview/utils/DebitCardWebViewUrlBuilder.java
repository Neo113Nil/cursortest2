package com.paypal.oslo.feature.debitcard.shared.ui.webview.utils;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\rR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/webview/utils/DebitCardWebViewUrlBuilder;", "", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "remoteConfigConfig", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;)V", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)Ljava/lang/String;", "getAddSecondaryCardUrl", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "getDebitCardAddBillingAddressUrl", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Ljava/lang/String;", "debitInstrumentId", "getDebitCardActivateUrl", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Ljava/lang/String;", "getBDMCAcquisitionUrl", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardWebViewUrlBuilder {
    public static final java.lang.String WEB_VIEW_PRODUCTION_BASE_URL = "https://www.paypal.com";
    public static final java.lang.String WEB_VIEW_STAGING_BASE_URL = "https://www.stage2std058.stage.paypal.com";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig getHighSpeedVideoFpsRanges;
    public static final int $stable = 8;

    @javax.inject.Inject
    public DebitCardWebViewUrlBuilder(com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        this.getHighSpeedVideoFpsRanges = remoteConfigConfig;
        this.getHighSpeedVideoFpsRangesFor = localeInformation;
    }

    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        java.lang.String trimEnd = kotlin.text.StringsKt.trimEnd(this.getHighSpeedVideoFpsRanges.getEnvironment() instanceof com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.Production ? WEB_VIEW_PRODUCTION_BASE_URL : WEB_VIEW_STAGING_BASE_URL, kotlinx.io.files.FileSystemKt.UnixPathSeparator);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(trimEnd);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(p0);
        return okhttp3.HttpUrl.INSTANCE.get(sb.toString()).toString();
    }

    public final java.lang.String getDebitCardAddBillingAddressUrl(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        java.lang.String name2 = productName.name();
        java.lang.String obj = this.getHighSpeedVideoFpsRangesFor.getUserLocale().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.lang.String country = this.getHighSpeedVideoFpsRangesFor.getUserLocale().getCountry();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("myaccount/debitcards/address/add?addressType=BILLING&productName=");
        sb.append(name2);
        sb.append("&webview=true&webviewCallback=onAddAddressComplete&locale.x=");
        sb.append(obj);
        sb.append("&country.x=");
        sb.append(country);
        return getHighResolutionOutputSizeshNQ4ISI(sb.toString());
    }

    public final java.lang.String getDebitCardActivateUrl(java.lang.String debitInstrumentId, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        java.lang.String name2 = productName.name();
        java.lang.String obj = this.getHighSpeedVideoFpsRangesFor.getUserLocale().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.lang.String country = this.getHighSpeedVideoFpsRangesFor.getUserLocale().getCountry();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("myaccount/debitcards/activate?webview=true&webviewCallback=onActivateCardComplete&productName=");
        sb.append(name2);
        sb.append("&id=");
        sb.append(debitInstrumentId);
        sb.append("&platform=Android&locale.x=");
        sb.append(obj);
        sb.append("&country.x=");
        sb.append(country);
        return getHighResolutionOutputSizeshNQ4ISI(sb.toString());
    }

    public final java.lang.String getAddSecondaryCardUrl() {
        java.lang.String obj = this.getHighSpeedVideoFpsRangesFor.getUserLocale().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.lang.String country = this.getHighSpeedVideoFpsRangesFor.getUserLocale().getCountry();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("myaccount/debit-card/v2/enroll/additional?webview=true&webviewCallback=onAddCardComplete&platform=Android&productName=BUSINESS_DEBIT_CARD&locale.x=");
        sb.append(obj);
        sb.append("&country.x=");
        sb.append(country);
        return getHighResolutionOutputSizeshNQ4ISI(sb.toString());
    }

    public final java.lang.String getBDMCAcquisitionUrl() {
        java.lang.String obj = this.getHighSpeedVideoFpsRangesFor.getUserLocale().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.lang.String country = this.getHighSpeedVideoFpsRangesFor.getUserLocale().getCountry();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("myaccount/debit-card/v2/enroll/primary?skip_intro=true&webviewCallback=onEnrolmentComplete&platform=Android&locale.x=");
        sb.append(obj);
        sb.append("&country.x=");
        sb.append(country);
        return getHighResolutionOutputSizeshNQ4ISI(sb.toString());
    }
}
