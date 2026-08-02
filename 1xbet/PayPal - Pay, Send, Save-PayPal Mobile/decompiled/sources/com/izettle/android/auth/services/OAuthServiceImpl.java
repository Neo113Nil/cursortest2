package com.izettle.android.auth.services;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00020\u00120\u0010\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014JK\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00102.\u0010\u0018\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00160\u0015\"\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b \u0010!JM\u0010#\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0017¢\u0006\u0004\b#\u0010$JA\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010%\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b(\u0010!J1\u0010+\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0016¢\u0006\u0004\b+\u0010,J1\u0010-\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010)\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101"}, d2 = {"Lcom/izettle/android/auth/services/OAuthServiceImpl;", "Lcom/izettle/android/auth/services/OAuthService;", "Lcom/izettle/android/net/HttpClient;", "httpClient", "Lcom/izettle/android/auth/repository/ServiceUriRepository;", "serviceUriRepository", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "baseUriRepository", "Lcom/izettle/android/auth/ClientDataProvider;", "clientDataProvider", "<init>", "(Lcom/izettle/android/net/HttpClient;Lcom/izettle/android/auth/repository/ServiceUriRepository;Lcom/izettle/android/auth/repository/BaseUriRepository;Lcom/izettle/android/auth/ClientDataProvider;)V", "", "T", "Lcom/izettle/android/net/Request;", "request", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/net/Response;", "", "executeRequest", "(Lcom/izettle/android/net/Request;)Lcom/izettle/android/core/data/result/Result;", "", "Lkotlin/Pair;", "", "nameValuePairs", "generateRequest", "([Lkotlin/Pair;)Lcom/izettle/android/core/data/result/Result;", "clientId", androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, "password", "totp", "Lcom/izettle/android/auth/dto/TokenResponse;", "getAccessToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "loginAsUuid", "getAccessTokenForLoggedInAs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "code", "redirectUri", "codeVerifier", "getAccessTokenFromCode", "refreshToken", "Lcom/izettle/android/auth/dto/OneTimeTokenResponse;", "getOneTimeToken", "(Ljava/lang/String;Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "refreshAccessToken", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "Lcom/izettle/android/auth/ClientDataProvider;", "Lcom/izettle/android/net/HttpClient;", "Lcom/izettle/android/auth/repository/ServiceUriRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OAuthServiceImpl implements com.izettle.android.auth.services.OAuthService {
    private final com.izettle.android.auth.repository.BaseUriRepository baseUriRepository;
    private final com.izettle.android.auth.ClientDataProvider clientDataProvider;
    private final com.izettle.android.net.HttpClient httpClient;
    private final com.izettle.android.auth.repository.ServiceUriRepository serviceUriRepository;

    public OAuthServiceImpl(com.izettle.android.net.HttpClient httpClient, com.izettle.android.auth.repository.ServiceUriRepository serviceUriRepository, com.izettle.android.auth.repository.BaseUriRepository baseUriRepository, com.izettle.android.auth.ClientDataProvider clientDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceUriRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUriRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientDataProvider, "");
        this.httpClient = httpClient;
        this.serviceUriRepository = serviceUriRepository;
        this.baseUriRepository = baseUriRepository;
        this.clientDataProvider = clientDataProvider;
    }

    private final com.izettle.android.core.data.result.Result<com.izettle.android.net.Request, java.lang.Throwable> generateRequest(final kotlin.Pair<java.lang.String, ? extends java.lang.Object>... nameValuePairs) {
        com.izettle.android.core.data.result.Result oAuthServiceUrls = this.baseUriRepository.getOAuthServiceUrls();
        if (oAuthServiceUrls instanceof com.izettle.android.core.data.result.Success) {
            final com.izettle.android.auth.model.ServiceUrls serviceUrls = (com.izettle.android.auth.model.ServiceUrls) ((com.izettle.android.core.data.result.Success) oAuthServiceUrls).getValue();
            return new com.izettle.android.core.data.result.Success(com.izettle.android.net.RequestKt.request(new kotlin.jvm.functions.Function1<com.izettle.android.net.Request.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.OAuthServiceImpl$generateRequest$1$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Request.Builder builder) {
                    Camera2StreamConfigurationMap(builder);
                    return kotlin.Unit.INSTANCE;
                }

                public final void Camera2StreamConfigurationMap(com.izettle.android.net.Request.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    builder.setUrl(com.izettle.android.auth.model.ServiceUrls.this.getCurrent().newBuilder().pathSegments(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY).build());
                    builder.setMethod(com.izettle.android.net.HttpMethod.POST);
                    final com.izettle.android.auth.services.OAuthServiceImpl oAuthServiceImpl = this;
                    builder.headers(new kotlin.jvm.functions.Function1<com.izettle.android.net.Headers, kotlin.Unit>() { // from class: com.izettle.android.auth.services.OAuthServiceImpl$generateRequest$1$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Headers headers) {
                            getHighSpeedVideoFpsRanges(headers);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighSpeedVideoFpsRanges(com.izettle.android.net.Headers headers) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
                            final com.izettle.android.auth.services.OAuthServiceImpl oAuthServiceImpl2 = com.izettle.android.auth.services.OAuthServiceImpl.this;
                            headers.header(new kotlin.jvm.functions.Function1<com.izettle.android.net.Header.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.OAuthServiceImpl.generateRequest.1.1.1.1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Header.Builder builder2) {
                                    getHighSpeedVideoFpsRanges(builder2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void getHighSpeedVideoFpsRanges(com.izettle.android.net.Header.Builder builder2) {
                                    com.izettle.android.auth.ClientDataProvider clientDataProvider;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder2, "");
                                    builder2.setName("UDID");
                                    clientDataProvider = com.izettle.android.auth.services.OAuthServiceImpl.this.clientDataProvider;
                                    builder2.setValue(clientDataProvider.getClientInfo().getUniqueDeviceId());
                                }

                                {
                                    super(1);
                                }
                            });
                        }

                        {
                            super(1);
                        }
                    });
                    final kotlin.Pair<java.lang.String, java.lang.Object>[] pairArr = nameValuePairs;
                    builder.formUrlEncodedBody(new kotlin.jvm.functions.Function1<com.izettle.android.net.FormUrlEncodedBody.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.OAuthServiceImpl$generateRequest$1$1.2
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.FormUrlEncodedBody.Builder builder2) {
                            getHighResolutionOutputSizeshNQ4ISI(builder2);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighResolutionOutputSizeshNQ4ISI(com.izettle.android.net.FormUrlEncodedBody.Builder builder2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder2, "");
                            for (kotlin.Pair<java.lang.String, java.lang.Object> pair : pairArr) {
                                final java.lang.String component1 = pair.component1();
                                final java.lang.Object component2 = pair.component2();
                                if (component2 != null) {
                                    builder2.field(new kotlin.jvm.functions.Function1<com.izettle.android.net.Field.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.OAuthServiceImpl$generateRequest$1$1$2$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Field.Builder builder3) {
                                            getHighSpeedVideoFpsRanges(builder3);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void getHighSpeedVideoFpsRanges(com.izettle.android.net.Field.Builder builder3) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder3, "");
                                            builder3.setName(component1);
                                            builder3.setValue(component2);
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }
                                    });
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    });
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            }));
        }
        if (oAuthServiceUrls instanceof com.izettle.android.core.data.result.Failure) {
            return oAuthServiceUrls;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private final /* synthetic */ <T> com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<T>, java.lang.Throwable> executeRequest(com.izettle.android.net.Request request) {
        try {
            com.izettle.android.net.HttpClient httpClient = this.httpClient;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            com.izettle.android.net.Response<T> executeRequest = httpClient.executeRequest(request, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
            int code = executeRequest.getCode();
            if (500 <= code && code < 601) {
                this.serviceUriRepository.invalidateUrl(executeRequest.getRequest().getUrl());
            }
            return com.izettle.android.core.data.result.ResultKt.asSuccess(executeRequest);
        } catch (java.lang.Throwable th) {
            return com.izettle.android.core.data.result.ResultKt.asFailure(th);
        }
    }

    @Override // com.izettle.android.auth.services.OAuthService
    @kotlin.Deprecated(message = "The endpoint this API uses under the hood will be sunset in the near future")
    public final com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<com.izettle.android.auth.dto.TokenResponse>, java.lang.Throwable> getAccessToken(java.lang.String clientId, java.lang.String username, java.lang.String password, java.lang.String totp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        com.izettle.android.core.data.result.Result generateRequest = generateRequest(kotlin.TuplesKt.to(com.visa.cbp.getDeviceCerts.setTokenInfo, com.izettle.android.auth.GrantType.PASSWORD.getValue()), kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CLIENT_ID_KEY, clientId), kotlin.TuplesKt.to(androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, username), kotlin.TuplesKt.to("password", password), kotlin.TuplesKt.to("totp", totp));
        if (generateRequest instanceof com.izettle.android.core.data.result.Success) {
            try {
                com.izettle.android.net.Response executeRequest = this.httpClient.executeRequest((com.izettle.android.net.Request) ((com.izettle.android.core.data.result.Success) generateRequest).getValue(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.dto.TokenResponse.class));
                int code = executeRequest.getCode();
                if (500 <= code && code < 601) {
                    this.serviceUriRepository.invalidateUrl(executeRequest.getRequest().getUrl());
                }
                return com.izettle.android.core.data.result.ResultKt.asSuccess(executeRequest);
            } catch (java.lang.Throwable th) {
                return com.izettle.android.core.data.result.ResultKt.asFailure(th);
            }
        }
        if (generateRequest instanceof com.izettle.android.core.data.result.Failure) {
            return generateRequest;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.services.OAuthService
    @kotlin.Deprecated(message = "The endpoint this API uses under the hood will be sunset in the near future")
    public final com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<com.izettle.android.auth.dto.TokenResponse>, java.lang.Throwable> getAccessTokenForLoggedInAs(java.lang.String clientId, java.lang.String username, java.lang.String password, java.lang.String loginAsUuid, java.lang.String totp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        com.izettle.android.core.data.result.Result generateRequest = generateRequest(kotlin.TuplesKt.to(com.visa.cbp.getDeviceCerts.setTokenInfo, com.izettle.android.auth.GrantType.ADMIN.getValue()), kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CLIENT_ID_KEY, clientId), kotlin.TuplesKt.to(androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, username), kotlin.TuplesKt.to("password", password), kotlin.TuplesKt.to("userUuid", loginAsUuid), kotlin.TuplesKt.to("totp", totp));
        if (generateRequest instanceof com.izettle.android.core.data.result.Success) {
            try {
                com.izettle.android.net.Response executeRequest = this.httpClient.executeRequest((com.izettle.android.net.Request) ((com.izettle.android.core.data.result.Success) generateRequest).getValue(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.dto.TokenResponse.class));
                int code = executeRequest.getCode();
                if (500 <= code && code < 601) {
                    this.serviceUriRepository.invalidateUrl(executeRequest.getRequest().getUrl());
                }
                return com.izettle.android.core.data.result.ResultKt.asSuccess(executeRequest);
            } catch (java.lang.Throwable th) {
                return com.izettle.android.core.data.result.ResultKt.asFailure(th);
            }
        }
        if (generateRequest instanceof com.izettle.android.core.data.result.Failure) {
            return generateRequest;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.services.OAuthService
    public final com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<com.izettle.android.auth.dto.TokenResponse>, java.lang.Throwable> refreshAccessToken(java.lang.String refreshToken, java.lang.String clientId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
        com.izettle.android.core.data.result.Result generateRequest = generateRequest(kotlin.TuplesKt.to(com.visa.cbp.getDeviceCerts.setTokenInfo, com.izettle.android.auth.GrantType.TOKEN.getValue()), kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CLIENT_ID_KEY, clientId), kotlin.TuplesKt.to(com.zettle.sdk.core.auth.AuthModuleKt.REFRESH_TOKEN_KEY, refreshToken));
        if (generateRequest instanceof com.izettle.android.core.data.result.Success) {
            try {
                com.izettle.android.net.Response executeRequest = this.httpClient.executeRequest((com.izettle.android.net.Request) ((com.izettle.android.core.data.result.Success) generateRequest).getValue(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.dto.TokenResponse.class));
                int code = executeRequest.getCode();
                if (500 <= code && code < 601) {
                    this.serviceUriRepository.invalidateUrl(executeRequest.getRequest().getUrl());
                }
                return com.izettle.android.core.data.result.ResultKt.asSuccess(executeRequest);
            } catch (java.lang.Throwable th) {
                return com.izettle.android.core.data.result.ResultKt.asFailure(th);
            }
        }
        if (generateRequest instanceof com.izettle.android.core.data.result.Failure) {
            return generateRequest;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.services.OAuthService
    public final com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<com.izettle.android.auth.dto.TokenResponse>, java.lang.Throwable> getAccessTokenFromCode(java.lang.String code, java.lang.String clientId, java.lang.String redirectUri, java.lang.String codeVerifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectUri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeVerifier, "");
        com.izettle.android.core.data.result.Result generateRequest = generateRequest(kotlin.TuplesKt.to(com.visa.cbp.getDeviceCerts.setTokenInfo, com.izettle.android.auth.GrantType.AUTHORIZATION_CODE.getValue()), kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CLIENT_ID_KEY, clientId), kotlin.TuplesKt.to("code", code), kotlin.TuplesKt.to("redirect_uri", redirectUri), kotlin.TuplesKt.to("code_verifier", codeVerifier));
        if (generateRequest instanceof com.izettle.android.core.data.result.Success) {
            try {
                com.izettle.android.net.Response executeRequest = this.httpClient.executeRequest((com.izettle.android.net.Request) ((com.izettle.android.core.data.result.Success) generateRequest).getValue(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.dto.TokenResponse.class));
                int code2 = executeRequest.getCode();
                if (500 <= code2 && code2 < 601) {
                    this.serviceUriRepository.invalidateUrl(executeRequest.getRequest().getUrl());
                }
                return com.izettle.android.core.data.result.ResultKt.asSuccess(executeRequest);
            } catch (java.lang.Throwable th) {
                return com.izettle.android.core.data.result.ResultKt.asFailure(th);
            }
        }
        if (generateRequest instanceof com.izettle.android.core.data.result.Failure) {
            return generateRequest;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.services.OAuthService
    public final com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<com.izettle.android.auth.dto.OneTimeTokenResponse>, java.lang.Throwable> getOneTimeToken(java.lang.String clientId, java.lang.String refreshToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshToken, "");
        com.izettle.android.core.data.result.Result generateRequest = generateRequest(kotlin.TuplesKt.to(com.visa.cbp.getDeviceCerts.setTokenInfo, com.izettle.android.auth.GrantType.ONE_TIME_TOKEN.getValue()), kotlin.TuplesKt.to(com.zettle.sdk.core.auth.AuthModuleKt.REFRESH_TOKEN_KEY, refreshToken), kotlin.TuplesKt.to(com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.CLIENT_ID_KEY, clientId));
        if (generateRequest instanceof com.izettle.android.core.data.result.Success) {
            try {
                com.izettle.android.net.Response executeRequest = this.httpClient.executeRequest((com.izettle.android.net.Request) ((com.izettle.android.core.data.result.Success) generateRequest).getValue(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.dto.OneTimeTokenResponse.class));
                int code = executeRequest.getCode();
                if (500 <= code && code < 601) {
                    this.serviceUriRepository.invalidateUrl(executeRequest.getRequest().getUrl());
                }
                return com.izettle.android.core.data.result.ResultKt.asSuccess(executeRequest);
            } catch (java.lang.Throwable th) {
                return com.izettle.android.core.data.result.ResultKt.asFailure(th);
            }
        }
        if (generateRequest instanceof com.izettle.android.core.data.result.Failure) {
            return generateRequest;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
