package io.ktor.client.plugins;

/* compiled from: SaveBody.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0003\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007\"\u001f\u0010\u000f\u001a\u00060\tj\u0002`\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014\"\u0015\u0010\u001d\u001a\u00020\u001c*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "", "skipSaveBody", "(Lio/ktor/client/request/HttpRequestBuilder;)V", "skipSavingBody", "Lio/ktor/util/AttributeKey;", "SKIP_SAVE_BODY", "Lio/ktor/util/AttributeKey;", "RESPONSE_BODY_SAVED", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER$delegate", "Lkotlin/Lazy;", "getLOGGER", "()Lorg/slf4j/Logger;", "LOGGER", "Lio/ktor/client/plugins/api/ClientPlugin;", "SaveBody", "Lio/ktor/client/plugins/api/ClientPlugin;", "getSaveBody", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getSaveBody$annotations", "()V", "Lio/ktor/client/plugins/SaveBodyPluginConfig;", "SaveBodyPlugin", "getSaveBodyPlugin", "getSaveBodyPlugin$annotations", "Lio/ktor/client/statement/HttpResponse;", "", "isSaved", "(Lio/ktor/client/statement/HttpResponse;)Z", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DoubleReceivePluginKt {
    private static final kotlin.Lazy LOGGER$delegate;
    private static final io.ktor.util.AttributeKey<kotlin.Unit> RESPONSE_BODY_SAVED;
    private static final io.ktor.util.AttributeKey<kotlin.Unit> SKIP_SAVE_BODY;
    private static final io.ktor.client.plugins.api.ClientPlugin<kotlin.Unit> SaveBody;
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.SaveBodyPluginConfig> SaveBodyPlugin;

    public static /* synthetic */ void getSaveBody$annotations() {
    }

    @kotlin.Deprecated(message = io.ktor.client.plugins.Messages.PLUGIN_DEPRECATED_MESSAGE)
    public static /* synthetic */ void getSaveBodyPlugin$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.slf4j.Logger LOGGER_delegate$lambda$0() {
        return io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.SaveBody");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.slf4j.Logger getLOGGER() {
        return (org.slf4j.Logger) LOGGER$delegate.getValue();
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<kotlin.Unit> getSaveBody() {
        return SaveBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit SaveBody$lambda$1(io.ktor.client.plugins.api.ClientPluginBuilder createClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.getClient().getReceivePipeline().intercept(io.ktor.client.statement.HttpReceivePipeline.INSTANCE.getBefore(), new io.ktor.client.plugins.DoubleReceivePluginKt$SaveBody$1$1(null));
        return kotlin.Unit.INSTANCE;
    }

    public static final void skipSaveBody(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        httpRequestBuilder.getAttributes().put(SKIP_SAVE_BODY, kotlin.Unit.INSTANCE);
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.SaveBodyPluginConfig> getSaveBodyPlugin() {
        return SaveBodyPlugin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit SaveBodyPlugin$lambda$2(io.ktor.client.plugins.api.ClientPluginBuilder createClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        if (((io.ktor.client.plugins.SaveBodyPluginConfig) createClientPlugin.getPluginConfig()).getDisabled()) {
            getLOGGER().warn(io.ktor.client.plugins.Messages.SAVE_BODY_DISABLED_MESSAGE);
        } else {
            getLOGGER().warn(io.ktor.client.plugins.Messages.SAVE_BODY_ENABLED_MESSAGE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final boolean isSaved(io.ktor.client.statement.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        return httpResponse.getCall().getAttributes().contains(RESPONSE_BODY_SAVED);
    }

    @kotlin.Deprecated(message = io.ktor.client.plugins.Messages.SKIP_SAVING_BODY_MESSAGE)
    public static final void skipSavingBody(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        getLOGGER().warn(io.ktor.client.plugins.Messages.SKIP_SAVING_BODY_MESSAGE);
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
        SKIP_SAVE_BODY = new io.ktor.util.AttributeKey<>("SkipSaveBody", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.Unit.class);
        try {
            kType2 = kotlin.jvm.internal.Reflection.typeOf(kotlin.Unit.class);
        } catch (java.lang.Throwable unused2) {
        }
        RESPONSE_BODY_SAVED = new io.ktor.util.AttributeKey<>("ResponseBodySaved", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType2));
        LOGGER$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.DoubleReceivePluginKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                org.slf4j.Logger LOGGER_delegate$lambda$0;
                LOGGER_delegate$lambda$0 = io.ktor.client.plugins.DoubleReceivePluginKt.LOGGER_delegate$lambda$0();
                return LOGGER_delegate$lambda$0;
            }
        });
        SaveBody = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("SaveBody", new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.DoubleReceivePluginKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit SaveBody$lambda$1;
                SaveBody$lambda$1 = io.ktor.client.plugins.DoubleReceivePluginKt.SaveBody$lambda$1((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
                return SaveBody$lambda$1;
            }
        });
        SaveBodyPlugin = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("DoubleReceivePlugin", io.ktor.client.plugins.DoubleReceivePluginKt$SaveBodyPlugin$1.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.DoubleReceivePluginKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit SaveBodyPlugin$lambda$2;
                SaveBodyPlugin$lambda$2 = io.ktor.client.plugins.DoubleReceivePluginKt.SaveBodyPlugin$lambda$2((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
                return SaveBodyPlugin$lambda$2;
            }
        });
    }
}
