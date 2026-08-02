package io.ktor.client.plugins.api;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B<\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R+\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginImpl;", "", "PluginConfigT", "Lio/ktor/client/plugins/api/ClientPlugin;", "", "p0", "Lkotlin/Function0;", "p1", "Lkotlin/Function1;", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "", "Lkotlin/ExtensionFunctionType;", "p2", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/plugins/api/ClientPluginInstance;", "getHighSpeedVideoFpsRanges", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ClientPluginImpl<PluginConfigT> implements io.ktor.client.plugins.api.ClientPlugin<PluginConfigT> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<PluginConfigT> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfigT>> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function1<io.ktor.client.plugins.api.ClientPluginBuilder<PluginConfigT>, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ClientPluginImpl(java.lang.String str, kotlin.jvm.functions.Function0<? extends PluginConfigT> function0, kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.api.ClientPluginBuilder<PluginConfigT>, kotlin.Unit> function1) {
        kotlin.reflect.KType kType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighSpeedVideoSizes = function1;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.api.ClientPluginInstance.class);
        try {
            kotlin.reflect.KTypeProjection.Companion companion = kotlin.reflect.KTypeProjection.INSTANCE;
            kotlin.reflect.KTypeParameter typeParameter = kotlin.jvm.internal.Reflection.typeParameter(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.api.ClientPluginImpl.class), "PluginConfigT", kotlin.reflect.KVariance.INVARIANT, false);
            kotlin.jvm.internal.Reflection.setUpperBounds(typeParameter, kotlin.jvm.internal.Reflection.typeOf(java.lang.Object.class));
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.api.ClientPluginInstance.class, companion.invariant(kotlin.jvm.internal.Reflection.typeOf(typeParameter)));
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new io.ktor.util.AttributeKey<>(str, new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public final /* synthetic */ void install(java.lang.Object obj, io.ktor.client.HttpClient httpClient) {
        io.ktor.client.plugins.api.ClientPluginInstance clientPluginInstance = (io.ktor.client.plugins.api.ClientPluginInstance) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientPluginInstance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
        clientPluginInstance.install(httpClient);
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public final /* synthetic */ java.lang.Object prepare(kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        PluginConfigT invoke = this.getHighSpeedVideoFpsRangesFor.invoke();
        function1.invoke(invoke);
        return new io.ktor.client.plugins.api.ClientPluginInstance(getKey(), invoke, this.getHighSpeedVideoSizes);
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public final io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfigT>> getKey() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
