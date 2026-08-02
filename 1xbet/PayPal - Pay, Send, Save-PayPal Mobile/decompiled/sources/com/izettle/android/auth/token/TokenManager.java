package com.izettle.android.auth.token;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u0000 *2\u00020\u0001:\u0001*J\u001d\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u0011H&¢\u0006\u0004\b\u0019\u0010\u0014J%\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u001a\"\u00020\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001e\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u001a\"\u00020\u0015H&¢\u0006\u0004\b\u001e\u0010\u001dJ\u001b\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u0011H&¢\u0006\u0004\b\u001f\u0010\u0014J\u0011\u0010 \u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b \u0010!J#\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0011H&¢\u0006\u0004\b&\u0010\u0014J\u001d\u0010'\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b'\u0010\u0006J+\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b(\u0010)"}, d2 = {"Lcom/izettle/android/auth/token/TokenManager;", "", "Lkotlin/Function0;", "", "onInvalidated", "addOnRefreshTokenInvalidatedListener", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/izettle/android/auth/storage/Transaction;", "transaction", "applyClearToTransaction", "(Lcom/izettle/android/auth/storage/Transaction;)V", "Lcom/izettle/android/auth/model/OAuthTokens;", "oAuthTokens", "", "isNative", "applyStoreCanonicalTokensToTransaction", "(Lcom/izettle/android/auth/storage/Transaction;Lcom/izettle/android/auth/model/OAuthTokens;Z)V", "Lcom/izettle/android/core/data/result/Result;", "", "clear", "()Lcom/izettle/android/core/data/result/Result;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "deleteAccessToken", "(Ljava/lang/String;)V", "deleteRefreshToken", "", "scopes", "getAccessToken", "([Ljava/lang/String;)Ljava/lang/String;", "getExactAccessToken", "getOneTimeToken", "getRefreshToken", "()Ljava/lang/String;", "Lcom/izettle/android/auth/token/GetTokensSpec;", "getTokensSpec", "getTokens", "(Lcom/izettle/android/auth/token/GetTokensSpec;)Lcom/izettle/android/core/data/result/Result;", "refreshAccessToken", "removeOnRefreshTokenInvalidatedListener", "storeTokenPair", "(Lcom/izettle/android/auth/model/OAuthTokens;Z)Lcom/izettle/android/core/data/result/Result;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TokenManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.token.TokenManager.Companion INSTANCE = com.izettle.android.auth.token.TokenManager.Companion.$$INSTANCE;

    void addOnRefreshTokenInvalidatedListener(kotlin.jvm.functions.Function0<kotlin.Unit> onInvalidated);

    void applyClearToTransaction(com.izettle.android.auth.storage.Transaction transaction);

    void applyStoreCanonicalTokensToTransaction(com.izettle.android.auth.storage.Transaction transaction, com.izettle.android.auth.model.OAuthTokens oAuthTokens, boolean isNative);

    com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> clear();

    void deleteAccessToken(java.lang.String token);

    com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> deleteRefreshToken();

    java.lang.String getAccessToken(java.lang.String... scopes);

    java.lang.String getExactAccessToken(java.lang.String... scopes);

    com.izettle.android.core.data.result.Result<java.lang.String, java.lang.Throwable> getOneTimeToken();

    java.lang.String getRefreshToken();

    com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> getTokens(com.izettle.android.auth.token.GetTokensSpec getTokensSpec);

    com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.OAuthTokens, java.lang.Throwable> refreshAccessToken();

    void removeOnRefreshTokenInvalidatedListener(kotlin.jvm.functions.Function0<kotlin.Unit> onInvalidated);

    com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> storeTokenPair(com.izettle.android.auth.model.OAuthTokens oAuthTokens, boolean isNative);

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/izettle/android/auth/token/TokenManager$Companion;", "", "<init>", "()V", "Lcom/izettle/android/auth/TokenRepository;", "tokenRepository", "Lcom/izettle/android/auth/services/OAuthService;", "oAuthService", "Lcom/izettle/android/auth/ClientDataProvider;", "clientDataProvider", "Lcom/izettle/android/auth/token/TokenManager;", "create", "(Lcom/izettle/android/auth/TokenRepository;Lcom/izettle/android/auth/services/OAuthService;Lcom/izettle/android/auth/ClientDataProvider;)Lcom/izettle/android/auth/token/TokenManager;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.auth.token.TokenManager.Companion $$INSTANCE = new com.izettle.android.auth.token.TokenManager.Companion();

        private Companion() {
        }

        public final com.izettle.android.auth.token.TokenManager create(com.izettle.android.auth.TokenRepository tokenRepository, com.izettle.android.auth.services.OAuthService oAuthService, com.izettle.android.auth.ClientDataProvider clientDataProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthService, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientDataProvider, "");
            return new com.izettle.android.auth.token.TokenManagerImpl(tokenRepository, oAuthService, clientDataProvider, null, 8, null);
        }
    }
}
