package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$unlinkEmail$2", f = "ConnectedAppsAndSitesViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, nl = {176}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ConnectedAppsAndSitesViewModel$unlinkEmail$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.RemoveProviderConsentUseCase removeProviderConsentUseCase;
        java.util.List list;
        com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper connectedAppsMapper;
        java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent> list2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.util.List list3;
        com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper connectedAppsMapper2;
        java.util.List<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent> list4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$unlinkEmail$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content copy$default;
                    copy$default = com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) obj2, null, null, true, null, 11, null);
                    return copy$default;
                }
            });
            removeProviderConsentUseCase = this.getInputFormats.getInputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = removeProviderConsentUseCase.invoke(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this);
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
        com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel = this.getInputFormats;
        boolean z = this.getHighSpeedVideoSizes;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.consumerprivacy.LoggerKt.log, "Failed to unlink email", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, sharingInfoAppItem.getName()), kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError) ((arrow.core.Ior.Left) ior).getValue()).getDescription())), null, null, 12, null);
            connectedAppsAndSitesViewModel.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$unlinkEmail$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content copy$default;
                    copy$default = com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) obj2, null, null, false, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.UnlinkFailed.INSTANCE, 3, null);
                    return copy$default;
                }
            });
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.consumerprivacy.domain.model.RemoveProviderResult removeProviderResult = (com.paypal.oslo.feature.consumerprivacy.domain.model.RemoveProviderResult) ((arrow.core.Ior.Right) ior).getValue();
            list3 = connectedAppsAndSitesViewModel.getInputFormats;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list3) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent) obj2).getId(), sharingInfoAppItem.getId())) {
                    arrayList.add(obj2);
                }
            }
            connectedAppsAndSitesViewModel.getInputFormats = arrayList;
            connectedAppsMapper2 = connectedAppsAndSitesViewModel.getHighSpeedVideoFpsRangesFor;
            list4 = connectedAppsAndSitesViewModel.getInputFormats;
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content mapToUiState = connectedAppsMapper2.mapToUiState(list4);
            mutableStateFlow2 = connectedAppsAndSitesViewModel.getOutputMinFrameDuration;
            mutableStateFlow2.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content.copy$default(mapToUiState, null, null, false, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.access$mapUnlinkResult(connectedAppsAndSitesViewModel, removeProviderResult.getDeauthorized(), removeProviderResult.getDataDeleted(), z), 7, null));
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.oslo.feature.consumerprivacy.domain.model.RemoveProviderResult removeProviderResult2 = (com.paypal.oslo.feature.consumerprivacy.domain.model.RemoveProviderResult) both.getRightValue();
            list = connectedAppsAndSitesViewModel.getInputFormats;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : list) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent) obj3).getId(), sharingInfoAppItem.getId())) {
                    arrayList2.add(obj3);
                }
            }
            connectedAppsAndSitesViewModel.getInputFormats = arrayList2;
            connectedAppsMapper = connectedAppsAndSitesViewModel.getHighSpeedVideoFpsRangesFor;
            list2 = connectedAppsAndSitesViewModel.getInputFormats;
            com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content mapToUiState2 = connectedAppsMapper.mapToUiState(list2);
            mutableStateFlow = connectedAppsAndSitesViewModel.getOutputMinFrameDuration;
            mutableStateFlow.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content.copy$default(mapToUiState2, null, null, false, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.access$mapUnlinkResult(connectedAppsAndSitesViewModel, removeProviderResult2.getDeauthorized(), removeProviderResult2.getDataDeleted(), z), 7, null));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$unlinkEmail$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$unlinkEmail$2(this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectedAppsAndSitesViewModel$unlinkEmail$2(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel, java.lang.String str, java.lang.String str2, boolean z, com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$unlinkEmail$2> continuation) {
        super(2, continuation);
        this.getInputFormats = connectedAppsAndSitesViewModel;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = sharingInfoAppItem;
    }
}
