package com.paypal.oslo.feature.cryptocurrency.ui.provisioning;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningScreenKt$EopProvisioningContent$2$1", f = "CryptoProvisioningScreen.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoProvisioningScreenKt$EopProvisioningContent$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningScreenKt$EopProvisioningContent$2$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect cryptoEopProvisioningEffect = (com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(cryptoEopProvisioningEffect, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Completed.INSTANCE)) {
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningScreenKt$EopProvisioningContent$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningScreenKt$EopProvisioningContent$2$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(cryptoEopProvisioningEffect, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Cancelled.INSTANCE)) {
                this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningScreenKt$EopProvisioningContent$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningScreenKt$EopProvisioningContent$2$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(cryptoEopProvisioningEffect, com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Error.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.Camera2StreamConfigurationMap.m11575navigateForResultInternaluBl809w(this.getHighResolutionOutputSizeshNQ4ISI, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningScreenKt$EopProvisioningContent$2$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningScreenKt$EopProvisioningContent$2$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult.Outcome.Canceled.INSTANCE));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoErrorDestination((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult.Outcome.Completed.INSTANCE));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
            this.Camera2StreamConfigurationMap = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (this.getHighSpeedVideoSizes.getEffect().collect(new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningScreenKt$EopProvisioningContent$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningScreenKt$EopProvisioningContent$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningScreenKt$EopProvisioningContent$2$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoProvisioningScreenKt$EopProvisioningContent$2$1(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoEopProvisioningViewModel cryptoEopProvisioningViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningScreenKt$EopProvisioningContent$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = cryptoEopProvisioningViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
