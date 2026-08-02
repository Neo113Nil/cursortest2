package com.paypal.oslo.feature.taptopay.data.repository.payair;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 82\u00020\u0001:\u00018B)\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u000eJ\u001d\u0010 \u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b \u0010\u0018J\u0015\u0010!\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010'R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010.R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00102R*\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0018\u0001038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00104R$\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u0001058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u00106"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentListener;", "", "Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentDataSource;", "paymentDataSource", "Lcom/payair/logic/managers/TokenManager;", "tokenManager", "Lcom/payair/logic/managers/PaymentManager;", "paymentManager", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentDataSource;Lcom/payair/logic/managers/TokenManager;Lcom/payair/logic/managers/PaymentManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "onPaymentAuthentication", "()V", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "result", "onPaymentAuthenticationSuccess", "(Landroidx/biometric/BiometricPrompt$AuthenticationResult;)V", "", "networkTokenReference", "Lcom/payair/listener/model/TransactionEventData;", "transactionEventData", "onPaymentCompleted", "(Ljava/lang/String;Lcom/payair/listener/model/TransactionEventData;)V", "", "eventError", "", "eventText", "onAuthenticationCancelled", "(ILjava/lang/CharSequence;)V", "onAuthenticationFailed", "onPaymentAborted", "onPaymentStopped", "(Lcom/payair/listener/model/TransactionEventData;)V", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/taptopay/domain/model/payment/PaymentState;)V", "Lcom/paypal/oslo/feature/taptopay/data/repository/payair/PayairPaymentDataSource;", "getInputSizeshNQ4ISI", "Lcom/payair/logic/managers/TokenManager;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "Lcom/payair/logic/managers/PaymentManager;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoSizes", "Lkotlin/Function0;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOutputMinFrameDuration", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayairPaymentListener {
    private kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.biometric.BiometricPrompt.AuthenticationResult, kotlin.Unit> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.CharSequence, kotlin.Unit> getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.payair.logic.managers.TokenManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.payair.logic.managers.PaymentManager getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public PayairPaymentListener(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentDataSource payairPaymentDataSource, com.payair.logic.managers.TokenManager tokenManager, com.payair.logic.managers.PaymentManager paymentManager, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payairPaymentDataSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRanges = payairPaymentDataSource;
        this.getHighResolutionOutputSizeshNQ4ISI = tokenManager;
        this.getHighSpeedVideoFpsRangesFor = paymentManager;
        this.getHighSpeedVideoSizes = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$mapTransactionContext(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener payairPaymentListener, com.payair.listener.model.TransactionEventData transactionEventData, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$mapTransactionContext$1 payairPaymentListener$mapTransactionContext$1;
        int i;
        java.math.BigDecimal valueOf;
        com.payair.listener.model.TransactionEventData transactionEventData2;
        java.lang.Object localTokenDetails;
        double d;
        com.payair.model.TokenStatus tokenStatus;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status;
        int i2;
        com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme;
        java.lang.String tokenExpiryMonth;
        java.lang.String tokenExpiryYear;
        com.payair.model.TokenDetails tokenDetails;
        com.payair.model.TokenInfoModel tokenInfo;
        com.payair.model.TokenDetails tokenDetails2;
        com.payair.model.TokenInfoModel tokenInfo2;
        com.payair.model.TokenDetails tokenDetails3;
        com.payair.model.TokenDetails tokenDetails4;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$mapTransactionContext$1) {
            payairPaymentListener$mapTransactionContext$1 = (com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$mapTransactionContext$1) continuation;
            if ((payairPaymentListener$mapTransactionContext$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                payairPaymentListener$mapTransactionContext$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = payairPaymentListener$mapTransactionContext$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payairPaymentListener$mapTransactionContext$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    double longValue = transactionEventData.getAmount() != null ? r2.longValue() : 0.0d;
                    java.lang.Long amount = transactionEventData.getAmount();
                    long longValue2 = amount != null ? amount.longValue() : 0L;
                    java.util.Currency currency = transactionEventData.getCurrency();
                    valueOf = java.math.BigDecimal.valueOf(longValue2, currency != null ? currency.getDefaultFractionDigits() : 2);
                    com.payair.logic.managers.TokenManager tokenManager = payairPaymentListener.getHighResolutionOutputSizeshNQ4ISI;
                    transactionEventData2 = transactionEventData;
                    java.lang.String str3 = str2 == null ? "" : str2;
                    payairPaymentListener$mapTransactionContext$1.getHighResolutionOutputSizeshNQ4ISI = transactionEventData2;
                    payairPaymentListener$mapTransactionContext$1.getHighSpeedVideoSizes = str2;
                    payairPaymentListener$mapTransactionContext$1.Camera2StreamConfigurationMap = valueOf;
                    payairPaymentListener$mapTransactionContext$1.getHighSpeedVideoFpsRangesFor = longValue;
                    payairPaymentListener$mapTransactionContext$1.getHighSpeedVideoFpsRanges = 1;
                    localTokenDetails = tokenManager.getLocalTokenDetails(str3, false, payairPaymentListener$mapTransactionContext$1);
                    if (localTokenDetails == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    d = longValue;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    double d2 = payairPaymentListener$mapTransactionContext$1.getHighSpeedVideoFpsRangesFor;
                    java.math.BigDecimal bigDecimal = (java.math.BigDecimal) payairPaymentListener$mapTransactionContext$1.Camera2StreamConfigurationMap;
                    java.lang.String str4 = (java.lang.String) payairPaymentListener$mapTransactionContext$1.getHighSpeedVideoSizes;
                    com.payair.listener.model.TransactionEventData transactionEventData3 = (com.payair.listener.model.TransactionEventData) payairPaymentListener$mapTransactionContext$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    transactionEventData2 = transactionEventData3;
                    d = d2;
                    localTokenDetails = obj;
                    valueOf = bigDecimal;
                    str2 = str4;
                }
                com.payair.model.TokenDetailsWithAsset tokenDetailsWithAsset = (com.payair.model.TokenDetailsWithAsset) localTokenDetails;
                com.payair.logic.managers.PaymentManager paymentManager = payairPaymentListener.getHighSpeedVideoFpsRangesFor;
                if (str2 == null) {
                    str2 = "";
                }
                int numberOfPaymentKeys = paymentManager.getNumberOfPaymentKeys(str2);
                tokenStatus = (tokenDetailsWithAsset != null || (tokenDetails4 = tokenDetailsWithAsset.getTokenDetails()) == null) ? null : tokenDetails4.getTokenStatus();
                switch (tokenStatus != null ? -1 : com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.WhenMappings.$EnumSwitchMapping$1[tokenStatus.ordinal()]) {
                    case -1:
                        status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Unknown;
                        break;
                    case 0:
                    default:
                        throw new kotlin.NoWhenBranchMatchedException();
                    case 1:
                        status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Active;
                        break;
                    case 2:
                        status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Suspended;
                        break;
                    case 3:
                        status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.PendingActivation;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Expired;
                        break;
                    case 7:
                        status = com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.Unknown;
                        break;
                }
                com.payair.model.CardScheme scheme = (tokenDetailsWithAsset != null || (tokenDetails3 = tokenDetailsWithAsset.getTokenDetails()) == null) ? null : tokenDetails3.getScheme();
                i2 = scheme != null ? -1 : com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.WhenMappings.$EnumSwitchMapping$2[scheme.ordinal()];
                if (i2 != -1) {
                    cardScheme = com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.UNKNOWN;
                } else if (i2 == 1) {
                    cardScheme = com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.MASTERCARD;
                } else {
                    if (i2 != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    cardScheme = com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme.VISA;
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme2 = cardScheme;
                java.util.Date date = new java.util.Date();
                tokenExpiryMonth = (tokenDetailsWithAsset != null || (tokenDetails2 = tokenDetailsWithAsset.getTokenDetails()) == null || (tokenInfo2 = tokenDetails2.getTokenInfo()) == null) ? null : tokenInfo2.getTokenExpiryMonth();
                if (tokenExpiryMonth == null) {
                    tokenExpiryMonth = "";
                }
                tokenExpiryYear = (tokenDetailsWithAsset != null || (tokenDetails = tokenDetailsWithAsset.getTokenDetails()) == null || (tokenInfo = tokenDetails.getTokenInfo()) == null) ? null : tokenInfo.getTokenExpiryYear();
                if (tokenExpiryYear == null) {
                    tokenExpiryYear = "";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(tokenExpiryMonth);
                sb.append(tokenExpiryYear);
                java.lang.String obj2 = sb.toString();
                double doubleValue = valueOf.doubleValue();
                java.util.Currency currency2 = transactionEventData2.getCurrency();
                java.lang.String currencyCode = currency2 != null ? currency2.getCurrencyCode() : null;
                java.lang.String str5 = currencyCode != null ? "" : currencyCode;
                com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus digitizedCardStatus = new com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus(obj2, numberOfPaymentKeys, status, false);
                java.lang.String obj3 = date.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
                return new com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionContext("", doubleValue, str5, digitizedCardStatus, d, cardScheme2, obj3, com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.UNKNOWN);
            }
        }
        payairPaymentListener$mapTransactionContext$1 = new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$mapTransactionContext$1(payairPaymentListener, continuation);
        java.lang.Object obj4 = payairPaymentListener$mapTransactionContext$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payairPaymentListener$mapTransactionContext$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.payair.model.TokenDetailsWithAsset tokenDetailsWithAsset2 = (com.payair.model.TokenDetailsWithAsset) localTokenDetails;
        com.payair.logic.managers.PaymentManager paymentManager2 = payairPaymentListener.getHighSpeedVideoFpsRangesFor;
        if (str2 == null) {
        }
        int numberOfPaymentKeys2 = paymentManager2.getNumberOfPaymentKeys(str2);
        if (tokenDetailsWithAsset2 != null) {
        }
        switch (tokenStatus != null ? -1 : com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.WhenMappings.$EnumSwitchMapping$1[tokenStatus.ordinal()]) {
        }
        if (tokenDetailsWithAsset2 != null) {
        }
        if (scheme != null) {
        }
        if (i2 != -1) {
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.CardScheme cardScheme22 = cardScheme;
        java.util.Date date2 = new java.util.Date();
        if (tokenDetailsWithAsset2 != null) {
        }
        if (tokenExpiryMonth == null) {
        }
        if (tokenDetailsWithAsset2 != null) {
        }
        if (tokenExpiryYear == null) {
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(tokenExpiryMonth);
        sb2.append(tokenExpiryYear);
        java.lang.String obj22 = sb2.toString();
        double doubleValue2 = valueOf.doubleValue();
        java.util.Currency currency22 = transactionEventData2.getCurrency();
        if (currency22 != null) {
        }
        if (currencyCode != null) {
        }
        com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus digitizedCardStatus2 = new com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus(obj22, numberOfPaymentKeys2, status, false);
        java.lang.String obj32 = date2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj32, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionContext("", doubleValue2, str5, digitizedCardStatus2, d, cardScheme22, obj32, com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.UNKNOWN);
    }

    public final void onPaymentAuthentication() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onPaymentAuthentication", null, null, 6, null);
        getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.FirstTapCompleted.INSTANCE);
        getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.AuthenticationRequired(com.paypal.oslo.feature.taptopay.domain.model.payment.AuthenticationMethod.BIOMETRICS, 0L, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.$r8$lambda$_yOA1dno5LeQTFR0Zra8bwlXX3E(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.this, (androidx.fragment.app.FragmentActivity) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.$r8$lambda$uQiD3oyIrWd0EljSE8YNntNlRkQ(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.this, (kotlin.jvm.functions.Function0) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.$r8$lambda$C2qQMrKRXJ6xTbCFdY3e3_64P8M(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.this, (kotlin.jvm.functions.Function2) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.m20022$r8$lambda$k2oBnLgQsjK1Xbaw9MAPgQvBA(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.this, (kotlin.jvm.functions.Function1) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                ((java.lang.Boolean) obj).booleanValue();
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        }));
    }

    public final void onPaymentAuthenticationSuccess(androidx.biometric.BiometricPrompt.AuthenticationResult result) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
        int authenticationType = result.getAuthenticationType();
        if (authenticationType == 1) {
            str = "DEVICE_CREDENTIAL";
        } else if (authenticationType == 2) {
            str = "BIOMETRIC";
        } else {
            str = "UNKNOWN";
        }
        com.paypal.android.logger.Logger.d$default(logger, "onPaymentAuthenticationSuccess", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("result", str)), null, 4, null);
        getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Success.ReadyForSecondTap.INSTANCE);
        kotlin.jvm.functions.Function1<? super androidx.biometric.BiometricPrompt.AuthenticationResult, kotlin.Unit> function1 = this.getOutputMinFrameDuration;
        if (function1 != null) {
            function1.invoke(result);
        }
    }

    public final void onPaymentCompleted(java.lang.String networkTokenReference, com.payair.listener.model.TransactionEventData transactionEventData) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onPaymentCompleted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", networkTokenReference), kotlin.TuplesKt.to("transactionEventData", transactionEventData)), null, 4, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.getHighSpeedVideoSizes), null, null, new com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener$onPaymentCompleted$1(transactionEventData, this, networkTokenReference, null), 3, null);
    }

    public final void onAuthenticationCancelled(int eventError, java.lang.CharSequence eventText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventText, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onAuthenticationCancelled", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("eventError", java.lang.Integer.valueOf(eventError)), kotlin.TuplesKt.to("eventText", eventText)), null, 4, null);
        kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.CharSequence, kotlin.Unit> function2 = this.getOutputFormats;
        if (function2 != null) {
            function2.invoke(java.lang.Integer.valueOf(eventError), eventText);
        }
    }

    public final void onAuthenticationFailed() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onAuthenticationFailed", null, null, 6, null);
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.Camera2StreamConfigurationMap;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void onPaymentAborted(java.lang.String networkTokenReference, com.payair.listener.model.TransactionEventData transactionEventData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEventData, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onPaymentAborted", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", networkTokenReference), kotlin.TuplesKt.to("transactionEventData", transactionEventData)), null, 4, null);
        com.payair.listener.model.TransactionStatus transactionStatus = transactionEventData.getTransactionStatus();
        java.lang.String name2 = transactionStatus != null ? transactionStatus.name() : null;
        getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.TransactionInterrupted(1, name2 != null ? name2 : "", 3));
    }

    public final void onPaymentStopped(com.payair.listener.model.TransactionEventData transactionEventData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEventData, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "onPaymentStopped", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("transactionEventData", transactionEventData)), null, 4, null);
        getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.TransactionError(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.UNKNOWN));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState p0) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Updating payment state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("state", p0.toLogString())), null, 4, null);
        this.getHighSpeedVideoFpsRanges.updateState(p0);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$C2qQMrKRXJ6xTbCFdY3e3_64P8M(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener payairPaymentListener, kotlin.jvm.functions.Function2 function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        payairPaymentListener.getOutputFormats = function2;
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_yOA1dno5LeQTFR0Zra8bwlXX3E(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener payairPaymentListener, androidx.fragment.app.FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "");
        payairPaymentListener.getHighSpeedVideoFpsRangesFor.authenticatePayment(fragmentActivity);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$k2o--BnLgQsjK1Xbaw9MAPgQvBA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20022$r8$lambda$k2oBnLgQsjK1Xbaw9MAPgQvBA(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener payairPaymentListener, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        payairPaymentListener.getOutputMinFrameDuration = function1;
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uQiD3oyIrWd0EljSE8YNntNlRkQ(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener payairPaymentListener, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        payairPaymentListener.Camera2StreamConfigurationMap = function0;
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure access$mapTransactionStatus(com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener payairPaymentListener, com.payair.listener.model.TransactionEventData transactionEventData) {
        com.payair.listener.model.TransactionStatus transactionStatus = transactionEventData != null ? transactionEventData.getTransactionStatus() : null;
        switch (transactionStatus == null ? -1 : com.paypal.oslo.feature.taptopay.data.repository.payair.PayairPaymentListener.WhenMappings.$EnumSwitchMapping$0[transactionStatus.ordinal()]) {
        }
        return new com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState.Failure.TransactionError(com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentErrorCode.UNKNOWN);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[com.payair.listener.model.TransactionStatus.values().length];
            try {
                iArr[com.payair.listener.model.TransactionStatus.TERMINAL_ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.payair.listener.model.TransactionStatus.CARD_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.payair.listener.model.TransactionStatus.DECLINE_BY_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.payair.listener.model.TransactionStatus.BIOMETRIC_ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.payair.listener.model.TransactionStatus.DECLINE_BY_TERMINAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.payair.listener.model.TransactionStatus.WALLET_CANCEL_REQUEST.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.payair.listener.model.TransactionStatus.GENERAL_ERROR.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.payair.model.TokenStatus.values().length];
            try {
                iArr2[com.payair.model.TokenStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.payair.model.TokenStatus.SUSPENDED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.payair.model.TokenStatus.INACTIVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[com.payair.model.TokenStatus.DEACTIVATED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr2[com.payair.model.TokenStatus.DECLINED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr2[com.payair.model.TokenStatus.DELETED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr2[com.payair.model.TokenStatus.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.payair.model.CardScheme.values().length];
            try {
                iArr3[com.payair.model.CardScheme.MASTERCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr3[com.payair.model.CardScheme.VISA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }
}
