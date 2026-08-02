package com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\t\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\t\u0010\rJ(\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/formatter/currency/CurrencyFormatterFacadeImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "amount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormat;", "format", "", "digits", "", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormat;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requireFormat", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CurrencyFormatterFacadeImpl implements com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CurrencyFormatterFacadeImpl(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        this.Camera2StreamConfigurationMap = formatCurrencyUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object format(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat currencyFormat, int i, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl$format$1 currencyFormatterFacadeImpl$format$1;
        int i2;
        com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl$format$1) {
            currencyFormatterFacadeImpl$format$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl$format$1) continuation;
            if ((currencyFormatterFacadeImpl$format$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                currencyFormatterFacadeImpl$format$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = currencyFormatterFacadeImpl$format$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = currencyFormatterFacadeImpl$format$1.getInputSizeshNQ4ISI;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (currencyAmount == null) {
                        return null;
                    }
                    com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = this.Camera2StreamConfigurationMap;
                    java.math.BigDecimal bigDecimal = currencyAmount.toBigDecimal();
                    java.lang.String m11384constructorimpl = com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(currencyAmount.getCurrencyCode());
                    if (kotlin.jvm.internal.Intrinsics.areEqual(currencyFormat, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Code.INSTANCE)) {
                        currencyStyle = com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.CODE;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(currencyFormat, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.International.INSTANCE)) {
                        currencyStyle = com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.INTERNATIONAL;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(currencyFormat, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.None.INSTANCE)) {
                        currencyStyle = com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.NAME;
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(currencyFormat, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat.Symbol.INSTANCE)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        currencyStyle = com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL;
                    }
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(m11384constructorimpl, currencyStyle, i, null, null, 24, null);
                    currencyFormatterFacadeImpl$format$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount);
                    currencyFormatterFacadeImpl$format$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyFormat);
                    currencyFormatterFacadeImpl$format$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyAmount);
                    currencyFormatterFacadeImpl$format$1.getHighSpeedVideoSizes = i;
                    currencyFormatterFacadeImpl$format$1.getHighSpeedVideoFpsRangesFor = 0;
                    currencyFormatterFacadeImpl$format$1.getInputSizeshNQ4ISI = 1;
                    obj = formatCurrencyUseCase.invoke(bigDecimal, currencyConfiguration, currencyFormatterFacadeImpl$format$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = currencyFormatterFacadeImpl$format$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = currencyFormatterFacadeImpl$format$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) ((arrow.core.Either) obj).getOrNull();
                if (str != null) {
                    return null;
                }
                java.lang.String str2 = str;
                int i5 = 0;
                for (int i6 = 0; i6 < str2.length(); i6++) {
                    if (str2.charAt(i6) == '-') {
                        i5++;
                    }
                }
                if (i5 >= 2) {
                    str = "-".concat(java.lang.String.valueOf(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.removePrefix(str, (java.lang.CharSequence) "-"), "-", "", false, 4, (java.lang.Object) null)));
                }
                if (str == null) {
                    return null;
                }
                int lastIndexOf$default = kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, 0, false, 6, (java.lang.Object) null);
                if (lastIndexOf$default == -1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str);
                    sb.append(".00");
                    return sb.toString();
                }
                if (str.length() - lastIndexOf$default != 2) {
                    return str;
                }
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append("0");
                return sb2.toString();
            }
        }
        currencyFormatterFacadeImpl$format$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl$format$1(this, continuation);
        java.lang.Object obj2 = currencyFormatterFacadeImpl$format$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = currencyFormatterFacadeImpl$format$1.getInputSizeshNQ4ISI;
        if (i2 != 0) {
        }
        str = (java.lang.String) ((arrow.core.Either) obj2).getOrNull();
        if (str != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object requireFormat(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormat currencyFormat, int i, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl$requireFormat$1 currencyFormatterFacadeImpl$requireFormat$1;
        int i2;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl$requireFormat$1) {
            currencyFormatterFacadeImpl$requireFormat$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl$requireFormat$1) continuation;
            if ((currencyFormatterFacadeImpl$requireFormat$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                currencyFormatterFacadeImpl$requireFormat$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = currencyFormatterFacadeImpl$requireFormat$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = currencyFormatterFacadeImpl$requireFormat$1.getHighSpeedVideoSizes;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    currencyFormatterFacadeImpl$requireFormat$1.getHighSpeedVideoFpsRangesFor = currencyAmount;
                    currencyFormatterFacadeImpl$requireFormat$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyFormat);
                    currencyFormatterFacadeImpl$requireFormat$1.getHighResolutionOutputSizeshNQ4ISI = i;
                    currencyFormatterFacadeImpl$requireFormat$1.getHighSpeedVideoSizes = 1;
                    obj = format(currencyAmount, currencyFormat, i, currencyFormatterFacadeImpl$requireFormat$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = currencyFormatterFacadeImpl$requireFormat$1.getHighResolutionOutputSizeshNQ4ISI;
                    currencyAmount = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) currencyFormatterFacadeImpl$requireFormat$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    return str;
                }
                throw new java.lang.IllegalStateException("Null format was not expected here ".concat(java.lang.String.valueOf(currencyAmount)).toString());
            }
        }
        currencyFormatterFacadeImpl$requireFormat$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl$requireFormat$1(this, continuation);
        java.lang.Object obj2 = currencyFormatterFacadeImpl$requireFormat$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = currencyFormatterFacadeImpl$requireFormat$1.getHighSpeedVideoSizes;
        if (i2 != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
    }
}
