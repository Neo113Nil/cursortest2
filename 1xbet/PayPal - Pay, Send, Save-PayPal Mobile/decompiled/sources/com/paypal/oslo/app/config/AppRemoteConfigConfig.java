package com.paypal.oslo.app.config;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/app/config/AppRemoteConfigConfig;", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "environmentProvider", "<init>", "(Lcom/paypal/oslo/app/environment/EnvironmentProvider;)V", "Lcom/paypal/oslo/app/environment/Environment;", "p0", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/app/environment/Environment;)Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "getEnvironment", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment;", "environment", "", "getBaseUrl", "()Ljava/lang/String;", "baseUrl", "Lkotlinx/coroutines/flow/Flow;", "getEnvironmentFlow", "()Lkotlinx/coroutines/flow/Flow;", "environmentFlow", "getBaseUrlFlow", "baseUrlFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AppRemoteConfigConfig implements com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.app.environment.EnvironmentProvider getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AppRemoteConfigConfig(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentProvider, "");
        this.getHighSpeedVideoSizes = environmentProvider;
    }

    @Override // com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig
    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment getEnvironment() {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.getEnvironment());
    }

    @Override // com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig
    public final java.lang.String getBaseUrl() {
        return this.getHighSpeedVideoSizes.getEnvironment().getBaseUrl();
    }

    @Override // com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment> getEnvironmentFlow() {
        final kotlinx.coroutines.flow.Flow<com.paypal.oslo.app.environment.Environment> environmentFlow = this.getHighSpeedVideoSizes.getEnvironmentFlow();
        return new kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment>() { // from class: com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ com.paypal.oslo.app.config.AppRemoteConfigConfig getHighSpeedVideoFpsRanges;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment highSpeedVideoSizes;
                    if (continuation instanceof com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getOutputMinFrameDuration -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getOutputMinFrameDuration;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighResolutionOutputSizeshNQ4ISI;
                                com.paypal.oslo.app.config.AppRemoteConfigConfig appRemoteConfigConfig = this.getHighSpeedVideoFpsRanges;
                                highSpeedVideoSizes = com.paypal.oslo.app.config.AppRemoteConfigConfig.getHighSpeedVideoSizes((com.paypal.oslo.app.environment.Environment) obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = 0;
                                anonymousClass1.getOutputMinFrameDuration = 1;
                                if (flowCollector.emit(highSpeedVideoSizes, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj4 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getOutputMinFrameDuration;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$1$2", f = "AppRemoteConfigConfig.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    /* synthetic */ java.lang.Object getOutputFormats;
                    int getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
                        return com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.app.config.AppRemoteConfigConfig appRemoteConfigConfig) {
                    this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
                    this.getHighSpeedVideoFpsRanges = appRemoteConfigConfig;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    @Override // com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig
    public final kotlinx.coroutines.flow.Flow<java.lang.String> getBaseUrlFlow() {
        final kotlinx.coroutines.flow.Flow<com.paypal.oslo.app.environment.Environment> environmentFlow = this.getHighSpeedVideoSizes.getEnvironmentFlow();
        return new kotlinx.coroutines.flow.Flow<java.lang.String>() { // from class: com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$2

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$2.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getInputFormats & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getInputFormats -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputMinFrameDuration;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getInputFormats;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRangesFor;
                                java.lang.String baseUrl = ((com.paypal.oslo.app.environment.Environment) obj).getBaseUrl();
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoSizes = 0;
                                anonymousClass1.getInputFormats = 1;
                                if (flowCollector.emit(baseUrl, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$2.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputMinFrameDuration;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getInputFormats;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$2$2", f = "AppRemoteConfigConfig.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    int getHighSpeedVideoSizes;
                    int getInputFormats;
                    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputMinFrameDuration = obj;
                        this.getInputFormats |= Integer.MIN_VALUE;
                        return com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$2.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.lang.String> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.app.config.AppRemoteConfigConfig$special$$inlined$map$2.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment getHighSpeedVideoSizes(com.paypal.oslo.app.environment.Environment p0) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(p0, com.paypal.oslo.app.environment.Environment.Production.INSTANCE)) {
            return com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.Production.INSTANCE;
        }
        if (p0 instanceof com.paypal.oslo.app.environment.Environment.Stage) {
            return com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.Development.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
