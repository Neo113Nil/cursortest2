package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1", f = "RequestPhysicalCardScreen.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, nl = {132}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1$1", f = "RequestPhysicalCardScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.navigation3.runtime.NavKey navKey;
            final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEffect requestPhysicalCardEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEffect) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (requestPhysicalCardEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEffect.NavigateToBalanceDashboard) {
                java.util.List<androidx.navigation3.runtime.NavKey> backStack = this.getHighResolutionOutputSizeshNQ4ISI.getBackStack();
                java.util.ListIterator<androidx.navigation3.runtime.NavKey> listIterator = backStack.listIterator(backStack.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        navKey = null;
                        break;
                    }
                    navKey = listIterator.previous();
                    if (navKey instanceof com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination) {
                        break;
                    }
                }
                androidx.navigation3.runtime.NavKey navKey2 = navKey;
                if (navKey2 != null) {
                    com.paypal.oslo.feature.debitcard.servicing.navigation.AppNavigatorExtensionsKt.popUntilInclusiveAndNavigateTo$default(this.getHighResolutionOutputSizeshNQ4ISI, navKey2, com.paypal.oslo.feature.balance.api.navigation.BalanceDashboardDestination.INSTANCE, null, 4, null);
                }
            } else if (requestPhysicalCardEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEffect.NavigateToDebitPinScreen) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.String str = this.Camera2StreamConfigurationMap;
                final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo = this.getHighSpeedVideoFpsRangesFor;
                appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (requestPhysicalCardEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEffect.NavigateToAddressSelectionScreen) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.String str2 = this.Camera2StreamConfigurationMap;
                final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo2 = this.getHighSpeedVideoFpsRangesFor;
                appNavigator2.m11575navigateForResultInternaluBl809w(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.navigation.result.ShippingAddressNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(requestPhysicalCardEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEffect.NavigateDebitCardManagement)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.ShippingAddressDestination(requestPhysicalCardInfo.getDebitInstrumentId(), requestPhysicalCardInfo.getProductName()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.DebitPinDestination(requestPhysicalCardInfo.getDebitInstrumentId(), (com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.SetDebitPinFlowType) null, (java.lang.String) null, (com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode) null, false, 30, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEffect requestPhysicalCardEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.servicing.navigation.result.RequestPhysicalCardNavResult(((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEffect.NavigateDebitCardManagement) requestPhysicalCardEffect).isRefreshRequired()));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEffect requestPhysicalCardEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1.AnonymousClass1) create(requestPhysicalCardEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRangesFor = requestPhysicalCardInfo;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges.getUiEffect(), new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.viewmodel.RequestPhysicalCardViewModel requestPhysicalCardViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardScreenKt$RequestPhysicalCardScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = requestPhysicalCardViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = requestPhysicalCardInfo;
    }
}
