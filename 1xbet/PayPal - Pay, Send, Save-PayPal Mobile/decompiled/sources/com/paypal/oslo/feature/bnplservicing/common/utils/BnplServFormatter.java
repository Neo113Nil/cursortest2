package com.paypal.oslo.feature.bnplservicing.common.utils;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u00012B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010!J$\u0010$\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0011\u001a\u00020#H\u0086@¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0004\b&\u0010'J\u001a\u0010(\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0004\b(\u0010'R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010.R\u0014\u00100\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010/R\u0014\u0010)\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;", "", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatISODurationUseCase;", "formatISODurationUseCase", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "dateTimeFormatUseCase", "Landroid/content/Context;", "context", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/FormatISODurationUseCase;Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "amount", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "digits", "", "formatCurrency", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;Lcom/paypal/oslo/core/i18n/domain/model/CurrencyStyle;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aprValue", "formatApr", "(Ljava/lang/String;)Ljava/lang/String;", "dateString", "Lcom/paypal/oslo/core/i18n/domain/model/DateFormat;", "formatDate", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/DateFormat;)Ljava/lang/String;", "p0", "Ljava/util/Date;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Ljava/util/Date;", "isoDuration", "Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;", "formatDuration", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatDurationCompact", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatExpirationDuration", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatISODurationUseCase;", "Lcom/paypal/oslo/core/i18n/domain/usecase/DateTimeFormatUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "BnplServDateFormat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServFormatter {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public BnplServFormatter(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase formatISODurationUseCase, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatISODurationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormatUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = localeInformation;
        this.getHighSpeedVideoSizes = formatCurrencyUseCase;
        this.getHighSpeedVideoFpsRangesFor = formatISODurationUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = dateTimeFormatUseCase;
        this.getHighSpeedVideoFpsRanges = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object formatCurrency(com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle, int i, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter$formatCurrency$1 bnplServFormatter$formatCurrency$1;
        int i2;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter$formatCurrency$1) {
            bnplServFormatter$formatCurrency$1 = (com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter$formatCurrency$1) continuation;
            if ((bnplServFormatter$formatCurrency$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                bnplServFormatter$formatCurrency$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = bnplServFormatter$formatCurrency$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = bnplServFormatter$formatCurrency$1.getOutputMinFrameDuration;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    double doubleOrZero = com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatterKt.toDoubleOrZero(money.getValue());
                    java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(doubleOrZero);
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(money.getCurrencyCode()), currencyStyle, i, this.Camera2StreamConfigurationMap.getUserLocale(), null, 16, null);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = this.getHighSpeedVideoSizes;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
                    bnplServFormatter$formatCurrency$1.getHighSpeedVideoFpsRanges = money;
                    bnplServFormatter$formatCurrency$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyStyle);
                    bnplServFormatter$formatCurrency$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(valueOf);
                    bnplServFormatter$formatCurrency$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyConfiguration);
                    bnplServFormatter$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI = i;
                    bnplServFormatter$formatCurrency$1.Camera2StreamConfigurationMap = doubleOrZero;
                    bnplServFormatter$formatCurrency$1.getOutputMinFrameDuration = 1;
                    obj = formatCurrencyUseCase.invoke(valueOf, currencyConfiguration, bnplServFormatter$formatCurrency$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    money2 = money;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    double d = bnplServFormatter$formatCurrency$1.Camera2StreamConfigurationMap;
                    int i3 = bnplServFormatter$formatCurrency$1.getHighResolutionOutputSizeshNQ4ISI;
                    money2 = (com.paypal.oslo.feature.bnplservicing.domain.model.common.Money) bnplServFormatter$formatCurrency$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    return money2.getValue();
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        bnplServFormatter$formatCurrency$1 = new com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter$formatCurrency$1(this, continuation);
        java.lang.Object obj2 = bnplServFormatter$formatCurrency$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = bnplServFormatter$formatCurrency$1.getOutputMinFrameDuration;
        if (i2 != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public static /* synthetic */ java.lang.Object formatCurrency$default(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            currencyStyle = com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL;
        }
        if ((i2 & 4) != 0) {
            i = -1;
        }
        return bnplServFormatter.formatCurrency(money, currencyStyle, i, continuation);
    }

    public final java.lang.String formatApr(java.lang.String aprValue) {
        java.math.BigDecimal bigDecimalOrNull;
        if (aprValue == null || (bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(aprValue)) == null) {
            return "";
        }
        java.lang.String plainString = com.paypal.oslo.core.money.Tax$$ExternalSyntheticBackportWithForwarding0.m(bigDecimalOrNull).toPlainString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
        java.lang.String removeSuffix = kotlin.text.StringsKt.removeSuffix(plainString, (java.lang.CharSequence) ".0");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(removeSuffix);
        sb.append("%");
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String formatDate$default(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.DateFormat dateFormat, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            dateFormat = new com.paypal.oslo.core.i18n.domain.model.CustomStyle(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat.DATE_MONTH_DATE_SHORT.getPattern());
        }
        return bnplServFormatter.formatDate(str, dateFormat);
    }

    public final java.lang.String formatDate(java.lang.String dateString, com.paypal.oslo.core.i18n.domain.model.DateFormat style) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        java.lang.String str = dateString;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return "";
        }
        java.util.Date highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(dateString);
        if (highSpeedVideoFpsRangesFor == null) {
            return dateString;
        }
        java.lang.String id = this.Camera2StreamConfigurationMap.getTimezone().getID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(new com.paypal.oslo.core.i18n.domain.model.DateTime(highSpeedVideoFpsRangesFor, id), new com.paypal.oslo.core.i18n.domain.model.DateTimeConfiguration(style, this.Camera2StreamConfigurationMap.getUserLocale()));
        if (invoke instanceof arrow.core.Either.Right) {
            return (java.lang.String) ((arrow.core.Either.Right) invoke).getValue();
        }
        if (!(invoke instanceof arrow.core.Either.Left)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return dateString;
    }

    private final java.util.Date getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        for (java.lang.String str : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:ss'Z'", "yyyy-MM-dd'T'HH:mm:ssZ", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd"})) {
            try {
                try {
                    return new java.text.SimpleDateFormat(str, this.Camera2StreamConfigurationMap.getUserLocale()).parse(p0);
                } catch (java.text.ParseException e) {
                    e = e;
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.bnplservicing.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[3];
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName();
                    java.lang.String str2 = "";
                    if (simpleName == null) {
                        simpleName = "";
                    }
                    pairArr[0] = kotlin.TuplesKt.to("exception_type", simpleName);
                    java.lang.String message = e.getMessage();
                    if (message != null) {
                        str2 = message;
                    }
                    pairArr[1] = kotlin.TuplesKt.to("exception_message", str2);
                    pairArr[2] = kotlin.TuplesKt.to("context", "ISO date parsing with format: ".concat(java.lang.String.valueOf(str)));
                    com.paypal.android.logger.Logger.e$default(logger, "BnplServ | Formatter | ParseException", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
                }
            } catch (java.text.ParseException e2) {
                e = e2;
            }
        }
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, "BnplServ | Formatter | ParseIsoDate failed for all formats", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("date_string", p0)), null, null, 12, null);
        return null;
    }

    public static /* synthetic */ java.lang.Object formatDuration$default(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            relativeTimeStyle = com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle.DURATION_LONG;
        }
        return bnplServFormatter.formatDuration(str, relativeTimeStyle, continuation);
    }

    public final java.lang.Object formatDuration(java.lang.String str, com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        java.lang.String str2 = str;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
            return "";
        }
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.DateTimeError, java.lang.String> invoke = this.getHighSpeedVideoFpsRangesFor.invoke(str, new com.paypal.oslo.core.i18n.domain.model.RelativeTimeConfiguration(relativeTimeStyle, com.paypal.oslo.core.i18n.domain.model.DurationUnit.HOUR, this.Camera2StreamConfigurationMap.getUserLocale()));
        if (invoke instanceof arrow.core.Either.Right) {
            return (java.lang.String) ((arrow.core.Either.Right) invoke).getValue();
        }
        if (!(invoke instanceof arrow.core.Either.Left)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return str;
    }

    public final java.lang.Object formatDurationCompact(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        java.util.List<java.lang.String> groupValues;
        java.lang.String str2;
        java.lang.String str3 = str;
        if (str3 != null && !kotlin.text.StringsKt.isBlank(str3)) {
            java.lang.Long l = null;
            kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(new kotlin.text.Regex("^PT(\\d+)H"), str3, 0, 2, null);
            if (find$default != null && (groupValues = find$default.getGroupValues()) != null && (str2 = groupValues.get(1)) != null) {
                l = kotlin.text.StringsKt.toLongOrNull(str2);
            }
            if (l != null) {
                try {
                    java.lang.String format = android.icu.text.MeasureFormat.getInstance(this.Camera2StreamConfigurationMap.getUserLocale(), android.icu.text.MeasureFormat.FormatWidth.NARROW).format(new android.icu.util.Measure(l, android.icu.util.MeasureUnit.HOUR));
                    kotlin.jvm.internal.Intrinsics.checkNotNull(format);
                    return format;
                } catch (java.lang.IllegalArgumentException e) {
                    com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerUtilsKt.logBnplServException(com.paypal.oslo.feature.bnplservicing.LoggerKt.log, e, "FormatDurationCompact ICU failure");
                }
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object formatExpirationDuration(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter$formatExpirationDuration$1 bnplServFormatter$formatExpirationDuration$1;
        int i;
        java.lang.String str2;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter$formatExpirationDuration$1) {
            bnplServFormatter$formatExpirationDuration$1 = (com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter$formatExpirationDuration$1) continuation;
            if ((bnplServFormatter$formatExpirationDuration$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                bnplServFormatter$formatExpirationDuration$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter$formatExpirationDuration$1 bnplServFormatter$formatExpirationDuration$12 = bnplServFormatter$formatExpirationDuration$1;
                java.lang.Object obj = bnplServFormatter$formatExpirationDuration$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bnplServFormatter$formatExpirationDuration$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str3 = str;
                    if (str3 != null && !kotlin.text.StringsKt.isBlank(str3)) {
                        bnplServFormatter$formatExpirationDuration$12.Camera2StreamConfigurationMap = str;
                        bnplServFormatter$formatExpirationDuration$12.getHighSpeedVideoSizes = 1;
                        obj = formatDuration$default(this, str, null, bnplServFormatter$formatExpirationDuration$12, 2, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return "";
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) bnplServFormatter$formatExpirationDuration$12.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                str2 = (java.lang.String) obj;
                if (!kotlin.text.StringsKt.isBlank(str2) && !kotlin.jvm.internal.Intrinsics.areEqual(str2, str)) {
                    java.lang.String string = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_unused_vcc_expires_in_prefix, str2);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                    return string;
                }
                return "";
            }
        }
        bnplServFormatter$formatExpirationDuration$1 = new com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter$formatExpirationDuration$1(this, continuation);
        com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter$formatExpirationDuration$1 bnplServFormatter$formatExpirationDuration$122 = bnplServFormatter$formatExpirationDuration$1;
        java.lang.Object obj2 = bnplServFormatter$formatExpirationDuration$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bnplServFormatter$formatExpirationDuration$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        str2 = (java.lang.String) obj2;
        if (!kotlin.text.StringsKt.isBlank(str2)) {
            java.lang.String string2 = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_unused_vcc_expires_in_prefix, str2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(string2);
            return string2;
        }
        return "";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter$BnplServDateFormat;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "pattern", "Ljava/lang/String;", "getPattern$bnpl_servicing_prodRelease", "()Ljava/lang/String;", "DATE_MONTH_DATE_SHORT", "DATE_MONTH_DATE_YEAR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BnplServDateFormat {
        public static final com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat DATE_MONTH_DATE_SHORT;
        public static final com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat DATE_MONTH_DATE_YEAR;
        private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat[] getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        private final java.lang.String pattern;

        private BnplServDateFormat(java.lang.String str, int i, java.lang.String str2) {
            this.pattern = str2;
        }

        /* renamed from: getPattern$bnpl_servicing_prodRelease, reason: from getter */
        public final java.lang.String getPattern() {
            return this.pattern;
        }

        static {
            com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat bnplServDateFormat = new com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat("DATE_MONTH_DATE_SHORT", 0, "MMMd");
            DATE_MONTH_DATE_SHORT = bnplServDateFormat;
            com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat bnplServDateFormat2 = new com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat("DATE_MONTH_DATE_YEAR", 1, "MMMdyyyy");
            DATE_MONTH_DATE_YEAR = bnplServDateFormat2;
            com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat[] bnplServDateFormatArr = {bnplServDateFormat, bnplServDateFormat2};
            getHighSpeedVideoFpsRanges = bnplServDateFormatArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(bnplServDateFormatArr);
        }

        public static com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat[] values() {
            return (com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter.BnplServDateFormat> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }
}
