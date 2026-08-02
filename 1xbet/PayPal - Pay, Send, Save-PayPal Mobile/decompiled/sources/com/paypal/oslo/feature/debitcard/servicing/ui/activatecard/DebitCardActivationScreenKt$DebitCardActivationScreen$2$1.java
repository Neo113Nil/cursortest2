package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$2$1", f = "DebitCardActivationScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardActivationScreenKt$DebitCardActivationScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            androidx.navigation3.runtime.NavKey navKey;
            androidx.navigation3.runtime.NavKey navKey2;
            com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect debitCardActivationEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect) obj;
            if (debitCardActivationEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect.NavigateBack) {
                com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.handleNavigationWithResult(this.Camera2StreamConfigurationMap.getActivateCardInfo().getResultType(), this.getHighSpeedVideoSizes);
            } else if (debitCardActivationEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect.NavigateToCardManagement) {
                java.util.List<androidx.navigation3.runtime.NavKey> backStack = this.getHighSpeedVideoSizes.getBackStack();
                java.util.ListIterator<androidx.navigation3.runtime.NavKey> listIterator = backStack.listIterator(backStack.size());
                while (true) {
                    navKey = null;
                    if (!listIterator.hasPrevious()) {
                        navKey2 = null;
                        break;
                    }
                    navKey2 = listIterator.previous();
                    if (navKey2 instanceof com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination) {
                        break;
                    }
                }
                androidx.navigation3.runtime.NavKey navKey3 = navKey2;
                java.util.List<androidx.navigation3.runtime.NavKey> backStack2 = this.getHighSpeedVideoSizes.getBackStack();
                java.util.ListIterator<androidx.navigation3.runtime.NavKey> listIterator2 = backStack2.listIterator(backStack2.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        break;
                    }
                    androidx.navigation3.runtime.NavKey previous = listIterator2.previous();
                    if (previous instanceof com.paypal.oslo.feature.debitcard.servicing.di.ManageSecondaryCardHolderDestination) {
                        navKey = previous;
                        break;
                    }
                }
                final androidx.navigation3.runtime.NavKey navKey4 = navKey;
                if (navKey3 != null) {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
                    final java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
                    appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$2$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$2$1.AnonymousClass1.getHighSpeedVideoSizes(androidx.navigation3.runtime.NavKey.this, str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else {
                    com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighSpeedVideoSizes;
                    final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel = this.Camera2StreamConfigurationMap;
                    appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$2$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$2$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                }
            } else {
                if (!(debitCardActivationEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEffect.NavigateToCardNotReceivedScreen)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo = new com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo(this.Camera2StreamConfigurationMap.getActivateCardInfo().getInstrumentId(), this.Camera2StreamConfigurationMap.getActivateCardInfo().getProductName(), this.Camera2StreamConfigurationMap.getActivateCardInfo().getLastFourDigits(), this.Camera2StreamConfigurationMap.getActivateCardInfo().getDisplayAddress(), this.Camera2StreamConfigurationMap.getActivateCardInfo().getCardImageUrl(), this.Camera2StreamConfigurationMap.getActivateCardInfo().getBillingAddressId(), this.Camera2StreamConfigurationMap.getActivateCardInfo().getExpectedArrivalDate(), com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementFlowType.CARD_NOT_RECEIVED, this.Camera2StreamConfigurationMap.getActivateCardInfo().getPrimary());
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$2$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$2$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.navigation3.runtime.NavKey navKey, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            if (navKey != null) {
                navigationScope.popTo(navKey);
            }
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationNavResult(com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.SUCCESS, str));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.replaceTop(new com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination(debitCardActivationViewModel.getActivateCardInfo().getProductName(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.SUCCESS, (com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction) null, (com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination(cardReplacementInfo));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
            this.Camera2StreamConfigurationMap = debitCardActivationViewModel;
            this.getHighSpeedVideoSizes = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (this.getHighSpeedVideoSizes.getUiEffect().collect(new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$2$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$2$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardActivationScreenKt$DebitCardActivationScreen$2$1(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = debitCardActivationViewModel;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
