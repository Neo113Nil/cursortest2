package com.paypal.oslo.feature.activity.ui.ledger.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1", f = "ActivityLedgerViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, nl = {202}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerViewModel$fetchActivityLedgerItems$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                if (kotlinx.coroutines.SupervisorKt.supervisorScope(new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.util.concurrent.CancellationException e) {
            this.getHighSpeedVideoFpsRangesFor.logException$activity_prodRelease(e);
            mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
            mutableStateFlow2.setValue(com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Loading.INSTANCE);
            throw e;
        } catch (java.lang.Exception e2) {
            this.getHighSpeedVideoFpsRangesFor.logException$activity_prodRelease(e2);
            iActivityErrorMapper = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
            com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModel errorUIModel = com.paypal.oslo.feature.activity.domain.base.error.ActivityErrorUIModelKt.toErrorUIModel(new com.paypal.oslo.feature.activity.domain.base.error.ActivityGenericErrorActivityImpl(iActivityErrorMapper.mapToDomainError(e2).getErrorMessage(), null, 2, null));
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getInputFormats;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure(new com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult(null, errorUIModel, 1, null)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1$1", f = "ActivityLedgerViewModel.kt", i = {0, 0, 0, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m = "invokeSuspend", n = {"$this$supervisorScope", "emailStatusDeferred", "ledgerDeferred", "$this$supervisorScope", "emailStatusDeferred", "ledgerDeferred"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getHighSpeedVideoSizes;
        private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

        /* JADX WARN: Code restructure failed: missing block: B:14:0x00b2, code lost:
        
            if (r12 != r7) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager;
            kotlinx.coroutines.Deferred async$default;
            kotlinx.coroutines.Deferred async$default2;
            kotlinx.coroutines.Deferred deferred;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
            com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityActionCardHelper activityActionCardHelper;
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizesFor;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                activityFeatureManager = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor;
                async$default = (activityFeatureManager.isLedgerActionCardEnabled() && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null))) ? kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1$1$emailStatusDeferred$1(this.Camera2StreamConfigurationMap, null), 3, null) : null;
                async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1$1$ledgerDeferred$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, null), 3, null);
                if (async$default != null) {
                    this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default);
                    this.getHighSpeedVideoFpsRanges = async$default2;
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (async$default.await(this) != coroutine_suspended) {
                        deferred = async$default;
                    }
                    return coroutine_suspended;
                }
                this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default2);
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
                obj = async$default2.await(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutableStateFlow = this.Camera2StreamConfigurationMap.getInputFormats;
                    activityActionCardHelper = this.Camera2StreamConfigurationMap.getOutputSizeshNQ4ISI;
                    mutableStateFlow.setValue(activityActionCardHelper.injectIntoUiState((com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) obj, this.Camera2StreamConfigurationMap.getEmailLinkStatus$activity_prodRelease().getValue(), this.getHighSpeedVideoSizes));
                    return kotlin.Unit.INSTANCE;
                }
                async$default2 = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRanges;
                deferred = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            async$default = deferred;
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default2);
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
            obj = async$default2.await(this);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoSizesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = activityLedgerViewModel;
            this.getHighSpeedVideoSizes = activityFilterType;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerViewModel$fetchActivityLedgerItems$1(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel$fetchActivityLedgerItems$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = activityLedgerViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = activityFilterType;
    }
}
