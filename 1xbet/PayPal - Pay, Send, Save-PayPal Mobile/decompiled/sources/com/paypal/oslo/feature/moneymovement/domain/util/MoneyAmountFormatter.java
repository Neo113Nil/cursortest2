package com.paypal.oslo.feature.moneymovement.domain.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\fJ\"\u0010\u0011\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;", "formatCurrencyUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;)V", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "moneyAmount", "", "isInternationalFormat", "", "format", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatFee", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$FiatDetails;", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount$FiatDetails;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatCurrencyUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MoneyAmountFormatter {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public MoneyAmountFormatter(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatCurrencyUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = formatCurrencyUseCase;
    }

    public static /* synthetic */ java.lang.Object format$default(com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return moneyAmountFormatter.format(moneyAmount, z, continuation);
    }

    public final java.lang.Object format(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, boolean z, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        int i = com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter.WhenMappings.$EnumSwitchMapping$0[moneyAmount.getType().ordinal()];
        if (i == 1) {
            return getHighSpeedVideoFpsRangesFor(moneyAmount.getFiat(), z, continuation);
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails crypto = moneyAmount.getCrypto();
        if (crypto == null) {
            throw new java.lang.IllegalArgumentException("crypto must be non-null when type is CRYPTO".toString());
        }
        java.lang.String quantity = crypto.getQuantity();
        java.lang.String assetSymbol = crypto.getAssetSymbol();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(quantity);
        sb.append(" ");
        sb.append(assetSymbol);
        return sb.toString();
    }

    public static /* synthetic */ java.lang.Object formatFee$default(com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return moneyAmountFormatter.formatFee(moneyAmount, z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (r10 != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ed, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object formatFee(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, boolean z, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter$formatFee$1 moneyAmountFormatter$formatFee$1;
        int i;
        java.lang.String quantity;
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter$formatFee$1) {
            moneyAmountFormatter$formatFee$1 = (com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter$formatFee$1) continuation;
            if ((moneyAmountFormatter$formatFee$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                moneyAmountFormatter$formatFee$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = moneyAmountFormatter$formatFee$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = moneyAmountFormatter$formatFee$1.getInputSizeshNQ4ISI;
                if (i == 0) {
                    if (i == 1) {
                        int i2 = moneyAmountFormatter$formatFee$1.getHighSpeedVideoSizes;
                        boolean z2 = moneyAmountFormatter$formatFee$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(obj);
                        sb.append(" fee");
                        return sb.toString();
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = moneyAmountFormatter$formatFee$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(obj);
                    sb2.append(" fee");
                    return sb2.toString();
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat = moneyAmount.getFiat();
                if (fiat == null || (quantity = fiat.getQuantity()) == null) {
                    com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails crypto = moneyAmount.getCrypto();
                    quantity = crypto != null ? crypto.getQuantity() : "0";
                }
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter = this;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(new java.math.BigDecimal(quantity));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                if (m23439exceptionOrNullimpl != null) {
                    moneyAmountFormatter$formatFee$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyAmount);
                    moneyAmountFormatter$formatFee$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(quantity);
                    moneyAmountFormatter$formatFee$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m23439exceptionOrNullimpl);
                    moneyAmountFormatter$formatFee$1.getHighSpeedVideoFpsRanges = z;
                    moneyAmountFormatter$formatFee$1.getHighSpeedVideoSizes = 0;
                    moneyAmountFormatter$formatFee$1.getInputSizeshNQ4ISI = 1;
                    obj = format(moneyAmount, z, moneyAmountFormatter$formatFee$1);
                } else {
                    java.math.BigDecimal bigDecimal = (java.math.BigDecimal) m23436constructorimpl;
                    if (bigDecimal.compareTo(java.math.BigDecimal.ZERO) == 0) {
                        return "No fee";
                    }
                    moneyAmountFormatter$formatFee$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyAmount);
                    moneyAmountFormatter$formatFee$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(quantity);
                    moneyAmountFormatter$formatFee$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimal);
                    moneyAmountFormatter$formatFee$1.getHighSpeedVideoFpsRanges = z;
                    moneyAmountFormatter$formatFee$1.getInputSizeshNQ4ISI = 2;
                    obj = format(moneyAmount, z, moneyAmountFormatter$formatFee$1);
                }
                return coroutine_suspended;
            }
        }
        moneyAmountFormatter$formatFee$1 = new com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter$formatFee$1(this, continuation);
        java.lang.Object obj2 = moneyAmountFormatter$formatFee$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moneyAmountFormatter$formatFee$1.getInputSizeshNQ4ISI;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiatDetails, boolean z, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter$formatFiat$1 moneyAmountFormatter$formatFiat$1;
        int i;
        java.lang.Object obj;
        java.lang.Object m23436constructorimpl;
        arrow.core.Either either;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiatDetails2 = fiatDetails;
        if (continuation instanceof com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter$formatFiat$1) {
            moneyAmountFormatter$formatFiat$1 = (com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter$formatFiat$1) continuation;
            if ((moneyAmountFormatter$formatFiat$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                moneyAmountFormatter$formatFiat$1.getOutputFormats -= 2147483648;
                java.lang.Object obj2 = moneyAmountFormatter$formatFiat$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = moneyAmountFormatter$formatFiat$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    if (fiatDetails2 == null) {
                        throw new java.lang.IllegalArgumentException("fiat must be non-null when type is CASH".toString());
                    }
                    java.lang.String currencyCode = fiatDetails.getCurrencyCode();
                    java.lang.String quantity = fiatDetails.getQuantity();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(currencyCode);
                    sb.append(" ");
                    sb.append(quantity);
                    obj = sb.toString();
                    com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration currencyConfiguration = new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(fiatDetails.getCurrencyCode()), z ? com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.INTERNATIONAL : com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL, 0, null, null, 28, null);
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter = this;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(new java.math.BigDecimal(fiatDetails.getQuantity()));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                    }
                    java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                    if (m23439exceptionOrNullimpl == null) {
                        java.math.BigDecimal bigDecimal = (java.math.BigDecimal) m23436constructorimpl;
                        com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase = this.getHighSpeedVideoFpsRangesFor;
                        moneyAmountFormatter$formatFiat$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fiatDetails);
                        moneyAmountFormatter$formatFiat$1.getHighSpeedVideoFpsRanges = fiatDetails2;
                        moneyAmountFormatter$formatFiat$1.getHighResolutionOutputSizeshNQ4ISI = obj;
                        moneyAmountFormatter$formatFiat$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyConfiguration);
                        moneyAmountFormatter$formatFiat$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bigDecimal);
                        moneyAmountFormatter$formatFiat$1.getInputSizeshNQ4ISI = z;
                        moneyAmountFormatter$formatFiat$1.getHighSpeedVideoSizes = 0;
                        moneyAmountFormatter$formatFiat$1.getOutputFormats = 1;
                        obj2 = formatCurrencyUseCase.invoke(bigDecimal, currencyConfiguration, moneyAmountFormatter$formatFiat$1);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        com.paypal.oslo.feature.moneymovement.LoggerKt.log.e("Failed to parse fiat quantity", m23439exceptionOrNullimpl);
                        return obj;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = moneyAmountFormatter$formatFiat$1.getHighSpeedVideoSizes;
                    boolean z2 = moneyAmountFormatter$formatFiat$1.getInputSizeshNQ4ISI;
                    java.lang.String str = (java.lang.String) moneyAmountFormatter$formatFiat$1.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiatDetails3 = (com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails) moneyAmountFormatter$formatFiat$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    obj = str;
                    fiatDetails2 = fiatDetails3;
                }
                either = (arrow.core.Either) obj2;
                if (!(either instanceof arrow.core.Either.Left)) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.moneymovement.LoggerKt.log, "FormatCurrencyUseCase failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", fiatDetails2.getCurrencyCode())), null, 4, null);
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    obj = ((arrow.core.Either.Right) either).getValue();
                }
                return (java.lang.String) obj;
            }
        }
        moneyAmountFormatter$formatFiat$1 = new com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter$formatFiat$1(this, continuation);
        java.lang.Object obj22 = moneyAmountFormatter$formatFiat$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moneyAmountFormatter$formatFiat$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj22;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        return (java.lang.String) obj;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.values().length];
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CASH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
