package com.paypal.oslo.feature.home.ui.accountsnapshot;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1", f = "AccountSnapshotProviderImpl.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, nl = {115}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1$1", f = "AccountSnapshotProviderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect accountSnapshotUiEffect = (com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(accountSnapshotUiEffect instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect.Navigate)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect accountSnapshotUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect.Navigate) accountSnapshotUiEffect).getDestination());
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotUiEffect accountSnapshotUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1.AnonymousClass1) create(accountSnapshotUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges.getUiEffect(), new com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1(com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel accountSnapshotViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImplKt$AccountSnapshotSection$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = accountSnapshotViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
    }
}
