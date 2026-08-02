package com.paypal.oslo.core.i18n.data.implementation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/implementation/LocaleProviderImpl;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "localeResolverCache", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "getHighSpeedVideoSizes", "Ljava/util/Locale;", "getUserLocale", "()Ljava/util/Locale;", "userLocale"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocaleProviderImpl implements com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache getHighSpeedVideoSizes;

    @javax.inject.Inject
    public LocaleProviderImpl(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeResolverCache, "");
        this.getHighSpeedVideoSizes = localeResolverCache;
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider
    public final java.util.Locale getUserLocale() {
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.I18nError, java.util.Locale> userLocale = this.getHighSpeedVideoSizes.getUserLocale();
        if (userLocale instanceof arrow.core.Either.Right) {
            java.util.Locale locale = (java.util.Locale) ((arrow.core.Either.Right) userLocale).getValue();
            com.paypal.android.logger.Logger.v$default(com.paypal.oslo.core.i18n.LoggerKt.log, "getUserLocale", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("userLocale", locale)), null, 4, null);
            return locale;
        }
        if (userLocale instanceof arrow.core.Either.Left) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.i18n.LoggerKt.log, "getUserLocale error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", (com.paypal.oslo.core.i18n.domain.error.I18nError) ((arrow.core.Either.Left) userLocale).getValue())), null, null, 12, null);
            java.util.Locale locale2 = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
            return locale2;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
