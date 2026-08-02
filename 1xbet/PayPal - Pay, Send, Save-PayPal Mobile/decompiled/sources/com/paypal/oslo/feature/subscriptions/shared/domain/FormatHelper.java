package com.paypal.oslo.feature.subscriptions.shared.domain;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/FormatHelper;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "dateTimeFormatUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;)V", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/Balance;", "balance", "", "formatBalance", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/Balance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dateString", "Lcom/paypal/oslo/core/i18n/domain/model/DateFormat;", "dateFormat", "formatDate", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/DateFormat;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FormatHelper {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public FormatHelper(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatUseCase, "");
        this.getHighSpeedVideoSizes = formatCurrencyUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = dateTimeFormatUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object formatBalance(com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance balance, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper$formatBalance$1 formatHelper$formatBalance$1;
        int i;
        java.lang.String value;
        arrow.core.Either either;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance balance2 = balance;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper$formatBalance$1) {
            formatHelper$formatBalance$1 = (com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper$formatBalance$1) continuation;
            if ((formatHelper$formatBalance$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                formatHelper$formatBalance$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = formatHelper$formatBalance$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = formatHelper$formatBalance$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.math.BigDecimal bigDecimalOrNull = (balance2 == null || (value = balance.getValue()) == null) ? null : kotlin.text.StringsKt.toBigDecimalOrNull(value);
                    if (bigDecimalOrNull == null) {
                        return null;
                    }
                    try {
                        java.lang.String m11384constructorimpl = com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(balance.getCurrencyCode());
                        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = this.getHighSpeedVideoSizes;
                        com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(m11384constructorimpl, null, 0, null, null, 30, null);
                        formatHelper$formatBalance$1.getHighResolutionOutputSizeshNQ4ISI = balance2;
                        formatHelper$formatBalance$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimalOrNull);
                        formatHelper$formatBalance$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11384constructorimpl);
                        formatHelper$formatBalance$1.getHighSpeedVideoSizes = 1;
                        obj = formatCurrencyUseCase.invoke(bigDecimalOrNull, currencyConfiguration, formatHelper$formatBalance$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (java.lang.IllegalArgumentException e) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Failed to parse currency code from balance", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("balance", balance.toString()), kotlin.TuplesKt.to("exception", e.getMessage())), null, 4, null);
                        java.lang.String currencyCode = balance.getCurrencyCode();
                        java.lang.String value2 = balance.getValue();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(currencyCode);
                        sb.append(" ");
                        sb.append(value2);
                        return sb.toString();
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    balance2 = (com.paypal.oslo.feature.subscriptions.shared.domain.model.Balance) formatHelper$formatBalance$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.i18n.domain.model.CurrencyError currencyError = (com.paypal.oslo.core.i18n.domain.model.CurrencyError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Failed to format balance", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("balance", balance2.toString()), kotlin.TuplesKt.to("error", currencyError.toString()), kotlin.TuplesKt.to("currencyErrorDescription", currencyError.getDescription())), null, 4, null);
                    java.lang.String currencyCode2 = balance2.getCurrencyCode();
                    java.lang.String value3 = balance2.getValue();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(currencyCode2);
                    sb2.append(" ");
                    sb2.append(value3);
                    return sb2.toString();
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        formatHelper$formatBalance$1 = new com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper$formatBalance$1(this, continuation);
        java.lang.Object obj2 = formatHelper$formatBalance$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = formatHelper$formatBalance$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public final java.lang.String formatDate(java.lang.String dateString, com.paypal.oslo.core.i18n.domain.model.DateFormat dateFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormat, "");
        java.lang.String str = dateString;
        if (str != null && str.length() != 0) {
            try {
                java.util.Date from = java.util.Date.from(java.time.OffsetDateTime.parse(dateString).toInstant());
                com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(from);
                java.lang.String id = java.time.ZoneId.systemDefault().getId();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
                arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> invoke = dateTimeFormatUseCase.invoke(new com.paypal.oslo.core.i18n.domain.model.DateTime(from, id), new com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration(dateFormat, null, 2, null));
                if (invoke instanceof arrow.core.Either.Right) {
                    return (java.lang.String) ((arrow.core.Either.Right) invoke).getValue();
                }
                if (invoke instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.i18n.domain.model.DateTimeError dateTimeError = (com.paypal.oslo.core.i18n.domain.model.DateTimeError) ((arrow.core.Either.Left) invoke).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Failed to parse dateString in dateTimeFormatUseCase", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("dateString", dateString), kotlin.TuplesKt.to("error", dateTimeError.toString()), kotlin.TuplesKt.to("errorDescription", dateTimeError.toString())), null, 4, null);
                    return null;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            } catch (java.time.format.DateTimeParseException e) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Failed to parse dateString in formatDate", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("dateString", dateString), kotlin.TuplesKt.to("exception", e.getMessage())), null, 4, null);
            }
        }
        return null;
    }
}
