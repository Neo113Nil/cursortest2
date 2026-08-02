package com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1", f = "BackupPaymentMethodScreen.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, nl = {135}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/backuppayment/viewmodel/BackupPaymentMethodEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1$1", f = "BackupPaymentMethodScreen.kt", i = {0, 0}, l = {90}, m = "invokeSuspend", n = {"effect", "selectedBackupInstrument"}, nl = {97}, s = {"L$0", "L$1"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
        java.lang.Object getInputFormats;
        int getInputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel;
            final java.lang.String str;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect backupPaymentMethodEffect = (com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect) this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getInputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (backupPaymentMethodEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.ShowDontSeeBankBottomSheet) {
                    this.getHighSpeedVideoFpsRangesFor.showSheet();
                } else if (!(backupPaymentMethodEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateToLinkBank)) {
                    if (backupPaymentMethodEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateBack) {
                        this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                            }
                        });
                    } else {
                        if (!(backupPaymentMethodEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateToReview)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel selectedFundingInstrument = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect.NavigateToReview) backupPaymentMethodEffect).getSelectedFundingInstrument();
                        if (this.getHighSpeedVideoFpsRanges.getNavArgs().getBalanceId() != null) {
                            if (this.getHighSpeedVideoFpsRanges.getNavArgs().getBalanceValue() != null && this.getHighSpeedVideoFpsRanges.getNavArgs().getBalanceCurrencyCode() != null) {
                                com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade = this.getHighSpeedVideoFpsRanges.getCurrencyFormatterFacade();
                                java.lang.String balanceValue = this.getHighSpeedVideoFpsRanges.getNavArgs().getBalanceValue();
                                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(backupPaymentMethodEffect);
                                this.getInputFormats = selectedFundingInstrument;
                                this.getInputSizeshNQ4ISI = 1;
                                java.lang.Object format$default = com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade.format$default(currencyFormatterFacade, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount(this.getHighSpeedVideoFpsRanges.getNavArgs().getBalanceCurrencyCode(), balanceValue), null, 0, this, 6, null);
                                if (format$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                fundingInstrumentUiModel = selectedFundingInstrument;
                                obj = format$default;
                            } else {
                                fundingInstrumentUiModel = selectedFundingInstrument;
                                str = null;
                                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
                                final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel = this.getHighSpeedVideoFpsRanges;
                                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.this, str, fundingInstrumentUiModel, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                                    }
                                });
                            }
                        } else {
                            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                                }
                            });
                        }
                    }
                } else {
                    this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fundingInstrumentUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) this.getInputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            str = (java.lang.String) obj;
            com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighSpeedVideoSizes;
            final com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel2 = this.getHighSpeedVideoFpsRanges;
            appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel.this, str, fundingInstrumentUiModel, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            java.lang.String balanceId = fundingInstrumentUiModel.getBalanceId();
            java.lang.String bankId = fundingInstrumentUiModel.getBankId();
            if (bankId == null) {
                bankId = fundingInstrumentUiModel.getId();
            }
            java.lang.String str = bankId;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString paymentMethodName = fundingInstrumentUiModel.getPaymentMethodName();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString = paymentMethodName instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString ? (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString) paymentMethodName : null;
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult(balanceId, (java.lang.String) null, str, plainString != null ? plainString.getValue() : null, fundingInstrumentUiModel.getBankLastFour(), fundingInstrumentUiModel.getBankAccountType(), fundingInstrumentUiModel.getIcon(), 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            java.lang.String balanceId = backupPaymentMethodViewModel.getNavArgs().getBalanceId();
            java.lang.String bankId = fundingInstrumentUiModel.getBankId();
            if (bankId == null) {
                bankId = fundingInstrumentUiModel.getId();
            }
            java.lang.String str2 = bankId;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString paymentMethodName = fundingInstrumentUiModel.getPaymentMethodName();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString plainString = paymentMethodName instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString ? (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString) paymentMethodName : null;
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult(balanceId, str, str2, plainString != null ? plainString.getValue() : null, fundingInstrumentUiModel.getBankLastFour(), fundingInstrumentUiModel.getBankAccountType(), fundingInstrumentUiModel.getIcon()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodEffect backupPaymentMethodEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1.AnonymousClass1) create(backupPaymentMethodEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = bottomSheetController;
            this.getHighSpeedVideoSizes = appNavigator;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = backupPaymentMethodViewModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges.getUiEffect(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.viewmodel.BackupPaymentMethodViewModel backupPaymentMethodViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.backuppayment.BackupPaymentMethodScreenKt$BackupPaymentMethodScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = backupPaymentMethodViewModel;
        this.getHighSpeedVideoSizes = bottomSheetController;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
