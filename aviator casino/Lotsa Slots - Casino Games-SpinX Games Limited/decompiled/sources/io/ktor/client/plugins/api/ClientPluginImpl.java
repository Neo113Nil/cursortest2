package io.ktor.client.plugins.api;

/* compiled from: CreatePluginUtils.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B<\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R+\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019R&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginImpl;", "", "PluginConfigT", "Lio/ktor/client/plugins/api/ClientPlugin;", "", "name", "Lkotlin/Function0;", "createConfiguration", "Lkotlin/Function1;", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "", "Lkotlin/ExtensionFunctionType;", "body", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "block", "Lio/ktor/client/plugins/api/ClientPluginInstance;", "prepare", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/plugins/api/ClientPluginInstance;", com.ironsource.M6.L, "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/api/ClientPluginInstance;Lio/ktor/client/HttpClient;)V", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Lio/ktor/util/AttributeKey;", com.ironsource.X3.i.W, "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ClientPluginImpl<PluginConfigT> implements io.ktor.client.plugins.api.ClientPlugin<PluginConfigT> {
    private final kotlin.jvm.functions.Function1<io.ktor.client.plugins.api.ClientPluginBuilder<PluginConfigT>, kotlin.Unit> body;
    private final kotlin.jvm.functions.Function0<PluginConfigT> createConfiguration;
    private final io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfigT>> key;

    /* JADX WARN: Multi-variable type inference failed */
    public ClientPluginImpl(java.lang.String name, kotlin.jvm.functions.Function0<? extends PluginConfigT> createConfiguration, kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.api.ClientPluginBuilder<PluginConfigT>, kotlin.Unit> body) {
        kotlin.reflect.KType kType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createConfiguration, "createConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        this.createConfiguration = createConfiguration;
        this.body = body;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.api.ClientPluginInstance.class);
        try {
            kotlin.reflect.KTypeProjection.Companion companion = kotlin.reflect.KTypeProjection.INSTANCE;
            kotlin.reflect.KTypeParameter typeParameter = kotlin.jvm.internal.Reflection.typeParameter(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.api.ClientPluginImpl.class), "PluginConfigT", kotlin.reflect.KVariance.INVARIANT, false);
            kotlin.jvm.internal.Reflection.setUpperBounds(typeParameter, kotlin.jvm.internal.Reflection.typeOf(java.lang.Object.class));
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.api.ClientPluginInstance.class, companion.invariant(kotlin.jvm.internal.Reflection.typeOf(typeParameter)));
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        this.key = new io.ktor.util.AttributeKey<>(name, new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfigT>> getKey() {
        return this.key;
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public io.ktor.client.plugins.api.ClientPluginInstance<PluginConfigT> prepare(kotlin.jvm.functions.Function1<? super PluginConfigT, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        PluginConfigT invoke = this.createConfiguration.invoke();
        block.invoke(invoke);
        return new io.ktor.client.plugins.api.ClientPluginInstance<>(getKey(), invoke, this.body);
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public void install(io.ktor.client.plugins.api.ClientPluginInstance<PluginConfigT> plugin, io.ktor.client.HttpClient scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "plugin");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        plugin.install(scope);
    }
}
