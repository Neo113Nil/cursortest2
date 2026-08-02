package com.izettle.android.auth.services;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019JC\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\fJM\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\fJ1\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0017"}, d2 = {"Lcom/izettle/android/auth/services/OAuthService;", "", "", "clientId", androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, "password", "totp", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/net/Response;", "Lcom/izettle/android/auth/dto/TokenResponse;", "", "getAccessToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "loginAsUuid", "getAccessTokenForLoggedInAs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "code", "redirectUri", "codeVerifier", "getAccessTokenFromCode", "refreshToken", "Lcom/izettle/android/auth/dto/OneTimeTokenResponse;", "getOneTimeToken", "(Ljava/lang/String;Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "refreshAccessToken", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface OAuthService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.services.OAuthService.Companion INSTANCE = com.izettle.android.auth.services.OAuthService.Companion.$$INSTANCE;

    @kotlin.Deprecated(message = "The endpoint this API uses under the hood will be sunset in the near future")
    com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<com.izettle.android.auth.dto.TokenResponse>, java.lang.Throwable> getAccessToken(java.lang.String clientId, java.lang.String username, java.lang.String password, java.lang.String totp);

    @kotlin.Deprecated(message = "The endpoint this API uses under the hood will be sunset in the near future")
    com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<com.izettle.android.auth.dto.TokenResponse>, java.lang.Throwable> getAccessTokenForLoggedInAs(java.lang.String clientId, java.lang.String username, java.lang.String password, java.lang.String loginAsUuid, java.lang.String totp);

    com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<com.izettle.android.auth.dto.TokenResponse>, java.lang.Throwable> getAccessTokenFromCode(java.lang.String code, java.lang.String clientId, java.lang.String redirectUri, java.lang.String codeVerifier);

    com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<com.izettle.android.auth.dto.OneTimeTokenResponse>, java.lang.Throwable> getOneTimeToken(java.lang.String clientId, java.lang.String refreshToken);

    com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<com.izettle.android.auth.dto.TokenResponse>, java.lang.Throwable> refreshAccessToken(java.lang.String refreshToken, java.lang.String clientId);

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/izettle/android/auth/services/OAuthService$Companion;", "", "<init>", "()V", "Lcom/izettle/android/net/HttpClient;", "httpClient", "Lcom/izettle/android/auth/repository/ServiceUriRepository;", "serviceUriRepository", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "baseUriRepository", "Lcom/izettle/android/auth/ClientDataProvider;", "clientDataProvider", "Lcom/izettle/android/auth/services/OAuthService;", "create", "(Lcom/izettle/android/net/HttpClient;Lcom/izettle/android/auth/repository/ServiceUriRepository;Lcom/izettle/android/auth/repository/BaseUriRepository;Lcom/izettle/android/auth/ClientDataProvider;)Lcom/izettle/android/auth/services/OAuthService;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.auth.services.OAuthService.Companion $$INSTANCE = new com.izettle.android.auth.services.OAuthService.Companion();

        private Companion() {
        }

        public final com.izettle.android.auth.services.OAuthService create(com.izettle.android.net.HttpClient httpClient, com.izettle.android.auth.repository.ServiceUriRepository serviceUriRepository, com.izettle.android.auth.repository.BaseUriRepository baseUriRepository, com.izettle.android.auth.ClientDataProvider clientDataProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceUriRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUriRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientDataProvider, "");
            return new com.izettle.android.auth.services.OAuthServiceImpl(httpClient, serviceUriRepository, baseUriRepository, clientDataProvider);
        }
    }
}
