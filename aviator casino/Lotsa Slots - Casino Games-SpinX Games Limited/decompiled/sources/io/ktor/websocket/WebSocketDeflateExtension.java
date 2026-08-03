package io.ktor.websocket;

/* compiled from: WebSocketDeflateExtension.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/.B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R.\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010%¨\u00060"}, d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension;", "Lio/ktor/websocket/WebSocketExtension;", "Lio/ktor/websocket/WebSocketDeflateExtension$Config;", com.helpshift.proactive.InAppViewConstants.CONFIG, "<init>", "(Lio/ktor/websocket/WebSocketDeflateExtension$Config;)V", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "negotiatedProtocols", "", "clientNegotiation", "(Ljava/util/List;)Z", "requestedProtocols", "serverNegotiation", "(Ljava/util/List;)Ljava/util/List;", "Lio/ktor/websocket/Frame;", "frame", "processOutgoingFrame", "(Lio/ktor/websocket/Frame;)Lio/ktor/websocket/Frame;", "processIncomingFrame", "Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "Lio/ktor/websocket/WebSocketExtensionFactory;", "factory", "Lio/ktor/websocket/WebSocketExtensionFactory;", "getFactory", "()Lio/ktor/websocket/WebSocketExtensionFactory;", "protocols", "Ljava/util/List;", "getProtocols", "()Ljava/util/List;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "outgoingNoContextTakeover", "Z", "getOutgoingNoContextTakeover$ktor_websockets", "()Z", "setOutgoingNoContextTakeover$ktor_websockets", "(Z)V", "incomingNoContextTakeover", "getIncomingNoContextTakeover$ktor_websockets", "setIncomingNoContextTakeover$ktor_websockets", "decompressIncoming", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Config", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebSocketDeflateExtension implements io.ktor.websocket.WebSocketExtension<io.ktor.websocket.WebSocketDeflateExtension.Config> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.websocket.WebSocketDeflateExtension.Companion INSTANCE = new io.ktor.websocket.WebSocketDeflateExtension.Companion(0 == true ? 1 : 0);
    private static final io.ktor.util.AttributeKey<io.ktor.websocket.WebSocketDeflateExtension> key;
    private static final boolean rsv1;
    private static final boolean rsv2 = false;
    private static final boolean rsv3 = false;
    private final io.ktor.websocket.WebSocketDeflateExtension.Config config;
    private boolean decompressIncoming;
    private final java.util.zip.Deflater deflater;
    private final io.ktor.websocket.WebSocketExtensionFactory<io.ktor.websocket.WebSocketDeflateExtension.Config, ? extends io.ktor.websocket.WebSocketExtension<io.ktor.websocket.WebSocketDeflateExtension.Config>> factory;
    private boolean incomingNoContextTakeover;
    private final java.util.zip.Inflater inflater;
    private boolean outgoingNoContextTakeover;
    private final java.util.List<io.ktor.websocket.WebSocketExtensionHeader> protocols;

    public WebSocketDeflateExtension(io.ktor.websocket.WebSocketDeflateExtension.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.factory = INSTANCE;
        this.protocols = config.build$ktor_websockets();
        this.inflater = new java.util.zip.Inflater(true);
        this.deflater = new java.util.zip.Deflater(config.getCompressionLevel(), true);
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public io.ktor.websocket.WebSocketExtensionFactory<io.ktor.websocket.WebSocketDeflateExtension.Config, ? extends io.ktor.websocket.WebSocketExtension<io.ktor.websocket.WebSocketDeflateExtension.Config>> getFactory() {
        return this.factory;
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public java.util.List<io.ktor.websocket.WebSocketExtensionHeader> getProtocols() {
        return this.protocols;
    }

    /* renamed from: getOutgoingNoContextTakeover$ktor_websockets, reason: from getter */
    public final boolean getOutgoingNoContextTakeover() {
        return this.outgoingNoContextTakeover;
    }

    public final void setOutgoingNoContextTakeover$ktor_websockets(boolean z) {
        this.outgoingNoContextTakeover = z;
    }

    /* renamed from: getIncomingNoContextTakeover$ktor_websockets, reason: from getter */
    public final boolean getIncomingNoContextTakeover() {
        return this.incomingNoContextTakeover;
    }

    public final void setIncomingNoContextTakeover$ktor_websockets(boolean z) {
        this.incomingNoContextTakeover = z;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.ktor.websocket.WebSocketExtension
    public boolean clientNegotiation(java.util.List<io.ktor.websocket.WebSocketExtensionHeader> negotiatedProtocols) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(negotiatedProtocols, "negotiatedProtocols");
        java.util.Iterator<T> it = negotiatedProtocols.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.websocket.WebSocketExtensionHeader) obj).getName(), "permessage-deflate")) {
                break;
            }
        }
        io.ktor.websocket.WebSocketExtensionHeader webSocketExtensionHeader = (io.ktor.websocket.WebSocketExtensionHeader) obj;
        if (webSocketExtensionHeader == null) {
            return false;
        }
        this.incomingNoContextTakeover = this.config.getServerNoContextTakeOver();
        this.outgoingNoContextTakeover = this.config.getClientNoContextTakeOver();
        for (kotlin.Pair<java.lang.String, java.lang.String> pair : webSocketExtensionHeader.parseParameters()) {
            java.lang.String component1 = pair.component1();
            java.lang.String component2 = pair.component2();
            switch (component1.hashCode()) {
                case -708713803:
                    if (component1.equals("client_no_context_takeover")) {
                        if (!kotlin.text.StringsKt.isBlank(component2)) {
                            throw new java.lang.IllegalStateException(("WebSocket permessage-deflate extension parameter client_no_context_takeover shouldn't have a value. Current: " + component2).toString());
                        }
                        this.outgoingNoContextTakeover = true;
                        break;
                    } else {
                        continue;
                    }
                case 646404390:
                    if (component1.equals("client_max_window_bits") && !kotlin.text.StringsKt.isBlank(component2) && java.lang.Integer.parseInt(component2) != 15) {
                        throw new java.lang.IllegalStateException("Only 15 window size is supported.".toString());
                    }
                    break;
                case 1266201133:
                    if (component1.equals("server_no_context_takeover")) {
                        if (!kotlin.text.StringsKt.isBlank(component2)) {
                            throw new java.lang.IllegalStateException(("WebSocket permessage-deflate extension parameter server_no_context_takeover shouldn't have a value. Current: " + component2).toString());
                        }
                        this.incomingNoContextTakeover = true;
                        break;
                    } else {
                        continue;
                    }
                case 2034279582:
                    component1.equals("server_max_window_bits");
                    break;
            }
        }
        return true;
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public java.util.List<io.ktor.websocket.WebSocketExtensionHeader> serverNegotiation(java.util.List<io.ktor.websocket.WebSocketExtensionHeader> requestedProtocols) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestedProtocols, "requestedProtocols");
        java.util.Iterator<T> it = requestedProtocols.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.websocket.WebSocketExtensionHeader) obj).getName(), "permessage-deflate")) {
                break;
            }
        }
        io.ktor.websocket.WebSocketExtensionHeader webSocketExtensionHeader = (io.ktor.websocket.WebSocketExtensionHeader) obj;
        if (webSocketExtensionHeader == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.Pair<java.lang.String, java.lang.String> pair : webSocketExtensionHeader.parseParameters()) {
            java.lang.String component1 = pair.component1();
            java.lang.String component2 = pair.component2();
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            java.lang.String lowerCase = component1.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case -708713803:
                    if (lowerCase.equals("client_no_context_takeover")) {
                        if (!kotlin.text.StringsKt.isBlank(component2)) {
                            throw new java.lang.IllegalStateException("Check failed.");
                        }
                        this.incomingNoContextTakeover = true;
                        arrayList.add("client_no_context_takeover");
                    } else {
                        throw new java.lang.IllegalStateException(("Unsupported extension parameter: (" + component1 + ", " + component2 + ')').toString());
                    }
                case 646404390:
                    if (!lowerCase.equals("client_max_window_bits")) {
                        throw new java.lang.IllegalStateException(("Unsupported extension parameter: (" + component1 + ", " + component2 + ')').toString());
                    }
                case 1266201133:
                    if (lowerCase.equals("server_no_context_takeover")) {
                        if (!kotlin.text.StringsKt.isBlank(component2)) {
                            throw new java.lang.IllegalStateException("Check failed.");
                        }
                        this.outgoingNoContextTakeover = true;
                        arrayList.add("server_no_context_takeover");
                    } else {
                        throw new java.lang.IllegalStateException(("Unsupported extension parameter: (" + component1 + ", " + component2 + ')').toString());
                    }
                case 2034279582:
                    if (lowerCase.equals("server_max_window_bits")) {
                        if (java.lang.Integer.parseInt(component2) != 15) {
                            throw new java.lang.IllegalStateException("Only 15 window size is supported".toString());
                        }
                    } else {
                        throw new java.lang.IllegalStateException(("Unsupported extension parameter: (" + component1 + ", " + component2 + ')').toString());
                    }
                default:
                    throw new java.lang.IllegalStateException(("Unsupported extension parameter: (" + component1 + ", " + component2 + ')').toString());
            }
        }
        return kotlin.collections.CollectionsKt.listOf(new io.ktor.websocket.WebSocketExtensionHeader("permessage-deflate", arrayList));
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public io.ktor.websocket.Frame processOutgoingFrame(io.ktor.websocket.Frame frame) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "frame");
        if ((!(frame instanceof io.ktor.websocket.Frame.Text) && !(frame instanceof io.ktor.websocket.Frame.Binary)) || !this.config.getCompressCondition$ktor_websockets().invoke(frame).booleanValue()) {
            return frame;
        }
        byte[] deflateFully = io.ktor.websocket.internals.DeflaterUtilsKt.deflateFully(this.deflater, frame.getData());
        if (this.outgoingNoContextTakeover) {
            this.deflater.reset();
        }
        return io.ktor.websocket.Frame.INSTANCE.byType(frame.getFin(), frame.getFrameType(), deflateFully, rsv1, frame.getRsv2(), frame.getRsv3());
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public io.ktor.websocket.Frame processIncomingFrame(io.ktor.websocket.Frame frame) {
        boolean isCompressed;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "frame");
        isCompressed = io.ktor.websocket.WebSocketDeflateExtensionKt.isCompressed(frame);
        if (!isCompressed && !this.decompressIncoming) {
            return frame;
        }
        this.decompressIncoming = true;
        byte[] inflateFully = io.ktor.websocket.internals.DeflaterUtilsKt.inflateFully(this.inflater, frame.getData());
        if (this.incomingNoContextTakeover) {
            this.inflater.reset();
        }
        if (frame.getFin()) {
            this.decompressIncoming = false;
        }
        return io.ktor.websocket.Frame.INSTANCE.byType(frame.getFin(), frame.getFrameType(), inflateFully, !rsv1, frame.getRsv2(), frame.getRsv3());
    }

    /* compiled from: WebSocketDeflateExtension.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\f\u001a\u00020\n2'\u0010\u000b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0011\u001a\u00020\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010#\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0015R4\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\n0\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\rR.\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+\"\u0004\b/\u0010\r¨\u00060"}, d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "Lkotlin/ParameterName;", "name", "protocols", "", "block", "configureProtocols", "(Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/websocket/Frame;", "frame", "", "compressIf", "", "bytes", "compressIfBiggerThan", "(I)V", "", "build$ktor_websockets", "()Ljava/util/List;", "build", "clientNoContextTakeOver", "Z", "getClientNoContextTakeOver", "()Z", "setClientNoContextTakeOver", "(Z)V", "serverNoContextTakeOver", "getServerNoContextTakeOver", "setServerNoContextTakeOver", "compressionLevel", "I", "getCompressionLevel", "()I", "setCompressionLevel", "manualConfig", "Lkotlin/jvm/functions/Function1;", "getManualConfig$ktor_websockets", "()Lkotlin/jvm/functions/Function1;", "setManualConfig$ktor_websockets", "compressCondition", "getCompressCondition$ktor_websockets", "setCompressCondition$ktor_websockets", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private boolean clientNoContextTakeOver;
        private boolean serverNoContextTakeOver;
        private int compressionLevel = -1;
        private kotlin.jvm.functions.Function1<? super java.util.List<io.ktor.websocket.WebSocketExtensionHeader>, kotlin.Unit> manualConfig = new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit manualConfig$lambda$0;
                manualConfig$lambda$0 = io.ktor.websocket.WebSocketDeflateExtension.Config.manualConfig$lambda$0((java.util.List) obj);
                return manualConfig$lambda$0;
            }
        };
        private kotlin.jvm.functions.Function1<? super io.ktor.websocket.Frame, java.lang.Boolean> compressCondition = new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean compressCondition$lambda$1;
                compressCondition$lambda$1 = io.ktor.websocket.WebSocketDeflateExtension.Config.compressCondition$lambda$1((io.ktor.websocket.Frame) obj);
                return java.lang.Boolean.valueOf(compressCondition$lambda$1);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean compressCondition$lambda$1(io.ktor.websocket.Frame it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            return true;
        }

        public final boolean getClientNoContextTakeOver() {
            return this.clientNoContextTakeOver;
        }

        public final void setClientNoContextTakeOver(boolean z) {
            this.clientNoContextTakeOver = z;
        }

        public final boolean getServerNoContextTakeOver() {
            return this.serverNoContextTakeOver;
        }

        public final void setServerNoContextTakeOver(boolean z) {
            this.serverNoContextTakeOver = z;
        }

        public final int getCompressionLevel() {
            return this.compressionLevel;
        }

        public final void setCompressionLevel(int i) {
            this.compressionLevel = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit manualConfig$lambda$0(java.util.List it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            return kotlin.Unit.INSTANCE;
        }

        public final kotlin.jvm.functions.Function1<java.util.List<io.ktor.websocket.WebSocketExtensionHeader>, kotlin.Unit> getManualConfig$ktor_websockets() {
            return this.manualConfig;
        }

        public final void setManualConfig$ktor_websockets(kotlin.jvm.functions.Function1<? super java.util.List<io.ktor.websocket.WebSocketExtensionHeader>, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.manualConfig = function1;
        }

        public final kotlin.jvm.functions.Function1<io.ktor.websocket.Frame, java.lang.Boolean> getCompressCondition$ktor_websockets() {
            return this.compressCondition;
        }

        public final void setCompressCondition$ktor_websockets(kotlin.jvm.functions.Function1<? super io.ktor.websocket.Frame, java.lang.Boolean> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "<set-?>");
            this.compressCondition = function1;
        }

        public final void configureProtocols(final kotlin.jvm.functions.Function1<? super java.util.List<io.ktor.websocket.WebSocketExtensionHeader>, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
            final kotlin.jvm.functions.Function1<? super java.util.List<io.ktor.websocket.WebSocketExtensionHeader>, kotlin.Unit> function1 = this.manualConfig;
            this.manualConfig = new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit configureProtocols$lambda$2;
                    configureProtocols$lambda$2 = io.ktor.websocket.WebSocketDeflateExtension.Config.configureProtocols$lambda$2(kotlin.jvm.functions.Function1.this, block, (java.util.List) obj);
                    return configureProtocols$lambda$2;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit configureProtocols$lambda$2(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, java.util.List it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(it);
            function12.invoke(it);
            return kotlin.Unit.INSTANCE;
        }

        public final void compressIf(final kotlin.jvm.functions.Function1<? super io.ktor.websocket.Frame, java.lang.Boolean> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
            final kotlin.jvm.functions.Function1<? super io.ktor.websocket.Frame, java.lang.Boolean> function1 = this.compressCondition;
            this.compressCondition = new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    boolean compressIf$lambda$3;
                    compressIf$lambda$3 = io.ktor.websocket.WebSocketDeflateExtension.Config.compressIf$lambda$3(kotlin.jvm.functions.Function1.this, function1, (io.ktor.websocket.Frame) obj);
                    return java.lang.Boolean.valueOf(compressIf$lambda$3);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean compressIf$lambda$3(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, io.ktor.websocket.Frame it) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
            return ((java.lang.Boolean) function1.invoke(it)).booleanValue() && ((java.lang.Boolean) function12.invoke(it)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean compressIfBiggerThan$lambda$4(int i, io.ktor.websocket.Frame frame) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "frame");
            return frame.getData().length > i;
        }

        public final void compressIfBiggerThan(final int bytes) {
            compressIf(new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    boolean compressIfBiggerThan$lambda$4;
                    compressIfBiggerThan$lambda$4 = io.ktor.websocket.WebSocketDeflateExtension.Config.compressIfBiggerThan$lambda$4(bytes, (io.ktor.websocket.Frame) obj);
                    return java.lang.Boolean.valueOf(compressIfBiggerThan$lambda$4);
                }
            });
        }

        public final java.util.List<io.ktor.websocket.WebSocketExtensionHeader> build$ktor_websockets() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (this.clientNoContextTakeOver) {
                arrayList2.add("client_no_context_takeover");
            }
            if (this.serverNoContextTakeOver) {
                arrayList2.add("server_no_context_takeover");
            }
            arrayList.add(new io.ktor.websocket.WebSocketExtensionHeader("permessage-deflate", arrayList2));
            this.manualConfig.invoke(arrayList);
            return arrayList;
        }
    }

    /* compiled from: WebSocketDeflateExtension.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension$Companion;", "Lio/ktor/websocket/WebSocketExtensionFactory;", "Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "Lio/ktor/websocket/WebSocketDeflateExtension;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", com.helpshift.proactive.InAppViewConstants.CONFIG, "install", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/websocket/WebSocketDeflateExtension;", "Lio/ktor/util/AttributeKey;", com.ironsource.X3.i.W, "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "", "rsv1", "Z", "getRsv1", "()Z", "rsv2", "getRsv2", "rsv3", "getRsv3", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements io.ktor.websocket.WebSocketExtensionFactory<io.ktor.websocket.WebSocketDeflateExtension.Config, io.ktor.websocket.WebSocketDeflateExtension> {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public io.ktor.util.AttributeKey<io.ktor.websocket.WebSocketDeflateExtension> getKey() {
            return io.ktor.websocket.WebSocketDeflateExtension.key;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public boolean getRsv1() {
            return io.ktor.websocket.WebSocketDeflateExtension.rsv1;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public boolean getRsv2() {
            return io.ktor.websocket.WebSocketDeflateExtension.rsv2;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public boolean getRsv3() {
            return io.ktor.websocket.WebSocketDeflateExtension.rsv3;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public io.ktor.websocket.WebSocketDeflateExtension install(kotlin.jvm.functions.Function1<? super io.ktor.websocket.WebSocketDeflateExtension.Config, kotlin.Unit> config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            io.ktor.websocket.WebSocketDeflateExtension.Config config2 = new io.ktor.websocket.WebSocketDeflateExtension.Config();
            config.invoke(config2);
            return new io.ktor.websocket.WebSocketDeflateExtension(config2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.KType kType = null;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.websocket.WebSocketDeflateExtension.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.websocket.WebSocketDeflateExtension.class);
        } catch (java.lang.Throwable unused) {
        }
        key = new io.ktor.util.AttributeKey<>("WebsocketDeflateExtension", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        rsv1 = true;
    }
}
