package com.plaid.internal.core.protos.link.workflow.primitives;

/* loaded from: classes16.dex */
public final class Configuration$AndroidPlatformIdentifierConfiguration extends com.google.protobuf.GeneratedMessageLite<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
    public static final int ANDROID_GSF_ID_FIELD_NUMBER = 2;
    public static final int ANDROID_ID_FIELD_NUMBER = 1;
    private static final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration> PARSER;
    private java.lang.String androidId_ = "";
    private java.lang.String androidGsfId_ = "";

    public static final class a extends com.google.protobuf.GeneratedMessageLite.Builder<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration, com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.a> implements com.google.protobuf.MessageLiteOrBuilder {
        public a() {
            super(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.DEFAULT_INSTANCE);
        }

        public final com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.a a(java.lang.String str) {
            copyOnWrite();
            ((com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) this.instance).setAndroidId(str);
            return this;
        }
    }

    static {
        com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration configuration$AndroidPlatformIdentifierConfiguration = new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration();
        DEFAULT_INSTANCE = configuration$AndroidPlatformIdentifierConfiguration;
        com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.class, configuration$AndroidPlatformIdentifierConfiguration);
    }

    private Configuration$AndroidPlatformIdentifierConfiguration() {
    }

    private void clearAndroidGsfId() {
        this.androidGsfId_ = getDefaultInstance().getAndroidGsfId();
    }

    private void clearAndroidId() {
        this.androidId_ = getDefaultInstance().getAndroidId();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration parseDelimitedFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAndroidGsfIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.androidGsfId_ = byteString.toStringUtf8();
    }

    private void setAndroidIdBytes(com.google.protobuf.ByteString byteString) {
        com.google.protobuf.GeneratedMessageLite.checkByteStringIsUtf8(byteString);
        this.androidId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final java.lang.Object dynamicMethod(com.google.protobuf.GeneratedMessageLite.MethodToInvoke methodToInvoke, java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.Parser parser;
        switch (com.plaid.internal.core.protos.link.workflow.primitives.e.f6361a[methodToInvoke.ordinal()]) {
            case 1:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration();
            case 2:
                return new com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.a();
            case 3:
                return com.google.protobuf.GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"androidId_", "androidGsfId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                com.google.protobuf.Parser<com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.class) {
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

    public final java.lang.String getAndroidGsfId() {
        return this.androidGsfId_;
    }

    public final com.google.protobuf.ByteString getAndroidGsfIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.androidGsfId_);
    }

    public final java.lang.String getAndroidId() {
        return this.androidId_;
    }

    public final com.google.protobuf.ByteString getAndroidIdBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(this.androidId_);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration.a newBuilder(com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration configuration$AndroidPlatformIdentifierConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$AndroidPlatformIdentifierConfiguration);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration parseFrom(com.google.protobuf.ByteString byteString) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void setAndroidGsfId(java.lang.String str) {
        this.androidGsfId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidId(java.lang.String str) {
        this.androidId_ = str;
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration parseFrom(com.google.protobuf.ByteString byteString, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration parseFrom(byte[] bArr) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration parseFrom(byte[] bArr, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration parseFrom(java.io.InputStream inputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration parseFrom(java.io.InputStream inputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration parseFrom(com.google.protobuf.CodedInputStream codedInputStream, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        return (com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration) com.google.protobuf.GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
