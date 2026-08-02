package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\bE\b\u0000\u0018\u00002\u00020\u0001Bÿ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-R#\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010!\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u00105\u001a\u0004\b6\u00107R\u001a\u0010'\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010)\u001a\u00020(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010\u0017\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u0019\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010+\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010\u001b\u001a\u00020\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010%\u001a\u00020$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010\u001f\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010l\u001a\u0004\bm\u0010nR\u001a\u0010\u001d\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010o\u001a\u0004\bp\u0010qR\u001a\u0010#\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010r\u001a\u0004\bs\u0010t"}, d2 = {"Lcom/izettle/android/auth/ZettleAuthServices;", "", "Lcom/izettle/android/auth/ZettleAuth$Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/izettle/android/auth/log/LogFileManager;", "logFileManager", "Lcom/izettle/android/auth/storage/AuthStorage;", "authStorage", "Lcom/izettle/android/auth/sync/SyncManager;", "syncManager", "Lcom/izettle/android/auth/executor/Executor;", "executor", "Lcom/izettle/android/auth/repository/SessionRepository;", "sessionRepository", "Lcom/izettle/android/auth/ClientDataProvider;", "clientDataProvider", "Lcom/izettle/android/auth/repository/CodeVerifierRepository;", "codeVerifierRepository", "Lcom/izettle/android/auth/services/MobileService;", "mobileService", "Lcom/izettle/android/auth/repository/ServiceUriRepository;", "serviceUriRepository", "Lcom/izettle/android/auth/services/BaseService;", "baseService", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "baseUriRepository", "Lcom/izettle/android/auth/services/OAuthService;", "oAuthService", "Lcom/izettle/android/auth/TokenRepository;", "tokenRepository", "Lcom/izettle/android/auth/token/TokenManager;", "tokenManager", "Lcom/izettle/android/auth/services/ApiService;", "apiService", "Lcom/izettle/android/auth/repository/UserConfigRepository;", "userConfigRepository", "Lcom/izettle/android/auth/OAuthUriManager;", "oAuthUriManager", "Lcom/izettle/android/auth/AuthManager;", "authManager", "Lcom/izettle/android/auth/AuthWebLauncher;", "authWebLauncher", "Lcom/izettle/android/auth/repository/ClientServicesRepository;", "clientServicesRepository", "<init>", "(Lcom/izettle/android/auth/ZettleAuth$Configuration;Lcom/izettle/android/auth/log/LogFileManager;Lcom/izettle/android/auth/storage/AuthStorage;Lcom/izettle/android/auth/sync/SyncManager;Lcom/izettle/android/auth/executor/Executor;Lcom/izettle/android/auth/repository/SessionRepository;Lcom/izettle/android/auth/ClientDataProvider;Lcom/izettle/android/auth/repository/CodeVerifierRepository;Lcom/izettle/android/auth/services/MobileService;Lcom/izettle/android/auth/repository/ServiceUriRepository;Lcom/izettle/android/auth/services/BaseService;Lcom/izettle/android/auth/repository/BaseUriRepository;Lcom/izettle/android/auth/services/OAuthService;Lcom/izettle/android/auth/TokenRepository;Lcom/izettle/android/auth/token/TokenManager;Lcom/izettle/android/auth/services/ApiService;Lcom/izettle/android/auth/repository/UserConfigRepository;Lcom/izettle/android/auth/OAuthUriManager;Lcom/izettle/android/auth/AuthManager;Lcom/izettle/android/auth/AuthWebLauncher;Lcom/izettle/android/auth/repository/ClientServicesRepository;)V", "Lkotlin/Function0;", "", "accessTokenResolver$delegate", "Lkotlin/Lazy;", "getAccessTokenResolver", "()Lkotlin/jvm/functions/Function0;", "accessTokenResolver", "Lcom/izettle/android/auth/services/ApiService;", "getApiService", "()Lcom/izettle/android/auth/services/ApiService;", "Lcom/izettle/android/auth/AuthManager;", "getAuthManager", "()Lcom/izettle/android/auth/AuthManager;", "Lcom/izettle/android/auth/storage/AuthStorage;", "getAuthStorage", "()Lcom/izettle/android/auth/storage/AuthStorage;", "authUriRepository", "Lcom/izettle/android/auth/repository/CodeVerifierRepository;", "getAuthUriRepository", "()Lcom/izettle/android/auth/repository/CodeVerifierRepository;", "Lcom/izettle/android/auth/AuthWebLauncher;", "getAuthWebLauncher", "()Lcom/izettle/android/auth/AuthWebLauncher;", "Lcom/izettle/android/auth/services/BaseService;", "getBaseService", "()Lcom/izettle/android/auth/services/BaseService;", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "getBaseUriRepository", "()Lcom/izettle/android/auth/repository/BaseUriRepository;", "Lcom/izettle/android/auth/ClientDataProvider;", "getClientDataProvider", "()Lcom/izettle/android/auth/ClientDataProvider;", "Lcom/izettle/android/auth/repository/ClientServicesRepository;", "getClientServicesRepository", "()Lcom/izettle/android/auth/repository/ClientServicesRepository;", "Lcom/izettle/android/auth/ZettleAuth$Configuration;", "getConfiguration", "()Lcom/izettle/android/auth/ZettleAuth$Configuration;", "Lcom/izettle/android/auth/executor/Executor;", "getExecutor", "()Lcom/izettle/android/auth/executor/Executor;", "Lcom/izettle/android/auth/log/LogFileManager;", "getLogFileManager", "()Lcom/izettle/android/auth/log/LogFileManager;", "Lcom/izettle/android/auth/services/MobileService;", "getMobileService", "()Lcom/izettle/android/auth/services/MobileService;", "Lcom/izettle/android/auth/services/OAuthService;", "getOAuthService", "()Lcom/izettle/android/auth/services/OAuthService;", "Lcom/izettle/android/auth/OAuthUriManager;", "getOAuthUriManager", "()Lcom/izettle/android/auth/OAuthUriManager;", "Lcom/izettle/android/auth/repository/ServiceUriRepository;", "getServiceUriRepository", "()Lcom/izettle/android/auth/repository/ServiceUriRepository;", "Lcom/izettle/android/auth/repository/SessionRepository;", "getSessionRepository", "()Lcom/izettle/android/auth/repository/SessionRepository;", "Lcom/izettle/android/auth/sync/SyncManager;", "getSyncManager", "()Lcom/izettle/android/auth/sync/SyncManager;", "Lcom/izettle/android/auth/token/TokenManager;", "getTokenManager", "()Lcom/izettle/android/auth/token/TokenManager;", "Lcom/izettle/android/auth/TokenRepository;", "getTokenRepository", "()Lcom/izettle/android/auth/TokenRepository;", "Lcom/izettle/android/auth/repository/UserConfigRepository;", "getUserConfigRepository", "()Lcom/izettle/android/auth/repository/UserConfigRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ZettleAuthServices {

    /* renamed from: accessTokenResolver$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy accessTokenResolver;
    private final com.izettle.android.auth.services.ApiService apiService;
    private final com.izettle.android.auth.AuthManager authManager;
    private final com.izettle.android.auth.storage.AuthStorage authStorage;
    private final com.izettle.android.auth.repository.CodeVerifierRepository authUriRepository;
    private final com.izettle.android.auth.AuthWebLauncher authWebLauncher;
    private final com.izettle.android.auth.services.BaseService baseService;
    private final com.izettle.android.auth.repository.BaseUriRepository baseUriRepository;
    private final com.izettle.android.auth.ClientDataProvider clientDataProvider;
    private final com.izettle.android.auth.repository.ClientServicesRepository clientServicesRepository;
    private final com.izettle.android.auth.ZettleAuth.Configuration configuration;
    private final com.izettle.android.auth.executor.Executor executor;
    private final com.izettle.android.auth.log.LogFileManager logFileManager;
    private final com.izettle.android.auth.services.MobileService mobileService;
    private final com.izettle.android.auth.services.OAuthService oAuthService;
    private final com.izettle.android.auth.OAuthUriManager oAuthUriManager;
    private final com.izettle.android.auth.repository.ServiceUriRepository serviceUriRepository;
    private final com.izettle.android.auth.repository.SessionRepository sessionRepository;
    private final com.izettle.android.auth.sync.SyncManager syncManager;
    private final com.izettle.android.auth.token.TokenManager tokenManager;
    private final com.izettle.android.auth.TokenRepository tokenRepository;
    private final com.izettle.android.auth.repository.UserConfigRepository userConfigRepository;

    public ZettleAuthServices(com.izettle.android.auth.ZettleAuth.Configuration configuration, com.izettle.android.auth.log.LogFileManager logFileManager, com.izettle.android.auth.storage.AuthStorage authStorage, com.izettle.android.auth.sync.SyncManager syncManager, com.izettle.android.auth.executor.Executor executor, com.izettle.android.auth.repository.SessionRepository sessionRepository, com.izettle.android.auth.ClientDataProvider clientDataProvider, com.izettle.android.auth.repository.CodeVerifierRepository codeVerifierRepository, com.izettle.android.auth.services.MobileService mobileService, com.izettle.android.auth.repository.ServiceUriRepository serviceUriRepository, com.izettle.android.auth.services.BaseService baseService, com.izettle.android.auth.repository.BaseUriRepository baseUriRepository, com.izettle.android.auth.services.OAuthService oAuthService, com.izettle.android.auth.TokenRepository tokenRepository, com.izettle.android.auth.token.TokenManager tokenManager, com.izettle.android.auth.services.ApiService apiService, com.izettle.android.auth.repository.UserConfigRepository userConfigRepository, com.izettle.android.auth.OAuthUriManager oAuthUriManager, com.izettle.android.auth.AuthManager authManager, com.izettle.android.auth.AuthWebLauncher authWebLauncher, com.izettle.android.auth.repository.ClientServicesRepository clientServicesRepository) {
        com.izettle.android.auth.services.MobileService mobileService2;
        com.izettle.android.auth.services.OAuthService oAuthService2;
        com.izettle.android.auth.TokenRepository tokenRepository2;
        com.izettle.android.auth.services.ApiService apiService2;
        com.izettle.android.auth.services.ApiService apiService3;
        com.izettle.android.auth.repository.ServiceUriRepository serviceUriRepository2;
        com.izettle.android.auth.repository.ClientServicesRepository clientServicesRepository2;
        com.izettle.android.auth.AuthWebLauncher authWebLauncher2;
        com.izettle.android.auth.AuthManager authManager2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        this.configuration = configuration;
        com.izettle.android.auth.executor.Executor create = executor == null ? com.izettle.android.auth.executor.Executor.INSTANCE.create() : executor;
        this.executor = create;
        com.izettle.android.auth.log.LogFileManager logFileManager2 = logFileManager == null ? new com.izettle.android.auth.log.LogFileManager(configuration.getContext(), create, new com.izettle.android.auth.log.UploadFile() { // from class: com.izettle.android.auth.ZettleAuthServices$$ExternalSyntheticLambda0
            @Override // com.izettle.android.auth.log.UploadFile
            public final com.izettle.android.core.data.result.Result invoke(java.lang.String str, java.io.File file, java.lang.String str2, com.izettle.android.net.ContentType contentType) {
                com.izettle.android.core.data.result.Result logFileManager$lambda$0;
                logFileManager$lambda$0 = com.izettle.android.auth.ZettleAuthServices.logFileManager$lambda$0(com.izettle.android.auth.ZettleAuthServices.this, str, file, str2, contentType);
                return logFileManager$lambda$0;
            }
        }, null, null, null, 56, null) : logFileManager;
        this.logFileManager = logFileManager2;
        com.izettle.android.auth.storage.AuthStorage authStorage2 = authStorage == null ? new com.izettle.android.auth.storage.AuthStorage(configuration.getContext(), configuration.getLogger(), null, 4, null) : authStorage;
        this.authStorage = authStorage2;
        com.izettle.android.auth.sync.SyncManager syncManager2 = syncManager == null ? new com.izettle.android.auth.sync.SyncManager(configuration.getContext()) : syncManager;
        this.syncManager = syncManager2;
        com.izettle.android.auth.repository.SessionRepository create2 = sessionRepository == null ? com.izettle.android.auth.repository.SessionRepository.INSTANCE.create(configuration.getContext()) : sessionRepository;
        this.sessionRepository = create2;
        com.izettle.android.auth.ClientDataProvider clientDataProvider2 = clientDataProvider == null ? new com.izettle.android.auth.ClientDataProvider(configuration.getContext(), configuration.getAppLocale(), create2, configuration.getRedirectUrl(), configuration.getAppName(), configuration.getBackendEnvironment()) : clientDataProvider;
        this.clientDataProvider = clientDataProvider2;
        com.izettle.android.auth.repository.CodeVerifierRepository create3 = codeVerifierRepository == null ? com.izettle.android.auth.repository.CodeVerifierRepository.INSTANCE.create(configuration.getContext()) : codeVerifierRepository;
        this.authUriRepository = create3;
        com.izettle.android.auth.services.BaseService create4 = baseService == null ? com.izettle.android.auth.services.BaseService.INSTANCE.create(configuration.getHttpClient(), configuration.getBackendEnvironment()) : baseService;
        this.baseService = create4;
        com.izettle.android.auth.repository.BaseUriRepositoryImpl create5 = baseUriRepository == null ? com.izettle.android.auth.repository.BaseUriRepository.INSTANCE.create(create4) : baseUriRepository;
        this.baseUriRepository = create5;
        this.accessTokenResolver = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<kotlin.jvm.functions.Function0<? extends java.lang.String>>() { // from class: com.izettle.android.auth.ZettleAuthServices$accessTokenResolver$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final kotlin.jvm.functions.Function0<java.lang.String> invoke() {
                final com.izettle.android.auth.ZettleAuthServices zettleAuthServices = com.izettle.android.auth.ZettleAuthServices.this;
                return new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.izettle.android.auth.ZettleAuthServices$accessTokenResolver$2.1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.izettle.android.auth.ZettleAuthServices.this.getTokenManager().getAccessToken(new java.lang.String[0]);
                    }

                    {
                        super(0);
                    }
                };
            }

            {
                super(0);
            }
        });
        com.izettle.android.auth.services.MobileService create6 = mobileService == null ? com.izettle.android.auth.services.MobileService.INSTANCE.create(configuration.getHttpClient(), configuration.getBackendEnvironment()) : mobileService;
        this.mobileService = create6;
        com.izettle.android.auth.repository.ServiceUriRepositoryImpl create7 = serviceUriRepository == null ? com.izettle.android.auth.repository.ServiceUriRepository.INSTANCE.create(create6, getAccessTokenResolver()) : serviceUriRepository;
        this.serviceUriRepository = create7;
        com.izettle.android.auth.services.OAuthService create8 = oAuthService == null ? com.izettle.android.auth.services.OAuthService.INSTANCE.create(configuration.getHttpClient(), create7, create5, clientDataProvider2) : oAuthService;
        this.oAuthService = create8;
        com.izettle.android.auth.TokenRepository makeTokenRepository = tokenRepository == null ? com.izettle.android.auth.TokenRepositoryKt.makeTokenRepository(configuration.getContext(), authStorage2, configuration.getLogger()) : tokenRepository;
        this.tokenRepository = makeTokenRepository;
        com.izettle.android.auth.token.TokenManager create9 = tokenManager == null ? com.izettle.android.auth.token.TokenManager.INSTANCE.create(makeTokenRepository, create8, clientDataProvider2) : tokenManager;
        this.tokenManager = create9;
        if (apiService == null) {
            tokenRepository2 = makeTokenRepository;
            oAuthService2 = create8;
            mobileService2 = create6;
            apiService2 = com.izettle.android.auth.services.ApiService.INSTANCE.create(configuration.getHttpClient().newBuilder().authenticator(new com.izettle.android.auth.http.ZettleAuthenticator(new com.izettle.android.auth.ZettleAuthServices$apiService$1(create9))).build(), create9, create5, clientDataProvider2);
        } else {
            mobileService2 = create6;
            oAuthService2 = create8;
            tokenRepository2 = makeTokenRepository;
            apiService2 = apiService;
        }
        this.apiService = apiService2;
        com.izettle.android.auth.repository.UserConfigRepository makeUserConfigRepository = userConfigRepository == null ? com.izettle.android.auth.repository.UserConfigRepositoryKt.makeUserConfigRepository(configuration.getContext(), create, apiService2, authStorage2, configuration.getLogger()) : userConfigRepository;
        this.userConfigRepository = makeUserConfigRepository;
        com.izettle.android.auth.repository.ClientServicesRepositoryImpl create10 = clientServicesRepository == null ? com.izettle.android.auth.repository.ClientServicesRepository.INSTANCE.create(create5, create7, configuration.getBackendEnvironment()) : clientServicesRepository;
        this.clientServicesRepository = create10;
        com.izettle.android.auth.OAuthUriManager create11 = oAuthUriManager == null ? com.izettle.android.auth.OAuthUriManager.INSTANCE.create(create5, create3, clientDataProvider2) : oAuthUriManager;
        this.oAuthUriManager = create11;
        if (authWebLauncher == null) {
            clientServicesRepository2 = create10;
            apiService3 = apiService2;
            serviceUriRepository2 = create7;
            authWebLauncher2 = com.izettle.android.auth.AuthWebLauncher.INSTANCE.create(configuration.getContext(), configuration.getLogger());
        } else {
            apiService3 = apiService2;
            serviceUriRepository2 = create7;
            clientServicesRepository2 = create10;
            authWebLauncher2 = authWebLauncher;
        }
        this.authWebLauncher = authWebLauncher2;
        if (authManager == null) {
            authManager2 = com.izettle.android.auth.AuthManager.INSTANCE.create(r28, r29, r30, r31, r32, r33, r34, r35, configuration.getLogger(), (r26 & 512) != 0 ? new com.izettle.android.auth.tasks.AuthTaskRegistry() : null, (r26 & 1024) != 0 ? new com.izettle.android.auth.tasks.AbstractAuthTaskFactory(create, create11, authWebLauncher2, clientDataProvider2, makeUserConfigRepository, create9, authStorage2, logFileManager2) : null);
        } else {
            authManager2 = authManager;
        }
        this.authManager = authManager2;
        com.izettle.android.auth.ServiceLocator.INSTANCE.clear();
        com.izettle.android.auth.ServiceLocator serviceLocator = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo = new com.izettle.android.auth.ServiceInfo(0, create);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.executor.Executor.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.executor.Executor.class, new java.util.ArrayList());
        }
        java.util.List list = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.executor.Executor.class);
        if (list != null) {
            list.add(serviceInfo);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator2 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo2 = new com.izettle.android.auth.ServiceInfo(0, syncManager2);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.sync.SyncManager.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.sync.SyncManager.class, new java.util.ArrayList());
        }
        java.util.List list2 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.sync.SyncManager.class);
        if (list2 != null) {
            list2.add(serviceInfo2);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator3 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo3 = new com.izettle.android.auth.ServiceInfo(0, create2);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.repository.SessionRepository.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.repository.SessionRepository.class, new java.util.ArrayList());
        }
        java.util.List list3 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.repository.SessionRepository.class);
        if (list3 != null) {
            list3.add(serviceInfo3);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator4 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo4 = new com.izettle.android.auth.ServiceInfo(0, clientDataProvider2);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.ClientDataProvider.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.ClientDataProvider.class, new java.util.ArrayList());
        }
        java.util.List list4 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.ClientDataProvider.class);
        if (list4 != null) {
            list4.add(serviceInfo4);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator5 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo5 = new com.izettle.android.auth.ServiceInfo(0, create3);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.repository.CodeVerifierRepository.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.repository.CodeVerifierRepository.class, new java.util.ArrayList());
        }
        java.util.List list5 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.repository.CodeVerifierRepository.class);
        if (list5 != null) {
            list5.add(serviceInfo5);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator6 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo6 = new com.izettle.android.auth.ServiceInfo(0, create4);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.services.BaseService.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.services.BaseService.class, new java.util.ArrayList());
        }
        java.util.List list6 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.services.BaseService.class);
        if (list6 != null) {
            list6.add(serviceInfo6);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator7 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo7 = new com.izettle.android.auth.ServiceInfo(0, create5);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.repository.BaseUriRepository.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.repository.BaseUriRepository.class, new java.util.ArrayList());
        }
        java.util.List list7 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.repository.BaseUriRepository.class);
        if (list7 != null) {
            list7.add(serviceInfo7);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator8 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo8 = new com.izettle.android.auth.ServiceInfo(0, mobileService2);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.services.MobileService.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.services.MobileService.class, new java.util.ArrayList());
        }
        java.util.List list8 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.services.MobileService.class);
        if (list8 != null) {
            list8.add(serviceInfo8);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator9 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo9 = new com.izettle.android.auth.ServiceInfo(0, serviceUriRepository2);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.repository.ServiceUriRepository.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.repository.ServiceUriRepository.class, new java.util.ArrayList());
        }
        java.util.List list9 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.repository.ServiceUriRepository.class);
        if (list9 != null) {
            list9.add(serviceInfo9);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator10 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo10 = new com.izettle.android.auth.ServiceInfo(0, oAuthService2);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.services.OAuthService.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.services.OAuthService.class, new java.util.ArrayList());
        }
        java.util.List list10 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.services.OAuthService.class);
        if (list10 != null) {
            list10.add(serviceInfo10);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator11 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo11 = new com.izettle.android.auth.ServiceInfo(0, tokenRepository2);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.TokenRepository.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.TokenRepository.class, new java.util.ArrayList());
        }
        java.util.List list11 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.TokenRepository.class);
        if (list11 != null) {
            list11.add(serviceInfo11);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator12 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo12 = new com.izettle.android.auth.ServiceInfo(0, create9);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.token.TokenManager.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.token.TokenManager.class, new java.util.ArrayList());
        }
        java.util.List list12 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.token.TokenManager.class);
        if (list12 != null) {
            list12.add(serviceInfo12);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator13 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo13 = new com.izettle.android.auth.ServiceInfo(0, apiService3);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.services.ApiService.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.services.ApiService.class, new java.util.ArrayList());
        }
        java.util.List list13 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.services.ApiService.class);
        if (list13 != null) {
            list13.add(serviceInfo13);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator14 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo14 = new com.izettle.android.auth.ServiceInfo(0, makeUserConfigRepository);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.repository.UserConfigRepository.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.repository.UserConfigRepository.class, new java.util.ArrayList());
        }
        java.util.List list14 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.repository.UserConfigRepository.class);
        if (list14 != null) {
            list14.add(serviceInfo14);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator15 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo15 = new com.izettle.android.auth.ServiceInfo(0, clientServicesRepository2);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.repository.ClientServicesRepository.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.repository.ClientServicesRepository.class, new java.util.ArrayList());
        }
        java.util.List list15 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.repository.ClientServicesRepository.class);
        if (list15 != null) {
            list15.add(serviceInfo15);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator16 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo16 = new com.izettle.android.auth.ServiceInfo(0, create11);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.OAuthUriManager.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.OAuthUriManager.class, new java.util.ArrayList());
        }
        java.util.List list16 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.OAuthUriManager.class);
        if (list16 != null) {
            list16.add(serviceInfo16);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator17 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo17 = new com.izettle.android.auth.ServiceInfo(0, authManager2);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.AuthManager.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.AuthManager.class, new java.util.ArrayList());
        }
        java.util.List list17 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.AuthManager.class);
        if (list17 != null) {
            list17.add(serviceInfo17);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator18 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo18 = new com.izettle.android.auth.ServiceInfo(0, authWebLauncher2);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.AuthWebLauncher.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.AuthWebLauncher.class, new java.util.ArrayList());
        }
        java.util.List list18 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.AuthWebLauncher.class);
        if (list18 != null) {
            list18.add(serviceInfo18);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator19 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo19 = new com.izettle.android.auth.ServiceInfo(0, configuration.getLogger());
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.log.Logger.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.log.Logger.class, new java.util.ArrayList());
        }
        java.util.List list19 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.log.Logger.class);
        if (list19 != null) {
            list19.add(serviceInfo19);
        }
        com.izettle.android.auth.ServiceLocator serviceLocator20 = com.izettle.android.auth.ServiceLocator.INSTANCE;
        com.izettle.android.auth.ServiceInfo serviceInfo20 = new com.izettle.android.auth.ServiceInfo(0, logFileManager2);
        if (!com.izettle.android.auth.ServiceLocator.services.containsKey(com.izettle.android.auth.log.LogFileManager.class)) {
            com.izettle.android.auth.ServiceLocator.services.put(com.izettle.android.auth.log.LogFileManager.class, new java.util.ArrayList());
        }
        java.util.List list20 = (java.util.List) com.izettle.android.auth.ServiceLocator.services.get(com.izettle.android.auth.log.LogFileManager.class);
        if (list20 != null) {
            list20.add(serviceInfo20);
        }
    }

    public /* synthetic */ ZettleAuthServices(com.izettle.android.auth.ZettleAuth.Configuration configuration, com.izettle.android.auth.log.LogFileManager logFileManager, com.izettle.android.auth.storage.AuthStorage authStorage, com.izettle.android.auth.sync.SyncManager syncManager, com.izettle.android.auth.executor.Executor executor, com.izettle.android.auth.repository.SessionRepository sessionRepository, com.izettle.android.auth.ClientDataProvider clientDataProvider, com.izettle.android.auth.repository.CodeVerifierRepository codeVerifierRepository, com.izettle.android.auth.services.MobileService mobileService, com.izettle.android.auth.repository.ServiceUriRepository serviceUriRepository, com.izettle.android.auth.services.BaseService baseService, com.izettle.android.auth.repository.BaseUriRepository baseUriRepository, com.izettle.android.auth.services.OAuthService oAuthService, com.izettle.android.auth.TokenRepository tokenRepository, com.izettle.android.auth.token.TokenManager tokenManager, com.izettle.android.auth.services.ApiService apiService, com.izettle.android.auth.repository.UserConfigRepository userConfigRepository, com.izettle.android.auth.OAuthUriManager oAuthUriManager, com.izettle.android.auth.AuthManager authManager, com.izettle.android.auth.AuthWebLauncher authWebLauncher, com.izettle.android.auth.repository.ClientServicesRepository clientServicesRepository, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(configuration, (i & 2) != 0 ? null : logFileManager, (i & 4) != 0 ? null : authStorage, (i & 8) != 0 ? null : syncManager, (i & 16) != 0 ? null : executor, (i & 32) != 0 ? null : sessionRepository, (i & 64) != 0 ? null : clientDataProvider, (i & 128) != 0 ? null : codeVerifierRepository, (i & 256) != 0 ? null : mobileService, (i & 512) != 0 ? null : serviceUriRepository, (i & 1024) != 0 ? null : baseService, (i & 2048) != 0 ? null : baseUriRepository, (i & 4096) != 0 ? null : oAuthService, (i & 8192) != 0 ? null : tokenRepository, (i & 16384) != 0 ? null : tokenManager, (i & 32768) != 0 ? null : apiService, (i & 65536) != 0 ? null : userConfigRepository, (i & 131072) != 0 ? null : oAuthUriManager, (i & 262144) != 0 ? null : authManager, (i & 524288) != 0 ? null : authWebLauncher, (i & 1048576) == 0 ? clientServicesRepository : null);
    }

    public final com.izettle.android.auth.ZettleAuth.Configuration getConfiguration() {
        return this.configuration;
    }

    public final com.izettle.android.auth.executor.Executor getExecutor() {
        return this.executor;
    }

    public final com.izettle.android.auth.log.LogFileManager getLogFileManager() {
        return this.logFileManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.izettle.android.core.data.result.Result logFileManager$lambda$0(com.izettle.android.auth.ZettleAuthServices zettleAuthServices, java.lang.String str, java.io.File file, java.lang.String str2, com.izettle.android.net.ContentType contentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuthServices, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        return zettleAuthServices.apiService.upload(str, file, str2, contentType);
    }

    public final com.izettle.android.auth.storage.AuthStorage getAuthStorage() {
        return this.authStorage;
    }

    public final com.izettle.android.auth.sync.SyncManager getSyncManager() {
        return this.syncManager;
    }

    public final com.izettle.android.auth.repository.SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    public final com.izettle.android.auth.ClientDataProvider getClientDataProvider() {
        return this.clientDataProvider;
    }

    public final com.izettle.android.auth.repository.CodeVerifierRepository getAuthUriRepository() {
        return this.authUriRepository;
    }

    public final com.izettle.android.auth.services.BaseService getBaseService() {
        return this.baseService;
    }

    public final com.izettle.android.auth.repository.BaseUriRepository getBaseUriRepository() {
        return this.baseUriRepository;
    }

    public final kotlin.jvm.functions.Function0<java.lang.String> getAccessTokenResolver() {
        return (kotlin.jvm.functions.Function0) this.accessTokenResolver.getValue();
    }

    public final com.izettle.android.auth.services.MobileService getMobileService() {
        return this.mobileService;
    }

    public final com.izettle.android.auth.repository.ServiceUriRepository getServiceUriRepository() {
        return this.serviceUriRepository;
    }

    public final com.izettle.android.auth.services.OAuthService getOAuthService() {
        return this.oAuthService;
    }

    public final com.izettle.android.auth.TokenRepository getTokenRepository() {
        return this.tokenRepository;
    }

    public final com.izettle.android.auth.token.TokenManager getTokenManager() {
        return this.tokenManager;
    }

    public final com.izettle.android.auth.services.ApiService getApiService() {
        return this.apiService;
    }

    public final com.izettle.android.auth.repository.UserConfigRepository getUserConfigRepository() {
        return this.userConfigRepository;
    }

    public final com.izettle.android.auth.repository.ClientServicesRepository getClientServicesRepository() {
        return this.clientServicesRepository;
    }

    public final com.izettle.android.auth.OAuthUriManager getOAuthUriManager() {
        return this.oAuthUriManager;
    }

    public final com.izettle.android.auth.AuthWebLauncher getAuthWebLauncher() {
        return this.authWebLauncher;
    }

    public final com.izettle.android.auth.AuthManager getAuthManager() {
        return this.authManager;
    }
}
