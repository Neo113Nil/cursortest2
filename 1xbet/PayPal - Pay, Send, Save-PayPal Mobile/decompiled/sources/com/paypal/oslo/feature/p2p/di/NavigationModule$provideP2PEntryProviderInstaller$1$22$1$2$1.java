package com.paypal.oslo.feature.p2p.di;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1", f = "NavigationModule.kt", i = {}, l = {899}, m = "invokeSuspend", n = {}, nl = {915}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/p2p/ui/claim/effects/ClaimPreviewEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1$1", f = "NavigationModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect claimPreviewEffect = (com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (claimPreviewEffect instanceof com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateBack) {
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (claimPreviewEffect instanceof com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToSuccess) {
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (claimPreviewEffect instanceof com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToHardDecline) {
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(claimPreviewEffect instanceof com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect.NavigateToNetworkError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(com.paypal.oslo.feature.p2p.navigation.NetworkErrorDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(com.paypal.oslo.feature.p2p.api.navigation.ClaimSuccessDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(com.paypal.oslo.feature.p2p.api.navigation.ClaimHardDeclineDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.p2p.ui.claim.effects.ClaimPreviewEffect claimPreviewEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1.AnonymousClass1) create(claimPreviewEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor.getUiEffect(), new com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1(com.paypal.oslo.feature.p2p.ui.claim.viewmodel.ClaimPreviewViewModel claimPreviewViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.di.NavigationModule$provideP2PEntryProviderInstaller$1$22$1$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = claimPreviewViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
    }
}
