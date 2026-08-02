package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/viewmodel/PaymentConfirmationInitialiserMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/viewmodel/PaymentConfirmationState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/viewmodel/PaymentConfirmationEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "currencyFormatter", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;", "input", "", "invoke", "(Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware$Input;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/uimodel/PaymentConfirmationUiModel;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/PaymentConfirmationArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/currency/CurrencyFormatterFacade;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentConfirmationInitialiserMiddleware implements com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PaymentConfirmationInitialiserMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFormatterFacade, "");
        this.getHighSpeedVideoSizes = currencyFormatterFacade;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$handleOnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware paymentConfirmationInitialiserMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs paymentConfirmationArgs, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$handleOnViewCreated$1 paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$handleOnViewCreated$1) {
            paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$handleOnViewCreated$1) continuation;
            if ((paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1.getHighSpeedVideoFpsRangesFor = paymentConfirmationArgs;
                    paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1.getHighSpeedVideoFpsRanges = function1;
                    paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1.getHighSpeedVideoSizes = 1;
                    obj = paymentConfirmationInitialiserMiddleware.getHighResolutionOutputSizeshNQ4ISI(paymentConfirmationArgs, paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1.getHighSpeedVideoFpsRanges;
                    paymentConfirmationArgs = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs) paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent.OnViewInitialised(paymentConfirmationArgs.getCreditProductIdentifier(), (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.uimodel.PaymentConfirmationUiModel) obj));
                return kotlin.Unit.INSTANCE;
            }
        }
        paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$handleOnViewCreated$1(paymentConfirmationInitialiserMiddleware, continuation);
        java.lang.Object obj2 = paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentConfirmationInitialiserMiddleware$handleOnViewCreated$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent.OnViewInitialised(paymentConfirmationArgs.getCreditProductIdentifier(), (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.uimodel.PaymentConfirmationUiModel) obj2));
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
    public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent> input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent event = input.getEvent();
        if (event instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationEvent.OnViewCreated) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$invoke$1(this, event, input, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs paymentConfirmationArgs, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.uimodel.PaymentConfirmationUiModel> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$buildUiModel$1 paymentConfirmationInitialiserMiddleware$buildUiModel$1;
        int i;
        com.paypal.pds.core.Icon.Calendar calendar;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter paymentMethodDetails;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2;
        com.paypal.pds.core.Icon icon;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3;
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs paymentConfirmationArgs2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$buildUiModel$1) {
            paymentConfirmationInitialiserMiddleware$buildUiModel$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$buildUiModel$1) continuation;
            if ((paymentConfirmationInitialiserMiddleware$buildUiModel$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                paymentConfirmationInitialiserMiddleware$buildUiModel$1.getInputFormats -= 2147483648;
                java.lang.Object obj = paymentConfirmationInitialiserMiddleware$buildUiModel$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentConfirmationInitialiserMiddleware$buildUiModel$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware.WhenMappings.$EnumSwitchMapping$0[paymentConfirmationArgs.getPaymentType().ordinal()] == 1) {
                        calendar = com.paypal.pds.core.Icon.CheckCircle.INSTANCE;
                    } else {
                        calendar = com.paypal.pds.core.Icon.Calendar.INSTANCE;
                    }
                    com.paypal.pds.core.Icon icon2 = calendar;
                    if (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware.WhenMappings.$EnumSwitchMapping$0[paymentConfirmationArgs.getPaymentType().ordinal()] == 2) {
                        stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_confirmation_payment_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    } else {
                        stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_submitted, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    }
                    if (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware.WhenMappings.$EnumSwitchMapping$0[paymentConfirmationArgs.getPaymentType().ordinal()] == 2) {
                        stringResOnly2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_scheduled_details, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    } else {
                        stringResOnly2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_submitted_details, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    }
                    if (paymentConfirmationArgs.getBackupPaymentMethod() != null) {
                        paymentMethodDetails = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResWithParameter(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_has_backup_payment_method, new java.lang.Object[]{com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.FundingInstrumentUiModelMapperKt.toUiModel(paymentConfirmationArgs.getBackupPaymentMethod()).getPaymentMethodDetails()}, null, false, 12, null);
                    } else {
                        paymentMethodDetails = com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.FundingInstrumentUiModelMapperKt.toUiModel(paymentConfirmationArgs.getFundingInstrument()).getPaymentMethodDetails();
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount paymentAmount = paymentConfirmationArgs.getPaymentAmount();
                    paymentConfirmationInitialiserMiddleware$buildUiModel$1.Camera2StreamConfigurationMap = paymentConfirmationArgs;
                    paymentConfirmationInitialiserMiddleware$buildUiModel$1.getHighResolutionOutputSizeshNQ4ISI = icon2;
                    paymentConfirmationInitialiserMiddleware$buildUiModel$1.getHighSpeedVideoFpsRangesFor = stringResOnly;
                    paymentConfirmationInitialiserMiddleware$buildUiModel$1.getHighSpeedVideoFpsRanges = stringResOnly2;
                    paymentConfirmationInitialiserMiddleware$buildUiModel$1.getHighSpeedVideoSizes = paymentMethodDetails;
                    paymentConfirmationInitialiserMiddleware$buildUiModel$1.getInputFormats = 1;
                    java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(paymentAmount, paymentConfirmationInitialiserMiddleware$buildUiModel$1);
                    if (highSpeedVideoFpsRanges == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    uiString = stringResOnly;
                    obj = highSpeedVideoFpsRanges;
                    uiString2 = stringResOnly2;
                    icon = icon2;
                    uiString3 = paymentMethodDetails;
                    paymentConfirmationArgs2 = paymentConfirmationArgs;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) paymentConfirmationInitialiserMiddleware$buildUiModel$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString5 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) paymentConfirmationInitialiserMiddleware$buildUiModel$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString6 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) paymentConfirmationInitialiserMiddleware$buildUiModel$1.getHighSpeedVideoFpsRangesFor;
                    com.paypal.pds.core.Icon icon3 = (com.paypal.pds.core.Icon) paymentConfirmationInitialiserMiddleware$buildUiModel$1.getHighResolutionOutputSizeshNQ4ISI;
                    paymentConfirmationArgs2 = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.PaymentConfirmationArgs) paymentConfirmationInitialiserMiddleware$buildUiModel$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    uiString3 = uiString4;
                    uiString2 = uiString5;
                    uiString = uiString6;
                    icon = icon3;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString7 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel uiModel = com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.FundingInstrumentUiModelMapperKt.toUiModel(paymentConfirmationArgs2.getFundingInstrument());
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString date = paymentConfirmationArgs2.getDate();
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_date, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument backupPaymentMethod = paymentConfirmationArgs2.getBackupPaymentMethod();
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.uimodel.PaymentConfirmationUiModel(uiString7, uiModel, backupPaymentMethod == null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.FundingInstrumentUiModelMapperKt.toUiModel(backupPaymentMethod) : null, date, stringResOnly3, paymentConfirmationArgs2.getPaymentType(), icon, uiString, uiString2, uiString3);
            }
        }
        paymentConfirmationInitialiserMiddleware$buildUiModel$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$buildUiModel$1(this, continuation);
        java.lang.Object obj2 = paymentConfirmationInitialiserMiddleware$buildUiModel$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentConfirmationInitialiserMiddleware$buildUiModel$1.getInputFormats;
        if (i != 0) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString72 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString) obj2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel uiModel2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.FundingInstrumentUiModelMapperKt.toUiModel(paymentConfirmationArgs2.getFundingInstrument());
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString date2 = paymentConfirmationArgs2.getDate();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly32 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_payment_date, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument backupPaymentMethod2 = paymentConfirmationArgs2.getBackupPaymentMethod();
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.uimodel.PaymentConfirmationUiModel(uiString72, uiModel2, backupPaymentMethod2 == null ? com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.FundingInstrumentUiModelMapperKt.toUiModel(backupPaymentMethod2) : null, date2, stringResOnly32, paymentConfirmationArgs2.getPaymentType(), icon, uiString, uiString2, uiString3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$formatAmount$1 paymentConfirmationInitialiserMiddleware$formatAmount$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$formatAmount$1) {
            paymentConfirmationInitialiserMiddleware$formatAmount$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$formatAmount$1) continuation;
            if ((paymentConfirmationInitialiserMiddleware$formatAmount$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                paymentConfirmationInitialiserMiddleware$formatAmount$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$formatAmount$1 paymentConfirmationInitialiserMiddleware$formatAmount$12 = paymentConfirmationInitialiserMiddleware$formatAmount$1;
                java.lang.Object obj = paymentConfirmationInitialiserMiddleware$formatAmount$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentConfirmationInitialiserMiddleware$formatAmount$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoSizes;
                    paymentConfirmationInitialiserMiddleware$formatAmount$12.getHighResolutionOutputSizeshNQ4ISI = currencyAmount;
                    paymentConfirmationInitialiserMiddleware$formatAmount$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, currencyAmount, null, 0, paymentConfirmationInitialiserMiddleware$formatAmount$12, 6, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    currencyAmount = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount) paymentConfirmationInitialiserMiddleware$formatAmount$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str == null) {
                    str = currencyAmount.getValue();
                }
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str);
            }
        }
        paymentConfirmationInitialiserMiddleware$formatAmount$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$formatAmount$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware$formatAmount$1 paymentConfirmationInitialiserMiddleware$formatAmount$122 = paymentConfirmationInitialiserMiddleware$formatAmount$1;
        java.lang.Object obj2 = paymentConfirmationInitialiserMiddleware$formatAmount$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentConfirmationInitialiserMiddleware$formatAmount$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str == null) {
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiStringKt.toUiString(str);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.REAL_TIME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.RevolvingCreditPaymentType.SCHEDULED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
