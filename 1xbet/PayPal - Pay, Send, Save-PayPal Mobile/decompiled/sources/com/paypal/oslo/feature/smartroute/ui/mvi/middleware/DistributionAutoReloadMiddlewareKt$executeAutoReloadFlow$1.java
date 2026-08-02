package com.paypal.oslo.feature.smartroute.ui.mvi.middleware;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeAutoReloadFlow$1", f = "DistributionAutoReloadMiddleware.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, 163}, m = "invokeSuspend", n = {}, nl = {163, 161}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DistributionAutoReloadMiddlewareKt$executeAutoReloadFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt.access$executeDeactivateFlow(r4.getHighResolutionOutputSizeshNQ4ISI, r4.getHighSpeedVideoFpsRangesFor, r4) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt.access$executeSetupFlow(r4.getHighResolutionOutputSizeshNQ4ISI, r4.getHighSpeedVideoFpsRangesFor, r4) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i2 = com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeAutoReloadFlow$1.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoSizes.ordinal()];
            if (i2 == 1) {
                this.Camera2StreamConfigurationMap = 1;
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.Camera2StreamConfigurationMap = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeAutoReloadFlow$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.SETUP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType.DEACTIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeAutoReloadFlow$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DistributionAutoReloadMiddlewareKt$executeAutoReloadFlow$1(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadFlowType autoReloadFlowType, com.paypal.oslo.feature.smartroute.ui.viewmodel.DistributionViewModel distributionViewModel, com.paypal.oslo.feature.smartroute.ui.model.DistributionScreenState distributionScreenState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.smartroute.ui.mvi.middleware.DistributionAutoReloadMiddlewareKt$executeAutoReloadFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = autoReloadFlowType;
        this.getHighResolutionOutputSizeshNQ4ISI = distributionViewModel;
        this.getHighSpeedVideoFpsRangesFor = distributionScreenState;
    }
}
