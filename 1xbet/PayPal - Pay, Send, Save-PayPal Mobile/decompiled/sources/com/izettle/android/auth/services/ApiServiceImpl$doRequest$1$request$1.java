package com.izettle.android.auth.services;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lcom/izettle/android/net/Request$Builder;", "", "invoke", "(Lcom/izettle/android/net/Request$Builder;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ApiServiceImpl$doRequest$1$request$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.izettle.android.net.Request.Builder, kotlin.Unit> {
    final /* synthetic */ com.izettle.android.auth.model.ServiceUrls $baseUrl;
    final /* synthetic */ java.lang.String $pathSegment;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.izettle.android.net.Request.Builder, kotlin.Unit> $requestBuilder;
    final /* synthetic */ java.lang.String $token;
    final /* synthetic */ com.izettle.android.auth.services.ApiServiceImpl this$0;

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Request.Builder builder) {
        invoke2(builder);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.izettle.android.net.Request.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.setUrl(this.$baseUrl.getCurrent().newBuilder().pathSegments(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "mobile", this.$pathSegment).build());
        builder.setMethod(com.izettle.android.net.HttpMethod.POST);
        final java.lang.String str = this.$token;
        final com.izettle.android.auth.services.ApiServiceImpl apiServiceImpl = this.this$0;
        builder.headers(new kotlin.jvm.functions.Function1<com.izettle.android.net.Headers, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$doRequest$1$request$1.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Headers headers) {
                invoke2(headers);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(com.izettle.android.net.Headers headers) {
                com.izettle.android.auth.token.TokenManager tokenManager;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
                final java.lang.String str2 = str;
                if (str2 == null) {
                    tokenManager = apiServiceImpl.tokenManager;
                    str2 = tokenManager.getAccessToken(new java.lang.String[0]);
                }
                if (str2 != null) {
                    headers.header(new kotlin.jvm.functions.Function1<com.izettle.android.net.Header.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl$doRequest$1$request$1$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.izettle.android.net.Header.Builder builder2) {
                            invoke2(builder2);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(com.izettle.android.net.Header.Builder builder2) {
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
                final com.izettle.android.auth.services.ApiServiceImpl apiServiceImpl2 = apiServiceImpl;
                headers.header(new kotlin.jvm.functions.Function1<com.izettle.android.net.Header.Builder, kotlin.Unit>() { // from class: com.izettle.android.auth.services.ApiServiceImpl.doRequest.1.request.1.1.2
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
        this.$requestBuilder.invoke(builder);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ApiServiceImpl$doRequest$1$request$1(com.izettle.android.auth.model.ServiceUrls serviceUrls, java.lang.String str, kotlin.jvm.functions.Function1<? super com.izettle.android.net.Request.Builder, kotlin.Unit> function1, java.lang.String str2, com.izettle.android.auth.services.ApiServiceImpl apiServiceImpl) {
        super(1);
        this.$baseUrl = serviceUrls;
        this.$pathSegment = str;
        this.$requestBuilder = function1;
        this.$token = str2;
        this.this$0 = apiServiceImpl;
    }
}
