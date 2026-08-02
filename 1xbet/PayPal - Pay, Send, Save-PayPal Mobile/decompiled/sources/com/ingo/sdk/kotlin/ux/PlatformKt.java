package com.ingo.sdk.kotlin.ux;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ad\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u001d\b\u0002\u0010\u0006\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00052\u0012\b\u0002\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"", "loggingEnabled", "Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "", "Lkotlin/ExtensionFunctionType;", "config", "", "Lio/ktor/client/plugins/api/ClientPlugin;", "clientPlugins", "Lkotlin/Function2;", "", "Lio/ktor/client/request/HttpRequest;", "handleResponseExceptionWithRequest", "Lio/ktor/client/HttpClient;", "createJsonHttpClient", "(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Lio/ktor/client/HttpClient;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PlatformKt {
    public static /* synthetic */ io.ktor.client.HttpClient createJsonHttpClient$default(boolean z, kotlin.jvm.functions.Function1 function1, java.util.List list, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.ux.PlatformKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.ingo.sdk.kotlin.ux.PlatformKt.$r8$lambda$hdLpTi9uhTLhXqW1nN7S772qsHA((io.ktor.client.HttpClientConfig) obj2);
                }
            };
        }
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.kotlin.ux.PlatformKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.ingo.sdk.kotlin.ux.PlatformKt.m10781$r8$lambda$fP8qVZG8YFHAcgHNLyDuUYwRsU((java.lang.Throwable) obj2, (io.ktor.client.request.HttpRequest) obj3);
                }
            };
        }
        return createJsonHttpClient(z, function1, list, function2);
    }

    public static final io.ktor.client.HttpClient createJsonHttpClient(final boolean z, kotlin.jvm.functions.Function1<? super io.ktor.client.HttpClientConfig<?>, kotlin.Unit> function1, final java.util.List<? extends io.ktor.client.plugins.api.ClientPlugin<?>> list, final kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super io.ktor.client.request.HttpRequest, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return io.ktor.client.HttpClientKt.HttpClient(io.ktor.client.engine.android.Android.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.ux.PlatformKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.kotlin.ux.PlatformKt.m10780$r8$lambda$6iweBZWiwGxi8n2URvVg61c08o(list, z, function2, (io.ktor.client.HttpClientConfig) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3Z4y4ykFyrv8jm5RzZvKyiz_PxY(io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig contentNegotiationConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentNegotiationConfig, "");
        io.ktor.serialization.kotlinx.json.JsonSupportKt.json$default(contentNegotiationConfig, kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.ux.PlatformKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.kotlin.ux.PlatformKt.$r8$lambda$5tNiAs6NDO2xBLy1Oi1Q6YiFwwE((kotlinx.serialization.json.JsonBuilder) obj);
            }
        }, 1, null), null, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5tNiAs6NDO2xBLy1Oi1Q6YiFwwE(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setLenient(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setUseAlternativeNames(false);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6iweBZWiwGxi8n2URv-Vg61c08o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10780$r8$lambda$6iweBZWiwGxi8n2URvVg61c08o(java.util.List list, final boolean z, final kotlin.jvm.functions.Function2 function2, io.ktor.client.HttpClientConfig httpClientConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "");
        httpClientConfig.install(io.ktor.client.plugins.logging.LoggingKt.getLogging(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.ux.PlatformKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.kotlin.ux.PlatformKt.$r8$lambda$KSaPg4jh5btqW1AWhWkkKjNTQ34(z, (io.ktor.client.plugins.logging.LoggingConfig) obj);
            }
        });
        io.ktor.client.plugins.DefaultRequestKt.defaultRequest(httpClientConfig, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.ux.PlatformKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.kotlin.ux.PlatformKt.$r8$lambda$DcZg4Obke5bqObOCGLs9GCQ_dQA((io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder) obj);
            }
        });
        httpClientConfig.install(io.ktor.client.plugins.HttpTimeoutKt.getHttpTimeout(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.ux.PlatformKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.kotlin.ux.PlatformKt.$r8$lambda$H5HiuvHJLwgkqqpRdL9m3JdsfwA((io.ktor.client.plugins.HttpTimeoutConfig) obj);
            }
        });
        httpClientConfig.engine(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.ux.PlatformKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.kotlin.ux.PlatformKt.$r8$lambda$nwBt3l83OpOqQcRvaxAEaDTTBgs((io.ktor.client.engine.android.AndroidEngineConfig) obj);
            }
        });
        httpClientConfig.setExpectSuccess(false);
        httpClientConfig.install(io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt.getContentNegotiation(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.ux.PlatformKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.kotlin.ux.PlatformKt.$r8$lambda$3Z4y4ykFyrv8jm5RzZvKyiz_PxY((io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig) obj);
            }
        });
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            io.ktor.client.HttpClientConfig.install$default(httpClientConfig, (io.ktor.client.plugins.api.ClientPlugin) it.next(), null, 2, null);
        }
        io.ktor.client.plugins.HttpCallValidatorKt.HttpResponseValidator(httpClientConfig, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.ux.PlatformKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.kotlin.ux.PlatformKt.$r8$lambda$rIo0LUMUeYXaLkzyA8oTtaUCboo(kotlin.jvm.functions.Function2.this, (io.ktor.client.plugins.HttpCallValidatorConfig) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DcZg4Obke5bqObOCGLs9GCQ_dQA(io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder defaultRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultRequestBuilder, "");
        io.ktor.http.HttpMessagePropertiesKt.contentType(defaultRequestBuilder, io.ktor.http.ContentType.Application.INSTANCE.getJson());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H5HiuvHJLwgkqqpRdL9m3JdsfwA(io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpTimeoutConfig, "");
        httpTimeoutConfig.setConnectTimeoutMillis(60000L);
        httpTimeoutConfig.setSocketTimeoutMillis(60000L);
        httpTimeoutConfig.setRequestTimeoutMillis(60000L);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KSaPg4jh5btqW1AWhWkkKjNTQ34(boolean z, io.ktor.client.plugins.logging.LoggingConfig loggingConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggingConfig, "");
        loggingConfig.setLogger(io.ktor.client.plugins.logging.LoggerJvmKt.getANDROID(io.ktor.client.plugins.logging.Logger.INSTANCE));
        loggingConfig.setLevel(z ? io.ktor.client.plugins.logging.LogLevel.ALL : io.ktor.client.plugins.logging.LogLevel.NONE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fP8qVZG8YFHAcgHNLyDuUY-wRsU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10781$r8$lambda$fP8qVZG8YFHAcgHNLyDuUYwRsU(java.lang.Throwable th, io.ktor.client.request.HttpRequest httpRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequest, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hdLpTi9uhTLhXqW1nN7S772qsHA(io.ktor.client.HttpClientConfig httpClientConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jeZutJz2n8_83u3-rgsGYf9bbUo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10782$r8$lambda$jeZutJz2n8_83u3rgsGYf9bbUo(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        io.ktor.client.plugins.HttpTimeoutKt.timeout(httpRequestBuilder, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.ux.PlatformKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.kotlin.ux.PlatformKt.$r8$lambda$tlK7tRPtoeAuzr7JG3ute_Y_sA8((io.ktor.client.plugins.HttpTimeoutConfig) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nwBt3l83OpOqQcRvaxAEaDTTBgs(io.ktor.client.engine.android.AndroidEngineConfig androidEngineConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidEngineConfig, "");
        io.ktor.client.request.BuildersKt.request(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.ux.PlatformKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.kotlin.ux.PlatformKt.m10782$r8$lambda$jeZutJz2n8_83u3rgsGYf9bbUo((io.ktor.client.request.HttpRequestBuilder) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rIo0LUMUeYXaLkzyA8oTtaUCboo(kotlin.jvm.functions.Function2 function2, io.ktor.client.plugins.HttpCallValidatorConfig httpCallValidatorConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpCallValidatorConfig, "");
        httpCallValidatorConfig.handleResponseExceptionWithRequest(new com.ingo.sdk.kotlin.ux.PlatformKt$createJsonHttpClient$3$7$1(function2, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tlK7tRPtoeAuzr7JG3ute_Y_sA8(io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpTimeoutConfig, "");
        httpTimeoutConfig.setRequestTimeoutMillis(60000L);
        return kotlin.Unit.INSTANCE;
    }
}
