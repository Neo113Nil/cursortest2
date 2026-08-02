package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00052\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0016\u001a\u0016\u0012\u0012\u0012\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0012j\u0002`\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019"}, d2 = {"Lio/ktor/websocket/WebSocketExtensionsConfig;", "", "<init>", "()V", "ConfigType", "Lio/ktor/websocket/WebSocketExtensionFactory;", "extension", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "config", "install", "(Lio/ktor/websocket/WebSocketExtensionFactory;Lkotlin/jvm/functions/Function1;)V", "", "Lio/ktor/websocket/WebSocketExtension;", "build", "()Ljava/util/List;", "", "Lkotlin/Function0;", "Lio/ktor/websocket/ExtensionInstaller;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "Camera2StreamConfigurationMap", "", "", "[Ljava/lang/Boolean;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WebSocketExtensionsConfig {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.Boolean[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<kotlin.jvm.functions.Function0<io.ktor.websocket.WebSocketExtension<?>>> Camera2StreamConfigurationMap = new java.util.ArrayList();

    public WebSocketExtensionsConfig() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.getHighSpeedVideoFpsRangesFor = new java.lang.Boolean[]{bool, bool, bool};
    }

    public static /* synthetic */ void install$default(io.ktor.websocket.WebSocketExtensionsConfig webSocketExtensionsConfig, io.ktor.websocket.WebSocketExtensionFactory webSocketExtensionFactory, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.WebSocketExtensionsConfig$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.websocket.WebSocketExtensionsConfig.$r8$lambda$KoYZ2PYdeErbb2qEV4t5wjLQkso(obj2);
                }
            };
        }
        webSocketExtensionsConfig.install(webSocketExtensionFactory, function1);
    }

    public final java.util.List<io.ktor.websocket.WebSocketExtension<?>> build() {
        java.util.List<kotlin.jvm.functions.Function0<io.ktor.websocket.WebSocketExtension<?>>> list = this.Camera2StreamConfigurationMap;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((io.ktor.websocket.WebSocketExtension) ((kotlin.jvm.functions.Function0) it.next()).invoke());
        }
        return arrayList;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KoYZ2PYdeErbb2qEV4t5wjLQkso(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        return kotlin.Unit.INSTANCE;
    }

    public final <ConfigType> void install(final io.ktor.websocket.WebSocketExtensionFactory<ConfigType, ?> extension, final kotlin.jvm.functions.Function1<? super ConfigType, kotlin.Unit> config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        if ((!extension.getRsv1() || !this.getHighSpeedVideoFpsRangesFor[1].booleanValue()) && ((!extension.getRsv2() || !this.getHighSpeedVideoFpsRangesFor[2].booleanValue()) && (!extension.getRsv3() || !this.getHighSpeedVideoFpsRangesFor[3].booleanValue()))) {
            this.Camera2StreamConfigurationMap.add(new kotlin.jvm.functions.Function0() { // from class: io.ktor.websocket.WebSocketExtensionsConfig$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    io.ktor.websocket.WebSocketExtension install;
                    install = io.ktor.websocket.WebSocketExtensionFactory.this.install(config);
                    return install;
                }
            });
            return;
        }
        throw new java.lang.IllegalStateException("Failed to install extension. Please check configured extensions for conflicts.".toString());
    }
}
