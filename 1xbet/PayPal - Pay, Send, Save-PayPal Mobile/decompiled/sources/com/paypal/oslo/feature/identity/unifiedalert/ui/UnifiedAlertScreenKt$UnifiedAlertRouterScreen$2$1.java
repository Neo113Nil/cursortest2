package com.paypal.oslo.feature.identity.unifiedalert.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertScreenKt$UnifiedAlertRouterScreen$2$1", f = "UnifiedAlertScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class UnifiedAlertScreenKt$UnifiedAlertRouterScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode unifiedAlertInitMode = this.getHighResolutionOutputSizeshNQ4ISI;
        if (unifiedAlertInitMode instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Foreground) {
            com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel unifiedAlertViewModel = this.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData = ((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Foreground) unifiedAlertInitMode).getAlertData();
            java.lang.String name2 = ((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Foreground) this.getHighResolutionOutputSizeshNQ4ISI).getSource().name();
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = name2.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            unifiedAlertViewModel.processDestination(alertData, lowerCase);
        } else {
            if (!(unifiedAlertInitMode instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Deeplink)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRangesFor.processDeeplink(((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Deeplink) unifiedAlertInitMode).getDocId(), ((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode.Deeplink) this.getHighResolutionOutputSizeshNQ4ISI).getExpiryTime());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertScreenKt$UnifiedAlertRouterScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertScreenKt$UnifiedAlertRouterScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnifiedAlertScreenKt$UnifiedAlertRouterScreen$2$1(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertInitMode unifiedAlertInitMode, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel unifiedAlertViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertScreenKt$UnifiedAlertRouterScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = unifiedAlertInitMode;
        this.getHighSpeedVideoFpsRangesFor = unifiedAlertViewModel;
    }
}
