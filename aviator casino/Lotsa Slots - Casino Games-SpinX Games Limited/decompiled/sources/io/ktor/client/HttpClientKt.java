package io.ktor.client;

/* compiled from: HttpClient.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a4\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u001b\u0010\b\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "Lio/ktor/client/engine/HttpClientEngineFactory;", "engineFactory", "Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/client/HttpClient;", "HttpClient", "(Lio/ktor/client/engine/HttpClientEngineFactory;Lkotlin/jvm/functions/Function1;)Lio/ktor/client/HttpClient;", "Lio/ktor/client/engine/HttpClientEngine;", "engine", "(Lio/ktor/client/engine/HttpClientEngine;Lkotlin/jvm/functions/Function1;)Lio/ktor/client/HttpClient;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpClientKt {
    public static /* synthetic */ io.ktor.client.HttpClient HttpClient$default(io.ktor.client.engine.HttpClientEngineFactory httpClientEngineFactory, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit HttpClient$lambda$0;
                    HttpClient$lambda$0 = io.ktor.client.HttpClientKt.HttpClient$lambda$0((io.ktor.client.HttpClientConfig) obj2);
                    return HttpClient$lambda$0;
                }
            };
        }
        return HttpClient(httpClientEngineFactory, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit HttpClient$lambda$0(io.ktor.client.HttpClientConfig httpClientConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    @io.ktor.utils.io.KtorDsl
    public static final <T extends io.ktor.client.engine.HttpClientEngineConfig> io.ktor.client.HttpClient HttpClient(io.ktor.client.engine.HttpClientEngineFactory<? extends T> engineFactory, kotlin.jvm.functions.Function1<? super io.ktor.client.HttpClientConfig<T>, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(engineFactory, "engineFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.client.HttpClientConfig httpClientConfig = new io.ktor.client.HttpClientConfig();
        block.invoke(httpClientConfig);
        final io.ktor.client.engine.HttpClientEngine create = engineFactory.create(httpClientConfig.getEngineConfig$ktor_client_core());
        io.ktor.client.HttpClient httpClient = new io.ktor.client.HttpClient(create, httpClientConfig, true);
        kotlin.coroutines.CoroutineContext.Element element = httpClient.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(element);
        ((kotlinx.coroutines.Job) element).invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit HttpClient$lambda$1;
                HttpClient$lambda$1 = io.ktor.client.HttpClientKt.HttpClient$lambda$1(io.ktor.client.engine.HttpClientEngine.this, (java.lang.Throwable) obj);
                return HttpClient$lambda$1;
            }
        });
        return httpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit HttpClient$lambda$1(io.ktor.client.engine.HttpClientEngine httpClientEngine, java.lang.Throwable th) {
        httpClientEngine.close();
        return kotlin.Unit.INSTANCE;
    }

    @io.ktor.utils.io.KtorDsl
    public static final io.ktor.client.HttpClient HttpClient(io.ktor.client.engine.HttpClientEngine engine, kotlin.jvm.functions.Function1<? super io.ktor.client.HttpClientConfig<?>, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(engine, "engine");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.client.HttpClientConfig httpClientConfig = new io.ktor.client.HttpClientConfig();
        block.invoke(httpClientConfig);
        return new io.ktor.client.HttpClient(engine, httpClientConfig, false);
    }
}
