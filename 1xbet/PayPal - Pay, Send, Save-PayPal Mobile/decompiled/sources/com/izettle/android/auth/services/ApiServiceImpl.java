package com.izettle.android.auth.services;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ]\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u00180\u0016\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0019\b\u0004\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0082\b¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0017\u0012\u0004\u0012\u00020\u00180\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00180\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*"}, d2 = {"Lcom/izettle/android/auth/services/ApiServiceImpl;", "Lcom/izettle/android/auth/services/ApiService;", "Lcom/izettle/android/net/HttpClient;", "httpClient", "Lcom/izettle/android/auth/token/TokenManager;", "tokenManager", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "baseUriRepository", "Lcom/izettle/android/auth/ClientDataProvider;", "clientDataProvider", "<init>", "(Lcom/izettle/android/net/HttpClient;Lcom/izettle/android/auth/token/TokenManager;Lcom/izettle/android/auth/repository/BaseUriRepository;Lcom/izettle/android/auth/ClientDataProvider;)V", "", "T", "", "pathSegment", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lkotlin/Function1;", "Lcom/izettle/android/net/Request$Builder;", "", "Lkotlin/ExtensionFunctionType;", "requestBuilder", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/net/Response;", "", "doRequest", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/izettle/android/core/data/result/Result;", "getConfigData", "(Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/dto/RevisitResponsePayload;", "revisit", "()Lcom/izettle/android/core/data/result/Result;", "Ljava/io/File;", "file", "uploadedFilename", "Lcom/izettle/android/net/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "upload", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/izettle/android/net/ContentType;)Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "Lcom/izettle/android/auth/ClientDataProvider;", "Lcom/izettle/android/net/HttpClient;", "Lcom/izettle/android/auth/token/TokenManager;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ApiServiceImpl implements com.izettle.android.auth.services.ApiService {
    private final com.izettle.android.auth.repository.BaseUriRepository baseUriRepository;
    private final com.izettle.android.auth.ClientDataProvider clientDataProvider;
    private final com.izettle.android.net.HttpClient httpClient;
    private final com.izettle.android.auth.token.TokenManager tokenManager;

    public ApiServiceImpl(com.izettle.android.net.HttpClient httpClient, com.izettle.android.auth.token.TokenManager tokenManager, com.izettle.android.auth.repository.BaseUriRepository baseUriRepository, com.izettle.android.auth.ClientDataProvider clientDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUriRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientDataProvider, "");
        this.httpClient = httpClient;
        this.tokenManager = tokenManager;
        this.baseUriRepository = baseUriRepository;
        this.clientDataProvider = clientDataProvider;
    }

    static /* synthetic */ com.izettle.android.core.data.result.Result doRequest$default(com.izettle.android.auth.services.ApiServiceImpl apiServiceImpl, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        com.izettle.android.core.data.result.Failure asFailure;
        com.izettle.android.net.Response<java.lang.String> executeRequest;
        boolean isFailure;
        if ((i & 2) != 0) {
            str2 = null;
        }
        java.lang.String str3 = str2;
        com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.ServiceUrls, java.lang.Throwable> apiServiceUrls = apiServiceImpl.baseUriRepository.getApiServiceUrls();
        if (apiServiceUrls instanceof com.izettle.android.core.data.result.Success) {
            com.izettle.android.net.Request request = com.izettle.android.net.RequestKt.request(new com.izettle.android.auth.services.ApiServiceImpl$doRequest$1$request$1((com.izettle.android.auth.model.ServiceUrls) ((com.izettle.android.core.data.result.Success) apiServiceUrls).getValue(), str, function1, str3, apiServiceImpl));
            try {
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                if (java.lang.String.class.isAssignableFrom(java.lang.Object.class)) {
                    executeRequest = apiServiceImpl.httpClient.executeRequest(request);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(executeRequest, "");
                    com.izettle.android.net.Response<java.lang.String> response = executeRequest;
                    com.izettle.android.net.Response<java.lang.String> response2 = executeRequest;
                } else {
                    com.izettle.android.net.HttpClient httpClient = apiServiceImpl.httpClient;
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                    executeRequest = httpClient.executeRequest(request, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
                }
                isFailure = com.izettle.android.auth.services.ApiServiceKt.isFailure(executeRequest.getCode());
                if (isFailure) {
                    apiServiceImpl.baseUriRepository.invalidateUrl(executeRequest.getRequest().getUrl());
                }
                asFailure = com.izettle.android.core.data.result.ResultKt.asSuccess(executeRequest);
            } catch (java.lang.Throwable th) {
                asFailure = com.izettle.android.core.data.result.ResultKt.asFailure(th);
            }
            return asFailure;
        }
        if (apiServiceUrls instanceof com.izettle.android.core.data.result.Failure) {
            return apiServiceUrls;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private final /* synthetic */ <T> com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<T>, java.lang.Throwable> doRequest(java.lang.String pathSegment, java.lang.String token, kotlin.jvm.functions.Function1<? super com.izettle.android.net.Request.Builder, kotlin.Unit> requestBuilder) {
        com.izettle.android.core.data.result.Failure asFailure;
        com.izettle.android.net.Response<java.lang.String> executeRequest;
        boolean isFailure;
        com.izettle.android.core.data.result.Success success = (com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<T>, java.lang.Throwable>) this.baseUriRepository.getApiServiceUrls();
        if (success instanceof com.izettle.android.core.data.result.Success) {
            com.izettle.android.net.Request request = com.izettle.android.net.RequestKt.request(new com.izettle.android.auth.services.ApiServiceImpl$doRequest$1$request$1((com.izettle.android.auth.model.ServiceUrls) success.getValue(), pathSegment, requestBuilder, token, this));
            try {
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                if (java.lang.String.class.isAssignableFrom(java.lang.Object.class)) {
                    executeRequest = this.httpClient.executeRequest(request);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(executeRequest, "");
                    com.izettle.android.net.Response<java.lang.String> response = executeRequest;
                    com.izettle.android.net.Response<java.lang.String> response2 = executeRequest;
                } else {
                    com.izettle.android.net.HttpClient httpClient = this.httpClient;
                    kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                    executeRequest = httpClient.executeRequest(request, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
                }
                isFailure = com.izettle.android.auth.services.ApiServiceKt.isFailure(executeRequest.getCode());
                if (isFailure) {
                    this.baseUriRepository.invalidateUrl(executeRequest.getRequest().getUrl());
                }
                asFailure = com.izettle.android.core.data.result.ResultKt.asSuccess(executeRequest);
            } catch (java.lang.Throwable th) {
                asFailure = com.izettle.android.core.data.result.ResultKt.asFailure(th);
            }
            return asFailure;
        }
        if (success instanceof com.izettle.android.core.data.result.Failure) {
            return success;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.services.ApiService
    public final com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<com.izettle.android.auth.dto.RevisitResponsePayload>, java.lang.Throwable> revisit() {
        com.izettle.android.net.Response<java.lang.String> executeRequest;
        boolean isFailure;
        com.izettle.android.core.data.result.Result apiServiceUrls = this.baseUriRepository.getApiServiceUrls();
        if (apiServiceUrls instanceof com.izettle.android.core.data.result.Success) {
            final com.izettle.android.auth.model.ServiceUrls serviceUrls = (com.izettle.android.auth.model.ServiceUrls) ((com.izettle.android.core.data.result.Success) apiServiceUrls).getValue();
            final java.lang.String str = "revisit";
            final java.lang.String str2 = null;
            com.izettle.android.net.Request request = com.izettle.android.net.RequestKt.request(new kotlin.jvm.functions.Function1<com.izettle.android.net.Request.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$revisit$$inlined$doRequest$default$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Request.Builder builder) {
                    invoke2(builder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(com.izettle.android.net.Request.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    builder.setUrl(com.izettle.android.auth.model.ServiceUrls.this.getCurrent().newBuilder().pathSegments(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "mobile", str).build());
                    builder.setMethod(com.izettle.android.net.HttpMethod.POST);
                    final java.lang.String str3 = str2;
                    final com.izettle.android.auth.services.ApiServiceImpl apiServiceImpl = this;
                    builder.headers(new kotlin.jvm.functions.Function1<com.izettle.android.net.Headers, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$revisit$$inlined$doRequest$default$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Headers headers) {
                            invoke2(headers);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(com.izettle.android.net.Headers headers) {
                            com.izettle.android.auth.token.TokenManager tokenManager;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
                            final java.lang.String str4 = str3;
                            if (str4 == null) {
                                tokenManager = apiServiceImpl.tokenManager;
                                str4 = tokenManager.getAccessToken(new java.lang.String[0]);
                            }
                            if (str4 != null) {
                                headers.header(new kotlin.jvm.functions.Function1<com.izettle.android.net.Header.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$revisit$.inlined.doRequest.default.1.1.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Header.Builder builder2) {
                                        invoke2(builder2);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(com.izettle.android.net.Header.Builder builder2) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder2, "");
                                        builder2.setName("Authorization");
                                        builder2.setValue("Bearer ".concat(java.lang.String.valueOf(str4)));
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }
                                });
                            }
                            final com.izettle.android.auth.services.ApiServiceImpl apiServiceImpl2 = apiServiceImpl;
                            headers.header(new kotlin.jvm.functions.Function1<com.izettle.android.net.Header.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$revisit$.inlined.doRequest.default.1.1.2
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Header.Builder builder2) {
                                    invoke2(builder2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(com.izettle.android.net.Header.Builder builder2) {
                                    com.izettle.android.auth.ClientDataProvider clientDataProvider;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder2, "");
                                    builder2.setName("UDID");
                                    clientDataProvider = com.izettle.android.auth.services.ApiServiceImpl.this.clientDataProvider;
                                    builder2.setValue(clientDataProvider.getDeviceId());
                                }

                                {
                                    super(1);
                                }
                            });
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    });
                    final com.izettle.android.auth.services.ApiServiceImpl apiServiceImpl2 = this;
                    builder.jsonBody(new kotlin.jvm.functions.Function1<com.izettle.android.net.JsonBody.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$revisit$1$1
                        public final void getHighSpeedVideoFpsRangesFor(com.izettle.android.net.JsonBody.Builder builder2) {
                            com.izettle.android.auth.ClientDataProvider clientDataProvider;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder2, "");
                            clientDataProvider = com.izettle.android.auth.services.ApiServiceImpl.this.clientDataProvider;
                            builder2.setEntity(clientDataProvider.getClientInfo());
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.JsonBody.Builder builder2) {
                            getHighSpeedVideoFpsRangesFor(builder2);
                            return kotlin.Unit.INSTANCE;
                        }

                        {
                            super(1);
                        }
                    });
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            try {
                if (java.lang.String.class.isAssignableFrom(com.izettle.android.auth.dto.RevisitResponsePayload.class)) {
                    executeRequest = this.httpClient.executeRequest(request);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(executeRequest, "");
                } else {
                    executeRequest = this.httpClient.executeRequest(request, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.izettle.android.auth.dto.RevisitResponsePayload.class));
                }
                isFailure = com.izettle.android.auth.services.ApiServiceKt.isFailure(executeRequest.getCode());
                if (isFailure) {
                    this.baseUriRepository.invalidateUrl(executeRequest.getRequest().getUrl());
                }
                return com.izettle.android.core.data.result.ResultKt.asSuccess(executeRequest);
            } catch (java.lang.Throwable th) {
                return com.izettle.android.core.data.result.ResultKt.asFailure(th);
            }
        }
        if (apiServiceUrls instanceof com.izettle.android.core.data.result.Failure) {
            return apiServiceUrls;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.services.ApiService
    public final com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<java.lang.String>, java.lang.Throwable> getConfigData(final java.lang.String token) {
        com.izettle.android.net.Response<java.lang.String> executeRequest;
        boolean isFailure;
        com.izettle.android.core.data.result.Result apiServiceUrls = this.baseUriRepository.getApiServiceUrls();
        if (apiServiceUrls instanceof com.izettle.android.core.data.result.Success) {
            final com.izettle.android.auth.model.ServiceUrls serviceUrls = (com.izettle.android.auth.model.ServiceUrls) ((com.izettle.android.core.data.result.Success) apiServiceUrls).getValue();
            final java.lang.String str = "configdata";
            com.izettle.android.net.Request request = com.izettle.android.net.RequestKt.request(new kotlin.jvm.functions.Function1<com.izettle.android.net.Request.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$getConfigData$$inlined$doRequest$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Request.Builder builder) {
                    invoke2(builder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(com.izettle.android.net.Request.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    builder.setUrl(com.izettle.android.auth.model.ServiceUrls.this.getCurrent().newBuilder().pathSegments(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "mobile", str).build());
                    builder.setMethod(com.izettle.android.net.HttpMethod.POST);
                    final java.lang.String str2 = token;
                    final com.izettle.android.auth.services.ApiServiceImpl apiServiceImpl = this;
                    builder.headers(new kotlin.jvm.functions.Function1<com.izettle.android.net.Headers, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$getConfigData$$inlined$doRequest$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Headers headers) {
                            invoke2(headers);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(com.izettle.android.net.Headers headers) {
                            com.izettle.android.auth.token.TokenManager tokenManager;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
                            final java.lang.String str3 = str2;
                            if (str3 == null) {
                                tokenManager = apiServiceImpl.tokenManager;
                                str3 = tokenManager.getAccessToken(new java.lang.String[0]);
                            }
                            if (str3 != null) {
                                headers.header(new kotlin.jvm.functions.Function1<com.izettle.android.net.Header.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$getConfigData$.inlined.doRequest.1.1.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Header.Builder builder2) {
                                        invoke2(builder2);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(com.izettle.android.net.Header.Builder builder2) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder2, "");
                                        builder2.setName("Authorization");
                                        builder2.setValue("Bearer ".concat(java.lang.String.valueOf(str3)));
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }
                                });
                            }
                            final com.izettle.android.auth.services.ApiServiceImpl apiServiceImpl2 = apiServiceImpl;
                            headers.header(new kotlin.jvm.functions.Function1<com.izettle.android.net.Header.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$getConfigData$.inlined.doRequest.1.1.2
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Header.Builder builder2) {
                                    invoke2(builder2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(com.izettle.android.net.Header.Builder builder2) {
                                    com.izettle.android.auth.ClientDataProvider clientDataProvider;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder2, "");
                                    builder2.setName("UDID");
                                    clientDataProvider = com.izettle.android.auth.services.ApiServiceImpl.this.clientDataProvider;
                                    builder2.setValue(clientDataProvider.getDeviceId());
                                }

                                {
                                    super(1);
                                }
                            });
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    });
                    final com.izettle.android.auth.services.ApiServiceImpl apiServiceImpl2 = this;
                    builder.jsonBody(new kotlin.jvm.functions.Function1<com.izettle.android.net.JsonBody.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$getConfigData$1$1
                        public final void getHighResolutionOutputSizeshNQ4ISI(com.izettle.android.net.JsonBody.Builder builder2) {
                            com.izettle.android.auth.ClientDataProvider clientDataProvider;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder2, "");
                            clientDataProvider = com.izettle.android.auth.services.ApiServiceImpl.this.clientDataProvider;
                            builder2.setEntity(clientDataProvider.getClientInfo());
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.JsonBody.Builder builder2) {
                            getHighResolutionOutputSizeshNQ4ISI(builder2);
                            return kotlin.Unit.INSTANCE;
                        }

                        {
                            super(1);
                        }
                    });
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            try {
                if (java.lang.String.class.isAssignableFrom(java.lang.String.class)) {
                    executeRequest = this.httpClient.executeRequest(request);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(executeRequest, "");
                } else {
                    executeRequest = this.httpClient.executeRequest(request, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class));
                }
                isFailure = com.izettle.android.auth.services.ApiServiceKt.isFailure(executeRequest.getCode());
                if (isFailure) {
                    this.baseUriRepository.invalidateUrl(executeRequest.getRequest().getUrl());
                }
                return com.izettle.android.core.data.result.ResultKt.asSuccess(executeRequest);
            } catch (java.lang.Throwable th) {
                return com.izettle.android.core.data.result.ResultKt.asFailure(th);
            }
        }
        if (apiServiceUrls instanceof com.izettle.android.core.data.result.Failure) {
            return apiServiceUrls;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.izettle.android.auth.services.ApiService
    public final com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> upload(final java.lang.String token, final java.io.File file, final java.lang.String uploadedFilename, final com.izettle.android.net.ContentType contentType) {
        boolean isFailure;
        com.izettle.android.net.Response<java.lang.String> executeRequest;
        boolean isFailure2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadedFilename, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        com.izettle.android.core.data.result.Result apiServiceUrls = this.baseUriRepository.getApiServiceUrls();
        if (apiServiceUrls instanceof com.izettle.android.core.data.result.Success) {
            final com.izettle.android.auth.model.ServiceUrls serviceUrls = (com.izettle.android.auth.model.ServiceUrls) ((com.izettle.android.core.data.result.Success) apiServiceUrls).getValue();
            final java.lang.String str = "user-data-uploads";
            com.izettle.android.net.Request request = com.izettle.android.net.RequestKt.request(new kotlin.jvm.functions.Function1<com.izettle.android.net.Request.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$upload$$inlined$doRequest$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Request.Builder builder) {
                    invoke2(builder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(com.izettle.android.net.Request.Builder builder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    builder.setUrl(com.izettle.android.auth.model.ServiceUrls.this.getCurrent().newBuilder().pathSegments(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "mobile", str).build());
                    builder.setMethod(com.izettle.android.net.HttpMethod.POST);
                    final java.lang.String str2 = token;
                    final com.izettle.android.auth.services.ApiServiceImpl apiServiceImpl = this;
                    builder.headers(new kotlin.jvm.functions.Function1<com.izettle.android.net.Headers, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$upload$$inlined$doRequest$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Headers headers) {
                            invoke2(headers);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(com.izettle.android.net.Headers headers) {
                            com.izettle.android.auth.token.TokenManager tokenManager;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
                            final java.lang.String str3 = str2;
                            if (str3 == null) {
                                tokenManager = apiServiceImpl.tokenManager;
                                str3 = tokenManager.getAccessToken(new java.lang.String[0]);
                            }
                            if (str3 != null) {
                                headers.header(new kotlin.jvm.functions.Function1<com.izettle.android.net.Header.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$upload$.inlined.doRequest.1.1.1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Header.Builder builder2) {
                                        invoke2(builder2);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(com.izettle.android.net.Header.Builder builder2) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder2, "");
                                        builder2.setName("Authorization");
                                        builder2.setValue("Bearer ".concat(java.lang.String.valueOf(str3)));
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }
                                });
                            }
                            final com.izettle.android.auth.services.ApiServiceImpl apiServiceImpl2 = apiServiceImpl;
                            headers.header(new kotlin.jvm.functions.Function1<com.izettle.android.net.Header.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$upload$.inlined.doRequest.1.1.2
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Header.Builder builder2) {
                                    invoke2(builder2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(com.izettle.android.net.Header.Builder builder2) {
                                    com.izettle.android.auth.ClientDataProvider clientDataProvider;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder2, "");
                                    builder2.setName("UDID");
                                    clientDataProvider = com.izettle.android.auth.services.ApiServiceImpl.this.clientDataProvider;
                                    builder2.setValue(clientDataProvider.getDeviceId());
                                }

                                {
                                    super(1);
                                }
                            });
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    });
                    final java.io.File file2 = file;
                    final java.lang.String str3 = uploadedFilename;
                    final com.izettle.android.net.ContentType contentType2 = contentType;
                    builder.multiPartFormDataBody(new kotlin.jvm.functions.Function1<com.izettle.android.net.MultiPartBody.Builder.FormData, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$upload$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.MultiPartBody.Builder.FormData formData) {
                            getHighResolutionOutputSizeshNQ4ISI(formData);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighResolutionOutputSizeshNQ4ISI(com.izettle.android.net.MultiPartBody.Builder.FormData formData) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formData, "");
                            final java.io.File file3 = file2;
                            final java.lang.String str4 = str3;
                            final com.izettle.android.net.ContentType contentType3 = contentType2;
                            formData.file(new kotlin.jvm.functions.Function1<com.izettle.android.net.FormDataFilePart.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$upload$1$1.1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.FormDataFilePart.Builder builder2) {
                                    getHighSpeedVideoFpsRanges(builder2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void getHighSpeedVideoFpsRanges(com.izettle.android.net.FormDataFilePart.Builder builder2) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder2, "");
                                    builder2.setName("FILE");
                                    builder2.setFile(file3);
                                    builder2.setFileName(str4);
                                    builder2.setContentType(contentType3);
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
                    });
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            try {
                if (java.lang.String.class.isAssignableFrom(java.lang.String.class)) {
                    executeRequest = this.httpClient.executeRequest(request);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(executeRequest, "");
                } else {
                    executeRequest = this.httpClient.executeRequest(request, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class));
                }
                isFailure2 = com.izettle.android.auth.services.ApiServiceKt.isFailure(executeRequest.getCode());
                if (isFailure2) {
                    this.baseUriRepository.invalidateUrl(executeRequest.getRequest().getUrl());
                }
                apiServiceUrls = com.izettle.android.core.data.result.ResultKt.asSuccess(executeRequest);
            } catch (java.lang.Throwable th) {
                apiServiceUrls = com.izettle.android.core.data.result.ResultKt.asFailure(th);
            }
        } else if (!(apiServiceUrls instanceof com.izettle.android.core.data.result.Failure)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (apiServiceUrls instanceof com.izettle.android.core.data.result.Success) {
            com.izettle.android.net.Response response = (com.izettle.android.net.Response) ((com.izettle.android.core.data.result.Success) apiServiceUrls).getValue();
            isFailure = com.izettle.android.auth.services.ApiServiceKt.isFailure(response.getCode());
            if (isFailure) {
                return com.izettle.android.core.data.result.ResultKt.asFailure(com.izettle.android.auth.ExtensionsKt.toException(response));
            }
            return com.izettle.android.core.data.result.ResultKt.asSuccess(kotlin.Unit.INSTANCE);
        }
        if (apiServiceUrls instanceof com.izettle.android.core.data.result.Failure) {
            return apiServiceUrls;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
