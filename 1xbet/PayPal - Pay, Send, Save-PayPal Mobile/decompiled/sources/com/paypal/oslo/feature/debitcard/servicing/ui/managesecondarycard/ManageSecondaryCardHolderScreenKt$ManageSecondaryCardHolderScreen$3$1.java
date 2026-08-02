package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1", f = "ManageSecondaryCardHolderScreen.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, nl = {145}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect manageSecondaryCardEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(manageSecondaryCardEffect, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateBack.INSTANCE)) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (manageSecondaryCardEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToSecondaryCardManagement) {
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.navigation.result.SecondaryCardManagementNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(manageSecondaryCardEffect, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToAddCardholder.INSTANCE)) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
                java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
                final com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel manageSecondaryCardHolderViewModel = this.getHighSpeedVideoFpsRangesFor;
                appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.CardholderAdded.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(manageSecondaryCardEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToActivateCardFlow)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect manageSecondaryCardEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToSecondaryCardManagement navigateToSecondaryCardManagement = (com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToSecondaryCardManagement) manageSecondaryCardEffect;
            navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.SecondaryCardManagementDestination(navigateToSecondaryCardManagement.getProductName(), navigateToSecondaryCardManagement.getCardId()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect manageSecondaryCardEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationRouterDestination(((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.mvi.ManageSecondaryCardEffect.NavigateToActivateCardFlow) manageSecondaryCardEffect).getDebitCardActivationInfo()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel manageSecondaryCardHolderViewModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.debitcard.shared.di.DebitCardWebViewDestination(manageSecondaryCardHolderViewModel.getDebitCardWebViewUrlBuilder().getAddSecondaryCardUrl(), false, (java.lang.String) null, manageSecondaryCardHolderViewModel.getProductName(), 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel manageSecondaryCardHolderViewModel) {
            this.getHighSpeedVideoSizes = appNavigator;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighResolutionOutputSizeshNQ4ISI = str2;
            this.getHighSpeedVideoFpsRangesFor = manageSecondaryCardHolderViewModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighSpeedVideoFpsRanges.getUiEffect().collect(new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1(com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.viewmodel.ManageSecondaryCardHolderViewModel manageSecondaryCardHolderViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderScreenKt$ManageSecondaryCardHolderScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = manageSecondaryCardHolderViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = str2;
    }
}
