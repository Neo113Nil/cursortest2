package com.paypal.oslo.core.remoteconfig;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/StatsigFeatureGate;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "Lcom/statsig/androidsdk/Statsig;", "statsig", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigState;", "remoteConfigState", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/statsig/androidsdk/Statsig;Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigState;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "key", "", "checkGate", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;)Z", "Lkotlinx/coroutines/flow/Flow;", "checkGateFlow", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;)Lkotlinx/coroutines/flow/Flow;", "checkGateAuthenticated", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkGateAuthenticatedFlow", "Lcom/statsig/androidsdk/Statsig;", "getStatsig", "()Lcom/statsig/androidsdk/Statsig;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigState;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/userstore/UserStore;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StatsigFeatureGate implements com.paypal.oslo.core.remoteconfig.contract.FeatureGate {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState getHighResolutionOutputSizeshNQ4ISI;
    private final com.statsig.androidsdk.Statsig statsig;

    public StatsigFeatureGate(com.statsig.androidsdk.Statsig statsig, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigState remoteConfigState, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.statsig = statsig;
        this.getHighResolutionOutputSizeshNQ4ISI = remoteConfigState;
        this.Camera2StreamConfigurationMap = userStore;
    }

    public final com.statsig.androidsdk.Statsig getStatsig() {
        return this.statsig;
    }

    @Override // com.paypal.oslo.core.remoteconfig.contract.FeatureGate
    public final boolean checkGate(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (!com.statsig.androidsdk.Statsig.isInitialized()) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "remote_config_feature_gate_failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", key.getDomain()), kotlin.TuplesKt.to("key_name", key.getKeyName()), kotlin.TuplesKt.to("reason", com.paypal.android.threeds.utils.ConstantUtil.SDK_NOT_INITIALIZED)), null, 4, null);
            return false;
        }
        com.statsig.androidsdk.FeatureGate featureGate = com.statsig.androidsdk.Statsig.getFeatureGate(key.getKeyName());
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "remote_config_feature_gate_exposure", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("domain", key.getDomain()), kotlin.TuplesKt.to("key_name", key.getKeyName()), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, java.lang.Boolean.valueOf(featureGate.getValue())), kotlin.TuplesKt.to("reason", featureGate.getDetails().getReason()), kotlin.TuplesKt.to("user_state", this.Camera2StreamConfigurationMap.getUserState().getValue().getClass().getSimpleName()), kotlin.TuplesKt.to("remote_config_user_state", this.getHighResolutionOutputSizeshNQ4ISI.getRemoteConfigUserState().getValue().getClass().getSimpleName())), null, 4, null);
        return featureGate.getValue();
    }

    @Override // com.paypal.oslo.core.remoteconfig.contract.FeatureGate
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> checkGateFlow(final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState> remoteConfigUserState = this.getHighResolutionOutputSizeshNQ4ISI.getRemoteConfigUserState();
        return kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateFlow$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ com.paypal.oslo.core.remoteconfig.StatsigFeatureGate getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoSizes.checkGate(this.getHighSpeedVideoFpsRangesFor));
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateFlow$$inlined$map$1$2", f = "StatsigFeatureGate.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getInputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateFlow$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.core.remoteconfig.StatsigFeatureGate statsigFeatureGate, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey remoteConfigKey) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    this.getHighSpeedVideoSizes = statsigFeatureGate;
                    this.getHighSpeedVideoFpsRangesFor = remoteConfigKey;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateFlow$$inlined$map$1.AnonymousClass2(flowCollector, this, key), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.core.remoteconfig.contract.FeatureGate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object checkGateAuthenticated(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey remoteConfigKey, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticated$1 statsigFeatureGate$checkGateAuthenticated$1;
        int i;
        if (continuation instanceof com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticated$1) {
            statsigFeatureGate$checkGateAuthenticated$1 = (com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticated$1) continuation;
            if ((statsigFeatureGate$checkGateAuthenticated$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                statsigFeatureGate$checkGateAuthenticated$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = statsigFeatureGate$checkGateAuthenticated$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = statsigFeatureGate$checkGateAuthenticated$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState> remoteConfigUserState = this.getHighResolutionOutputSizeshNQ4ISI.getRemoteConfigUserState();
                    com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticated$2 statsigFeatureGate$checkGateAuthenticated$2 = new com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticated$2(null);
                    statsigFeatureGate$checkGateAuthenticated$1.getHighSpeedVideoSizes = remoteConfigKey;
                    statsigFeatureGate$checkGateAuthenticated$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.flow.FlowKt.first(remoteConfigUserState, statsigFeatureGate$checkGateAuthenticated$2, statsigFeatureGate$checkGateAuthenticated$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    remoteConfigKey = (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) statsigFeatureGate$checkGateAuthenticated$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(checkGate(remoteConfigKey));
            }
        }
        statsigFeatureGate$checkGateAuthenticated$1 = new com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticated$1(this, continuation);
        java.lang.Object obj2 = statsigFeatureGate$checkGateAuthenticated$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = statsigFeatureGate$checkGateAuthenticated$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(checkGate(remoteConfigKey));
    }

    @Override // com.paypal.oslo.core.remoteconfig.contract.FeatureGate
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> checkGateAuthenticatedFlow(final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState> remoteConfigUserState = this.getHighResolutionOutputSizeshNQ4ISI.getRemoteConfigUserState();
        final kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState> flow = new kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState>() { // from class: com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$filter$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputSizeshNQ4ISI;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputMinFrameDuration;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                if (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserStateKt.isAuthenticated((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState) obj)) {
                                    anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                    anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                    anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                    anonymousClass1.getHighSpeedVideoSizes = 0;
                                    anonymousClass1.getOutputMinFrameDuration = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj3 = anonymousClass1.Camera2StreamConfigurationMap;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputMinFrameDuration;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$filter$1$2", f = "StatsigFeatureGate.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
                    int getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputSizeshNQ4ISI = obj;
                        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                        return com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
        return kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(new kotlinx.coroutines.flow.Flow<java.lang.Boolean>() { // from class: com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;
                final /* synthetic */ com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ com.paypal.oslo.core.remoteconfig.StatsigFeatureGate getHighSpeedVideoSizes;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputMinFrameDuration;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoSizes.checkGate(this.getHighSpeedVideoFpsRangesFor));
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoSizes = 0;
                                anonymousClass1.getInputSizeshNQ4ISI = 1;
                                if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputMinFrameDuration;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$map$1$2", f = "StatsigFeatureGate.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    int getInputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputMinFrameDuration = obj;
                        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.core.remoteconfig.StatsigFeatureGate statsigFeatureGate, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey remoteConfigKey) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                    this.getHighSpeedVideoSizes = statsigFeatureGate;
                    this.getHighSpeedVideoFpsRangesFor = remoteConfigKey;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.core.remoteconfig.StatsigFeatureGate$checkGateAuthenticatedFlow$$inlined$map$1.AnonymousClass2(flowCollector, this, key), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        });
    }
}
