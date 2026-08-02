package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0006\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\f\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/DefaultRequest$DefaultRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", "defaultRequest", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "Camera2StreamConfigurationMap", "Lorg/slf4j/Logger;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DefaultRequestKt {
    private static final org.slf4j.Logger Camera2StreamConfigurationMap = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.DefaultRequest");

    public static final void defaultRequest(io.ktor.client.HttpClientConfig<?> httpClientConfig, final kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        httpClientConfig.install(io.ktor.client.plugins.DefaultRequest.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.DefaultRequestKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.DefaultRequestKt.$r8$lambda$aeOQR4hkBk9ocP0wg0jNCZx4YmQ(kotlin.jvm.functions.Function1.this, (io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aeOQR4hkBk9ocP0wg0jNCZx4YmQ(kotlin.jvm.functions.Function1 function1, io.ktor.client.plugins.DefaultRequest.DefaultRequestBuilder defaultRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultRequestBuilder, "");
        function1.invoke(defaultRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }
}
