package com.paypal.oslo.feature.activity.ui.ledger.view.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1", f = "ActivityLedgerCompose.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m = "invokeSuspend", n = {"<this>"}, nl = {187}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerComposeKt$preFetchActivityLedgerItems$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel = this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState value;
                    value = com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.this.getActivityLedgerUIState$activity_prodRelease().getValue();
                    return value;
                }
            }), new com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1.AnonymousClass2(coroutineScope, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "currentState", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1$2", f = "ActivityLedgerCompose.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState = (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success)) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap, null, null, new com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1.AnonymousClass2.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, null), 3, null);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap, null, null, new com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1.AnonymousClass2.C01142(this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            }
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1$2$1", f = "ActivityLedgerCompose.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel getHighResolutionOutputSizeshNQ4ISI;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.getHighSpeedVideoSizes != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.fetchActivityLedgerItems$activity_prodRelease$default(this.getHighResolutionOutputSizeshNQ4ISI, null, 1, null);
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1.AnonymousClass2.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1.AnonymousClass2.AnonymousClass1> continuation) {
                super(2, continuation);
                this.getHighResolutionOutputSizeshNQ4ISI = activityLedgerViewModel;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1$2$2", f = "ActivityLedgerCompose.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
        /* renamed from: com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1$2$2, reason: invalid class name and collision with other inner class name */
        static final class C01142 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int Camera2StreamConfigurationMap;
            final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.Camera2StreamConfigurationMap != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI.initUserProfileInfo$activity_prodRelease();
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1.AnonymousClass2.C01142) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1.AnonymousClass2.C01142(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01142(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1.AnonymousClass2.C01142> continuation) {
                super(2, continuation);
                this.getHighResolutionOutputSizeshNQ4ISI = activityLedgerViewModel;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1.AnonymousClass2) create(activityUiState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1.AnonymousClass2 anonymousClass2 = new com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass2.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = coroutineScope;
            this.getHighSpeedVideoFpsRangesFor = activityLedgerViewModel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1 activityLedgerComposeKt$preFetchActivityLedgerItems$1 = new com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1(this.getHighSpeedVideoSizes, continuation);
        activityLedgerComposeKt$preFetchActivityLedgerItems$1.Camera2StreamConfigurationMap = obj;
        return activityLedgerComposeKt$preFetchActivityLedgerItems$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerComposeKt$preFetchActivityLedgerItems$1(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$preFetchActivityLedgerItems$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = activityLedgerViewModel;
    }
}
