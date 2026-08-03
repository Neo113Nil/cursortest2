package io.ktor.websocket;

/* compiled from: WebSocketExtension.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00052\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\b2\u000e\u0010\u0011\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u0015j\u0002`\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lio/ktor/websocket/WebSocketExtensionsConfig;", "", "<init>", "()V", "ConfigType", "Lio/ktor/websocket/WebSocketExtensionFactory;", com.facebook.share.internal.ShareConstants.MEDIA_EXTENSION, "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", com.helpshift.proactive.InAppViewConstants.CONFIG, "install", "(Lio/ktor/websocket/WebSocketExtensionFactory;Lkotlin/jvm/functions/Function1;)V", "", "Lio/ktor/websocket/WebSocketExtension;", "build", "()Ljava/util/List;", "extensionFactory", "checkConflicts", "(Lio/ktor/websocket/WebSocketExtensionFactory;)V", "", "Lkotlin/Function0;", "Lio/ktor/websocket/ExtensionInstaller;", "installers", "Ljava/util/List;", "", "", "rcv", "[Ljava/lang/Boolean;", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebSocketExtensionsConfig {
    private final java.util.List<kotlin.jvm.functions.Function0<io.ktor.websocket.WebSocketExtension<?>>> installers = new java.util.ArrayList();
    private final java.lang.Boolean[] rcv = {false, false, false};

    public static /* synthetic */ void install$default(io.ktor.websocket.WebSocketExtensionsConfig webSocketExtensionsConfig, io.ktor.websocket.WebSocketExtensionFactory webSocketExtensionFactory, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.WebSocketExtensionsConfig$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit install$lambda$0;
                    install$lambda$0 = io.ktor.websocket.WebSocketExtensionsConfig.install$lambda$0(obj2);
                    return install$lambda$0;
                }
            };
        }
        webSocketExtensionsConfig.install(webSocketExtensionFactory, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit install$lambda$0(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public final <ConfigType> void install(final io.ktor.websocket.WebSocketExtensionFactory<ConfigType, ?> extension, final kotlin.jvm.functions.Function1<? super ConfigType, kotlin.Unit> config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "extension");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        checkConflicts(extension);
        this.installers.add(new kotlin.jvm.functions.Function0() { // from class: io.ktor.websocket.WebSocketExtensionsConfig$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                io.ktor.websocket.WebSocketExtension install;
                install = io.ktor.websocket.WebSocketExtensionFactory.this.install(config);
                return install;
            }
        });
    }

    public final java.util.List<io.ktor.websocket.WebSocketExtension<?>> build() {
        java.util.List<kotlin.jvm.functions.Function0<io.ktor.websocket.WebSocketExtension<?>>> list = this.installers;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((io.ktor.websocket.WebSocketExtension) ((kotlin.jvm.functions.Function0) it.next()).invoke());
        }
        return arrayList;
    }

    private final void checkConflicts(io.ktor.websocket.WebSocketExtensionFactory<?, ?> extensionFactory) {
        if (!(!((extensionFactory.getRsv1() && this.rcv[1].booleanValue()) || (extensionFactory.getRsv2() && this.rcv[2].booleanValue()) || (extensionFactory.getRsv3() && this.rcv[3].booleanValue())))) {
            throw new java.lang.IllegalStateException("Failed to install extension. Please check configured extensions for conflicts.".toString());
        }
    }
}
