package com.paypal.oslo.feature.wallet.banks.ui.finicity;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$4$1", f = "FinicityFlowScreen.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class FinicityFlowScreenKt$FinicityFlowScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$4$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel getHighSpeedVideoFpsRanges;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts chooseAccounts;
            com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowEvent finicityFlowEvent = (com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowEvent) obj;
            if (finicityFlowEvent instanceof com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowEvent.NavigateToAutoLink) {
                com.paypal.oslo.feature.wallet.banks.domain.model.BankConnectionContext context = ((com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowEvent.NavigateToAutoLink) finicityFlowEvent).getContext();
                java.lang.String aggregatorName = context.getAggregatorName();
                java.lang.String externalBankId = context.getExternalBankId();
                java.lang.String countryCode = context.getCountryCode();
                java.lang.String name2 = context.getIntegrationType().name();
                java.lang.String bankName = context.getBankName();
                java.lang.String bankLogoUrl = context.getBankLogoUrl();
                java.lang.String credentialToken = context.getCredentialToken();
                chooseAccounts = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink(aggregatorName, externalBankId, countryCode, name2, bankName, bankLogoUrl, credentialToken == null ? "" : credentialToken, context.getAction(), context.getBank(), context.getInstrumentId(), this.getHighSpeedVideoFpsRanges.getFlow());
            } else {
                if (!(finicityFlowEvent instanceof com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowEvent.NavigateToChooseAccounts)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.wallet.banks.domain.model.BankConnectionContext context2 = ((com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowEvent.NavigateToChooseAccounts) finicityFlowEvent).getContext();
                java.lang.String aggregatorName2 = context2.getAggregatorName();
                java.lang.String externalBankId2 = context2.getExternalBankId();
                java.lang.String countryCode2 = context2.getCountryCode();
                java.lang.String name3 = context2.getIntegrationType().name();
                java.lang.String bankName2 = context2.getBankName();
                java.lang.String credentialToken2 = context2.getCredentialToken();
                chooseAccounts = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.ChooseAccounts(aggregatorName2, credentialToken2 == null ? "" : credentialToken2, externalBankId2, countryCode2, name3, bankName2, context2.getBankLogoUrl());
            }
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$4$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$4$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.wallet.ui.Destination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.wallet.ui.Destination destination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.replaceTop(destination);
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel finicityFlowViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighSpeedVideoFpsRanges = finicityFlowViewModel;
            this.Camera2StreamConfigurationMap = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighSpeedVideoFpsRanges.getEvents().collect(new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$4$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$4$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinicityFlowScreenKt$FinicityFlowScreen$4$1(com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowViewModel finicityFlowViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.finicity.FinicityFlowScreenKt$FinicityFlowScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = finicityFlowViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }
}
