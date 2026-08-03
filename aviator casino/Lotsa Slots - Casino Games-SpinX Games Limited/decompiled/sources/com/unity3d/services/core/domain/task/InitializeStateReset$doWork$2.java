package com.unity3d.services.core.domain.task;

/* compiled from: InitializeStateReset.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class InitializeStateReset$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateReset.Params $params;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateReset$doWork$2(com.unity3d.services.core.domain.task.InitializeStateReset.Params params, com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2> continuation) {
        super(2, continuation);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2(this.$params, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c A[Catch: all -> 0x00c8, CancellationException -> 0x00f5, TryCatch #2 {CancellationException -> 0x00f5, all -> 0x00c8, blocks: (B:6:0x0014, B:7:0x005f, B:10:0x006d, B:12:0x007c, B:14:0x0082, B:16:0x0090, B:17:0x0092, B:19:0x0095, B:21:0x00a1, B:23:0x00ac, B:26:0x00af, B:36:0x00b8, B:37:0x00bf, B:38:0x00c0, B:39:0x00c7, B:40:0x0065, B:41:0x006c, B:45:0x0027, B:47:0x0034, B:49:0x0039, B:51:0x0041), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0 A[Catch: all -> 0x00c8, CancellationException -> 0x00f5, TryCatch #2 {CancellationException -> 0x00f5, all -> 0x00c8, blocks: (B:6:0x0014, B:7:0x005f, B:10:0x006d, B:12:0x007c, B:14:0x0082, B:16:0x0090, B:17:0x0092, B:19:0x0095, B:21:0x00a1, B:23:0x00ac, B:26:0x00af, B:36:0x00b8, B:37:0x00bf, B:38:0x00c0, B:39:0x00c7, B:40:0x0065, B:41:0x006c, B:45:0x0027, B:47:0x0034, B:49:0x0039, B:51:0x0041), top: B:2:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m10798constructorimpl;
        com.unity3d.services.core.domain.task.InitializeStateReset.Params params;
        com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset;
        com.unity3d.services.core.domain.task.InitializeStateReset initializeStateReset2;
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
            params = this.$params;
            initializeStateReset = this.this$0;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: starting init");
            com.unity3d.services.core.webview.WebViewApp currentApp = com.unity3d.services.core.webview.WebViewApp.getCurrentApp();
            if (currentApp != null) {
                currentApp.resetWebViewAppInitialization();
            }
            if ((currentApp != null ? currentApp.getWebView() : null) != null) {
                long webViewAppCreateTimeout = params.getConfig().getWebViewAppCreateTimeout();
                com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1 initializeStateReset$doWork$2$1$success$1 = new com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2$1$success$1(initializeStateReset, currentApp, null);
                this.L$0 = params;
                this.L$1 = initializeStateReset;
                this.label = 1;
                java.lang.Object withTimeoutOrNull = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(webViewAppCreateTimeout, initializeStateReset$doWork$2$1$success$1, this);
                if (withTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                initializeStateReset2 = initializeStateReset;
                obj = withTimeoutOrNull;
            }
            initializeStateReset.unregisterLifecycleCallbacks();
            com.unity3d.services.core.properties.SdkProperties.setCacheDirectory(null);
            com.unity3d.services.core.properties.SdkProperties.setWebViewCacheDirectory(null);
            if (com.unity3d.services.core.properties.SdkProperties.getCacheDirectory() != null) {
                throw new java.lang.Exception("Cache directory is NULL");
            }
            if (com.unity3d.services.core.properties.SdkProperties.getWebViewCacheDirectory() == null) {
                throw new java.lang.Exception("WebView cache directory is NULL");
            }
            com.unity3d.services.core.properties.SdkProperties.setInitialized(false);
            java.lang.Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
            if (moduleConfigurationList == null) {
                moduleConfigurationList = new java.lang.Class[0];
            }
            for (java.lang.Class cls : moduleConfigurationList) {
                com.unity3d.services.core.configuration.IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(moduleConfiguration.resetState(params.getConfig()));
                }
            }
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(params.getConfig());
            if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(m10798constructorimpl);
            } else {
                java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
                if (m10801exceptionOrNullimpl != null) {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
                }
            }
            return kotlin.Result.m10797boximpl(m10798constructorimpl);
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        initializeStateReset2 = (com.unity3d.services.core.domain.task.InitializeStateReset) this.L$1;
        params = (com.unity3d.services.core.domain.task.InitializeStateReset.Params) this.L$0;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((kotlin.Unit) obj) != null) {
            initializeStateReset = initializeStateReset2;
            initializeStateReset.unregisterLifecycleCallbacks();
            com.unity3d.services.core.properties.SdkProperties.setCacheDirectory(null);
            com.unity3d.services.core.properties.SdkProperties.setWebViewCacheDirectory(null);
            if (com.unity3d.services.core.properties.SdkProperties.getCacheDirectory() != null) {
            }
        } else {
            throw new java.lang.Exception("Reset failed on opening ConditionVariable");
        }
    }
}
