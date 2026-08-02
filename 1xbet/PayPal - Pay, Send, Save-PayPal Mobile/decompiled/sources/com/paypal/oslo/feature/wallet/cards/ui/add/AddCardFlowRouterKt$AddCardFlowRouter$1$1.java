package com.paypal.oslo.feature.wallet.cards.ui.add;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1", f = "AddCardFlowRouter.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, nl = {88}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddCardFlowRouterKt$AddCardFlowRouter$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent addCardFlowNavEvent = (com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent) obj;
            if (addCardFlowNavEvent instanceof com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToScanner) {
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (addCardFlowNavEvent instanceof com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToForm) {
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRangesFor, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (addCardFlowNavEvent instanceof com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToSuccess) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoSizes;
                final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options = this.getHighResolutionOutputSizeshNQ4ISI;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options.this, addCardFlowNavEvent, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(addCardFlowNavEvent instanceof com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.ExitFlow)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.wallet.wallet.ui.Destination.ScanCard(true));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent addCardFlowNavEvent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(((com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.ExitFlow) addCardFlowNavEvent).getResult());
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent addCardFlowNavEvent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.wallet.wallet.ui.Destination.EnterCardManually(((com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToForm) addCardFlowNavEvent).getScreenArgs()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent addCardFlowNavEvent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.replaceTop(new com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination(options, ((com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowNavEvent.NavigateToSuccess) addCardFlowNavEvent).getResult()));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options) {
            this.getHighSpeedVideoSizes = appNavigator;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = options;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor = 1;
            if (this.getHighSpeedVideoFpsRanges.getNavEvent().collect(new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddCardFlowRouterKt$AddCardFlowRouter$1$1(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel addCardFlowRouterViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = addCardFlowRouterViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoSizes = options;
    }
}
