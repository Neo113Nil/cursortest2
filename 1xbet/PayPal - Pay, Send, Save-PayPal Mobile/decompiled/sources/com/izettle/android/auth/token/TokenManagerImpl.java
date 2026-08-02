package com.izettle.android.auth.token;

@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 R2\u00020\u0001:\u0001RB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b#\u0010\u001eJ%\u0010&\u001a\u0004\u0018\u00010\u001f2\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0$\"\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b(\u0010\u001eJ%\u0010)\u001a\u0004\u0018\u00010\u001f2\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0$\"\u00020\u001fH\u0016¢\u0006\u0004\b)\u0010'J\u001b\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b*\u0010\u001eJ\u0011\u0010+\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J#\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J#\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J#\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010.\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;JC\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020\u00172\b\b\u0002\u0010?\u001a\u00020\u0017H\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\bB\u0010\u001eJ\u000f\u0010C\u001a\u00020\rH\u0000¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\bE\u0010\u0010J+\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010LR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010MR \u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010Q"}, d2 = {"Lcom/izettle/android/auth/token/TokenManagerImpl;", "Lcom/izettle/android/auth/token/TokenManager;", "Lcom/izettle/android/auth/TokenRepository;", "tokenRepository", "Lcom/izettle/android/auth/services/OAuthService;", "oAuthService", "Lcom/izettle/android/auth/ClientDataProvider;", "clientDataProvider", "Lcom/izettle/android/auth/model/mapper/OAuthTokensMapper;", "oAuthTokensMapper", "<init>", "(Lcom/izettle/android/auth/TokenRepository;Lcom/izettle/android/auth/services/OAuthService;Lcom/izettle/android/auth/ClientDataProvider;Lcom/izettle/android/auth/model/mapper/OAuthTokensMapper;)V", "Lkotlin/Function0;", "", "onInvalidated", "addOnRefreshTokenInvalidatedListener", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/izettle/android/auth/storage/Transaction;", "transaction", "applyClearToTransaction", "(Lcom/izettle/android/auth/storage/Transaction;)V", "Lcom/izettle/android/auth/model/OAuthTokens;", "oAuthTokens", "", "isNative", "applyStoreCanonicalTokensToTransaction", "(Lcom/izettle/android/auth/storage/Transaction;Lcom/izettle/android/auth/model/OAuthTokens;Z)V", "Lcom/izettle/android/core/data/result/Result;", "", "clear", "()Lcom/izettle/android/core/data/result/Result;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "deleteAccessToken", "(Ljava/lang/String;)V", "deleteRefreshToken", "", "scopes", "getAccessToken", "([Ljava/lang/String;)Ljava/lang/String;", "getDefaultTokens", "getExactAccessToken", "getOneTimeToken", "getRefreshToken", "()Ljava/lang/String;", "Lcom/izettle/android/auth/token/GetTokensSpec;", "getTokensSpec", "getTokens", "(Lcom/izettle/android/auth/token/GetTokensSpec;)Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/token/CredentialsGetTokenSpec;", "credentialsGetTokenSpec", "getTokensFromCredentials", "(Lcom/izettle/android/auth/token/CredentialsGetTokenSpec;)Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/token/OAuthGetTokensSpec;", "oAuthGetTokensSpec", "getTokensFromOAuthSpec", "(Lcom/izettle/android/auth/token/OAuthGetTokensSpec;)Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/token/RefreshGetTokensSpec;", "getTokensFromRefreshToken", "(Lcom/izettle/android/auth/token/RefreshGetTokensSpec;)Lcom/izettle/android/core/data/result/Result;", "", "attempt", "notifyOnRefreshTokenInvalidated", "storeRetrievedTokenPair", "refresh$auth_release", "(Lcom/izettle/android/auth/model/OAuthTokens;IZZ)Lcom/izettle/android/core/data/result/Result;", "refreshAccessToken", "refreshAccessTokenIfNeeded$auth_release", "()V", "removeOnRefreshTokenInvalidatedListener", "storeTokenPair", "(Lcom/izettle/android/auth/model/OAuthTokens;Z)Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/ClientDataProvider;", "Ljava/util/concurrent/locks/Lock;", "lock", "Ljava/util/concurrent/locks/Lock;", "Lcom/izettle/android/auth/services/OAuthService;", "Lcom/izettle/android/auth/model/mapper/OAuthTokensMapper;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onRefreshTokenInvalidatedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/izettle/android/auth/TokenRepository;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TokenManagerImpl implements com.izettle.android.auth.token.TokenManager {
    public static final int REFRESH_RETRIES = 3;
    private final com.izettle.android.auth.ClientDataProvider clientDataProvider;
    private final java.util.concurrent.locks.Lock lock;
    private final com.izettle.android.auth.services.OAuthService oAuthService;
    private final com.izettle.android.auth.model.mapper.OAuthTokensMapper oAuthTokensMapper;
    private final java.util.concurrent.CopyOnWriteArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> onRefreshTokenInvalidatedListeners;
    private final com.izettle.android.auth.TokenRepository tokenRepository;

    public TokenManagerImpl(com.izettle.android.auth.TokenRepository tokenRepository, com.izettle.android.auth.services.OAuthService oAuthService, com.izettle.android.auth.ClientDataProvider clientDataProvider, com.izettle.android.auth.model.mapper.OAuthTokensMapper oAuthTokensMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientDataProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthTokensMapper, "");
        this.tokenRepository = tokenRepository;
        this.oAuthService = oAuthService;
        this.clientDataProvider = clientDataProvider;
        this.oAuthTokensMapper = oAuthTokensMapper;
        this.lock = new java.util.concurrent.locks.ReentrantLock();
        this.onRefreshTokenInvalidatedListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
    }

    public /* synthetic */ TokenManagerImpl(com.izettle.android.auth.TokenRepository tokenRepository, com.izettle.android.auth.services.OAuthService oAuthService, com.izettle.android.auth.ClientDataProvider clientDataProvider, com.izettle.android.auth.model.mapper.OAuthTokensMapper oAuthTokensMapper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(tokenRepository, oAuthService, clientDataProvider, (i & 8) != 0 ? new com.izettle.android.auth.model.mapper.OAuthTokensMapper() : oAuthTokensMapper);
    }

    private final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> getTokensFromRefreshToken(com.izettle.android.auth.token.RefreshGetTokensSpec getTokensSpec) {
        return refresh$auth_release$default(this, new com.izettle.android.auth.model.OAuthTokens(null, getTokensSpec.getRefreshToken(), null, null, 13, null), 0, false, false, 2, null);
    }

    private final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> getTokensFromOAuthSpec(com.izettle.android.auth.token.OAuthGetTokensSpec oAuthGetTokensSpec) {
        com.izettle.android.core.data.result.Success asSuccess;
        com.izettle.android.core.data.result.Result accessTokenFromCode = this.oAuthService.getAccessTokenFromCode(oAuthGetTokensSpec.getCode(), oAuthGetTokensSpec.getClientId(), oAuthGetTokensSpec.getRedirectUri(), oAuthGetTokensSpec.getCodeVerifier());
        if (accessTokenFromCode instanceof com.izettle.android.core.data.result.Success) {
            com.izettle.android.net.Response response = (com.izettle.android.net.Response) ((com.izettle.android.core.data.result.Success) accessTokenFromCode).getValue();
            com.izettle.android.auth.dto.TokenResponse tokenResponse = (com.izettle.android.auth.dto.TokenResponse) response.getBody();
            if (tokenResponse != null && (asSuccess = com.izettle.android.core.data.result.ResultKt.asSuccess(this.oAuthTokensMapper.map(tokenResponse))) != null) {
                return asSuccess;
            }
            return com.izettle.android.core.data.result.ResultKt.asFailure(com.izettle.android.auth.ExtensionsKt.toException(response));
        }
        if (accessTokenFromCode instanceof com.izettle.android.core.data.result.Failure) {
            return accessTokenFromCode;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> getTokensFromCredentials(com.izettle.android.auth.token.CredentialsGetTokenSpec credentialsGetTokenSpec) {
        com.izettle.android.core.data.result.Result result;
        com.izettle.android.core.data.result.Success asSuccess;
        java.lang.String userUuid = credentialsGetTokenSpec.getUserUuid();
        if (userUuid == null || userUuid.length() == 0) {
            result = this.oAuthService.getAccessToken(this.clientDataProvider.getClientId(), credentialsGetTokenSpec.getUsername(), credentialsGetTokenSpec.getPassword(), credentialsGetTokenSpec.getTotp());
        } else {
            result = this.oAuthService.getAccessTokenForLoggedInAs(this.clientDataProvider.getClientId(), credentialsGetTokenSpec.getUsername(), credentialsGetTokenSpec.getPassword(), credentialsGetTokenSpec.getUserUuid(), credentialsGetTokenSpec.getTotp());
        }
        if (result instanceof com.izettle.android.core.data.result.Success) {
            com.izettle.android.net.Response response = (com.izettle.android.net.Response) ((com.izettle.android.core.data.result.Success) result).getValue();
            com.izettle.android.auth.dto.TokenResponse tokenResponse = (com.izettle.android.auth.dto.TokenResponse) response.getBody();
            if (tokenResponse != null && (asSuccess = com.izettle.android.core.data.result.ResultKt.asSuccess(this.oAuthTokensMapper.map(tokenResponse))) != null) {
                return asSuccess;
            }
            return com.izettle.android.core.data.result.ResultKt.asFailure(com.izettle.android.auth.ExtensionsKt.toException(response));
        }
        if (result instanceof com.izettle.android.core.data.result.Failure) {
            return result;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> getDefaultTokens() {
        java.lang.Object obj;
        com.izettle.android.core.data.result.Success asSuccess;
        java.util.Iterator<T> it = this.tokenRepository.getTokens().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.izettle.android.auth.model.OAuthTokens) obj).getRefreshToken() != null) {
                break;
            }
        }
        com.izettle.android.auth.model.OAuthTokens oAuthTokens = (com.izettle.android.auth.model.OAuthTokens) obj;
        if (oAuthTokens != null && (asSuccess = com.izettle.android.core.data.result.ResultKt.asSuccess(oAuthTokens)) != null) {
            return asSuccess;
        }
        return com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalStateException("No tokens present"));
    }

    public final void refreshAccessTokenIfNeeded$auth_release() {
        java.util.List<com.izettle.android.auth.model.OAuthTokens> tokens = this.tokenRepository.getTokens();
        java.lang.String refreshToken = this.tokenRepository.getRefreshToken();
        if (refreshToken != null && tokens.isEmpty()) {
            refresh$auth_release$default(this, new com.izettle.android.auth.model.OAuthTokens(null, refreshToken, null, null, 13, null), 0, false, false, 14, null);
            return;
        }
        java.util.Iterator<T> it = tokens.iterator();
        while (it.hasNext()) {
            refresh$auth_release$default(this, (com.izettle.android.auth.model.OAuthTokens) it.next(), 0, false, false, 14, null);
        }
    }

    public static /* synthetic */ com.izettle.android.core.data.result.Result refresh$auth_release$default(com.izettle.android.auth.token.TokenManagerImpl tokenManagerImpl, com.izettle.android.auth.model.OAuthTokens oAuthTokens, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        return tokenManagerImpl.refresh$auth_release(oAuthTokens, i, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x011f, code lost:
    
        return com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("Access token not expired"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> refresh$auth_release(com.izettle.android.auth.model.OAuthTokens oAuthTokens, int attempt, boolean notifyOnRefreshTokenInvalidated, boolean storeRetrievedTokenPair) {
        java.lang.RuntimeException runtimeException;
        java.util.Date expirationDate;
        com.izettle.android.auth.model.OAuthTokens oAuthTokens2 = oAuthTokens;
        while (true) {
            java.lang.String refreshToken = oAuthTokens2 != null ? oAuthTokens2.getRefreshToken() : null;
            if (refreshToken == null && oAuthTokens2 != null && (expirationDate = oAuthTokens2.getExpirationDate()) != null && expirationDate.before(new java.util.Date())) {
                deleteAccessToken(oAuthTokens2.getAccessToken());
                return com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalArgumentException("refreshToken missing"));
            }
            if (refreshToken == null || oAuthTokens2.getExpirationDate().after(new java.util.Date())) {
                break;
            }
            deleteAccessToken(oAuthTokens2.getAccessToken());
            com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<com.izettle.android.auth.dto.TokenResponse>, java.lang.Throwable> refreshAccessToken = this.oAuthService.refreshAccessToken(refreshToken, this.clientDataProvider.getClientId());
            if (refreshAccessToken instanceof com.izettle.android.core.data.result.Success) {
                com.izettle.android.net.Response response = (com.izettle.android.net.Response) ((com.izettle.android.core.data.result.Success) refreshAccessToken).getValue();
                if (response.isSuccessful()) {
                    com.izettle.android.auth.dto.TokenResponse tokenResponse = (com.izettle.android.auth.dto.TokenResponse) response.getBody();
                    if (tokenResponse != null) {
                        com.izettle.android.auth.model.OAuthTokens map = this.oAuthTokensMapper.map(tokenResponse);
                        if (storeRetrievedTokenPair) {
                            com.izettle.android.core.data.result.Result storeTokenPair = storeTokenPair(map, this.tokenRepository.isNativeLogin());
                            if (storeTokenPair instanceof com.izettle.android.core.data.result.Success) {
                                return new com.izettle.android.core.data.result.Success(map);
                            }
                            if (storeTokenPair instanceof com.izettle.android.core.data.result.Failure) {
                                return storeTokenPair;
                            }
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return com.izettle.android.core.data.result.ResultKt.asSuccess(map);
                    }
                } else if (response.getCode() == 400) {
                    if (notifyOnRefreshTokenInvalidated) {
                        java.util.Iterator<T> it = this.onRefreshTokenInvalidatedListeners.iterator();
                        while (it.hasNext()) {
                            ((kotlin.jvm.functions.Function0) it.next()).invoke();
                        }
                    }
                    this.tokenRepository.deleteRefreshToken();
                    return com.izettle.android.core.data.result.ResultKt.asFailure(new com.izettle.android.auth.exceptions.InvalidRefreshTokenException("Failed to generate access token from refreshToken"));
                }
            }
            if (attempt >= 3) {
                if (refreshAccessToken instanceof com.izettle.android.core.data.result.Failure) {
                    runtimeException = new java.lang.RuntimeException((java.lang.Throwable) ((com.izettle.android.core.data.result.Failure) refreshAccessToken).getError());
                } else {
                    runtimeException = new java.lang.RuntimeException("Failed to refresh accessToken");
                }
                return com.izettle.android.core.data.result.ResultKt.asFailure(runtimeException);
            }
            oAuthTokens2 = com.izettle.android.auth.model.OAuthTokens.copy$default(oAuthTokens2, null, null, null, null, 14, null);
            attempt++;
        }
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final java.lang.String getAccessToken(java.lang.String... scopes) {
        com.izettle.android.auth.model.OAuthTokens oAuthTokens;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopes, "");
        java.util.concurrent.locks.Lock lock = this.lock;
        lock.lock();
        try {
            refreshAccessTokenIfNeeded$auth_release();
            java.util.List<com.izettle.android.auth.model.OAuthTokens> tokens = this.tokenRepository.getTokens();
            java.util.List list = kotlin.collections.ArraysKt.toList(scopes);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : tokens) {
                if (((com.izettle.android.auth.model.OAuthTokens) obj).getAccessToken() != null) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList<com.izettle.android.auth.model.OAuthTokens> arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (com.izettle.android.auth.model.OAuthTokens oAuthTokens2 : arrayList2) {
                arrayList3.add(kotlin.TuplesKt.to(oAuthTokens2, java.lang.Integer.valueOf(kotlin.collections.CollectionsKt.intersect(oAuthTokens2.getScopes(), list).size())));
            }
            final java.util.Comparator comparator = new java.util.Comparator() { // from class: com.izettle.android.auth.token.TokenManagerImpl$getAccessToken$lambda$14$$inlined$compareByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Comparable) ((kotlin.Pair) t2).getSecond(), (java.lang.Comparable) ((kotlin.Pair) t).getSecond());
                }
            };
            kotlin.Pair pair = (kotlin.Pair) kotlin.collections.CollectionsKt.firstOrNull(kotlin.collections.CollectionsKt.sortedWith(arrayList3, new java.util.Comparator() { // from class: com.izettle.android.auth.token.TokenManagerImpl$getAccessToken$lambda$14$$inlined$thenByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int compare = comparator.compare(t, t2);
                    return compare != 0 ? compare : kotlin.comparisons.ComparisonsKt.compareValues(((com.izettle.android.auth.model.OAuthTokens) ((kotlin.Pair) t2).getFirst()).getExpirationDate(), ((com.izettle.android.auth.model.OAuthTokens) ((kotlin.Pair) t).getFirst()).getExpirationDate());
                }
            }));
            return (pair == null || (oAuthTokens = (com.izettle.android.auth.model.OAuthTokens) pair.getFirst()) == null) ? null : oAuthTokens.getAccessToken();
        } finally {
            lock.unlock();
        }
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final java.lang.String getExactAccessToken(java.lang.String... scopes) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopes, "");
        refreshAccessTokenIfNeeded$auth_release();
        java.util.List<com.izettle.android.auth.model.OAuthTokens> tokens = this.tokenRepository.getTokens();
        java.util.List list = kotlin.collections.ArraysKt.toList(scopes);
        java.util.Iterator<T> it = tokens.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.izettle.android.auth.model.OAuthTokens) obj).getScopes().containsAll(list)) {
                break;
            }
        }
        com.izettle.android.auth.model.OAuthTokens oAuthTokens = (com.izettle.android.auth.model.OAuthTokens) obj;
        if (oAuthTokens != null) {
            return oAuthTokens.getAccessToken();
        }
        return null;
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> storeTokenPair(com.izettle.android.auth.model.OAuthTokens oAuthTokens, boolean isNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthTokens, "");
        return this.tokenRepository.storeTokens(oAuthTokens, isNative);
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> refreshAccessToken() {
        java.util.List<com.izettle.android.auth.model.OAuthTokens> tokens = this.tokenRepository.getTokens();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : tokens) {
            if (((com.izettle.android.auth.model.OAuthTokens) obj).getRefreshToken() != null) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((com.izettle.android.auth.model.OAuthTokens) it.next()).getAccessToken());
        }
        com.izettle.android.auth.TokenRepository tokenRepository = this.tokenRepository;
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            tokenRepository.deleteAccessToken((java.lang.String) it2.next());
        }
        return refresh$auth_release$default(this, new com.izettle.android.auth.model.OAuthTokens(null, this.tokenRepository.getRefreshToken(), null, null, 13, null), 0, false, false, 14, null);
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final void deleteAccessToken(java.lang.String token) {
        this.tokenRepository.deleteAccessToken(token);
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final com.izettle.android.core.data.result.Result<java.lang.String, java.lang.Throwable> getOneTimeToken() {
        java.lang.String oneTimeToken;
        com.izettle.android.core.data.result.Result asSuccess;
        java.lang.String refreshToken = this.tokenRepository.getRefreshToken();
        if (refreshToken != null) {
            com.izettle.android.core.data.result.Result oneTimeToken2 = this.oAuthService.getOneTimeToken(this.clientDataProvider.getClientId(), refreshToken);
            if (oneTimeToken2 instanceof com.izettle.android.core.data.result.Success) {
                com.izettle.android.net.Response response = (com.izettle.android.net.Response) ((com.izettle.android.core.data.result.Success) oneTimeToken2).getValue();
                com.izettle.android.auth.dto.OneTimeTokenResponse oneTimeTokenResponse = (com.izettle.android.auth.dto.OneTimeTokenResponse) response.getBody();
                oneTimeToken2 = (oneTimeTokenResponse == null || (oneTimeToken = oneTimeTokenResponse.getOneTimeToken()) == null || (asSuccess = com.izettle.android.core.data.result.ResultKt.asSuccess(oneTimeToken)) == null) ? com.izettle.android.core.data.result.ResultKt.asFailure(com.izettle.android.auth.ExtensionsKt.toException(response)) : asSuccess;
            } else if (!(oneTimeToken2 instanceof com.izettle.android.core.data.result.Failure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (oneTimeToken2 != null) {
                return oneTimeToken2;
            }
        }
        return com.izettle.android.core.data.result.ResultKt.asFailure(new java.lang.IllegalStateException("refreshToken == null"));
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final java.lang.String getRefreshToken() {
        return this.tokenRepository.getRefreshToken();
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> getTokens(com.izettle.android.auth.token.GetTokensSpec getTokensSpec) {
        com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> tokensFromRefreshToken;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTokensSpec, "");
        java.util.concurrent.locks.Lock lock = this.lock;
        lock.lock();
        try {
            if (getTokensSpec instanceof com.izettle.android.auth.token.DefaultGetTokensSpec) {
                tokensFromRefreshToken = getDefaultTokens();
            } else if (getTokensSpec instanceof com.izettle.android.auth.token.OAuthGetTokensSpec) {
                tokensFromRefreshToken = getTokensFromOAuthSpec((com.izettle.android.auth.token.OAuthGetTokensSpec) getTokensSpec);
            } else if (getTokensSpec instanceof com.izettle.android.auth.token.CredentialsGetTokenSpec) {
                tokensFromRefreshToken = getTokensFromCredentials((com.izettle.android.auth.token.CredentialsGetTokenSpec) getTokensSpec);
            } else {
                if (!(getTokensSpec instanceof com.izettle.android.auth.token.RefreshGetTokensSpec)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                tokensFromRefreshToken = getTokensFromRefreshToken((com.izettle.android.auth.token.RefreshGetTokensSpec) getTokensSpec);
            }
            return tokensFromRefreshToken;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final void addOnRefreshTokenInvalidatedListener(kotlin.jvm.functions.Function0<kotlin.Unit> onInvalidated) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onInvalidated, "");
        this.onRefreshTokenInvalidatedListeners.add(onInvalidated);
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final void removeOnRefreshTokenInvalidatedListener(kotlin.jvm.functions.Function0<kotlin.Unit> onInvalidated) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onInvalidated, "");
        this.onRefreshTokenInvalidatedListeners.remove(onInvalidated);
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> deleteRefreshToken() {
        java.util.concurrent.locks.Lock lock = this.lock;
        lock.lock();
        try {
            return this.tokenRepository.deleteRefreshToken();
        } finally {
            lock.unlock();
        }
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> clear() {
        java.util.concurrent.locks.Lock lock = this.lock;
        lock.lock();
        try {
            return this.tokenRepository.clear();
        } finally {
            lock.unlock();
        }
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final void applyClearToTransaction(com.izettle.android.auth.storage.Transaction transaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        this.tokenRepository.applyClearToTransaction(transaction);
    }

    @Override // com.izettle.android.auth.token.TokenManager
    public final void applyStoreCanonicalTokensToTransaction(com.izettle.android.auth.storage.Transaction transaction, com.izettle.android.auth.model.OAuthTokens oAuthTokens, boolean isNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthTokens, "");
        this.tokenRepository.applyStoreCanonicalTokensToTransaction(transaction, oAuthTokens, isNative);
    }
}
