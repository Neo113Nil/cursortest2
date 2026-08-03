package com.vungle.ads.internal;

/* compiled from: VungleInitializer.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\r\u0010\u0019\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001e\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0007J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\b\u001a\u00020\u001cJ\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\u0016\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006*²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020.X\u008a\u0084\u0002²\u0006\n\u0010/\u001a\u000200X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/VungleInitializer;", "", "()V", "initDurationMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "initializationCallbackArray", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/vungle/ads/InitializationListener;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized$vungle_ads_release$annotations", "isInitialized$vungle_ads_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setInitialized$vungle_ads_release", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "isInitializing", "isInitializing$vungle_ads_release$annotations", "isInitializing$vungle_ads_release", "setInitializing$vungle_ads_release", "configure", "", "context", "Landroid/content/Context;", com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "", "deInit", "deInit$vungle_ads_release", "hasInvalidChar", "", "value", "hasRequiredNetworkPermissions", com.ironsource.X3.a.f, "initializationCallback", "isAppIdInvalid", "onInitError", "exception", "Lcom/vungle/ads/VungleError;", "onInitSuccess", "setIntegrationName", "integrationName", "version", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release", "sdkExecutors", "Lcom/vungle/ads/internal/executor/Executors;", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "jobRunner", "Lcom/vungle/ads/internal/task/JobRunner;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleInitializer {
    private static final java.lang.String TAG = "VungleInitializer";
    private java.util.concurrent.atomic.AtomicBoolean isInitialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private java.util.concurrent.atomic.AtomicBoolean isInitializing = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.CopyOnWriteArrayList<com.vungle.ads.InitializationListener> initializationCallbackArray = new java.util.concurrent.CopyOnWriteArrayList<>();
    private final com.vungle.ads.TimeIntervalMetric initDurationMetric = new com.vungle.ads.TimeIntervalMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);

    public static /* synthetic */ void isInitialized$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void isInitializing$vungle_ads_release$annotations() {
    }

    /* renamed from: isInitialized$vungle_ads_release, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getIsInitialized() {
        return this.isInitialized;
    }

    public final void setInitialized$vungle_ads_release(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicBoolean, "<set-?>");
        this.isInitialized = atomicBoolean;
    }

    /* renamed from: isInitializing$vungle_ads_release, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getIsInitializing() {
        return this.isInitializing;
    }

    public final void setInitializing$vungle_ads_release(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicBoolean, "<set-?>");
        this.isInitializing = atomicBoolean;
    }

    public final void init(final java.lang.String appId, final android.content.Context context, com.vungle.ads.InitializationListener initializationCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationCallback, "initializationCallback");
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.SDK_INIT_API), (com.vungle.ads.internal.util.LogEntry) null, (java.lang.String) null, 6, (java.lang.Object) null);
        this.initDurationMetric.markStart();
        this.initializationCallbackArray.add(initializationCallback);
        if (isAppIdInvalid(appId)) {
            onInitError(new com.vungle.ads.InvalidAppId("App id invalid: " + appId + ", package name: " + context.getPackageName()).logError$vungle_ads_release());
            return;
        }
        if (com.vungle.ads.internal.util.Utils.INSTANCE.isOSVersionInvalid()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Init: SDK is supported only for API versions 25 and above.");
            onInitError(new com.vungle.ads.SdkVersionTooLow("Init: SDK is supported only for API versions 25 and above.").logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.ConfigManager.INSTANCE.setAppId$vungle_ads_release(appId);
        if (this.isInitialized.get()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "init already complete");
            onInitSuccess();
        } else {
            if (this.isInitializing.getAndSet(true)) {
                com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "init already in progress");
                return;
            }
            com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
            kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.executor.Executors>() { // from class: com.vungle.ads.internal.VungleInitializer$init$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.executor.Executors invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.executor.Executors.class);
                }
            });
            com.vungle.ads.ServiceLocator.Companion companion2 = com.vungle.ads.ServiceLocator.INSTANCE;
            final kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.VungleApiClient>() { // from class: com.vungle.ads.internal.VungleInitializer$init$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.network.VungleApiClient invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.network.VungleApiClient.class);
                }
            });
            m10415init$lambda0(lazy).getBACKGROUND_EXECUTOR().execute(new java.lang.Runnable() { // from class: com.vungle.ads.internal.VungleInitializer$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.vungle.ads.internal.VungleInitializer.m10417init$lambda2(com.vungle.ads.internal.VungleInitializer.this, context, appId, lazy2);
                }
            }, new java.lang.Runnable() { // from class: com.vungle.ads.internal.VungleInitializer$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.vungle.ads.internal.VungleInitializer.m10418init$lambda3(com.vungle.ads.internal.VungleInitializer.this);
                }
            });
        }
    }

    /* renamed from: init$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.Executors m10415init$lambda0(kotlin.Lazy<? extends com.vungle.ads.internal.executor.Executors> lazy) {
        return lazy.getValue();
    }

    /* renamed from: init$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.network.VungleApiClient m10416init$lambda1(kotlin.Lazy<com.vungle.ads.internal.network.VungleApiClient> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-2, reason: not valid java name */
    public static final void m10417init$lambda2(final com.vungle.ads.internal.VungleInitializer this$0, android.content.Context context, java.lang.String appId, kotlin.Lazy vungleApiClient$delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "$appId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vungleApiClient$delegate, "$vungleApiClient$delegate");
        if (!this$0.hasRequiredNetworkPermissions(context)) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Network permissions not granted");
            com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.VungleInitializer$init$1$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    com.vungle.ads.internal.VungleInitializer.this.onInitError(new com.vungle.ads.SdkNotInitialized("Network permissions not granted").logError$vungle_ads_release());
                }
            });
        } else {
            com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.init(context);
            m10416init$lambda1(vungleApiClient$delegate).initialize(appId);
            this$0.configure(context, appId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-3, reason: not valid java name */
    public static final void m10418init$lambda3(com.vungle.ads.internal.VungleInitializer this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onInitError(new com.vungle.ads.OutOfMemory("Config: Out of Memory").logError$vungle_ads_release());
    }

    private final boolean hasRequiredNetworkPermissions(android.content.Context context) {
        return (androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) && (androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.INTERNET") == 0);
    }

    private final boolean isAppIdInvalid(java.lang.String appId) {
        return kotlin.text.StringsKt.isBlank(appId) || hasInvalidChar(appId);
    }

    private final void configure(final android.content.Context context, java.lang.String appId) {
        boolean z;
        try {
            com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
            com.vungle.ads.internal.model.ConfigPayload cachedConfig = com.vungle.ads.internal.ConfigManager.INSTANCE.getCachedConfig(m10413configure$lambda4(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.persistence.FilePreferences>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.persistence.FilePreferences invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.persistence.FilePreferences.class);
                }
            })), appId);
            if (cachedConfig != null) {
                com.vungle.ads.internal.ConfigManager.initWithConfig$vungle_ads_release$default(com.vungle.ads.internal.ConfigManager.INSTANCE, context, cachedConfig, true, null, 8, null);
                z = true;
            } else {
                z = false;
            }
            this.isInitialized.set(true);
            onInitSuccess();
            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Running cleanup jobs. " + java.lang.Thread.currentThread().getId());
            com.vungle.ads.ServiceLocator.Companion companion2 = com.vungle.ads.ServiceLocator.INSTANCE;
            m10414configure$lambda5(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.task.JobRunner>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.task.JobRunner, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.task.JobRunner invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.task.JobRunner.class);
                }
            })).execute(com.vungle.ads.internal.task.CleanupJob.Companion.makeJobInfo$default(com.vungle.ads.internal.task.CleanupJob.INSTANCE, null, 1, null));
            if (z) {
                return;
            }
            com.vungle.ads.internal.ConfigManager.INSTANCE.fetchConfigAsync$vungle_ads_release(context, new kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>() { // from class: com.vungle.ads.internal.VungleInitializer$configure$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
                    invoke(bool.booleanValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(boolean z2) {
                    com.vungle.ads.internal.util.Logger.INSTANCE.d("VungleInitializer", "Config fetch result: " + z2);
                }
            });
        } catch (java.lang.Throwable th) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Cannot get config", th);
        }
    }

    /* renamed from: configure$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.persistence.FilePreferences m10413configure$lambda4(kotlin.Lazy<com.vungle.ads.internal.persistence.FilePreferences> lazy) {
        return lazy.getValue();
    }

    /* renamed from: configure$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.task.JobRunner m10414configure$lambda5(kotlin.Lazy<? extends com.vungle.ads.internal.task.JobRunner> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitError(final com.vungle.ads.VungleError exception) {
        this.isInitializing.set(false);
        java.lang.String localizedMessage = exception.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "Exception code is " + exception.getCode();
        }
        this.initDurationMetric.setMetricType(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        com.vungle.ads.AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.initDurationMetric, (com.vungle.ads.internal.util.LogEntry) null, localizedMessage);
        com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.VungleInitializer$onInitError$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2;
                com.vungle.ads.internal.util.Logger.INSTANCE.e("VungleInitializer", "onError");
                copyOnWriteArrayList = com.vungle.ads.internal.VungleInitializer.this.initializationCallbackArray;
                com.vungle.ads.VungleError vungleError = exception;
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((com.vungle.ads.InitializationListener) it.next()).onError(vungleError);
                }
                copyOnWriteArrayList2 = com.vungle.ads.internal.VungleInitializer.this.initializationCallbackArray;
                copyOnWriteArrayList2.clear();
            }
        });
        com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, localizedMessage);
    }

    private final void onInitSuccess() {
        this.isInitializing.set(false);
        this.initDurationMetric.setMetricType(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS);
        this.initDurationMetric.markEnd();
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, this.initDurationMetric, (com.vungle.ads.internal.util.LogEntry) null, (java.lang.String) null, 6, (java.lang.Object) null);
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "onSuccess " + java.lang.Thread.currentThread().getId());
        com.vungle.ads.internal.util.ThreadUtil.INSTANCE.runOnUiThread(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.vungle.ads.internal.VungleInitializer$onInitSuccess$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2;
                copyOnWriteArrayList = com.vungle.ads.internal.VungleInitializer.this.initializationCallbackArray;
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((com.vungle.ads.InitializationListener) it.next()).onSuccess();
                }
                copyOnWriteArrayList2 = com.vungle.ads.internal.VungleInitializer.this.initializationCallbackArray;
                copyOnWriteArrayList2.clear();
            }
        });
    }

    private final boolean hasInvalidChar(java.lang.String value) {
        java.lang.String str = value;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!java.lang.Character.isLetterOrDigit(charAt) && charAt != '.') {
                return true;
            }
        }
        return false;
    }

    public final boolean isInitialized() {
        return this.isInitialized.get();
    }

    public final void deInit$vungle_ads_release() {
        com.vungle.ads.ServiceLocator.INSTANCE.deInit();
        com.vungle.ads.internal.network.VungleApiClient.INSTANCE.reset$vungle_ads_release();
        this.isInitialized.set(false);
        this.isInitializing.set(false);
        this.initializationCallbackArray.clear();
    }

    public final void setIntegrationName(java.lang.String integrationName, java.lang.String version) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationName, "integrationName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        if (kotlin.text.StringsKt.isBlank(integrationName)) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "integrationName is empty");
            return;
        }
        java.lang.String headerUa = com.vungle.ads.internal.network.VungleHeader.INSTANCE.getHeaderUa();
        if (!kotlin.text.StringsKt.isBlank(version)) {
            str = com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING + version;
        } else {
            str = "";
        }
        java.lang.String str2 = integrationName + str;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) headerUa, (java.lang.CharSequence) str2, false, 2, (java.lang.Object) null)) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "Wrapper info already set");
            return;
        }
        com.vungle.ads.internal.network.VungleHeader.INSTANCE.setHeaderUa(headerUa + ';' + str2);
        if (isInitialized()) {
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "VUNGLE WARNING: SDK already initialized, you should've set wrapper info before");
        }
    }
}
