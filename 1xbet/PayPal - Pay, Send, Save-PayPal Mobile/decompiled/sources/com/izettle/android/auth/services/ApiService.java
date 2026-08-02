package com.izettle.android.auth.services;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J+\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/izettle/android/auth/services/ApiService;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/net/Response;", "", "getConfigData", "(Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/dto/RevisitResponsePayload;", "revisit", "()Lcom/izettle/android/core/data/result/Result;", "Ljava/io/File;", "file", "uploadedFilename", "Lcom/izettle/android/net/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "", "upload", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/izettle/android/net/ContentType;)Lcom/izettle/android/core/data/result/Result;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ApiService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.services.ApiService.Companion INSTANCE = com.izettle.android.auth.services.ApiService.Companion.$$INSTANCE;

    com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<java.lang.String>, java.lang.Throwable> getConfigData(java.lang.String token);

    com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<com.izettle.android.auth.dto.RevisitResponsePayload>, java.lang.Throwable> revisit();

    com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> upload(java.lang.String token, java.io.File file, java.lang.String uploadedFilename, com.izettle.android.net.ContentType contentType);

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/izettle/android/auth/services/ApiService$Companion;", "", "<init>", "()V", "Lcom/izettle/android/net/HttpClient;", "httpClient", "Lcom/izettle/android/auth/token/TokenManager;", "tokenManager", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "baseUriRepository", "Lcom/izettle/android/auth/ClientDataProvider;", "clientDataProvider", "Lcom/izettle/android/auth/services/ApiService;", "create", "(Lcom/izettle/android/net/HttpClient;Lcom/izettle/android/auth/token/TokenManager;Lcom/izettle/android/auth/repository/BaseUriRepository;Lcom/izettle/android/auth/ClientDataProvider;)Lcom/izettle/android/auth/services/ApiService;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.auth.services.ApiService.Companion $$INSTANCE = new com.izettle.android.auth.services.ApiService.Companion();

        private Companion() {
        }

        public final com.izettle.android.auth.services.ApiService create(com.izettle.android.net.HttpClient httpClient, com.izettle.android.auth.token.TokenManager tokenManager, com.izettle.android.auth.repository.BaseUriRepository baseUriRepository, com.izettle.android.auth.ClientDataProvider clientDataProvider) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUriRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientDataProvider, "");
            return new com.izettle.android.auth.services.ApiServiceImpl(httpClient, tokenManager, baseUriRepository, clientDataProvider);
        }
    }
}
