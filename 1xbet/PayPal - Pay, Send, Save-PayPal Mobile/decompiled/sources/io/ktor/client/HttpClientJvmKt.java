package io.ktor.client;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\u00020\u00052\u001d\b\u0002\u0010\u0004\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "", "Lkotlin/ExtensionFunctionType;", "block", "Lio/ktor/client/HttpClient;", "HttpClient", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/HttpClient;", "Lio/ktor/client/engine/HttpClientEngineFactory;", "getHighSpeedVideoSizes", "Lio/ktor/client/engine/HttpClientEngineFactory;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpClientJvmKt {
    private static final io.ktor.client.engine.HttpClientEngineFactory<?> getHighSpeedVideoSizes;

    @io.ktor.utils.io.KtorDsl
    public static final io.ktor.client.HttpClient HttpClient(kotlin.jvm.functions.Function1<? super io.ktor.client.HttpClientConfig<?>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return io.ktor.client.HttpClientKt.HttpClient(getHighSpeedVideoSizes, function1);
    }

    public static /* synthetic */ io.ktor.client.HttpClient HttpClient$default(kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientJvmKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.HttpClientJvmKt.$r8$lambda$rHxL2_pCd6Jh7w8jcs7Onvt8UTc((io.ktor.client.HttpClientConfig) obj2);
                }
            };
        }
        return HttpClient(function1);
    }

    static {
        io.ktor.client.engine.HttpClientEngineFactory<?> factory;
        java.util.Iterator it = java.util.ServiceLoader.load(io.ktor.client.HttpClientEngineContainer.class, io.ktor.client.HttpClientEngineContainer.class.getClassLoader()).iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        io.ktor.client.HttpClientEngineContainer httpClientEngineContainer = (io.ktor.client.HttpClientEngineContainer) kotlin.sequences.SequencesKt.firstOrNull(kotlin.sequences.SequencesKt.asSequence(it));
        if (httpClientEngineContainer == null || (factory = httpClientEngineContainer.getFactory()) == null) {
            throw new java.lang.IllegalStateException("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html".toString());
        }
        getHighSpeedVideoSizes = factory;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rHxL2_pCd6Jh7w8jcs7Onvt8UTc(io.ktor.client.HttpClientConfig httpClientConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "");
        return kotlin.Unit.INSTANCE;
    }
}
