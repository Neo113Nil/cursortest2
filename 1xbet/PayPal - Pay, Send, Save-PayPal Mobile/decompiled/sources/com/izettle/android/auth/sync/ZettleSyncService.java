package com.izettle.android.auth.sync;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00108CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00158CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b!\u0010\""}, d2 = {"Lcom/izettle/android/auth/sync/ZettleSyncService;", "Landroid/app/job/JobService;", "<init>", "()V", "Landroid/app/job/JobParameters;", "params", "", "onStartJob", "(Landroid/app/job/JobParameters;)Z", "onStopJob", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "baseUriRepository$delegate", "Lcom/izettle/android/auth/NullableServiceLocatorDelegate;", "getBaseUriRepository", "()Lcom/izettle/android/auth/repository/BaseUriRepository;", "baseUriRepository", "Lcom/izettle/android/auth/executor/Executor;", "executor$delegate", "getExecutor", "()Lcom/izettle/android/auth/executor/Executor;", "executor", "Lcom/izettle/android/auth/log/LogFileManager;", "logFileManager$delegate", "getLogFileManager", "()Lcom/izettle/android/auth/log/LogFileManager;", "logFileManager", "Lcom/izettle/android/auth/repository/ServiceUriRepository;", "serviceUriRepository$delegate", "getServiceUriRepository", "()Lcom/izettle/android/auth/repository/ServiceUriRepository;", "serviceUriRepository", "Lcom/izettle/android/auth/repository/UserConfigRepository;", "userConfigRepository$delegate", "getUserConfigRepository", "()Lcom/izettle/android/auth/repository/UserConfigRepository;", "userConfigRepository"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ZettleSyncService extends android.app.job.JobService {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.izettle.android.auth.sync.ZettleSyncService.class, "userConfigRepository", "getUserConfigRepository()Lcom/izettle/android/auth/repository/UserConfigRepository;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.izettle.android.auth.sync.ZettleSyncService.class, "logFileManager", "getLogFileManager()Lcom/izettle/android/auth/log/LogFileManager;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.izettle.android.auth.sync.ZettleSyncService.class, "executor", "getExecutor()Lcom/izettle/android/auth/executor/Executor;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.izettle.android.auth.sync.ZettleSyncService.class, "baseUriRepository", "getBaseUriRepository()Lcom/izettle/android/auth/repository/BaseUriRepository;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.izettle.android.auth.sync.ZettleSyncService.class, "serviceUriRepository", "getServiceUriRepository()Lcom/izettle/android/auth/repository/ServiceUriRepository;", 0))};

    /* renamed from: userConfigRepository$delegate, reason: from kotlin metadata */
    private final com.izettle.android.auth.NullableServiceLocatorDelegate userConfigRepository = new com.izettle.android.auth.NullableServiceLocatorDelegate(com.izettle.android.auth.repository.UserConfigRepository.class);

    /* renamed from: logFileManager$delegate, reason: from kotlin metadata */
    private final com.izettle.android.auth.NullableServiceLocatorDelegate logFileManager = new com.izettle.android.auth.NullableServiceLocatorDelegate(com.izettle.android.auth.log.LogFileManager.class);

    /* renamed from: executor$delegate, reason: from kotlin metadata */
    private final com.izettle.android.auth.NullableServiceLocatorDelegate executor = new com.izettle.android.auth.NullableServiceLocatorDelegate(com.izettle.android.auth.executor.Executor.class);

    /* renamed from: baseUriRepository$delegate, reason: from kotlin metadata */
    private final com.izettle.android.auth.NullableServiceLocatorDelegate baseUriRepository = new com.izettle.android.auth.NullableServiceLocatorDelegate(com.izettle.android.auth.repository.BaseUriRepository.class);

    /* renamed from: serviceUriRepository$delegate, reason: from kotlin metadata */
    private final com.izettle.android.auth.NullableServiceLocatorDelegate serviceUriRepository = new com.izettle.android.auth.NullableServiceLocatorDelegate(com.izettle.android.auth.repository.ServiceUriRepository.class);

    @Override // android.app.job.JobService
    public final boolean onStopJob(android.app.job.JobParameters params) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.izettle.android.auth.repository.UserConfigRepository getUserConfigRepository() {
        return (com.izettle.android.auth.repository.UserConfigRepository) this.userConfigRepository.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.izettle.android.auth.log.LogFileManager getLogFileManager() {
        return (com.izettle.android.auth.log.LogFileManager) this.logFileManager.getValue(this, $$delegatedProperties[1]);
    }

    private final com.izettle.android.auth.executor.Executor getExecutor() {
        return (com.izettle.android.auth.executor.Executor) this.executor.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.izettle.android.auth.repository.BaseUriRepository getBaseUriRepository() {
        return (com.izettle.android.auth.repository.BaseUriRepository) this.baseUriRepository.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.izettle.android.auth.repository.ServiceUriRepository getServiceUriRepository() {
        return (com.izettle.android.auth.repository.ServiceUriRepository) this.serviceUriRepository.getValue(this, $$delegatedProperties[4]);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final android.app.job.JobParameters params) {
        com.izettle.android.auth.executor.Executor executor = getExecutor();
        if (executor == null) {
            return true;
        }
        executor.execute(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.izettle.android.auth.sync.ZettleSyncService$onStartJob$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighResolutionOutputSizeshNQ4ISI();
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI() {
                com.izettle.android.auth.repository.BaseUriRepository baseUriRepository;
                com.izettle.android.auth.repository.ServiceUriRepository serviceUriRepository;
                com.izettle.android.auth.repository.UserConfigRepository userConfigRepository;
                com.izettle.android.auth.log.LogFileManager logFileManager;
                baseUriRepository = com.izettle.android.auth.sync.ZettleSyncService.this.getBaseUriRepository();
                if (baseUriRepository != null) {
                    baseUriRepository.getBaseUrls(true);
                }
                serviceUriRepository = com.izettle.android.auth.sync.ZettleSyncService.this.getServiceUriRepository();
                if (serviceUriRepository != null) {
                    serviceUriRepository.getServiceUrls(true);
                }
                userConfigRepository = com.izettle.android.auth.sync.ZettleSyncService.this.getUserConfigRepository();
                if (userConfigRepository != null) {
                    userConfigRepository.getUserConfig(new com.izettle.android.auth.repository.SyncAndCacheResult(false));
                }
                logFileManager = com.izettle.android.auth.sync.ZettleSyncService.this.getLogFileManager();
                if (logFileManager != null) {
                    com.izettle.android.auth.log.LogFileManager.syncLogFile$default(logFileManager, null, false, 3, null);
                }
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.izettle.android.auth.sync.ZettleSyncService$onStartJob$2
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighResolutionOutputSizeshNQ4ISI();
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI() {
                com.izettle.android.auth.sync.ZettleSyncService.this.jobFinished(params, true);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.izettle.android.auth.sync.ZettleSyncService$onStartJob$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                getHighSpeedVideoSizes(th);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                com.izettle.android.auth.sync.ZettleSyncService.this.jobFinished(params, true);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        return true;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
