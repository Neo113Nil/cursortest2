package com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1", f = "LinkAgreementsScreen.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, nl = {118}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class LinkAgreementsScreenKt$LinkAgreementsScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel getHighSpeedVideoFpsRanges;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect linkAgreementsUiEffect = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect) obj;
            if (linkAgreementsUiEffect instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.OpenMerchantWebsite) {
                this.Camera2StreamConfigurationMap.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges.getIabRequestId(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.result.LinkAgreementNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(linkAgreementsUiEffect, com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.ShowSearch.INSTANCE)) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.Camera2StreamConfigurationMap;
                java.lang.String searchRequestId = this.getHighSpeedVideoFpsRanges.getSearchRequestId();
                final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = this.getHighResolutionOutputSizeshNQ4ISI;
                appNavigator.m11575navigateForResultInternaluBl809w(searchRequestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.result.LinkAgreementsSearchNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(linkAgreementsUiEffect, com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.ShowHowToLinkBottomSheet.INSTANCE)) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.Camera2StreamConfigurationMap;
                final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType2 = this.getHighResolutionOutputSizeshNQ4ISI;
                appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(linkAgreementsUiEffect instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.NavigateBackToHub)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect linkAgreementsUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.subscriptions.shared.navigation.result.LinkHubFlowNavResult(((com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.NavigateBackToHub) linkAgreementsUiEffect).getRefreshNeeded()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementsSearchDestination(com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.toRawValue(agreementType)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementHowToBottomSheetDestination(com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.toRawValue(agreementType)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect linkAgreementsUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.OpenMerchantWebsite openMerchantWebsite = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEffect.OpenMerchantWebsite) linkAgreementsUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementInAppBrowserDestination(openMerchantWebsite.getMerchantUrl(), openMerchantWebsite.getSource(), openMerchantWebsite.getMerchantName()));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel linkAgreementsViewModel, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
            this.Camera2StreamConfigurationMap = appNavigator;
            this.getHighSpeedVideoFpsRanges = linkAgreementsViewModel;
            this.getHighResolutionOutputSizeshNQ4ISI = agreementType;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (this.getHighSpeedVideoFpsRangesFor.getUiEffect().collect(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LinkAgreementsScreenKt$LinkAgreementsScreen$4$1(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel linkAgreementsViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt$LinkAgreementsScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = linkAgreementsViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoFpsRanges = agreementType;
    }
}
