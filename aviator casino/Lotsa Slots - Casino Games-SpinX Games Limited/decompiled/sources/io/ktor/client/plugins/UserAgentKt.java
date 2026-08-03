package io.ktor.client.plugins;

/* compiled from: UserAgent.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000¢\u0006\u0004\b\u0004\u0010\u0003\"\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "", "BrowserUserAgent", "(Lio/ktor/client/HttpClientConfig;)V", "CurlUserAgent", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/plugins/UserAgentConfig;", "UserAgent", "Lio/ktor/client/plugins/api/ClientPlugin;", "getUserAgent", "()Lio/ktor/client/plugins/api/ClientPlugin;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserAgentKt {
    private static final org.slf4j.Logger LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.UserAgent");
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.UserAgentConfig> UserAgent = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("UserAgent", io.ktor.client.plugins.UserAgentKt$UserAgent$2.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.UserAgentKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit UserAgent$lambda$1;
            UserAgent$lambda$1 = io.ktor.client.plugins.UserAgentKt.UserAgent$lambda$1((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            return UserAgent$lambda$1;
        }
    });

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.UserAgentConfig> getUserAgent() {
        return UserAgent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit UserAgent$lambda$1(io.ktor.client.plugins.api.ClientPluginBuilder createClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.onRequest(new io.ktor.client.plugins.UserAgentKt$UserAgent$3$1(((io.ktor.client.plugins.UserAgentConfig) createClientPlugin.getPluginConfig()).getAgent(), null));
        return kotlin.Unit.INSTANCE;
    }

    public static final void BrowserUserAgent(io.ktor.client.HttpClientConfig<?> httpClientConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        httpClientConfig.install(UserAgent, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.UserAgentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit BrowserUserAgent$lambda$2;
                BrowserUserAgent$lambda$2 = io.ktor.client.plugins.UserAgentKt.BrowserUserAgent$lambda$2((io.ktor.client.plugins.UserAgentConfig) obj);
                return BrowserUserAgent$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit BrowserUserAgent$lambda$2(io.ktor.client.plugins.UserAgentConfig install) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(install, "$this$install");
        install.setAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/70.0.3538.77 Chrome/70.0.3538.77 Safari/537.36");
        return kotlin.Unit.INSTANCE;
    }

    public static final void CurlUserAgent(io.ktor.client.HttpClientConfig<?> httpClientConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        httpClientConfig.install(UserAgent, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.UserAgentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit CurlUserAgent$lambda$3;
                CurlUserAgent$lambda$3 = io.ktor.client.plugins.UserAgentKt.CurlUserAgent$lambda$3((io.ktor.client.plugins.UserAgentConfig) obj);
                return CurlUserAgent$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit CurlUserAgent$lambda$3(io.ktor.client.plugins.UserAgentConfig install) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(install, "$this$install");
        install.setAgent("curl/7.61.0");
        return kotlin.Unit.INSTANCE;
    }
}
