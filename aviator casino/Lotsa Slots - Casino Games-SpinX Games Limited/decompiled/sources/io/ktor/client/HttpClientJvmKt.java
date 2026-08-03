package io.ktor.client;

/* compiled from: HttpClientJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0006\u001a\u00020\u00052\u001d\b\u0002\u0010\u0004\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u001e\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/client/HttpClient;", "HttpClient", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/HttpClient;", "Lio/ktor/client/engine/HttpClientEngineFactory;", "FACTORY", "Lio/ktor/client/engine/HttpClientEngineFactory;", "getFACTORY$annotations", "()V", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpClientJvmKt {
    private static final io.ktor.client.engine.HttpClientEngineFactory<?> FACTORY;

    private static /* synthetic */ void getFACTORY$annotations() {
    }

    @io.ktor.utils.io.KtorDsl
    public static final io.ktor.client.HttpClient HttpClient(kotlin.jvm.functions.Function1<? super io.ktor.client.HttpClientConfig<?>, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        return io.ktor.client.HttpClientKt.HttpClient(FACTORY, block);
    }

    public static /* synthetic */ io.ktor.client.HttpClient HttpClient$default(kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientJvmKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit HttpClient$lambda$0;
                    HttpClient$lambda$0 = io.ktor.client.HttpClientJvmKt.HttpClient$lambda$0((io.ktor.client.HttpClientConfig) obj2);
                    return HttpClient$lambda$0;
                }
            };
        }
        return HttpClient(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit HttpClient$lambda$0(io.ktor.client.HttpClientConfig httpClientConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    static {
        io.ktor.client.engine.HttpClientEngineFactory<?> factory;
        java.util.Iterator it = java.util.ServiceLoader.load(io.ktor.client.HttpClientEngineContainer.class, io.ktor.client.HttpClientEngineContainer.class.getClassLoader()).iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        io.ktor.client.HttpClientEngineContainer httpClientEngineContainer = (io.ktor.client.HttpClientEngineContainer) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.asSequence(it));
        if (httpClientEngineContainer == null || (factory = httpClientEngineContainer.getFactory()) == null) {
            throw new java.lang.IllegalStateException("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html".toString());
        }
        FACTORY = factory;
    }
}
