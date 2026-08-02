package com.paypal.oslo.feature.cryptocurrency.ui.celsius;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1", f = "CryptoCelsiusClaimCodeScreen.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getInputFormats;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect cryptoCelsiusClaimCodeEffect = (com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect) obj;
            if (cryptoCelsiusClaimCodeEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.OpenUrl) {
                com.paypal.oslo.feature.cryptocurrency.ui.common.util.ContextExtensionsKt.openUrl(this.Camera2StreamConfigurationMap, ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.OpenUrl) cryptoCelsiusClaimCodeEffect).getUrl());
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(cryptoCelsiusClaimCodeEffect, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateBack.INSTANCE)) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (cryptoCelsiusClaimCodeEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.ShowProvisioningFlow) {
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(cryptoCelsiusClaimCodeEffect, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateToSuccessScreen.INSTANCE)) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(cryptoCelsiusClaimCodeEffect, com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateToErrorScreen.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRangesFor, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect cryptoCelsiusClaimCodeEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoProvisioningDestination(((com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.ShowProvisioningFlow) cryptoCelsiusClaimCodeEffect).getIntent()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(com.paypal.oslo.feature.cryptocurrency.navigation.CryptoCelsiusClaimCodeSuccessDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoErrorDestination((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2) {
            this.Camera2StreamConfigurationMap = context;
            this.getHighSpeedVideoSizes = appNavigator;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = 1;
            if (this.getHighSpeedVideoFpsRangesFor.getEffect().collect(new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel cryptoCelsiusClaimCodeViewModel, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeEffectHandler$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cryptoCelsiusClaimCodeViewModel;
        this.getHighSpeedVideoFpsRanges = context;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
    }
}
