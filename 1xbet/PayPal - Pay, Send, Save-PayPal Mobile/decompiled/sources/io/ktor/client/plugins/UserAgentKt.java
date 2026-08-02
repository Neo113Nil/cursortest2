package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0004\u0010\u0003\"\u0018\u0010\t\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\" \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "", "BrowserUserAgent", "(Lio/ktor/client/HttpClientConfig;)V", "CurlUserAgent", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "getHighSpeedVideoSizes", "Lorg/slf4j/Logger;", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/plugins/UserAgentConfig;", "UserAgent", "Lio/ktor/client/plugins/api/ClientPlugin;", "getUserAgent", "()Lio/ktor/client/plugins/api/ClientPlugin;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserAgentKt {
    private static final org.slf4j.Logger getHighSpeedVideoSizes = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.UserAgent");
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.UserAgentConfig> UserAgent = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("UserAgent", io.ktor.client.plugins.UserAgentKt$UserAgent$2.getHighSpeedVideoSizes, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.UserAgentKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return io.ktor.client.plugins.UserAgentKt.m23259$r8$lambda$viQPCyPI38b_kbF3mdHRlQDQn8((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
        }
    });

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.UserAgentConfig> getUserAgent() {
        return UserAgent;
    }

    public static final void BrowserUserAgent(io.ktor.client.HttpClientConfig<?> httpClientConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "");
        httpClientConfig.install(UserAgent, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.UserAgentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.UserAgentKt.m23258$r8$lambda$bgUgBYRkOUn7DUjz58pXrLbeuQ((io.ktor.client.plugins.UserAgentConfig) obj);
            }
        });
    }

    public static final void CurlUserAgent(io.ktor.client.HttpClientConfig<?> httpClientConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "");
        httpClientConfig.install(UserAgent, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.UserAgentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.UserAgentKt.$r8$lambda$apUGFTw_wFNv6h6qzezobV33cB4((io.ktor.client.plugins.UserAgentConfig) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$apUGFTw_wFNv6h6qzezobV33cB4(io.ktor.client.plugins.UserAgentConfig userAgentConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAgentConfig, "");
        userAgentConfig.setAgent("curl/7.61.0");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bgUg-BYRkOUn7DUjz58pXrLbeuQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23258$r8$lambda$bgUgBYRkOUn7DUjz58pXrLbeuQ(io.ktor.client.plugins.UserAgentConfig userAgentConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAgentConfig, "");
        userAgentConfig.setAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/70.0.3538.77 Chrome/70.0.3538.77 Safari/537.36");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$viQPCyPI38b_kbF3-mdHRlQDQn8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23259$r8$lambda$viQPCyPI38b_kbF3mdHRlQDQn8(io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientPluginBuilder, "");
        clientPluginBuilder.onRequest(new io.ktor.client.plugins.UserAgentKt$UserAgent$3$1(((io.ktor.client.plugins.UserAgentConfig) clientPluginBuilder.getPluginConfig()).getAgent(), null));
        return kotlin.Unit.INSTANCE;
    }
}
