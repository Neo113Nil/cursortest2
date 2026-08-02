package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/client/HttpClient;", "", "defaultTransformers", "(Lio/ktor/client/HttpClient;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "Camera2StreamConfigurationMap", "Lorg/slf4j/Logger;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DefaultTransformKt {
    private static final org.slf4j.Logger Camera2StreamConfigurationMap = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.defaultTransformers");

    public static final void defaultTransformers(io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        httpClient.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getRender(), new io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1(null));
        httpClient.getResponsePipeline().intercept(io.ktor.client.statement.HttpResponsePipeline.INSTANCE.getParse(), new io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2(httpClient, null));
        io.ktor.client.plugins.DefaultTransformersJvmKt.platformResponseDefaultTransformers(httpClient);
    }
}
