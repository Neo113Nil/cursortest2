package com.paypal.oslo.feature.identity.unifiedalert.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$processDeeplink$1", f = "UnifiedAlertViewModel.kt", i = {}, l = {104, 109}, m = "invokeSuspend", n = {}, nl = {105, 104}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class UnifiedAlertViewModel$processDeeplink$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel.access$fetchForDeeplink(r9.getHighResolutionOutputSizeshNQ4ISI, r9.Camera2StreamConfigurationMap, r9) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
    
        if (r10 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager alertDeduplicationManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            alertDeduplicationManager = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            obj = alertDeduplicationManager.onTriggerReceived(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertSource.DEEP_LINK, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction triggerAction = (com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction) obj;
        if (triggerAction instanceof com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction.Skip) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Deeplink alert trigger skipped — state machine rejected", null, null, 6, null);
            return kotlin.Unit.INSTANCE;
        }
        if (!(triggerAction instanceof com.paypal.oslo.feature.identity.unifiedalert.domain.TriggerAction.Fetch)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.getHighSpeedVideoSizes = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$processDeeplink$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$processDeeplink$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnifiedAlertViewModel$processDeeplink$1(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel unifiedAlertViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$processDeeplink$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = unifiedAlertViewModel;
        this.Camera2StreamConfigurationMap = str;
    }
}
