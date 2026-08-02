package com.izettle.android.auth;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!"}, d2 = {"Lcom/izettle/android/auth/OAuthUriManagerImpl;", "Lcom/izettle/android/auth/OAuthUriManager;", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "baseUriRepository", "Lcom/izettle/android/auth/repository/CodeVerifierRepository;", "codeVerifierRepository", "Lcom/izettle/android/auth/ClientDataProvider;", "clientDataProvider", "<init>", "(Lcom/izettle/android/auth/repository/BaseUriRepository;Lcom/izettle/android/auth/repository/CodeVerifierRepository;Lcom/izettle/android/auth/ClientDataProvider;)V", "", "clear", "()V", "Lcom/izettle/android/auth/OAuthUriSpec;", "spec", "Lcom/izettle/android/core/data/result/Result;", "Landroid/net/Uri;", "", "createOAuthUri", "(Lcom/izettle/android/auth/OAuthUriSpec;)Lcom/izettle/android/core/data/result/Result;", "", "key", "createOAuthUriAndStoreCodeVerifier", "(Ljava/lang/String;Lcom/izettle/android/auth/OAuthUriSpec;)Lcom/izettle/android/core/data/result/Result;", "deleteCodeVerifier", "(Ljava/lang/String;)V", "codeVerifier", "generateOAuthUri", "(Lcom/izettle/android/auth/OAuthUriSpec;Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "getCodeVerifier", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "Lcom/izettle/android/auth/ClientDataProvider;", "Lcom/izettle/android/auth/repository/CodeVerifierRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OAuthUriManagerImpl implements com.izettle.android.auth.OAuthUriManager {
    private final com.izettle.android.auth.repository.BaseUriRepository baseUriRepository;
    private final com.izettle.android.auth.ClientDataProvider clientDataProvider;
    private final com.izettle.android.auth.repository.CodeVerifierRepository codeVerifierRepository;

    public OAuthUriManagerImpl(com.izettle.android.auth.repository.BaseUriRepository baseUriRepository, com.izettle.android.auth.repository.CodeVerifierRepository codeVerifierRepository, com.izettle.android.auth.ClientDataProvider clientDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUriRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeVerifierRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientDataProvider, "");
        this.baseUriRepository = baseUriRepository;
        this.codeVerifierRepository = codeVerifierRepository;
        this.clientDataProvider = clientDataProvider;
    }

    private final com.izettle.android.core.data.result.Result<android.net.Uri, java.lang.Throwable> generateOAuthUri(com.izettle.android.auth.OAuthUriSpec spec, java.lang.String codeVerifier) {
        java.lang.String generateCodeChallenge;
        com.izettle.android.core.data.result.Result oAuth2ServiceUrls = this.baseUriRepository.getOAuth2ServiceUrls();
        if (oAuth2ServiceUrls instanceof com.izettle.android.core.data.result.Success) {
            android.net.Uri.Builder appendQueryParameter = android.net.Uri.parse(((com.izettle.android.auth.model.ServiceUrls) ((com.izettle.android.core.data.result.Success) oAuth2ServiceUrls).getValue()).getCurrent().getUrl()).buildUpon().appendPath(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.AUTHORIZE).appendQueryParameter(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CLIENT_ID_KEY, this.clientDataProvider.getClientId()).appendQueryParameter(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, kotlin.collections.ArraysKt.joinToString$default(spec.getScopes(), " ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null)).appendQueryParameter("redirect_uri", this.clientDataProvider.getOAuthCallbackUrl());
            generateCodeChallenge = com.izettle.android.auth.OAuthUriManagerKt.generateCodeChallenge(codeVerifier);
            android.net.Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CODE_CHALLENGE_KEY, generateCodeChallenge).appendQueryParameter(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CODE_CHALLENGE_METHOD_KEY, com.paypal.oslo.feature.identity.sso.data.mapper.PKCEChallengeMethodMapper.S256_STRING).appendQueryParameter("response_type", "code").appendQueryParameter(com.datadog.android.rum.internal.metric.SessionEndedMetric.PROCESS_TYPE_VALUE, this.clientDataProvider.getAppName()).appendQueryParameter("prompt", spec.getType().getPrompt()).appendQueryParameter(com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder.QUERY_PARAM_APP_VERSION, this.clientDataProvider.getAppVersion()).appendQueryParameter("os", com.datadog.android.core.internal.CoreFeature.DEFAULT_SOURCE_NAME).appendQueryParameter("os_version", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT)).appendQueryParameter("udid", this.clientDataProvider.getClientInfo().getUniqueDeviceId());
            java.lang.String language = spec.getLocale().getLanguage();
            java.lang.String country = spec.getLocale().getCountry();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(language);
            sb.append("_");
            sb.append(country);
            android.net.Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("locale", sb.toString());
            java.lang.String state = spec.getState();
            if (state != null) {
                appendQueryParameter3.appendQueryParameter("state", state);
            }
            java.lang.String username = spec.getUsername();
            if (username != null) {
                appendQueryParameter3.appendQueryParameter(androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, username);
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : spec.getExtraQueryParams().entrySet()) {
                appendQueryParameter3.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return new com.izettle.android.core.data.result.Success(appendQueryParameter3.build());
        }
        if (oAuth2ServiceUrls instanceof com.izettle.android.core.data.result.Failure) {
            return oAuth2ServiceUrls;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.OAuthUriManager
    public final com.izettle.android.core.data.result.Result<android.net.Uri, java.lang.Throwable> createOAuthUriAndStoreCodeVerifier(java.lang.String key, com.izettle.android.auth.OAuthUriSpec spec) {
        java.lang.String generateCodeVerifier;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spec, "");
        generateCodeVerifier = com.izettle.android.auth.OAuthUriManagerKt.generateCodeVerifier();
        com.izettle.android.core.data.result.Result<android.net.Uri, java.lang.Throwable> generateOAuthUri = generateOAuthUri(spec, generateCodeVerifier);
        if (generateOAuthUri instanceof com.izettle.android.core.data.result.Success) {
            this.codeVerifierRepository.saveCodeVerifier(key, generateCodeVerifier);
        }
        return generateOAuthUri;
    }

    @Override // com.izettle.android.auth.OAuthUriManager
    public final com.izettle.android.core.data.result.Result<android.net.Uri, java.lang.Throwable> createOAuthUri(com.izettle.android.auth.OAuthUriSpec spec) {
        java.lang.String generateCodeVerifier;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spec, "");
        generateCodeVerifier = com.izettle.android.auth.OAuthUriManagerKt.generateCodeVerifier();
        return generateOAuthUri(spec, generateCodeVerifier);
    }

    @Override // com.izettle.android.auth.OAuthUriManager
    public final java.lang.String getCodeVerifier(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.codeVerifierRepository.getCodeVerifier(key);
    }

    @Override // com.izettle.android.auth.OAuthUriManager
    public final void deleteCodeVerifier(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.codeVerifierRepository.deleteCodeVerifier(key);
    }

    @Override // com.izettle.android.auth.OAuthUriManager
    public final void clear() {
        this.codeVerifierRepository.clear();
    }
}
