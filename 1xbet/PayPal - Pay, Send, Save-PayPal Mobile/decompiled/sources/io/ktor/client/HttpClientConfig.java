package io.ktor.client;

@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\n\u001a\u00020\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJP\u0010\u0011\u001a\u00020\u0007\"\b\b\u0001\u0010\f*\u00020\u0003\"\b\b\u0002\u0010\r*\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\u0011\u0010\u0016J\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0011\u0010\u0018J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001c\u001a\u00020\u00072\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dR0\u0010\"\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R5\u0010#\u001a#\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R,\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!R3\u0010%\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u000bR\"\u0010+\u001a\u00020*8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020*8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\"\u00104\u001a\u00020*8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R(\u00107\u001a\u00020*8\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0004\b7\u0010,\u0012\u0004\b:\u0010\u0005\u001a\u0004\b8\u0010.\"\u0004\b9\u00100"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "T", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "engine", "(Lkotlin/jvm/functions/Function1;)V", "TBuilder", "TPlugin", "Lio/ktor/client/plugins/HttpClientPlugin;", "plugin", "configure", "install", "(Lio/ktor/client/plugins/HttpClientPlugin;Lkotlin/jvm/functions/Function1;)V", "", "key", "Lio/ktor/client/HttpClient;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "client", "(Lio/ktor/client/HttpClient;)V", "clone", "()Lio/ktor/client/HttpClientConfig;", "other", "plusAssign", "(Lio/ktor/client/HttpClientConfig;)V", "", "Lio/ktor/util/AttributeKey;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "engineConfig", "Lkotlin/jvm/functions/Function1;", "getEngineConfig$ktor_client_core", "()Lkotlin/jvm/functions/Function1;", "setEngineConfig$ktor_client_core", "", "followRedirects", "Z", "getFollowRedirects", "()Z", "setFollowRedirects", "(Z)V", "useDefaultTransformers", "getUseDefaultTransformers", "setUseDefaultTransformers", "expectSuccess", "getExpectSuccess", "setExpectSuccess", "developmentMode", "getDevelopmentMode", "setDevelopmentMode", "getDevelopmentMode$annotations"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpClientConfig<T extends io.ktor.client.engine.HttpClientEngineConfig> {
    private boolean expectSuccess;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<io.ktor.util.AttributeKey<?>, kotlin.jvm.functions.Function1<io.ktor.client.HttpClient, kotlin.Unit>> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<io.ktor.util.AttributeKey<?>, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, kotlin.jvm.functions.Function1<io.ktor.client.HttpClient, kotlin.Unit>> getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
    private kotlin.jvm.functions.Function1<? super T, kotlin.Unit> engineConfig = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return io.ktor.client.HttpClientConfig.m23241$r8$lambda$BBRYPWWqrQo0wdR06gDfooGlcM((io.ktor.client.engine.HttpClientEngineConfig) obj);
        }
    };
    private boolean followRedirects = true;
    private boolean useDefaultTransformers = true;
    private boolean developmentMode = io.ktor.util.PlatformUtils.INSTANCE.getIS_DEVELOPMENT_MODE();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Development mode is no longer required. The property will be removed in the future.", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static /* synthetic */ void getDevelopmentMode$annotations() {
    }

    public final kotlin.jvm.functions.Function1<T, kotlin.Unit> getEngineConfig$ktor_client_core() {
        return this.engineConfig;
    }

    public final void setEngineConfig$ktor_client_core(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.engineConfig = function1;
    }

    public final void engine(final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1 = this.engineConfig;
        this.engineConfig = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.HttpClientConfig.m23242$r8$lambda$oDd7z74t1tYPV1hhfanBZC6JEA(kotlin.jvm.functions.Function1.this, block, (io.ktor.client.engine.HttpClientEngineConfig) obj);
            }
        };
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
                    return io.ktor.client.HttpClientConfig.$r8$lambda$v_ne3vAZZC65OYummyyCmHgr8c0(obj2);
                }
            };
        }
        httpClientConfig.install(httpClientPlugin, function1);
    }

    public final <TBuilder, TPlugin> void install(final io.ktor.client.plugins.HttpClientPlugin<? extends TBuilder, TPlugin> plugin, final kotlin.jvm.functions.Function1<? super TBuilder, kotlin.Unit> configure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configure, "");
        final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI.get(plugin.getKey());
        this.getHighResolutionOutputSizeshNQ4ISI.put(plugin.getKey(), new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.HttpClientConfig.$r8$lambda$UP_r6lSd_wdOlSg98DvCyJ72xOE(kotlin.jvm.functions.Function1.this, configure, obj);
            }
        });
        if (this.Camera2StreamConfigurationMap.containsKey(plugin.getKey())) {
            return;
        }
        this.Camera2StreamConfigurationMap.put(plugin.getKey(), new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.HttpClientConfig.$r8$lambda$Dv3iGRsSjy2IU0e6Y6pINhOKkMo(io.ktor.client.plugins.HttpClientPlugin.this, (io.ktor.client.HttpClient) obj);
            }
        });
    }

    public final void install(java.lang.String key, kotlin.jvm.functions.Function1<? super io.ktor.client.HttpClient, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        this.getHighSpeedVideoFpsRangesFor.put(key, block);
    }

    public final void install(io.ktor.client.HttpClient client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "");
        java.util.Iterator<T> it = this.Camera2StreamConfigurationMap.values().iterator();
        while (it.hasNext()) {
            ((kotlin.jvm.functions.Function1) it.next()).invoke(client);
        }
        java.util.Iterator<T> it2 = this.getHighSpeedVideoFpsRangesFor.values().iterator();
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        this.followRedirects = other.followRedirects;
        this.useDefaultTransformers = other.useDefaultTransformers;
        this.expectSuccess = other.expectSuccess;
        this.Camera2StreamConfigurationMap.putAll(other.Camera2StreamConfigurationMap);
        this.getHighResolutionOutputSizeshNQ4ISI.putAll(other.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor.putAll(other.getHighSpeedVideoFpsRangesFor);
    }

    /* renamed from: $r8$lambda$BBRYPWWqrQo0wdR06gDf-ooGlcM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23241$r8$lambda$BBRYPWWqrQo0wdR06gDfooGlcM(io.ktor.client.engine.HttpClientEngineConfig httpClientEngineConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientEngineConfig, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Dv3iGRsSjy2IU0e6Y6pINhOKkMo(io.ktor.client.plugins.HttpClientPlugin httpClientPlugin, io.ktor.client.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        io.ktor.util.Attributes attributes = (io.ktor.util.Attributes) httpClient.getAttributes().computeIfAbsent(io.ktor.client.plugins.HttpClientPluginKt.getPLUGIN_INSTALLED_LIST(), new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.HttpClientConfig$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                io.ktor.util.Attributes Attributes;
                Attributes = io.ktor.util.AttributesJvmKt.Attributes(true);
                return Attributes;
            }
        });
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1 = ((io.ktor.client.HttpClientConfig) httpClient.getConfig$ktor_client_core()).getHighResolutionOutputSizeshNQ4ISI.get(httpClientPlugin.getKey());
        kotlin.jvm.internal.Intrinsics.checkNotNull(function1);
        java.lang.Object prepare = httpClientPlugin.prepare(function1);
        httpClientPlugin.install(prepare, httpClient);
        attributes.put(httpClientPlugin.getKey(), prepare);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UP_r6lSd_wdOlSg98DvCyJ72xOE(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        if (function1 != null) {
            function1.invoke(obj);
        }
        function12.invoke(obj);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oDd-7z74t1tYPV1hhfanBZC6JEA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23242$r8$lambda$oDd7z74t1tYPV1hhfanBZC6JEA(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, io.ktor.client.engine.HttpClientEngineConfig httpClientEngineConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientEngineConfig, "");
        function1.invoke(httpClientEngineConfig);
        function12.invoke(httpClientEngineConfig);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v_ne3vAZZC65OYummyyCmHgr8c0(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        return kotlin.Unit.INSTANCE;
    }
}
