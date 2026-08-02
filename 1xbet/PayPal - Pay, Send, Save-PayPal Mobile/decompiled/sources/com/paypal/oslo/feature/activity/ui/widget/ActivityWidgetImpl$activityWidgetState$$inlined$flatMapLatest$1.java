package com.paypal.oslo.feature.activity.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$$inlined$flatMapLatest$1", f = "ActivityWidgetImpl.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m = "invokeSuspend", n = {"$this$transformLatest", "it"}, nl = {-1}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
public final class ActivityWidgetImpl$activityWidgetState$$inlined$flatMapLatest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState>, java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState> flowOf;
        kotlin.jvm.functions.Function0 function0;
        kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState> activityWidgetUIState;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object obj2 = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$$inlined$flatMapLatest$1 activityWidgetImpl$activityWidgetState$$inlined$flatMapLatest$1 = this;
            if (((java.lang.Boolean) obj2).booleanValue()) {
                function0 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                final com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel = (com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel) function0.invoke();
                if (activityWidgetViewModel != null && (activityWidgetUIState = activityWidgetViewModel.getActivityWidgetUIState()) != null) {
                    final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState> stateFlow = activityWidgetUIState;
                    final com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl activityWidgetImpl = this.getHighSpeedVideoSizes;
                    flowOf = new kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState>() { // from class: com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$lambda$0$$inlined$map$1

                        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                        /* renamed from: com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$lambda$0$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;
                            final /* synthetic */ com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl getHighSpeedVideoFpsRangesFor;
                            final /* synthetic */ com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel getHighSpeedVideoSizes;

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                                com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                                int i;
                                if (continuation instanceof com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                                    anonymousClass1 = (com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                                    if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                                        java.lang.Object obj2 = anonymousClass1.getInputFormats;
                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.getHighSpeedVideoSizesFor;
                                        if (i != 0) {
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                            kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                            com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState access$mapUiStateToLifecycleState = com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl.access$mapUiStateToLifecycleState(this.getHighSpeedVideoFpsRangesFor, (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) obj, this.getHighSpeedVideoSizes);
                                            anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                            anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                            anonymousClass1.Camera2StreamConfigurationMap = 0;
                                            anonymousClass1.getHighSpeedVideoSizesFor = 1;
                                            if (flowCollector.emit(access$mapUiStateToLifecycleState, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            int i2 = anonymousClass1.Camera2StreamConfigurationMap;
                                            java.lang.Object obj3 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                            java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj2);
                                        }
                                        return kotlin.Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                                java.lang.Object obj22 = anonymousClass1.getInputFormats;
                                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getHighSpeedVideoSizesFor;
                                if (i != 0) {
                                }
                                return kotlin.Unit.INSTANCE;
                            }

                            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$lambda$0$$inlined$map$1$2", f = "ActivityWidgetImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                            /* renamed from: com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                                int Camera2StreamConfigurationMap;
                                java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object getHighSpeedVideoFpsRanges;
                                java.lang.Object getHighSpeedVideoFpsRangesFor;
                                java.lang.Object getHighSpeedVideoSizes;
                                int getHighSpeedVideoSizesFor;
                                /* synthetic */ java.lang.Object getInputFormats;

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    this.getInputFormats = obj;
                                    this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
                                    return com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$lambda$0$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                                }

                                public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                                    super(continuation);
                                }
                            }

                            public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl activityWidgetImpl, com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel activityWidgetViewModel) {
                                this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                                this.getHighSpeedVideoFpsRangesFor = activityWidgetImpl;
                                this.getHighSpeedVideoSizes = activityWidgetViewModel;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState> flowCollector2, kotlin.coroutines.Continuation continuation) {
                            java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$lambda$0$$inlined$map$1.AnonymousClass2(flowCollector2, activityWidgetImpl, activityWidgetViewModel), continuation);
                            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                        }
                    };
                } else {
                    flowOf = kotlinx.coroutines.flow.FlowKt.flowOf(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState.INITIALIZED_HIDDEN);
                }
            } else {
                flowOf = kotlinx.coroutines.flow.FlowKt.flowOf(com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState.INITIALIZED_HIDDEN);
            }
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector, flowOf, activityWidgetImpl$activityWidgetState$$inlined$flatMapLatest$1) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetLifecycleState> flowCollector, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$$inlined$flatMapLatest$1 activityWidgetImpl$activityWidgetState$$inlined$flatMapLatest$1 = new com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl$activityWidgetState$$inlined$flatMapLatest$1(continuation, this.getHighSpeedVideoSizes);
        activityWidgetImpl$activityWidgetState$$inlined$flatMapLatest$1.getHighSpeedVideoFpsRangesFor = flowCollector;
        activityWidgetImpl$activityWidgetState$$inlined$flatMapLatest$1.getHighSpeedVideoFpsRanges = bool;
        return activityWidgetImpl$activityWidgetState$$inlined$flatMapLatest$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityWidgetImpl$activityWidgetState$$inlined$flatMapLatest$1(kotlin.coroutines.Continuation continuation, com.paypal.oslo.feature.activity.ui.widget.ActivityWidgetImpl activityWidgetImpl) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = activityWidgetImpl;
    }
}
