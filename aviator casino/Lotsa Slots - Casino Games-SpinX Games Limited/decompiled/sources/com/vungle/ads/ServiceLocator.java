package com.vungle.ads;

/* compiled from: ServiceLocator.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u000f\u001a\u0002H\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\fH\u0002J!\u0010\u0013\u001a\u0002H\r\"\u0004\b\u0000\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u0007H\u0002¢\u0006\u0002\u0010\u0014J\u001f\u0010\u0015\u001a\u0002H\r\"\u0004\b\u0000\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u0007¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00072\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002J\u001a\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0000\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u0007R \u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\f\u0012\n\u0012\u0002\b\u00030\tR\u00020\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/vungle/ads/ServiceLocator;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cache", "", "Ljava/lang/Class;", "creators", "Lcom/vungle/ads/ServiceLocator$Creator;", "ctx", "bindService", "", "T", "serviceClass", androidx.core.app.NotificationCompat.CATEGORY_SERVICE, "bindService$vungle_ads_release", "(Ljava/lang/Class;Ljava/lang/Object;)V", "buildCreators", "getOrBuild", "(Ljava/lang/Class;)Ljava/lang/Object;", "getService", "getServiceClass", "isCreated", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Creator", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ServiceLocator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.ServiceLocator.Companion INSTANCE = new com.vungle.ads.ServiceLocator.Companion(null);
    private static volatile com.vungle.ads.ServiceLocator INSTANCE;
    private final java.util.Map<java.lang.Class<?>, java.lang.Object> cache;
    private final java.util.Map<java.lang.Class<?>, com.vungle.ads.ServiceLocator.Creator<?>> creators;
    private final android.content.Context ctx;

    public /* synthetic */ ServiceLocator(android.content.Context context, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private ServiceLocator(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.ctx = applicationContext;
        this.creators = new java.util.HashMap();
        this.cache = new java.util.HashMap();
        buildCreators();
    }

    public final synchronized <T> T getService(java.lang.Class<T> serviceClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        return (T) getOrBuild(serviceClass);
    }

    public final synchronized <T> boolean isCreated(java.lang.Class<T> serviceClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        return this.cache.containsKey(getServiceClass(serviceClass));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T getOrBuild(java.lang.Class<T> serviceClass) {
        java.lang.Class<?> serviceClass2 = getServiceClass(serviceClass);
        T t = (T) this.cache.get(serviceClass2);
        if (t != null) {
            return t;
        }
        com.vungle.ads.ServiceLocator.Creator<?> creator = this.creators.get(serviceClass2);
        if (creator == null) {
            throw new java.lang.IllegalArgumentException("Unknown class");
        }
        T t2 = (T) creator.create();
        if (creator.getIsSingleton()) {
            this.cache.put(serviceClass2, t2);
        }
        return t2;
    }

    public final <T> void bindService$vungle_ads_release(java.lang.Class<?> serviceClass, T service) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
        this.cache.put(serviceClass, service);
    }

    private final java.lang.Class<?> getServiceClass(java.lang.Class<?> serviceClass) {
        for (java.lang.Class<?> cls : this.creators.keySet()) {
            if (cls.isAssignableFrom(serviceClass)) {
                return cls;
            }
        }
        throw new java.lang.IllegalArgumentException("Unknown dependency for " + serviceClass);
    }

    private final void buildCreators() {
        this.creators.put(com.vungle.ads.internal.task.JobCreator.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.task.JobCreator>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$1
            {
                super(com.vungle.ads.ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.task.JobCreator create() {
                android.content.Context context;
                java.lang.Object orBuild;
                context = com.vungle.ads.ServiceLocator.this.ctx;
                orBuild = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.PathProvider.class);
                return new com.vungle.ads.internal.task.VungleJobCreator(context, (com.vungle.ads.internal.util.PathProvider) orBuild);
            }
        });
        this.creators.put(com.vungle.ads.internal.task.JobRunner.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.task.JobRunner>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$2
            {
                super(com.vungle.ads.ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.task.JobRunner create() {
                java.lang.Object orBuild;
                java.lang.Object orBuild2;
                orBuild = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.task.JobCreator.class);
                orBuild2 = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.Executors.class);
                return new com.vungle.ads.internal.task.VungleJobRunner((com.vungle.ads.internal.task.JobCreator) orBuild, ((com.vungle.ads.internal.executor.Executors) orBuild2).getJOB_EXECUTOR(), new com.vungle.ads.internal.task.JobRunnerThreadPriorityHelper());
            }
        });
        this.creators.put(com.vungle.ads.internal.network.VungleApiClient.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.network.VungleApiClient>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$3
            {
                super(com.vungle.ads.ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.network.VungleApiClient create() {
                android.content.Context context;
                java.lang.Object orBuild;
                java.lang.Object orBuild2;
                context = com.vungle.ads.ServiceLocator.this.ctx;
                orBuild = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.platform.Platform.class);
                orBuild2 = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.persistence.FilePreferences.class);
                return new com.vungle.ads.internal.network.VungleApiClient(context, (com.vungle.ads.internal.platform.Platform) orBuild, (com.vungle.ads.internal.persistence.FilePreferences) orBuild2);
            }
        });
        this.creators.put(com.vungle.ads.internal.platform.Platform.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.platform.Platform>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$4
            {
                super(com.vungle.ads.ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.platform.Platform create() {
                java.lang.Object orBuild;
                android.content.Context context;
                orBuild = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.Executors.class);
                context = com.vungle.ads.ServiceLocator.this.ctx;
                return new com.vungle.ads.internal.platform.AndroidPlatform(context, ((com.vungle.ads.internal.executor.Executors) orBuild).getUA_EXECUTOR(), null, null, 12, null);
            }
        });
        this.creators.put(com.vungle.ads.internal.executor.Executors.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.executor.Executors>(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$5
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.executor.Executors create() {
                return new com.vungle.ads.internal.executor.SDKExecutors();
            }
        });
        this.creators.put(com.vungle.ads.internal.omsdk.OMInjector.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.omsdk.OMInjector>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$6
            {
                super(com.vungle.ads.ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.omsdk.OMInjector create() {
                android.content.Context context;
                context = com.vungle.ads.ServiceLocator.this.ctx;
                return new com.vungle.ads.internal.omsdk.OMInjector(context);
            }
        });
        this.creators.put(com.vungle.ads.internal.omsdk.OMTracker.Factory.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.omsdk.OMTracker.Factory>(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$7
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.omsdk.OMTracker.Factory create() {
                return new com.vungle.ads.internal.omsdk.OMTracker.Factory();
            }
        });
        this.creators.put(com.vungle.ads.internal.persistence.FilePreferences.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.persistence.FilePreferences>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$8
            {
                super(com.vungle.ads.ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.persistence.FilePreferences create() {
                java.lang.Object orBuild;
                java.lang.Object orBuild2;
                com.vungle.ads.internal.persistence.FilePreferences.Companion companion = com.vungle.ads.internal.persistence.FilePreferences.INSTANCE;
                orBuild = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.Executors.class);
                com.vungle.ads.internal.executor.VungleThreadPoolExecutor io_executor = ((com.vungle.ads.internal.executor.Executors) orBuild).getIO_EXECUTOR();
                orBuild2 = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.PathProvider.class);
                return com.vungle.ads.internal.persistence.FilePreferences.Companion.get$default(companion, io_executor, (com.vungle.ads.internal.util.PathProvider) orBuild2, null, 4, null);
            }
        });
        this.creators.put(com.vungle.ads.internal.locale.LocaleInfo.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.locale.LocaleInfo>(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$9
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.locale.LocaleInfo create() {
                return new com.vungle.ads.internal.locale.SystemLocaleInfo();
            }
        });
        this.creators.put(com.vungle.ads.internal.bidding.BidTokenEncoder.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.bidding.BidTokenEncoder>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$10
            {
                super(com.vungle.ads.ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.bidding.BidTokenEncoder create() {
                android.content.Context context;
                context = com.vungle.ads.ServiceLocator.this.ctx;
                return new com.vungle.ads.internal.bidding.BidTokenEncoder(context);
            }
        });
        this.creators.put(com.vungle.ads.internal.util.PathProvider.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.util.PathProvider>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$11
            {
                super(com.vungle.ads.ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.util.PathProvider create() {
                android.content.Context context;
                context = com.vungle.ads.ServiceLocator.this.ctx;
                return new com.vungle.ads.internal.util.PathProvider(context);
            }
        });
        this.creators.put(com.vungle.ads.internal.downloader.Downloader.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.downloader.Downloader>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$12
            {
                super(false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.downloader.Downloader create() {
                java.lang.Object orBuild;
                java.lang.Object orBuild2;
                orBuild = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.Executors.class);
                com.vungle.ads.internal.executor.VungleThreadPoolExecutor downloader_executor = ((com.vungle.ads.internal.executor.Executors) orBuild).getDOWNLOADER_EXECUTOR();
                orBuild2 = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.PathProvider.class);
                return new com.vungle.ads.internal.downloader.AssetDownloader(downloader_executor, (com.vungle.ads.internal.util.PathProvider) orBuild2);
            }
        });
        this.creators.put(com.vungle.ads.internal.util.ConcurrencyTimeoutProvider.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.util.ConcurrencyTimeoutProvider>(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$13
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.util.ConcurrencyTimeoutProvider create() {
                return new com.vungle.ads.internal.util.ConcurrencyTimeoutProvider();
            }
        });
        this.creators.put(com.vungle.ads.internal.signals.SignalManager.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.signals.SignalManager>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$14
            {
                super(com.vungle.ads.ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.signals.SignalManager create() {
                android.content.Context context;
                context = com.vungle.ads.ServiceLocator.this.ctx;
                return new com.vungle.ads.internal.signals.SignalManager(context);
            }
        });
        this.creators.put(com.vungle.ads.internal.network.TpatSender.class, new com.vungle.ads.ServiceLocator.Creator<com.vungle.ads.internal.network.TpatSender>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$15
            {
                super(com.vungle.ads.ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public com.vungle.ads.internal.network.TpatSender create() {
                java.lang.Object orBuild;
                java.lang.Object orBuild2;
                java.lang.Object orBuild3;
                java.lang.Object orBuild4;
                java.lang.Object orBuild5;
                orBuild = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.network.VungleApiClient.class);
                com.vungle.ads.internal.network.VungleApiClient vungleApiClient = (com.vungle.ads.internal.network.VungleApiClient) orBuild;
                orBuild2 = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.Executors.class);
                com.vungle.ads.internal.executor.VungleThreadPoolExecutor io_executor = ((com.vungle.ads.internal.executor.Executors) orBuild2).getIO_EXECUTOR();
                orBuild3 = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.executor.Executors.class);
                com.vungle.ads.internal.executor.VungleThreadPoolExecutor job_executor = ((com.vungle.ads.internal.executor.Executors) orBuild3).getJOB_EXECUTOR();
                orBuild4 = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.util.PathProvider.class);
                com.vungle.ads.internal.util.PathProvider pathProvider = (com.vungle.ads.internal.util.PathProvider) orBuild4;
                orBuild5 = com.vungle.ads.ServiceLocator.this.getOrBuild(com.vungle.ads.internal.signals.SignalManager.class);
                return new com.vungle.ads.internal.network.TpatSender(vungleApiClient, io_executor, job_executor, pathProvider, (com.vungle.ads.internal.signals.SignalManager) orBuild5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ServiceLocator.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b¢\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/vungle/ads/ServiceLocator$Creator;", "T", "", "isSingleton", "", "(Lcom/vungle/ads/ServiceLocator;Z)V", "()Z", "create", "()Ljava/lang/Object;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    abstract class Creator<T> {
        private final boolean isSingleton;

        public abstract T create();

        public Creator(boolean z) {
            this.isSingleton = z;
        }

        public /* synthetic */ Creator(com.vungle.ads.ServiceLocator serviceLocator, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        /* renamed from: isSingleton, reason: from getter */
        public final boolean getIsSingleton() {
            return this.isSingleton;
        }
    }

    /* compiled from: ServiceLocator.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0010\"\n\b\u0000\u0010\u0011\u0018\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0086\bR&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/ServiceLocator$Companion;", "", "()V", "INSTANCE", "Lcom/vungle/ads/ServiceLocator;", "getINSTANCE$vungle_ads_release$annotations", "getINSTANCE$vungle_ads_release", "()Lcom/vungle/ads/ServiceLocator;", "setINSTANCE$vungle_ads_release", "(Lcom/vungle/ads/ServiceLocator;)V", "deInit", "", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "context", "Landroid/content/Context;", "inject", "Lkotlin/Lazy;", "T", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getINSTANCE$vungle_ads_release$annotations() {
        }

        private Companion() {
        }

        public final com.vungle.ads.ServiceLocator getINSTANCE$vungle_ads_release() {
            return com.vungle.ads.ServiceLocator.INSTANCE;
        }

        public final void setINSTANCE$vungle_ads_release(com.vungle.ads.ServiceLocator serviceLocator) {
            com.vungle.ads.ServiceLocator.INSTANCE = serviceLocator;
        }

        public final com.vungle.ads.ServiceLocator getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.vungle.ads.ServiceLocator iNSTANCE$vungle_ads_release = getINSTANCE$vungle_ads_release();
            if (iNSTANCE$vungle_ads_release == null) {
                synchronized (this) {
                    iNSTANCE$vungle_ads_release = com.vungle.ads.ServiceLocator.INSTANCE.getINSTANCE$vungle_ads_release();
                    if (iNSTANCE$vungle_ads_release == null) {
                        iNSTANCE$vungle_ads_release = new com.vungle.ads.ServiceLocator(context, null);
                        com.vungle.ads.ServiceLocator.INSTANCE.setINSTANCE$vungle_ads_release(iNSTANCE$vungle_ads_release);
                    }
                }
            }
            return iNSTANCE$vungle_ads_release;
        }

        public final /* synthetic */ <T> kotlin.Lazy<T> inject(final android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.LazyThreadSafetyMode lazyThreadSafetyMode = kotlin.LazyThreadSafetyMode.SYNCHRONIZED;
            kotlin.jvm.internal.Intrinsics.needClassReification();
            return kotlin.LazyKt.lazy(lazyThreadSafetyMode, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<T>() { // from class: com.vungle.ads.ServiceLocator$Companion$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final T invoke() {
                    com.vungle.ads.ServiceLocator companion = com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context);
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                    return (T) companion.getService(java.lang.Object.class);
                }
            });
        }

        public final synchronized void deInit() {
            setINSTANCE$vungle_ads_release(null);
        }
    }
}
