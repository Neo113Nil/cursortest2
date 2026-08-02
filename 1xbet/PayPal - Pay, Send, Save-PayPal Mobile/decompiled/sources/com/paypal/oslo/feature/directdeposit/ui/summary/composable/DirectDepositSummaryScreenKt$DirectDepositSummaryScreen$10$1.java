package com.paypal.oslo.feature.directdeposit.ui.summary.composable;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1", f = "DirectDepositSummaryScreen.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.String, java.lang.String, java.lang.String, kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel getHighSpeedVideoSizesFor;
    int getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/effect/SummaryEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1$1", f = "DirectDepositSummaryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.String, java.lang.String, java.lang.String, kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
        /* synthetic */ java.lang.Object getInputFormats;
        int getInputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel getOutputFormats;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect summaryEffect = (com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect) this.getInputFormats;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getInputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (summaryEffect instanceof com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.LaunchAtomicSDK) {
                if (this.getHighSpeedVideoFpsRanges instanceof android.app.Activity) {
                    this.getOutputFormats.onFindEmployerScreenShown();
                    java.lang.String obj2 = java.util.UUID.randomUUID().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                    final com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager atomicTransactManager = this.getHighSpeedVideoFpsRangesFor;
                    final android.content.Context context = this.getHighSpeedVideoFpsRanges;
                    final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel = this.getOutputFormats;
                    com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener atomicTransactListener = new com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1$1$listener$1
                        @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener
                        public final void onAtomicTransactClose(org.json.JSONObject data) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                            com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager.this.unRegisterAtomicTransactReceiver(context);
                            directDepositSummaryViewModel.cleanGUID();
                        }

                        @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener
                        public final void onAtomicTransactFinish(org.json.JSONObject data) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                            com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager.this.unRegisterAtomicTransactReceiver(context);
                            java.lang.String optString = data.optString("handoffId", "");
                            kotlin.jvm.internal.Intrinsics.checkNotNull(optString);
                            if (optString.length() > 0) {
                                directDepositSummaryViewModel.onAtomicSetupComplete(optString);
                            }
                            directDepositSummaryViewModel.cleanGUID();
                        }

                        @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener
                        public final void onAtomicTransactInteraction(org.json.JSONObject data) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                            directDepositSummaryViewModel.parseOnInteractionAtomicTransactJson(data, "APP DEMO");
                        }

                        @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener
                        public final void onAtomicTransactDataRequest(java.util.List<java.lang.String> fields, java.lang.String taskId, java.lang.String userId, java.lang.String identifier) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fields, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskId, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "");
                            com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState value = directDepositSummaryViewModel.getState().getValue();
                            directDepositSummaryViewModel.updateDepositSwitchAccountDetail(identifier, value.getAccountNumber(), value.getRoutingNumber());
                        }

                        @Override // com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactListener
                        public final void newInteraction(java.lang.String guid) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(guid, "");
                            directDepositSummaryViewModel.cleanGUID();
                            directDepositSummaryViewModel.setAtomicTransactGUID(guid);
                        }
                    };
                    atomicTransactListener.newInteraction(obj2);
                    this.getHighSpeedVideoFpsRangesFor.setAtomicTransactListener(atomicTransactListener);
                    this.getHighSpeedVideoFpsRangesFor.registerAtomicTransactReceiver(this.getHighSpeedVideoFpsRanges);
                    this.getHighSpeedVideoFpsRangesFor.openAtomicTransactForm(this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.directdeposit.atomic.AtomicTransactParams(((com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.LaunchAtomicSDK) summaryEffect).getPublicToken(), "APP DEMO", obj2));
                }
            } else if (summaryEffect instanceof com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.CloseAtomicSDK) {
                android.content.Context context2 = this.getHighSpeedVideoFpsRanges;
                if (context2 instanceof android.app.Activity) {
                    this.getHighSpeedVideoFpsRangesFor.closeAtomicTransact(context2);
                }
            } else if (!(summaryEffect instanceof com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.ShowDepositSwitchSuccess)) {
                if (summaryEffect instanceof com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToSmartRouteSetup) {
                    this.getHighSpeedVideoSizes.invoke();
                } else if (summaryEffect instanceof com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToSmartRouteEdit) {
                    this.getHighSpeedVideoSizes.invoke();
                } else if (summaryEffect instanceof com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToDirectDepositForm) {
                    com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToDirectDepositForm navigateToDirectDepositForm = (com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect.NavigateToDirectDepositForm) summaryEffect;
                    this.Camera2StreamConfigurationMap.invoke(navigateToDirectDepositForm.getRoutingNumber(), navigateToDirectDepositForm.getAccountNumber(), navigateToDirectDepositForm.getBankName());
                }
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.valueOf(true));
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.directdeposit.ui.summary.effect.SummaryEffect summaryEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1.AnonymousClass1) create(summaryEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getInputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(android.content.Context context, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager atomicTransactManager, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = context;
            this.getOutputFormats = directDepositSummaryViewModel;
            this.getHighSpeedVideoFpsRangesFor = atomicTransactManager;
            this.getHighSpeedVideoSizes = function0;
            this.Camera2StreamConfigurationMap = function3;
            this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizesFor.getEffect(), new com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, android.content.Context context, com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager atomicTransactManager, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = directDepositSummaryViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getHighSpeedVideoFpsRanges = atomicTransactManager;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighSpeedVideoSizes = function3;
        this.Camera2StreamConfigurationMap = mutableState;
    }
}
