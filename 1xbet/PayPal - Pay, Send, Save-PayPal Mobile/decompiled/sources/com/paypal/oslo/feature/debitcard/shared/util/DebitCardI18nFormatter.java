package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/util/DebitCardI18nFormatter;", "", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "digits", "formatCurrency", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/CurrencyStyle;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardI18nFormatter {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public DebitCardI18nFormatter(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        this.Camera2StreamConfigurationMap = localeInformation;
        this.getHighSpeedVideoFpsRanges = formatCurrencyUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4 A[Catch: Exception -> 0x00e8, CancellationException -> 0x0116, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e8, blocks: (B:14:0x009e, B:17:0x00a4, B:22:0x00b1, B:24:0x00e2, B:25:0x00e7, B:38:0x007d), top: B:37:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object formatCurrency(java.lang.String str, java.lang.String str2, com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle, int i, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter$formatCurrency$1 debitCardI18nFormatter$formatCurrency$1;
        int i2;
        java.lang.String str3;
        java.math.BigDecimal bigDecimal;
        com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration;
        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase;
        arrow.core.Either either;
        java.lang.String str4 = str;
        try {
            if (continuation instanceof com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter$formatCurrency$1) {
                debitCardI18nFormatter$formatCurrency$1 = (com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter$formatCurrency$1) continuation;
                if ((debitCardI18nFormatter$formatCurrency$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                    debitCardI18nFormatter$formatCurrency$1.getHighSpeedVideoSizesFor -= 2147483648;
                    java.lang.Object obj = debitCardI18nFormatter$formatCurrency$1.getInputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = debitCardI18nFormatter$formatCurrency$1.getHighSpeedVideoSizesFor;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            bigDecimal = new java.math.BigDecimal(str4);
                            currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(str2), currencyStyle, i, this.Camera2StreamConfigurationMap.getUserLocale(), null, 16, null);
                            formatCurrencyUseCase = this.getHighSpeedVideoFpsRanges;
                            debitCardI18nFormatter$formatCurrency$1.Camera2StreamConfigurationMap = str4;
                            str3 = str2;
                        } catch (java.lang.Exception e) {
                            e = e;
                            str3 = str2;
                        }
                        try {
                            debitCardI18nFormatter$formatCurrency$1.getHighSpeedVideoSizes = str3;
                            debitCardI18nFormatter$formatCurrency$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyStyle);
                            debitCardI18nFormatter$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimal);
                            debitCardI18nFormatter$formatCurrency$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyConfiguration);
                            debitCardI18nFormatter$formatCurrency$1.getHighSpeedVideoFpsRanges = i;
                            debitCardI18nFormatter$formatCurrency$1.getHighSpeedVideoSizesFor = 1;
                            obj = formatCurrencyUseCase.invoke(bigDecimal, currencyConfiguration, debitCardI18nFormatter$formatCurrency$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Error formatting currency", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, null, 12, null);
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(str3);
                            sb.append(str4);
                            return sb.toString();
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = debitCardI18nFormatter$formatCurrency$1.getHighSpeedVideoFpsRanges;
                        java.lang.String str5 = (java.lang.String) debitCardI18nFormatter$formatCurrency$1.getHighSpeedVideoSizes;
                        java.lang.String str6 = (java.lang.String) debitCardI18nFormatter$formatCurrency$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            str3 = str5;
                            str4 = str6;
                        } catch (java.lang.Exception e3) {
                            e = e3;
                            str3 = str5;
                            str4 = str6;
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Error formatting currency", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, null, 12, null);
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(str3);
                            sb2.append(str4);
                            return sb2.toString();
                        }
                    }
                    either = (arrow.core.Either) obj;
                    if (!(either instanceof arrow.core.Either.Right)) {
                        return (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                    }
                    if (either instanceof arrow.core.Either.Left) {
                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Error formatting currency", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.i18n.domain.model.CurrencyError) ((arrow.core.Either.Left) either).getValue()).getDescription())), null, null, 12, null);
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(str3);
                        sb3.append(str4);
                        return sb3.toString();
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            if (i2 != 0) {
            }
            either = (arrow.core.Either) obj;
            if (!(either instanceof arrow.core.Either.Right)) {
            }
        } catch (java.util.concurrent.CancellationException e4) {
            throw e4;
        }
        debitCardI18nFormatter$formatCurrency$1 = new com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter$formatCurrency$1(this, continuation);
        java.lang.Object obj2 = debitCardI18nFormatter$formatCurrency$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = debitCardI18nFormatter$formatCurrency$1.getHighSpeedVideoSizesFor;
    }

    public static /* synthetic */ java.lang.Object formatCurrency$default(com.paypal.oslo.feature.debitcard.shared.util.DebitCardI18nFormatter debitCardI18nFormatter, java.lang.String str, java.lang.String str2, com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            currencyStyle = com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL;
        }
        com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle2 = currencyStyle;
        if ((i2 & 8) != 0) {
            i = 2;
        }
        return debitCardI18nFormatter.formatCurrency(str, str2, currencyStyle2, i, continuation);
    }
}
