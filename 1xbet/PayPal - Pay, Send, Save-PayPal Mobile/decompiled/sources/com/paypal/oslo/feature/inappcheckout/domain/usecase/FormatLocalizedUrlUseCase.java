package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatLocalizedUrlUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "localeProvider", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;)V", "", "urlTemplate", "invoke", "(Ljava/lang/String;)Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormatLocalizedUrlUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public FormatLocalizedUrlUseCase(com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        this.getHighSpeedVideoFpsRanges = localeProvider;
    }

    public final java.lang.String invoke(java.lang.String urlTemplate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlTemplate, "");
        java.util.Locale userLocale = this.getHighSpeedVideoFpsRanges.getUserLocale();
        java.lang.String country = userLocale.getCountry();
        kotlin.jvm.internal.Intrinsics.checkNotNull(country);
        if (country.length() <= 0) {
            country = null;
        }
        if (country == null) {
            country = java.util.Locale.US.getCountry();
        }
        java.lang.String language = userLocale.getLanguage();
        kotlin.jvm.internal.Intrinsics.checkNotNull(language);
        java.lang.String str = language.length() > 0 ? language : null;
        if (str == null) {
            str = java.util.Locale.US.getLanguage();
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(urlTemplate, java.util.Arrays.copyOf(new java.lang.Object[]{country, str}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
