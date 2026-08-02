package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0003\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0019\u0010\u0006\u001a\u00060\nj\u0002`\u000b8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\r\"&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012\"\u0015\u0010\u001b\u001a\u00020\u001a*\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "", "skipSaveBody", "(Lio/ktor/client/request/HttpRequestBuilder;)V", "skipSavingBody", "Lio/ktor/util/AttributeKey;", "Camera2StreamConfigurationMap", "Lio/ktor/util/AttributeKey;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "Lio/ktor/client/plugins/api/ClientPlugin;", "SaveBody", "Lio/ktor/client/plugins/api/ClientPlugin;", "getSaveBody", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getSaveBody$annotations", "()V", "Lio/ktor/client/plugins/SaveBodyPluginConfig;", "SaveBodyPlugin", "getSaveBodyPlugin", "getSaveBodyPlugin$annotations", "Lio/ktor/client/statement/HttpResponse;", "", "isSaved", "(Lio/ktor/client/statement/HttpResponse;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DoubleReceivePluginKt {
    private static final io.ktor.util.AttributeKey<kotlin.Unit> Camera2StreamConfigurationMap;
    private static final io.ktor.client.plugins.api.ClientPlugin<kotlin.Unit> SaveBody;
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.SaveBodyPluginConfig> SaveBodyPlugin;
    private static final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;
    private static final io.ktor.util.AttributeKey<kotlin.Unit> getHighSpeedVideoSizes;

    public static /* synthetic */ void getSaveBody$annotations() {
    }

    @kotlin.Deprecated(message = "This plugin is no longer needed.\nThis API is deprecated and will be removed in Ktor 4.0.0")
    public static /* synthetic */ void getSaveBodyPlugin$annotations() {
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<kotlin.Unit> getSaveBody() {
        return SaveBody;
    }

    public static final void skipSaveBody(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        httpRequestBuilder.getAttributes().put(Camera2StreamConfigurationMap, kotlin.Unit.INSTANCE);
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.SaveBodyPluginConfig> getSaveBodyPlugin() {
        return SaveBodyPlugin;
    }

    public static final boolean isSaved(io.ktor.client.statement.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        return httpResponse.getCall().getAttributes().contains(getHighSpeedVideoSizes);
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Unit.class);
        kotlin.reflect.KType kType2 = null;
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(kotlin.Unit.class);
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        Camera2StreamConfigurationMap = new io.ktor.util.AttributeKey<>("SkipSaveBody", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Unit.class);
        try {
            kType2 = kotlin.jvm.internal.Reflection.typeOf(kotlin.Unit.class);
        } catch (java.lang.Throwable unused2) {
        }
        getHighSpeedVideoSizes = new io.ktor.util.AttributeKey<>("ResponseBodySaved", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType2));
        getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.DoubleReceivePluginKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                org.slf4j.Logger KtorSimpleLogger;
                KtorSimpleLogger = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.SaveBody");
                return KtorSimpleLogger;
            }
        });
        SaveBody = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("SaveBody", new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.DoubleReceivePluginKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.DoubleReceivePluginKt.$r8$lambda$pvGEH0MqzvT4ylBEeHp_K5tXVnQ((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            }
        });
        SaveBodyPlugin = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("DoubleReceivePlugin", io.ktor.client.plugins.DoubleReceivePluginKt$SaveBodyPlugin$1.getHighSpeedVideoSizes, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.DoubleReceivePluginKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.DoubleReceivePluginKt.$r8$lambda$uJQdDNj3DJxy5rK1N59rrvXrjw4((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pvGEH0MqzvT4ylBEeHp_K5tXVnQ(io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientPluginBuilder, "");
        clientPluginBuilder.getClient().getReceivePipeline().intercept(io.ktor.client.statement.HttpReceivePipeline.INSTANCE.getBefore(), new io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1(null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uJQdDNj3DJxy5rK1N59rrvXrjw4(io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder) {
        org.slf4j.Logger logger;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientPluginBuilder, "");
        if (((io.ktor.client.plugins.SaveBodyPluginConfig) clientPluginBuilder.getPluginConfig()).getDisabled()) {
            logger = (org.slf4j.Logger) getHighResolutionOutputSizeshNQ4ISI.getValue();
            str = "It is no longer possible to disable body saving for all requests. Use client.prepareRequest(...).execute { ... } syntax to prevent saving the body in memory.\n\nThis API is deprecated and will be removed in Ktor 4.0.0\nIf you were relying on this functionality, share your use case by commenting on this issue: https://youtrack.jetbrains.com/issue/KTOR-8367/";
        } else {
            logger = (org.slf4j.Logger) getHighResolutionOutputSizeshNQ4ISI.getValue();
            str = "The SaveBodyPlugin plugin is deprecated and can be safely removed. Request bodies are now saved in memory by default for all non-streaming responses.";
        }
        logger.warn(str);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ org.slf4j.Logger access$getLOGGER() {
        return (org.slf4j.Logger) getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    @kotlin.Deprecated(message = "Skipping of body saving for a specific request is no longer allowed.\nUse client.prepareRequest(...).execute { ... } syntax to prevent saving the body in memory.\n\nThis API is deprecated and will be removed in Ktor 4.0.0\nIf you were relying on this functionality, share your use case by commenting on this issue: https://youtrack.jetbrains.com/issue/KTOR-8367/")
    public static final void skipSavingBody(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        ((org.slf4j.Logger) getHighResolutionOutputSizeshNQ4ISI.getValue()).warn("Skipping of body saving for a specific request is no longer allowed.\nUse client.prepareRequest(...).execute { ... } syntax to prevent saving the body in memory.\n\nThis API is deprecated and will be removed in Ktor 4.0.0\nIf you were relying on this functionality, share your use case by commenting on this issue: https://youtrack.jetbrains.com/issue/KTOR-8367/");
    }
}
