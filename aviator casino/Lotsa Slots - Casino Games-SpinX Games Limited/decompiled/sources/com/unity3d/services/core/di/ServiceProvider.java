package com.unity3d.services.core.di;

/* compiled from: ServiceProvider.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010.\u001a\u00020-H\u0016J\b\u0010/\u001a\u00020-H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/unity3d/services/core/di/ServiceProvider;", "Lcom/unity3d/services/core/di/IServiceProvider;", "()V", "CDN_CREATIVES_HOST", "", "CDN_CREATIVES_PORT", "", "DATA_STORE_GATEWAY_CACHE", "DATA_STORE_GL_INFO", "DATA_STORE_IAP_TRANSACTION", "DATA_STORE_NATIVE_CONFIG", "DATA_STORE_PRIVACY", "DATA_STORE_PRIVACY_FSM", "DATA_STORE_UNIVERSAL_REQUEST", "DATA_STORE_WEBVIEW_CONFIG", "DEFAULT_DISPATCHER", "DEV_CONSENT_PRIVACY_RULES", "GATEWAY_HOST", "GATEWAY_PORT", "HTTP_CACHE_DISK_SIZE", "", "HTTP_CLIENT_FETCH_TIMEOUT", "IO_DISPATCHER", "LEGACY_PRIVACY_RULES", "MAIN_DISPATCHER", "NAMED_AD_REQ", "NAMED_GET_TOKEN_SCOPE", "NAMED_INIT_REQ", "NAMED_INIT_SCOPE", "NAMED_LOAD_SCOPE", "NAMED_LOCAL", "NAMED_OFFERWALL_SCOPE", "NAMED_OMID_SCOPE", "NAMED_OPERATIVE_REQ", "NAMED_OTHER_REQ", "NAMED_PUBLIC_JOB", "NAMED_REMOTE", "NAMED_SCAR_SCOPE", "NAMED_SDK", "NAMED_SHOW_SCOPE", "NAMED_TRANSACTION_SCOPE", "PREF_GL_INFO", "SCAR_SIGNALS_FETCH_TIMEOUT", "SCAR_VERSION_FETCH_TIMEOUT", "serviceRegistry", "Lcom/unity3d/services/core/di/IServicesRegistry;", "getRegistry", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ServiceProvider implements com.unity3d.services.core.di.IServiceProvider {
    public static final java.lang.String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;
    public static final java.lang.String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";
    public static final java.lang.String DATA_STORE_GL_INFO = "glinfo.pb";
    public static final java.lang.String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";
    public static final java.lang.String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";
    public static final java.lang.String DATA_STORE_PRIVACY = "privacy.pb";
    public static final java.lang.String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";
    public static final java.lang.String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";
    public static final java.lang.String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";
    public static final java.lang.String DEFAULT_DISPATCHER = "default_dispatcher";
    public static final java.lang.String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";
    public static final java.lang.String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;
    public static final com.unity3d.services.core.di.ServiceProvider INSTANCE;
    public static final java.lang.String IO_DISPATCHER = "io_dispatcher";
    public static final java.lang.String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";
    public static final java.lang.String MAIN_DISPATCHER = "main_dispatcher";
    public static final java.lang.String NAMED_AD_REQ = "ad_req";
    public static final java.lang.String NAMED_GET_TOKEN_SCOPE = "get_token_scope";
    public static final java.lang.String NAMED_INIT_REQ = "init_req";
    public static final java.lang.String NAMED_INIT_SCOPE = "init_scope";
    public static final java.lang.String NAMED_LOAD_SCOPE = "load_scope";
    public static final java.lang.String NAMED_LOCAL = "local";
    public static final java.lang.String NAMED_OFFERWALL_SCOPE = "offerwall_scope";
    public static final java.lang.String NAMED_OMID_SCOPE = "omid_scope";
    public static final java.lang.String NAMED_OPERATIVE_REQ = "op_event_req";
    public static final java.lang.String NAMED_OTHER_REQ = "other_req";
    public static final java.lang.String NAMED_PUBLIC_JOB = "public_job";
    public static final java.lang.String NAMED_REMOTE = "remote";
    public static final java.lang.String NAMED_SCAR_SCOPE = "scar_scope";
    public static final java.lang.String NAMED_SDK = "sdk";
    public static final java.lang.String NAMED_SHOW_SCOPE = "show_scope";
    public static final java.lang.String NAMED_TRANSACTION_SCOPE = "transaction_scope";
    public static final java.lang.String PREF_GL_INFO = "glinfo";
    public static final long SCAR_SIGNALS_FETCH_TIMEOUT = 50000;
    public static final long SCAR_VERSION_FETCH_TIMEOUT = 5000;
    private static final com.unity3d.services.core.di.IServicesRegistry serviceRegistry;

    private ServiceProvider() {
    }

    static {
        com.unity3d.services.core.di.ServiceProvider serviceProvider = new com.unity3d.services.core.di.ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public com.unity3d.services.core.di.IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.di.IServiceProvider
    public com.unity3d.services.core.di.IServicesRegistry initialize() {
        return com.unity3d.services.core.di.ServicesRegistryKt.registry(new kotlin.jvm.functions.Function1<com.unity3d.services.core.di.ServicesRegistry, kotlin.Unit>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(com.unity3d.services.core.di.ServicesRegistry servicesRegistry) {
                invoke2(servicesRegistry);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final com.unity3d.services.core.di.ServicesRegistry registry) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registry, "$this$registry");
                final com.unity3d.services.core.di.UnityAdsModule unityAdsModule = new com.unity3d.services.core.di.UnityAdsModule();
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<android.content.Context>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final android.content.Context invoke() {
                        return com.unity3d.services.core.properties.ClientProperties.getApplicationContext();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.MAIN_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineDispatcher>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlinx.coroutines.CoroutineDispatcher invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.mainDispatcher();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineDispatcher>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.3
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlinx.coroutines.CoroutineDispatcher invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.defaultDispatcher();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.IO_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineDispatcher>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.4
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlinx.coroutines.CoroutineDispatcher invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.ioDispatcher();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.ISDKDispatchers>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.5
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.domain.ISDKDispatchers invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.sdkDispatchers();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.request.metrics.SDKMetricsSender.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.request.metrics.SDKMetricsSender>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.6
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.request.metrics.SDKMetricsSender invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.sdkMetrics();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_INIT_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlinx.coroutines.CoroutineScope invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.initCoroutineScope((com.unity3d.services.core.domain.ISDKDispatchers) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (kotlinx.coroutines.CoroutineExceptionHandler) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("sdk", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineExceptionHandler.class))), (kotlinx.coroutines.Job) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_PUBLIC_JOB, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.Job.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_LOAD_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlinx.coroutines.CoroutineScope invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.loadCoroutineScope((com.unity3d.services.core.domain.ISDKDispatchers) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (kotlinx.coroutines.CoroutineExceptionHandler) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("sdk", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineExceptionHandler.class))), (kotlinx.coroutines.Job) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_PUBLIC_JOB, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.Job.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_SHOW_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlinx.coroutines.CoroutineScope invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.showCoroutineScope((com.unity3d.services.core.domain.ISDKDispatchers) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (kotlinx.coroutines.CoroutineExceptionHandler) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("sdk", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineExceptionHandler.class))), (kotlinx.coroutines.Job) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_PUBLIC_JOB, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.Job.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_TRANSACTION_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlinx.coroutines.CoroutineScope invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.transactionCoroutineScope((com.unity3d.services.core.domain.ISDKDispatchers) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (kotlinx.coroutines.CoroutineExceptionHandler) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("sdk", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineExceptionHandler.class))), (kotlinx.coroutines.Job) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_PUBLIC_JOB, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.Job.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_GET_TOKEN_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlinx.coroutines.CoroutineScope invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.getTokenCoroutineScope((com.unity3d.services.core.domain.ISDKDispatchers) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (kotlinx.coroutines.CoroutineExceptionHandler) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("sdk", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineExceptionHandler.class))), (kotlinx.coroutines.Job) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_PUBLIC_JOB, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.Job.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_SCAR_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlinx.coroutines.CoroutineScope invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.scarSignalsCoroutineScope((com.unity3d.services.core.domain.ISDKDispatchers) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (kotlinx.coroutines.CoroutineExceptionHandler) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("sdk", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineExceptionHandler.class))), (kotlinx.coroutines.Job) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_PUBLIC_JOB, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.Job.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_OFFERWALL_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlinx.coroutines.CoroutineScope invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.offerwallSignalsCoroutineScope((com.unity3d.services.core.domain.ISDKDispatchers) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (kotlinx.coroutines.CoroutineExceptionHandler) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("sdk", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineExceptionHandler.class))), (kotlinx.coroutines.Job) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_PUBLIC_JOB, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.Job.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_OMID_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.14
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlinx.coroutines.CoroutineScope invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.omidCoroutineScope((com.unity3d.services.core.domain.ISDKDispatchers) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (kotlinx.coroutines.CoroutineExceptionHandler) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("sdk", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineExceptionHandler.class))), (kotlinx.coroutines.Job) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_PUBLIC_JOB, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.Job.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_PUBLIC_JOB, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.Job.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<kotlinx.coroutines.Job>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.15
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlinx.coroutines.Job invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.publicApiJob((com.unity3d.ads.core.data.repository.DiagnosticEventRepository) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DiagnosticEventRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_GATEWAY_CACHE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.ByteStringDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.16
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource((com.unity3d.ads.core.data.manager.StorageManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.StorageManager.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_PRIVACY, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataStore.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.17
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.privacyDataStore((android.content.Context) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (kotlinx.coroutines.CoroutineDispatcher) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.IO_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_PRIVACY, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.ByteStringDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.18
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.privacyDataStore((androidx.datastore.core.DataStore) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_PRIVACY, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataStore.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_PRIVACY_FSM, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataStore.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.19
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.privacyFsmDataStore((android.content.Context) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (kotlinx.coroutines.CoroutineDispatcher) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.IO_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_PRIVACY_FSM, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.ByteStringDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.20
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.privacyFsmDataStore((androidx.datastore.core.DataStore) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_PRIVACY_FSM, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataStore.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_NATIVE_CONFIG, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataStore.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.21
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.nativeConfigurationDataStore((android.content.Context) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (kotlinx.coroutines.CoroutineDispatcher) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.IO_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_NATIVE_CONFIG, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.ByteStringDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.22
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.nativeConfigurationDataStore((androidx.datastore.core.DataStore) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_NATIVE_CONFIG, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataStore.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_GL_INFO, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataStore.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.23
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.glInfoDataStore((android.content.Context) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (kotlinx.coroutines.CoroutineDispatcher) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.IO_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (androidx.datastore.core.DataMigration) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.PREF_GL_INFO, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataMigration.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_GL_INFO, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.ByteStringDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.24
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.glInfoDataStore((androidx.datastore.core.DataStore) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_GL_INFO, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataStore.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.25
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider invoke() {
                        return new com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.IO_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_IAP_TRANSACTION, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataStore.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.26
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.iapTransactionDataStore((android.content.Context) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (kotlinx.coroutines.CoroutineDispatcher) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.IO_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_IAP_TRANSACTION, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.ByteStringDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.ByteStringDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.27
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.ByteStringDataSource invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.iapTransactionDataStore((androidx.datastore.core.DataStore) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_IAP_TRANSACTION, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataStore.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataStore.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.datastore.core.DataStore<com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.28
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final androidx.datastore.core.DataStore<com.unity3d.ads.datastore.WebviewConfigurationStore.WebViewConfigurationStore> invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.webViewConfigurationDataStore((android.content.Context) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (kotlinx.coroutines.CoroutineDispatcher) registry.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.IO_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.ads.token.AsyncTokenStorage.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.ads.token.AsyncTokenStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.29
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.ads.token.AsyncTokenStorage invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.asyncTokenStorage((com.unity3d.services.ads.token.TokenStorage) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.ads.token.TokenStorage.class))), (com.unity3d.services.core.request.metrics.SDKMetricsSender) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.request.metrics.SDKMetricsSender.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.device.VolumeChangeMonitor.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.device.VolumeChangeMonitor>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.30
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.device.VolumeChangeMonitor invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.volumeChangeMonitor((com.unity3d.services.core.device.VolumeChange) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.device.VolumeChange.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("PUBLIC", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.misc.JsonStorage.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.misc.JsonStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.31
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.misc.JsonStorage invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.publicJsonStorage();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("PRIVATE", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.misc.JsonStorage.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.misc.JsonStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.32
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.misc.JsonStorage invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.privateJsonStorage();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("MEMORY", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.misc.JsonStorage.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.misc.JsonStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.33
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.misc.JsonStorage invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.memoryJsonStorage();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.34
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.defaultNativeConfiguration();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.ads.measurements.MeasurementsService.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.ads.measurements.MeasurementsService>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.35
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.ads.measurements.MeasurementsService invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.measurementService((android.content.Context) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (com.unity3d.services.core.domain.ISDKDispatchers) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.ads.topics.TopicsService.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.ads.topics.TopicsService>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.36
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.ads.topics.TopicsService invoke() {
                        return com.unity3d.services.core.di.UnityAdsModule.this.topicsService((android.content.Context) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (com.unity3d.services.core.domain.ISDKDispatchers) registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.network.core.CronetEngineBuilderFactory.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.network.core.CronetEngineBuilderFactory>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.37
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.network.core.CronetEngineBuilderFactory invoke() {
                        return new com.unity3d.services.core.network.core.CronetEngineBuilderFactory();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HttpClientProvider.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.HttpClientProvider>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.38
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.HttpClientProvider invoke() {
                        return new com.unity3d.ads.core.domain.AndroidHttpClientProvider((com.unity3d.ads.core.configuration.AlternativeFlowReader) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.AlternativeFlowReader.class))), (com.unity3d.services.core.domain.ISDKDispatchers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))), (android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (com.unity3d.services.core.network.core.CronetEngineBuilderFactory) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.network.core.CronetEngineBuilderFactory.class))), (com.unity3d.ads.core.configuration.MediationTraitsMetadataReader) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.MediationTraitsMetadataReader.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.network.core.HttpClient.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.network.core.HttpClient>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.39
                    {
                        super(0);
                    }

                    /* compiled from: ServiceProvider.kt */
                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/core/HttpClient;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1", f = "ServiceProvider.kt", i = {}, l = {462}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1, reason: invalid class name */
                    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.HttpClient>, java.lang.Object> {
                        final /* synthetic */ com.unity3d.services.core.di.ServicesRegistry $this_registry;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(com.unity3d.services.core.di.ServicesRegistry servicesRegistry, kotlin.coroutines.Continuation<? super com.unity3d.services.core.di.ServiceProvider$initialize$1.AnonymousClass39.AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$this_registry = servicesRegistry;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            return new com.unity3d.services.core.di.ServiceProvider$initialize$1.AnonymousClass39.AnonymousClass1(this.$this_registry, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.HttpClient> continuation) {
                            return ((com.unity3d.services.core.di.ServiceProvider$initialize$1.AnonymousClass39.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                obj = ((com.unity3d.ads.core.domain.HttpClientProvider) this.$this_registry.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HttpClientProvider.class)))).invoke(this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                            }
                            return obj;
                        }
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.network.core.HttpClient invoke() {
                        java.lang.Object runBlocking$default;
                        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.unity3d.services.core.di.ServiceProvider$initialize$1.AnonymousClass39.AnonymousClass1(com.unity3d.services.core.di.ServicesRegistry.this, null), 1, null);
                        return (com.unity3d.services.core.network.core.HttpClient) runBlocking$default;
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.MediationTraitsMetadataReader.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.configuration.MediationTraitsMetadataReader>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.40
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.configuration.MediationTraitsMetadataReader invoke() {
                        return new com.unity3d.ads.core.configuration.MediationTraitsMetadataReader((com.unity3d.services.core.misc.JsonStorage) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("MEMORY", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.misc.JsonStorage.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.AlternativeFlowReader.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.configuration.AlternativeFlowReader>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.41
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.configuration.AlternativeFlowReader invoke() {
                        return new com.unity3d.ads.core.configuration.CommonAlternativeFlowReader((com.unity3d.services.core.configuration.ConfigurationReader) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.configuration.ConfigurationReader.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.configuration.MediationTraitsMetadataReader) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.MediationTraitsMetadataReader.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.TcfDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.TcfDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.42
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.TcfDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidTcfDataSource();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.TcfRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.TcfRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.43
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.TcfRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.AndroidTcfRepository((com.unity3d.ads.core.data.datasource.TcfDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.TcfDataSource.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.44
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader invoke() {
                        return new com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidTestDataInfo.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.AndroidTestDataInfo>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.45
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.AndroidTestDataInfo invoke() {
                        return new com.unity3d.ads.core.domain.AndroidTestDataInfo((com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.GameServerIdReader.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.configuration.GameServerIdReader>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.46
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.configuration.GameServerIdReader invoke() {
                        return new com.unity3d.ads.core.configuration.GameServerIdReader((com.unity3d.services.core.misc.JsonStorage) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("PUBLIC", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.misc.JsonStorage.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.StoreDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.StoreDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.47
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.StoreDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidStoreDataSource((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.AnalyticsDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.AnalyticsDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.48
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.AnalyticsDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.49
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource((com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEV_CONSENT_PRIVACY_RULES, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase.class))), (com.unity3d.services.core.misc.JsonStorage) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("PUBLIC", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.misc.JsonStorage.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.50
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (com.unity3d.ads.core.data.datasource.LifecycleDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.LifecycleDataSource.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.51
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource((com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.LEGACY_PRIVACY_RULES, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase.class))), (com.unity3d.services.core.misc.JsonStorage) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("PRIVATE", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.misc.JsonStorage.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.LifecycleDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.LifecycleDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.52
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.LifecycleDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("local", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.CacheDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.CacheDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.53
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.CacheDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource((com.unity3d.ads.core.domain.CreateFile) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CreateFile.class))), (com.unity3d.ads.core.domain.GetFileExtensionFromUrl) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetFileExtensionFromUrl.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CreateFile.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.CreateFile>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.54
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.CreateFile invoke() {
                        return new com.unity3d.ads.core.domain.CommonCreateFile();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetFileExtensionFromUrl.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetFileExtensionFromUrl>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.55
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetFileExtensionFromUrl invoke() {
                        return new com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl((com.unity3d.ads.core.domain.RemoveUrlQuery) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.RemoveUrlQuery.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.RemoveUrlQuery.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.RemoveUrlQuery>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.56
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.RemoveUrlQuery invoke() {
                        return new com.unity3d.ads.core.domain.AndroidRemoveUrlQuery();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.MediationDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.MediationDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.57
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.MediationDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidMediationDataSource((com.unity3d.services.core.misc.JsonStorage) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("MEMORY", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.misc.JsonStorage.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.58
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (com.unity3d.ads.core.data.datasource.FIdDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.FIdDataSource.class))), (com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_REMOTE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.CacheDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.CacheDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.59
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.CacheDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.IO_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (com.unity3d.ads.core.domain.CreateFile) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CreateFile.class))), (com.unity3d.ads.core.domain.GetFileExtensionFromUrl) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetFileExtensionFromUrl.class))), (com.unity3d.ads.core.domain.HttpClientProvider) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HttpClientProvider.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.60
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (com.unity3d.ads.core.data.datasource.ByteStringDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_GL_INFO, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.ByteStringDataSource.class))), (com.unity3d.ads.core.data.datasource.AnalyticsDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.AnalyticsDataSource.class))), (com.unity3d.ads.core.data.datasource.StoreDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.StoreDataSource.class))), (com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.PREF_GL_INFO, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataMigration.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.datastore.core.DataMigration<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore>>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.61
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final androidx.datastore.core.DataMigration<com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore> invoke() {
                        return new com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration((com.unity3d.ads.core.domain.GetOpenGLRendererInfo) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetOpenGLRendererInfo.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.UniversalRequestDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.62
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.UniversalRequestDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.UniversalRequestDataSource((com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.UniversalRequestDataStoreProvider.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.63
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource((androidx.datastore.core.DataStore) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataStore.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.OmidManager.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.manager.OmidManager>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.64
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.manager.OmidManager invoke() {
                        return new com.unity3d.ads.core.data.manager.AndroidOmidManager();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.SDKPropertiesManager.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.manager.SDKPropertiesManager>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.65
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.manager.SDKPropertiesManager invoke() {
                        return new com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.StorageManager.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.manager.StorageManager>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.66
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.manager.StorageManager invoke() {
                        return new com.unity3d.ads.core.data.manager.AndroidStorageManager();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.67
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter invoke() {
                        return new com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapterFactory().createBillingClientAdapter((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.billing.ProductDetailsFetcher.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.billing.ProductDetailsFetcher>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.68
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.billing.ProductDetailsFetcher invoke() {
                        return new com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback(new com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher((com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter.class))), "inapp"), new com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher((com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter.class))), "subs"));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.TransactionEventManager.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.manager.TransactionEventManager>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.69
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.manager.TransactionEventManager invoke() {
                        return new com.unity3d.ads.core.data.manager.TransactionEventManager((kotlinx.coroutines.CoroutineScope) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_TRANSACTION_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class))), (com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter.class))), (com.unity3d.ads.core.domain.events.GetTransactionData) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetTransactionData.class))), (com.unity3d.ads.core.domain.events.GetTransactionRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetTransactionRequest.class))), (com.unity3d.ads.core.data.repository.TransactionEventRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.TransactionEventRepository.class))), (com.unity3d.ads.core.data.datasource.ByteStringDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_IAP_TRANSACTION, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.ByteStringDataSource.class))), (com.unity3d.ads.core.domain.billing.IsBillingClientAvailable) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.billing.IsBillingClientAvailable.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.domain.billing.ProductDetailsFetcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.billing.ProductDetailsFetcher.class))), (com.unity3d.ads.core.log.Logger) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.log.Logger.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.AdRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.AdRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.70
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.AdRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.AndroidAdRepository();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CacheRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.CacheRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.71
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.CacheRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.AndroidCacheRepository((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.IO_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (com.unity3d.ads.core.domain.GetCacheDirectory) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetCacheDirectory.class))), (com.unity3d.ads.core.data.datasource.CacheDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("local", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.CacheDataSource.class))), (com.unity3d.ads.core.data.datasource.CacheDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_REMOTE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.CacheDataSource.class))), (android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.services.core.network.domain.CleanupDirectory) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.network.domain.CleanupDirectory.class))), (com.unity3d.ads.core.domain.work.DownloadPriorityQueue) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.work.DownloadPriorityQueue.class))), (com.unity3d.ads.core.domain.CreateFile) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CreateFile.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetCacheDirectory.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetCacheDirectory>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.72
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetCacheDirectory invoke() {
                        return new com.unity3d.ads.core.domain.CommonGetCacheDirectory();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CampaignRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.CampaignRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.73
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.CampaignRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.AndroidCampaignRepository((com.unity3d.ads.core.domain.GetSharedDataTimestamps) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetSharedDataTimestamps.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeveloperConsentRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.DeveloperConsentRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.74
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.DeveloperConsentRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository((com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.DeviceInfoRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.75
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.DeviceInfoRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository((com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource.class))), (com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource.class))), (com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DiagnosticEventRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.DiagnosticEventRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.76
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.DiagnosticEventRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository((com.unity3d.ads.core.utils.CoroutineTimer) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.utils.CoroutineTimer.class))), (com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.class))), (kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.LegacyUserConsentRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.LegacyUserConsentRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.77
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.LegacyUserConsentRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository((com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.MediationRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.MediationRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.78
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.MediationRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.AndroidMediationRepository((com.unity3d.ads.core.data.datasource.MediationDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.MediationDataSource.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.OpenMeasurementRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.OpenMeasurementRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.79
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.OpenMeasurementRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.MAIN_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (com.unity3d.ads.core.data.manager.OmidManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.OmidManager.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.SessionRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.80
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.SessionRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.AndroidSessionRepository((com.unity3d.ads.core.data.datasource.ByteStringDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_GATEWAY_CACHE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.ByteStringDataSource.class))), (com.unity3d.ads.core.data.datasource.ByteStringDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_PRIVACY, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.ByteStringDataSource.class))), (com.unity3d.ads.core.data.datasource.ByteStringDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_PRIVACY_FSM, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.ByteStringDataSource.class))), (com.unity3d.ads.core.data.datasource.ByteStringDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_NATIVE_CONFIG, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.ByteStringDataSource.class))), (com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource.class))), (gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration.class))), (kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.IO_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.TransactionEventRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.TransactionEventRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.81
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.TransactionEventRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.OperativeEventRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.OperativeEventRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.82
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.OperativeEventRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.OperativeEventRepository();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.ExecuteAdViewerRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.ExecuteAdViewerRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.83
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.ExecuteAdViewerRequest invoke() {
                        return new com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.IO_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (com.unity3d.ads.core.domain.HttpClientProvider) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HttpClientProvider.class))), (com.unity3d.ads.core.domain.GetCachedAsset) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetCachedAsset.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetByteStringId.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetByteStringId>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.84
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetByteStringId invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGenerateByteStringId();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.IntentCreation.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.IntentCreation>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.85
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.IntentCreation invoke() {
                        return new com.unity3d.ads.core.domain.AndroidIntentCreation();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HandleOpenUrl.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.HandleOpenUrl>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.86
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.HandleOpenUrl invoke() {
                        return new com.unity3d.ads.core.domain.AndroidHandleOpenUrl((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (com.unity3d.ads.core.domain.IntentCreation) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.IntentCreation.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.Refresh.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.Refresh>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.87
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.Refresh invoke() {
                        return new com.unity3d.ads.core.domain.AndroidRefresh((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (com.unity3d.ads.core.domain.GetAdDataRefreshRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAdDataRefreshRequest.class))), (com.unity3d.ads.core.domain.GetRequestPolicy) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_AD_REQ, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class))), (com.unity3d.ads.gatewayclient.GatewayClient) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.gatewayclient.GatewayClient.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.SendDiagnosticEvent>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.88
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.SendDiagnosticEvent invoke() {
                        return new com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent((com.unity3d.ads.core.data.repository.DiagnosticEventRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DiagnosticEventRepository.class))), (com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.class))), (com.unity3d.ads.core.data.datasource.LifecycleDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.LifecycleDataSource.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.89
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics invoke() {
                        return new com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics((com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.Show.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.Show>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.90
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.Show invoke() {
                        return new com.unity3d.ads.core.domain.AndroidShow((com.unity3d.ads.core.data.repository.AdRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.AdRepository.class))), (com.unity3d.ads.core.configuration.GameServerIdReader) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.GameServerIdReader.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CacheFile.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.CacheFile>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.91
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.CacheFile invoke() {
                        return new com.unity3d.ads.core.domain.CommonCacheFile((com.unity3d.ads.core.data.repository.CacheRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CacheRepository.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CleanAssets.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.CleanAssets>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.92
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.CleanAssets invoke() {
                        return new com.unity3d.ads.core.domain.CommonCleanAssets((com.unity3d.ads.core.data.repository.CacheRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CacheRepository.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAdObject.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetAdObject>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.93
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetAdObject invoke() {
                        return new com.unity3d.ads.core.domain.CommonGetAdObject((com.unity3d.ads.core.data.repository.AdRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.AdRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.94
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase invoke() {
                        return new com.unity3d.ads.core.domain.scar.CommonScarEligibleEffectiveUseCase((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetHeaderBiddingToken.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetHeaderBiddingToken>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.95
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetHeaderBiddingToken invoke() {
                        return new com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken((com.unity3d.ads.core.domain.BuildHeaderBiddingToken) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.BuildHeaderBiddingToken.class))), (com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase.class))), (com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.BuildHeaderBiddingToken.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.BuildHeaderBiddingToken>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.96
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.BuildHeaderBiddingToken invoke() {
                        return new com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken((com.unity3d.ads.core.domain.GetByteStringId) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetByteStringId.class))), (com.unity3d.ads.core.domain.GetClientInfo) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetClientInfo.class))), (com.unity3d.ads.core.domain.GetSharedDataTimestamps) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetSharedDataTimestamps.class))), (com.unity3d.ads.core.domain.GetLimitedSessionToken) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetLimitedSessionToken.class))), (com.unity3d.ads.core.domain.GetInitializationData) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationData.class))), (com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.repository.CampaignRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CampaignRepository.class))), (com.unity3d.ads.core.data.repository.TcfRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.TcfRepository.class))), (com.unity3d.ads.core.domain.AndroidTestDataInfo) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidTestDataInfo.class))), (com.unity3d.ads.core.data.manager.OfferwallManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.OfferwallManager.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.TokenNumberProvider.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.TokenNumberProvider>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.97
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.TokenNumberProvider invoke() {
                        return new com.unity3d.ads.core.domain.CommonTokenNumberProvider((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationData.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetInitializationData>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.98
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetInitializationData invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetInitializationData((com.unity3d.ads.core.domain.GetInitializationRequestPayload) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationRequestPayload.class))), (com.unity3d.ads.core.domain.GetUniversalRequestSharedData) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestSharedData.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.99
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader invoke() {
                        return new com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader((com.unity3d.services.core.misc.JsonStorage) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("MEMORY", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.misc.JsonStorage.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationRequestPayload.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetInitializationRequestPayload>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.100
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetInitializationRequestPayload invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload((com.unity3d.ads.core.domain.GetClientInfo) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetClientInfo.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class))), (com.unity3d.ads.core.data.repository.LegacyUserConsentRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.LegacyUserConsentRepository.class))), (com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationState.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetInitializationState>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.101
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetInitializationState invoke() {
                        return new com.unity3d.ads.core.domain.CommonGetInitializationState((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.manager.SDKPropertiesManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.SDKPropertiesManager.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetIsFileCache.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetIsFileCache>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.102
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetIsFileCache invoke() {
                        return new com.unity3d.ads.core.domain.CommonGetIsFileCache((com.unity3d.ads.core.data.repository.CacheRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CacheRepository.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SetInitializationState.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.SetInitializationState>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.103
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.SetInitializationState invoke() {
                        return new com.unity3d.ads.core.domain.CommonSetInitializationState((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.manager.SDKPropertiesManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.SDKPropertiesManager.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_AD_REQ, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.104
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetRequestPolicy invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAdDataRefreshRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetAdDataRefreshRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.105
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetAdDataRefreshRequest invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest((com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class))), (com.unity3d.ads.core.data.repository.CampaignRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CampaignRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAdPlayerConfigRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetAdPlayerConfigRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.106
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetAdPlayerConfigRequest invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest((com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.AndroidGetAdPlayerContext>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.107
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.AndroidGetAdPlayerContext invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetAdPlayerContext((com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAdRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetAdRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.108
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetAdRequest invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetAdRequest((com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class))), (com.unity3d.ads.core.data.repository.CampaignRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CampaignRepository.class))), (com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.class))), (com.unity3d.ads.core.data.repository.TcfRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.TcfRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.109
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest invoke() {
                        return new com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.scar.CommonScarEventReceiver>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.110
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.scar.CommonScarEventReceiver invoke() {
                        return new com.unity3d.ads.core.domain.scar.CommonScarEventReceiver((kotlinx.coroutines.CoroutineScope) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_SCAR_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.ads.gmascar.GMAScarAdapterBridge.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.ads.gmascar.GMAScarAdapterBridge>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.111
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.ads.gmascar.GMAScarAdapterBridge invoke() {
                        com.unity3d.services.ads.gmascar.GMAScarAdapterBridge bridge = com.unity3d.services.ads.gmascar.GMA.getInstance(new com.unity3d.services.ads.gmascar.utils.GMAEventSender((com.unity3d.services.core.webview.bridge.IEventSender) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.class))))).getBridge();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bridge, "getInstance(GMAEventSend…EventReceiver>())).bridge");
                        return bridge;
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.ScarTimeHackFixer.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.scar.ScarTimeHackFixer>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.112
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.scar.ScarTimeHackFixer invoke() {
                        return new com.unity3d.ads.core.domain.scar.ScarTimeHackFixer((com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.ScarManager.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.manager.ScarManager>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.113
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.manager.ScarManager invoke() {
                        return new com.unity3d.ads.core.data.manager.AndroidScarManager((com.unity3d.ads.core.domain.scar.CommonScarEventReceiver) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.class))), (com.unity3d.services.ads.gmascar.GMAScarAdapterBridge) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.ads.gmascar.GMAScarAdapterBridge.class))), (com.unity3d.ads.core.domain.scar.ScarTimeHackFixer) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.ScarTimeHackFixer.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.114
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase invoke() {
                        return new com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase((kotlinx.coroutines.CoroutineScope) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_SCAR_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class))), (com.unity3d.ads.core.data.manager.ScarManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.ScarManager.class))), (com.unity3d.ads.core.domain.scar.HandleGetTokenRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.HandleGetTokenRequest.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))), (com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.LoadScarAd.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.scar.LoadScarAd>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.115
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.scar.LoadScarAd invoke() {
                        return new com.unity3d.ads.core.domain.scar.LoadScarAd((com.unity3d.ads.core.data.manager.ScarManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.ScarManager.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.HandleGetTokenRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.scar.HandleGetTokenRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.116
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.scar.HandleGetTokenRequest invoke() {
                        return new com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest((com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad.class))), (com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest.class))), (com.unity3d.ads.core.domain.GetRequestPolicy) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_OTHER_REQ, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class))), (com.unity3d.ads.gatewayclient.GatewayClient) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.gatewayclient.GatewayClient.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetClientInfo.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetClientInfo>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.117
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetClientInfo invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetClientInfo((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.repository.MediationRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.MediationRepository.class))), (com.unity3d.ads.core.data.manager.OmidManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.OmidManager.class))), (com.unity3d.ads.core.data.manager.ScarManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.ScarManager.class))), (com.unity3d.ads.core.data.manager.OfferwallManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.OfferwallManager.class))), (com.unity3d.ads.core.data.datasource.FIdExistenceDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.FIdExistenceDataSource.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationCompletedRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetInitializationCompletedRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.118
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetInitializationCompletedRequest invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest((com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad.class))), (com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetInitializationRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.119
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetInitializationRequest invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetInitializationRequest((com.unity3d.ads.core.domain.GetInitializationRequestPayload) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationRequestPayload.class))), (com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetLimitedSessionToken.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetLimitedSessionToken>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.120
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetLimitedSessionToken invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken((com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.repository.MediationRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.MediationRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetOpenGLRendererInfo.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetOpenGLRendererInfo>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.121
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetOpenGLRendererInfo invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetSharedDataTimestamps.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetSharedDataTimestamps>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.122
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetSharedDataTimestamps invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.123
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad((com.unity3d.ads.core.domain.GetUniversalRequestSharedData) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestSharedData.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestSharedData.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetUniversalRequestSharedData>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.124
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetUniversalRequestSharedData invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData((com.unity3d.ads.core.domain.GetSharedDataTimestamps) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetSharedDataTimestamps.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class))), (com.unity3d.ads.core.domain.GetLimitedSessionToken) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetLimitedSessionToken.class))), (com.unity3d.ads.core.data.repository.DeveloperConsentRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeveloperConsentRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetCachedAsset.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetCachedAsset>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.125
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetCachedAsset invoke() {
                        return new com.unity3d.ads.core.domain.GetCachedAsset((com.unity3d.ads.core.data.repository.CacheRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CacheRepository.class))), (android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (com.unity3d.ads.core.domain.CacheWebViewAssets) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CacheWebViewAssets.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetWebViewBridgeUseCase.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetWebViewBridgeUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.126
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetWebViewBridgeUseCase invoke() {
                        return new com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))), (com.unity3d.ads.core.log.Logger) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.log.Logger.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_INIT_REQ, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.127
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetRequestPolicy invoke() {
                        return new com.unity3d.ads.core.domain.GetInitRequestPolicy((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetLatestWebViewConfiguration>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.128
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetLatestWebViewConfiguration invoke() {
                        return new com.unity3d.ads.core.domain.GetLatestWebViewConfiguration((com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_OPERATIVE_REQ, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.129
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetRequestPolicy invoke() {
                        return new com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_OTHER_REQ, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetRequestPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.130
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetRequestPolicy invoke() {
                        return new com.unity3d.ads.core.domain.GetOtherRequestPolicy((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetPrivacyUpdateRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetPrivacyUpdateRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.131
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetPrivacyUpdateRequest invoke() {
                        return new com.unity3d.ads.core.domain.GetPrivacyUpdateRequest((com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HandleGatewayInitializationResponse.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.HandleGatewayInitializationResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.132
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.HandleGatewayInitializationResponse invoke() {
                        return new com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse((com.unity3d.ads.core.data.manager.TransactionEventManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.TransactionEventManager.class))), (com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (kotlinx.coroutines.CoroutineScope) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_INIT_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class))), (com.unity3d.ads.core.domain.HandleDebugSettings) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HandleDebugSettings.class))), (com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HandleGatewayUniversalResponse.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.HandleGatewayUniversalResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.133
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.HandleGatewayUniversalResponse invoke() {
                        return new com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class))), (com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.InitializeBoldSDK.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.InitializeBoldSDK>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.134
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.InitializeBoldSDK invoke() {
                        return new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (com.unity3d.ads.core.domain.om.InitializeOMSDK) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.InitializeOMSDK.class))), (com.unity3d.ads.core.domain.GetInitializationRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationRequest.class))), (com.unity3d.ads.core.domain.GetRequestPolicy) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_INIT_REQ, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class))), (com.unity3d.ads.core.domain.CleanAssets) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CleanAssets.class))), (com.unity3d.ads.core.domain.HandleGatewayInitializationResponse) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HandleGatewayInitializationResponse.class))), (com.unity3d.ads.gatewayclient.GatewayClient) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.gatewayclient.GatewayClient.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.domain.events.EventObservers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.EventObservers.class))), (com.unity3d.ads.core.domain.TriggerInitializeListener) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.TriggerInitializeListener.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))), (com.unity3d.ads.core.data.repository.DiagnosticEventRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DiagnosticEventRepository.class))), (com.unity3d.ads.core.data.manager.StorageManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.StorageManager.class))), (com.unity3d.services.core.configuration.ConfigurationReader) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.configuration.ConfigurationReader.class))), (com.unity3d.ads.core.data.manager.SDKPropertiesManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.SDKPropertiesManager.class))), (com.unity3d.ads.core.domain.GetGameId) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetGameId.class))), (com.unity3d.ads.core.log.Logger) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.log.Logger.class))), (com.unity3d.ads.core.domain.AndroidHandleFocusCounters) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidHandleFocusCounters.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.LegacyShowUseCase.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.LegacyShowUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.135
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.LegacyShowUseCase invoke() {
                        return new com.unity3d.ads.core.domain.LegacyShowUseCase((com.unity3d.ads.core.domain.Show) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.Show.class))), (com.unity3d.ads.core.data.repository.AdRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.AdRepository.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))), (com.unity3d.ads.core.domain.events.GetOperativeEventApi) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetOperativeEventApi.class))), (com.unity3d.ads.core.domain.GetInitializationState) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationState.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.domain.SafeCallbackInvoke) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SafeCallbackInvoke.class))), (com.unity3d.ads.core.log.Logger) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.log.Logger.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.SendPrivacyUpdateRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.136
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.SendPrivacyUpdateRequest invoke() {
                        return new com.unity3d.ads.core.domain.SendPrivacyUpdateRequest((com.unity3d.ads.core.domain.GetPrivacyUpdateRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetPrivacyUpdateRequest.class))), (com.unity3d.ads.core.domain.GetRequestPolicy) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_OTHER_REQ, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class))), (com.unity3d.ads.gatewayclient.GatewayClient) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.gatewayclient.GatewayClient.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.137
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest invoke() {
                        return new com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest((com.unity3d.ads.core.domain.GetInitializationCompletedRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationCompletedRequest.class))), (com.unity3d.ads.core.domain.GetRequestPolicy) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_INIT_REQ, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class))), (com.unity3d.ads.gatewayclient.GatewayClient) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.gatewayclient.GatewayClient.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.TriggerInitializeListener.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.TriggerInitializeListener>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.138
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.TriggerInitializeListener invoke() {
                        return new com.unity3d.ads.core.domain.TriggerInitializeListener((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.MAIN_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.DiagnosticEventObserver.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.DiagnosticEventObserver>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.139
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.events.DiagnosticEventObserver invoke() {
                        return new com.unity3d.ads.core.domain.events.DiagnosticEventObserver((com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad.class))), (com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest.class))), (kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (com.unity3d.ads.core.data.repository.DiagnosticEventRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DiagnosticEventRepository.class))), (com.unity3d.ads.core.data.datasource.UniversalRequestDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.class))), (com.unity3d.ads.core.domain.work.BackgroundWorker) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.work.BackgroundWorker.class))), (com.unity3d.ads.core.domain.events.UniversalRequestEventSender) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.UniversalRequestEventSender.class))), (com.unity3d.ads.core.domain.GetRequestPolicy) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_OTHER_REQ, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.EventObservers.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.EventObservers>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.140
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.events.EventObservers invoke() {
                        return new com.unity3d.ads.core.domain.events.EventObservers((com.unity3d.ads.core.domain.events.OperativeEventObserver) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.OperativeEventObserver.class))), (com.unity3d.ads.core.domain.events.DiagnosticEventObserver) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.DiagnosticEventObserver.class))), (com.unity3d.ads.core.domain.events.TransactionEventObserver) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.TransactionEventObserver.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetTransactionData.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.GetTransactionData>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.141
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.events.GetTransactionData invoke() {
                        return new com.unity3d.ads.core.domain.events.AndroidGetTransactionData((com.unity3d.ads.core.domain.GetByteStringId) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetByteStringId.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetTransactionRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.GetTransactionRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.142
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.events.GetTransactionRequest invoke() {
                        return new com.unity3d.ads.core.domain.events.CommonGetTransactionRequest((com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.143
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest invoke() {
                        return new com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.144
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest invoke() {
                        return new com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest((com.unity3d.ads.core.domain.GetSharedDataTimestamps) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetSharedDataTimestamps.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetOperativeEventApi.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.GetOperativeEventApi>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.145
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.events.GetOperativeEventApi invoke() {
                        return new com.unity3d.ads.core.domain.events.GetOperativeEventApi((com.unity3d.ads.core.data.repository.OperativeEventRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.OperativeEventRepository.class))), (com.unity3d.ads.core.domain.events.GetOperativeEventRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetOperativeEventRequest.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetOperativeEventRequest.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.GetOperativeEventRequest>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.146
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.events.GetOperativeEventRequest invoke() {
                        return new com.unity3d.ads.core.domain.events.GetOperativeEventRequest((com.unity3d.ads.core.domain.GetByteStringId) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetByteStringId.class))), (com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.repository.CampaignRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CampaignRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.HandleGatewayEventResponse.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.HandleGatewayEventResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.147
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.events.HandleGatewayEventResponse invoke() {
                        return new com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.OperativeEventObserver.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.OperativeEventObserver>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.148
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.events.OperativeEventObserver invoke() {
                        return new com.unity3d.ads.core.domain.events.OperativeEventObserver((com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad.class))), (kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (com.unity3d.ads.core.data.repository.OperativeEventRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.OperativeEventRepository.class))), (com.unity3d.ads.core.data.datasource.UniversalRequestDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.UniversalRequestDataSource.class))), (com.unity3d.ads.core.domain.work.BackgroundWorker) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.work.BackgroundWorker.class))), (com.unity3d.ads.core.domain.events.UniversalRequestEventSender) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.UniversalRequestEventSender.class))), (com.unity3d.ads.core.domain.GetRequestPolicy) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_OPERATIVE_REQ, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.TransactionEventObserver.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.TransactionEventObserver>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.149
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.events.TransactionEventObserver invoke() {
                        return new com.unity3d.ads.core.domain.events.TransactionEventObserver((com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad.class))), (kotlinx.coroutines.CoroutineScope) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_TRANSACTION_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class))), (com.unity3d.ads.core.data.repository.TransactionEventRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.TransactionEventRepository.class))), (com.unity3d.ads.gatewayclient.GatewayClient) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.gatewayclient.GatewayClient.class))), (com.unity3d.ads.core.domain.GetRequestPolicy) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_OTHER_REQ, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class))), (com.unity3d.ads.core.data.datasource.ByteStringDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_IAP_TRANSACTION, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.ByteStringDataSource.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.150
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator invoke() {
                        return new com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.UniversalRequestEventSender.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.events.UniversalRequestEventSender>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.151
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.events.UniversalRequestEventSender invoke() {
                        return new com.unity3d.ads.core.domain.events.UniversalRequestEventSender((com.unity3d.ads.gatewayclient.GatewayClient) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.gatewayclient.GatewayClient.class))), (com.unity3d.ads.core.domain.events.HandleGatewayEventResponse) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.HandleGatewayEventResponse.class))), (com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.OmFinishSession.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.om.OmFinishSession>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.152
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.om.OmFinishSession invoke() {
                        return new com.unity3d.ads.core.domain.om.AndroidOmFinishSession((com.unity3d.ads.core.data.repository.OpenMeasurementRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.OpenMeasurementRepository.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.OmImpressionOccurred.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.om.OmImpressionOccurred>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.153
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.om.OmImpressionOccurred invoke() {
                        return new com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred((com.unity3d.ads.core.data.repository.OpenMeasurementRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.OpenMeasurementRepository.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.AndroidOmInteraction.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.om.AndroidOmInteraction>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.154
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.om.AndroidOmInteraction invoke() {
                        return new com.unity3d.ads.core.domain.om.AndroidOmStartSession((com.unity3d.ads.core.data.repository.OpenMeasurementRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.OpenMeasurementRepository.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.GetOmData.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.om.GetOmData>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.155
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.om.GetOmData invoke() {
                        return new com.unity3d.ads.core.domain.om.CommonGetOmData((com.unity3d.ads.core.data.repository.OpenMeasurementRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.OpenMeasurementRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.IsOMActivated.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.om.IsOMActivated>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.156
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.om.IsOMActivated invoke() {
                        return new com.unity3d.ads.core.domain.om.CommonIsOMActivated((com.unity3d.ads.core.data.repository.OpenMeasurementRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.OpenMeasurementRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.om.InitializeOMSDK.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.om.InitializeOMSDK>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.157
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.om.InitializeOMSDK invoke() {
                        return new com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.repository.OpenMeasurementRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.OpenMeasurementRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEV_CONSENT_PRIVACY_RULES, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.158
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase invoke() {
                        return new com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.LEGACY_PRIVACY_RULES, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.159
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase invoke() {
                        return new com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.work.BackgroundWorker.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.work.BackgroundWorker>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.160
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.work.BackgroundWorker invoke() {
                        return new com.unity3d.ads.core.domain.work.BackgroundWorker((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.161
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier invoke() {
                        return new com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.gatewayclient.GatewayClient.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.gatewayclient.GatewayClient>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.162
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.gatewayclient.GatewayClient invoke() {
                        return new com.unity3d.ads.gatewayclient.CommonGatewayClient((com.unity3d.ads.core.domain.HttpClientProvider) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HttpClientProvider.class))), (com.unity3d.ads.core.domain.HandleGatewayUniversalResponse) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HandleGatewayUniversalResponse.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("sdk", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineExceptionHandler.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineExceptionHandler>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.163
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final kotlinx.coroutines.CoroutineExceptionHandler invoke() {
                        return new com.unity3d.services.SDKErrorHandler((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.IO_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (com.unity3d.ads.core.configuration.AlternativeFlowReader) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.AlternativeFlowReader.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))), (com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.request.metrics.SDKMetricsSender.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.ads.token.TokenStorage.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.ads.token.TokenStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.164
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.ads.token.TokenStorage invoke() {
                        return new com.unity3d.services.ads.token.InMemoryTokenStorage();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.device.VolumeChange.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.device.VolumeChange>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.165
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.device.VolumeChange invoke() {
                        return new com.unity3d.services.core.device.VolumeChangeContentObserver();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.166
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage invoke() {
                        return new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage((com.unity3d.services.core.domain.ISDKDispatchers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeSDK.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.task.InitializeSDK>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.167
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.domain.task.InitializeSDK invoke() {
                        return new com.unity3d.services.core.domain.task.InitializeSDK((com.unity3d.services.core.domain.ISDKDispatchers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.class))), (com.unity3d.services.core.domain.task.InitializeStateReset) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateReset.class))), (com.unity3d.services.core.domain.task.InitializeStateError) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateError.class))), (com.unity3d.services.core.domain.task.InitializeStateConfig) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateConfig.class))), (com.unity3d.services.core.domain.task.InitializeStateCreate) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateCreate.class))), (com.unity3d.services.core.domain.task.InitializeStateLoadCache) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateLoadCache.class))), (com.unity3d.services.core.domain.task.InitializeStateLoadWeb) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateLoadWeb.class))), (com.unity3d.services.core.domain.task.InitializeStateComplete) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateComplete.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateComplete.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.task.InitializeStateComplete>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.168
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.domain.task.InitializeStateComplete invoke() {
                        return new com.unity3d.services.core.domain.task.InitializeStateComplete((androidx.datastore.core.DataStore) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DATA_STORE_NATIVE_CONFIG, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.datastore.core.DataStore.class))), (com.unity3d.services.core.domain.ISDKDispatchers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateConfig.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.task.InitializeStateConfig>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.169
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.domain.task.InitializeStateConfig invoke() {
                        return new com.unity3d.services.core.domain.task.InitializeStateConfig((com.unity3d.services.core.domain.ISDKDispatchers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.170
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader invoke() {
                        return new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader((com.unity3d.services.core.domain.ISDKDispatchers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (com.unity3d.services.core.domain.task.InitializeStateNetworkError) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateNetworkError.class))), (com.unity3d.services.ads.token.TokenStorage) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.ads.token.TokenStorage.class))), (com.unity3d.services.core.request.metrics.SDKMetricsSender) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.request.metrics.SDKMetricsSender.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateCreate.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.task.InitializeStateCreate>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.171
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.domain.task.InitializeStateCreate invoke() {
                        return new com.unity3d.services.core.domain.task.InitializeStateCreate((com.unity3d.services.core.domain.ISDKDispatchers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateError.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.task.InitializeStateError>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.172
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.domain.task.InitializeStateError invoke() {
                        return new com.unity3d.services.core.domain.task.InitializeStateError((com.unity3d.services.core.domain.ISDKDispatchers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateLoadCache.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.task.InitializeStateLoadCache>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.173
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.domain.task.InitializeStateLoadCache invoke() {
                        return new com.unity3d.services.core.domain.task.InitializeStateLoadCache((com.unity3d.services.core.domain.ISDKDispatchers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateLoadWeb.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.task.InitializeStateLoadWeb>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.174
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.domain.task.InitializeStateLoadWeb invoke() {
                        return new com.unity3d.services.core.domain.task.InitializeStateLoadWeb((com.unity3d.services.core.domain.ISDKDispatchers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (com.unity3d.services.core.domain.task.InitializeStateNetworkError) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateNetworkError.class))), (com.unity3d.ads.core.domain.HttpClientProvider) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HttpClientProvider.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateReset.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.task.InitializeStateReset>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.175
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.domain.task.InitializeStateReset invoke() {
                        return new com.unity3d.services.core.domain.task.InitializeStateReset((com.unity3d.services.core.domain.ISDKDispatchers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.store.StoreMonitor.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.store.StoreMonitor>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.176
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.store.StoreMonitor invoke() {
                        return new com.unity3d.services.store.StoreMonitor((com.unity3d.services.store.core.StoreExceptionHandler) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.store.core.StoreExceptionHandler.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.store.StoreWebViewEventSender.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.store.StoreWebViewEventSender>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.177
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.store.StoreWebViewEventSender invoke() {
                        return new com.unity3d.services.store.StoreWebViewEventSender((com.unity3d.services.core.webview.bridge.IEventSender) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.webview.bridge.IEventSender.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.store.core.StoreExceptionHandler.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.store.core.StoreExceptionHandler>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.178
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.store.core.StoreExceptionHandler invoke() {
                        return new com.unity3d.services.store.core.GatewayStoreExceptionHandler();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.store.core.StoreEventListenerFactory.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.store.core.StoreEventListenerFactory>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.179
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.store.core.StoreEventListenerFactory invoke() {
                        return new com.unity3d.services.store.core.StoreEventListenerFactory((com.unity3d.services.store.StoreWebViewEventSender) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.store.StoreWebViewEventSender.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.configuration.ConfigurationReader.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.configuration.ConfigurationReader>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.180
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.configuration.ConfigurationReader invoke() {
                        return new com.unity3d.services.core.configuration.ConfigurationReader();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.attribution.AndroidAttribution.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.attribution.AndroidAttribution>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.181
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.attribution.AndroidAttribution invoke() {
                        return new com.unity3d.ads.core.domain.attribution.AndroidAttribution((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (com.unity3d.services.core.domain.ISDKDispatchers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.adplayer.AdPlayerScope.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.AdPlayerScope>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.182
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.adplayer.AdPlayerScope invoke() {
                        return new com.unity3d.ads.adplayer.AdPlayerScope((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (kotlinx.coroutines.CoroutineExceptionHandler) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("sdk", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineExceptionHandler.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.adplayer.AndroidWebViewClient.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.adplayer.AndroidWebViewClient>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.183
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.adplayer.AndroidWebViewClient invoke() {
                        return new com.unity3d.ads.adplayer.AndroidWebViewClient((com.unity3d.ads.core.domain.GetCachedAsset) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetCachedAsset.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.184
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))), (com.unity3d.ads.adplayer.AndroidWebViewClient) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.adplayer.AndroidWebViewClient.class))), (com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics.class))), (kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.MAIN_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.Load.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.Load>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.185
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.Load invoke() {
                        return new com.unity3d.ads.core.domain.AndroidLoad((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (com.unity3d.ads.core.domain.GetAdRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAdRequest.class))), (com.unity3d.ads.core.domain.GetAdPlayerConfigRequest) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAdPlayerConfigRequest.class))), (com.unity3d.ads.core.domain.GetRequestPolicy) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_AD_REQ, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetRequestPolicy.class))), (com.unity3d.ads.core.domain.HandleGatewayAdResponse) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HandleGatewayAdResponse.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.gatewayclient.GatewayClient) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.gatewayclient.GatewayClient.class))), (com.unity3d.ads.core.data.repository.AdRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.AdRepository.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AwaitInitialization.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.AwaitInitialization>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.186
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.AwaitInitialization invoke() {
                        return new com.unity3d.ads.core.domain.CommonAwaitInitialization((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.187
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken invoke() {
                        return new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken((com.unity3d.ads.core.domain.GetHeaderBiddingToken) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetHeaderBiddingToken.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))), (com.unity3d.ads.core.domain.GetInitializationState) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationState.class))), (com.unity3d.ads.core.domain.AwaitInitialization) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AwaitInitialization.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.domain.SafeCallbackInvoke) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SafeCallbackInvoke.class))), (com.unity3d.ads.core.log.Logger) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.log.Logger.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAdPlayer.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetAdPlayer>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.188
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetAdPlayer invoke() {
                        return new com.unity3d.ads.core.domain.CommonGetAdPlayer((com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))), (kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), (kotlinx.coroutines.CoroutineScope) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.adplayer.AdPlayerScope.class))), (com.unity3d.ads.core.data.repository.OpenMeasurementRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.OpenMeasurementRepository.class))), (com.unity3d.ads.core.data.manager.ScarManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.ScarManager.class))), (com.unity3d.ads.core.data.manager.OfferwallManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.OfferwallManager.class))), (com.unity3d.ads.core.data.repository.AdRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.AdRepository.class))), (com.unity3d.ads.core.data.datasource.LifecycleDataSource) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.LifecycleDataSource.class))), (com.unity3d.ads.core.data.repository.OrientationRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.OrientationRepository.class))), (android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CacheWebViewAssets.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.CacheWebViewAssets>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.189
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.CacheWebViewAssets invoke() {
                        return new com.unity3d.ads.core.domain.AndroidCacheWebViewAssets((com.unity3d.ads.core.data.repository.CacheRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CacheRepository.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HandleGatewayAdResponse.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.HandleGatewayAdResponse>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.190
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.HandleGatewayAdResponse invoke() {
                        return new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse((com.unity3d.ads.core.data.repository.AdRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.AdRepository.class))), (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.class))), (com.unity3d.ads.core.domain.GetWebViewBridgeUseCase) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetWebViewBridgeUseCase.class))), (com.unity3d.ads.core.data.repository.DeviceInfoRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.DeviceInfoRepository.class))), (com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.class))), (com.unity3d.ads.core.data.repository.CampaignRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.CampaignRepository.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))), (com.unity3d.ads.core.domain.events.GetOperativeEventApi) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.events.GetOperativeEventApi.class))), (com.unity3d.ads.core.domain.GetLatestWebViewConfiguration) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.class))), (com.unity3d.ads.adplayer.AdPlayerScope) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.adplayer.AdPlayerScope.class))), (com.unity3d.ads.core.domain.GetAdPlayer) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetAdPlayer.class))), (com.unity3d.ads.core.domain.CacheWebViewAssets) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CacheWebViewAssets.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.191
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer invoke() {
                        return new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.LegacyLoadUseCase.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.LegacyLoadUseCase>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.192
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.LegacyLoadUseCase invoke() {
                        return new com.unity3d.ads.core.domain.LegacyLoadUseCase((com.unity3d.ads.core.domain.Load) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.Load.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))), (com.unity3d.ads.core.domain.GetInitializationState) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationState.class))), (com.unity3d.ads.core.domain.AwaitInitialization) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AwaitInitialization.class))), (com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.repository.AdRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.AdRepository.class))), (com.unity3d.ads.core.domain.SafeCallbackInvoke) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SafeCallbackInvoke.class))), (com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.class))), (com.unity3d.ads.core.log.Logger) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.log.Logger.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SafeCallbackInvoke.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.SafeCallbackInvoke>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.193
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.SafeCallbackInvoke invoke() {
                        return new com.unity3d.ads.core.domain.CommonSafeCallbackInvoke((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.MAIN_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.task.InitializeStateNetworkError.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.services.core.domain.task.InitializeStateNetworkError>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.194
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.domain.task.InitializeStateNetworkError invoke() {
                        return new com.unity3d.services.core.domain.task.InitializeStateNetworkError((com.unity3d.services.core.domain.ISDKDispatchers) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.domain.ISDKDispatchers.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.utils.CoroutineTimer.class)), com.unity3d.services.core.di.ServiceFactoryKt.factoryOf(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.utils.CoroutineTimer>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.195
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.utils.CoroutineTimer invoke() {
                        return new com.unity3d.ads.core.utils.CommonCoroutineTimer((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.webview.bridge.IEventSender.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.webview.bridge.IEventSender>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.196
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.webview.bridge.IEventSender invoke() {
                        return com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewEventSender();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SetGameId.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.SetGameId>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.197
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.SetGameId invoke() {
                        return new com.unity3d.ads.core.domain.CommonSetGameId((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetGameId.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetGameId>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.198
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetGameId invoke() {
                        return new com.unity3d.ads.core.domain.CommonGetGameId((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.ValidateGameId.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.ValidateGameId>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.199
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.ValidateGameId invoke() {
                        return new com.unity3d.ads.core.domain.CommonValidateGameId((com.unity3d.ads.core.domain.GetGameId) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetGameId.class))), (com.unity3d.ads.core.domain.SetGameId) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SetGameId.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.ShouldAllowInitialization.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.ShouldAllowInitialization>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.200
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.ShouldAllowInitialization invoke() {
                        return new com.unity3d.ads.core.domain.CommonShouldAllowInitialization((com.unity3d.ads.core.configuration.AlternativeFlowReader) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.configuration.AlternativeFlowReader.class))), (com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges.class))), (com.unity3d.ads.core.domain.GetInitializationState) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetInitializationState.class))), (com.unity3d.ads.core.domain.SetInitializationState) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SetInitializationState.class))), (com.unity3d.ads.core.domain.ValidateGameId) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.ValidateGameId.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.201
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges invoke() {
                        return new com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges((com.unity3d.ads.core.domain.GetGameId) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetGameId.class))), (com.unity3d.ads.core.domain.SendDiagnosticEvent) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.SendDiagnosticEvent.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.work.DownloadPriorityQueue.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.work.DownloadPriorityQueue>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.202
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.work.DownloadPriorityQueue invoke() {
                        return new com.unity3d.ads.core.domain.work.DownloadPriorityQueue();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.core.network.domain.CleanupDirectory.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.core.network.domain.CleanupDirectory>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.203
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.core.network.domain.CleanupDirectory invoke() {
                        return new com.unity3d.services.core.network.domain.CleanupDirectory();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.FocusRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.FocusRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.204
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.FocusRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.FocusRepository((com.unity3d.ads.core.domain.AndroidGetLifecycleFlow) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.class))), (kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidGetIsAdActivity.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.AndroidGetIsAdActivity>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.205
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.AndroidGetIsAdActivity invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetIsAdActivity((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.AndroidGetLifecycleFlow>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.206
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.AndroidGetLifecycleFlow invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetLifecycleFlow((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidHandleFocusCounters.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.AndroidHandleFocusCounters>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.207
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.AndroidHandleFocusCounters invoke() {
                        return new com.unity3d.ads.core.domain.AndroidHandleFocusCounters((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.data.repository.FocusRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.FocusRepository.class))), (com.unity3d.ads.core.domain.AndroidGetIsAdActivity) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidGetIsAdActivity.class))), (kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))), null, 16, null);
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.services.ads.offerwall.OfferwallAdapterBridge>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.208
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.services.ads.offerwall.OfferwallAdapterBridge invoke() {
                        return new com.unity3d.services.ads.offerwall.OfferwallAdapterBridge((kotlinx.coroutines.CoroutineScope) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.NAMED_OFFERWALL_SCOPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineScope.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.OfferwallManager.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.manager.OfferwallManager>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.209
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.manager.OfferwallManager invoke() {
                        return new com.unity3d.ads.core.data.manager.AndroidOfferwallManager((com.unity3d.services.ads.offerwall.OfferwallAdapterBridge) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.ads.offerwall.OfferwallAdapterBridge.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.210
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd invoke() {
                        return new com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd((com.unity3d.ads.core.data.manager.OfferwallManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.OfferwallManager.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.211
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady invoke() {
                        return new com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady((com.unity3d.ads.core.data.manager.OfferwallManager) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.manager.OfferwallManager.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.FIdDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.FIdDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.212
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.FIdDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidFIdDataSource((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.FIdExistenceDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.FIdExistenceDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.213
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.FIdExistenceDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource(com.unity3d.services.core.fid.Constants.FID_CLASS);
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.214
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires invoke() {
                        return new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires((kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.OrientationRepository.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.repository.OrientationRepository>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.215
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.repository.OrientationRepository invoke() {
                        return new com.unity3d.ads.core.data.repository.OrientationRepository((com.unity3d.ads.core.domain.AndroidGetLifecycleFlow) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.class))), (kotlinx.coroutines.CoroutineDispatcher) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey(com.unity3d.services.core.di.ServiceProvider.DEFAULT_DISPATCHER, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.CoroutineDispatcher.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.216
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.217
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.HandleDebugSettings.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.HandleDebugSettings>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.218
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.HandleDebugSettings invoke() {
                        return new com.unity3d.ads.core.domain.HandleDebugSettings((com.unity3d.ads.core.log.Logger) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.log.Logger.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.log.Logger.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.log.Logger>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.219
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.log.Logger invoke() {
                        return new com.unity3d.ads.core.log.UnityLogger((com.unity3d.ads.core.data.repository.SessionRepository) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.repository.SessionRepository.class))), (com.unity3d.ads.core.domain.CreateFile) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.CreateFile.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.billing.IsBillingClientAvailable.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.billing.IsBillingClientAvailable>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.220
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.billing.IsBillingClientAvailable invoke() {
                        return new com.unity3d.ads.core.domain.billing.IsBillingClientAvailable();
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.221
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource invoke() {
                        return new com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource((android.content.Context) com.unity3d.services.core.di.ServicesRegistry.this.resolveService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.content.Context.class))));
                    }
                }));
                registry.updateService(new com.unity3d.services.core.di.ServiceKey("", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy.class)), kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy>() { // from class: com.unity3d.services.core.di.ServiceProvider$initialize$1.222
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy invoke() {
                        return new com.unity3d.ads.core.domain.AndroidGetSafeguardedInitializationPolicy();
                    }
                }));
            }
        });
    }
}
