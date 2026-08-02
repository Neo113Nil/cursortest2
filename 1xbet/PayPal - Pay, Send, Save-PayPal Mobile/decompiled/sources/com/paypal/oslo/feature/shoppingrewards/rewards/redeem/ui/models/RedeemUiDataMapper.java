package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/RedeemUiDataMapper;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;)V", "", "exchangeRatePoints", "exchangeRateAmount", "currencyCode", "formatExchangeRateText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cashValue", "formatCashEquivalent$shopping_rewards_prodRelease", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemUiDataMapper {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation getHighResolutionOutputSizeshNQ4ISI;
    public static final int $stable = 8;

    @javax.inject.Inject
    public RedeemUiDataMapper(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        this.getHighSpeedVideoSizes = formatCurrencyUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = localeInformation;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object formatExchangeRateText(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper$formatExchangeRateText$1 redeemUiDataMapper$formatExchangeRateText$1;
        int i;
        int i2;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper$formatExchangeRateText$1) {
            redeemUiDataMapper$formatExchangeRateText$1 = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper$formatExchangeRateText$1) continuation;
            if ((redeemUiDataMapper$formatExchangeRateText$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                redeemUiDataMapper$formatExchangeRateText$1.getInputFormats -= 2147483648;
                java.lang.Object obj = redeemUiDataMapper$formatExchangeRateText$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = redeemUiDataMapper$formatExchangeRateText$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(str);
                    int intValue = (intOrNull != null ? intOrNull.intValue() : 1) * 100;
                    java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(str2);
                    double doubleValue = (doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d) * 100.0d;
                    redeemUiDataMapper$formatExchangeRateText$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    redeemUiDataMapper$formatExchangeRateText$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    redeemUiDataMapper$formatExchangeRateText$1.Camera2StreamConfigurationMap = str3;
                    redeemUiDataMapper$formatExchangeRateText$1.getHighSpeedVideoSizes = intValue;
                    redeemUiDataMapper$formatExchangeRateText$1.getHighSpeedVideoFpsRangesFor = doubleValue;
                    redeemUiDataMapper$formatExchangeRateText$1.getInputFormats = 1;
                    java.lang.Object formatCashEquivalent$shopping_rewards_prodRelease = formatCashEquivalent$shopping_rewards_prodRelease(str3, java.lang.String.valueOf(doubleValue), redeemUiDataMapper$formatExchangeRateText$1);
                    if (formatCashEquivalent$shopping_rewards_prodRelease == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = formatCashEquivalent$shopping_rewards_prodRelease;
                    i2 = intValue;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    double d = redeemUiDataMapper$formatExchangeRateText$1.getHighSpeedVideoFpsRangesFor;
                    i2 = redeemUiDataMapper$formatExchangeRateText$1.getHighSpeedVideoSizes;
                    str3 = (java.lang.String) redeemUiDataMapper$formatExchangeRateText$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(i2);
                sb.append(" points = ");
                sb.append((java.lang.String) obj);
                sb.append(" ");
                sb.append(str3);
                return sb.toString();
            }
        }
        redeemUiDataMapper$formatExchangeRateText$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper$formatExchangeRateText$1(this, continuation);
        java.lang.Object obj2 = redeemUiDataMapper$formatExchangeRateText$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = redeemUiDataMapper$formatExchangeRateText$1.getInputFormats;
        if (i != 0) {
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(i2);
        sb2.append(" points = ");
        sb2.append((java.lang.String) obj2);
        sb2.append(" ");
        sb2.append(str3);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object formatCashEquivalent$shopping_rewards_prodRelease(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper$formatCashEquivalent$1 redeemUiDataMapper$formatCashEquivalent$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper$formatCashEquivalent$1) {
            redeemUiDataMapper$formatCashEquivalent$1 = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper$formatCashEquivalent$1) continuation;
            if ((redeemUiDataMapper$formatCashEquivalent$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                redeemUiDataMapper$formatCashEquivalent$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = redeemUiDataMapper$formatCashEquivalent$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = redeemUiDataMapper$formatCashEquivalent$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(str2);
                    if (bigDecimalOrNull == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str);
                        sb.append(str2);
                        return sb.toString();
                    }
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(str), com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL, 0, this.getHighResolutionOutputSizeshNQ4ISI.getUserLocale(), null, 20, null);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = this.getHighSpeedVideoSizes;
                    redeemUiDataMapper$formatCashEquivalent$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    redeemUiDataMapper$formatCashEquivalent$1.getHighSpeedVideoFpsRangesFor = str2;
                    redeemUiDataMapper$formatCashEquivalent$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimalOrNull);
                    redeemUiDataMapper$formatCashEquivalent$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyConfiguration);
                    redeemUiDataMapper$formatCashEquivalent$1.getHighSpeedVideoSizes = 1;
                    obj = formatCurrencyUseCase.invoke(bigDecimalOrNull, currencyConfiguration, redeemUiDataMapper$formatCashEquivalent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) redeemUiDataMapper$formatCashEquivalent$1.getHighSpeedVideoFpsRangesFor;
                    str = (java.lang.String) redeemUiDataMapper$formatCashEquivalent$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (java.lang.String) ((arrow.core.Either.Right) either).getValue();
                }
                if (either instanceof arrow.core.Either.Left) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(str);
                    sb2.append(str2);
                    return sb2.toString();
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        redeemUiDataMapper$formatCashEquivalent$1 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper$formatCashEquivalent$1(this, continuation);
        java.lang.Object obj2 = redeemUiDataMapper$formatCashEquivalent$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = redeemUiDataMapper$formatCashEquivalent$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
