package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class OauthInitializationOptions$MobileSdkUrlOpenMessage extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage, com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ANDROID_PARTIAL_CUSTOM_TAB_SCREEN_HEIGHT_PIXELS_FIELD_NUMBER = 3;
    public static final int ANDROID_URL_OPEN_BEHAVIOR_FIELD_NUMBER = 2;
    public static final int CLOSE_URI_FIELD_NUMBER = 4;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage DEFAULT_INSTANCE;
    public static final int IOS_URL_OPEN_BEHAVIOR_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage> PARSER;
    private int androidPartialCustomTabScreenHeightPixels_;
    private int androidUrlOpenBehavior_;
    private java.lang.String closeUri_ = "";
    private int iosUrlOpenBehavior_;

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage, com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.DEFAULT_INSTANCE);
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage = new com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage();
        DEFAULT_INSTANCE = oauthInitializationOptions$MobileSdkUrlOpenMessage;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.class, oauthInitializationOptions$MobileSdkUrlOpenMessage);
    }

    private OauthInitializationOptions$MobileSdkUrlOpenMessage() {
    }

    private void clearAndroidPartialCustomTabScreenHeightPixels() {
        this.androidPartialCustomTabScreenHeightPixels_ = 0;
    }

    private void clearAndroidUrlOpenBehavior() {
        this.androidUrlOpenBehavior_ = 0;
    }

    private void clearCloseUri() {
        this.closeUri_ = getDefaultInstance().getCloseUri();
    }

    private void clearIosUrlOpenBehavior() {
        this.iosUrlOpenBehavior_ = 0;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAndroidPartialCustomTabScreenHeightPixels(int i) {
        this.androidPartialCustomTabScreenHeightPixels_ = i;
    }

    private void setAndroidUrlOpenBehavior(com.plaid.internal.core.protos.link.workflow.primitives.m mVar) {
        this.androidUrlOpenBehavior_ = mVar.getNumber();
    }

    private void setAndroidUrlOpenBehaviorValue(int i) {
        this.androidUrlOpenBehavior_ = i;
    }

    private void setCloseUriBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.closeUri_ = byteString.toStringUtf8();
    }

    private void setIosUrlOpenBehavior(com.plaid.internal.core.protos.link.workflow.primitives.o oVar) {
        this.iosUrlOpenBehavior_ = oVar.getNumber();
    }

    private void setIosUrlOpenBehaviorValue(int i) {
        this.iosUrlOpenBehavior_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.l.f6373a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ", new java.lang.Object[]{"iosUrlOpenBehavior_", "androidUrlOpenBehavior_", "androidPartialCustomTabScreenHeightPixels_", "closeUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.class) {
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

    public final int getAndroidPartialCustomTabScreenHeightPixels() {
        return this.androidPartialCustomTabScreenHeightPixels_;
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.m getAndroidUrlOpenBehavior() {
        com.plaid.internal.core.protos.link.workflow.primitives.m forNumber = com.plaid.internal.core.protos.link.workflow.primitives.m.forNumber(this.androidUrlOpenBehavior_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.m.UNRECOGNIZED : forNumber;
    }

    public final int getAndroidUrlOpenBehaviorValue() {
        return this.androidUrlOpenBehavior_;
    }

    public final java.lang.String getCloseUri() {
        return this.closeUri_;
    }

    public final com.google.protobuf.ByteString getCloseUriBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.closeUri_);
    }

    public final com.plaid.internal.core.protos.link.workflow.primitives.o getIosUrlOpenBehavior() {
        com.plaid.internal.core.protos.link.workflow.primitives.o forNumber = com.plaid.internal.core.protos.link.workflow.primitives.o.forNumber(this.iosUrlOpenBehavior_);
        return forNumber == null ? com.plaid.internal.core.protos.link.workflow.primitives.o.UNRECOGNIZED : forNumber;
    }

    public final int getIosUrlOpenBehaviorValue() {
        return this.iosUrlOpenBehavior_;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage oauthInitializationOptions$MobileSdkUrlOpenMessage) {
        return DEFAULT_INSTANCE.createBuilder(oauthInitializationOptions$MobileSdkUrlOpenMessage);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setCloseUri(java.lang.String str) {
        this.closeUri_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.OauthInitializationOptions$MobileSdkUrlOpenMessage) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
