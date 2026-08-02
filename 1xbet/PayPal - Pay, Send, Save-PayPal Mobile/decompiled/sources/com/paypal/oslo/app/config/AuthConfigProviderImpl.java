package com.paypal.oslo.app.config;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/app/config/AuthConfigProviderImpl;", "Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "appEnvironmentProvider", "<init>", "(Lcom/paypal/oslo/app/environment/EnvironmentProvider;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "Lcom/paypal/oslo/core/identity/config/AuthConfig;", "getConfig", "()Lcom/paypal/oslo/core/identity/config/AuthConfig;", "config", "Lkotlinx/coroutines/flow/Flow;", "configFlow", "Lkotlinx/coroutines/flow/Flow;", "getConfigFlow", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AuthConfigProviderImpl implements com.paypal.oslo.core.identity.config.AuthConfigProvider {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.identity.config.AuthConfig> configFlow;
    private final com.paypal.oslo.app.environment.EnvironmentProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AuthConfigProviderImpl(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentProvider, "");
        this.getHighSpeedVideoFpsRanges = environmentProvider;
        final kotlinx.coroutines.flow.Flow<com.paypal.oslo.app.environment.Environment> environmentFlow = environmentProvider.getEnvironmentFlow();
        this.configFlow = new kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.identity.config.AuthConfig>() { // from class: com.paypal.oslo.app.config.AuthConfigProviderImpl$special$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.app.config.AuthConfigProviderImpl$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector Camera2StreamConfigurationMap;
                final /* synthetic */ com.paypal.oslo.app.config.AuthConfigProviderImpl getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.app.config.AuthConfigProviderImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof com.paypal.oslo.app.config.AuthConfigProviderImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.app.config.AuthConfigProviderImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getOutputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.Camera2StreamConfigurationMap;
                                com.paypal.oslo.core.identity.config.AuthConfig access$toAuthConfig = com.paypal.oslo.app.config.AuthConfigProviderImpl.access$toAuthConfig(this.getHighSpeedVideoFpsRangesFor, (com.paypal.oslo.app.environment.Environment) obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighSpeedVideoFpsRanges = 0;
                                anonymousClass1.getHighSpeedVideoSizesFor = 1;
                                if (flowCollector.emit(access$toAuthConfig, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                java.lang.Object obj3 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.app.config.AuthConfigProviderImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getOutputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.config.AuthConfigProviderImpl$special$$inlined$map$1$2", f = "AuthConfigProviderImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.app.config.AuthConfigProviderImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                    int getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getHighSpeedVideoSizesFor;
                    /* synthetic */ java.lang.Object getOutputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getOutputFormats = obj;
                        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
                        return com.paypal.oslo.app.config.AuthConfigProviderImpl$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.app.config.AuthConfigProviderImpl authConfigProviderImpl) {
                    this.Camera2StreamConfigurationMap = flowCollector;
                    this.getHighSpeedVideoFpsRangesFor = authConfigProviderImpl;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.core.identity.config.AuthConfig> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.app.config.AuthConfigProviderImpl$special$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }

    @Override // com.paypal.oslo.core.identity.config.AuthConfigProvider
    public final com.paypal.oslo.core.identity.config.AuthConfig getConfig() {
        com.paypal.oslo.app.environment.Environment environment = this.getHighSpeedVideoFpsRanges.getEnvironment();
        return new com.paypal.oslo.core.identity.config.AuthConfig(environment.getAppID(), environment.getFirstPartyClientId(), environment.getProxyClientId(), environment.getRedirectUri());
    }

    @Override // com.paypal.oslo.core.identity.config.AuthConfigProvider
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.identity.config.AuthConfig> getConfigFlow() {
        return this.configFlow;
    }

    public static final /* synthetic */ com.paypal.oslo.core.identity.config.AuthConfig access$toAuthConfig(com.paypal.oslo.app.config.AuthConfigProviderImpl authConfigProviderImpl, com.paypal.oslo.app.environment.Environment environment) {
        return new com.paypal.oslo.core.identity.config.AuthConfig(environment.getAppID(), environment.getFirstPartyClientId(), environment.getProxyClientId(), environment.getRedirectUri());
    }
}
