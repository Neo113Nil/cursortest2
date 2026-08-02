package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class OauthInitializationOptions$OAuthInitializationOptions extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions, com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
    private static final com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions DEFAULT_INSTANCE;
    public static final int IOS_SDK_POPUP_BEHAVIOR_FIELD_NUMBER = 3;
    public static final int OAUTH_OPEN_METHOD_FIELD_NUMBER = 2;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions> PARSER;
    private int iosSdkPopupBehavior_;
    private java.lang.String oauthOpenMethod_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions, com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions oauthInitializationOptions$OAuthInitializationOptions = new com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions();
        DEFAULT_INSTANCE = oauthInitializationOptions$OAuthInitializationOptions;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions.class, oauthInitializationOptions$OAuthInitializationOptions);
    }

    private OauthInitializationOptions$OAuthInitializationOptions() {
    }

    private void clearIosSdkPopupBehavior() {
        this.iosSdkPopupBehavior_ = 0;
    }

    private void clearOauthOpenMethod() {
        this.oauthOpenMethod_ = getDefaultInstance().getOauthOpenMethod();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIosSdkPopupBehavior(com.plaid.internal.core.protos.link.workflow.primitives.n nVar) {
        this.iosSdkPopupBehavior_ = nVar.getNumber();
    }

    private void setIosSdkPopupBehaviorValue(int i) {
        this.iosSdkPopupBehavior_ = i;
    }

    private void setOauthOpenMethodBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.oauthOpenMethod_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.l.f6373a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\f", new java.lang.Object[]{"oauthOpenMethod_", "iosSdkPopupBehavior_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions.class) {
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

    public final java.lang.String getOauthOpenMethod() {
        return this.oauthOpenMethod_;
    }

    public final com.google.protobuf.ByteString getOauthOpenMethodBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.oauthOpenMethod_);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions oauthInitializationOptions$OAuthInitializationOptions) {
        return DEFAULT_INSTANCE.createBuilder(oauthInitializationOptions$OAuthInitializationOptions);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setOauthOpenMethod(java.lang.String str) {
        this.oauthOpenMethod_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$OAuthInitializationOptions) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
