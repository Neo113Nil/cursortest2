package com.unity3d.services.core.domain.task;

/* compiled from: InitializeStateConfigWithLoader.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", i = {0, 0, 0, 1, 1, 2}, l = {58, 101, 109}, m = "invokeSuspend", n = {"$this$withContext", "configurationLoader", com.helpshift.proactive.InAppViewConstants.CONFIG, "configurationLoader", com.helpshift.proactive.InAppViewConstants.CONFIG, com.helpshift.proactive.InAppViewConstants.CONFIG}, s = {"L$0", "L$3", "L$4", "L$2", "L$3", "L$0"})
/* loaded from: classes6.dex */
final class InitializeStateConfigWithLoader$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$2(com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader, com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, continuation);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c0 A[Catch: all -> 0x022e, CancellationException -> 0x025b, TryCatch #7 {CancellationException -> 0x025b, all -> 0x022e, blocks: (B:8:0x001d, B:9:0x01f2, B:10:0x0223, B:26:0x01b8, B:28:0x01c0, B:32:0x01fc, B:33:0x020e, B:36:0x01ae, B:41:0x016c, B:43:0x0175, B:45:0x020f, B:46:0x021c, B:55:0x021d, B:58:0x0162, B:60:0x007e), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01fc A[Catch: all -> 0x022e, CancellationException -> 0x025b, TryCatch #7 {CancellationException -> 0x025b, all -> 0x022e, blocks: (B:8:0x001d, B:9:0x01f2, B:10:0x0223, B:26:0x01b8, B:28:0x01c0, B:32:0x01fc, B:33:0x020e, B:36:0x01ae, B:41:0x016c, B:43:0x0175, B:45:0x020f, B:46:0x021c, B:55:0x021d, B:58:0x0162, B:60:0x007e), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0175 A[Catch: all -> 0x022e, CancellationException -> 0x025b, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x025b, all -> 0x022e, blocks: (B:8:0x001d, B:9:0x01f2, B:10:0x0223, B:26:0x01b8, B:28:0x01c0, B:32:0x01fc, B:33:0x020e, B:36:0x01ae, B:41:0x016c, B:43:0x0175, B:45:0x020f, B:46:0x021c, B:55:0x021d, B:58:0x0162, B:60:0x007e), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021d A[Catch: all -> 0x022e, CancellationException -> 0x025b, TryCatch #7 {CancellationException -> 0x025b, all -> 0x022e, blocks: (B:8:0x001d, B:9:0x01f2, B:10:0x0223, B:26:0x01b8, B:28:0x01c0, B:32:0x01fc, B:33:0x020e, B:36:0x01ae, B:41:0x016c, B:43:0x0175, B:45:0x020f, B:46:0x021c, B:55:0x021d, B:58:0x0162, B:60:0x007e), top: B:2:0x000d }] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, com.unity3d.services.core.configuration.Configuration] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.unity3d.services.core.configuration.ConfigurationLoader] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, com.unity3d.services.core.configuration.PrivacyConfigurationLoader] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m10798constructorimpl;
        com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender;
        com.unity3d.services.core.request.metrics.SDKMetricsSender sDKMetricsSender2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader;
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params;
        java.lang.Object m10798constructorimpl2;
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader2;
        com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        kotlin.jvm.internal.Ref.ObjectRef objectRef6;
        com.unity3d.services.core.domain.task.InitializeStateNetworkError initializeStateNetworkError;
        java.lang.Object obj2;
        java.lang.Object m10798constructorimpl3;
        com.unity3d.services.core.domain.ISDKDispatchers iSDKDispatchers;
        kotlin.jvm.internal.Ref.ObjectRef objectRef7;
        kotlin.jvm.internal.Ref.ObjectRef objectRef8;
        T t;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader initializeStateConfigWithLoader3 = this.this$0;
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params3 = this.$params;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            com.unity3d.services.core.configuration.PrivacyConfigStorage privacyConfigStorage = com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance();
            sDKMetricsSender = initializeStateConfigWithLoader3.sdkMetricsSender;
            com.unity3d.services.core.device.reader.DeviceInfoDataFactory deviceInfoDataFactory = new com.unity3d.services.core.device.reader.DeviceInfoDataFactory(sDKMetricsSender);
            kotlin.jvm.internal.Ref.ObjectRef objectRef9 = new kotlin.jvm.internal.Ref.ObjectRef();
            com.unity3d.services.core.configuration.ConfigurationRequestFactory configurationRequestFactory = new com.unity3d.services.core.configuration.ConfigurationRequestFactory(params3.getConfig(), deviceInfoDataFactory.getDeviceInfoData(com.unity3d.services.core.configuration.InitRequestType.TOKEN));
            sDKMetricsSender2 = initializeStateConfigWithLoader3.sdkMetricsSender;
            objectRef9.element = new com.unity3d.services.core.configuration.ConfigurationLoader(configurationRequestFactory, sDKMetricsSender2, (com.unity3d.services.core.network.core.HttpClient) initializeStateConfigWithLoader3.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.network.core.HttpClient.class)));
            objectRef9.element = new com.unity3d.services.core.configuration.PrivacyConfigurationLoader((com.unity3d.services.core.configuration.IConfigurationLoader) objectRef9.element, new com.unity3d.services.core.configuration.ConfigurationRequestFactory(params3.getConfig(), deviceInfoDataFactory.getDeviceInfoData(com.unity3d.services.core.configuration.InitRequestType.PRIVACY)), privacyConfigStorage, (com.unity3d.services.core.network.core.HttpClient) initializeStateConfigWithLoader3.getServiceProvider().getRegistry().getService("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.network.core.HttpClient.class)));
            kotlin.jvm.internal.Ref.ObjectRef objectRef10 = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef10.element = new com.unity3d.services.core.configuration.Configuration();
            try {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                int maxRetries = params3.getConfig().getMaxRetries();
                double retryScalingFactor = params3.getConfig().getRetryScalingFactor();
                long retryDelay = params3.getConfig().getRetryDelay();
                com.unity3d.services.core.domain.task.InitializationException initializationException = new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest, new java.lang.Exception(), params3.getConfig());
                com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(initializeStateConfigWithLoader3, objectRef9, objectRef10, null);
                this.L$0 = coroutineScope;
                this.L$1 = initializeStateConfigWithLoader3;
                this.L$2 = params3;
                this.L$3 = objectRef9;
                this.L$4 = objectRef10;
                this.label = 1;
                objectRef = objectRef9;
                try {
                    if (com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(retryDelay, maxRetries, retryScalingFactor, initializationException, initializeStateConfigWithLoader$doWork$2$1$configResult$1$1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef10;
                    objectRef3 = objectRef;
                    initializeStateConfigWithLoader = initializeStateConfigWithLoader3;
                    params = params3;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    objectRef2 = objectRef10;
                    objectRef3 = objectRef;
                    initializeStateConfigWithLoader = initializeStateConfigWithLoader3;
                    params = params3;
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                    initializeStateConfigWithLoader2 = initializeStateConfigWithLoader;
                    params2 = params;
                    objectRef4 = objectRef3;
                    if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl2)) {
                    }
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                objectRef = objectRef9;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef7 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                    objectRef8 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.unity3d.services.core.configuration.Configuration configuration = (com.unity3d.services.core.configuration.Configuration) objectRef8.element;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef11 = objectRef8;
                    objectRef2 = objectRef7;
                    objectRef5 = objectRef11;
                    t = configuration;
                    objectRef2.element = t;
                    m10798constructorimpl = kotlin.Result.m10798constructorimpl((com.unity3d.services.core.configuration.Configuration) objectRef5.element);
                    if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
                        kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                        m10798constructorimpl = kotlin.Result.m10798constructorimpl(m10798constructorimpl);
                    } else {
                        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
                        if (m10801exceptionOrNullimpl != null) {
                            kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
                        }
                    }
                    return kotlin.Result.m10797boximpl(m10798constructorimpl);
                }
                objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$4;
                objectRef6 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$3;
                objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
                params2 = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params) this.L$1;
                initializeStateConfigWithLoader2 = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj2 = ((kotlin.Result) obj).getValue();
                    m10798constructorimpl3 = kotlin.Result.m10798constructorimpl(kotlin.Result.m10797boximpl(obj2));
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    kotlin.Result.Companion companion7 = kotlin.Result.INSTANCE;
                    m10798constructorimpl3 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                    kotlin.jvm.internal.Ref.ObjectRef objectRef12 = objectRef6;
                    com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params4 = params2;
                    if (!kotlin.Result.m10805isSuccessimpl(m10798constructorimpl3)) {
                    }
                }
                kotlin.jvm.internal.Ref.ObjectRef objectRef122 = objectRef6;
                com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params42 = params2;
                if (!kotlin.Result.m10805isSuccessimpl(m10798constructorimpl3)) {
                    com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().onRetryConfig();
                    iSDKDispatchers = initializeStateConfigWithLoader2.dispatchers;
                    kotlinx.coroutines.CoroutineDispatcher io2 = iSDKDispatchers.getIo();
                    com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1 initializeStateConfigWithLoader$doWork$2$1$1 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1(objectRef4, objectRef122, initializeStateConfigWithLoader2, params42, null);
                    this.L$0 = objectRef122;
                    this.L$1 = objectRef2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    if (kotlinx.coroutines.BuildersKt.withContext(io2, initializeStateConfigWithLoader$doWork$2$1$1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef7 = objectRef2;
                    objectRef8 = objectRef122;
                    com.unity3d.services.core.configuration.Configuration configuration2 = (com.unity3d.services.core.configuration.Configuration) objectRef8.element;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef112 = objectRef8;
                    objectRef2 = objectRef7;
                    objectRef5 = objectRef112;
                    t = configuration2;
                    objectRef2.element = t;
                    m10798constructorimpl = kotlin.Result.m10798constructorimpl((com.unity3d.services.core.configuration.Configuration) objectRef5.element);
                    if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
                    }
                    return kotlin.Result.m10797boximpl(m10798constructorimpl);
                }
                throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest, new java.lang.Exception("No connected events within the timeout!"), params42.getConfig());
            }
            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$4;
            objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$3;
            params = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params) this.L$2;
            initializeStateConfigWithLoader = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader) this.L$1;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th5) {
                th = th5;
                kotlin.Result.Companion companion42 = kotlin.Result.INSTANCE;
                m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                initializeStateConfigWithLoader2 = initializeStateConfigWithLoader;
                params2 = params;
                objectRef4 = objectRef3;
                if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl2)) {
                }
            }
        }
        m10798constructorimpl2 = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        initializeStateConfigWithLoader2 = initializeStateConfigWithLoader;
        params2 = params;
        objectRef4 = objectRef3;
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl2)) {
            java.lang.Throwable m10801exceptionOrNullimpl2 = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl2);
            if (m10801exceptionOrNullimpl2 instanceof com.unity3d.services.core.extensions.AbortRetryException) {
                throw new com.unity3d.services.core.domain.task.InitializationException(com.unity3d.services.core.configuration.ErrorState.NetworkConfigRequest, (java.lang.Exception) m10801exceptionOrNullimpl2, params2.getConfig());
            }
            try {
                kotlin.Result.Companion companion8 = kotlin.Result.INSTANCE;
                initializeStateNetworkError = initializeStateConfigWithLoader2.initializeStateNetworkError;
                com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params params5 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params(params2.getConfig());
                this.L$0 = initializeStateConfigWithLoader2;
                this.L$1 = params2;
                this.L$2 = objectRef4;
                this.L$3 = objectRef2;
                this.L$4 = objectRef2;
                this.label = 2;
                obj2 = initializeStateNetworkError.mo10359invokegIAlus(params5, this);
            } catch (java.lang.Throwable th6) {
                th = th6;
                objectRef6 = objectRef2;
                kotlin.Result.Companion companion72 = kotlin.Result.INSTANCE;
                m10798constructorimpl3 = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                kotlin.jvm.internal.Ref.ObjectRef objectRef1222 = objectRef6;
                com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params422 = params2;
                if (!kotlin.Result.m10805isSuccessimpl(m10798constructorimpl3)) {
                }
            }
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef6 = objectRef2;
            m10798constructorimpl3 = kotlin.Result.m10798constructorimpl(kotlin.Result.m10797boximpl(obj2));
            kotlin.jvm.internal.Ref.ObjectRef objectRef12222 = objectRef6;
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params params4222 = params2;
            if (!kotlin.Result.m10805isSuccessimpl(m10798constructorimpl3)) {
            }
        } else {
            objectRef5 = objectRef2;
            t = (com.unity3d.services.core.configuration.Configuration) objectRef2.element;
            objectRef2.element = t;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl((com.unity3d.services.core.configuration.Configuration) objectRef5.element);
            if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
            }
            return kotlin.Result.m10797boximpl(m10798constructorimpl);
        }
    }
}
