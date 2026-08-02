package com.paypal.oslo.feature.ads.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel$loadAdData$1", f = "AdWidgetViewModel.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, nl = {95}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AdWidgetViewModel$loadAdData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.ads.ui.widget.AdWidgetState adWidgetState;
        com.paypal.oslo.feature.ads.domain.usecase.GetAdDataUseCase getAdDataUseCase;
        com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration;
        com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration2;
        com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration3;
        com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration4;
        com.paypal.oslo.feature.ads.api.widget.configs.AdWidgetConfiguration adWidgetConfiguration5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.ads.domain.model.AdData adData = null;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                getAdDataUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                adWidgetConfiguration = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                if (adWidgetConfiguration == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    adWidgetConfiguration = null;
                }
                java.lang.String pageName = adWidgetConfiguration.getPageName();
                adWidgetConfiguration2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                if (adWidgetConfiguration2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    adWidgetConfiguration2 = null;
                }
                java.lang.String placement = adWidgetConfiguration2.getPlacement();
                adWidgetConfiguration3 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                if (adWidgetConfiguration3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    adWidgetConfiguration3 = null;
                }
                int placementOrder = adWidgetConfiguration3.getPlacementOrder();
                adWidgetConfiguration4 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                if (adWidgetConfiguration4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    adWidgetConfiguration4 = null;
                }
                int position = adWidgetConfiguration4.getPosition();
                adWidgetConfiguration5 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                if (adWidgetConfiguration5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    adWidgetConfiguration5 = null;
                }
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = getAdDataUseCase.invoke(pageName, placement, placementOrder, position, adWidgetConfiguration5.getCountry(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            adData = (com.paypal.oslo.feature.ads.domain.model.AdData) obj;
        } catch (java.io.IOException unused) {
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        }
        mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
        if (adData != null) {
            adWidgetState = new com.paypal.oslo.feature.ads.ui.widget.AdWidgetState.Loaded(adData);
        } else {
            adWidgetState = com.paypal.oslo.feature.ads.ui.widget.AdWidgetState.Error.INSTANCE;
        }
        mutableStateFlow.setValue(adWidgetState);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel$loadAdData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel$loadAdData$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdWidgetViewModel$loadAdData$1(com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel adWidgetViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.ads.ui.widget.AdWidgetViewModel$loadAdData$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = adWidgetViewModel;
    }
}
