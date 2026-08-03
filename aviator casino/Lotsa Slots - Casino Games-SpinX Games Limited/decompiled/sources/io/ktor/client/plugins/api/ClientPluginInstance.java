package io.ktor.client.plugins.api;

/* compiled from: ClientPluginInstance.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00060\u0003j\u0002`\u0004BD\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\u0007\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R+\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginInstance;", "", "PluginConfig", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/util/AttributeKey;", com.ironsource.X3.i.W, com.helpshift.proactive.InAppViewConstants.CONFIG, "Lkotlin/Function1;", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "", "Lkotlin/ExtensionFunctionType;", "body", "<init>", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/HttpClient;)V", "close", "()V", "Lio/ktor/util/AttributeKey;", "Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "onClose", "Lkotlin/jvm/functions/Function0;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClientPluginInstance<PluginConfig> implements java.io.Closeable {
    private final kotlin.jvm.functions.Function1<io.ktor.client.plugins.api.ClientPluginBuilder<PluginConfig>, kotlin.Unit> body;
    private final PluginConfig config;
    private final io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfig>> key;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClose;

    /* JADX WARN: Multi-variable type inference failed */
    public ClientPluginInstance(io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfig>> key, PluginConfig config, kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.api.ClientPluginBuilder<PluginConfig>, kotlin.Unit> body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        this.key = key;
        this.config = config;
        this.body = body;
        this.onClose = new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.api.ClientPluginInstance$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        };
    }

    public final void install(io.ktor.client.HttpClient scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        io.ktor.client.plugins.api.ClientPluginBuilder<PluginConfig> clientPluginBuilder = new io.ktor.client.plugins.api.ClientPluginBuilder<>(this.key, scope, this.config);
        this.body.invoke(clientPluginBuilder);
        this.onClose = clientPluginBuilder.getOnClose$ktor_client_core();
        java.util.Iterator<T> it = clientPluginBuilder.getHooks$ktor_client_core().iterator();
        while (it.hasNext()) {
            ((io.ktor.client.plugins.api.HookHandler) it.next()).install(scope);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.onClose.invoke();
    }
}
