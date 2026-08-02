package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$loadConnectedApps$1", f = "ConnectedAppsAndSitesViewModel.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ConnectedAppsAndSitesViewModel$loadConnectedApps$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.GetConnectedAppsUseCase getConnectedAppsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper connectedAppsMapper;
        java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent> list;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper connectedAppsMapper2;
        java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent> list2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            mutableStateFlow.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Loading.INSTANCE);
            getConnectedAppsUseCase = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getConnectedAppsUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel = this.Camera2StreamConfigurationMap;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError connectedAppsError = (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError) ((arrow.core.Ior.Left) ior).getValue();
            mutableStateFlow4 = connectedAppsAndSitesViewModel.getOutputMinFrameDuration;
            mutableStateFlow4.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Error(connectedAppsError.getDescription()));
        } else if (ior instanceof arrow.core.Ior.Right) {
            connectedAppsAndSitesViewModel.getInputFormats = (java.util.List) ((arrow.core.Ior.Right) ior).getValue();
            mutableStateFlow3 = connectedAppsAndSitesViewModel.getOutputMinFrameDuration;
            connectedAppsMapper2 = connectedAppsAndSitesViewModel.getHighSpeedVideoFpsRangesFor;
            list2 = connectedAppsAndSitesViewModel.getInputFormats;
            mutableStateFlow3.setValue(connectedAppsMapper2.mapToUiState(list2));
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            connectedAppsAndSitesViewModel.getInputFormats = (java.util.List) both.getRightValue();
            mutableStateFlow2 = connectedAppsAndSitesViewModel.getOutputMinFrameDuration;
            connectedAppsMapper = connectedAppsAndSitesViewModel.getHighSpeedVideoFpsRangesFor;
            list = connectedAppsAndSitesViewModel.getInputFormats;
            mutableStateFlow2.setValue(connectedAppsMapper.mapToUiState(list));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$loadConnectedApps$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$loadConnectedApps$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectedAppsAndSitesViewModel$loadConnectedApps$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$loadConnectedApps$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = connectedAppsAndSitesViewModel;
    }
}
