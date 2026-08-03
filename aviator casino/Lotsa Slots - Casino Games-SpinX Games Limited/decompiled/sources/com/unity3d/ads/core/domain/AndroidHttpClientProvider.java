package com.unity3d.ads.core.domain;

/* compiled from: AndroidHttpClientProvider.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ)\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0011\u0010\u001b\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHttpClientProvider;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "alternativeFlowReader", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "context", "Landroid/content/Context;", "cronetEngineBuilderFactory", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "mediationTraitsMetadataReader", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "(Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Landroid/content/Context;Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;)V", "cachedClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "buildNetworkClient", "selectedHttpClient", "Lcom/unity3d/ads/core/domain/HttpClientSelection;", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/HttpClientSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createHttpClient", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOkHttp3Client", "Lcom/unity3d/services/core/network/core/OkHttp3Client;", "invoke", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidHttpClientProvider implements com.unity3d.ads.core.domain.HttpClientProvider {
    private final com.unity3d.ads.core.configuration.AlternativeFlowReader alternativeFlowReader;
    private com.unity3d.services.core.network.core.HttpClient cachedClient;
    private final android.content.Context context;
    private final com.unity3d.services.core.network.core.CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
    private final com.unity3d.ads.core.configuration.MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final kotlinx.coroutines.sync.Mutex mutex;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidHttpClientProvider(com.unity3d.ads.core.configuration.AlternativeFlowReader alternativeFlowReader, com.unity3d.services.core.domain.ISDKDispatchers dispatchers, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, android.content.Context context, com.unity3d.services.core.network.core.CronetEngineBuilderFactory cronetEngineBuilderFactory, com.unity3d.ads.core.configuration.MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alternativeFlowReader, "alternativeFlowReader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationTraitsMetadataReader, "mediationTraitsMetadataReader");
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = dispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.mutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068 A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:25:0x0060, B:29:0x0068), top: B:24:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.HttpClient> continuation) {
        com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1 androidHttpClientProvider$invoke$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        com.unity3d.ads.core.domain.AndroidHttpClientProvider androidHttpClientProvider;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Throwable th;
        com.unity3d.services.core.network.core.HttpClient httpClient;
        com.unity3d.ads.core.domain.AndroidHttpClientProvider androidHttpClientProvider2;
        try {
            if (continuation instanceof com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1) {
                androidHttpClientProvider$invoke$1 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1) continuation;
                if ((androidHttpClientProvider$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    androidHttpClientProvider$invoke$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = androidHttpClientProvider$invoke$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidHttpClientProvider$invoke$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.mutex;
                        androidHttpClientProvider$invoke$1.L$0 = this;
                        androidHttpClientProvider$invoke$1.L$1 = mutex;
                        androidHttpClientProvider$invoke$1.label = 1;
                        if (mutex.lock(null, androidHttpClientProvider$invoke$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidHttpClientProvider = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (kotlinx.coroutines.sync.Mutex) androidHttpClientProvider$invoke$1.L$1;
                            androidHttpClientProvider2 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider) androidHttpClientProvider$invoke$1.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                com.unity3d.services.core.network.core.HttpClient httpClient2 = (com.unity3d.services.core.network.core.HttpClient) obj;
                                androidHttpClientProvider2.cachedClient = httpClient2;
                                mutex2.unlock(null);
                                return httpClient2;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) androidHttpClientProvider$invoke$1.L$1;
                        androidHttpClientProvider = (com.unity3d.ads.core.domain.AndroidHttpClientProvider) androidHttpClientProvider$invoke$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    }
                    httpClient = androidHttpClientProvider.cachedClient;
                    if (httpClient != null) {
                        androidHttpClientProvider$invoke$1.L$0 = androidHttpClientProvider;
                        androidHttpClientProvider$invoke$1.L$1 = mutex;
                        androidHttpClientProvider$invoke$1.label = 2;
                        java.lang.Object createHttpClient = androidHttpClientProvider.createHttpClient(androidHttpClientProvider$invoke$1);
                        if (createHttpClient == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex2 = mutex;
                        obj = createHttpClient;
                        androidHttpClientProvider2 = androidHttpClientProvider;
                        com.unity3d.services.core.network.core.HttpClient httpClient22 = (com.unity3d.services.core.network.core.HttpClient) obj;
                        androidHttpClientProvider2.cachedClient = httpClient22;
                        mutex2.unlock(null);
                        return httpClient22;
                    }
                    mutex.unlock(null);
                    return httpClient;
                }
            }
            httpClient = androidHttpClientProvider.cachedClient;
            if (httpClient != null) {
            }
        } catch (java.lang.Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        androidHttpClientProvider$invoke$1 = new com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1(this, continuation);
        java.lang.Object obj2 = androidHttpClientProvider$invoke$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHttpClientProvider$invoke$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r14 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createHttpClient(kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.HttpClient> continuation) {
        com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$1 androidHttpClientProvider$createHttpClient$1;
        int i;
        java.lang.Object m10798constructorimpl;
        com.unity3d.ads.core.domain.HttpClientSelection httpClientSelection;
        com.unity3d.ads.core.domain.HttpClientSelection httpClientSelection2;
        long j;
        com.unity3d.ads.core.domain.AndroidHttpClientProvider androidHttpClientProvider;
        java.lang.String str;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$1) {
            androidHttpClientProvider$createHttpClient$1 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$1) continuation;
            if ((androidHttpClientProvider$createHttpClient$1.label & Integer.MIN_VALUE) != 0) {
                androidHttpClientProvider$createHttpClient$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidHttpClientProvider$createHttpClient$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidHttpClientProvider$createHttpClient$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.alternativeFlowReader.invoke()) {
                        return new com.unity3d.services.core.network.core.LegacyHttpClient(this.dispatchers);
                    }
                    java.lang.String stringTrait = this.mediationTraitsMetadataReader.getStringTrait(com.unity3d.ads.core.configuration.MediationTraitsMetadataReader.USE_HTTP_CLIENT);
                    if (stringTrait != null) {
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            com.unity3d.ads.core.domain.AndroidHttpClientProvider androidHttpClientProvider2 = this;
                            java.lang.String upperCase = stringTrait.toUpperCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(com.unity3d.ads.core.domain.HttpClientSelection.valueOf(upperCase));
                        } catch (java.lang.Throwable th) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
                        }
                        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
                            m10798constructorimpl = null;
                        }
                        httpClientSelection = (com.unity3d.ads.core.domain.HttpClientSelection) m10798constructorimpl;
                    }
                    httpClientSelection = com.unity3d.ads.core.domain.HttpClientSelection.CRONET_WITHOUT_QUIC;
                    long m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                    com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$client$1 androidHttpClientProvider$createHttpClient$client$1 = new com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$client$1(httpClientSelection, this, null);
                    androidHttpClientProvider$createHttpClient$1.L$0 = this;
                    androidHttpClientProvider$createHttpClient$1.L$1 = httpClientSelection;
                    androidHttpClientProvider$createHttpClient$1.J$0 = m12261markNowz9LOYto;
                    androidHttpClientProvider$createHttpClient$1.label = 1;
                    java.lang.Object withTimeoutOrNull = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(500L, androidHttpClientProvider$createHttpClient$client$1, androidHttpClientProvider$createHttpClient$1);
                    if (withTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    httpClientSelection2 = httpClientSelection;
                    obj = withTimeoutOrNull;
                    j = m12261markNowz9LOYto;
                    androidHttpClientProvider = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = androidHttpClientProvider$createHttpClient$1.J$0;
                    httpClientSelection2 = (com.unity3d.ads.core.domain.HttpClientSelection) androidHttpClientProvider$createHttpClient$1.L$1;
                    androidHttpClientProvider = (com.unity3d.ads.core.domain.AndroidHttpClientProvider) androidHttpClientProvider$createHttpClient$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.unity3d.services.core.network.core.HttpClient httpClient = (com.unity3d.services.core.network.core.HttpClient) obj;
                double m12182toDoubleimpl = kotlin.time.Duration.m12182toDoubleimpl(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j), kotlin.time.DurationUnit.MILLISECONDS);
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) httpClientSelection2.name(), (java.lang.CharSequence) "CRONET", false, 2, (java.lang.Object) null)) {
                    if (httpClient == null) {
                        str = "native_cronet_timeout";
                    } else {
                        str = httpClient instanceof com.unity3d.services.core.network.core.CronetClient ? "native_cronet_success_time" : "native_cronet_failure_time";
                    }
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHttpClientProvider.sendDiagnosticEvent, str, kotlin.coroutines.jvm.internal.Boxing.boxDouble(m12182toDoubleimpl), null, null, null, null, 60, null);
                }
                return httpClient != null ? androidHttpClientProvider.getOkHttp3Client() : httpClient;
            }
        }
        androidHttpClientProvider$createHttpClient$1 = new com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$1(this, continuation);
        java.lang.Object obj2 = androidHttpClientProvider$createHttpClient$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHttpClientProvider$createHttpClient$1.label;
        if (i != 0) {
        }
        com.unity3d.services.core.network.core.HttpClient httpClient2 = (com.unity3d.services.core.network.core.HttpClient) obj2;
        double m12182toDoubleimpl2 = kotlin.time.Duration.m12182toDoubleimpl(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12266elapsedNowUwyO8pc(j), kotlin.time.DurationUnit.MILLISECONDS);
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) httpClientSelection2.name(), (java.lang.CharSequence) "CRONET", false, 2, (java.lang.Object) null)) {
        }
        if (httpClient2 != null) {
        }
    }

    public final com.unity3d.services.core.network.core.OkHttp3Client getOkHttp3Client() {
        return new com.unity3d.services.core.network.core.OkHttp3Client(this.dispatchers, new okhttp3.OkHttpClient());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object buildNetworkClient(final android.content.Context context, final com.unity3d.services.core.domain.ISDKDispatchers iSDKDispatchers, final com.unity3d.ads.core.domain.HttpClientSelection httpClientSelection, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.HttpClient> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        com.google.android.gms.net.CronetProviderInstaller.installProvider(context).addOnCompleteListener(kotlinx.coroutines.ExecutorsKt.asExecutor(iSDKDispatchers.getIo()), new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task<java.lang.Void> it) {
                java.lang.String str;
                com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
                com.unity3d.services.core.network.core.CronetEngineBuilderFactory cronetEngineBuilderFactory;
                com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent2;
                java.lang.String message;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                str = "Errored without message.";
                if (it.isSuccessful()) {
                    try {
                        cronetEngineBuilderFactory = com.unity3d.ads.core.domain.AndroidHttpClientProvider.this.cronetEngineBuilderFactory;
                        org.chromium.net.CronetEngine.Builder createCronetEngineBuilder = cronetEngineBuilderFactory.createCronetEngineBuilder(context);
                        if (httpClientSelection == com.unity3d.ads.core.domain.HttpClientSelection.CRONET_WITH_QUIC) {
                            createCronetEngineBuilder.enableQuic(true);
                            createCronetEngineBuilder.addQuicHint(com.unity3d.services.core.di.ServiceProvider.GATEWAY_HOST, 443, 443);
                            createCronetEngineBuilder.addQuicHint(com.unity3d.services.core.di.ServiceProvider.CDN_CREATIVES_HOST, 443, 443);
                        }
                        org.chromium.net.CronetEngine cronetEngine = createCronetEngineBuilder.build();
                        kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.core.HttpClient> cancellableContinuation = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cronetEngine, "cronetEngine");
                        cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(new com.unity3d.services.core.network.core.CronetClient(cronetEngine, iSDKDispatchers)));
                        return;
                    } catch (java.lang.Throwable th) {
                        sendDiagnosticEvent = com.unity3d.ads.core.domain.AndroidHttpClientProvider.this.sendDiagnosticEvent;
                        java.lang.String message2 = th.getMessage();
                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_engine_error", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", message2 != null ? message2 : "Errored without message.")), null, null, null, 58, null);
                        kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.core.HttpClient> cancellableContinuation2 = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        cancellableContinuation2.resumeWith(kotlin.Result.m10798constructorimpl(com.unity3d.ads.core.domain.AndroidHttpClientProvider.this.getOkHttp3Client()));
                        return;
                    }
                }
                sendDiagnosticEvent2 = com.unity3d.ads.core.domain.AndroidHttpClientProvider.this.sendDiagnosticEvent;
                java.lang.Exception exception = it.getException();
                if (exception != null && (message = exception.getMessage()) != null) {
                    str = message;
                }
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_install_error", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", str)), null, null, null, 58, null);
                kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.core.HttpClient> cancellableContinuation3 = cancellableContinuationImpl2;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                cancellableContinuation3.resumeWith(kotlin.Result.m10798constructorimpl(com.unity3d.ads.core.domain.AndroidHttpClientProvider.this.getOkHttp3Client()));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
