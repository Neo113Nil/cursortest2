package com.izettle.android.auth.services;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u000f\u001a&\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\f0\u000b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012"}, d2 = {"Lcom/izettle/android/auth/services/MobileServiceImpl;", "Lcom/izettle/android/auth/services/MobileService;", "Lcom/izettle/android/net/HttpClient;", "httpClient", "Lcom/izettle/android/auth/BackendEnvironment;", "backendEnvironment", "<init>", "(Lcom/izettle/android/net/HttpClient;Lcom/izettle/android/auth/BackendEnvironment;)V", "", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.ACCESS_TOKEN, "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/net/Response;", "", "", "", "getServiceUrls", "(Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/BackendEnvironment;", "Lcom/izettle/android/net/HttpClient;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MobileServiceImpl implements com.izettle.android.auth.services.MobileService {
    private final com.izettle.android.auth.BackendEnvironment backendEnvironment;
    private final com.izettle.android.net.HttpClient httpClient;

    public MobileServiceImpl(com.izettle.android.net.HttpClient httpClient, com.izettle.android.auth.BackendEnvironment backendEnvironment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backendEnvironment, "");
        this.httpClient = httpClient;
        this.backendEnvironment = backendEnvironment;
    }

    @Override // com.izettle.android.auth.services.MobileService
    public final com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<java.util.Map<java.lang.String, java.util.List<java.lang.String>>>, java.lang.Throwable> getServiceUrls(final java.lang.String accessToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "");
        try {
            com.izettle.android.net.Request request = com.izettle.android.net.RequestKt.request(new kotlin.jvm.functions.Function1<com.izettle.android.net.Request.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.MobileServiceImpl$getServiceUrls$1$request$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Request.Builder builder) {
                    getHighSpeedVideoFpsRangesFor(builder);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRangesFor(com.izettle.android.net.Request.Builder builder) {
                    com.izettle.android.auth.BackendEnvironment backendEnvironment;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
                    com.izettle.android.net.HttpUrl.Companion companion = com.izettle.android.net.HttpUrl.INSTANCE;
                    backendEnvironment = com.izettle.android.auth.services.MobileServiceImpl.this.backendEnvironment;
                    builder.setUrl(companion.parse(backendEnvironment.getServiceLookupUrl()).newBuilder().pathSegments("serviceurls").build());
                    builder.setMethod(com.izettle.android.net.HttpMethod.GET);
                    final java.lang.String str = accessToken;
                    builder.headers(new kotlin.jvm.functions.Function1<com.izettle.android.net.Headers, kotlin.Unit>() { // from class: com.izettle.android.auth.services.MobileServiceImpl$getServiceUrls$1$request$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Headers headers) {
                            getHighSpeedVideoFpsRanges(headers);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighSpeedVideoFpsRanges(com.izettle.android.net.Headers headers) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
                            final java.lang.String str2 = str;
                            headers.header(new kotlin.jvm.functions.Function1<com.izettle.android.net.Header.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.MobileServiceImpl.getServiceUrls.1.request.1.1.1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Header.Builder builder2) {
                                    getHighSpeedVideoSizes(builder2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void getHighSpeedVideoSizes(com.izettle.android.net.Header.Builder builder2) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder2, "");
                                    builder2.setName("Authorization");
                                    builder2.setValue("Bearer ".concat(java.lang.String.valueOf(str2)));
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
            com.izettle.android.net.HttpClient httpClient = this.httpClient;
            com.izettle.android.serialization.JsonDeserializer.Companion companion = com.izettle.android.serialization.JsonDeserializer.INSTANCE;
            return com.izettle.android.core.data.result.ResultKt.asSuccess(httpClient.executeRequest(request, new com.izettle.android.serialization.JsonDeserializer.TypeWrapper<java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>>() { // from class: com.izettle.android.auth.services.MobileServiceImpl$getServiceUrls$lambda$0$$inlined$typeWrapper$1
            }));
        } catch (java.lang.Throwable th) {
            return com.izettle.android.core.data.result.ResultKt.asFailure(th);
        }
    }
}
