package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$WebviewFallback extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ANDROID_SMS_VERIFICATION_API_TYPE_FIELD_NUMBER = 11;
    public static final int CHANNEL_FROM_WEBVIEW_FIELD_NUMBER = 6;
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback DEFAULT_INSTANCE;
    public static final int MODE_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback> PARSER = null;
    public static final int POPUP_BEHAVIOR_IOS_FIELD_NUMBER = 4;
    public static final int PREFERS_EPHEMERAL_FIELD_NUMBER = 7;
    public static final int SHOULD_EAGER_START_FIELD_NUMBER = 9;
    public static final int URL_BEHAVIOR_CONFIGURATIONS_FIELD_NUMBER = 3;
    public static final int URL_FIELD_NUMBER = 2;
    public static final int WEBVIEW_FALLBACK_BACKGROUND_FIELD_NUMBER = 8;
    public static final int WEBVIEW_FALLBACK_ID_FIELD_NUMBER = 5;
    public static final int WILL_USE_SDK_BRIDGE_OPEN_FLOW_FIELD_NUMBER = 10;
    private int androidSmsVerificationApiType_;
    private int bitField0_;
    private com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel channelFromWebview_;
    private int mode_;
    private int popupBehaviorIos_;
    private boolean prefersEphemeral_;
    private boolean shouldEagerStart_;
    private int webviewFallbackBackground_;
    private boolean willUseSdkBridgeOpenFlow_;
    private java.lang.String url_ = "";
    private com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration> urlBehaviorConfigurations_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    private java.lang.String webviewFallbackId_ = "";

    public static final class Channel extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.WebviewFallback.Channel.a> implements com.google.protobuf.MessageLiteOrBuilder {
        private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel> PARSER = null;
        public static final int POLLING_INTERVAL_MS_FIELD_NUMBER = 3;
        public static final int SECRET_FIELD_NUMBER = 2;
        private long pollingIntervalMs_;
        private java.lang.String id_ = "";
        private java.lang.String secret_ = "";

        public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.WebviewFallback.Channel.a> implements com.google.protobuf.MessageLiteOrBuilder {
            public a() {
                super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel.DEFAULT_INSTANCE);
            }
        }

        static {
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel channel = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel();
            DEFAULT_INSTANCE = channel;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel.class, channel);
        }

        private Channel() {
        }

        private void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        private void clearPollingIntervalMs() {
            this.pollingIntervalMs_ = 0L;
        }

        private void clearSecret() {
            this.secret_ = getDefaultInstance().getSecret();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.WebviewFallback.Channel.a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIdBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        private void setPollingIntervalMs(long j) {
            this.pollingIntervalMs_ = j;
        }

        private void setSecretBytes(com.google.protobuf.ByteString byteString) {
            com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
            this.secret_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
            com.google.protobuf.Parser parser;
            switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
                case 1:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel();
                case 2:
                    return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.WebviewFallback.Channel.a();
                case 3:
                    return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003", new java.lang.Object[]{"id_", "secret_", "pollingIntervalMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                    return parser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        public final java.lang.String getId() {
            return this.id_;
        }

        public final com.google.protobuf.ByteString getIdBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.id_);
        }

        public final long getPollingIntervalMs() {
            return this.pollingIntervalMs_;
        }

        public final java.lang.String getSecret() {
            return this.secret_;
        }

        public final com.google.protobuf.ByteString getSecretBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(this.secret_);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.WebviewFallback.Channel.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel channel) {
            return DEFAULT_INSTANCE.createBuilder(channel);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel parseFrom(com.google.protobuf.ByteString byteString) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void setId(java.lang.String str) {
            this.id_ = str;
        }

        private void setSecret(java.lang.String str) {
            this.secret_ = str;
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel parseFrom(byte[] bArr) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel parseFrom(java.io.InputStream inputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
            return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback common$WebviewFallback = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback();
        DEFAULT_INSTANCE = common$WebviewFallback;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.class, common$WebviewFallback);
    }

    private Common$WebviewFallback() {
    }

    private void addAllUrlBehaviorConfigurations(java.lang.Iterable<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration> iterable) {
        ensureUrlBehaviorConfigurationsIsMutable();
        com.google.protobuf.AbstractMessageLite.addAll((java.lang.Iterable) iterable, (java.util.List) this.urlBehaviorConfigurations_);
    }

    private void clearAndroidSmsVerificationApiType() {
        this.androidSmsVerificationApiType_ = 0;
    }

    private void clearChannelFromWebview() {
        this.channelFromWebview_ = null;
        this.bitField0_ &= -2;
    }

    private void clearMode() {
        this.mode_ = 0;
    }

    private void clearPopupBehaviorIos() {
        this.popupBehaviorIos_ = 0;
    }

    private void clearPrefersEphemeral() {
        this.prefersEphemeral_ = false;
    }

    private void clearShouldEagerStart() {
        this.shouldEagerStart_ = false;
    }

    private void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    private void clearUrlBehaviorConfigurations() {
        this.urlBehaviorConfigurations_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }

    private void clearWebviewFallbackBackground() {
        this.webviewFallbackBackground_ = 0;
    }

    private void clearWebviewFallbackId() {
        this.webviewFallbackId_ = getDefaultInstance().getWebviewFallbackId();
    }

    private void clearWillUseSdkBridgeOpenFlow() {
        this.willUseSdkBridgeOpenFlow_ = false;
    }

    private void ensureUrlBehaviorConfigurationsIsMutable() {
        com.google.protobuf.Internal.ProtobufList<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration> protobufList = this.urlBehaviorConfigurations_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.urlBehaviorConfigurations_ = com.google.protobuf.GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeUrlBehaviorConfigurations(int i) {
        ensureUrlBehaviorConfigurationsIsMutable();
        this.urlBehaviorConfigurations_.remove(i);
    }

    private void setAndroidSmsVerificationApiType(com.plaid.internal.core.protos.link.workflow.primitives.f fVar) {
        this.androidSmsVerificationApiType_ = fVar.getNumber();
    }

    private void setAndroidSmsVerificationApiTypeValue(int i) {
        this.androidSmsVerificationApiType_ = i;
    }

    private void setMode(com.plaid.internal.core.protos.link.workflow.nodes.panes.b0 b0Var) {
        this.mode_ = b0Var.getNumber();
    }

    private void setModeValue(int i) {
        this.mode_ = i;
    }

    private void setPopupBehaviorIos(com.plaid.internal.core.protos.link.workflow.nodes.panes.a0 a0Var) {
        this.popupBehaviorIos_ = a0Var.getNumber();
    }

    private void setPopupBehaviorIosValue(int i) {
        this.popupBehaviorIos_ = i;
    }

    private void setPrefersEphemeral(boolean z) {
        this.prefersEphemeral_ = z;
    }

    private void setShouldEagerStart(boolean z) {
        this.shouldEagerStart_ = z;
    }

    private void setUrlBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.url_ = byteString.toStringUtf8();
    }

    private void setWebviewFallbackBackground(com.plaid.internal.core.protos.link.workflow.nodes.panes.Z z) {
        this.webviewFallbackBackground_ = z.getNumber();
    }

    private void setWebviewFallbackBackgroundValue(int i) {
        this.webviewFallbackBackground_ = i;
    }

    private void setWebviewFallbackIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewFallbackId_ = byteString.toStringUtf8();
    }

    private void setWillUseSdkBridgeOpenFlow(boolean z) {
        this.willUseSdkBridgeOpenFlow_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u001b\u0004\f\u0005Ȉ\u0006ဉ\u0000\u0007\u0007\b\f\t\u0007\n\u0007\u000b\f", new java.lang.Object[]{"bitField0_", "mode_", "url_", "urlBehaviorConfigurations_", com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration.class, "popupBehaviorIos_", "webviewFallbackId_", "channelFromWebview_", "prefersEphemeral_", "webviewFallbackBackground_", "shouldEagerStart_", "willUseSdkBridgeOpenFlow_", "androidSmsVerificationApiType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new com.google.protobuf.GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.f getAndroidSmsVerificationApiType() {
        com.plaid.internal.core.protos.link.workflow.primitives.f forNumber = com.plaid.internal.core.protos.link.workflow.primitives.f.forNumber(this.androidSmsVerificationApiType_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.f.UNRECOGNIZED : forNumber;
    }

    public final int getAndroidSmsVerificationApiTypeValue() {
        return this.androidSmsVerificationApiType_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel getChannelFromWebview() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel channel = this.channelFromWebview_;
        return channel == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel.getDefaultInstance() : channel;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.b0 getMode() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.b0 forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.forNumber(this.mode_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.b0.UNRECOGNIZED : forNumber;
    }

    public final int getModeValue() {
        return this.mode_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.a0 getPopupBehaviorIos() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.a0 forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.a0.forNumber(this.popupBehaviorIos_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.a0.UNRECOGNIZED : forNumber;
    }

    public final int getPopupBehaviorIosValue() {
        return this.popupBehaviorIos_;
    }

    public final boolean getPrefersEphemeral() {
        return this.prefersEphemeral_;
    }

    public final boolean getShouldEagerStart() {
        return this.shouldEagerStart_;
    }

    public final java.lang.String getUrl() {
        return this.url_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration getUrlBehaviorConfigurations(int i) {
        return this.urlBehaviorConfigurations_.get(i);
    }

    public final int getUrlBehaviorConfigurationsCount() {
        return this.urlBehaviorConfigurations_.size();
    }

    public final java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration> getUrlBehaviorConfigurationsList() {
        return this.urlBehaviorConfigurations_;
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.X getUrlBehaviorConfigurationsOrBuilder(int i) {
        return this.urlBehaviorConfigurations_.get(i);
    }

    public final java.util.List<? extends com.plaid.internal.core.protos.link.workflow.nodes.panes.X> getUrlBehaviorConfigurationsOrBuilderList() {
        return this.urlBehaviorConfigurations_;
    }

    public final com.google.protobuf.ByteString getUrlBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.url_);
    }

    public final com.plaid.internal.core.protos.link.workflow.nodes.panes.Z getWebviewFallbackBackground() {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Z forNumber = com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.forNumber(this.webviewFallbackBackground_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.nodes.panes.Z.UNRECOGNIZED : forNumber;
    }

    public final int getWebviewFallbackBackgroundValue() {
        return this.webviewFallbackBackground_;
    }

    public final java.lang.String getWebviewFallbackId() {
        return this.webviewFallbackId_;
    }

    public final com.google.protobuf.ByteString getWebviewFallbackIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.webviewFallbackId_);
    }

    public final boolean getWillUseSdkBridgeOpenFlow() {
        return this.willUseSdkBridgeOpenFlow_;
    }

    public final boolean hasChannelFromWebview() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addUrlBehaviorConfigurations(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration common$URLBehaviorConfiguration) {
        ensureUrlBehaviorConfigurationsIsMutable();
        this.urlBehaviorConfigurations_.add(common$URLBehaviorConfiguration);
    }

    private void mergeChannelFromWebview(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel channel) {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel channel2 = this.channelFromWebview_;
        if (channel2 == null || channel2 == com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel.getDefaultInstance()) {
            this.channelFromWebview_ = channel;
        } else {
            this.channelFromWebview_ = com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel.newBuilder(this.channelFromWebview_).mergeFrom((com.plaid.internal.core.protos.link.workflow.nodes.panes.Common.WebviewFallback.Channel.a) channel).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback common$WebviewFallback) {
        return DEFAULT_INSTANCE.createBuilder(common$WebviewFallback);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setChannelFromWebview(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback.Channel channel) {
        this.channelFromWebview_ = channel;
        this.bitField0_ |= 1;
    }

    private void setUrlBehaviorConfigurations(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration common$URLBehaviorConfiguration) {
        ensureUrlBehaviorConfigurationsIsMutable();
        this.urlBehaviorConfigurations_.set(i, common$URLBehaviorConfiguration);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setUrl(java.lang.String str) {
        this.url_ = str;
    }

    private void setWebviewFallbackId(java.lang.String str) {
        this.webviewFallbackId_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    private void addUrlBehaviorConfigurations(int i, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration common$URLBehaviorConfiguration) {
        ensureUrlBehaviorConfigurationsIsMutable();
        this.urlBehaviorConfigurations_.add(i, common$URLBehaviorConfiguration);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$WebviewFallback) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
