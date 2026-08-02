package com.paypal.oslo.feature.savings.util;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/savings/util/CurrencyHandlerImpl;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/CurrencyHandler;", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "localeProvider", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;)V", "", "amount", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyError;", "", "format", "(DLcom/paypal/oslo/core/i18n/domain/model/CurrencyConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyInfo;", "getCurrencyDetails", "(Lcom/paypal/oslo/core/i18n/domain/model/CurrencyConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/Locale;", "p0", "", "getHighSpeedVideoSizes", "(Ljava/util/Locale;)Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CurrencyHandlerImpl implements com.paypal.oslo.core.i18n.domain.interfaces.CurrencyHandler {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl.Companion INSTANCE = new com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl.Companion(null);
    public static final int $stable = 8;
    private static final java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("USD", com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD), kotlin.TuplesKt.to(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_EUR), kotlin.TuplesKt.to("GBP", com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_GBP));

    @javax.inject.Inject
    public CurrencyHandlerImpl(com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeProvider, "");
        this.Camera2StreamConfigurationMap = localeProvider;
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.CurrencyHandler
    public final java.lang.Object format(double d, com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.CurrencyError, java.lang.String>> continuation) {
        java.lang.Object m23436constructorimpl;
        java.lang.String obj;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl currencyHandlerImpl = this;
            java.util.Locale locale = currencyConfiguration.getLocale();
            if (locale == null) {
                locale = this.Camera2StreamConfigurationMap.getUserLocale();
            }
            java.util.Currency currency = java.util.Currency.getInstance(currencyConfiguration.m11393getCurrencyCodehkTgrg());
            com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle = currencyConfiguration.getCurrencyStyle();
            if (currencyStyle == null) {
                currencyStyle = com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.CODE;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(currency);
            int digits = currencyConfiguration.getDigits();
            java.text.NumberFormat numberInstance = java.text.NumberFormat.getNumberInstance(locale);
            if (digits < 0) {
                digits = currency.getDefaultFractionDigits();
            }
            numberInstance.setMinimumFractionDigits(digits);
            numberInstance.setMaximumFractionDigits(digits);
            numberInstance.setRoundingMode(java.math.RoundingMode.HALF_UP);
            java.lang.String format = numberInstance.format(d);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            int i = com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl.WhenMappings.$EnumSwitchMapping$0[currencyStyle.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    java.lang.String symbol = currency.getSymbol(locale);
                    if (getHighSpeedVideoSizes(locale)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(format);
                        sb.append(" ");
                        sb.append(symbol);
                        obj = sb.toString();
                    } else {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(symbol);
                        sb2.append(format);
                        obj = sb2.toString();
                    }
                } else if (i == 3) {
                    java.lang.String symbol2 = currency.getSymbol(locale);
                    if (getHighSpeedVideoSizes(locale)) {
                        java.lang.String currencyCode = currency.getCurrencyCode();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(format);
                        sb3.append(" ");
                        sb3.append(symbol2);
                        sb3.append(" ");
                        sb3.append(currencyCode);
                        obj = sb3.toString();
                    } else {
                        java.lang.String currencyCode2 = currency.getCurrencyCode();
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(symbol2);
                        sb4.append(format);
                        sb4.append(" ");
                        sb4.append(currencyCode2);
                        obj = sb4.toString();
                    }
                } else {
                    if (i != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    java.lang.String displayName = currency.getDisplayName(locale);
                    java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                    sb5.append(format);
                    sb5.append(" ");
                    sb5.append(displayName);
                    obj = sb5.toString();
                }
            } else if (getHighSpeedVideoSizes(locale)) {
                java.lang.String currencyCode3 = currency.getCurrencyCode();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(format);
                sb6.append(" ");
                sb6.append(currencyCode3);
                obj = sb6.toString();
            } else {
                java.lang.String currencyCode4 = currency.getCurrencyCode();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(currencyCode4);
                sb7.append(" ");
                sb7.append(format);
                obj = sb7.toString();
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(obj);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl == null) {
            return arrow.core.EitherKt.right((java.lang.String) m23436constructorimpl);
        }
        java.lang.String message = m23439exceptionOrNullimpl.getMessage();
        if (message == null) {
            message = "Failed to format currency";
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError(message));
    }

    @Override // com.paypal.oslo.core.i18n.domain.interfaces.CurrencyHandler
    public final java.lang.Object getCurrencyDetails(com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.CurrencyError, com.paypal.oslo.core.i18n.domain.model.CurrencyInfo>> continuation) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl currencyHandlerImpl = this;
            java.util.Locale locale = currencyConfiguration.getLocale();
            if (locale == null) {
                locale = this.Camera2StreamConfigurationMap.getUserLocale();
            }
            java.util.Currency currency = java.util.Currency.getInstance(currencyConfiguration.m11393getCurrencyCodehkTgrg());
            java.lang.String m11393getCurrencyCodehkTgrg = currencyConfiguration.m11393getCurrencyCodehkTgrg();
            java.lang.String symbol = currency.getSymbol(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(symbol, "");
            java.lang.String displayName = currency.getDisplayName(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(displayName, "");
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(new com.paypal.oslo.core.i18n.domain.model.CurrencyInfo(m11393getCurrencyCodehkTgrg, symbol, displayName, null));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl == null) {
            return arrow.core.EitherKt.right((com.paypal.oslo.core.i18n.domain.model.CurrencyInfo) m23436constructorimpl);
        }
        java.lang.String message = m23439exceptionOrNullimpl.getMessage();
        if (message == null) {
            message = "Failed to get currency details";
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.model.CurrencyError.FormatError(message));
    }

    private static boolean getHighSpeedVideoSizes(java.util.Locale p0) {
        return kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"DE", "FR", "IT", "ES", "NL", "BE", "AT", "PT", "PL", "CZ", "SK", "HU", "RO", "BG", "HR", "SI", "LT", "LV", "EE", "FI", "SE", "DK", org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO, "IS", "CH", "AZ"}).contains(p0.getCountry());
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/util/CurrencyHandlerImpl$Companion;", "", "<init>", "()V", "", "amount", "", "currencyCode", "formatCurrency", "(DLjava/lang/String;)Ljava/lang/String;", "centsString", "centsToDollars", "(Ljava/lang/String;)Ljava/lang/String;", "dollarsString", "dollarsToCents", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String formatCurrency(double amount, java.lang.String currencyCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            java.util.Map map = com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String upperCase = currencyCode.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            java.lang.String str = (java.lang.String) map.get(upperCase);
            if (str != null) {
                currencyCode = str;
            }
            if (amount < 0.0d) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format = java.lang.String.format(java.util.Locale.US, "-%s%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{currencyCode, java.lang.Double.valueOf(-amount)}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                return format;
            }
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format2 = java.lang.String.format(java.util.Locale.US, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_CURRENCY, java.util.Arrays.copyOf(new java.lang.Object[]{currencyCode, java.lang.Double.valueOf(amount)}, 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "");
            return format2;
        }

        public final java.lang.String centsToDollars(java.lang.String centsString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(centsString, "");
            java.lang.Long longOrNull = kotlin.text.StringsKt.toLongOrNull(centsString);
            long longValue = longOrNull != null ? longOrNull.longValue() : 0L;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.US, com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.FORMAT_TWO_DECIMALS, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(longValue / 100.0d)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            return format;
        }

        public final java.lang.String dollarsToCents(java.lang.String dollarsString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dollarsString, "");
            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(dollarsString);
            return java.lang.String.valueOf((long) ((doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d) * 100.0d));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.values().length];
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.CODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.INTERNATIONAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.NAME.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
