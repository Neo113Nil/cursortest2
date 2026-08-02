package io.ktor.client.plugins.api;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00060\u0003j\u0002`\u0004BD\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R+\u0010\u0018\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e"}, d2 = {"Lio/ktor/client/plugins/api/ClientPluginInstance;", "", "PluginConfig", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/getHighResolutionOutputSizeshNQ4ISI;", "Lio/ktor/util/AttributeKey;", "key", "config", "Lkotlin/Function1;", "Lio/ktor/client/plugins/api/ClientPluginBuilder;", "", "Lkotlin/ExtensionFunctionType;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/client/HttpClient;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "install", "(Lio/ktor/client/HttpClient;)V", "close", "()V", "Camera2StreamConfigurationMap", "Lio/ktor/util/AttributeKey;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ClientPluginInstance<PluginConfig> implements java.io.Closeable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfig>> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<io.ktor.client.plugins.api.ClientPluginBuilder<PluginConfig>, kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final PluginConfig getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public ClientPluginInstance(io.ktor.util.AttributeKey<io.ktor.client.plugins.api.ClientPluginInstance<PluginConfig>> attributeKey, PluginConfig pluginconfig, kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.api.ClientPluginBuilder<PluginConfig>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributeKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pluginconfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = attributeKey;
        this.getHighSpeedVideoFpsRanges = pluginconfig;
        this.getHighSpeedVideoSizes = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function0() { // from class: io.ktor.client.plugins.api.ClientPluginInstance$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        };
    }

    public final void install(io.ktor.client.HttpClient scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
        io.ktor.client.plugins.api.ClientPluginBuilder<PluginConfig> clientPluginBuilder = new io.ktor.client.plugins.api.ClientPluginBuilder<>(this.getHighSpeedVideoFpsRangesFor, scope, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoSizes.invoke(clientPluginBuilder);
        this.getHighResolutionOutputSizeshNQ4ISI = clientPluginBuilder.getOnClose$ktor_client_core();
        java.util.Iterator<T> it = clientPluginBuilder.getHooks$ktor_client_core().iterator();
        while (it.hasNext()) {
            ((io.ktor.client.plugins.api.HookHandler) it.next()).install(scope);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke();
    }
}
