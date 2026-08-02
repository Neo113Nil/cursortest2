package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1", f = "ChooseWayToPayScreen.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, nl = {144}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1$1", f = "ChooseWayToPayScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect chooseWayToPayUiEffect = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (chooseWayToPayUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.NavigateBack) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (chooseWayToPayUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.NavigateLinkBank) {
                this.getHighSpeedVideoFpsRanges.m11575navigateForResultInternaluBl809w(this.getHighResolutionOutputSizeshNQ4ISI, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (chooseWayToPayUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.ShowDontSeeBankBottomSheet) {
                this.getHighSpeedVideoSizes.showSheet();
            } else {
                if (!(chooseWayToPayUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.SelectFundingInstrument)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.SelectFundingInstrument selectFundingInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.SelectFundingInstrument) chooseWayToPayUiEffect;
                boolean isFundingInstrumentChanging = selectFundingInstrument.isFundingInstrumentChanging();
                final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument selectedFundingInstrument = selectFundingInstrument.getSelectedFundingInstrument();
                if ((selectedFundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) && this.Camera2StreamConfigurationMap.getArgs().isAutopayFlow()) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRanges;
                    final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel chooseWayToPayViewModel = this.Camera2StreamConfigurationMap;
                    appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel.this, selectedFundingInstrument, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if ((selectedFundingInstrument instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) && this.Camera2StreamConfigurationMap.getArgs().isAutopayFlow()) {
                    this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (isFundingInstrumentChanging) {
                    this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighSpeedVideoFpsRanges;
                    final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel chooseWayToPayViewModel2 = this.Camera2StreamConfigurationMap;
                    appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1$1$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.this, chooseWayToPayViewModel2, selectedFundingInstrument, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult((java.lang.String) null, (java.lang.String) null, fundingInstrument.getId(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect chooseWayToPayUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel chooseWayToPayViewModel, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.SelectFundingInstrument selectFundingInstrument = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect.SelectFundingInstrument) chooseWayToPayUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.ReviewPaymentDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs(selectFundingInstrument.getCreditAccountId(), fundingInstrument, selectFundingInstrument.getFundingInstruments(), null, chooseWayToPayViewModel.getArgs().getPaymentAmount(), chooseWayToPayViewModel.getArgs().getUserAgreementUrl(), chooseWayToPayViewModel.getArgs().getCreditProductIdentifier(), chooseWayToPayViewModel.getArgs().getMaxDaysInFuture(), chooseWayToPayViewModel.getArgs().getDueDate())));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel chooseWayToPayViewModel, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = chooseWayToPayViewModel.getArgs().getCreditProductIdentifier();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance fundingInstrumentBalance = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance) fundingInstrument;
            java.lang.String id = fundingInstrumentBalance.getId();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount balance = fundingInstrumentBalance.getBalance();
            java.lang.String value = balance != null ? balance.getValue() : null;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount balance2 = fundingInstrumentBalance.getBalance();
            navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.BackupPaymentMethodDestination(creditProductIdentifier, id, value, balance2 != null ? balance2.getCurrencyCode() : null, chooseWayToPayViewModel.getArgs().getFundingInstruments()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument fundingInstrument, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank fundingInstrumentBank = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank) fundingInstrument;
            java.lang.String id = fundingInstrumentBank.getId();
            java.lang.String name2 = fundingInstrumentBank.getName();
            java.lang.String lastNChars = fundingInstrumentBank.getLastNChars();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType type = fundingInstrumentBank.getType();
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.PaymentMethodSelectedNavResult((java.lang.String) null, (java.lang.String) null, id, name2, lastNChars, type != null ? type.name() : null, fundingInstrumentBank.getIcon(), 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect chooseWayToPayUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1.AnonymousClass1) create(chooseWayToPayUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel chooseWayToPayViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoSizes = bottomSheetController;
            this.Camera2StreamConfigurationMap = chooseWayToPayViewModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes.getUiEffect(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel chooseWayToPayViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components.ChooseWayToPayScreenKt$ChooseWayToPayScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = chooseWayToPayViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
    }
}
