package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\b\u0012\u00060\u001fj\u0002` 0\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020#0\u001eH\u0016¢\u0006\u0004\b$\u0010\"J%\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020#0\u001e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b)\u0010*J#\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020#0\u001e2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010/J#\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020#0\u001e2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b0\u0010/J'\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020#0\u001e2\n\b\u0002\u00101\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b2\u0010(J\u0011\u00103\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b3\u0010*J\u001b\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020#0\u001eH\u0002¢\u0006\u0004\b4\u0010\"J%\u00107\u001a\u00020\u00172\u0014\u00106\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\u001705H\u0016¢\u0006\u0004\b7\u00108J+\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020#0\u001e2\u0006\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020%H\u0002¢\u0006\u0004\b;\u0010<J#\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020#0\u001e2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J%\u0010A\u001a\u00020\u00172\u0014\u00106\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\u001705H\u0016¢\u0006\u0004\bA\u00108J\u0013\u0010$\u001a\u00020\u0017*\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010\u0019J\u001f\u0010B\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020#0\u001e*\u00020%H\u0002¢\u0006\u0004\bB\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010CR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010DR(\u0010F\u001a\u0004\u0018\u00010\u001a2\b\u0010E\u001a\u0004\u0018\u00010\u001a8\u0002@CX\u0082\u000e¢\u0006\f\n\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010JR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010KR\u001a\u0010L\u001a\u00020%8\u0017X\u0097D¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000e\u0010S\u0012\u0004\bT\u0010UR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010VR(\u0010X\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\u0017050W8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bX\u0010Y"}, d2 = {"Lcom/izettle/android/auth/repository/UserConfigRepositoryImpl;", "Lcom/izettle/android/auth/repository/UserConfigRepository;", "Lcom/izettle/android/auth/log/Loggable;", "Landroid/content/Context;", "context", "Lcom/izettle/android/auth/log/Logger;", "logger", "Lcom/izettle/android/auth/executor/Executor;", "executor", "Lcom/izettle/android/auth/services/ApiService;", "apiService", "Lcom/izettle/android/auth/storage/AuthStorage;", "authStorage", "Landroid/content/SharedPreferences;", "preferences", "Lcom/izettle/android/auth/model/mapper/UserConfigMapper;", "userConfigMapper", "Lcom/izettle/android/serialization/JsonDeserializer;", "jsonDeserializer", "<init>", "(Landroid/content/Context;Lcom/izettle/android/auth/log/Logger;Lcom/izettle/android/auth/executor/Executor;Lcom/izettle/android/auth/services/ApiService;Lcom/izettle/android/auth/storage/AuthStorage;Landroid/content/SharedPreferences;Lcom/izettle/android/auth/model/mapper/UserConfigMapper;Lcom/izettle/android/serialization/JsonDeserializer;)V", "Lcom/izettle/android/auth/storage/Transaction;", "transaction", "", "applyDeleteToTransaction", "(Lcom/izettle/android/auth/storage/Transaction;)V", "Lcom/izettle/android/auth/model/UserConfigWithRawData;", "userConfigWithRawData", "applyStoreCanonicalUserConfigToTransaction", "(Lcom/izettle/android/auth/storage/Transaction;Lcom/izettle/android/auth/model/UserConfigWithRawData;)V", "Lcom/izettle/android/core/data/result/Result;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "cacheOnly", "()Lcom/izettle/android/core/data/result/Result;", "", "deleteUserConfig", "", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.ACCESS_TOKEN, "fetchNew", "(Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "fromCache", "()Lcom/izettle/android/auth/model/UserConfigWithRawData;", "Lcom/izettle/android/auth/repository/GetStrategy;", "strategy", "Lcom/zettle/android/entities/UserConfig;", "getUserConfig", "(Lcom/izettle/android/auth/repository/GetStrategy;)Lcom/izettle/android/core/data/result/Result;", "getUserConfigWithRawData", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "loadFromService", "loadFromStorage", "pathOfLeastResistance", "Lkotlin/Function1;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerUserConfigUpdateListener", "(Lkotlin/jvm/functions/Function1;)V", "userUuid", "userConfigJson", "saveUserConfig", "(Ljava/lang/String;Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "", "force", "syncAndStoreOnDisk", "(Z)Lcom/izettle/android/core/data/result/Result;", "unregisterUserConfigUpdateListener", "deserializeToUserConfig", "Lcom/izettle/android/auth/services/ApiService;", "Lcom/izettle/android/auth/storage/AuthStorage;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.datadog.trace.api.DDSpanTypes.CACHE, "Lcom/izettle/android/auth/model/UserConfigWithRawData;", "setCache", "(Lcom/izettle/android/auth/model/UserConfigWithRawData;)V", "Lcom/izettle/android/auth/executor/Executor;", "Lcom/izettle/android/serialization/JsonDeserializer;", "logTag", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "Lcom/izettle/android/auth/log/Logger;", "getLogger", "()Lcom/izettle/android/auth/log/Logger;", "Landroid/content/SharedPreferences;", "getPreferences$annotations", "()V", "Lcom/izettle/android/auth/model/mapper/UserConfigMapper;", "", "userConfigUpdateListeners", "Ljava/util/List;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserConfigRepositoryImpl implements com.izettle.android.auth.repository.UserConfigRepository, com.izettle.android.auth.log.Loggable {
    private final com.izettle.android.auth.services.ApiService apiService;
    private final com.izettle.android.auth.storage.AuthStorage authStorage;
    private com.izettle.android.auth.model.UserConfigWithRawData cache;
    private final com.izettle.android.auth.executor.Executor executor;
    private final com.izettle.android.serialization.JsonDeserializer jsonDeserializer;
    private final java.lang.String logTag;
    private final com.izettle.android.auth.log.Logger logger;
    private final android.content.SharedPreferences preferences;
    private final com.izettle.android.auth.model.mapper.UserConfigMapper userConfigMapper;
    private final java.util.List<kotlin.jvm.functions.Function1<com.zettle.android.entities.UserConfig, kotlin.Unit>> userConfigUpdateListeners;

    @kotlin.Deprecated(message = "Deprecated in favour of authStorage")
    private static /* synthetic */ void getPreferences$annotations() {
    }

    public UserConfigRepositoryImpl(android.content.Context context, com.izettle.android.auth.log.Logger logger, com.izettle.android.auth.executor.Executor executor, com.izettle.android.auth.services.ApiService apiService, com.izettle.android.auth.storage.AuthStorage authStorage, android.content.SharedPreferences sharedPreferences, com.izettle.android.auth.model.mapper.UserConfigMapper userConfigMapper, com.izettle.android.serialization.JsonDeserializer jsonDeserializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfigMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonDeserializer, "");
        this.logger = logger;
        this.executor = executor;
        this.apiService = apiService;
        this.authStorage = authStorage;
        this.preferences = sharedPreferences;
        this.userConfigMapper = userConfigMapper;
        this.jsonDeserializer = jsonDeserializer;
        this.logTag = "UserConfigRepositoryImpl";
        this.userConfigUpdateListeners = new java.util.concurrent.CopyOnWriteArrayList();
        com.izettle.android.auth.repository.UserConfigRepositoryKt.migrateToAuthStorage(sharedPreferences, authStorage);
        com.izettle.android.auth.executor.Executor.DefaultImpls.execute$default(executor, new com.izettle.android.auth.repository.UserConfigRepositoryImpl.AnonymousClass1(this), new kotlin.jvm.functions.Function1<com.izettle.android.auth.model.UserConfigWithRawData, kotlin.Unit>() { // from class: com.izettle.android.auth.repository.UserConfigRepositoryImpl.2
            public final void getHighSpeedVideoSizes(com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData) {
                com.izettle.android.auth.repository.UserConfigRepositoryImpl.this.setCache(userConfigWithRawData);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData) {
                getHighSpeedVideoSizes(userConfigWithRawData);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        }, (kotlin.jvm.functions.Function1) null, 4, (java.lang.Object) null);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void debug(java.lang.String str) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.debug(this, str);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void error(java.lang.String str) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.error(this, str);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void error(java.lang.String str, java.lang.Throwable th) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.error(this, str, th);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void error(java.lang.Throwable th) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.error(this, th);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void info(java.lang.String str) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.info(this, str);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void verbose(java.lang.String str) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.verbose(this, str);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final void warn(java.lang.String str) {
        com.izettle.android.auth.log.Loggable.DefaultImpls.warn(this, str);
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final com.izettle.android.auth.log.Logger getLogger() {
        return this.logger;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ UserConfigRepositoryImpl(android.content.Context context, com.izettle.android.auth.log.Logger logger, com.izettle.android.auth.executor.Executor executor, com.izettle.android.auth.services.ApiService apiService, com.izettle.android.auth.storage.AuthStorage authStorage, android.content.SharedPreferences sharedPreferences, com.izettle.android.auth.model.mapper.UserConfigMapper userConfigMapper, com.izettle.android.serialization.JsonDeserializer jsonDeserializer, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, logger, executor, apiService, authStorage, r9, (i & 64) != 0 ? new com.izettle.android.auth.model.mapper.UserConfigMapper(null, null, 3, null) : userConfigMapper, (i & 128) != 0 ? com.izettle.android.serialization.JsonDeserializer.INSTANCE.create() : jsonDeserializer);
        android.content.SharedPreferences sharedPreferences2;
        if ((i & 32) != 0) {
            android.content.SharedPreferences sharedPreferences3 = context.getSharedPreferences("com.izettle.android.auth.UserConfig", 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences3, "");
            sharedPreferences2 = sharedPreferences3;
        } else {
            sharedPreferences2 = sharedPreferences;
        }
    }

    @Override // com.izettle.android.auth.log.Loggable
    public final java.lang.String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCache(final com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(userConfigWithRawData, this.cache)) {
            return;
        }
        this.cache = userConfigWithRawData;
        com.izettle.android.auth.executor.Executor.DefaultImpls.executeForeground$default(this.executor, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.izettle.android.auth.repository.UserConfigRepositoryImpl$cache$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighResolutionOutputSizeshNQ4ISI();
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI() {
                java.util.List list;
                list = com.izettle.android.auth.repository.UserConfigRepositoryImpl.this.userConfigUpdateListeners;
                com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData2 = userConfigWithRawData;
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((kotlin.jvm.functions.Function1) it.next()).invoke(userConfigWithRawData2 != null ? userConfigWithRawData2.getUserConfig() : null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, (kotlin.jvm.functions.Function0) null, (kotlin.jvm.functions.Function1) null, 6, (java.lang.Object) null);
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.izettle.android.auth.repository.UserConfigRepositoryImpl$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<com.izettle.android.auth.model.UserConfigWithRawData> {
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final com.izettle.android.auth.model.UserConfigWithRawData invoke() {
            return ((com.izettle.android.auth.repository.UserConfigRepositoryImpl) this.receiver).loadFromStorage();
        }

        AnonymousClass1(java.lang.Object obj) {
            super(0, obj, com.izettle.android.auth.repository.UserConfigRepositoryImpl.class, "loadFromStorage", "loadFromStorage()Lcom/izettle/android/auth/model/UserConfigWithRawData;", 0);
        }
    }

    private final com.izettle.android.core.data.result.Result<com.zettle.android.entities.UserConfig, java.lang.Throwable> deserializeToUserConfig(java.lang.String str) {
        try {
            com.izettle.android.auth.model.mapper.UserConfigMapper userConfigMapper = this.userConfigMapper;
            com.izettle.android.auth.dto.UserConfigDto payload = ((com.izettle.android.auth.dto.UserConfigResponsePayload) this.jsonDeserializer.deserialize(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.dto.UserConfigResponsePayload.class))).getPayload();
            if (payload == null) {
                payload = (com.izettle.android.auth.dto.UserConfigDto) this.jsonDeserializer.deserialize(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.dto.UserConfigDto.class));
            }
            return com.izettle.android.core.data.result.ResultKt.asSuccess(userConfigMapper.map(payload));
        } catch (java.lang.Throwable th) {
            return com.izettle.android.core.data.result.ResultKt.asFailure(th);
        }
    }

    private final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> saveUserConfig(java.lang.String userUuid, final java.lang.String userConfigJson) {
        return com.izettle.android.auth.storage.AuthStorageKt.runIfCanonicalOtherwiseFail(this.authStorage, userUuid, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.izettle.android.auth.repository.UserConfigRepositoryImpl$saveUserConfig$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighResolutionOutputSizeshNQ4ISI();
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI() {
                com.izettle.android.auth.storage.AuthStorage authStorage;
                authStorage = com.izettle.android.auth.repository.UserConfigRepositoryImpl.this.authStorage;
                authStorage.store("CONFIG_PAYLOAD", userConfigJson);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.izettle.android.auth.model.UserConfigWithRawData loadFromStorage() {
        java.lang.String str;
        com.zettle.android.entities.UserConfig userConfig;
        com.izettle.android.auth.storage.AuthStorage authStorage = this.authStorage;
        java.util.concurrent.locks.Lock lock = authStorage.lock;
        lock.lock();
        try {
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class);
            if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class))) {
                str = authStorage.sharedPrefs.getString("CONFIG_PAYLOAD", null);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.TYPE))) {
                str = (java.lang.String) java.lang.Boolean.valueOf(authStorage.sharedPrefs.getBoolean("CONFIG_PAYLOAD", false));
            } else {
                java.lang.String name2 = java.lang.String.class.getName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported type ");
                sb.append(name2);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (str == null || (userConfig = (com.zettle.android.entities.UserConfig) com.izettle.android.core.data.result.ResultKt.getOrNull(deserializeToUserConfig(str))) == null) {
                return null;
            }
            return new com.izettle.android.auth.model.UserConfigWithRawData(userConfig, str);
        } finally {
            lock.unlock();
        }
    }

    static /* synthetic */ com.izettle.android.core.data.result.Result loadFromService$default(com.izettle.android.auth.repository.UserConfigRepositoryImpl userConfigRepositoryImpl, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return userConfigRepositoryImpl.loadFromService(str);
    }

    private final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.UserConfigWithRawData, java.lang.Throwable> loadFromService(java.lang.String token) {
        com.izettle.android.core.data.result.Result configData = this.apiService.getConfigData(token);
        if (configData instanceof com.izettle.android.core.data.result.Success) {
            com.izettle.android.net.Response response = (com.izettle.android.net.Response) ((com.izettle.android.core.data.result.Success) configData).getValue();
            java.lang.String str = (java.lang.String) response.getBody();
            if (str != null) {
                com.izettle.android.core.data.result.Result deserializeToUserConfig = deserializeToUserConfig(str);
                if (deserializeToUserConfig instanceof com.izettle.android.core.data.result.Success) {
                    deserializeToUserConfig = new com.izettle.android.core.data.result.Success(new com.izettle.android.auth.model.UserConfigWithRawData((com.zettle.android.entities.UserConfig) ((com.izettle.android.core.data.result.Success) deserializeToUserConfig).getValue(), str));
                } else if (!(deserializeToUserConfig instanceof com.izettle.android.core.data.result.Failure)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (deserializeToUserConfig != null) {
                    return deserializeToUserConfig;
                }
            }
            return com.izettle.android.core.data.result.ResultKt.asFailure(com.izettle.android.auth.ExtensionsKt.toException(response));
        }
        if (configData instanceof com.izettle.android.core.data.result.Failure) {
            return configData;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.repository.UserConfigRepository
    public final void registerUserConfigUpdateListener(kotlin.jvm.functions.Function1<? super com.zettle.android.entities.UserConfig, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData = this.cache;
        listener.invoke(userConfigWithRawData != null ? userConfigWithRawData.getUserConfig() : null);
        this.userConfigUpdateListeners.add(listener);
    }

    @Override // com.izettle.android.auth.repository.UserConfigRepository
    public final void unregisterUserConfigUpdateListener(kotlin.jvm.functions.Function1<? super com.zettle.android.entities.UserConfig, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.userConfigUpdateListeners.remove(listener);
    }

    private final com.izettle.android.auth.model.UserConfigWithRawData fromCache() {
        com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData = this.cache;
        return userConfigWithRawData == null ? loadFromStorage() : userConfigWithRawData;
    }

    private final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.UserConfigWithRawData, java.lang.Throwable> pathOfLeastResistance() {
        com.izettle.android.core.data.result.Result loadFromService$default;
        com.izettle.android.core.data.result.Result asSuccess;
        com.izettle.android.auth.model.UserConfigWithRawData fromCache = fromCache();
        if (fromCache == null || (asSuccess = com.izettle.android.core.data.result.ResultKt.asSuccess(fromCache)) == null) {
            loadFromService$default = loadFromService$default(this, null, 1, null);
            if (loadFromService$default instanceof com.izettle.android.core.data.result.Success) {
                com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData = (com.izettle.android.auth.model.UserConfigWithRawData) ((com.izettle.android.core.data.result.Success) loadFromService$default).getValue();
                com.izettle.android.core.data.result.Result saveUserConfig = saveUserConfig(userConfigWithRawData.getUserConfig().getUserInfo().getUserUUID(), userConfigWithRawData.getRaw());
                if (saveUserConfig instanceof com.izettle.android.core.data.result.Success) {
                    loadFromService$default = new com.izettle.android.core.data.result.Success(userConfigWithRawData);
                } else {
                    if (!(saveUserConfig instanceof com.izettle.android.core.data.result.Failure)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    loadFromService$default = saveUserConfig;
                }
            } else if (!(loadFromService$default instanceof com.izettle.android.core.data.result.Failure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            loadFromService$default = asSuccess;
        }
        if (loadFromService$default instanceof com.izettle.android.core.data.result.Success) {
            setCache((com.izettle.android.auth.model.UserConfigWithRawData) ((com.izettle.android.core.data.result.Success) loadFromService$default).getValue());
        }
        return loadFromService$default;
    }

    private final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.UserConfigWithRawData, java.lang.IllegalStateException> cacheOnly() {
        com.izettle.android.core.data.result.Success asSuccess;
        com.izettle.android.auth.model.UserConfigWithRawData fromCache = fromCache();
        return (fromCache == null || (asSuccess = com.izettle.android.core.data.result.ResultKt.asSuccess(fromCache)) == null) ? com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalStateException("No user config present")) : asSuccess;
    }

    private final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.UserConfigWithRawData, java.lang.Throwable> syncAndStoreOnDisk(boolean force) {
        com.izettle.android.core.data.result.Result loadFromService$default;
        boolean shouldRefresh;
        com.izettle.android.auth.model.UserConfigWithRawData loadFromStorage = loadFromStorage();
        if (loadFromStorage == null || force) {
            loadFromService$default = loadFromService$default(this, null, 1, null);
            if (loadFromService$default instanceof com.izettle.android.core.data.result.Success) {
                com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData = (com.izettle.android.auth.model.UserConfigWithRawData) ((com.izettle.android.core.data.result.Success) loadFromService$default).getValue();
                loadFromService$default = saveUserConfig(userConfigWithRawData.getUserConfig().getUserInfo().getUserUUID(), userConfigWithRawData.getRaw());
                if (loadFromService$default instanceof com.izettle.android.core.data.result.Success) {
                    loadFromService$default = new com.izettle.android.core.data.result.Success(userConfigWithRawData);
                } else if (!(loadFromService$default instanceof com.izettle.android.core.data.result.Failure)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            } else if (!(loadFromService$default instanceof com.izettle.android.core.data.result.Failure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            com.zettle.android.entities.UserConfig userConfig = loadFromStorage.getUserConfig();
            loadFromService$default = this.apiService.revisit();
            if (loadFromService$default instanceof com.izettle.android.core.data.result.Success) {
                com.izettle.android.auth.dto.RevisitResponsePayload revisitResponsePayload = (com.izettle.android.auth.dto.RevisitResponsePayload) ((com.izettle.android.net.Response) ((com.izettle.android.core.data.result.Success) loadFromService$default).getValue()).getBody();
                shouldRefresh = com.izettle.android.auth.repository.UserConfigRepositoryKt.shouldRefresh(userConfig, revisitResponsePayload != null ? revisitResponsePayload.getPayload() : null);
                if (shouldRefresh) {
                    loadFromService$default = loadFromService$default(this, null, 1, null);
                    if (loadFromService$default instanceof com.izettle.android.core.data.result.Success) {
                        com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData2 = (com.izettle.android.auth.model.UserConfigWithRawData) ((com.izettle.android.core.data.result.Success) loadFromService$default).getValue();
                        com.izettle.android.core.data.result.Result saveUserConfig = saveUserConfig(userConfigWithRawData2.getUserConfig().getUserInfo().getUserUUID(), userConfigWithRawData2.getRaw());
                        if (saveUserConfig instanceof com.izettle.android.core.data.result.Success) {
                            saveUserConfig = new com.izettle.android.core.data.result.Success(userConfigWithRawData2);
                        } else if (!(saveUserConfig instanceof com.izettle.android.core.data.result.Failure)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        loadFromService$default = saveUserConfig;
                    } else if (!(loadFromService$default instanceof com.izettle.android.core.data.result.Failure)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else {
                    loadFromService$default = com.izettle.android.core.data.result.ResultKt.asSuccess(loadFromStorage);
                }
            } else if (!(loadFromService$default instanceof com.izettle.android.core.data.result.Failure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        if (loadFromService$default instanceof com.izettle.android.core.data.result.Success) {
            setCache((com.izettle.android.auth.model.UserConfigWithRawData) ((com.izettle.android.core.data.result.Success) loadFromService$default).getValue());
        }
        return loadFromService$default;
    }

    private final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.UserConfigWithRawData, java.lang.Throwable> fetchNew(java.lang.String accessToken) {
        return loadFromService(accessToken);
    }

    private final void deleteUserConfig(com.izettle.android.auth.storage.Transaction transaction) {
        transaction.remove("CONFIG_PAYLOAD");
        transaction.registerSuccessfulListener(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.izettle.android.auth.repository.UserConfigRepositoryImpl$deleteUserConfig$1
            public final void getHighSpeedVideoFpsRangesFor() {
                com.izettle.android.auth.repository.UserConfigRepositoryImpl.this.setCache(null);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoFpsRangesFor();
                return kotlin.Unit.INSTANCE;
            }

            {
                super(0);
            }
        });
    }

    @Override // com.izettle.android.auth.repository.UserConfigRepository
    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> deleteUserConfig() {
        com.izettle.android.auth.storage.Transaction beginTransaction = this.authStorage.beginTransaction();
        deleteUserConfig(beginTransaction);
        return beginTransaction.commit();
    }

    @Override // com.izettle.android.auth.repository.UserConfigRepository
    public final void applyDeleteToTransaction(com.izettle.android.auth.storage.Transaction transaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        deleteUserConfig(transaction);
    }

    @Override // com.izettle.android.auth.repository.UserConfigRepository
    public final void applyStoreCanonicalUserConfigToTransaction(com.izettle.android.auth.storage.Transaction transaction, final com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfigWithRawData, "");
        transaction.put("CONFIG_PAYLOAD", userConfigWithRawData.getRaw());
        transaction.registerSuccessfulListener(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.izettle.android.auth.repository.UserConfigRepositoryImpl$applyStoreCanonicalUserConfigToTransaction$1
            public final void getHighSpeedVideoFpsRangesFor() {
                com.izettle.android.auth.repository.UserConfigRepositoryImpl.this.setCache(userConfigWithRawData);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoFpsRangesFor();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // com.izettle.android.auth.repository.UserConfigRepository
    public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.UserConfigWithRawData, java.lang.Throwable> getUserConfigWithRawData(com.izettle.android.auth.repository.GetStrategy strategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(strategy, com.izettle.android.auth.repository.PathOfLeastResistance.INSTANCE)) {
            return pathOfLeastResistance();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(strategy, com.izettle.android.auth.repository.CacheOnly.INSTANCE)) {
            return cacheOnly();
        }
        if (strategy instanceof com.izettle.android.auth.repository.SyncAndCacheResult) {
            return syncAndStoreOnDisk(((com.izettle.android.auth.repository.SyncAndCacheResult) strategy).getForceSync());
        }
        if (strategy instanceof com.izettle.android.auth.repository.FetchNew) {
            return fetchNew(((com.izettle.android.auth.repository.FetchNew) strategy).getToken());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.repository.UserConfigRepository
    public final com.izettle.android.core.data.result.Result<com.zettle.android.entities.UserConfig, java.lang.Throwable> getUserConfig(com.izettle.android.auth.repository.GetStrategy strategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "");
        com.izettle.android.core.data.result.Result userConfigWithRawData = getUserConfigWithRawData(strategy);
        if (userConfigWithRawData instanceof com.izettle.android.core.data.result.Success) {
            return new com.izettle.android.core.data.result.Success(((com.izettle.android.auth.model.UserConfigWithRawData) ((com.izettle.android.core.data.result.Success) userConfigWithRawData).getValue()).getUserConfig());
        }
        if (userConfigWithRawData instanceof com.izettle.android.core.data.result.Failure) {
            return userConfigWithRawData;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
