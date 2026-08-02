package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/LocaleInformationProvider;", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "localeProvider", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Locale;", "getUserLocale", "()Ljava/util/Locale;", "userLocale", "Ljava/util/TimeZone;", "getTimezone", "()Ljava/util/TimeZone;", "timezone"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocaleInformationProvider implements com.paypal.oslo.core.appidentity.domain.LocaleInformation {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public LocaleInformationProvider(com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = localeProvider;
    }

    @Override // com.paypal.oslo.core.appidentity.domain.LocaleInformation
    public final java.util.Locale getUserLocale() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getUserLocale();
    }

    @Override // com.paypal.oslo.core.appidentity.domain.LocaleInformation
    public final java.util.TimeZone getTimezone() {
        java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timeZone, "");
        return timeZone;
    }
}
