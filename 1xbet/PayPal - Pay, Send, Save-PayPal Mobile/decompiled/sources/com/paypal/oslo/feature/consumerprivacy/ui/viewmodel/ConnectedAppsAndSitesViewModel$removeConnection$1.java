package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeConnection$1", f = "ConnectedAppsAndSitesViewModel.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, nl = {135}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ConnectedAppsAndSitesViewModel$removeConnection$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase deleteAuthConsentUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeConnection$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content copy$default;
                    copy$default = com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) obj2, null, null, true, null, 11, null);
                    return copy$default;
                }
            });
            deleteAuthConsentUseCase = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = deleteAuthConsentUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI.getId(), this.getHighResolutionOutputSizeshNQ4ISI.getName(), this.getHighResolutionOutputSizeshNQ4ISI.getCategory(), this);
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
        final com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel = this.getHighSpeedVideoFpsRanges;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.consumerprivacy.LoggerKt.log, "Failed to remove connection", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, sharingInfoAppItem.getName()), kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError) ((arrow.core.Ior.Left) ior).getValue()).getDescription())), null, null, 12, null);
            connectedAppsAndSitesViewModel.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeConnection$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content copy$default;
                    copy$default = com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) obj2, null, null, false, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.GenericError.INSTANCE, 3, null);
                    return copy$default;
                }
            });
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.getHighSpeedVideoFpsRanges(connectedAppsAndSitesViewModel, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeConnection$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeConnection$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem.this, (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent) obj2));
                }
            });
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.getHighSpeedVideoFpsRanges(connectedAppsAndSitesViewModel, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeConnection$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeConnection$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem.this, (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent) obj2));
                }
            });
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean getHighSpeedVideoSizes(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem, com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent connectedAppsConsent) {
        return !kotlin.jvm.internal.Intrinsics.areEqual(connectedAppsConsent.getId(), sharingInfoAppItem.getId());
    }

    public static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem, com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent connectedAppsConsent) {
        return !kotlin.jvm.internal.Intrinsics.areEqual(connectedAppsConsent.getId(), sharingInfoAppItem.getId());
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeConnection$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeConnection$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectedAppsAndSitesViewModel$removeConnection$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel, com.paypal.oslo.feature.consumerprivacy.ui.state.SharingInfoAppItem sharingInfoAppItem, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeConnection$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = connectedAppsAndSitesViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = sharingInfoAppItem;
    }
}
