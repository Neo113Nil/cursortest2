package io.ktor.client;

/* compiled from: HttpClientConfig.kt */
@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\n\u001a\u00020\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJP\u0010\u0011\u001a\u00020\u0007\"\b\b\u0001\u0010\f*\u00020\u0003\"\b\b\u0002\u0010\r*\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\u0011\u0010\u0016J\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0011\u0010\u0018J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001c\u001a\u00020\u00072\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dR0\u0010 \u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R5\u0010\"\u001a#\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R,\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R3\u0010$\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u000bR\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u00103\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010+\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R(\u00106\u001a\u00020)8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b6\u0010+\u0012\u0004\b9\u0010\u0005\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/¨\u0006:"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "engine", "(Lkotlin/jvm/functions/Function1;)V", "TBuilder", "TPlugin", "Lio/ktor/client/plugins/HttpClientPlugin;", com.ironsource.M6.L, "configure", "install", "(Lio/ktor/client/plugins/HttpClientPlugin;Lkotlin/jvm/functions/Function1;)V", "", com.ironsource.X3.i.W, "Lio/ktor/client/HttpClient;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "client", "(Lio/ktor/client/HttpClient;)V", "clone", "()Lio/ktor/client/HttpClientConfig;", "other", "plusAssign", "(Lio/ktor/client/HttpClientConfig;)V", "", "Lio/ktor/util/AttributeKey;", "plugins", "Ljava/util/Map;", "pluginConfigurations", "customInterceptors", "engineConfig", "Lkotlin/jvm/functions/Function1;", "getEngineConfig$ktor_client_core", "()Lkotlin/jvm/functions/Function1;", "setEngineConfig$ktor_client_core", "", "followRedirects", "Z", "getFollowRedirects", "()Z", "setFollowRedirects", "(Z)V", "useDefaultTransformers", "getUseDefaultTransformers", "setUseDefaultTransformers", "expectSuccess", "getExpectSuccess", "setExpectSuccess", "developmentMode", "getDevelopmentMode", "setDevelopmentMode", "getDevelopmentMode$annotations", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpClientConfig<T extends io.ktor.client.engine.HttpClientEngineConfig> {
    private boolean expectSuccess;
    private final java.util.Map<io.ktor.util.AttributeKey<?>, kotlin.jvm.functions.Function1<io.ktor.client.HttpClient, kotlin.Unit>> plugins = new java.util.LinkedHashMap();
    private final java.util.Map<io.ktor.util.AttributeKey<?>, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>> pluginConfigurations = new java.util.LinkedHashMap();
    private final java.util.Map<java.lang.String, kotlin.jvm.functions.Function1<io.ktor.client.HttpClient, kotlin.Unit>> customInterceptors = new java.util.LinkedHashMap();
    private kotlin.jvm.functions.Function1<? super T, kotlin.Unit> engineConfig = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit engineConfig$lambda$0;
            engineConfig$lambda$0 = io.ktor.client.HttpClientConfig.engineConfig$lambda$0((io.ktor.client.engine.HttpClientEngineConfig) obj);
            return engineConfig$lambda$0;
        }
    };
    private boolean followRedirects = true;
    private boolean useDefaultTransformers = true;
    private boolean developmentMode = io.ktor.util.PlatformUtils.INSTANCE.getIS_DEVELOPMENT_MODE();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Development mode is no longer required. The property will be removed in the future.", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static /* synthetic */ void getDevelopmentMode$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit engineConfig$lambda$0(io.ktor.client.engine.HttpClientEngineConfig httpClientEngineConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientEngineConfig, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function1<T, kotlin.Unit> getEngineConfig$ktor_client_core() {
        return this.engineConfig;
    }

    public final void setEngineConfig$ktor_client_core(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.engineConfig = function1;
    }

    public final void engine(final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1 = this.engineConfig;
        this.engineConfig = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit engine$lambda$1;
                engine$lambda$1 = io.ktor.client.HttpClientConfig.engine$lambda$1(kotlin.jvm.functions.Function1.this, block, (io.ktor.client.engine.HttpClientEngineConfig) obj);
                return engine$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit engine$lambda$1(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, io.ktor.client.engine.HttpClientEngineConfig httpClientEngineConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientEngineConfig, "<this>");
        function1.invoke(httpClientEngineConfig);
        function12.invoke(httpClientEngineConfig);
        return kotlin.Unit.INSTANCE;
    }

    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public final void setFollowRedirects(boolean z) {
        this.followRedirects = z;
    }

    public final boolean getUseDefaultTransformers() {
        return this.useDefaultTransformers;
    }

    public final void setUseDefaultTransformers(boolean z) {
        this.useDefaultTransformers = z;
    }

    public final boolean getExpectSuccess() {
        return this.expectSuccess;
    }

    public final void setExpectSuccess(boolean z) {
        this.expectSuccess = z;
    }

    public final boolean getDevelopmentMode() {
        return this.developmentMode;
    }

    public final void setDevelopmentMode(boolean z) {
        this.developmentMode = z;
    }

    public static /* synthetic */ void install$default(io.ktor.client.HttpClientConfig httpClientConfig, io.ktor.client.plugins.HttpClientPlugin httpClientPlugin, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit install$lambda$2;
                    install$lambda$2 = io.ktor.client.HttpClientConfig.install$lambda$2(obj2);
                    return install$lambda$2;
                }
            };
        }
        httpClientConfig.install(httpClientPlugin, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit install$lambda$2(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public final <TBuilder, TPlugin> void install(final io.ktor.client.plugins.HttpClientPlugin<? extends TBuilder, TPlugin> plugin, final kotlin.jvm.functions.Function1<? super TBuilder, kotlin.Unit> configure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "plugin");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configure, "configure");
        final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1 = this.pluginConfigurations.get(plugin.getKey());
        this.pluginConfigurations.put(plugin.getKey(), new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit install$lambda$3;
                install$lambda$3 = io.ktor.client.HttpClientConfig.install$lambda$3(kotlin.jvm.functions.Function1.this, configure, obj);
                return install$lambda$3;
            }
        });
        if (this.plugins.containsKey(plugin.getKey())) {
            return;
        }
        this.plugins.put(plugin.getKey(), new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit install$lambda$5;
                install$lambda$5 = io.ktor.client.HttpClientConfig.install$lambda$5(io.ktor.client.plugins.HttpClientPlugin.this, (io.ktor.client.HttpClient) obj);
                return install$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit install$lambda$3(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<this>");
        if (function1 != null) {
            function1.invoke(obj);
        }
        function12.invoke(obj);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit install$lambda$5(io.ktor.client.plugins.HttpClientPlugin httpClientPlugin, io.ktor.client.HttpClient scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        io.ktor.util.Attributes attributes = (io.ktor.util.Attributes) scope.getAttributes().computeIfAbsent(io.ktor.client.plugins.HttpClientPluginKt.getPLUGIN_INSTALLED_LIST(), new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                io.ktor.util.Attributes install$lambda$5$lambda$4;
                install$lambda$5$lambda$4 = io.ktor.client.HttpClientConfig.install$lambda$5$lambda$4();
                return install$lambda$5$lambda$4;
            }
        });
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1 = ((io.ktor.client.HttpClientConfig) scope.getConfig$ktor_client_core()).pluginConfigurations.get(httpClientPlugin.getKey());
        kotlin.jvm.internal.Intrinsics.checkNotNull(function1);
        java.lang.Object prepare = httpClientPlugin.prepare(function1);
        httpClientPlugin.install(prepare, scope);
        attributes.put(httpClientPlugin.getKey(), prepare);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.util.Attributes install$lambda$5$lambda$4() {
        return io.ktor.util.AttributesJvmKt.Attributes(true);
    }

    public final void install(java.lang.String key, kotlin.jvm.functions.Function1<? super io.ktor.client.HttpClient, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        this.customInterceptors.put(key, block);
    }

    public final void install(io.ktor.client.HttpClient client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        java.util.Iterator<T> it = this.plugins.values().iterator();
        while (it.hasNext()) {
            ((kotlin.jvm.functions.Function1) it.next()).invoke(client);
        }
        java.util.Iterator<T> it2 = this.customInterceptors.values().iterator();
        while (it2.hasNext()) {
            ((kotlin.jvm.functions.Function1) it2.next()).invoke(client);
        }
    }

    public final io.ktor.client.HttpClientConfig<T> clone() {
        io.ktor.client.HttpClientConfig<T> httpClientConfig = new io.ktor.client.HttpClientConfig<>();
        httpClientConfig.plusAssign(this);
        return httpClientConfig;
    }

    public final void plusAssign(io.ktor.client.HttpClientConfig<? extends T> other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        this.followRedirects = other.followRedirects;
        this.useDefaultTransformers = other.useDefaultTransformers;
        this.expectSuccess = other.expectSuccess;
        this.plugins.putAll(other.plugins);
        this.pluginConfigurations.putAll(other.pluginConfigurations);
        this.customInterceptors.putAll(other.customInterceptors);
    }
}
