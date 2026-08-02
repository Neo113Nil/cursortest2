package com.paypal.oslo.app.navigation;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/app/navigation/NavigationConfigProviderImpl;", "Lcom/paypal/oslo/app/navigation/NavigationConfigProvider;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/app/navigation/NavigationFlowProvider;", "navigationFlowProvider", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Ljava/util/Optional;", "Lcom/paypal/oslo/core/navigation/ui/NavigationBadgeProvider;", "badgeProvider", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/app/navigation/NavigationFlowProvider;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Ljava/util/Optional;)V", "Lcom/paypal/oslo/core/userstore/model/UserState;", "p0", "", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/userstore/model/UserState;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/app/navigation/NavigationFlowProvider;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/app/navigation/TopBarUiState;", "topBarUiState", "Lkotlinx/coroutines/flow/Flow;", "getTopBarUiState", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/app/navigation/BottomNavUiConfig;", "bottomNavUiConfig", "getBottomNavUiConfig", "isL0EntryEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavigationConfigProviderImpl implements com.paypal.oslo.app.navigation.NavigationConfigProvider {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.app.navigation.BottomNavUiConfig> bottomNavUiConfig;
    private final com.paypal.oslo.app.navigation.NavigationFlowProvider getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isL0EntryEnabled;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.app.navigation.TopBarUiState> topBarUiState;

    @javax.inject.Inject
    public NavigationConfigProviderImpl(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.app.navigation.NavigationFlowProvider navigationFlowProvider, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, java.util.Optional<com.paypal.oslo.core.navigation.ui.NavigationBadgeProvider> optional) {
        kotlinx.coroutines.flow.StateFlow<java.lang.Integer> badgeCount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationFlowProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.getHighResolutionOutputSizeshNQ4ISI = navigationFlowProvider;
        this.Camera2StreamConfigurationMap = featureGate;
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = userStore.getUserState();
        kotlinx.coroutines.flow.Flow<com.paypal.oslo.app.navigation.TopBarUiState> flow = new kotlinx.coroutines.flow.Flow<com.paypal.oslo.app.navigation.TopBarUiState>() { // from class: com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.paypal.oslo.app.navigation.NavigationConfigProviderImpl getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputFormats -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                com.paypal.oslo.app.navigation.TopBarUiState access$createTopBarState = com.paypal.oslo.app.navigation.NavigationConfigProviderImpl.access$createTopBarState(this.getHighSpeedVideoFpsRangesFor, (com.paypal.oslo.core.userstore.model.UserState) obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoSizes = 0;
                                anonymousClass1.getInputFormats = 1;
                                if (flowCollector.emit(access$createTopBarState, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj3 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$1$2", f = "NavigationConfigProviderImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    int getInputFormats;
                    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputSizeshNQ4ISI = obj;
                        this.getInputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.app.navigation.NavigationConfigProviderImpl navigationConfigProviderImpl) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    this.getHighSpeedVideoFpsRangesFor = navigationConfigProviderImpl;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.app.navigation.TopBarUiState> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        com.paypal.oslo.core.navigation.ui.NavigationBadgeProvider orElse = optional.orElse(null);
        this.topBarUiState = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(kotlinx.coroutines.flow.FlowKt.combine(flow, (orElse == null || (badgeCount = orElse.getBadgeCount()) == null) ? kotlinx.coroutines.flow.FlowKt.flowOf(0) : badgeCount, new com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$topBarUiState$2(null)));
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState2 = userStore.getUserState();
        this.bottomNavUiConfig = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<com.paypal.oslo.app.navigation.BottomNavUiConfig>() { // from class: com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$2

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;
                final /* synthetic */ com.paypal.oslo.app.navigation.NavigationConfigProviderImpl getHighSpeedVideoFpsRanges;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputMinFrameDuration;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                com.paypal.oslo.app.navigation.BottomNavUiConfig access$createBottomNavUiConfig = com.paypal.oslo.app.navigation.NavigationConfigProviderImpl.access$createBottomNavUiConfig(this.getHighSpeedVideoFpsRanges, (com.paypal.oslo.core.userstore.model.UserState) obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                anonymousClass1.getOutputMinFrameDuration = 1;
                                if (flowCollector.emit(access$createBottomNavUiConfig, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj4 = anonymousClass1.Camera2StreamConfigurationMap;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$2.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputMinFrameDuration;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$2$2", f = "NavigationConfigProviderImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
                    int getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputSizeshNQ4ISI = obj;
                        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                        return com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$2.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.app.navigation.NavigationConfigProviderImpl navigationConfigProviderImpl) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                    this.getHighSpeedVideoFpsRanges = navigationConfigProviderImpl;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.app.navigation.BottomNavUiConfig> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        });
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState3 = userStore.getUserState();
        this.isL0EntryEnabled = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$3

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.paypal.oslo.app.navigation.NavigationConfigProviderImpl Camera2StreamConfigurationMap;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$3.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    boolean highSpeedVideoFpsRanges;
                    if (continuation instanceof com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputFormats -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizesFor;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.userstore.model.UserState) obj);
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(highSpeedVideoFpsRanges);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                anonymousClass1.getOutputFormats = 1;
                                if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$3.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$3$2", f = "NavigationConfigProviderImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                    int getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizesFor = obj;
                        this.getOutputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$3.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.app.navigation.NavigationConfigProviderImpl navigationConfigProviderImpl) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    this.Camera2StreamConfigurationMap = navigationConfigProviderImpl;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.app.navigation.NavigationConfigProviderImpl$special$$inlined$map$3.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        });
    }

    @Override // com.paypal.oslo.app.navigation.NavigationConfigProvider
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.app.navigation.TopBarUiState> getTopBarUiState() {
        return this.topBarUiState;
    }

    @Override // com.paypal.oslo.app.navigation.NavigationConfigProvider
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.app.navigation.BottomNavUiConfig> getBottomNavUiConfig() {
        return this.bottomNavUiConfig;
    }

    @Override // com.paypal.oslo.app.navigation.NavigationConfigProvider
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isL0EntryEnabled() {
        return this.isL0EntryEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoFpsRanges(com.paypal.oslo.core.userstore.model.UserState p0) {
        java.lang.String accountType;
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = p0 instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) p0 : null;
        com.paypal.oslo.core.userstore.model.User user = profileLoaded != null ? profileLoaded.getUser() : null;
        boolean z = false;
        if (user != null && (accountType = user.getAccountType()) != null && kotlin.text.StringsKt.equals(accountType, "BUSINESS", true)) {
            z = true;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.shouldAlwaysShowSMBFlow() || z) {
            return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.app.navigation.NavigationFeatureGates.INSTANCE.getL0EntryForBusinessEnabled());
        }
        return this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.app.navigation.NavigationFeatureGates.INSTANCE.getL0EntryForConsumerEnabled());
    }

    public static final /* synthetic */ com.paypal.oslo.app.navigation.BottomNavUiConfig access$createBottomNavUiConfig(com.paypal.oslo.app.navigation.NavigationConfigProviderImpl navigationConfigProviderImpl, com.paypal.oslo.core.userstore.model.UserState userState) {
        com.paypal.oslo.feature.home.api.navigation.HomeDestination homeDestination;
        com.paypal.oslo.core.userstore.model.User user;
        java.lang.String accountType;
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState : null;
        boolean z = navigationConfigProviderImpl.getHighResolutionOutputSizeshNQ4ISI.shouldAlwaysShowSMBFlow() || (profileLoaded != null && (user = profileLoaded.getUser()) != null && (accountType = user.getAccountType()) != null && kotlin.text.StringsKt.equals(accountType, "BUSINESS", true));
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        com.paypal.pds.core.Icon.Home home = com.paypal.pds.core.Icon.Home.INSTANCE;
        if (z) {
            homeDestination = com.paypal.oslo.feature.businesshome.api.navigation.BusinessHomeDestination.INSTANCE;
        } else {
            homeDestination = com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE;
        }
        createListBuilder.add(new com.paypal.oslo.app.navigation.BottomNavUiItem(home, homeDestination, com.paypal.oslo.feature.home.R.string.feature_home_tab_bar, 0, null, 24, null));
        createListBuilder.add(new com.paypal.oslo.app.navigation.BottomNavUiItem(com.paypal.pds.core.Icon.ArrowsUpDown.INSTANCE, com.paypal.oslo.feature.p2p.api.navigation.SendTabConfiguration.INSTANCE.getDefault(), com.paypal.oslo.feature.p2p.R.string.feature_p2p_send_label, 0, null, 24, null));
        if (z) {
            createListBuilder.add(new com.paypal.oslo.app.navigation.BottomNavUiItem(com.paypal.pds.core.Icon.Trophy.INSTANCE, com.paypal.oslo.feature.businesspayandgetpaid.api.BusinessPayAndGetPaidDestination.INSTANCE, com.paypal.oslo.app.R.string.feature_app_navigation_label_get_paid, 0, null, 24, null));
        } else if (navigationConfigProviderImpl.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.app.navigation.NavigationFeatureGates.INSTANCE.getBottomNavPayPalPlusEnabled())) {
            createListBuilder.add(new com.paypal.oslo.app.navigation.BottomNavUiItem(com.paypal.pds.core.Icon.Trophy.INSTANCE, com.paypal.oslo.feature.shoppingrewards.api.rewards.landing.navigation.RewardsLandingDestination.INSTANCE, com.paypal.oslo.app.R.string.feature_app_navigation_label_paypalplus, 0, null, 24, null));
        }
        createListBuilder.add(new com.paypal.oslo.app.navigation.BottomNavUiItem(com.paypal.pds.core.Icon.Person.INSTANCE, com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterConfig.INSTANCE.getDefaultDestination(), com.paypal.oslo.feature.controlcenter.R.string.feature_control_center_me_tab_title, 0, null, 24, null));
        return new com.paypal.oslo.app.navigation.BottomNavUiConfig(kotlin.collections.CollectionsKt.build(createListBuilder));
    }

    public static final /* synthetic */ com.paypal.oslo.app.navigation.TopBarUiState access$createTopBarState(com.paypal.oslo.app.navigation.NavigationConfigProviderImpl navigationConfigProviderImpl, com.paypal.oslo.core.userstore.model.UserState userState) {
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName;
        if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
            com.paypal.oslo.core.userstore.model.User user = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser();
            java.lang.Integer linkedAccountCount = user.getLinkedAccountCount();
            boolean z = linkedAccountCount != null && linkedAccountCount.intValue() >= 2;
            boolean z2 = z && navigationConfigProviderImpl.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.app.navigation.NavigationFeatureGates.INSTANCE.getTopNavAccountSwitchEnabled());
            java.lang.String profileImageURL = z ? user.getProfileImageURL() : null;
            if (z) {
                com.paypal.oslo.core.userstore.model.ProfileName legalName = user.getLegalName();
                if (legalName == null || (personName = legalName.getPersonName()) == null || (str2 = personName.getFullName()) == null) {
                    str2 = "User";
                }
                str = str2;
            } else {
                str = null;
            }
            return new com.paypal.oslo.app.navigation.TopBarUiState(z2, profileImageURL, str, 0, navigationConfigProviderImpl.getHighSpeedVideoFpsRanges(userState), 8, null);
        }
        return new com.paypal.oslo.app.navigation.TopBarUiState(false, null, null, 0, false, 31, null);
    }
}
