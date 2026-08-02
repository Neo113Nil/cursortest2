package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1", f = "ConnectedAppsAndSitesViewModel.kt", i = {}, l = {77, 99}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, 103}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ConnectedAppsAndSitesViewModel$removeApp$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0054, code lost:
    
        if (r15 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        if (r15 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase deleteAuthConsentUseCase;
        com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeactivateAuthConsentUseCase deactivateAuthConsentUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content copy$default;
                    copy$default = com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) obj2, null, null, true, null, 11, null);
                    return copy$default;
                }
            });
            if (!this.getHighSpeedVideoFpsRanges.getActiveGrantIds().isEmpty()) {
                deactivateAuthConsentUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = deactivateAuthConsentUseCase.invoke(this.getHighSpeedVideoFpsRanges.getActiveGrantIds(), this);
            } else {
                deleteAuthConsentUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
                obj = deleteAuthConsentUseCase.invoke(this.getHighSpeedVideoFpsRanges.getId(), this.getHighSpeedVideoFpsRanges.getName(), "APP", this);
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            arrow.core.Ior ior = (arrow.core.Ior) obj;
            final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel = this.Camera2StreamConfigurationMap;
            if (ior instanceof arrow.core.Ior.Left) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.consumerprivacy.LoggerKt.log, "Failed to deactivate auth consent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, connectedAppItem.getName()), kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError) ((arrow.core.Ior.Left) ior).getValue()).getDescription())), null, null, 12, null);
                connectedAppsAndSitesViewModel.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content copy$default;
                        copy$default = com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) obj2, null, null, false, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.GenericError.INSTANCE, 3, null);
                        return copy$default;
                    }
                });
            } else if (ior instanceof arrow.core.Ior.Right) {
                com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.getHighSpeedVideoFpsRanges(connectedAppsAndSitesViewModel, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem.this, (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent) obj2));
                    }
                });
            } else if (ior instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.getHighSpeedVideoFpsRanges(connectedAppsAndSitesViewModel, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem.this, (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent) obj2));
                    }
                });
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            arrow.core.Ior ior2 = (arrow.core.Ior) obj;
            final com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem2 = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel2 = this.Camera2StreamConfigurationMap;
            if (ior2 instanceof arrow.core.Ior.Left) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.consumerprivacy.LoggerKt.log, "Failed to delete auth consent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, connectedAppItem2.getName()), kotlin.TuplesKt.to("error", ((com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError) ((arrow.core.Ior.Left) ior2).getValue()).getDescription())), null, null, 12, null);
                connectedAppsAndSitesViewModel2.Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content copy$default;
                        copy$default = com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsAndSitesUiState.Content) obj2, null, null, false, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppsOperationResult.GenericError.INSTANCE, 3, null);
                        return copy$default;
                    }
                });
            } else if (ior2 instanceof arrow.core.Ior.Right) {
                com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.getHighSpeedVideoFpsRanges(connectedAppsAndSitesViewModel2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem.this, (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent) obj2));
                    }
                });
            } else if (ior2 instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) ior2;
                java.lang.Object leftValue2 = both2.getLeftValue();
                com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel.getHighSpeedVideoFpsRanges(connectedAppsAndSitesViewModel2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem.this, (com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent) obj2));
                    }
                });
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem, com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent connectedAppsConsent) {
        return !kotlin.jvm.internal.Intrinsics.areEqual(connectedAppsConsent.getId(), connectedAppItem.getId());
    }

    public static /* synthetic */ boolean getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem, com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent connectedAppsConsent) {
        return !kotlin.collections.CollectionsKt.contains(connectedAppItem.getActiveGrantIds(), connectedAppsConsent.getGrantId());
    }

    public static /* synthetic */ boolean Camera2StreamConfigurationMap(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem, com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent connectedAppsConsent) {
        return !kotlin.jvm.internal.Intrinsics.areEqual(connectedAppsConsent.getId(), connectedAppItem.getId());
    }

    public static /* synthetic */ boolean getHighSpeedVideoSizes(com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem, com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsConsent connectedAppsConsent) {
        return !kotlin.collections.CollectionsKt.contains(connectedAppItem.getActiveGrantIds(), connectedAppsConsent.getGrantId());
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectedAppsAndSitesViewModel$removeApp$1(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel connectedAppsAndSitesViewModel, com.paypal.oslo.feature.consumerprivacy.ui.state.ConnectedAppItem connectedAppItem, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ConnectedAppsAndSitesViewModel$removeApp$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = connectedAppsAndSitesViewModel;
        this.getHighSpeedVideoFpsRanges = connectedAppItem;
    }
}
