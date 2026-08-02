package io.ktor.client;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aH\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a4\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u001b\u0010\b\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000e"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "Lio/ktor/client/engine/HttpClientEngineFactory;", "engineFactory", "Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/client/HttpClient;", "HttpClient", "(Lio/ktor/client/engine/HttpClientEngineFactory;Lkotlin/jvm/functions/Function1;)Lio/ktor/client/HttpClient;", "Lio/ktor/client/engine/HttpClientEngine;", "engine", "(Lio/ktor/client/engine/HttpClientEngine;Lkotlin/jvm/functions/Function1;)Lio/ktor/client/HttpClient;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpClientKt {
    public static /* synthetic */ io.ktor.client.HttpClient HttpClient$default(io.ktor.client.engine.HttpClientEngineFactory httpClientEngineFactory, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.HttpClientKt.$r8$lambda$MSYW1cdbyz1mVdbr85qqXzWjy28((io.ktor.client.HttpClientConfig) obj2);
                }
            };
        }
        return HttpClient(httpClientEngineFactory, function1);
    }

    @io.ktor.utils.io.KtorDsl
    public static final <T extends io.ktor.client.engine.HttpClientEngineConfig> io.ktor.client.HttpClient HttpClient(io.ktor.client.engine.HttpClientEngineFactory<? extends T> httpClientEngineFactory, kotlin.jvm.functions.Function1<? super io.ktor.client.HttpClientConfig<T>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientEngineFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        io.ktor.client.HttpClientConfig httpClientConfig = new io.ktor.client.HttpClientConfig();
        function1.invoke(httpClientConfig);
        final io.ktor.client.engine.HttpClientEngine create = httpClientEngineFactory.create(httpClientConfig.getEngineConfig$ktor_client_core());
        io.ktor.client.HttpClient httpClient = new io.ktor.client.HttpClient(create, httpClientConfig, true);
        kotlin.coroutines.CoroutineContext.Element element = httpClient.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(element);
        ((kotlinx.coroutines.Job) element).invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.HttpClientKt.$r8$lambda$9kJquzW3VdcMlDtrl1HvYSyaA50(io.ktor.client.engine.HttpClientEngine.this, (java.lang.Throwable) obj);
            }
        });
        return httpClient;
    }

    @io.ktor.utils.io.KtorDsl
    public static final io.ktor.client.HttpClient HttpClient(io.ktor.client.engine.HttpClientEngine httpClientEngine, kotlin.jvm.functions.Function1<? super io.ktor.client.HttpClientConfig<?>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientEngine, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        io.ktor.client.HttpClientConfig httpClientConfig = new io.ktor.client.HttpClientConfig();
        function1.invoke(httpClientConfig);
        return new io.ktor.client.HttpClient(httpClientEngine, httpClientConfig, false);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9kJquzW3VdcMlDtrl1HvYSyaA50(io.ktor.client.engine.HttpClientEngine httpClientEngine, java.lang.Throwable th) {
        httpClientEngine.close();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MSYW1cdbyz1mVdbr85qqXzWjy28(io.ktor.client.HttpClientConfig httpClientConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "");
        return kotlin.Unit.INSTANCE;
    }
}
