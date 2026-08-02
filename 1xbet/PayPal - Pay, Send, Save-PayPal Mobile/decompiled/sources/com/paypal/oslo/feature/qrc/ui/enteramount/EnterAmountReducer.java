package com.paypal.oslo.feature.qrc.ui.enteramount;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000e0\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountReducer;", "Lcom/paypal/oslo/core/mvi/Reducer;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountUiState;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;", "Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountUiEffect;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "state", "event", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "reduce", "(Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountUiState;Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "navArgs", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "getNavArgs", "()Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "setNavArgs", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnterAmountReducer implements com.paypal.oslo.core.mvi.Reducer<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiEffect> {
    public static final int $stable = 8;
    public com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs navArgs;

    @javax.inject.Inject
    public EnterAmountReducer() {
    }

    @Override // com.paypal.oslo.core.mvi.Reducer
    public final java.lang.String getName() {
        return "EnterAmountReducer";
    }

    public final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs getNavArgs() {
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs = this.navArgs;
        if (qrcSessionNavArgs != null) {
            return qrcSessionNavArgs;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setNavArgs(com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
        this.navArgs = qrcSessionNavArgs;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c1  */
    @Override // com.paypal.oslo.core.mvi.Reducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiEffect>> reduce(com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState state, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent event) {
        com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiModel copy;
        com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiModel copy2;
        com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiModel copy3;
        com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiModel copy4;
        com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiModel copy5;
        java.lang.Integer num;
        com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState.Content content;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney;
        com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs copy6;
        com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiModel copy7;
        com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiModel copy8;
        int i;
        java.lang.String name2;
        java.lang.String str;
        java.lang.String extractInitials;
        com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldFxRate paypalWorldFxRate;
        com.paypal.oslo.feature.qrc.domain.model.session.Address address;
        java.lang.String displayInitials;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(state instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState.Initial)) {
            if (!(state instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState.Content)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState.Content content2 = (com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState.Content) state;
            if (!(event instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.ContinuePressed)) {
                if (event instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.BackPressed) {
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content2, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiEffect.NavigateBack.INSTANCE);
                }
                if (!(event instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.ClosePressed)) {
                    if (!(event instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.ConfirmCancelPayment)) {
                        if (event instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.CancelPaymentComplete) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content2, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiEffect.CloseFlow.INSTANCE);
                        }
                        if (!(event instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.DismissDialog)) {
                            if (!(event instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.AmountChanged)) {
                                if (event instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.SecondaryAmountChanged) {
                                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content2, null, 2, null);
                                }
                                return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(content2, event);
                            }
                            copy = r6.copy((r28 & 1) != 0 ? r6.amount : ((com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.AmountChanged) event).getNewAmount(), (r28 & 2) != 0 ? r6.merchantName : null, (r28 & 4) != 0 ? r6.merchantInitials : null, (r28 & 8) != 0 ? r6.currencyCode : null, (r28 & 16) != 0 ? r6.merchantCountryCode : null, (r28 & 32) != 0 ? r6.showPaymentCancellationDialog : false, (r28 & 64) != 0 ? r6.isPalpalWorldQr : false, (r28 & 128) != 0 ? r6.ppwTransactionDetails : null, (r28 & 256) != 0 ? r6.ppwFxRate : null, (r28 & 512) != 0 ? r6.isCancellationInProgress : false, (r28 & 1024) != 0 ? r6.errorMessage : null, (r28 & 2048) != 0 ? r6.maxAllowedAmount : null, (r28 & 4096) != 0 ? content2.getUiModel().maxAllowedCurrency : null);
                            copy2 = copy.copy((r28 & 1) != 0 ? copy.amount : null, (r28 & 2) != 0 ? copy.merchantName : null, (r28 & 4) != 0 ? copy.merchantInitials : null, (r28 & 8) != 0 ? copy.currencyCode : null, (r28 & 16) != 0 ? copy.merchantCountryCode : null, (r28 & 32) != 0 ? copy.showPaymentCancellationDialog : false, (r28 & 64) != 0 ? copy.isPalpalWorldQr : false, (r28 & 128) != 0 ? copy.ppwTransactionDetails : null, (r28 & 256) != 0 ? copy.ppwFxRate : null, (r28 & 512) != 0 ? copy.isCancellationInProgress : false, (r28 & 1024) != 0 ? copy.errorMessage : copy.isValidAmount$qrc_prodRelease() ? null : content2.getUiModel().getErrorMessage(), (r28 & 2048) != 0 ? copy.maxAllowedAmount : null, (r28 & 4096) != 0 ? copy.maxAllowedCurrency : null);
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content2.copy(copy2), null, 2, null);
                        }
                        copy3 = r6.copy((r28 & 1) != 0 ? r6.amount : null, (r28 & 2) != 0 ? r6.merchantName : null, (r28 & 4) != 0 ? r6.merchantInitials : null, (r28 & 8) != 0 ? r6.currencyCode : null, (r28 & 16) != 0 ? r6.merchantCountryCode : null, (r28 & 32) != 0 ? r6.showPaymentCancellationDialog : false, (r28 & 64) != 0 ? r6.isPalpalWorldQr : false, (r28 & 128) != 0 ? r6.ppwTransactionDetails : null, (r28 & 256) != 0 ? r6.ppwFxRate : null, (r28 & 512) != 0 ? r6.isCancellationInProgress : false, (r28 & 1024) != 0 ? r6.errorMessage : null, (r28 & 2048) != 0 ? r6.maxAllowedAmount : null, (r28 & 4096) != 0 ? content2.getUiModel().maxAllowedCurrency : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content2.copy(copy3), null, 2, null);
                    }
                    copy4 = r6.copy((r28 & 1) != 0 ? r6.amount : null, (r28 & 2) != 0 ? r6.merchantName : null, (r28 & 4) != 0 ? r6.merchantInitials : null, (r28 & 8) != 0 ? r6.currencyCode : null, (r28 & 16) != 0 ? r6.merchantCountryCode : null, (r28 & 32) != 0 ? r6.showPaymentCancellationDialog : false, (r28 & 64) != 0 ? r6.isPalpalWorldQr : false, (r28 & 128) != 0 ? r6.ppwTransactionDetails : null, (r28 & 256) != 0 ? r6.ppwFxRate : null, (r28 & 512) != 0 ? r6.isCancellationInProgress : true, (r28 & 1024) != 0 ? r6.errorMessage : null, (r28 & 2048) != 0 ? r6.maxAllowedAmount : null, (r28 & 4096) != 0 ? content2.getUiModel().maxAllowedCurrency : null);
                    return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content2.copy(copy4), null);
                }
                copy5 = r6.copy((r28 & 1) != 0 ? r6.amount : null, (r28 & 2) != 0 ? r6.merchantName : null, (r28 & 4) != 0 ? r6.merchantInitials : null, (r28 & 8) != 0 ? r6.currencyCode : null, (r28 & 16) != 0 ? r6.merchantCountryCode : null, (r28 & 32) != 0 ? r6.showPaymentCancellationDialog : true, (r28 & 64) != 0 ? r6.isPalpalWorldQr : false, (r28 & 128) != 0 ? r6.ppwTransactionDetails : null, (r28 & 256) != 0 ? r6.ppwFxRate : null, (r28 & 512) != 0 ? r6.isCancellationInProgress : false, (r28 & 1024) != 0 ? r6.errorMessage : null, (r28 & 2048) != 0 ? r6.maxAllowedAmount : null, (r28 & 4096) != 0 ? content2.getUiModel().maxAllowedCurrency : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content2.copy(copy5), null, 2, null);
            }
            if (content2.getUiModel().isValidAmount$qrc_prodRelease()) {
                num = null;
            } else {
                if (kotlin.text.StringsKt.endsWith$default(content2.getUiModel().getAmount(), ".", false, 2, (java.lang.Object) null)) {
                    i = com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_message_error_invalid_amount;
                } else {
                    i = com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_message_zero_amount;
                }
                num = java.lang.Integer.valueOf(i);
            }
            if (num == null) {
                com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney maximumAllowedTransactionAmount = getNavArgs().getTransactionDetails().getMaximumAllowedTransactionAmount();
                if (maximumAllowedTransactionAmount != null) {
                    double parseDouble = java.lang.Double.parseDouble(content2.getUiModel().getAmount());
                    double parseDouble2 = java.lang.Double.parseDouble(maximumAllowedTransactionAmount.getValue());
                    if (parseDouble > parseDouble2) {
                        copy7 = r10.copy((r28 & 1) != 0 ? r10.amount : null, (r28 & 2) != 0 ? r10.merchantName : null, (r28 & 4) != 0 ? r10.merchantInitials : null, (r28 & 8) != 0 ? r10.currencyCode : null, (r28 & 16) != 0 ? r10.merchantCountryCode : null, (r28 & 32) != 0 ? r10.showPaymentCancellationDialog : false, (r28 & 64) != 0 ? r10.isPalpalWorldQr : false, (r28 & 128) != 0 ? r10.ppwTransactionDetails : null, (r28 & 256) != 0 ? r10.ppwFxRate : null, (r28 & 512) != 0 ? r10.isCancellationInProgress : false, (r28 & 1024) != 0 ? r10.errorMessage : java.lang.Integer.valueOf(com.paypal.oslo.feature.qrc.R.string.feature_qrc_error_message_tip_limit), (r28 & 2048) != 0 ? r10.maxAllowedAmount : java.lang.Double.valueOf(parseDouble2), (r28 & 4096) != 0 ? content2.getUiModel().maxAllowedCurrency : maximumAllowedTransactionAmount.getCurrencyCode());
                        content = content2.copy(copy7);
                        if (content == null) {
                            return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content, null, 2, null);
                        }
                        java.lang.String formattedApiAmount = com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.toFormattedApiAmount(content2.getUiModel().getAmount());
                        com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails transactionDetails = getNavArgs().getTransactionDetails();
                        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount = getNavArgs().getTransactionDetails().getPaymentAmount();
                        if (paymentAmount == null || (qrcMoney = com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney.copy$default(paymentAmount, null, formattedApiAmount, 1, null)) == null) {
                            java.lang.String transactionCurrency = getNavArgs().getTransactionDetails().getTransactionCurrency();
                            qrcMoney = new com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney(transactionCurrency != null ? transactionCurrency : "", formattedApiAmount);
                        }
                        copy6 = r14.copy((r26 & 1) != 0 ? r14.sessionId : null, (r26 & 2) != 0 ? r14.mode : null, (r26 & 4) != 0 ? r14.qrCodeType : null, (r26 & 8) != 0 ? r14.pointOfInitiationMethod : null, (r26 & 16) != 0 ? r14.productFlow : null, (r26 & 32) != 0 ? r14.requiredAction : null, (r26 & 64) != 0 ? r14.transactionDetails : com.paypal.oslo.feature.qrc.domain.model.session.QrcTransactionDetails.copy$default(transactionDetails, null, qrcMoney, null, null, null, 29, null), (r26 & 128) != 0 ? r14.participants : null, (r26 & 256) != 0 ? r14.tipDetails : null, (r26 & 512) != 0 ? r14.paypalWorldDetails : null, (r26 & 1024) != 0 ? r14.paymentResponse : null, (r26 & 2048) != 0 ? getNavArgs().paymentOptions : null);
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(content2, new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiEffect.NavigateToReview(copy6));
                    }
                }
                content = null;
                if (content == null) {
                }
            } else {
                copy8 = r6.copy((r28 & 1) != 0 ? r6.amount : null, (r28 & 2) != 0 ? r6.merchantName : null, (r28 & 4) != 0 ? r6.merchantInitials : null, (r28 & 8) != 0 ? r6.currencyCode : null, (r28 & 16) != 0 ? r6.merchantCountryCode : null, (r28 & 32) != 0 ? r6.showPaymentCancellationDialog : false, (r28 & 64) != 0 ? r6.isPalpalWorldQr : false, (r28 & 128) != 0 ? r6.ppwTransactionDetails : null, (r28 & 256) != 0 ? r6.ppwFxRate : null, (r28 & 512) != 0 ? r6.isCancellationInProgress : false, (r28 & 1024) != 0 ? r6.errorMessage : num, (r28 & 2048) != 0 ? r6.maxAllowedAmount : null, (r28 & 4096) != 0 ? content2.getUiModel().maxAllowedCurrency : null);
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(content2.copy(copy8), null, 2, null);
            }
        } else {
            com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState.Initial initial = (com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState.Initial) state;
            if (event instanceof com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.LoadScreen) {
                com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.LoadScreen loadScreen = (com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent.LoadScreen) event;
                setNavArgs(loadScreen.getNavArgs());
                com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant = loadScreen.getNavArgs().getParticipants().getMerchant();
                com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount2 = loadScreen.getNavArgs().getTransactionDetails().getPaymentAmount();
                java.lang.String amountValue$qrc_prodRelease = paymentAmount2 != null ? paymentAmount2.getAmountValue$qrc_prodRelease() : null;
                java.lang.String str2 = amountValue$qrc_prodRelease == null ? "" : amountValue$qrc_prodRelease;
                if (merchant == null || (name2 = merchant.getDisplayName()) == null) {
                    name2 = merchant != null ? merchant.getName() : null;
                    if (name2 == null) {
                        str = "";
                        if (merchant != null || (displayInitials = merchant.getDisplayInitials()) == null) {
                            extractInitials = com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.extractInitials(merchant == null ? merchant.getDisplayName() : null);
                        } else {
                            extractInitials = displayInitials;
                        }
                        com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount3 = loadScreen.getNavArgs().getTransactionDetails().getPaymentAmount();
                        java.lang.String currencyCode = paymentAmount3 == null ? paymentAmount3.getCurrencyCode() : null;
                        java.lang.String str3 = currencyCode != null ? "" : currencyCode;
                        com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant2 = loadScreen.getNavArgs().getParticipants().getMerchant();
                        java.lang.String countryCode = (merchant2 != null || (address = merchant2.getAddress()) == null) ? null : address.getCountryCode();
                        java.lang.String str4 = countryCode != null ? "" : countryCode;
                        boolean isPayPalWorldQR = loadScreen.getNavArgs().isPayPalWorldQR();
                        com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails paypalWorldDetails = loadScreen.getNavArgs().getPaypalWorldDetails();
                        com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails paypalWorldDetails2 = loadScreen.getNavArgs().getPaypalWorldDetails();
                        return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState.Content(new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiModel(str2, str, extractInitials, str3, str4, false, isPayPalWorldQR, paypalWorldDetails, (paypalWorldDetails2 != null || (paypalWorldFxRate = paypalWorldDetails2.getPaypalWorldFxRate()) == null) ? null : java.lang.Double.valueOf(paypalWorldFxRate.getRate()), false, null, null, null, 7712, null)), null, 2, null);
                    }
                }
                str = name2;
                if (merchant != null) {
                }
                extractInitials = com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.extractInitials(merchant == null ? merchant.getDisplayName() : null);
                com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney paymentAmount32 = loadScreen.getNavArgs().getTransactionDetails().getPaymentAmount();
                if (paymentAmount32 == null) {
                }
                if (currencyCode != null) {
                }
                com.paypal.oslo.feature.qrc.domain.model.session.Merchant merchant22 = loadScreen.getNavArgs().getParticipants().getMerchant();
                if (merchant22 != null) {
                }
                if (countryCode != null) {
                }
                boolean isPayPalWorldQR2 = loadScreen.getNavArgs().isPayPalWorldQR();
                com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails paypalWorldDetails3 = loadScreen.getNavArgs().getPaypalWorldDetails();
                com.paypal.oslo.feature.qrc.domain.model.session.PayPalWorldTransactionDetails paypalWorldDetails22 = loadScreen.getNavArgs().getPaypalWorldDetails();
                return com.paypal.oslo.core.mvi.ReducerHelperKt.output$default(new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiState.Content(new com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountUiModel(str2, str, extractInitials, str3, str4, false, isPayPalWorldQR2, paypalWorldDetails3, (paypalWorldDetails22 != null || (paypalWorldFxRate = paypalWorldDetails22.getPaypalWorldFxRate()) == null) ? null : java.lang.Double.valueOf(paypalWorldFxRate.getRate()), false, null, null, null, 7712, null)), null, 2, null);
            }
            return com.paypal.oslo.core.mvi.ReducerHelperKt.unexpectedEvent(initial, event);
        }
    }
}
