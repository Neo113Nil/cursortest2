package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$fetchLoanConstraints$1", f = "EnterAmountViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, 282, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {"$this$launch", "request", "constraints", "loanConstraintsResult", "$this$launch", "request", "constraints", "loanConstraintsResult", "loanConstraints", "currencyCode", "$i$a$-let-EnterAmountViewModel$fetchLoanConstraints$1$4", "minAmount", "maxAmount", "$this$launch", "request", "constraints", "loanConstraintsResult", "loanConstraints", "currencyCode", "formattedMin", "$i$a$-let-EnterAmountViewModel$fetchLoanConstraints$1$4", "minAmount", "maxAmount", "$this$launch", "request", "constraints", "loanConstraintsResult", "loanConstraints", "currencyCode", "formattedMin", "formattedMax", "model", "$i$a$-let-EnterAmountViewModel$fetchLoanConstraints$1$4", "minAmount", "maxAmount"}, nl = {238, 282, 283, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "D$0", "D$1", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "I$0", "D$0", "D$1", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "D$0", "D$1"}, v = 2)
/* loaded from: classes11.dex */
final class EnterAmountViewModel$fetchLoanConstraints$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    double getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    double getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    private /* synthetic */ java.lang.Object getValidOutputFormatsForInputhNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02ed  */
    /* JADX WARN: Type inference failed for: r3v21, types: [T, com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider cpiAvailabilityProvider;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig enterAmountConfig;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase getLoanConstraintsUseCase;
        java.lang.Object invoke2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest loanConstraintsRequest;
        com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints loanAmountConstraints;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig enterAmountConfig2;
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter;
        java.lang.Object formatCurrency$default;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        double d;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel;
        int i;
        double d2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        java.lang.String str;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper enterAmountUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper enterAmountUiMapper2;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper enterAmountUiMapper3;
        com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter2;
        java.lang.Object formatCurrency$default2;
        java.lang.String str2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest loanConstraintsRequest2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints loanAmountConstraints2;
        java.lang.String str3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel2;
        double d3;
        double d4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef6;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper enterAmountUiMapper4;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig enterAmountConfig3;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig enterAmountConfig4;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel uiModel;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper enterAmountUiMapper5;
        java.lang.Object buildSpendingPowerText;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel3;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getOutputMinFrameDurationlomOqCM;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str4 = this.getHighSpeedVideoSizes;
            cpiAvailabilityProvider = this.getOutputSizes.getHighResolutionOutputSizeshNQ4ISI;
            java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> availableCpis = cpiAvailabilityProvider.availableCpis();
            enterAmountConfig = this.getOutputSizes.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest loanConstraintsRequest3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest(str4, availableCpis, enterAmountConfig.getActions().getLoanConstraintsApi().getRequestParameters().getIncludePrequalSummary());
            kotlin.jvm.internal.Ref.ObjectRef objectRef7 = new kotlin.jvm.internal.Ref.ObjectRef();
            kotlin.jvm.internal.Ref.ObjectRef objectRef8 = new kotlin.jvm.internal.Ref.ObjectRef();
            getLoanConstraintsUseCase = this.getOutputSizes.getHighSpeedVideoSizes;
            this.getValidOutputFormatsForInputhNQ4ISI = coroutineScope;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loanConstraintsRequest3);
            this.getHighSpeedVideoSizesFor = objectRef7;
            this.getInputSizeshNQ4ISI = objectRef8;
            this.getOutputMinFrameDurationlomOqCM = 1;
            invoke2 = getLoanConstraintsUseCase.invoke2(loanConstraintsRequest3, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
            if (invoke2 != coroutine_suspended) {
                objectRef = objectRef8;
                objectRef2 = objectRef7;
                loanConstraintsRequest = loanConstraintsRequest3;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel enterAmountUiModel = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiModel) this.getOutputStallDurationlomOqCM;
                    enterAmountViewModel3 = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel) this.getInputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                    uiModel = enterAmountUiModel;
                    buildSpendingPowerText = obj;
                    enterAmountViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerLoaded((com.paypal.oslo.core.commonui.utils.RefText) buildSpendingPowerText));
                    enterAmountViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LoanConstraintsLoaded(uiModel));
                    enterAmountViewModel3.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CheckIfFirstTimeOnScreen.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                double d5 = this.getHighSpeedVideoFpsRangesFor;
                double d6 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i3 = this.getHighSpeedVideoFpsRanges;
                str3 = (java.lang.String) this.getOutputSizeshNQ4ISI;
                str2 = (java.lang.String) this.getOutputMinFrameDuration;
                loanAmountConstraints2 = (com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints) this.getOutputFormats;
                enterAmountViewModel2 = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel) this.getInputFormats;
                kotlin.jvm.internal.Ref.ObjectRef objectRef9 = (kotlin.jvm.internal.Ref.ObjectRef) this.getInputSizeshNQ4ISI;
                kotlin.jvm.internal.Ref.ObjectRef objectRef10 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizesFor;
                com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest loanConstraintsRequest4 = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                objectRef6 = objectRef10;
                objectRef5 = objectRef9;
                loanConstraintsRequest2 = loanConstraintsRequest4;
                i = i3;
                d3 = d6;
                d4 = d5;
                formatCurrency$default2 = obj;
                java.lang.String str5 = (java.lang.String) formatCurrency$default2;
                enterAmountUiMapper4 = enterAmountViewModel2.getInputFormats;
                enterAmountConfig3 = enterAmountViewModel2.getHighSpeedVideoSizesFor;
                boolean showPrequal = enterAmountConfig3.getUis().getShowPrequal();
                enterAmountConfig4 = enterAmountViewModel2.getHighSpeedVideoSizesFor;
                uiModel = enterAmountUiMapper4.toUiModel(str3, str5, d3, d4, showPrequal, enterAmountConfig4.getUis().getCurrencyInput().isCurrencySymbolAtStart(), str2);
                enterAmountUiMapper5 = enterAmountViewModel2.getInputFormats;
                com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints loanConstraints = (com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints) objectRef5.element;
                com.paypal.oslo.feature.bnplacquisition.domain.model.spendingpower.SpendingPower spendingPower = loanConstraints == null ? loanConstraints.getSpendingPower() : null;
                this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loanConstraintsRequest2);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objectRef6);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objectRef5);
                this.getInputFormats = enterAmountViewModel2;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loanAmountConstraints2);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
                this.getOutputStallDurationlomOqCM = uiModel;
                this.getHighSpeedVideoFpsRanges = i;
                this.getHighResolutionOutputSizeshNQ4ISI = d3;
                this.getHighSpeedVideoFpsRangesFor = d4;
                this.getOutputMinFrameDurationlomOqCM = 4;
                buildSpendingPowerText = enterAmountUiMapper5.buildSpendingPowerText(spendingPower, this);
                if (buildSpendingPowerText != coroutine_suspended) {
                    return coroutine_suspended;
                }
                enterAmountViewModel3 = enterAmountViewModel2;
                enterAmountViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.SpendingPowerLoaded((com.paypal.oslo.core.commonui.utils.RefText) buildSpendingPowerText));
                enterAmountViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.LoanConstraintsLoaded(uiModel));
                enterAmountViewModel3.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.CheckIfFirstTimeOnScreen.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
            double d7 = this.getHighSpeedVideoFpsRangesFor;
            double d8 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = this.getHighSpeedVideoFpsRanges;
            java.lang.String str6 = (java.lang.String) this.getOutputMinFrameDuration;
            com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints loanAmountConstraints3 = (com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints) this.getOutputFormats;
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel4 = (com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel) this.getInputFormats;
            kotlin.jvm.internal.Ref.ObjectRef objectRef11 = (kotlin.jvm.internal.Ref.ObjectRef) this.getInputSizeshNQ4ISI;
            kotlin.jvm.internal.Ref.ObjectRef objectRef12 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest loanConstraintsRequest5 = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            loanAmountConstraints = loanAmountConstraints3;
            objectRef4 = objectRef12;
            loanConstraintsRequest = loanConstraintsRequest5;
            i = i4;
            str = str6;
            enterAmountViewModel = enterAmountViewModel4;
            d = d8;
            objectRef3 = objectRef11;
            d2 = d7;
            formatCurrency$default = obj;
            java.lang.String str7 = (java.lang.String) formatCurrency$default;
            bnplAcquisitionFormatter2 = enterAmountViewModel.getOutputFormats;
            this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loanConstraintsRequest);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objectRef4);
            this.getInputSizeshNQ4ISI = objectRef3;
            this.getInputFormats = enterAmountViewModel;
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loanAmountConstraints);
            this.getOutputMinFrameDuration = str;
            this.getOutputSizeshNQ4ISI = str7;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighResolutionOutputSizeshNQ4ISI = d;
            this.getHighSpeedVideoFpsRangesFor = d2;
            this.getOutputMinFrameDurationlomOqCM = 3;
            kotlin.jvm.internal.Ref.ObjectRef objectRef13 = objectRef3;
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel5 = enterAmountViewModel;
            double d9 = d;
            double d10 = d2;
            formatCurrency$default2 = com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter.formatCurrency$default(bnplAcquisitionFormatter2, d2, str, null, 0, this, 12, null);
            if (formatCurrency$default2 != coroutine_suspended) {
                str2 = str;
                loanConstraintsRequest2 = loanConstraintsRequest;
                loanAmountConstraints2 = loanAmountConstraints;
                str3 = str7;
                objectRef5 = objectRef13;
                enterAmountViewModel2 = enterAmountViewModel5;
                d3 = d9;
                d4 = d10;
                objectRef6 = objectRef4;
                java.lang.String str52 = (java.lang.String) formatCurrency$default2;
                enterAmountUiMapper4 = enterAmountViewModel2.getInputFormats;
                enterAmountConfig3 = enterAmountViewModel2.getHighSpeedVideoSizesFor;
                boolean showPrequal2 = enterAmountConfig3.getUis().getShowPrequal();
                enterAmountConfig4 = enterAmountViewModel2.getHighSpeedVideoSizesFor;
                uiModel = enterAmountUiMapper4.toUiModel(str3, str52, d3, d4, showPrequal2, enterAmountConfig4.getUis().getCurrencyInput().isCurrencySymbolAtStart(), str2);
                enterAmountUiMapper5 = enterAmountViewModel2.getInputFormats;
                com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints loanConstraints2 = (com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints) objectRef5.element;
                if (loanConstraints2 == null) {
                }
                this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loanConstraintsRequest2);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objectRef6);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objectRef5);
                this.getInputFormats = enterAmountViewModel2;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loanAmountConstraints2);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                this.getOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                this.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str52);
                this.getOutputStallDurationlomOqCM = uiModel;
                this.getHighSpeedVideoFpsRanges = i;
                this.getHighResolutionOutputSizeshNQ4ISI = d3;
                this.getHighSpeedVideoFpsRangesFor = d4;
                this.getOutputMinFrameDurationlomOqCM = 4;
                buildSpendingPowerText = enterAmountUiMapper5.buildSpendingPowerText(spendingPower, this);
                if (buildSpendingPowerText != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        kotlin.jvm.internal.Ref.ObjectRef objectRef14 = (kotlin.jvm.internal.Ref.ObjectRef) this.getInputSizeshNQ4ISI;
        kotlin.jvm.internal.Ref.ObjectRef objectRef15 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizesFor;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest loanConstraintsRequest6 = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        objectRef = objectRef14;
        objectRef2 = objectRef15;
        loanConstraintsRequest = loanConstraintsRequest6;
        invoke2 = obj;
        com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult) invoke2;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel6 = this.getOutputSizes;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success.getData();
            success.getCorrelationId();
            if (data instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints) {
                ?? loanAmountConstraints4 = ((com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanConstraints) data).getLoanAmountConstraints();
                if (loanAmountConstraints4 != 0) {
                    objectRef2.element = loanAmountConstraints4;
                    objectRef.element = data;
                } else {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "LoanAmountConstraints is null", null, null, 6, null);
                    enterAmountUiMapper3 = enterAmountViewModel6.getInputFormats;
                    enterAmountViewModel6.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError(enterAmountUiMapper3.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, null))));
                }
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Unexpected data type", null, null, 6, null);
                enterAmountUiMapper2 = enterAmountViewModel6.getInputFormats;
                enterAmountViewModel6.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError(enterAmountUiMapper2.toErrorContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.Generic(null, 1, null))));
            }
        }
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel7 = this.getOutputSizes;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Failed to fetch loan constraints", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorTag", error.getTag())), null, 4, null);
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel.access$handleInitialLoadError(enterAmountViewModel7, error);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel8 = this.getOutputSizes;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) useCaseResult;
            java.lang.String data2 = decline.getData();
            java.lang.String correlationId = decline.getCorrelationId();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Application declined", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", data2 == null ? "UNKNOWN" : data2)), null, 4, null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from = com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.INSTANCE.from(data2, correlationId);
            enterAmountUiMapper = enterAmountViewModel8.getInputFormats;
            enterAmountViewModel8.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined(enterAmountUiMapper.toDeclineContent(from)));
        }
        loanAmountConstraints = (com.paypal.oslo.feature.bnplacquisition.domain.model.loanconstraints.LoanAmountConstraints) objectRef2.element;
        if (loanAmountConstraints != null) {
            com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel9 = this.getOutputSizes;
            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(loanAmountConstraints.getMinAmount().getValue());
            if (doubleOrNull == null) {
                return kotlin.Unit.INSTANCE;
            }
            double doubleValue = doubleOrNull.doubleValue();
            java.lang.Double doubleOrNull2 = kotlin.text.StringsKt.toDoubleOrNull(loanAmountConstraints.getMaxAmount().getValue());
            if (doubleOrNull2 == null) {
                return kotlin.Unit.INSTANCE;
            }
            double doubleValue2 = doubleOrNull2.doubleValue();
            enterAmountConfig2 = enterAmountViewModel9.getHighSpeedVideoSizesFor;
            java.lang.String currencyCode = enterAmountConfig2.getUis().getCurrencyInput().getCurrencyCode();
            bnplAcquisitionFormatter = enterAmountViewModel9.getOutputFormats;
            this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loanConstraintsRequest);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objectRef2);
            this.getInputSizeshNQ4ISI = objectRef;
            this.getInputFormats = enterAmountViewModel9;
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loanAmountConstraints);
            this.getOutputMinFrameDuration = currencyCode;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = doubleValue;
            this.getHighSpeedVideoFpsRangesFor = doubleValue2;
            this.getOutputMinFrameDurationlomOqCM = 2;
            formatCurrency$default = com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter.formatCurrency$default(bnplAcquisitionFormatter, doubleValue, currencyCode, null, 0, this, 12, null);
            if (formatCurrency$default != coroutine_suspended) {
                objectRef3 = objectRef;
                d = doubleValue;
                enterAmountViewModel = enterAmountViewModel9;
                i = 0;
                d2 = doubleValue2;
                objectRef4 = objectRef2;
                str = currencyCode;
                java.lang.String str72 = (java.lang.String) formatCurrency$default;
                bnplAcquisitionFormatter2 = enterAmountViewModel.getOutputFormats;
                this.getValidOutputFormatsForInputhNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loanConstraintsRequest);
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(objectRef4);
                this.getInputSizeshNQ4ISI = objectRef3;
                this.getInputFormats = enterAmountViewModel;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loanAmountConstraints);
                this.getOutputMinFrameDuration = str;
                this.getOutputSizeshNQ4ISI = str72;
                this.getHighSpeedVideoFpsRanges = i;
                this.getHighResolutionOutputSizeshNQ4ISI = d;
                this.getHighSpeedVideoFpsRangesFor = d2;
                this.getOutputMinFrameDurationlomOqCM = 3;
                kotlin.jvm.internal.Ref.ObjectRef objectRef132 = objectRef3;
                com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel52 = enterAmountViewModel;
                double d92 = d;
                double d102 = d2;
                formatCurrency$default2 = com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter.formatCurrency$default(bnplAcquisitionFormatter2, d2, str, null, 0, this, 12, null);
                if (formatCurrency$default2 != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$fetchLoanConstraints$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$fetchLoanConstraints$1 enterAmountViewModel$fetchLoanConstraints$1 = new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$fetchLoanConstraints$1(this.getHighSpeedVideoSizes, this.getOutputSizes, continuation);
        enterAmountViewModel$fetchLoanConstraints$1.getValidOutputFormatsForInputhNQ4ISI = obj;
        return enterAmountViewModel$fetchLoanConstraints$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAmountViewModel$fetchLoanConstraints$1(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$fetchLoanConstraints$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = str;
        this.getOutputSizes = enterAmountViewModel;
    }
}
