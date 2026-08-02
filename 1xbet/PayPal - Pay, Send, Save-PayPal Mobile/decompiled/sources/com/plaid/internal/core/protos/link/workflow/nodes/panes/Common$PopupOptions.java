package com.plaid.internal.core.protos.link.workflow.nodes.panes;

/* loaded from: classes16.dex */
public final class Common$PopupOptions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions DEFAULT_INSTANCE;
    public static final int IOS_SDK_POPUP_BEHAVIOR_FIELD_NUMBER = 1;
    public static final int MOBILE_SDK_URL_OPEN_MESSAGE_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions> PARSER;
    private int bitField0_;
    private int iosSdkPopupBehavior_;
    private com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage mobileSdkUrlOpenMessage_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions.DEFAULT_INSTANCE);
        }
    }

    private Common$PopupOptions() {
    }

    private void clearIosSdkPopupBehavior() {
        this.iosSdkPopupBehavior_ = 0;
    }

    private void clearMobileSdkUrlOpenMessage() {
        this.mobileSdkUrlOpenMessage_ = null;
        this.bitField0_ &= -2;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    private void setIosSdkPopupBehavior(com.plaid.internal.core.protos.link.workflow.primitives.n nVar) {
        this.iosSdkPopupBehavior_ = nVar.getNumber();
    }

    private void setIosSdkPopupBehaviorValue(int i) {
        this.iosSdkPopupBehavior_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.nodes.panes.C0484j.f6305a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new java.lang.Object[]{"bitField0_", "iosSdkPopupBehavior_", "mobileSdkUrlOpenMessage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions.class) {
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

    public final com.plaid.internal.core.protos.link.workflow.primitives.n getIosSdkPopupBehavior() {
        com.plaid.internal.core.protos.link.workflow.primitives.n forNumber = com.plaid.internal.core.protos.link.workflow.primitives.n.forNumber(this.iosSdkPopupBehavior_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.n.UNRECOGNIZED : forNumber;
    }

    public final int getIosSdkPopupBehaviorValue() {
        return this.iosSdkPopupBehavior_;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage getMobileSdkUrlOpenMessage() {
        com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage = this.mobileSdkUrlOpenMessage_;
        return oauthInitializationOptions$MobileSdkUrlOpenMessage == null ? com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.getDefaultInstance() : oauthInitializationOptions$MobileSdkUrlOpenMessage;
    }

    public final boolean hasMobileSdkUrlOpenMessage() {
        return (this.bitField0_ & 1) != 0;
    }

    private void mergeMobileSdkUrlOpenMessage(com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage) {
        com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage2 = this.mobileSdkUrlOpenMessage_;
        if (oauthInitializationOptions$MobileSdkUrlOpenMessage2 == null || oauthInitializationOptions$MobileSdkUrlOpenMessage2 == com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.getDefaultInstance()) {
            this.mobileSdkUrlOpenMessage_ = oauthInitializationOptions$MobileSdkUrlOpenMessage;
        } else {
            this.mobileSdkUrlOpenMessage_ = com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.newBuilder(this.mobileSdkUrlOpenMessage_).mergeFrom((com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.a) oauthInitializationOptions$MobileSdkUrlOpenMessage).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions.a newBuilder(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions common$PopupOptions) {
        return DEFAULT_INSTANCE.createBuilder(common$PopupOptions);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    private void setMobileSdkUrlOpenMessage(com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage) {
        this.mobileSdkUrlOpenMessage_ = oauthInitializationOptions$MobileSdkUrlOpenMessage;
        this.bitField0_ |= 1;
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    static {
        com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions common$PopupOptions = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions();
        DEFAULT_INSTANCE = common$PopupOptions;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PopupOptions.class, common$PopupOptions);
    }
}
