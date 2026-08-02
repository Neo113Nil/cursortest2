package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000210B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R.\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00168\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010'\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010("}, d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension;", "Lio/ktor/websocket/WebSocketExtension;", "Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "config", "<init>", "(Lio/ktor/websocket/WebSocketDeflateExtension$Config;)V", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "negotiatedProtocols", "", "clientNegotiation", "(Ljava/util/List;)Z", "requestedProtocols", "serverNegotiation", "(Ljava/util/List;)Ljava/util/List;", "Lio/ktor/websocket/Frame;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "processOutgoingFrame", "(Lio/ktor/websocket/Frame;)Lio/ktor/websocket/Frame;", "processIncomingFrame", "getHighSpeedVideoFpsRanges", "Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "Lio/ktor/websocket/WebSocketExtensionFactory;", "factory", "Lio/ktor/websocket/WebSocketExtensionFactory;", "getFactory", "()Lio/ktor/websocket/WebSocketExtensionFactory;", "protocols", "Ljava/util/List;", "getProtocols", "()Ljava/util/List;", "Ljava/util/zip/Inflater;", "getHighSpeedVideoSizes", "Ljava/util/zip/Inflater;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/zip/Deflater;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/zip/Deflater;", "Camera2StreamConfigurationMap", "outgoingNoContextTakeover", "Z", "getOutgoingNoContextTakeover$ktor_websockets", "()Z", "setOutgoingNoContextTakeover$ktor_websockets", "(Z)V", "incomingNoContextTakeover", "getIncomingNoContextTakeover$ktor_websockets", "setIncomingNoContextTakeover$ktor_websockets", "Companion", "Config"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WebSocketDeflateExtension implements io.ktor.websocket.WebSocketExtension<io.ktor.websocket.WebSocketDeflateExtension.Config> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.websocket.WebSocketDeflateExtension.Companion INSTANCE = new io.ktor.websocket.WebSocketDeflateExtension.Companion(0 == true ? 1 : 0);
    private static final io.ktor.util.AttributeKey<io.ktor.websocket.WebSocketDeflateExtension> key;
    private static final boolean rsv1;
    private static final boolean rsv2 = false;
    private static final boolean rsv3 = false;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;
    private final io.ktor.websocket.WebSocketExtensionFactory<io.ktor.websocket.WebSocketDeflateExtension.Config, ? extends io.ktor.websocket.WebSocketExtension<io.ktor.websocket.WebSocketDeflateExtension.Config>> factory;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.zip.Deflater Camera2StreamConfigurationMap;
    private final io.ktor.websocket.WebSocketDeflateExtension.Config getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.zip.Inflater getHighSpeedVideoFpsRangesFor;
    private boolean incomingNoContextTakeover;
    private boolean outgoingNoContextTakeover;
    private final java.util.List<io.ktor.websocket.WebSocketExtensionHeader> protocols;

    public WebSocketDeflateExtension(io.ktor.websocket.WebSocketDeflateExtension.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.getHighSpeedVideoFpsRanges = config;
        this.factory = INSTANCE;
        this.protocols = config.build$ktor_websockets();
        this.getHighSpeedVideoFpsRangesFor = new java.util.zip.Inflater(true);
        this.Camera2StreamConfigurationMap = new java.util.zip.Deflater(config.getCompressionLevel(), true);
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public final io.ktor.websocket.WebSocketExtensionFactory<io.ktor.websocket.WebSocketDeflateExtension.Config, ? extends io.ktor.websocket.WebSocketExtension<io.ktor.websocket.WebSocketDeflateExtension.Config>> getFactory() {
        return this.factory;
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public final java.util.List<io.ktor.websocket.WebSocketExtensionHeader> getProtocols() {
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

    @Override // io.ktor.websocket.WebSocketExtension
    public final boolean clientNegotiation(java.util.List<io.ktor.websocket.WebSocketExtensionHeader> negotiatedProtocols) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(negotiatedProtocols, "");
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
        this.incomingNoContextTakeover = this.getHighSpeedVideoFpsRanges.getServerNoContextTakeOver();
        this.outgoingNoContextTakeover = this.getHighSpeedVideoFpsRanges.getClientNoContextTakeOver();
        for (kotlin.Pair<java.lang.String, java.lang.String> pair : webSocketExtensionHeader.parseParameters()) {
            java.lang.String component1 = pair.component1();
            java.lang.String component2 = pair.component2();
            switch (component1.hashCode()) {
                case -708713803:
                    if (component1.equals("client_no_context_takeover")) {
                        if (!kotlin.text.StringsKt.isBlank(component2)) {
                            throw new java.lang.IllegalStateException("WebSocket permessage-deflate extension parameter client_no_context_takeover shouldn't have a value. Current: ".concat(java.lang.String.valueOf(component2)).toString());
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
                            throw new java.lang.IllegalStateException("WebSocket permessage-deflate extension parameter server_no_context_takeover shouldn't have a value. Current: ".concat(java.lang.String.valueOf(component2)).toString());
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
    public final java.util.List<io.ktor.websocket.WebSocketExtensionHeader> serverNegotiation(java.util.List<io.ktor.websocket.WebSocketExtensionHeader> requestedProtocols) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestedProtocols, "");
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
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String lowerCase = component1.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            switch (lowerCase.hashCode()) {
                case -708713803:
                    if (lowerCase.equals("client_no_context_takeover")) {
                        if (!kotlin.text.StringsKt.isBlank(component2)) {
                            throw new java.lang.IllegalStateException("Check failed.");
                        }
                        this.incomingNoContextTakeover = true;
                        arrayList.add("client_no_context_takeover");
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported extension parameter: (");
                        sb.append(component1);
                        sb.append(", ");
                        sb.append(component2);
                        sb.append(')');
                        throw new java.lang.IllegalStateException(sb.toString().toString());
                    }
                case 646404390:
                    if (!lowerCase.equals("client_max_window_bits")) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported extension parameter: (");
                        sb2.append(component1);
                        sb2.append(", ");
                        sb2.append(component2);
                        sb2.append(')');
                        throw new java.lang.IllegalStateException(sb2.toString().toString());
                    }
                case 1266201133:
                    if (lowerCase.equals("server_no_context_takeover")) {
                        if (!kotlin.text.StringsKt.isBlank(component2)) {
                            throw new java.lang.IllegalStateException("Check failed.");
                        }
                        this.outgoingNoContextTakeover = true;
                        arrayList.add("server_no_context_takeover");
                    } else {
                        java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Unsupported extension parameter: (");
                        sb22.append(component1);
                        sb22.append(", ");
                        sb22.append(component2);
                        sb22.append(')');
                        throw new java.lang.IllegalStateException(sb22.toString().toString());
                    }
                case 2034279582:
                    if (lowerCase.equals("server_max_window_bits")) {
                        if (java.lang.Integer.parseInt(component2) != 15) {
                            throw new java.lang.IllegalStateException("Only 15 window size is supported".toString());
                        }
                    } else {
                        java.lang.StringBuilder sb222 = new java.lang.StringBuilder("Unsupported extension parameter: (");
                        sb222.append(component1);
                        sb222.append(", ");
                        sb222.append(component2);
                        sb222.append(')');
                        throw new java.lang.IllegalStateException(sb222.toString().toString());
                    }
                default:
                    java.lang.StringBuilder sb2222 = new java.lang.StringBuilder("Unsupported extension parameter: (");
                    sb2222.append(component1);
                    sb2222.append(", ");
                    sb2222.append(component2);
                    sb2222.append(')');
                    throw new java.lang.IllegalStateException(sb2222.toString().toString());
            }
        }
        return kotlin.collections.CollectionsKt.listOf(new io.ktor.websocket.WebSocketExtensionHeader("permessage-deflate", arrayList));
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public final io.ktor.websocket.Frame processOutgoingFrame(io.ktor.websocket.Frame frame) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
        if ((!(frame instanceof io.ktor.websocket.Frame.Text) && !(frame instanceof io.ktor.websocket.Frame.Binary)) || !this.getHighSpeedVideoFpsRanges.getCompressCondition$ktor_websockets().invoke(frame).booleanValue()) {
            return frame;
        }
        byte[] deflateFully = io.ktor.websocket.internals.DeflaterUtilsKt.deflateFully(this.Camera2StreamConfigurationMap, frame.getData());
        if (this.outgoingNoContextTakeover) {
            this.Camera2StreamConfigurationMap.reset();
        }
        return io.ktor.websocket.Frame.INSTANCE.byType(frame.getFin(), frame.getFrameType(), deflateFully, rsv1, frame.getRsv2(), frame.getRsv3());
    }

    @Override // io.ktor.websocket.WebSocketExtension
    public final io.ktor.websocket.Frame processIncomingFrame(io.ktor.websocket.Frame frame) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
        if (!io.ktor.websocket.WebSocketDeflateExtensionKt.access$isCompressed(frame) && !this.getHighSpeedVideoSizes) {
            return frame;
        }
        this.getHighSpeedVideoSizes = true;
        byte[] inflateFully = io.ktor.websocket.internals.DeflaterUtilsKt.inflateFully(this.getHighSpeedVideoFpsRangesFor, frame.getData());
        if (this.incomingNoContextTakeover) {
            this.getHighSpeedVideoFpsRangesFor.reset();
        }
        if (frame.getFin()) {
            this.getHighSpeedVideoSizes = false;
        }
        return io.ktor.websocket.Frame.INSTANCE.byType(frame.getFin(), frame.getFrameType(), inflateFully, !rsv1, frame.getRsv2(), frame.getRsv3());
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u00020\b2\u001d\u0010\t\u001a\u0019\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\t\u0012\u00070\f¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\r8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010\u001f\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0012R4\u0010$\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\b0\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u000bR.\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010\u000b"}, d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "", "<init>", "()V", "Lkotlin/Function1;", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "Lkotlin/ParameterName;", "", "block", "configureProtocols", "(Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/websocket/Frame;", "", "compressIf", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "compressIfBiggerThan", "(I)V", "", "build$ktor_websockets", "()Ljava/util/List;", "clientNoContextTakeOver", "Z", "getClientNoContextTakeOver", "()Z", "setClientNoContextTakeOver", "(Z)V", "serverNoContextTakeOver", "getServerNoContextTakeOver", "setServerNoContextTakeOver", "compressionLevel", com.visa.cbp.getEncExpo.warmup, "getCompressionLevel", "()I", "setCompressionLevel", "manualConfig", "Lkotlin/jvm/functions/Function1;", "getManualConfig$ktor_websockets", "()Lkotlin/jvm/functions/Function1;", "setManualConfig$ktor_websockets", "compressCondition", "getCompressCondition$ktor_websockets", "setCompressCondition$ktor_websockets"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private boolean clientNoContextTakeOver;
        private boolean serverNoContextTakeOver;
        private int compressionLevel = -1;
        private kotlin.jvm.functions.Function1<? super java.util.List<io.ktor.websocket.WebSocketExtensionHeader>, kotlin.Unit> manualConfig = new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.websocket.WebSocketDeflateExtension.Config.$r8$lambda$J55XrgfV4r1HUL6AxjDiU30sm44((java.util.List) obj);
            }
        };
        private kotlin.jvm.functions.Function1<? super io.ktor.websocket.Frame, java.lang.Boolean> compressCondition = new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(io.ktor.websocket.WebSocketDeflateExtension.Config.m23432$r8$lambda$abmtVleRaUTI6fUY4rdG4kaCM((io.ktor.websocket.Frame) obj));
            }
        };

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

        public final kotlin.jvm.functions.Function1<java.util.List<io.ktor.websocket.WebSocketExtensionHeader>, kotlin.Unit> getManualConfig$ktor_websockets() {
            return this.manualConfig;
        }

        public final void setManualConfig$ktor_websockets(kotlin.jvm.functions.Function1<? super java.util.List<io.ktor.websocket.WebSocketExtensionHeader>, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.manualConfig = function1;
        }

        public final kotlin.jvm.functions.Function1<io.ktor.websocket.Frame, java.lang.Boolean> getCompressCondition$ktor_websockets() {
            return this.compressCondition;
        }

        public final void setCompressCondition$ktor_websockets(kotlin.jvm.functions.Function1<? super io.ktor.websocket.Frame, java.lang.Boolean> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            this.compressCondition = function1;
        }

        public final void configureProtocols(final kotlin.jvm.functions.Function1<? super java.util.List<io.ktor.websocket.WebSocketExtensionHeader>, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            final kotlin.jvm.functions.Function1<? super java.util.List<io.ktor.websocket.WebSocketExtensionHeader>, kotlin.Unit> function1 = this.manualConfig;
            this.manualConfig = new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return io.ktor.websocket.WebSocketDeflateExtension.Config.m23433$r8$lambda$hl17xY2cyjTcv8M1d8wE32HQBw(kotlin.jvm.functions.Function1.this, block, (java.util.List) obj);
                }
            };
        }

        public final void compressIf(final kotlin.jvm.functions.Function1<? super io.ktor.websocket.Frame, java.lang.Boolean> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            final kotlin.jvm.functions.Function1<? super io.ktor.websocket.Frame, java.lang.Boolean> function1 = this.compressCondition;
            this.compressCondition = new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(io.ktor.websocket.WebSocketDeflateExtension.Config.$r8$lambda$rPmInRx_SVS7k_CjtOKNrEZrlgw(kotlin.jvm.functions.Function1.this, function1, (io.ktor.websocket.Frame) obj));
                }
            };
        }

        public final void compressIfBiggerThan(final int bytes) {
            compressIf(new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.WebSocketDeflateExtension$Config$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(io.ktor.websocket.WebSocketDeflateExtension.Config.$r8$lambda$abj6541Lp13fnlz8UogA_B49OD4(bytes, (io.ktor.websocket.Frame) obj));
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

        public static /* synthetic */ kotlin.Unit $r8$lambda$J55XrgfV4r1HUL6AxjDiU30sm44(java.util.List list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ boolean $r8$lambda$abj6541Lp13fnlz8UogA_B49OD4(int i, io.ktor.websocket.Frame frame) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
            return frame.getData().length > i;
        }

        /* renamed from: $r8$lambda$abmtVleRaUTI6f-UY4rdG4kaC-M, reason: not valid java name */
        public static /* synthetic */ boolean m23432$r8$lambda$abmtVleRaUTI6fUY4rdG4kaCM(io.ktor.websocket.Frame frame) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
            return true;
        }

        /* renamed from: $r8$lambda$hl17xY2cy-jTcv8M1d8wE32HQBw, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m23433$r8$lambda$hl17xY2cyjTcv8M1d8wE32HQBw(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, java.util.List list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            function1.invoke(list);
            function12.invoke(list);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ boolean $r8$lambda$rPmInRx_SVS7k_CjtOKNrEZrlgw(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, io.ktor.websocket.Frame frame) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frame, "");
            return ((java.lang.Boolean) function1.invoke(frame)).booleanValue() && ((java.lang.Boolean) function12.invoke(frame)).booleanValue();
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0017X\u0097D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00118\u0017X\u0097D¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0017X\u0097D¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015"}, d2 = {"Lio/ktor/websocket/WebSocketDeflateExtension$Companion;", "Lio/ktor/websocket/WebSocketExtensionFactory;", "Lio/ktor/websocket/WebSocketDeflateExtension$Config;", "Lio/ktor/websocket/WebSocketDeflateExtension;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "config", "install", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/websocket/WebSocketDeflateExtension;", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "", "rsv1", "Z", "getRsv1", "()Z", "rsv2", "getRsv2", "rsv3", "getRsv3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements io.ktor.websocket.WebSocketExtensionFactory<io.ktor.websocket.WebSocketDeflateExtension.Config, io.ktor.websocket.WebSocketDeflateExtension> {
        private Companion() {
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public final io.ktor.util.AttributeKey<io.ktor.websocket.WebSocketDeflateExtension> getKey() {
            return io.ktor.websocket.WebSocketDeflateExtension.key;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public final boolean getRsv1() {
            return io.ktor.websocket.WebSocketDeflateExtension.rsv1;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public final boolean getRsv2() {
            return io.ktor.websocket.WebSocketDeflateExtension.rsv2;
        }

        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public final boolean getRsv3() {
            return io.ktor.websocket.WebSocketDeflateExtension.rsv3;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.websocket.WebSocketExtensionFactory
        public final io.ktor.websocket.WebSocketDeflateExtension install(kotlin.jvm.functions.Function1<? super io.ktor.websocket.WebSocketDeflateExtension.Config, kotlin.Unit> config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            io.ktor.websocket.WebSocketDeflateExtension.Config config2 = new io.ktor.websocket.WebSocketDeflateExtension.Config();
            config.invoke(config2);
            return new io.ktor.websocket.WebSocketDeflateExtension(config2);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
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
