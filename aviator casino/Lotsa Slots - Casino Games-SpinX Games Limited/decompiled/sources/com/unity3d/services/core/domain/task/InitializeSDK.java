package com.unity3d.services.core.domain.task;

/* compiled from: InitializeSDK.kt */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ<\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020&H\u0016J\u0019\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H\u0082@ø\u0001\u0002¢\u0006\u0002\u0010*R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeSDK;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/EmptyParams;", "", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "configFileFromLocalStorage", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "initializeStateReset", "Lcom/unity3d/services/core/domain/task/InitializeStateReset;", "initializeStateError", "Lcom/unity3d/services/core/domain/task/InitializeStateError;", "initializeStateConfig", "Lcom/unity3d/services/core/domain/task/InitializeStateConfig;", "initializeStateCreate", "Lcom/unity3d/services/core/domain/task/InitializeStateCreate;", "initializeStateLoadCache", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;", "initializeStateLoadWeb", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;", "initializeStateComplete", "Lcom/unity3d/services/core/domain/task/InitializeStateComplete;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;Lcom/unity3d/services/core/domain/task/InitializeStateReset;Lcom/unity3d/services/core/domain/task/InitializeStateError;Lcom/unity3d/services/core/domain/task/InitializeStateConfig;Lcom/unity3d/services/core/domain/task/InitializeStateCreate;Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;Lcom/unity3d/services/core/domain/task/InitializeStateComplete;)V", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/EmptyParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeErrorState", "errorState", "Lcom/unity3d/services/core/configuration/ErrorState;", "taskException", "", "configuration", "Lcom/unity3d/services/core/configuration/Configuration;", "executeErrorState-BWLJW6A", "(Lcom/unity3d/services/core/configuration/ErrorState;Ljava/lang/Throwable;Lcom/unity3d/services/core/configuration/Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "handleInitializationException", "exception", "Lcom/unity3d/services/core/domain/task/InitializationException;", "(Lcom/unity3d/services/core/domain/task/InitializationException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitializeSDK extends com.unity3d.services.core.domain.task.MetricTask<com.unity3d.services.core.domain.task.EmptyParams, kotlin.Unit> {
    private final com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
    private final com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete;
    private final com.unity3d.services.core.domain.task.InitializeStateConfig initializeStateConfig;
    private final com.unity3d.services.core.domain.task.InitializeStateCreate initializeStateCreate;
    private final com.unity3d.services.core.domain.task.InitializeStateError initializeStateError;
    private final com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache;
    private final com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb;
    private final com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset;

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ java.lang.Object mo10358doWorkgIAlus(com.unity3d.services.core.domain.task.BaseParams baseParams, kotlin.coroutines.Continuation continuation) {
        return m10364doWorkgIAlus((com.unity3d.services.core.domain.task.EmptyParams) baseParams, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) continuation);
    }

    public InitializeSDK(com.unity3d.services.core.domain.ISDKDispatchers dispatchers, com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage configFileFromLocalStorage, com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset, com.unity3d.services.core.domain.task.InitializeStateError initializeStateError, com.unity3d.services.core.domain.task.InitializeStateConfig initializeStateConfig, com.unity3d.services.core.domain.task.InitializeStateCreate initializeStateCreate, com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache, com.unity3d.services.core.domain.task.InitializeStateLoadWeb initializeStateLoadWeb, com.unity3d.services.core.domain.task.InitializeStateComplete initializeStateComplete) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFileFromLocalStorage, "configFileFromLocalStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateReset, "initializeStateReset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateError, "initializeStateError");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateConfig, "initializeStateConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateCreate, "initializeStateCreate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateLoadCache, "initializeStateLoadCache");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateLoadWeb, "initializeStateLoadWeb");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateComplete, "initializeStateComplete");
        this.dispatchers = dispatchers;
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.initializeStateReset = initializeStateReset;
        this.initializeStateError = initializeStateError;
        this.initializeStateConfig = initializeStateConfig;
        this.initializeStateCreate = initializeStateCreate;
        this.initializeStateLoadCache = initializeStateLoadCache;
        this.initializeStateLoadWeb = initializeStateLoadWeb;
        this.initializeStateComplete = initializeStateComplete;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public java.lang.String getMetricName() {
        return getMetricNameForInitializeTask(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: doWork-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object m10364doWorkgIAlus(com.unity3d.services.core.domain.task.EmptyParams emptyParams, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        com.unity3d.services.core.domain.task.InitializeSDK$doWork$1 initializeSDK$doWork$1;
        int i;
        if (continuation instanceof com.unity3d.services.core.domain.task.InitializeSDK$doWork$1) {
            initializeSDK$doWork$1 = (com.unity3d.services.core.domain.task.InitializeSDK$doWork$1) continuation;
            if ((initializeSDK$doWork$1.label & Integer.MIN_VALUE) != 0) {
                initializeSDK$doWork$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = initializeSDK$doWork$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initializeSDK$doWork$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.dispatchers.getDefault();
                    com.unity3d.services.core.domain.task.InitializeSDK$doWork$2 initializeSDK$doWork$2 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$2(this, null);
                    initializeSDK$doWork$1.label = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, initializeSDK$doWork$2, initializeSDK$doWork$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((kotlin.Result) obj).getValue();
            }
        }
        initializeSDK$doWork$1 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$1(this, continuation);
        java.lang.Object obj2 = initializeSDK$doWork$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initializeSDK$doWork$1.label;
        if (i != 0) {
        }
        return ((kotlin.Result) obj2).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object handleInitializationException(com.unity3d.services.core.domain.task.InitializationException initializationException, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1 initializeSDK$handleInitializationException$1;
        int i;
        if (continuation instanceof com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1) {
            initializeSDK$handleInitializationException$1 = (com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1) continuation;
            if ((initializeSDK$handleInitializationException$1.label & Integer.MIN_VALUE) != 0) {
                initializeSDK$handleInitializationException$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = initializeSDK$handleInitializationException$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initializeSDK$handleInitializationException$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.unity3d.services.core.domain.task.InitializationException initializationException2 = (com.unity3d.services.core.domain.task.InitializationException) initializeSDK$handleInitializationException$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    ((kotlin.Result) obj).getValue();
                    throw initializationException2;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.services.core.configuration.ErrorState errorState = initializationException.getErrorState();
                java.lang.Throwable originalException = initializationException.getOriginalException();
                com.unity3d.services.core.configuration.Configuration config = initializationException.getConfig();
                initializeSDK$handleInitializationException$1.L$0 = initializationException;
                initializeSDK$handleInitializationException$1.label = 1;
                if (m10363executeErrorStateBWLJW6A(errorState, originalException, config, initializeSDK$handleInitializationException$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw initializationException;
            }
        }
        initializeSDK$handleInitializationException$1 = new com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1(this, continuation);
        java.lang.Object obj2 = initializeSDK$handleInitializationException$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initializeSDK$handleInitializationException$1.label;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: executeErrorState-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m10363executeErrorStateBWLJW6A(com.unity3d.services.core.configuration.ErrorState errorState, java.lang.Throwable th, com.unity3d.services.core.configuration.Configuration configuration, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1 initializeSDK$executeErrorState$1;
        int i;
        if (continuation instanceof com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1) {
            initializeSDK$executeErrorState$1 = (com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1) continuation;
            if ((initializeSDK$executeErrorState$1.label & Integer.MIN_VALUE) != 0) {
                initializeSDK$executeErrorState$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = initializeSDK$executeErrorState$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initializeSDK$executeErrorState$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return ((kotlin.Result) obj).getValue();
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.services.core.domain.task.InitializeStateError initializeStateError = this.initializeStateError;
                com.unity3d.services.core.domain.task.InitializeStateError.Params params = new com.unity3d.services.core.domain.task.InitializeStateError.Params(errorState, new java.lang.Exception(th != null ? th.getMessage() : null), configuration);
                initializeSDK$executeErrorState$1.label = 1;
                java.lang.Object obj2 = initializeStateError.mo10359invokegIAlus(params, initializeSDK$executeErrorState$1);
                return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
            }
        }
        initializeSDK$executeErrorState$1 = new com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1(this, continuation);
        java.lang.Object obj3 = initializeSDK$executeErrorState$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initializeSDK$executeErrorState$1.label;
        if (i == 0) {
        }
    }
}
