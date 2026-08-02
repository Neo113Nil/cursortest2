package com.paypal.oslo.feature.ads.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel$onAdViewableImpression$2", f = "AdWidgetViewModel.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, nl = {135}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AdWidgetViewModel$onAdViewableImpression$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.ads.domain.model.AdData getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.ads.domain.usecase.TriggerImpressionUseCase triggerImpressionUseCase;
        com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration;
        com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration2;
        com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration3;
        com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            triggerImpressionUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            adWidgetConfiguration = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration5 = null;
            if (adWidgetConfiguration == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                adWidgetConfiguration = null;
            }
            java.lang.String pageName = adWidgetConfiguration.getPageName();
            adWidgetConfiguration2 = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            if (adWidgetConfiguration2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                adWidgetConfiguration2 = null;
            }
            java.lang.String placement = adWidgetConfiguration2.getPlacement();
            adWidgetConfiguration3 = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            if (adWidgetConfiguration3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                adWidgetConfiguration3 = null;
            }
            int placementOrder = adWidgetConfiguration3.getPlacementOrder();
            com.paypal.oslo.feature.ads.domain.model.AdData adData = this.getHighSpeedVideoSizes;
            adWidgetConfiguration4 = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            if (adWidgetConfiguration4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                adWidgetConfiguration5 = adWidgetConfiguration4;
            }
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (triggerImpressionUseCase.invoke(pageName, placement, placementOrder, adData, adWidgetConfiguration5.getPosition(), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel$onAdViewableImpression$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel$onAdViewableImpression$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdWidgetViewModel$onAdViewableImpression$2(com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel adWidgetViewModel, com.paypal.oslo.feature.ads.domain.model.AdData adData, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel$onAdViewableImpression$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = adWidgetViewModel;
        this.getHighSpeedVideoSizes = adData;
    }
}
