package com.paypal.oslo.feature.balance.ui.balanceDashboard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$2$1", f = "BalanceDashboardScreen.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BalanceDashboardScreenKt$BalanceDashboardScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/BalanceDashboardEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$2$1$1", f = "BalanceDashboardScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect balanceDashboardEffect = (com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(balanceDashboardEffect instanceof com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect.ShowToast)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.Camera2StreamConfigurationMap.setValue(((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect.ShowToast) balanceDashboardEffect).getMessage());
            this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(true));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardEffect balanceDashboardEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$2$1.AnonymousClass1) create(balanceDashboardEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = mutableState;
            this.getHighSpeedVideoFpsRanges = mutableState2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor.getUiEffect(), new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$2$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BalanceDashboardScreenKt$BalanceDashboardScreen$2$1(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModel balanceDashboardViewModel, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardScreenKt$BalanceDashboardScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = balanceDashboardViewModel;
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighSpeedVideoFpsRanges = mutableState2;
    }
}
